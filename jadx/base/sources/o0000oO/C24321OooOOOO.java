package o0000oO;

import Oooo0oO.C21023OooO0Oo;
import Oooo0oO.C21111o0ooOoO;
import com.aspose.slides.C22226Oooo0oo;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import o0000.C24041OooO0Oo;
import o0000oo.C24344OooO0O0;
import o0000oo.C24347OooO0o;
import o0000oo.C24348OooO0o0;

/* JADX INFO: renamed from: o0000oO.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24321OooOOOO {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static int f81868OooO0o;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public ArrayList<C24348OooO0o0> f81869OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f81870OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f81871OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ArrayList<OooO00o> f81872OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f81873OooO0o0;

    /* JADX INFO: renamed from: o0000oO.OooOOOO$OooO00o */
    public static class OooO00o {
    }

    public final void OooO00o(ArrayList<C24321OooOOOO> arrayList) {
        int size = this.f81869OooO00o.size();
        if (this.f81873OooO0o0 != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C24321OooOOOO c24321OooOOOO = arrayList.get(i);
                if (this.f81873OooO0o0 == c24321OooOOOO.f81870OooO0O0) {
                    OooO0OO(this.f81871OooO0OO, c24321OooOOOO);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int OooO0O0(C24041OooO0Oo c24041OooO0Oo, int i) {
        int iOooOOO;
        int iOooOOO2;
        ArrayList<C24348OooO0o0> arrayList = this.f81869OooO00o;
        if (arrayList.size() == 0) {
            return 0;
        }
        C24347OooO0o c24347OooO0o = (C24347OooO0o) arrayList.get(0).f82054o000oOoO;
        c24041OooO0Oo.OooOo00();
        c24347OooO0o.OooO0O0(c24041OooO0Oo, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList.get(i2).OooO0O0(c24041OooO0Oo, false);
        }
        if (i == 0 && c24347OooO0o.f81992oo0o0Oo > 0) {
            C24344OooO0O0.OooO00o(c24347OooO0o, c24041OooO0Oo, arrayList, 0);
        }
        if (i == 1 && c24347OooO0o.f81985o0O0O00 > 0) {
            C24344OooO0O0.OooO00o(c24347OooO0o, c24041OooO0Oo, arrayList, 1);
        }
        try {
            c24041OooO0Oo.OooOOOo();
        } catch (Exception e) {
            System.err.println(e.toString() + IOUtils.LINE_SEPARATOR_UNIX + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.f81872OooO0Oo = new ArrayList<>();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C24348OooO0o0 c24348OooO0o0 = arrayList.get(i3);
            OooO00o oooO00o = new OooO00o();
            new WeakReference(c24348OooO0o0);
            C24041OooO0Oo.OooOOO(c24348OooO0o0.f82029Oooo0O0);
            C24041OooO0Oo.OooOOO(c24348OooO0o0.f82030Oooo0OO);
            C24041OooO0Oo.OooOOO(c24348OooO0o0.f82032Oooo0o0);
            C24041OooO0Oo.OooOOO(c24348OooO0o0.f82031Oooo0o);
            C24041OooO0Oo.OooOOO(c24348OooO0o0.f82033Oooo0oO);
            this.f81872OooO0Oo.add(oooO00o);
        }
        if (i == 0) {
            iOooOOO = C24041OooO0Oo.OooOOO(c24347OooO0o.f82029Oooo0O0);
            iOooOOO2 = C24041OooO0Oo.OooOOO(c24347OooO0o.f82032Oooo0o0);
            c24041OooO0Oo.OooOo00();
        } else {
            iOooOOO = C24041OooO0Oo.OooOOO(c24347OooO0o.f82030Oooo0OO);
            iOooOOO2 = C24041OooO0Oo.OooOOO(c24347OooO0o.f82031Oooo0o);
            c24041OooO0Oo.OooOo00();
        }
        return iOooOOO2 - iOooOOO;
    }

    public final void OooO0OO(int i, C24321OooOOOO c24321OooOOOO) {
        for (C24348OooO0o0 c24348OooO0o0 : this.f81869OooO00o) {
            ArrayList<C24348OooO0o0> arrayList = c24321OooOOOO.f81869OooO00o;
            if (!arrayList.contains(c24348OooO0o0)) {
                arrayList.add(c24348OooO0o0);
            }
            int i2 = c24321OooOOOO.f81870OooO0O0;
            if (i == 0) {
                c24348OooO0o0.f82058o00o0O = i2;
            } else {
                c24348OooO0o0.f82059o00ooo = i2;
            }
        }
        this.f81873OooO0o0 = c24321OooOOOO.f81870OooO0O0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f81871OooO0OO;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        String strOooO0OO = C21023OooO0Oo.OooO0OO("] <", this.f81870OooO0O0, sb);
        for (C24348OooO0o0 c24348OooO0o0 : this.f81869OooO00o) {
            StringBuilder sbOooO0OO = C22226Oooo0oo.OooO0OO(strOooO0OO, " ");
            sbOooO0OO.append(c24348OooO0o0.f82053Ooooooo);
            strOooO0OO = sbOooO0OO.toString();
        }
        return C21111o0ooOoO.OooO0Oo(strOooO0OO, " >");
    }
}
