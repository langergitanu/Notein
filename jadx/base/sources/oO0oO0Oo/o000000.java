package oO0oO0Oo;

import Oooo0oO.C21111o0ooOoO;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes10.dex */
public final class o000000 implements InterfaceC34016OooO0Oo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f122423OooOo = 0;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C34072o00000oO f122424OooOo0o;

    public o000000(C34072o00000oO c34072o00000oO) {
        this.f122424OooOo0o = c34072o00000oO;
    }

    @Override // oO0oO0Oo.InterfaceC34073o00000oo
    public final AbstractC34036OooOoOO OooO0O0() throws IOException {
        return AbstractC34015OooO0OO.OooOOo0(this.f122424OooOo0o.OooO0OO());
    }

    @Override // oO0oO0Oo.InterfaceC34016OooO0Oo
    public final InputStream OooO0OO() throws IOException {
        C34072o00000oO c34072o00000oO = this.f122424OooOo0o;
        int i = c34072o00000oO.f122432OooOoO;
        if (i < 1) {
            throw new IllegalStateException("content octets cannot be empty");
        }
        int i2 = c34072o00000oO.read();
        this.f122423OooOo = i2;
        if (i2 > 0) {
            if (i < 2) {
                throw new IllegalStateException("zero length data with non-zero pad bits");
            }
            if (i2 > 7) {
                throw new IllegalStateException("pad bits cannot be greater than 7 or less than 0");
            }
        }
        return c34072o00000oO;
    }

    @Override // oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        try {
            return OooO0O0();
        } catch (IOException e) {
            throw new C34034OooOoO(C21111o0ooOoO.OooO00o(e, new StringBuilder("IOException converting stream to byte array: ")), e);
        }
    }

    @Override // oO0oO0Oo.InterfaceC34016OooO0Oo
    public final int OooO0o0() {
        return this.f122423OooOo;
    }
}
