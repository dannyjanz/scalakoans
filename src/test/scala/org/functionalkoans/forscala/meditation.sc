def factorial(x:BigInt):BigInt = { //Notice the return type of BigInt!
  if (x <= 1) 1
  else x * factorial(x-1)
}

factorial(4)
