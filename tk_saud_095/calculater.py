# name: Shah Saud Ahmad
# Div- A
#enroll no.E20110192000310095
# Class- BSC CS SEM6
# subject - Python


from tkinter import *
from math import *
def evaluate(event):
    res.configure(text = "Result: " + str(eval(entry.get())))
w = Tk()
Label(w, text="Your Expression:").pack()
entry = Entry(w)
entry.bind("<Return>", evaluate)
entry.pack()
res = Label(w)
res.pack()
w.mainloop()