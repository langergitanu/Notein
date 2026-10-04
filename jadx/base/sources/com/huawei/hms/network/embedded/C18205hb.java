package com.huawei.hms.network.embedded;

import android.support.v4.media.session.PlaybackStateCompat;
import com.huawei.hms.network.embedded.C18261lb;
import java.io.IOException;
import java.util.Random;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.hb */
/* JADX INFO: loaded from: classes9.dex */
public final class C18205hb {

    /* JADX INFO: renamed from: a */
    public final boolean f55060a;

    /* JADX INFO: renamed from: b */
    public final Random f55061b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC18275mb f55062c;

    /* JADX INFO: renamed from: d */
    public final C18261lb f55063d;

    /* JADX INFO: renamed from: e */
    public boolean f55064e;

    /* JADX INFO: renamed from: f */
    public final C18261lb f55065f = new C18261lb();

    /* JADX INFO: renamed from: g */
    public final a f55066g = new a();

    /* JADX INFO: renamed from: h */
    public boolean f55067h;

    /* JADX INFO: renamed from: i */
    public final byte[] f55068i;

    /* JADX INFO: renamed from: j */
    public final C18261lb.c f55069j;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.hb$a */
    public final class a implements InterfaceC18220ic {

        /* JADX INFO: renamed from: a */
        public int f55070a;

        /* JADX INFO: renamed from: b */
        public long f55071b;

        /* JADX INFO: renamed from: c */
        public boolean f55072c;

        /* JADX INFO: renamed from: d */
        public boolean f55073d;

        public a() {
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18220ic
        /* JADX INFO: renamed from: b */
        public void mo78029b(C18261lb c18261lb, long j) throws IOException {
            if (this.f55073d) {
                throw new IOException("closed");
            }
            C18205hb.this.f55065f.mo78029b(c18261lb, j);
            boolean z = this.f55072c && this.f55071b != -1 && C18205hb.this.f55065f.m79076B() > this.f55071b - PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            long jM79096t = C18205hb.this.f55065f.m79096t();
            if (jM79096t <= 0 || z) {
                return;
            }
            C18205hb.this.m78709a(this.f55070a, jM79096t, this.f55072c, false);
            this.f55072c = false;
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18220ic, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f55073d) {
                throw new IOException("closed");
            }
            C18205hb c18205hb = C18205hb.this;
            c18205hb.m78709a(this.f55070a, c18205hb.f55065f.m79076B(), this.f55072c, true);
            this.f55073d = true;
            C18205hb.this.f55067h = false;
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18220ic, java.io.Flushable
        public void flush() throws IOException {
            if (this.f55073d) {
                throw new IOException("closed");
            }
            C18205hb c18205hb = C18205hb.this;
            c18205hb.m78709a(this.f55070a, c18205hb.f55065f.m79076B(), this.f55072c, false);
            this.f55072c = false;
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18220ic
        public C18248kc timeout() {
            return C18205hb.this.f55062c.timeout();
        }
    }

    public C18205hb(boolean z, InterfaceC18275mb interfaceC18275mb, Random random) {
        if (interfaceC18275mb == null) {
            throw new NullPointerException("sink == null");
        }
        if (random == null) {
            throw new NullPointerException("random == null");
        }
        this.f55060a = z;
        this.f55062c = interfaceC18275mb;
        this.f55063d = interfaceC18275mb.mo78258a();
        this.f55061b = random;
        this.f55068i = z ? new byte[4] : null;
        this.f55069j = z ? new C18261lb.c() : null;
    }

    /* JADX INFO: renamed from: b */
    private void m78707b(int i, C18303ob c18303ob) throws IOException {
        if (this.f55064e) {
            throw new IOException("closed");
        }
        int iMo78736j = c18303ob.mo78736j();
        if (iMo78736j > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        this.f55063d.writeByte(i | 128);
        if (this.f55060a) {
            this.f55063d.writeByte(iMo78736j | 128);
            this.f55061b.nextBytes(this.f55068i);
            this.f55063d.write(this.f55068i);
            if (iMo78736j > 0) {
                long jM79076B = this.f55063d.m79076B();
                this.f55063d.mo78267b(c18303ob);
                this.f55063d.m79079a(this.f55069j);
                this.f55069j.m79105k(jM79076B);
                C18177fb.m78506a(this.f55069j, this.f55068i);
                this.f55069j.close();
            }
        } else {
            this.f55063d.writeByte(iMo78736j);
            this.f55063d.mo78267b(c18303ob);
        }
        this.f55062c.flush();
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC18220ic m78708a(int i, long j) {
        if (this.f55067h) {
            throw new IllegalStateException("Another message writer is active. Did you call close()?");
        }
        this.f55067h = true;
        a aVar = this.f55066g;
        aVar.f55070a = i;
        aVar.f55071b = j;
        aVar.f55072c = true;
        aVar.f55073d = false;
        return aVar;
    }

    /* JADX INFO: renamed from: a */
    public void m78709a(int i, long j, boolean z, boolean z2) throws IOException {
        if (this.f55064e) {
            throw new IOException("closed");
        }
        if (!z) {
            i = 0;
        }
        if (z2) {
            i |= 128;
        }
        this.f55063d.writeByte(i);
        int i2 = this.f55060a ? 128 : 0;
        if (j <= 125) {
            this.f55063d.writeByte(((int) j) | i2);
        } else if (j <= C18177fb.f54859s) {
            this.f55063d.writeByte(i2 | 126);
            this.f55063d.writeShort((int) j);
        } else {
            this.f55063d.writeByte(i2 | 127);
            this.f55063d.writeLong(j);
        }
        if (this.f55060a) {
            this.f55061b.nextBytes(this.f55068i);
            this.f55063d.write(this.f55068i);
            if (j > 0) {
                long jM79076B = this.f55063d.m79076B();
                this.f55063d.mo78029b(this.f55065f, j);
                this.f55063d.m79079a(this.f55069j);
                this.f55069j.m79105k(jM79076B);
                C18177fb.m78506a(this.f55069j, this.f55068i);
                this.f55069j.close();
            }
        } else {
            this.f55063d.mo78029b(this.f55065f, j);
        }
        this.f55062c.mo78271h();
    }

    /* JADX INFO: renamed from: b */
    public void m78712b(C18303ob c18303ob) throws IOException {
        m78707b(10, c18303ob);
    }

    /* JADX INFO: renamed from: a */
    public void m78710a(int i, C18303ob c18303ob) throws IOException {
        C18303ob c18303obMo78401r = C18303ob.f55843f;
        if (i != 0 || c18303ob != null) {
            if (i != 0) {
                C18177fb.m78507b(i);
            }
            C18261lb c18261lb = new C18261lb();
            c18261lb.writeShort(i);
            if (c18303ob != null) {
                c18261lb.mo78267b(c18303ob);
            }
            c18303obMo78401r = c18261lb.mo78401r();
        }
        try {
            m78707b(8, c18303obMo78401r);
        } finally {
            this.f55064e = true;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m78711a(C18303ob c18303ob) throws IOException {
        m78707b(9, c18303ob);
    }
}
