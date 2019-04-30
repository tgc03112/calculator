package com.tgc03112.calculator;
import org.springframework.stereotype.Service;
@Service
public class Calculator {
	int sum(int a, int b){
		return a+b;
	}
	int dif(int a, int b){
		return a-b;
	}
}
