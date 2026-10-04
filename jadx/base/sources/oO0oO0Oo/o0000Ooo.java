package oO0oO0Oo;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class o0000Ooo extends C34060Ooooo00 {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final boolean f122437OooOoO;

    public o0000Ooo(int i, int i2, boolean z, Oooo000 oooo000) {
        super(i, i2, oooo000);
        this.f122437OooOoO = z;
    }

    @Override // oO0oO0Oo.C34060Ooooo00, oO0oO0Oo.InterfaceC34073o00000oo
    public final AbstractC34036OooOoOO OooO0O0() throws IOException {
        Oooo000 oooo000 = this.f122409OooOoO0;
        int i = this.f122407OooOo;
        boolean z = this.f122437OooOoO;
        int i2 = this.f122408OooOo0o;
        if (z) {
            return Oooo0.OooOOo0(i2, i, oooo000.OooO0OO());
        }
        C34071o00000o0 c34071o00000o0 = new C34071o00000o0(4, i2, i, new C34075o00o0O(((C34072o00000oO) oooo000.f122381OooO00o).OooO0OO()));
        return i2 != 64 ? c34071o00000o0 : new o0O0O00(c34071o00000o0);
    }
}
