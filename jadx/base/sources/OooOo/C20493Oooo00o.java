package OooOo;

import OooOoO0.C20511OooO00o;
import OooOoO0.C20514OooO0Oo;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: renamed from: OooOo.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C20493Oooo00o<K, V> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object[] f58548OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int[] f58549OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f58550OooOoO0;

    public C20493Oooo00o() {
        this(0);
    }

    public V OooO(int i) {
        if (!(i >= 0 && i < this.f58550OooOoO0)) {
            C20514OooO0Oo.OooO00o("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        Object[] objArr = this.f58548OooOo;
        int i2 = i << 1;
        V v = (V) objArr[i2 + 1];
        int i3 = this.f58550OooOoO0;
        if (i3 <= 1) {
            clear();
            return v;
        }
        int i4 = i3 - 1;
        int[] iArr = this.f58549OooOo0o;
        if (iArr.length <= 8 || i3 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                Oooo.OooO0OO.OooO0oO(iArr, iArr, i, i5, i3);
                Object[] objArr2 = this.f58548OooOo;
                Oooo.OooO0OO.OooO0oo(objArr2, i2, objArr2, i5 << 1, i3 << 1);
            }
            Object[] objArr3 = this.f58548OooOo;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i3 > 8 ? i3 + (i3 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i7);
            kotlin.jvm.internal.OooOOO0.OooO0o(iArrCopyOf, "copyOf(this, newSize)");
            this.f58549OooOo0o = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f58548OooOo, i7 << 1);
            kotlin.jvm.internal.OooOOO0.OooO0o(objArrCopyOf, "copyOf(this, newSize)");
            this.f58548OooOo = objArrCopyOf;
            if (i3 != this.f58550OooOoO0) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                Oooo.OooO0OO.OooO0oO(iArr, this.f58549OooOo0o, 0, 0, i);
                Oooo.OooO0OO.OooO0oo(objArr, 0, this.f58548OooOo, 0, i2);
            }
            if (i < i4) {
                int i8 = i + 1;
                Oooo.OooO0OO.OooO0oO(iArr, this.f58549OooOo0o, i, i8, i3);
                Oooo.OooO0OO.OooO0oo(objArr, i2, this.f58548OooOo, i8 << 1, i3 << 1);
            }
        }
        if (i3 != this.f58550OooOoO0) {
            throw new ConcurrentModificationException();
        }
        this.f58550OooOoO0 = i4;
        return v;
    }

    public final int OooO00o(V v) {
        int i = this.f58550OooOoO0 * 2;
        Object[] objArr = this.f58548OooOo;
        if (v == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (v.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final void OooO0O0(int i) {
        int i2 = this.f58550OooOoO0;
        int[] iArr = this.f58549OooOo0o;
        if (iArr.length < i) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i);
            kotlin.jvm.internal.OooOOO0.OooO0o(iArrCopyOf, "copyOf(this, newSize)");
            this.f58549OooOo0o = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f58548OooOo, i * 2);
            kotlin.jvm.internal.OooOOO0.OooO0o(objArrCopyOf, "copyOf(this, newSize)");
            this.f58548OooOo = objArrCopyOf;
        }
        if (this.f58550OooOoO0 != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public final int OooO0Oo(K k, int i) {
        int i2 = this.f58550OooOoO0;
        if (i2 == 0) {
            return -1;
        }
        int iOooO0O0 = C20511OooO00o.OooO0O0(this.f58549OooOo0o, i2, i);
        if (iOooO0O0 < 0 || kotlin.jvm.internal.OooOOO0.OooO0O0(k, this.f58548OooOo[iOooO0O0 << 1])) {
            return iOooO0O0;
        }
        int i3 = iOooO0O0 + 1;
        while (i3 < i2 && this.f58549OooOo0o[i3] == i) {
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(k, this.f58548OooOo[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iOooO0O0 - 1; i4 >= 0 && this.f58549OooOo0o[i4] == i; i4--) {
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(k, this.f58548OooOo[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final int OooO0o() {
        int i = this.f58550OooOoO0;
        if (i == 0) {
            return -1;
        }
        int iOooO0O0 = C20511OooO00o.OooO0O0(this.f58549OooOo0o, i, 0);
        if (iOooO0O0 < 0 || this.f58548OooOo[iOooO0O0 << 1] == null) {
            return iOooO0O0;
        }
        int i2 = iOooO0O0 + 1;
        while (i2 < i && this.f58549OooOo0o[i2] == 0) {
            if (this.f58548OooOo[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iOooO0O0 - 1; i3 >= 0 && this.f58549OooOo0o[i3] == 0; i3--) {
            if (this.f58548OooOo[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final int OooO0o0(K k) {
        return k == null ? OooO0o() : OooO0Oo(k, k.hashCode());
    }

    public final K OooO0oO(int i) {
        boolean z = false;
        if (i >= 0 && i < this.f58550OooOoO0) {
            z = true;
        }
        if (z) {
            return (K) this.f58548OooOo[i << 1];
        }
        C20514OooO0Oo.OooO00o("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    public void OooO0oo(OooO00o map) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(map, "map");
        int i = map.f58550OooOoO0;
        OooO0O0(this.f58550OooOoO0 + i);
        if (this.f58550OooOoO0 != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(map.OooO0oO(i2), map.OooOO0O(i2));
            }
        } else if (i > 0) {
            Oooo.OooO0OO.OooO0oO(map.f58549OooOo0o, this.f58549OooOo0o, 0, 0, i);
            Oooo.OooO0OO.OooO0oo(map.f58548OooOo, 0, this.f58548OooOo, 0, i << 1);
            this.f58550OooOoO0 = i;
        }
    }

    public V OooOO0(int i, V v) {
        boolean z = false;
        if (i >= 0 && i < this.f58550OooOoO0) {
            z = true;
        }
        if (!z) {
            C20514OooO0Oo.OooO00o("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f58548OooOo;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    public final V OooOO0O(int i) {
        boolean z = false;
        if (i >= 0 && i < this.f58550OooOoO0) {
            z = true;
        }
        if (z) {
            return (V) this.f58548OooOo[(i << 1) + 1];
        }
        C20514OooO0Oo.OooO00o("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    public void clear() {
        if (this.f58550OooOoO0 > 0) {
            this.f58549OooOo0o = C20511OooO00o.f58580OooO00o;
            this.f58548OooOo = C20511OooO00o.f58582OooO0OO;
            this.f58550OooOoO0 = 0;
        }
        if (this.f58550OooOoO0 > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(K k) {
        return OooO0o0(k) >= 0;
    }

    public boolean containsValue(V v) {
        return OooO00o(v) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C20493Oooo00o) {
                int i = this.f58550OooOoO0;
                if (i != ((C20493Oooo00o) obj).f58550OooOoO0) {
                    return false;
                }
                C20493Oooo00o c20493Oooo00o = (C20493Oooo00o) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    K kOooO0oO = OooO0oO(i2);
                    V vOooOO0O = OooOO0O(i2);
                    Object obj2 = c20493Oooo00o.get(kOooO0oO);
                    if (vOooOO0O == null) {
                        if (obj2 != null || !c20493Oooo00o.containsKey(kOooO0oO)) {
                            return false;
                        }
                    } else if (!vOooOO0O.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f58550OooOoO0 != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.f58550OooOoO0;
            for (int i4 = 0; i4 < i3; i4++) {
                K kOooO0oO2 = OooO0oO(i4);
                V vOooOO0O2 = OooOO0O(i4);
                Object obj3 = ((Map) obj).get(kOooO0oO2);
                if (vOooOO0O2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(kOooO0oO2)) {
                        return false;
                    }
                } else if (!vOooOO0O2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public V get(K k) {
        int iOooO0o0 = OooO0o0(k);
        if (iOooO0o0 >= 0) {
            return (V) this.f58548OooOo[(iOooO0o0 << 1) + 1];
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V getOrDefault(Object obj, V v) {
        int iOooO0o0 = OooO0o0(obj);
        return iOooO0o0 >= 0 ? (V) this.f58548OooOo[(iOooO0o0 << 1) + 1] : v;
    }

    public int hashCode() {
        int[] iArr = this.f58549OooOo0o;
        Object[] objArr = this.f58548OooOo;
        int i = this.f58550OooOoO0;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public final boolean isEmpty() {
        return this.f58550OooOoO0 <= 0;
    }

    public V put(K k, V v) {
        int i = this.f58550OooOoO0;
        int iHashCode = k != null ? k.hashCode() : 0;
        int iOooO0Oo = k != null ? OooO0Oo(k, iHashCode) : OooO0o();
        if (iOooO0Oo >= 0) {
            int i2 = (iOooO0Oo << 1) + 1;
            Object[] objArr = this.f58548OooOo;
            V v2 = (V) objArr[i2];
            objArr[i2] = v;
            return v2;
        }
        int i3 = ~iOooO0Oo;
        int[] iArr = this.f58549OooOo0o;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i4);
            kotlin.jvm.internal.OooOOO0.OooO0o(iArrCopyOf, "copyOf(this, newSize)");
            this.f58549OooOo0o = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f58548OooOo, i4 << 1);
            kotlin.jvm.internal.OooOOO0.OooO0o(objArrCopyOf, "copyOf(this, newSize)");
            this.f58548OooOo = objArrCopyOf;
            if (i != this.f58550OooOoO0) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.f58549OooOo0o;
            int i5 = i3 + 1;
            Oooo.OooO0OO.OooO0oO(iArr2, iArr2, i5, i3, i);
            Object[] objArr2 = this.f58548OooOo;
            Oooo.OooO0OO.OooO0oo(objArr2, i5 << 1, objArr2, i3 << 1, this.f58550OooOoO0 << 1);
        }
        int i6 = this.f58550OooOoO0;
        if (i == i6) {
            int[] iArr3 = this.f58549OooOo0o;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.f58548OooOo;
                int i7 = i3 << 1;
                objArr3[i7] = k;
                objArr3[i7 + 1] = v;
                this.f58550OooOoO0 = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final V putIfAbsent(K k, V v) {
        V v2 = get(k);
        return v2 == null ? put(k, v) : v2;
    }

    public V remove(K k) {
        int iOooO0o0 = OooO0o0(k);
        if (iOooO0o0 >= 0) {
            return OooO(iOooO0o0);
        }
        return null;
    }

    public final V replace(K k, V v) {
        int iOooO0o0 = OooO0o0(k);
        if (iOooO0o0 >= 0) {
            return OooOO0(iOooO0o0, v);
        }
        return null;
    }

    public final int size() {
        return this.f58550OooOoO0;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f58550OooOoO0 * 28);
        sb.append('{');
        int i = this.f58550OooOoO0;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            K kOooO0oO = OooO0oO(i2);
            if (kOooO0oO != sb) {
                sb.append(kOooO0oO);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V vOooOO0O = OooOO0O(i2);
            if (vOooOO0O != sb) {
                sb.append(vOooOO0O);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public C20493Oooo00o(int i) {
        this.f58549OooOo0o = i == 0 ? C20511OooO00o.f58580OooO00o : new int[i];
        this.f58548OooOo = i == 0 ? C20511OooO00o.f58582OooO0OO : new Object[i << 1];
    }

    public final boolean remove(K k, V v) {
        int iOooO0o0 = OooO0o0(k);
        if (iOooO0o0 < 0 || !kotlin.jvm.internal.OooOOO0.OooO0O0(v, OooOO0O(iOooO0o0))) {
            return false;
        }
        OooO(iOooO0o0);
        return true;
    }

    public final boolean replace(K k, V v, V v2) {
        int iOooO0o0 = OooO0o0(k);
        if (iOooO0o0 < 0 || !kotlin.jvm.internal.OooOOO0.OooO0O0(v, OooOO0O(iOooO0o0))) {
            return false;
        }
        OooOO0(iOooO0o0, v2);
        return true;
    }
}
