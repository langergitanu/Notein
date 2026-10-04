package OoooO0;

import Oooo0oO.o000000O;
import OoooO0.AbstractC21143OooO0O0;
import OoooO00.InterfaceC21151OooO0OO;
import OoooOO0.C21174OooO0OO;
import java.util.Arrays;
import java.util.ListIterator;
import kotlin.jvm.internal.OooOOO0;
import o00OOooo.C25022OooO0O0;

/* JADX INFO: renamed from: OoooO0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21146OooO0o0<E> extends AbstractC21143OooO0O0<E> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Object[] f61357OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Object[] f61358OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final int f61359OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final int f61360OooOoO0;

    public C21146OooO0o0(Object[] objArr, int i, int i2, Object[] objArr2) {
        this.f61358OooOo0o = objArr;
        this.f61357OooOo = objArr2;
        this.f61360OooOoO0 = i;
        this.f61359OooOoO = i2;
        if (OooO0O0() > 32) {
            int length = objArr2.length;
            return;
        }
        o000000O.OooO0O0("Trie-based persistent vector should have at least 33 elements, got " + OooO0O0());
        throw null;
    }

    public static Object[] OooO0Oo(Object[] objArr, int i, int i2, Object obj, C21145OooO0Oo c21145OooO0Oo) {
        Object[] objArrCopyOf;
        int iOooO0oo = C25022OooO0O0.OooO0oo(i2, i);
        if (i == 0) {
            if (iOooO0oo == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                OooOOO0.OooO0o(objArrCopyOf, "copyOf(this, newSize)");
            }
            Oooo.OooO0OO.OooO0oo(objArr, iOooO0oo + 1, objArrCopyOf, iOooO0oo, 31);
            c21145OooO0Oo.f61347OooO00o = objArr[31];
            objArrCopyOf[iOooO0oo] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        OooOOO0.OooO0o(objArrCopyOf2, "copyOf(this, newSize)");
        int i3 = i - 5;
        Object obj2 = objArr[iOooO0oo];
        OooOOO0.OooO0o0(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iOooO0oo] = OooO0Oo((Object[]) obj2, i3, i2, obj, c21145OooO0Oo);
        while (true) {
            iOooO0oo++;
            if (iOooO0oo >= 32 || objArrCopyOf2[iOooO0oo] == null) {
                break;
            }
            Object obj3 = objArr[iOooO0oo];
            OooOOO0.OooO0o0(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf2[iOooO0oo] = OooO0Oo((Object[]) obj3, i3, 0, c21145OooO0Oo.f61347OooO00o, c21145OooO0Oo);
        }
        return objArrCopyOf2;
    }

    public static Object[] OooO0o(Object[] objArr, int i, int i2, C21145OooO0Oo c21145OooO0Oo) {
        Object[] objArrOooO0o;
        int iOooO0oo = C25022OooO0O0.OooO0oo(i2, i);
        if (i == 5) {
            c21145OooO0Oo.f61347OooO00o = objArr[iOooO0oo];
            objArrOooO0o = null;
        } else {
            Object obj = objArr[iOooO0oo];
            OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrOooO0o = OooO0o((Object[]) obj, i - 5, i2, c21145OooO0Oo);
        }
        if (objArrOooO0o == null && iOooO0oo == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        OooOOO0.OooO0o(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[iOooO0oo] = objArrOooO0o;
        return objArrCopyOf;
    }

    public static Object[] OooOO0o(Object[] objArr, int i, int i2, Object obj) {
        int iOooO0oo = C25022OooO0O0.OooO0oo(i2, i);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        OooOOO0.OooO0o(objArrCopyOf, "copyOf(this, newSize)");
        if (i == 0) {
            objArrCopyOf[iOooO0oo] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iOooO0oo];
        OooOOO0.OooO0o0(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf[iOooO0oo] = OooOO0o((Object[]) obj2, i - 5, i2, obj);
        return objArrCopyOf;
    }

    public final Object[] OooO(Object[] objArr, int i, int i2, C21145OooO0Oo c21145OooO0Oo) {
        Object[] objArrCopyOf;
        int iOooO0oo = C25022OooO0O0.OooO0oo(i2, i);
        if (i == 0) {
            if (iOooO0oo == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                OooOOO0.OooO0o(objArrCopyOf, "copyOf(this, newSize)");
            }
            Oooo.OooO0OO.OooO0oo(objArr, iOooO0oo, objArrCopyOf, iOooO0oo + 1, 32);
            objArrCopyOf[31] = c21145OooO0Oo.f61347OooO00o;
            c21145OooO0Oo.f61347OooO00o = objArr[iOooO0oo];
            return objArrCopyOf;
        }
        int iOooO0oo2 = objArr[31] == null ? C25022OooO0O0.OooO0oo(OooOO0O() - 1, i) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        OooOOO0.OooO0o(objArrCopyOf2, "copyOf(this, newSize)");
        int i3 = i - 5;
        int i4 = iOooO0oo + 1;
        if (i4 <= iOooO0oo2) {
            while (true) {
                Object obj = objArrCopyOf2[iOooO0oo2];
                OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrCopyOf2[iOooO0oo2] = OooO((Object[]) obj, i3, 0, c21145OooO0Oo);
                if (iOooO0oo2 == i4) {
                    break;
                }
                iOooO0oo2--;
            }
        }
        Object obj2 = objArrCopyOf2[iOooO0oo];
        OooOOO0.OooO0o0(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iOooO0oo] = OooO((Object[]) obj2, i3, i2, c21145OooO0Oo);
        return objArrCopyOf2;
    }

    @Override // oOo000Oo.AbstractC34419OooO0O0
    public final int OooO0O0() {
        return this.f61360OooOoO0;
    }

    public final C21146OooO0o0 OooO0o0(Object obj, Object[] objArr, int i) {
        int iOooOO0O = OooOO0O();
        int i2 = this.f61360OooOoO0;
        int i3 = i2 - iOooOO0O;
        Object[] objArr2 = this.f61357OooOo;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        OooOOO0.OooO0o(objArrCopyOf, "copyOf(this, newSize)");
        if (i3 < 32) {
            Oooo.OooO0OO.OooO0oo(objArr2, i + 1, objArrCopyOf, i, i3);
            objArrCopyOf[i] = obj;
            return new C21146OooO0o0(objArr, i2 + 1, this.f61359OooOoO, objArrCopyOf);
        }
        Object obj2 = objArr2[31];
        Oooo.OooO0OO.OooO0oo(objArr2, i + 1, objArrCopyOf, i, i3 - 1);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return OooO0oO(objArr, objArrCopyOf, objArr3);
    }

    public final C21146OooO0o0<E> OooO0oO(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.f61360OooOoO0;
        int i2 = i >> 5;
        int i3 = this.f61359OooOoO;
        if (i2 <= (1 << i3)) {
            return new C21146OooO0o0<>(OooO0oo(objArr, objArr2, i3), i + 1, i3, objArr3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i4 = i3 + 5;
        return new C21146OooO0o0<>(OooO0oo(objArr4, objArr2, i4), i + 1, i4, objArr3);
    }

    public final Object[] OooO0oo(Object[] objArr, Object[] objArr2, int i) {
        Object[] objArrCopyOf;
        int iOooO0oo = C25022OooO0O0.OooO0oo(OooO0O0() - 1, i);
        if (objArr != null) {
            objArrCopyOf = Arrays.copyOf(objArr, 32);
            OooOOO0.OooO0o(objArrCopyOf, "copyOf(this, newSize)");
        } else {
            objArrCopyOf = new Object[32];
        }
        if (i == 5) {
            objArrCopyOf[iOooO0oo] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iOooO0oo] = OooO0oo((Object[]) objArrCopyOf[iOooO0oo], objArr2, i - 5);
        return objArrCopyOf;
    }

    public final AbstractC21143OooO0O0 OooOO0(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.f61360OooOoO0 - i;
        if (i4 != 1) {
            Object[] objArr2 = this.f61357OooOo;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            OooOOO0.OooO0o(objArrCopyOf, "copyOf(this, newSize)");
            int i5 = i4 - 1;
            if (i3 < i5) {
                Oooo.OooO0OO.OooO0oo(objArr2, i3, objArrCopyOf, i3 + 1, i4);
            }
            objArrCopyOf[i5] = null;
            return new C21146OooO0o0(objArr, (i + i4) - 1, i2, objArrCopyOf);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                OooOOO0.OooO0o(objArr, "copyOf(this, newSize)");
            }
            return new OooOO0(objArr);
        }
        C21145OooO0Oo c21145OooO0Oo = new C21145OooO0Oo(null);
        Object[] objArrOooO0o = OooO0o(objArr, i2, i - 1, c21145OooO0Oo);
        OooOOO0.OooO0Oo(objArrOooO0o);
        Object obj = c21145OooO0Oo.f61347OooO00o;
        OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr3 = (Object[]) obj;
        if (objArrOooO0o[1] != null) {
            return new C21146OooO0o0(objArrOooO0o, i, i2, objArr3);
        }
        Object obj2 = objArrOooO0o[0];
        OooOOO0.OooO0o0(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return new C21146OooO0o0((Object[]) obj2, i, i2 - 5, objArr3);
    }

    public final int OooOO0O() {
        return (this.f61360OooOoO0 - 1) & (-32);
    }

    @Override // java.util.Collection, java.util.List, OoooO00.InterfaceC21151OooO0OO
    public final InterfaceC21151OooO0OO<E> add(E e) {
        int iOooOO0O = OooOO0O();
        int i = this.f61360OooOoO0;
        int i2 = i - iOooOO0O;
        Object[] objArr = this.f61358OooOo0o;
        Object[] objArr2 = this.f61357OooOo;
        if (i2 >= 32) {
            Object[] objArr3 = new Object[32];
            objArr3[0] = e;
            return OooO0oO(objArr, objArr2, objArr3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        OooOOO0.OooO0o(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[i2] = e;
        return new C21146OooO0o0(objArr, i + 1, this.f61359OooOoO, objArrCopyOf);
    }

    @Override // OoooO00.InterfaceC21151OooO0OO
    public final OooO0o builder() {
        return new OooO0o(this, this.f61358OooOo0o, this.f61357OooOo, this.f61359OooOoO);
    }

    @Override // java.util.List
    public final E get(int i) {
        Object[] objArr;
        C21174OooO0OO.OooO00o(i, OooO0O0());
        if (OooOO0O() <= i) {
            objArr = this.f61357OooOo;
        } else {
            objArr = this.f61358OooOo0o;
            for (int i2 = this.f61359OooOoO; i2 > 0; i2 -= 5) {
                Object obj = objArr[C25022OooO0O0.OooO0oo(i, i2)];
                OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return (E) objArr[i & 31];
    }

    @Override // oOo000Oo.AbstractC34421OooO0Oo, java.util.List
    public final ListIterator<E> listIterator(int i) {
        C21174OooO0OO.OooO0O0(i, this.f61360OooOoO0);
        return new C21147OooO0oO(this.f61358OooOo0o, i, this.f61357OooOo, this.f61360OooOoO0, (this.f61359OooOoO / 5) + 1);
    }

    @Override // OoooO00.InterfaceC21151OooO0OO
    public final InterfaceC21151OooO0OO o00Oo0(AbstractC21143OooO0O0.OooO00o oooO00o) {
        OooO0o oooO0o = new OooO0o(this, this.f61358OooOo0o, this.f61357OooOo, this.f61359OooOoO);
        oooO0o.OooOoo0(oooO00o);
        return oooO0o.OooO0o0();
    }

    @Override // OoooO00.InterfaceC21151OooO0OO
    public final InterfaceC21151OooO0OO<E> removeAt(int i) {
        C21174OooO0OO.OooO00o(i, this.f61360OooOoO0);
        int iOooOO0O = OooOO0O();
        Object[] objArr = this.f61358OooOo0o;
        int i2 = this.f61359OooOoO;
        return i >= iOooOO0O ? OooOO0(objArr, iOooOO0O, i2, i - iOooOO0O) : OooOO0(OooO(objArr, i2, i, new C21145OooO0Oo(this.f61357OooOo[0])), iOooOO0O, i2, 0);
    }

    @Override // oOo000Oo.AbstractC34421OooO0Oo, java.util.List, OoooO00.InterfaceC21151OooO0OO
    public final InterfaceC21151OooO0OO<E> set(int i, E e) {
        int i2 = this.f61360OooOoO0;
        C21174OooO0OO.OooO00o(i, i2);
        int iOooOO0O = OooOO0O();
        Object[] objArr = this.f61358OooOo0o;
        Object[] objArr2 = this.f61357OooOo;
        int i3 = this.f61359OooOoO;
        if (iOooOO0O > i) {
            return new C21146OooO0o0(OooOO0o(objArr, i3, i, e), i2, i3, objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        OooOOO0.OooO0o(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[i & 31] = e;
        return new C21146OooO0o0(objArr, i2, i3, objArrCopyOf);
    }

    @Override // java.util.List, OoooO00.InterfaceC21151OooO0OO
    public final InterfaceC21151OooO0OO<E> add(int i, E e) {
        int i2 = this.f61360OooOoO0;
        C21174OooO0OO.OooO0O0(i, i2);
        if (i == i2) {
            return add((Object) e);
        }
        int iOooOO0O = OooOO0O();
        Object[] objArr = this.f61358OooOo0o;
        if (i >= iOooOO0O) {
            return OooO0o0(e, objArr, i - iOooOO0O);
        }
        C21145OooO0Oo c21145OooO0Oo = new C21145OooO0Oo(null);
        return OooO0o0(c21145OooO0Oo.f61347OooO00o, OooO0Oo(objArr, this.f61359OooOoO, i, e, c21145OooO0Oo), 0);
    }
}
