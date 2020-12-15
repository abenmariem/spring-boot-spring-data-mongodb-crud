package com.javasneo.todolist.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document(collection = "todo")
public class Todo {

  @Id
  private String id;
  private String name;
  private String description;

  public Todo() {
  }

  public Todo(String id, String name, String description) {
    this.id = id;
    this.name = name;
    this.description = description;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
