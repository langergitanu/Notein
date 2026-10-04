package com.huawei.hms.network.embedded;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.z8 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18443z8 {

    /* JADX INFO: renamed from: k */
    public static final int f56813k = 1;

    /* JADX INFO: renamed from: l */
    public static final int f56814l = 2;

    /* JADX INFO: renamed from: m */
    public static final C18303ob f56815m = C18303ob.m79299d("OkHttp cache v1\n");

    /* JADX INFO: renamed from: n */
    public static final C18303ob f56816n = C18303ob.m79299d("OkHttp DIRTY :(\n");

    /* JADX INFO: renamed from: o */
    public static final long f56817o = 32;

    /* JADX INFO: renamed from: a */
    public RandomAccessFile f56818a;

    /* JADX INFO: renamed from: b */
    public Thread f56819b;

    /* JADX INFO: renamed from: c */
    public InterfaceC18234jc f56820c;

    /* JADX INFO: renamed from: e */
    public long f56822e;

    /* JADX INFO: renamed from: f */
    public boolean f56823f;

    /* JADX INFO: renamed from: g */
    public final C18303ob f56824g;

    /* JADX INFO: renamed from: i */
    public final long f56826i;

    /* JADX INFO: renamed from: j */
    public int f56827j;

    /* JADX INFO: renamed from: d */
    public final C18261lb f56821d = new C18261lb();

    /* JADX INFO: renamed from: h */
    public final C18261lb f56825h = new C18261lb();

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.z8$a */
    public class a implements InterfaceC18234jc {

        /* JADX INFO: renamed from: a */
        public final C18248kc f56828a = new C18248kc();

        /* JADX INFO: renamed from: b */
        public C18430y8 f56829b;

        /* JADX INFO: renamed from: c */
        public long f56830c;

        public a() {
            this.f56829b = new C18430y8(C18443z8.this.f56818a.getChannel());
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        
            return r9;
         */
        @Override // com.huawei.hms.network.embedded.InterfaceC18234jc
        /* JADX INFO: renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public long mo77914c(C18261lb c18261lb, long j) throws IOException {
            long j2;
            char c;
            C18443z8 c18443z8;
            if (this.f56829b == null) {
                throw new IllegalStateException("closed");
            }
            synchronized (C18443z8.this) {
                while (true) {
                    try {
                        long j3 = this.f56830c;
                        C18443z8 c18443z82 = C18443z8.this;
                        j2 = c18443z82.f56822e;
                        long jMin = -1;
                        if (j3 != j2) {
                            long jM79076B = j2 - c18443z82.f56825h.m79076B();
                            long j4 = this.f56830c;
                            if (j4 < jM79076B) {
                                c = 2;
                            } else {
                                jMin = Math.min(j, j2 - j4);
                                C18443z8.this.f56825h.m79080a(c18261lb, this.f56830c - jM79076B, jMin);
                                this.f56830c += jMin;
                            }
                        } else if (!c18443z82.f56823f) {
                            if (c18443z82.f56819b == null) {
                                c18443z82.f56819b = Thread.currentThread();
                                c = 1;
                                break;
                            }
                            this.f56828a.m78997a(c18443z82);
                        } else {
                            break;
                        }
                    } finally {
                    }
                }
                if (c == 2) {
                    long jMin2 = Math.min(j, j2 - this.f56830c);
                    this.f56829b.m79993a(this.f56830c + 32, c18261lb, jMin2);
                    this.f56830c += jMin2;
                    return jMin2;
                }
                try {
                    C18443z8 c18443z83 = C18443z8.this;
                    long jMo77914c = c18443z83.f56820c.mo77914c(c18443z83.f56821d, c18443z83.f56826i);
                    if (jMo77914c == -1) {
                        C18443z8.this.m80043a(j2);
                        synchronized (C18443z8.this) {
                            C18443z8 c18443z84 = C18443z8.this;
                            c18443z84.f56819b = null;
                            c18443z84.notifyAll();
                        }
                        return -1L;
                    }
                    long jMin3 = Math.min(jMo77914c, j);
                    C18443z8.this.f56821d.m79080a(c18261lb, 0L, jMin3);
                    this.f56830c += jMin3;
                    this.f56829b.m79994b(j2 + 32, C18443z8.this.f56821d.m80717clone(), jMo77914c);
                    synchronized (C18443z8.this) {
                        try {
                            C18443z8 c18443z85 = C18443z8.this;
                            c18443z85.f56825h.mo78029b(c18443z85.f56821d, jMo77914c);
                            long jM79076B2 = C18443z8.this.f56825h.m79076B();
                            C18443z8 c18443z86 = C18443z8.this;
                            if (jM79076B2 > c18443z86.f56826i) {
                                C18261lb c18261lb2 = c18443z86.f56825h;
                                c18261lb2.skip(c18261lb2.m79076B() - C18443z8.this.f56826i);
                            }
                            c18443z8 = C18443z8.this;
                            c18443z8.f56822e += jMo77914c;
                        } finally {
                        }
                    }
                    synchronized (c18443z8) {
                        C18443z8 c18443z87 = C18443z8.this;
                        c18443z87.f56819b = null;
                        c18443z87.notifyAll();
                    }
                    return jMin3;
                } catch (Throwable th) {
                    synchronized (C18443z8.this) {
                        C18443z8 c18443z88 = C18443z8.this;
                        c18443z88.f56819b = null;
                        c18443z88.notifyAll();
                        throw th;
                    }
                }
            }
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18234jc, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f56829b == null) {
                return;
            }
            RandomAccessFile randomAccessFile = null;
            this.f56829b = null;
            synchronized (C18443z8.this) {
                try {
                    C18443z8 c18443z8 = C18443z8.this;
                    int i = c18443z8.f56827j - 1;
                    c18443z8.f56827j = i;
                    if (i == 0) {
                        RandomAccessFile randomAccessFile2 = c18443z8.f56818a;
                        c18443z8.f56818a = null;
                        randomAccessFile = randomAccessFile2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (randomAccessFile != null) {
                C18313p8.m79378a(randomAccessFile);
            }
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18234jc
        public C18248kc timeout() {
            return this.f56828a;
        }
    }

    public C18443z8(RandomAccessFile randomAccessFile, InterfaceC18234jc interfaceC18234jc, long j, C18303ob c18303ob, long j2) {
        this.f56818a = randomAccessFile;
        this.f56820c = interfaceC18234jc;
        this.f56823f = interfaceC18234jc == null;
        this.f56822e = j;
        this.f56824g = c18303ob;
        this.f56826i = j2;
    }

    /* JADX INFO: renamed from: a */
    public static C18443z8 m80039a(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        C18430y8 c18430y8 = new C18430y8(randomAccessFile.getChannel());
        C18261lb c18261lb = new C18261lb();
        c18430y8.m79993a(0L, c18261lb, 32L);
        if (!c18261lb.mo78375a(r10.mo78736j()).equals(f56815m)) {
            throw new IOException("unreadable cache file");
        }
        long j = c18261lb.readLong();
        long j2 = c18261lb.readLong();
        C18261lb c18261lb2 = new C18261lb();
        c18430y8.m79993a(32 + j, c18261lb2, j2);
        return new C18443z8(randomAccessFile, null, j, c18261lb2.mo78401r(), 0L);
    }

    /* JADX INFO: renamed from: b */
    public C18303ob m80045b() {
        return this.f56824g;
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC18234jc m80046c() {
        synchronized (this) {
            try {
                if (this.f56818a == null) {
                    return null;
                }
                this.f56827j++;
                return new a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static C18443z8 m80040a(File file, InterfaceC18234jc interfaceC18234jc, C18303ob c18303ob, long j) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        C18443z8 c18443z8 = new C18443z8(randomAccessFile, interfaceC18234jc, 0L, c18303ob, j);
        randomAccessFile.setLength(0L);
        c18443z8.m80041a(f56816n, -1L, -1L);
        return c18443z8;
    }

    /* JADX INFO: renamed from: b */
    private void m80042b(long j) throws IOException {
        C18261lb c18261lb = new C18261lb();
        c18261lb.mo78267b(this.f56824g);
        new C18430y8(this.f56818a.getChannel()).m79994b(32 + j, c18261lb, this.f56824g.mo78736j());
    }

    /* JADX INFO: renamed from: a */
    public void m80043a(long j) throws IOException {
        m80042b(j);
        this.f56818a.getChannel().force(false);
        m80041a(f56815m, j, this.f56824g.mo78736j());
        this.f56818a.getChannel().force(false);
        synchronized (this) {
            this.f56823f = true;
        }
        C18313p8.m79378a(this.f56820c);
        this.f56820c = null;
    }

    /* JADX INFO: renamed from: a */
    private void m80041a(C18303ob c18303ob, long j, long j2) throws IOException {
        C18261lb c18261lb = new C18261lb();
        c18261lb.mo78267b(c18303ob);
        c18261lb.writeLong(j);
        c18261lb.writeLong(j2);
        if (c18261lb.m79076B() != 32) {
            throw new IllegalArgumentException();
        }
        new C18430y8(this.f56818a.getChannel()).m79994b(0L, c18261lb, 32L);
    }

    /* JADX INFO: renamed from: a */
    public boolean m80044a() {
        return this.f56818a == null;
    }
}
