#include<iostream>
using namespace std;
main()
{
	int i,n,h;
	cout<<"Enter any number of table : ";
	cin>>n;
	 
	for(i=1;i<=n;i++)
	{
		cout<<"Enter number ";
		cin>>h;
		for(int j=1;j<=10;j++)
		{
			cout<<h<<"*"<<j<<"="<<h*j<<"\n";
		}
	}
	
}

