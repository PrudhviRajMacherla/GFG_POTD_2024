//{ Driver Code Starts
#include <bits/stdc++.h>

using namespace std;


// } Driver Code Ends
//User function template for C++
class Solution{
public:
    static bool comp ( string str1 , string str2 )
    {
         if( str1.size() == str2.size() )
            return str1>str2;
        else 
            return ( str1 +str2 ) > ( str2 + str1 );
    }
	// The main function that returns the arrangement with the largest value as
	// string.
	// The function accepts a vector of strings
	string printLargest(int n, vector<string> &arr) {
	    sort( arr.begin () , arr.end() , comp ) ; 
	    string ans;
	    for ( auto it : arr) 
	        ans += (it );
	   
	   return ans;
	    
	}
};

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n, i;
        cin >> n;
        vector<string> arr(n);
        for (i = 0; i < n; i++) {
            cin >> arr[i];
        }
        Solution ob;
        auto ans = ob.printLargest(n, arr);
        cout << ans << "\n";
    }
    return 0;
}
// } Driver Code Ends