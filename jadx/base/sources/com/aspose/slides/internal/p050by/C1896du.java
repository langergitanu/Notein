package com.aspose.slides.internal.p050by;

import com.aspose.slides.internal.p135fp.C4102rv;
import com.aspose.slides.internal.p262m1.C6304x1;
import com.aspose.slides.internal.p291n4.C6740x1;
import com.aspose.slides.internal.p299ni.InterfaceC6902dy;
import com.aspose.slides.internal.p299ni.InterfaceC6908m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p383rp.AbstractC10031du;
import com.aspose.slides.internal.p383rp.AbstractC10039x1;
import com.aspose.slides.internal.p402sn.C10245x1;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.internal.p550zi.C13617wl;
import com.aspose.slides.internal.p550zi.C13618wy;

/* JADX INFO: renamed from: com.aspose.slides.internal.by.du */
/* JADX INFO: loaded from: classes3.dex */
public class C1896du extends AbstractC10039x1 {

    /* JADX INFO: renamed from: k4 */
    private long f6756k4;

    /* JADX INFO: renamed from: x1 */
    private AbstractC10031du[] f6757x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.by.du$k4 */
    public static class k4 implements InterfaceC6902dy {

        /* JADX INFO: renamed from: k4 */
        private final InterfaceC6908m9 f6758k4;

        /* JADX INFO: renamed from: kk */
        private final C6304x1 f6759kk;

        /* JADX INFO: renamed from: x1 */
        private final long f6760x1;

        public k4(C6304x1 c6304x1, InterfaceC6908m9 interfaceC6908m9, long j) {
            this.f6759kk = c6304x1;
            this.f6758k4 = interfaceC6908m9;
            this.f6760x1 = j;
        }

        @Override // com.aspose.slides.internal.p299ni.InterfaceC6902dy
        /* JADX INFO: renamed from: k4 */
        public void mo9818k4(C12014ne c12014ne) {
            C10245x1 c10245x1 = new C10245x1();
            long jM62853k4 = this.f6759kk.m62853k4();
            this.f6759kk.m62854k4(this.f6760x1 & 4294967295L, 0);
            C4102rv c4102rv = (C4102rv) c10245x1.m50200kk(new C13618wy(this.f6759kk.m62861x1()), null);
            this.f6759kk.m62856k4(jM62853k4);
            this.f6758k4.mo9843k4(c12014ne.Clone(), c4102rv.m62811kk(c12014ne.Clone()), new C12016rv(c12014ne.m56669jd(), c12014ne.m56664ck()), new C12016rv(c12014ne.m56668h4(), c12014ne.m56670k4()));
        }
    }

    public C1896du(C6740x1 c6740x1, int i, int i2) {
        super(c6740x1, i, i2);
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10039x1
    /* JADX INFO: renamed from: k4 */
    public void mo9816k4(C6304x1 c6304x1, C12014ne c12014ne, InterfaceC6908m9 interfaceC6908m9) {
        C13617wl.m62840k4(c12014ne.Clone(), new k4(c6304x1, interfaceC6908m9, this.f6756k4));
    }

    /* JADX INFO: renamed from: k4 */
    public void m9817k4(AbstractC10031du[] abstractC10031duArr) {
        this.f6757x1 = abstractC10031duArr;
        int i = 0;
        while (true) {
            AbstractC10031du[] abstractC10031duArr2 = this.f6757x1;
            if (i >= abstractC10031duArr2.length) {
                return;
            }
            if (abstractC10031duArr2[i].m49298x1() == 513) {
                this.f6756k4 = ((long[]) C7019kk.m27452k4(this.f6757x1[i].mo49287m9(), long[].class))[0];
            }
            i++;
        }
    }
}
