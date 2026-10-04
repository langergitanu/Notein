package com.huawei.hms.network.embedded;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.b */
/* JADX INFO: loaded from: classes9.dex */
public class C18109b implements Closeable {

    /* JADX INFO: renamed from: f */
    public static final byte f54229f = 13;

    /* JADX INFO: renamed from: g */
    public static final byte f54230g = 10;

    /* JADX INFO: renamed from: a */
    public final InputStream f54231a;

    /* JADX INFO: renamed from: b */
    public final Charset f54232b;

    /* JADX INFO: renamed from: c */
    public byte[] f54233c;

    /* JADX INFO: renamed from: d */
    public int f54234d;

    /* JADX INFO: renamed from: e */
    public int f54235e;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.b$a */
    public class a extends ByteArrayOutputStream {
        public a(int i) {
            super(i);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i = ((ByteArrayOutputStream) this).count;
            if (i > 0) {
                int i2 = i - 1;
                if (((ByteArrayOutputStream) this).buf[i2] == 13) {
                    i = i2;
                }
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i, C18109b.this.f54232b.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public C18109b(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(C18123c.f54348a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f54231a = inputStream;
        this.f54232b = charset;
        this.f54233c = new byte[i];
    }

    /* JADX INFO: renamed from: u */
    private void m77916u() throws IOException {
        InputStream inputStream = this.f54231a;
        byte[] bArr = this.f54233c;
        int i = inputStream.read(bArr, 0, bArr.length);
        if (i == -1) {
            throw new EOFException();
        }
        this.f54234d = 0;
        this.f54235e = i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.f54231a) {
            try {
                if (this.f54233c != null) {
                    this.f54233c = null;
                    this.f54231a.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public boolean m77917s() {
        return this.f54235e == -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String m77918t() throws IOException {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.f54231a) {
            try {
                if (this.f54233c == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f54234d >= this.f54235e) {
                    m77916u();
                }
                for (int i3 = this.f54234d; i3 != this.f54235e; i3++) {
                    byte[] bArr2 = this.f54233c;
                    if (bArr2[i3] == 10) {
                        int i4 = this.f54234d;
                        if (i3 != i4) {
                            i2 = i3 - 1;
                            if (bArr2[i2] != 13) {
                                i2 = i3;
                            }
                        }
                        String str = new String(bArr2, i4, i2 - i4, this.f54232b.name());
                        this.f54234d = i3 + 1;
                        return str;
                    }
                }
                a aVar = new a((this.f54235e - this.f54234d) + 80);
                loop1: while (true) {
                    byte[] bArr3 = this.f54233c;
                    int i5 = this.f54234d;
                    aVar.write(bArr3, i5, this.f54235e - i5);
                    this.f54235e = -1;
                    m77916u();
                    i = this.f54234d;
                    while (i != this.f54235e) {
                        bArr = this.f54233c;
                        if (bArr[i] == 10) {
                            break loop1;
                        }
                        i++;
                    }
                }
                int i6 = this.f54234d;
                if (i != i6) {
                    aVar.write(bArr, i6, i - i6);
                }
                this.f54234d = i + 1;
                return aVar.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C18109b(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }
}
