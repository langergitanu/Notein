package o0oo0oO0;

import OooOOO0.AbstractC20449OooO0Oo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: o0oo0oO0.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31353OooOOoo extends AbstractC20449OooO0Oo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C31355OooOo00 f111957OooOo0o;

    public C31353OooOOoo(C31355OooOo00 c31355OooOo00) {
        this.f111957OooOo0o = c31355OooOo00;
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final List OooOo0o(ArrayList arrayList, C31349OooOOOO c31349OooOOOO) {
        boolean z = true;
        C31355OooOo00 c31355OooOo00 = this.f111957OooOo0o;
        c31355OooOo00.f111955OooOO0O++;
        String str = C31349OooOOOO.f111938OooO0OO.get(c31349OooOOOO.f111939OooO00o);
        if ("hstem".equals(str)) {
            c31355OooOo00.OooO(arrayList, arrayList.size() % 2 != 0);
            return null;
        }
        if ("vstem".equals(str)) {
            c31355OooOo00.OooO(arrayList, arrayList.size() % 2 != 0);
            return null;
        }
        if ("vmoveto".equals(str)) {
            List listOooO = c31355OooOo00.OooO(arrayList, arrayList.size() > 1);
            if (c31355OooOo00.f111962OooOOO > 0) {
                c31355OooOo00.OooOO0();
            }
            c31355OooOo00.f111962OooOOO++;
            c31355OooOo00.OooO0oO(listOooO, c31349OooOOOO);
            return null;
        }
        if ("rlineto".equals(str)) {
            c31355OooOo00.OooO0oo(C31355OooOo00.OooOOO(2, arrayList), c31349OooOOOO);
            return null;
        }
        if ("hlineto".equals(str)) {
            c31355OooOo00.OooOO0o(arrayList, true);
            return null;
        }
        if ("vlineto".equals(str)) {
            c31355OooOo00.OooOO0o(arrayList, false);
            return null;
        }
        if ("rrcurveto".equals(str)) {
            c31355OooOo00.OooO0oo(C31355OooOo00.OooOOO(6, arrayList), c31349OooOOOO);
            return null;
        }
        if ("endchar".equals(str)) {
            if (arrayList.size() != 5 && arrayList.size() != 1) {
                z = false;
            }
            List listOooO2 = c31355OooOo00.OooO(arrayList, z);
            c31355OooOo00.OooOO0();
            if (listOooO2.size() != 4) {
                c31355OooOo00.OooO0oO(listOooO2, c31349OooOOOO);
                return null;
            }
            listOooO2.add(0, 0);
            c31355OooOo00.OooO0oO(listOooO2, new C31349OooOOOO(12, 6));
            return null;
        }
        if ("rmoveto".equals(str)) {
            List listOooO3 = c31355OooOo00.OooO(arrayList, arrayList.size() > 2);
            if (c31355OooOo00.f111962OooOOO > 0) {
                c31355OooOo00.OooOO0();
            }
            c31355OooOo00.f111962OooOOO++;
            c31355OooOo00.OooO0oO(listOooO3, c31349OooOOOO);
            return null;
        }
        if ("hmoveto".equals(str)) {
            List listOooO4 = c31355OooOo00.OooO(arrayList, arrayList.size() > 1);
            if (c31355OooOo00.f111962OooOOO > 0) {
                c31355OooOo00.OooOO0();
            }
            c31355OooOo00.f111962OooOOO++;
            c31355OooOo00.OooO0oO(listOooO4, c31349OooOOOO);
            return null;
        }
        if ("vhcurveto".equals(str)) {
            c31355OooOo00.OooOO0O(arrayList, false);
            return null;
        }
        if ("hvcurveto".equals(str)) {
            c31355OooOo00.OooOO0O(arrayList, true);
            return null;
        }
        if ("hflex".equals(str)) {
            c31355OooOo00.OooO0oo(Arrays.asList(Arrays.asList((Number) arrayList.get(0), 0, (Number) arrayList.get(1), (Number) arrayList.get(2), (Number) arrayList.get(3), 0), Arrays.asList((Number) arrayList.get(4), 0, (Number) arrayList.get(5), Float.valueOf(-((Number) arrayList.get(2)).floatValue()), (Number) arrayList.get(6), 0)), new C31349OooOOOO(8));
            return null;
        }
        if ("flex".equals(str)) {
            c31355OooOo00.OooO0oo(Arrays.asList(arrayList.subList(0, 6), arrayList.subList(6, 12)), new C31349OooOOOO(8));
            return null;
        }
        if ("hflex1".equals(str)) {
            c31355OooOo00.OooO0oo(Arrays.asList(Arrays.asList((Number) arrayList.get(0), (Number) arrayList.get(1), (Number) arrayList.get(2), (Number) arrayList.get(3), (Number) arrayList.get(4), 0), Arrays.asList((Number) arrayList.get(5), 0, (Number) arrayList.get(6), (Number) arrayList.get(7), (Number) arrayList.get(8), 0)), new C31349OooOOOO(8));
            return null;
        }
        if ("flex1".equals(str)) {
            int iIntValue = 0;
            int iIntValue2 = 0;
            for (int i = 0; i < 5; i++) {
                int i2 = i * 2;
                iIntValue += ((Number) arrayList.get(i2)).intValue();
                iIntValue2 += ((Number) arrayList.get(i2 + 1)).intValue();
            }
            c31355OooOo00.OooO0oo(Arrays.asList(arrayList.subList(0, 6), Arrays.asList((Number) arrayList.get(6), (Number) arrayList.get(7), (Number) arrayList.get(8), (Number) arrayList.get(9), Math.abs(iIntValue) > Math.abs(iIntValue2) ? (Number) arrayList.get(10) : Integer.valueOf(-iIntValue), Math.abs(iIntValue) > Math.abs(iIntValue2) ? Integer.valueOf(-iIntValue2) : (Number) arrayList.get(10))), new C31349OooOOOO(8));
            return null;
        }
        if ("hstemhm".equals(str)) {
            c31355OooOo00.OooO(arrayList, arrayList.size() % 2 != 0);
            return null;
        }
        if ("hintmask".equals(str) || "cntrmask".equals(str)) {
            c31355OooOo00.OooO(arrayList, arrayList.size() % 2 != 0).isEmpty();
            return null;
        }
        if ("vstemhm".equals(str)) {
            c31355OooOo00.OooO(arrayList, arrayList.size() % 2 != 0);
            return null;
        }
        if ("rcurveline".equals(str)) {
            if (arrayList.size() < 2) {
                return null;
            }
            c31355OooOo00.OooO0oo(C31355OooOo00.OooOOO(6, arrayList.subList(0, arrayList.size() - 2)), new C31349OooOOOO(8));
            c31355OooOo00.OooO0oO(arrayList.subList(arrayList.size() - 2, arrayList.size()), new C31349OooOOOO(5));
            return null;
        }
        if ("rlinecurve".equals(str)) {
            if (arrayList.size() < 6) {
                return null;
            }
            c31355OooOo00.OooO0oo(C31355OooOo00.OooOOO(2, arrayList.subList(0, arrayList.size() - 6)), new C31349OooOOOO(5));
            c31355OooOo00.OooO0oO(arrayList.subList(arrayList.size() - 6, arrayList.size()), new C31349OooOOOO(8));
            return null;
        }
        if ("vvcurveto".equals(str)) {
            c31355OooOo00.OooOOO0(arrayList, false);
            return null;
        }
        if ("hhcurveto".equals(str)) {
            c31355OooOo00.OooOOO0(arrayList, true);
            return null;
        }
        c31355OooOo00.OooO0oO(arrayList, c31349OooOOOO);
        return null;
    }
}
