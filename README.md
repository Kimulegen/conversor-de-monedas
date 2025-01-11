# Conversor de Monedas - Challenge ONE Back End Java

Este proyecto es un conversor de monedas que permite realizar conversiones entre diferentes divisas de América Latina, utilizando tasas de cambio en tiempo real a través de la API de ExchangeRate.

## 🚀 Características

- Conversión en tiempo real entre diferentes monedas
- Soporte para las siguientes divisas:
  - Dólar Estadounidense (USD)
  - Peso Argentino (ARS)
  - Boliviano (BOB)
  - Real Brasileño (BRL)
  - Peso Chileno (CLP)
  - Peso Colombiano (COP)
- Interfaz de consola intuitiva
- Posibilidad de realizar conversiones personalizadas
- Uso de tasas de cambio actualizadas en tiempo real

## 🛠️ Tecnologías Utilizadas

- Java 11+
- Gson (para el manejo de JSON)
- ExchangeRate API
- Java HTTP Client

## 📁 Estructura del Proyecto

```
src/
├── model/
│   └── Currency.java         # Modelo para manejar información de monedas
├── service/
│   └── ExchangeRateService.java  # Servicio para consumir la API de tasas de cambio
├── util/
│   └── CurrencyConverter.java    # Utilidad para realizar conversiones
└── Main.java                 # Punto de entrada de la aplicación
```

## 🔧 Configuración

1. Clona el repositorio:
```bash
git clone https://github.com/tu-usuario/conversor-monedas.git
```

2. Asegúrate de tener instalado Java 11 o superior.

3. **IMPORTANTE**: Configura tu API Key de ExchangeRate-API:
   - Regístrate en [ExchangeRate-API](https://www.exchangerate-api.com/)
   - Obtén tu API Key gratuita
   - Reemplaza la API Key en `ExchangeRateService.java`:
     ```java
     private final String API_URL = "https://v6.exchangerate-api.com/v6/TU-API-KEY/latest/";
     ```
   ⚠️ **Nota**: El proyecto no funcionará sin una API key válida. La key actual en el código es solo un ejemplo y no funcionará.

## 💻 Uso

1. Compila el proyecto:
```bash
javac Main.java
```

2. Ejecuta la aplicación:
```bash
java Main
```

3. Sigue las instrucciones en pantalla para:
   - Seleccionar la moneda de origen
   - Seleccionar la moneda de destino
   - Ingresar el monto a convertir

## 📋 Funcionalidades Principales

- **Conversión Estándar**: Conversiones predefinidas desde y hacia USD
- **Conversión Personalizada**: Permite elegir cualquier par de monedas soportadas
- **Consulta de Tasas**: Visualización de tasas de cambio actuales
- **Manejo de Errores**: Validación de entradas y manejo de errores de API

## 🤝 Contribuciones

Las contribuciones son bienvenidas. Por favor, sigue estos pasos:

1. Haz fork del repositorio
2. Crea una nueva rama (`git checkout -b feature/nueva-caracteristica`)
3. Realiza tus cambios y haz commit (`git commit -m 'Agrega nueva característica'`)
4. Push a la rama (`git push origin feature/nueva-caracteristica`)
5. Abre un Pull Request

## 📝 Licencia

Este proyecto está bajo la Licencia MIT - mira el archivo [LICENSE](LICENSE) para detalles

## ✨ Agradecimientos

- [ExchangeRate-API](https://www.exchangerate-api.com/) por proporcionar las tasas de cambio en tiempo real
- Oracle Next Education y Alura Latam por el desafío

## 👥 Autor

Kimulegen

---
⌨️ con ❤️ por Kimulegen 😊
