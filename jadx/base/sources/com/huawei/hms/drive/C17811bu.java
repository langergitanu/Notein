package com.huawei.hms.drive;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import oOo00OoO.InterfaceC34526OooO0o0;

/* JADX INFO: renamed from: com.huawei.hms.drive.bu */
/* JADX INFO: loaded from: classes6.dex */
public final class C17811bu implements Closeable, Flushable {

    /* JADX INFO: renamed from: a */
    static final Pattern f52998a = Pattern.compile("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: j */
    static final /* synthetic */ boolean f52999j = true;

    /* JADX INFO: renamed from: b */
    final InterfaceC17851dg f53000b;

    /* JADX INFO: renamed from: c */
    final int f53001c;

    /* JADX INFO: renamed from: d */
    InterfaceC34526OooO0o0 f53002d;

    /* JADX INFO: renamed from: e */
    final LinkedHashMap<String, b> f53003e;

    /* JADX INFO: renamed from: f */
    int f53004f;

    /* JADX INFO: renamed from: g */
    boolean f53005g;

    /* JADX INFO: renamed from: h */
    boolean f53006h;

    /* JADX INFO: renamed from: i */
    boolean f53007i;

    /* JADX INFO: renamed from: k */
    private long f53008k;

    /* JADX INFO: renamed from: l */
    private long f53009l;

    /* JADX INFO: renamed from: m */
    private long f53010m;

    /* JADX INFO: renamed from: n */
    private final Executor f53011n;

    /* JADX INFO: renamed from: o */
    private final Runnable f53012o;

    /* JADX INFO: renamed from: com.huawei.hms.drive.bu$a */
    public final class a {

        /* JADX INFO: renamed from: a */
        final b f53013a;

        /* JADX INFO: renamed from: b */
        final boolean[] f53014b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C17811bu f53015c;

        /* JADX INFO: renamed from: d */
        private boolean f53016d;

        /* JADX INFO: renamed from: a */
        public void m76378a() {
            if (this.f53013a.f53022f != this) {
                return;
            }
            int i = 0;
            while (true) {
                C17811bu c17811bu = this.f53015c;
                if (i >= c17811bu.f53001c) {
                    this.f53013a.f53022f = null;
                    return;
                } else {
                    try {
                        c17811bu.f53000b.mo76714a(this.f53013a.f53020d[i]);
                    } catch (IOException unused) {
                    }
                    i++;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public void m76379b() throws IOException {
            synchronized (this.f53015c) {
                try {
                    if (this.f53016d) {
                        throw new IllegalStateException();
                    }
                    if (this.f53013a.f53022f == this) {
                        this.f53015c.m76373a(this, false);
                    }
                    this.f53016d = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.drive.bu$b */
    public final class b {

        /* JADX INFO: renamed from: a */
        final String f53017a;

        /* JADX INFO: renamed from: b */
        final long[] f53018b;

        /* JADX INFO: renamed from: c */
        final File[] f53019c;

        /* JADX INFO: renamed from: d */
        final File[] f53020d;

        /* JADX INFO: renamed from: e */
        boolean f53021e;

        /* JADX INFO: renamed from: f */
        a f53022f;

        /* JADX INFO: renamed from: g */
        long f53023g;

        /* JADX INFO: renamed from: a */
        public void m76380a(InterfaceC34526OooO0o0 interfaceC34526OooO0o0) throws IOException {
            for (long j : this.f53018b) {
                interfaceC34526OooO0o0.writeByte(32).Oooo0oo(j);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private synchronized void m76372d() {
        if (m76376b()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m76373a(a aVar, boolean z) throws IOException {
        b bVar = aVar.f53013a;
        if (bVar.f53022f != aVar) {
            throw new IllegalStateException();
        }
        if (z && !bVar.f53021e) {
            for (int i = 0; i < this.f53001c; i++) {
                if (!aVar.f53014b[i]) {
                    aVar.m76379b();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                if (!this.f53000b.mo76716b(bVar.f53020d[i])) {
                    aVar.m76379b();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.f53001c; i2++) {
            File file = bVar.f53020d[i2];
            if (!z) {
                this.f53000b.mo76714a(file);
            } else if (this.f53000b.mo76716b(file)) {
                File file2 = bVar.f53019c[i2];
                this.f53000b.mo76715a(file, file2);
                long j = bVar.f53018b[i2];
                long jMo76717c = this.f53000b.mo76717c(file2);
                bVar.f53018b[i2] = jMo76717c;
                this.f53009l = (this.f53009l - j) + jMo76717c;
            }
        }
        this.f53004f++;
        bVar.f53022f = null;
        if (bVar.f53021e || z) {
            bVar.f53021e = true;
            this.f53002d.o00000Oo("CLEAN").writeByte(32);
            this.f53002d.o00000Oo(bVar.f53017a);
            bVar.m76380a(this.f53002d);
            this.f53002d.writeByte(10);
            if (z) {
                long j2 = this.f53010m;
                this.f53010m = 1 + j2;
                bVar.f53023g = j2;
            }
        } else {
            this.f53003e.remove(bVar.f53017a);
            this.f53002d.o00000Oo("REMOVE").writeByte(32);
            this.f53002d.o00000Oo(bVar.f53017a);
            this.f53002d.writeByte(10);
        }
        this.f53002d.flush();
        if (this.f53009l > this.f53008k || m76374a()) {
            this.f53011n.execute(this.f53012o);
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized boolean m76376b() {
        return this.f53006h;
    }

    /* JADX INFO: renamed from: c */
    public void m76377c() throws IOException {
        while (this.f53009l > this.f53008k) {
            m76375a(this.f53003e.values().iterator().next());
        }
        this.f53007i = false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            if (this.f53005g && !this.f53006h) {
                for (b bVar : (b[]) this.f53003e.values().toArray(new b[this.f53003e.size()])) {
                    a aVar = bVar.f53022f;
                    if (aVar != null) {
                        aVar.m76379b();
                    }
                }
                m76377c();
                this.f53002d.close();
                this.f53002d = null;
                this.f53006h = true;
                return;
            }
            this.f53006h = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public synchronized void flush() throws IOException {
        if (this.f53005g) {
            m76372d();
            m76377c();
            this.f53002d.flush();
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m76374a() {
        int i = this.f53004f;
        return i >= 2000 && i >= this.f53003e.size();
    }

    /* JADX INFO: renamed from: a */
    public boolean m76375a(b bVar) throws IOException {
        a aVar = bVar.f53022f;
        if (aVar != null) {
            aVar.m76378a();
        }
        for (int i = 0; i < this.f53001c; i++) {
            this.f53000b.mo76714a(bVar.f53019c[i]);
            long j = this.f53009l;
            long[] jArr = bVar.f53018b;
            this.f53009l = j - jArr[i];
            jArr[i] = 0;
        }
        this.f53004f++;
        this.f53002d.o00000Oo("REMOVE").writeByte(32).o00000Oo(bVar.f53017a).writeByte(10);
        this.f53003e.remove(bVar.f53017a);
        if (m76374a()) {
            this.f53011n.execute(this.f53012o);
        }
        return true;
    }
}
