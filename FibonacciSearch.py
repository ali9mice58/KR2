def fibonacci_search(a, x):
    n = len(a)
    fib2, fib1 = 0, 1
    fib = fib1 + fib2
    while fib < n:
        fib2, fib1 = fib1, fib
        fib = fib1 + fib2
    offset = -1
    while fib > 1:
        i = min(offset + fib2, n - 1)
        if a[i] < x:
            fib, fib1 = fib1, fib2
            fib2 = fib - fib1
            offset = i
        elif a[i] > x:
            fib, fib1 = fib2, fib1 - fib2
            fib2 = fib - fib1
        else:
            return i
    if fib1 and offset + 1 < n and a[offset + 1] == x:
        return offset + 1
    return -1

print(fibonacci_search([1, 3, 7, 9], 7))
