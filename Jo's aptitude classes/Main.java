n1 = int(input())
n2 = int(input())
n3 = int(input())
given = int(input())
if (n1<n2 and n1<n3):
  small=n1
elif (n2<n1 and n2<n3):
  small=n2
else:
  small=n3
while (small!=0):
  if (n1%small==0 and n2%small==0 and n3%small==0):
    gcd=small
    break
  small=small-1
if (gcd==given):
  print ("Answer is correct.")
else:
  print ("Answer is wrong.")