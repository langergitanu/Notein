package o0ooo000;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: o0ooo000.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31735OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int[] f113361OooO00o = new int[256];

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f113362OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f113363OooO0OO;

    public final void OooO00o(byte[] bArr) {
        int[] iArr;
        this.f113362OooO0O0 = 0;
        this.f113363OooO0OO = 0;
        if (bArr.length < 1 || bArr.length > 32) {
            throw new IllegalArgumentException("number of bytes must be between 1 and 32");
        }
        int i = 0;
        while (true) {
            iArr = this.f113361OooO00o;
            if (i >= iArr.length) {
                break;
            }
            iArr[i] = i;
            i++;
        }
        int length = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            int i4 = bArr[length];
            if (i4 < 0) {
                i4 += 256;
            }
            int i5 = iArr[i3];
            i2 = ((i4 + i5) + i2) % 256;
            iArr[i3] = iArr[i2];
            iArr[i2] = i5;
            length = (length + 1) % bArr.length;
        }
    }

    public final void OooO0O0(byte b, OutputStream outputStream) throws IOException {
        int i = (this.f113362OooO0O0 + 1) % 256;
        this.f113362OooO0O0 = i;
        int[] iArr = this.f113361OooO00o;
        int i2 = iArr[i];
        int i3 = (this.f113363OooO0OO + i2) % 256;
        this.f113363OooO0OO = i3;
        iArr[i] = iArr[i3];
        iArr[i3] = i2;
        outputStream.write(b ^ ((byte) iArr[(iArr[i] + i2) % 256]));
    }
}
