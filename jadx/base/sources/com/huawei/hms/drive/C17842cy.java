package com.huawei.hms.drive;

import com.huawei.hms.drive.C17843cz;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import oOo00OoO.C34524OooO0Oo;
import oOo00OoO.C34527OooO0oO;
import oOo00OoO.InterfaceC34525OooO0o;
import oOo00OoO.InterfaceC34526OooO0o0;

/* JADX INFO: renamed from: com.huawei.hms.drive.cy */
/* JADX INFO: loaded from: classes6.dex */
public final class C17842cy implements Closeable {

    /* JADX INFO: renamed from: q */
    static final /* synthetic */ boolean f53220q = true;

    /* JADX INFO: renamed from: r */
    private static final ExecutorService f53221r = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C17806bp.m76335a("OkHttp Http2Connection", true));

    /* JADX INFO: renamed from: a */
    final boolean f53224a;

    /* JADX INFO: renamed from: b */
    final c f53225b;

    /* JADX INFO: renamed from: d */
    final String f53227d;

    /* JADX INFO: renamed from: e */
    int f53228e;

    /* JADX INFO: renamed from: f */
    int f53229f;

    /* JADX INFO: renamed from: g */
    final InterfaceC17848dd f53230g;

    /* JADX INFO: renamed from: i */
    long f53232i;

    /* JADX INFO: renamed from: k */
    final C17849de f53234k;

    /* JADX INFO: renamed from: l */
    boolean f53235l;

    /* JADX INFO: renamed from: m */
    final Socket f53236m;

    /* JADX INFO: renamed from: n */
    final C17846db f53237n;

    /* JADX INFO: renamed from: o */
    final e f53238o;

    /* JADX INFO: renamed from: p */
    final Set<Integer> f53239p;

    /* JADX INFO: renamed from: s */
    private boolean f53240s;

    /* JADX INFO: renamed from: t */
    private final ScheduledExecutorService f53241t;

    /* JADX INFO: renamed from: u */
    private final ExecutorService f53242u;

    /* JADX INFO: renamed from: c */
    final Map<Integer, C17845da> f53226c = new LinkedHashMap();

    /* JADX INFO: renamed from: v */
    private long f53243v = 0;

    /* JADX INFO: renamed from: w */
    private long f53244w = 0;

    /* JADX INFO: renamed from: x */
    private long f53245x = 0;

    /* JADX INFO: renamed from: y */
    private long f53246y = 0;

    /* JADX INFO: renamed from: z */
    private long f53247z = 0;

    /* JADX INFO: renamed from: A */
    private long f53222A = 0;

    /* JADX INFO: renamed from: B */
    private long f53223B = 0;

    /* JADX INFO: renamed from: h */
    long f53231h = 0;

    /* JADX INFO: renamed from: j */
    C17849de f53233j = new C17849de();

    /* JADX INFO: renamed from: com.huawei.hms.drive.cy$b */
    public final class b extends AbstractRunnableC17805bo {
        public b() {
            super("OkHttp %s ping", C17842cy.this.f53227d);
        }

        @Override // com.huawei.hms.drive.AbstractRunnableC17805bo
        /* JADX INFO: renamed from: f */
        public void mo76260f() {
            boolean z;
            synchronized (C17842cy.this) {
                if (C17842cy.this.f53244w < C17842cy.this.f53243v) {
                    z = true;
                } else {
                    C17842cy.m76568d(C17842cy.this);
                    z = false;
                }
            }
            if (z) {
                C17842cy.this.m76572f();
            } else {
                C17842cy.this.m76589a(false, 1, 0);
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.drive.cy$c */
    public static abstract class c {

        /* JADX INFO: renamed from: j */
        public static final c f53279j = new c() { // from class: com.huawei.hms.drive.cy.c.1
            @Override // com.huawei.hms.drive.C17842cy.c
            /* JADX INFO: renamed from: a */
            public void mo76417a(C17845da c17845da) throws IOException {
                c17845da.m76657a(EnumC17837ct.REFUSED_STREAM);
            }
        };

        /* JADX INFO: renamed from: a */
        public void mo76416a(C17842cy c17842cy) {
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo76417a(C17845da c17845da) throws IOException;
    }

    /* JADX INFO: renamed from: com.huawei.hms.drive.cy$d */
    public final class d extends AbstractRunnableC17805bo {

        /* JADX INFO: renamed from: a */
        final boolean f53280a;

        /* JADX INFO: renamed from: b */
        final int f53281b;

        /* JADX INFO: renamed from: d */
        final int f53282d;

        public d(boolean z, int i, int i2) {
            super("OkHttp %s ping %08x%08x", C17842cy.this.f53227d, Integer.valueOf(i), Integer.valueOf(i2));
            this.f53280a = z;
            this.f53281b = i;
            this.f53282d = i2;
        }

        @Override // com.huawei.hms.drive.AbstractRunnableC17805bo
        /* JADX INFO: renamed from: f */
        public void mo76260f() {
            C17842cy.this.m76589a(this.f53280a, this.f53281b, this.f53282d);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.drive.cy$e */
    public class e extends AbstractRunnableC17805bo implements C17843cz.b {

        /* JADX INFO: renamed from: a */
        final C17843cz f53284a;

        public e(C17843cz c17843cz) {
            super("OkHttp %s", C17842cy.this.f53227d);
            this.f53284a = c17843cz;
        }

        @Override // com.huawei.hms.drive.C17843cz.b
        /* JADX INFO: renamed from: a */
        public void mo76602a() {
        }

        /* JADX INFO: renamed from: b */
        public void m76612b(boolean z, C17849de c17849de) {
            C17845da[] c17845daArr;
            long j;
            synchronized (C17842cy.this.f53237n) {
                synchronized (C17842cy.this) {
                    try {
                        int iM76712d = C17842cy.this.f53234k.m76712d();
                        if (z) {
                            C17842cy.this.f53234k.m76705a();
                        }
                        C17842cy.this.f53234k.m76706a(c17849de);
                        int iM76712d2 = C17842cy.this.f53234k.m76712d();
                        c17845daArr = null;
                        if (iM76712d2 == -1 || iM76712d2 == iM76712d) {
                            j = 0;
                        } else {
                            j = iM76712d2 - iM76712d;
                            if (!C17842cy.this.f53226c.isEmpty()) {
                                c17845daArr = (C17845da[]) C17842cy.this.f53226c.values().toArray(new C17845da[C17842cy.this.f53226c.size()]);
                            }
                        }
                    } finally {
                    }
                }
                try {
                    C17842cy c17842cy = C17842cy.this;
                    c17842cy.f53237n.m76686a(c17842cy.f53234k);
                } catch (IOException unused) {
                    C17842cy.this.m76572f();
                }
            }
            if (c17845daArr != null) {
                for (C17845da c17845da : c17845daArr) {
                    synchronized (c17845da) {
                        c17845da.m76656a(j);
                    }
                }
            }
            C17842cy.f53221r.execute(new AbstractRunnableC17805bo("OkHttp %s settings", C17842cy.this.f53227d) { // from class: com.huawei.hms.drive.cy.e.3
                @Override // com.huawei.hms.drive.AbstractRunnableC17805bo
                /* JADX INFO: renamed from: f */
                public void mo76260f() {
                    C17842cy c17842cy2 = C17842cy.this;
                    c17842cy2.f53225b.mo76416a(c17842cy2);
                }
            });
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.huawei.hms.drive.AbstractRunnableC17805bo
        /* JADX INFO: renamed from: f */
        public void mo76260f() throws Throwable {
            EnumC17837ct enumC17837ct;
            EnumC17837ct enumC17837ct2 = EnumC17837ct.INTERNAL_ERROR;
            try {
                try {
                    try {
                        this.f53284a.m76626a(this);
                        while (this.f53284a.m76627a(false, (C17843cz.b) this)) {
                        }
                        EnumC17837ct enumC17837ct3 = EnumC17837ct.NO_ERROR;
                        try {
                            enumC17837ct2 = EnumC17837ct.CANCEL;
                            C17842cy.this.m76587a(enumC17837ct3, enumC17837ct2);
                            enumC17837ct = enumC17837ct3;
                        } catch (IOException unused) {
                            enumC17837ct2 = EnumC17837ct.PROTOCOL_ERROR;
                            C17842cy c17842cy = C17842cy.this;
                            c17842cy.m76587a(enumC17837ct2, enumC17837ct2);
                            enumC17837ct = c17842cy;
                        }
                    } catch (Throwable th) {
                        th = th;
                        try {
                            C17842cy.this.m76587a(enumC17837ct, enumC17837ct2);
                        } catch (IOException unused2) {
                        }
                        C17806bp.m76338a(this.f53284a);
                        throw th;
                    }
                } catch (IOException unused3) {
                } catch (Throwable th2) {
                    th = th2;
                    enumC17837ct = enumC17837ct2;
                    C17842cy.this.m76587a(enumC17837ct, enumC17837ct2);
                    C17806bp.m76338a(this.f53284a);
                    throw th;
                }
            } catch (IOException unused4) {
            }
            C17806bp.m76338a(this.f53284a);
        }

        @Override // com.huawei.hms.drive.C17843cz.b
        /* JADX INFO: renamed from: a */
        public void mo76603a(int i, int i2, int i3, boolean z) {
        }

        @Override // com.huawei.hms.drive.C17843cz.b
        /* JADX INFO: renamed from: a */
        public void mo76607a(int i, EnumC17837ct enumC17837ct, C34527OooO0oO c34527OooO0oO) {
            C17845da[] c17845daArr;
            c34527OooO0oO.OooO0OO();
            synchronized (C17842cy.this) {
                c17845daArr = (C17845da[]) C17842cy.this.f53226c.values().toArray(new C17845da[C17842cy.this.f53226c.size()]);
                C17842cy.this.f53240s = true;
            }
            for (C17845da c17845da : c17845daArr) {
                if (c17845da.m76655a() > i && c17845da.m76663c()) {
                    c17845da.m76662c(EnumC17837ct.REFUSED_STREAM);
                    C17842cy.this.m76590b(c17845da.m76655a());
                }
            }
        }

        @Override // com.huawei.hms.drive.C17843cz.b
        /* JADX INFO: renamed from: a */
        public void mo76610a(boolean z, int i, InterfaceC34525OooO0o interfaceC34525OooO0o, int i2) throws IOException {
            if (C17842cy.this.m76596c(i)) {
                C17842cy.this.m76583a(i, interfaceC34525OooO0o, i2, z);
                return;
            }
            C17845da c17845daM76577a = C17842cy.this.m76577a(i);
            if (c17845daM76577a == null) {
                C17842cy.this.m76580a(i, EnumC17837ct.PROTOCOL_ERROR);
                long j = i2;
                C17842cy.this.m76585a(j);
                interfaceC34525OooO0o.skip(j);
                return;
            }
            c17845daM76577a.m76659a(interfaceC34525OooO0o, i2);
            if (z) {
                c17845daM76577a.m76669i();
            }
        }

        @Override // com.huawei.hms.drive.C17843cz.b
        /* JADX INFO: renamed from: a */
        public void mo76609a(boolean z, int i, int i2, List<C17838cu> list) {
            if (C17842cy.this.m76596c(i)) {
                C17842cy.this.m76582a(i, list, z);
                return;
            }
            synchronized (C17842cy.this) {
                try {
                    C17845da c17845daM76577a = C17842cy.this.m76577a(i);
                    if (c17845daM76577a == null) {
                        if (C17842cy.this.f53240s) {
                            return;
                        }
                        C17842cy c17842cy = C17842cy.this;
                        if (i <= c17842cy.f53228e) {
                            return;
                        }
                        if (i % 2 == c17842cy.f53229f % 2) {
                            return;
                        }
                        final C17845da c17845da = new C17845da(i, C17842cy.this, false, z, C17806bp.m76349b(list));
                        C17842cy c17842cy2 = C17842cy.this;
                        c17842cy2.f53228e = i;
                        c17842cy2.f53226c.put(Integer.valueOf(i), c17845da);
                        C17842cy.f53221r.execute(new AbstractRunnableC17805bo("OkHttp %s stream %d", new Object[]{C17842cy.this.f53227d, Integer.valueOf(i)}) { // from class: com.huawei.hms.drive.cy.e.1
                            @Override // com.huawei.hms.drive.AbstractRunnableC17805bo
                            /* JADX INFO: renamed from: f */
                            public void mo76260f() {
                                try {
                                    C17842cy.this.f53225b.mo76417a(c17845da);
                                } catch (IOException e) {
                                    C17858dn.m76756e().mo76729a(4, "Http2Connection.Listener failure for " + C17842cy.this.f53227d, e);
                                    try {
                                        c17845da.m76657a(EnumC17837ct.PROTOCOL_ERROR);
                                    } catch (IOException unused) {
                                    }
                                }
                            }
                        });
                        return;
                    }
                    c17845daM76577a.m76658a(list);
                    if (z) {
                        c17845daM76577a.m76669i();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.huawei.hms.drive.C17843cz.b
        /* JADX INFO: renamed from: a */
        public void mo76606a(int i, EnumC17837ct enumC17837ct) {
            if (C17842cy.this.m76596c(i)) {
                C17842cy.this.m76595c(i, enumC17837ct);
                return;
            }
            C17845da c17845daM76590b = C17842cy.this.m76590b(i);
            if (c17845daM76590b != null) {
                c17845daM76590b.m76662c(enumC17837ct);
            }
        }

        @Override // com.huawei.hms.drive.C17843cz.b
        /* JADX INFO: renamed from: a */
        public void mo76611a(final boolean z, final C17849de c17849de) {
            try {
                C17842cy.this.f53241t.execute(new AbstractRunnableC17805bo("OkHttp %s ACK Settings", new Object[]{C17842cy.this.f53227d}) { // from class: com.huawei.hms.drive.cy.e.2
                    @Override // com.huawei.hms.drive.AbstractRunnableC17805bo
                    /* JADX INFO: renamed from: f */
                    public void mo76260f() {
                        e.this.m76612b(z, c17849de);
                    }
                });
            } catch (RejectedExecutionException unused) {
            }
        }

        @Override // com.huawei.hms.drive.C17843cz.b
        /* JADX INFO: renamed from: a */
        public void mo76608a(boolean z, int i, int i2) {
            if (!z) {
                try {
                    C17842cy.this.f53241t.execute(C17842cy.this.new d(true, i, i2));
                    return;
                } catch (RejectedExecutionException unused) {
                    return;
                }
            }
            synchronized (C17842cy.this) {
                try {
                    if (i == 1) {
                        C17842cy.m76573g(C17842cy.this);
                    } else if (i == 2) {
                        C17842cy.m76574h(C17842cy.this);
                    } else if (i == 3) {
                        C17842cy.m76575i(C17842cy.this);
                        C17842cy.this.notifyAll();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.huawei.hms.drive.C17843cz.b
        /* JADX INFO: renamed from: a */
        public void mo76605a(int i, long j) {
            if (i == 0) {
                synchronized (C17842cy.this) {
                    C17842cy c17842cy = C17842cy.this;
                    c17842cy.f53232i += j;
                    c17842cy.notifyAll();
                }
                return;
            }
            C17845da c17845daM76577a = C17842cy.this.m76577a(i);
            if (c17845daM76577a != null) {
                synchronized (c17845daM76577a) {
                    c17845daM76577a.m76656a(j);
                }
            }
        }

        @Override // com.huawei.hms.drive.C17843cz.b
        /* JADX INFO: renamed from: a */
        public void mo76604a(int i, int i2, List<C17838cu> list) throws Throwable {
            C17842cy.this.m76581a(i2, list);
        }
    }

    public C17842cy(a aVar) {
        C17849de c17849de = new C17849de();
        this.f53234k = c17849de;
        this.f53235l = false;
        this.f53239p = new LinkedHashSet();
        this.f53230g = aVar.f53275f;
        boolean z = aVar.f53276g;
        this.f53224a = z;
        this.f53225b = aVar.f53274e;
        int i = z ? 1 : 2;
        this.f53229f = i;
        if (z) {
            this.f53229f = i + 2;
        }
        if (z) {
            this.f53233j.m76704a(7, 16777216);
        }
        String str = aVar.f53271b;
        this.f53227d = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, C17806bp.m76335a(C17806bp.m76330a("OkHttp %s Writer", str), false));
        this.f53241t = scheduledThreadPoolExecutor;
        if (aVar.f53277h != 0) {
            b bVar = new b();
            int i2 = aVar.f53277h;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(bVar, i2, i2, TimeUnit.MILLISECONDS);
        }
        this.f53242u = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), C17806bp.m76335a(C17806bp.m76330a("OkHttp %s Push Observer", str), true));
        c17849de.m76704a(7, 65535);
        c17849de.m76704a(5, 16384);
        this.f53232i = c17849de.m76712d();
        Socket socket = aVar.f53270a;
        this.f53236m = socket;
        this.f53237n = new C17846db(aVar.f53273d, z);
        this.f53238o = new e(new C17843cz(aVar.f53272c, z));
        try {
            socket.setTcpNoDelay(true);
        } catch (SocketException unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ long m76568d(C17842cy c17842cy) {
        long j = c17842cy.f53243v;
        c17842cy.f53243v = 1 + j;
        return j;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ long m76573g(C17842cy c17842cy) {
        long j = c17842cy.f53244w;
        c17842cy.f53244w = 1 + j;
        return j;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ long m76574h(C17842cy c17842cy) {
        long j = c17842cy.f53246y;
        c17842cy.f53246y = 1 + j;
        return j;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ long m76575i(C17842cy c17842cy) {
        long j = c17842cy.f53222A;
        c17842cy.f53222A = 1 + j;
        return j;
    }

    /* JADX INFO: renamed from: c */
    public boolean m76596c(int i) {
        return i != 0 && (i & 1) == 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        m76587a(EnumC17837ct.NO_ERROR, EnumC17837ct.CANCEL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m76572f() {
        try {
            EnumC17837ct enumC17837ct = EnumC17837ct.PROTOCOL_ERROR;
            m76587a(enumC17837ct, enumC17837ct);
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized C17845da m76590b(int i) {
        C17845da c17845daRemove;
        c17845daRemove = this.f53226c.remove(Integer.valueOf(i));
        notifyAll();
        return c17845daRemove;
    }

    /* JADX INFO: renamed from: d */
    public void m76597d() {
        synchronized (this) {
            try {
                long j = this.f53246y;
                long j2 = this.f53245x;
                if (j < j2) {
                    return;
                }
                this.f53245x = j2 + 1;
                this.f53223B = System.nanoTime() + 1000000000;
                try {
                    this.f53241t.execute(new AbstractRunnableC17805bo("OkHttp %s ping", this.f53227d) { // from class: com.huawei.hms.drive.cy.3
                        @Override // com.huawei.hms.drive.AbstractRunnableC17805bo
                        /* JADX INFO: renamed from: f */
                        public void mo76260f() {
                            C17842cy.this.m76589a(false, 2, 0);
                        }
                    });
                } catch (RejectedExecutionException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized C17845da m76577a(int i) {
        return this.f53226c.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: c */
    public void m76594c() throws IOException {
        m76588a(true);
    }

    /* JADX INFO: renamed from: com.huawei.hms.drive.cy$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        Socket f53270a;

        /* JADX INFO: renamed from: b */
        String f53271b;

        /* JADX INFO: renamed from: c */
        InterfaceC34525OooO0o f53272c;

        /* JADX INFO: renamed from: d */
        InterfaceC34526OooO0o0 f53273d;

        /* JADX INFO: renamed from: e */
        c f53274e = c.f53279j;

        /* JADX INFO: renamed from: f */
        InterfaceC17848dd f53275f = InterfaceC17848dd.f53354a;

        /* JADX INFO: renamed from: g */
        boolean f53276g;

        /* JADX INFO: renamed from: h */
        int f53277h;

        public a(boolean z) {
            this.f53276g = z;
        }

        /* JADX INFO: renamed from: a */
        public a m76600a(Socket socket, String str, InterfaceC34525OooO0o interfaceC34525OooO0o, InterfaceC34526OooO0o0 interfaceC34526OooO0o0) {
            this.f53270a = socket;
            this.f53271b = str;
            this.f53272c = interfaceC34525OooO0o;
            this.f53273d = interfaceC34526OooO0o0;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m76599a(c cVar) {
            this.f53274e = cVar;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m76598a(int i) {
            this.f53277h = i;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public C17842cy m76601a() {
            return new C17842cy(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized int m76576a() {
        return this.f53234k.m76711c(Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: c */
    public void m76595c(final int i, final EnumC17837ct enumC17837ct) {
        m76562a(new AbstractRunnableC17805bo("OkHttp %s Push Reset[%s]", new Object[]{this.f53227d, Integer.valueOf(i)}) { // from class: com.huawei.hms.drive.cy.7
            @Override // com.huawei.hms.drive.AbstractRunnableC17805bo
            /* JADX INFO: renamed from: f */
            public void mo76260f() {
                C17842cy.this.f53230g.mo76700a(i, enumC17837ct);
                synchronized (C17842cy.this) {
                    C17842cy.this.f53239p.remove(Integer.valueOf(i));
                }
            }
        });
    }

    /* JADX INFO: renamed from: b */
    private C17845da m76566b(int i, List<C17838cu> list, boolean z) throws Throwable {
        Throwable th;
        boolean z2 = !z;
        synchronized (this.f53237n) {
            try {
                try {
                    try {
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
            synchronized (this) {
                try {
                    if (this.f53229f > 1073741823) {
                        try {
                            m76586a(EnumC17837ct.REFUSED_STREAM);
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    }
                    if (!this.f53240s) {
                        int i2 = this.f53229f;
                        this.f53229f = i2 + 2;
                        C17845da c17845da = new C17845da(i2, this, z2, false, null);
                        boolean z3 = !z || this.f53232i == 0 || c17845da.f53316b == 0;
                        if (c17845da.m76661b()) {
                            this.f53226c.put(Integer.valueOf(i2), c17845da);
                        }
                        if (i == 0) {
                            try {
                                this.f53237n.m76688a(z2, i2, i, list);
                            } catch (IOException e2) {
                                m76590b(c17845da.m76655a());
                                throw e2;
                            }
                        } else if (!this.f53224a) {
                            this.f53237n.m76682a(i, i2, list);
                        } else {
                            throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                        }
                        if (z3) {
                            this.f53237n.m76691b();
                        }
                        return c17845da;
                    }
                    throw new C17836cs();
                } catch (Throwable th6) {
                    th = th6;
                    th = th;
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m76585a(long j) {
        long j2 = this.f53231h + j;
        this.f53231h = j2;
        if (j2 >= this.f53233j.m76712d() / 2) {
            m76579a(0, this.f53231h);
            this.f53231h = 0L;
        }
    }

    /* JADX INFO: renamed from: a */
    public C17845da m76578a(List<C17838cu> list, boolean z) throws IOException {
        return m76566b(0, list, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r4), r2);
        r6 = r2;
        r8.f53232i -= r6;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m76584a(int i, boolean z, C34524OooO0Oo c34524OooO0Oo, long j) throws IOException {
        int iMin;
        long j2;
        if (j == 0) {
            this.f53237n.m76690a(z, i, c34524OooO0Oo, 0);
            return;
        }
        while (j > 0) {
            int iM76693c = this.f53237n.m76693c();
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j3 = this.f53232i;
                            if (j3 > 0) {
                                break;
                            } else if (this.f53226c.containsKey(Integer.valueOf(i))) {
                                wait();
                            } else {
                                throw new IOException("stream closed");
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    throw th;
                }
            }
            j -= j2;
            this.f53237n.m76690a(z && j == 0, i, c34524OooO0Oo, iMin);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m76580a(final int i, final EnumC17837ct enumC17837ct) {
        try {
            this.f53241t.execute(new AbstractRunnableC17805bo("OkHttp %s stream %d", new Object[]{this.f53227d, Integer.valueOf(i)}) { // from class: com.huawei.hms.drive.cy.1
                @Override // com.huawei.hms.drive.AbstractRunnableC17805bo
                /* JADX INFO: renamed from: f */
                public void mo76260f() {
                    try {
                        C17842cy.this.m76592b(i, enumC17837ct);
                    } catch (IOException unused) {
                        C17842cy.this.m76572f();
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public void m76579a(final int i, final long j) {
        try {
            this.f53241t.execute(new AbstractRunnableC17805bo("OkHttp Window Update %s stream %d", new Object[]{this.f53227d, Integer.valueOf(i)}) { // from class: com.huawei.hms.drive.cy.2
                @Override // com.huawei.hms.drive.AbstractRunnableC17805bo
                /* JADX INFO: renamed from: f */
                public void mo76260f() {
                    try {
                        C17842cy.this.f53237n.m76683a(i, j);
                    } catch (IOException unused) {
                        C17842cy.this.m76572f();
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public void m76592b(int i, EnumC17837ct enumC17837ct) throws IOException {
        this.f53237n.m76684a(i, enumC17837ct);
    }

    /* JADX INFO: renamed from: b */
    public void m76591b() throws IOException {
        this.f53237n.m76691b();
    }

    /* JADX INFO: renamed from: a */
    public void m76589a(boolean z, int i, int i2) {
        try {
            this.f53237n.m76687a(z, i, i2);
        } catch (IOException unused) {
            m76572f();
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized boolean m76593b(long j) {
        if (this.f53240s) {
            return false;
        }
        if (this.f53246y < this.f53245x) {
            if (j >= this.f53223B) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public void m76586a(EnumC17837ct enumC17837ct) throws IOException {
        synchronized (this.f53237n) {
            synchronized (this) {
                if (this.f53240s) {
                    return;
                }
                this.f53240s = true;
                this.f53237n.m76685a(this.f53228e, enumC17837ct, C17806bp.f52954a);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m76587a(EnumC17837ct enumC17837ct, EnumC17837ct enumC17837ct2) throws IOException {
        if (!f53220q && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        C17845da[] c17845daArr = null;
        try {
            m76586a(enumC17837ct);
            e = null;
        } catch (IOException e2) {
            e = e2;
        }
        synchronized (this) {
            try {
                if (!this.f53226c.isEmpty()) {
                    c17845daArr = (C17845da[]) this.f53226c.values().toArray(new C17845da[this.f53226c.size()]);
                    this.f53226c.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c17845daArr != null) {
            for (C17845da c17845da : c17845daArr) {
                try {
                    c17845da.m76657a(enumC17837ct2);
                } catch (IOException e3) {
                    if (e != null) {
                        e = e3;
                    }
                }
            }
        }
        try {
            this.f53237n.close();
        } catch (IOException e4) {
            if (e == null) {
                e = e4;
            }
        }
        try {
            this.f53236m.close();
        } catch (IOException e5) {
            e = e5;
        }
        this.f53241t.shutdown();
        this.f53242u.shutdown();
        if (e != null) {
            throw e;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m76588a(boolean z) throws IOException {
        if (z) {
            this.f53237n.m76679a();
            this.f53237n.m76692b(this.f53233j);
            if (this.f53233j.m76712d() != 65535) {
                this.f53237n.m76683a(0, r5 - 65535);
            }
        }
        new Thread(this.f53238o).start();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:23:0x0041
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX INFO: renamed from: a */
    public void m76581a(final int r9, final java.util.List<com.huawei.hms.drive.C17838cu> r10) throws java.lang.Throwable {
        /*
            r8 = this;
            monitor-enter(r8)
            java.util.Set<java.lang.Integer> r0 = r8.f53239p     // Catch: java.lang.Throwable -> L3c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L3c
            boolean r0 = r0.contains(r1)     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L18
            com.huawei.hms.drive.ct r10 = com.huawei.hms.drive.EnumC17837ct.PROTOCOL_ERROR     // Catch: java.lang.Throwable -> L14
            r8.m76580a(r9, r10)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r0 = move-exception
            r9 = r0
            r3 = r8
            goto L3f
        L18:
            java.util.Set<java.lang.Integer> r0 = r8.f53239p     // Catch: java.lang.Throwable -> L3c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L3c
            r0.add(r1)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L3c
            com.huawei.hms.drive.cy$4 r2 = new com.huawei.hms.drive.cy$4     // Catch: java.util.concurrent.RejectedExecutionException -> L3a
            java.lang.String r4 = "OkHttp %s Push Request[%s]"
            java.lang.String r0 = r8.f53227d     // Catch: java.util.concurrent.RejectedExecutionException -> L3a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch: java.util.concurrent.RejectedExecutionException -> L3a
            java.lang.Object[] r5 = new java.lang.Object[]{r0, r1}     // Catch: java.util.concurrent.RejectedExecutionException -> L3a
            r3 = r8
            r6 = r9
            r7 = r10
            r2.<init>(r4, r5)     // Catch: java.util.concurrent.RejectedExecutionException -> L3b
            r8.m76562a(r2)     // Catch: java.util.concurrent.RejectedExecutionException -> L3b
            return
        L3a:
            r3 = r8
        L3b:
            return
        L3c:
            r0 = move-exception
            r3 = r8
        L3e:
            r9 = r0
        L3f:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L41
            throw r9
        L41:
            r0 = move-exception
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.drive.C17842cy.m76581a(int, java.util.List):void");
    }

    /* JADX INFO: renamed from: a */
    public void m76582a(final int i, final List<C17838cu> list, final boolean z) {
        try {
            try {
                m76562a(new AbstractRunnableC17805bo("OkHttp %s Push Headers[%s]", new Object[]{this.f53227d, Integer.valueOf(i)}) { // from class: com.huawei.hms.drive.cy.5
                    @Override // com.huawei.hms.drive.AbstractRunnableC17805bo
                    /* JADX INFO: renamed from: f */
                    public void mo76260f() {
                        boolean zMo76702a = C17842cy.this.f53230g.mo76702a(i, list, z);
                        if (zMo76702a) {
                            try {
                                C17842cy.this.f53237n.m76684a(i, EnumC17837ct.CANCEL);
                            } catch (IOException unused) {
                                return;
                            }
                        }
                        if (zMo76702a || z) {
                            synchronized (C17842cy.this) {
                                C17842cy.this.f53239p.remove(Integer.valueOf(i));
                            }
                        }
                    }
                });
            } catch (RejectedExecutionException unused) {
            }
        } catch (RejectedExecutionException unused2) {
        }
    }

    /* JADX INFO: renamed from: a */
    public void m76583a(final int i, InterfaceC34525OooO0o interfaceC34525OooO0o, final int i2, final boolean z) throws IOException {
        final C34524OooO0Oo c34524OooO0Oo = new C34524OooO0Oo();
        long j = i2;
        interfaceC34525OooO0o.o0000OOO(j);
        interfaceC34525OooO0o.read(c34524OooO0Oo, j);
        if (c34524OooO0Oo.f123723OooOo == j) {
            m76562a(new AbstractRunnableC17805bo("OkHttp %s Push Data[%s]", new Object[]{this.f53227d, Integer.valueOf(i)}) { // from class: com.huawei.hms.drive.cy.6
                @Override // com.huawei.hms.drive.AbstractRunnableC17805bo
                /* JADX INFO: renamed from: f */
                public void mo76260f() {
                    try {
                        boolean zMo76703a = C17842cy.this.f53230g.mo76703a(i, c34524OooO0Oo, i2, z);
                        if (zMo76703a) {
                            C17842cy.this.f53237n.m76684a(i, EnumC17837ct.CANCEL);
                        }
                        if (zMo76703a || z) {
                            synchronized (C17842cy.this) {
                                C17842cy.this.f53239p.remove(Integer.valueOf(i));
                            }
                        }
                    } catch (IOException unused) {
                    }
                }
            });
        } else {
            throw new IOException(c34524OooO0Oo.f123723OooOo + " != " + i2);
        }
    }

    /* JADX INFO: renamed from: a */
    private synchronized void m76562a(AbstractRunnableC17805bo abstractRunnableC17805bo) {
        if (!this.f53240s) {
            this.f53242u.execute(abstractRunnableC17805bo);
        }
    }
}
