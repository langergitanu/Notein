package o0oo0oo;

import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: o0oo0oo.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31391OooOoo0 extends C31398Oooo0OO {
    @Override // o0oo0oo.C31398Oooo0OO
    public final C31401Oooo0oO OooO00o(AbstractC31397Oooo0O0 abstractC31397Oooo0O0) {
        return new C31392OooOooO(abstractC31397Oooo0O0);
    }

    @Override // o0oo0oo.C31398Oooo0OO
    public final C31401Oooo0oO OooO0O0(File file) throws IOException {
        throw null;
    }

    @Override // o0oo0oo.C31398Oooo0OO
    public final C31401Oooo0oO OooO0OO(AbstractC31397Oooo0O0 abstractC31397Oooo0O0) throws IOException {
        return (C31392OooOooO) super.OooO0OO(abstractC31397Oooo0O0);
    }

    @Override // o0oo0oo.C31398Oooo0OO
    public final C31400Oooo0o0 OooO0Oo(C31401Oooo0oO c31401Oooo0oO, String str) {
        return (str.equals("BASE") || str.equals("GDEF") || str.equals("GPOS") || str.equals("GSUB") || str.equals("JSTF")) ? new C31390OooOoo(c31401Oooo0oO) : str.equals("CFF ") ? new C31360OooO0O0(c31401Oooo0oO) : new C31400Oooo0o0(c31401Oooo0oO);
    }

    public final C31392OooOooO OooO0o0(File file) throws IOException {
        return (C31392OooOooO) super.OooO0O0(file);
    }
}
