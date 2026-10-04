package com.huawei.hms.network.embedded;

import androidx.concurrent.futures.OooO00o;
import java.io.IOException;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.bc */
/* JADX INFO: loaded from: classes9.dex */
public final class C18122bc {

    /* JADX INFO: renamed from: a */
    public final long f54337a;

    /* JADX INFO: renamed from: c */
    public boolean f54339c;

    /* JADX INFO: renamed from: d */
    public boolean f54340d;

    /* JADX INFO: renamed from: g */
    public InterfaceC18220ic f54343g;

    /* JADX INFO: renamed from: b */
    public final C18261lb f54338b = new C18261lb();

    /* JADX INFO: renamed from: e */
    public final InterfaceC18220ic f54341e = new a();

    /* JADX INFO: renamed from: f */
    public final InterfaceC18234jc f54342f = new b();

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.bc$a */
    public final class a implements InterfaceC18220ic {

        /* JADX INFO: renamed from: a */
        public final C18136cc f54344a = new C18136cc();

        public a() {
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18220ic
        /* JADX INFO: renamed from: b */
        public void mo78029b(C18261lb c18261lb, long j) throws IOException {
            InterfaceC18220ic interfaceC18220ic;
            synchronized (C18122bc.this.f54338b) {
                try {
                    if (!C18122bc.this.f54339c) {
                        while (true) {
                            if (j <= 0) {
                                interfaceC18220ic = null;
                                break;
                            }
                            if (C18122bc.this.f54343g != null) {
                                interfaceC18220ic = C18122bc.this.f54343g;
                                break;
                            }
                            C18122bc c18122bc = C18122bc.this;
                            if (c18122bc.f54340d) {
                                throw new IOException("source is closed");
                            }
                            long jM79076B = c18122bc.f54337a - c18122bc.f54338b.m79076B();
                            if (jM79076B == 0) {
                                this.f54344a.m78997a(C18122bc.this.f54338b);
                            } else {
                                long jMin = Math.min(jM79076B, j);
                                C18122bc.this.f54338b.mo78029b(c18261lb, jMin);
                                j -= jMin;
                                C18122bc.this.f54338b.notifyAll();
                            }
                        }
                    } else {
                        throw new IllegalStateException("closed");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (interfaceC18220ic != null) {
                this.f54344a.m78152a(interfaceC18220ic.timeout());
                try {
                    interfaceC18220ic.mo78029b(c18261lb, j);
                } finally {
                    this.f54344a.m78153g();
                }
            }
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18220ic, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            InterfaceC18220ic interfaceC18220ic;
            synchronized (C18122bc.this.f54338b) {
                try {
                    C18122bc c18122bc = C18122bc.this;
                    if (c18122bc.f54339c) {
                        return;
                    }
                    if (c18122bc.f54343g != null) {
                        interfaceC18220ic = C18122bc.this.f54343g;
                    } else {
                        C18122bc c18122bc2 = C18122bc.this;
                        if (c18122bc2.f54340d && c18122bc2.f54338b.m79076B() > 0) {
                            throw new IOException("source is closed");
                        }
                        C18122bc c18122bc3 = C18122bc.this;
                        c18122bc3.f54339c = true;
                        c18122bc3.f54338b.notifyAll();
                        interfaceC18220ic = null;
                    }
                    if (interfaceC18220ic != null) {
                        this.f54344a.m78152a(interfaceC18220ic.timeout());
                        try {
                            interfaceC18220ic.close();
                        } finally {
                            this.f54344a.m78153g();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18220ic, java.io.Flushable
        public void flush() throws IOException {
            InterfaceC18220ic interfaceC18220ic;
            synchronized (C18122bc.this.f54338b) {
                try {
                    C18122bc c18122bc = C18122bc.this;
                    if (c18122bc.f54339c) {
                        throw new IllegalStateException("closed");
                    }
                    if (c18122bc.f54343g != null) {
                        interfaceC18220ic = C18122bc.this.f54343g;
                    } else {
                        C18122bc c18122bc2 = C18122bc.this;
                        if (c18122bc2.f54340d && c18122bc2.f54338b.m79076B() > 0) {
                            throw new IOException("source is closed");
                        }
                        interfaceC18220ic = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (interfaceC18220ic != null) {
                this.f54344a.m78152a(interfaceC18220ic.timeout());
                try {
                    interfaceC18220ic.flush();
                } finally {
                    this.f54344a.m78153g();
                }
            }
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18220ic
        public C18248kc timeout() {
            return this.f54344a;
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.bc$b */
    public final class b implements InterfaceC18234jc {

        /* JADX INFO: renamed from: a */
        public final C18248kc f54346a = new C18248kc();

        public b() {
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18234jc
        /* JADX INFO: renamed from: c */
        public long mo77914c(C18261lb c18261lb, long j) throws IOException {
            synchronized (C18122bc.this.f54338b) {
                try {
                    if (C18122bc.this.f54340d) {
                        throw new IllegalStateException("closed");
                    }
                    while (C18122bc.this.f54338b.m79076B() == 0) {
                        C18122bc c18122bc = C18122bc.this;
                        if (c18122bc.f54339c) {
                            return -1L;
                        }
                        this.f54346a.m78997a(c18122bc.f54338b);
                    }
                    long jMo77914c = C18122bc.this.f54338b.mo77914c(c18261lb, j);
                    C18122bc.this.f54338b.notifyAll();
                    return jMo77914c;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18234jc, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            synchronized (C18122bc.this.f54338b) {
                C18122bc c18122bc = C18122bc.this;
                c18122bc.f54340d = true;
                c18122bc.f54338b.notifyAll();
            }
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18234jc
        public C18248kc timeout() {
            return this.f54346a;
        }
    }

    public C18122bc(long j) {
        if (j < 1) {
            throw new IllegalArgumentException(OooO00o.OooO0O0(j, "maxBufferSize < 1: "));
        }
        this.f54337a = j;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC18220ic m78026a() {
        return this.f54341e;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC18234jc m78028b() {
        return this.f54342f;
    }

    /* JADX INFO: renamed from: a */
    public void m78027a(InterfaceC18220ic interfaceC18220ic) throws IOException {
        boolean z;
        C18261lb c18261lb;
        while (true) {
            synchronized (this.f54338b) {
                try {
                    if (this.f54343g != null) {
                        throw new IllegalStateException("sink already folded");
                    }
                    if (this.f54338b.mo78389f()) {
                        this.f54340d = true;
                        this.f54343g = interfaceC18220ic;
                        return;
                    } else {
                        z = this.f54339c;
                        c18261lb = new C18261lb();
                        C18261lb c18261lb2 = this.f54338b;
                        c18261lb.mo78029b(c18261lb2, c18261lb2.f55631b);
                        this.f54338b.notifyAll();
                    }
                } finally {
                }
            }
            try {
                interfaceC18220ic.mo78029b(c18261lb, c18261lb.f55631b);
                if (z) {
                    interfaceC18220ic.close();
                } else {
                    interfaceC18220ic.flush();
                }
            } catch (Throwable th) {
                synchronized (this.f54338b) {
                    this.f54340d = true;
                    this.f54338b.notifyAll();
                    throw th;
                }
            }
        }
    }
}
