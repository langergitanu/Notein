package com.aspose.slides.internal.p150gi;

import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.gi.to */
/* JADX INFO: loaded from: classes.dex */
public class C4295to extends AbstractC4282kp {

    /* JADX INFO: renamed from: k4 */
    private final char f11717k4;

    /* JADX INFO: renamed from: com.aspose.slides.internal.gi.to$k4 */
    public static class k4 extends AbstractC4275gi implements Cloneable {
        public k4(int i) {
            super(i);
        }

        @Override // com.aspose.slides.internal.p150gi.AbstractC4275gi
        /* JADX INFO: renamed from: k4 */
        public AbstractC4282kp mo14415k4(AbstractC3533um abstractC3533um, String str, AbstractC3524ks abstractC3524ks) {
            return C4295to.m17272k4(str.charAt(0));
        }
    }

    private C4295to(char c) {
        this.f11717k4 = c;
    }

    /* JADX INFO: renamed from: k4 */
    public static C4295to m17272k4(char c) {
        return new C4295to(c);
    }

    public boolean equals(Object obj) {
        C4295to c4295to = (C4295to) C7019kk.m27452k4(obj, C4295to.class);
        return c4295to != null && this.f11717k4 == c4295to.f11717k4;
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4282kp
    /* JADX INFO: renamed from: g_ */
    public Object mo9922g_() {
        return Character.valueOf(this.f11717k4);
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4282kp
    /* JADX INFO: renamed from: h_ */
    public char mo17252h_() {
        return this.f11717k4;
    }

    public int hashCode() {
        return this.f11717k4;
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4282kp
    /* JADX INFO: renamed from: j_ */
    public String mo9926j_() {
        return C14117yj.m67537ne(this.f11717k4);
    }
}
