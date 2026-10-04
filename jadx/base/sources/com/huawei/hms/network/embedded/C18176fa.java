package com.huawei.hms.network.embedded;

import com.huawei.hms.network.embedded.C18204ha;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
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

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.fa */
/* JADX INFO: loaded from: classes9.dex */
public final class C18176fa implements Closeable {

    /* JADX INFO: renamed from: A */
    public static final int f54765A = 1;

    /* JADX INFO: renamed from: B */
    public static final int f54766B = 2;

    /* JADX INFO: renamed from: C */
    public static final int f54767C = 3;

    /* JADX INFO: renamed from: D */
    public static final long f54768D = 1000000000;

    /* JADX INFO: renamed from: E */
    public static final ExecutorService f54769E = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C18313p8.m79375a("OkHttp Http2Connection", true));

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ boolean f54770F = true;

    /* JADX INFO: renamed from: z */
    public static final int f54771z = 16777216;

    /* JADX INFO: renamed from: a */
    public final boolean f54772a;

    /* JADX INFO: renamed from: b */
    public final j f54773b;

    /* JADX INFO: renamed from: d */
    public final String f54775d;

    /* JADX INFO: renamed from: e */
    public int f54776e;

    /* JADX INFO: renamed from: f */
    public int f54777f;

    /* JADX INFO: renamed from: g */
    public boolean f54778g;

    /* JADX INFO: renamed from: h */
    public final ScheduledExecutorService f54779h;

    /* JADX INFO: renamed from: i */
    public final ExecutorService f54780i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC18260la f54781j;

    /* JADX INFO: renamed from: s */
    public long f54790s;

    /* JADX INFO: renamed from: u */
    public final C18274ma f54792u;

    /* JADX INFO: renamed from: v */
    public final Socket f54793v;

    /* JADX INFO: renamed from: w */
    public final C18232ja f54794w;

    /* JADX INFO: renamed from: x */
    public final l f54795x;

    /* JADX INFO: renamed from: y */
    public final Set<Integer> f54796y;

    /* JADX INFO: renamed from: c */
    public final Map<Integer, C18218ia> f54774c = new LinkedHashMap();

    /* JADX INFO: renamed from: k */
    public long f54782k = 0;

    /* JADX INFO: renamed from: l */
    public long f54783l = 0;

    /* JADX INFO: renamed from: m */
    public long f54784m = 0;

    /* JADX INFO: renamed from: n */
    public long f54785n = 0;

    /* JADX INFO: renamed from: o */
    public long f54786o = 0;

    /* JADX INFO: renamed from: p */
    public long f54787p = 0;

    /* JADX INFO: renamed from: q */
    public long f54788q = 0;

    /* JADX INFO: renamed from: r */
    public long f54789r = 0;

    /* JADX INFO: renamed from: t */
    public C18274ma f54791t = new C18274ma();

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.fa$a */
    public class a extends AbstractRunnableC18300o8 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f54797b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ EnumC18120ba f54798c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Object[] objArr, int i, EnumC18120ba enumC18120ba) {
            super(str, objArr);
            this.f54797b = i;
            this.f54798c = enumC18120ba;
        }

        @Override // com.huawei.hms.network.embedded.AbstractRunnableC18300o8
        /* JADX INFO: renamed from: b */
        public void mo78220b() {
            try {
                C18176fa.this.m78470b(this.f54797b, this.f54798c);
            } catch (IOException e) {
                C18176fa.this.m78445a(e);
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.fa$b */
    public class b extends AbstractRunnableC18300o8 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f54800b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ long f54801c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Object[] objArr, int i, long j) {
            super(str, objArr);
            this.f54800b = i;
            this.f54801c = j;
        }

        @Override // com.huawei.hms.network.embedded.AbstractRunnableC18300o8
        /* JADX INFO: renamed from: b */
        public void mo78220b() {
            try {
                C18176fa.this.f54794w.m78911a(this.f54800b, this.f54801c);
            } catch (IOException e) {
                C18176fa.this.m78445a(e);
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.fa$c */
    public class c extends AbstractRunnableC18300o8 {
        public c(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // com.huawei.hms.network.embedded.AbstractRunnableC18300o8
        /* JADX INFO: renamed from: b */
        public void mo78220b() {
            C18176fa.this.m78468a(false, 2, 0);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.fa$d */
    public class d extends AbstractRunnableC18300o8 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f54804b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ List f54805c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, Object[] objArr, int i, List list) {
            super(str, objArr);
            this.f54804b = i;
            this.f54805c = list;
        }

        @Override // com.huawei.hms.network.embedded.AbstractRunnableC18300o8
        /* JADX INFO: renamed from: b */
        public void mo78220b() {
            if (C18176fa.this.f54781j.mo79069a(this.f54804b, this.f54805c)) {
                try {
                    C18176fa.this.f54794w.m78912a(this.f54804b, EnumC18120ba.CANCEL);
                    synchronized (C18176fa.this) {
                        C18176fa.this.f54796y.remove(Integer.valueOf(this.f54804b));
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.fa$e */
    public class e extends AbstractRunnableC18300o8 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f54807b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ List f54808c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f54809d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, Object[] objArr, int i, List list, boolean z) {
            super(str, objArr);
            this.f54807b = i;
            this.f54808c = list;
            this.f54809d = z;
        }

        @Override // com.huawei.hms.network.embedded.AbstractRunnableC18300o8
        /* JADX INFO: renamed from: b */
        public void mo78220b() {
            boolean zMo79070a = C18176fa.this.f54781j.mo79070a(this.f54807b, this.f54808c, this.f54809d);
            if (zMo79070a) {
                try {
                    C18176fa.this.f54794w.m78912a(this.f54807b, EnumC18120ba.CANCEL);
                } catch (IOException unused) {
                    return;
                }
            }
            if (zMo79070a || this.f54809d) {
                synchronized (C18176fa.this) {
                    C18176fa.this.f54796y.remove(Integer.valueOf(this.f54807b));
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.fa$f */
    public class f extends AbstractRunnableC18300o8 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f54811b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C18261lb f54812c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f54813d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ boolean f54814e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, Object[] objArr, int i, C18261lb c18261lb, int i2, boolean z) {
            super(str, objArr);
            this.f54811b = i;
            this.f54812c = c18261lb;
            this.f54813d = i2;
            this.f54814e = z;
        }

        @Override // com.huawei.hms.network.embedded.AbstractRunnableC18300o8
        /* JADX INFO: renamed from: b */
        public void mo78220b() {
            try {
                boolean zMo79068a = C18176fa.this.f54781j.mo79068a(this.f54811b, this.f54812c, this.f54813d, this.f54814e);
                if (zMo79068a) {
                    C18176fa.this.f54794w.m78912a(this.f54811b, EnumC18120ba.CANCEL);
                }
                if (zMo79068a || this.f54814e) {
                    synchronized (C18176fa.this) {
                        C18176fa.this.f54796y.remove(Integer.valueOf(this.f54811b));
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.fa$g */
    public class g extends AbstractRunnableC18300o8 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f54816b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ EnumC18120ba f54817c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, Object[] objArr, int i, EnumC18120ba enumC18120ba) {
            super(str, objArr);
            this.f54816b = i;
            this.f54817c = enumC18120ba;
        }

        @Override // com.huawei.hms.network.embedded.AbstractRunnableC18300o8
        /* JADX INFO: renamed from: b */
        public void mo78220b() {
            C18176fa.this.f54781j.mo79067a(this.f54816b, this.f54817c);
            synchronized (C18176fa.this) {
                C18176fa.this.f54796y.remove(Integer.valueOf(this.f54816b));
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.fa$h */
    public static class h {

        /* JADX INFO: renamed from: a */
        public Socket f54819a;

        /* JADX INFO: renamed from: b */
        public String f54820b;

        /* JADX INFO: renamed from: c */
        public InterfaceC18289nb f54821c;

        /* JADX INFO: renamed from: d */
        public InterfaceC18275mb f54822d;

        /* JADX INFO: renamed from: e */
        public j f54823e = j.f54828a;

        /* JADX INFO: renamed from: f */
        public InterfaceC18260la f54824f = InterfaceC18260la.f55627a;

        /* JADX INFO: renamed from: g */
        public boolean f54825g;

        /* JADX INFO: renamed from: h */
        public int f54826h;

        public h(boolean z) {
            this.f54825g = z;
        }

        /* JADX INFO: renamed from: a */
        public h m78484a(int i) {
            this.f54826h = i;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public h m78485a(j jVar) {
            this.f54823e = jVar;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public h m78486a(InterfaceC18260la interfaceC18260la) {
            this.f54824f = interfaceC18260la;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public h m78487a(Socket socket) throws IOException {
            SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
            return m78488a(socket, remoteSocketAddress instanceof InetSocketAddress ? ((InetSocketAddress) remoteSocketAddress).getHostName() : remoteSocketAddress.toString(), C18433yb.m80007a(C18433yb.m80010b(socket)), C18433yb.m80006a(C18433yb.m80002a(socket)));
        }

        /* JADX INFO: renamed from: a */
        public h m78488a(Socket socket, String str, InterfaceC18289nb interfaceC18289nb, InterfaceC18275mb interfaceC18275mb) {
            this.f54819a = socket;
            this.f54820b = str;
            this.f54821c = interfaceC18289nb;
            this.f54822d = interfaceC18275mb;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public C18176fa m78489a() {
            return new C18176fa(this);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.fa$i */
    public final class i extends AbstractRunnableC18300o8 {
        public i() {
            super("OkHttp %s ping", C18176fa.this.f54775d);
        }

        @Override // com.huawei.hms.network.embedded.AbstractRunnableC18300o8
        /* JADX INFO: renamed from: b */
        public void mo78220b() {
            boolean z;
            synchronized (C18176fa.this) {
                if (C18176fa.this.f54783l < C18176fa.this.f54782k) {
                    z = true;
                } else {
                    C18176fa.m78450d(C18176fa.this);
                    z = false;
                }
            }
            C18176fa c18176fa = C18176fa.this;
            if (z) {
                c18176fa.m78445a((IOException) null);
            } else {
                c18176fa.m78468a(false, 1, 0);
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.fa$j */
    public static abstract class j {

        /* JADX INFO: renamed from: a */
        public static final j f54828a = new a();

        /* JADX INFO: renamed from: com.huawei.hms.network.embedded.fa$j$a */
        public class a extends j {
            @Override // com.huawei.hms.network.embedded.C18176fa.j
            /* JADX INFO: renamed from: a */
            public void mo78491a(C18218ia c18218ia) throws IOException {
                c18218ia.m78800a(EnumC18120ba.REFUSED_STREAM, (IOException) null);
            }
        }

        /* JADX INFO: renamed from: a */
        public void mo78490a(C18176fa c18176fa) {
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo78491a(C18218ia c18218ia) throws IOException;
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.fa$k */
    public final class k extends AbstractRunnableC18300o8 {

        /* JADX INFO: renamed from: b */
        public final boolean f54829b;

        /* JADX INFO: renamed from: c */
        public final int f54830c;

        /* JADX INFO: renamed from: d */
        public final int f54831d;

        public k(boolean z, int i, int i2) {
            super("OkHttp %s ping %08x%08x", C18176fa.this.f54775d, Integer.valueOf(i), Integer.valueOf(i2));
            this.f54829b = z;
            this.f54830c = i;
            this.f54831d = i2;
        }

        @Override // com.huawei.hms.network.embedded.AbstractRunnableC18300o8
        /* JADX INFO: renamed from: b */
        public void mo78220b() {
            C18176fa.this.m78468a(this.f54829b, this.f54830c, this.f54831d);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.fa$l */
    public class l extends AbstractRunnableC18300o8 implements C18204ha.b {

        /* JADX INFO: renamed from: b */
        public final C18204ha f54833b;

        /* JADX INFO: renamed from: com.huawei.hms.network.embedded.fa$l$a */
        public class a extends AbstractRunnableC18300o8 {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C18218ia f54835b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, Object[] objArr, C18218ia c18218ia) {
                super(str, objArr);
                this.f54835b = c18218ia;
            }

            @Override // com.huawei.hms.network.embedded.AbstractRunnableC18300o8
            /* JADX INFO: renamed from: b */
            public void mo78220b() {
                try {
                    C18176fa.this.f54773b.mo78491a(this.f54835b);
                } catch (IOException e) {
                    C18406wa.m79845f().mo79425a(4, "Http2Connection.Listener failure for " + C18176fa.this.f54775d, e);
                    try {
                        this.f54835b.m78800a(EnumC18120ba.PROTOCOL_ERROR, e);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.huawei.hms.network.embedded.fa$l$b */
        public class b extends AbstractRunnableC18300o8 {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ boolean f54837b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C18274ma f54838c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object[] objArr, boolean z, C18274ma c18274ma) {
                super(str, objArr);
                this.f54837b = z;
                this.f54838c = c18274ma;
            }

            @Override // com.huawei.hms.network.embedded.AbstractRunnableC18300o8
            /* JADX INFO: renamed from: b */
            public void mo78220b() {
                l.this.m78503b(this.f54837b, this.f54838c);
            }
        }

        /* JADX INFO: renamed from: com.huawei.hms.network.embedded.fa$l$c */
        public class c extends AbstractRunnableC18300o8 {
            public c(String str, Object... objArr) {
                super(str, objArr);
            }

            @Override // com.huawei.hms.network.embedded.AbstractRunnableC18300o8
            /* JADX INFO: renamed from: b */
            public void mo78220b() {
                C18176fa c18176fa = C18176fa.this;
                c18176fa.f54773b.mo78490a(c18176fa);
            }
        }

        public l(C18204ha c18204ha) {
            super("OkHttp %s", C18176fa.this.f54775d);
            this.f54833b = c18204ha;
        }

        @Override // com.huawei.hms.network.embedded.C18204ha.b
        /* JADX INFO: renamed from: a */
        public void mo78492a() {
        }

        @Override // com.huawei.hms.network.embedded.AbstractRunnableC18300o8
        /* JADX INFO: renamed from: b */
        public void mo78220b() throws Throwable {
            Throwable th;
            EnumC18120ba enumC18120ba;
            EnumC18120ba enumC18120ba2;
            EnumC18120ba enumC18120ba3 = EnumC18120ba.INTERNAL_ERROR;
            IOException e = null;
            try {
                this.f54833b.m78704a(this);
                while (this.f54833b.m78705a(false, (C18204ha.b) this)) {
                }
                enumC18120ba = EnumC18120ba.NO_ERROR;
                try {
                    try {
                        enumC18120ba2 = EnumC18120ba.CANCEL;
                    } catch (IOException e2) {
                        e = e2;
                        enumC18120ba = EnumC18120ba.PROTOCOL_ERROR;
                        enumC18120ba2 = enumC18120ba;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    C18176fa.this.m78465a(enumC18120ba, enumC18120ba3, e);
                    C18313p8.m79378a(this.f54833b);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
            } catch (Throwable th3) {
                th = th3;
                enumC18120ba = enumC18120ba3;
                C18176fa.this.m78465a(enumC18120ba, enumC18120ba3, e);
                C18313p8.m79378a(this.f54833b);
                throw th;
            }
            C18176fa.this.m78465a(enumC18120ba, enumC18120ba2, e);
            C18313p8.m79378a(this.f54833b);
        }

        @Override // com.huawei.hms.network.embedded.C18204ha.b
        /* JADX INFO: renamed from: a */
        public void mo78493a(int i, int i2, int i3, boolean z) {
        }

        /* JADX INFO: renamed from: b */
        public void m78503b(boolean z, C18274ma c18274ma) {
            C18218ia[] c18218iaArr;
            long j;
            synchronized (C18176fa.this.f54794w) {
                synchronized (C18176fa.this) {
                    try {
                        int iM79194c = C18176fa.this.f54792u.m79194c();
                        if (z) {
                            C18176fa.this.f54792u.m79189a();
                        }
                        C18176fa.this.f54792u.m79190a(c18274ma);
                        int iM79194c2 = C18176fa.this.f54792u.m79194c();
                        c18218iaArr = null;
                        if (iM79194c2 == -1 || iM79194c2 == iM79194c) {
                            j = 0;
                        } else {
                            j = iM79194c2 - iM79194c;
                            if (!C18176fa.this.f54774c.isEmpty()) {
                                c18218iaArr = (C18218ia[]) C18176fa.this.f54774c.values().toArray(new C18218ia[C18176fa.this.f54774c.size()]);
                            }
                        }
                    } finally {
                    }
                }
                try {
                    C18176fa c18176fa = C18176fa.this;
                    c18176fa.f54794w.m78914a(c18176fa.f54792u);
                } catch (IOException e) {
                    C18176fa.this.m78445a(e);
                }
            }
            if (c18218iaArr != null) {
                for (C18218ia c18218ia : c18218iaArr) {
                    synchronized (c18218ia) {
                        c18218ia.m78798a(j);
                    }
                }
            }
            C18176fa.f54769E.execute(new c("OkHttp %s settings", C18176fa.this.f54775d));
        }

        @Override // com.huawei.hms.network.embedded.C18204ha.b
        /* JADX INFO: renamed from: a */
        public void mo78494a(int i, int i2, List<C18134ca> list) throws Throwable {
            C18176fa.this.m78460a(i2, list);
        }

        @Override // com.huawei.hms.network.embedded.C18204ha.b
        /* JADX INFO: renamed from: a */
        public void mo78495a(int i, long j) {
            C18176fa c18176fa = C18176fa.this;
            if (i == 0) {
                synchronized (c18176fa) {
                    C18176fa c18176fa2 = C18176fa.this;
                    c18176fa2.f54790s += j;
                    c18176fa2.notifyAll();
                }
                return;
            }
            C18218ia c18218iaM78472d = c18176fa.m78472d(i);
            if (c18218iaM78472d != null) {
                synchronized (c18218iaM78472d) {
                    c18218iaM78472d.m78798a(j);
                }
            }
        }

        @Override // com.huawei.hms.network.embedded.C18204ha.b
        /* JADX INFO: renamed from: a */
        public void mo78496a(int i, EnumC18120ba enumC18120ba) {
            if (C18176fa.this.m78473e(i)) {
                C18176fa.this.m78458a(i, enumC18120ba);
                return;
            }
            C18218ia c18218iaM78474f = C18176fa.this.m78474f(i);
            if (c18218iaM78474f != null) {
                c18218iaM78474f.m78806b(enumC18120ba);
            }
        }

        @Override // com.huawei.hms.network.embedded.C18204ha.b
        /* JADX INFO: renamed from: a */
        public void mo78497a(int i, EnumC18120ba enumC18120ba, C18303ob c18303ob) {
            C18218ia[] c18218iaArr;
            c18303ob.mo78736j();
            synchronized (C18176fa.this) {
                c18218iaArr = (C18218ia[]) C18176fa.this.f54774c.values().toArray(new C18218ia[C18176fa.this.f54774c.size()]);
                C18176fa.this.f54778g = true;
            }
            for (C18218ia c18218ia : c18218iaArr) {
                if (c18218ia.m78809e() > i && c18218ia.m78812h()) {
                    c18218ia.m78806b(EnumC18120ba.REFUSED_STREAM);
                    C18176fa.this.m78474f(c18218ia.m78809e());
                }
            }
        }

        @Override // com.huawei.hms.network.embedded.C18204ha.b
        /* JADX INFO: renamed from: a */
        public void mo78498a(int i, String str, C18303ob c18303ob, String str2, int i2, long j) {
        }

        @Override // com.huawei.hms.network.embedded.C18204ha.b
        /* JADX INFO: renamed from: a */
        public void mo78499a(boolean z, int i, int i2) {
            if (z) {
                synchronized (C18176fa.this) {
                    try {
                        if (i == 1) {
                            C18176fa.m78447b(C18176fa.this);
                        } else if (i == 2) {
                            C18176fa.m78453g(C18176fa.this);
                        } else if (i == 3) {
                            C18176fa.m78454h(C18176fa.this);
                            C18176fa.this.notifyAll();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            }
            try {
                C18176fa.this.f54779h.execute(C18176fa.this.new k(true, i, i2));
            } catch (RejectedExecutionException unused) {
            }
        }

        @Override // com.huawei.hms.network.embedded.C18204ha.b
        /* JADX INFO: renamed from: a */
        public void mo78500a(boolean z, int i, int i2, List<C18134ca> list) {
            if (C18176fa.this.m78473e(i)) {
                C18176fa.this.m78461a(i, list, z);
                return;
            }
            synchronized (C18176fa.this) {
                try {
                    C18218ia c18218iaM78472d = C18176fa.this.m78472d(i);
                    if (c18218iaM78472d != null) {
                        c18218iaM78472d.m78803a(C18313p8.m79389b(list), z);
                        return;
                    }
                    if (!C18176fa.this.f54778g) {
                        C18176fa c18176fa = C18176fa.this;
                        if (i > c18176fa.f54776e && i % 2 != c18176fa.f54777f % 2) {
                            C18218ia c18218ia = new C18218ia(i, C18176fa.this, false, z, C18313p8.m79389b(list));
                            C18176fa c18176fa2 = C18176fa.this;
                            c18176fa2.f54776e = i;
                            c18176fa2.f54774c.put(Integer.valueOf(i), c18218ia);
                            C18176fa.f54769E.execute(new a("OkHttp %s stream %d", new Object[]{C18176fa.this.f54775d, Integer.valueOf(i)}, c18218ia));
                        }
                    }
                } finally {
                }
            }
        }

        @Override // com.huawei.hms.network.embedded.C18204ha.b
        /* JADX INFO: renamed from: a */
        public void mo78501a(boolean z, int i, InterfaceC18289nb interfaceC18289nb, int i2) throws IOException {
            if (C18176fa.this.m78473e(i)) {
                C18176fa.this.m78459a(i, interfaceC18289nb, i2, z);
                return;
            }
            C18218ia c18218iaM78472d = C18176fa.this.m78472d(i);
            if (c18218iaM78472d == null) {
                C18176fa.this.m78471c(i, EnumC18120ba.PROTOCOL_ERROR);
                long j = i2;
                C18176fa.this.m78476k(j);
                interfaceC18289nb.skip(j);
                return;
            }
            c18218iaM78472d.m78801a(interfaceC18289nb, i2);
            if (z) {
                c18218iaM78472d.m78803a(C18313p8.f55894c, true);
            }
        }

        @Override // com.huawei.hms.network.embedded.C18204ha.b
        /* JADX INFO: renamed from: a */
        public void mo78502a(boolean z, C18274ma c18274ma) {
            try {
                C18176fa.this.f54779h.execute(new b("OkHttp %s ACK Settings", new Object[]{C18176fa.this.f54775d}, z, c18274ma));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    public C18176fa(h hVar) {
        C18274ma c18274ma = new C18274ma();
        this.f54792u = c18274ma;
        this.f54796y = new LinkedHashSet();
        this.f54781j = hVar.f54824f;
        boolean z = hVar.f54825g;
        this.f54772a = z;
        this.f54773b = hVar.f54823e;
        int i2 = z ? 1 : 2;
        this.f54777f = i2;
        if (z) {
            this.f54777f = i2 + 2;
        }
        if (z) {
            this.f54791t.m79188a(7, 16777216);
        }
        String str = hVar.f54820b;
        this.f54775d = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, C18313p8.m79375a(C18313p8.m79366a("OkHttp %s Writer", str), false));
        this.f54779h = scheduledThreadPoolExecutor;
        if (hVar.f54826h != 0) {
            i iVar = new i();
            long j2 = hVar.f54826h;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(iVar, j2, j2, TimeUnit.MILLISECONDS);
        }
        this.f54780i = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), C18313p8.m79375a(C18313p8.m79366a("OkHttp %s Push Observer", str), true));
        c18274ma.m79188a(7, 65535);
        c18274ma.m79188a(5, 16384);
        this.f54790s = c18274ma.m79194c();
        this.f54793v = hVar.f54819a;
        this.f54794w = new C18232ja(hVar.f54822d, z);
        this.f54795x = new l(new C18204ha(hVar.f54821c, z));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ long m78447b(C18176fa c18176fa) {
        long j2 = c18176fa.f54783l;
        c18176fa.f54783l = 1 + j2;
        return j2;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ long m78450d(C18176fa c18176fa) {
        long j2 = c18176fa.f54782k;
        c18176fa.f54782k = 1 + j2;
        return j2;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ long m78453g(C18176fa c18176fa) {
        long j2 = c18176fa.f54785n;
        c18176fa.f54785n = 1 + j2;
        return j2;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ long m78454h(C18176fa c18176fa) {
        long j2 = c18176fa.f54787p;
        c18176fa.f54787p = 1 + j2;
        return j2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m78465a(EnumC18120ba.NO_ERROR, EnumC18120ba.CANCEL, (IOException) null);
    }

    /* JADX INFO: renamed from: e */
    public boolean m78473e(int i2) {
        return i2 != 0 && (i2 & 1) == 0;
    }

    /* JADX INFO: renamed from: f */
    public synchronized C18218ia m78474f(int i2) {
        C18218ia c18218iaRemove;
        c18218iaRemove = this.f54774c.remove(Integer.valueOf(i2));
        notifyAll();
        return c18218iaRemove;
    }

    public void flush() throws IOException {
        this.f54794w.flush();
    }

    /* JADX INFO: renamed from: j */
    public synchronized boolean m78475j(long j2) {
        if (this.f54778g) {
            return false;
        }
        if (this.f54785n < this.f54784m) {
            if (j2 >= this.f54788q) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public synchronized void m78476k(long j2) {
        long j3 = this.f54789r + j2;
        this.f54789r = j3;
        if (j3 >= this.f54791t.m79194c() / 2) {
            m78457a(0, this.f54789r);
            this.f54789r = 0L;
        }
    }

    /* JADX INFO: renamed from: s */
    public synchronized void m78477s() throws InterruptedException {
        while (this.f54787p < this.f54786o) {
            wait();
        }
    }

    /* JADX INFO: renamed from: t */
    public synchronized int m78478t() {
        return this.f54792u.m79193b(Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: u */
    public synchronized int m78479u() {
        return this.f54774c.size();
    }

    /* JADX INFO: renamed from: v */
    public void m78480v() {
        synchronized (this) {
            try {
                long j2 = this.f54785n;
                long j3 = this.f54784m;
                if (j2 < j3) {
                    return;
                }
                this.f54784m = j3 + 1;
                this.f54788q = System.nanoTime() + 1000000000;
                try {
                    this.f54779h.execute(new c("OkHttp %s ping", this.f54775d));
                } catch (RejectedExecutionException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public void m78481w() throws IOException {
        m78467a(true);
    }

    /* JADX INFO: renamed from: x */
    public void m78482x() {
        synchronized (this) {
            this.f54786o++;
        }
        m78468a(false, 3, 1330343787);
    }

    /* JADX INFO: renamed from: y */
    public void m78483y() throws InterruptedException {
        m78482x();
        m78477s();
    }

    /* JADX INFO: renamed from: c */
    private C18218ia m78449c(int i2, List<C18134ca> list, boolean z) throws Throwable {
        Throwable th;
        boolean z2 = !z;
        synchronized (this.f54794w) {
            try {
                try {
                    try {
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
                synchronized (this) {
                    try {
                        if (this.f54777f > 1073741823) {
                            try {
                                m78464a(EnumC18120ba.REFUSED_STREAM);
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                        if (this.f54778g) {
                            throw new C18106aa();
                        }
                        int i3 = this.f54777f;
                        this.f54777f = i3 + 2;
                        C18218ia c18218ia = new C18218ia(i3, this, z2, false, null);
                        boolean z3 = !z || this.f54790s == 0 || c18218ia.f55267b == 0;
                        if (c18218ia.m78813i()) {
                            this.f54774c.put(Integer.valueOf(i3), c18218ia);
                        }
                        if (i2 == 0) {
                            this.f54794w.m78917a(z2, i3, list);
                        } else {
                            if (this.f54772a) {
                                throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                            }
                            this.f54794w.m78910a(i2, i3, list);
                        }
                        if (z3) {
                            this.f54794w.flush();
                        }
                        return c18218ia;
                    } catch (Throwable th5) {
                        th = th5;
                        th = th;
                    }
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public C18218ia m78456a(List<C18134ca> list, boolean z) throws IOException {
        return m78449c(0, list, z);
    }

    /* JADX INFO: renamed from: b */
    public C18218ia m78469b(int i2, List<C18134ca> list, boolean z) throws IOException {
        if (this.f54772a) {
            throw new IllegalStateException("Client cannot push requests.");
        }
        return m78449c(i2, list, z);
    }

    /* JADX INFO: renamed from: d */
    public synchronized C18218ia m78472d(int i2) {
        return this.f54774c.get(Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: a */
    public void m78457a(int i2, long j2) {
        try {
            this.f54779h.execute(new b("OkHttp Window Update %s stream %d", new Object[]{this.f54775d, Integer.valueOf(i2)}, i2, j2));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public void m78470b(int i2, EnumC18120ba enumC18120ba) throws IOException {
        this.f54794w.m78912a(i2, enumC18120ba);
    }

    /* JADX INFO: renamed from: c */
    public void m78471c(int i2, EnumC18120ba enumC18120ba) {
        try {
            this.f54779h.execute(new a("OkHttp %s stream %d", new Object[]{this.f54775d, Integer.valueOf(i2)}, i2, enumC18120ba));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public void m78458a(int i2, EnumC18120ba enumC18120ba) {
        m78444a(new g("OkHttp %s Push Reset[%s]", new Object[]{this.f54775d, Integer.valueOf(i2)}, i2, enumC18120ba));
    }

    /* JADX INFO: renamed from: a */
    public void m78459a(int i2, InterfaceC18289nb interfaceC18289nb, int i3, boolean z) throws IOException {
        C18261lb c18261lb = new C18261lb();
        long j2 = i3;
        interfaceC18289nb.mo78393i(j2);
        interfaceC18289nb.mo77914c(c18261lb, j2);
        if (c18261lb.m79076B() == j2) {
            m78444a(new f("OkHttp %s Push Data[%s]", new Object[]{this.f54775d, Integer.valueOf(i2)}, i2, c18261lb, i3, z));
            return;
        }
        throw new IOException(c18261lb.m79076B() + " != " + i3);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:25:0x0041
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX INFO: renamed from: a */
    public void m78460a(int r9, java.util.List<com.huawei.hms.network.embedded.C18134ca> r10) throws java.lang.Throwable {
        /*
            r8 = this;
            monitor-enter(r8)
            java.util.Set<java.lang.Integer> r0 = r8.f54796y     // Catch: java.lang.Throwable -> L3c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L3c
            boolean r0 = r0.contains(r1)     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L18
            com.huawei.hms.network.embedded.ba r10 = com.huawei.hms.network.embedded.EnumC18120ba.PROTOCOL_ERROR     // Catch: java.lang.Throwable -> L14
            r8.m78471c(r9, r10)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r0 = move-exception
            r9 = r0
            r3 = r8
            goto L3f
        L18:
            java.util.Set<java.lang.Integer> r0 = r8.f54796y     // Catch: java.lang.Throwable -> L3c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L3c
            r0.add(r1)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L3c
            com.huawei.hms.network.embedded.fa$d r2 = new com.huawei.hms.network.embedded.fa$d     // Catch: java.util.concurrent.RejectedExecutionException -> L3a
            java.lang.String r4 = "OkHttp %s Push Request[%s]"
            java.lang.String r0 = r8.f54775d     // Catch: java.util.concurrent.RejectedExecutionException -> L3a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch: java.util.concurrent.RejectedExecutionException -> L3a
            java.lang.Object[] r5 = new java.lang.Object[]{r0, r1}     // Catch: java.util.concurrent.RejectedExecutionException -> L3a
            r3 = r8
            r6 = r9
            r7 = r10
            r2.<init>(r4, r5, r6, r7)     // Catch: java.util.concurrent.RejectedExecutionException -> L3b
            r8.m78444a(r2)     // Catch: java.util.concurrent.RejectedExecutionException -> L3b
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
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.network.embedded.C18176fa.m78460a(int, java.util.List):void");
    }

    /* JADX INFO: renamed from: a */
    public void m78461a(int i2, List<C18134ca> list, boolean z) {
        try {
            try {
                m78444a(new e("OkHttp %s Push Headers[%s]", new Object[]{this.f54775d, Integer.valueOf(i2)}, i2, list, z));
            } catch (RejectedExecutionException unused) {
            }
        } catch (RejectedExecutionException unused2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r4), r8.f54794w.m78920t());
        r6 = r2;
        r8.f54790s -= r6;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m78462a(int i2, boolean z, C18261lb c18261lb, long j2) throws IOException {
        int iMin;
        long j3;
        if (j2 == 0) {
            this.f54794w.m78916a(z, i2, c18261lb, 0);
            return;
        }
        while (j2 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j4 = this.f54790s;
                            if (j4 > 0) {
                                break;
                            } else {
                                if (!this.f54774c.containsKey(Integer.valueOf(i2))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            j2 -= j3;
            this.f54794w.m78916a(z && j2 == 0, i2, c18261lb, iMin);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m78463a(int i2, boolean z, List<C18134ca> list) throws IOException {
        this.f54794w.m78917a(z, i2, list);
    }

    /* JADX INFO: renamed from: a */
    public void m78464a(EnumC18120ba enumC18120ba) throws IOException {
        synchronized (this.f54794w) {
            synchronized (this) {
                if (!this.f54778g) {
                    this.f54778g = true;
                    this.f54794w.m78913a(this.f54776e, enumC18120ba, C18313p8.f55892a);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m78465a(EnumC18120ba enumC18120ba, EnumC18120ba enumC18120ba2, IOException iOException) {
        C18218ia[] c18218iaArr;
        if (!f54770F && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        try {
            m78464a(enumC18120ba);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.f54774c.isEmpty()) {
                    c18218iaArr = null;
                } else {
                    c18218iaArr = (C18218ia[]) this.f54774c.values().toArray(new C18218ia[this.f54774c.size()]);
                    this.f54774c.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c18218iaArr != null) {
            for (C18218ia c18218ia : c18218iaArr) {
                try {
                    c18218ia.m78800a(enumC18120ba2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f54794w.close();
        } catch (IOException unused3) {
        }
        try {
            this.f54793v.close();
        } catch (IOException unused4) {
        }
        this.f54779h.shutdown();
        this.f54780i.shutdown();
    }

    /* JADX INFO: renamed from: a */
    public void m78466a(C18274ma c18274ma) throws IOException {
        synchronized (this.f54794w) {
            synchronized (this) {
                if (this.f54778g) {
                    throw new C18106aa();
                }
                this.f54791t.m79190a(c18274ma);
            }
            this.f54794w.m78918b(c18274ma);
        }
    }

    /* JADX INFO: renamed from: a */
    private synchronized void m78444a(AbstractRunnableC18300o8 abstractRunnableC18300o8) {
        if (!this.f54778g) {
            this.f54780i.execute(abstractRunnableC18300o8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m78445a(IOException iOException) {
        EnumC18120ba enumC18120ba = EnumC18120ba.PROTOCOL_ERROR;
        m78465a(enumC18120ba, enumC18120ba, iOException);
    }

    /* JADX INFO: renamed from: a */
    public void m78467a(boolean z) throws IOException {
        if (z) {
            this.f54794w.m78919s();
            this.f54794w.m78918b(this.f54791t);
            if (this.f54791t.m79194c() != 65535) {
                this.f54794w.m78911a(0, r5 - 65535);
            }
        }
        new Thread(this.f54795x).start();
    }

    /* JADX INFO: renamed from: a */
    public void m78468a(boolean z, int i2, int i3) {
        try {
            this.f54794w.m78915a(z, i2, i3);
        } catch (IOException e2) {
            m78445a(e2);
        }
    }
}
