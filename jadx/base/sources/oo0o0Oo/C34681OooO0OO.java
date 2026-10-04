package oo0o0Oo;

import java.util.ArrayList;
import java.util.List;
import oo0o0Oo.C34680OooO0O0;

/* JADX INFO: renamed from: oo0o0Oo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C34681OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C34680OooO0O0 f124902OooO00o = new C34680OooO0O0(6, "", null);

    public static final ArrayList OooO00o(List list, int i, int i2) {
        if (i > i2) {
            throw new IllegalArgumentException(("start (" + i + ") should be less than or equal to end (" + i2 + ')').toString());
        }
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Object obj = list.get(i3);
                C34680OooO0O0.C20372OooO0O0 c20372OooO0O0 = (C34680OooO0O0.C20372OooO0O0) obj;
                if (OooO0OO(i, i2, c20372OooO0O0.f124899OooO0O0, c20372OooO0O0.f124900OooO0OO)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i4 = 0; i4 < size2; i4++) {
                C34680OooO0O0.C20372OooO0O0 c20372OooO0O02 = (C34680OooO0O0.C20372OooO0O0) arrayList.get(i4);
                arrayList2.add(new C34680OooO0O0.C20372OooO0O0(Math.max(i, c20372OooO0O02.f124899OooO0O0) - i, Math.min(i2, c20372OooO0O02.f124900OooO0OO) - i, c20372OooO0O02.f124901OooO0Oo, c20372OooO0O02.f124898OooO00o));
            }
            if (!arrayList2.isEmpty()) {
                return arrayList2;
            }
        }
        return null;
    }

    public static final List<C34680OooO0O0.C20372OooO0O0<C34691OooOOO0>> OooO0O0(C34680OooO0O0 c34680OooO0O0, int i, int i2) {
        List<C34680OooO0O0.C20372OooO0O0<C34691OooOOO0>> list;
        if (i == i2 || (list = c34680OooO0O0.f124886OooOo) == null) {
            return null;
        }
        if (i == 0 && i2 >= c34680OooO0O0.f124887OooOo0o.length()) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            C34680OooO0O0.C20372OooO0O0<C34691OooOOO0> c20372OooO0O0 = list.get(i3);
            C34680OooO0O0.C20372OooO0O0<C34691OooOOO0> c20372OooO0O02 = c20372OooO0O0;
            if (OooO0OO(i, i2, c20372OooO0O02.f124899OooO0O0, c20372OooO0O02.f124900OooO0OO)) {
                arrayList.add(c20372OooO0O0);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            C34680OooO0O0.C20372OooO0O0 c20372OooO0O03 = (C34680OooO0O0.C20372OooO0O0) arrayList.get(i4);
            arrayList2.add(new C34680OooO0O0.C20372OooO0O0(c20372OooO0O03.f124898OooO00o, oO0O00oo.OooOO0.OooO0o(c20372OooO0O03.f124899OooO0O0, i, i2) - i, oO0O00oo.OooOO0.OooO0o(c20372OooO0O03.f124900OooO0OO, i, i2) - i));
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean OooO0OO(int i, int i2, int i3, int i4) {
        if (Math.max(i, i3) >= Math.min(i2, i4)) {
            if (i > i3 || i4 > i2) {
                if (i3 <= i && i2 <= i4) {
                    if (i4 == i2) {
                        if ((i == i2) == (i3 == i4)) {
                        }
                    }
                }
                return false;
            }
            if (i2 == i4) {
                if ((i3 == i4) != (i == i2)) {
                }
            }
        }
        return true;
    }
}
