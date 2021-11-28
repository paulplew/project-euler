import { factor } from './utils/factor';

let i = 1;
let triangle = 1;
while (factor(triangle).length <= 500) {
  triangle += (i + 1);
  i += 1;
}

console.log(`Answer: ${triangle}`);
