package com.huawei.hms.drive;

import com.huawei.hms.drive.C17838cu;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import oOo00OoO.C34523OooO0OO;
import oOo00OoO.C34524OooO0Oo;
import oOo00OoO.C34547OooOoo;
import oOo00OoO.InterfaceC34525OooO0o;
import oOo00OoO.InterfaceC34544OooOoO;
import oOo00OoO.InterfaceC34548OooOoo0;

/* JADX INFO: renamed from: com.huawei.hms.drive.da */
/* JADX INFO: loaded from: classes6.dex */
public final class C17845da {

    /* JADX INFO: renamed from: i */
    static final /* synthetic */ boolean f53314i = true;

    /* JADX INFO: renamed from: a */
    long f53315a = 0;

    /* JADX INFO: renamed from: b */
    long f53316b;

    /* JADX INFO: renamed from: c */
    final int f53317c;

    /* JADX INFO: renamed from: d */
    final C17842cy f53318d;

    /* JADX INFO: renamed from: e */
    final a f53319e;

    /* JADX INFO: renamed from: f */
    final c f53320f;

    /* JADX INFO: renamed from: g */
    final c f53321g;

    /* JADX INFO: renamed from: h */
    EnumC17837ct f53322h;

    /* JADX INFO: renamed from: j */
    private final Deque<C17788ay> f53323j;

    /* JADX INFO: renamed from: k */
    private C17838cu.a f53324k;

    /* JADX INFO: renamed from: l */
    private boolean f53325l;

    /* JADX INFO: renamed from: m */
    private final b f53326m;

    /* JADX INFO: renamed from: com.huawei.hms.drive.da$a */
    public final class a implements InterfaceC34544OooOoO {

        /* JADX INFO: renamed from: c */
        static final /* synthetic */ boolean f53327c = true;

        /* JADX INFO: renamed from: a */
        boolean f53328a;

        /* JADX INFO: renamed from: b */
        boolean f53329b;

        /* JADX INFO: renamed from: e */
        private final C34524OooO0Oo f53331e = new C34524OooO0Oo();

        public a() {
        }

