package com.huawei.hms.network.embedded;

import OooOoo.C20593OooO0Oo;
import Oooo0oO.C21023OooO0Oo;
import androidx.core.database.OooO00o;
import com.google.common.net.HttpHeaders;
import com.huawei.hms.network.embedded.C18191gb;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.eb */
/* JADX INFO: loaded from: classes9.dex */
public final class C18163eb implements InterfaceC18244k8, C18191gb.a {

    /* JADX INFO: renamed from: A */
    public static final /* synthetic */ boolean f54660A = true;

    /* JADX INFO: renamed from: x */
    public static final List<EnumC18132c8> f54661x = Collections.singletonList(EnumC18132c8.HTTP_1_1);

    /* JADX INFO: renamed from: y */
    public static final long f54662y = 16777216;

    /* JADX INFO: renamed from: z */
    public static final long f54663z = 60000;

    /* JADX INFO: renamed from: a */
    public final C18160e8 f54664a;

    /* JADX INFO: renamed from: b */
    public final AbstractC18258l8 f54665b;

    /* JADX INFO: renamed from: c */
    public final Random f54666c;

    /* JADX INFO: renamed from: d */
    public final long f54667d;

    /* JADX INFO: renamed from: e */
    public final String f54668e;

    /* JADX INFO: renamed from: f */
    public InterfaceC18159e7 f54669f;

    /* JADX INFO: renamed from: g */
    public final Runnable f54670g;

    /* JADX INFO: renamed from: h */
    public C18191gb f54671h;

    /* JADX INFO: renamed from: i */
    public C18205hb f54672i;

    /* JADX INFO: renamed from: j */
    public ScheduledExecutorService f54673j;

    /* JADX INFO: renamed from: k */
    public f f54674k;

    /* JADX INFO: renamed from: n */
    public long f54677n;

    /* JADX INFO: renamed from: o */
    public boolean f54678o;

    /* JADX INFO: renamed from: p */
    public ScheduledFuture<?> f54679p;

    /* JADX INFO: renamed from: r */
    public String f54681r;

    /* JADX INFO: renamed from: s */
    public boolean f54682s;

    /* JADX INFO: renamed from: t */
    public int f54683t;

    /* JADX INFO: renamed from: u */
    public int f54684u;

    /* JADX INFO: renamed from: v */
    public int f54685v;

    /* JADX INFO: renamed from: w */
    public boolean f54686w;

    /* JADX INFO: renamed from: l */
    public final ArrayDeque<C18303ob> f54675l = new ArrayDeque<>();

    /* JADX INFO: renamed from: m */
    public final ArrayDeque<Object> f54676m = new ArrayDeque<>();

    /* JADX INFO: renamed from: q */
    public int f54680q = -1;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.eb$a */
    public class a implements InterfaceC18173f7 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C18160e8 f54687a;

