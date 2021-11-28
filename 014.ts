const collatzLength = (n: number): number => {
  let length = 1;
  while (n > 1) {
    if (n % 2 === 0) {
      n = n / 2;
    } else {
      n = (3 * n) + 1;
    }
    length += 1;
  }
  return length;
}

let maxLength = -1;
let max = -1;
for (let i = 0; i < 1000000; i += 1) {
  const length = collatzLength(i);
  if (length > maxLength) {
    maxLength = length;
    max = i;
  }
}

const answer = max;
console.log(`Answer: ${answer}`);