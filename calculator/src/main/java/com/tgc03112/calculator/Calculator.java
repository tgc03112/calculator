package com.tgc03112.calculator;
import org.springframework.stereotype.Service;
/** This is calcluator sevice class
    tgc03112
*/
@Service
public class Calculator {
	int sum(int a,int b){
		return a+b;
	}
	int dif(int a,int b){
		return a-b;
	}
}
