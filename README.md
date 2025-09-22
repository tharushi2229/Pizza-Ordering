# Pizza Ordering System

A Java-based pizza ordering system demonstrating object-oriented programming concepts through inheritance and polymorphism.

## Overview

This system manages different types of pizzas with customizable toppings and sizes. It automatically calculates pricing based on pizza specifications and displays detailed information for each order.

## Features

- Multiple pizza types with Regular and Special variants
- Customizable toppings with dynamic pricing
- Three size options with different base costs
- Special sauce functionality for premium pizzas
- Automatic cost calculation and order display

## Class Structure

**Pizza (Base Class)**: Contains core pizza attributes including size, toppings array, and price. Provides cost calculation and information display methods.

**RegularPizza**: Extends Pizza class for standard pizzas with basic functionality and identification labeling.

**SpecialPizza**: Premium pizza variant extending Pizza class with additional special sauce attribute and enhanced display information.

## Pricing Structure

Base prices are $10 for small, $12 for medium, and $14 for large pizzas. Each topping adds $2 to the total cost regardless of pizza size.

## Files

- `Pizza.java` - Base pizza class with core functionality
- `RegularPizza.java` - Standard pizza implementation  
- `SpecialPizza.java` - Premium pizza with special sauce
- `TestRS.java` - Main test class demonstrating system functionality

## Running the System

Compile all Java files and run the TestRS class to see the pizza ordering system in action with sample pizza orders.

## Key Concepts

Demonstrates inheritance through class extension, method overriding for customized behavior, encapsulation with private fields, and polymorphism through different displayInfo implementations.
