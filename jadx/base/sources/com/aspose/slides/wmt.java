package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p077d8.C3047dy;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
final class wmt {

    /* JADX INFO: renamed from: du */
    private final boolean f49813du;

    /* JADX INFO: renamed from: h4 */
    private final boolean f49814h4;

    /* JADX INFO: renamed from: k4 */
    private final ay6 f49815k4;

    /* JADX INFO: renamed from: kk */
    private final boolean f49816kk;

    /* JADX INFO: renamed from: to */
    private final boolean f49817to;

    /* JADX INFO: renamed from: x1 */
    private final dm1 f49818x1;

    public wmt(ay6 ay6Var, dm1 dm1Var, byte b, boolean z, boolean z2) {
        dm1 dm1Var2 = new dm1();
        this.f49818x1 = dm1Var2;
        if (ay6Var == null) {
            throw new ArgumentNullException("textLayout");
        }
        this.f49815k4 = ay6Var;
        dm1Var.CloneTo(dm1Var2);
        boolean z3 = true;
        boolean z4 = b == 1 && (ay6Var.m3863kk() || ay6Var.m3865to() == 1);
        this.f49816kk = z4;
        if (dm1Var2.f4609k4.length() == 1 && !C14113y2.m67411k4(dm1Var2.f4610kk) && (!z4 ? C3047dy.m12851du(dm1Var2.f4609k4.charAt(0)) : !(!C3047dy.m12888wl(dm1Var2.f4609k4.charAt(0)) || !C3047dy.m12851du(dm1Var2.f4609k4.charAt(0)))) && !C3047dy.m12878ne(dm1Var2.f4610kk.charAt(0))) {
            z2 = false;
        }
        boolean z5 = ((b == 1 && ay6Var.m3863kk()) || ay6Var.m3870yj()) && z2;
        this.f49817to = z5;
        this.f49813du = z5 && C3047dy.m12878ne(dm1Var2.f4610kk.charAt(0));
        if (!z5 && (!ay6Var.m3863kk() || !z)) {
            z3 = false;
        }
        this.f49814h4 = z3;
    }

    /* JADX INFO: renamed from: du */
    public final boolean m72829du() {
        return m72834x1() && !m72832kk();
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m72830h4() {
        return this.f49815k4.m3870yj() && !m72832kk();
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m72831k4() {
        return this.f49816kk;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m72832kk() {
        return this.f49813du;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m72833to() {
        return this.f49814h4;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m72834x1() {
        return this.f49817to;
    }
}
