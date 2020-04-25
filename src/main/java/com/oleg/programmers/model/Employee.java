package com.oleg.programmers.model;

import java.util.Objects;

public class Employee {
    private String fio;
    private double salary;
    private String special;

    public Employee(String fio, double salary, String special) {
        this.fio = fio;
        this.salary = salary;
        this.special = special;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.fio);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.salary) ^ (Double.doubleToLongBits(this.salary) >>> 32));
        hash = 89 * hash + Objects.hashCode(this.special);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (Double.doubleToLongBits(this.salary) != Double.doubleToLongBits(other.salary)) {
            return false;
        }
        if (!Objects.equals(this.fio, other.fio)) {
            return false;
        }
        if (!Objects.equals(this.special, other.special)) {
            return false;
        }
        return true;
    }
    
    

    @Override
    public String toString() {
        return fio + ", З/пл: " + salary + ", " + special;
    }
    
    
           
    
}
