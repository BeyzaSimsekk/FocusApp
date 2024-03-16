package com.example.focusapp.Model;

/*
Bu sınıf, bir görevin temsilini yapar. Görevin kimliği (id), durumu (status - tamamlanmış veya tamamlanmamış)
ve görevin kendisi (task) gibi özellikleri içerir. Getter ve setter metotları ile bu özelliklere erişim sağlanır.
*/
public class ToDoModel {
    private int id, status;
    private String task;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
}
