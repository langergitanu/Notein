package com.huawei.hms.drive;

import com.huawei.hms.drive.C17839cv;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import oOo00OoO.C34524OooO0Oo;
import oOo00OoO.C34527OooO0oO;
import oOo00OoO.C34547OooOoo;
import oOo00OoO.InterfaceC34525OooO0o;
import oOo00OoO.InterfaceC34548OooOoo0;

/* JADX INFO: renamed from: com.huawei.hms.drive.cz */
/* JADX INFO: loaded from: classes6.dex */
final class C17843cz implements Closeable {

    /* JADX INFO: renamed from: a */
    static final Logger f53292a = Logger.getLogger(C17840cw.class.getName());

    /* JADX INFO: renamed from: b */
    final C17839cv.a f53293b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC34525OooO0o f53294c;

    /* JADX INFO: renamed from: d */
    private final a f53295d;

    /* JADX INFO: renamed from: e */
    private final boolean f53296e;

    /* JADX INFO: renamed from: com.huawei.hms.drive.cz$a */
    public static final class a implements InterfaceC34548OooOoo0 {

        /* JADX INFO: renamed from: a */
        int f53297a;

        /* JADX INFO: renamed from: b */
        byte f53298b;

        /* JADX INFO: renamed from: c */
        int f53299c;

        /* JADX INFO: renamed from: d */
        int f53300d;

        /* JADX INFO: renamed from: e */
        short f53301e;

        /* JADX INFO: renamed from: f */
        private final InterfaceC34525OooO0o f53302f;

        public a(InterfaceC34525OooO0o interfaceC34525OooO0o) {
            this.f53302f = interfaceC34525OooO0o;
        }

