package o000000O;

import java.util.HashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.C24039Oooo0o0;
import kotlin.jvm.internal.OooOOO0;
import o00000O.OooOO0;
import oO00ooO.C32460OooOooO;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0<K, V> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOO0 f81159OooO00o = new OooOO0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HashMap<K, V> f81160OooO0O0 = new HashMap<>(0, 0.75f);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final LinkedHashSet<K> f81161OooO0OO = new LinkedHashSet<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f81162OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f81163OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f81164OooO0o0;

    public final V OooO00o(K k) {
        synchronized (this.f81159OooO00o) {
            V v = this.f81160OooO0O0.get(k);
            if (v == null) {
                this.f81163OooO0o++;
                return null;
            }
            this.f81161OooO0OO.remove(k);
            this.f81161OooO0OO.add(k);
            this.f81164OooO0o0++;
            return v;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b8, code lost:
    
        throw new java.lang.IllegalStateException("map/keySet size inconsistency");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V OooO0O0(K k, V v) {
        V vPut;
        Object objOooo0o;
        V v2;
        if (k == null) {
            throw null;
        }
        synchronized (this.f81159OooO00o) {
            try {
                this.f81162OooO0Oo = OooO0Oo() + 1;
                vPut = this.f81160OooO0O0.put(k, v);
                if (vPut != null) {
                    this.f81162OooO0Oo = OooO0Oo() - 1;
                }
                if (this.f81161OooO0OO.contains(k)) {
                    this.f81161OooO0OO.remove(k);
                }
                this.f81161OooO0OO.add(k);
            } catch (Throwable th) {
                throw th;
            }
        }
        while (true) {
            synchronized (this.f81159OooO00o) {
                try {
                    if (OooO0Oo() >= 0 && (!this.f81160OooO0O0.isEmpty() || OooO0Oo() == 0)) {
                        if (this.f81160OooO0O0.isEmpty() != this.f81161OooO0OO.isEmpty()) {
                            break;
                        }
                        if (OooO0Oo() <= 16 || this.f81160OooO0O0.isEmpty()) {
                            objOooo0o = null;
                            v2 = null;
                        } else {
                            objOooo0o = OooOo.Oooo0o(this.f81161OooO0OO);
                            v2 = this.f81160OooO0O0.get(objOooo0o);
                            if (v2 == null) {
                                throw new IllegalStateException("inconsistent state");
                            }
                            C24039Oooo0o0.OooO0OO(this.f81160OooO0O0).remove(objOooo0o);
                            LinkedHashSet<K> linkedHashSet = this.f81161OooO0OO;
                            C24039Oooo0o0.OooO00o(linkedHashSet);
                            linkedHashSet.remove(objOooo0o);
                            int iOooO0Oo = OooO0Oo();
                            OooOOO0.OooO0Oo(objOooo0o);
                            this.f81162OooO0Oo = iOooO0Oo - 1;
                        }
                        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    } else {
                        break;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (objOooo0o == null && v2 == null) {
                return vPut;
            }
            OooOOO0.OooO0Oo(objOooo0o);
            OooOOO0.OooO0Oo(v2);
        }
    }

    public final V OooO0OO(K k) {
        V vRemove;
        synchronized (this.f81159OooO00o) {
            try {
                vRemove = this.f81160OooO0O0.remove(k);
                this.f81161OooO0OO.remove(k);
                if (vRemove != null) {
                    this.f81162OooO0Oo = OooO0Oo() - 1;
                }
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return vRemove;
    }

    public final int OooO0Oo() {
        int i;
        synchronized (this.f81159OooO00o) {
            i = this.f81162OooO0Oo;
        }
        return i;
    }

    public final String toString() {
        String str;
        synchronized (this.f81159OooO00o) {
            try {
                int i = this.f81164OooO0o0;
                int i2 = this.f81163OooO0o + i;
                str = "LruCache[maxSize=16,hits=" + this.f81164OooO0o0 + ",misses=" + this.f81163OooO0o + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
