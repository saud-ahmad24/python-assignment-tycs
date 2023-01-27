from tkinter import *
import tkinter.messagebox as tsmg
import requests
import random
import json

root=Tk()


def nextPage():
    root.destroy()
    import index




root.geometry("500x500")
root.title("Dashboard")

num=StringVar()
otp=StringVar()

f1=Frame(root)
Label(f1,text="Index Page",font="SegoeUI 30 bold",fg="purple").pack(padx=5,pady=10)
f1.pack(fill=BOTH)







root.mainloop()