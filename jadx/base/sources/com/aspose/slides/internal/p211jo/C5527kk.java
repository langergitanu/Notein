package com.aspose.slides.internal.p211jo;

import com.aspose.slides.internal.p061cc.AbstractC2417k4;
import com.aspose.slides.internal.p166hg.AbstractC4523ai;
import com.aspose.slides.internal.p166hg.AbstractC4570vj;
import com.aspose.slides.internal.p166hg.C4563ts;
import com.aspose.slides.internal.p525yi.C12821du;

/* JADX INFO: renamed from: com.aspose.slides.internal.jo.kk */
/* JADX INFO: loaded from: classes.dex */
public class C5527kk extends AbstractC2417k4 {

    /* JADX INFO: renamed from: k4 */
    private static byte[] f15066k4 = {67, 76, 78, 84};

    public C5527kk(AbstractC4523ai abstractC4523ai) {
        super(abstractC4523ai, (byte) 20);
    }

    @Override // com.aspose.slides.internal.p061cc.AbstractC2417k4
    /* JADX INFO: renamed from: c5 */
    public void mo11833c5() {
        C4563ts c4563ts = new C4563ts(m11834ck().m18672um());
        byte[] bArrM18739h4 = m11834ck().m18663ne().m18739h4();
        c4563ts.mo19562k4(bArrM18739h4, 0, bArrM18739h4.length, bArrM18739h4, 0);
        byte[] bArr = f15066k4;
        c4563ts.mo19562k4(bArr, 0, bArr.length, bArr, 0);
        c4563ts.mo19564k4(AbstractC4570vj.f12762k4, 0, 0);
        m18742k4(c4563ts.m19584fa());
    }

    @Override // com.aspose.slides.internal.p061cc.AbstractC2417k4
    /* JADX INFO: renamed from: dy */
    public void mo11835dy() {
        super.mo11835dy();
        m18738du();
    }

    @Override // com.aspose.slides.internal.p061cc.AbstractC2417k4
    /* JADX INFO: renamed from: jd */
    public void mo11837jd() {
        C12821du c12821du = new C12821du();
        byte[] bArrM18739h4 = m11834ck().m18663ne().m18739h4();
        m18742k4(m11834ck().m18670ts().m18754k4().m18893k4(m11834ck().m18672um(), "client finished", c12821du.m19586kk(bArrM18739h4, 0, bArrM18739h4.length), 12));
    }
}
