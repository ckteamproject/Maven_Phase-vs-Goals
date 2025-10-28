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
5. 
Check in the `target/` folder for:
- `validate.txt`
- `verify.txt`
- `exec-package-run.txt`
- `maven-phases-vs-goals-1.0-SNAPSHOT.jar`
## 🧾 Output

After executing all Maven lifecycle commands, the following results were observed:

| Phase | Command | Output Generated |
|--------|----------|------------------|
| **Validate** | `mvn validate` | `target/validate.txt` created successfully |
| **Compile** | `mvn compile` | Java files compiled to `target/classes` |
| **Package** | `mvn package` | `maven-phases-vs-goals-1.0-SNAPSHOT.jar` created and `exec-package-run.txt` generated |
| **Verify** | `mvn verify` | `target/verify.txt` created successfully |

### Files Generated in `target/` Directory

Each file corresponds to a specific build phase, showing how Maven plugins execute during each lifecycle step.

---

## 🧩 Conclusion

The project successfully demonstrated the working of **Maven build phases** and **plugin goals**.  
By binding plugin executions to specific phases like `validate`, `package`, and `verify`, the build process was fully automated.  

This approach helps in:
- Understanding Maven’s **lifecycle management**.  
- Automating **build, packaging, and verification** tasks in a DevOps workflow.  
- Ensuring **consistent and reproducible builds** across different environments.

Overall, the project provides a clear and practical understanding of how Maven Phases and Goals function in real-world software automation.

---

