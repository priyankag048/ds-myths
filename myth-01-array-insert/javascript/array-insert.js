import Timer from '../../utils/timer_utils/javascript/timer.js';

const initialSize = 1000000;
const operationCount = 10000;
class ArrayInsert{
  constructor() {
    this.arr = []
  }

  prefillArray() {
    for (let i = 0; i < initialSize; i++) {
      this.arr.push(i);
    }
    console.log(`Initial size: ${this.arr.length}`);
  }

  appendArray() {
    const timer = new Timer();
    timer.start();
    for (let i = 0; i < operationCount; i++) {
      this.arr.push(i);
    }
    timer.stop('Appending operation took');
    console.log(`Final size after appending: ${this.arr.length}`);
  }

  prependArray() {
    const timer = new Timer();
    timer.start();
    for (let i = 0; i < operationCount; i++) {
      this.arr.unshift(i);
    }
    timer.stop('Prepending operation took');
    console.log(`Final size after prepending: ${this.arr.length}`);
  }
}

const ai = new ArrayInsert();
ai.prefillArray();
ai.appendArray();
ai.prependArray();
