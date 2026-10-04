package oO00ooOO;

import Oooo0O0.C20920OooOOo;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.OooOOO0;
import oO0O00.InterfaceC32497OooO0Oo;

/* JADX INFO: renamed from: oO00ooOO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32466OooO0OO<K, V> implements Map<K, V>, Serializable, InterfaceC32497OooO0Oo {

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public static final C32466OooO0OO f116689Oooo0O0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public V[] f116690OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public K[] f116691OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int[] f116692OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int[] f116693OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f116694OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f116695OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f116696OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f116697OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f116698OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public boolean f116699Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public C32470OooO0o0<K> f116700Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public C32469OooO0o<V> f116701Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public C32468OooO0Oo<K, V> f116702Oooo00o;

    /* JADX INFO: renamed from: oO00ooOO.OooO0OO$OooO00o */
    public static final class OooO00o {
    }

    /* JADX INFO: renamed from: oO00ooOO.OooO0OO$OooO0O0 */
    public static final class OooO0O0<K, V> extends OooO0Oo<K, V> implements Iterator<Map.Entry<K, V>>, oO0O00.OooO00o {
        @Override // java.util.Iterator
        public final Object next() {
            OooO00o();
            int i = this.f116706OooOo;
            C32466OooO0OO<K, V> c32466OooO0OO = this.f116707OooOo0o;
            if (i >= c32466OooO0OO.f116696OooOoo0) {
                throw new NoSuchElementException();
            }
            this.f116706OooOo = i + 1;
            this.f116709OooOoO0 = i;
            C20233OooO0OO c20233OooO0OO = new C20233OooO0OO(c32466OooO0OO, i);
            OooO0O0();
            return c20233OooO0OO;
        }
    }

    /* JADX INFO: renamed from: oO00ooOO.OooO0OO$OooO0OO, reason: collision with other inner class name */
    public static final class C20233OooO0OO<K, V> implements Map.Entry<K, V>, InterfaceC32497OooO0Oo.OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final int f116703OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final C32466OooO0OO<K, V> f116704OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final int f116705OooOoO0;

        public C20233OooO0OO(C32466OooO0OO<K, V> map, int i) {
            OooOOO0.OooO0oO(map, "map");
            this.f116704OooOo0o = map;
            this.f116703OooOo = i;
            this.f116705OooOoO0 = map.f116697OooOooO;
        }

        public final void OooO00o() {
            if (this.f116704OooOo0o.f116697OooOooO != this.f116705OooOoO0) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return OooOOO0.OooO0O0(entry.getKey(), getKey()) && OooOOO0.OooO0O0(entry.getValue(), getValue());
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            OooO00o();
            return this.f116704OooOo0o.f116691OooOo0o[this.f116703OooOo];
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            OooO00o();
            V[] vArr = this.f116704OooOo0o.f116690OooOo;
            OooOOO0.OooO0Oo(vArr);
            return vArr[this.f116703OooOo];
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            OooO00o();
            C32466OooO0OO<K, V> c32466OooO0OO = this.f116704OooOo0o;
            c32466OooO0OO.OooO0Oo();
            V[] vArr = c32466OooO0OO.f116690OooOo;
            if (vArr == null) {
                int length = c32466OooO0OO.f116691OooOo0o.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                vArr = (V[]) new Object[length];
                c32466OooO0OO.f116690OooOo = vArr;
            }
            int i = this.f116703OooOo;
            V v2 = vArr[i];
            vArr[i] = v;
            return v2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: oO00ooOO.OooO0OO$OooO0Oo */
    public static class OooO0Oo<K, V> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f116706OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final C32466OooO0OO<K, V> f116707OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public int f116708OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f116709OooOoO0;

        public OooO0Oo(C32466OooO0OO<K, V> map) {
            OooOOO0.OooO0oO(map, "map");
            this.f116707OooOo0o = map;
            this.f116709OooOoO0 = -1;
            this.f116708OooOoO = map.f116697OooOooO;
            OooO0O0();
        }

        public final void OooO00o() {
            if (this.f116707OooOo0o.f116697OooOooO != this.f116708OooOoO) {
                throw new ConcurrentModificationException();
            }
        }

        public final void OooO0O0() {
            while (true) {
                int i = this.f116706OooOo;
                C32466OooO0OO<K, V> c32466OooO0OO = this.f116707OooOo0o;
                if (i >= c32466OooO0OO.f116696OooOoo0 || c32466OooO0OO.f116693OooOoO0[i] >= 0) {
                    return;
                } else {
                    this.f116706OooOo = i + 1;
                }
            }
        }

        public final boolean hasNext() {
            return this.f116706OooOo < this.f116707OooOo0o.f116696OooOoo0;
        }

        public final void remove() {
            OooO00o();
            if (this.f116709OooOoO0 == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            C32466OooO0OO<K, V> c32466OooO0OO = this.f116707OooOo0o;
            c32466OooO0OO.OooO0Oo();
            c32466OooO0OO.OooOOO(this.f116709OooOoO0);
            this.f116709OooOoO0 = -1;
            this.f116708OooOoO = c32466OooO0OO.f116697OooOooO;
        }
    }

    /* JADX INFO: renamed from: oO00ooOO.OooO0OO$OooO0o */
    public static final class OooO0o<K, V> extends OooO0Oo<K, V> implements Iterator<V>, oO0O00.OooO00o {
        @Override // java.util.Iterator
        public final V next() {
            OooO00o();
            int i = this.f116706OooOo;
            C32466OooO0OO<K, V> c32466OooO0OO = this.f116707OooOo0o;
            if (i >= c32466OooO0OO.f116696OooOoo0) {
                throw new NoSuchElementException();
            }
            this.f116706OooOo = i + 1;
            this.f116709OooOoO0 = i;
            V[] vArr = c32466OooO0OO.f116690OooOo;
            OooOOO0.OooO0Oo(vArr);
            V v = vArr[this.f116709OooOoO0];
            OooO0O0();
            return v;
        }
    }

    /* JADX INFO: renamed from: oO00ooOO.OooO0OO$OooO0o0, reason: case insensitive filesystem */
    public static final class C32467OooO0o0<K, V> extends OooO0Oo<K, V> implements Iterator<K>, oO0O00.OooO00o {
        @Override // java.util.Iterator
        public final K next() {
            OooO00o();
            int i = this.f116706OooOo;
            C32466OooO0OO<K, V> c32466OooO0OO = this.f116707OooOo0o;
            if (i >= c32466OooO0OO.f116696OooOoo0) {
                throw new NoSuchElementException();
            }
            this.f116706OooOo = i + 1;
            this.f116709OooOoO0 = i;
            K k = c32466OooO0OO.f116691OooOo0o[i];
            OooO0O0();
            return k;
        }
    }

    static {
        C32466OooO0OO c32466OooO0OO = new C32466OooO0OO(0);
        c32466OooO0OO.f116699Oooo0 = true;
        f116689Oooo0O0 = c32466OooO0OO;
    }

    public C32466OooO0OO() {
        this(8);
    }

    private final Object writeReplace() throws NotSerializableException {
        if (!this.f116699Oooo0) {
            throw new NotSerializableException("The map cannot be serialized while it is being built.");
        }
        C32472OooO0oo c32472OooO0oo = new C32472OooO0oo();
        c32472OooO0oo.f116715OooOo0o = this;
        return c32472OooO0oo;
    }

    public final int OooO(K k) {
        int iOooOO0O = OooOO0O(k);
        int i = this.f116694OooOoOO;
        while (true) {
            int i2 = this.f116692OooOoO[iOooOO0O];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (OooOOO0.OooO0O0(this.f116691OooOo0o[i3], k)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iOooOO0O = iOooOO0O == 0 ? this.f116692OooOoO.length - 1 : iOooOO0O - 1;
        }
    }

    public final int OooO00o(K k) {
        OooO0Oo();
        while (true) {
            int iOooOO0O = OooOO0O(k);
            int i = this.f116694OooOoOO * 2;
            int length = this.f116692OooOoO.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.f116692OooOoO;
                int i3 = iArr[iOooOO0O];
                if (i3 <= 0) {
                    int i4 = this.f116696OooOoo0;
                    K[] kArr = this.f116691OooOo0o;
                    if (i4 < kArr.length) {
                        int i5 = i4 + 1;
                        this.f116696OooOoo0 = i5;
                        kArr[i4] = k;
                        this.f116693OooOoO0[i4] = iOooOO0O;
                        iArr[iOooOO0O] = i5;
                        this.f116698OooOooo++;
                        this.f116697OooOooO++;
                        if (i2 > this.f116694OooOoOO) {
                            this.f116694OooOoOO = i2;
                        }
                        return i4;
                    }
                    OooO0oo(1);
                } else {
                    if (OooOOO0.OooO0O0(this.f116691OooOo0o[i3 - 1], k)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        OooOO0o(this.f116692OooOoO.length * 2);
                        break;
                    }
                    iOooOO0O = iOooOO0O == 0 ? this.f116692OooOoO.length - 1 : iOooOO0O - 1;
                }
            }
        }
    }

    public final C32466OooO0OO OooO0O0() {
        OooO0Oo();
        this.f116699Oooo0 = true;
        if (this.f116698OooOooo > 0) {
            return this;
        }
        C32466OooO0OO c32466OooO0OO = f116689Oooo0O0;
        OooOOO0.OooO0o0(c32466OooO0OO, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return c32466OooO0OO;
    }

    public final void OooO0Oo() {
        if (this.f116699Oooo0) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean OooO0o(Collection<?> m) {
        OooOOO0.OooO0oO(m, "m");
        for (Object obj : m) {
            if (obj != null) {
                try {
                    if (!OooO0oO((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final void OooO0o0(boolean z) {
        int i;
        V[] vArr = this.f116690OooOo;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f116696OooOoo0;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.f116693OooOoO0;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                K[] kArr = this.f116691OooOo0o;
                kArr[i3] = kArr[i2];
                if (vArr != null) {
                    vArr[i3] = vArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.f116692OooOoO[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        C20920OooOOo.OooO0Oo(this.f116691OooOo0o, i3, i);
        if (vArr != null) {
            C20920OooOOo.OooO0Oo(vArr, i3, this.f116696OooOoo0);
        }
        this.f116696OooOoo0 = i3;
    }

    public final boolean OooO0oO(Map.Entry<? extends K, ? extends V> entry) {
        OooOOO0.OooO0oO(entry, "entry");
        int iOooO = OooO(entry.getKey());
        if (iOooO < 0) {
            return false;
        }
        V[] vArr = this.f116690OooOo;
        OooOOO0.OooO0Oo(vArr);
        return OooOOO0.OooO0O0(vArr[iOooO], entry.getValue());
    }

    public final void OooO0oo(int i) {
        V[] vArr;
        K[] kArr = this.f116691OooOo0o;
        int length = kArr.length;
        int i2 = this.f116696OooOoo0;
        int i3 = length - i2;
        int i4 = i2 - this.f116698OooOooo;
        if (i3 < i && i3 + i4 >= i && i4 >= kArr.length / 4) {
            OooO0o0(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > kArr.length) {
            int length2 = kArr.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            K[] kArr2 = (K[]) Arrays.copyOf(kArr, i6);
            OooOOO0.OooO0o(kArr2, "copyOf(...)");
            this.f116691OooOo0o = kArr2;
            V[] vArr2 = this.f116690OooOo;
            if (vArr2 != null) {
                vArr = (V[]) Arrays.copyOf(vArr2, i6);
                OooOOO0.OooO0o(vArr, "copyOf(...)");
            } else {
                vArr = null;
            }
            this.f116690OooOo = vArr;
            int[] iArrCopyOf = Arrays.copyOf(this.f116693OooOoO0, i6);
            OooOOO0.OooO0o(iArrCopyOf, "copyOf(...)");
            this.f116693OooOoO0 = iArrCopyOf;
            int iHighestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (iHighestOneBit > this.f116692OooOoO.length) {
                OooOO0o(iHighestOneBit);
            }
        }
    }

    public final int OooOO0(V v) {
        int i = this.f116696OooOoo0;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.f116693OooOoO0[i] >= 0) {
                V[] vArr = this.f116690OooOo;
                OooOOO0.OooO0Oo(vArr);
                if (OooOOO0.OooO0O0(vArr[i], v)) {
                    return i;
                }
            }
        }
    }

    public final int OooOO0O(K k) {
        return ((k != null ? k.hashCode() : 0) * (-1640531527)) >>> this.f116695OooOoo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f116693OooOoO0[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooOO0o(int i) {
        this.f116697OooOooO++;
        int i2 = 0;
        if (this.f116696OooOoo0 > this.f116698OooOooo) {
            OooO0o0(false);
        }
        this.f116692OooOoO = new int[i];
        this.f116695OooOoo = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.f116696OooOoo0) {
            int i3 = i2 + 1;
            int iOooOO0O = OooOO0O(this.f116691OooOo0o[i2]);
            int i4 = this.f116694OooOoOO;
            while (true) {
                int[] iArr = this.f116692OooOoO;
                if (iArr[iOooOO0O] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                iOooOO0O = iOooOO0O == 0 ? iArr.length - 1 : iOooOO0O - 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[LOOP:0: B:9:0x0024->B:33:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooOOO(int i) {
        K[] kArr = this.f116691OooOo0o;
        OooOOO0.OooO0oO(kArr, "<this>");
        kArr[i] = null;
        V[] vArr = this.f116690OooOo;
        if (vArr != null) {
            vArr[i] = null;
        }
        int length = this.f116693OooOoO0[i];
        int i2 = this.f116694OooOoOO * 2;
        int length2 = this.f116692OooOoO.length / 2;
        if (i2 > length2) {
            i2 = length2;
        }
        int i3 = i2;
        int i4 = 0;
        int i5 = length;
        while (true) {
            length = length == 0 ? this.f116692OooOoO.length - 1 : length - 1;
            i4++;
            if (i4 > this.f116694OooOoOO) {
                this.f116692OooOoO[i5] = 0;
                break;
            }
            int[] iArr = this.f116692OooOoO;
            int i6 = iArr[length];
            if (i6 == 0) {
                iArr[i5] = 0;
                break;
            }
            if (i6 < 0) {
                iArr[i5] = -1;
            } else {
                int i7 = i6 - 1;
                int iOooOO0O = OooOO0O(this.f116691OooOo0o[i7]) - length;
                int[] iArr2 = this.f116692OooOoO;
                if ((iOooOO0O & (iArr2.length - 1)) >= i4) {
                    iArr2[i5] = i6;
                    this.f116693OooOoO0[i7] = i5;
                }
                i3--;
                if (i3 >= 0) {
                    this.f116692OooOoO[i5] = -1;
                    break;
                }
            }
            i5 = length;
            i4 = 0;
            i3--;
            if (i3 >= 0) {
            }
        }
        this.f116693OooOoO0[i] = -1;
        this.f116698OooOooo--;
        this.f116697OooOooO++;
    }

    @Override // java.util.Map
    public final void clear() {
        OooO0Oo();
        int i = this.f116696OooOoo0 - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.f116693OooOoO0;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.f116692OooOoO[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        C20920OooOOo.OooO0Oo(this.f116691OooOo0o, 0, this.f116696OooOoo0);
        V[] vArr = this.f116690OooOo;
        if (vArr != null) {
            C20920OooOOo.OooO0Oo(vArr, 0, this.f116696OooOoo0);
        }
        this.f116698OooOooo = 0;
        this.f116696OooOoo0 = 0;
        this.f116697OooOooO++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return OooO(obj) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return OooOO0(obj) >= 0;
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        C32468OooO0Oo<K, V> c32468OooO0Oo = this.f116702Oooo00o;
        if (c32468OooO0Oo != null) {
            return c32468OooO0Oo;
        }
        C32468OooO0Oo<K, V> c32468OooO0Oo2 = new C32468OooO0Oo<>(this);
        this.f116702Oooo00o = c32468OooO0Oo2;
        return c32468OooO0Oo2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.f116698OooOooo == map.size() && OooO0o(map.entrySet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final V get(Object obj) {
        int iOooO = OooO(obj);
        if (iOooO < 0) {
            return null;
        }
        V[] vArr = this.f116690OooOo;
        OooOOO0.OooO0Oo(vArr);
        return vArr[iOooO];
    }

    @Override // java.util.Map
    public final int hashCode() {
        OooO0O0 oooO0O0 = new OooO0O0(this);
        int i = 0;
        while (oooO0O0.hasNext()) {
            int i2 = oooO0O0.f116706OooOo;
            C32466OooO0OO<K, V> c32466OooO0OO = oooO0O0.f116707OooOo0o;
            if (i2 >= c32466OooO0OO.f116696OooOoo0) {
                throw new NoSuchElementException();
            }
            oooO0O0.f116706OooOo = i2 + 1;
            oooO0O0.f116709OooOoO0 = i2;
            K k = c32466OooO0OO.f116691OooOo0o[i2];
            int iHashCode = k != null ? k.hashCode() : 0;
            V[] vArr = c32466OooO0OO.f116690OooOo;
            OooOOO0.OooO0Oo(vArr);
            V v = vArr[oooO0O0.f116709OooOoO0];
            int iHashCode2 = v != null ? v.hashCode() : 0;
            oooO0O0.OooO0O0();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f116698OooOooo == 0;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        C32470OooO0o0<K> c32470OooO0o0 = this.f116700Oooo000;
        if (c32470OooO0o0 != null) {
            return c32470OooO0o0;
        }
        C32470OooO0o0<K> c32470OooO0o02 = new C32470OooO0o0<>(this);
        this.f116700Oooo000 = c32470OooO0o02;
        return c32470OooO0o02;
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        OooO0Oo();
        int iOooO00o = OooO00o(k);
        V[] vArr = this.f116690OooOo;
        if (vArr == null) {
            int length = this.f116691OooOo0o.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            vArr = (V[]) new Object[length];
            this.f116690OooOo = vArr;
        }
        if (iOooO00o >= 0) {
            vArr[iOooO00o] = v;
            return null;
        }
        int i = (-iOooO00o) - 1;
        V v2 = vArr[i];
        vArr[i] = v;
        return v2;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> from) {
        OooOOO0.OooO0oO(from, "from");
        OooO0Oo();
        Set<Map.Entry<? extends K, ? extends V>> setEntrySet = from.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        OooO0oo(setEntrySet.size());
        for (Map.Entry<? extends K, ? extends V> entry : setEntrySet) {
            int iOooO00o = OooO00o(entry.getKey());
            V[] vArr = this.f116690OooOo;
            if (vArr == null) {
                int length = this.f116691OooOo0o.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                vArr = (V[]) new Object[length];
                this.f116690OooOo = vArr;
            }
            if (iOooO00o >= 0) {
                vArr[iOooO00o] = entry.getValue();
            } else {
                int i = (-iOooO00o) - 1;
                if (!OooOOO0.OooO0O0(entry.getValue(), vArr[i])) {
                    vArr[i] = entry.getValue();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final V remove(Object obj) {
        OooO0Oo();
        int iOooO = OooO(obj);
        if (iOooO < 0) {
            return null;
        }
        V[] vArr = this.f116690OooOo;
        OooOOO0.OooO0Oo(vArr);
        V v = vArr[iOooO];
        OooOOO(iOooO);
        return v;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f116698OooOooo;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f116698OooOooo * 3) + 2);
        sb.append("{");
        OooO0O0 oooO0O0 = new OooO0O0(this);
        int i = 0;
        while (oooO0O0.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = oooO0O0.f116706OooOo;
            C32466OooO0OO<K, V> c32466OooO0OO = oooO0O0.f116707OooOo0o;
            if (i2 >= c32466OooO0OO.f116696OooOoo0) {
                throw new NoSuchElementException();
            }
            oooO0O0.f116706OooOo = i2 + 1;
            oooO0O0.f116709OooOoO0 = i2;
            K k = c32466OooO0OO.f116691OooOo0o[i2];
            if (k == c32466OooO0OO) {
                sb.append("(this Map)");
            } else {
                sb.append(k);
            }
            sb.append('=');
            V[] vArr = c32466OooO0OO.f116690OooOo;
            OooOOO0.OooO0Oo(vArr);
            V v = vArr[oooO0O0.f116709OooOoO0];
            if (v == c32466OooO0OO) {
                sb.append("(this Map)");
            } else {
                sb.append(v);
            }
            oooO0O0.OooO0O0();
            i++;
        }
        sb.append("}");
        String string = sb.toString();
        OooOOO0.OooO0o(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        C32469OooO0o<V> c32469OooO0o = this.f116701Oooo00O;
        if (c32469OooO0o != null) {
            return c32469OooO0o;
        }
        C32469OooO0o<V> c32469OooO0o2 = new C32469OooO0o<>(this);
        this.f116701Oooo00O = c32469OooO0o2;
        return c32469OooO0o2;
    }

    public C32466OooO0OO(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        K[] kArr = (K[]) new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.f116691OooOo0o = kArr;
        this.f116690OooOo = null;
        this.f116693OooOoO0 = iArr;
        this.f116692OooOoO = new int[iHighestOneBit];
        this.f116694OooOoOO = 2;
        this.f116696OooOoo0 = 0;
        this.f116695OooOoo = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }
}
