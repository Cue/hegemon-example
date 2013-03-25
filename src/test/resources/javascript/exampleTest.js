let example = core.load('script/example');
let Assert = core.load('hegemon/unittest').Assert;

function testThatGETShouldReturnParamsWithNoPostData() {
  let params = {'foo': 'bar'};
  let result = example.GET(params);
  Assert.assertEquals('GET', result.method);
  Assert.assertEquals(params, result.params);
  Assert.assertNull(core.nullable(result.postdata));
}

function testThatPOSTShouldReturnParamsWithNoPostData() {
  let params = {'foo': 'bar'};
  let result = example.POST(params, 'postdata!');
  Assert.assertEquals('POST', result.method);
  Assert.assertEquals(params, result.params);
  Assert.assertEquals('postdata!', result.postdata);
}

