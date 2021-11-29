#include <iostream>

using namespace std;

int func(int& res, int val) {
    res = res + val;
    return res;
}
int  main()
{
    int sum = 0;
    for(int a = 1; a < 4; a++)
        sum += func(sum, a);
   cout << sum << endl;     // 22
   return 0;
}
