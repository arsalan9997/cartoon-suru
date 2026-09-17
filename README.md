# 🔮 Cartoon Java Maven Web Application

A beginner-friendly Java web application that accepts a user's name, date of birth,
and birth place and displays a zodiac sign with a predefined demo prediction.

> **Note:** This is an educational/demo application. The prediction messages are
> rule-based sample text and are not scientifically validated predictions.

## 🛠️ Technology Stack

- Java 17
- Maven
- JSP
- Jakarta Servlet API 6
- Apache Tomcat 10.1+
- Git / GitHub
- Linux
- AWS EC2

## 📁 Project Structure

```text
astrology-app/
├── pom.xml
├── README.md
└── src/
    └── main/
        ├── java/com/astrology/
        │   ├── AstrologyServlet.java
        │   └── PredictionService.java
        └── webapp/
            ├── index.jsp
            └── result.jsp
```

## 💻 Run / Build Locally

Check Java and Maven:

```bash
java -version
mvn -version
```

Build:

```bash
mvn clean package
```

WAR output:

```text
target/astrology.war
```

## 🌐 Git Commands

```bash
git init
git status
git add .
git commit -m "Initial astrology application"
git branch -M main
git remote add origin https://github.com/YOUR_USERNAME/astrology-app.git
git push -u origin main
```

For future changes:

```bash
git add .
git commit -m "Updated astrology application"
git push
```

## ☁️ AWS EC2 Setup

Launch an Ubuntu EC2 instance.

Recommended learning setup:

- Ubuntu Server
- Small instance suitable for testing
- Security Group:
  - TCP 22: your IP only
  - TCP 8080: your IP or required test source

Connect:

```bash
ssh -i astrology-key.pem ubuntu@EC2_PUBLIC_IP
```

Update:

```bash
sudo apt update
```

Install Java, Git, and Maven:

```bash
sudo apt install openjdk-17-jdk git maven -y
```

Verify:

```bash
java -version
git --version
mvn -version
```

## 📥 Clone and Build on EC2

```bash
git clone https://github.com/YOUR_USERNAME/astrology-app.git
cd astrology-app
mvn clean package
ls -l target/astrology.war
```

## 🚀 Tomcat Deployment

Use Apache Tomcat 10.1+ because this application uses Jakarta Servlet 6.

After installing/extracting Tomcat under `/opt/tomcat`:

```bash
sudo useradd -m -U -d /opt/tomcat -s /bin/false tomcat
sudo chown -R tomcat:tomcat /opt/tomcat
sudo chmod +x /opt/tomcat/bin/*.sh
```

Deploy:

```bash
sudo cp target/astrology.war /opt/tomcat/webapps/
```

Start:

```bash
sudo -u tomcat /opt/tomcat/bin/startup.sh
```

Check locally:

```bash
curl http://localhost:8080/astrology/
```

Open in browser:

```text
http://EC2_PUBLIC_IP:8080/astrology/
```

## 🔄 Update Deployment

After pushing a new version to GitHub:

```bash
cd ~/astrology-app
git pull
mvn clean package
sudo cp target/astrology.war /opt/tomcat/webapps/
sudo -u tomcat /opt/tomcat/bin/shutdown.sh
sudo -u tomcat /opt/tomcat/bin/startup.sh
```

## 🎯 DevOps Project Flow

```text
Developer
   ↓
Git
   ↓
GitHub
   ↓
git clone / git pull
   ↓
Maven
   ↓
mvn clean package
   ↓
astrology.war
   ↓
AWS EC2
   ↓
Apache Tomcat
   ↓
Web Application
```

## 🗣️ Interview Explanation

"I developed a Java-based astrology web application using Maven. I used Git
and GitHub for source-code management, Maven for building and packaging the
application into a WAR file, AWS EC2 as the deployment server, and Apache
Tomcat as the application server. I cloned the source code on EC2, built it
using Maven, deployed the WAR file to Tomcat, and accessed the application
through the EC2 public IP."

## 📌 Future Improvements

- Jenkins CI/CD
- Nginx reverse proxy
- HTTPS/SSL
- AWS Application Load Balancer
- Auto Scaling
- CloudWatch monitoring
- Docker containerization
- Terraform infrastructure
