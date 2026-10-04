package o00OooO;

import androidx.fragment.app.C21929Ooooo0o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import o00Ooo0o.EnumC25112OooO00o;
import o00OooO.OooOO0;
import o00o00oO.C25292OooO0oo;
import o00o0O0.C25313OooO0o0;
import o00o0O0.C25316OooOO0o;
import o00o0O0O.AbstractC25326OooO0Oo;
import o00o0O0O.C25321OooO00o;
import o0O00o0.ExecutorServiceC25844OooO00o;

/* JADX INFO: loaded from: classes5.dex */
public final class OooOOO<R> implements C25321OooO00o.InterfaceC25322OooO0Oo {

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public static final OooO0OO f85491OoooO0O = new OooO0OO();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final AbstractC25326OooO0Oo.OooO00o f85492OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C25137OooO0o0 f85493OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C25321OooO00o.OooO0OO f85494OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final OooOOO0 f85495OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final OooO0OO f85496OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final ExecutorServiceC25844OooO00o f85497OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final OooOOO0 f85498OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final ExecutorServiceC25844OooO00o f85499OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final ExecutorServiceC25844OooO00o f85500OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public OooOO0<R> f85501Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public boolean f85502Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final AtomicInteger f85503Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public OooOOOO f85504Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public boolean f85505Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public InterfaceC25145OooOo0o<?> f85506Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public EnumC25112OooO00o f85507Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public C25140OooOOo f85508Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public boolean f85509Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f85510Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public C25141OooOOo0<?> f85511Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public boolean f85512OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public volatile boolean f85513OoooO00;

    public class OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final C25292OooO0oo f85515OooOo0o;

