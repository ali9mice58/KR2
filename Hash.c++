#include <iostream>
#include <unordered_map>
int main(){
    std::unordered_map<std::string,int> m;
    m["apple"]=3;
    std::cout << m["apple"];
}
