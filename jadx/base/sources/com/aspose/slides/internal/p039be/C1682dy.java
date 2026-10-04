package com.aspose.slides.internal.p039be;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p353q7.C9790ts;
import com.aspose.slides.internal.p416tb.C10898dy;

/* JADX INFO: renamed from: com.aspose.slides.internal.be.dy */
/* JADX INFO: loaded from: classes3.dex */
public class C1682dy extends AbstractC1687m9 {
    public C1682dy(C10898dy c10898dy, int i, C9790ts c9790ts, int i2, int i3) {
        super(c10898dy, i, c9790ts, i2, i3);
        m9106k4(new C1686kk(c10898dy, this));
        m9104k4((char) 255);
        m9108k4(new boolean[256]);
    }

    /* JADX INFO: renamed from: b3 */
    private boolean m9085b3() {
        return this.f37962x1.m52454fa();
    }

    @Override // com.aspose.slides.internal.p039be.AbstractC1687m9
    /* JADX INFO: renamed from: ar */
    public String mo9086ar() {
        return "/TrueType";
    }

    @Override // com.aspose.slides.internal.p039be.AbstractC1689x1
    /* JADX INFO: renamed from: k4 */
    public void mo9087k4(AbstractC3150x6 abstractC3150x6) {
        if (m9085b3() || !m9128u4()) {
            ((AbstractC1687m9) this).f6402to.m48154k4(abstractC3150x6, true, false);
        }
        super.mo9087k4(abstractC3150x6);
    }

    @Override // com.aspose.slides.internal.p039be.AbstractC1687m9
    /* JADX INFO: renamed from: k4 */
    public void mo9088k4(String str) {
        if (m9085b3() || !m9128u4()) {
            for (int i = 0; i < str.length(); i++) {
                ((AbstractC1687m9) this).f6402to.m48151k4(str.charAt(i));
            }
        }
        super.mo9088k4(str);
    }

    @Override // com.aspose.slides.internal.p039be.AbstractC1689x1
    /* JADX INFO: renamed from: k4 */
    public byte[] mo9089k4() {
        return new byte[]{-1};
    }
}
