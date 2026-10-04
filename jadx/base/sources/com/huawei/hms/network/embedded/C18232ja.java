package com.huawei.hms.network.embedded;

import com.huawei.hms.network.embedded.C18148da;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.ja */
/* JADX INFO: loaded from: classes9.dex */
public final class C18232ja implements Closeable {

    /* JADX INFO: renamed from: g */
    public static final Logger f55360g = Logger.getLogger(C18162ea.class.getName());

    /* JADX INFO: renamed from: a */
    public final InterfaceC18275mb f55361a;

    /* JADX INFO: renamed from: b */
    public final boolean f55362b;

    /* JADX INFO: renamed from: c */
    public final C18261lb f55363c;

    /* JADX INFO: renamed from: d */
    public int f55364d;

    /* JADX INFO: renamed from: e */
    public boolean f55365e;

    /* JADX INFO: renamed from: f */
    public final C18148da.b f55366f;

    public C18232ja(InterfaceC18275mb interfaceC18275mb, boolean z) {
        this.f55361a = interfaceC18275mb;
        this.f55362b = z;
        C18261lb c18261lb = new C18261lb();
        this.f55363c = c18261lb;
        this.f55366f = new C18148da.b(c18261lb);
        this.f55364d = 16384;
    }

    /* JADX INFO: renamed from: b */
    private void m78907b(int i, long j) throws IOException {
        while (j > 0) {
            int iMin = (int) Math.min(this.f55364d, j);
            long j2 = iMin;
            j -= j2;
            m78909a(i, iMin, (byte) 9, j == 0 ? (byte) 4 : (byte) 0);
            this.f55361a.mo78029b(this.f55363c, j2);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m78908a(int i, byte b, C18261lb c18261lb, int i2) throws IOException {
        m78909a(i, i2, (byte) 0, b);
        if (i2 > 0) {
            this.f55361a.mo78029b(c18261lb, i2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f55365e = true;
        this.f55361a.close();
    }

    public synchronized void flush() throws IOException {
        if (this.f55365e) {
            throw new IOException("closed");
        }
        this.f55361a.flush();
    }

    /* JADX INFO: renamed from: s */
    public synchronized void m78919s() throws IOException {
        try {
            if (this.f55365e) {
                throw new IOException("closed");
            }
            if (this.f55362b) {
                Logger logger = f55360g;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(C18313p8.m79366a(">> CONNECTION %s", C18162ea.f54637a.mo78731d()));
                }
                this.f55361a.write(C18162ea.f54637a.mo78739m());
                this.f55361a.flush();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: t */
    public int m78920t() {
        return this.f55364d;
    }

    /* JADX INFO: renamed from: a */
    public void m78909a(int i, int i2, byte b, byte b2) throws IOException {
        Logger logger = f55360g;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(C18162ea.m78338a(false, i, i2, b, b2));
        }
        int i3 = this.f55364d;
        if (i2 > i3) {
            throw C18162ea.m78336a("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw C18162ea.m78336a("reserved bit set: %s", Integer.valueOf(i));
        }
        m78906a(this.f55361a, i2);
        this.f55361a.writeByte(b & 255);
        this.f55361a.writeByte(b2 & 255);
        this.f55361a.writeInt(i & Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m78918b(C18274ma c18274ma) throws IOException {
        try {
            if (this.f55365e) {
                throw new IOException("closed");
            }
            int i = 0;
            m78909a(0, c18274ma.m79196d() * 6, (byte) 4, (byte) 0);
            while (i < 10) {
                if (c18274ma.m79198e(i)) {
                    this.f55361a.writeShort(i == 4 ? 3 : i == 7 ? 4 : i);
                    this.f55361a.writeInt(c18274ma.m79187a(i));
                }
                i++;
            }
            this.f55361a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m78910a(int i, int i2, List<C18134ca> list) throws IOException {
        if (this.f55365e) {
            throw new IOException("closed");
        }
        this.f55366f.m78255a(list);
        long jM79076B = this.f55363c.m79076B();
        int iMin = (int) Math.min(this.f55364d - 4, jM79076B);
        long j = iMin;
        m78909a(i, iMin + 4, (byte) 5, jM79076B == j ? (byte) 4 : (byte) 0);
        this.f55361a.writeInt(i2 & Integer.MAX_VALUE);
        this.f55361a.mo78029b(this.f55363c, j);
        if (jM79076B > j) {
            m78907b(i, jM79076B - j);
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m78911a(int i, long j) throws IOException {
        if (this.f55365e) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw C18162ea.m78336a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
        }
        m78909a(i, 4, (byte) 8, (byte) 0);
        this.f55361a.writeInt((int) j);
        this.f55361a.flush();
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m78912a(int i, EnumC18120ba enumC18120ba) throws IOException {
        if (this.f55365e) {
            throw new IOException("closed");
        }
        if (enumC18120ba.f54329a == -1) {
            throw new IllegalArgumentException();
        }
        m78909a(i, 4, (byte) 3, (byte) 0);
        this.f55361a.writeInt(enumC18120ba.f54329a);
        this.f55361a.flush();
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m78913a(int i, EnumC18120ba enumC18120ba, byte[] bArr) throws IOException {
        try {
            if (this.f55365e) {
                throw new IOException("closed");
            }
            if (enumC18120ba.f54329a == -1) {
                throw C18162ea.m78336a("errorCode.httpCode == -1", new Object[0]);
            }
            m78909a(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.f55361a.writeInt(i);
            this.f55361a.writeInt(enumC18120ba.f54329a);
            if (bArr.length > 0) {
                this.f55361a.write(bArr);
            }
            this.f55361a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m78914a(C18274ma c18274ma) throws IOException {
        try {
            if (this.f55365e) {
                throw new IOException("closed");
            }
            this.f55364d = c18274ma.m79195c(this.f55364d);
            if (c18274ma.m79192b() != -1) {
                this.f55366f.m78252a(c18274ma.m79192b());
            }
            m78909a(0, 0, (byte) 4, (byte) 1);
            this.f55361a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m78906a(InterfaceC18275mb interfaceC18275mb, int i) throws IOException {
        interfaceC18275mb.writeByte((i >>> 16) & 255);
        interfaceC18275mb.writeByte((i >>> 8) & 255);
        interfaceC18275mb.writeByte(i & 255);
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m78915a(boolean z, int i, int i2) throws IOException {
        if (this.f55365e) {
            throw new IOException("closed");
        }
        m78909a(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
        this.f55361a.writeInt(i);
        this.f55361a.writeInt(i2);
        this.f55361a.flush();
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m78916a(boolean z, int i, C18261lb c18261lb, int i2) throws IOException {
        if (this.f55365e) {
            throw new IOException("closed");
        }
        m78908a(i, z ? (byte) 1 : (byte) 0, c18261lb, i2);
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m78917a(boolean z, int i, List<C18134ca> list) throws IOException {
        if (this.f55365e) {
            throw new IOException("closed");
        }
        this.f55366f.m78255a(list);
        long jM79076B = this.f55363c.m79076B();
        int iMin = (int) Math.min(this.f55364d, jM79076B);
        long j = iMin;
        byte b = jM79076B == j ? (byte) 4 : (byte) 0;
        if (z) {
            b = (byte) (b | 1);
        }
        m78909a(i, iMin, (byte) 1, b);
        this.f55361a.mo78029b(this.f55363c, j);
        if (jM79076B > j) {
            m78907b(i, jM79076B - j);
        }
    }
}
