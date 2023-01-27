from tkinter import *
from functools import partial

def validateLogin(username, password, contactno, email):
	print("username entered :", username.get())
	print("password entered :", password.get())

    

#window
tkWindow = Tk()  
tkWindow.geometry('400x150')  
tkWindow.title('Tkinter Login Form - pythonexamples.org')

#username label and text entry box
usernameLabel = Label(tkWindow, text="User Name").grid(row=0, column=0)
username = StringVar()
usernameEntry = Entry(tkWindow, textvariable=username).grid(row=0, column=1)  

#contact no:
contactlabel = Label(tkWindow, text="contact no").grid(row=2, column=0)
contactno = IntVar()
contactEntry = Entry(tkWindow, textvariable=contactno).grid(row=2, column=1)

#username label and text entry box
emailLabel = Label(tkWindow, text="email").grid(row=3, column=0)
email = StringVar()
emailEntry = Entry(tkWindow, textvariable=email).grid(row=3, column=1)


#password label and password entry box
passwordLabel = Label(tkWindow,text="Password").grid(row=1, column=0)  
password = StringVar()
passwordEntry = Entry(tkWindow, textvariable=password, show='*').grid(row=1, column=1)  

validateLogin = partial(validateLogin, username, password,contactno,email)

#login button
loginButton = Button(tkWindow, text="Registration", command=validateLogin).grid(row=4, column=0)  

tkWindow.mainloop()