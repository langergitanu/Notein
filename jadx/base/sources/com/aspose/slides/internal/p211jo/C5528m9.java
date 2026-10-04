package com.aspose.slides.internal.p211jo;

import com.aspose.slides.internal.p061cc.AbstractC2417k4;
import com.aspose.slides.internal.p166hg.AbstractC4523ai;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p525yi.C12842x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.jo.m9 */
/* JADX INFO: loaded from: classes.dex */
public class C5528m9 extends AbstractC2417k4 {

    /* JADX INFO: renamed from: k4 */
    private int[] f15067k4;

    /* JADX INFO: renamed from: x1 */
    private String[] f15068x1;

    public C5528m9(AbstractC4523ai abstractC4523ai, byte[] bArr) {
        super(abstractC4523ai, (byte) 13, bArr);
    }

    @Override // com.aspose.slides.internal.p061cc.AbstractC2417k4
    /* JADX INFO: renamed from: c5 */
    public void mo11833c5() {
        mo11837jd();
    }

    @Override // com.aspose.slides.internal.p061cc.AbstractC2417k4
    /* JADX INFO: renamed from: dy */
    public void mo11835dy() {
        super.mo11835dy();
        m11834ck().m18632ck().m18770k4(this.f15067k4);
        m11834ck().m18632ck().m18771k4(this.f15068x1);
        m11834ck().m18632ck().m18776x1(true);
    }

    @Override // com.aspose.slides.internal.p061cc.AbstractC2417k4
    /* JADX INFO: renamed from: jd */
    public void mo11837jd() {
        int iM27462to = C7019kk.m27462to(Byte.valueOf(m18748x1()), 6);
        this.f15067k4 = new int[iM27462to];
        for (int i = 0; i < iM27462to; i++) {
            this.f15067k4[i] = C7019kk.m27462to(Byte.valueOf(m18748x1()), 6);
        }
        if (m18745kk() != 0) {
            C12842x1 c12842x1 = new C12842x1(m18744k4((int) m18745kk()));
            this.f15068x1 = new String[c12842x1.m59709k4()];
            for (int i2 = 0; i2 < c12842x1.m59709k4(); i2++) {
                this.f15068x1[i2] = AbstractC6747ar.m26635ix().m26681x1(new C12842x1(c12842x1.m59710k4(i2).m59717to()).m59710k4(1).m59717to());
            }
        }
    }
}
