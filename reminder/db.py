import sqlite3


class Database:
    def __init__(self, db):
        self.con = sqlite3.connect(db)
        self.cur = self.con.cursor()
        sql = """
        CREATE TABLE IF NOT EXISTS reminder(
            id Integer Primary Key,
            name text,
            todo text,
            alerttype text,
            date text,
            time text,
            mail text,
            number text
        )
        """
        self.cur.execute(sql)
        self.con.commit()

    # Insert Function
    def insert(self, name, todo, alerttype, date,time,mail,number):
        self.cur.execute("insert into reminder values (NULL,?,?,?,?,?,?,?)",(name, todo, alerttype, date,time,mail,number))
        self.con.commit()

    # Fetch All Data from DB
    def fetch(self):
        self.cur.execute("SELECT * from reminder")
        rows = self.cur.fetchall()
        # print(rows)
        return rows

    # # Delete a Record in DB
    # def remove(self, id):
    #     self.cur.execute("delete from employees where id=?", (id,))
    #     self.con.commit()

    # # Update a Record in DB
    # def update(self, id, name, age, doj, email, gender, contact, address):
    #     self.cur.execute(
    #         "update employees set name=?, age=?, doj=?, email=?, gender=?, contact=?, address=? where id=?",
    #         (name, age, doj, email, gender, contact, address, id))
    #     self.con.commit()
