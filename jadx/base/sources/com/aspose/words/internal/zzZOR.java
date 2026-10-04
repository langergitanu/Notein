package com.aspose.words.internal;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.network.embedded.C18293o1;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class zzZOR extends zzZOP {
    static final /* synthetic */ boolean zzVr = true;
    private byte[] zzZXA;
    private boolean zzZXu;
    private boolean zzZXv;
    private boolean zzZXw;
    private boolean zzZXx;
    private int zzZXy;
    private int zzZXz;
    private int zzc7;
    private int zzty;

    public zzZOR() {
        this(0);
    }

    private void zzQD(int i) throws IOException {
        if (!this.zzZXu) {
            zziz();
        }
        if (i != this.zzZXy) {
            if (!this.zzZXx) {
                throw new UnsupportedOperationException("This stream is not expandable.");
            }
            int i2 = this.zzc7;
            if (i < i2) {
                throw new IllegalArgumentException("capacity");
            }
            if (i > 0) {
                byte[] bArr = new byte[i];
                if (i2 > 0) {
                    System.arraycopy(this.zzZXA, 0, bArr, 0, i2);
                }
                this.zzZXA = bArr;
            } else {
                this.zzZXA = null;
            }
            this.zzZXy = i;
        }
    }

    private boolean zzQE(int i) throws IOException {
        if (i < 0) {
            throw new IllegalArgumentException("value");
        }
        int i2 = this.zzZXy;
        if (i <= i2) {
            return false;
        }
        if (i < 256) {
            i = 256;
        }
        if (i < (i2 << 1)) {
            i = i2 << 1;
        }
        zzQD(i);
        return true;
    }

    private static void zziy() {
        throw new UnsupportedOperationException("The stream does not support write operations.");
    }

    private static void zziz() throws IOException {
        throw new IOException("The stream is closed.");
    }

    @Override // com.aspose.words.internal.zzZOP
    public final boolean canRead() {
        return this.zzZXu;
    }

    @Override // com.aspose.words.internal.zzZOP
    public final boolean canWrite() {
        return this.zzZXw;
    }

    @Override // com.aspose.words.internal.zzZOP
    public void close() {
        this.zzZXu = false;
        this.zzZXw = false;
        this.zzZXx = false;
    }

    @Override // com.aspose.words.internal.zzZOP, com.aspose.words.internal.zzZOY
    public void dispose() {
        close();
    }

    @Override // com.aspose.words.internal.zzZOP
    public void flush() throws IOException {
    }

    @Override // com.aspose.words.internal.zzZOP
    public final long getLength() throws IOException {
        if (!this.zzZXu) {
            zziz();
        }
        return this.zzc7 - this.zzZXz;
    }

    @Override // com.aspose.words.internal.zzZOP
    public final long getPosition() throws IOException {
        if (!this.zzZXu) {
            zziz();
        }
        return this.zzty - this.zzZXz;
    }

    @Override // com.aspose.words.internal.zzZOP
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (!this.zzZXu) {
            zziz();
        }
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        if (i < 0) {
            throw new IllegalArgumentException("offset");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(C18293o1.f55803f);
        }
        if (bArr.length - i < i2) {
            throw new IllegalArgumentException("The buffer length minus index is less than count.");
        }
        int i3 = this.zzc7;
        int i4 = this.zzty;
        int i5 = i3 - i4;
        if (i5 <= i2) {
            i2 = i5;
        }
        if (i2 <= 0) {
            return 0;
        }
        if (!zzVr && i4 + i2 < 0) {
            throw new AssertionError("_position + n >= 0");
        }
        if (i2 <= 8) {
            int i6 = i2;
            while (true) {
                i6--;
                if (i6 < 0) {
                    break;
                }
                bArr[i + i6] = this.zzZXA[this.zzty + i6];
            }
        } else {
            System.arraycopy(this.zzZXA, i4, bArr, i, i2);
        }
        this.zzty += i2;
        return i2;
    }

    @Override // com.aspose.words.internal.zzZOP
    public final void setLength(long j) throws IOException {
        int i;
        if (!this.zzZXw) {
            zziy();
        }
        if (j > 2147483647L) {
            throw new IllegalArgumentException("value");
        }
        if (j >= 0) {
            int i2 = this.zzZXz;
            if (j <= Integer.MAX_VALUE - i2) {
                int i3 = i2 + ((int) j);
                if (!zzQE(i3) && i3 > (i = this.zzc7)) {
                    zzZKV.zzN(this.zzZXA, i, i3 - i);
                }
                this.zzc7 = i3;
                if (this.zzty > i3) {
                    this.zzty = i3;
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException("value");
    }

    public String toString() {
        return zzZKV.zzL(this.zzZXA, this.zzZXz, this.zzc7);
    }

    @Override // com.aspose.words.internal.zzZOP
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (!this.zzZXu) {
            zziz();
        }
        if (!this.zzZXw) {
            zziy();
        }
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        if (i < 0) {
            throw new IllegalArgumentException("offset");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(C18293o1.f55803f);
        }
        if (bArr.length - i < i2) {
            throw new IllegalArgumentException("Argument_InvalidOffLen");
        }
        int i3 = this.zzty;
        int i4 = i3 + i2;
        if (i4 < 0) {
            throw new IOException("StreamTooLong");
        }
        int i5 = this.zzc7;
        if (i4 > i5) {
            if ((i4 <= this.zzZXy || !zzQE(i4)) ? i3 > i5 : false) {
                byte[] bArr2 = this.zzZXA;
                int i6 = this.zzc7;
                zzZKV.zzN(bArr2, i6, i4 - i6);
            }
            this.zzc7 = i4;
        }
        if (i2 <= 8) {
            while (true) {
                i2--;
                if (i2 < 0) {
                    break;
                } else {
                    this.zzZXA[this.zzty + i2] = bArr[i + i2];
                }
            }
        } else {
            System.arraycopy(bArr, i, this.zzZXA, this.zzty, i2);
        }
        this.zzty = i4;
    }

    @Override // com.aspose.words.internal.zzZOP
    public final void writeByte(byte b) throws IOException {
        if (!this.zzZXu) {
            zziz();
        }
        if (!this.zzZXw) {
            zziy();
        }
        int i = this.zzty;
        int i2 = this.zzc7;
        if (i >= i2) {
            int i3 = i + 1;
            if ((i3 < this.zzZXy || !zzQE(i3)) ? i > i2 : false) {
                byte[] bArr = this.zzZXA;
                int i4 = this.zzc7;
                zzZKV.zzO(bArr, i4, this.zzty - i4);
            }
            this.zzc7 = i3;
        }
        byte[] bArr2 = this.zzZXA;
        int i5 = this.zzty;
        this.zzty = i5 + 1;
        bArr2[i5] = b;
    }

    @Override // com.aspose.words.internal.zzZOP
    public final void zzH(long j) throws IOException {
        if (!this.zzZXu) {
            zziz();
        }
        if (j < 0) {
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0O0(j, "length = "));
        }
        if (j > 2147483647L) {
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0O0(j, "length = "));
        }
        this.zzty = this.zzZXz + ((int) j);
    }

    @Override // com.aspose.words.internal.zzZOP
    public final boolean zzRG() {
        return this.zzZXu;
    }

    @Override // com.aspose.words.internal.zzZOP
    public final int zzRI() throws IOException {
        if (!this.zzZXu) {
            zziz();
        }
        int i = this.zzty;
        if (i >= this.zzc7) {
            return -1;
        }
        byte[] bArr = this.zzZXA;
        this.zzty = i + 1;
        return bArr[i] & 255;
    }

    @Override // com.aspose.words.internal.zzZOP
    public final long zzU(long j, int i) throws IOException {
        if (i == 0) {
            zzH(j);
        } else if (i == 1) {
            zzH(getPosition() + j);
        } else {
            if (i != 2) {
                throw new IllegalStateException("Unknown SeekOrigin type.");
            }
            zzH(getLength() + j);
        }
        if (zzVr || this.zzty >= 0) {
            return this.zzty;
        }
        throw new AssertionError();
    }

    public final byte[] zzWy() {
        int i = this.zzc7;
        int i2 = this.zzZXz;
        byte[] bArr = new byte[i - i2];
        System.arraycopy(this.zzZXA, i2, bArr, 0, i - i2);
        return bArr;
    }

    public final void zzZH(zzZOP zzzop) throws Exception {
        if (!this.zzZXu) {
            zziz();
        }
        if (zzzop == null) {
            throw new IllegalArgumentException("stream");
        }
        byte[] bArr = this.zzZXA;
        int i = this.zzZXz;
        zzzop.write(bArr, i, this.zzc7 - i);
    }

    public final byte[] zziA() {
        if (this.zzZXv) {
            return this.zzZXA;
        }
        throw new UnsupportedOperationException("UnauthorizedAccess_MemStreamBuffer");
    }

    public final void zziB() {
        this.zzZXu = true;
        this.zzZXw = true;
        this.zzZXx = true;
    }

    public zzZOR(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity");
        }
        this.zzZXA = new byte[i];
        this.zzZXy = i;
        this.zzZXx = true;
        this.zzZXw = true;
        this.zzZXv = true;
        this.zzZXz = 0;
        this.zzZXu = true;
    }

    public zzZOR(byte[] bArr) {
        this(bArr, true);
    }

    public zzZOR(byte[] bArr, boolean z) {
        if (bArr != null) {
            this.zzZXA = bArr;
            int length = bArr.length;
            this.zzZXy = length;
            this.zzc7 = length;
            this.zzZXw = z;
            this.zzZXv = false;
            this.zzZXz = 0;
            this.zzZXu = true;
            return;
        }
        throw new NullPointerException("buffer");
    }

    public zzZOR(byte[] bArr, int i, int i2) {
        this(bArr, i, i2, true, false);
    }

    public zzZOR(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        if (i < 0) {
            throw new IllegalArgumentException(FirebaseAnalytics.Param.INDEX);
        }
        if (i2 >= 0) {
            if (bArr.length - i >= i2) {
                this.zzZXA = bArr;
                this.zzty = i;
                this.zzZXz = i;
                int i3 = i + i2;
                this.zzZXy = i3;
                this.zzc7 = i3;
                this.zzZXw = z;
                this.zzZXv = z2;
                this.zzZXx = false;
                this.zzZXu = true;
                return;
            }
            throw new IllegalArgumentException("The buffer length minus index is less than count.");
        }
        throw new IllegalArgumentException(C18293o1.f55803f);
    }
}
