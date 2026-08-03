# BrainQuestor

A cross-platform quiz and learning app built with Kotlin Multiplatform (KMP) for Android, iOS, and desktop.

## Features
- Multiple quiz categories (Math, Science, History, Trivia)
- Adaptive difficulty and progress tracking
- Daily streaks and achievements
- Offline-first with SQLDelight
- Shared business logic across platforms

## Tech Stack
- **Language:** Kotlin Multiplatform (KMP)
- **Shared Logic:** KMM shared module
- **Local DB:** Room for KMP (via `room-kotlin` multiplatform)
- **UI Layers:**
  - Android: Jetpack Compose
  - iOS: SwiftUI (via KMM + Room iOS driver)
- **Async:** Coroutines, Flows
- **DI:** Koin (shared)
- **Networking:** Ktor Client (if online features)

- **Server Stack:**
  - Backend: Kotlin with Ktor
  - Database: MongoDB (via KMongo)
  - Hosting: AWS/Google Cloud/DigitalOcean

## Project Structure
```
brainquestor/
├── shared/              # KMP shared module
│   ├── commonMain/      # Shared business logic
│   ├── androidMain/     # Android-specific
│   └── iosMain/         # iOS-specific
├── androidApp/          # Android UI module
├── iosApp/              # iOS Xcode project
└── desktopApp/          # Desktop Compose module
```


## Getting Started
1. Clone the repository
2. Open `shared/` in Android Studio for KMP development
3. Open `androidApp/` for Android UI
4. Open `iosApp/` in Xcode for iOS

## Development
- **Branch Strategy:** GitFlow
- **Code Quality:** Detekt, ktlint
- **CI/CD:** GitHub Actions with Android/iOS builds

## License
MIT License - see [LICENSE](LICENSE) file.
