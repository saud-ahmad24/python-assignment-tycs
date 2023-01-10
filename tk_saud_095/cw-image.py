# name: Shah Saud Ahmad
# Div- A
#enroll no.E20110192000310095
# Class- BSC CS SEM6
# subject - Python

from tkinter import *

canvas_width = 1000
canvas_height =600

master = Tk()

canvas = Canvas(master,
           width=canvas_width,
           height=canvas_height)
canvas.pack()

img = PhotoImage(file="test.gif")
canvas.create_image(20,20, anchor=NW, image=img)

mainloop()