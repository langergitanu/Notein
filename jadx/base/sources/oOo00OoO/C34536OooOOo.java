package oOo00OoO;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.RandomAccess;
import oOo000Oo.AbstractC34421OooO0Oo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34431OooOo0;

/* JADX INFO: renamed from: oOo00OoO.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34536OooOOo extends AbstractC34421OooO0Oo<C34527OooO0oO> implements RandomAccess {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int[] f123758OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C34527OooO0oO[] f123759OooOo0o;

    /* JADX INFO: renamed from: oOo00OoO.OooOOo$OooO00o */
    public static final class OooO00o {
        public static void OooO00o(long j, C34524OooO0Oo c34524OooO0Oo, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) throws IOException {
            int i4;
            int i5;
            ArrayList arrayList3;
            long j2;
            int i6;
            int i7 = i;
            ArrayList arrayList4 = arrayList;
            ArrayList arrayList5 = arrayList2;
            if (i2 >= i3) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for (int i8 = i2; i8 < i3; i8++) {
                if (((C34527OooO0oO) arrayList4.get(i8)).OooO0OO() < i7) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            C34527OooO0oO c34527OooO0oO = (C34527OooO0oO) arrayList.get(i2);
            C34527OooO0oO c34527OooO0oO2 = (C34527OooO0oO) arrayList4.get(i3 - 1);
            if (i7 == c34527OooO0oO.OooO0OO()) {
                int iIntValue = ((Number) arrayList5.get(i2)).intValue();
                int i9 = i2 + 1;
                C34527OooO0oO c34527OooO0oO3 = (C34527OooO0oO) arrayList4.get(i9);
                i4 = i9;
                i5 = iIntValue;
                c34527OooO0oO = c34527OooO0oO3;
            } else {
                i4 = i2;
                i5 = -1;
            }
            if (c34527OooO0oO.OooO0o(i7) == c34527OooO0oO2.OooO0o(i7)) {
                int iMin = Math.min(c34527OooO0oO.OooO0OO(), c34527OooO0oO2.OooO0OO());
                int i10 = 0;
                for (int i11 = i7; i11 < iMin && c34527OooO0oO.OooO0o(i11) == c34527OooO0oO2.OooO0o(i11); i11++) {
                    i10++;
                }
                long j3 = 4;
                long j4 = (c34524OooO0Oo.f123723OooOo / j3) + j + ((long) 2) + ((long) i10) + 1;
                c34524OooO0Oo.o000OOo0(-i10);
                c34524OooO0Oo.o000OOo0(i5);
                int i12 = i7 + i10;
                while (i7 < i12) {
                    c34524OooO0Oo.o000OOo0(c34527OooO0oO.OooO0o(i7) & 255);
                    i7++;
                }
                if (i4 + 1 == i3) {
                    if (i12 != ((C34527OooO0oO) arrayList4.get(i4)).OooO0OO()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    c34524OooO0Oo.o000OOo0(((Number) arrayList5.get(i4)).intValue());
                    return;
                } else {
                    C34524OooO0Oo c34524OooO0Oo2 = new C34524OooO0Oo();
                    c34524OooO0Oo.o000OOo0(((int) ((c34524OooO0Oo2.f123723OooOo / j3) + j4)) * (-1));
                    OooO00o(j4, c34524OooO0Oo2, i12, arrayList4, i4, i3, arrayList5);
                    c34524OooO0Oo.o0000O00(c34524OooO0Oo2);
                    return;
                }
            }
            int i13 = 1;
            for (int i14 = i4 + 1; i14 < i3; i14++) {
                if (((C34527OooO0oO) arrayList4.get(i14 - 1)).OooO0o(i7) != ((C34527OooO0oO) arrayList4.get(i14)).OooO0o(i7)) {
                    i13++;
                }
            }
            long j5 = 4;
            long j6 = (c34524OooO0Oo.f123723OooOo / j5) + j + ((long) 2) + ((long) (i13 * 2));
            c34524OooO0Oo.o000OOo0(i13);
            c34524OooO0Oo.o000OOo0(i5);
            for (int i15 = i4; i15 < i3; i15++) {
                int iOooO0o = ((C34527OooO0oO) arrayList4.get(i15)).OooO0o(i7);
                if (i15 == i4 || iOooO0o != ((C34527OooO0oO) arrayList4.get(i15 - 1)).OooO0o(i7)) {
                    c34524OooO0Oo.o000OOo0(iOooO0o & 255);
                }
            }
            C34524OooO0Oo c34524OooO0Oo3 = new C34524OooO0Oo();
            int i16 = i4;
            while (i16 < i3) {
                byte bOooO0o = ((C34527OooO0oO) arrayList4.get(i16)).OooO0o(i7);
                int i17 = i16 + 1;
                int i18 = i17;
                while (true) {
                    if (i18 >= i3) {
                        i18 = i3;
                        break;
                    } else if (bOooO0o != ((C34527OooO0oO) arrayList4.get(i18)).OooO0o(i7)) {
                        break;
                    } else {
                        i18++;
                    }
                }
                if (i17 == i18 && i7 + 1 == ((C34527OooO0oO) arrayList4.get(i16)).OooO0OO()) {
                    c34524OooO0Oo.o000OOo0(((Number) arrayList5.get(i16)).intValue());
                    arrayList3 = arrayList5;
                    j2 = j6;
                    i6 = i18;
                } else {
                    c34524OooO0Oo.o000OOo0(((int) ((c34524OooO0Oo3.f123723OooOo / j5) + j6)) * (-1));
                    arrayList3 = arrayList5;
                    j2 = j6;
                    i6 = i18;
                    OooO00o(j2, c34524OooO0Oo3, i7 + 1, arrayList, i16, i6, arrayList3);
                    arrayList4 = arrayList;
                }
                j6 = j2;
                i16 = i6;
                arrayList5 = arrayList3;
            }
            c34524OooO0Oo.o0000O00(c34524OooO0Oo3);
        }

        /* JADX WARN: Code restructure failed: missing block: B:44:0x00c7, code lost:
        
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static C34536OooOOo OooO0O0(C34527OooO0oO... c34527OooO0oOArr) throws IOException {
            int i = 0;
            if (c34527OooO0oOArr.length == 0) {
                return new C34536OooOOo(new C34527OooO0oO[0], new int[]{0, -1});
            }
            ArrayList arrayListOoooOOo = oOo000Oo.OooOOO.OoooOOo(c34527OooO0oOArr);
            C34431OooOo0.OooOoo(arrayListOoooOOo);
            ArrayList arrayList = new ArrayList(c34527OooO0oOArr.length);
            for (C34527OooO0oO c34527OooO0oO : c34527OooO0oOArr) {
                arrayList.add(-1);
            }
            Integer[] numArr = (Integer[]) arrayList.toArray(new Integer[0]);
            ArrayList arrayListOooOOO = C34429OooOOo0.OooOOO(Arrays.copyOf(numArr, numArr.length));
            int length = c34527OooO0oOArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                arrayListOooOOO.set(C34429OooOOo0.OooO(arrayListOoooOOo, c34527OooO0oOArr[i2]), Integer.valueOf(i3));
                i2++;
                i3++;
            }
            if (((C34527OooO0oO) arrayListOoooOOo.get(0)).OooO0OO() <= 0) {
                throw new IllegalArgumentException("the empty byte string is not a supported option");
            }
            int i4 = 0;
            while (i4 < arrayListOoooOOo.size()) {
                C34527OooO0oO c34527OooO0oO2 = (C34527OooO0oO) arrayListOoooOOo.get(i4);
                int i5 = i4 + 1;
                int i6 = i5;
                while (i6 < arrayListOoooOOo.size()) {
                    C34527OooO0oO c34527OooO0oO3 = (C34527OooO0oO) arrayListOoooOOo.get(i6);
                    if (c34527OooO0oO3.OooOO0(c34527OooO0oO2)) {
                        if (c34527OooO0oO3.OooO0OO() == c34527OooO0oO2.OooO0OO()) {
                            throw new IllegalArgumentException(("duplicate option: " + c34527OooO0oO3).toString());
                        }
                        if (((Number) arrayListOooOOO.get(i6)).intValue() > ((Number) arrayListOooOOO.get(i4)).intValue()) {
                            arrayListOoooOOo.remove(i6);
                            arrayListOooOOO.remove(i6);
                        } else {
                            i6++;
                        }
                    }
                }
                i4 = i5;
            }
            C34524OooO0Oo c34524OooO0Oo = new C34524OooO0Oo();
            OooO00o(0L, c34524OooO0Oo, 0, arrayListOoooOOo, 0, arrayListOoooOOo.size(), arrayListOooOOO);
            int[] iArr = new int[(int) (c34524OooO0Oo.f123723OooOo / ((long) 4))];
            while (!c34524OooO0Oo.o0000o0O()) {
                iArr[i] = c34524OooO0Oo.readInt();
                i++;
            }
            Object[] objArrCopyOf = Arrays.copyOf(c34527OooO0oOArr, c34527OooO0oOArr.length);
            kotlin.jvm.internal.OooOOO0.OooO0o(objArrCopyOf, "copyOf(this, size)");
            return new C34536OooOOo((C34527OooO0oO[]) objArrCopyOf, iArr);
        }
    }

    public C34536OooOOo(C34527OooO0oO[] c34527OooO0oOArr, int[] iArr) {
        this.f123759OooOo0o = c34527OooO0oOArr;
        this.f123758OooOo = iArr;
    }

    @Override // oOo000Oo.AbstractC34419OooO0O0
    public final int OooO0O0() {
        return this.f123759OooOo0o.length;
    }

    @Override // oOo000Oo.AbstractC34419OooO0O0, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C34527OooO0oO) {
            return super.contains((C34527OooO0oO) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f123759OooOo0o[i];
    }

    @Override // oOo000Oo.AbstractC34421OooO0Oo, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C34527OooO0oO) {
            return super.indexOf((C34527OooO0oO) obj);
        }
        return -1;
    }

    @Override // oOo000Oo.AbstractC34421OooO0Oo, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C34527OooO0oO) {
            return super.lastIndexOf((C34527OooO0oO) obj);
        }
        return -1;
    }
}
