def sequential_search(a, x):
    for i, val in enumerate(a):
        if val == x:
            return i
    return -1

print(sequential_search([4, 2, 7, 1], 7))
