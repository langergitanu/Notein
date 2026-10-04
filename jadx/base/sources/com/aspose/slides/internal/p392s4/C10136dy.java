package com.aspose.slides.internal.p392s4;

import com.aspose.slides.internal.p299ni.InterfaceC6906k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.s4.dy */
/* JADX INFO: loaded from: classes4.dex */
public class C10136dy extends AbstractC10134ck {

    /* JADX INFO: renamed from: du */
    private int f36364du;

    /* JADX INFO: renamed from: h4 */
    private int f36365h4;

    /* JADX INFO: renamed from: k4 */
    private int f36366k4;

    /* JADX INFO: renamed from: kk */
    private final byte[] f36367kk;

    /* JADX INFO: renamed from: m9 */
    private int f36368m9;

    /* JADX INFO: renamed from: to */
    private int f36369to;

    /* JADX INFO: renamed from: x1 */
    private final int f36370x1;

    public C10136dy(InterfaceC6906k4 interfaceC6906k4, int i) {
        this(interfaceC6906k4, i, 1, 0);
    }

    /* JADX INFO: renamed from: du */
    private void m49828du() {
        byte[] bArr = this.f36366k4 > 0 ? new byte[]{1, (byte) (this.f36364du & 255)} : new byte[]{(byte) (this.f36364du & 255)};
        m49797x1().mo27041k4(bArr, bArr.length);
    }

    /* JADX INFO: renamed from: k4 */
    public void m49829k4() {
        m49797x1().mo27041k4(new byte[1], 1);
    }

    /* JADX INFO: renamed from: kk */
    public void m49830kk(int i) {
        this.f36367kk[0] = (byte) i;
        m49797x1().mo27041k4(this.f36367kk, i + 1);
    }

    @Override // com.aspose.slides.internal.p392s4.AbstractC10133c5
    /* JADX INFO: renamed from: to */
    public void mo49789to() {
        this.f36368m9 = (1 << m49787jd()) - 1;
        super.mo49789to();
    }

    @Override // com.aspose.slides.internal.p392s4.AbstractC10134ck
    /* JADX INFO: renamed from: x1 */
    public void mo49798x1(int i) {
        int i2 = i & this.f36368m9;
        int i3 = this.f36364du;
        int i4 = this.f36369to;
        this.f36364du = (i2 << i4) | i3;
        this.f36369to = i4 + m49787jd();
        while (true) {
            int i5 = this.f36369to;
            if (i5 < 8) {
                return;
            }
            int i6 = this.f36365h4;
            if (i6 < this.f36370x1) {
                byte[] bArr = this.f36367kk;
                this.f36365h4 = i6 + 1;
                int i7 = this.f36364du;
                bArr[i6] = (byte) (i7 & 255);
                this.f36364du = i7 >> 8;
                this.f36369to = i5 - 8;
            } else {
                m49830kk(i6 - this.f36366k4);
                this.f36365h4 = this.f36366k4;
            }
        }
    }

    public C10136dy(InterfaceC6906k4 interfaceC6906k4, int i, int i2, int i3) {
        super(interfaceC6906k4, i, i3);
        this.f36366k4 = i2;
        byte[] bArr = new byte[i2 + 255];
        this.f36367kk = bArr;
        this.f36365h4 = i2;
        this.f36370x1 = bArr.length;
        this.f36368m9 = (1 << m49787jd()) - 1;
    }

    @Override // com.aspose.slides.internal.p392s4.AbstractC10134ck
    /* JADX INFO: renamed from: k4 */
    public void mo49794k4(int i) {
        super.mo49794k4(i);
        mo49798x1(mo49786h4());
        int i2 = this.f36365h4;
        int i3 = this.f36366k4;
        if (i2 != i3) {
            if (this.f36369to == 0) {
                m49830kk(i2 - i3);
            } else if (i2 < this.f36370x1) {
                byte[] bArr = this.f36367kk;
                int i4 = i2 + 1;
                this.f36365h4 = i4;
                bArr[i2] = (byte) (this.f36364du & 255);
                m49830kk(i4 - i3);
            } else {
                m49830kk(i2 - i3);
                m49828du();
            }
        } else if (this.f36369to != 0) {
            m49828du();
        }
        m49829k4();
        m49797x1().mo27038k4(i);
    }
}
