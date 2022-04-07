package com.github.damienurrutysonarsource.apachebugreproducerplugin.services

import com.intellij.openapi.project.Project
import com.github.damienurrutysonarsource.apachebugreproducerplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
