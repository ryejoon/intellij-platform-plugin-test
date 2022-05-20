package com.github.ryejoon.intellijplatformplugintest.services

import com.intellij.openapi.project.Project
import com.github.ryejoon.intellijplatformplugintest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
