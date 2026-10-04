package com.huawei.hms.network.embedded;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.j4 */
/* JADX INFO: loaded from: classes9.dex */
public class C18226j4 extends InputStream {

    /* JADX INFO: renamed from: e */
    public static final int f55334e = 32768;

    /* JADX INFO: renamed from: a */
    public final C18282n4 f55335a;

    /* JADX INFO: renamed from: b */
    public boolean f55336b;

    /* JADX INFO: renamed from: c */
    public ByteBuffer f55337c;

    /* JADX INFO: renamed from: d */
    public IOException f55338d;

    public C18226j4(C18282n4 c18282n4) {
        this.f55335a = c18282n4;
    }

    /* JADX INFO: renamed from: s */
    private void m78878s() throws IOException {
        if (this.f55336b) {
            IOException iOException = this.f55338d;
            if (iOException != null) {
                throw iOException;
            }
        } else {
            if (m78879t()) {
                return;
            }
            if (this.f55337c == null) {
                this.f55337c = ByteBuffer.allocateDirect(32768);
            }
            this.f55337c.clear();
            this.f55335a.m79252a(this.f55337c);
            IOException iOException2 = this.f55338d;
            if (iOException2 != null) {
                throw iOException2;
            }
            ByteBuffer byteBuffer = this.f55337c;
            if (byteBuffer != null) {
                byteBuffer.flip();
            }
        }
    }

    /* JADX INFO: renamed from: t */
    private boolean m78879t() {
        ByteBuffer byteBuffer = this.f55337c;
        return byteBuffer != null && byteBuffer.hasRemaining();
    }

    /* JADX INFO: renamed from: a */
    public void m78880a(IOException iOException) {
        this.f55338d = iOException;
        this.f55336b = true;
        this.f55337c = null;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f55335a.disconnect();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        m78878s();
        if (m78879t()) {
            return this.f55337c.get() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        m78878s();
        if (!m78879t()) {
            return -1;
        }
        int iMin = Math.min(this.f55337c.limit() - this.f55337c.position(), i2);
        this.f55337c.get(bArr, i, iMin);
        return iMin;
    }
}
