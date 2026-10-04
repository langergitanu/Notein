package com.aspose.slides.internal.p150gi;

import com.aspose.slides.internal.p057c6.InterfaceC1984kk;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p380ri.C10017to;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.internal.gi.yj */
/* JADX INFO: loaded from: classes.dex */
public class C4313yj {

    /* JADX INFO: renamed from: k4 */
    private int f11751k4 = -1;

    /* JADX INFO: renamed from: kk */
    private final C12003du f11752kk;

    /* JADX INFO: renamed from: to */
    private final InterfaceC1984kk f11753to;

    /* JADX INFO: renamed from: x1 */
    private final int f11754x1;

    private C4313yj(int i, InterfaceC1984kk interfaceC1984kk, C12003du c12003du) {
        C12003du c12003du2 = new C12003du();
        this.f11752kk = c12003du2;
        this.f11754x1 = i;
        this.f11753to = interfaceC1984kk;
        c12003du.CloneTo(c12003du2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C4313yj c4313yj = (C4313yj) C7019kk.m27452k4(obj, C4313yj.class);
        return c4313yj != null && C10017to.m49170k4(this.f11752kk.Clone(), c4313yj.f11752kk.Clone()) && this.f11754x1 == c4313yj.f11754x1 && C10017to.m49170k4(this.f11753to, c4313yj.f11753to);
    }

    public int hashCode() {
        if (this.f11751k4 == -1) {
            int iHashCode = (((629 + (this.f11752kk.m56504dy() ? 0 : this.f11752kk.hashCode())) * 37) + this.f11754x1) * 37;
            InterfaceC1984kk interfaceC1984kk = this.f11753to;
            this.f11751k4 = iHashCode + (interfaceC1984kk != null ? interfaceC1984kk.hashCode() : 0);
        }
        return this.f11751k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m17295k4() {
        return this.f11754x1;
    }

    /* JADX INFO: renamed from: kk */
    public final int m17296kk() {
        int i = this.f11754x1;
        if (i == 95 || i == 57) {
            return 0;
        }
        return this.f11753to.mo9884to();
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp("Outline");
        c6765kp.m26792k4(" {");
        c6765kp.m26805kk(this.f11754x1);
        c6765kp.m26792k4(", ");
        c6765kp.m26791k4(this.f11752kk.Clone());
        c6765kp.m26792k4(", ");
        c6765kp.m26791k4(this.f11753to);
        c6765kp.m26792k4("}");
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public final C12003du m17297x1() {
        return this.f11752kk;
    }

    /* JADX INFO: renamed from: k4 */
    private static C4313yj m17293k4(int i, InterfaceC1984kk interfaceC1984kk, C12003du c12003du) {
        return new C4313yj(i, interfaceC1984kk, c12003du.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public static C4313yj m17294k4(AbstractC3533um abstractC3533um) {
        return m17293k4(abstractC3533um.m14402to(StyleIdentifier.GRID_TABLE_7_COLORFUL).mo17251du(), abstractC3533um.m14402to(StyleIdentifier.GRID_TABLE_6_COLORFUL).mo9877dy(), abstractC3533um.m14402to(StyleIdentifier.GRID_TABLE_1_LIGHT_ACCENT_1).mo9923k4(abstractC3533um.m14393k4().m14111q_()).Clone());
    }
}
