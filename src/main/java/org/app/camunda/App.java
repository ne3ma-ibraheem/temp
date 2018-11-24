package org.app.camunda;
import org.camunda.bpm.application.ProcessApplication;
import org.camunda.bpm.application.impl.ServletProcessApplication;

@ProcessApplication("App")
public class App extends ServletProcessApplication {
}
