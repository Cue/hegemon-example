
// This object is used to export GET and POST as public methods.
let example = {};

function GET(params) {
  return run('GET', params);
}

example.GET = GET; // You can attach after definition

example.POST = function(params, postdata) { // Or during
  return run('POST', params, postdata);
};

function run(method, params, postdata) {
  return {'method': method, 'params': params, 'postdata': postdata};
}
