#include<iostream>
using namespace std;

class student
{
    public:
    string name;
    char section;
    int roll_no;

    void myname()
    {
        cout<<"my name is Raja Babu:"<<endl;
    }
    void sec()
    {
        cout<<"C:"<<endl;
    }
    void roll()
    {
        cout<<"2820070:"<<endl;
    }
};
int main()
{
    student s1;
    s1.myname();
    s1.sec();
    s1.roll();
    return 0;
}