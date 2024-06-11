package FactoryDesignPattern;

public class Flutter {
    private SupportedPlatforms supportedPlatforms;
    public Flutter(SupportedPlatforms supportedPlatforms) {
        this.supportedPlatforms = supportedPlatforms;
    }

    public void setRefreshRate() {
        System.out.println("Setting refresh rate");
    }


//   public UIFactory createFactory() {
//        if (supportedPlatforms == SupportedPlatforms.ANDROID) {
//            return new AndroidUIFactory();
//        } else if (supportedPlatforms == SupportedPlatforms.IOS) {
//            return new IOSUIFactory();
//        }
//    }


   public UIFactory createFactory(){
        return UIFactoryFactory.getUIFactory(supportedPlatforms);
    }



//    public UIFactory createFactory() {
//        return UIFactoryFactory.getUIFactory(supportedPlatforms);
//    }
}