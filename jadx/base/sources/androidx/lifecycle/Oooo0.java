package androidx.lifecycle;

import OooOOO.OooO0O0;
import OooOoo.C20593OooO0Oo;
import android.os.Looper;
import androidx.camera.view.PreviewView;
import androidx.lifecycle.AbstractC21979OooOOo0;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class Oooo0<T> {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final Object f65572OooOO0O = new Object();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f65573OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f65574OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOOO.OooO0O0<InterfaceC21998Oooo0o0<? super T>, Oooo0<T>.AbstractC21992OooO0Oo> f65575OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f65576OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f65577OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public volatile Object f65578OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public volatile Object f65579OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f65580OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f65581OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final OooO00o f65582OooOO0;

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            Object obj;
            synchronized (Oooo0.this.f65574OooO00o) {
                obj = Oooo0.this.f65578OooO0o;
                Oooo0.this.f65578OooO0o = Oooo0.f65572OooOO0O;
            }
            Oooo0.this.OooOO0(obj);
        }
    }

    public class OooO0O0 extends Oooo0<T>.AbstractC21992OooO0Oo {
        @Override // androidx.lifecycle.Oooo0.AbstractC21992OooO0Oo
        public final boolean OooO0Oo() {
            return true;
        }
    }

    public class OooO0OO extends Oooo0<T>.AbstractC21992OooO0Oo implements InterfaceC21986OooOoOO {

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final Object f65584OooOoOO;

        public OooO0OO(InterfaceC21987OooOoo interfaceC21987OooOoo, InterfaceC21998Oooo0o0<? super T> interfaceC21998Oooo0o0) {
            super(interfaceC21998Oooo0o0);
            this.f65584OooOoOO = interfaceC21987OooOoo;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.OooOoo, java.lang.Object] */
        @Override // androidx.lifecycle.Oooo0.AbstractC21992OooO0Oo
        public final void OooO0O0() {
            this.f65584OooOoOO.getLifecycle().OooO0OO(this);
        }

        @Override // androidx.lifecycle.Oooo0.AbstractC21992OooO0Oo
        public final boolean OooO0OO(InterfaceC21987OooOoo interfaceC21987OooOoo) {
            return this.f65584OooOoOO == interfaceC21987OooOoo;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.OooOoo, java.lang.Object] */
        @Override // androidx.lifecycle.Oooo0.AbstractC21992OooO0Oo
        public final boolean OooO0Oo() {
            return this.f65584OooOoOO.getLifecycle().OooO0O0().compareTo(AbstractC21979OooOOo0.OooO0O0.f65539OooOoO) >= 0;
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.OooOoo, java.lang.Object] */
        @Override // androidx.lifecycle.InterfaceC21986OooOoOO
        public final void OooOOo0(InterfaceC21987OooOoo interfaceC21987OooOoo, AbstractC21979OooOOo0.OooO00o oooO00o) {
            ?? r3 = this.f65584OooOoOO;
            AbstractC21979OooOOo0.OooO0O0 OooO0O02 = r3.getLifecycle().OooO0O0();
            if (OooO0O02 == AbstractC21979OooOOo0.OooO0O0.f65538OooOo0o) {
                Oooo0.this.OooO(this.f65587OooOo0o);
                return;
            }
            AbstractC21979OooOOo0.OooO0O0 oooO0O0 = null;
            while (oooO0O0 != OooO0O02) {
                OooO00o(OooO0Oo());
                oooO0O0 = OooO0O02;
                OooO0O02 = r3.getLifecycle().OooO0O0();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.Oooo0$OooO0Oo, reason: case insensitive filesystem */
    public abstract class AbstractC21992OooO0Oo {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public boolean f65586OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final InterfaceC21998Oooo0o0<? super T> f65587OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f65589OooOoO0 = -1;

        public AbstractC21992OooO0Oo(InterfaceC21998Oooo0o0<? super T> interfaceC21998Oooo0o0) {
            this.f65587OooOo0o = interfaceC21998Oooo0o0;
        }

        public final void OooO00o(boolean z) {
            if (z == this.f65586OooOo) {
                return;
            }
            this.f65586OooOo = z;
            int i = z ? 1 : -1;
            Oooo0 oooo0 = Oooo0.this;
            int i2 = oooo0.f65576OooO0OO;
            oooo0.f65576OooO0OO = i + i2;
            if (!oooo0.f65577OooO0Oo) {
                oooo0.f65577OooO0Oo = true;
                while (true) {
                    try {
                        int i3 = oooo0.f65576OooO0OO;
                        if (i2 == i3) {
                            break;
                        }
                        boolean z2 = i2 == 0 && i3 > 0;
                        boolean z3 = i2 > 0 && i3 == 0;
                        if (z2) {
                            oooo0.OooO0o();
                        } else if (z3) {
                            oooo0.OooO0oO();
                        }
                        i2 = i3;
                    } catch (Throwable th) {
                        oooo0.f65577OooO0Oo = false;
                        throw th;
                    }
                }
                oooo0.f65577OooO0Oo = false;
            }
            if (this.f65586OooOo) {
                oooo0.OooO0OO(this);
            }
        }

        public void OooO0O0() {
        }

        public boolean OooO0OO(InterfaceC21987OooOoo interfaceC21987OooOoo) {
            return false;
        }

        public abstract boolean OooO0Oo();
    }

    public Oooo0(int i) {
        PreviewView.EnumC21596OooO0o0 enumC21596OooO0o0 = PreviewView.EnumC21596OooO0o0.f63295OooOo0o;
        this.f65574OooO00o = new Object();
        this.f65575OooO0O0 = new OooOOO.OooO0O0<>();
        this.f65576OooO0OO = 0;
        this.f65578OooO0o = f65572OooOO0O;
        this.f65582OooOO0 = new OooO00o();
        this.f65579OooO0o0 = enumC21596OooO0o0;
        this.f65580OooO0oO = 0;
    }

    public static void OooO00o(String str) {
        OooOOO0.OooO0O0.Oooo().f58406OooOo0o.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(C20593OooO0Oo.OooO0O0("Cannot invoke ", str, " on a background thread"));
        }
    }

    public void OooO(InterfaceC21998Oooo0o0<? super T> interfaceC21998Oooo0o0) {
        OooO00o("removeObserver");
        Oooo0<T>.AbstractC21992OooO0Oo abstractC21992OooO0OoOooO0OO = this.f65575OooO0O0.OooO0OO(interfaceC21998Oooo0o0);
        if (abstractC21992OooO0OoOooO0OO == null) {
            return;
        }
        abstractC21992OooO0OoOooO0OO.OooO0O0();
        abstractC21992OooO0OoOooO0OO.OooO00o(false);
    }

    public final void OooO0O0(Oooo0<T>.AbstractC21992OooO0Oo abstractC21992OooO0Oo) {
        if (abstractC21992OooO0Oo.f65586OooOo) {
            if (!abstractC21992OooO0Oo.OooO0Oo()) {
                abstractC21992OooO0Oo.OooO00o(false);
                return;
            }
            int i = abstractC21992OooO0Oo.f65589OooOoO0;
            int i2 = this.f65580OooO0oO;
            if (i >= i2) {
                return;
            }
            abstractC21992OooO0Oo.f65589OooOoO0 = i2;
            abstractC21992OooO0Oo.f65587OooOo0o.OooO0O0((Object) this.f65579OooO0o0);
        }
    }

    public final void OooO0OO(Oooo0<T>.AbstractC21992OooO0Oo abstractC21992OooO0Oo) {
        if (this.f65581OooO0oo) {
            this.f65573OooO = true;
            return;
        }
        this.f65581OooO0oo = true;
        do {
            this.f65573OooO = false;
            if (abstractC21992OooO0Oo != null) {
                OooO0O0(abstractC21992OooO0Oo);
                abstractC21992OooO0Oo = null;
            } else {
                OooOOO.OooO0O0<InterfaceC21998Oooo0o0<? super T>, Oooo0<T>.AbstractC21992OooO0Oo> oooO0O0 = this.f65575OooO0O0;
                oooO0O0.getClass();
                OooO0O0.C20448OooO0Oo c20448OooO0Oo = new OooO0O0.C20448OooO0Oo();
                oooO0O0.f58394OooOoO0.put(c20448OooO0Oo, Boolean.FALSE);
                while (c20448OooO0Oo.hasNext()) {
                    OooO0O0((AbstractC21992OooO0Oo) ((Map.Entry) c20448OooO0Oo.next()).getValue());
                    if (this.f65573OooO) {
                        break;
                    }
                }
            }
        } while (this.f65573OooO);
        this.f65581OooO0oo = false;
    }

    public final void OooO0Oo(InterfaceC21987OooOoo interfaceC21987OooOoo, InterfaceC21998Oooo0o0<? super T> interfaceC21998Oooo0o0) {
        Oooo0<T>.AbstractC21992OooO0Oo abstractC21992OooO0Oo;
        OooO00o("observe");
        if (interfaceC21987OooOoo.getLifecycle().OooO0O0() == AbstractC21979OooOOo0.OooO0O0.f65538OooOo0o) {
            return;
        }
        OooO0OO oooO0OO = new OooO0OO(interfaceC21987OooOoo, interfaceC21998Oooo0o0);
        OooOOO.OooO0O0<InterfaceC21998Oooo0o0<? super T>, Oooo0<T>.AbstractC21992OooO0Oo> oooO0O0 = this.f65575OooO0O0;
        OooO0O0.OooO0OO<InterfaceC21998Oooo0o0<? super T>, Oooo0<T>.AbstractC21992OooO0Oo> oooO0OOOooO0O0 = oooO0O0.OooO0O0(interfaceC21998Oooo0o0);
        if (oooO0OOOooO0O0 != null) {
            abstractC21992OooO0Oo = oooO0OOOooO0O0.f58395OooOo;
        } else {
            OooO0O0.OooO0OO<K, V> oooO0OO2 = new OooO0O0.OooO0OO<>(interfaceC21998Oooo0o0, oooO0OO);
            oooO0O0.f58393OooOoO++;
            OooO0O0.OooO0OO<InterfaceC21998Oooo0o0<? super T>, Oooo0<T>.AbstractC21992OooO0Oo> oooO0OO3 = oooO0O0.f58391OooOo;
            if (oooO0OO3 == 0) {
                oooO0O0.f58392OooOo0o = oooO0OO2;
                oooO0O0.f58391OooOo = oooO0OO2;
            } else {
                oooO0OO3.f58398OooOoO0 = oooO0OO2;
                oooO0OO2.f58397OooOoO = oooO0OO3;
                oooO0O0.f58391OooOo = oooO0OO2;
            }
            abstractC21992OooO0Oo = null;
        }
        Oooo0<T>.AbstractC21992OooO0Oo abstractC21992OooO0Oo2 = abstractC21992OooO0Oo;
        if (abstractC21992OooO0Oo2 != null && !abstractC21992OooO0Oo2.OooO0OO(interfaceC21987OooOoo)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (abstractC21992OooO0Oo2 != null) {
            return;
        }
        interfaceC21987OooOoo.getLifecycle().OooO00o(oooO0OO);
    }

    public void OooO0o() {
    }

    public final void OooO0o0(InterfaceC21998Oooo0o0<? super T> interfaceC21998Oooo0o0) {
        Oooo0<T>.AbstractC21992OooO0Oo abstractC21992OooO0Oo;
        OooO00o("observeForever");
        OooO0O0 oooO0O0 = new OooO0O0(interfaceC21998Oooo0o0);
        OooOOO.OooO0O0<InterfaceC21998Oooo0o0<? super T>, Oooo0<T>.AbstractC21992OooO0Oo> oooO0O02 = this.f65575OooO0O0;
        OooO0O0.OooO0OO<InterfaceC21998Oooo0o0<? super T>, Oooo0<T>.AbstractC21992OooO0Oo> oooO0OOOooO0O0 = oooO0O02.OooO0O0(interfaceC21998Oooo0o0);
        if (oooO0OOOooO0O0 != null) {
            abstractC21992OooO0Oo = oooO0OOOooO0O0.f58395OooOo;
        } else {
            OooO0O0.OooO0OO<K, V> oooO0OO = new OooO0O0.OooO0OO<>(interfaceC21998Oooo0o0, oooO0O0);
            oooO0O02.f58393OooOoO++;
            OooO0O0.OooO0OO<InterfaceC21998Oooo0o0<? super T>, Oooo0<T>.AbstractC21992OooO0Oo> oooO0OO2 = oooO0O02.f58391OooOo;
            if (oooO0OO2 == 0) {
                oooO0O02.f58392OooOo0o = oooO0OO;
                oooO0O02.f58391OooOo = oooO0OO;
            } else {
                oooO0OO2.f58398OooOoO0 = oooO0OO;
                oooO0OO.f58397OooOoO = oooO0OO2;
                oooO0O02.f58391OooOo = oooO0OO;
            }
            abstractC21992OooO0Oo = null;
        }
        Oooo0<T>.AbstractC21992OooO0Oo abstractC21992OooO0Oo2 = abstractC21992OooO0Oo;
        if (abstractC21992OooO0Oo2 instanceof OooO0OO) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (abstractC21992OooO0Oo2 != null) {
            return;
        }
        oooO0O0.OooO00o(true);
    }

    public void OooO0oO() {
    }

    public void OooO0oo(T t) {
        boolean z;
        synchronized (this.f65574OooO00o) {
            z = this.f65578OooO0o == f65572OooOO0O;
            this.f65578OooO0o = t;
        }
        if (z) {
            OooOOO0.OooO0O0.Oooo().OoooO00(this.f65582OooOO0);
        }
    }

    public void OooOO0(T t) {
        OooO00o("setValue");
        this.f65580OooO0oO++;
        this.f65579OooO0o0 = t;
        OooO0OO(null);
    }

    public Oooo0() {
        this.f65574OooO00o = new Object();
        this.f65575OooO0O0 = new OooOOO.OooO0O0<>();
        this.f65576OooO0OO = 0;
        Object obj = f65572OooOO0O;
        this.f65578OooO0o = obj;
        this.f65582OooOO0 = new OooO00o();
        this.f65579OooO0o0 = obj;
        this.f65580OooO0oO = -1;
    }
}
