package com.aspose.slides.internal.p191it;

import com.aspose.slides.internal.p143g4.C4201h4;
import com.aspose.slides.internal.p183ij.C5061vw;
import com.aspose.slides.p559ms.System.AbstractC14085qw;

/* JADX INFO: renamed from: com.aspose.slides.internal.it.up */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5129up {

    /* JADX INFO: renamed from: k4 */
    protected final k4 f14077k4;

    /* JADX INFO: renamed from: x1 */
    protected final x1 f14078x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.it.up$k4 */
    public static abstract class k4 extends AbstractC14085qw {
        /* JADX INFO: renamed from: k4 */
        public abstract void mo21987k4(C5061vw c5061vw, C4201h4 c4201h4);
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.it.up$x1 */
    public static abstract class x1 extends AbstractC14085qw {
        /* JADX INFO: renamed from: k4 */
        public abstract boolean mo21988k4(C5061vw c5061vw, C4201h4 c4201h4);
    }

    public AbstractC5129up(final AbstractC5120du abstractC5120du) {
        this.f14077k4 = new k4() { // from class: com.aspose.slides.internal.it.up.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(abstractC5120du) + "Aspose.Metafiles.Emf.Rendering.ConcretePlayers.BaseDrawingRecordPlayer.DrawRecord(Aspose.Metafiles.Emf.Records.EmfRecord,Aspose.Metafiles.Emf.Rendering.EmfRenderingContext)";
            }

            @Override // com.aspose.slides.internal.p191it.AbstractC5129up.k4
            /* JADX INFO: renamed from: k4 */
            public void mo21987k4(C5061vw c5061vw, C4201h4 c4201h4) {
                abstractC5120du.mo16615du(c5061vw, c4201h4);
            }
        };
        this.f14078x1 = new x1() { // from class: com.aspose.slides.internal.it.up.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(abstractC5120du) + "Aspose.Metafiles.Emf.Rendering.ConcretePlayers.BaseDrawingRecordPlayer.ShouldApplyRop2(Aspose.Metafiles.Emf.Records.EmfRecord,Aspose.Metafiles.Emf.Rendering.EmfRenderingContext)";
            }

            @Override // com.aspose.slides.internal.p191it.AbstractC5129up.x1
            /* JADX INFO: renamed from: k4 */
            public boolean mo21988k4(C5061vw c5061vw, C4201h4 c4201h4) {
                return abstractC5120du.mo16667h4(c5061vw, c4201h4);
            }
        };
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo16643k4(C5061vw c5061vw, C4201h4 c4201h4);

    /* JADX INFO: renamed from: kk */
    public abstract void mo16645kk(C5061vw c5061vw, C4201h4 c4201h4);

    /* JADX INFO: renamed from: x1 */
    public abstract void mo16646x1(C5061vw c5061vw, C4201h4 c4201h4);
}
