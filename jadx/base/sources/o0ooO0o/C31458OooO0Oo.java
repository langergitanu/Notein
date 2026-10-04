package o0ooO0o;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: o0ooO0o.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31458OooO0Oo extends InputStream implements InterfaceC31461OooO0oO {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final RandomAccessFile f112513OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final long f112514Oooo000;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f112506OooOo0o = 4096;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final long f112505OooOo = -4096;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final int f112508OooOoO0 = 1000;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public byte[] f112507OooOoO = null;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final OooO00o f112509OooOoOO = new OooO00o();

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public long f112511OooOoo0 = -1;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public byte[] f112510OooOoo = new byte[4096];

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f112512OooOooO = 0;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public long f112515Oooo00O = 0;

    /* JADX INFO: renamed from: o0ooO0o.OooO0Oo$OooO00o */
    public class OooO00o extends LinkedHashMap<Long, byte[]> {
        private static final long serialVersionUID = -6302488539257741101L;

        public OooO00o() {
            super(1000, 0.75f, true);
        }

        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<Long, byte[]> entry) {
            int size = size();
            C31458OooO0Oo c31458OooO0Oo = C31458OooO0Oo.this;
            boolean z = size > c31458OooO0Oo.f112508OooOoO0;
            if (z) {
                c31458OooO0Oo.f112507OooOoO = entry.getValue();
            }
            return z;
        }
    }

    public C31458OooO0Oo(File file) throws IOException {
        this.f112513OooOooo = new RandomAccessFile(file, "r");
        this.f112514Oooo000 = file.length();
        seek(0L);
    }

    @Override // o0ooO0o.InterfaceC31461OooO0oO
    public final byte[] OooO0oo(int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        do {
            int i3 = read(bArr, i2, i - i2);
            if (i3 < 0) {
                throw new EOFException();
            }
            i2 += i3;
        } while (i2 < i);
        return bArr;
    }

    @Override // o0ooO0o.InterfaceC31461OooO0oO
    public final boolean OooOOOo() throws IOException {
        return peek() == -1;
    }

    @Override // o0ooO0o.InterfaceC31461OooO0oO
    public final void Ooooo00(int i) throws IOException {
        seek(this.f112515Oooo00O - ((long) i));
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        return (int) Math.min(this.f112514Oooo000 - this.f112515Oooo00O, 2147483647L);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f112513OooOooo.close();
        this.f112509OooOoOO.clear();
    }

    @Override // o0ooO0o.InterfaceC31461OooO0oO
    public final long getPosition() {
        return this.f112515Oooo00O;
    }

    @Override // o0ooO0o.InterfaceC31461OooO0oO
    public final long length() throws IOException {
        return this.f112514Oooo000;
    }

    @Override // o0ooO0o.InterfaceC31461OooO0oO
    public final int peek() throws IOException {
        int i = read();
        if (i != -1) {
            Ooooo00(1);
        }
        return i;
    }

    @Override // java.io.InputStream, o0ooO0o.InterfaceC31461OooO0oO
    public final int read() throws IOException {
        long j = this.f112515Oooo00O;
        if (j >= this.f112514Oooo000) {
            return -1;
        }
        if (this.f112512OooOooO == this.f112506OooOo0o) {
            seek(j);
        }
        this.f112515Oooo00O++;
        byte[] bArr = this.f112510OooOoo;
        int i = this.f112512OooOooO;
        this.f112512OooOooO = i + 1;
        return bArr[i] & 255;
    }

    @Override // o0ooO0o.InterfaceC31461OooO0oO
    public final void seek(long j) throws IOException {
        long j2 = this.f112505OooOo & j;
        if (j2 != this.f112511OooOoo0) {
            Long lValueOf = Long.valueOf(j2);
            OooO00o oooO00o = this.f112509OooOoOO;
            byte[] bArr = oooO00o.get(lValueOf);
            if (bArr == null) {
                RandomAccessFile randomAccessFile = this.f112513OooOooo;
                randomAccessFile.seek(j2);
                byte[] bArr2 = this.f112507OooOoO;
                int i = this.f112506OooOo0o;
                if (bArr2 != null) {
                    this.f112507OooOoO = null;
                } else {
                    bArr2 = new byte[i];
                }
                int i2 = 0;
                while (i2 < i) {
                    int i3 = randomAccessFile.read(bArr2, i2, i - i2);
                    if (i3 < 0) {
                        break;
                    } else {
                        i2 += i3;
                    }
                }
                oooO00o.put(Long.valueOf(j2), bArr2);
                bArr = bArr2;
            }
            this.f112511OooOoo0 = j2;
            this.f112510OooOoo = bArr;
        }
        this.f112512OooOooO = (int) (j - this.f112511OooOoo0);
        this.f112515Oooo00O = j;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        long j2 = this.f112515Oooo00O;
        long j3 = this.f112514Oooo000;
        if (j3 - j2 < j) {
            j = j3 - j2;
        }
        int i = this.f112506OooOo0o;
        if (j < i) {
            int i2 = this.f112512OooOooO;
            if (((long) i2) + j <= i) {
                this.f112512OooOooO = (int) (((long) i2) + j);
                this.f112515Oooo00O = j2 + j;
                return j;
            }
        }
        seek(j2 + j);
        return j;
    }

    @Override // java.io.InputStream, o0ooO0o.InterfaceC31461OooO0oO
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream, o0ooO0o.InterfaceC31461OooO0oO
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.f112515Oooo00O;
        long j2 = this.f112514Oooo000;
        if (j >= j2) {
            return -1;
        }
        int i3 = this.f112512OooOooO;
        int i4 = this.f112506OooOo0o;
        if (i3 == i4) {
            seek(j);
        }
        int iMin = Math.min(i4 - this.f112512OooOooO, i2);
        long j3 = this.f112515Oooo00O;
        if (j2 - j3 < i4) {
            iMin = Math.min(iMin, (int) (j2 - j3));
        }
        System.arraycopy(this.f112510OooOoo, this.f112512OooOooO, bArr, i, iMin);
        this.f112512OooOooO += iMin;
        this.f112515Oooo00O += (long) iMin;
        return iMin;
    }
}
