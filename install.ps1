# Generated by Hydraulic Conveyor: https://www.hydraulic.software
# Startup script for self-signed MSIX packaged apps.

$CertName = "CN=Alkaa Main"
$FSName = "alkaa-main"
$PackageName = "AlkaaMain"
$Site = "http://localhost:8899"


$CertURL = "${Site}/${FSName}.crt"

# Install the self-signed code signing cert, if necessary. Unfortunately, we can't install to the user-specific cert store, so we have to be admin.
# 1. Do we have it already?
if (!((dir cert:\LocalMachine\TrustedPeople).Subject -contains $CertName))
{
    # 2. No. Are we admin?
    if (-NOT ([Security.Principal.WindowsPrincipal][Security.Principal.WindowsIdentity]::GetCurrent()).IsInRole([Security.Principal.WindowsBuiltInRole] "Administrator"))
    {
        # No. So we have to elevate.
        Write-Output "Attempting to add root certificate ..."

        # 3. Write the cert to a temp file
        $cert = $Env:Temp + "\${FSName}.crt"
        Invoke-WebRequest -Uri "$CertURL" -OutFile $cert
        $cmd = "Import-Certificate -FilePath '$cert' -CertStoreLocation `"Cert:\LocalMachine\TrustedPeople`";Start-Sleep -s 2"

        # 4. Elevate to local admin and install the cert with that script.
        Start-Process powershell -ArgumentList "$cmd" -Wait -Verb runAs
    }
}

# Install the MSIX package (will show an ascii art progress bar).
# Although we could open the GUI AppInstaller app here, and that has some advantages, there's no way to force it to the foreground.
# Every attempt using Win32 fails, presumably because it's running elevated and windows UAC screws things up.
Add-AppxPackage -AppInstallerFile "${Site}/${FSName}.appinstaller"

start "shell:appsFolder\AlkaaMain_a8kmv5jnece74!AlkaaMain"
