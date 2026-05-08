myName = ["Federico", "Berrueta"]
city = "Phoenix"
state = "Arizona"

def say_hello(name, city, state):
    return f"Hello, {' '.join(name)}! Welcome to {city}, {state}!"

print(say_hello(myName, city, state))
