class Solution:
    def fib(self, N: int) -> int:
        f = {0: 0, 1: 1}
        for i in range(2, N + 1):
            f[i] = f[i - 2] + f[i - 1]
        return f[N]