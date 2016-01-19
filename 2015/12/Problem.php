<?php

class FizzBuzz {
    function isFizz($number){
        return $number % 3 == 0;
    }

    function isBuzz($number){
        return ($number % 5 ==0);
    } 

    function isFizzBuzz($number) {
        return $this->isFizz($number) && $this->isBuzz($number);
    }

    function getList(){
        $range = Range(1,100);
        forEach($range,$key=>$number){ 
            if($this->isFizz($number)) {
            $range [$key] = 'fizz';
            }
        }
        return $range;
    }
}
