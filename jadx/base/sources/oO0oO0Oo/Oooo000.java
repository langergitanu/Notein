package oO0oO0Oo;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class Oooo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0000oO f122381OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f122382OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final byte[][] f122383OooO0OO;

    public Oooo000(o0000oO o0000oo2, int i, byte[][] bArr) {
        this.f122381OooO00o = o0000oo2;
        this.f122382OooO0O0 = i;
        this.f122383OooO0OO = bArr;
    }

    public final InterfaceC34019OooO0oO OooO00o(int i) throws IOException {
        Object o0o0o00;
        o0000oO o0000oo2 = this.f122381OooO00o;
        if (o0000oo2 instanceof o0000) {
            o0000 o0000Var = (o0000) o0000oo2;
            o0000Var.f122422OooOoo0 = false;
            o0000Var.OooO0OO();
        }
        int iOooOooo = C34027OooOOOo.OooOooo(o0000oo2, i);
        boolean z = iOooOooo == 3 || iOooOooo == 4 || iOooOooo == 16 || iOooOooo == 17 || iOooOooo == 8;
        int i2 = this.f122382OooO0O0;
        int iOooOOo0 = C34027OooOOOo.OooOOo0(o0000oo2, i2, z);
        byte[][] bArr = this.f122383OooO0OO;
        if (iOooOOo0 < 0) {
            if ((i & 32) == 0) {
                throw new IOException("indefinite-length primitive encoding encountered");
            }
            Oooo000 oooo000 = new Oooo000(new o0000(o0000oo2, i2), i2, bArr);
            int i3 = i & 192;
            if (i3 != 0) {
                return 64 == i3 ? new C34052OoooO00(64, iOooOooo, oooo000) : new C34060Ooooo00(i3, iOooOooo, oooo000);
            }
            if (iOooOooo == 3) {
                return new C34053OoooO0O(oooo000);
            }
            if (iOooOooo == 4) {
                return new o000oOoO(oooo000);
            }
            if (iOooOooo == 8) {
                return new C34067OoooooO(oooo000);
            }
            if (iOooOooo == 16) {
                C34056OoooOOo c34056OoooOOo = new C34056OoooOOo();
                c34056OoooOOo.f122405OooOo0o = oooo000;
                return c34056OoooOOo;
            }
            if (iOooOooo != 17) {
                throw new C34021OooOO0(androidx.core.graphics.OooO0O0.OooO00o(iOooOooo, new StringBuilder("unknown BER object encountered: 0x")));
            }
            C34058OoooOoO c34058OoooOoO = new C34058OoooOoO();
            c34058OoooOoO.f122406OooOo0o = oooo000;
            return c34058OoooOoO;
        }
        C34072o00000oO c34072o00000oO = new C34072o00000oO(o0000oo2, iOooOOo0, i2);
        if ((i & 224) == 0) {
            if (iOooOooo == 3) {
                return new o000000(c34072o00000oO);
            }
            if (iOooOooo == 4) {
                C34077o00ooo c34077o00ooo = new C34077o00ooo();
                c34077o00ooo.f122445OooOo0o = c34072o00000oO;
                return c34077o00ooo;
            }
            if (iOooOooo == 8) {
                throw new C34021OooOO0("externals must use constructed encoding (see X.690 8.18)");
            }
            if (iOooOooo == 16) {
                throw new C34021OooOO0("sets must use constructed encoding (see X.690 8.11.1/8.12.1)");
            }
            if (iOooOooo == 17) {
                throw new C34021OooOO0("sequences must use constructed encoding (see X.690 8.9.1/8.10.1)");
            }
            try {
                return C34027OooOOOo.OooO0OO(iOooOooo, c34072o00000oO, bArr);
            } catch (IllegalArgumentException e) {
                throw new C34021OooOO0("corrupted stream detected", e);
            }
        }
        Oooo000 oooo0002 = new Oooo000(c34072o00000oO, c34072o00000oO.f122438OooOo, bArr);
        int i4 = i & 192;
        if (i4 != 0) {
            boolean z2 = (i & 32) != 0;
            if (64 != i4) {
                return new o0000Ooo(i4, iOooOooo, z2, oooo0002);
            }
            if (z2) {
                o0o0o00 = Oooo0.OooOOo0(i4, iOooOooo, oooo0002.OooO0OO());
            } else {
                C34071o00000o0 c34071o00000o0 = new C34071o00000o0(4, i4, iOooOooo, new C34075o00o0O(c34072o00000oO.OooO0OO()));
                o0o0o00 = c34071o00000o0;
                if (i4 == 64) {
                    o0o0o00 = new o0O0O00(c34071o00000o0);
                }
            }
            return (o0O0O00) o0o0o00;
        }
        if (iOooOooo == 3) {
            return new C34053OoooO0O(oooo0002);
        }
        if (iOooOooo == 4) {
            return new o000oOoO(oooo0002);
        }
        if (iOooOooo == 8) {
            return new C34067OoooooO(oooo0002);
        }
        if (iOooOooo == 16) {
            o00000O o00000o = new o00000O();
            o00000o.f122427OooOo0o = oooo0002;
            return o00000o;
        }
        if (iOooOooo != 17) {
            throw new C34021OooOO0(androidx.core.graphics.OooO0O0.OooO00o(iOooOooo, new StringBuilder("unknown DL object encountered: 0x")));
        }
        C34070o00000Oo c34070o00000Oo = new C34070o00000Oo();
        c34070o00000Oo.f122430OooOo0o = oooo0002;
        return c34070o00000Oo;
    }

    public final AbstractC34036OooOoOO OooO0O0(int i, int i2) throws IOException {
        C34059OoooOoo c34059OoooOoo;
        C34020OooO0oo c34020OooO0ooOooO0OO = OooO0OO();
        int i3 = c34020OooO0ooOooO0OO.f122326OooO0O0;
        if (i3 == 1) {
            c34059OoooOoo = new C34059OoooOoo(3, i, i2, c34020OooO0ooOooO0OO.OooO0O0(0));
        } else {
            C34055OoooOOO c34055OoooOOO = C34050OoooO.f122398OooO00o;
            c34059OoooOoo = new C34059OoooOoo(4, i, i2, i3 < 1 ? C34050OoooO.f122398OooO00o : new C34055OoooOOO(c34020OooO0ooOooO0OO));
        }
        return i != 64 ? c34059OoooOoo : new C34041Oooo(c34059OoooOoo);
    }

    public final C34020OooO0oo OooO0OO() throws IOException {
        o0000oO o0000oo2 = this.f122381OooO00o;
        int i = o0000oo2.read();
        if (i < 0) {
            return new C34020OooO0oo(0);
        }
        C34020OooO0oo c34020OooO0oo = new C34020OooO0oo();
        do {
            InterfaceC34019OooO0oO interfaceC34019OooO0oOOooO00o = OooO00o(i);
            c34020OooO0oo.OooO00o(interfaceC34019OooO0oOOooO00o instanceof InterfaceC34073o00000oo ? ((InterfaceC34073o00000oo) interfaceC34019OooO0oOOooO00o).OooO0O0() : interfaceC34019OooO0oOOooO00o.OooO0o());
            i = o0000oo2.read();
        } while (i >= 0);
        return c34020OooO0oo;
    }
}
