package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.kp */
/* JADX INFO: loaded from: classes3.dex */
class C13742kp {
    /* JADX INFO: renamed from: k4 */
    public static void m64089k4(Effect effect, String str, c0z c0zVar) {
        int iM2167m9;
        if (effect == null) {
            throw new ArgumentNullException("effect");
        }
        if (C14113y2.m67411k4(str)) {
            return;
        }
        if (c0zVar.m4425x1().containsKey(str)) {
            effect.m1375kk().m7568k4(c0zVar.m4425x1().get_Item(str));
            return;
        }
        if (c0zVar.m4424kk().containsKey(str)) {
            Paragraph paragraph = c0zVar.m4424kk().get_Item(str);
            IShape iShape = (IShape) C7019kk.m27452k4((Object) paragraph.m2154ck().m2179kk().m2924kk(), IShape.class);
            if (iShape == null || (iM2167m9 = paragraph.m2167m9()) == -1) {
                return;
            }
            effect.m1375kk().m7568k4(iShape);
            TextAnimation textAnimation = new TextAnimation();
            textAnimation.m2888k4((Sequence) effect.getSequence());
            textAnimation.f3508kk = true;
            ((TextAnimationCollection) iShape.getSlide().getTimeline().getTextAnimationCollection()).m2892k4(textAnimation);
            textAnimation.m2890x1().m73334k4(effect);
            textAnimation.m2890x1().m73335k4(iShape);
            textAnimation.m2890x1().m73332k4().addItem(effect);
            effect.m1375kk().m7569k4(textAnimation);
            effect.m1374k4(iM2167m9, iM2167m9, paragraph.m2154ck());
        }
    }
}
