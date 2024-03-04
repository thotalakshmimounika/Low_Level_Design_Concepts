package FactoryDesignPattern;

public class UIFactoryFactory {
    public static UIFactory getUiFactory(SupportedPlatform supportedPlatform){
        switch (supportedPlatform){
            case IOS : return new IOSFactory();
            case ANDROID:return new Androidfactory();
            case MAC : return new Macfactory();
        }
        return null;

    }
}
// UIFactory -> manufactures -> UI components -> button, menu, dropdown etc.
// UIFactoryFactory -> manufacture -> UIFactory -> IOSFactory, AndroidFactory, MacFactory etc.