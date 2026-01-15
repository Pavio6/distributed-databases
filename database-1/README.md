# Отчет по лабораторной работе: Объектная модель (Computer)

## Цель
Продемонстрировать ключевые принципы ООП в Java: наследование, агрегация, абстрактные классы, интерфейсы, перегрузка и полиморфизм.

## Структура проекта
- `src/ElectronicDevice.java` — абстрактный базовый класс с абстрактными методами `turnOn/turnOff`.
- `src/Powerable.java` — интерфейс для операций питания.
- `src/Monitor.java` — класс-компонент для агрегации.
- `src/Computer.java` — наследник `ElectronicDevice`, реализует `Powerable`, содержит `Monitor`.
- `src/Laptop.java` — наследник `Computer`, переопределяет `turnOn`.
- `src/Main.java` — демонстрация перегрузки, интерфейса и полиморфизма.

## IS-A и HAS-A
- IS-A: `Computer` является `ElectronicDevice`, `Laptop` является `Computer`.
- HAS-A: `Computer` содержит `Monitor` как часть (агрегация).

