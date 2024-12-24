# TrainMaster 🚂

Modern Train Management System with Real-Time Analytics

## Overview
TrainMaster is a comprehensive train management system that combines modern technology with advanced analytics to revolutionize railway operations. The system provides real-time monitoring, booking management, and intelligent analytics through a sophisticated architecture combining Spring Boot, JavaFX, Apache Kafka, and Apache Spark.

## 🔄 System Pipeline
![TrainMaster Pipeline](Pipline%20image/TrainMaster.jpg)

## 🎥 Demo
Watch our system in action: [TrainMaster Demo Video](https://youtu.be/oXnukq-EdlU)

## 🛠️ Technology Stack
- **Backend**: Spring Boot
- **Frontend**: JavaFX
- **Database**: MySQL
- **Message Broker**: Apache Kafka
- **Analytics**: Apache Spark, PySpark, Jupyter Notebooks
- **Containerization**: Docker

## 🎯 Key Features

### Client Portal
- Intuitive black & gold UI design
- Real-time train schedule updates
- Smart search functionality
- Group booking capabilities
- Personal dashboard with booking history
- Profile management

### Admin Dashboard
- Real-time analytics visualization
- User activity monitoring
- Route popularity analysis
- Revenue tracking
- Capacity management
- System health monitoring

### Security Features
- Real-time activity tracking
- Pattern recognition for anomaly detection
- Comprehensive audit logging
- Transaction monitoring
- System access control

## 📊 Data Pipeline
```
Spring Boot → Apache Kafka → PySpark → Real-time Dashboard
```

## 🚀 Getting Started

### Prerequisites
- Java 17 or higher
- Python 3.8 or higher
- Docker and Docker Compose
- Maven

### Installation Steps

1. Clone the repository
```bash
git clone https://github.com/yourusername/TrainMaster.git
```

2. Start the Docker containers
```bash
docker-compose up -d
```

3. Build and run the Spring Boot backend
```bash
cd src
mvn clean install
mvn spring-boot:run
```

4. Build and run the JavaFX frontend
```bash
cd frontEnd
mvn clean install
mvn javafx:run
```

## 📁 Project Structure
```
TrainMaster/
├── src/                    # Spring Boot backend
├── frontEnd/              # JavaFX frontend
├── data/                  # Jupyter notebooks and analytics
└── docker-compose.yml     # Docker configuration
```

## 💡 Configuration

### Kafka Configuration
Default Kafka broker: `localhost:9092`
Topics:
- booking-events
- user-activities
- system-logs

### Database Configuration
Configure MySQL connection in `application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/trainmaster
spring.datasource.username=your_username
spring.datasource.password=your_password
```

## 🔒 Security
- Real-time monitoring of all system activities
- Pattern-based anomaly detection
- Comprehensive audit logging
- Secure user authentication

## 📊 Analytics
Access Jupyter notebooks at:
```
http://localhost:8888
```

## 🤝 Contributing
Contributions are welcome! Please feel free to submit a Pull Request.

## 📝 License
This project is licensed under the MIT License - see the LICENSE file for details.

## 📧 Contact
For any queries or suggestions, please reach out to [your-email@domain.com]
