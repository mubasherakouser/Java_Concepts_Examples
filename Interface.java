//Interface ----> Pure Abstraction
interface Translator {
    void translate();
}

class EnglishTranslator implements Translator {
    @Override
    public void translate() {
        System.out.println("English");
    }
}

class KannadaTranslator implements Translator {
    @Override
    public void translate() {
        System.out.println("Kannada");
    }
}

class HindiTranslator implements Translator {
    @Override
    public void translate() {
        System.out.println("Hindi");
    }
}

class UrduTranslator implements Translator {
    @Override
    public void translate() {
        System.out.println("Urdu");
    }
}

class TranslationEngine {
    static void translateTo(Translator t1, Translator t2) {
        t1.translate();
        System.out.println("to");
        t2.translate();
    }
}
public class Mainclass {
    public static void main(String[] args) {
        EnglishTranslator et = new EnglishTranslator();
        KannadaTranslator kt = new KannadaTranslator();
        HindiTranslator ht = new HindiTranslator();
        UrduTranslator ut = new UrduTranslator();
        TranslationEngine.translateTo(ht, kt);
        TranslationEngine.translateTo(et, ut);
        TranslationEngine.translateTo(kt, et);
    }
}
