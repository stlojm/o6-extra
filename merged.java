def merge_sorted_arrays(A, m, B, n):
    i, j = m - 1, n - 1
    k = m + n - 1
    
    while i >= 0 and j >= 0:
        if A[i] > B[j]:
            A[k] = A[i]
            i -= 1
        else:
            A[k] = B[j]
            j -= 1
        k -= 1
    
    while j >= 0:
        A[k] = B[j]
        j -= 1
        k -= 1

# Example usage
A = [1, 3, 5, 0, 0, 0]
B = [2, 4, 6]
merge_sorted_arrays(A, 3, B, 3)
print(A)
//time complexity is O(n)
  //space complexity is O(1)
