from tkinter import *
from tkinter import ttk
# from tkcalendar import DateEntry
from tkinter import messagebox
from db import Database

db = Database("Reminder.db")
root = Tk()
root.title("Employee Reminder System")
root.geometry("1920x1080+0+0")
root.config(bg="#2c3e50")
# root.state("zoomed")

name = StringVar()
todo = StringVar()
time = StringVar()
name = StringVar()
todo = StringVar()
time = StringVar()
time = StringVar()

# Entries Frame
entries_frame = Frame(root, bg="#535c68")
entries_frame.pack(side=TOP, fill=X)
title = Label(entries_frame, text="Employee Management System", font=("Calibri", 18, "bold"), bg="#535c68", fg="white")
title.grid(row=0, columnspan=2, padx=10, pady=20, sticky="w")

lblName = Label(entries_frame, text="Name", font=("Calibri", 16), bg="#535c68", fg="white")
lblName.grid(row=1, column=0, padx=10, pady=10, sticky="w")
txtName = Entry(entries_frame, textvariable=name, font=("Calibri", 16), width=30)
txtName.grid(row=1, column=1, padx=10, pady=10, sticky="w")

lblTodo = Label(entries_frame, text="Todo", font=("Calibri", 16), bg="#535c68", fg="white")
lblTodo.grid(row=1, column=2, padx=10, pady=10, sticky="w")
txtTodo = Entry(entries_frame, textvariable=todo, font=("Calibri", 16), width=30)
txtTodo.grid(row=1, column=3, padx=10, pady=10, sticky="w")

lblName = Label(entries_frame, text="Name", font=("Calibri", 16), bg="#535c68", fg="white")
lblName.grid(row=1, column=0, padx=10, pady=10, sticky="w")
txtName = Entry(entries_frame, textvariable=name, font=("Calibri", 16), width=30)
txtName.grid(row=1, column=1, padx=10, pady=10, sticky="w")

lblName = Label(entries_frame, text="Name", font=("Calibri", 16), bg="#535c68", fg="white")
lblName.grid(row=1, column=0, padx=10, pady=10, sticky="w")
txtName = Entry(entries_frame, textvariable=name, font=("Calibri", 16), width=30)
txtName.grid(row=1, column=1, padx=10, pady=10, sticky="w")

lblName = Label(entries_frame, text="Name", font=("Calibri", 16), bg="#535c68", fg="white")
lblName.grid(row=1, column=0, padx=10, pady=10, sticky="w")
txtName = Entry(entries_frame, textvariable=name, font=("Calibri", 16), width=30)
txtName.grid(row=1, column=1, padx=10, pady=10, sticky="w")

lblName = Label(entries_frame, text="Name", font=("Calibri", 16), bg="#535c68", fg="white")
lblName.grid(row=1, column=0, padx=10, pady=10, sticky="w")
txtName = Entry(entries_frame, textvariable=name, font=("Calibri", 16), width=30)
txtName.grid(row=1, column=1, padx=10, pady=10, sticky="w")

lblTime = Label(entries_frame, text="Time", font=("Calibri", 16), bg="#535c68", fg="white")
lblTime.grid(row=2, column=0, padx=10, pady=10, sticky="w")
txtTime = Entry(entries_frame, textvariable=time, font=("Calibri", 16), width=30)
txtTime.grid(row=2, column=1, padx=10, pady=10, sticky="w")

lblEmail = Label(entries_frame, text="Email", font=("Calibri", 16), bg="#535c68", fg="white")
lblEmail.grid(row=2, column=2, padx=10, pady=10, sticky="w")
txtEmail = Entry(entries_frame, textvariable=email, font=("Calibri", 16), width=30)
txtEmail.grid(row=2, column=3, padx=10, pady=10, sticky="w")


def getData(event):
    selected_row = tv.focus()
    data = tv.item(selected_row)
    global row
    row = data["values"]
    #print(row)
    name.set(row[1])
    todo.set(row[2])
    time.set(row[3])
    # email.set(row[4])


def dispalyAll():
    tv.delete(*tv.get_children())
    for row in db.fetch():
        tv.insert("", END, values=row)


def add_employee():
    if txtName.get() == "" or txtTodo.get() == "" or txtTime.get() == "":
        messagebox.showerror("Erorr in Input", "Please Fill All the Details")
        return
    db.insert(txtName.get(),txtTodo.get(), txtTime.get())
    messagebox.showinfo("Success", "Record Inserted")
    # clearAll()
    dispalyAll()



# def update_employee():
#     if txtName.get() == "" or txtAge.get() == "" or txtDoj.get() == "" or txtEmail.get() == "" or comboGender.get() == "" or txtContact.get() == "" or txtAddress.get(
#             1.0, END) == "":
#         messagebox.showerror("Erorr in Input", "Please Fill All the Details")
#         return
#     db.update(row[0],txtName.get(), txtAge.get(), txtDoj.get(), txtEmail.get(), comboGender.get(), txtContact.get(),
#               txtAddress.get(
#                   1.0, END))
#     messagebox.showinfo("Success", "Record Update")
#     clearAll()
#     dispalyAll()


# def delete_employee():
#     db.remove(row[0])
#     clearAll()
#     dispalyAll()


# def clearAll():
#     name.set("")
#     age.set("")
#     doj.set("")
#     gender.set("")
#     email.set("")
#     contact.set("")
#     txtAddress.delete(1.0, END)


btn_frame = Frame(entries_frame, bg="#535c68")
btn_frame.grid(row=6, column=0, columnspan=4, padx=10, pady=10, sticky="w")
btnAdd = Button(btn_frame, command=add_employee, text="Add Details", width=15, font=("Calibri", 16, "bold"), fg="white",
                bg="#16a085", bd=0).grid(row=0, column=0)
# btnEdit = Button(btn_frame, command=update_employee, text="Update Details", width=15, font=("Calibri", 16, "bold"),
#                  fg="white", bg="#2980b9",
#                  bd=0).grid(row=0, column=1, padx=10)
# btnDelete = Button(btn_frame, command=delete_employee, text="Delete Details", width=15, font=("Calibri", 16, "bold"),
#                    fg="white", bg="#c0392b",
#                    bd=0).grid(row=0, column=2, padx=10)
# btnClear = Button(btn_frame, command=clearAll, text="Clear Details", width=15, font=("Calibri", 16, "bold"), fg="white",
#                   bg="#f39c12",
#                   bd=0).grid(row=0, column=3, padx=10)

# Table Frame
tree_frame = Frame(root, bg="#ecf0f1")
tree_frame.place(x=0, y=480, width=1980, height=520)
style = ttk.Style()
style.configure("mystyle.Treeview", font=('Calibri', 18),
                rowheight=50)  # Modify the font of the body
style.configure("mystyle.Treeview.Heading", font=('Calibri', 18))  # Modify the font of the headings
tv = ttk.Treeview(tree_frame, columns=(1, 2, 3, 4), style="mystyle.Treeview")
tv.heading("1", text="ID")
tv.column("1", width=5)
tv.heading("2", text="Name")
tv.heading("3", text="Todo")
tv.column("3", width=5)
tv.heading("4", text="Time")
tv.column("4", width=10)

tv['show'] = 'headings'
tv.bind("<ButtonRelease-1>", getData)
tv.pack(fill=X)

dispalyAll()
root.mainloop()
