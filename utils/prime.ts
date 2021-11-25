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
(k: number, outerLoop: (a: number) => boolean): number[] => {
  const flags: boolean[] = new Array(k + 1).fill(true);

  for (let i = 1; outerLoop(i); i += 1) {
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
export const largestPrimeBelow = (n: number): number => {
  const k: number = Math.floor((n - 1) / 2);
  const primes: number[] = sundaram_sieve(k, (i) => i < Math.sqrt(k));

  return primes[primes.length - 1];
}