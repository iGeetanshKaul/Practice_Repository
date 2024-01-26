#include <stdio.h>

int main(int argc, char *argv[])
{
    printf("Enter the name: ");
    for (int i = 0; i < argc; ++i)
        {
            if(argv[i] == "Hello"){
                printf("Geetansh Kaul");
            }else{
            printf("%s ", argv[i]);
            }
        }    return 0;
}