from tkinter import *
from functools import partial

def validateLogin(username,email,password):
	print("username entered :", username.get())
	print("password entered :", password.get())
	print("email entered :", email.get())
 
    # print("email entered :", email.get())
	return


#window
tkWindow = Tk()  
tkWindow.geometry('400x150')  
tkWindow.title('Tkinter Register ')

#username label and text entry box
usernameLabel = Label(tkWindow, text="User Name").grid(row=0, column=0)
username = StringVar()
usernameEntry = Entry(tkWindow, textvariable=username).grid(row=0, column=1)

#email label and text entry box
emailLabel = Label(tkWindow, text="email").grid(row=1, column=0)
email = StringVar()
emailEntry = Entry(tkWindow, textvariable=email).grid(row=1, column=1)    

#password label and password entry box
passwordLabel = Label(tkWindow,text="Password").grid(row=2, column=0)  
password = StringVar()
passwordEntry = Entry(tkWindow, textvariable=password, show='*').grid(row=2, column=1)  

validateLogin = partial(validateLogin, username,email, password)

#login button
loginButton = Button(tkWindow, text="register", command=validateLogin).grid(row=4, column=0)  

tkWindow.mainloop()