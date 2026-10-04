package o0oo0oO0;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o0oo0ooO.InterfaceC31408OooO0OO;

/* JADX INFO: renamed from: o0oo0oO0.OooOo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C31355OooOo00 extends C31352OooOOo0 {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final float f111961OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f111962OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final float f111963OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final List<Object> f111964OooOOOO;

    public C31355OooOo00(InterfaceC31408OooO0OO interfaceC31408OooO0OO, String str, String str2, List list, int i, int i2) {
        super(interfaceC31408OooO0OO, str, str2);
        this.f111962OooOOO = 0;
        this.f111964OooOOOO = list;
        this.f111961OooOO0o = i;
        this.f111963OooOOO0 = i2;
        this.f111954OooOO0 = new ArrayList();
        this.f111962OooOOO = 0;
        new C31353OooOOoo(this).OooOo(list);
    }

    public static ArrayList OooOOO(int i, List list) {
        int size = list.size() / i;
        ArrayList arrayList = new ArrayList(size);
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 * i;
            i2++;
            arrayList.add(list.subList(i3, i2 * i));
        }
        return arrayList;
    }

    public final List OooO(ArrayList arrayList, boolean z) {
        if (this.f111954OooOO0.isEmpty()) {
            if (z) {
                OooO0oO(Arrays.asList(Float.valueOf(0.0f), Float.valueOf(((Number) arrayList.get(0)).floatValue() + this.f111963OooOOO0)), new C31349OooOOOO(13));
                return arrayList.subList(1, arrayList.size());
            }
            OooO0oO(Arrays.asList(Float.valueOf(0.0f), Float.valueOf(this.f111961OooOO0o)), new C31349OooOOOO(13));
        }
        return arrayList;
    }

    public final void OooO0oO(List<Number> list, C31349OooOOOO c31349OooOOOO) {
        this.f111954OooOO0.addAll(list);
        this.f111954OooOO0.add(c31349OooOOOO);
    }

    public final void OooO0oo(List<List<Number>> list, C31349OooOOOO c31349OooOOOO) {
        Iterator<List<Number>> it = list.iterator();
        while (it.hasNext()) {
            OooO0oO(it.next(), c31349OooOOOO);
        }
    }

    public final void OooOO0() {
        C31349OooOOOO c31349OooOOOO = this.f111962OooOOO > 0 ? (C31349OooOOOO) C21505OooO0Oo.OooO00o(1, this.f111954OooOO0) : null;
        C31349OooOOOO c31349OooOOOO2 = new C31349OooOOOO(9);
        if (c31349OooOOOO == null || c31349OooOOOO2.equals(c31349OooOOOO)) {
            return;
        }
        OooO0oO(Collections.EMPTY_LIST, c31349OooOOOO2);
    }

    public final void OooOO0O(ArrayList arrayList, boolean z) {
        int i;
        int i2;
        int i3 = 2;
        int i4 = 5;
        List listSubList = arrayList;
        boolean z2 = z;
        while (listSubList.size() >= 4) {
            boolean z3 = listSubList.size() == i4;
            if (z2) {
                Number number = (Number) listSubList.get(0);
                Number number2 = (Number) listSubList.get(1);
                Number number3 = (Number) listSubList.get(i3);
                Number number4 = z3 ? (Number) listSubList.get(4) : 0;
                Number number5 = (Number) listSubList.get(3);
                i = i4;
                Number[] numberArr = new Number[6];
                numberArr[0] = number;
                numberArr[1] = 0;
                numberArr[i3] = number2;
                numberArr[3] = number3;
                numberArr[4] = number4;
                numberArr[i] = number5;
                OooO0oO(Arrays.asList(numberArr), new C31349OooOOOO(8));
                i2 = i3;
            } else {
                i = i4;
                Number number6 = (Number) listSubList.get(0);
                Number number7 = (Number) listSubList.get(1);
                Number number8 = (Number) listSubList.get(i3);
                Number number9 = (Number) listSubList.get(3);
                Number number10 = z3 ? (Number) listSubList.get(4) : 0;
                i2 = i3;
                Number[] numberArr2 = new Number[6];
                numberArr2[0] = 0;
                numberArr2[1] = number6;
                numberArr2[i2] = number7;
                numberArr2[3] = number8;
                numberArr2[4] = number9;
                numberArr2[i] = number10;
                OooO0oO(Arrays.asList(numberArr2), new C31349OooOOOO(8));
            }
            listSubList = listSubList.subList(z3 ? i : 4, listSubList.size());
            z2 = !z2;
            i3 = i2;
            i4 = i;
        }
    }

    public final void OooOO0o(ArrayList arrayList, boolean z) {
        for (List listSubList = arrayList; !listSubList.isEmpty(); listSubList = listSubList.subList(1, listSubList.size())) {
            OooO0oO(listSubList.subList(0, 1), new C31349OooOOOO(z ? 6 : 7));
            z = !z;
        }
    }

    public final void OooOOO0(ArrayList arrayList, boolean z) {
        int i;
        int i2;
        int i3 = 2;
        List listSubList = arrayList;
        while (listSubList.size() >= 4) {
            int i4 = listSubList.size() % 4 == 1 ? 1 : 0;
            if (z) {
                Number number = (Number) listSubList.get(i4);
                Number number2 = i4 != 0 ? (Number) listSubList.get(0) : 0;
                Number number3 = (Number) listSubList.get(i4 != 0 ? i3 : 1);
                Number number4 = (Number) listSubList.get(i4 != 0 ? 3 : i3);
                Number number5 = (Number) listSubList.get(i4 != 0 ? 4 : 3);
                i = 5;
                Number[] numberArr = new Number[6];
                numberArr[0] = number;
                numberArr[1] = number2;
                numberArr[i3] = number3;
                numberArr[3] = number4;
                numberArr[4] = number5;
                numberArr[5] = 0;
                OooO0oO(Arrays.asList(numberArr), new C31349OooOOOO(8));
                i2 = i3;
            } else {
                i = 5;
                Number number6 = i4 != 0 ? (Number) listSubList.get(0) : 0;
                Number number7 = (Number) listSubList.get(i4);
                Number number8 = (Number) listSubList.get(i4 != 0 ? i3 : 1);
                Number number9 = (Number) listSubList.get(i4 != 0 ? 3 : i3);
                Number number10 = (Number) listSubList.get(i4 != 0 ? 4 : 3);
                i2 = i3;
                Number[] numberArr2 = new Number[6];
                numberArr2[0] = number6;
                numberArr2[1] = number7;
                numberArr2[i2] = number8;
                numberArr2[3] = number9;
                numberArr2[4] = 0;
                numberArr2[5] = number10;
                OooO0oO(Arrays.asList(numberArr2), new C31349OooOOOO(8));
            }
            listSubList = listSubList.subList(i4 != 0 ? i : 4, listSubList.size());
            i3 = i2;
        }
    }
}
