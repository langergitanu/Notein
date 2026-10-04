package com.aspose.slides.internal.p211jo;

import com.aspose.slides.internal.p061cc.AbstractC2417k4;
import com.aspose.slides.internal.p166hg.AbstractC4523ai;
import com.aspose.slides.internal.p166hg.AbstractC4570vj;
import com.aspose.slides.internal.p166hg.C4545k4;
import com.aspose.slides.internal.p166hg.C4563ts;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p525yi.C12821du;

/* JADX INFO: renamed from: com.aspose.slides.internal.jo.dy */
/* JADX INFO: loaded from: classes.dex */
public class C5523dy extends AbstractC2417k4 {

    /* JADX INFO: renamed from: k4 */
    private static byte[] f15062k4 = {83, 82, 86, 82};

    public C5523dy(AbstractC4523ai abstractC4523ai, byte[] bArr) {
        super(abstractC4523ai, (byte) 20, bArr);
    }

    @Override // com.aspose.slides.internal.p061cc.AbstractC2417k4
    /* JADX INFO: renamed from: c5 */
    public void mo11833c5() {
        C4563ts c4563ts = new C4563ts(m11834ck().m18672um());
        byte[] bArrM18739h4 = m11834ck().m18663ne().m18739h4();
        c4563ts.mo19562k4(bArrM18739h4, 0, bArrM18739h4.length, bArrM18739h4, 0);
        byte[] bArr = f15062k4;
        c4563ts.mo19562k4(bArr, 0, bArr.length, bArr, 0);
        c4563ts.mo19564k4(AbstractC4570vj.f12762k4, 0, 0);
        if (!AbstractC2417k4.m11832k4(c4563ts.m19584fa(), m18744k4(C7019kk.m27462to(Long.valueOf(getLength()), 11)))) {
            throw new C4545k4((byte) 71, "Invalid ServerFinished message received.");
        }
    }

    @Override // com.aspose.slides.internal.p061cc.AbstractC2417k4
    /* JADX INFO: renamed from: dy */
    public void mo11835dy() {
        super.mo11835dy();
        m11834ck().m18655kk(2);
    }

    @Override // com.aspose.slides.internal.p061cc.AbstractC2417k4
    /* JADX INFO: renamed from: jd */
    public void mo11837jd() {
        byte[] bArrM18744k4 = m18744k4(C7019kk.m27462to(Long.valueOf(getLength()), 11));
        C12821du c12821du = new C12821du();
        byte[] bArrM18739h4 = m11834ck().m18663ne().m18739h4();
        if (!AbstractC2417k4.m11832k4(m11834ck().m18633dq().m18754k4().m18893k4(m11834ck().m18672um(), "server finished", c12821du.m19586kk(bArrM18739h4, 0, bArrM18739h4.length), 12), bArrM18744k4)) {
            throw new C4545k4("Invalid ServerFinished message received.");
        }
    }
}
