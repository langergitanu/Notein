package oO0oOoo0;

import com.google.common.primitives.UnsignedBytes;
import oO0oOoOo.InterfaceC34201OooO0Oo;

/* JADX INFO: renamed from: oO0oOoo0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC34208OooO00o implements InterfaceC34201OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f122866OooO00o = new byte[4];

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f122867OooO0O0 = 0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public long f122868OooO0OO;

    public final void OooO0Oo() {
        long j = this.f122868OooO0OO << 3;
        byte b = UnsignedBytes.MAX_POWER_OF_TWO;
        while (true) {
            update(b);
            if (this.f122867OooO0O0 == 0) {
                OooO0o(j);
                OooO0o0();
                return;
            }
            b = 0;
        }
    }

    public abstract void OooO0o(long j);

    public abstract void OooO0o0();

    public abstract void OooO0oO(int i, byte[] bArr);

    public void OooO0oo() {
        this.f122868OooO0OO = 0L;
        this.f122867OooO0O0 = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.f122866OooO00o;
            if (i >= bArr.length) {
                return;
            }
            bArr[i] = 0;
            i++;
        }
    }

    @Override // oO0oOoOo.InterfaceC34201OooO0Oo
    public final void update(byte b) {
        int i = this.f122867OooO0O0;
        int i2 = i + 1;
        this.f122867OooO0O0 = i2;
        byte[] bArr = this.f122866OooO00o;
        bArr[i] = b;
        if (i2 == bArr.length) {
            OooO0oO(0, bArr);
            this.f122867OooO0O0 = 0;
        }
        this.f122868OooO0OO++;
    }

    @Override // oO0oOoOo.InterfaceC34201OooO0Oo
    public final void update(byte[] bArr, int i, int i2) {
        int i3 = 0;
        int iMax = Math.max(0, i2);
        int i4 = this.f122867OooO0O0;
        byte[] bArr2 = this.f122866OooO00o;
        if (i4 != 0) {
            int i5 = 0;
            while (true) {
                if (i5 >= iMax) {
                    i3 = i5;
                    break;
                }
                int i6 = this.f122867OooO0O0;
                int i7 = i6 + 1;
                this.f122867OooO0O0 = i7;
                int i8 = i5 + 1;
                bArr2[i6] = bArr[i5 + i];
                if (i7 == 4) {
                    OooO0oO(0, bArr2);
                    this.f122867OooO0O0 = 0;
                    i3 = i8;
                    break;
                }
                i5 = i8;
            }
        }
        int i9 = ((iMax - i3) & (-4)) + i3;
        while (i3 < i9) {
            OooO0oO(i + i3, bArr);
            i3 += 4;
        }
        while (i3 < iMax) {
            int i10 = this.f122867OooO0O0;
            this.f122867OooO0O0 = i10 + 1;
            bArr2[i10] = bArr[i3 + i];
            i3++;
        }
        this.f122868OooO0OO += (long) iMax;
    }
}
