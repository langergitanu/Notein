package o00oo0O0;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import o00o0OOO.InterfaceC25397OooO00o;
import o00o0Ooo.InterfaceC25423OooO;
import o00o0o.AbstractC25434OooO00o;
import o00o0o.C25435OooO0O0;
import o00oo00O.C25648OooO0O0;
import o00oo00O.C25649OooO0OO;
import o00oo0O0.InterfaceC25665OooOO0;
import o00oo0O0.InterfaceC25674OooOOoo;

/* JADX INFO: renamed from: o00oo0O0.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25672OooOOo<K, V> implements InterfaceC25665OooOO0<K, V>, InterfaceC25674OooOOoo<K, V> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC25665OooOO0.OooO0O0<K> f87612OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C25656OooO<K, InterfaceC25665OooOO0.OooO00o<K, V>> f87613OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C25656OooO<K, InterfaceC25665OooOO0.OooO00o<K, V>> f87614OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final InterfaceC25680OooOoO0<V> f87615OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public C25677OooOo00 f87616OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final InterfaceC25423OooO<C25677OooOo00> f87617OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f87618OooO0oO;

    public C25672OooOOo(InterfaceC25680OooOoO0 interfaceC25680OooOoO0, InterfaceC25674OooOOoo.OooO00o oooO00o, InterfaceC25423OooO interfaceC25423OooO, InterfaceC25665OooOO0.OooO0O0 oooO0O0) {
        new WeakHashMap();
        this.f87615OooO0Oo = interfaceC25680OooOoO0;
        this.f87613OooO0O0 = new C25656OooO<>(new C25671OooOOOo(this, interfaceC25680OooOoO0));
        this.f87614OooO0OO = new C25656OooO<>(new C25671OooOOOo(this, interfaceC25680OooOoO0));
        this.f87617OooO0o0 = interfaceC25423OooO;
        C25677OooOo00 c25677OooOo00 = (C25677OooOo00) interfaceC25423OooO.get();
        OooOoo0.OooOo00.OooO0o0(c25677OooOo00, "mMemoryCacheParamsSupplier returned null");
        this.f87616OooO0o = c25677OooOo00;
        this.f87618OooO0oO = SystemClock.uptimeMillis();
        this.f87612OooO00o = oooO0O0;
    }

    public static <K, V> void OooO0o(InterfaceC25665OooOO0.OooO00o<K, V> oooO00o) {
        InterfaceC25665OooOO0.OooO0O0<K> oooO0O0;
        if (oooO00o == null || (oooO0O0 = oooO00o.f87603OooO0o0) == null) {
            return;
        }
        ((C25648OooO0O0) oooO0O0).OooO00o(oooO00o.f87599OooO00o, false);
    }

    public final synchronized AbstractC25434OooO00o<V> OooO(InterfaceC25665OooOO0.OooO00o<K, V> oooO00o) {
        oooO00o.getClass();
        return (oooO00o.f87602OooO0Oo && oooO00o.f87601OooO0OO == 0) ? oooO00o.f87600OooO0O0 : null;
    }

    @Override // o00oo0O0.InterfaceC25665OooOO0
    public final AbstractC25434OooO00o OooO00o(InterfaceC25397OooO00o interfaceC25397OooO00o) {
        InterfaceC25665OooOO0.OooO00o<K, V> oooO00oOooO0Oo;
        boolean z;
        AbstractC25434OooO00o<V> abstractC25434OooO00o;
        synchronized (this) {
            try {
                oooO00oOooO0Oo = this.f87613OooO0O0.OooO0Oo(interfaceC25397OooO00o);
                if (oooO00oOooO0Oo != null) {
                    InterfaceC25665OooOO0.OooO00o<K, V> oooO00oOooO0Oo2 = this.f87614OooO0OO.OooO0Oo(interfaceC25397OooO00o);
                    oooO00oOooO0Oo2.getClass();
                    OooOoo0.OooOo00.OooO0o(oooO00oOooO0Oo2.f87601OooO0OO == 0);
                    abstractC25434OooO00o = oooO00oOooO0Oo2.f87600OooO0O0;
                    z = true;
                } else {
                    abstractC25434OooO00o = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            OooO0o(oooO00oOooO0Oo);
        }
        return abstractC25434OooO00o;
    }

    @Override // o00oo0O0.InterfaceC25674OooOOoo
    public final synchronized boolean OooO0O0(C25649OooO0OO.OooO00o oooO00o) {
        boolean zContainsKey;
        C25656OooO<K, InterfaceC25665OooOO0.OooO00o<K, V>> c25656OooO = this.f87614OooO0OO;
        synchronized (c25656OooO) {
            zContainsKey = c25656OooO.f87575OooO0O0.containsKey(oooO00o);
        }
        return zContainsKey;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0079  */
    @Override // o00oo0O0.InterfaceC25665OooOO0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C25435OooO0O0 OooO0OO(Object obj, AbstractC25434OooO00o abstractC25434OooO00o, InterfaceC25665OooOO0.OooO0O0 oooO0O0) {
        InterfaceC25665OooOO0.OooO00o<K, V> oooO00oOooO0Oo;
        C25435OooO0O0 c25435OooO0O0OooO0oo;
        AbstractC25434OooO00o<V> abstractC25434OooO00oOooO;
        boolean z;
        obj.getClass();
        abstractC25434OooO00o.getClass();
        OooO0oO();
        synchronized (this) {
            oooO00oOooO0Oo = this.f87613OooO0O0.OooO0Oo(obj);
            InterfaceC25665OooOO0.OooO00o<K, V> oooO00oOooO0Oo2 = this.f87614OooO0OO.OooO0Oo(obj);
            c25435OooO0O0OooO0oo = null;
            if (oooO00oOooO0Oo2 != null) {
                synchronized (this) {
                    OooOoo0.OooOo00.OooO0o(!oooO00oOooO0Oo2.f87602OooO0Oo);
                    oooO00oOooO0Oo2.f87602OooO0Oo = true;
                    abstractC25434OooO00oOooO = OooO(oooO00oOooO0Oo2);
                }
                AbstractC25434OooO00o.OooOooo(abstractC25434OooO00oOooO);
                OooO0o(oooO00oOooO0Oo);
                OooO0o0();
                return c25435OooO0O0OooO0oo;
            }
            abstractC25434OooO00oOooO = null;
            int iOooO00o = this.f87615OooO0Oo.OooO00o((V) abstractC25434OooO00o.Oooo000());
            synchronized (this) {
                if (iOooO00o <= this.f87616OooO0o.f87625OooO0Oo) {
                    synchronized (this) {
                        int iOooO00o2 = this.f87614OooO0OO.OooO00o() - this.f87613OooO0O0.OooO00o();
                        if (iOooO00o2 <= this.f87616OooO0o.f87623OooO0O0 - 1) {
                            synchronized (this) {
                                z = this.f87614OooO0OO.OooO0O0() - this.f87613OooO0O0.OooO0O0() <= this.f87616OooO0o.f87622OooO00o - iOooO00o;
                            }
                        }
                    }
                }
            }
        }
        if (z) {
            InterfaceC25665OooOO0.OooO00o oooO00o = new InterfaceC25665OooOO0.OooO00o(obj, abstractC25434OooO00o, oooO0O0, -1);
            this.f87614OooO0OO.OooO0OO(obj, oooO00o);
            c25435OooO0O0OooO0oo = OooO0oo(oooO00o);
        }
        AbstractC25434OooO00o.OooOooo(abstractC25434OooO00oOooO);
        OooO0o(oooO00oOooO0Oo);
        OooO0o0();
        return c25435OooO0O0OooO0oo;
    }

    @Override // o00oo0O0.InterfaceC25674OooOOoo
    public final AbstractC25434OooO00o<V> OooO0Oo(K k, AbstractC25434OooO00o<V> abstractC25434OooO00o) {
        return OooO0OO(k, abstractC25434OooO00o, this.f87612OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO0o0() {
        int i;
        int iOooO00o;
        int iMin;
        int i2;
        int i3;
        synchronized (this) {
            C25677OooOo00 c25677OooOo00 = this.f87616OooO0o;
            c25677OooOo00.getClass();
            i = c25677OooOo00.f87623OooO0O0;
            synchronized (this) {
                iOooO00o = this.f87614OooO0OO.OooO00o() - this.f87613OooO0O0.OooO00o();
            }
            ArrayList<InterfaceC25665OooOO0.OooO00o<K, V>> arrayListOooOO0 = OooOO0(iMin, Math.min(i2, i3 - (this.f87614OooO0OO.OooO0O0() - this.f87613OooO0O0.OooO0O0())));
            synchronized (this) {
                if (arrayListOooOO0 != null) {
                    for (InterfaceC25665OooOO0.OooO00o<K, V> oooO00o : arrayListOooOO0) {
                        synchronized (this) {
                            oooO00o.getClass();
                            OooOoo0.OooOo00.OooO0o(!oooO00o.f87602OooO0Oo);
                            oooO00o.f87602OooO0Oo = true;
                        }
                        if (arrayListOooOO0 != null) {
                            Iterator<InterfaceC25665OooOO0.OooO00o<K, V>> it = arrayListOooOO0.iterator();
                            while (it.hasNext()) {
                                AbstractC25434OooO00o.OooOooo(OooO(it.next()));
                            }
                        }
                        if (arrayListOooOO0 != null) {
                            Iterator<InterfaceC25665OooOO0.OooO00o<K, V>> it2 = arrayListOooOO0.iterator();
                            while (it2.hasNext()) {
                                OooO0o(it2.next());
                            }
                            return;
                        }
                        return;
                    }
                }
            }
        }
        iMin = Math.min(Integer.MAX_VALUE, i - iOooO00o);
        C25677OooOo00 c25677OooOo002 = this.f87616OooO0o;
        i2 = c25677OooOo002.f87624OooO0OO;
        i3 = c25677OooOo002.f87622OooO00o;
        synchronized (this) {
            ArrayList<InterfaceC25665OooOO0.OooO00o<K, V>> arrayListOooOO02 = OooOO0(iMin, Math.min(i2, i3 - (this.f87614OooO0OO.OooO0O0() - this.f87613OooO0O0.OooO0O0())));
            synchronized (this) {
            }
        }
    }

    public final synchronized void OooO0oO() {
        if (this.f87618OooO0oO + this.f87616OooO0o.f87626OooO0o0 > SystemClock.uptimeMillis()) {
            return;
        }
        this.f87618OooO0oO = SystemClock.uptimeMillis();
        C25677OooOo00 c25677OooOo00 = this.f87617OooO0o0.get();
        OooOoo0.OooOo00.OooO0o0(c25677OooOo00, "mMemoryCacheParamsSupplier returned null");
        this.f87616OooO0o = c25677OooOo00;
    }

    public final synchronized C25435OooO0O0 OooO0oo(InterfaceC25665OooOO0.OooO00o oooO00o) {
        synchronized (this) {
            OooOoo0.OooOo00.OooO0o(!oooO00o.f87602OooO0Oo);
            oooO00o.f87601OooO0OO++;
        }
        return AbstractC25434OooO00o.o0Oo0oo(oooO00o.f87600OooO0O0.Oooo000(), new C25673OooOOo0(this, oooO00o), AbstractC25434OooO00o.f86711OooOoo0);
        return AbstractC25434OooO00o.o0Oo0oo(oooO00o.f87600OooO0O0.Oooo000(), new C25673OooOOo0(this, oooO00o), AbstractC25434OooO00o.f86711OooOoo0);
    }

    public final synchronized ArrayList<InterfaceC25665OooOO0.OooO00o<K, V>> OooOO0(int i, int i2) {
        K next;
        int iMax = Math.max(i, 0);
        int iMax2 = Math.max(i2, 0);
        if (this.f87613OooO0O0.OooO00o() <= iMax && this.f87613OooO0O0.OooO0O0() <= iMax2) {
            return null;
        }
        ArrayList<InterfaceC25665OooOO0.OooO00o<K, V>> arrayList = new ArrayList<>();
        while (true) {
            if (this.f87613OooO0O0.OooO00o() <= iMax && this.f87613OooO0O0.OooO0O0() <= iMax2) {
                return arrayList;
            }
            C25656OooO<K, InterfaceC25665OooOO0.OooO00o<K, V>> c25656OooO = this.f87613OooO0O0;
            synchronized (c25656OooO) {
                next = c25656OooO.f87575OooO0O0.isEmpty() ? null : c25656OooO.f87575OooO0O0.keySet().iterator().next();
            }
            if (next == null) {
                throw new IllegalStateException(String.format("key is null, but exclusiveEntries count: %d, size: %d", Integer.valueOf(this.f87613OooO0O0.OooO00o()), Integer.valueOf(this.f87613OooO0O0.OooO0O0())));
            }
            this.f87613OooO0O0.OooO0Oo(next);
            arrayList.add(this.f87614OooO0OO.OooO0Oo(next));
        }
    }

    @Override // o00oo0O0.InterfaceC25674OooOOoo
    public final AbstractC25434OooO00o<V> get(K k) {
        InterfaceC25665OooOO0.OooO00o<K, V> oooO00oOooO0Oo;
        InterfaceC25665OooOO0.OooO00o<K, V> oooO00o;
        C25435OooO0O0 c25435OooO0O0OooO0oo;
        k.getClass();
        synchronized (this) {
            try {
                oooO00oOooO0Oo = this.f87613OooO0O0.OooO0Oo(k);
                C25656OooO<K, InterfaceC25665OooOO0.OooO00o<K, V>> c25656OooO = this.f87614OooO0OO;
                synchronized (c25656OooO) {
                    oooO00o = c25656OooO.f87575OooO0O0.get(k);
                }
                InterfaceC25665OooOO0.OooO00o<K, V> oooO00o2 = oooO00o;
                c25435OooO0O0OooO0oo = oooO00o2 != null ? OooO0oo(oooO00o2) : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        OooO0o(oooO00oOooO0Oo);
        OooO0oO();
        OooO0o0();
        return c25435OooO0O0OooO0oo;
    }
}
