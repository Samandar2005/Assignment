class Works {
    private int id;
    private String clientName;
    private int requiredHours;

    public Works() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public int getRequiredHours() {
        return requiredHours;
    }

    public void setRequiredHours(int requiredHours) {
        this.requiredHours = requiredHours;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", client name='" + clientName + '\'' +
                ", required hours='" + requiredHours + '\'' +
                '}';
    }
}