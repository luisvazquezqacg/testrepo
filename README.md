
---

# Quotes App (MVVM & Clean Architecture)

This is a simple Android app that displays quotes along with their authors, fetched from an external API. The app is built using MVVM architecture and follows Clean Architecture principles, ensuring clear separation between layers. The app caches quotes locally using Room after the initial API call.

## Features

- Displays a list of quotes with authors fetched from an API
- Clean Architecture (Domain, Data, UI layers)
- Caches data locally with Room to minimize network calls
- Retrieves a random quote from the local cache
- Uses Dependency Injection for scalable architecture

## Technologies & Libraries

- **MVVM Architecture**: Manages UI-related data in a lifecycle-conscious way, providing a separation of concerns between the View, ViewModel, and Model.
- **Clean Architecture**: Organizes the code into Domain, Data, and UI layers to maintain modularity and clarity.
- **Retrofit**: Used for making API calls to fetch quotes from the server.
- **Room**: Implements local database storage to cache quotes, replacing in-memory caching.
- **Dagger-Hilt**: Provides Dependency Injection across the app, including managing Retrofit and Room instances via `NetworkModule` and `RoomModule`.
- **Mapper Functions**: Used to map data between the different layers (Domain, Data, UI).

## Setup

To get started, clone the repository and sync the Gradle dependencies. The project fetches quotes from a public API using Retrofit and caches them locally with Room for offline access.

## Credits

This project follows the tutorial series from this [YouTube playlist](https://www.youtube.com/playlist?list=PL8ie04dqq7_MvhtWlcIFS9L3_4EWatd-V).

---

