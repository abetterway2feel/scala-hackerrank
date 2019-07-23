From: <https://www.hackerrank.com/challenges/dynamic-array/problem>

### Task 
* Create a list, **_seqList_**, of _N_ empty sequences, where each sequence is indexed from **_0_** to **_N - 1_** . The
  elements within each of the **_N_** sequences also use **_0_**-indexing.
* Create an integer, **_lastAnswer_**, and initialize it to **_0_**.
* The types of queries that can be performed on your list of sequences (**_seqList_**) are described below:
 
  -  Query: 1 x y. 
   -  Find the sequence, **_seq_** , at index in **_(x^lastAnswer)%N)_**. 
     -  Append integer **_y_** to sequence.
     
  - Query: 2 x y 
    - Find the sequence, **_seq_** , at index in **_(x^lastAnswer)%N)_**.
    - Find the value of element **_y % size_** in **_seq_** (where **_size_** is the size of **_seq_**) and assign it to **_lastAnswer_**.
    - Print the new value of **_lastAnswer_** on a new line 
    
### Constraints

It is guaranteed that query type  will never query an empty sequence or index.


### Comments
This exercise seemed pretty pointless to me. The hardest part was working out how to do it in a semi sensible way, using
TDD (which I eventually abandoned) and having a usable data structure at the end. The task focuses on the value of
**_lastAnswer_**. There is no query designed to interrogate the data structure. Once the example scenario was solved,
there didn't seem to be any more of a trick to worry about. I can't see any real life application for this one.
