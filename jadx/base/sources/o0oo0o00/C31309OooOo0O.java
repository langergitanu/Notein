package o0oo0o00;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: o0oo0o00.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31309OooOo0O<K, V> extends AbstractMap<K, V> implements Serializable {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final OooO00o f111787OooOooo = new OooO00o();

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public C31309OooOo0O<K, V>.OooO0OO f111793OooOoo;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public C31309OooOo0O<K, V>.C31310OooO0Oo f111795OooOooO;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f111790OooOoO = 0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f111792OooOoOO = 0;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Comparator<? super K> f111789OooOo0o = f111787OooOooo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final OooO0o<K, V> f111791OooOoO0 = new OooO0o<>();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public OooO0o<K, V>[] f111788OooOo = new OooO0o[16];

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f111794OooOoo0 = 12;

    /* JADX INFO: renamed from: o0oo0o00.OooOo0O$OooO00o */
    public class OooO00o implements Comparator<Comparable> {
        @Override // java.util.Comparator
        public final int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* JADX INFO: renamed from: o0oo0o00.OooOo0O$OooO0O0 */
    public static final class OooO0O0<K, V> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public OooO0o<K, V> f111796OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f111797OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f111798OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f111799OooO0Oo;

        public final void OooO00o(OooO0o<K, V> oooO0o) {
            oooO0o.f111805OooOoO0 = null;
            oooO0o.f111803OooOo0o = null;
            oooO0o.f111802OooOo = null;
            oooO0o.f111810OooOooo = 1;
            int i = this.f111797OooO0O0;
            if (i > 0) {
                int i2 = this.f111799OooO0Oo;
                if ((i2 & 1) == 0) {
                    this.f111799OooO0Oo = i2 + 1;
                    this.f111797OooO0O0 = i - 1;
                    this.f111798OooO0OO++;
                }
            }
            oooO0o.f111803OooOo0o = this.f111796OooO00o;
            this.f111796OooO00o = oooO0o;
            int i3 = this.f111799OooO0Oo;
            int i4 = i3 + 1;
            this.f111799OooO0Oo = i4;
            int i5 = this.f111797OooO0O0;
            if (i5 > 0 && (i4 & 1) == 0) {
                this.f111799OooO0Oo = i3 + 2;
                this.f111797OooO0O0 = i5 - 1;
                this.f111798OooO0OO++;
            }
            int i6 = 4;
            while (true) {
                int i7 = i6 - 1;
                if ((this.f111799OooO0Oo & i7) != i7) {
                    return;
                }
                int i8 = this.f111798OooO0OO;
                if (i8 == 0) {
                    OooO0o<K, V> oooO0o2 = this.f111796OooO00o;
                    OooO0o<K, V> oooO0o3 = oooO0o2.f111803OooOo0o;
                    OooO0o<K, V> oooO0o4 = oooO0o3.f111803OooOo0o;
                    oooO0o3.f111803OooOo0o = oooO0o4.f111803OooOo0o;
                    this.f111796OooO00o = oooO0o3;
                    oooO0o3.f111802OooOo = oooO0o4;
                    oooO0o3.f111805OooOoO0 = oooO0o2;
                    oooO0o3.f111810OooOooo = oooO0o2.f111810OooOooo + 1;
                    oooO0o4.f111803OooOo0o = oooO0o3;
                    oooO0o2.f111803OooOo0o = oooO0o3;
                } else if (i8 == 1) {
                    OooO0o<K, V> oooO0o5 = this.f111796OooO00o;
                    OooO0o<K, V> oooO0o6 = oooO0o5.f111803OooOo0o;
                    this.f111796OooO00o = oooO0o6;
                    oooO0o6.f111805OooOoO0 = oooO0o5;
                    oooO0o6.f111810OooOooo = oooO0o5.f111810OooOooo + 1;
                    oooO0o5.f111803OooOo0o = oooO0o6;
                    this.f111798OooO0OO = 0;
                } else if (i8 == 2) {
                    this.f111798OooO0OO = 0;
                }
                i6 *= 2;
            }
        }
    }

    /* JADX INFO: renamed from: o0oo0o00.OooOo0O$OooO0OO */
    public final class OooO0OO extends AbstractSet<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: o0oo0o00.OooOo0O$OooO0OO$OooO00o */
        public class OooO00o extends C31309OooOo0O<K, V>.AbstractC31311OooO0o0<Map.Entry<K, V>> {
        }

        public OooO0OO() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            C31309OooOo0O.this.clear();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:17:0x002b A[RETURN] */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean contains(Object obj) {
            OooO0o oooO0oOooO00o;
            V v;
            Object value;
            if (obj instanceof Map.Entry) {
                C31309OooOo0O c31309OooOo0O = C31309OooOo0O.this;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                OooO0o oooO0o = null;
                if (key != null) {
                    try {
                        oooO0oOooO00o = c31309OooOo0O.OooO00o(key, false);
                    } catch (ClassCastException unused) {
                        oooO0oOooO00o = null;
                    }
                    if (oooO0oOooO00o != null && ((v = oooO0oOooO00o.f111809OooOooO) == (value = entry.getValue()) || (v != null && v.equals(value)))) {
                        oooO0o = oooO0oOooO00o;
                    }
                    if (oooO0o == null) {
                        return true;
                    }
                } else {
                    oooO0oOooO00o = null;
                    if (oooO0oOooO00o != null) {
                        oooO0o = oooO0oOooO00o;
                    }
                    if (oooO0o == null) {
                    }
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new OooO00o();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean remove(Object obj) {
            OooO0o oooO0oOooO00o;
            V v;
            Object value;
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                C31309OooOo0O c31309OooOo0O = C31309OooOo0O.this;
                Object key = entry.getKey();
                OooO0o oooO0o = null;
                if (key != null) {
                    try {
                        oooO0oOooO00o = c31309OooOo0O.OooO00o(key, false);
                    } catch (ClassCastException unused) {
                        oooO0oOooO00o = null;
                    }
                    if (oooO0oOooO00o != null && ((v = oooO0oOooO00o.f111809OooOooO) == (value = entry.getValue()) || (v != null && v.equals(value)))) {
                        oooO0o = oooO0oOooO00o;
                    }
                    if (oooO0o != null) {
                        c31309OooOo0O.OooO0Oo(oooO0o, true);
                        return true;
                    }
                } else {
                    oooO0oOooO00o = null;
                    if (oooO0oOooO00o != null) {
                        oooO0o = oooO0oOooO00o;
                    }
                    if (oooO0o != null) {
                    }
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return C31309OooOo0O.this.f111790OooOoO;
        }
    }

    /* JADX INFO: renamed from: o0oo0o00.OooOo0O$OooO0Oo, reason: case insensitive filesystem */
    public final class C31310OooO0Oo extends AbstractSet<K> {

        /* JADX INFO: renamed from: o0oo0o00.OooOo0O$OooO0Oo$OooO00o */
        public class OooO00o extends C31309OooOo0O<K, V>.AbstractC31311OooO0o0<K> {
            @Override // o0oo0o00.C31309OooOo0O.AbstractC31311OooO0o0, java.util.Iterator
            public final K next() {
                return OooO00o().f111808OooOoo0;
            }
        }

        public C31310OooO0Oo() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            C31309OooOo0O.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return C31309OooOo0O.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new OooO00o();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            C31309OooOo0O c31309OooOo0O = C31309OooOo0O.this;
            OooO0o<K, V> oooO0oOooO00o = null;
            if (obj != null) {
                try {
                    oooO0oOooO00o = c31309OooOo0O.OooO00o(obj, false);
                } catch (ClassCastException unused) {
                }
            }
            if (oooO0oOooO00o != null) {
                c31309OooOo0O.OooO0Oo(oooO0oOooO00o, true);
            }
            return oooO0oOooO00o != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return C31309OooOo0O.this.f111790OooOoO;
        }
    }

    /* JADX INFO: renamed from: o0oo0o00.OooOo0O$OooO0o0, reason: case insensitive filesystem */
    public abstract class AbstractC31311OooO0o0<T> implements Iterator<T> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public OooO0o<K, V> f111811OooOo = null;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public OooO0o<K, V> f111812OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f111814OooOoO0;

        public AbstractC31311OooO0o0() {
            this.f111812OooOo0o = C31309OooOo0O.this.f111791OooOoO0.f111804OooOoO;
            this.f111814OooOoO0 = C31309OooOo0O.this.f111792OooOoOO;
        }

        public final OooO0o<K, V> OooO00o() {
            OooO0o<K, V> oooO0o = this.f111812OooOo0o;
            C31309OooOo0O c31309OooOo0O = C31309OooOo0O.this;
            if (oooO0o == c31309OooOo0O.f111791OooOoO0) {
                throw new NoSuchElementException();
            }
            if (c31309OooOo0O.f111792OooOoOO != this.f111814OooOoO0) {
                throw new ConcurrentModificationException();
            }
            this.f111812OooOo0o = oooO0o.f111804OooOoO;
            this.f111811OooOo = oooO0o;
            return oooO0o;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f111812OooOo0o != C31309OooOo0O.this.f111791OooOoO0;
        }

        @Override // java.util.Iterator
        public Object next() {
            return OooO00o();
        }

        @Override // java.util.Iterator
        public final void remove() {
            OooO0o<K, V> oooO0o = this.f111811OooOo;
            if (oooO0o == null) {
                throw new IllegalStateException();
            }
            C31309OooOo0O c31309OooOo0O = C31309OooOo0O.this;
            c31309OooOo0O.OooO0Oo(oooO0o, true);
            this.f111811OooOo = null;
            this.f111814OooOoO0 = c31309OooOo0O.f111792OooOoOO;
        }
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    public final OooO0o<K, V> OooO00o(K k, boolean z) {
        int iCompareTo;
        OooO0o<K, V> oooO0o;
        boolean z2;
        OooO0o<K, V> oooO0o2;
        OooO0o<K, V> oooO0o3;
        OooO0o<K, V> oooO0o4;
        OooO0o<K, V> oooO0o5;
        OooO0o<K, V> oooO0o6;
        OooO0o<K, V>[] oooO0oArr = this.f111788OooOo;
        int iHashCode = k.hashCode();
        int i = iHashCode ^ ((iHashCode >>> 20) ^ (iHashCode >>> 12));
        int i2 = ((i >>> 7) ^ i) ^ (i >>> 4);
        boolean z3 = true;
        int length = i2 & (oooO0oArr.length - 1);
        OooO0o<K, V> oooO0o7 = oooO0oArr[length];
        OooO00o oooO00o = f111787OooOooo;
        OooO0o<K, V> oooO0o8 = null;
        Comparator<? super K> comparator = this.f111789OooOo0o;
        if (oooO0o7 != null) {
            Comparable comparable = comparator == oooO00o ? (Comparable) k : null;
            while (true) {
                K k2 = oooO0o7.f111808OooOoo0;
                iCompareTo = comparable != null ? comparable.compareTo(k2) : comparator.compare(k, k2);
                if (iCompareTo == 0) {
                    return oooO0o7;
                }
                OooO0o<K, V> oooO0o9 = iCompareTo < 0 ? oooO0o7.f111802OooOo : oooO0o7.f111805OooOoO0;
                if (oooO0o9 == null) {
                    break;
                }
                oooO0o7 = oooO0o9;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z) {
            return null;
        }
        OooO0o<K, V> oooO0o10 = this.f111791OooOoO0;
        if (oooO0o7 != null) {
            OooO0o<K, V> oooO0o11 = oooO0o7;
            oooO0o = new OooO0o<>(oooO0o11, k, i2, oooO0o10, oooO0o10.f111806OooOoOO);
            if (iCompareTo < 0) {
                oooO0o11.f111802OooOo = oooO0o;
            } else {
                oooO0o11.f111805OooOoO0 = oooO0o;
            }
            OooO0O0(oooO0o11, true);
        } else {
            if (comparator == oooO00o && !(k instanceof Comparable)) {
                throw new ClassCastException(k.getClass().getName().concat(" is not Comparable"));
            }
            oooO0o = new OooO0o<>(oooO0o7, k, i2, oooO0o10, oooO0o10.f111806OooOoOO);
            oooO0oArr[length] = oooO0o;
        }
        int i3 = this.f111790OooOoO;
        this.f111790OooOoO = i3 + 1;
        if (i3 > this.f111794OooOoo0) {
            OooO0o<K, V>[] oooO0oArr2 = this.f111788OooOo;
            int length2 = oooO0oArr2.length;
            int i4 = length2 * 2;
            OooO0o<K, V>[] oooO0oArr3 = new OooO0o[i4];
            OooO0O0 oooO0O0 = new OooO0O0();
            OooO0O0 oooO0O02 = new OooO0O0();
            int i5 = 0;
            while (i5 < length2) {
                OooO0o<K, V> oooO0o12 = oooO0oArr2[i5];
                if (oooO0o12 == null) {
                    z2 = z3;
                    oooO0o3 = oooO0o8;
                } else {
                    OooO0o<K, V> oooO0o13 = oooO0o8;
                    for (OooO0o<K, V> oooO0o14 = oooO0o12; oooO0o14 != null; oooO0o14 = oooO0o14.f111802OooOo) {
                        oooO0o14.f111803OooOo0o = oooO0o13;
                        oooO0o13 = oooO0o14;
                    }
                    int i6 = 0;
                    int i7 = 0;
                    while (true) {
                        if (oooO0o13 != null) {
                            z2 = z3;
                            OooO0o<K, V> oooO0o15 = oooO0o13.f111803OooOo0o;
                            oooO0o13.f111803OooOo0o = oooO0o8;
                            OooO0o<K, V> oooO0o16 = oooO0o13.f111805OooOoO0;
                            while (true) {
                                OooO0o<K, V> oooO0o17 = oooO0o16;
                                oooO0o2 = oooO0o15;
                                oooO0o15 = oooO0o17;
                                if (oooO0o15 == null) {
                                    break;
                                }
                                oooO0o15.f111803OooOo0o = oooO0o2;
                                oooO0o16 = oooO0o15.f111802OooOo;
                            }
                        } else {
                            OooO0o<K, V> oooO0o18 = oooO0o13;
                            oooO0o13 = oooO0o8;
                            oooO0o2 = oooO0o18;
                            z2 = z3;
                        }
                        if (oooO0o13 == null) {
                            break;
                        }
                        if ((oooO0o13.f111807OooOoo & length2) == 0) {
                            i6++;
                        } else {
                            i7++;
                        }
                        oooO0o13 = oooO0o2;
                        z3 = z2;
                        oooO0o8 = null;
                    }
                    oooO0O0.f111797OooO0O0 = ((Integer.highestOneBit(i6) * 2) - 1) - i6;
                    oooO0O0.f111799OooO0Oo = 0;
                    oooO0O0.f111798OooO0OO = 0;
                    oooO0o3 = null;
                    oooO0O0.f111796OooO00o = null;
                    oooO0O02.f111797OooO0O0 = ((Integer.highestOneBit(i7) * 2) - 1) - i7;
                    oooO0O02.f111799OooO0Oo = 0;
                    oooO0O02.f111798OooO0OO = 0;
                    oooO0O02.f111796OooO00o = null;
                    OooO0o<K, V> oooO0o19 = null;
                    while (oooO0o12 != null) {
                        oooO0o12.f111803OooOo0o = oooO0o19;
                        OooO0o<K, V> oooO0o20 = oooO0o12;
                        oooO0o12 = oooO0o12.f111802OooOo;
                        oooO0o19 = oooO0o20;
                    }
                    while (true) {
                        if (oooO0o19 != null) {
                            OooO0o<K, V> oooO0o21 = oooO0o19.f111803OooOo0o;
                            oooO0o19.f111803OooOo0o = null;
                            OooO0o<K, V> oooO0o22 = oooO0o19.f111805OooOoO0;
                            while (true) {
                                OooO0o<K, V> oooO0o23 = oooO0o22;
                                oooO0o4 = oooO0o21;
                                oooO0o21 = oooO0o23;
                                if (oooO0o21 == null) {
                                    break;
                                }
                                oooO0o21.f111803OooOo0o = oooO0o4;
                                oooO0o22 = oooO0o21.f111802OooOo;
                            }
                        } else {
                            oooO0o4 = oooO0o19;
                            oooO0o19 = null;
                        }
                        if (oooO0o19 == null) {
                            break;
                        }
                        if ((oooO0o19.f111807OooOoo & length2) == 0) {
                            oooO0O0.OooO00o(oooO0o19);
                        } else {
                            oooO0O02.OooO00o(oooO0o19);
                        }
                        oooO0o19 = oooO0o4;
                    }
                    if (i6 > 0) {
                        oooO0o5 = oooO0O0.f111796OooO00o;
                        if (oooO0o5.f111803OooOo0o != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        oooO0o5 = null;
                    }
                    oooO0oArr3[i5] = oooO0o5;
                    int i8 = i5 + length2;
                    if (i7 > 0) {
                        oooO0o6 = oooO0O02.f111796OooO00o;
                        if (oooO0o6.f111803OooOo0o != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        oooO0o6 = null;
                    }
                    oooO0oArr3[i8] = oooO0o6;
                }
                i5++;
                oooO0o8 = oooO0o3;
                z3 = z2;
            }
            this.f111788OooOo = oooO0oArr3;
            this.f111794OooOoo0 = (i4 / 4) + (i4 / 2);
        }
        this.f111792OooOoOO++;
        return oooO0o;
    }

    public final void OooO0O0(OooO0o<K, V> oooO0o, boolean z) {
        while (oooO0o != null) {
            OooO0o<K, V> oooO0o2 = oooO0o.f111802OooOo;
            OooO0o<K, V> oooO0o3 = oooO0o.f111805OooOoO0;
            int i = oooO0o2 != null ? oooO0o2.f111810OooOooo : 0;
            int i2 = oooO0o3 != null ? oooO0o3.f111810OooOooo : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                OooO0o<K, V> oooO0o4 = oooO0o3.f111802OooOo;
                OooO0o<K, V> oooO0o5 = oooO0o3.f111805OooOoO0;
                int i4 = (oooO0o4 != null ? oooO0o4.f111810OooOooo : 0) - (oooO0o5 != null ? oooO0o5.f111810OooOooo : 0);
                if (i4 != -1 && (i4 != 0 || z)) {
                    OooO0oO(oooO0o3);
                }
                OooO0o(oooO0o);
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                OooO0o<K, V> oooO0o6 = oooO0o2.f111802OooOo;
                OooO0o<K, V> oooO0o7 = oooO0o2.f111805OooOoO0;
                int i5 = (oooO0o6 != null ? oooO0o6.f111810OooOooo : 0) - (oooO0o7 != null ? oooO0o7.f111810OooOooo : 0);
                if (i5 != 1 && (i5 != 0 || z)) {
                    OooO0o(oooO0o2);
                }
                OooO0oO(oooO0o);
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                oooO0o.f111810OooOooo = i + 1;
                if (z) {
                    return;
                }
            } else {
                oooO0o.f111810OooOooo = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            oooO0o = oooO0o.f111803OooOo0o;
        }
    }

    public final void OooO0Oo(OooO0o<K, V> oooO0o, boolean z) {
        OooO0o<K, V> oooO0o2;
        OooO0o<K, V> oooO0o3;
        int i;
        if (z) {
            OooO0o<K, V> oooO0o4 = oooO0o.f111806OooOoOO;
            oooO0o4.f111804OooOoO = oooO0o.f111804OooOoO;
            oooO0o.f111804OooOoO.f111806OooOoOO = oooO0o4;
            oooO0o.f111806OooOoOO = null;
            oooO0o.f111804OooOoO = null;
        }
        OooO0o<K, V> oooO0o5 = oooO0o.f111802OooOo;
        OooO0o<K, V> oooO0o6 = oooO0o.f111805OooOoO0;
        OooO0o<K, V> oooO0o7 = oooO0o.f111803OooOo0o;
        int i2 = 0;
        if (oooO0o5 == null || oooO0o6 == null) {
            if (oooO0o5 != null) {
                OooO0o0(oooO0o, oooO0o5);
                oooO0o.f111802OooOo = null;
            } else if (oooO0o6 != null) {
                OooO0o0(oooO0o, oooO0o6);
                oooO0o.f111805OooOoO0 = null;
            } else {
                OooO0o0(oooO0o, null);
            }
            OooO0O0(oooO0o7, false);
            this.f111790OooOoO--;
            this.f111792OooOoOO++;
            return;
        }
        if (oooO0o5.f111810OooOooo > oooO0o6.f111810OooOooo) {
            OooO0o<K, V> oooO0o8 = oooO0o5.f111805OooOoO0;
            while (true) {
                OooO0o<K, V> oooO0o9 = oooO0o8;
                oooO0o3 = oooO0o5;
                oooO0o5 = oooO0o9;
                if (oooO0o5 == null) {
                    break;
                } else {
                    oooO0o8 = oooO0o5.f111805OooOoO0;
                }
            }
        } else {
            OooO0o<K, V> oooO0o10 = oooO0o6.f111802OooOo;
            while (true) {
                oooO0o2 = oooO0o6;
                oooO0o6 = oooO0o10;
                if (oooO0o6 == null) {
                    break;
                } else {
                    oooO0o10 = oooO0o6.f111802OooOo;
                }
            }
            oooO0o3 = oooO0o2;
        }
        OooO0Oo(oooO0o3, false);
        OooO0o<K, V> oooO0o11 = oooO0o.f111802OooOo;
        if (oooO0o11 != null) {
            i = oooO0o11.f111810OooOooo;
            oooO0o3.f111802OooOo = oooO0o11;
            oooO0o11.f111803OooOo0o = oooO0o3;
            oooO0o.f111802OooOo = null;
        } else {
            i = 0;
        }
        OooO0o<K, V> oooO0o12 = oooO0o.f111805OooOoO0;
        if (oooO0o12 != null) {
            i2 = oooO0o12.f111810OooOooo;
            oooO0o3.f111805OooOoO0 = oooO0o12;
            oooO0o12.f111803OooOo0o = oooO0o3;
            oooO0o.f111805OooOoO0 = null;
        }
        oooO0o3.f111810OooOooo = Math.max(i, i2) + 1;
        OooO0o0(oooO0o, oooO0o3);
    }

    public final void OooO0o(OooO0o<K, V> oooO0o) {
        OooO0o<K, V> oooO0o2 = oooO0o.f111802OooOo;
        OooO0o<K, V> oooO0o3 = oooO0o.f111805OooOoO0;
        OooO0o<K, V> oooO0o4 = oooO0o3.f111802OooOo;
        OooO0o<K, V> oooO0o5 = oooO0o3.f111805OooOoO0;
        oooO0o.f111805OooOoO0 = oooO0o4;
        if (oooO0o4 != null) {
            oooO0o4.f111803OooOo0o = oooO0o;
        }
        OooO0o0(oooO0o, oooO0o3);
        oooO0o3.f111802OooOo = oooO0o;
        oooO0o.f111803OooOo0o = oooO0o3;
        int iMax = Math.max(oooO0o2 != null ? oooO0o2.f111810OooOooo : 0, oooO0o4 != null ? oooO0o4.f111810OooOooo : 0) + 1;
        oooO0o.f111810OooOooo = iMax;
        oooO0o3.f111810OooOooo = Math.max(iMax, oooO0o5 != null ? oooO0o5.f111810OooOooo : 0) + 1;
    }

    public final void OooO0o0(OooO0o<K, V> oooO0o, OooO0o<K, V> oooO0o2) {
        OooO0o<K, V> oooO0o3 = oooO0o.f111803OooOo0o;
        oooO0o.f111803OooOo0o = null;
        if (oooO0o2 != null) {
            oooO0o2.f111803OooOo0o = oooO0o3;
        }
        if (oooO0o3 == null) {
            this.f111788OooOo[oooO0o.f111807OooOoo & (r0.length - 1)] = oooO0o2;
        } else if (oooO0o3.f111802OooOo == oooO0o) {
            oooO0o3.f111802OooOo = oooO0o2;
        } else {
            oooO0o3.f111805OooOoO0 = oooO0o2;
        }
    }

    public final void OooO0oO(OooO0o<K, V> oooO0o) {
        OooO0o<K, V> oooO0o2 = oooO0o.f111802OooOo;
        OooO0o<K, V> oooO0o3 = oooO0o.f111805OooOoO0;
        OooO0o<K, V> oooO0o4 = oooO0o2.f111802OooOo;
        OooO0o<K, V> oooO0o5 = oooO0o2.f111805OooOoO0;
        oooO0o.f111802OooOo = oooO0o5;
        if (oooO0o5 != null) {
            oooO0o5.f111803OooOo0o = oooO0o;
        }
        OooO0o0(oooO0o, oooO0o2);
        oooO0o2.f111805OooOoO0 = oooO0o;
        oooO0o.f111803OooOo0o = oooO0o2;
        int iMax = Math.max(oooO0o3 != null ? oooO0o3.f111810OooOooo : 0, oooO0o5 != null ? oooO0o5.f111810OooOooo : 0) + 1;
        oooO0o.f111810OooOooo = iMax;
        oooO0o2.f111810OooOooo = Math.max(iMax, oooO0o4 != null ? oooO0o4.f111810OooOooo : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.f111788OooOo, (Object) null);
        this.f111790OooOoO = 0;
        this.f111792OooOoOO++;
        OooO0o<K, V> oooO0o = this.f111791OooOoO0;
        OooO0o<K, V> oooO0o2 = oooO0o.f111804OooOoO;
        while (oooO0o2 != oooO0o) {
            OooO0o<K, V> oooO0o3 = oooO0o2.f111804OooOoO;
            oooO0o2.f111806OooOoOO = null;
            oooO0o2.f111804OooOoO = null;
            oooO0o2 = oooO0o3;
        }
        oooO0o.f111806OooOoOO = oooO0o;
        oooO0o.f111804OooOoO = oooO0o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        OooO0o<K, V> oooO0oOooO00o = null;
        if (obj != 0) {
            try {
                oooO0oOooO00o = OooO00o(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return oooO0oOooO00o != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        C31309OooOo0O<K, V>.OooO0OO oooO0OO = this.f111793OooOoo;
        if (oooO0OO != null) {
            return oooO0OO;
        }
        C31309OooOo0O<K, V>.OooO0OO oooO0OO2 = new OooO0OO();
        this.f111793OooOoo = oooO0OO2;
        return oooO0OO2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        OooO0o<K, V> oooO0oOooO00o;
        if (obj != 0) {
            try {
                oooO0oOooO00o = OooO00o(obj, false);
            } catch (ClassCastException unused) {
                oooO0oOooO00o = null;
            }
        } else {
            oooO0oOooO00o = null;
        }
        if (oooO0oOooO00o != null) {
            return oooO0oOooO00o.f111809OooOooO;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        C31309OooOo0O<K, V>.C31310OooO0Oo c31310OooO0Oo = this.f111795OooOooO;
        if (c31310OooO0Oo != null) {
            return c31310OooO0Oo;
        }
        C31309OooOo0O<K, V>.C31310OooO0Oo c31310OooO0Oo2 = new C31310OooO0Oo();
        this.f111795OooOooO = c31310OooO0Oo2;
        return c31310OooO0Oo2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        OooO0o<K, V> oooO0oOooO00o = OooO00o(k, true);
        V v2 = oooO0oOooO00o.f111809OooOooO;
        oooO0oOooO00o.f111809OooOooO = v;
        return v2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        OooO0o<K, V> oooO0oOooO00o;
        if (obj != 0) {
            try {
                oooO0oOooO00o = OooO00o(obj, false);
            } catch (ClassCastException unused) {
                oooO0oOooO00o = null;
            }
        } else {
            oooO0oOooO00o = null;
        }
        if (oooO0oOooO00o != null) {
            OooO0Oo(oooO0oOooO00o, true);
        }
        if (oooO0oOooO00o != null) {
            return oooO0oOooO00o.f111809OooOooO;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f111790OooOoO;
    }

    /* JADX INFO: renamed from: o0oo0o00.OooOo0O$OooO0o */
    public static final class OooO0o<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public OooO0o<K, V> f111802OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public OooO0o<K, V> f111803OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public OooO0o<K, V> f111804OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public OooO0o<K, V> f111805OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public OooO0o<K, V> f111806OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public final int f111807OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final K f111808OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public V f111809OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public int f111810OooOooo;

        public OooO0o() {
            this.f111808OooOoo0 = null;
            this.f111807OooOoo = -1;
            this.f111806OooOoOO = this;
            this.f111804OooOoO = this;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k = this.f111808OooOoo0;
                if (k != null ? k.equals(entry.getKey()) : entry.getKey() == null) {
                    V v = this.f111809OooOooO;
                    if (v == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (v.equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f111808OooOoo0;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f111809OooOooO;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k = this.f111808OooOoo0;
            int iHashCode = k == null ? 0 : k.hashCode();
            V v = this.f111809OooOooO;
            return (v != null ? v.hashCode() : 0) ^ iHashCode;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            V v2 = this.f111809OooOooO;
            this.f111809OooOooO = v;
            return v2;
        }

        public final String toString() {
            return this.f111808OooOoo0 + "=" + this.f111809OooOooO;
        }

        public OooO0o(OooO0o<K, V> oooO0o, K k, int i, OooO0o<K, V> oooO0o2, OooO0o<K, V> oooO0o3) {
            this.f111803OooOo0o = oooO0o;
            this.f111808OooOoo0 = k;
            this.f111807OooOoo = i;
            this.f111810OooOooo = 1;
            this.f111804OooOoO = oooO0o2;
            this.f111806OooOoOO = oooO0o3;
            oooO0o3.f111804OooOoO = this;
            oooO0o2.f111806OooOoOO = this;
        }
    }
}
