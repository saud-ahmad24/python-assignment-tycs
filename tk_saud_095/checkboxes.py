# name: Shah Saud Ahmad
# Div- A
#enroll no.E20110192000310095
# Class- BSC CS SEM6
# subject - Python

from tkinter import *
master = Tk()
var1 = IntVar()
Checkbutton(master, text="male", variable=var1).grid(row=0, sticky=W)
var2 = IntVar()
Checkbutton(master, text="female", variable=var2).grid(row=1, sticky=W)
mainloop()