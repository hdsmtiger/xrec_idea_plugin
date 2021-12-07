package com.github.hdsmtiger.xrecideaplugin.services

import com.intellij.openapi.project.Project
import com.github.hdsmtiger.xrecideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
