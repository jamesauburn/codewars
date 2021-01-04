def check(arr):
    for i in range(len(arr)-1):
        if(pair(arr[i], arr[i+1])):
            del arr[i:i+2]
            return arr
    return arr

def pair(a, b):
    if((a == "NORTH" and b == "SOUTH") or (b == "NORTH" and a == "SOUTH")):
        return True
    if((a == "EAST" and b == "WEST") or (b == "EAST" and a == "WEST")):
        return True
    return False



def dirReduc(arr):
    before = len(arr)
    after = 0

    while(before != after):
        before = len(arr)
        arr = check(arr)
        after = len(arr)

    return arr

a = ["NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"]
print(a)
print(dirReduc(a))