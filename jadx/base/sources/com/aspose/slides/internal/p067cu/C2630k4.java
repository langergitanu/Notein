package com.aspose.slides.internal.p067cu;

import com.aspose.slides.internal.p180ib.C4803du;
import com.aspose.slides.internal.p180ib.C4804dy;
import com.aspose.slides.internal.p180ib.InterfaceC4809to;
import com.aspose.slides.internal.p327ov.C7149dy;
import com.aspose.slides.internal.p340pm.C9467to;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12025x6;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.cu.k4 */
/* JADX INFO: loaded from: classes3.dex */
public class C2630k4 {

    /* JADX INFO: renamed from: k4 */
    private C4804dy f8440k4;

    /* JADX INFO: renamed from: com.aspose.slides.internal.cu.k4$k4 */
    public static class k4 implements InterfaceC4809to {

        /* JADX INFO: renamed from: k4 */
        private C2631kk f8441k4;

        /* JADX INFO: renamed from: x1 */
        private C12025x6 f8442x1;

        /* JADX INFO: renamed from: k4 */
        public C2631kk m12018k4(C11896dy c11896dy) {
            int i;
            this.f8441k4 = new C2631kk();
            this.f8442x1 = null;
            C4803du.m19876k4(c11896dy, this);
            if (this.f8442x1 == null) {
                this.f8442x1 = new C12025x6(0.0f, 0.0f);
            }
            Iterator<C2633x1> itM12023to = this.f8441k4.m12023to();
            C12025x6 c12025x6M12036to = itM12023to.next().m12036to();
            if (itM12023to.hasNext() && C9467to.m46529k4(c12025x6M12036to, this.f8442x1, 1.0E-4f)) {
                c12025x6M12036to = itM12023to.next().m12036to();
                i = 2;
            } else {
                i = 1;
            }
            if (C9467to.m46529k4(c12025x6M12036to, this.f8442x1, 1.0E-4f)) {
                c12025x6M12036to = this.f8442x1;
            }
            Iterator<C2633x1> itM12023to2 = this.f8441k4.m12023to();
            for (int i2 = 0; i2 < i; i2++) {
                itM12023to2.next();
                itM12023to2.remove();
            }
            this.f8441k4.m12021k4(C2633x1.m12032x1(this.f8442x1.m56897x1(), this.f8442x1.m56895kk()));
            this.f8441k4.m12021k4(C2633x1.m12029k4(c12025x6M12036to.m56897x1(), c12025x6M12036to.m56895kk()));
            this.f8441k4.m12025x1(C2633x1.m12028k4());
            return this.f8441k4;
        }

        @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
        /* JADX INFO: renamed from: x1 */
        public void mo9602x1() {
        }

        @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
        /* JADX INFO: renamed from: k4 */
        public void mo9584k4() {
        }

        @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
        /* JADX INFO: renamed from: x1 */
        public void mo9603x1(float f, float f2) {
            this.f8441k4.m12025x1(C2633x1.m12032x1(f, f2));
        }

        @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
        /* JADX INFO: renamed from: k4 */
        public void mo9585k4(float f, float f2) {
            this.f8442x1 = new C12025x6(f, f2);
        }

        @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
        /* JADX INFO: renamed from: k4 */
        public void mo9586k4(float f, float f2, float f3, float f4) {
            this.f8441k4.m12025x1(C2633x1.m12030k4(f, f2, f3, f4));
        }

        @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
        /* JADX INFO: renamed from: k4 */
        public void mo9587k4(float f, float f2, float f3, float f4, float f5, float f6) {
            this.f8441k4.m12025x1(C2633x1.m12031k4(f, f2, f3, f4, f5, f6));
        }
    }

    public C2630k4(C4804dy c4804dy) {
        this.f8440k4 = c4804dy;
    }

    /* JADX INFO: renamed from: kk */
    private C2629du m12014kk(C11896dy c11896dy) {
        C2631kk c2631kkM12015to = this.f8440k4.m19879k4().m56908ck() == 0 ? m12015to(c11896dy) : new k4().m12018k4(c11896dy);
        C2629du c2629du = new C2629du();
        c2629du.m12003k4(c2631kkM12015to);
        c2629du.m12013x1((C12025x6) null);
        c2629du.m12010to(null);
        return c2629du;
    }

    /* JADX INFO: renamed from: to */
    private C2631kk m12015to(C11896dy c11896dy) {
        return C2632to.m12026k4(c11896dy);
    }

    /* JADX INFO: renamed from: x1 */
    private C2629du m12016x1(C11896dy c11896dy) {
        return new C7149dy().m27727k4(this.f8440k4, m12015to(c11896dy));
    }

    /* JADX INFO: renamed from: k4 */
    public C2629du m12017k4(C11896dy c11896dy) {
        return c11896dy.m55569rv() ? m12014kk(c11896dy) : m12016x1(c11896dy);
    }
}
