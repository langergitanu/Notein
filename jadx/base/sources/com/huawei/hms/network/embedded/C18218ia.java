package com.huawei.hms.network.embedded;

import androidx.concurrent.futures.OooO00o;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.ia */
/* JADX INFO: loaded from: classes9.dex */
public final class C18218ia {

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ boolean f55265m = true;

    /* JADX INFO: renamed from: a */
    public long f55266a = 0;

    /* JADX INFO: renamed from: b */
    public long f55267b;

    /* JADX INFO: renamed from: c */
    public final int f55268c;

    /* JADX INFO: renamed from: d */
    public final C18176fa f55269d;

    /* JADX INFO: renamed from: e */
    public final Deque<C18377u7> f55270e;

    /* JADX INFO: renamed from: f */
    public boolean f55271f;

    /* JADX INFO: renamed from: g */
    public final b f55272g;

    /* JADX INFO: renamed from: h */
    public final a f55273h;

    /* JADX INFO: renamed from: i */
    public final c f55274i;

    /* JADX INFO: renamed from: j */
    public final c f55275j;

    /* JADX INFO: renamed from: k */
    public EnumC18120ba f55276k;

    /* JADX INFO: renamed from: l */
    public IOException f55277l;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.ia$a */
    public final class a implements InterfaceC18220ic {

        /* JADX INFO: renamed from: f */
        public static final long f55278f = 16384;

        /* JADX INFO: renamed from: g */
        public static final /* synthetic */ boolean f55279g = true;

        /* JADX INFO: renamed from: a */
        public final C18261lb f55280a = new C18261lb();

        /* JADX INFO: renamed from: b */
        public C18377u7 f55281b;

        /* JADX INFO: renamed from: c */
        public boolean f55282c;

        /* JADX INFO: renamed from: d */
        public boolean f55283d;

