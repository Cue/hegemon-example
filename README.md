This project serves as an example for how to embed and use [hegemon] [hegemon] in your project.

It includes:

* An [http endpoint] [endpoint] routing to pre-packaged [scripts][scripts].
* An [endpoint] [customscript] evaluating post data.
* [Tests in javascript] [tests] runnable with a [JUnit runner] [testbinding].
* An [HTTP server] [testserver] that runs tests and reloads javascript changes without
  restart.


[hegemon]: http://github.com/Cue/hegemon
[endpoint]: https://github.com/Cue/hegemon-example/blob/master/src/main/java/com/cueup/hegemon/example/ScriptResource.java
[customscript]: https://github.com/Cue/hegemon-example/blob/master/src/main/java/com/cueup/hegemon/example/CustomScriptResource.java
[scripts]: https://github.com/Cue/hegemon-example/tree/master/src/main/resources/javascript/script
[tests]: https://github.com/Cue/hegemon-example/blob/master/src/test/resources/javascript
[testbinding]: https://github.com/Cue/hegemon-example/blob/master/src/test/java/com/cueup/hegemon/example/ExampleTest.java
[testserver]: https://github.com/Cue/hegemon-example/blob/master/src/test/java/com/cueup/hegemon/example/ExampleJsTestServer.java
