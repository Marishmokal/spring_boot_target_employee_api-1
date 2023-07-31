package com.bank.target.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;


@Data
@Entity
public class Employee {
@Id
int id;
String name;
double salary;
}
