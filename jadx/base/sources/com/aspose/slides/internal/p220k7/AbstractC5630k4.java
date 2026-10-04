package com.aspose.slides.internal.p220k7;

import com.aspose.slides.internal.p019ac.C1337c5;
import com.aspose.slides.internal.p075d5.AbstractC3024x1;
import com.aspose.slides.internal.p129fe.C3976c5;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p359qf.AbstractC9858kk;
import com.aspose.slides.internal.p359qf.C9856du;
import com.aspose.slides.internal.p374qz.C9966k4;
import com.aspose.slides.internal.p421tk.C10988bz;
import com.aspose.slides.internal.p421tk.C11043yj;
import com.aspose.slides.internal.p436u8.AbstractC11290x1;
import com.aspose.slides.internal.p436u8.C11289k4;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.AbstractC14085qw;

/* JADX INFO: renamed from: com.aspose.slides.internal.k7.k4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5630k4 {

    /* JADX INFO: renamed from: k4 */
    protected final k4 f15446k4;

    /* JADX INFO: renamed from: com.aspose.slides.internal.k7.k4$k4 */
    public static abstract class k4 extends AbstractC14085qw {
        /* JADX INFO: renamed from: k4 */
        public abstract void mo23024k4(C10988bz c10988bz, C9856du c9856du);
    }

    public AbstractC5630k4(final AbstractC5642x1 abstractC5642x1) {
        this.f15446k4 = new k4() { // from class: com.aspose.slides.internal.k7.k4.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(abstractC5642x1) + "Aspose.Metafiles.EmfPlus.Rendering.ConcretePlayers.DrawingPlayers.EmfPlusBaseDrawingRecordPlayer.DrawRecord(Aspose.Metafiles.EmfPlus.Records.EmfPlusRecord,Aspose.Metafiles.EmfPlus.Rendering.EmfPlusRenderingContext)";
            }

            @Override // com.aspose.slides.internal.p220k7.AbstractC5630k4.k4
            /* JADX INFO: renamed from: k4 */
            public void mo23024k4(C10988bz c10988bz, C9856du c9856du) {
                abstractC5642x1.mo23010kk(c10988bz, c9856du);
            }
        };
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo23019k4(AbstractC3024x1 abstractC3024x1, C12025x6[] c12025x6Arr, C11913yj c11913yj, C12007ix c12007ix, C9856du c9856du);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo23020k4(C10988bz c10988bz, C9856du c9856du);

    /* JADX INFO: renamed from: k4 */
    public final void m23021k4(C11043yj c11043yj, C9856du c9856du) {
        C3976c5 c3976c5M48637fa;
        if ((c11043yj.m53455c5() & 4294967295L) != 4294967295L) {
            c9856du.m48639h4((int) c11043yj.m53455c5());
            c3976c5M48637fa = c9856du.m48637fa();
        } else {
            c3976c5M48637fa = null;
        }
        AbstractC11290x1 abstractC11290x1M48662up = c9856du.m48662up();
        C12025x6[] c12025x6ArrM48685k4 = AbstractC9858kk.m48685k4(c11043yj.m53468up());
        C12007ix c12007ixClone = c11043yj.m53456ck().mo62062k4().Clone();
        if (C7019kk.m27469x1(abstractC11290x1M48662up, C11289k4.class)) {
            mo23022k4(((C11289k4) abstractC11290x1M48662up).m54261k4(), c12025x6ArrM48685k4, c12007ixClone.Clone(), c11043yj.m53459jd(), c3976c5M48637fa, c9856du);
            return;
        }
        C11913yj c11913yj = new C11913yj(c12007ixClone.Clone(), c12025x6ArrM48685k4);
        mo23023k4(c12007ixClone.Clone(), c11913yj, 1, c9856du);
        AbstractC3024x1 abstractC3024x1 = (AbstractC3024x1) abstractC11290x1M48662up;
        if (abstractC3024x1.mo12733x1() == 3) {
            C9966k4 c9966k4 = (C9966k4) abstractC3024x1;
            if (c9966k4.mo21941dy() < 96.0f && c9966k4.mo21939c5() < 96.0f) {
                C1337c5 c1337c5M21562k4 = c9966k4.m49083jd().m21562k4();
                float fMo21943h4 = c9966k4.mo21943h4() / ((float) (((double) (c1337c5M21562k4.m7843x1().m58250h4() / 100.0f)) * ((c1337c5M21562k4.m7829dy().m58232k4() & 4294967295L) / (c1337c5M21562k4.m7825c5().m58232k4() & 4294967295L))));
                float fMo21949m9 = c9966k4.mo21949m9() / ((float) (((double) (c1337c5M21562k4.m7843x1().m58256m9() / 100.0f)) * ((c1337c5M21562k4.m7829dy().m58236x1() & 4294967295L) / (4294967295L & c1337c5M21562k4.m7825c5().m58236x1()))));
                C11913yj c11913yj2 = new C11913yj();
                c11913yj2.m55763k4(fMo21943h4, fMo21949m9);
                c11913yj.m55787x1(c11913yj2);
            }
        }
        mo23019k4(abstractC3024x1, c12025x6ArrM48685k4, c11913yj, c12007ixClone.Clone(), c9856du);
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo23022k4(AbstractC12002ck abstractC12002ck, C12025x6[] c12025x6Arr, C12007ix c12007ix, int i, C3976c5 c3976c5, C9856du c9856du);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo23023k4(C12007ix c12007ix, C11913yj c11913yj, int i, C9856du c9856du);
}
