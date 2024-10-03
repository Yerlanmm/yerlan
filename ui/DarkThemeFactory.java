package ui;

public class DarkThemeFactory extends UIFactory {
    @Override
    public Button createButton() {
        return new DarkThemeButton();
    }

    @Override
    public TextField createTextField() {
        return new DarkThemeTextField();
    }
}
