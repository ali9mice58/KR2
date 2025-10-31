#include <iostream>
#include <vector>

void selection_sort(std::vector<int>& a) {
    int n = a.size();
    for (int i = 0; i < n - 1; ++i) {
        int minIdx = i;
        for (int j = i + 1; j < n; ++j)
            if (a[j] < a[minIdx]) minIdx = j;
        std::swap(a[i], a[minIdx]);
    }
}
int main() {
    std::vector<int> v{5, 3, 2, 4};
    selection_sort(v);
    for (int x : v) std::cout << x << ' ';
}
