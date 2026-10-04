package com.huawei.hms.network.embedded;

import com.huawei.hms.network.embedded.C18148da;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.ha */
/* JADX INFO: loaded from: classes9.dex */
public final class C18204ha implements Closeable {

    /* JADX INFO: renamed from: e */
    public static final Logger f55049e = Logger.getLogger(C18162ea.class.getName());

    /* JADX INFO: renamed from: a */
    public final InterfaceC18289nb f55050a;

    /* JADX INFO: renamed from: b */
    public final a f55051b;

    /* JADX INFO: renamed from: c */
    public final boolean f55052c;

    /* JADX INFO: renamed from: d */
    public final C18148da.a f55053d;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.ha$a */
    public static final class a implements InterfaceC18234jc {

        /* JADX INFO: renamed from: a */
        public final InterfaceC18289nb f55054a;

        /* JADX INFO: renamed from: b */
        public int f55055b;

        /* JADX INFO: renamed from: c */
        public byte f55056c;

        /* JADX INFO: renamed from: d */
        public int f55057d;

        /* JADX INFO: renamed from: e */
        public int f55058e;

        /* JADX INFO: renamed from: f */
        public short f55059f;

        public a(InterfaceC18289nb interfaceC18289nb) {
            this.f55054a = interfaceC18289nb;
        }

