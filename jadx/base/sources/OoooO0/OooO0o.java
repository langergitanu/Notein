package OoooO0;

import Oooo0oO.o000000O;
import OoooO00.InterfaceC21151OooO0OO;
import OoooOO0.C21174OooO0OO;
import OoooOO0.C21175OooO0Oo;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o00OOooo.C25022OooO0O0;
import oO0O000o.InterfaceC32507OooOO0o;
import oOo000Oo.AbstractC34424OooO0oO;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o<E> extends AbstractC34424OooO0oO<E> implements Collection, oO0O00.OooO0O0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object[] f61348OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public InterfaceC21151OooO0OO<? extends E> f61349OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f61350OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Object[] f61351OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public C21175OooO0Oo f61352OooOoOO = new C21175OooO0Oo();

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public Object[] f61353OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public Object[] f61354OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f61355OooOooO;

    public static final class OooO00o extends OooOOOO implements InterfaceC32507OooOO0o<E, Boolean> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Collection<E> f61356OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(Collection<? extends E> collection) {
            super(1);
            this.f61356OooOo0o = collection;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(this.f61356OooOo0o.contains(obj));
        }
    }

    public OooO0o(AbstractC21143OooO0O0 abstractC21143OooO0O0, Object[] objArr, Object[] objArr2, int i) {
        this.f61349OooOo0o = abstractC21143OooO0O0;
        this.f61348OooOo = objArr;
        this.f61351OooOoO0 = objArr2;
        this.f61350OooOoO = i;
        this.f61354OooOoo0 = objArr;
        this.f61353OooOoo = objArr2;
        this.f61355OooOooO = abstractC21143OooO0O0.OooO0O0();
    }

    public static void OooO0o(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final Object[] OooO(Object[] objArr, int i, int i2, Object obj, C21145OooO0Oo c21145OooO0Oo) {
        Object obj2;
        int iOooO0oo = C25022OooO0O0.OooO0oo(i2, i);
        if (i == 0) {
            c21145OooO0Oo.f61347OooO00o = objArr[31];
            Object[] objArrOooOOO = OooOOO(objArr);
            Oooo.OooO0OO.OooO0oo(objArr, iOooO0oo + 1, objArrOooOOO, iOooO0oo, 31);
            objArrOooOOO[iOooO0oo] = obj;
            return objArrOooOOO;
        }
        Object[] objArrOooOOO2 = OooOOO(objArr);
        int i3 = i - 5;
        Object obj3 = objArrOooOOO2[iOooO0oo];
        OooOOO0.OooO0o0(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrOooOOO2[iOooO0oo] = OooO((Object[]) obj3, i3, i2, obj, c21145OooO0Oo);
        while (true) {
            iOooO0oo++;
            if (iOooO0oo >= 32 || (obj2 = objArrOooOOO2[iOooO0oo]) == null) {
                break;
            }
            objArrOooOOO2[iOooO0oo] = OooO((Object[]) obj2, i3, 0, c21145OooO0Oo.f61347OooO00o, c21145OooO0Oo);
        }
        return objArrOooOOO2;
    }

    @Override // oOo000Oo.AbstractC34424OooO0oO
    public final int OooO0O0() {
        return this.f61355OooOooO;
    }

    @Override // oOo000Oo.AbstractC34424OooO0oO
    public final E OooO0Oo(int i) {
        C21174OooO0OO.OooO00o(i, OooO0O0());
        ((AbstractList) this).modCount++;
        int iOooo00O = Oooo00O();
        if (i >= iOooo00O) {
            return (E) OooOooO(this.f61354OooOoo0, iOooo00O, this.f61350OooOoO, i - iOooo00O);
        }
        C21145OooO0Oo c21145OooO0Oo = new C21145OooO0Oo(this.f61353OooOoo[0]);
        Object[] objArr = this.f61354OooOoo0;
        OooOOO0.OooO0Oo(objArr);
        OooOooO(OooOoo(objArr, this.f61350OooOoO, i, c21145OooO0Oo), iOooo00O, this.f61350OooOoO, 0);
        return (E) c21145OooO0Oo.f61347OooO00o;
    }

    public final InterfaceC21151OooO0OO<E> OooO0o0() {
        C21146OooO0o0 c21146OooO0o0;
        Object[] objArr = this.f61354OooOoo0;
        if (objArr == this.f61348OooOo && this.f61353OooOoo == this.f61351OooOoO0) {
            c21146OooO0o0 = this.f61349OooOo0o;
        } else {
            this.f61352OooOoOO = new C21175OooO0Oo();
            this.f61348OooOo = objArr;
            Object[] objArr2 = this.f61353OooOoo;
            this.f61351OooOoO0 = objArr2;
            if (objArr != null) {
                c21146OooO0o0 = new C21146OooO0o0(objArr, this.f61355OooOooO, this.f61350OooOoO, objArr2);
            } else if (objArr2.length == 0) {
                c21146OooO0o0 = OooOO0.f61367OooOo;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr2, this.f61355OooOooO);
                OooOOO0.OooO0o(objArrCopyOf, "copyOf(this, newSize)");
                c21146OooO0o0 = new OooOO0(objArrCopyOf);
            }
        }
        this.f61349OooOo0o = c21146OooO0o0;
        return (InterfaceC21151OooO0OO<E>) c21146OooO0o0;
    }

    public final int OooO0oO() {
        return ((AbstractList) this).modCount;
    }

    public final void OooO0oo(Collection<? extends E> collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.f61354OooOoo0 == null) {
            throw new IllegalStateException("root is null");
        }
        int i4 = i >> 5;
        AbstractC21142OooO00o abstractC21142OooO00oOooOO0o = OooOO0o(Oooo00O() >> 5);
        int i5 = i3;
        Object[] objArrOooOOOO = objArr2;
        while (abstractC21142OooO00oOooOO0o.f61344OooOo0o - 1 != i4) {
            Object[] objArr3 = (Object[]) abstractC21142OooO00oOooOO0o.previous();
            Oooo.OooO0OO.OooO0oo(objArr3, 0, objArrOooOOOO, 32 - i2, 32);
            objArrOooOOOO = OooOOOO(i2, objArr3);
            i5--;
            objArr[i5] = objArrOooOOOO;
        }
        Object[] objArr4 = (Object[]) abstractC21142OooO00oOooOO0o.previous();
        int iOooo00O = i3 - (((Oooo00O() >> 5) - 1) - i4);
        if (iOooo00O < i3) {
            objArr2 = objArr[iOooo00O];
            OooOOO0.OooO0Oo(objArr2);
        }
        Oooo0(collection, i, objArr4, 32, objArr, iOooo00O, objArr2);
    }

    public final void OooOO0(Object obj, Object[] objArr, int i) {
        int iOooo0O0 = Oooo0O0();
        Object[] objArrOooOOO = OooOOO(this.f61353OooOoo);
        if (iOooo0O0 < 32) {
            Oooo.OooO0OO.OooO0oo(this.f61353OooOoo, i + 1, objArrOooOOO, i, iOooo0O0);
            objArrOooOOO[i] = obj;
            this.f61354OooOoo0 = objArr;
            this.f61353OooOoo = objArrOooOOO;
            this.f61355OooOooO++;
            return;
        }
        Object[] objArr2 = this.f61353OooOoo;
        Object obj2 = objArr2[31];
        Oooo.OooO0OO.OooO0oo(objArr2, i + 1, objArrOooOOO, i, 31);
        objArrOooOOO[i] = obj;
        OooOo0o(objArr, objArrOooOOO, OooOOo0(obj2));
    }

    public final boolean OooOO0O(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f61352OooOoOO;
    }

    public final AbstractC21142OooO00o OooOO0o(int i) {
        Object[] objArr = this.f61354OooOoo0;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int iOooo00O = Oooo00O() >> 5;
        C21174OooO0OO.OooO0O0(i, iOooo00O);
        int i2 = this.f61350OooOoO;
        return i2 == 0 ? new OooO(objArr, i) : new OooOO0O(objArr, i, iOooo00O, i2 / 5);
    }

    public final Object[] OooOOO(Object[] objArr) {
        if (objArr == null) {
            return OooOOOo();
        }
        if (OooOO0O(objArr)) {
            return objArr;
        }
        Object[] objArrOooOOOo = OooOOOo();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        Oooo.OooO0OO.OooOO0(objArr, 0, objArrOooOOOo, length, 6);
        return objArrOooOOOo;
    }

    public final Object[] OooOOOO(int i, Object[] objArr) {
        if (OooOO0O(objArr)) {
            Oooo.OooO0OO.OooO0oo(objArr, i, objArr, 0, 32 - i);
            return objArr;
        }
        Object[] objArrOooOOOo = OooOOOo();
        Oooo.OooO0OO.OooO0oo(objArr, i, objArrOooOOOo, 0, 32 - i);
        return objArrOooOOOo;
    }

    public final Object[] OooOOOo() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f61352OooOoOO;
        return objArr;
    }

    public final Object[] OooOOo(Object[] objArr, int i, int i2) {
        if (!(i2 >= 0)) {
            o000000O.OooO0O0("shift should be positive");
            throw null;
        }
        if (i2 == 0) {
            return objArr;
        }
        int iOooO0oo = C25022OooO0O0.OooO0oo(i, i2);
        Object obj = objArr[iOooO0oo];
        OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object objOooOOo = OooOOo((Object[]) obj, i, i2 - 5);
        if (iOooO0oo < 31) {
            int i3 = iOooO0oo + 1;
            if (objArr[i3] != null) {
                if (OooOO0O(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] objArrOooOOOo = OooOOOo();
                Oooo.OooO0OO.OooO0oo(objArr, 0, objArrOooOOOo, 0, i3);
                objArr = objArrOooOOOo;
            }
        }
        if (objOooOOo == objArr[iOooO0oo]) {
            return objArr;
        }
        Object[] objArrOooOOO = OooOOO(objArr);
        objArrOooOOO[iOooO0oo] = objOooOOo;
        return objArrOooOOO;
    }

    public final Object[] OooOOo0(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f61352OooOoOO;
        return objArr;
    }

    public final Object[] OooOOoo(Object[] objArr, int i, int i2, C21145OooO0Oo c21145OooO0Oo) {
        Object[] objArrOooOOoo;
        int iOooO0oo = C25022OooO0O0.OooO0oo(i2 - 1, i);
        if (i == 5) {
            c21145OooO0Oo.f61347OooO00o = objArr[iOooO0oo];
            objArrOooOOoo = null;
        } else {
            Object obj = objArr[iOooO0oo];
            OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrOooOOoo = OooOOoo((Object[]) obj, i - 5, i2, c21145OooO0Oo);
        }
        if (objArrOooOOoo == null && iOooO0oo == 0) {
            return null;
        }
        Object[] objArrOooOOO = OooOOO(objArr);
        objArrOooOOO[iOooO0oo] = objArrOooOOoo;
        return objArrOooOOO;
    }

    public final Object[] OooOo(Object[] objArr, Object[] objArr2, int i) {
        int iOooO0oo = C25022OooO0O0.OooO0oo(OooO0O0() - 1, i);
        Object[] objArrOooOOO = OooOOO(objArr);
        if (i == 5) {
            objArrOooOOO[iOooO0oo] = objArr2;
            return objArrOooOOO;
        }
        objArrOooOOO[iOooO0oo] = OooOo((Object[]) objArrOooOOO[iOooO0oo], objArr2, i - 5);
        return objArrOooOOO;
    }

    public final Object[] OooOo0(Object[] objArr, int i, int i2, Iterator<Object[]> it) {
        if (!it.hasNext()) {
            o000000O.OooO0O0("invalid buffersIterator");
            throw null;
        }
        if (!(i2 >= 0)) {
            o000000O.OooO0O0("negative shift");
            throw null;
        }
        if (i2 == 0) {
            return it.next();
        }
        Object[] objArrOooOOO = OooOOO(objArr);
        int iOooO0oo = C25022OooO0O0.OooO0oo(i, i2);
        int i3 = i2 - 5;
        objArrOooOOO[iOooO0oo] = OooOo0((Object[]) objArrOooOOO[iOooO0oo], i, i3, it);
        while (true) {
            iOooO0oo++;
            if (iOooO0oo >= 32 || !it.hasNext()) {
                break;
            }
            objArrOooOOO[iOooO0oo] = OooOo0((Object[]) objArrOooOOO[iOooO0oo], 0, i3, it);
        }
        return objArrOooOOO;
    }

    public final void OooOo00(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.f61354OooOoo0 = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f61353OooOoo = objArr;
            this.f61355OooOooO = i;
            this.f61350OooOoO = i2;
            return;
        }
        C21145OooO0Oo c21145OooO0Oo = new C21145OooO0Oo(null);
        OooOOO0.OooO0Oo(objArr);
        Object[] objArrOooOOoo = OooOOoo(objArr, i2, i, c21145OooO0Oo);
        OooOOO0.OooO0Oo(objArrOooOOoo);
        Object obj = c21145OooO0Oo.f61347OooO00o;
        OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f61353OooOoo = (Object[]) obj;
        this.f61355OooOooO = i;
        if (objArrOooOOoo[1] == null) {
            this.f61354OooOoo0 = (Object[]) objArrOooOOoo[0];
            this.f61350OooOoO = i2 - 5;
        } else {
            this.f61354OooOoo0 = objArrOooOOoo;
            this.f61350OooOoO = i2;
        }
    }

    public final Object[] OooOo0O(Object[] objArr, int i, Object[][] objArr2) {
        kotlin.jvm.internal.OooO0O0 OooO0O02 = kotlin.jvm.internal.OooO0OO.OooO0O0(objArr2);
        int i2 = i >> 5;
        int i3 = this.f61350OooOoO;
        Object[] objArrOooOo0 = i2 < (1 << i3) ? OooOo0(objArr, i, i3, OooO0O02) : OooOOO(objArr);
        while (OooO0O02.hasNext()) {
            this.f61350OooOoO += 5;
            objArrOooOo0 = OooOOo0(objArrOooOo0);
            int i4 = this.f61350OooOoO;
            OooOo0(objArrOooOo0, 1 << i4, i4, OooO0O02);
        }
        return objArrOooOo0;
    }

    public final void OooOo0o(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.f61355OooOooO;
        int i2 = i >> 5;
        int i3 = this.f61350OooOoO;
        if (i2 > (1 << i3)) {
            this.f61354OooOoo0 = OooOo(OooOOo0(objArr), objArr2, this.f61350OooOoO + 5);
            this.f61353OooOoo = objArr3;
            this.f61350OooOoO += 5;
            this.f61355OooOooO++;
            return;
        }
        if (objArr == null) {
            this.f61354OooOoo0 = objArr2;
            this.f61353OooOoo = objArr3;
            this.f61355OooOooO = i + 1;
        } else {
            this.f61354OooOoo0 = OooOo(objArr, objArr2, i3);
            this.f61353OooOoo = objArr3;
            this.f61355OooOooO++;
        }
    }

    public final int OooOoO(InterfaceC32507OooOO0o<? super E, Boolean> interfaceC32507OooOO0o, Object[] objArr, int i, C21145OooO0Oo c21145OooO0Oo) {
        Object[] objArrOooOOO = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (interfaceC32507OooOO0o.invoke(obj).booleanValue()) {
                if (!z) {
                    objArrOooOOO = OooOOO(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrOooOOO[i2] = obj;
                i2++;
            }
        }
        c21145OooO0Oo.f61347OooO00o = objArrOooOOO;
        return i2;
    }

    public final int OooOoO0(InterfaceC32507OooOO0o interfaceC32507OooOO0o, Object[] objArr, int i, int i2, C21145OooO0Oo c21145OooO0Oo, ArrayList arrayList, ArrayList arrayList2) {
        if (OooOO0O(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = c21145OooO0Oo.f61347OooO00o;
        OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrOooOOOo = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) interfaceC32507OooOO0o.invoke(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArrOooOOOo = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : OooOOOo();
                    i2 = 0;
                }
                objArrOooOOOo[i2] = obj2;
                i2++;
            }
        }
        c21145OooO0Oo.f61347OooO00o = objArrOooOOOo;
        if (objArr2 != objArrOooOOOo) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final int OooOoOO(InterfaceC32507OooOO0o<? super E, Boolean> interfaceC32507OooOO0o, int i, C21145OooO0Oo c21145OooO0Oo) {
        int iOooOoO = OooOoO(interfaceC32507OooOO0o, this.f61353OooOoo, i, c21145OooO0Oo);
        if (iOooOoO == i) {
            return i;
        }
        Object obj = c21145OooO0Oo.f61347OooO00o;
        OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iOooOoO, i, (Object) null);
        this.f61353OooOoo = objArr;
        this.f61355OooOooO -= i - iOooOoO;
        return iOooOoO;
    }

    public final Object[] OooOoo(Object[] objArr, int i, int i2, C21145OooO0Oo c21145OooO0Oo) {
        int iOooO0oo = C25022OooO0O0.OooO0oo(i2, i);
        if (i == 0) {
            Object obj = objArr[iOooO0oo];
            Object[] objArrOooOOO = OooOOO(objArr);
            Oooo.OooO0OO.OooO0oo(objArr, iOooO0oo, objArrOooOOO, iOooO0oo + 1, 32);
            objArrOooOOO[31] = c21145OooO0Oo.f61347OooO00o;
            c21145OooO0Oo.f61347OooO00o = obj;
            return objArrOooOOO;
        }
        int iOooO0oo2 = objArr[31] == null ? C25022OooO0O0.OooO0oo(Oooo00O() - 1, i) : 31;
        Object[] objArrOooOOO2 = OooOOO(objArr);
        int i3 = i - 5;
        int i4 = iOooO0oo + 1;
        if (i4 <= iOooO0oo2) {
            while (true) {
                Object obj2 = objArrOooOOO2[iOooO0oo2];
                OooOOO0.OooO0o0(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrOooOOO2[iOooO0oo2] = OooOoo((Object[]) obj2, i3, 0, c21145OooO0Oo);
                if (iOooO0oo2 == i4) {
                    break;
                }
                iOooO0oo2--;
            }
        }
        Object obj3 = objArrOooOOO2[iOooO0oo];
        OooOOO0.OooO0o0(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrOooOOO2[iOooO0oo] = OooOoo((Object[]) obj3, i3, i2, c21145OooO0Oo);
        return objArrOooOOO2;
    }

    public final boolean OooOoo0(InterfaceC32507OooOO0o<? super E, Boolean> interfaceC32507OooOO0o) {
        Object[] objArrOooOo0;
        int i;
        InterfaceC32507OooOO0o<? super E, Boolean> interfaceC32507OooOO0o2 = interfaceC32507OooOO0o;
        int iOooo0O0 = Oooo0O0();
        Object[] objArrOooOOo = null;
        C21145OooO0Oo c21145OooO0Oo = new C21145OooO0Oo(null);
        boolean z = false;
        if (this.f61354OooOoo0 != null) {
            AbstractC21142OooO00o abstractC21142OooO00oOooOO0o = OooOO0o(0);
            int iOooOoO = 32;
            while (iOooOoO == 32 && abstractC21142OooO00oOooOO0o.hasNext()) {
                iOooOoO = OooOoO(interfaceC32507OooOO0o2, (Object[]) abstractC21142OooO00oOooOO0o.next(), 32, c21145OooO0Oo);
            }
            if (iOooOoO == 32) {
                int iOooOoOO = OooOoOO(interfaceC32507OooOO0o2, iOooo0O0, c21145OooO0Oo);
                if (iOooOoOO == 0) {
                    OooOo00(this.f61354OooOoo0, this.f61355OooOooO, this.f61350OooOoO);
                }
                if (iOooOoOO != iOooo0O0) {
                }
            } else {
                int i2 = (abstractC21142OooO00oOooOO0o.f61344OooOo0o - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iOooOoO0 = iOooOoO;
                while (abstractC21142OooO00oOooOO0o.hasNext()) {
                    iOooOoO0 = OooOoO0(interfaceC32507OooOO0o2, (Object[]) abstractC21142OooO00oOooOO0o.next(), 32, iOooOoO0, c21145OooO0Oo, arrayList2, arrayList);
                    interfaceC32507OooOO0o2 = interfaceC32507OooOO0o;
                }
                int iOooOoO02 = OooOoO0(interfaceC32507OooOO0o, this.f61353OooOoo, iOooo0O0, iOooOoO0, c21145OooO0Oo, arrayList2, arrayList);
                Object obj = c21145OooO0Oo.f61347OooO00o;
                OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iOooOoO02, 32, (Object) null);
                if (arrayList.isEmpty()) {
                    objArrOooOo0 = this.f61354OooOoo0;
                    OooOOO0.OooO0Oo(objArrOooOo0);
                } else {
                    objArrOooOo0 = OooOo0(this.f61354OooOoo0, i2, this.f61350OooOoO, arrayList.iterator());
                }
                int size = i2 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    o000000O.OooO0O0("invalid size");
                    throw null;
                }
                if (size == 0) {
                    this.f61350OooOoO = 0;
                } else {
                    int i3 = size - 1;
                    while (true) {
                        i = this.f61350OooOoO;
                        if ((i3 >> i) != 0) {
                            break;
                        }
                        this.f61350OooOoO = i - 5;
                        Object[] objArr2 = objArrOooOo0[0];
                        OooOOO0.OooO0o0(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        objArrOooOo0 = objArr2;
                    }
                    objArrOooOOo = OooOOo(objArrOooOo0, i3, i);
                }
                this.f61354OooOoo0 = objArrOooOOo;
                this.f61353OooOoo = objArr;
                this.f61355OooOooO = size + iOooOoO02;
            }
            z = true;
        } else if (OooOoOO(interfaceC32507OooOO0o2, iOooo0O0, c21145OooO0Oo) != iOooo0O0) {
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    public final Object OooOooO(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.f61355OooOooO - i;
        if (i4 == 1) {
            Object obj = this.f61353OooOoo[0];
            OooOo00(objArr, i, i2);
            return obj;
        }
        Object[] objArr2 = this.f61353OooOoo;
        Object obj2 = objArr2[i3];
        Object[] objArrOooOOO = OooOOO(objArr2);
        Oooo.OooO0OO.OooO0oo(objArr2, i3, objArrOooOOO, i3 + 1, i4);
        objArrOooOOO[i4 - 1] = null;
        this.f61354OooOoo0 = objArr;
        this.f61353OooOoo = objArrOooOOO;
        this.f61355OooOooO = (i + i4) - 1;
        this.f61350OooOoO = i2;
        return obj2;
    }

    public final void Oooo0(Collection<? extends E> collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrOooOOOo;
        if (i3 < 1) {
            o000000O.OooO0O0("requires at least one nullBuffer");
            throw null;
        }
        Object[] objArrOooOOO = OooOOO(objArr);
        objArr2[0] = objArrOooOOO;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            Oooo.OooO0OO.OooO0oo(objArrOooOOO, size + 1, objArr3, i4, i2);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                objArrOooOOOo = objArrOooOOO;
            } else {
                objArrOooOOOo = OooOOOo();
                i3--;
                objArr2[i3] = objArrOooOOOo;
            }
            int i7 = i2 - i6;
            Oooo.OooO0OO.OooO0oo(objArrOooOOO, 0, objArr3, i7, i2);
            Oooo.OooO0OO.OooO0oo(objArrOooOOO, size + 1, objArrOooOOOo, i4, i7);
            objArr3 = objArrOooOOOo;
        }
        Iterator<? extends E> it = collection.iterator();
        OooO0o(objArrOooOOO, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] objArrOooOOOo2 = OooOOOo();
            OooO0o(objArrOooOOOo2, 0, it);
            objArr2[i8] = objArrOooOOOo2;
        }
        OooO0o(objArr3, 0, it);
    }

    public final int Oooo00O() {
        int i = this.f61355OooOooO;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    public final Object[] Oooo00o(Object[] objArr, int i, int i2, E e, C21145OooO0Oo c21145OooO0Oo) {
        int iOooO0oo = C25022OooO0O0.OooO0oo(i2, i);
        Object[] objArrOooOOO = OooOOO(objArr);
        if (i != 0) {
            Object obj = objArrOooOOO[iOooO0oo];
            OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrOooOOO[iOooO0oo] = Oooo00o((Object[]) obj, i - 5, i2, e, c21145OooO0Oo);
            return objArrOooOOO;
        }
        if (objArrOooOOO != objArr) {
            ((AbstractList) this).modCount++;
        }
        c21145OooO0Oo.f61347OooO00o = objArrOooOOO[iOooO0oo];
        objArrOooOOO[iOooO0oo] = e;
        return objArrOooOOO;
    }

    public final int Oooo0O0() {
        int i = this.f61355OooOooO;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        C21174OooO0OO.OooO0O0(i, OooO0O0());
        if (i == OooO0O0()) {
            add(e);
            return;
        }
        ((AbstractList) this).modCount++;
        int iOooo00O = Oooo00O();
        if (i >= iOooo00O) {
            OooOO0(e, this.f61354OooOoo0, i - iOooo00O);
            return;
        }
        C21145OooO0Oo c21145OooO0Oo = new C21145OooO0Oo(null);
        Object[] objArr = this.f61354OooOoo0;
        OooOOO0.OooO0Oo(objArr);
        OooOO0(c21145OooO0Oo.f61347OooO00o, OooO(objArr, this.f61350OooOoO, i, e, c21145OooO0Oo), 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        Collection<? extends E> collection2;
        OooO0o<E> oooO0o;
        Object[] objArrOooOOOo;
        C21174OooO0OO.OooO0O0(i, this.f61355OooOooO);
        if (i == this.f61355OooOooO) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.f61355OooOooO - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.f61353OooOoo;
            Object[] objArrOooOOO = OooOOO(objArr);
            Oooo.OooO0OO.OooO0oo(objArr, size2 + 1, objArrOooOOO, i3, Oooo0O0());
            OooO0o(objArrOooOOO, i3, collection.iterator());
            this.f61353OooOoo = objArrOooOOO;
            this.f61355OooOooO = collection.size() + this.f61355OooOooO;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iOooo0O0 = Oooo0O0();
        int size3 = collection.size() + this.f61355OooOooO;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= Oooo00O()) {
            objArrOooOOOo = OooOOOo();
            collection2 = collection;
            Oooo0(collection2, i, this.f61353OooOoo, iOooo0O0, objArr2, size, objArrOooOOOo);
            oooO0o = this;
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            oooO0o = this;
            if (size3 > iOooo0O0) {
                int i4 = size3 - iOooo0O0;
                Object[] objArrOooOOOO = OooOOOO(i4, oooO0o.f61353OooOoo);
                oooO0o.OooO0oo(collection2, i, i4, objArr2, size, objArrOooOOOO);
                objArr2 = objArr2;
                objArrOooOOOo = objArrOooOOOO;
            } else {
                Object[] objArr3 = oooO0o.f61353OooOoo;
                objArrOooOOOo = OooOOOo();
                int i5 = iOooo0O0 - size3;
                Oooo.OooO0OO.OooO0oo(objArr3, 0, objArrOooOOOo, i5, iOooo0O0);
                int i6 = 32 - i5;
                Object[] objArrOooOOOO2 = OooOOOO(i6, oooO0o.f61353OooOoo);
                int i7 = size - 1;
                objArr2[i7] = objArrOooOOOO2;
                oooO0o.OooO0oo(collection2, i, i6, objArr2, i7, objArrOooOOOO2);
                collection2 = collection2;
            }
        }
        oooO0o.f61354OooOoo0 = OooOo0O(oooO0o.f61354OooOoo0, i2, objArr2);
        oooO0o.f61353OooOoo = objArrOooOOOo;
        oooO0o.f61355OooOooO = collection2.size() + oooO0o.f61355OooOooO;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        Object[] objArr;
        C21174OooO0OO.OooO00o(i, OooO0O0());
        if (Oooo00O() <= i) {
            objArr = this.f61353OooOoo;
        } else {
            objArr = this.f61354OooOoo0;
            OooOOO0.OooO0Oo(objArr);
            for (int i2 = this.f61350OooOoO; i2 > 0; i2 -= 5) {
                Object obj = objArr[C25022OooO0O0.OooO0oo(i, i2)];
                OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return (E) objArr[i & 31];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator(int i) {
        C21174OooO0OO.OooO0O0(i, this.f61355OooOooO);
        return new C21148OooO0oo(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<? extends Object> collection) {
        return OooOoo0(new OooO00o(collection));
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        C21174OooO0OO.OooO00o(i, OooO0O0());
        if (Oooo00O() > i) {
            C21145OooO0Oo c21145OooO0Oo = new C21145OooO0Oo(null);
            Object[] objArr = this.f61354OooOoo0;
            OooOOO0.OooO0Oo(objArr);
            this.f61354OooOoo0 = Oooo00o(objArr, this.f61350OooOoO, i, e, c21145OooO0Oo);
            return (E) c21145OooO0Oo.f61347OooO00o;
        }
        Object[] objArrOooOOO = OooOOO(this.f61353OooOoo);
        if (objArrOooOOO != this.f61353OooOoo) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        E e2 = (E) objArrOooOOO[i2];
        objArrOooOOO[i2] = e;
        this.f61353OooOoo = objArrOooOOO;
        return e2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        ((AbstractList) this).modCount++;
        int iOooo0O0 = Oooo0O0();
        if (iOooo0O0 < 32) {
            Object[] objArrOooOOO = OooOOO(this.f61353OooOoo);
            objArrOooOOO[iOooo0O0] = e;
            this.f61353OooOoo = objArrOooOOO;
            this.f61355OooOooO = OooO0O0() + 1;
        } else {
            OooOo0o(this.f61354OooOoo0, this.f61353OooOoo, OooOOo0(e));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iOooo0O0 = Oooo0O0();
        Iterator<? extends E> it = collection.iterator();
        if (32 - iOooo0O0 >= collection.size()) {
            Object[] objArrOooOOO = OooOOO(this.f61353OooOoo);
            OooO0o(objArrOooOOO, iOooo0O0, it);
            this.f61353OooOoo = objArrOooOOO;
            this.f61355OooOooO = collection.size() + this.f61355OooOooO;
            return true;
        }
        int size = ((collection.size() + iOooo0O0) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrOooOOO2 = OooOOO(this.f61353OooOoo);
        OooO0o(objArrOooOOO2, iOooo0O0, it);
        objArr[0] = objArrOooOOO2;
        for (int i = 1; i < size; i++) {
            Object[] objArrOooOOOo = OooOOOo();
            OooO0o(objArrOooOOOo, 0, it);
            objArr[i] = objArrOooOOOo;
        }
        this.f61354OooOoo0 = OooOo0O(this.f61354OooOoo0, Oooo00O(), objArr);
        Object[] objArrOooOOOo2 = OooOOOo();
        OooO0o(objArrOooOOOo2, 0, it);
        this.f61353OooOoo = objArrOooOOOo2;
        this.f61355OooOooO = collection.size() + this.f61355OooOooO;
        return true;
    }
}
