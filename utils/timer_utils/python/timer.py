import time

class Timer:
  def __init__(self):
    self.start_time = None

  def start(self):
    self.start_time = time.time()

  def stop(self, message):
    elapsed = (time.time() - self.start_time)
    print(f"{message}: {elapsed: .2f} ms")