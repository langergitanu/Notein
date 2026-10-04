package oO0oO0Oo;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: oO0oO0Oo.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C34035OooOoO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ByteArrayOutputStream f122364OooO00o;

    public C34035OooOoO0(ByteArrayOutputStream byteArrayOutputStream) {
        this.f122364OooO00o = byteArrayOutputStream;
    }

    public static int OooO0OO(int i) {
        if (i < 128) {
            return 1;
        }
        int i2 = 2;
        while (true) {
            i >>>= 8;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    public static int OooO0Oo(int i, boolean z) {
        return OooO0OO(i) + (z ? 1 : 0) + i;
    }

    public static int OooO0o0(int i) {
        if (i < 31) {
            return 1;
        }
        int i2 = 2;
        while (true) {
            i >>>= 7;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    public void OooO(InterfaceC34019OooO0oO[] interfaceC34019OooO0oOArr) throws IOException {
        for (InterfaceC34019OooO0oO interfaceC34019OooO0oO : interfaceC34019OooO0oOArr) {
            interfaceC34019OooO0oO.OooO0o().OooO(this, true);
        }
    }

    public oo000o OooO00o() {
        return new oo000o(this.f122364OooO00o);
    }

    public o00000 OooO0O0() {
        return new o00000(this.f122364OooO00o);
    }

    public final void OooO0o(int i) throws IOException {
        this.f122364OooO00o.write(i);
    }

    public final void OooO0oO(byte[] bArr, int i, int i2) throws IOException {
        this.f122364OooO00o.write(bArr, i, i2);
    }

    public final void OooO0oo(int i) throws IOException {
        if (i < 128) {
            OooO0o(i);
            return;
        }
        int i2 = 5;
        byte[] bArr = new byte[5];
        while (true) {
            int i3 = i2 - 1;
            bArr[i3] = (byte) i;
            i >>>= 8;
            if (i == 0) {
                int i4 = i2 - 2;
                bArr[i4] = (byte) ((5 - i3) | 128);
                OooO0oO(bArr, i4, 6 - i3);
                return;
            }
            i2 = i3;
        }
    }

    public final void OooOO0(int i, byte[] bArr, boolean z) throws IOException {
        OooOOO0(i, z);
        OooO0oo(bArr.length);
        OooO0oO(bArr, 0, bArr.length);
    }

    public final void OooOO0O(boolean z, int i, InterfaceC34019OooO0oO[] interfaceC34019OooO0oOArr) throws IOException {
        OooOOO0(i, z);
        OooO0o(128);
        OooO(interfaceC34019OooO0oOArr);
        OooO0o(0);
        OooO0o(0);
    }

    public final void OooOO0o(int i, int i2) throws IOException {
        if (i2 < 31) {
            OooO0o(i | i2);
            return;
        }
        byte[] bArr = new byte[6];
        int i3 = 5;
        bArr[5] = (byte) (i2 & 127);
        while (i2 > 127) {
            i2 >>>= 7;
            i3--;
            bArr[i3] = (byte) ((i2 & 127) | 128);
        }
        int i4 = i3 - 1;
        bArr[i4] = (byte) (i | 31);
        OooO0oO(bArr, i4, 6 - i4);
    }

    public void OooOOO(AbstractC34036OooOoOO[] abstractC34036OooOoOOArr) throws IOException {
        for (AbstractC34036OooOoOO abstractC34036OooOoOO : abstractC34036OooOoOOArr) {
            abstractC34036OooOoOO.OooO(this, true);
        }
    }

    public final void OooOOO0(int i, boolean z) throws IOException {
        if (z) {
            OooO0o(i);
        }
    }
}
