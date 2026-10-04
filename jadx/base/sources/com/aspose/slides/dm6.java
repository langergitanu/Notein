package com.aspose.slides;

import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: loaded from: classes3.dex */
class dm6 {

    /* JADX INFO: renamed from: k4 */
    static final dm6 f4613k4 = new dm6(null, null);

    /* JADX INFO: renamed from: kk */
    private ColorFormat f4614kk;

    /* JADX INFO: renamed from: x1 */
    private C14321pz f4615x1;

    public dm6(C14321pz c14321pz, ColorFormat colorFormat) {
        this.f4615x1 = c14321pz;
        this.f4614kk = colorFormat;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        dm6 dm6Var = (dm6) obj;
        C14321pz c14321pz = this.f4615x1;
        boolean zM69341k4 = c14321pz != null ? c14321pz.m69341k4(dm6Var.f4615x1) : dm6Var.f4615x1 == null;
        ColorFormat colorFormat = this.f4614kk;
        ColorFormat colorFormat2 = dm6Var.f4614kk;
        if (colorFormat != null) {
            return colorFormat.equals(colorFormat2) & zM69341k4;
        }
        return zM69341k4 & (colorFormat2 == null);
    }

    public int hashCode() {
        C14321pz c14321pz = this.f4615x1;
        int iHashCode = c14321pz != null ? c14321pz.hashCode() : 0;
        ColorFormat colorFormat = this.f4614kk;
        return iHashCode + (colorFormat != null ? colorFormat.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C14321pz m5156k4() {
        return this.f4615x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final ColorFormat m5157x1() {
        return this.f4614kk;
    }
}
