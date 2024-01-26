#include <stdio.h>
#include <string.h>

int lengthOfArray(int arr[]);
int stringLength(char *name);

int main()
{
    int a = 65;
    char B = 'B';
    printf("%i\n", B);
    printf("%c\n", a);

    int arr[] = {
        1,
        2,
        3,
    };

  

 

    char name[] = "Geetansh Kaul";
    char hello[] = "hello";
   
    printf("\n");

    for (int i = 0; i < 20; i++)
    {
        printf("%i ", name[i]);
    }
    printf("\n");
    for (char i = 0; i < 10; i++)
    {
        printf("%i ", hello[i]);
    }
    printf("\n");
    printf("%i", stringLength(name));
}

int stringLength(char *name){
    int length = 0;
    for (int i = 0; name[i] != '\0'; i++)
    {
        length++;
    }
    return length;
}
