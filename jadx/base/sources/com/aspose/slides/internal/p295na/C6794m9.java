package com.aspose.slides.internal.p295na;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p199j5.InterfaceC5192du;
import com.aspose.slides.internal.p199j5.InterfaceC5195kk;
import com.aspose.slides.internal.p517y2.C12786x1;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: renamed from: com.aspose.slides.internal.na.m9 */
/* JADX INFO: loaded from: classes4.dex */
public class C6794m9 implements InterfaceC5192du, IDisposable {

    /* JADX INFO: renamed from: du */
    private InterfaceC12777qq f18814du;

    /* JADX INFO: renamed from: h4 */
    private boolean f18815h4;

    /* JADX INFO: renamed from: k4 */
    private InterfaceC12777qq f18816k4;

    /* JADX INFO: renamed from: kk */
    private InterfaceC5195kk f18817kk;

    /* JADX INFO: renamed from: to */
    private boolean f18818to;

    /* JADX INFO: renamed from: x1 */
    private int f18819x1;

    public C6794m9(InterfaceC12777qq interfaceC12777qq, int i, InterfaceC5195kk interfaceC5195kk, boolean z) {
        if (interfaceC12777qq == null) {
            throw new ArgumentNullException("root");
        }
        this.f18816k4 = interfaceC12777qq;
        this.f18819x1 = i;
        this.f18817kk = interfaceC5195kk;
        this.f18818to = z;
        this.f18814du = interfaceC12777qq;
    }

    /* JADX INFO: renamed from: h4 */
    private void m26871h4() {
        if (this.f18815h4) {
            throw new C12786x1((byte) 11);
        }
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        this.f18815h4 = true;
        this.f18814du = null;
    }

    @Override // com.aspose.slides.internal.p199j5.InterfaceC5192du
    /* JADX INFO: renamed from: du */
    public final InterfaceC12777qq mo22183du() {
        m26871h4();
        InterfaceC12777qq interfaceC12777qqMo22646kp = this.f18814du;
        while (interfaceC12777qqMo22646kp != null) {
            if (interfaceC12777qqMo22646kp.mo22653ss() != null) {
                interfaceC12777qqMo22646kp = interfaceC12777qqMo22646kp.mo22653ss();
            } else {
                if (interfaceC12777qqMo22646kp.mo22631g8() != null) {
                    interfaceC12777qqMo22646kp = interfaceC12777qqMo22646kp.mo22631g8();
                    break;
                }
                while (interfaceC12777qqMo22646kp != null) {
                    if (interfaceC12777qqMo22646kp.mo22646kp() == this.f18816k4 || interfaceC12777qqMo22646kp.mo22646kp() == null) {
                        return null;
                    }
                    InterfaceC12777qq interfaceC12777qqMo22631g8 = interfaceC12777qqMo22646kp.mo22646kp().mo22631g8();
                    interfaceC12777qqMo22646kp = interfaceC12777qqMo22646kp.mo22646kp();
                    if (interfaceC12777qqMo22631g8 != null) {
                        interfaceC12777qqMo22646kp = interfaceC12777qqMo22646kp.mo22631g8();
                        break;
                    }
                }
            }
            if (interfaceC12777qqMo22646kp != null && m26872x1(interfaceC12777qqMo22646kp)) {
                break;
            }
        }
        if (interfaceC12777qqMo22646kp != null) {
            this.f18814du = interfaceC12777qqMo22646kp;
        }
        return interfaceC12777qqMo22646kp;
    }

    @Override // com.aspose.slides.internal.p199j5.InterfaceC5192du
    /* JADX INFO: renamed from: k4 */
    public final InterfaceC12777qq mo22184k4() {
        return this.f18816k4;
    }

    @Override // com.aspose.slides.internal.p199j5.InterfaceC5192du
    /* JADX INFO: renamed from: kk */
    public final InterfaceC12777qq mo22186kk() {
        m26871h4();
        InterfaceC12777qq interfaceC12777qqMo22653ss = this.f18814du.mo22653ss();
        while (interfaceC12777qqMo22653ss != null && !m26872x1(interfaceC12777qqMo22653ss)) {
            interfaceC12777qqMo22653ss = interfaceC12777qqMo22653ss.mo22631g8();
        }
        if (interfaceC12777qqMo22653ss != null) {
            this.f18814du = interfaceC12777qqMo22653ss;
        }
        return interfaceC12777qqMo22653ss;
    }

    @Override // com.aspose.slides.internal.p199j5.InterfaceC5192du
    /* JADX INFO: renamed from: to */
    public final InterfaceC12777qq mo22187to() {
        m26871h4();
        InterfaceC12777qq interfaceC12777qqMo22661wp = this.f18814du.mo22661wp();
        while (interfaceC12777qqMo22661wp != null && !m26872x1(interfaceC12777qqMo22661wp)) {
            interfaceC12777qqMo22661wp = interfaceC12777qqMo22661wp.mo22654sv();
        }
        if (interfaceC12777qqMo22661wp != null) {
            this.f18814du = interfaceC12777qqMo22661wp;
        }
        return interfaceC12777qqMo22661wp;
    }

    @Override // com.aspose.slides.internal.p199j5.InterfaceC5192du
    /* JADX INFO: renamed from: x1 */
    public final InterfaceC12777qq mo22188x1() {
        m26871h4();
        return this.f18814du;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m26872x1(InterfaceC12777qq interfaceC12777qq) {
        if (!C6790du.m26861k4(interfaceC12777qq, this.f18819x1)) {
            return false;
        }
        InterfaceC5195kk interfaceC5195kk = this.f18817kk;
        return interfaceC5195kk == null || interfaceC5195kk.mo22191k4(interfaceC12777qq) == 1;
    }

    @Override // com.aspose.slides.internal.p199j5.InterfaceC5192du
    /* JADX INFO: renamed from: k4 */
    public final void mo22185k4(InterfaceC12777qq interfaceC12777qq) {
        m26871h4();
        if (interfaceC12777qq == null || !m26872x1(interfaceC12777qq)) {
            throw new C12786x1((byte) 9);
        }
        this.f18814du = interfaceC12777qq;
    }
}
