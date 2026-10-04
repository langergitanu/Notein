package oO000Oo;

import androidx.core.location.LocationRequestCompat;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.microsoft.identity.common.adal.internal.AuthenticationConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import oO0OOo0o.C33058OooO00o;
import oO0OOo0o.C33065OooOOOo;
import oO0OOo0o.C33068OooOOo;
import oO0OOo0o.C33094OoooO;
import oO0OOo0o.OooO0o;

/* JADX INFO: renamed from: oO000Oo.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C31958OooOoo<ReqT, RespT> extends oO0OOo0o.OooO0o<ReqT, RespT> {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final C31962OooO0oo f114056OooOO0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public OooOO0<RespT> f114057OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ScheduledFuture<?> f114058OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Executor f114059OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C33065OooOOOo f114060OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile boolean f114061OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public oO0OOo0o.OooO0o<ReqT, RespT> f114062OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public OooO0o.OooO00o<RespT> f114063OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public oO0OOo0o.o00Oo0 f114064OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public List<Runnable> f114065OooO0oo = new ArrayList();

    /* JADX INFO: renamed from: oO000Oo.OooOoo$OooO */
    public final class OooO extends AbstractRunnableC31956OooOoO0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final OooO0o.OooO00o<RespT> f114066OooOo;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final oO0OOo0o.o00Oo0 f114067OooOoO0;

        public OooO(C31958OooOoo c31958OooOoo, OooO0o.OooO00o<RespT> oooO00o, oO0OOo0o.o00Oo0 o00oo02) {
            super(c31958OooOoo.f114060OooO0OO);
            this.f114066OooOo = oooO00o;
            this.f114067OooOoO0 = o00oo02;
        }

        @Override // oO000Oo.AbstractRunnableC31956OooOoO0
        public final void OooO00o() {
            this.f114066OooOo.onClose(this.f114067OooOoO0, new C33094OoooO());
        }
    }

    /* JADX INFO: renamed from: oO000Oo.OooOoo$OooO00o */
    public class OooO00o extends AbstractRunnableC31956OooOoO0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ OooOO0 f114068OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C31958OooOoo c31958OooOoo, OooOO0 oooOO02) {
            super(c31958OooOoo.f114060OooO0OO);
            this.f114068OooOo = oooOO02;
        }

        @Override // oO000Oo.AbstractRunnableC31956OooOoO0
        public final void OooO00o() {
            List<Runnable> list;
            OooOO0 oooOO02 = this.f114068OooOo;
            oooOO02.getClass();
            List<Runnable> arrayList = new ArrayList<>();
            while (true) {
                synchronized (oooOO02) {
                    try {
                        if (oooOO02.f114083OooO0OO.isEmpty()) {
                            oooOO02.f114083OooO0OO = null;
                            oooOO02.f114082OooO0O0 = true;
                            return;
                        } else {
                            list = oooOO02.f114083OooO0OO;
                            oooOO02.f114083OooO0OO = arrayList;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Iterator<Runnable> it = list.iterator();
                while (it.hasNext()) {
                    it.next().run();
                }
                list.clear();
                arrayList = list;
            }
        }
    }

    /* JADX INFO: renamed from: oO000Oo.OooOoo$OooO0O0 */
    public class OooO0O0 implements Runnable {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C33094OoooO f114069OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ OooO0o.OooO00o f114070OooOo0o;

        public OooO0O0(OooO0o.OooO00o oooO00o, C33094OoooO c33094OoooO) {
            this.f114070OooOo0o = oooO00o;
            this.f114069OooOo = c33094OoooO;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C31958OooOoo.this.f114062OooO0o.start(this.f114070OooOo0o, this.f114069OooOo);
        }
    }

    /* JADX INFO: renamed from: oO000Oo.OooOoo$OooO0OO */
    public class OooO0OO implements Runnable {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ oO0OOo0o.o00Oo0 f114073OooOo0o;

        public OooO0OO(oO0OOo0o.o00Oo0 o00oo02) {
            this.f114073OooOo0o = o00oo02;
        }

        @Override // java.lang.Runnable
        public final void run() {
            oO0OOo0o.OooO0o<ReqT, RespT> oooO0o = C31958OooOoo.this.f114062OooO0o;
            oO0OOo0o.o00Oo0 o00oo02 = this.f114073OooOo0o;
            oooO0o.cancel(o00oo02.f119729OooO0O0, o00oo02.f119730OooO0OO);
        }
    }

    /* JADX INFO: renamed from: oO000Oo.OooOoo$OooO0Oo, reason: case insensitive filesystem */
    public class RunnableC31959OooO0Oo implements Runnable {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f114075OooOo0o;

        public RunnableC31959OooO0Oo(Object obj) {
            this.f114075OooOo0o = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C31958OooOoo.this.f114062OooO0o.sendMessage((ReqT) this.f114075OooOo0o);
        }
    }

    /* JADX INFO: renamed from: oO000Oo.OooOoo$OooO0o */
    public class OooO0o implements Runnable {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ int f114077OooOo0o;

        public OooO0o(int i) {
            this.f114077OooOo0o = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C31958OooOoo.this.f114062OooO0o.request(this.f114077OooOo0o);
        }
    }

    /* JADX INFO: renamed from: oO000Oo.OooOoo$OooO0o0, reason: case insensitive filesystem */
    public class RunnableC31960OooO0o0 implements Runnable {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ boolean f114079OooOo0o;

        public RunnableC31960OooO0o0(boolean z) {
            this.f114079OooOo0o = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C31958OooOoo.this.f114062OooO0o.setMessageCompression(this.f114079OooOo0o);
        }
    }

    /* JADX INFO: renamed from: oO000Oo.OooOoo$OooO0oO, reason: case insensitive filesystem */
    public class RunnableC31961OooO0oO implements Runnable {
        public RunnableC31961OooO0oO() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C31958OooOoo.this.f114062OooO0o.halfClose();
        }
    }

    /* JADX INFO: renamed from: oO000Oo.OooOoo$OooO0oo, reason: case insensitive filesystem */
    public class C31962OooO0oo extends oO0OOo0o.OooO0o<Object, Object> {
        @Override // oO0OOo0o.OooO0o
        public final void cancel(String str, Throwable th) {
        }

        @Override // oO0OOo0o.OooO0o
        public final void halfClose() {
        }

        @Override // oO0OOo0o.OooO0o
        public final boolean isReady() {
            return false;
        }

        @Override // oO0OOo0o.OooO0o
        public final void request(int i) {
        }

        @Override // oO0OOo0o.OooO0o
        public final void sendMessage(Object obj) {
        }

        @Override // oO0OOo0o.OooO0o
        public final void start(OooO0o.OooO00o<Object> oooO00o, C33094OoooO c33094OoooO) {
        }
    }

    /* JADX INFO: renamed from: oO000Oo.OooOoo$OooOO0 */
    public static final class OooOO0<RespT> extends OooO0o.OooO00o<RespT> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO0o.OooO00o<RespT> f114081OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public volatile boolean f114082OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public List<Runnable> f114083OooO0OO = new ArrayList();

        /* JADX INFO: renamed from: oO000Oo.OooOoo$OooOO0$OooO00o */
        public class OooO00o implements Runnable {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ C33094OoooO f114085OooOo0o;

            public OooO00o(C33094OoooO c33094OoooO) {
                this.f114085OooOo0o = c33094OoooO;
            }

            @Override // java.lang.Runnable
            public final void run() {
                OooOO0.this.f114081OooO00o.onHeaders(this.f114085OooOo0o);
            }
        }

        /* JADX INFO: renamed from: oO000Oo.OooOoo$OooOO0$OooO0O0 */
        public class OooO0O0 implements Runnable {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ Object f114087OooOo0o;

            public OooO0O0(Object obj) {
                this.f114087OooOo0o = obj;
            }

            @Override // java.lang.Runnable
            public final void run() {
                OooOO0.this.f114081OooO00o.onMessage((RespT) this.f114087OooOo0o);
            }
        }

        /* JADX INFO: renamed from: oO000Oo.OooOoo$OooOO0$OooO0OO */
        public class OooO0OO implements Runnable {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ C33094OoooO f114088OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ oO0OOo0o.o00Oo0 f114089OooOo0o;

            public OooO0OO(oO0OOo0o.o00Oo0 o00oo02, C33094OoooO c33094OoooO) {
                this.f114089OooOo0o = o00oo02;
                this.f114088OooOo = c33094OoooO;
            }

            @Override // java.lang.Runnable
            public final void run() {
                OooOO0.this.f114081OooO00o.onClose(this.f114089OooOo0o, this.f114088OooOo);
            }
        }

        /* JADX INFO: renamed from: oO000Oo.OooOoo$OooOO0$OooO0Oo, reason: case insensitive filesystem */
        public class RunnableC31963OooO0Oo implements Runnable {
            public RunnableC31963OooO0Oo() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                OooOO0.this.f114081OooO00o.onReady();
            }
        }

        public OooOO0(OooO0o.OooO00o<RespT> oooO00o) {
            this.f114081OooO00o = oooO00o;
        }

        public final void OooO00o(Runnable runnable) {
            synchronized (this) {
                try {
                    if (this.f114082OooO0O0) {
                        runnable.run();
                    } else {
                        this.f114083OooO0OO.add(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // oO0OOo0o.OooO0o.OooO00o
        public final void onClose(oO0OOo0o.o00Oo0 o00oo02, C33094OoooO c33094OoooO) {
            OooO00o(new OooO0OO(o00oo02, c33094OoooO));
        }

        @Override // oO0OOo0o.OooO0o.OooO00o
        public final void onHeaders(C33094OoooO c33094OoooO) {
            if (this.f114082OooO0O0) {
                this.f114081OooO00o.onHeaders(c33094OoooO);
            } else {
                OooO00o(new OooO00o(c33094OoooO));
            }
        }

        @Override // oO0OOo0o.OooO0o.OooO00o
        public final void onMessage(RespT respt) {
            if (this.f114082OooO0O0) {
                this.f114081OooO00o.onMessage(respt);
            } else {
                OooO00o(new OooO0O0(respt));
            }
        }

        @Override // oO0OOo0o.OooO0o.OooO00o
        public final void onReady() {
            if (this.f114082OooO0O0) {
                this.f114081OooO00o.onReady();
            } else {
                OooO00o(new RunnableC31963OooO0Oo());
            }
        }
    }

    static {
        Logger.getLogger(C31958OooOoo.class.getName());
        f114056OooOO0 = new C31962OooO0oo();
    }

    public C31958OooOoo(Executor executor, ScheduledExecutorService scheduledExecutorService, C33068OooOOo c33068OooOOo) {
        long jOooO0OO;
        ScheduledFuture<?> scheduledFutureSchedule;
        this.f114059OooO0O0 = (Executor) Preconditions.checkNotNull(executor, "callExecutor");
        Preconditions.checkNotNull(scheduledExecutorService, "scheduler");
        C33065OooOOOo c33065OooOOOoOooOOoo = C33065OooOOOo.OooOOoo();
        this.f114060OooO0OO = c33065OooOOOoOooOOoo;
        c33065OooOOOoOooOOoo.Oooo000();
        if (c33068OooOOo == null) {
            scheduledFutureSchedule = null;
        } else {
            if (c33068OooOOo != null) {
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                jOooO0OO = c33068OooOOo.OooO0OO();
            } else {
                jOooO0OO = LocationRequestCompat.PASSIVE_INTERVAL;
            }
            long jAbs = Math.abs(jOooO0OO);
            TimeUnit timeUnit2 = TimeUnit.SECONDS;
            long nanos = jAbs / timeUnit2.toNanos(1L);
            long jAbs2 = Math.abs(jOooO0OO) % timeUnit2.toNanos(1L);
            StringBuilder sb = new StringBuilder();
            String str = c33068OooOOo == null ? AuthenticationConstants.Broker.CHALLENGE_RESPONSE_CONTEXT : "CallOptions";
            if (jOooO0OO < 0) {
                androidx.concurrent.futures.OooO0O0.OooO0O0(sb, "ClientCall started after ", str, " deadline was exceeded. Deadline has been exceeded for ");
            } else {
                androidx.concurrent.futures.OooO0O0.OooO0O0(sb, "Deadline ", str, " will be exceeded in ");
            }
            sb.append(nanos);
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
            sb.append("s. ");
            scheduledFutureSchedule = scheduledExecutorService.schedule(new RunnableC31964OooOoo0(this, sb), jOooO0OO, TimeUnit.NANOSECONDS);
        }
        this.f114058OooO00o = scheduledFutureSchedule;
    }

    public void OooO00o() {
    }

    public final void OooO0O0(oO0OOo0o.o00Oo0 o00oo02, boolean z) {
        OooO0o.OooO00o<RespT> oooO00o;
        synchronized (this) {
            try {
                oO0OOo0o.OooO0o<ReqT, RespT> oooO0o = this.f114062OooO0o;
                boolean z2 = true;
                if (oooO0o == null) {
                    C31962OooO0oo c31962OooO0oo = f114056OooOO0;
                    if (oooO0o != null) {
                        z2 = false;
                    }
                    Preconditions.checkState(z2, "realCall already set to %s", oooO0o);
                    ScheduledFuture<?> scheduledFuture = this.f114058OooO00o;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f114062OooO0o = c31962OooO0oo;
                    oooO00o = this.f114063OooO0o0;
                    this.f114064OooO0oO = o00oo02;
                    z2 = false;
                } else if (z) {
                    return;
                } else {
                    oooO00o = null;
                }
                if (z2) {
                    OooO0OO(new OooO0OO(o00oo02));
                } else {
                    if (oooO00o != null) {
                        this.f114059OooO0O0.execute(new OooO(this, oooO00o, o00oo02));
                    }
                    OooO0Oo();
                }
                OooO00o();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO0OO(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.f114061OooO0Oo) {
                    runnable.run();
                } else {
                    this.f114065OooO0oo.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r0.hasNext() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        r0.next().run();
     */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO0Oo() {
        OooOO0<RespT> oooOO02;
        List<Runnable> list;
        List<Runnable> arrayList = new ArrayList<>();
        while (true) {
            synchronized (this) {
                if (this.f114065OooO0oo.isEmpty()) {
                    break;
                }
                list = this.f114065OooO0oo;
                this.f114065OooO0oo = arrayList;
            }
            if (oooOO02 == null) {
                this.f114059OooO0O0.execute(new OooO00o(this, oooOO02));
                return;
            }
            return;
            list.clear();
            arrayList = list;
        }
        this.f114065OooO0oo = null;
        this.f114061OooO0Oo = true;
        oooOO02 = this.f114057OooO;
        if (oooOO02 == null) {
        }
    }

    @Override // oO0OOo0o.OooO0o
    public final void cancel(String str, Throwable th) {
        oO0OOo0o.o00Oo0 o00oo02 = oO0OOo0o.o00Oo0.f119716OooO0o;
        oO0OOo0o.o00Oo0 o00oo0OooO0oo = str != null ? o00oo02.OooO0oo(str) : o00oo02.OooO0oo("Call cancelled without message");
        if (th != null) {
            o00oo0OooO0oo = o00oo0OooO0oo.OooO0oO(th);
        }
        OooO0O0(o00oo0OooO0oo, false);
    }

    @Override // oO0OOo0o.OooO0o
    public final C33058OooO00o getAttributes() {
        oO0OOo0o.OooO0o<ReqT, RespT> oooO0o;
        synchronized (this) {
            oooO0o = this.f114062OooO0o;
        }
        return oooO0o != null ? oooO0o.getAttributes() : C33058OooO00o.f119518OooO0O0;
    }

    @Override // oO0OOo0o.OooO0o
    public final void halfClose() {
        OooO0OO(new RunnableC31961OooO0oO());
    }

    @Override // oO0OOo0o.OooO0o
    public final boolean isReady() {
        if (this.f114061OooO0Oo) {
            return this.f114062OooO0o.isReady();
        }
        return false;
    }

    @Override // oO0OOo0o.OooO0o
    public final void request(int i) {
        if (this.f114061OooO0Oo) {
            this.f114062OooO0o.request(i);
        } else {
            OooO0OO(new OooO0o(i));
        }
    }

    @Override // oO0OOo0o.OooO0o
    public final void sendMessage(ReqT reqt) {
        if (this.f114061OooO0Oo) {
            this.f114062OooO0o.sendMessage(reqt);
        } else {
            OooO0OO(new RunnableC31959OooO0Oo(reqt));
        }
    }

    @Override // oO0OOo0o.OooO0o
    public final void setMessageCompression(boolean z) {
        if (this.f114061OooO0Oo) {
            this.f114062OooO0o.setMessageCompression(z);
        } else {
            OooO0OO(new RunnableC31960OooO0o0(z));
        }
    }

    @Override // oO0OOo0o.OooO0o
    public final void start(OooO0o.OooO00o<RespT> oooO00o, C33094OoooO c33094OoooO) {
        oO0OOo0o.o00Oo0 o00oo02;
        boolean z;
        Preconditions.checkState(this.f114063OooO0o0 == null, "already started");
        synchronized (this) {
            try {
                this.f114063OooO0o0 = (OooO0o.OooO00o) Preconditions.checkNotNull(oooO00o, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                o00oo02 = this.f114064OooO0oO;
                z = this.f114061OooO0Oo;
                if (!z) {
                    OooOO0<RespT> oooOO02 = new OooOO0<>(oooO00o);
                    this.f114057OooO = oooOO02;
                    oooO00o = oooOO02;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (o00oo02 != null) {
            this.f114059OooO0O0.execute(new OooO(this, oooO00o, o00oo02));
        } else if (z) {
            this.f114062OooO0o.start(oooO00o, c33094OoooO);
        } else {
            OooO0OO(new OooO0O0(oooO00o, c33094OoooO));
        }
    }

    public final String toString() {
        return MoreObjects.toStringHelper(this).add("realCall", this.f114062OooO0o).toString();
    }
}
