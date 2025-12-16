
from utils.timer_utils.python.timer import Timer

INITIAL_SIZE = 1000000
OPERATION_COUNT = 10000

class ArrayInsert:
  def __init__(self):
    self.list = [];
    self.timer = Timer()

  def prefill_list(self):
    for i in range(INITIAL_SIZE):
      self.list.append(i)
    print(f"Initial size: {len(self.list)}")

  def append_list(self):
    self.timer.start()
    for i in range(OPERATION_COUNT):
      self.list.append(i)
    self.timer.stop("Appending operation took")
    print(f"Final size after appending: {len(self.list)}")

  
  def prepend_list(self):
    self.timer.start()
    for i in range(OPERATION_COUNT):
      self.list.insert(0, i)
    self.timer.stop("Prepending operation took")
    print(f"Final size after prepending: {len(self.list)}")
  



array_insert = ArrayInsert()
array_insert.prefill_list()
array_insert.append_list()
array_insert.prepend_list()
