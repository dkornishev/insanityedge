if (typeof kotlin === 'undefined') {
  throw new Error("Error loading module 'out'. Its dependency 'kotlin' was not found. Please, check whether 'kotlin' is loaded prior to 'out'.");
}
var out = function (_, Kotlin) {
  'use strict';
  function InsanityProxy() {
  }
  InsanityProxy.$metadata$ = {
    kind: Kotlin.Kind.CLASS,
    simpleName: 'InsanityProxy',
    interfaces: []
  };
  function main(args) {
    console.log('hello world');
    var sc = new WebSocket('ws://localhost:4567/rpc');
  }
  var package$org = _.org || (_.org = {});
  var package$insanityedge = package$org.insanityedge || (package$org.insanityedge = {});
  var package$client = package$insanityedge.client || (package$insanityedge.client = {});
  package$client.InsanityProxy = InsanityProxy;
  package$client.main_vqirvp$ = main;
  main([]);
  Kotlin.defineModule('out', _);
  return _;
}(typeof out === 'undefined' ? {} : out, kotlin);

//# sourceMappingURL=out.js.map
