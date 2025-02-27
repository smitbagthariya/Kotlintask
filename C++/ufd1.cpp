#include<iostream>
using namespace std;
void getsum(int a,int b)
{
	cout<<"Sum :"<<a+b;
}
void getsub(int a,int b)
{
	cout<<"\nSub :"<<a-b;
}
void getmul(int a,int b)
{
	cout<<"\nMul :"<<a*b;
}
void getdiv(int a,int b)
{
	cout<<"\ndiv :"<<a/b;
}
main()
{
	int x,y;
	cout<<"Enter number of x";
	cin>>x;
	cout<<"enter number of y";
	cin>>y;
	getsum(x,y);
	getsub(x,y);
	getmul(x,y);
	getdiv(x,y);
}
