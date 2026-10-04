package com.huawei.hms.network.embedded;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.zb */
/* JADX INFO: loaded from: classes9.dex */
public final class C18446zb extends AbstractList<C18303ob> implements RandomAccess {

    /* JADX INFO: renamed from: a */
    public final C18303ob[] f56866a;

    /* JADX INFO: renamed from: b */
    public final int[] f56867b;

    public C18446zb(C18303ob[] c18303obArr, int[] iArr) {
        this.f56866a = c18303obArr;
        this.f56867b = iArr;
    }

    /* JADX INFO: renamed from: a */
    public static int m80070a(C18261lb c18261lb) {
        return (int) (c18261lb.m79076B() / 4);
    }

    @Override // java.util.AbstractList, java.util.List
    public C18303ob get(int i) {
        return this.f56866a[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f56866a.length;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b7, code lost:
    
        continue;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C18446zb m80071a(C18303ob... c18303obArr) {
        if (c18303obArr.length == 0) {
            return new C18446zb(new C18303ob[0], new int[]{0, -1});
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(c18303obArr));
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.add(-1);
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.set(Collections.binarySearch(arrayList, c18303obArr[i2]), Integer.valueOf(i2));
        }
        if (((C18303ob) arrayList.get(0)).mo78736j() == 0) {
            throw new IllegalArgumentException("the empty byte string is not a supported option");
        }
        int i3 = 0;
        while (i3 < arrayList.size()) {
            C18303ob c18303ob = (C18303ob) arrayList.get(i3);
            int i4 = i3 + 1;
            int i5 = i4;
            while (i5 < arrayList.size()) {
                C18303ob c18303ob2 = (C18303ob) arrayList.get(i5);
                if (!c18303ob2.m79312h(c18303ob)) {
                    break;
                }
                if (c18303ob2.mo78736j() == c18303ob.mo78736j()) {
                    throw new IllegalArgumentException("duplicate option: " + c18303ob2);
                }
                if (((Integer) arrayList2.get(i5)).intValue() > ((Integer) arrayList2.get(i3)).intValue()) {
                    arrayList.remove(i5);
                    arrayList2.remove(i5);
                } else {
                    i5++;
                }
            }
            i3 = i4;
        }
        C18261lb c18261lb = new C18261lb();
        m80072a(0L, c18261lb, 0, arrayList, 0, arrayList.size(), arrayList2);
        int iM80070a = m80070a(c18261lb);
        int[] iArr = new int[iM80070a];
        for (int i6 = 0; i6 < iM80070a; i6++) {
            iArr[i6] = c18261lb.readInt();
        }
        if (c18261lb.mo78389f()) {
            return new C18446zb((C18303ob[]) c18303obArr.clone(), iArr);
        }
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: a */
    public static void m80072a(long j, C18261lb c18261lb, int i, List<C18303ob> list, int i2, int i3, List<Integer> list2) {
        int i4;
        int i5;
        long j2;
        int i6;
        List<Integer> list3;
        long j3;
        int i7;
        List<C18303ob> list4 = list;
        List<Integer> list5 = list2;
        if (i2 >= i3) {
            throw new AssertionError();
        }
        for (int i8 = i2; i8 < i3; i8++) {
            if (list4.get(i8).mo78736j() < i) {
                throw new AssertionError();
            }
        }
        C18303ob c18303ob = list.get(i2);
        C18303ob c18303ob2 = list4.get(i3 - 1);
        if (i == c18303ob.mo78736j()) {
            int iIntValue = list5.get(i2).intValue();
            int i9 = i2 + 1;
            C18303ob c18303ob3 = list4.get(i9);
            i4 = i9;
            i5 = iIntValue;
            c18303ob = c18303ob3;
        } else {
            i4 = i2;
            i5 = -1;
        }
        long j4 = 2;
        if (c18303ob.mo78716a(i) != c18303ob2.mo78716a(i)) {
            int i10 = 1;
            for (int i11 = i4 + 1; i11 < i3; i11++) {
                if (list4.get(i11 - 1).mo78716a(i) != list4.get(i11).mo78716a(i)) {
                    i10++;
                }
            }
            long jM80070a = j + ((long) m80070a(c18261lb)) + 2 + ((long) (i10 * 2));
            c18261lb.writeInt(i10);
            c18261lb.writeInt(i5);
            for (int i12 = i4; i12 < i3; i12++) {
                byte bMo78716a = list4.get(i12).mo78716a(i);
                if (i12 == i4 || bMo78716a != list4.get(i12 - 1).mo78716a(i)) {
                    c18261lb.writeInt(bMo78716a & 255);
                }
            }
            C18261lb c18261lb2 = new C18261lb();
            int i13 = i4;
            while (i13 < i3) {
                byte bMo78716a2 = list4.get(i13).mo78716a(i);
                int i14 = i13 + 1;
                int i15 = i14;
                while (true) {
                    if (i15 >= i3) {
                        i15 = i3;
                        break;
                    } else if (bMo78716a2 != list4.get(i15).mo78716a(i)) {
                        break;
                    } else {
                        i15++;
                    }
                }
                if (i14 != i15 || i + 1 != list4.get(i13).mo78736j()) {
                    c18261lb.writeInt((int) ((((long) m80070a(c18261lb2)) + jM80070a) * (-1)));
                    list3 = list5;
                    j3 = jM80070a;
                    i7 = i15;
                    m80072a(j3, c18261lb2, i + 1, list, i13, i7, list3);
                    list4 = list;
                } else {
                    c18261lb.writeInt(list5.get(i13).intValue());
                    list3 = list5;
                    j3 = jM80070a;
                    i7 = i15;
                }
                jM80070a = j3;
                i13 = i7;
                list5 = list3;
            }
            c18261lb.mo78029b(c18261lb2, c18261lb2.m79076B());
            return;
        }
        int iMin = Math.min(c18303ob.mo78736j(), c18303ob2.mo78736j());
        int i16 = 0;
        int i17 = i;
        while (true) {
            if (i17 >= iMin) {
                j2 = j4;
                break;
            }
            j2 = j4;
            if (c18303ob.mo78716a(i17) != c18303ob2.mo78716a(i17)) {
                break;
            }
            i16++;
            i17++;
            j4 = j2;
        }
        long jM80070a2 = j + ((long) m80070a(c18261lb)) + j2 + ((long) i16) + 1;
        c18261lb.writeInt(-i16);
        c18261lb.writeInt(i5);
        int i18 = i;
        while (true) {
            i6 = i + i16;
            if (i18 >= i6) {
                break;
            }
            c18261lb.writeInt(c18303ob.mo78716a(i18) & 255);
            i18++;
        }
        if (i4 + 1 == i3) {
            if (i6 != list4.get(i4).mo78736j()) {
                throw new AssertionError();
            }
            c18261lb.writeInt(list5.get(i4).intValue());
        } else {
            C18261lb c18261lb3 = new C18261lb();
            c18261lb.writeInt((int) ((((long) m80070a(c18261lb3)) + jM80070a2) * (-1)));
            m80072a(jM80070a2, c18261lb3, i6, list4, i4, i3, list5);
            c18261lb.mo78029b(c18261lb3, c18261lb3.m79076B());
        }
    }
}
