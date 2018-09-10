#include <stdio.h>

int main(void) {
	long int num,oct=0,rem,p=1;
	scanf("%ld",&num);
	while(num!=0)
	{
		rem=num%10;
		oct += rem*p;
		p *= 2;
		num /= 10;
	}
	printf("%lX",oct);
	return 0;
}
