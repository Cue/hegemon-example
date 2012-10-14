load('script/example');

function testThatGETShouldReturnParamsWithNoPostData() {
  let params = {'foo': 'bar'};
  let result = GET(params));
  Assert.assertEquals("GET", result.method);
  Assert.assertEquals(params, result.params);
  Assert.assertNull(nullable(result.postdata));
}

function testThatPOSTShouldReturnParamsWithNoPostData() {
  let params = {'foo': 'bar'};
  let result = POST(params, "postdata!");
  Assert.assertEquals("POST", result.method);
  Assert.assertEquals(params, result.params);
  Assert.assertEquals("postdata!", result.postdata);
}

