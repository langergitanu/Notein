package com.aspose.slides.internal.p409sv;

import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.internal.p023ak.C1389to;
import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p150gi.AbstractC4282kp;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.internal.sv.h4 */
/* JADX INFO: loaded from: classes4.dex */
public class C10775h4 extends C10780ks {

    /* JADX INFO: renamed from: c5 */
    private AbstractC4282kp f37673c5;

    /* JADX INFO: renamed from: ck */
    private int f37674ck;

    /* JADX INFO: renamed from: dy */
    private AbstractC4282kp f37675dy;

    /* JADX INFO: renamed from: jd */
    private int f37676jd;

    public C10775h4(AbstractC3511c5 abstractC3511c5) {
        super(abstractC3511c5);
    }

    /* JADX INFO: renamed from: bz */
    public final int m52249bz() {
        return this.f37674ck;
    }

    /* JADX INFO: renamed from: e0 */
    public final int m52250e0() {
        return this.f37676jd;
    }

    @Override // com.aspose.slides.internal.p409sv.C10780ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: ix */
    public int mo14084ix() {
        return 2;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public Stack<C1389to> mo14086k4(Stack<C1389to> stack, C1389to c1389to) {
        char c;
        int iM52249bz = m52249bz();
        int iM52250e0 = m52250e0();
        char c2 = 8236;
        if (iM52249bz == 15) {
            c = iM52250e0 == 122 ? (char) 8238 : (char) 8237;
        } else if (iM52249bz == 38) {
            c = iM52250e0 == 122 ? (char) 8235 : (char) 8234;
        } else {
            c2 = 0;
            c = 0;
        }
        if (c1389to != null) {
            if (c != 0) {
                c1389to.m8274k4(c, this);
            }
            AbstractC3511c5.k4 k4VarMo14080ck = mo14080ck();
            while (k4VarMo14080ck != null && k4VarMo14080ck.mo9764x1()) {
                stack = k4VarMo14080ck.mo9760kk().m14085k4(stack);
            }
            if (c2 != 0) {
                c1389to.m8274k4(c2, this);
            }
        }
        return stack;
    }

    @Override // com.aspose.slides.internal.p409sv.C10780ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: rv */
    public String mo14114rv() {
        return "bidi-override";
    }

    @Override // com.aspose.slides.internal.p409sv.C10780ks, com.aspose.slides.internal.p409sv.AbstractC10795x6, com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14090k4(AbstractC3533um abstractC3533um) {
        super.mo14090k4(abstractC3533um);
        this.f37675dy = abstractC3533um.m14402to(141);
        this.f37673c5 = abstractC3533um.m14402to(StyleIdentifier.BIBLIOGRAPHY);
        this.f37676jd = abstractC3533um.m14402to(86).mo17251du();
        this.f37674ck = abstractC3533um.m14402to(255).mo17251du();
    }
}
