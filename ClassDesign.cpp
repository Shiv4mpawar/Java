#include<iostream>
using namespace std;

class MarvellousArray
{
    private: 
        int *Arr;                                   // 8 size bcos pointer 
        int iSize;                                  // 4 size 

    public: 
        MarvellousArray(int Length)
        {
            cout<<"Inside Constructor"<<"\n";
            iSize = Length;                          // (6) value gets copied into Length   
            Arr = new int[iSize];                    // memeory allocate for array 
        }
        ~MarvellousArray()
        {
            cout<<"Inside Distructor"<<"\n";
            delete []Arr;
        } 
        void Accept()
        {
            cout<<"Enter the values :"<<"\n";
            for(int i = 0; i < iSize; i++)
            {
                cin>>Arr[i];
            }
        }
        void Display()
        {
            cout<<"Elements of array are :"<<"\n";
            for(int i = 0; i< iSize; i++)
            {
                cout<<Arr[i]<<"\n";
            }
        }
        int Addition()
        {
            int iSum = 0;
            for(int i = 0; i < iSize; i++)
            {
                iSum = iSum + Arr[i];
            }
            return iSum;
        }
};

int main()
{
    MarvellousArray mobj1(6);
    MarvellousArray mobj2(4);

    mobj1.Accept();
    mobj1.Display();

    mobj2.Accept();
    mobj2.Display();

    int iRet = 0;
    iRet = mobj1.Addition();
    cout<<"Addition of mobj1 : "<<iRet<<"\n";

    iRet = mobj2.Addition();
    cout<<"Addition of mobj2 : "<<iRet<<"\n";
    
    return 0;
}