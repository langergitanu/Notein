package com.aspose.slides;

import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14051ck;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.bh */
/* JADX INFO: loaded from: classes3.dex */
class C0817bh extends AbstractC14611u0<IHyperlink, C0817bh> {

    /* JADX INFO: renamed from: k4 */
    public static final C0817bh f4203k4 = new C0817bh();

    @Override // com.aspose.slides.AbstractC14611u0
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public int mo4124k4(IHyperlink iHyperlink) {
        return C14051ck.m66552k4(iHyperlink.getStopSoundOnClick()) + ((C14051ck.m66552k4(iHyperlink.getHighlightClick()) + ((C14051ck.m66552k4(iHyperlink.getHistory()) + ((((((((((C14042ak.m66409k4(iHyperlink.getActionType()) - 324743029) * 486187739) + AbstractC14611u0.m71464kk(((Hyperlink) iHyperlink).getExternalUrlOriginal())) * 486187739) + AbstractC14611u0.m71464kk(iHyperlink.getTargetSlide())) * 486187739) + AbstractC14611u0.m71464kk(iHyperlink.getTargetFrame())) * 486187739) + AbstractC14611u0.m71464kk(iHyperlink.getTooltip())) * 486187739)) * 486187739)) * 486187739);
    }

    @Override // com.aspose.slides.AbstractC14611u0
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo4125k4(IHyperlink iHyperlink, IHyperlink iHyperlink2) {
        return iHyperlink.getActionType() == iHyperlink2.getActionType() && C14113y2.m67363du(((Hyperlink) iHyperlink).getExternalUrlOriginal(), ((Hyperlink) iHyperlink2).getExternalUrlOriginal()) && C14067j2.m66729x1(iHyperlink.getTargetSlide(), iHyperlink2.getTargetSlide()) && C14113y2.m67363du(iHyperlink.getTargetFrame(), iHyperlink2.getTargetFrame()) && C14113y2.m67363du(iHyperlink.getTooltip(), iHyperlink2.getTooltip()) && iHyperlink.getHistory() == iHyperlink2.getHistory() && iHyperlink.getHighlightClick() == iHyperlink2.getHighlightClick() && iHyperlink.getStopSoundOnClick() == iHyperlink2.getStopSoundOnClick();
    }
}
