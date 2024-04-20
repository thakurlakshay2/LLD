package SOLIDprinciple.DependencyInversionPrinciple;

import javax.crypto.Mac;
import java.security.Key;

public class Mackbook {
    private final Mouse mouse;
    private final Keyboard     keyboard;

    //Here because we have already decided for a wired keyboard and mouse
    //we can't change to wireless... it would be better to user interface for keyboard and mouse
    public Mackbook() {
        this.mouse = new WiredMouse();
        this.keyboard =new WiredKeyboard();
    }

    //better approach
    public Mackbook(Mouse mouse, Keyboard keyboard){
        this.mouse=mouse;
        this.keyboard=keyboard;
    }
}
