#include<iostream>
using namespace std;

int main(){
    int size;
    cin>>size;
    int * A=new int[size];
    for(int i=0;i<size;i++){
        cin>>A[i];
    }
    for(int i=0;i<size;i++){
        cout<<A[i]<<" ";
    }
    cout<<endl;
    delete[] A;
    return 0;
}