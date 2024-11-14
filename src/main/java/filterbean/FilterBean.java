package filterbean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class FilterBean {
    private String inputText;
    private String filteredText;
    private boolean showNumbers;
    private boolean showLetters;

    // Getters и Setters
    public String getInputText() {
        return inputText;
    }

    public void setInputText(String inputText) {
        this.inputText = inputText;
    }

    public String getFilteredText() {
        return filteredText;
    }

    public boolean isShowNumbers() {
        return showNumbers;
    }

    public void setShowNumbers(boolean showNumbers) {
        this.showNumbers = showNumbers;
    }

    public boolean isShowLetters() {
        return showLetters;
    }

    public void setShowLetters(boolean showLetters) {
        this.showLetters = showLetters;
    }

    // Метод фильтрации текста
    public String filterText() {
        if (inputText == null || inputText.isEmpty()) {
            filteredText = "";
            return null;
        }

        StringBuilder result = new StringBuilder();

        for (char c : inputText.toCharArray()) {
            if (showNumbers && Character.isDigit(c)) {
                result.append(c);
            } else if (showLetters && Character.isLetter(c)) {
                result.append(c);
            }
        }

        filteredText = result.toString();
        return null;
    }
}
