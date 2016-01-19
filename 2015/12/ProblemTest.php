<?php

/* 
Install phpunit: 

pear channel-discover pear.phpunit.de
pear channel-discover components.ez.no
pear channel-discover pear.symfony-project.com
pear install phpunit/PHPUnit

For update see http://phpunit.de
 
Running Test:

phpunit --colors ProblemTest.php

*/

require 'vendor/autoload.php';
require dirname(__FILE__) . '/Problem.php';

class ProblemTest extends PHPUnit_Framework_TestCase{

  function testInstanciaClasse(){
    $teste = new FizzBuzz();
    $this->assertInstanceOf('FizzBuzz', $teste);
  }

  function testFizz(){
    $fizzbuzz = new FizzBuzz();
    $this->assertTrue($fizzbuzz->isFizz(3));
    $this->assertTrue($fizzbuzz->isFizz(6));
    $this->assertFalse($fizzbuzz->isFizz(1));
  }

  function testBuzz(){
    $fizzbuzz = new FizzBuzz();
    $this->assertTrue($fizzbuzz->isBuzz(5));
    $this->assertFalse($fizzbuzz->isBuzz(1));
  }

  function testFizzBuzz() {
      $fizzbuzz = new FizzBuzz();
      $this->assertTrue($fizzbuzz->isFizzBuzz(15));
      $this->assertFalse($fizzbuzz->isFizzBuzz(1));
      $this->assertFalse($fizzbuzz->isFizzBuzz(3));
      $this->assertFalse($fizzbuzz->isFizzBuzz(5));
  }

  function testGetList() {
      $fizzbuzz = new FizzBuzz();
      $this->assertCount(100, $fizzbuzz->getList());
  }

  function testIsFizz() {
        $fizzbuzz = new FizzBuzz();
        $range = $fizzbuzz->getList();
        $this->assertEquals('fizz', $range[2]);
  }

}
