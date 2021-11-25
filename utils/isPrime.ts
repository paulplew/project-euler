// checks if n is prime
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
