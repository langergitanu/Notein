package com.aspose.slides.internal.p495x7;

import com.aspose.slides.exceptions.AccessViolationException;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p016a8.C1307to;
import com.aspose.slides.internal.p016a8.C1308x1;
import com.aspose.slides.internal.p066cl.InterfaceC2623jd;
import com.aspose.slides.internal.p066cl.InterfaceC2624k4;
import com.aspose.slides.internal.p066cl.InterfaceC2628x1;
import com.aspose.slides.internal.p129fe.C3983k4;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p477wk.AbstractC12082k4;
import com.aspose.slides.internal.p477wk.C12083kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.x7.to */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC12480to extends AbstractC12082k4 implements InterfaceC12463ck {

    /* JADX INFO: renamed from: c5 */
    protected C3983k4 f41608c5;

    public AbstractC12480to(C12009k4 c12009k4, C12083kk c12083kk, C3983k4 c3983k4) {
        super(c12009k4, c12083kk);
        this.f41608c5 = c3983k4;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m58036x1() {
        return m56956x1(m56946dy()) || m56951kk() == m56944c5();
    }

    @Override // com.aspose.slides.internal.p495x7.InterfaceC12463ck
    /* JADX INFO: renamed from: ck */
    public void mo58024ck() {
        m58035k4(this.f41608c5);
        if (m58036x1()) {
            if (m56951kk() == m56944c5()) {
                mo19869k4();
            } else {
                m58037fa();
            }
        }
    }

    /* JADX INFO: renamed from: fa */
    public void m58037fa() {
        InterfaceC2624k4 interfaceC2624k4M56954to = m56954to();
        final InterfaceC2623jd interfaceC2623jdM56945du = m56945du();
        final InterfaceC2628x1 interfaceC2628x1Mo11991up = interfaceC2624k4M56954to.mo11991up();
        final Object objM56949k4 = m56949k4(interfaceC2623jdM56945du);
        m56955x1(m58038up()).m7793k4(new C1308x1.k4() { // from class: com.aspose.slides.internal.x7.to.1
            @Override // com.aspose.slides.internal.p016a8.C1308x1.k4
            /* JADX INFO: renamed from: k4 */
            public void mo7794k4(int i, int i2, int i3, int i4, C1307to c1307to) {
                interfaceC2623jdM56945du.mo11970k4(i3, i4, interfaceC2628x1Mo11991up.mo11999k4(AbstractC12480to.this.mo58022kk(AbstractC12480to.this.mo58021k4(c1307to)), objM56949k4));
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public int mo58021k4(C1307to c1307to) {
        return c1307to.mo7783k4();
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo19869k4();

    /* JADX INFO: renamed from: kk */
    public abstract int mo58022kk(int i);

    /* JADX INFO: renamed from: up */
    public byte[] m58038up() {
        return (byte[]) this.f41608c5.m15721to().m67356kk().m19850k4();
    }

    /* JADX INFO: renamed from: k4 */
    private void m58035k4(C3983k4 c3983k4) {
        if (m56956x1(m56946dy()) && ((c3983k4.m15722x1() > this.f40619k4.mo15760yj() && this.f40619k4.mo15753jd() != 197634) || c3983k4.m15716k4() > this.f40619k4.mo15757m9())) {
            throw new AccessViolationException();
        }
        if (m56944c5() == 1052676 && m56951kk() != m56944c5() && m56956x1(m56946dy())) {
            throw new ArgumentException("Parameter 'format' is not valid");
        }
    }
}
