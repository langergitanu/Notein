package oO0oO0Oo;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: oO0oO0Oo.OooooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34062OooooO0 extends InputStream {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f122415OooOo = true;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Oooo000 f122416OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public InputStream f122417OooOoO0;

    public C34062OooooO0(Oooo000 oooo000) {
        this.f122416OooOo0o = oooo000;
    }

    public final OooOo OooO00o() throws IOException {
        Oooo000 oooo000 = this.f122416OooOo0o;
        int i = oooo000.f122381OooO00o.read();
        InterfaceC34019OooO0oO interfaceC34019OooO0oOOooO00o = i < 0 ? null : oooo000.OooO00o(i);
        if (interfaceC34019OooO0oOOooO00o == null) {
            return null;
        }
        if (interfaceC34019OooO0oOOooO00o instanceof OooOo) {
            return (OooOo) interfaceC34019OooO0oOOooO00o;
        }
        throw new IOException("unknown object encountered: " + interfaceC34019OooO0oOOooO00o.getClass());
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        OooOo oooOoOooO00o;
        if (this.f122417OooOoO0 == null) {
            if (!this.f122415OooOo || (oooOoOooO00o = OooO00o()) == null) {
                return -1;
            }
            this.f122415OooOo = false;
            this.f122417OooOoO0 = oooOoOooO00o.OooO0Oo();
        }
        while (true) {
            int i = this.f122417OooOoO0.read();
            if (i >= 0) {
                return i;
            }
            OooOo oooOoOooO00o2 = OooO00o();
            if (oooOoOooO00o2 == null) {
                this.f122417OooOoO0 = null;
                return -1;
            }
            this.f122417OooOoO0 = oooOoOooO00o2.OooO0Oo();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        OooOo oooOoOooO00o;
        int i3 = 0;
        if (this.f122417OooOoO0 == null) {
            if (!this.f122415OooOo || (oooOoOooO00o = OooO00o()) == null) {
                return -1;
            }
            this.f122415OooOo = false;
            this.f122417OooOoO0 = oooOoOooO00o.OooO0Oo();
        }
        while (true) {
            int i4 = this.f122417OooOoO0.read(bArr, i + i3, i2 - i3);
            if (i4 >= 0) {
                i3 += i4;
                if (i3 == i2) {
                    return i3;
                }
            } else {
                OooOo oooOoOooO00o2 = OooO00o();
                if (oooOoOooO00o2 == null) {
                    this.f122417OooOoO0 = null;
                    if (i3 < 1) {
                        return -1;
                    }
                    return i3;
                }
                this.f122417OooOoO0 = oooOoOooO00o2.OooO0Oo();
            }
        }
    }
}