        /* JADX INFO: renamed from: a */
        private void m76628a() throws IOException {
            int i = this.f53299c;
            int iM76614a = C17843cz.m76614a(this.f53302f);
            this.f53300d = iM76614a;
            this.f53297a = iM76614a;
            byte b = (byte) (this.f53302f.readByte() & 255);
            this.f53298b = (byte) (this.f53302f.readByte() & 255);
            Logger logger = C17843cz.f53292a;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C17840cw.m76557a(true, this.f53299c, this.f53297a, b, this.f53298b));
            }
            int i2 = this.f53302f.readInt() & Integer.MAX_VALUE;
            this.f53299c = i2;
            if (b != 9) {
                throw C17840cw.m76558b("%s != TYPE_CONTINUATION", Byte.valueOf(b));
            }
            if (i2 != i) {
                throw C17840cw.m76558b("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // oOo00OoO.InterfaceC34548OooOoo0
        public long read(C34524OooO0Oo c34524OooO0Oo, long j) throws IOException {
            while (true) {
                int i = this.f53300d;
                if (i == 0) {
                    this.f53302f.skip(this.f53301e);
                    this.f53301e = (short) 0;
                    if ((this.f53298b & 4) != 0) {
                        break;
                    }
                    m76628a();
                } else {
                    long j2 = this.f53302f.read(c34524OooO0Oo, Math.min(j, i));
                    if (j2 != -1) {
                        this.f53300d = (int) (((long) this.f53300d) - j2);
                        return j2;
                    }
                }
            }
            return -1L;
        }

        @Override // oOo00OoO.InterfaceC34548OooOoo0
        public C34547OooOoo timeout() {
            return this.f53302f.timeout();
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.drive.cz$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo76602a();

        /* JADX INFO: renamed from: a */
        void mo76603a(int i, int i2, int i3, boolean z);

        /* JADX INFO: renamed from: a */
        void mo76604a(int i, int i2, List<C17838cu> list) throws IOException;

        /* JADX INFO: renamed from: a */
        void mo76605a(int i, long j);

        /* JADX INFO: renamed from: a */
        void mo76606a(int i, EnumC17837ct enumC17837ct);

        /* JADX INFO: renamed from: a */
        void mo76607a(int i, EnumC17837ct enumC17837ct, C34527OooO0oO c34527OooO0oO);

        /* JADX INFO: renamed from: a */
        void mo76608a(boolean z, int i, int i2);

        /* JADX INFO: renamed from: a */
        void mo76609a(boolean z, int i, int i2, List<C17838cu> list);

        /* JADX INFO: renamed from: a */
        void mo76610a(boolean z, int i, InterfaceC34525OooO0o interfaceC34525OooO0o, int i2) throws IOException;

        /* JADX INFO: renamed from: a */
        void mo76611a(boolean z, C17849de c17849de);
    }

    public C17843cz(InterfaceC34525OooO0o interfaceC34525OooO0o, boolean z) {
        this.f53294c = interfaceC34525OooO0o;
        this.f53296e = z;
        a aVar = new a(interfaceC34525OooO0o);
        this.f53295d = aVar;
        this.f53293b = new C17839cv.a(4096, aVar);
    }

    /* JADX INFO: renamed from: b */
    private void m76618b(b bVar, int i, byte b2, int i2) throws IOException {
        if (i2 == 0) {
            throw C17840cw.m76558b("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
        }
        boolean z = (b2 & 1) != 0;
        if ((b2 & 32) != 0) {
            throw C17840cw.m76558b("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        }
        short s = (b2 & 8) != 0 ? (short) (this.f53294c.readByte() & 255) : (short) 0;
        bVar.mo76610a(z, i2, this.f53294c, m76613a(i, b2, s));
        this.f53294c.skip(s);
    }

    /* JADX INFO: renamed from: c */
    private void m76619c(b bVar, int i, byte b2, int i2) throws IOException {
        if (i != 5) {
            throw C17840cw.m76558b("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i));
        }
        if (i2 == 0) {
            throw C17840cw.m76558b("TYPE_PRIORITY streamId == 0", new Object[0]);
        }
        m76616a(bVar, i2);
    }

    /* JADX INFO: renamed from: d */
    private void m76620d(b bVar, int i, byte b2, int i2) throws IOException {
        if (i != 4) {
            throw C17840cw.m76558b("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
        }
        if (i2 == 0) {
            throw C17840cw.m76558b("TYPE_RST_STREAM streamId == 0", new Object[0]);
        }
        int i3 = this.f53294c.readInt();
        EnumC17837ct enumC17837ctM76526a = EnumC17837ct.m76526a(i3);
        if (enumC17837ctM76526a == null) {
            throw C17840cw.m76558b("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(i3));
        }
        bVar.mo76606a(i2, enumC17837ctM76526a);
    }

    /* JADX INFO: renamed from: e */
    private void m76621e(b bVar, int i, byte b2, int i2) throws IOException {
        if (i2 != 0) {
            throw C17840cw.m76558b("TYPE_SETTINGS streamId != 0", new Object[0]);
        }
        if ((b2 & 1) != 0) {
            if (i != 0) {
                throw C17840cw.m76558b("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            }
            bVar.mo76602a();
            return;
        }
        if (i % 6 != 0) {
            throw C17840cw.m76558b("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
        }
        C17849de c17849de = new C17849de();
        for (int i3 = 0; i3 < i; i3 += 6) {
            int i4 = this.f53294c.readShort() & 65535;
            int i5 = this.f53294c.readInt();
            if (i4 == 2) {
                if (i5 != 0 && i5 != 1) {
                    throw C17840cw.m76558b("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                }
            } else if (i4 == 3) {
                i4 = 4;
            } else if (i4 != 4) {
                if (i4 == 5 && (i5 < 16384 || i5 > 16777215)) {
                    throw C17840cw.m76558b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(i5));
                }
            } else {
                if (i5 < 0) {
                    throw C17840cw.m76558b("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                }
                i4 = 7;
            }
            c17849de.m76704a(i4, i5);
        }
        bVar.mo76611a(false, c17849de);
    }

    /* JADX INFO: renamed from: f */
    private void m76622f(b bVar, int i, byte b2, int i2) throws IOException {
        if (i2 == 0) {
            throw C17840cw.m76558b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        }
        short s = (b2 & 8) != 0 ? (short) (this.f53294c.readByte() & 255) : (short) 0;
        bVar.mo76604a(i2, this.f53294c.readInt() & Integer.MAX_VALUE, m76615a(m76613a(i - 4, b2, s), s, b2, i2));
    }

    /* JADX INFO: renamed from: g */
    private void m76623g(b bVar, int i, byte b2, int i2) throws IOException {
        if (i != 8) {
            throw C17840cw.m76558b("TYPE_PING length != 8: %s", Integer.valueOf(i));
        }
        if (i2 != 0) {
            throw C17840cw.m76558b("TYPE_PING streamId != 0", new Object[0]);
        }
        bVar.mo76608a((b2 & 1) != 0, this.f53294c.readInt(), this.f53294c.readInt());
    }

    /* JADX INFO: renamed from: h */
    private void m76624h(b bVar, int i, byte b2, int i2) throws IOException {
        if (i < 8) {
            throw C17840cw.m76558b("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
        }
        if (i2 != 0) {
            throw C17840cw.m76558b("TYPE_GOAWAY streamId != 0", new Object[0]);
        }
        int i3 = this.f53294c.readInt();
        int i4 = this.f53294c.readInt();
        int i5 = i - 8;
        EnumC17837ct enumC17837ctM76526a = EnumC17837ct.m76526a(i4);
        if (enumC17837ctM76526a == null) {
            throw C17840cw.m76558b("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(i4));
        }
        C34527OooO0oO c34527OooO0oOOoooO0O = C34527OooO0oO.f123734OooOoO;
        if (i5 > 0) {
            c34527OooO0oOOoooO0O = this.f53294c.OoooO0O(i5);
        }
        bVar.mo76607a(i3, enumC17837ctM76526a, c34527OooO0oOOoooO0O);
    }

    /* JADX INFO: renamed from: i */
    private void m76625i(b bVar, int i, byte b2, int i2) throws IOException {
        if (i != 4) {
            throw C17840cw.m76558b("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
        }
        long j = ((long) this.f53294c.readInt()) & 2147483647L;
        if (j == 0) {
            throw C17840cw.m76558b("windowSizeIncrement was 0", Long.valueOf(j));
        }
        bVar.mo76605a(i2, j);
    }

    /* JADX INFO: renamed from: a */
    public void m76626a(b bVar) throws IOException {
        if (this.f53296e) {
            if (!m76627a(true, bVar)) {
                throw C17840cw.m76558b("Required SETTINGS preface not received", new Object[0]);
            }
            return;
        }
        InterfaceC34525OooO0o interfaceC34525OooO0o = this.f53294c;
        C34527OooO0oO c34527OooO0oO = C17840cw.f53206a;
        C34527OooO0oO c34527OooO0oOOoooO0O = interfaceC34525OooO0o.OoooO0O(c34527OooO0oO.OooO0OO());
        Logger logger = f53292a;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(C17806bp.m76330a("<< CONNECTION %s", c34527OooO0oOOoooO0O.OooO0Oo()));
        }
        if (!c34527OooO0oO.equals(c34527OooO0oOOoooO0O)) {
            throw C17840cw.m76558b("Expected a connection header but was %s", c34527OooO0oOOoooO0O.OooOOO0());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f53294c.close();
    }

    /* JADX INFO: renamed from: a */
    public boolean m76627a(boolean z, b bVar) throws IOException {
        try {
            this.f53294c.o0000OOO(9L);
            int iM76614a = m76614a(this.f53294c);
            if (iM76614a >= 0 && iM76614a <= 16384) {
                byte b2 = (byte) (this.f53294c.readByte() & 255);
                if (z && b2 != 4) {
                    throw C17840cw.m76558b("Expected a SETTINGS frame but was %s", Byte.valueOf(b2));
                }
                byte b3 = (byte) (this.f53294c.readByte() & 255);
                int i = this.f53294c.readInt() & Integer.MAX_VALUE;
                Logger logger = f53292a;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(C17840cw.m76557a(true, i, iM76614a, b2, b3));
                }
                switch (b2) {
                    case 0:
                        m76618b(bVar, iM76614a, b3, i);
                        return true;
                    case 1:
                        m76617a(bVar, iM76614a, b3, i);
                        return true;
                    case 2:
                        m76619c(bVar, iM76614a, b3, i);
                        return true;
                    case 3:
                        m76620d(bVar, iM76614a, b3, i);
                        return true;
                    case 4:
                        m76621e(bVar, iM76614a, b3, i);
                        return true;
                    case 5:
                        m76622f(bVar, iM76614a, b3, i);
                        return true;
                    case 6:
                        m76623g(bVar, iM76614a, b3, i);
                        return true;
                    case 7:
                        m76624h(bVar, iM76614a, b3, i);
                        return true;
                    case 8:
                        m76625i(bVar, iM76614a, b3, i);
                        return true;
                    default:
                        this.f53294c.skip(iM76614a);
                        return true;
                }
            }
            throw C17840cw.m76558b("FRAME_SIZE_ERROR: %s", Integer.valueOf(iM76614a));
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m76617a(b bVar, int i, byte b2, int i2) throws IOException {
        if (i2 != 0) {
            boolean z = (b2 & 1) != 0;
            short s = (b2 & 8) != 0 ? (short) (this.f53294c.readByte() & 255) : (short) 0;
            if ((b2 & 32) != 0) {
                m76616a(bVar, i2);
                i -= 5;
            }
            bVar.mo76609a(z, i2, -1, m76615a(m76613a(i, b2, s), s, b2, i2));
            return;
        }
        throw C17840cw.m76558b("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
    }

    /* JADX INFO: renamed from: a */
    private List<C17838cu> m76615a(int i, short s, byte b2, int i2) throws IOException {
        a aVar = this.f53295d;
        aVar.f53300d = i;
        aVar.f53297a = i;
        aVar.f53301e = s;
        aVar.f53298b = b2;
        aVar.f53299c = i2;
        this.f53293b.m76544a();
        return this.f53293b.m76545b();
    }

    /* JADX INFO: renamed from: a */
    private void m76616a(b bVar, int i) throws IOException {
        int i2 = this.f53294c.readInt();
        bVar.mo76603a(i, i2 & Integer.MAX_VALUE, (this.f53294c.readByte() & 255) + 1, (Integer.MIN_VALUE & i2) != 0);
    }

    /* JADX INFO: renamed from: a */
    public static int m76614a(InterfaceC34525OooO0o interfaceC34525OooO0o) throws IOException {
        return (interfaceC34525OooO0o.readByte() & 255) | ((interfaceC34525OooO0o.readByte() & 255) << 16) | ((interfaceC34525OooO0o.readByte() & 255) << 8);
    }

    /* JADX INFO: renamed from: a */
    public static int m76613a(int i, byte b2, short s) throws IOException {
        if ((b2 & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        throw C17840cw.m76558b("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
    }
}
