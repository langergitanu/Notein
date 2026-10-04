package o00Ooo00;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: o00Ooo00.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25103OooO0O0 implements Closeable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Charset f85282OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final FileInputStream f85283OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f85284OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public byte[] f85285OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f85286OooOoOO;

    /* JADX INFO: renamed from: o00Ooo00.OooO0O0$OooO00o */
    public class OooO00o extends ByteArrayOutputStream {
        public OooO00o(int i) {
            super(i);
        }

        @Override // java.io.ByteArrayOutputStream
        public final String toString() {
            int i = ((ByteArrayOutputStream) this).count;
            if (i > 0 && ((ByteArrayOutputStream) this).buf[i - 1] == 13) {
                i--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i, C25103OooO0O0.this.f85282OooOo.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public C25103OooO0O0(FileInputStream fileInputStream, Charset charset) {
        if (charset == null) {
            throw null;
        }
        if (!charset.equals(OooO0OO.f85288OooO00o)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f85283OooOo0o = fileInputStream;
        this.f85282OooOo = charset;
        this.f85285OooOoO0 = new byte[8192];
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String OooO00o() throws IOException {
        int i;
        synchronized (this.f85283OooOo0o) {
            try {
                byte[] bArr = this.f85285OooOoO0;
                if (bArr == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f85284OooOoO >= this.f85286OooOoOO) {
                    int i2 = this.f85283OooOo0o.read(bArr, 0, bArr.length);
                    if (i2 == -1) {
                        throw new EOFException();
                    }
                    this.f85284OooOoO = 0;
                    this.f85286OooOoOO = i2;
                }
                for (int i3 = this.f85284OooOoO; i3 != this.f85286OooOoOO; i3++) {
                    byte[] bArr2 = this.f85285OooOoO0;
                    if (bArr2[i3] == 10) {
                        int i4 = this.f85284OooOoO;
                        if (i3 != i4) {
                            i = i3 - 1;
                            if (bArr2[i] != 13) {
                                i = i3;
                            }
                        }
                        String str = new String(bArr2, i4, i - i4, this.f85282OooOo.name());
                        this.f85284OooOoO = i3 + 1;
                        return str;
                    }
                }
                OooO00o oooO00o = new OooO00o((this.f85286OooOoOO - this.f85284OooOoO) + 80);
                while (true) {
                    byte[] bArr3 = this.f85285OooOoO0;
                    int i5 = this.f85284OooOoO;
                    oooO00o.write(bArr3, i5, this.f85286OooOoOO - i5);
                    this.f85286OooOoOO = -1;
                    byte[] bArr4 = this.f85285OooOoO0;
                    int i6 = this.f85283OooOo0o.read(bArr4, 0, bArr4.length);
                    if (i6 == -1) {
                        throw new EOFException();
                    }
                    this.f85284OooOoO = 0;
                    this.f85286OooOoOO = i6;
                    for (int i7 = 0; i7 != this.f85286OooOoOO; i7++) {
                        byte[] bArr5 = this.f85285OooOoO0;
                        if (bArr5[i7] == 10) {
                            int i8 = this.f85284OooOoO;
                            if (i7 != i8) {
                                oooO00o.write(bArr5, i8, i7 - i8);
                            }
                            this.f85284OooOoO = i7 + 1;
                            return oooO00o.toString();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this.f85283OooOo0o) {
            try {
                if (this.f85285OooOoO0 != null) {
                    this.f85285OooOoO0 = null;
                    this.f85283OooOo0o.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
