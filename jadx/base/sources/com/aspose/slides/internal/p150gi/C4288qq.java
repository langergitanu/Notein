package com.aspose.slides.internal.p150gi;

import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p380ri.C10017to;

/* JADX INFO: renamed from: com.aspose.slides.internal.gi.qq */
/* JADX INFO: loaded from: classes.dex */
public class C4288qq extends AbstractC4282kp {

    /* JADX INFO: renamed from: k4 */
    private int f11706k4;

    /* JADX INFO: renamed from: x1 */
    private String f11707x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.gi.qq$k4 */
    public static class k4 extends AbstractC4275gi implements Cloneable {
        public k4(int i) {
            super(i);
        }

        @Override // com.aspose.slides.internal.p150gi.AbstractC4275gi
        /* JADX INFO: renamed from: k4 */
        public AbstractC4282kp mo17217k4(String str) {
            return super.mo17217k4(str);
        }

        @Override // com.aspose.slides.internal.p150gi.AbstractC4275gi
        /* JADX INFO: renamed from: x1 */
        public AbstractC4282kp mo17139x1(AbstractC4282kp abstractC4282kp, AbstractC3533um abstractC3533um, AbstractC3524ks abstractC3524ks) {
            return C7019kk.m27469x1(abstractC4282kp, C4288qq.class) ? abstractC4282kp : super.mo17139x1(abstractC4282kp, abstractC3533um, abstractC3524ks);
        }
    }

    private C4288qq(int i, String str) {
        this.f11706k4 = i;
        this.f11707x1 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public static C4288qq m17258k4(int i, String str) {
        return new C4288qq(i, str);
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4282kp
    /* JADX INFO: renamed from: du */
    public int mo17251du() {
        return this.f11706k4;
    }

    public boolean equals(Object obj) {
        C4288qq c4288qq = (C4288qq) C7019kk.m27452k4(obj, C4288qq.class);
        return c4288qq != null && this.f11706k4 == c4288qq.f11706k4 && C10017to.m49170k4(this.f11707x1, c4288qq.f11707x1);
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4282kp
    /* JADX INFO: renamed from: g_ */
    public Object mo9922g_() {
        return this.f11707x1;
    }

    public int hashCode() {
        return this.f11707x1.hashCode() + this.f11706k4;
    }
}