        public a() {
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18220ic
        /* JADX INFO: renamed from: b */
        public void mo78029b(C18261lb c18261lb, long j) throws IOException {
            if (!f55279g && Thread.holdsLock(C18218ia.this)) {
                throw new AssertionError();
            }
            this.f55280a.mo78029b(c18261lb, j);
            while (this.f55280a.m79076B() >= 16384) {
                m78820a(false);
            }
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18220ic, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!f55279g && Thread.holdsLock(C18218ia.this)) {
                throw new AssertionError();
            }
            synchronized (C18218ia.this) {
                try {
                    if (this.f55282c) {
                        return;
                    }
                    if (!C18218ia.this.f55273h.f55283d) {
                        boolean z = this.f55280a.m79076B() > 0;
                        if (this.f55281b != null) {
                            while (this.f55280a.m79076B() > 0) {
                                m78820a(false);
                            }
                            C18218ia c18218ia = C18218ia.this;
                            c18218ia.f55269d.m78463a(c18218ia.f55268c, true, C18313p8.m79371a(this.f55281b));
                        } else if (z) {
                            while (this.f55280a.m79076B() > 0) {
                                m78820a(true);
                            }
                        } else {
                            C18218ia c18218ia2 = C18218ia.this;
                            c18218ia2.f55269d.m78462a(c18218ia2.f55268c, true, (C18261lb) null, 0L);
                        }
                    }
                    synchronized (C18218ia.this) {
                        this.f55282c = true;
                    }
                    C18218ia.this.f55269d.flush();
                    C18218ia.this.m78797a();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18220ic, java.io.Flushable
        public void flush() throws IOException {
            if (!f55279g && Thread.holdsLock(C18218ia.this)) {
                throw new AssertionError();
            }
            synchronized (C18218ia.this) {
                C18218ia.this.m78805b();
            }
            while (this.f55280a.m79076B() > 0) {
                m78820a(false);
                C18218ia.this.f55269d.flush();
            }
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18220ic
        public C18248kc timeout() {
            return C18218ia.this.f55275j;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void m78820a(boolean z) throws IOException {
            C18218ia c18218ia;
            long jMin;
            C18218ia c18218ia2;
            boolean z2;
            synchronized (C18218ia.this) {
                C18218ia.this.f55275j.m78929g();
                while (true) {
                    try {
                        c18218ia = C18218ia.this;
                        if (c18218ia.f55267b > 0 || this.f55283d || this.f55282c || c18218ia.f55276k != null) {
                            break;
                        } else {
                            c18218ia.m78817m();
                        }
                    } finally {
                        C18218ia.this.f55275j.m78829k();
                    }
                }
                c18218ia.f55275j.m78829k();
                C18218ia.this.m78805b();
                jMin = Math.min(C18218ia.this.f55267b, this.f55280a.m79076B());
                c18218ia2 = C18218ia.this;
                c18218ia2.f55267b -= jMin;
            }
            c18218ia2.f55275j.m78929g();
            if (z) {
                try {
                    z2 = jMin == this.f55280a.m79076B();
                } catch (Throwable th) {
                    throw th;
                }
            }
            boolean z3 = z2;
            C18218ia c18218ia3 = C18218ia.this;
            c18218ia3.f55269d.m78462a(c18218ia3.f55268c, z3, this.f55280a, jMin);
            C18218ia.this.f55275j.m78829k();
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.ia$b */
    public final class b implements InterfaceC18234jc {

        /* JADX INFO: renamed from: h */
        public static final /* synthetic */ boolean f55285h = true;

        /* JADX INFO: renamed from: a */
        public final C18261lb f55286a = new C18261lb();

        /* JADX INFO: renamed from: b */
        public final C18261lb f55287b = new C18261lb();

        /* JADX INFO: renamed from: c */
        public final long f55288c;

        /* JADX INFO: renamed from: d */
        public C18377u7 f55289d;

        /* JADX INFO: renamed from: e */
        public boolean f55290e;

        /* JADX INFO: renamed from: f */
        public boolean f55291f;

        public b(long j) {
            this.f55288c = j;
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0096  */
        @Override // com.huawei.hms.network.embedded.InterfaceC18234jc
        /* JADX INFO: renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public long mo77914c(C18261lb c18261lb, long j) throws Throwable {
            Throwable c18288na;
            long jMo77914c;
            if (j < 0) {
                throw new IllegalArgumentException(OooO00o.OooO0O0(j, "byteCount < 0: "));
            }
            while (true) {
                synchronized (C18218ia.this) {
                    try {
                        C18218ia.this.f55274i.m78929g();
                        try {
                            C18218ia c18218ia = C18218ia.this;
                            if (c18218ia.f55276k != null) {
                                c18288na = c18218ia.f55277l;
                                if (c18288na == null) {
                                    c18288na = new C18288na(C18218ia.this.f55276k);
                                }
                            } else {
                                c18288na = null;
                            }
                            if (this.f55290e) {
                                throw new IOException("stream closed");
                            }
                            if (this.f55287b.m79076B() > 0) {
                                C18261lb c18261lb2 = this.f55287b;
                                jMo77914c = c18261lb2.mo77914c(c18261lb, Math.min(j, c18261lb2.m79076B()));
                                C18218ia c18218ia2 = C18218ia.this;
                                long j2 = c18218ia2.f55266a + jMo77914c;
                                c18218ia2.f55266a = j2;
                                if (c18288na == null && j2 >= c18218ia2.f55269d.f54791t.m79194c() / 2) {
                                    C18218ia c18218ia3 = C18218ia.this;
                                    c18218ia3.f55269d.m78457a(c18218ia3.f55268c, c18218ia3.f55266a);
                                    C18218ia.this.f55266a = 0L;
                                }
                            } else {
                                if (this.f55291f || c18288na != null) {
                                    break;
                                }
                                C18218ia.this.m78817m();
                                C18218ia.this.f55274i.m78829k();
                            }
                        } finally {
                            C18218ia.this.f55274i.m78829k();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (jMo77914c == -1) {
                    m78824b(jMo77914c);
                    return jMo77914c;
                }
                if (c18288na == null) {
                    return -1L;
                }
                throw c18288na;
            }
            jMo77914c = -1;
            C18218ia.this.f55274i.m78829k();
            if (jMo77914c == -1) {
            }
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18234jc, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            long jM79076B;
            synchronized (C18218ia.this) {
                this.f55290e = true;
                jM79076B = this.f55287b.m79076B();
                this.f55287b.m79095s();
                C18218ia.this.notifyAll();
            }
            if (jM79076B > 0) {
                m78824b(jM79076B);
            }
            C18218ia.this.m78797a();
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18234jc
        public C18248kc timeout() {
            return C18218ia.this.f55274i;
        }

        /* JADX INFO: renamed from: b */
        private void m78824b(long j) {
            if (!f55285h && Thread.holdsLock(C18218ia.this)) {
                throw new AssertionError();
            }
            C18218ia.this.f55269d.m78476k(j);
        }

        /* JADX INFO: renamed from: a */
        public void m78826a(InterfaceC18289nb interfaceC18289nb, long j) throws IOException {
            boolean z;
            boolean z2;
            long jM79076B;
            if (!f55285h && Thread.holdsLock(C18218ia.this)) {
                throw new AssertionError();
            }
            while (j > 0) {
                synchronized (C18218ia.this) {
                    z = this.f55291f;
                    z2 = this.f55287b.m79076B() + j > this.f55288c;
                }
                if (z2) {
                    interfaceC18289nb.skip(j);
                    C18218ia.this.m78799a(EnumC18120ba.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z) {
                    interfaceC18289nb.skip(j);
                    return;
                }
                long jMo77914c = interfaceC18289nb.mo77914c(this.f55286a, j);
                if (jMo77914c == -1) {
                    throw new EOFException();
                }
                j -= jMo77914c;
                synchronized (C18218ia.this) {
                    try {
                        if (this.f55290e) {
                            jM79076B = this.f55286a.m79076B();
                            this.f55286a.m79095s();
                        } else {
                            boolean z3 = this.f55287b.m79076B() == 0;
                            this.f55287b.mo78257a((InterfaceC18234jc) this.f55286a);
                            if (z3) {
                                C18218ia.this.notifyAll();
                            }
                            jM79076B = 0;
                        }
                    } finally {
                    }
                }
                if (jM79076B > 0) {
                    m78824b(jM79076B);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.ia$c */
    public class c extends C18233jb {
        public c() {
        }

        @Override // com.huawei.hms.network.embedded.C18233jb
        /* JADX INFO: renamed from: b */
        public IOException mo78827b(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // com.huawei.hms.network.embedded.C18233jb
        /* JADX INFO: renamed from: i */
        public void mo78828i() {
            C18218ia.this.m78799a(EnumC18120ba.CANCEL);
            C18218ia.this.f55269d.m78480v();
        }

        /* JADX INFO: renamed from: k */
        public void m78829k() throws IOException {
            if (m78930h()) {
                throw mo78827b((IOException) null);
            }
        }
    }

    public C18218ia(int i, C18176fa c18176fa, boolean z, boolean z2, C18377u7 c18377u7) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f55270e = arrayDeque;
        this.f55274i = new c();
        this.f55275j = new c();
        if (c18176fa == null) {
            throw new NullPointerException("connection == null");
        }
        this.f55268c = i;
        this.f55269d = c18176fa;
        this.f55267b = c18176fa.f54792u.m79194c();
        b bVar = new b(c18176fa.f54791t.m79194c());
        this.f55272g = bVar;
        a aVar = new a();
        this.f55273h = aVar;
        bVar.f55291f = z2;
        aVar.f55283d = z;
        if (c18377u7 != null) {
            arrayDeque.add(c18377u7);
        }
        if (m78812h() && c18377u7 != null) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (!m78812h() && c18377u7 == null) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x002b  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m78797a() throws IOException {
        boolean z;
        boolean zM78813i;
        if (!f55265m && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            try {
                b bVar = this.f55272g;
                if (bVar.f55291f || !bVar.f55290e) {
                    z = false;
                } else {
                    a aVar = this.f55273h;
                    if (aVar.f55283d || aVar.f55282c) {
                        z = true;
                    }
                }
                zM78813i = m78813i();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            m78800a(EnumC18120ba.CANCEL, (IOException) null);
        } else {
            if (zM78813i) {
                return;
            }
            this.f55269d.m78474f(this.f55268c);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m78805b() throws IOException {
        a aVar = this.f55273h;
        if (aVar.f55282c) {
            throw new IOException("stream closed");
        }
        if (aVar.f55283d) {
            throw new IOException("stream finished");
        }
        EnumC18120ba enumC18120ba = this.f55276k;
        if (enumC18120ba != null) {
            IOException iOException = this.f55277l;
            if (iOException == null) {
                throw new C18288na(enumC18120ba);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public C18176fa m78807c() {
        return this.f55269d;
    }

    /* JADX INFO: renamed from: d */
    public synchronized EnumC18120ba m78808d() {
        return this.f55276k;
    }

    /* JADX INFO: renamed from: e */
    public int m78809e() {
        return this.f55268c;
    }

    /* JADX INFO: renamed from: f */
    public InterfaceC18220ic m78810f() {
        synchronized (this) {
            try {
                if (!this.f55271f && !m78812h()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f55273h;
    }

    /* JADX INFO: renamed from: g */
    public InterfaceC18234jc m78811g() {
        return this.f55272g;
    }

    /* JADX INFO: renamed from: h */
    public boolean m78812h() {
        return this.f55269d.f54772a == ((this.f55268c & 1) == 1);
    }

    /* JADX INFO: renamed from: i */
    public synchronized boolean m78813i() {
        try {
            if (this.f55276k != null) {
                return false;
            }
            b bVar = this.f55272g;
            if (bVar.f55291f || bVar.f55290e) {
                a aVar = this.f55273h;
                if (aVar.f55283d || aVar.f55282c) {
                    if (this.f55271f) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: j */
    public C18248kc m78814j() {
        return this.f55274i;
    }

    /* JADX INFO: renamed from: k */
    public synchronized C18377u7 m78815k() throws IOException {
        this.f55274i.m78929g();
        while (this.f55270e.isEmpty() && this.f55276k == null) {
            try {
                m78817m();
            } catch (Throwable th) {
                this.f55274i.m78829k();
                throw th;
            }
        }
        this.f55274i.m78829k();
        if (this.f55270e.isEmpty()) {
            IOException iOException = this.f55277l;
            if (iOException != null) {
                throw iOException;
            }
            throw new C18288na(this.f55276k);
        }
        return this.f55270e.removeFirst();
    }

    /* JADX INFO: renamed from: l */
    public synchronized C18377u7 m78816l() throws IOException {
        try {
            EnumC18120ba enumC18120ba = this.f55276k;
            if (enumC18120ba != null) {
                IOException iOException = this.f55277l;
                if (iOException != null) {
                    throw iOException;
                }
                throw new C18288na(enumC18120ba);
            }
            b bVar = this.f55272g;
            if (!bVar.f55291f || !bVar.f55286a.mo78389f() || !this.f55272g.f55287b.mo78389f()) {
                throw new IllegalStateException("too early; can't read the trailers yet");
            }
        } finally {
        }
        return this.f55272g.f55289d != null ? this.f55272g.f55289d : C18313p8.f55894c;
    }

    /* JADX INFO: renamed from: m */
    public void m78817m() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    /* JADX INFO: renamed from: n */
    public C18248kc m78818n() {
        return this.f55275j;
    }

    /* JADX INFO: renamed from: a */
    public void m78798a(long j) {
        this.f55267b += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m78806b(EnumC18120ba enumC18120ba) {
        if (this.f55276k == null) {
            this.f55276k = enumC18120ba;
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: b */
    private boolean m78796b(EnumC18120ba enumC18120ba, IOException iOException) {
        if (!f55265m && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            try {
                if (this.f55276k == null && (!this.f55272g.f55291f || !this.f55273h.f55283d)) {
                    this.f55276k = enumC18120ba;
                    this.f55277l = iOException;
                    notifyAll();
                    this.f55269d.m78474f(this.f55268c);
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m78799a(EnumC18120ba enumC18120ba) {
        if (m78796b(enumC18120ba, null)) {
            this.f55269d.m78471c(this.f55268c, enumC18120ba);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m78800a(EnumC18120ba enumC18120ba, IOException iOException) throws IOException {
        if (m78796b(enumC18120ba, iOException)) {
            this.f55269d.m78470b(this.f55268c, enumC18120ba);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m78801a(InterfaceC18289nb interfaceC18289nb, int i) throws IOException {
        if (!f55265m && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        this.f55272g.m78826a(interfaceC18289nb, i);
    }

    /* JADX INFO: renamed from: a */
    public void m78802a(C18377u7 c18377u7) {
        synchronized (this) {
            try {
                if (this.f55273h.f55283d) {
                    throw new IllegalStateException("already finished");
                }
                if (c18377u7.m79619d() == 0) {
                    throw new IllegalArgumentException("trailers.size() == 0");
                }
                this.f55273h.f55281b = c18377u7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m78803a(C18377u7 c18377u7, boolean z) {
        boolean zM78813i;
        if (!f55265m && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            try {
                if (this.f55271f && z) {
                    this.f55272g.f55289d = c18377u7;
                } else {
                    this.f55271f = true;
                    this.f55270e.add(c18377u7);
                }
                if (z) {
                    this.f55272g.f55291f = true;
                }
                zM78813i = m78813i();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zM78813i) {
            return;
        }
        this.f55269d.m78474f(this.f55268c);
    }

    /* JADX INFO: renamed from: a */
    public void m78804a(List<C18134ca> list, boolean z, boolean z2) throws IOException {
        if (!f55265m && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (list == null) {
            throw new NullPointerException("headers == null");
        }
        synchronized (this) {
            try {
                this.f55271f = true;
                if (z) {
                    this.f55273h.f55283d = true;
                }
            } finally {
            }
        }
        if (!z2) {
            synchronized (this.f55269d) {
                z2 = this.f55269d.f54790s == 0;
            }
        }
        this.f55269d.m78463a(this.f55268c, z, list);
        if (z2) {
            this.f55269d.flush();
        }
    }
}
