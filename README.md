This project serves as an example for how to embed and use [hegemon] [hegemon] in your project.
It uses the excellent [dropwizard](https://github.com/codahale/dropwizard) project to make http endpoints available
with minimum boilerplate, but hegemon will work equally well with whatever you'd like to include it in.

Get it: `$ git clone git://github.com/Cue/hegemon-example.git`

Build it: `$ cd hegemon-example; mvn package`

Run it: `$ java -jar target/hegemon-example-0.0.1.jar`

It includes:

* An [http endpoint] [endpoint] routing to pre-packaged [scripts][scripts].
  Try: `$ curl http://localhost:8080/script/example?foo=bar`

* An [endpoint] [customscript] evaluating post data.
  Try: `$ curl -d "return 3 + 4" http://localhost:8080/customScript`

* [Tests in javascript] [tests] runnable with a [JUnit runner] [testbinding].

* An [HTTP server] [testserver] that runs tests and reloads javascript changes without restart.
  Try: `$ curl -d "return 3 + 4" http://localhost:8080/customScript`


[hegemon]: http://github.com/Cue/hegemon
[endpoint]: https://github.com/Cue/hegemon-example/blob/master/src/main/java/com/cueup/hegemon/example/ScriptResource.java
[customscript]: https://github.com/Cue/hegemon-example/blob/master/src/main/java/com/cueup/hegemon/example/CustomScriptResource.java
[scripts]: https://github.com/Cue/hegemon-example/tree/master/src/main/resources/javascript/script
[tests]: https://github.com/Cue/hegemon-example/blob/master/src/test/resources/javascript
[testbinding]: https://github.com/Cue/hegemon-example/blob/master/src/test/java/com/cueup/hegemon/example/ExampleTest.java
[testserver]: https://github.com/Cue/hegemon-example/blob/master/src/test/java/com/cueup/hegemon/example/ExampleJsTestServer.java
