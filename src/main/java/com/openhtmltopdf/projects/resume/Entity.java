package com.openhtmltopdf.projects.resume;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class Entity {
  public static class Name {
    @JsonProperty public String first;
    @JsonProperty public String last;
  }
  
  public static class Birth {
    @JsonProperty public Integer year;
    @JsonProperty public String location;
  }
  
  public static class Experience {
    @JsonProperty public String company;
    @JsonProperty public String position;
    @JsonProperty public String timeperiod;
    @JsonProperty public String description;
  }

  public static class Project {
    @JsonProperty public String name;
    @JsonProperty public String technologies;
    @JsonProperty public String description;
    @JsonProperty public String link;
  }
  
  public static class Education {
    @JsonProperty public String degree;
    @JsonProperty public String timeperiod;
    @JsonProperty public String description;
  }

  public static class Language {
    @JsonProperty public String name;
    @JsonProperty public String level;
  }
  
  public static class Skill {
    @JsonProperty public String name;
    @JsonProperty public int level;
  }

  public static class Certificate {
    @JsonProperty public String name;
    @JsonProperty public String link;
  }
  
  public static class Contact {
    @JsonProperty public String email;
    @JsonProperty public String phone;
    @JsonProperty public String street;
    @JsonProperty public String city;
    @JsonProperty public String website;
    @JsonProperty public String github;
  }
  
  public static class PersonEntity {
    @JsonProperty
    public ResumeEntity person;
    
    @JsonProperty
    public String lang;
  }
  
  public static class ResumeEntity {
    @JsonProperty
    public Name name;

    @JsonProperty
    public String objective;
    
    @JsonProperty
    public String position;
    
    @JsonProperty
    public Birth birth;
    
    @JsonProperty
    @JsonDeserialize(as=ArrayList.class, contentAs=Experience.class)
    public List<Experience> experience;

    @JsonProperty
    @JsonDeserialize(as=ArrayList.class, contentAs=Project.class)
    public List<Project> project;
    
    @JsonProperty
    @JsonDeserialize(as=ArrayList.class, contentAs=Education.class)
    public List<Education> education;

    @JsonProperty
    @JsonDeserialize(as=ArrayList.class, contentAs=Language.class)
    public List<Language> languages;
    
    @JsonProperty
    @JsonDeserialize(as=ArrayList.class, contentAs=Skill.class)
    public List<Skill> skills;

    @JsonProperty
    @JsonDeserialize(as=ArrayList.class, contentAs=Certificate.class)
    public List<Certificate> certificates;
    
    @JsonProperty
    public String skillDescription;
    
    @JsonProperty
    public Contact contact;
  }

  public static class Headings {
    @JsonProperty
    public String contact;

    @JsonProperty
    public String objective;
    
    @JsonProperty
    public String experience;

    @JsonProperty
    public String project;
    
    @JsonProperty
    public String education;

    @JsonProperty
    public String languages;
    
    @JsonProperty
    public String skills;

    @JsonProperty
    public String certificates;
  }
  
  public static class LangEntity {
    @JsonProperty
    public Headings headings;
  }
}
