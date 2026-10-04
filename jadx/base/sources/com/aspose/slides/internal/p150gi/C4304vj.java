package com.aspose.slides.internal.p150gi;

import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.gi.vj */
/* JADX INFO: loaded from: classes.dex */
public class C4304vj extends AbstractC4282kp {

    /* JADX INFO: renamed from: k4 */
    public static final C4304vj f11736k4 = new C4304vj(C14113y2.f47374k4);

    /* JADX INFO: renamed from: x1 */
    private final String f11737x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.gi.vj$k4 */
    public static class k4 extends AbstractC4275gi implements Cloneable {
        public k4(int i) {
            super(i);
        }

        @Override // com.aspose.slides.internal.p150gi.AbstractC4275gi
        /* JADX INFO: renamed from: k4 */
        public AbstractC4282kp mo14415k4(AbstractC3533um abstractC3533um, String str, AbstractC3524ks abstractC3524ks) {
            int length = str.length() - 1;
            if (length > 0) {
                char cCharAt = str.charAt(0);
                if ((cCharAt == '\"' || cCharAt == '\'') && str.charAt(length) == cCharAt) {
                    return new C4304vj(C14113y2.m67443x1(str, 1, length));
                }
                String strM17225kk = m17225kk(str);
                if (strM17225kk != null) {
                    str = strM17225kk;
                }
            }
            return C4304vj.m17277x1(str);
        }
    }

    private C4304vj(String str) {
        this.f11737x1 = str;
    }

    /* JADX INFO: renamed from: x1 */
    public static C4304vj m17277x1(String str) {
        return C14113y2.m67411k4(str) ? f11736k4 : new C4304vj(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C4304vj c4304vj = (C4304vj) C7019kk.m27452k4(obj, C4304vj.class);
        if (c4304vj != null) {
            return C14113y2.m67363du(c4304vj.f11737x1, this.f11737x1) || C14113y2.m67363du(c4304vj.f11737x1, this.f11737x1);
        }
        return false;
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4282kp
    /* JADX INFO: renamed from: g_ */
    public Object mo9922g_() {
        return this.f11737x1;
    }

    public int hashCode() {
        return this.f11737x1.hashCode();
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4282kp
    /* JADX INFO: renamed from: j_ */
    public String mo9926j_() {
        return this.f11737x1;
    }
}
