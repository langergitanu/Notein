package com.aspose.slides.internal.p495x7;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p016a8.C1307to;
import com.aspose.slides.internal.p016a8.C1308x1;
import com.aspose.slides.internal.p066cl.InterfaceC2624k4;
import com.aspose.slides.internal.p129fe.C3983k4;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p477wk.AbstractC12082k4;
import com.aspose.slides.internal.p477wk.C12083kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.x7.k4 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC12472k4 extends AbstractC12082k4 implements InterfaceC12471jd {
    public AbstractC12472k4(C12009k4 c12009k4, C12083kk c12083kk) {
        super(c12009k4, c12083kk);
    }

    @Override // com.aspose.slides.internal.p495x7.InterfaceC12471jd
    /* JADX INFO: renamed from: k4 */
    public C3983k4 mo58027k4(boolean z) {
        m58030x1();
        byte[] bArr = new byte[this.f40622to * this.f40617dy];
        if (!z) {
            if (m56951kk() == m56944c5()) {
                mo19867k4(bArr);
            } else {
                m58029to(bArr);
            }
        }
        return new C3983k4(this.f40621m9, this.f40617dy, m56944c5(), this.f40622to, 0, bArr);
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo58019k4(int i, C1307to c1307to);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo19867k4(byte[] bArr);

    /* JADX INFO: renamed from: kk */
    public abstract int mo58020kk(int i);

    /* JADX INFO: renamed from: to */
    public void m58029to(byte[] bArr) {
        final InterfaceC2624k4 interfaceC2624k4M56954to = m56954to();
        interfaceC2624k4M56954to.mo11991up();
        m56949k4(interfaceC2624k4M56954to.mo11977fa());
        m56955x1(bArr).m7793k4(new C1308x1.k4() { // from class: com.aspose.slides.internal.x7.k4.1
            @Override // com.aspose.slides.internal.p016a8.C1308x1.k4
            /* JADX INFO: renamed from: k4 */
            public void mo7794k4(int i, int i2, int i3, int i4, C1307to c1307to) {
                AbstractC12472k4.this.mo58019k4(AbstractC12472k4.this.mo58020kk(interfaceC2624k4M56954to.mo11980k4(i3, i4)), c1307to);
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public void m58030x1() {
        int i;
        int i2 = this.f40616du;
        if (i2 < 0 || this.f40618h4 < 0 || (i = this.f40621m9) < 1 || this.f40617dy < 1 || i2 + i > this.f40619k4.mo15760yj() || this.f40618h4 + this.f40617dy > this.f40619k4.mo15757m9()) {
            m58028k4();
        }
        int iM56944c5 = m56944c5();
        if (m56951kk() != 1052676 && iM56944c5 == 1052676 && m56950k4(m56946dy())) {
            m58028k4();
        }
        if (m56946dy() == 4) {
            m58028k4();
        }
        if (iM56944c5 == 131072 || iM56944c5 == 2097152 || iM56944c5 == 262144 || iM56944c5 == 0 || iM56944c5 == 1048576 || iM56944c5 == 65536 || iM56944c5 == 15 || iM56944c5 == 524288) {
            m58028k4();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m58028k4() {
        throw new ArgumentException("Parameter 'format' is not valid");
    }
}
