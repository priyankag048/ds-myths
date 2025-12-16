# Myth 01: Inserting at the Front of an Array is Cheap

This experiment explores the common assumption that adding elements at the front of an array is inexpensive.

## The Experiment

We test how expensive it is to insert elements at the front (index `0`) of a large array.

1. **Prefill** the array with a large number of elements.
2. **Insert** new elements always at index `0`.
3. **Measure** the time taken for these insertions.
4. **Compare** results across multiple programming languages.

> **Current Setup**: Example test with 1 million elements for performance measurement.  

## Running the Experiment 

### Java

1. From the root folder `ds-myths`

2. Compile the Java classes
Make sure you are in the correct folder where myth01 and util packages can be resolved.

```bash
javac utils/timer_utils/java/util/Timer.java myth-01-array-insert/ java/myth01/ArrayInsert.java
```

3. Run the experiment

```bash
java -cp "myth-01-array-insert/java:utils/timer_utils/java" myth01.ArrayInsert
```

You should see output messages indicating the time taken for:

```
Initial size: 1000000
Insertion at end took 0ms to complete
Final size after appending: 1010000
Insertion at front took 1037ms to complete
Final size after appending: 1020000
```

### Golang

1. From the root folder `ds-myths`

2. Run the experiment

```bash
go run myth-01-array-insert/golang/array_insert.go
```

You should see output messages indicating the time taken for:

```
Initial size of slice: 1000000
Appending operation took: 1 ms 
Final size of slice after appending: 1010000
Prepending operation took: 3672 ms 
Final size of slice after prepending: 1020000
```

### Javascript

1. From the root folder `ds-myths`

2. Run the experiment

```bash
node ./myth-01-array-insert/javascript/array-insert.js
```

You should see output messages indicating the time taken for:

```
Initial size of array: 1000000
Appending operation took: 5
Final size of array after appending: 1010000
Prepending operation took: 1685
Final size of array after prepending: 1020000
```


### Python

1. From the root folder `ds-myths`

2. Run the experiment

```bash
PYTHONPATH=. python3 ./myth-01-array-insert/python/array_insert.py
```

You should see output messages indicating the time taken for:

```
Initial size of list: 1000000
Appending to list:  0.00 ms
List size after append operation: 1010000
Prepending to list:  4.98 ms
List size after prepend operation: 1020000
```

## Comparison Goals
Observe whether front insertions are indeed cheap.

Understand time complexity implications in real-world runtime environments.

## Notes

This is meant for proof-of-concept and learning, not production code.

All results and insights are documented in the accompanying blog post.