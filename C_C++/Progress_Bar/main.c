#include <stdio.h>

int getSizeOfArray(int arr[]);

int main()
{

    int arr[3] = {30, 40, 50};
    int lengthOfArray = getSizeOfArray(arr);

    for (int i = 0; i < length; i++)
    {
        for (int j = 0; j < arr[i]; j++)
        {
            printf("#");
        }
    }
    printf("\n");
}

int getSizeOfArray(int arr[])
{
    int length = sizeof(arr) / sizeof(arr[0]);
    return length;
}
