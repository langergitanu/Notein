package com.huawei.hms.drive;

import com.huawei.hms.drive.C17839cv;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import oOo00OoO.C34524OooO0Oo;
import oOo00OoO.InterfaceC34526OooO0o0;

/* JADX INFO: renamed from: com.huawei.hms.drive.db */
/* JADX INFO: loaded from: classes6.dex */
final class C17846db implements Closeable {

    /* JADX INFO: renamed from: b */
    private static final Logger f53340b = Logger.getLogger(C17840cw.class.getName());

    /* JADX INFO: renamed from: a */
    final C17839cv.b f53341a;

    /* JADX INFO: renamed from: c */
    private final InterfaceC34526OooO0o0 f53342c;

    /* JADX INFO: renamed from: d */
    private final boolean f53343d;

    /* JADX INFO: renamed from: e */
    private final C34524OooO0Oo f53344e;

    /* JADX INFO: renamed from: f */
    private int f53345f;

    /* JADX INFO: renamed from: g */
    private boolean f53346g;

    public C17846db(InterfaceC34526OooO0o0 interfaceC34526OooO0o0, boolean z) {
        this.f53342c = interfaceC34526OooO0o0;
        this.f53343d = z;
        C34524OooO0Oo c34524OooO0Oo = new C34524OooO0Oo();
        this.f53344e = c34524OooO0Oo;
        this.f53341a = new C17839cv.b(c34524OooO0Oo);
        this.f53345f = 16384;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m76679a() throws IOException {
        try {
            if (this.f53346g) {
                throw new IOException("closed");
            }
            if (this.f53343d) {
                Logger logger = f53340b;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(C17806bp.m76330a(">> CONNECTION %s", C17840cw.f53206a.OooO0Oo()));
                }
                this.f53342c.write(C17840cw.f53206a.OooOO0o());
                this.f53342c.flush();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m76691b() throws IOException {
        if (this.f53346g) {
            throw new IOException("closed");
        }
        this.f53342c.flush();
    }

    /* JADX INFO: renamed from: c */
    public synchronized int m76693c() {
        return this.f53345f;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f53346g = true;
        this.f53342c.close();
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m76692b(C17849de c17849de) throws IOException {
        try {
            if (!this.f53346g) {
                int i = 0;
                m76681a(0, c17849de.m76708b() * 6, (byte) 4, (byte) 0);
                while (i < 10) {
                    if (c17849de.m76707a(i)) {
                        this.f53342c.writeShort(i == 4 ? 3 : i == 7 ? 4 : i);
                        this.f53342c.writeInt(c17849de.m76709b(i));
                    }
                    i++;
                }
                this.f53342c.flush();
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m76686a(C17849de c17849de) throws IOException {
        try {
            if (!this.f53346g) {
                this.f53345f = c17849de.m76713d(this.f53345f);
                if (c17849de.m76710c() != -1) {
                    this.f53341a.m76551a(c17849de.m76710c());
                }
                m76681a(0, 0, (byte) 4, (byte) 1);
                this.f53342c.flush();
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m76678b(int i, long j) throws IOException {
        while (j > 0) {
            int iMin = (int) Math.min(this.f53345f, j);
            long j2 = iMin;
            j -= j2;
            m76681a(i, iMin, (byte) 9, j == 0 ? (byte) 4 : (byte) 0);
            this.f53342c.write(this.f53344e, j2);
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m76682a(int i, int i2, List<C17838cu> list) throws IOException {
        if (!this.f53346g) {
            this.f53341a.m76553a(list);
            long j = this.f53344e.f123723OooOo;
            int iMin = (int) Math.min(this.f53345f - 4, j);
            long j2 = iMin;
            m76681a(i, iMin + 4, (byte) 5, j == j2 ? (byte) 4 : (byte) 0);
            this.f53342c.writeInt(i2 & Integer.MAX_VALUE);
            this.f53342c.write(this.f53344e, j2);
            if (j > j2) {
                m76678b(i, j - j2);
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m76688a(boolean z, int i, int i2, List<C17838cu> list) throws IOException {
        if (!this.f53346g) {
            m76689a(z, i, list);
        } else {
            throw new IOException("closed");
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m76684a(int i, EnumC17837ct enumC17837ct) throws IOException {
        if (!this.f53346g) {
            if (enumC17837ct.f53176l != -1) {
                m76681a(i, 4, (byte) 3, (byte) 0);
                this.f53342c.writeInt(enumC17837ct.f53176l);
                this.f53342c.flush();
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m76690a(boolean z, int i, C34524OooO0Oo c34524OooO0Oo, int i2) throws IOException {
        if (!this.f53346g) {
            m76680a(i, z ? (byte) 1 : (byte) 0, c34524OooO0Oo, i2);
        } else {
            throw new IOException("closed");
        }
    }

    /* JADX INFO: renamed from: a */
    public void m76680a(int i, byte b, C34524OooO0Oo c34524OooO0Oo, int i2) throws IOException {
        m76681a(i, i2, (byte) 0, b);
        if (i2 > 0) {
            this.f53342c.write(c34524OooO0Oo, i2);
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m76687a(boolean z, int i, int i2) throws IOException {
        if (!this.f53346g) {
            m76681a(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
            this.f53342c.writeInt(i);
            this.f53342c.writeInt(i2);
            this.f53342c.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m76685a(int i, EnumC17837ct enumC17837ct, byte[] bArr) throws IOException {
        try {
            if (!this.f53346g) {
                if (enumC17837ct.f53176l != -1) {
                    m76681a(0, bArr.length + 8, (byte) 7, (byte) 0);
                    this.f53342c.writeInt(i);
                    this.f53342c.writeInt(enumC17837ct.f53176l);
                    if (bArr.length > 0) {
                        this.f53342c.write(bArr);
                    }
                    this.f53342c.flush();
                } else {
                    throw C17840cw.m76555a("errorCode.httpCode == -1", new Object[0]);
                }
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m76683a(int i, long j) throws IOException {
        if (this.f53346g) {
            throw new IOException("closed");
        }
        if (j != 0 && j <= 2147483647L) {
            m76681a(i, 4, (byte) 8, (byte) 0);
            this.f53342c.writeInt((int) j);
            this.f53342c.flush();
        } else {
            throw C17840cw.m76555a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
        }
    }

    /* JADX INFO: renamed from: a */
    public void m76681a(int i, int i2, byte b, byte b2) throws IOException {
        Logger logger = f53340b;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(C17840cw.m76557a(false, i, i2, b, b2));
        }
        int i3 = this.f53345f;
        if (i2 > i3) {
            throw C17840cw.m76555a("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
        }
        if ((Integer.MIN_VALUE & i) == 0) {
            m76677a(this.f53342c, i2);
            this.f53342c.writeByte(b & 255);
            this.f53342c.writeByte(b2 & 255);
            this.f53342c.writeInt(i & Integer.MAX_VALUE);
            return;
        }
        throw C17840cw.m76555a("reserved bit set: %s", Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: a */
    private static void m76677a(InterfaceC34526OooO0o0 interfaceC34526OooO0o0, int i) throws IOException {
        interfaceC34526OooO0o0.writeByte((i >>> 16) & 255);
        interfaceC34526OooO0o0.writeByte((i >>> 8) & 255);
        interfaceC34526OooO0o0.writeByte(i & 255);
    }

    /* JADX INFO: renamed from: a */
    public void m76689a(boolean z, int i, List<C17838cu> list) throws IOException {
        if (!this.f53346g) {
            this.f53341a.m76553a(list);
            long j = this.f53344e.f123723OooOo;
            int iMin = (int) Math.min(this.f53345f, j);
            long j2 = iMin;
            byte b = j == j2 ? (byte) 4 : (byte) 0;
            if (z) {
                b = (byte) (b | 1);
            }
            m76681a(i, iMin, (byte) 1, b);
            this.f53342c.write(this.f53344e, j2);
            if (j > j2) {
                m76678b(i, j - j2);
                return;
            }
            return;
        }
        throw new IOException("closed");
    }
}
