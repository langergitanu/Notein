package o0ooOO0;

import oo0o0Oo.C34680OooO0O0;

/* JADX INFO: renamed from: o0ooOO0.OooooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC31551OooooOo {
    void OooO00o(C34680OooO0O0 c34680OooO0O0);

    C34680OooO0O0 getText();

    default boolean hasText() {
        C34680OooO0O0 text = getText();
        return text != null && text.length() > 0;
    }
}
