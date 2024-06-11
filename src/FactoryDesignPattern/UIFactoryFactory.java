package FactoryDesignPattern;

public class UIFactoryFactory {
    public static UIFactory getUIFactory(SupportedPlatforms supportedPlatforms) {
//        if(supportedPlatforms == SupportedPlatforms.ANDROID) {
//            return new AndroidUIFactory();
//        } else if(supportedPlatforms == SupportedPlatforms.IOS) {
//            return new IOSUIFactory();
//        }
//
//        return null;
//    }

        return switch (supportedPlatforms) {
            case IOS -> new IOSUIFactory();
            case ANDROID -> new AndroidUIFactory();
//            case WINDOWS -> new WindowsUIFactory();
//            case MAC-> new WindowsUIFactory();
        };
    }
}
