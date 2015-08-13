/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
QUnit.test( "hello test", function( assert ) {
  assert.ok( 1 == "1", "Passed!" );
});

QUnit.test("Testing Plus function", function(assert) {
  assert.equal(5, plus(2, 3), "3 + 2 is 5");
});

QUnit.test("Testing Plus function with failing", function(assert) {
  assert.equal(5, plus(2, 2), "2 + 2 is 5");
});

QUnit.test("Testing Plus function with failing2", function (assert) {
    assert.equal(5, plus(2, 2), "2 + 2 is 5");
});



