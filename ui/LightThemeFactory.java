package ui;

public class LightThemeFactory extends UIFactory {
    @Override
    public Button createButton() {
        return new LightThemeButton();
    }

    @Override
    public TextField createTextField() {
        return new LightThemeTextField();
    }
}
