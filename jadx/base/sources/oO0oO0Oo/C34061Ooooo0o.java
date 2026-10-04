package oO0oO0Oo;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: oO0oO0Oo.Ooooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34061Ooooo0o extends InputStream {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Oooo000 f122411OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public InterfaceC34016OooO0Oo f122412OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public InputStream f122414OooOoOO;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f122410OooOo = true;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f122413OooOoO0 = 0;

    public C34061Ooooo0o(Oooo000 oooo000) {
        this.f122411OooOo0o = oooo000;
    }

    public final InterfaceC34016OooO0Oo OooO00o() throws IOException {
        Oooo000 oooo000 = this.f122411OooOo0o;
        int i = oooo000.f122381OooO00o.read();
        InterfaceC34019OooO0oO interfaceC34019OooO0oOOooO00o = i < 0 ? null : oooo000.OooO00o(i);
        if (interfaceC34019OooO0oOOooO00o == null) {
            return null;
        }
        if (interfaceC34019OooO0oOOooO00o instanceof InterfaceC34016OooO0Oo) {
            if (this.f122413OooOoO0 == 0) {
                return (InterfaceC34016OooO0Oo) interfaceC34019OooO0oOOooO00o;
            }
            throw new IOException("only the last nested bitstring can have padding");
        }
        throw new IOException("unknown object encountered: " + interfaceC34019OooO0oOOooO00o.getClass());
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f122414OooOoOO == null) {
            if (this.f122410OooOo) {
                InterfaceC34016OooO0Oo interfaceC34016OooO0OoOooO00o = OooO00o();
                this.f122412OooOoO = interfaceC34016OooO0OoOooO00o;
                if (interfaceC34016OooO0OoOooO00o != null) {
                    this.f122410OooOo = false;
                    this.f122414OooOoOO = interfaceC34016OooO0OoOooO00o.OooO0OO();
                }
            }
            return -1;
        }
        while (true) {
            int i = this.f122414OooOoOO.read();
            if (i >= 0) {
                return i;
            }
            this.f122413OooOoO0 = this.f122412OooOoO.OooO0o0();
            InterfaceC34016OooO0Oo interfaceC34016OooO0OoOooO00o2 = OooO00o();
            this.f122412OooOoO = interfaceC34016OooO0OoOooO00o2;
            if (interfaceC34016OooO0OoOooO00o2 == null) {
                this.f122414OooOoOO = null;
                return -1;
            }
            this.f122414OooOoOO = interfaceC34016OooO0OoOooO00o2.OooO0OO();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        if (this.f122414OooOoOO == null) {
            if (!this.f122410OooOo) {
                return -1;
            }
            InterfaceC34016OooO0Oo interfaceC34016OooO0OoOooO00o = OooO00o();
            this.f122412OooOoO = interfaceC34016OooO0OoOooO00o;
            if (interfaceC34016OooO0OoOooO00o == null) {
                return -1;
            }
            this.f122410OooOo = false;
            this.f122414OooOoOO = interfaceC34016OooO0OoOooO00o.OooO0OO();
        }
        while (true) {
            int i4 = this.f122414OooOoOO.read(bArr, i + i3, i2 - i3);
            if (i4 >= 0) {
                i3 += i4;
                if (i3 == i2) {
                    return i3;
                }
            } else {
                this.f122413OooOoO0 = this.f122412OooOoO.OooO0o0();
                InterfaceC34016OooO0Oo interfaceC34016OooO0OoOooO00o2 = OooO00o();
                this.f122412OooOoO = interfaceC34016OooO0OoOooO00o2;
                if (interfaceC34016OooO0OoOooO00o2 == null) {
                    this.f122414OooOoOO = null;
                    if (i3 < 1) {
                        return -1;
                    }
                    return i3;
                }
                this.f122414OooOoOO = interfaceC34016OooO0OoOooO00o2.OooO0OO();
            }
        }
    }
}
