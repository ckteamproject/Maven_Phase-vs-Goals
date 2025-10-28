# 🧩 Maven Phases vs Goals

## 🎯 Project Title
**Demonstration of Maven Build Phases and Goals using Custom Plugin Executions**

---

## 📘 Project Overview
This project demonstrates how **Maven build phases** and **goals** work within the Maven lifecycle.  
It binds specific plugin goals to phases such as **validate**, **compile**, **package**, and **verify** to show how automated build steps can be customized in a DevOps pipeline.

By running different Maven lifecycle commands, users can observe:
- How goals execute when attached to a phase.
- How phases run sequentially.
- How Maven automates build, test, and packaging processes.

---

## ⚙ Prerequisites
Before starting, ensure the following are installed:
- **Java 17 or higher**
- **Apache Maven 3.9+**
- **Eclipse IDE (with Maven Integration)**
- **Git** for version control and GitHub push

---

## 🧠 Objective
To understand and demonstrate the **difference between Maven build phases and goals**,  
and to showcase how plugin executions can be bound to specific phases for **automated build workflows**.

---

## 🧰 Tools & Technologies
| Tool | Purpose |
|------|----------|
| Java (JDK 17+) | Compile and run project |
| Maven | Build automation & dependency management |
| Eclipse IDE | Project creation and lifecycle management |
| Git & GitHub | Version control and repository hosting |

---

## 🧪 Steps of Implementation

1. **Create Maven Project**
   - In Eclipse → *File → New → Maven Project*  
   - Set:
     ```
     Group Id: com.example
     Artifact Id: maven-phases-vs-goals
     ```

2. **Add Source Files**
   - Create:
     ```
     src/main/java/com/example/App.java
     src/main/resources/info.txt
     ```

3. **Configure pom.xml**
   - Add and configure plugins:
     - `maven-compiler-plugin` → compile phase  
     - `maven-antrun-plugin` → validate & verify phases  
     - `exec-maven-plugin` → package phase  

4. **Run Maven Commands**
