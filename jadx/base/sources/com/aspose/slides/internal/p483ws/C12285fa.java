package com.aspose.slides.internal.p483ws;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p262m1.C6304x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p383rp.AbstractC10031du;
import com.aspose.slides.internal.p550zi.C13603k4;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.ws.fa */
/* JADX INFO: loaded from: classes5.dex */
public final class C12285fa extends AbstractC12289kk {

    /* JADX INFO: renamed from: k4 */
    private int[] f41153k4;

    public C12285fa(int i) {
        super(i);
    }

    @Override // com.aspose.slides.internal.p483ws.AbstractC12289kk
    /* JADX INFO: renamed from: ck */
    public AbstractC14092to mo57541ck() {
        return AbstractC14092to.m67208k4((Object) this.f41153k4);
    }

    @Override // com.aspose.slides.internal.p483ws.AbstractC12289kk
    /* JADX INFO: renamed from: fa */
    public long mo57542fa() {
        return 2L;
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    /* JADX INFO: renamed from: jd */
    public AbstractC10031du mo49283jd() {
        return new C12285fa(m49297kk());
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    /* JADX INFO: renamed from: k4 */
    public void mo49296k4(AbstractC10031du abstractC10031du) {
        ((C12285fa) abstractC10031du).f41153k4 = C13603k4.m62744k4(this.f41153k4);
        super.mo49296k4(abstractC10031du);
    }

    @Override // com.aspose.slides.internal.p483ws.AbstractC12289kk
    /* JADX INFO: renamed from: kk */
    public void mo57543kk(C6304x1 c6304x1) {
        c6304x1.m25856x1(this.f41153k4);
        c6304x1.m62857k4(new byte[4 - (this.f41153k4.length * 2)]);
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    /* JADX INFO: renamed from: m9 */
    public Object mo49287m9() {
        return this.f41153k4;
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    /* JADX INFO: renamed from: to */
    public int mo49288to() {
        return 3;
    }

    /* JADX INFO: renamed from: up */
    public int[] m57546up() {
        return this.f41153k4;
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    /* JADX INFO: renamed from: x1 */
    public long mo49289x1(C6304x1 c6304x1) {
        if (c6304x1 == null) {
            throw new ArgumentNullException("dataStream");
        }
        int[] iArr = this.f41153k4;
        if (iArr == null || iArr.length <= 2) {
            return 0L;
        }
        c6304x1.m25856x1(iArr);
        return C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Integer.valueOf(this.f41153k4.length), 9)), 10) * 2), 10);
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    /* JADX INFO: renamed from: k4 */
    public void mo49285k4(Object obj) {
        if (obj != null && !C7019kk.m27469x1(obj, int[].class)) {
            throw new ArgumentException("Only ushort array is supported.");
        }
        this.f41153k4 = (int[]) C7019kk.m27452k4(obj, int[].class);
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    /* JADX INFO: renamed from: x1 */
    public void mo49290x1(C6304x1 c6304x1, long j) {
        if (C7019kk.m27435du(Long.valueOf(j), 10) <= 2) {
            this.f41153k4 = c6304x1.m25835fa(j);
        } else {
            c6304x1.m62854k4(C7019kk.m27438h4(Long.valueOf(c6304x1.m25854up()), 10), 0);
            this.f41153k4 = c6304x1.m25835fa(j);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m57545k4(int[] iArr) {
        this.f41153k4 = iArr;
    }
}
