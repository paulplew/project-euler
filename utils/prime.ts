/**
 * Generates the prime numbers using the sundaram sieve method.
 * 
 * @param {number} k an estimate of the kth prime
 * @param {(a: number) => boolean} loopEscape a function that is called to
 * escape the the outer for oop
 * @returns {number[]} a list of the primes produced
 * 
*/
const sundaram_sieve =
  (k: number, loopEscape: (a: number) => boolean): number[] => {
    const flags: boolean[] = new Array(k + 1).fill(true);

    for (let i = 1; loopEscape(i); i += 1) {
      let j: number = i;
      while (i + j + (2 * i * j) <= k) {
        flags[i + j + (2 * i * j)] = false;
        j += 1;
      }
    }

    const primes: number[] = [2];

    for (let i = 0; i < flags.length; i += 1) {
      if (flags[i]) {
        primes.push(2 * i + 1);
      }
    }

    return primes;
  }

/**
 * Generates the Nth prime number.
 * 
 * @param  {number} n the number prime that is desired 
 * @returns number the nth prime number
 */
export const nthPrime = (n: number): number => {
  const k: number = Math.floor((2.4 * n * Math.log(n)) / 2)
  const primes: number[] = sundaram_sieve(k, (i) => i <= k);
  return primes[n];
}

/**
 * Produces the largest prime below a given number.
 * 
 * @param  {number} n the maximum number
 * @returns number the largest prime number below the given number
 */
export const primesBelow = (n: number): number[] => {
  const k: number = Math.floor((n - 1) / 2);
  const primes: number[] = sundaram_sieve(k, (i) => i < Math.sqrt(k));

  return primes;
}

/**
 * Checks if the given number is prime.
 * 
 * @param  {number} n the number that will be checked
 * @returns boolean true if the given number is prime, false otherwise.
 */
export const isPrime = (n: number): boolean => {
  if (n <= 3) {
    return n > 1;
  } else if ((n % 2 === 0) || (n % 3 === 0)) {
    return false;
  }

  let current = 5;
  while (Math.pow(current, 2) <= n) {
    if (n % current === 0 || n % (current + 2) === 0) return false;
    current += 6;
  }
  return true;
}
