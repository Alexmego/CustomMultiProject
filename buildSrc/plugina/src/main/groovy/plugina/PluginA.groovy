package plugina

import org.gradle.api.Plugin
import org.gradle.api.Project

class PluginA implements Plugin<Project> {

    void apply(Project project) {
          println("Hello111111111111111111111111111")
    }

}