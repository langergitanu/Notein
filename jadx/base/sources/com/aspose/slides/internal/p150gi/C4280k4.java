package com.aspose.slides.internal.p150gi;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p057c6.InterfaceC1979du;
import com.aspose.slides.internal.p057c6.InterfaceC1981h4;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p150gi.C4274g8;

/* JADX INFO: renamed from: com.aspose.slides.internal.gi.k4 */
/* JADX INFO: loaded from: classes.dex */
public class C4280k4 extends C4274g8 {

    /* JADX INFO: renamed from: com.aspose.slides.internal.gi.k4$k4 */
    public static class k4 extends C4274g8.k4 {

        /* JADX INFO: renamed from: m9 */
        private static final C19058k4 f11687m9 = new C19058k4();

        /* JADX INFO: renamed from: com.aspose.slides.internal.gi.k4$k4$k4, reason: collision with other inner class name */
        public static class C19058k4 implements InterfaceC1979du {
            private C19058k4() {
            }

            @Override // com.aspose.slides.internal.p057c6.InterfaceC1979du
            /* JADX INFO: renamed from: k4 */
            public final int mo9872k4() {
                return 1;
            }

            @Override // com.aspose.slides.internal.p057c6.InterfaceC1979du
            /* JADX INFO: renamed from: x1 */
            public final double mo9874x1() {
                return 0.0d;
            }

            @Override // com.aspose.slides.internal.p057c6.InterfaceC1979du
            /* JADX INFO: renamed from: k4 */
            public final int mo9873k4(InterfaceC1981h4 interfaceC1981h4) {
                return 0;
            }
        }

        public k4(int i) {
            super(i);
        }

        @Override // com.aspose.slides.internal.p150gi.AbstractC4275gi
        /* JADX INFO: renamed from: k4 */
        public AbstractC4282kp mo14415k4(AbstractC3533um abstractC3533um, String str, AbstractC3524ks abstractC3524ks) {
            AbstractC4282kp abstractC4282kpMo14415k4 = super.mo14415k4(abstractC3533um, str, abstractC3524ks);
            if (abstractC4282kpMo14415k4.mo17208t_().size() == 1) {
                abstractC4282kpMo14415k4.mo17208t_().insertItem(1, AbstractC3524ks.m14312x1(13).mo14415k4(abstractC3533um, "50%", abstractC3524ks));
            }
            return abstractC4282kpMo14415k4;
        }

        @Override // com.aspose.slides.internal.p150gi.AbstractC4275gi
        /* JADX INFO: renamed from: x1 */
        public InterfaceC1979du mo17231x1(AbstractC3533um abstractC3533um) {
            return f11687m9;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.gi.k4$x1 */
    public static class x1 extends C4262b3 {
        @Override // com.aspose.slides.internal.p150gi.C4262b3, com.aspose.slides.internal.p150gi.InterfaceC4268dq
        /* JADX INFO: renamed from: x1 */
        public AbstractC4282kp mo14062x1(int i, AbstractC4282kp abstractC4282kp, AbstractC4275gi abstractC4275gi, AbstractC3533um abstractC3533um) {
            List<AbstractC4282kp> listMo17208t_ = abstractC4282kp.mo17208t_();
            int i2 = i == 12 ? 0 : i == 13 ? 1 : -1;
            if (i2 >= 0) {
                return abstractC4275gi.mo17139x1(listMo17208t_.get_Item(i2), abstractC3533um, abstractC3533um.m14393k4());
            }
            return null;
        }
    }
}
