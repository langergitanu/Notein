package o0ooOO0;

import OooOoOO.C20519OooO0Oo;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.core.os.HandlerCompat;
import java.util.ArrayList;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oO0o0OO.AbstractC33630OooOooO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0Ooo.C33833OooOOOO;
import oO0o0o0o.C33874OooO0OO;
import oOo0000O.InterfaceC34415OooO0oo;
import oOo000Oo.C34426OooOO0o;

/* JADX INFO: renamed from: o0ooOO0.OoooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C31542OoooOOO extends AbstractC33630OooOooO {

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public static final C32447OooOOo f112743Oooo0 = C20519OooO0Oo.OooO0OO(OooO00o.f112755OooOo0o);

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public static final OooO0O0 f112744Oooo0O0 = new OooO0O0();

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final Handler f112745OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final Choreographer f112746OooOoO0;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public boolean f112751OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f112752Oooo000;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final C31546OoooOoo f112754Oooo00o;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final Object f112747OooOoOO = new Object();

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C34426OooOO0o<Runnable> f112749OooOoo0 = new C34426OooOO0o<>();

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public ArrayList f112748OooOoo = new ArrayList();

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public ArrayList f112750OooOooO = new ArrayList();

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final OooO0OO f112753Oooo00O = new OooO0OO();

    /* JADX INFO: renamed from: o0ooOO0.OoooOOO$OooO00o */
    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<InterfaceC34415OooO0oo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f112755OooOo0o = new OooO00o(0);

        @Override // oO0O000o.OooO00o
        public final InterfaceC34415OooO0oo invoke() {
            Choreographer choreographer;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                choreographer = Choreographer.getInstance();
            } else {
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                choreographer = (Choreographer) C33609OooO0oo.OooO0Oo(C33833OooOOOO.f121946OooO00o, new C31598o000oOoO(2, null));
            }
            kotlin.jvm.internal.OooOOO0.OooO0o(choreographer, "if (isMainThread()) Chor…eographer.getInstance() }");
            Handler handlerCreateAsync = HandlerCompat.createAsync(Looper.getMainLooper());
            kotlin.jvm.internal.OooOOO0.OooO0o(handlerCreateAsync, "createAsync(Looper.getMainLooper())");
            C31542OoooOOO c31542OoooOOO = new C31542OoooOOO(choreographer, handlerCreateAsync);
            return InterfaceC34415OooO0oo.OooO0O0.OooO00o.OooO0Oo(c31542OoooOOO, c31542OoooOOO.f112754Oooo00o);
        }
    }

    /* JADX INFO: renamed from: o0ooOO0.OoooOOO$OooO0O0 */
    public static final class OooO0O0 extends ThreadLocal<InterfaceC34415OooO0oo> {
        @Override // java.lang.ThreadLocal
        public final InterfaceC34415OooO0oo initialValue() {
            Choreographer choreographer = Choreographer.getInstance();
            kotlin.jvm.internal.OooOOO0.OooO0o(choreographer, "getInstance()");
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                throw new IllegalStateException("no Looper on this thread");
            }
            Handler handlerCreateAsync = HandlerCompat.createAsync(looperMyLooper);
            kotlin.jvm.internal.OooOOO0.OooO0o(handlerCreateAsync, "createAsync(\n           …d\")\n                    )");
            C31542OoooOOO c31542OoooOOO = new C31542OoooOOO(choreographer, handlerCreateAsync);
            return InterfaceC34415OooO0oo.OooO0O0.OooO00o.OooO0Oo(c31542OoooOOO, c31542OoooOOO.f112754Oooo00o);
        }
    }

    /* JADX INFO: renamed from: o0ooOO0.OoooOOO$OooO0OO */
    public static final class OooO0OO implements Choreographer.FrameCallback, Runnable {
        public OooO0OO() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            C31542OoooOOO.this.f112745OooOoO.removeCallbacks(this);
            C31542OoooOOO.o000OOoO(C31542OoooOOO.this);
            C31542OoooOOO c31542OoooOOO = C31542OoooOOO.this;
            synchronized (c31542OoooOOO.f112747OooOoOO) {
                if (c31542OoooOOO.f112752Oooo000) {
                    c31542OoooOOO.f112752Oooo000 = false;
                    ArrayList arrayList = c31542OoooOOO.f112748OooOoo;
                    c31542OoooOOO.f112748OooOoo = c31542OoooOOO.f112750OooOooO;
                    c31542OoooOOO.f112750OooOooO = arrayList;
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
                    }
                    arrayList.clear();
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            C31542OoooOOO.o000OOoO(C31542OoooOOO.this);
            C31542OoooOOO c31542OoooOOO = C31542OoooOOO.this;
            synchronized (c31542OoooOOO.f112747OooOoOO) {
                try {
                    if (c31542OoooOOO.f112748OooOoo.isEmpty()) {
                        c31542OoooOOO.f112746OooOoO0.removeFrameCallback(this);
                        c31542OoooOOO.f112752Oooo000 = false;
                    }
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public C31542OoooOOO(Choreographer choreographer, Handler handler) {
        this.f112746OooOoO0 = choreographer;
        this.f112745OooOoO = handler;
        this.f112754Oooo00o = new C31546OoooOoo(choreographer);
    }

    public static final void o000OOoO(C31542OoooOOO c31542OoooOOO) {
        Runnable runnableRemoveFirst;
        boolean z;
        do {
            synchronized (c31542OoooOOO.f112747OooOoOO) {
                C34426OooOO0o<Runnable> c34426OooOO0o = c31542OoooOOO.f112749OooOoo0;
                runnableRemoveFirst = c34426OooOO0o.isEmpty() ? null : c34426OooOO0o.removeFirst();
            }
            while (runnableRemoveFirst != null) {
                runnableRemoveFirst.run();
                synchronized (c31542OoooOOO.f112747OooOoOO) {
                    C34426OooOO0o<Runnable> c34426OooOO0o2 = c31542OoooOOO.f112749OooOoo0;
                    runnableRemoveFirst = c34426OooOO0o2.isEmpty() ? null : c34426OooOO0o2.removeFirst();
                }
            }
            synchronized (c31542OoooOOO.f112747OooOoOO) {
                if (c31542OoooOOO.f112749OooOoo0.isEmpty()) {
                    z = false;
                    c31542OoooOOO.f112751OooOooo = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    @Override // oO0o0OO.AbstractC33630OooOooO
    public final void o0OoO0o(InterfaceC34415OooO0oo context, Runnable block) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
        kotlin.jvm.internal.OooOOO0.OooO0oO(block, "block");
        synchronized (this.f112747OooOoOO) {
            try {
                this.f112749OooOoo0.addLast(block);
                if (!this.f112751OooOooo) {
                    this.f112751OooOooo = true;
                    this.f112745OooOoO.post(this.f112753Oooo00O);
                    if (!this.f112752Oooo000) {
                        this.f112752Oooo000 = true;
                        this.f112746OooOoO0.postFrameCallback(this.f112753Oooo00O);
                    }
                }
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