        public a(C18160e8 c18160e8) {
            this.f54687a = c18160e8;
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18173f7
        public void onFailure(InterfaceC18159e7 interfaceC18159e7, IOException iOException) {
            C18163eb.this.m78348a(iOException, (C18188g8) null);
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18173f7
        public void onResponse(InterfaceC18159e7 interfaceC18159e7, C18188g8 c18188g8) {
            C18175f9 c18175f9Mo77968a = AbstractC18286n8.f55777a.mo77968a(c18188g8);
            try {
                C18163eb.this.m78346a(c18188g8, c18175f9Mo77968a);
                try {
                    C18163eb.this.m78350a("OkHttp WebSocket " + this.f54687a.m78310k().m79939r(), c18175f9Mo77968a.m78433g());
                    C18163eb c18163eb = C18163eb.this;
                    c18163eb.f54665b.onOpen(c18163eb, c18188g8);
                    C18163eb.this.m78353b();
                } catch (Exception e) {
                    C18163eb.this.m78348a(e, (C18188g8) null);
                }
            } catch (IOException e2) {
                if (c18175f9Mo77968a != null) {
                    c18175f9Mo77968a.m78439m();
                }
                C18163eb.this.m78348a(e2, c18188g8);
                C18313p8.m79378a(c18188g8);
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.eb$b */
    public final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C18163eb.this.cancel();
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.eb$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final int f54690a;

        /* JADX INFO: renamed from: b */
        public final C18303ob f54691b;

        /* JADX INFO: renamed from: c */
        public final long f54692c;

        public c(int i, C18303ob c18303ob, long j) {
            this.f54690a = i;
            this.f54691b = c18303ob;
            this.f54692c = j;
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.eb$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public final int f54693a;

        /* JADX INFO: renamed from: b */
        public final C18303ob f54694b;

        public d(int i, C18303ob c18303ob) {
            this.f54693a = i;
            this.f54694b = c18303ob;
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.eb$e */
    public final class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C18163eb.this.m78366i();
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.eb$f */
    public static abstract class f implements Closeable {

        /* JADX INFO: renamed from: a */
        public final boolean f54696a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC18289nb f54697b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC18275mb f54698c;

        public f(boolean z, InterfaceC18289nb interfaceC18289nb, InterfaceC18275mb interfaceC18275mb) {
            this.f54696a = z;
            this.f54697b = interfaceC18289nb;
            this.f54698c = interfaceC18275mb;
        }
    }

    public C18163eb(C18160e8 c18160e8, AbstractC18258l8 abstractC18258l8, Random random, long j) {
        if (!"GET".equals(c18160e8.m78307h())) {
            throw new IllegalArgumentException("Request must be GET: " + c18160e8.m78307h());
        }
        this.f54664a = c18160e8;
        this.f54665b = abstractC18258l8;
        this.f54666c = random;
        this.f54667d = j;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.f54668e = C18303ob.m79300e(bArr).mo78727b();
        this.f54670g = new Runnable() { // from class: o0oO0Ooo.OooO0O0
            @Override // java.lang.Runnable
            public final void run() {
                this.f110068OooOo0o.m78341j();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m78341j() {
        do {
            try {
            } catch (IOException e2) {
                m78348a(e2, (C18188g8) null);
                return;
            }
        } while (m78365h());
    }

    /* JADX INFO: renamed from: k */
    private void m78342k() {
        if (!f54660A && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        ScheduledExecutorService scheduledExecutorService = this.f54673j;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.execute(this.f54670g);
        }
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18244k8
    /* JADX INFO: renamed from: a */
    public synchronized long mo78343a() {
        return this.f54677n;
    }

    /* JADX INFO: renamed from: b */
    public void m78353b() throws IOException {
        while (this.f54680q == -1) {
            this.f54671h.m78638a();
        }
    }

    @Override // com.huawei.hms.network.embedded.C18191gb.a
    /* JADX INFO: renamed from: c */
    public synchronized void mo78357c(C18303ob c18303ob) {
        try {
            if (!this.f54682s && (!this.f54678o || !this.f54676m.isEmpty())) {
                this.f54675l.add(c18303ob);
                m78342k();
                this.f54684u++;
            }
        } finally {
        }
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18244k8
    public void cancel() {
        this.f54669f.cancel();
    }

    /* JADX INFO: renamed from: d */
    public synchronized int m78359d() {
        return this.f54684u;
    }

    /* JADX INFO: renamed from: e */
    public synchronized int m78361e() {
        return this.f54685v;
    }

    /* JADX INFO: renamed from: f */
    public synchronized int m78363f() {
        return this.f54683t;
    }

    /* JADX INFO: renamed from: g */
    public void m78364g() throws InterruptedException {
        ScheduledFuture<?> scheduledFuture = this.f54679p;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f54673j.shutdown();
        this.f54673j.awaitTermination(10L, TimeUnit.SECONDS);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: h */
    public boolean m78365h() throws IOException {
        String str;
        int i;
        f fVar;
        synchronized (this) {
            try {
                if (!this.f54682s) {
                    C18205hb c18205hb = this.f54672i;
                    C18303ob c18303obPoll = this.f54675l.poll();
                    Object obj = null;
                    if (c18303obPoll == null) {
                        Object objPoll = this.f54676m.poll();
                        if (objPoll instanceof c) {
                            i = this.f54680q;
                            str = this.f54681r;
                            if (i != -1) {
                                fVar = this.f54674k;
                                this.f54674k = null;
                                this.f54673j.shutdown();
                            } else {
                                this.f54679p = this.f54673j.schedule(new b(), ((c) objPoll).f54692c, TimeUnit.MILLISECONDS);
                                fVar = null;
                            }
                        } else if (objPoll != null) {
                            str = null;
                            i = -1;
                            fVar = null;
                        }
                        obj = objPoll;
                    } else {
                        str = null;
                        i = -1;
                        fVar = null;
                    }
                    try {
                        if (c18303obPoll != null) {
                            c18205hb.m78712b(c18303obPoll);
                        } else if (obj instanceof d) {
                            C18303ob c18303ob = ((d) obj).f54694b;
                            InterfaceC18275mb interfaceC18275mbM80006a = C18433yb.m80006a(c18205hb.m78708a(((d) obj).f54693a, c18303ob.mo78736j()));
                            interfaceC18275mbM80006a.mo78267b(c18303ob);
                            interfaceC18275mbM80006a.close();
                            synchronized (this) {
                                this.f54677n -= (long) c18303ob.mo78736j();
                            }
                        } else {
                            if (!(obj instanceof c)) {
                                throw new AssertionError();
                            }
                            c cVar = (c) obj;
                            c18205hb.m78710a(cVar.f54690a, cVar.f54691b);
                            if (fVar != null) {
                                this.f54665b.onClosed(this, i, str);
                            }
                        }
                        C18313p8.m79378a(fVar);
                        return true;
                    } catch (Throwable th) {
                        C18313p8.m79378a(fVar);
                        throw th;
                    }
                }
                return false;
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public void m78366i() {
        synchronized (this) {
            try {
                if (this.f54682s) {
                    return;
                }
                C18205hb c18205hb = this.f54672i;
                int i = this.f54686w ? this.f54683t : -1;
                this.f54683t++;
                this.f54686w = true;
                if (i != -1) {
                    StringBuilder sb = new StringBuilder("sent ping but didn't receive pong within ");
                    sb.append(this.f54667d);
                    sb.append("ms (after ");
                    m78348a(new SocketTimeoutException(C21023OooO0Oo.OooO0OO(" successful ping/pongs)", i - 1, sb)), (C18188g8) null);
                    return;
                }
                try {
                    c18205hb.m78711a(C18303ob.f55843f);
                } catch (IOException e2) {
                    m78348a(e2, (C18188g8) null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18244k8
    public C18160e8 request() {
        return this.f54664a;
    }

    /* JADX INFO: renamed from: a */
    public void m78344a(int i, TimeUnit timeUnit) throws InterruptedException {
        this.f54673j.awaitTermination(i, timeUnit);
    }

    @Override // com.huawei.hms.network.embedded.C18191gb.a
    /* JADX INFO: renamed from: b */
    public void mo78354b(int i, String str) {
        f fVar;
        if (i == -1) {
            throw new IllegalArgumentException();
        }
        synchronized (this) {
            try {
                if (this.f54680q != -1) {
                    throw new IllegalStateException("already closed");
                }
                this.f54680q = i;
                this.f54681r = str;
                fVar = null;
                if (this.f54678o && this.f54676m.isEmpty()) {
                    f fVar2 = this.f54674k;
                    this.f54674k = null;
                    ScheduledFuture<?> scheduledFuture = this.f54679p;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f54673j.shutdown();
                    fVar = fVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            this.f54665b.onClosing(this, i, str);
            if (fVar != null) {
                this.f54665b.onClosed(this, i, str);
            }
        } finally {
            C18313p8.m79378a(fVar);
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m78358c() throws IOException {
        try {
            this.f54671h.m78638a();
            return this.f54680q == -1;
        } catch (Exception e2) {
            m78348a(e2, (C18188g8) null);
            return false;
        }
    }

    @Override // com.huawei.hms.network.embedded.C18191gb.a
    /* JADX INFO: renamed from: d */
    public void mo78360d(C18303ob c18303ob) throws IOException {
        this.f54665b.onMessage(this, c18303ob);
    }

    /* JADX INFO: renamed from: e */
    public synchronized boolean m78362e(C18303ob c18303ob) {
        try {
            if (!this.f54682s && (!this.f54678o || !this.f54676m.isEmpty())) {
                this.f54675l.add(c18303ob);
                m78342k();
                return true;
            }
            return false;
        } finally {
        }
    }

    /* JADX INFO: renamed from: a */
    public void m78345a(C18118b8 c18118b8) {
        C18118b8 c18118b8M77995a = c18118b8.m77958s().m77984a(AbstractC18338r7.NONE).m78001b(f54661x).m77995a();
        C18160e8 c18160e8M78323a = this.f54664a.m78308i().m78327b(HttpHeaders.UPGRADE, "websocket").m78327b(HttpHeaders.CONNECTION, HttpHeaders.UPGRADE).m78327b(HttpHeaders.SEC_WEBSOCKET_KEY, this.f54668e).m78327b(HttpHeaders.SEC_WEBSOCKET_VERSION, "13").m78323a();
        InterfaceC18159e7 interfaceC18159e7Mo77967a = AbstractC18286n8.f55777a.mo77967a(c18118b8M77995a, c18160e8M78323a);
        this.f54669f = interfaceC18159e7Mo77967a;
        interfaceC18159e7Mo77967a.enqueue(new a(c18160e8M78323a));
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18244k8
    /* JADX INFO: renamed from: b */
    public boolean mo78355b(C18303ob c18303ob) {
        if (c18303ob != null) {
            return m78340a(c18303ob, 2);
        }
        throw new NullPointerException("bytes == null");
    }

    /* JADX INFO: renamed from: a */
    public void m78346a(C18188g8 c18188g8, C18175f9 c18175f9) throws IOException {
        if (c18188g8.m78589w() != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + c18188g8.m78589w() + " " + c18188g8.m78572B() + "'");
        }
        String strM78582b = c18188g8.m78582b(HttpHeaders.CONNECTION);
        if (!HttpHeaders.UPGRADE.equalsIgnoreCase(strM78582b)) {
            throw new ProtocolException(C20593OooO0Oo.OooO0O0("Expected 'Connection' header value 'Upgrade' but was '", strM78582b, "'"));
        }
        String strM78582b2 = c18188g8.m78582b(HttpHeaders.UPGRADE);
        if (!"websocket".equalsIgnoreCase(strM78582b2)) {
            throw new ProtocolException(C20593OooO0Oo.OooO0O0("Expected 'Upgrade' header value 'websocket' but was '", strM78582b2, "'"));
        }
        String strM78582b3 = c18188g8.m78582b(HttpHeaders.SEC_WEBSOCKET_ACCEPT);
        String strMo78727b = C18303ob.m79299d(this.f54668e + C18177fb.f54841a).mo78734g().mo78727b();
        if (!strMo78727b.equals(strM78582b3)) {
            throw new ProtocolException(OooO00o.OooO00o("Expected 'Sec-WebSocket-Accept' header value '", strMo78727b, "' but was '", strM78582b3, "'"));
        }
        if (c18175f9 == null) {
            throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
        }
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18244k8
    /* JADX INFO: renamed from: b */
    public boolean mo78356b(String str) {
        if (str != null) {
            return m78340a(C18303ob.m79299d(str), 1);
        }
        throw new NullPointerException("text == null");
    }

    @Override // com.huawei.hms.network.embedded.C18191gb.a
    /* JADX INFO: renamed from: a */
    public synchronized void mo78347a(C18303ob c18303ob) {
        this.f54685v++;
        this.f54686w = false;
    }

    /* JADX INFO: renamed from: a */
    public void m78348a(Exception exc, C18188g8 c18188g8) {
        synchronized (this) {
            try {
                if (this.f54682s) {
                    return;
                }
                this.f54682s = true;
                f fVar = this.f54674k;
                this.f54674k = null;
                ScheduledFuture<?> scheduledFuture = this.f54679p;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                ScheduledExecutorService scheduledExecutorService = this.f54673j;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdown();
                }
                try {
                    this.f54665b.onFailure(this, exc, c18188g8);
                } finally {
                    C18313p8.m79378a(fVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.huawei.hms.network.embedded.C18191gb.a
    /* JADX INFO: renamed from: a */
    public void mo78349a(String str) throws IOException {
        this.f54665b.onMessage(this, str);
    }

    /* JADX INFO: renamed from: a */
    public void m78350a(String str, f fVar) throws IOException {
        synchronized (this) {
            try {
                this.f54674k = fVar;
                this.f54672i = new C18205hb(fVar.f54696a, fVar.f54698c, this.f54666c);
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, C18313p8.m79375a(str, false));
                this.f54673j = scheduledThreadPoolExecutor;
                if (this.f54667d != 0) {
                    e eVar = new e();
                    long j = this.f54667d;
                    scheduledThreadPoolExecutor.scheduleAtFixedRate(eVar, j, j, TimeUnit.MILLISECONDS);
                }
                if (!this.f54676m.isEmpty()) {
                    m78342k();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f54671h = new C18191gb(fVar.f54696a, fVar.f54697b, this);
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18244k8
    /* JADX INFO: renamed from: a */
    public boolean mo78351a(int i, String str) {
        return m78352a(i, str, 60000L);
    }

    /* JADX INFO: renamed from: a */
    public synchronized boolean m78352a(int i, String str, long j) {
        C18303ob c18303obM79299d;
        try {
            C18177fb.m78507b(i);
            if (str != null) {
                c18303obM79299d = C18303ob.m79299d(str);
                if (c18303obM79299d.mo78736j() > 123) {
                    throw new IllegalArgumentException("reason.size() > 123: ".concat(str));
                }
            } else {
                c18303obM79299d = null;
            }
            if (!this.f54682s && !this.f54678o) {
                this.f54678o = true;
                this.f54676m.add(new c(i, c18303obM79299d, j));
                m78342k();
                return true;
            }
            return false;
        } finally {
        }
    }

    /* JADX INFO: renamed from: a */
    private synchronized boolean m78340a(C18303ob c18303ob, int i) {
        if (!this.f54682s && !this.f54678o) {
            if (this.f54677n + ((long) c18303ob.mo78736j()) > f54662y) {
                mo78351a(1001, (String) null);
                return false;
            }
            this.f54677n += (long) c18303ob.mo78736j();
            this.f54676m.add(new d(i, c18303ob));
            m78342k();
            return true;
        }
        return false;
    }
}
