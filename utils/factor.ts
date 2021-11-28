/**
 * Factors the number into it's prime factorization.
 * 
 * @param  {number} n the number to be factored
 * @returns {number[]} an array of the factors of the given number
 */
export const factor = (n: number): number[] => {
  const factors: number[] = [];

  for (let i = 0; i <= Math.sqrt(n); i++) {
    if (n % i === 0) {
      factors.push(i, n / i);
    }
  }
  return factors;
}
