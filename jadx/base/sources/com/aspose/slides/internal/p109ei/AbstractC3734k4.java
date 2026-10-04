package com.aspose.slides.internal.p109ei;

import com.aspose.slides.internal.p069cw.AbstractC2640kk;
import com.aspose.slides.internal.p069cw.C2638du;
import com.aspose.slides.internal.p086dl.C3180k4;
import com.aspose.slides.internal.p129fe.C3976c5;
import com.aspose.slides.internal.p251li.C6045bz;
import com.aspose.slides.internal.p251li.C6100yj;
import com.aspose.slides.internal.p260ly.C6268c5;
import com.aspose.slides.internal.p298nh.AbstractC6888dy;
import com.aspose.slides.internal.p298nh.C6895to;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p500xi.AbstractC12536x1;
import com.aspose.slides.p559ms.System.AbstractC14085qw;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.ei.k4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3734k4 {

    /* JADX INFO: renamed from: k4 */
    protected final k4 f10264k4;

    /* JADX INFO: renamed from: com.aspose.slides.internal.ei.k4$k4 */
    public static abstract class k4 extends AbstractC14085qw {
        /* JADX INFO: renamed from: k4 */
        public abstract void mo15028k4(C6045bz c6045bz, C2638du c2638du);
    }

    public AbstractC3734k4(final AbstractC3746x1 abstractC3746x1) {
        this.f10264k4 = new k4() { // from class: com.aspose.slides.internal.ei.k4.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(abstractC3746x1) + "Aspose.Metafiles.EmfPlus.Rendering.ConcretePlayers.DrawingPlayers.EmfPlusBaseDrawingRecordPlayer.DrawRecord(Aspose.Metafiles.EmfPlus.Records.EmfPlusRecord,Aspose.Metafiles.EmfPlus.Rendering.EmfPlusRenderingContext)";
            }

            @Override // com.aspose.slides.internal.p109ei.AbstractC3734k4.k4
            /* JADX INFO: renamed from: k4 */
            public void mo15028k4(C6045bz c6045bz, C2638du c2638du) {
                abstractC3746x1.mo15013kk(c6045bz, c2638du);
            }
        };
    }

    /* JADX INFO: renamed from: k4 */
    private C12007ix m15022k4(C12025x6[] c12025x6Arr) {
        int length = c12025x6Arr.length;
        if (length == 0) {
            return C12007ix.f40519k4;
        }
        float fM56897x1 = c12025x6Arr[0].m56897x1();
        float fM56895kk = c12025x6Arr[0].m56895kk();
        float fM56897x12 = c12025x6Arr[0].m56897x1();
        float fM56895kk2 = c12025x6Arr[0].m56895kk();
        for (int i = 1; i < length; i++) {
            C12025x6 c12025x6Clone = c12025x6Arr[i].Clone();
            fM56897x1 = C14116yg.m67504x1(fM56897x1, c12025x6Clone.m56897x1());
            fM56895kk = C14116yg.m67504x1(fM56895kk, c12025x6Clone.m56895kk());
            fM56897x12 = C14116yg.m67481k4(fM56897x12, c12025x6Clone.m56897x1());
            fM56895kk2 = C14116yg.m67481k4(fM56895kk2, c12025x6Clone.m56895kk());
        }
        return new C12007ix(fM56897x1, fM56895kk, fM56897x12 - fM56897x1, fM56895kk2 - fM56895kk);
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo15023k4(C6045bz c6045bz, C2638du c2638du);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo15025k4(AbstractC12002ck abstractC12002ck, C12025x6[] c12025x6Arr, C12007ix c12007ix, int i, C3976c5 c3976c5, C2638du c2638du);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo15026k4(C12007ix c12007ix, C11913yj c11913yj, int i, C2638du c2638du);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo15027k4(AbstractC12536x1 abstractC12536x1, C12025x6[] c12025x6Arr, C11913yj c11913yj, C12007ix c12007ix, C2638du c2638du);

    /* JADX INFO: renamed from: k4 */
    public final void m15024k4(C6100yj c6100yj, C2638du c2638du) {
        C3976c5 c3976c5M12074up;
        if ((c6100yj.m24715jd() & 4294967295L) != 4294967295L) {
            c2638du.m12049h4((int) c6100yj.m24715jd());
            c3976c5M12074up = c2638du.m12074up();
        } else {
            c3976c5M12074up = null;
        }
        AbstractC6888dy abstractC6888dyM12081yj = c2638du.m12081yj();
        C12025x6[] c12025x6ArrM12097k4 = AbstractC2640kk.m12097k4(c6100yj.m24729yj());
        C12007ix c12007ixClone = c6100yj.m24714fa().mo19058k4().Clone();
        if (C7019kk.m27469x1(abstractC6888dyM12081yj, C6895to.class)) {
            mo15025k4(((C6895to) abstractC6888dyM12081yj).m27022k4(), c12025x6ArrM12097k4, c12007ixClone.Clone(), c6100yj.m24712ck(), c3976c5M12074up, c2638du);
            return;
        }
        C11913yj c11913yj = new C11913yj(c12007ixClone.Clone(), c12025x6ArrM12097k4);
        AbstractC12536x1 abstractC12536x1 = (AbstractC12536x1) abstractC6888dyM12081yj;
        if (abstractC12536x1.mo13625x1() == 3) {
            C3180k4 c3180k4 = (C3180k4) abstractC12536x1;
            if (c3180k4.mo13501dy() < 96.0f && c3180k4.mo13500c5() < 96.0f) {
                C6268c5 c6268c5M47769k4 = c3180k4.m13619ck().m47769k4();
                float fMo13502h4 = c3180k4.mo13502h4() / ((float) (((double) (c6268c5M47769k4.m25435h4().m57843h4() / 100.0f)) * ((c6268c5M47769k4.m25448rv().m57816k4() & 4294967295L) / (c6268c5M47769k4.m25455x6().m57816k4() & 4294967295L))));
                float fMo13504m9 = c3180k4.mo13504m9() / ((float) (((double) (c6268c5M47769k4.m25435h4().m57849m9() / 100.0f)) * ((c6268c5M47769k4.m25448rv().m57820x1() & 4294967295L) / (4294967295L & c6268c5M47769k4.m25455x6().m57820x1()))));
                C11913yj c11913yj2 = new C11913yj();
                c11913yj2.m55763k4(fMo13502h4, fMo13504m9);
                c11913yj.m55787x1(c11913yj2);
            }
        }
        mo15026k4(m15022k4(c12025x6ArrM12097k4).Clone().Clone(), c11913yj, 1, c2638du);
        mo15027k4(abstractC12536x1, c12025x6ArrM12097k4, c11913yj, c12007ixClone.Clone(), c2638du);
    }
}
