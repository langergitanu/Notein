package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.p559ms.System.AbstractC14071k4;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: renamed from: com.aspose.slides.li */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC13778li implements IDisposable {

    /* JADX INFO: renamed from: k4 */
    protected final AbstractC14278pe f46001k4;

    /* JADX INFO: renamed from: kk */
    protected final boolean f46002kk;

    /* JADX INFO: renamed from: x1 */
    protected C12014ne f46003x1 = new C12014ne();

    public AbstractC13778li(AbstractC14278pe abstractC14278pe, boolean z) {
        this.f46001k4 = abstractC14278pe;
        this.f46002kk = z;
        m64397k4();
        abstractC14278pe.f48035x1.mo27432x1(new AbstractC14071k4<AbstractC14278pe>() { // from class: com.aspose.slides.li.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Export.FramesStream.AnimationPlaying.Players.BasePixelPlayer.OnPositionChanged(Aspose.Slides.Export.FramesStream.AnimationPlaying.IRectNotifiable)";
            }

            @Override // com.aspose.slides.p559ms.System.AbstractC14071k4
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public void invoke(AbstractC14278pe abstractC14278pe2) {
                AbstractC13778li.this.m64399k4(abstractC14278pe2);
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    private void m64397k4() {
        this.f46003x1 = new C12014ne(C7019kk.m27462to(Float.valueOf(this.f46001k4.mo69028k4().f47836k4), 13) - 1, C7019kk.m27462to(Float.valueOf(this.f46001k4.mo69028k4().f47837x1), 13) - 1, C7019kk.m27462to(Double.valueOf(C14116yg.m67497to(this.f46001k4.mo69029x1().f47836k4)), 14) + 2, C7019kk.m27462to(Double.valueOf(C14116yg.m67497to(this.f46001k4.mo69029x1().f47837x1)), 14) + 2);
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public void dispose() {
        this.f46001k4.f48035x1.mo27429k4(new AbstractC14071k4<AbstractC14278pe>() { // from class: com.aspose.slides.li.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Export.FramesStream.AnimationPlaying.Players.BasePixelPlayer.OnPositionChanged(Aspose.Slides.Export.FramesStream.AnimationPlaying.IRectNotifiable)";
            }

            @Override // com.aspose.slides.p559ms.System.AbstractC14071k4
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public void invoke(AbstractC14278pe abstractC14278pe) {
                AbstractC13778li.this.m64399k4(abstractC14278pe);
            }
        });
        if (C7019kk.m27469x1(this.f46001k4, vjj.class)) {
            ((vjj) this.f46001k4).m72334to();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public void m64399k4(AbstractC14278pe abstractC14278pe) {
        m64397k4();
    }
}
