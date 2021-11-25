
const rangeHelper = (start: number, end: number, soFar: number[]): number[] => {
  if (start > end) {
    return soFar;
  } else {
    soFar.push(start);
    return rangeHelper(start + 1, end, soFar)
  }
}

export const range = (start: number, end: number): number[] => {
  return rangeHelper(start, end, []);
}
