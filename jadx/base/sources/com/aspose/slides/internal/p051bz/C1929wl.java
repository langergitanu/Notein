package com.aspose.slides.internal.p051bz;

import com.aspose.slides.internal.p057c6.InterfaceC1979du;
import com.aspose.slides.internal.p057c6.InterfaceC1981h4;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p150gi.AbstractC4282kp;
import com.aspose.slides.internal.p150gi.C4289qw;
import com.aspose.slides.internal.p481wp.C12232rv;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.bz.wl */
/* JADX INFO: loaded from: classes3.dex */
public class C1929wl extends AbstractC1914jd {

    /* JADX INFO: renamed from: com.aspose.slides.internal.bz.wl$k4 */
    public static class k4 implements InterfaceC1979du {
        private k4() {
        }

        @Override // com.aspose.slides.internal.p057c6.InterfaceC1979du
        /* JADX INFO: renamed from: k4 */
        public final int mo9872k4() {
            return 0;
        }

        @Override // com.aspose.slides.internal.p057c6.InterfaceC1979du
        /* JADX INFO: renamed from: x1 */
        public final double mo9874x1() {
            return 1.0d;
        }

        @Override // com.aspose.slides.internal.p057c6.InterfaceC1979du
        /* JADX INFO: renamed from: k4 */
        public final int mo9873k4(InterfaceC1981h4 interfaceC1981h4) {
            return 0;
        }
    }

    @Override // com.aspose.slides.internal.p051bz.InterfaceC1911fa
    /* JADX INFO: renamed from: k4 */
    public int mo9856k4() {
        return 1;
    }

    @Override // com.aspose.slides.internal.p051bz.AbstractC1914jd, com.aspose.slides.internal.p051bz.InterfaceC1911fa
    /* JADX INFO: renamed from: x1 */
    public InterfaceC1979du mo9871x1() {
        return new k4();
    }

    @Override // com.aspose.slides.internal.p051bz.InterfaceC1911fa
    /* JADX INFO: renamed from: k4 */
    public AbstractC4282kp mo9857k4(AbstractC4282kp[] abstractC4282kpArr, C1904ar c1904ar) {
        Object objMo9924m9 = abstractC4282kpArr[0].mo9924m9();
        if (objMo9924m9 == null) {
            throw new C1921qq(C14113y2.m67408k4("Non numeric operand to ", "proportional-column-width() function."));
        }
        AbstractC3533um abstractC3533umM9854to = c1904ar.m9854to();
        if (!C14113y2.m67363du(abstractC3533umM9854to.m14393k4().m14105ks(), "fo:table-column")) {
            throw new C1921qq(C14113y2.m67408k4("proportional-column-width() function ", "may only be used on fo:table-column."));
        }
        if (((C12232rv) abstractC3533umM9854to.m14404x1()).m57094qm()) {
            throw new C1921qq(C14113y2.m67408k4("proportional-column-width() function ", "may only be used when fo:table has ", "table-layout=\"fixed\"."));
        }
        return new C4289qw(C14080ne.m66903fa(objMo9924m9), c1904ar.m9852kk());
    }
}