        /* JADX INFO: renamed from: a */
        private void m76673a(boolean z) throws IOException {
            C17845da c17845da;
            long jMin;
            C17845da c17845da2;
            synchronized (C17845da.this) {
                C17845da.this.f53321g.enter();
                while (true) {
                    try {
                        c17845da = C17845da.this;
                        if (c17845da.f53316b > 0 || this.f53329b || this.f53328a || c17845da.f53322h != null) {
                            break;
                        } else {
                            c17845da.m76672l();
                        }
                    } finally {
                        C17845da.this.f53321g.m76676a();
                    }
                }
                c17845da.f53321g.m76676a();
                C17845da.this.m76671k();
                jMin = Math.min(C17845da.this.f53316b, this.f53331e.f123723OooOo);
                c17845da2 = C17845da.this;
                c17845da2.f53316b -= jMin;
            }
            c17845da2.f53321g.enter();
            try {
                C17845da c17845da3 = C17845da.this;
                c17845da3.f53318d.m76584a(c17845da3.f53317c, z && jMin == this.f53331e.f123723OooOo, this.f53331e, jMin);
                C17845da.this.f53321g.m76676a();
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // oOo00OoO.InterfaceC34544OooOoO, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!f53327c && Thread.holdsLock(C17845da.this)) {
                throw new AssertionError();
            }
            synchronized (C17845da.this) {
                try {
                    if (this.f53328a) {
                        return;
                    }
                    C17845da c17845da = C17845da.this;
                    if (!c17845da.f53319e.f53329b) {
                        if (this.f53331e.f123723OooOo > 0) {
                            while (this.f53331e.f123723OooOo > 0) {
                                m76673a(true);
                            }
                        } else {
                            c17845da.f53318d.m76584a(c17845da.f53317c, true, (C34524OooO0Oo) null, 0L);
                        }
                    }
                    synchronized (C17845da.this) {
                        this.f53328a = true;
                    }
                    C17845da.this.f53318d.m76591b();
                    C17845da.this.m76670j();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // oOo00OoO.InterfaceC34544OooOoO, java.io.Flushable
        public void flush() throws IOException {
            if (!f53327c && Thread.holdsLock(C17845da.this)) {
                throw new AssertionError();
            }
            synchronized (C17845da.this) {
                C17845da.this.m76671k();
            }
            while (this.f53331e.f123723OooOo > 0) {
                m76673a(false);
                C17845da.this.f53318d.m76591b();
            }
        }

        @Override // oOo00OoO.InterfaceC34544OooOoO
        public C34547OooOoo timeout() {
            return C17845da.this.f53321g;
        }

        @Override // oOo00OoO.InterfaceC34544OooOoO
        public void write(C34524OooO0Oo c34524OooO0Oo, long j) throws IOException {
            if (!f53327c && Thread.holdsLock(C17845da.this)) {
                throw new AssertionError();
            }
            this.f53331e.write(c34524OooO0Oo, j);
            while (this.f53331e.f123723OooOo >= 16384) {
                m76673a(false);
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.drive.da$c */
    public class c extends C34523OooO0OO {
        public c() {
        }

        /* JADX INFO: renamed from: a */
        public void m76676a() throws IOException {
            if (exit()) {
                throw newTimeoutException(null);
            }
        }

        @Override // oOo00OoO.C34523OooO0OO
        public IOException newTimeoutException(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // oOo00OoO.C34523OooO0OO
        public void timedOut() {
            C17845da.this.m76660b(EnumC17837ct.CANCEL);
            C17845da.this.f53318d.m76597d();
        }
    }

    public C17845da(int i, C17842cy c17842cy, boolean z, boolean z2, C17788ay c17788ay) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f53323j = arrayDeque;
        this.f53320f = new c();
        this.f53321g = new c();
        this.f53322h = null;
        if (c17842cy == null) {
            throw new NullPointerException("connection == null");
        }
        this.f53317c = i;
        this.f53318d = c17842cy;
        this.f53316b = c17842cy.f53234k.m76712d();
        b bVar = new b(c17842cy.f53233j.m76712d());
        this.f53326m = bVar;
        a aVar = new a();
        this.f53319e = aVar;
        bVar.f53334b = z2;
        aVar.f53329b = z;
        if (c17788ay != null) {
            arrayDeque.add(c17788ay);
        }
        if (m76663c() && c17788ay != null) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (!m76663c() && c17788ay == null) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m76663c() {
        return this.f53318d.f53224a == ((this.f53317c & 1) == 1);
    }

    /* JADX INFO: renamed from: d */
    public synchronized C17788ay m76664d() throws IOException {
        this.f53320f.enter();
        while (this.f53323j.isEmpty() && this.f53322h == null) {
            try {
                m76672l();
            } catch (Throwable th) {
                this.f53320f.m76676a();
                throw th;
            }
        }
        this.f53320f.m76676a();
        if (this.f53323j.isEmpty()) {
            throw new C17850df(this.f53322h);
        }
        return this.f53323j.removeFirst();
    }

    /* JADX INFO: renamed from: e */
    public C34547OooOoo m76665e() {
        return this.f53320f;
    }

    /* JADX INFO: renamed from: f */
    public C34547OooOoo m76666f() {
        return this.f53321g;
    }

    /* JADX INFO: renamed from: g */
    public InterfaceC34548OooOoo0 m76667g() {
        return this.f53326m;
    }

    /* JADX INFO: renamed from: h */
    public InterfaceC34544OooOoO m76668h() {
        synchronized (this) {
            try {
                if (!this.f53325l && !m76663c()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f53319e;
    }

    /* JADX INFO: renamed from: i */
    public void m76669i() {
        boolean zM76661b;
        if (!f53314i && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            this.f53326m.f53334b = true;
            zM76661b = m76661b();
            notifyAll();
        }
        if (zM76661b) {
            return;
        }
        this.f53318d.m76590b(this.f53317c);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x002b  */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m76670j() throws IOException {
        boolean z;
        boolean zM76661b;
        if (!f53314i && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            try {
                b bVar = this.f53326m;
                if (bVar.f53334b || !bVar.f53333a) {
                    z = false;
                } else {
                    a aVar = this.f53319e;
                    if (aVar.f53329b || aVar.f53328a) {
                        z = true;
                    }
                }
                zM76661b = m76661b();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            m76657a(EnumC17837ct.CANCEL);
        } else {
            if (zM76661b) {
                return;
            }
            this.f53318d.m76590b(this.f53317c);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m76671k() throws IOException {
        a aVar = this.f53319e;
        if (aVar.f53328a) {
            throw new IOException("stream closed");
        }
        if (aVar.f53329b) {
            throw new IOException("stream finished");
        }
        if (this.f53322h != null) {
            throw new C17850df(this.f53322h);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m76672l() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.drive.da$b */
    public final class b implements InterfaceC34548OooOoo0 {

        /* JADX INFO: renamed from: c */
        static final /* synthetic */ boolean f53332c = true;

        /* JADX INFO: renamed from: a */
        boolean f53333a;

        /* JADX INFO: renamed from: b */
        boolean f53334b;

        /* JADX INFO: renamed from: e */
        private final C34524OooO0Oo f53336e = new C34524OooO0Oo();

        /* JADX INFO: renamed from: f */
        private final C34524OooO0Oo f53337f = new C34524OooO0Oo();

        /* JADX INFO: renamed from: g */
        private final long f53338g;

        public b(long j) {
            this.f53338g = j;
        }

        /* JADX INFO: renamed from: a */
        private void m76674a(long j) {
            if (!f53332c && Thread.holdsLock(C17845da.this)) {
                throw new AssertionError();
            }
            C17845da.this.f53318d.m76585a(j);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            long j;
            ArrayList arrayList;
            C17838cu.a aVar;
            synchronized (C17845da.this) {
                try {
                    this.f53333a = true;
                    C34524OooO0Oo c34524OooO0Oo = this.f53337f;
                    j = c34524OooO0Oo.f123723OooOo;
                    c34524OooO0Oo.OooO00o();
                    if (C17845da.this.f53323j.isEmpty() || C17845da.this.f53324k == null) {
                        arrayList = null;
                        aVar = null;
                    } else {
                        arrayList = new ArrayList(C17845da.this.f53323j);
                        C17845da.this.f53323j.clear();
                        aVar = C17845da.this.f53324k;
                    }
                    C17845da.this.notifyAll();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (j > 0) {
                m76674a(j);
            }
            C17845da.this.m76670j();
            if (aVar != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    aVar.m76527a((C17788ay) it.next());
                }
            }
        }

        @Override // oOo00OoO.InterfaceC34548OooOoo0
        public long read(C34524OooO0Oo c34524OooO0Oo, long j) throws IOException {
            EnumC17837ct enumC17837ct;
            long j2;
            long j3;
            C17838cu.a aVar;
            C17788ay c17788ay;
            if (j < 0) {
                throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0O0(j, "byteCount < 0: "));
            }
            while (true) {
                synchronized (C17845da.this) {
                    try {
                        C17845da.this.f53320f.enter();
                        try {
                            C17845da c17845da = C17845da.this;
                            enumC17837ct = c17845da.f53322h;
                            if (enumC17837ct == null) {
                                enumC17837ct = null;
                            }
                            if (this.f53333a) {
                                throw new IOException("stream closed");
                            }
                            if (c17845da.f53323j.isEmpty() || C17845da.this.f53324k == null) {
                                C34524OooO0Oo c34524OooO0Oo2 = this.f53337f;
                                long j4 = c34524OooO0Oo2.f123723OooOo;
                                if (j4 > 0) {
                                    j2 = c34524OooO0Oo2.read(c34524OooO0Oo, Math.min(j, j4));
                                    C17845da c17845da2 = C17845da.this;
                                    long j5 = c17845da2.f53315a + j2;
                                    c17845da2.f53315a = j5;
                                    if (enumC17837ct == null) {
                                        j3 = -1;
                                        if (j5 >= c17845da2.f53318d.f53233j.m76712d() / 2) {
                                            C17845da c17845da3 = C17845da.this;
                                            c17845da3.f53318d.m76579a(c17845da3.f53317c, c17845da3.f53315a);
                                            C17845da.this.f53315a = 0L;
                                        }
                                    } else {
                                        j3 = -1;
                                    }
                                } else {
                                    j3 = -1;
                                    if (this.f53334b || enumC17837ct != null) {
                                        j2 = -1;
                                    } else {
                                        C17845da.this.m76672l();
                                        C17845da.this.f53320f.m76676a();
                                    }
                                }
                                aVar = null;
                                c17788ay = null;
                            } else {
                                c17788ay = (C17788ay) C17845da.this.f53323j.removeFirst();
                                aVar = C17845da.this.f53324k;
                                j2 = -1;
                                j3 = -1;
                            }
                            if (c17788ay == null || aVar == null) {
                                break;
                            }
                            aVar.m76527a(c17788ay);
                        } finally {
                            C17845da.this.f53320f.m76676a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (j2 != j3) {
                m76674a(j2);
                return j2;
            }
            if (enumC17837ct == null) {
                return j3;
            }
            throw new C17850df(enumC17837ct);
        }

        @Override // oOo00OoO.InterfaceC34548OooOoo0
        public C34547OooOoo timeout() {
            return C17845da.this.f53320f;
        }

        /* JADX INFO: renamed from: a */
        public void m76675a(InterfaceC34525OooO0o interfaceC34525OooO0o, long j) throws IOException {
            boolean z;
            boolean z2;
            long j2;
            if (!f53332c && Thread.holdsLock(C17845da.this)) {
                throw new AssertionError();
            }
            while (j > 0) {
                synchronized (C17845da.this) {
                    z = this.f53334b;
                    z2 = this.f53337f.f123723OooOo + j > this.f53338g;
                }
                if (z2) {
                    interfaceC34525OooO0o.skip(j);
                    C17845da.this.m76660b(EnumC17837ct.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z) {
                    interfaceC34525OooO0o.skip(j);
                    return;
                }
                long j3 = interfaceC34525OooO0o.read(this.f53336e, j);
                if (j3 != -1) {
                    j -= j3;
                    synchronized (C17845da.this) {
                        try {
                            if (this.f53333a) {
                                C34524OooO0Oo c34524OooO0Oo = this.f53336e;
                                j2 = c34524OooO0Oo.f123723OooOo;
                                c34524OooO0Oo.OooO00o();
                            } else {
                                C34524OooO0Oo c34524OooO0Oo2 = this.f53337f;
                                boolean z3 = c34524OooO0Oo2.f123723OooOo == 0;
                                c34524OooO0Oo2.o0000O00(this.f53336e);
                                if (z3) {
                                    C17845da.this.notifyAll();
                                }
                                j2 = 0;
                            }
                        } finally {
                        }
                    }
                    if (j2 > 0) {
                        m76674a(j2);
                    }
                } else {
                    throw new EOFException();
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public int m76655a() {
        return this.f53317c;
    }

    /* JADX INFO: renamed from: b */
    public synchronized boolean m76661b() {
        try {
            if (this.f53322h != null) {
                return false;
            }
            b bVar = this.f53326m;
            if (bVar.f53334b || bVar.f53333a) {
                a aVar = this.f53319e;
                if (aVar.f53329b || aVar.f53328a) {
                    if (this.f53325l) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m76657a(EnumC17837ct enumC17837ct) throws IOException {
        if (m76654d(enumC17837ct)) {
            this.f53318d.m76592b(this.f53317c, enumC17837ct);
        }
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m76662c(EnumC17837ct enumC17837ct) {
        if (this.f53322h == null) {
            this.f53322h = enumC17837ct;
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m76658a(List<C17838cu> list) {
        boolean zM76661b;
        if (!f53314i && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            this.f53325l = true;
            this.f53323j.add(C17806bp.m76349b(list));
            zM76661b = m76661b();
            notifyAll();
        }
        if (zM76661b) {
            return;
        }
        this.f53318d.m76590b(this.f53317c);
    }

    /* JADX INFO: renamed from: b */
    public void m76660b(EnumC17837ct enumC17837ct) {
        if (m76654d(enumC17837ct)) {
            this.f53318d.m76580a(this.f53317c, enumC17837ct);
        }
    }

    /* JADX INFO: renamed from: d */
    private boolean m76654d(EnumC17837ct enumC17837ct) {
        if (!f53314i && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            try {
                if (this.f53322h != null) {
                    return false;
                }
                if (this.f53326m.f53334b && this.f53319e.f53329b) {
                    return false;
                }
                this.f53322h = enumC17837ct;
                notifyAll();
                this.f53318d.m76590b(this.f53317c);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m76659a(InterfaceC34525OooO0o interfaceC34525OooO0o, int i) throws IOException {
        if (!f53314i && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        this.f53326m.m76675a(interfaceC34525OooO0o, i);
    }

    /* JADX INFO: renamed from: a */
    public void m76656a(long j) {
        this.f53316b += j;
        if (j > 0) {
            notifyAll();
        }
    }
}
