package com.aspose.slides.internal.p150gi;

import com.aspose.slides.internal.p057c6.InterfaceC1984kk;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.internal.gi.m9 */
/* JADX INFO: loaded from: classes.dex */
public class C4285m9 {

    /* JADX INFO: renamed from: du */
    public InterfaceC1984kk f11696du;

    /* JADX INFO: renamed from: k4 */
    public int f11697k4;

    /* JADX INFO: renamed from: kk */
    public InterfaceC1984kk f11698kk;

    /* JADX INFO: renamed from: to */
    public InterfaceC1984kk f11699to;

    /* JADX INFO: renamed from: x1 */
    public InterfaceC1984kk f11700x1;

    public C4285m9(AbstractC3533um abstractC3533um) {
        this.f11697k4 = abstractC3533um.m14385du(1).mo17251du();
        this.f11700x1 = abstractC3533um.m14385du(StyleIdentifier.MEDIUM_GRID_1_ACCENT_6).mo9877dy();
        this.f11699to = abstractC3533um.m14385du(57).mo9877dy();
        this.f11696du = abstractC3533um.m14385du(140).mo9877dy();
        this.f11698kk = abstractC3533um.m14385du(211).mo9877dy();
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp("CommonAbsolutePosition{");
        c6765kp.m26792k4(" absPos=");
        c6765kp.m26805kk(this.f11697k4);
        c6765kp.m26792k4(" top=");
        c6765kp.m26791k4(this.f11700x1);
        c6765kp.m26792k4(" bottom=");
        c6765kp.m26791k4(this.f11699to);
        c6765kp.m26792k4(" left=");
        c6765kp.m26791k4(this.f11696du);
        c6765kp.m26792k4(" right=");
        c6765kp.m26791k4(this.f11698kk);
        c6765kp.m26792k4("}");
        return c6765kp.toString();
    }
}
