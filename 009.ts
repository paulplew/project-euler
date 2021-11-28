const pythagoreanSumTo = (n: number): number => {
  for (let b = 1; b < n; b += 1) {
    for (let a = 1; a < b; a += 1) {
      const c = Math.sqrt((a * a) + (b * b));
      if (n % (a + b + c) === 0) {
        return (a * b * c) * Math.pow(n / (a + b + c), 3);
      } else if (a + b + c === n) {
        return a * b * c
      }
    }
  }
  return -1
}

const answer = pythagoreanSumTo(1000);
console.log(`Answer: ${answer}`);