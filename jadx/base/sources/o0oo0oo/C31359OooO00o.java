package o0oo0oo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: renamed from: o0oo0oo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31359OooO00o extends RandomAccessFile {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f111968OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final byte[] f111969OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public long f111970OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f111971OooOoO0;

    public C31359OooO00o(File file) throws FileNotFoundException {
        super(file, "r");
        this.f111968OooOo = 0;
        this.f111971OooOoO0 = 0;
        this.f111970OooOoO = 0L;
        this.f111969OooOo0o = new byte[16384];
    }

    @Override // java.io.RandomAccessFile
    public final long getFilePointer() throws IOException {
        return (this.f111970OooOoO - ((long) this.f111968OooOo)) + ((long) this.f111971OooOoO0);
    }

    @Override // java.io.RandomAccessFile
    public final int read() throws IOException {
        int i = this.f111971OooOoO0;
        int i2 = this.f111968OooOo;
        byte[] bArr = this.f111969OooOo0o;
        if (i >= i2) {
            int i3 = read(bArr);
            if (i3 >= 0) {
                this.f111970OooOoO += (long) i3;
                this.f111968OooOo = i3;
                this.f111971OooOoO0 = 0;
            }
            if (i3 < 0) {
                return -1;
            }
        }
        if (this.f111968OooOo == 0) {
            return -1;
        }
        int i4 = this.f111971OooOoO0;
        this.f111971OooOoO0 = i4 + 1;
        return (bArr[i4] + 256) & 255;
    }

    @Override // java.io.RandomAccessFile
    public final void seek(long j) throws IOException {
        int i;
        int i2 = (int) (this.f111970OooOoO - j);
        if (i2 >= 0 && i2 <= (i = this.f111968OooOo)) {
            this.f111971OooOoO0 = i - i2;
            return;
        }
        super.seek(j);
        this.f111968OooOo = 0;
        this.f111971OooOoO0 = 0;
        this.f111970OooOoO = super.getFilePointer();
    }

    @Override // java.io.RandomAccessFile
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (true) {
            int i4 = this.f111968OooOo;
            int i5 = this.f111971OooOoO0;
            int i6 = i4 - i5;
            byte[] bArr2 = this.f111969OooOo0o;
            if (i2 <= i6) {
                System.arraycopy(bArr2, i5, bArr, i, i2);
                this.f111971OooOoO0 += i2;
                return i3 + i2;
            }
            System.arraycopy(bArr2, i5, bArr, i, i6);
            i3 += i6;
            this.f111971OooOoO0 += i6;
            int i7 = read(bArr2);
            if (i7 >= 0) {
                this.f111970OooOoO += (long) i7;
                this.f111968OooOo = i7;
                this.f111971OooOoO0 = 0;
            }
            if (i7 <= 0) {
                if (i3 == 0) {
                    return -1;
                }
                return i3;
            }
            i += i6;
            i2 -= i6;
        }
    }
}