        public OooO00o(C25292OooO0oo c25292OooO0oo) {
            this.f85515OooOo0o = c25292OooO0oo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C25292OooO0oo c25292OooO0oo = this.f85515OooOo0o;
            c25292OooO0oo.f86074OooO0O0.OooO00o();
            synchronized (c25292OooO0oo.f86075OooO0OO) {
                synchronized (OooOOO.this) {
                    try {
                        C25137OooO0o0 c25137OooO0o0 = OooOOO.this.f85493OooOo0o;
                        C25292OooO0oo c25292OooO0oo2 = this.f85515OooOo0o;
                        c25137OooO0o0.getClass();
                        if (c25137OooO0o0.f85520OooOo0o.contains(new C25136OooO0Oo(c25292OooO0oo2, C25313OooO0o0.f86152OooO0O0))) {
                            OooOOO oooOOO = OooOOO.this;
                            C25292OooO0oo c25292OooO0oo3 = this.f85515OooOo0o;
                            oooOOO.getClass();
                            try {
                                c25292OooO0oo3.OooOO0(oooOOO.f85508Oooo0o, 5);
                            } catch (Throwable th) {
                                throw new C25127OooO0Oo(th);
                            }
                        }
                        OooOOO.this.OooO0Oo();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    public class OooO0O0 implements Runnable {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final C25292OooO0oo f85517OooOo0o;

        public OooO0O0(C25292OooO0oo c25292OooO0oo) {
            this.f85517OooOo0o = c25292OooO0oo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C25292OooO0oo c25292OooO0oo = this.f85517OooOo0o;
            c25292OooO0oo.f86074OooO0O0.OooO00o();
            synchronized (c25292OooO0oo.f86075OooO0OO) {
                synchronized (OooOOO.this) {
                    try {
                        C25137OooO0o0 c25137OooO0o0 = OooOOO.this.f85493OooOo0o;
                        C25292OooO0oo c25292OooO0oo2 = this.f85517OooOo0o;
                        c25137OooO0o0.getClass();
                        if (c25137OooO0o0.f85520OooOo0o.contains(new C25136OooO0Oo(c25292OooO0oo2, C25313OooO0o0.f86152OooO0O0))) {
                            OooOOO.this.f85511Oooo0oo.OooO0O0();
                            OooOOO oooOOO = OooOOO.this;
                            C25292OooO0oo c25292OooO0oo3 = this.f85517OooOo0o;
                            oooOOO.getClass();
                            try {
                                c25292OooO0oo3.OooOO0o(oooOOO.f85511Oooo0oo, oooOOO.f85507Oooo0OO, oooOOO.f85512OoooO0);
                                OooOOO.this.OooO0oo(this.f85517OooOo0o);
                            } catch (Throwable th) {
                                throw new C25127OooO0Oo(th);
                            }
                        }
                        OooOOO.this.OooO0Oo();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    public static class OooO0OO {
    }

    /* JADX INFO: renamed from: o00OooO.OooOOO$OooO0Oo, reason: case insensitive filesystem */
    public static final class C25136OooO0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C25292OooO0oo f85518OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Executor f85519OooO0O0;

        public C25136OooO0Oo(C25292OooO0oo c25292OooO0oo, Executor executor) {
            this.f85518OooO00o = c25292OooO0oo;
            this.f85519OooO0O0 = executor;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C25136OooO0Oo) {
                return this.f85518OooO00o.equals(((C25136OooO0Oo) obj).f85518OooO00o);
            }
            return false;
        }

        public final int hashCode() {
            return this.f85518OooO00o.hashCode();
        }
    }

    /* JADX INFO: renamed from: o00OooO.OooOOO$OooO0o0, reason: case insensitive filesystem */
    public static final class C25137OooO0o0 implements Iterable<C25136OooO0Oo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final ArrayList f85520OooOo0o;

        public C25137OooO0o0(ArrayList arrayList) {
            this.f85520OooOo0o = arrayList;
        }

        @Override // java.lang.Iterable
        public final Iterator<C25136OooO0Oo> iterator() {
            return this.f85520OooOo0o.iterator();
        }
    }

    public OooOOO() {
        throw null;
    }

    public OooOOO(ExecutorServiceC25844OooO00o executorServiceC25844OooO00o, ExecutorServiceC25844OooO00o executorServiceC25844OooO00o2, ExecutorServiceC25844OooO00o executorServiceC25844OooO00o3, ExecutorServiceC25844OooO00o executorServiceC25844OooO00o4, OooOOO0 oooOOO0, OooOOO0 oooOOO02, C25321OooO00o.OooO0OO oooO0OO) {
        OooO0OO oooO0OO2 = f85491OoooO0O;
        this.f85493OooOo0o = new C25137OooO0o0(new ArrayList(2));
        this.f85492OooOo = new AbstractC25326OooO0Oo.OooO00o();
        this.f85503Oooo000 = new AtomicInteger();
        this.f85497OooOoo = executorServiceC25844OooO00o;
        this.f85499OooOooO = executorServiceC25844OooO00o2;
        this.f85500OooOooo = executorServiceC25844OooO00o4;
        this.f85498OooOoo0 = oooOOO0;
        this.f85495OooOoO0 = oooOOO02;
        this.f85494OooOoO = oooO0OO;
        this.f85496OooOoOO = oooO0OO2;
    }

    public final synchronized void OooO00o(C25292OooO0oo c25292OooO0oo, C25313OooO0o0.OooO00o oooO00o) {
        try {
            this.f85492OooOo.OooO00o();
            C25137OooO0o0 c25137OooO0o0 = this.f85493OooOo0o;
            c25137OooO0o0.getClass();
            c25137OooO0o0.f85520OooOo0o.add(new C25136OooO0Oo(c25292OooO0oo, oooO00o));
            if (this.f85509Oooo0o0) {
                OooO0o0(1);
                OooO0O0 oooO0O0 = new OooO0O0(c25292OooO0oo);
                oooO00o.getClass();
                C25316OooOO0o.OooOO0(oooO0O0);
            } else if (this.f85510Oooo0oO) {
                OooO0o0(1);
                OooO00o oooO00o2 = new OooO00o(c25292OooO0oo);
                oooO00o.getClass();
                C25316OooOO0o.OooOO0(oooO00o2);
            } else {
                C21929Ooooo0o.OooO00o(!this.f85513OoooO00, "Cannot add callbacks to a cancelled EngineJob");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // o00o0O0O.C25321OooO00o.InterfaceC25322OooO0Oo
    public final AbstractC25326OooO0Oo.OooO00o OooO0O0() {
        return this.f85492OooOo;
    }

    public final void OooO0OO() {
        if (OooO0o()) {
            return;
        }
        this.f85513OoooO00 = true;
        OooOO0<R> oooOO02 = this.f85501Oooo;
        oooOO02.f85461OoooOoO = true;
        InterfaceC25130OooO0oo interfaceC25130OooO0oo = oooOO02.f85459OoooOOo;
        if (interfaceC25130OooO0oo != null) {
            interfaceC25130OooO0oo.cancel();
        }
        OooOOO0 oooOOO0 = this.f85498OooOoo0;
        OooOOOO oooOOOO = this.f85504Oooo00O;
        synchronized (oooOOO0) {
            OooOo00 oooOo00 = oooOOO0.f85522OooO00o;
            oooOo00.getClass();
            HashMap map = oooOo00.f85583OooO00o;
            if (equals(map.get(oooOOOO))) {
                map.remove(oooOOOO);
            }
        }
    }

    public final void OooO0Oo() {
        C25141OooOOo0<?> c25141OooOOo0;
        synchronized (this) {
            try {
                this.f85492OooOo.OooO00o();
                C21929Ooooo0o.OooO00o(OooO0o(), "Not yet complete!");
                int iDecrementAndGet = this.f85503Oooo000.decrementAndGet();
                C21929Ooooo0o.OooO00o(iDecrementAndGet >= 0, "Can't decrement below 0");
                if (iDecrementAndGet == 0) {
                    c25141OooOOo0 = this.f85511Oooo0oo;
                    OooO0oO();
                } else {
                    c25141OooOOo0 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c25141OooOOo0 != null) {
            c25141OooOOo0.OooO0OO();
        }
    }

    public final boolean OooO0o() {
        return this.f85510Oooo0oO || this.f85509Oooo0o0 || this.f85513OoooO00;
    }

    public final synchronized void OooO0o0(int i) {
        C25141OooOOo0<?> c25141OooOOo0;
        C21929Ooooo0o.OooO00o(OooO0o(), "Not yet complete!");
        if (this.f85503Oooo000.getAndAdd(i) == 0 && (c25141OooOOo0 = this.f85511Oooo0oo) != null) {
            c25141OooOOo0.OooO0O0();
        }
    }

    public final synchronized void OooO0oO() {
        boolean zOooO00o;
        if (this.f85504Oooo00O == null) {
            throw new IllegalArgumentException();
        }
        this.f85493OooOo0o.f85520OooOo0o.clear();
        this.f85504Oooo00O = null;
        this.f85511Oooo0oo = null;
        this.f85506Oooo0O0 = null;
        this.f85510Oooo0oO = false;
        this.f85513OoooO00 = false;
        this.f85509Oooo0o0 = false;
        this.f85512OoooO0 = false;
        OooOO0<R> oooOO02 = this.f85501Oooo;
        OooOO0.OooO0OO oooO0OO = oooOO02.f85438OooOoo;
        synchronized (oooO0OO) {
            oooO0OO.f85469OooO00o = true;
            zOooO00o = oooO0OO.OooO00o();
        }
        if (zOooO00o) {
            oooOO02.OooOO0O();
        }
        this.f85501Oooo = null;
        this.f85508Oooo0o = null;
        this.f85507Oooo0OO = null;
        this.f85494OooOoO.release(this);
    }

    public final synchronized void OooO0oo(C25292OooO0oo c25292OooO0oo) {
        try {
            this.f85492OooOo.OooO00o();
            C25137OooO0o0 c25137OooO0o0 = this.f85493OooOo0o;
            c25137OooO0o0.f85520OooOo0o.remove(new C25136OooO0Oo(c25292OooO0oo, C25313OooO0o0.f86152OooO0O0));
            if (this.f85493OooOo0o.f85520OooOo0o.isEmpty()) {
                OooO0OO();
                if (this.f85509Oooo0o0 || this.f85510Oooo0oO) {
                    if (this.f85503Oooo000.get() == 0) {
                        OooO0oO();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
