package com.cueup.hegemon.example;

import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Environment;

public class ExampleService extends Service<ExampleConfiguration> {
  public static void main(String[] args) throws Exception {
    new ExampleService().run(args);
  }

  private ExampleService() {
    super("hegemon-example");
  }

  @Override
  protected void initialize(ExampleConfiguration configuration, Environment environment) throws Exception {
    environment.addResource(ScriptResource.class);
    environment.addResource(CustomScriptResource.class);
  }
}
