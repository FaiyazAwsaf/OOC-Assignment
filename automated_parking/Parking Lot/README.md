# Parking Lot Management System

A command-line application that simulates an automated parking lot system, allowing for efficient management of parking spaces.

## Features

- Create a parking lot with a specified number of slots
- Park vehicles and get allocated slot numbers
- Remove vehicles from the parking lot
- Check status of the parking lot
- Search for vehicles by color
- Find slot numbers for vehicles of a specific color
- Locate a vehicle by its registration number


## Design

The project implements several design patterns:

- **Singleton Pattern**: Used in `DefaultSlotManager` to ensure a single instance manages all slots
- **Interface Segregation**: Separate interfaces (`ParkingService`, `SearchService`) for different functionalities
- **Dependency Injection**: `SlotManager` is injected into `ParkingLotImpl` constructor

