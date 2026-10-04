package o0000oO;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import o0000oo.C24347OooO0o;
import o0000oo.C24348OooO0o0;

/* JADX INFO: renamed from: o0000oO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24309OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList<C24348OooO0o0> f81817OooO00o = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f81818OooO0O0 = new OooO00o();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C24347OooO0o f81819OooO0OO;

    /* JADX INFO: renamed from: o0000oO.OooO0O0$OooO00o */
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public boolean f81820OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public C24348OooO0o0.OooO00o f81821OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public C24348OooO0o0.OooO00o f81822OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f81823OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f81824OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f81825OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f81826OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f81827OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f81828OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f81829OooOO0;
    }

    /* JADX INFO: renamed from: o0000oO.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public interface InterfaceC19609OooO0O0 {
    }

    public C24309OooO0O0(C24347OooO0o c24347OooO0o) {
        this.f81819OooO0OO = c24347OooO0o;
    }

    public final boolean OooO00o(int i, InterfaceC19609OooO0O0 interfaceC19609OooO0O0, C24348OooO0o0 c24348OooO0o0) {
        C24348OooO0o0.OooO00o[] oooO00oArr = c24348OooO0o0.f82039OoooOO0;
        C24348OooO0o0.OooO00o oooO00o = oooO00oArr[0];
        OooO00o oooO00o2 = this.f81818OooO0O0;
        oooO00o2.f81821OooO00o = oooO00o;
        oooO00o2.f81822OooO0O0 = oooO00oArr[1];
        oooO00o2.f81823OooO0OO = c24348OooO0o0.OooOOo0();
        oooO00o2.f81824OooO0Oo = c24348OooO0o0.OooOO0O();
        oooO00o2.f81820OooO = false;
        oooO00o2.f81829OooOO0 = i;
        C24348OooO0o0.OooO00o oooO00o3 = oooO00o2.f81821OooO00o;
        C24348OooO0o0.OooO00o oooO00o4 = C24348OooO0o0.OooO00o.f82065OooOoO0;
        boolean z = oooO00o3 == oooO00o4;
        boolean z2 = oooO00o2.f81822OooO0O0 == oooO00o4;
        boolean z3 = z && c24348OooO0o0.f82042OoooOo0 > 0.0f;
        boolean z4 = z2 && c24348OooO0o0.f82042OoooOo0 > 0.0f;
        C24348OooO0o0.OooO00o oooO00o5 = C24348OooO0o0.OooO00o.f82063OooOo0o;
        int[] iArr = c24348OooO0o0.f82014OooOo00;
        if (z3 && iArr[0] == 4) {
            oooO00o2.f81821OooO00o = oooO00o5;
        }
        if (z4 && iArr[1] == 4) {
            oooO00o2.f81822OooO0O0 = oooO00o5;
        }
        ((ConstraintLayout.OooO0O0) interfaceC19609OooO0O0).OooO0O0(c24348OooO0o0, oooO00o2);
        c24348OooO0o0.Oooo0oo(oooO00o2.f81826OooO0o0);
        c24348OooO0o0.Oooo0o0(oooO00o2.f81825OooO0o);
        c24348OooO0o0.f82023OooOooo = oooO00o2.f81828OooO0oo;
        c24348OooO0o0.Oooo0(oooO00o2.f81827OooO0oO);
        oooO00o2.f81829OooOO0 = 0;
        return oooO00o2.f81820OooO;
    }

    public final void OooO0O0(C24347OooO0o c24347OooO0o, int i, int i2, int i3) {
        int i4 = c24347OooO0o.f82047OooooO0;
        int i5 = c24347OooO0o.f82048OooooOO;
        c24347OooO0o.f82047OooooO0 = 0;
        c24347OooO0o.f82048OooooOO = 0;
        c24347OooO0o.Oooo0oo(i2);
        c24347OooO0o.Oooo0o0(i3);
        if (i4 < 0) {
            c24347OooO0o.f82047OooooO0 = 0;
        } else {
            c24347OooO0o.f82047OooooO0 = i4;
        }
        if (i5 < 0) {
            c24347OooO0o.f82048OooooOO = 0;
        } else {
            c24347OooO0o.f82048OooooOO = i5;
        }
        C24347OooO0o c24347OooO0o2 = this.f81819OooO0OO;
        c24347OooO0o2.f81989o0ooOO0 = i;
        c24347OooO0o2.OoooO0();
    }

    public final void OooO0OO(C24347OooO0o c24347OooO0o) {
        ArrayList<C24348OooO0o0> arrayList = this.f81817OooO00o;
        arrayList.clear();
        int size = c24347OooO0o.f82127oo000o.size();
        for (int i = 0; i < size; i++) {
            C24348OooO0o0 c24348OooO0o0 = c24347OooO0o.f82127oo000o.get(i);
            C24348OooO0o0.OooO00o[] oooO00oArr = c24348OooO0o0.f82039OoooOO0;
            C24348OooO0o0.OooO00o oooO00o = oooO00oArr[0];
            C24348OooO0o0.OooO00o oooO00o2 = C24348OooO0o0.OooO00o.f82065OooOoO0;
            if (oooO00o == oooO00o2 || oooO00oArr[1] == oooO00o2) {
                arrayList.add(c24348OooO0o0);
            }
        }
        c24347OooO0o.f81983o00oO0O.f81854OooO0O0 = true;
    }
}
