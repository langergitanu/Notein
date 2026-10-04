package o00OooOO;

import android.util.Log;
import androidx.fragment.app.C21929Ooooo0o;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;
import o00O0oOo.AbstractC24958OooOO0o;

/* JADX INFO: renamed from: o00OooOO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25159OooO0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C25158OooO0o0<OooO00o, Object> f85626OooO00o = new C25158OooO0o0<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0O0 f85627OooO0O0 = new OooO0O0();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final HashMap f85628OooO0OO = new HashMap();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final HashMap f85629OooO0Oo = new HashMap();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f85630OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f85631OooO0o0;

    /* JADX INFO: renamed from: o00OooOO.OooO0oO$OooO00o */
    public static final class OooO00o implements OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO0O0 f85632OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f85633OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Class<?> f85634OooO0OO;

        public OooO00o(OooO0O0 oooO0O0) {
            this.f85632OooO00o = oooO0O0;
        }

        @Override // o00OooOO.OooO
        public final void OooO00o() {
            this.f85632OooO00o.OooO00o(this);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof OooO00o) {
                OooO00o oooO00o = (OooO00o) obj;
                if (this.f85633OooO0O0 == oooO00o.f85633OooO0O0 && this.f85634OooO0OO == oooO00o.f85634OooO0OO) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i = this.f85633OooO0O0 * 31;
            Class<?> cls = this.f85634OooO0OO;
            return i + (cls != null ? cls.hashCode() : 0);
        }

        public final String toString() {
            return "Key{size=" + this.f85633OooO0O0 + "array=" + this.f85634OooO0OO + '}';
        }
    }

    /* JADX INFO: renamed from: o00OooOO.OooO0oO$OooO0O0 */
    public static final class OooO0O0 extends AbstractC24958OooOO0o {
        public final OooO OooO() {
            return new OooO00o(this);
        }
    }

    public C25159OooO0oO(int i) {
        this.f85631OooO0o0 = i;
    }

    public final synchronized void OooO00o() {
        OooO0OO(0);
    }

    public final void OooO0O0(Class cls, int i) {
        NavigableMap<Integer, Integer> navigableMapOooO0oO = OooO0oO(cls);
        Integer num = navigableMapOooO0oO.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapOooO0oO.remove(Integer.valueOf(i));
                return;
            } else {
                navigableMapOooO0oO.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    public final void OooO0OO(int i) {
        while (this.f85630OooO0o > i) {
            Object objOooO0OO = this.f85626OooO00o.OooO0OO();
            C21929Ooooo0o.OooO0O0(objOooO0OO);
            InterfaceC25154OooO00o interfaceC25154OooO00oOooO0o0 = OooO0o0(objOooO0OO.getClass());
            this.f85630OooO0o -= interfaceC25154OooO00oOooO0o0.OooO0O0() * interfaceC25154OooO00oOooO0o0.OooO00o(objOooO0OO);
            OooO0O0(objOooO0OO.getClass(), interfaceC25154OooO00oOooO0o0.OooO00o(objOooO0OO));
            if (Log.isLoggable(interfaceC25154OooO00oOooO0o0.getTag(), 2)) {
                Log.v(interfaceC25154OooO00oOooO0o0.getTag(), "evicted: " + interfaceC25154OooO00oOooO0o0.OooO00o(objOooO0OO));
            }
        }
    }

    public final synchronized Object OooO0Oo(Class cls, int i) {
        OooO00o oooO00o;
        int i2;
        try {
            Integer numCeilingKey = OooO0oO(cls).ceilingKey(Integer.valueOf(i));
            if (numCeilingKey == null || ((i2 = this.f85630OooO0o) != 0 && this.f85631OooO0o0 / i2 < 2 && numCeilingKey.intValue() > i * 8)) {
                OooO0O0 oooO0O0 = this.f85627OooO0O0;
                OooO OooO2 = (OooO) ((ArrayDeque) oooO0O0.f84649OooOo).poll();
                if (OooO2 == null) {
                    OooO2 = oooO0O0.OooO();
                }
                oooO00o = (OooO00o) OooO2;
                oooO00o.f85633OooO0O0 = i;
                oooO00o.f85634OooO0OO = cls;
            } else {
                OooO0O0 oooO0O02 = this.f85627OooO0O0;
                int iIntValue = numCeilingKey.intValue();
                OooO OooO3 = (OooO) ((ArrayDeque) oooO0O02.f84649OooOo).poll();
                if (OooO3 == null) {
                    OooO3 = oooO0O02.OooO();
                }
                oooO00o = (OooO00o) OooO3;
                oooO00o.f85633OooO0O0 = iIntValue;
                oooO00o.f85634OooO0OO = cls;
            }
        } catch (Throwable th) {
            throw th;
        }
        return OooO0o(oooO00o, cls);
    }

    public final <T> T OooO0o(OooO00o oooO00o, Class<T> cls) {
        InterfaceC25154OooO00o<T> interfaceC25154OooO00oOooO0o0 = OooO0o0(cls);
        T t = (T) this.f85626OooO00o.OooO00o(oooO00o);
        if (t != null) {
            this.f85630OooO0o -= interfaceC25154OooO00oOooO0o0.OooO0O0() * interfaceC25154OooO00oOooO0o0.OooO00o(t);
            OooO0O0(cls, interfaceC25154OooO00oOooO0o0.OooO00o(t));
        }
        if (t != null) {
            return t;
        }
        if (Log.isLoggable(interfaceC25154OooO00oOooO0o0.getTag(), 2)) {
            Log.v(interfaceC25154OooO00oOooO0o0.getTag(), "Allocated " + oooO00o.f85633OooO0O0 + " bytes");
        }
        return interfaceC25154OooO00oOooO0o0.newArray(oooO00o.f85633OooO0O0);
    }

    public final <T> InterfaceC25154OooO00o<T> OooO0o0(Class<T> cls) {
        InterfaceC25154OooO00o<T> c25157OooO0Oo;
        HashMap map = this.f85629OooO0Oo;
        InterfaceC25154OooO00o<T> interfaceC25154OooO00o = (InterfaceC25154OooO00o) map.get(cls);
        if (interfaceC25154OooO00o != null) {
            return interfaceC25154OooO00o;
        }
        if (cls.equals(int[].class)) {
            c25157OooO0Oo = new OooO0o();
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
            }
            c25157OooO0Oo = new C25157OooO0Oo();
        }
        map.put(cls, c25157OooO0Oo);
        return c25157OooO0Oo;
    }

    public final NavigableMap<Integer, Integer> OooO0oO(Class<?> cls) {
        HashMap map = this.f85628OooO0OO;
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    public final synchronized <T> void OooO0oo(T t) {
        Class<?> cls = t.getClass();
        InterfaceC25154OooO00o<T> interfaceC25154OooO00oOooO0o0 = OooO0o0(cls);
        int iOooO00o = interfaceC25154OooO00oOooO0o0.OooO00o(t);
        int iOooO0O0 = interfaceC25154OooO00oOooO0o0.OooO0O0() * iOooO00o;
        if (iOooO0O0 <= this.f85631OooO0o0 / 2) {
            OooO0O0 oooO0O0 = this.f85627OooO0O0;
            OooO OooO2 = (OooO) ((ArrayDeque) oooO0O0.f84649OooOo).poll();
            if (OooO2 == null) {
                OooO2 = oooO0O0.OooO();
            }
            OooO00o oooO00o = (OooO00o) OooO2;
            oooO00o.f85633OooO0O0 = iOooO00o;
            oooO00o.f85634OooO0OO = cls;
            this.f85626OooO00o.OooO0O0(oooO00o, t);
            NavigableMap<Integer, Integer> navigableMapOooO0oO = OooO0oO(cls);
            Integer num = navigableMapOooO0oO.get(Integer.valueOf(oooO00o.f85633OooO0O0));
            Integer numValueOf = Integer.valueOf(oooO00o.f85633OooO0O0);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapOooO0oO.put(numValueOf, Integer.valueOf(iIntValue));
            this.f85630OooO0o += iOooO0O0;
            OooO0OO(this.f85631OooO0o0);
        }
    }
}
