package o0ooO00O;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: o0ooO00O.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31427OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public long f112199OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f112200OooO0O0 = 0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayList<byte[]> f112201OooO0OO = new ArrayList<>();

    public final int OooO00o(InputStream inputStream, int i) throws IOException {
        if (i <= 0) {
            return 0;
        }
        long j = this.f112199OooO00o;
        OooO0Oo((((long) i) + j) - 1);
        int i2 = (int) (j >> 9);
        int i3 = (int) (j & 511);
        int i4 = 0;
        while (i > 0) {
            byte[] bArr = this.f112201OooO0OO.get(i2);
            int iMin = Math.min(512 - i3, i);
            i -= iMin;
            i4 += iMin;
            while (iMin > 0) {
                int i5 = inputStream.read(bArr, i3, iMin);
                if (i5 < 0) {
                    this.f112199OooO00o -= (long) (i - i4);
                    return i4;
                }
                iMin -= i5;
                i3 += i5;
            }
            i2++;
            i3 = 0;
        }
        return i4;
    }

    public final int OooO0O0(long j) {
        if (j >= this.f112199OooO00o) {
            return -1;
        }
        return this.f112201OooO0OO.get((int) (j >> 9))[(int) (j & 511)] & 255;
    }

    public final int OooO0OO(long j, byte[] bArr, int i, int i2) {
        if (i2 > bArr.length - i || i2 < 0 || i < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        long j2 = this.f112199OooO00o;
        if (j >= j2) {
            return -1;
        }
        if (((long) i2) + j > j2) {
            i2 = (int) (j2 - j);
        }
        byte[] bArr2 = this.f112201OooO0OO.get((int) (j >> 9));
        int i3 = (int) (j & 511);
        int iMin = Math.min(i2, 512 - i3);
        System.arraycopy(bArr2, i3, bArr, i, iMin);
        return iMin;
    }

    public final void OooO0Oo(long j) {
        ArrayList<byte[]> arrayList = this.f112201OooO0OO;
        int size = (((int) (j >> 9)) - arrayList.size()) + 1;
        for (int i = 0; i < size; i++) {
            arrayList.add(new byte[512]);
        }
        this.f112199OooO00o = j + 1;
    }
}
