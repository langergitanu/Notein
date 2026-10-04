package com.aspose.slides.internal.p483ws;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p262m1.C6304x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p383rp.AbstractC10031du;
import com.aspose.slides.internal.p550zi.C13603k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.ws.up */
/* JADX INFO: loaded from: classes5.dex */
public final class C12292up extends AbstractC10031du {

    /* JADX INFO: renamed from: k4 */
    private byte[] f41159k4;

    public C12292up(int i) {
        super(i);
    }

    /* JADX INFO: renamed from: ck */
    public byte[] m57555ck() {
        return this.f41159k4;
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    /* JADX INFO: renamed from: h4 */
    public long mo49282h4() {
        long jMo49284k4 = mo49284k4();
        if (C7019kk.m27435du(Long.valueOf(jMo49284k4), 10) <= 4) {
            return 0L;
        }
        return jMo49284k4;
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    /* JADX INFO: renamed from: jd */
    public AbstractC10031du mo49283jd() {
        return new C12292up(m49297kk());
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    /* JADX INFO: renamed from: k4 */
    public long mo49284k4() {
        byte[] bArr = this.f41159k4;
        if (bArr != null) {
            return C7019kk.m27435du(Integer.valueOf(bArr.length), 9);
        }
        return 0L;
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    /* JADX INFO: renamed from: kk */
    public void mo49286kk(C6304x1 c6304x1, long j) {
        if (C7019kk.m27435du(Long.valueOf(mo49284k4()), 10) > 4) {
            c6304x1.m25855up(j);
            return;
        }
        byte[] bArr = this.f41159k4;
        if (bArr == null) {
            c6304x1.m62857k4(new byte[4]);
        } else {
            c6304x1.m62857k4(bArr);
            c6304x1.m62857k4(new byte[4 - this.f41159k4.length]);
        }
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    /* JADX INFO: renamed from: m9 */
    public Object mo49287m9() {
        return this.f41159k4;
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    /* JADX INFO: renamed from: to */
    public int mo49288to() {
        return 7;
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    /* JADX INFO: renamed from: x1 */
    public long mo49289x1(C6304x1 c6304x1) {
        if (c6304x1 == null) {
            throw new ArgumentNullException("dataStream");
        }
        byte[] bArr = this.f41159k4;
        if (bArr == null || bArr.length <= 4) {
            return 0L;
        }
        c6304x1.m62857k4(bArr);
        return C7019kk.m27435du(Integer.valueOf(this.f41159k4.length), 9);
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    /* JADX INFO: renamed from: k4 */
    public void mo49296k4(AbstractC10031du abstractC10031du) {
        ((C12292up) abstractC10031du).f41159k4 = C13603k4.m62741k4(this.f41159k4);
        super.mo49296k4(abstractC10031du);
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    /* JADX INFO: renamed from: x1 */
    public void mo49290x1(C6304x1 c6304x1, long j) {
        if (C7019kk.m27435du(Long.valueOf(j), 10) > 4) {
            c6304x1.m62854k4(C7019kk.m27438h4(Long.valueOf(c6304x1.m25854up()), 10), 0);
            this.f41159k4 = c6304x1.m25849kk(j);
        } else {
            byte[] bArr = new byte[(int) C7019kk.m27435du(Long.valueOf(j), 10)];
            this.f41159k4 = bArr;
            c6304x1.m62860x1(bArr);
        }
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
    /* JADX INFO: renamed from: k4 */
    public void mo49285k4(Object obj) {
        if (obj != null && !C7019kk.m27469x1(obj, byte[].class)) {
            throw new ArgumentException("Only byte array is supported.");
        }
        this.f41159k4 = (byte[]) C7019kk.m27452k4(obj, byte[].class);
    }

    /* JADX INFO: renamed from: k4 */
    public void m57556k4(byte[] bArr) {
        this.f41159k4 = bArr;
    }
}
