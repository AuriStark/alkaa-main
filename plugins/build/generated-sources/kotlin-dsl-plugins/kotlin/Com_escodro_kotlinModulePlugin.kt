/**
 * Precompiled [com.escodro.kotlin-module.gradle.kts][Com_escodro_kotlin_module_gradle] script plugin.
 *
 * @see Com_escodro_kotlin_module_gradle
 */
public
class Com_escodro_kotlinModulePlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Com_escodro_kotlin_module_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
