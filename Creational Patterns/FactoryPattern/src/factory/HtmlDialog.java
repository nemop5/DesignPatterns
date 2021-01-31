package factory;

/**
 * HTML Dialog will produce HTML buttons.
 */
import buttons.Button;
import buttons.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
