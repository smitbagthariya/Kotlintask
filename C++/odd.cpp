#include<iostream>
using namespace std;
main()
{
	int n,a;
	cout<<"enter number of n";
	cin>>n;
	for(int i=0;i<n;i++)
	{
		cout<<"Enter any number";
		cin>>a;
	}
	if(a%2==0)
	{
		cout<<"even"<<n;
	}
	else
	{
		cout<<"odd";
	}
}
