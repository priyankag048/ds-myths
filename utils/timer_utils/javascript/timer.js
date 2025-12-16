class Timer {

  start() {
    this.startTime = process.hrtime.bigint();
  }

  stop(message) {
    const endTime = process.hrtime.bigint();
    const diff = (endTime - this.startTime) / 1000000n;
    console.log(`${message}: ${diff} ms`);
  }
}

export default Timer;
