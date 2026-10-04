package com.aspose.slides.internal.p202jd;

import androidx.core.app.NotificationCompat;
import com.aspose.slides.internal.p126fa.AbstractC3901jd;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.C5813x1;
import com.aspose.slides.internal.p231kk.InterfaceC5808uz;
import com.aspose.slides.internal.p270m9.C6344m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p423to.C11068dy;
import com.aspose.slides.internal.p447up.AbstractC11535k4;
import com.aspose.slides.internal.p447up.C11531dy;
import com.aspose.slides.internal.p447up.C11532fa;
import com.aspose.slides.internal.p447up.C11539rv;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.internal.jd.o2 */
/* JADX INFO: loaded from: classes.dex */
public class C5338o2 extends AbstractC3901jd {

    /* JADX INFO: renamed from: k4 */
    private static final C11068dy<AbstractC5788h4> f14331k4;

    static {
        C11068dy<AbstractC5788h4> c11068dy = new C11068dy<>();
        f14331k4 = c11068dy;
        c11068dy.m53499k4(NotificationCompat.GROUP_KEY_SILENT, C5813x1.k4.f16205m8);
        c11068dy.m53499k4("x-soft", C5813x1.k4.f16474vt);
        c11068dy.m53499k4("soft", C5813x1.k4.f16327qn);
        c11068dy.m53499k4("medium", C5813x1.k4.f15990em);
        c11068dy.m53499k4("loud", C5813x1.k4.f16325qk);
        c11068dy.m53499k4("x-loud", C5813x1.k4.f16357rq);
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3901jd
    /* JADX INFO: renamed from: du */
    public C11068dy<AbstractC5788h4> mo15588du() {
        return f14331k4;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public AbstractC5788h4 mo15597k4(InterfaceC5808uz interfaceC5808uz, C6344m9 c6344m9, String str, C11539rv c11539rv, AbstractC5788h4 abstractC5788h4, int i) {
        AbstractC5788h4 abstractC5788h4Mo15597k4 = super.mo15597k4(interfaceC5808uz, c6344m9, str, c11539rv, abstractC5788h4, i);
        AbstractC11535k4 abstractC11535k4 = C7019kk.m27469x1(abstractC5788h4Mo15597k4, C11532fa.class) ? (AbstractC11535k4) C7019kk.m27452k4((Object) abstractC5788h4Mo15597k4, C11532fa.class) : null;
        if (C7019kk.m27469x1(abstractC5788h4Mo15597k4, C11531dy.class)) {
            abstractC11535k4 = (AbstractC11535k4) C7019kk.m27452k4((Object) abstractC5788h4Mo15597k4, C11531dy.class);
        }
        if (abstractC11535k4 == null) {
            return abstractC5788h4Mo15597k4;
        }
        float fMo23699k4 = abstractC11535k4.mo23699k4((short) 1);
        return (fMo23699k4 < 0.0f || fMo23699k4 > 100.0f) ? C5813x1.k4.f15990em : abstractC5788h4Mo15597k4;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: kk */
    public boolean mo15584kk() {
        return true;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: to */
    public AbstractC5788h4 mo15585to() {
        return C5813x1.k4.f15990em;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: x1 */
    public int mo15586x1() {
        return StyleIdentifier.GRID_TABLE_3_ACCENT_1;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public String mo15583k4() {
        return "volume";
    }
}
