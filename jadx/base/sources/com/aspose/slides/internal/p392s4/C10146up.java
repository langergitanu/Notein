package com.aspose.slides.internal.p392s4;

import com.aspose.slides.internal.p299ni.InterfaceC6906k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.s4.up */
/* JADX INFO: loaded from: classes4.dex */
public class C10146up extends AbstractC10134ck {

    /* JADX INFO: renamed from: k4 */
    private int f36511k4;

    /* JADX INFO: renamed from: kk */
    private int f36512kk;

    /* JADX INFO: renamed from: to */
    private byte[] f36513to;

    /* JADX INFO: renamed from: x1 */
    private int f36514x1;

    public C10146up(InterfaceC6906k4 interfaceC6906k4, int i) {
        super(interfaceC6906k4, i, 2);
        this.f36513to = new byte[255];
    }

    /* JADX INFO: renamed from: kk */
    private void m49917kk(int i) {
        m49797x1().mo27041k4(this.f36513to, i);
    }

    @Override // com.aspose.slides.internal.p392s4.AbstractC10133c5
    /* JADX INFO: renamed from: du */
    public int mo49783du(int i) {
        return i - 1;
    }

    @Override // com.aspose.slides.internal.p392s4.AbstractC10134ck
    /* JADX INFO: renamed from: k4 */
    public void mo49794k4(int i) {
        super.mo49794k4(i);
        mo49798x1(mo49786h4());
        int i2 = this.f36512kk;
        if (i2 > 0) {
            m49917kk(i2);
        }
        this.f36512kk = 0;
        int i3 = this.f36514x1;
        if (i3 > 0) {
            byte[] bArr = this.f36513to;
            this.f36512kk = 1;
            bArr[0] = (byte) (this.f36511k4 << (8 - i3));
        }
        m49797x1().mo27041k4(this.f36513to, this.f36512kk);
        m49797x1().mo27038k4(i);
        this.f36514x1 = 0;
        this.f36512kk = 0;
        this.f36511k4 = 0;
    }

    @Override // com.aspose.slides.internal.p392s4.AbstractC10134ck
    /* JADX INFO: renamed from: x1 */
    public void mo49798x1(int i) {
        this.f36511k4 = i | (this.f36511k4 << m49787jd());
        int iM49787jd = this.f36514x1 + m49787jd();
        while (true) {
            this.f36514x1 = iM49787jd;
            int i2 = this.f36514x1;
            if (i2 < 8) {
                return;
            }
            byte[] bArr = this.f36513to;
            int i3 = this.f36512kk;
            int i4 = i3 + 1;
            this.f36512kk = i4;
            bArr[i3] = (byte) (this.f36511k4 >> (i2 - 8));
            if (i4 == bArr.length) {
                m49917kk(i4);
                this.f36513to = new byte[255];
                this.f36512kk = 0;
            }
            iM49787jd = this.f36514x1 - 8;
        }
    }
}
