#include<stdio.h>
#include<stdlib.h>

void fizzBuzz(int);
void (*funcs[])(int) = {exit, fizzBuzz};
const char* arr[] = {"%d ", "Fizz ", "Buzz ", "FizzBuzz "};

void fizzBuzz(int i){
    printf(arr[!(i%3) + !(i%5) * 2], i);
    funcs[i<100]((i+1)*(i<100));
}

int main(void){
    fizzBuzz(1);
    return 0;
}