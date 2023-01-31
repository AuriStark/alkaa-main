/**
 * Precompiled [com.escodro.android-compose.gradle.kts][Com_escodro_android_compose_gradle] script plugin.
 *
 * @see Com_escodro_android_compose_gradle
 */
public
class Com_escodro_androidComposePlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Com_escodro_android_compose_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
