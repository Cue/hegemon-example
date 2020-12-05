This project serves as an example for how to embed and use [hegemon][hegemon] in your project.
It uses the excellent [dropwizard](https://github.com/codahale/dropwizard) project to make http endpoints available
with minimum boilerplate, but hegemon will work equally well with whatever you'd like to include it in.

Get it: `$ git clone git://github.com/Cue/hegemon-example.git`

Build it: `$ cd hegemon-example; mvn package`

Run it: `$ java -jar target/hegemon-example-0.0.2.jar server`

It includes:

* An [http endpoint][endpoint] routing to pre-packaged [scripts][scripts].
  Try: `$ curl http://localhost:8080/script/example?foo=bar`

* An [endpoint][customscript] evaluating post data.
  Try: `$ curl -d "return 3 + 4" http://localhost:8080/customScript`

* [Tests in javascript][tests] runnable with a [JUnit runner][testbinding].

* An [HTTP server][testserver] that runs tests and reloads javascript changes without restart.
  Try opening in a browser: http://localhost:7070/ and click on the test class name.


[hegemon]: http://github.com/Cue/hegemon
[endpoint]: src/main/java/com/cueup/hegemon/example/ScriptResource.java
[customscript]: src/main/java/com/cueup/hegemon/example/CustomScriptResource.java
[scripts]: src/main/resources/javascript/script
[tests]: src/test/resources/javascript
[testbinding]: src/test/java/com/cueup/hegemon/example/ExampleTest.java
[testserver]: src/test/java/com/cueup/hegemon/example/ExampleJsTestServer.java
