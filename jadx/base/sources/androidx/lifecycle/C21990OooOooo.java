package androidx.lifecycle;

import OooOOO.OooO0O0;
import OooOoo.C20593OooO0Oo;
import Oooo0oO.C21034OooOOOo;
import android.os.Looper;
import androidx.appcompat.view.menu.C21505OooO0Oo;
import androidx.lifecycle.AbstractC21979OooOOo0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.C33784o00ooo;

/* JADX INFO: renamed from: androidx.lifecycle.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21990OooOooo extends AbstractC21979OooOOo0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final ArrayList<AbstractC21979OooOOo0.OooO0O0> f65560OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f65561OooO0O0 = true;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OooOOO.OooO00o<InterfaceC21988OooOoo0, OooO00o> f65562OooO0OO = new OooOOO.OooO00o<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public AbstractC21979OooOOo0.OooO0O0 f65563OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f65564OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final WeakReference<InterfaceC21987OooOoo> f65565OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f65566OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f65567OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final C33781o00o0O f65568OooOO0;

    /* JADX INFO: renamed from: androidx.lifecycle.OooOooo$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public AbstractC21979OooOOo0.OooO0O0 f65569OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public InterfaceC21986OooOoOO f65570OooO0O0;

        public final void OooO00o(InterfaceC21987OooOoo interfaceC21987OooOoo, AbstractC21979OooOOo0.OooO00o oooO00o) {
            AbstractC21979OooOOo0.OooO0O0 oooO0O0OooO00o = oooO00o.OooO00o();
            AbstractC21979OooOOo0.OooO0O0 state1 = this.f65569OooO00o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(state1, "state1");
            if (oooO0O0OooO00o.compareTo(state1) < 0) {
                state1 = oooO0O0OooO00o;
            }
            this.f65569OooO00o = state1;
            this.f65570OooO0O0.OooOOo0(interfaceC21987OooOoo, oooO00o);
            this.f65569OooO00o = oooO0O0OooO00o;
        }
    }

    public C21990OooOooo(InterfaceC21987OooOoo interfaceC21987OooOoo) {
        AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65537OooOo;
        this.f65563OooO0Oo = oooO0O0;
        this.f65560OooO = new ArrayList<>();
        this.f65565OooO0o0 = new WeakReference<>(interfaceC21987OooOoo);
        this.f65568OooOO0 = C33784o00ooo.OooO00o(oooO0O0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r8.f65567OooO0oo = false;
        r8.f65568OooOO0.setValue(r8.f65563OooO0Oo);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO() {
        InterfaceC21987OooOoo interfaceC21987OooOoo = this.f65565OooO0o0.get();
        if (interfaceC21987OooOoo == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            OooOOO.OooO00o<InterfaceC21988OooOoo0, OooO00o> oooO00o = this.f65562OooO0OO;
            if (oooO00o.f58393OooOoO != 0) {
                OooO0O0.OooO0OO<InterfaceC21988OooOoo0, OooO00o> oooO0OO = oooO00o.f58392OooOo0o;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO0OO);
                AbstractC21979OooOOo0.OooO0O0 oooO0O0 = oooO0OO.f58395OooOo.f65569OooO00o;
                OooO0O0.OooO0OO<InterfaceC21988OooOoo0, OooO00o> oooO0OO2 = this.f65562OooO0OO.f58391OooOo;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO0OO2);
                AbstractC21979OooOOo0.OooO0O0 oooO0O02 = oooO0OO2.f58395OooOo.f65569OooO00o;
                if (oooO0O0 == oooO0O02 && this.f65563OooO0Oo == oooO0O02) {
                    break;
                }
                this.f65567OooO0oo = false;
                AbstractC21979OooOOo0.OooO0O0 oooO0O03 = this.f65563OooO0Oo;
                OooO0O0.OooO0OO<InterfaceC21988OooOoo0, OooO00o> oooO0OO3 = this.f65562OooO0OO.f58392OooOo0o;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO0OO3);
                if (oooO0O03.compareTo(oooO0OO3.f58395OooOo.f65569OooO00o) < 0) {
                    OooOOO.OooO00o<InterfaceC21988OooOoo0, OooO00o> oooO00o2 = this.f65562OooO0OO;
                    OooO0O0.C18961OooO0O0 c18961OooO0O0 = new OooO0O0.C18961OooO0O0(oooO00o2.f58391OooOo, oooO00o2.f58392OooOo0o);
                    oooO00o2.f58394OooOoO0.put(c18961OooO0O0, Boolean.FALSE);
                    while (c18961OooO0O0.hasNext() && !this.f65567OooO0oo) {
                        Map.Entry entry = (Map.Entry) c18961OooO0O0.next();
                        kotlin.jvm.internal.OooOOO0.OooO0o(entry, "next()");
                        InterfaceC21988OooOoo0 interfaceC21988OooOoo0 = (InterfaceC21988OooOoo0) entry.getKey();
                        OooO00o oooO00o3 = (OooO00o) entry.getValue();
                        while (oooO00o3.f65569OooO00o.compareTo(this.f65563OooO0Oo) > 0 && !this.f65567OooO0oo && this.f65562OooO0OO.f58390OooOoOO.containsKey(interfaceC21988OooOoo0)) {
                            AbstractC21979OooOOo0.OooO00o.C19028OooO00o c19028OooO00o = AbstractC21979OooOOo0.OooO00o.Companion;
                            AbstractC21979OooOOo0.OooO0O0 oooO0O04 = oooO00o3.f65569OooO00o;
                            c19028OooO00o.getClass();
                            AbstractC21979OooOOo0.OooO00o OooO00o2 = AbstractC21979OooOOo0.OooO00o.C19028OooO00o.OooO00o(oooO0O04);
                            if (OooO00o2 == null) {
                                throw new IllegalStateException("no event down from " + oooO00o3.f65569OooO00o);
                            }
                            this.f65560OooO.add(OooO00o2.OooO00o());
                            oooO00o3.OooO00o(interfaceC21987OooOoo, OooO00o2);
                            C21034OooOOOo.OooO0O0(1, this.f65560OooO);
                        }
                    }
                }
                OooO0O0.OooO0OO<InterfaceC21988OooOoo0, OooO00o> oooO0OO4 = this.f65562OooO0OO.f58391OooOo;
                if (!this.f65567OooO0oo && oooO0OO4 != null && this.f65563OooO0Oo.compareTo(oooO0OO4.f58395OooOo.f65569OooO00o) > 0) {
                    OooOOO.OooO00o<InterfaceC21988OooOoo0, OooO00o> oooO00o4 = this.f65562OooO0OO;
                    oooO00o4.getClass();
                    OooO0O0.C20448OooO0Oo c20448OooO0Oo = new OooO0O0.C20448OooO0Oo();
                    oooO00o4.f58394OooOoO0.put(c20448OooO0Oo, Boolean.FALSE);
                    while (c20448OooO0Oo.hasNext() && !this.f65567OooO0oo) {
                        Map.Entry entry2 = (Map.Entry) c20448OooO0Oo.next();
                        InterfaceC21988OooOoo0 interfaceC21988OooOoo02 = (InterfaceC21988OooOoo0) entry2.getKey();
                        OooO00o oooO00o5 = (OooO00o) entry2.getValue();
                        while (oooO00o5.f65569OooO00o.compareTo(this.f65563OooO0Oo) < 0 && !this.f65567OooO0oo && this.f65562OooO0OO.f58390OooOoOO.containsKey(interfaceC21988OooOoo02)) {
                            this.f65560OooO.add(oooO00o5.f65569OooO00o);
                            AbstractC21979OooOOo0.OooO00o.C19028OooO00o c19028OooO00o2 = AbstractC21979OooOOo0.OooO00o.Companion;
                            AbstractC21979OooOOo0.OooO0O0 state = oooO00o5.f65569OooO00o;
                            c19028OooO00o2.getClass();
                            kotlin.jvm.internal.OooOOO0.OooO0oO(state, "state");
                            int iOrdinal = state.ordinal();
                            AbstractC21979OooOOo0.OooO00o oooO00o6 = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? null : AbstractC21979OooOOo0.OooO00o.ON_RESUME : AbstractC21979OooOOo0.OooO00o.ON_START : AbstractC21979OooOOo0.OooO00o.ON_CREATE;
                            if (oooO00o6 == null) {
                                throw new IllegalStateException("no event up from " + oooO00o5.f65569OooO00o);
                            }
                            oooO00o5.OooO00o(interfaceC21987OooOoo, oooO00o6);
                            C21034OooOOOo.OooO0O0(1, this.f65560OooO);
                        }
                    }
                }
            } else {
                break;
            }
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // androidx.lifecycle.AbstractC21979OooOOo0
    public final void OooO00o(InterfaceC21988OooOoo0 observer) {
        InterfaceC21986OooOoOO c22004OoooO0O;
        OooO00o oooO00o;
        InterfaceC21987OooOoo interfaceC21987OooOoo;
        ArrayList<AbstractC21979OooOOo0.OooO0O0> arrayList = this.f65560OooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(observer, "observer");
        OooO0o0("addObserver");
        AbstractC21979OooOOo0.OooO0O0 oooO0O0 = this.f65563OooO0Oo;
        AbstractC21979OooOOo0.OooO0O0 oooO0O02 = AbstractC21979OooOOo0.OooO0O0.f65538OooOo0o;
        if (oooO0O0 != oooO0O02) {
            oooO0O02 = AbstractC21979OooOOo0.OooO0O0.f65537OooOo;
        }
        OooO00o oooO00o2 = new OooO00o();
        HashMap map = C21994Oooo00o.f65591OooO00o;
        boolean z = observer instanceof InterfaceC21986OooOoOO;
        boolean z2 = observer instanceof OooO0o;
        if (z && z2) {
            c22004OoooO0O = new C21974OooO0oO((OooO0o) observer, (InterfaceC21986OooOoOO) observer);
        } else if (z2) {
            c22004OoooO0O = new C21974OooO0oO((OooO0o) observer, null);
        } else if (z) {
            c22004OoooO0O = (InterfaceC21986OooOoOO) observer;
        } else {
            Class<?> cls = observer.getClass();
            if (C21994Oooo00o.OooO0O0(cls) == 2) {
                Object obj = C21994Oooo00o.f65592OooO0O0.get(cls);
                kotlin.jvm.internal.OooOOO0.OooO0Oo(obj);
                List list = (List) obj;
                if (list.size() == 1) {
                    c22004OoooO0O = new C22018OoooooO(C21994Oooo00o.OooO00o((Constructor) list.get(0), observer));
                } else {
                    int size = list.size();
                    OooOOO[] oooOOOArr = new OooOOO[size];
                    for (int i = 0; i < size; i++) {
                        oooOOOArr[i] = C21994Oooo00o.OooO00o((Constructor) list.get(i), observer);
                    }
                    c22004OoooO0O = new C21973OooO0o0(oooOOOArr);
                }
            } else {
                c22004OoooO0O = new C22004OoooO0O(observer);
            }
        }
        oooO00o2.f65570OooO0O0 = c22004OoooO0O;
        oooO00o2.f65569OooO00o = oooO0O02;
        OooOOO.OooO00o<InterfaceC21988OooOoo0, OooO00o> oooO00o3 = this.f65562OooO0OO;
        OooO0O0.OooO0OO<InterfaceC21988OooOoo0, OooO00o> oooO0OOOooO0O0 = oooO00o3.OooO0O0(observer);
        if (oooO0OOOooO0O0 != null) {
            oooO00o = oooO0OOOooO0O0.f58395OooOo;
        } else {
            HashMap<K, OooO0O0.OooO0OO<K, V>> map2 = oooO00o3.f58390OooOoOO;
            OooO0O0.OooO0OO<K, V> oooO0OO = new OooO0O0.OooO0OO<>(observer, oooO00o2);
            oooO00o3.f58393OooOoO++;
            OooO0O0.OooO0OO<K, V> oooO0OO2 = oooO00o3.f58391OooOo;
            if (oooO0OO2 == 0) {
                oooO00o3.f58392OooOo0o = oooO0OO;
                oooO00o3.f58391OooOo = oooO0OO;
            } else {
                oooO0OO2.f58398OooOoO0 = oooO0OO;
                oooO0OO.f58397OooOoO = oooO0OO2;
                oooO00o3.f58391OooOo = oooO0OO;
            }
            map2.put((K) observer, oooO0OO);
            oooO00o = null;
        }
        if (oooO00o == null && (interfaceC21987OooOoo = this.f65565OooO0o0.get()) != null) {
            boolean z3 = this.f65564OooO0o != 0 || this.f65566OooO0oO;
            AbstractC21979OooOOo0.OooO0O0 oooO0O0OooO0Oo = OooO0Oo(observer);
            this.f65564OooO0o++;
            while (oooO00o2.f65569OooO00o.compareTo(oooO0O0OooO0Oo) < 0 && this.f65562OooO0OO.f58390OooOoOO.containsKey(observer)) {
                arrayList.add(oooO00o2.f65569OooO00o);
                AbstractC21979OooOOo0.OooO00o.C19028OooO00o c19028OooO00o = AbstractC21979OooOOo0.OooO00o.Companion;
                AbstractC21979OooOOo0.OooO0O0 state = oooO00o2.f65569OooO00o;
                c19028OooO00o.getClass();
                kotlin.jvm.internal.OooOOO0.OooO0oO(state, "state");
                int iOrdinal = state.ordinal();
                AbstractC21979OooOOo0.OooO00o oooO00o4 = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? null : AbstractC21979OooOOo0.OooO00o.ON_RESUME : AbstractC21979OooOOo0.OooO00o.ON_START : AbstractC21979OooOOo0.OooO00o.ON_CREATE;
                if (oooO00o4 == null) {
                    throw new IllegalStateException("no event up from " + oooO00o2.f65569OooO00o);
                }
                oooO00o2.OooO00o(interfaceC21987OooOoo, oooO00o4);
                arrayList.remove(arrayList.size() - 1);
                oooO0O0OooO0Oo = OooO0Oo(observer);
            }
            if (!z3) {
                OooO();
            }
            this.f65564OooO0o--;
        }
    }

    @Override // androidx.lifecycle.AbstractC21979OooOOo0
    public final AbstractC21979OooOOo0.OooO0O0 OooO0O0() {
        return this.f65563OooO0Oo;
    }

    @Override // androidx.lifecycle.AbstractC21979OooOOo0
    public final void OooO0OO(InterfaceC21988OooOoo0 observer) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(observer, "observer");
        OooO0o0("removeObserver");
        this.f65562OooO0OO.OooO0OO(observer);
    }

    public final AbstractC21979OooOOo0.OooO0O0 OooO0Oo(InterfaceC21988OooOoo0 interfaceC21988OooOoo0) {
        OooO00o oooO00o;
        HashMap<InterfaceC21988OooOoo0, OooO0O0.OooO0OO<InterfaceC21988OooOoo0, OooO00o>> map = this.f65562OooO0OO.f58390OooOoOO;
        OooO0O0.OooO0OO<InterfaceC21988OooOoo0, OooO00o> oooO0OO = map.containsKey(interfaceC21988OooOoo0) ? map.get(interfaceC21988OooOoo0).f58397OooOoO : null;
        AbstractC21979OooOOo0.OooO0O0 oooO0O0 = (oooO0OO == null || (oooO00o = oooO0OO.f58395OooOo) == null) ? null : oooO00o.f65569OooO00o;
        ArrayList<AbstractC21979OooOOo0.OooO0O0> arrayList = this.f65560OooO;
        AbstractC21979OooOOo0.OooO0O0 oooO0O02 = arrayList.isEmpty() ? null : (AbstractC21979OooOOo0.OooO0O0) C21505OooO0Oo.OooO00o(1, arrayList);
        AbstractC21979OooOOo0.OooO0O0 state1 = this.f65563OooO0Oo;
        kotlin.jvm.internal.OooOOO0.OooO0oO(state1, "state1");
        if (oooO0O0 == null || oooO0O0.compareTo(state1) >= 0) {
            oooO0O0 = state1;
        }
        return (oooO0O02 == null || oooO0O02.compareTo(oooO0O0) >= 0) ? oooO0O0 : oooO0O02;
    }

    public final void OooO0o(AbstractC21979OooOOo0.OooO00o event) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(event, "event");
        OooO0o0("handleLifecycleEvent");
        OooO0oO(event.OooO00o());
    }

    public final void OooO0o0(String str) {
        if (this.f65561OooO0O0) {
            OooOOO0.OooO0O0.Oooo().f58406OooOo0o.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(C20593OooO0Oo.OooO0O0("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void OooO0oO(AbstractC21979OooOOo0.OooO0O0 oooO0O0) {
        AbstractC21979OooOOo0.OooO0O0 oooO0O02 = this.f65563OooO0Oo;
        if (oooO0O02 == oooO0O0) {
            return;
        }
        AbstractC21979OooOOo0.OooO0O0 oooO0O03 = AbstractC21979OooOOo0.OooO0O0.f65537OooOo;
        AbstractC21979OooOOo0.OooO0O0 oooO0O04 = AbstractC21979OooOOo0.OooO0O0.f65538OooOo0o;
        if (oooO0O02 == oooO0O03 && oooO0O0 == oooO0O04) {
            throw new IllegalStateException(("no event down from " + this.f65563OooO0Oo + " in component " + this.f65565OooO0o0.get()).toString());
        }
        this.f65563OooO0Oo = oooO0O0;
        if (this.f65566OooO0oO || this.f65564OooO0o != 0) {
            this.f65567OooO0oo = true;
            return;
        }
        this.f65566OooO0oO = true;
        OooO();
        this.f65566OooO0oO = false;
        if (this.f65563OooO0Oo == oooO0O04) {
            this.f65562OooO0OO = new OooOOO.OooO00o<>();
        }
    }

    public final void OooO0oo(AbstractC21979OooOOo0.OooO0O0 state) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(state, "state");
        OooO0o0("setCurrentState");
        OooO0oO(state);
    }
}
