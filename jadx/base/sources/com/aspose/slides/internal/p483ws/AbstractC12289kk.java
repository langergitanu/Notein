package com.aspose.slides.internal.p483ws;

import com.aspose.slides.internal.p262m1.C6304x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p383rp.AbstractC10031du;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.ws.kk */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC12289kk extends AbstractC10031du {
    public AbstractC12289kk(int i) {
        super(i);
    }

    /* JADX INFO: renamed from: ck */
    public abstract AbstractC14092to mo57541ck();

    /* JADX INFO: renamed from: fa */
    public abstract long mo57542fa();

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    /* JADX INFO: renamed from: h4 */
    public final long mo49282h4() {
        long jM27435du = C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(mo49284k4()), 10) * C7019kk.m27435du(Long.valueOf(mo57542fa()), 10)), 10);
        if (C7019kk.m27435du(Long.valueOf(jM27435du), 10) <= 4) {
            return 0L;
        }
        return jM27435du;
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    /* JADX INFO: renamed from: k4 */
    public final long mo49284k4() {
        if (mo57541ck() != null) {
            return C7019kk.m27435du(Integer.valueOf(mo57541ck().m67265du()), 9);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: kk */
    public abstract void mo57543kk(C6304x1 c6304x1);

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    /* JADX INFO: renamed from: kk */
    public final void mo49286kk(C6304x1 c6304x1, long j) {
        if (C7019kk.m27435du(Long.valueOf(mo49282h4()), 10) > 0) {
            c6304x1.m25855up(j);
        } else if (mo57541ck() == null) {
            c6304x1.m25832du(0);
        } else {
            mo57543kk(c6304x1);
        }
    }
}
