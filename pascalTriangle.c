#include<stdio.h>
void main(){
   int value, number;
    printf("how many rows you want to print triangle");
    scanf("%d", &number);
    for(int i = 1; i <= number; i++){
        for(int space = 1; space<=(number-i); space++){
            printf(" ");
        }
        for(int j = 1; j<= i;j++){
            if(i == 1 || j == 1)
                value = 1;
            else
                value = (value*(i - j + 1)/(j-1));
                
        printf("%2d",value);
        }
        printf("\n");
    }
}