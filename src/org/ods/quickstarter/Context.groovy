package org.ods.quickstarter

import com.cloudbees.groovy.cps.NonCPS

class Context implements IContext {

  private Map config

  Context(Map config) {
    this.config = config
  }

  @NonCPS
  String getJobName() {
    config.jobName
  }

  @NonCPS
  String getBuildNumber() {
    config.buildNumber
  }

  @NonCPS
  String getBuildUrl() {
    config.buildUrl
  }

  @NonCPS
  String getBuildTime() {
    config.buildTime
  }

  @NonCPS
  String getProjectId() {
    config.projectId
  }

  @NonCPS
  String getComponentId() {
    config.componentId
  }

  @NonCPS
  String getSourceDir() {
    config.sourceDir
  }

  @NonCPS
  String getGitUrlHttp() {
    config.gitUrlHttp
  }

  @NonCPS
  String getOdsImageTag() {
    config.odsImageTag
  }

  @NonCPS
  String getOdsGitRef() {
    config.odsGitRef
  }

  @NonCPS
  String getTargetDir() {
    config.targetDir
  }

  @NonCPS
  String getPackageName() {
    config.packageName
  }

  @NonCPS
  String getGroup() {
    config.group
  }

  @NonCPS
  String getCdUserCredentialsId() {
    config.cdUserCredentialsId
  }

}
