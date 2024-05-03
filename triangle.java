def count_non_divisible(n):
    # Function to calculate the greatest common divisor
    def gcd(a, b):
        while b:
            a, b = b, a % b
        return a

    # Function to calculate the binomial coefficient
    def binomial_coefficient(n, k):
        res = 1
        for i in range(k):
            res *= (n - i)
            res //= (i + 1)
        return res

    count = 0
    for row in range(n + 1):
        for col in range(row // 2 + 1):
            coeff = binomial_coefficient(row, col)
            if gcd(coeff, 7) != 1:
                count += 1
        if row % 2 == 0:
            count -= 1
    return count

# Example usage
n = 1000000000
result = count_non_divisible(n)
print(result)
