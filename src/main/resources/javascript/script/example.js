function GET(params) {
  return run("GET", params);
}

function POST(params, postdata) {
  return run("POST", params, postdata);
}

function run(method, params, postdata) {
  return {"method": method, "params": params, "postdata": postdata}
}
