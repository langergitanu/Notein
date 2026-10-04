package com.aspose.slides.internal.p211jo;

import com.aspose.slides.PatternStyle;
import com.aspose.slides.internal.p061cc.AbstractC2417k4;
import com.aspose.slides.internal.p166hg.AbstractC4523ai;
import com.aspose.slides.internal.p166hg.C4540gi;
import com.aspose.slides.internal.p166hg.C4545k4;
import com.aspose.slides.internal.p174hz.C4701bs;
import com.aspose.slides.internal.p525yi.C12821du;

/* JADX INFO: renamed from: com.aspose.slides.internal.jo.ck */
/* JADX INFO: loaded from: classes.dex */
public class C5521ck extends AbstractC2417k4 {

    /* JADX INFO: renamed from: k4 */
    private C4701bs f15060k4;

    /* JADX INFO: renamed from: x1 */
    private byte[] f15061x1;

    public C5521ck(AbstractC4523ai abstractC4523ai, byte[] bArr) {
        super(abstractC4523ai, (byte) 12, bArr);
        this.f15060k4 = new C4701bs();
        m22589m9();
    }

    /* JADX INFO: renamed from: m9 */
    private void m22589m9() {
        C12821du c12821du = new C12821du();
        C4701bs c4701bs = this.f15060k4;
        int length = c4701bs.f13121m9.length + c4701bs.f13117dy.length + 4;
        C4540gi c4540gi = new C4540gi();
        c4540gi.m18742k4(m11834ck().m18664qq());
        c4540gi.write(m18739h4(), 0, length);
        c12821du.m19588x1(c4540gi.m18739h4());
        c4540gi.m18738du();
        if (!c12821du.m59615k4(m11834ck().m18632ck().m18773kk(), this.f15061x1)) {
            throw new C4545k4(PatternStyle.Vertical, "Data was not signed with the server certificate.");
        }
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
        m11834ck().m18632ck().m18768k4(true);
        m11834ck().m18632ck().m18766k4(this.f15060k4.Clone());
        m11834ck().m18632ck().m18769k4(this.f15061x1);
    }

    @Override // com.aspose.slides.internal.p061cc.AbstractC2417k4
    /* JADX INFO: renamed from: jd */
    public void mo11837jd() {
        C4701bs c4701bs = new C4701bs();
        this.f15060k4 = c4701bs;
        c4701bs.f13121m9 = m18744k4((int) m18745kk());
        this.f15060k4.f13117dy = m18744k4((int) m18745kk());
        this.f15061x1 = m18744k4((int) m18745kk());
    }
}
