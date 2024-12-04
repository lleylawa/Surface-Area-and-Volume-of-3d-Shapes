# 3D Shapes Polymorphism Project

## Description

This Java project demonstrates the concept of **polymorphism** by creating an interface for 3D shapes (`Shape3DInterface`) and implementing it in three classes: `Sphere`, `Cylinder`, and `Cube`. Each class includes methods to calculate the **surface area** and **volume** of the respective shape. The program generates random instances of these shapes, calculates their surface area and volume, and displays the results.

### Polymorphism in Action

Polymorphism allows us to use a common interface (`Shape3DInterface`) to represent different 3D shapes (`Sphere`, `Cylinder`, and `Cube`). By doing so:
- The same method calls (`surfaceArea()` and `volume()`) behave differently based on the object's actual type at runtime.
- A single list of `Shape3DInterface` references can store objects of any class that implements the interface.
- This flexibility enables dynamic object management and simplifies the code for handling multiple shapes.

### Features

- **Interface Implementation**: A single interface defines common methods for all shapes.
- **Random Shape Generation**: The program randomly creates instances of `Sphere`, `Cylinder`, and `Cube` with random dimensions.
- **Calculation of Properties**: Each shape computes its surface area and volume using specific formulas.
- **Dynamic Behavior**: Method calls operate based on the runtime object type, showcasing polymorphism.

---

## How to Run

1. **Prerequisites**: 
   - Install Java (JDK 8 or later).
2. **Compile**: 
   - Compile the code using `javac Main.java`.
3. **Run**:
   - Run the program using `java Main`.

The program generates random dimensions for the shapes and displays their surface area and volume.

---

## Sample Outputs

### Run 1:

```
Sphere with radius: 3.45
Surface Area: 149.74
Volume: 172.38

Cube with side: 5.67
Surface Area: 192.78
Volume: 182.38

Cylinder with radius: 4.23 and height: 12.34
Surface Area: 435.60
Volume: 692.20

Sphere with radius: 7.89
Surface Area: 781.49
Volume: 2057.37
```

### Run 2:

```
Cube with side: 6.45
Surface Area: 249.69
Volume: 268.44

Sphere with radius: 5.21
Surface Area: 341.54
Volume: 592.47

Cylinder with radius: 3.12 and height: 8.15
Surface Area: 217.80
Volume: 248.57

Sphere with radius: 9.03
Surface Area: 1024.10
Volume: 3084.34
```

### Run 3:

```
Cylinder with radius: 2.32 and height: 14.28
Surface Area: 251.88
Volume: 240.27

Cube with side: 8.12
Surface Area: 395.25
Volume: 536.92

Sphere with radius: 6.45
Surface Area: 522.28
Volume: 1122.69
```

---
