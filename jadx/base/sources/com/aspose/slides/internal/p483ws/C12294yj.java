package com.aspose.slides.internal.p483ws;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p262m1.C6304x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p383rp.AbstractC10031du;
import com.aspose.slides.internal.p448ur.C11545c5;
import com.aspose.slides.internal.p448ur.C11552to;
import com.aspose.slides.p559ms.System.AbstractC14106wy;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14114y9;

/* JADX INFO: renamed from: com.aspose.slides.internal.ws.yj */
/* JADX INFO: loaded from: classes5.dex */
public final class C12294yj extends AbstractC10031du {

    /* JADX INFO: renamed from: k4 */
    private final long f41161k4;

    /* JADX INFO: renamed from: kk */
    private final long f41162kk;

    /* JADX INFO: renamed from: to */
    private final int f41163to;

    /* JADX INFO: renamed from: x1 */
    private final C6304x1 f41164x1;

    public C12294yj(C6304x1 c6304x1, int i, int i2, long j, long j2) {
        super(i2);
        this.f41164x1 = c6304x1;
        this.f41162kk = j;
        this.f41163to = i;
        this.f41161k4 = j2;
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    /* JADX INFO: renamed from: h4 */
    public long mo49282h4() {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    /* JADX INFO: renamed from: jd */
    public AbstractC10031du mo49283jd() {
        return new C12294yj(this.f41164x1, this.f41163to, m49297kk(), this.f41162kk, this.f41161k4);
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    /* JADX INFO: renamed from: k4 */
    public long mo49284k4() {
        return this.f41162kk;
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    /* JADX INFO: renamed from: kk */
    public void mo49286kk(C6304x1 c6304x1, long j) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    /* JADX INFO: renamed from: m9 */
    public Object mo49287m9() {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    /* JADX INFO: renamed from: to */
    public int mo49288to() {
        return C7019kk.m27457kk(Integer.valueOf(this.f41163to), 8);
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    public String toString() {
        return C14113y2.m67408k4("Tag: ", AbstractC14106wy.getName((Class<?>) C11545c5.class, m49297kk()), " Type: ", AbstractC14106wy.getName((Class<?>) C11552to.class, mo49288to()), " Count: ", C14114y9.m67465x1(mo49284k4()), " Undefined value: ", C14114y9.m67465x1(this.f41161k4));
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    /* JADX INFO: renamed from: x1 */
    public long mo49289x1(C6304x1 c6304x1) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    /* JADX INFO: renamed from: k4 */
    public void mo49285k4(Object obj) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    /* JADX INFO: renamed from: x1 */
    public void mo49290x1(C6304x1 c6304x1, long j) {
        throw new NotImplementedException();
    }
}
