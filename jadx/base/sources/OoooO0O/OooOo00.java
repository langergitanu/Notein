package OoooO0O;

import Oooo0oO.C21082o00000oO;
import Oooo0oO.o000000O;
import OoooO.C21139OooO00o;
import OoooOO0.C21172OooO00o;
import OoooOO0.C21175OooO0Oo;
import java.util.Arrays;
import oO0O00oo.C32519OooO0oO;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo00<K, V> {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final OooOo00 f61407OooO0o0 = new OooOo00(0, 0, new Object[0], null);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f61408OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f61409OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C21175OooO0Oo f61410OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Object[] f61411OooO0Oo;

    public static final class OooO00o<K, V> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public OooOo00<K, V> f61412OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f61413OooO0O0;

        public OooO00o(OooOo00<K, V> oooOo00, int i) {
            this.f61412OooO00o = oooOo00;
            this.f61413OooO0O0 = i;
        }
    }

    public OooOo00(int i, int i2, Object[] objArr, C21175OooO0Oo c21175OooO0Oo) {
        this.f61408OooO00o = i;
        this.f61409OooO0O0 = i2;
        this.f61410OooO0OO = c21175OooO0Oo;
        this.f61411OooO0Oo = objArr;
    }

    public static OooOo00 OooOO0(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, C21175OooO0Oo c21175OooO0Oo) {
        if (i3 > 30) {
            return new OooOo00(0, 0, new Object[]{obj, obj2, obj3, obj4}, c21175OooO0Oo);
        }
        int iOooOO0o = OooOo.OooOO0o(i, i3);
        int iOooOO0o2 = OooOo.OooOO0o(i2, i3);
        if (iOooOO0o != iOooOO0o2) {
            return new OooOo00((1 << iOooOO0o) | (1 << iOooOO0o2), 0, iOooOO0o < iOooOO0o2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, c21175OooO0Oo);
        }
        return new OooOo00(0, 1 << iOooOO0o, new Object[]{OooOO0(i, obj, obj2, i2, obj3, obj4, i3 + 5, c21175OooO0Oo)}, c21175OooO0Oo);
    }

    public final boolean OooO(int i) {
        return (i & this.f61409OooO0O0) != 0;
    }

    public final Object[] OooO00o(int i, int i2, int i3, K k, V v, int i4, C21175OooO0Oo c21175OooO0Oo) {
        Object obj = this.f61411OooO0Oo[i];
        OooOo00 oooOo00OooOO0 = OooOO0(obj != null ? obj.hashCode() : 0, obj, OooOo(i), i3, k, v, i4 + 5, c21175OooO0Oo);
        int iOooOo00 = OooOo00(i2);
        int i5 = iOooOo00 + 1;
        Object[] objArr = this.f61411OooO0Oo;
        Object[] objArr2 = new Object[objArr.length - 1];
        Oooo.OooO0OO.OooOO0(objArr, 0, objArr2, i, 6);
        Oooo.OooO0OO.OooO0oo(objArr, i, objArr2, i + 2, i5);
        objArr2[iOooOo00 - 1] = oooOo00OooOO0;
        Oooo.OooO0OO.OooO0oo(objArr, iOooOo00, objArr2, i5, objArr.length);
        return objArr2;
    }

    public final int OooO0O0() {
        if (this.f61409OooO0O0 == 0) {
            return this.f61411OooO0Oo.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f61408OooO00o);
        int length = this.f61411OooO0Oo.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += OooOOoo(i).OooO0O0();
        }
        return iBitCount;
    }

    public final boolean OooO0OO(K k) {
        C32519OooO0oO c32519OooO0oOOooO0oo = oO0O00oo.OooOO0.OooO0oo(oO0O00oo.OooOO0.OooO(0, this.f61411OooO0Oo.length), 2);
        int i = c32519OooO0oOOooO0oo.f116812OooOo0o;
        int i2 = c32519OooO0oOOooO0oo.f116811OooOo;
        int i3 = c32519OooO0oOOooO0oo.f116813OooOoO0;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!kotlin.jvm.internal.OooOOO0.OooO0O0(k, this.f61411OooO0Oo[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean OooO0Oo(int i, int i2, Object obj) {
        int iOooOO0o = 1 << OooOo.OooOO0o(i, i2);
        if (OooO0oo(iOooOO0o)) {
            return kotlin.jvm.internal.OooOOO0.OooO0O0(obj, this.f61411OooO0Oo[OooO0o(iOooOO0o)]);
        }
        if (!OooO(iOooOO0o)) {
            return false;
        }
        OooOo00<K, V> oooOo00OooOOoo = OooOOoo(OooOo00(iOooOO0o));
        return i2 == 30 ? oooOo00OooOOoo.OooO0OO(obj) : oooOo00OooOOoo.OooO0Oo(i, i2 + 5, obj);
    }

    public final int OooO0o(int i) {
        return Integer.bitCount((i - 1) & this.f61408OooO00o) * 2;
    }

    public final boolean OooO0o0(OooOo00<K, V> oooOo00) {
        if (this == oooOo00) {
            return true;
        }
        if (this.f61409OooO0O0 != oooOo00.f61409OooO0O0 || this.f61408OooO00o != oooOo00.f61408OooO00o) {
            return false;
        }
        int length = this.f61411OooO0Oo.length;
        for (int i = 0; i < length; i++) {
            if (this.f61411OooO0Oo[i] != oooOo00.f61411OooO0Oo[i]) {
                return false;
            }
        }
        return true;
    }

    public final Object OooO0oO(int i, int i2, Object obj) {
        int iOooOO0o = 1 << OooOo.OooOO0o(i, i2);
        if (OooO0oo(iOooOO0o)) {
            int iOooO0o = OooO0o(iOooOO0o);
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(obj, this.f61411OooO0Oo[iOooO0o])) {
                return OooOo(iOooO0o);
            }
            return null;
        }
        if (!OooO(iOooOO0o)) {
            return null;
        }
        OooOo00<K, V> oooOo00OooOOoo = OooOOoo(OooOo00(iOooOO0o));
        if (i2 != 30) {
            return oooOo00OooOOoo.OooO0oO(i, i2 + 5, obj);
        }
        C32519OooO0oO c32519OooO0oOOooO0oo = oO0O00oo.OooOO0.OooO0oo(oO0O00oo.OooOO0.OooO(0, oooOo00OooOOoo.f61411OooO0Oo.length), 2);
        int i3 = c32519OooO0oOOooO0oo.f116812OooOo0o;
        int i4 = c32519OooO0oOOooO0oo.f116811OooOo;
        int i5 = c32519OooO0oOOooO0oo.f116813OooOoO0;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!kotlin.jvm.internal.OooOOO0.OooO0O0(obj, oooOo00OooOOoo.f61411OooO0Oo[i3])) {
            if (i3 == i4) {
                return null;
            }
            i3 += i5;
        }
        return oooOo00OooOOoo.OooOo(i3);
    }

    public final boolean OooO0oo(int i) {
        return (i & this.f61408OooO00o) != 0;
    }

    public final OooOo00<K, V> OooOO0O(int i, C21158OooO0o<K, V> c21158OooO0o) {
        c21158OooO0o.OooO0O0(c21158OooO0o.f61388OooOoo0 - 1);
        c21158OooO0o.f61385OooOoO = OooOo(i);
        Object[] objArr = this.f61411OooO0Oo;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f61410OooO0OO != c21158OooO0o.f61383OooOo) {
            return new OooOo00<>(0, 0, OooOo.OooO0oo(i, objArr), c21158OooO0o.f61383OooOo);
        }
        this.f61411OooO0Oo = OooOo.OooO0oo(i, objArr);
        return this;
    }

    public final OooOo00<K, V> OooOO0o(int i, K k, V v, int i2, C21158OooO0o<K, V> c21158OooO0o) {
        C21158OooO0o<K, V> c21158OooO0o2;
        OooOo00<K, V> oooOo00OooOO0o;
        int iOooOO0o = 1 << OooOo.OooOO0o(i, i2);
        boolean zOooO0oo = OooO0oo(iOooOO0o);
        C21175OooO0Oo c21175OooO0Oo = this.f61410OooO0OO;
        if (zOooO0oo) {
            int iOooO0o = OooO0o(iOooOO0o);
            if (!kotlin.jvm.internal.OooOOO0.OooO0O0(k, this.f61411OooO0Oo[iOooO0o])) {
                c21158OooO0o.OooO0O0(c21158OooO0o.f61388OooOoo0 + 1);
                C21175OooO0Oo c21175OooO0Oo2 = c21158OooO0o.f61383OooOo;
                if (c21175OooO0Oo != c21175OooO0Oo2) {
                    return new OooOo00<>(this.f61408OooO00o ^ iOooOO0o, this.f61409OooO0O0 | iOooOO0o, OooO00o(iOooO0o, iOooOO0o, i, k, v, i2, c21175OooO0Oo2), c21175OooO0Oo2);
                }
                this.f61411OooO0Oo = OooO00o(iOooO0o, iOooOO0o, i, k, v, i2, c21175OooO0Oo2);
                this.f61408OooO00o ^= iOooOO0o;
                this.f61409OooO0O0 |= iOooOO0o;
                return this;
            }
            c21158OooO0o.f61385OooOoO = OooOo(iOooO0o);
            if (OooOo(iOooO0o) == v) {
                return this;
            }
            if (c21175OooO0Oo == c21158OooO0o.f61383OooOo) {
                this.f61411OooO0Oo[iOooO0o + 1] = v;
                return this;
            }
            c21158OooO0o.f61387OooOoOO++;
            Object[] objArr = this.f61411OooO0Oo;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            kotlin.jvm.internal.OooOOO0.OooO0o(objArrCopyOf, "copyOf(this, size)");
            objArrCopyOf[iOooO0o + 1] = v;
            return new OooOo00<>(this.f61408OooO00o, this.f61409OooO0O0, objArrCopyOf, c21158OooO0o.f61383OooOo);
        }
        if (!OooO(iOooOO0o)) {
            c21158OooO0o.OooO0O0(c21158OooO0o.f61388OooOoo0 + 1);
            C21175OooO0Oo c21175OooO0Oo3 = c21158OooO0o.f61383OooOo;
            int iOooO0o2 = OooO0o(iOooOO0o);
            if (c21175OooO0Oo != c21175OooO0Oo3) {
                return new OooOo00<>(this.f61408OooO00o | iOooOO0o, this.f61409OooO0O0, OooOo.OooO0oO(iOooO0o2, k, v, this.f61411OooO0Oo), c21175OooO0Oo3);
            }
            this.f61411OooO0Oo = OooOo.OooO0oO(iOooO0o2, k, v, this.f61411OooO0Oo);
            this.f61408OooO00o |= iOooOO0o;
            return this;
        }
        int iOooOo00 = OooOo00(iOooOO0o);
        OooOo00<K, V> oooOo00OooOOoo = OooOOoo(iOooOo00);
        if (i2 == 30) {
            C32519OooO0oO c32519OooO0oOOooO0oo = oO0O00oo.OooOO0.OooO0oo(oO0O00oo.OooOO0.OooO(0, oooOo00OooOOoo.f61411OooO0Oo.length), 2);
            int i3 = c32519OooO0oOOooO0oo.f116812OooOo0o;
            int i4 = c32519OooO0oOOooO0oo.f116811OooOo;
            int i5 = c32519OooO0oOOooO0oo.f116813OooOoO0;
            if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                c21158OooO0o.OooO0O0(c21158OooO0o.f61388OooOoo0 + 1);
                oooOo00OooOO0o = new OooOo00<>(0, 0, OooOo.OooO0oO(0, k, v, oooOo00OooOOoo.f61411OooO0Oo), c21158OooO0o.f61383OooOo);
                c21158OooO0o2 = c21158OooO0o;
            } else {
                while (!kotlin.jvm.internal.OooOOO0.OooO0O0(k, oooOo00OooOOoo.f61411OooO0Oo[i3])) {
                    if (i3 == i4) {
                        c21158OooO0o.OooO0O0(c21158OooO0o.f61388OooOoo0 + 1);
                        oooOo00OooOO0o = new OooOo00<>(0, 0, OooOo.OooO0oO(0, k, v, oooOo00OooOOoo.f61411OooO0Oo), c21158OooO0o.f61383OooOo);
                        break;
                    }
                    i3 += i5;
                }
                c21158OooO0o.f61385OooOoO = oooOo00OooOOoo.OooOo(i3);
                if (oooOo00OooOOoo.f61410OooO0OO == c21158OooO0o.f61383OooOo) {
                    oooOo00OooOOoo.f61411OooO0Oo[i3 + 1] = v;
                    oooOo00OooOO0o = oooOo00OooOOoo;
                } else {
                    c21158OooO0o.f61387OooOoOO++;
                    Object[] objArr2 = oooOo00OooOOoo.f61411OooO0Oo;
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                    kotlin.jvm.internal.OooOOO0.OooO0o(objArrCopyOf2, "copyOf(this, size)");
                    objArrCopyOf2[i3 + 1] = v;
                    oooOo00OooOO0o = new OooOo00<>(0, 0, objArrCopyOf2, c21158OooO0o.f61383OooOo);
                }
                c21158OooO0o2 = c21158OooO0o;
            }
        } else {
            c21158OooO0o2 = c21158OooO0o;
            oooOo00OooOO0o = oooOo00OooOOoo.OooOO0o(i, k, v, i2 + 5, c21158OooO0o2);
        }
        return oooOo00OooOOoo == oooOo00OooOO0o ? this : OooOOo(iOooOo00, oooOo00OooOO0o, c21158OooO0o2.f61383OooOo);
    }

    public final OooOo00<K, V> OooOOO(int i, K k, int i2, C21158OooO0o<K, V> c21158OooO0o) {
        OooOo00<K, V> oooOo00OooOOO;
        int iOooOO0o = 1 << OooOo.OooOO0o(i, i2);
        if (OooO0oo(iOooOO0o)) {
            int iOooO0o = OooO0o(iOooOO0o);
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(k, this.f61411OooO0Oo[iOooO0o])) {
                return OooOOOo(iOooO0o, iOooOO0o, c21158OooO0o);
            }
        } else if (OooO(iOooOO0o)) {
            int iOooOo00 = OooOo00(iOooOO0o);
            OooOo00<K, V> oooOo00OooOOoo = OooOOoo(iOooOo00);
            if (i2 == 30) {
                C32519OooO0oO c32519OooO0oOOooO0oo = oO0O00oo.OooOO0.OooO0oo(oO0O00oo.OooOO0.OooO(0, oooOo00OooOOoo.f61411OooO0Oo.length), 2);
                int i3 = c32519OooO0oOOooO0oo.f116812OooOo0o;
                int i4 = c32519OooO0oOOooO0oo.f116811OooOo;
                int i5 = c32519OooO0oOOooO0oo.f116813OooOoO0;
                if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                    oooOo00OooOOO = oooOo00OooOOoo;
                    break;
                }
                while (!kotlin.jvm.internal.OooOOO0.OooO0O0(k, oooOo00OooOOoo.f61411OooO0Oo[i3])) {
                    if (i3 == i4) {
                        oooOo00OooOOO = oooOo00OooOOoo;
                        break;
                    }
                    i3 += i5;
                }
                oooOo00OooOOO = oooOo00OooOOoo.OooOO0O(i3, c21158OooO0o);
            } else {
                oooOo00OooOOO = oooOo00OooOOoo.OooOOO(i, k, i2 + 5, c21158OooO0o);
            }
            return OooOOo0(oooOo00OooOOoo, oooOo00OooOOO, iOooOo00, iOooOO0o, c21158OooO0o.f61383OooOo);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final OooOo00<K, V> OooOOO0(OooOo00<K, V> oooOo00, int i, C21172OooO00o c21172OooO00o, C21158OooO0o<K, V> c21158OooO0o) {
        int i2;
        Object[] objArr;
        int i3;
        Object objOooOO0;
        if (this == oooOo00) {
            c21172OooO00o.f61415OooO00o += OooO0O0();
            return this;
        }
        int i4 = 1;
        int i5 = 0;
        if (i > 30) {
            C21175OooO0Oo c21175OooO0Oo = c21158OooO0o.f61383OooOo;
            int i6 = oooOo00.f61409OooO0O0;
            Object[] objArr2 = this.f61411OooO0Oo;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + oooOo00.f61411OooO0Oo.length);
            kotlin.jvm.internal.OooOOO0.OooO0o(objArrCopyOf, "copyOf(this, newSize)");
            int length = this.f61411OooO0Oo.length;
            C32519OooO0oO c32519OooO0oOOooO0oo = oO0O00oo.OooOO0.OooO0oo(oO0O00oo.OooOO0.OooO(0, oooOo00.f61411OooO0Oo.length), 2);
            int i7 = c32519OooO0oOOooO0oo.f116812OooOo0o;
            int i8 = c32519OooO0oOOooO0oo.f116811OooOo;
            int i9 = c32519OooO0oOOooO0oo.f116813OooOoO0;
            if ((i9 > 0 && i7 <= i8) || (i9 < 0 && i8 <= i7)) {
                while (true) {
                    if (OooO0OO(oooOo00.f61411OooO0Oo[i7])) {
                        c21172OooO00o.f61415OooO00o++;
                    } else {
                        Object[] objArr3 = oooOo00.f61411OooO0Oo;
                        objArrCopyOf[length] = objArr3[i7];
                        objArrCopyOf[length + 1] = objArr3[i7 + 1];
                        length += 2;
                    }
                    if (i7 == i8) {
                        break;
                    }
                    i7 += i9;
                }
            }
            if (length != this.f61411OooO0Oo.length) {
                if (length == oooOo00.f61411OooO0Oo.length) {
                    return oooOo00;
                }
                if (length == objArrCopyOf.length) {
                    return new OooOo00<>(0, 0, objArrCopyOf, c21175OooO0Oo);
                }
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
                kotlin.jvm.internal.OooOOO0.OooO0o(objArrCopyOf2, "copyOf(this, newSize)");
                return new OooOo00<>(0, 0, objArrCopyOf2, c21175OooO0Oo);
            }
        } else {
            int i10 = this.f61409OooO0O0 | oooOo00.f61409OooO0O0;
            int i11 = this.f61408OooO00o;
            int i12 = oooOo00.f61408OooO00o;
            int i13 = (i11 ^ i12) & (~i10);
            int i14 = i11 & i12;
            int i15 = i13;
            while (i14 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i14);
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(this.f61411OooO0Oo[OooO0o(iLowestOneBit)], oooOo00.f61411OooO0Oo[oooOo00.OooO0o(iLowestOneBit)])) {
                    i15 |= iLowestOneBit;
                } else {
                    i10 |= iLowestOneBit;
                }
                i14 ^= iLowestOneBit;
            }
            if (!((i10 & i15) == 0)) {
                o000000O.OooO0OO("Check failed.");
                throw null;
            }
            OooOo00<K, V> oooOo002 = (kotlin.jvm.internal.OooOOO0.OooO0O0(this.f61410OooO0OO, c21158OooO0o.f61383OooOo) && this.f61408OooO00o == i15 && this.f61409OooO0O0 == i10) ? this : new OooOo00<>(i15, i10, new Object[Integer.bitCount(i10) + (Integer.bitCount(i15) * 2)], null);
            int i16 = i10;
            int i17 = 0;
            while (i16 != 0) {
                int iLowestOneBit2 = Integer.lowestOneBit(i16);
                Object[] objArr4 = oooOo002.f61411OooO0Oo;
                int length2 = (objArr4.length - i4) - i17;
                if (OooO(iLowestOneBit2)) {
                    OooOo00 oooOo00OooOOoo = OooOOoo(OooOo00(iLowestOneBit2));
                    if (oooOo00.OooO(iLowestOneBit2)) {
                        i2 = iLowestOneBit2;
                        objArr = objArr4;
                        objOooOO0 = oooOo00OooOOoo.OooOOO0(oooOo00.OooOOoo(oooOo00.OooOo00(iLowestOneBit2)), i + 5, c21172OooO00o, c21158OooO0o);
                    } else if (oooOo00.OooO0oo(iLowestOneBit2)) {
                        int iOooO0o = oooOo00.OooO0o(iLowestOneBit2);
                        Object obj = oooOo00.f61411OooO0Oo[iOooO0o];
                        V vOooOo = oooOo00.OooOo(iOooO0o);
                        i3 = i4;
                        int i18 = c21158OooO0o.f61388OooOoo0;
                        int iHashCode = obj != null ? obj.hashCode() : i5;
                        objArr = objArr4;
                        i2 = iLowestOneBit2;
                        objOooOO0 = oooOo00OooOOoo.OooOO0o(iHashCode, obj, vOooOo, i + 5, c21158OooO0o);
                        if (c21158OooO0o.f61388OooOoo0 == i18) {
                            c21172OooO00o.f61415OooO00o++;
                        }
                    } else {
                        i2 = iLowestOneBit2;
                        objArr = objArr4;
                        objOooOO0 = oooOo00OooOOoo;
                    }
                    i3 = i4;
                } else {
                    i2 = iLowestOneBit2;
                    objArr = objArr4;
                    i3 = i4;
                    if (oooOo00.OooO(i2)) {
                        OooOo00<K, V> oooOo00OooOOoo2 = oooOo00.OooOOoo(oooOo00.OooOo00(i2));
                        if (OooO0oo(i2)) {
                            int iOooO0o2 = OooO0o(i2);
                            Object obj2 = this.f61411OooO0Oo[iOooO0o2];
                            int i19 = i + 5;
                            if (oooOo00OooOOoo2.OooO0Oo(obj2 != null ? obj2.hashCode() : 0, i19, obj2)) {
                                c21172OooO00o.f61415OooO00o++;
                                objOooOO0 = oooOo00OooOOoo2;
                            } else {
                                objOooOO0 = oooOo00OooOOoo2.OooOO0o(obj2 != null ? obj2.hashCode() : 0, obj2, OooOo(iOooO0o2), i19, c21158OooO0o);
                            }
                        } else {
                            objOooOO0 = oooOo00OooOOoo2;
                        }
                    } else {
                        int iOooO0o3 = OooO0o(i2);
                        Object obj3 = this.f61411OooO0Oo[iOooO0o3];
                        Object objOooOo = OooOo(iOooO0o3);
                        int iOooO0o4 = oooOo00.OooO0o(i2);
                        Object obj4 = oooOo00.f61411OooO0Oo[iOooO0o4];
                        objOooOO0 = OooOO0(obj3 != null ? obj3.hashCode() : 0, obj3, objOooOo, obj4 != null ? obj4.hashCode() : 0, obj4, oooOo00.OooOo(iOooO0o4), i + 5, c21158OooO0o.f61383OooOo);
                    }
                }
                objArr[length2] = objOooOO0;
                i17++;
                i16 ^= i2;
                i4 = i3;
                i5 = 0;
            }
            int i20 = 0;
            while (i15 != 0) {
                int iLowestOneBit3 = Integer.lowestOneBit(i15);
                int i21 = i20 * 2;
                if (oooOo00.OooO0oo(iLowestOneBit3)) {
                    int iOooO0o5 = oooOo00.OooO0o(iLowestOneBit3);
                    Object[] objArr5 = oooOo002.f61411OooO0Oo;
                    objArr5[i21] = oooOo00.f61411OooO0Oo[iOooO0o5];
                    objArr5[i21 + 1] = oooOo00.OooOo(iOooO0o5);
                    if (OooO0oo(iLowestOneBit3)) {
                        c21172OooO00o.f61415OooO00o++;
                    }
                } else {
                    int iOooO0o6 = OooO0o(iLowestOneBit3);
                    Object[] objArr6 = oooOo002.f61411OooO0Oo;
                    objArr6[i21] = this.f61411OooO0Oo[iOooO0o6];
                    objArr6[i21 + 1] = OooOo(iOooO0o6);
                }
                i20++;
                i15 ^= iLowestOneBit3;
            }
            if (!OooO0o0(oooOo002)) {
                return oooOo00.OooO0o0(oooOo002) ? oooOo00 : oooOo002;
            }
        }
        return this;
    }

    public final OooOo00<K, V> OooOOOO(int i, K k, V v, int i2, C21158OooO0o<K, V> c21158OooO0o) {
        OooOo00<K, V> oooOo00;
        OooOo00<K, V> oooOo00OooOOOO;
        int iOooOO0o = 1 << OooOo.OooOO0o(i, i2);
        if (OooO0oo(iOooOO0o)) {
            int iOooO0o = OooO0o(iOooOO0o);
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(k, this.f61411OooO0Oo[iOooO0o]) && kotlin.jvm.internal.OooOOO0.OooO0O0(v, OooOo(iOooO0o))) {
                return OooOOOo(iOooO0o, iOooOO0o, c21158OooO0o);
            }
        } else if (OooO(iOooOO0o)) {
            int iOooOo00 = OooOo00(iOooOO0o);
            OooOo00<K, V> oooOo00OooOOoo = OooOOoo(iOooOo00);
            if (i2 == 30) {
                C32519OooO0oO c32519OooO0oOOooO0oo = oO0O00oo.OooOO0.OooO0oo(oO0O00oo.OooOO0.OooO(0, oooOo00OooOOoo.f61411OooO0Oo.length), 2);
                int i3 = c32519OooO0oOOooO0oo.f116812OooOo0o;
                int i4 = c32519OooO0oOOooO0oo.f116811OooOo;
                int i5 = c32519OooO0oOOooO0oo.f116813OooOoO0;
                if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                    oooOo00OooOOOO = oooOo00OooOOoo;
                    oooOo00 = oooOo00OooOOoo;
                } else {
                    while (true) {
                        if (!kotlin.jvm.internal.OooOOO0.OooO0O0(k, oooOo00OooOOoo.f61411OooO0Oo[i3]) || !kotlin.jvm.internal.OooOOO0.OooO0O0(v, oooOo00OooOOoo.OooOo(i3))) {
                            if (i3 == i4) {
                                break;
                            }
                            i3 += i5;
                        } else {
                            oooOo00OooOOOO = oooOo00OooOOoo.OooOO0O(i3, c21158OooO0o);
                            break;
                        }
                    }
                    oooOo00OooOOOO = oooOo00OooOOoo;
                    oooOo00 = oooOo00OooOOoo;
                }
            } else {
                oooOo00 = oooOo00OooOOoo;
                oooOo00OooOOOO = oooOo00.OooOOOO(i, k, v, i2 + 5, c21158OooO0o);
            }
            return OooOOo0(oooOo00, oooOo00OooOOOO, iOooOo00, iOooOO0o, c21158OooO0o.f61383OooOo);
        }
        return this;
    }

    public final OooOo00<K, V> OooOOOo(int i, int i2, C21158OooO0o<K, V> c21158OooO0o) {
        c21158OooO0o.OooO0O0(c21158OooO0o.f61388OooOoo0 - 1);
        c21158OooO0o.f61385OooOoO = OooOo(i);
        Object[] objArr = this.f61411OooO0Oo;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f61410OooO0OO != c21158OooO0o.f61383OooOo) {
            return new OooOo00<>(i2 ^ this.f61408OooO00o, this.f61409OooO0O0, OooOo.OooO0oo(i, objArr), c21158OooO0o.f61383OooOo);
        }
        this.f61411OooO0Oo = OooOo.OooO0oo(i, objArr);
        this.f61408OooO00o ^= i2;
        return this;
    }

    public final OooOo00<K, V> OooOOo(int i, OooOo00<K, V> oooOo00, C21175OooO0Oo c21175OooO0Oo) {
        Object[] objArr = this.f61411OooO0Oo;
        if (objArr.length == 1 && oooOo00.f61411OooO0Oo.length == 2 && oooOo00.f61409OooO0O0 == 0) {
            oooOo00.f61408OooO00o = this.f61409OooO0O0;
            return oooOo00;
        }
        if (this.f61410OooO0OO == c21175OooO0Oo) {
            objArr[i] = oooOo00;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        kotlin.jvm.internal.OooOOO0.OooO0o(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i] = oooOo00;
        return new OooOo00<>(this.f61408OooO00o, this.f61409OooO0O0, objArrCopyOf, c21175OooO0Oo);
    }

    public final OooOo00<K, V> OooOOo0(OooOo00<K, V> oooOo00, OooOo00<K, V> oooOo002, int i, int i2, C21175OooO0Oo c21175OooO0Oo) {
        C21175OooO0Oo c21175OooO0Oo2 = this.f61410OooO0OO;
        if (oooOo002 != null) {
            return (c21175OooO0Oo2 == c21175OooO0Oo || oooOo00 != oooOo002) ? OooOOo(i, oooOo002, c21175OooO0Oo) : this;
        }
        Object[] objArr = this.f61411OooO0Oo;
        if (objArr.length == 1) {
            return null;
        }
        if (c21175OooO0Oo2 != c21175OooO0Oo) {
            return new OooOo00<>(this.f61408OooO00o, i2 ^ this.f61409OooO0O0, OooOo.OooO(i, objArr), c21175OooO0Oo);
        }
        this.f61411OooO0Oo = OooOo.OooO(i, objArr);
        this.f61409OooO0O0 ^= i2;
        return this;
    }

    public final OooOo00<K, V> OooOOoo(int i) {
        Object obj = this.f61411OooO0Oo[i];
        kotlin.jvm.internal.OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (OooOo00) obj;
    }

    public final V OooOo(int i) {
        return (V) this.f61411OooO0Oo[i + 1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d1, code lost:
    
        if (r14 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00da, code lost:
    
        if (r14 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dd, code lost:
    
        r14.f61412OooO00o = OooOo0o(r12, r4, r14.f61412OooO00o);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e5, code lost:
    
        return r14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final OooO00o OooOo0(int i, Object obj, C21139OooO00o c21139OooO00o, int i2) {
        OooO00o oooO00oOooOo0;
        int iOooOO0o = 1 << OooOo.OooOO0o(i, i2);
        if (OooO0oo(iOooOO0o)) {
            int iOooO0o = OooO0o(iOooOO0o);
            if (!kotlin.jvm.internal.OooOOO0.OooO0O0(obj, this.f61411OooO0Oo[iOooO0o])) {
                return new OooO00o(new OooOo00(this.f61408OooO00o ^ iOooOO0o, this.f61409OooO0O0 | iOooOO0o, OooO00o(iOooO0o, iOooOO0o, i, obj, c21139OooO00o, i2, null), null), 1);
            }
            if (OooOo(iOooO0o) != c21139OooO00o) {
                Object[] objArr = this.f61411OooO0Oo;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                kotlin.jvm.internal.OooOOO0.OooO0o(objArrCopyOf, "copyOf(this, size)");
                objArrCopyOf[iOooO0o + 1] = c21139OooO00o;
                return new OooO00o(new OooOo00(this.f61408OooO00o, this.f61409OooO0O0, objArrCopyOf, null), 0);
            }
        } else {
            if (!OooO(iOooOO0o)) {
                return new OooO00o(new OooOo00(this.f61408OooO00o | iOooOO0o, this.f61409OooO0O0, OooOo.OooO0oO(OooO0o(iOooOO0o), obj, c21139OooO00o, this.f61411OooO0Oo), null), 1);
            }
            int iOooOo00 = OooOo00(iOooOO0o);
            OooOo00<K, V> oooOo00OooOOoo = OooOOoo(iOooOo00);
            if (i2 == 30) {
                C32519OooO0oO c32519OooO0oOOooO0oo = oO0O00oo.OooOO0.OooO0oo(oO0O00oo.OooOO0.OooO(0, oooOo00OooOOoo.f61411OooO0Oo.length), 2);
                int i3 = c32519OooO0oOOooO0oo.f116812OooOo0o;
                int i4 = c32519OooO0oOOooO0oo.f116811OooOo;
                int i5 = c32519OooO0oOOooO0oo.f116813OooOoO0;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!kotlin.jvm.internal.OooOOO0.OooO0O0(obj, oooOo00OooOOoo.f61411OooO0Oo[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    if (c21139OooO00o == oooOo00OooOOoo.OooOo(i3)) {
                        oooO00oOooOo0 = null;
                    } else {
                        Object[] objArr2 = oooOo00OooOOoo.f61411OooO0Oo;
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        kotlin.jvm.internal.OooOOO0.OooO0o(objArrCopyOf2, "copyOf(this, size)");
                        objArrCopyOf2[i3 + 1] = c21139OooO00o;
                        oooO00oOooOo0 = new OooO00o(new OooOo00(0, 0, objArrCopyOf2, null), 0);
                    }
                }
                oooO00oOooOo0 = new OooO00o(new OooOo00(0, 0, OooOo.OooO0oO(0, obj, c21139OooO00o, oooOo00OooOOoo.f61411OooO0Oo), null), 1);
                break;
            }
            oooO00oOooOo0 = oooOo00OooOOoo.OooOo0(i, obj, c21139OooO00o, i2 + 5);
        }
        return null;
    }

    public final int OooOo00(int i) {
        return (this.f61411OooO0Oo.length - 1) - Integer.bitCount((i - 1) & this.f61409OooO0O0);
    }

    public final OooOo00 OooOo0O(int i, C21082o00000oO.OooO0OO oooO0OO, int i2) {
        OooOo00<K, V> oooOo00OooOo0O;
        int iOooOO0o = 1 << OooOo.OooOO0o(i, i2);
        if (OooO0oo(iOooOO0o)) {
            int iOooO0o = OooO0o(iOooOO0o);
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(oooO0OO, this.f61411OooO0Oo[iOooO0o])) {
                Object[] objArr = this.f61411OooO0Oo;
                if (objArr.length != 2) {
                    return new OooOo00(this.f61408OooO00o ^ iOooOO0o, this.f61409OooO0O0, OooOo.OooO0oo(iOooO0o, objArr), null);
                }
                return null;
            }
            return this;
        }
        if (OooO(iOooOO0o)) {
            int iOooOo00 = OooOo00(iOooOO0o);
            OooOo00<K, V> oooOo00OooOOoo = OooOOoo(iOooOo00);
            if (i2 == 30) {
                C32519OooO0oO c32519OooO0oOOooO0oo = oO0O00oo.OooOO0.OooO0oo(oO0O00oo.OooOO0.OooO(0, oooOo00OooOOoo.f61411OooO0Oo.length), 2);
                int i3 = c32519OooO0oOOooO0oo.f116812OooOo0o;
                int i4 = c32519OooO0oOOooO0oo.f116811OooOo;
                int i5 = c32519OooO0oOOooO0oo.f116813OooOoO0;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!kotlin.jvm.internal.OooOOO0.OooO0O0(oooO0OO, oooOo00OooOOoo.f61411OooO0Oo[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    Object[] objArr2 = oooOo00OooOOoo.f61411OooO0Oo;
                    oooOo00OooOo0O = objArr2.length == 2 ? null : new OooOo00<>(0, 0, OooOo.OooO0oo(i3, objArr2), null);
                }
                oooOo00OooOo0O = oooOo00OooOOoo;
                break;
            }
            oooOo00OooOo0O = oooOo00OooOOoo.OooOo0O(i, oooO0OO, i2 + 5);
            if (oooOo00OooOo0O == null) {
                Object[] objArr3 = this.f61411OooO0Oo;
                if (objArr3.length != 1) {
                    return new OooOo00(this.f61408OooO00o, iOooOO0o ^ this.f61409OooO0O0, OooOo.OooO(iOooOo00, objArr3), null);
                }
                return null;
            }
            if (oooOo00OooOOoo != oooOo00OooOo0O) {
                return OooOo0o(iOooOo00, iOooOO0o, oooOo00OooOo0O);
            }
        }
        return this;
    }

    public final OooOo00<K, V> OooOo0o(int i, int i2, OooOo00<K, V> oooOo00) {
        Object[] objArr = oooOo00.f61411OooO0Oo;
        if (objArr.length != 2 || oooOo00.f61409OooO0O0 != 0) {
            Object[] objArr2 = this.f61411OooO0Oo;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            kotlin.jvm.internal.OooOOO0.OooO0o(objArrCopyOf, "copyOf(this, newSize)");
            objArrCopyOf[i] = oooOo00;
            return new OooOo00<>(this.f61408OooO00o, this.f61409OooO0O0, objArrCopyOf, null);
        }
        if (this.f61411OooO0Oo.length == 1) {
            oooOo00.f61408OooO00o = this.f61409OooO0O0;
            return oooOo00;
        }
        int iOooO0o = OooO0o(i2);
        Object[] objArr3 = this.f61411OooO0Oo;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        kotlin.jvm.internal.OooOOO0.OooO0o(objArrCopyOf2, "copyOf(this, newSize)");
        Oooo.OooO0OO.OooO0oo(objArrCopyOf2, i + 2, objArrCopyOf2, i + 1, objArr3.length);
        Oooo.OooO0OO.OooO0oo(objArrCopyOf2, iOooO0o + 2, objArrCopyOf2, iOooO0o, i);
        objArrCopyOf2[iOooO0o] = obj;
        objArrCopyOf2[iOooO0o + 1] = obj2;
        return new OooOo00<>(this.f61408OooO00o ^ i2, i2 ^ this.f61409OooO0O0, objArrCopyOf2, null);
    }
}
