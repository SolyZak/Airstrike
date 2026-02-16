# Airstrike

<p align="center">
  <strong>A classic Space Invaders-style arcade game built with Java Swing</strong>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java"/>
  <img src="https://img.shields.io/badge/Swing-007396?style=for-the-badge&logo=java&logoColor=white" alt="Swing"/>
</p>

---

## Overview

A 2D space defense game where the player controls a spaceship to destroy waves of alien invaders before they reach the ground. Features sprite-based graphics, sound effects, and collision detection.

## Gameplay

- **Objective:** Destroy all 24 aliens before they reach the ground
- **Aliens** move in synchronized waves, descending each time they hit a screen edge
- **Enemies fire back** with randomly dropped bombs
- **Win:** Eliminate all aliens
- **Lose:** Get hit by a bomb or let aliens reach the ground line

## Controls

| Key | Action |
|-----|--------|
| Left / Right Arrow | Move spaceship |
| Spacebar | Fire |

## Tech Stack

| Component | Technology |
|-----------|-----------|
| Language | Java |
| GUI | Java Swing (JFrame/JPanel) |
| Graphics | AWT rendering with sprite images |
| Audio | Java Sound API (WAV) |

## Project Structure

```
src/
├── spacegame/
│   ├── Airstrike.java       # Main game launcher (JFrame)
│   ├── Screen.java           # Game loop, rendering, collision detection
│   ├── Commons.java          # Game constants (dimensions, speeds, counts)
│   ├── Difficulty.java       # Difficulty system
│   └── character/
│       ├── Character.java    # Base character class
│       ├── Spaceship.java    # Player spaceship
│       ├── Enemy.java        # Alien invaders + bomb logic
│       └── Bullet.java       # Player projectile
├── images/                   # Sprite assets (PNG/JPG)
└── sound/                    # Sound effects (WAV)
```

## Getting Started

```bash
git clone https://github.com/SolyZak/Airstrike.git
cd Airstrike
```

Open in any Java IDE (IntelliJ IDEA, Eclipse) and run `src/spacegame/Airstrike.java`.

## License

This project is for educational purposes.
