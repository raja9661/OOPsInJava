#include<iostream>
using namespace std;

int main()
{
    string s1="ab";
    string s2="xz";
    string s3="ab";
    cout<<s1.compare(s2)<<endl;
    cout<<s2.compare(s1)<<endl;
     cout<<s1.compare(s3)<<endl;
    return 0;
}