        /* JADX INFO: renamed from: g */
        private void m78706g() throws IOException {
            int i = this.f55057d;
            int iM78692a = C18204ha.m78692a(this.f55054a);
            this.f55058e = iM78692a;
            this.f55055b = iM78692a;
            byte b = (byte) (this.f55054a.readByte() & 255);
            this.f55056c = (byte) (this.f55054a.readByte() & 255);
            Logger logger = C18204ha.f55049e;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C18162ea.m78338a(true, this.f55057d, this.f55055b, b, this.f55056c));
            }
            int i2 = this.f55054a.readInt() & Integer.MAX_VALUE;
            this.f55057d = i2;
            if (b != 9) {
                throw C18162ea.m78339b("%s != TYPE_CONTINUATION", Byte.valueOf(b));
            }
            if (i2 != i) {
                throw C18162ea.m78339b("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18234jc
        /* JADX INFO: renamed from: c */
        public long mo77914c(C18261lb c18261lb, long j) throws IOException {
            while (true) {
                int i = this.f55058e;
                if (i != 0) {
                    long jMo77914c = this.f55054a.mo77914c(c18261lb, Math.min(j, i));
                    if (jMo77914c == -1) {
                        return -1L;
                    }
                    this.f55058e = (int) (((long) this.f55058e) - jMo77914c);
                    return jMo77914c;
                }
                this.f55054a.skip(this.f55059f);
                this.f55059f = (short) 0;
                if ((this.f55056c & 4) != 0) {
                    return -1L;
                }
                m78706g();
            }
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18234jc, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18234jc
        public C18248kc timeout() {
            return this.f55054a.timeout();
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.ha$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo78492a();

        /* JADX INFO: renamed from: a */
        void mo78493a(int i, int i2, int i3, boolean z);

        /* JADX INFO: renamed from: a */
        void mo78494a(int i, int i2, List<C18134ca> list) throws IOException;

        /* JADX INFO: renamed from: a */
        void mo78495a(int i, long j);

        /* JADX INFO: renamed from: a */
        void mo78496a(int i, EnumC18120ba enumC18120ba);

        /* JADX INFO: renamed from: a */
        void mo78497a(int i, EnumC18120ba enumC18120ba, C18303ob c18303ob);

        /* JADX INFO: renamed from: a */
        void mo78498a(int i, String str, C18303ob c18303ob, String str2, int i2, long j);

        /* JADX INFO: renamed from: a */
        void mo78499a(boolean z, int i, int i2);

        /* JADX INFO: renamed from: a */
        void mo78500a(boolean z, int i, int i2, List<C18134ca> list);

        /* JADX INFO: renamed from: a */
        void mo78501a(boolean z, int i, InterfaceC18289nb interfaceC18289nb, int i2) throws IOException;

        /* JADX INFO: renamed from: a */
        void mo78502a(boolean z, C18274ma c18274ma);
    }

    public C18204ha(InterfaceC18289nb interfaceC18289nb, boolean z) {
        this.f55050a = interfaceC18289nb;
        this.f55052c = z;
        a aVar = new a(interfaceC18289nb);
        this.f55051b = aVar;
        this.f55053d = new C18148da.a(4096, aVar);
    }

    /* JADX INFO: renamed from: a */
    public static int m78691a(int i, byte b2, short s) throws IOException {
        if ((b2 & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        throw C18162ea.m78339b("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: b */
    private void m78696b(b bVar, int i, byte b2, int i2) throws IOException {
        if (i < 8) {
            throw C18162ea.m78339b("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
        }
        if (i2 != 0) {
            throw C18162ea.m78339b("TYPE_GOAWAY streamId != 0", new Object[0]);
        }
        int i3 = this.f55050a.readInt();
        int i4 = this.f55050a.readInt();
        int i5 = i - 8;
        EnumC18120ba enumC18120baM78016a = EnumC18120ba.m78016a(i4);
        if (enumC18120baM78016a == null) {
            throw C18162ea.m78339b("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(i4));
        }
        C18303ob c18303obMo78375a = C18303ob.f55843f;
        if (i5 > 0) {
            c18303obMo78375a = this.f55050a.mo78375a(i5);
        }
        bVar.mo78497a(i3, enumC18120baM78016a, c18303obMo78375a);
    }

    /* JADX INFO: renamed from: c */
    private void m78697c(b bVar, int i, byte b2, int i2) throws IOException {
        if (i2 == 0) {
            throw C18162ea.m78339b("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        }
        boolean z = (b2 & 1) != 0;
        short s = (b2 & 8) != 0 ? (short) (this.f55050a.readByte() & 255) : (short) 0;
        if ((b2 & 32) != 0) {
            m78694a(bVar, i2);
            i -= 5;
        }
        bVar.mo78500a(z, i2, -1, m78693a(m78691a(i, b2, s), s, b2, i2));
    }

    /* JADX INFO: renamed from: d */
    private void m78698d(b bVar, int i, byte b2, int i2) throws IOException {
        if (i != 8) {
            throw C18162ea.m78339b("TYPE_PING length != 8: %s", Integer.valueOf(i));
        }
        if (i2 != 0) {
            throw C18162ea.m78339b("TYPE_PING streamId != 0", new Object[0]);
        }
        bVar.mo78499a((b2 & 1) != 0, this.f55050a.readInt(), this.f55050a.readInt());
    }

    /* JADX INFO: renamed from: e */
    private void m78699e(b bVar, int i, byte b2, int i2) throws IOException {
        if (i != 5) {
            throw C18162ea.m78339b("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i));
        }
        if (i2 == 0) {
            throw C18162ea.m78339b("TYPE_PRIORITY streamId == 0", new Object[0]);
        }
        m78694a(bVar, i2);
    }

    /* JADX INFO: renamed from: f */
    private void m78700f(b bVar, int i, byte b2, int i2) throws IOException {
        if (i2 == 0) {
            throw C18162ea.m78339b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        }
        short s = (b2 & 8) != 0 ? (short) (this.f55050a.readByte() & 255) : (short) 0;
        bVar.mo78494a(i2, this.f55050a.readInt() & Integer.MAX_VALUE, m78693a(m78691a(i - 4, b2, s), s, b2, i2));
    }

    /* JADX INFO: renamed from: g */
    private void m78701g(b bVar, int i, byte b2, int i2) throws IOException {
        if (i != 4) {
            throw C18162ea.m78339b("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
        }
        if (i2 == 0) {
            throw C18162ea.m78339b("TYPE_RST_STREAM streamId == 0", new Object[0]);
        }
        int i3 = this.f55050a.readInt();
        EnumC18120ba enumC18120baM78016a = EnumC18120ba.m78016a(i3);
        if (enumC18120baM78016a == null) {
            throw C18162ea.m78339b("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(i3));
        }
        bVar.mo78496a(i2, enumC18120baM78016a);
    }

    /* JADX INFO: renamed from: h */
    private void m78702h(b bVar, int i, byte b2, int i2) throws IOException {
        if (i2 != 0) {
            throw C18162ea.m78339b("TYPE_SETTINGS streamId != 0", new Object[0]);
        }
        if ((b2 & 1) != 0) {
            if (i != 0) {
                throw C18162ea.m78339b("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            }
            bVar.mo78492a();
            return;
        }
        if (i % 6 != 0) {
            throw C18162ea.m78339b("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
        }
        C18274ma c18274ma = new C18274ma();
        for (int i3 = 0; i3 < i; i3 += 6) {
            int i4 = this.f55050a.readShort() & 65535;
            int i5 = this.f55050a.readInt();
            if (i4 == 2) {
                if (i5 != 0 && i5 != 1) {
                    throw C18162ea.m78339b("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                }
            } else if (i4 == 3) {
                i4 = 4;
            } else if (i4 != 4) {
                if (i4 == 5 && (i5 < 16384 || i5 > 16777215)) {
                    throw C18162ea.m78339b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(i5));
                }
            } else {
                if (i5 < 0) {
                    throw C18162ea.m78339b("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                }
                i4 = 7;
            }
            c18274ma.m79188a(i4, i5);
        }
        bVar.mo78502a(false, c18274ma);
    }

    /* JADX INFO: renamed from: i */
    private void m78703i(b bVar, int i, byte b2, int i2) throws IOException {
        if (i != 4) {
            throw C18162ea.m78339b("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
        }
        long j = ((long) this.f55050a.readInt()) & 2147483647L;
        if (j == 0) {
            throw C18162ea.m78339b("windowSizeIncrement was 0", Long.valueOf(j));
        }
        bVar.mo78495a(i2, j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f55050a.close();
    }

    /* JADX INFO: renamed from: a */
    public static int m78692a(InterfaceC18289nb interfaceC18289nb) throws IOException {
        return (interfaceC18289nb.readByte() & 255) | ((interfaceC18289nb.readByte() & 255) << 16) | ((interfaceC18289nb.readByte() & 255) << 8);
    }

    /* JADX INFO: renamed from: a */
    private List<C18134ca> m78693a(int i, short s, byte b2, int i2) throws IOException {
        a aVar = this.f55051b;
        aVar.f55058e = i;
        aVar.f55055b = i;
        aVar.f55059f = s;
        aVar.f55056c = b2;
        aVar.f55057d = i2;
        this.f55053d.m78247d();
        return this.f55053d.m78244a();
    }

    /* JADX INFO: renamed from: a */
    public void m78704a(b bVar) throws IOException {
        if (this.f55052c) {
            if (!m78705a(true, bVar)) {
                throw C18162ea.m78339b("Required SETTINGS preface not received", new Object[0]);
            }
            return;
        }
        InterfaceC18289nb interfaceC18289nb = this.f55050a;
        C18303ob c18303ob = C18162ea.f54637a;
        C18303ob c18303obMo78375a = interfaceC18289nb.mo78375a(c18303ob.mo78736j());
        Logger logger = f55049e;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(C18313p8.m79366a("<< CONNECTION %s", c18303obMo78375a.mo78731d()));
        }
        if (!c18303ob.equals(c18303obMo78375a)) {
            throw C18162ea.m78339b("Expected a connection header but was %s", c18303obMo78375a.mo78740n());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m78694a(b bVar, int i) throws IOException {
        int i2 = this.f55050a.readInt();
        bVar.mo78493a(i, i2 & Integer.MAX_VALUE, (this.f55050a.readByte() & 255) + 1, (Integer.MIN_VALUE & i2) != 0);
    }

    /* JADX INFO: renamed from: a */
    private void m78695a(b bVar, int i, byte b2, int i2) throws IOException {
        if (i2 != 0) {
            boolean z = (b2 & 1) != 0;
            if ((b2 & 32) != 0) {
                throw C18162ea.m78339b("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            }
            short s = (b2 & 8) != 0 ? (short) (this.f55050a.readByte() & 255) : (short) 0;
            bVar.mo78501a(z, i2, this.f55050a, m78691a(i, b2, s));
            this.f55050a.skip(s);
            return;
        }
        throw C18162ea.m78339b("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
    }

    /* JADX INFO: renamed from: a */
    public boolean m78705a(boolean z, b bVar) throws IOException {
        try {
            this.f55050a.mo78393i(9L);
            int iM78692a = m78692a(this.f55050a);
            if (iM78692a < 0 || iM78692a > 16384) {
                throw C18162ea.m78339b("FRAME_SIZE_ERROR: %s", Integer.valueOf(iM78692a));
            }
            byte b2 = (byte) (this.f55050a.readByte() & 255);
            if (z && b2 != 4) {
                throw C18162ea.m78339b("Expected a SETTINGS frame but was %s", Byte.valueOf(b2));
            }
            byte b3 = (byte) (this.f55050a.readByte() & 255);
            int i = this.f55050a.readInt() & Integer.MAX_VALUE;
            Logger logger = f55049e;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C18162ea.m78338a(true, i, iM78692a, b2, b3));
            }
            switch (b2) {
                case 0:
                    m78695a(bVar, iM78692a, b3, i);
                    return true;
                case 1:
                    m78697c(bVar, iM78692a, b3, i);
                    return true;
                case 2:
                    m78699e(bVar, iM78692a, b3, i);
                    return true;
                case 3:
                    m78701g(bVar, iM78692a, b3, i);
                    return true;
                case 4:
                    m78702h(bVar, iM78692a, b3, i);
                    return true;
                case 5:
                    m78700f(bVar, iM78692a, b3, i);
                    return true;
                case 6:
                    m78698d(bVar, iM78692a, b3, i);
                    return true;
                case 7:
                    m78696b(bVar, iM78692a, b3, i);
                    return true;
                case 8:
                    m78703i(bVar, iM78692a, b3, i);
                    return true;
                default:
                    this.f55050a.skip(iM78692a);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }
}
