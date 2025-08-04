
# 🎨 JavaFX CSS Property Reference

A categorized guide to JavaFX CSS properties for styling JavaFX UI components.

---

## 1. General Properties (All Nodes)

| Property                  | Description                                |
|---------------------------|--------------------------------------------|
| `-fx-background-color`    | Background color (solid or gradient)       |
| `-fx-background-radius`   | Rounded corners for background             |
| `-fx-border-color`        | Border color                               |
| `-fx-border-radius`       | Rounded corners for border                 |
| `-fx-border-width`        | Width of border                            |
| `-fx-padding`             | Internal spacing                           |
| `-fx-opacity`             | Transparency (0.0 to 1.0)                  |
| `-fx-effect`              | Visual effects like shadows                |
| `-fx-cursor`              | Cursor style (e.g., `hand`, `text`)       |
| `-fx-font-family`         | Font name                                  |
| `-fx-font-size`           | Font size in px or pt                      |
| `-fx-font-style`          | `normal` or `italic`                       |
| `-fx-font-weight`         | `normal`, `bold`, `lighter`               |
| `-fx-text-fill`           | Font color                                 |
| `-fx-alignment`           | Text alignment (`center`, `left`, etc.)    |

---

## 2. Button-Specific

| Property                     | Description                          |
|------------------------------|--------------------------------------|
| `-fx-background-color`       | Button color                         |
| `-fx-background-radius`      | Corner radius                        |
| `-fx-text-fill`              | Text color                           |
| `-fx-border-color`           | Border color                         |
| `-fx-border-width`           | Border width                         |
| `-fx-font-size`, etc.        | Text styling                         |
| `-fx-padding`                | Space inside the button              |
| `-fx-effect`                 | Shadow or glow                       |

---

## 3. Label

| Property             | Description                  |
|----------------------|------------------------------|
| `-fx-font-family`    | Font family                  |
| `-fx-font-size`      | Font size                    |
| `-fx-text-fill`      | Text color                   |
| `-fx-font-weight`    | Font weight (`normal`, `bold`) |

---

## 4. TextField / PasswordField

| Property                      | Description                      |
|-------------------------------|----------------------------------|
| `-fx-background-color`        | Input background                 |
| `-fx-text-fill`               | Text color                       |
| `-fx-prompt-text-fill`        | Placeholder color                |
| `-fx-border-color`            | Border around input              |
| `-fx-border-radius`           | Rounded border                   |
| `-fx-background-radius`       | Rounded input background         |
| `-fx-padding`                 | Inner spacing                    |
| `-fx-highlight-fill`          | Selected text background color   |
| `-fx-highlight-text-fill`     | Selected text color              |
| `-fx-font-family`, etc.       | Font properties                  |

---

## 5. Rectangle, Shape, Region

| Property           | Description                |
|--------------------|----------------------------|
| `-fx-fill`         | Shape fill color           |
| `-fx-stroke`       | Border color               |
| `-fx-stroke-width` | Stroke thickness           |
| `-fx-arc-width`    | Rounded corners (X-axis)   |
| `-fx-arc-height`   | Rounded corners (Y-axis)   |
| `-fx-effect`       | DropShadow, InnerShadow    |

---

## 6. Effects & Transforms

| Property              | Description                          |
|-----------------------|--------------------------------------|
| `-fx-effect`          | `dropshadow(...)`, `innershadow(...)`|
| `-fx-scale-x`/`y`     | Scale transform                      |
| `-fx-rotate`          | Rotation                             |
| `-fx-translate-x`/`y` | Position offset                      |

**Example DropShadow:**
```css
-fx-effect: dropshadow(gaussian, rgba(0,0,0,0.3), 10, 0.5, 0, 2);
```

---

## 7. ImageView / Background Images

| Property                    | Description                          |
|-----------------------------|--------------------------------------|
| `-fx-background-image`      | Set image as background              |
| `-fx-background-repeat`     | Repeat mode                          |
| `-fx-background-size`       | Size (auto, cover, contain)          |
| `-fx-background-position`   | Position                             |

---

## Example CSS Block

```css
.button {
    -fx-background-color: #E4F0D0;
    -fx-background-radius: 20px;
    -fx-text-fill: #504B4B;
    -fx-font-family: "Montserrat Alternates";
    -fx-font-size: 20px;
    -fx-font-weight: 400;
    -fx-effect: dropshadow(gaussian, #738290, 4, 0.2, 0, 2);
}
```
