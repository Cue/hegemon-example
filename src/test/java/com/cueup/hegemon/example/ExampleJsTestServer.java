package com.cueup.hegemon.example;

import com.cueup.hegemon.ExternalFromResourceScriptLocator;
import com.cueup.hegemon.LoadPath;
import com.cueup.hegemon.ScriptLocator;
import com.cueup.hegemon.testing.server.HegemonTestServer;
import com.google.common.collect.Lists;

import java.util.Collections;
import java.util.List;


/**
 * A web server that runs tests. Run the main of this class and point a browser at:
 *   http://localhost:7070/com.cueup.hegemon.example.ExampleTest
 * The tests will run and reload javascript without recompiles. Changes to dependent Java
 * will still requires a build and restart.
 *
 * The source reloading happens via giving the path to your source relative to the directory
 * your class files write resources to. This is ugly, but solves the 'having to re-stage resources'
 * problem. Patches welcomed.
 */
// TODO(kevinclark): Most of this could probably be pushed down into HegemonTestServer itself.
public class ExampleJsTestServer extends HegemonTestServer {
  private static List<ScriptLocator> locatorsFromDirs(String ... sourceDirs) {
    List<ScriptLocator> dirs = Lists.newLinkedList();
    for (String dir : sourceDirs) {
      dirs.add(new ExternalFromResourceScriptLocator(ExampleJsTestServer.class, dir));
    }
    return dirs;
  }

  ExampleJsTestServer(String ... sourceDirs) {
    super(LoadPath.customPath(locatorsFromDirs(sourceDirs), Collections.<ScriptLocator>emptyList()));
  }

  public static void main(String[] args) throws Exception {
    HegemonTestServer.run(
        new ExampleJsTestServer(
            "../../src/main/resources/javascript",
            "../../src/test/resources/javascript"), 7070);
  }
}
