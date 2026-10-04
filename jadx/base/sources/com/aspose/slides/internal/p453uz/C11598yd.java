package com.aspose.slides.internal.p453uz;

import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.AbstractC5803to;
import com.aspose.slides.internal.p231kk.C5813x1;
import com.aspose.slides.internal.p297ne.C6884yj;
import com.aspose.slides.internal.p447up.AbstractC11535k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.uz.yd */
/* JADX INFO: loaded from: classes4.dex */
public class C11598yd extends C6884yj {

    /* JADX INFO: renamed from: kk */
    private boolean f39151kk;

    /* JADX INFO: renamed from: x1 */
    private boolean f39152x1;

    public C11598yd(float f, int i) {
        super(f, i);
    }

    /* JADX INFO: renamed from: du */
    public static C11598yd m54611du() {
        C11598yd c11598yd = new C11598yd(0.0f, 0);
        c11598yd.f39152x1 = true;
        return c11598yd;
    }

    /* JADX INFO: renamed from: h4 */
    public static C11598yd m54612h4() {
        C11598yd c11598yd = new C11598yd(0.0f, 0);
        c11598yd.f39151kk = true;
        return c11598yd;
    }

    /* JADX INFO: renamed from: k4 */
    public static C11598yd m54613k4(AbstractC5788h4 abstractC5788h4) {
        AbstractC5803to abstractC5803to = (AbstractC5803to) abstractC5788h4;
        if (abstractC5803to.m23700k4() == 21) {
            if (C5813x1.k4.f16548yd == abstractC5803to) {
                return m54611du();
            }
            if (C5813x1.k4.f16368s4 == abstractC5803to) {
                return new C11598yd(Float.POSITIVE_INFINITY, 0);
            }
            if (C5813x1.k4.f15898b3 == abstractC5803to) {
                return m54612h4();
            }
        }
        return m54614k4((AbstractC11535k4) abstractC5788h4);
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m54615kk() {
        return this.f39152x1;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m54616to() {
        return this.f39151kk;
    }

    @Override // com.aspose.slides.internal.p297ne.C6884yj
    public String toString() {
        return m54615kk() ? "auto" : m54616to() ? "none" : super.toString();
    }

    /* JADX INFO: renamed from: k4 */
    public static C11598yd m54614k4(AbstractC11535k4 abstractC11535k4) {
        short sM23700k4 = abstractC11535k4.m23700k4();
        switch (sM23700k4) {
            case 2:
                return new C11598yd(abstractC11535k4.mo23699k4((short) 2), 1);
            case 3:
                return new C11598yd(abstractC11535k4.mo23699k4((short) 3), 2);
            case 4:
                return new C11598yd(abstractC11535k4.mo23699k4((short) 4), 3);
            case 5:
                return new C11598yd(abstractC11535k4.mo23699k4((short) 5), 4);
            case 6:
                return new C11598yd(abstractC11535k4.mo23699k4((short) 6), 5);
            case 7:
                return new C11598yd(abstractC11535k4.mo23699k4((short) 7), 6);
            case 8:
                return new C11598yd(abstractC11535k4.mo23699k4((short) 8), 7);
            case 9:
                return new C11598yd(abstractC11535k4.mo23699k4((short) 9), 8);
            case 10:
                return new C11598yd(abstractC11535k4.mo23699k4((short) 10), 9);
            case 11:
                return new C11598yd(abstractC11535k4.mo23699k4((short) 10), 10);
            case 12:
                return new C11598yd(abstractC11535k4.mo23699k4((short) 10), 11);
            case 13:
                return new C11598yd(abstractC11535k4.mo23699k4((short) 10), 12);
            case 14:
                return new C11598yd(abstractC11535k4.mo23699k4((short) 10), 13);
            case 15:
                return new C11598yd(abstractC11535k4.mo23699k4((short) 10), 14);
            case 16:
                return new C11598yd(abstractC11535k4.mo23699k4((short) 10), 15);
            case 17:
                return new C11598yd(abstractC11535k4.mo23699k4((short) 10), 16);
            default:
                switch (sM23700k4) {
                    case 26:
                        return new C11598yd(abstractC11535k4.mo23699k4((short) 10), 17);
                    case 27:
                        return new C11598yd(abstractC11535k4.mo23699k4((short) 10), 18);
                    case 28:
                        return new C11598yd(abstractC11535k4.mo23699k4((short) 10), 19);
                    default:
                        return new C11598yd(abstractC11535k4.mo23699k4((short) 1), 0);
                }
        }
    }
}
