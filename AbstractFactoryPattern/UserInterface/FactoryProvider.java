package com.practice.example;

/**
 * Factory provider
 */
public class FactoryProvider {
    public static UIFactory getFactory(UIType uiType) {
        if (UIType.AWT == uiType) {
            return new Awt();
        } else if (UIType.SWING == uiType) {
            return new Swing();
        }
        return null;
    }
}
