# Metal Slug Game

This project is a complete implementation of the Metal Slug Game with a Spring Boot backend server and a LibGDX client.

## Project Structure

```
metal-slug-game/
├── backend/
│   ├── pom.xml
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/
│   │   │   │       └── metalslug/
│   │   │   │           ├── GameServerApplication.java
│   │   │   │           ├── WebSocketConfig.java
│   │   │   │           ├── GameController.java
│   │   │   │           ├── model/
│   │   │   │           │   ├── Player.java
│   │   │   │           │   ├── Enemy.java
│   │   │   │           │   ├── GameState.java
│   │   │   │           │   └── Message.java
│   │   │   │           └── GameWebSocketHandler.java
│   │   │   └── resources/
│   │   │       └── application.properties
│   │   └── test/
│   └── ...
│
├── client/
│   ├── build.gradle
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/
│   │   │   │       └── metalslug/
│   │   │   │           ├── MetalSlugGame.java
│   │   │   │           ├── GameScreen.java
│   │   │   │           ├── GameClient.java
│   │   │   │           ├── entity/
│   │   │   │           │   ├── Player.java
│   │   │   │           │   ├── Enemy.java
│   │   │   │           │   ├── Bullet.java
│   │   │   │           │   └── GameRenderer.java
│   │   │   │           └── DesktopLauncher.java
│   │   └── resources/
│   │       └── ...
└── README.md
└── DEVELOPMENT.md
```  

## Backend

The backend is developed using Spring Boot and provides a WebSocket server to manage game state and player interactions.

### pom.xml

- Configure dependencies for Spring WebSocket, Spring Boot Starter Web, and JPA.

### GameServerApplication.java

- Main class to run the Spring Boot application.

### WebSocketConfig.java

- Configuration for WebSocket connections.

### GameController.java

- Handles game logic and player interactions.

### model/

Contains model classes:
- **Player.java**: Represents a player.
- **Enemy.java**: Represents an enemy.
- **GameState.java**: Represents the current state of the game.
- **Message.java**: Represents messages between the server and clients.

### GameWebSocketHandler.java

- Manages WebSocket events for players.

## Client

The client is developed using LibGDX and represents the game visually.

### build.gradle

- Configure dependencies for LibGDX.

### MetalSlugGame.java

- Main class to run the LibGDX game.

### GameScreen.java

- Represents the game screen.

### GameClient.java

- Manages the client-side connection to the server.

### entity/

Contains entity classes:
- **Player.java**: Represents a player character.
- **Enemy.java**: Represents an enemy character.
- **Bullet.java**: Represents bullets fired in the game.
- **GameRenderer.java**: Renders the game on screen.

### DesktopLauncher.java

- Launches the desktop application.

## Installation
1. Clone the repository.
2. Build the backend using Maven: `mvn clean install`.
3. Build the client using Gradle: `./gradlew build`.

## Running the Game
- Start the backend server and then launch the client application.

## Development
Refer to DEVELOPMENT.md for guidelines on contributing and developing further.
