# Agency Connect

## Description
**Agency Connect** is a B2B application designed for managing users, organizations, and agencies. It provides a seamless way to handle agency management tasks, ensuring efficiency and scalability.

---

## Technologies Used
This project utilizes the following technologies:

### Frontend
- **JavaScript**
- **React**
- **Next.js**

### Backend
- **Java**
- **Spring Boot**

### Infrastructure
- **Helm Charts**
- **Kubernetes**

---

## Prerequisites
Ensure you have the following tools installed before proceeding:

1. **Lens** - A Kubernetes IDE for managing and monitoring your clusters. [Download Lens](https://k8slens.dev/)
2. **IntelliJ IDEA** - For developing Java and Spring Boot applications. [Download IntelliJ IDEA](https://www.jetbrains.com/idea/)
3. **Visual Studio Code** - For developing and managing the frontend. [Download VS Code](https://code.visualstudio.com/)
4. **Node.js** - To run and build the frontend applications. [Download Node.js](https://nodejs.org/)
5. **Helm** - For managing Kubernetes packages. [Download Helm](https://helm.sh/)

---

## Getting Started

### Clone the Repository
```bash
git clone <repository_url>
cd agency-connect
```

### Install Dependencies
Navigate to the respective directories and install dependencies:

#### Frontend
```bash
cd frontend
npm install
```

#### Backend
Ensure your Java environment is properly set up, then:
```bash
cd backend
# Use Maven or Gradle based on your build system
mvn install
# or
gradle build
```

### Kubernetes Deployment
1. Ensure your Kubernetes cluster is up and running.
2. Use Helm to deploy the application:

```bash
helm install <release-name> <chart-path>
```

---

## Contributing
If you'd like to contribute, please fork the repository and use a feature branch. Pull requests are welcome.

---

## License
This project is licensed under the [Your License Here].
