// generates the nth prime number using the sieve of sundaram method 
export const generatePrimes = (n: number): number[] => {
  const k: number = Math.floor((n - 1) / 2);
  const flags: boolean[] = new Array(k + 1).fill(true);

  for (let i = 1; i < Math.sqrt(k); i += 1) {
    let j: number = i;
    while (i + j + (2 * i * j) <= k) {
      flags[i + j + (2 * i * j)] = false;
      j += 1;
    }
  }

  const primes = [];
  for (let i = 0; i < flags.length; i += 1) {
    if (flags[i]) {
      primes.push(2 * i + 1);
    }
  }
  return primes;
}

export const largestPrimeBelow = (n: number): number | undefined => {
  const primes: number[] = generatePrimes(n);
  return primes.pop();
}

console.log(largestPrimeBelow(1000000));