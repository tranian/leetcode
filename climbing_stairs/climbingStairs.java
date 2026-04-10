Idea:
Can think of it as remainders
Base case: check if at top (is remainder == 0) -> return 1 for soln found
if exceeded (remainder < 0) -> return 0


at each step, choose between 1 step or 2
take step, and then check again (recursion call)


Issue:
recomputing previous answers, can memoize (store answers in array,
check if answer was already computed in array before doing computation)
