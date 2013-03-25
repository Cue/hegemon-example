let common = {};

common.getParamsAsObject = function(params) {
  var result = {};
  var keys = params.keySet().iterator();
  while (keys.hasNext()) {
    var key = keys.next();
    result[key] = params.get(key).get(0);
  }
  return result;
};

