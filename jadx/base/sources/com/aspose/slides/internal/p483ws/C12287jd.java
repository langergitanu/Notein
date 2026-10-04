package com.aspose.slides.internal.p483ws;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p262m1.C6304x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p383rp.AbstractC10031du;
import com.aspose.slides.internal.p383rp.C10034jd;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.ws.jd */
/* JADX INFO: loaded from: classes5.dex */
public final class C12287jd extends AbstractC12289kk {

    /* JADX INFO: renamed from: k4 */
    private C10034jd[] f41155k4;

    public C12287jd(int i) {
        super(i);
    }

    @Override // com.aspose.slides.internal.p483ws.AbstractC12289kk
    /* JADX INFO: renamed from: ck */
    public AbstractC14092to mo57541ck() {
        return AbstractC14092to.m67208k4((Object) this.f41155k4);
    }

    @Override // com.aspose.slides.internal.p483ws.AbstractC12289kk
    /* JADX INFO: renamed from: fa */
    public long mo57542fa() {
        return 8L;
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    /* JADX INFO: renamed from: jd */
    public AbstractC10031du mo49283jd() {
        return new C12287jd(m49297kk());
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    /* JADX INFO: renamed from: k4 */
    public void mo49296k4(AbstractC10031du abstractC10031du) {
        ((C12287jd) abstractC10031du).f41155k4 = m57549k4(this.f41155k4);
        super.mo49296k4(abstractC10031du);
    }

    @Override // com.aspose.slides.internal.p483ws.AbstractC12289kk
    /* JADX INFO: renamed from: kk */
    public void mo57543kk(C6304x1 c6304x1) {
        throw new NotImplementedException("The tag value cannot fit 4 bytes.");
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    /* JADX INFO: renamed from: m9 */
    public Object mo49287m9() {
        return this.f41155k4;
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    /* JADX INFO: renamed from: to */
    public int mo49288to() {
        return 10;
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    /* JADX INFO: renamed from: x1 */
    public long mo49289x1(C6304x1 c6304x1) {
        if (c6304x1 == null) {
            throw new ArgumentNullException("dataStream");
        }
        C10034jd[] c10034jdArr = this.f41155k4;
        if (c10034jdArr == null || c10034jdArr.length == 0) {
            c10034jdArr = new C10034jd[]{new C10034jd()};
        }
        c6304x1.m25846k4(c10034jdArr);
        return C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Integer.valueOf(c10034jdArr.length), 9)), 10) * 8), 10);
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    /* JADX INFO: renamed from: k4 */
    public void mo49285k4(Object obj) {
        if (obj != null && !C7019kk.m27469x1(obj, C10034jd[].class)) {
            throw new ArgumentException("Only TiffSRational array is supported.");
        }
        this.f41155k4 = (C10034jd[]) C7019kk.m27452k4(obj, C10034jd[].class);
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    /* JADX INFO: renamed from: x1 */
    public void mo49290x1(C6304x1 c6304x1, long j) {
        c6304x1.m62854k4(C7019kk.m27438h4(Long.valueOf(c6304x1.m25854up()), 10), 0);
        this.f41155k4 = c6304x1.m25851m9(j);
    }

    /* JADX INFO: renamed from: k4 */
    private static C10034jd[] m57549k4(C10034jd[] c10034jdArr) {
        if (c10034jdArr == null) {
            return null;
        }
        C10034jd[] c10034jdArr2 = new C10034jd[c10034jdArr.length];
        for (long j = 0; C7019kk.m27435du(Long.valueOf(j), 10) < c10034jdArr.length; j++) {
            int i = (int) j;
            c10034jdArr2[i] = c10034jdArr[i];
        }
        return c10034jdArr2;
    }
}
