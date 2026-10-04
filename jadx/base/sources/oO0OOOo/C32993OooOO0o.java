package oO0OOOo;

import java.util.Comparator;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.InterfaceC32609OooOo0;
import oO0O0OO.InterfaceC32627Oooo0oo;
import oO0O0OO.InterfaceC32636OoooOoO;

/* JADX INFO: renamed from: oO0OOOo.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32993OooOO0o implements Comparator<oO0O0OO.OooOO0O> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final C32993OooOO0o f119369OooOo0o = new C32993OooOO0o();

    public static int OooO00o(oO0O0OO.OooOO0O oooOO0O) {
        if (C32982OooO.OooOOO0(oooOO0O)) {
            return 8;
        }
        if (oooOO0O instanceof oO0O0OO.OooOO0) {
            return 7;
        }
        if (oooOO0O instanceof InterfaceC32627Oooo0oo) {
            return ((InterfaceC32627Oooo0oo) oooOO0O).OoooOoo() == null ? 6 : 5;
        }
        if (oooOO0O instanceof InterfaceC32609OooOo0) {
            return ((InterfaceC32609OooOo0) oooOO0O).OoooOoo() == null ? 4 : 3;
        }
        if (oooOO0O instanceof InterfaceC32596OooO0o0) {
            return 2;
        }
        return oooOO0O instanceof InterfaceC32636OoooOoO ? 1 : 0;
    }

    @Override // java.util.Comparator
    public final int compare(oO0O0OO.OooOO0O oooOO0O, oO0O0OO.OooOO0O oooOO0O2) {
        Integer numValueOf;
        oO0O0OO.OooOO0O oooOO0O3 = oooOO0O;
        oO0O0OO.OooOO0O oooOO0O4 = oooOO0O2;
        int iOooO00o = OooO00o(oooOO0O4) - OooO00o(oooOO0O3);
        if (iOooO00o != 0) {
            numValueOf = Integer.valueOf(iOooO00o);
        } else if (C32982OooO.OooOOO0(oooOO0O3) && C32982OooO.OooOOO0(oooOO0O4)) {
            numValueOf = 0;
        } else {
            int iCompareTo = oooOO0O3.getName().f120981OooOo0o.compareTo(oooOO0O4.getName().f120981OooOo0o);
            numValueOf = iCompareTo != 0 ? Integer.valueOf(iCompareTo) : null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
