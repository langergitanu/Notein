package com.aspose.slides.internal.p313oa;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.oa.v4 */
/* JADX INFO: loaded from: classes4.dex */
class C7006v4 extends AbstractC6994ks {

    /* JADX INFO: renamed from: c5 */
    private int f19052c5;

    @Override // com.aspose.slides.internal.p313oa.AbstractC7002u4
    /* JADX INFO: renamed from: fa */
    public void mo27299fa() {
        if (this.f19049m9 != 1833058592) {
            throw new C7004up();
        }
    }

    @Override // com.aspose.slides.internal.p313oa.AbstractC7002u4
    /* JADX INFO: renamed from: k4 */
    public void mo27374k4(C6990ix c6990ix) {
        long jM27347du = c6990ix.m27347du();
        this.f19049m9 = C7019kk.m27462to(Long.valueOf(c6990ix.m27352kk()), 10);
        mo27299fa();
        this.f19048dy = c6990ix.m27352kk();
        this.f19039x1 = c6990ix.m27349k4();
        this.f19037kk = c6990ix.m27349k4();
        this.f19052c5 = c6990ix.m27356x1();
        long[] jArrM27348du = c6990ix.m27348du(5);
        if (C7019kk.m27435du(Long.valueOf(jArrM27348du[0]), 10) != 0) {
            c6990ix.m27350k4(C7019kk.m27438h4(Long.valueOf(jArrM27348du[0]), 10) + jM27347du);
            m27403k4(m27370kk(), c6990ix);
        }
        if (C7019kk.m27435du(Long.valueOf(jArrM27348du[1]), 10) != 0) {
            c6990ix.m27350k4(C7019kk.m27438h4(Long.valueOf(jArrM27348du[1]), 10) + jM27347du);
            m27367k4(c6990ix.m27355to(12));
        }
        if (C7019kk.m27435du(Long.valueOf(jArrM27348du[2]), 10) != 0) {
            c6990ix.m27350k4(C7019kk.m27438h4(Long.valueOf(jArrM27348du[2]), 10) + jM27347du);
            m27403k4(m27373x1(), c6990ix);
        }
        if (C7019kk.m27435du(Long.valueOf(jArrM27348du[3]), 10) != 0) {
            c6990ix.m27350k4(C7019kk.m27438h4(Long.valueOf(jArrM27348du[3]), 10) + jM27347du);
            m27366k4((byte) 0, (byte) 0).m27332k4(c6990ix);
        }
        if (C7019kk.m27435du(Long.valueOf(jArrM27348du[4]), 10) != 0) {
            c6990ix.m27350k4(C7019kk.m27438h4(Long.valueOf(jArrM27348du[4]), 10) + jM27347du);
            m27403k4(m27369k4(), c6990ix);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m27403k4(AbstractC6981c5[] abstractC6981c5Arr, C6990ix c6990ix) {
        for (byte b = 0; C7019kk.m27462to(Byte.valueOf(b), 6) < abstractC6981c5Arr.length; b = (byte) (b + 1)) {
            long jM27347du = c6990ix.m27347du();
            int iM27462to = C7019kk.m27462to(Long.valueOf(c6990ix.m27352kk()), 10);
            c6990ix.m27350k4(jM27347du);
            if (iM27462to != 1668641398 && iM27462to != 1885434465) {
                throw new NotSupportedException("Only CurveType and ParametricCurveType tags can be here");
            }
            abstractC6981c5Arr[C7019kk.m27462to(Byte.valueOf(b), 6)] = (AbstractC6981c5) AbstractC7002u4.m27400k4(iM27462to);
            abstractC6981c5Arr[C7019kk.m27462to(Byte.valueOf(b), 6)].mo27374k4(c6990ix);
        }
    }
}
