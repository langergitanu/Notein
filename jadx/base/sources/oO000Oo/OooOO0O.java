package oO000Oo;

import com.google.common.base.Preconditions;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import oO000Oo.C31999OoooOoo;
import oO000Oo.InterfaceC31949OooOo0;
import oO000Oo.o00Ooo;
import oO0OOo0o.AbstractC33059OooO0O0;
import oO0OOo0o.C33094OoooO;
import oO0OOo0o.C33101OoooOO0;
import oO0OOo0o.InterfaceC33083Oooo00o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOO0O implements InterfaceC31949OooOo0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Executor f113975OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC31949OooOo0 f113976OooOo0o;

    public class OooO00o extends AbstractC31984Oooo0oO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final InterfaceC31954OooOo0o f113977OooO00o;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public volatile oO0OOo0o.o00Oo0 f113979OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public oO0OOo0o.o00Oo0 f113980OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public oO0OOo0o.o00Oo0 f113982OooO0o0;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final AtomicInteger f113978OooO0O0 = new AtomicInteger(-2147483647);

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final C20191OooO00o f113981OooO0o = new C20191OooO00o();

        /* JADX INFO: renamed from: oO000Oo.OooOO0O$OooO00o$OooO00o, reason: collision with other inner class name */
        public class C20191OooO00o {
            public C20191OooO00o() {
            }
        }

        public class OooO0O0 extends AbstractC33059OooO0O0.AbstractC20298OooO0O0 {
        }

        public OooO00o(InterfaceC31954OooOo0o interfaceC31954OooOo0o, String str) {
            this.f113977OooO00o = (InterfaceC31954OooOo0o) Preconditions.checkNotNull(interfaceC31954OooOo0o, "delegate");
        }

        public static void OooO0oO(OooO00o oooO00o) {
            synchronized (oooO00o) {
                try {
                    if (oooO00o.f113978OooO0O0.get() != 0) {
                        return;
                    }
                    oO0OOo0o.o00Oo0 o00oo02 = oooO00o.f113980OooO0Oo;
                    oO0OOo0o.o00Oo0 o00oo03 = oooO00o.f113982OooO0o0;
                    oooO00o.f113980OooO0Oo = null;
                    oooO00o.f113982OooO0o0 = null;
                    if (o00oo02 != null) {
                        super.OooO0o(o00oo02);
                    }
                    if (o00oo03 != null) {
                        super.OooO0O0(o00oo03);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // oO000Oo.AbstractC31984Oooo0oO
        public final InterfaceC31954OooOo0o OooO00o() {
            return this.f113977OooO00o;
        }

        @Override // oO000Oo.AbstractC31984Oooo0oO, oO000Oo.o000000
        public final void OooO0O0(oO0OOo0o.o00Oo0 o00oo02) {
            Preconditions.checkNotNull(o00oo02, "status");
            synchronized (this) {
                try {
                    if (this.f113978OooO0O0.get() < 0) {
                        this.f113979OooO0OO = o00oo02;
                        this.f113978OooO0O0.addAndGet(Integer.MAX_VALUE);
                    } else if (this.f113982OooO0o0 != null) {
                        return;
                    }
                    if (this.f113978OooO0O0.get() != 0) {
                        this.f113982OooO0o0 = o00oo02;
                    } else {
                        super.OooO0O0(o00oo02);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // oO000Oo.OooOo00
        public final InterfaceC31946OooOOo OooO0Oo(C33101OoooOO0<?, ?> c33101OoooOO0, C33094OoooO c33094OoooO, oO0OOo0o.OooO0OO oooO0OO, oO0OOo0o.OooO[] oooOArr) {
            InterfaceC31946OooOOo interfaceC31946OooOOo;
            Executor executor;
            AbstractC33059OooO0O0 abstractC33059OooO0O0 = oooO0OO.f119527OooO0OO;
            if (abstractC33059OooO0O0 == null) {
                OooOO0O.this.getClass();
                abstractC33059OooO0O0 = null;
            } else {
                OooOO0O.this.getClass();
            }
            if (abstractC33059OooO0O0 == null) {
                return this.f113978OooO0O0.get() >= 0 ? new C31980Oooo0O0(this.f113979OooO0OO, oooOArr) : this.f113977OooO00o.OooO0Oo(c33101OoooOO0, c33094OoooO, oooO0OO, oooOArr);
            }
            o00000 o00000Var = new o00000(this.f113977OooO00o, c33101OoooOO0, c33094OoooO, oooO0OO, this.f113981OooO0o, oooOArr);
            if (this.f113978OooO0O0.incrementAndGet() > 0) {
                OooO00o oooO00o = OooO00o.this;
                if (oooO00o.f113978OooO0O0.decrementAndGet() == 0) {
                    OooO0oO(oooO00o);
                }
                return new C31980Oooo0O0(this.f113979OooO0OO, oooOArr);
            }
            OooO0O0 oooO0O0 = new OooO0O0();
            try {
                if (!(abstractC33059OooO0O0 instanceof InterfaceC33083Oooo00o) || !((InterfaceC33083Oooo00o) abstractC33059OooO0O0).OooO00o() || (executor = oooO0OO.f119526OooO0O0) == null) {
                    executor = OooOO0O.this.f113975OooOo;
                }
                abstractC33059OooO0O0.applyRequestMetadata(oooO0O0, executor, o00000Var);
            } catch (Throwable th) {
                o00000Var.OooO0O0(oO0OOo0o.o00Oo0.f119720OooOO0.OooO0oo("Credentials should use fail() instead of throwing exceptions").OooO0oO(th));
            }
            synchronized (o00000Var.f114325OooO0oo) {
                try {
                    InterfaceC31946OooOOo interfaceC31946OooOOo2 = o00000Var.f114317OooO;
                    interfaceC31946OooOOo = interfaceC31946OooOOo2;
                    if (interfaceC31946OooOOo2 == null) {
                        C31968OooOooo c31968OooOooo = new C31968OooOooo();
                        o00000Var.f114327OooOO0O = c31968OooOooo;
                        o00000Var.f114317OooO = c31968OooOooo;
                    }
                } finally {
                }
            }
            return interfaceC31946OooOOo;
        }

        @Override // oO000Oo.AbstractC31984Oooo0oO, oO000Oo.o000000
        public final void OooO0o(oO0OOo0o.o00Oo0 o00oo02) {
            Preconditions.checkNotNull(o00oo02, "status");
            synchronized (this) {
                try {
                    if (this.f113978OooO0O0.get() < 0) {
                        this.f113979OooO0OO = o00oo02;
                        this.f113978OooO0O0.addAndGet(Integer.MAX_VALUE);
                        if (this.f113978OooO0O0.get() != 0) {
                            this.f113980OooO0Oo = o00oo02;
                        } else {
                            super.OooO0o(o00oo02);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public OooOO0O(InterfaceC31949OooOo0 interfaceC31949OooOo0, o00Ooo.ExecutorC32058OooO0oo executorC32058OooO0oo) {
        this.f113976OooOo0o = (InterfaceC31949OooOo0) Preconditions.checkNotNull(interfaceC31949OooOo0, "delegate");
        this.f113975OooOo = (Executor) Preconditions.checkNotNull(executorC32058OooO0oo, "appExecutor");
    }

    @Override // oO000Oo.InterfaceC31949OooOo0
    public final InterfaceC31954OooOo0o OooOo(SocketAddress socketAddress, InterfaceC31949OooOo0.OooO00o oooO00o, C31999OoooOoo.OooO0o oooO0o) {
        return new OooO00o(this.f113976OooOo0o.OooOo(socketAddress, oooO00o, oooO0o), oooO00o.f114042OooO00o);
    }

    @Override // oO000Oo.InterfaceC31949OooOo0
    public final ScheduledExecutorService Oooo0o0() {
        return this.f113976OooOo0o.Oooo0o0();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f113976OooOo0o.close();
    }

    @Override // oO000Oo.InterfaceC31949OooOo0
    public final Collection<Class<? extends SocketAddress>> o0ooOO0() {
        return this.f113976OooOo0o.o0ooOO0();
    }
}
