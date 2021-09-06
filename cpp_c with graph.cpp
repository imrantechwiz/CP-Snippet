#include<bits/stdc++.h>
using namespace std;
 
#define google(tc) cout<<"Case #"<<tc++<<": ";
 
#define ZapIO ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL); 
#define LL long long int  
#define LD long double  
#define DD double double  
 
#define max3(a,b,c) max(a,max(b,c)) 
#define min3(a,b,c) min(a,min(b,c)) 
#define FF first 
#define SS second 
#define pushb push_back 
#define pushf push_front 
#define popb pop_back  
#define popf pop_front  
#define endl '\n'
 
#define in(arr,n) for(int i=0;i<n;i++) cin>>arr[i];
#define in2(arr,n,m) for(int i=0;i<n;i++){ for(int j=0;j<m;j++) cin>>arr[i][j];}
#define dis(arr,n) for(int i=0;i<n;i++) cout<<arr[i]<<" "; cout<<endl;
#define dis2(arr,n,m) for(int ii=0;ii<n;ii++){for(int j=0;j<m;j++)cout<<arr[ii][j]<<" ";cout<<endl;} 
#define TC() int t=0;cin>>t; while(t--) 
#define FOR(is,n,ip) for(is;is<n;is+=ip)
#define FOr(x,z) for(x;x<z;x++) 
#define For(n) for(LL i=0;i<n;i++)
#define all(x) x.begin(),x.end()
#define allr(x) x.rbegin(),x.rend()
 
#define toLower(s) transform(s.begin(),s.end(),s.begin(),::tolower)
#define toUpperr(s) transform(s.begin(),s.end(),s.begin(),::toupper)
 
#define sortAdesc(arr,n) sort(arr,arr+n, greater<int>());
#define sortVdesc(v) sort(v.begin(), v.end(), greater<int>());
 
#define mem0(X) memset((X), 0, sizeof((X)))
#define memx(X,x)  memset((X), x, sizeof((X)))
#define setbits(X)  __builtin_popcountll(X)
#define precise(X)  cout<<fixed << setprecision(X);
 
typedef pair<int, int> PII; 
typedef pair<LL, LL> PLL; 
typedef pair<string, string> PSS; 
typedef pair<string, LL> PSL; 
 
typedef vector<int> VI;  
typedef vector<LL> VL;  
typedef vector<string> VS; 
typedef vector<VI> VVI;  
typedef vector<VL> VVL; 
typedef vector<VS> VVS; 
typedef vector<PII> VPII; 
typedef vector<PLL> VPLL; 
typedef vector<PSS> VPSS; 
typedef vector<PSL> VPSL; 
 
typedef map<int,int> MII; 
typedef map<LL,LL> MLL;   
typedef map<char,LL> MCL;  
typedef map<char,int> MCI; 
typedef map<char,LL> MCL;   
typedef map<string,string> MSS;  
typedef map<string,int> MSI;  
typedef map<string,LL> MSL; 
 
typedef unordered_map<int,int> UMII; 
typedef unordered_map<LL,LL> UMLL;   
typedef unordered_map<char,LL> UMCL;  
typedef unordered_map<char,int> UMCI; 
typedef unordered_map<char,LL> UMCL;   
typedef unordered_map<string,string> UMSS;  
typedef unordered_map<string,int> UMSI;  
typedef unordered_map<string,LL> UMSL; 
 
LL lcm(LL a, LL b) 
{ return (a * (b / __gcd(a, b))); }

int mpow(int base, int exp) {
  base %= mod;
  int result = 1;
  while (exp > 0) {
    if (exp & 1) result = ((ll)result * base) % mod;
    base = ((ll)base * base) % mod;
    exp >>= 1;
  }
  return result;
}

void ipgraph(int n, int m){
	int i, u, v;
	while(m--){
		cin>>u>>v;
        u--, v--;
		g[u].pb(v);
		g[v].pb(u);
	}
}

void dfs(int u, int par){
	for(int v:g[u]){
		if (v == par) continue;
		dfs(v, u);
	}
}
 
string intToString(LL a)
{
    char x[100];
    sprintf(x, "%lld", a);
    string s = x;
    return s;
}
 
LL stringToInt(string a)
{
    char x[100];
    LL res;
    strcpy(x, a.c_str());
    sscanf(x, "%lld", &res);
    return res;
}
 
bool isPrime(int n)
{
    if (n <= 1)
        return false;
  
    for (int i = 2; i <= sqrt(n); i++)
        if (n % i == 0)
            return false;
  
    return true;
}
 
string to_binary(LL n)
{
    int bin[100];
     int i = 0;
    while (n > 0) {
        bin[i] = n % 2;
        n = n / 2;
        i++;
    }
    string s="";
    for(int j=i-1;j>=0;j--)
        s+=to_string(bin[j]);
    
    return s;
}
 
 
const int n = 3e5 + 9;
int v[n];
 
int main() {
    ZapIO;
    TC(){
 	LL n; cin >> n;
	// Write your code here..
    }
}
 


