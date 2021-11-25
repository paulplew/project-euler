const sumMultiplesBelow = (n: number): number => {
  return n <= 0 ?
    0 :
    n % 5 === 0 || n % 3 === 0 ?
      n + sumMultiplesBelow(n - 1) :
      sumMultiplesBelow(n - 1);
}

console.log(sumMultiplesBelow(1000));