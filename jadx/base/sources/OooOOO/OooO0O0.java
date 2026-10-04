package OooOOO;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class OooO0O0<K, V> implements Iterable<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public OooO0OO<K, V> f58391OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public OooO0OO<K, V> f58392OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final WeakHashMap<OooO0o<K, V>, Boolean> f58394OooOoO0 = new WeakHashMap<>();

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f58393OooOoO = 0;

    public static class OooO00o<K, V> extends OooO0o0<K, V> {
        @Override // OooOOO.OooO0O0.OooO0o0
        public final OooO0OO<K, V> OooO0O0(OooO0OO<K, V> oooO0OO) {
            return oooO0OO.f58397OooOoO;
        }

        @Override // OooOOO.OooO0O0.OooO0o0
        public final OooO0OO<K, V> OooO0OO(OooO0OO<K, V> oooO0OO) {
            return oooO0OO.f58398OooOoO0;
        }
    }

    /* JADX INFO: renamed from: OooOOO.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static class C18961OooO0O0<K, V> extends OooO0o0<K, V> {
        @Override // OooOOO.OooO0O0.OooO0o0
        public final OooO0OO<K, V> OooO0O0(OooO0OO<K, V> oooO0OO) {
            return oooO0OO.f58398OooOoO0;
        }

        @Override // OooOOO.OooO0O0.OooO0o0
        public final OooO0OO<K, V> OooO0OO(OooO0OO<K, V> oooO0OO) {
            return oooO0OO.f58397OooOoO;
        }
    }

    public static class OooO0OO<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final V f58395OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final K f58396OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public OooO0OO<K, V> f58397OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public OooO0OO<K, V> f58398OooOoO0;

        public OooO0OO(K k, V v) {
            this.f58396OooOo0o = k;
            this.f58395OooOo = v;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OooO0OO)) {
                return false;
            }
            OooO0OO oooO0OO = (OooO0OO) obj;
            return this.f58396OooOo0o.equals(oooO0OO.f58396OooOo0o) && this.f58395OooOo.equals(oooO0OO.f58395OooOo);
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f58396OooOo0o;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f58395OooOo;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return this.f58396OooOo0o.hashCode() ^ this.f58395OooOo.hashCode();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final String toString() {
            return this.f58396OooOo0o + "=" + this.f58395OooOo;
        }
    }

    /* JADX INFO: renamed from: OooOOO.OooO0O0$OooO0Oo, reason: case insensitive filesystem */
    public class C20448OooO0Oo extends OooO0o<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public boolean f58399OooOo = true;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public OooO0OO<K, V> f58400OooOo0o;

        public C20448OooO0Oo() {
        }

        @Override // OooOOO.OooO0O0.OooO0o
        public final void OooO00o(OooO0OO<K, V> oooO0OO) {
            OooO0OO<K, V> oooO0OO2 = this.f58400OooOo0o;
            if (oooO0OO == oooO0OO2) {
                OooO0OO<K, V> oooO0OO3 = oooO0OO2.f58397OooOoO;
                this.f58400OooOo0o = oooO0OO3;
                this.f58399OooOo = oooO0OO3 == null;
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f58399OooOo) {
                return OooO0O0.this.f58392OooOo0o != null;
            }
            OooO0OO<K, V> oooO0OO = this.f58400OooOo0o;
            return (oooO0OO == null || oooO0OO.f58398OooOoO0 == null) ? false : true;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (this.f58399OooOo) {
                this.f58399OooOo = false;
                this.f58400OooOo0o = OooO0O0.this.f58392OooOo0o;
            } else {
                OooO0OO<K, V> oooO0OO = this.f58400OooOo0o;
                this.f58400OooOo0o = oooO0OO != null ? oooO0OO.f58398OooOoO0 : null;
            }
            return this.f58400OooOo0o;
        }
    }

    public static abstract class OooO0o<K, V> {
        public abstract void OooO00o(OooO0OO<K, V> oooO0OO);
    }

    public static abstract class OooO0o0<K, V> extends OooO0o<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public OooO0OO<K, V> f58402OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public OooO0OO<K, V> f58403OooOo0o;

        public OooO0o0(OooO0OO<K, V> oooO0OO, OooO0OO<K, V> oooO0OO2) {
            this.f58403OooOo0o = oooO0OO2;
            this.f58402OooOo = oooO0OO;
        }

        @Override // OooOOO.OooO0O0.OooO0o
        public final void OooO00o(OooO0OO<K, V> oooO0OO) {
            OooO0OO<K, V> OooO0OO2 = null;
            if (this.f58403OooOo0o == oooO0OO && oooO0OO == this.f58402OooOo) {
                this.f58402OooOo = null;
                this.f58403OooOo0o = null;
            }
            OooO0OO<K, V> oooO0OO2 = this.f58403OooOo0o;
            if (oooO0OO2 == oooO0OO) {
                this.f58403OooOo0o = OooO0O0(oooO0OO2);
            }
            OooO0OO<K, V> oooO0OO3 = this.f58402OooOo;
            if (oooO0OO3 == oooO0OO) {
                OooO0OO<K, V> oooO0OO4 = this.f58403OooOo0o;
                if (oooO0OO3 != oooO0OO4 && oooO0OO4 != null) {
                    OooO0OO2 = OooO0OO(oooO0OO3);
                }
                this.f58402OooOo = OooO0OO2;
            }
        }

        public abstract OooO0OO<K, V> OooO0O0(OooO0OO<K, V> oooO0OO);

        public abstract OooO0OO<K, V> OooO0OO(OooO0OO<K, V> oooO0OO);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f58402OooOo != null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            OooO0OO<K, V> oooO0OO = this.f58402OooOo;
            OooO0OO<K, V> oooO0OO2 = this.f58403OooOo0o;
            this.f58402OooOo = (oooO0OO == oooO0OO2 || oooO0OO2 == null) ? null : OooO0OO(oooO0OO);
            return oooO0OO;
        }
    }

    public OooO0OO<K, V> OooO0O0(K k) {
        OooO0OO<K, V> oooO0OO = this.f58392OooOo0o;
        while (oooO0OO != null && !oooO0OO.f58396OooOo0o.equals(k)) {
            oooO0OO = oooO0OO.f58398OooOoO0;
        }
        return oooO0OO;
    }

    public V OooO0OO(K k) {
        OooO0OO<K, V> oooO0OOOooO0O0 = OooO0O0(k);
        if (oooO0OOOooO0O0 == null) {
            return null;
        }
        this.f58393OooOoO--;
        WeakHashMap<OooO0o<K, V>, Boolean> weakHashMap = this.f58394OooOoO0;
        if (!weakHashMap.isEmpty()) {
            Iterator<OooO0o<K, V>> it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                it.next().OooO00o(oooO0OOOooO0O0);
            }
        }
        OooO0OO<K, V> oooO0OO = oooO0OOOooO0O0.f58397OooOoO;
        if (oooO0OO != null) {
            oooO0OO.f58398OooOoO0 = oooO0OOOooO0O0.f58398OooOoO0;
        } else {
            this.f58392OooOo0o = oooO0OOOooO0O0.f58398OooOoO0;
        }
        OooO0OO<K, V> oooO0OO2 = oooO0OOOooO0O0.f58398OooOoO0;
        if (oooO0OO2 != null) {
            oooO0OO2.f58397OooOoO = oooO0OO;
        } else {
            this.f58391OooOo = oooO0OO;
        }
        oooO0OOOooO0O0.f58398OooOoO0 = null;
        oooO0OOOooO0O0.f58397OooOoO = null;
        return oooO0OOOooO0O0.f58395OooOo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((OooOOO.OooO0O0.OooO0o0) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OooO0O0)) {
            return false;
        }
        OooO0O0 oooO0O0 = (OooO0O0) obj;
        if (this.f58393OooOoO != oooO0O0.f58393OooOoO) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = oooO0O0.iterator();
        while (true) {
            OooO0o0 oooO0o0 = (OooO0o0) it;
            if (!oooO0o0.hasNext()) {
                break;
            }
            OooO0o0 oooO0o02 = (OooO0o0) it2;
            if (!oooO0o02.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) oooO0o0.next();
            Object next = oooO0o02.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                break;
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (true) {
            OooO0o0 oooO0o0 = (OooO0o0) it;
            if (!oooO0o0.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) oooO0o0.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        OooO00o oooO00o = new OooO00o(this.f58392OooOo0o, this.f58391OooOo);
        this.f58394OooOoO0.put(oooO00o, Boolean.FALSE);
        return oooO00o;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (true) {
            OooO0o0 oooO0o0 = (OooO0o0) it;
            if (!oooO0o0.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) oooO0o0.next()).toString());
            if (oooO0o0.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
