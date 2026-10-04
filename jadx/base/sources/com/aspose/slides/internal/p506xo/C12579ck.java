package com.aspose.slides.internal.p506xo;

import com.aspose.slides.internal.p329p4.C7182dy;
import com.aspose.slides.internal.p329p4.C7186k4;
import com.aspose.slides.internal.p329p4.C7187kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.xo.ck */
/* JADX INFO: loaded from: classes5.dex */
public class C12579ck extends AbstractC12578c5 {

    /* JADX INFO: renamed from: du */
    private C7186k4 f42102du;

    /* JADX INFO: renamed from: h4 */
    private AbstractC12588to f42103h4;

    /* JADX INFO: renamed from: m9 */
    private C7187kk f42104m9;

    public C12579ck() {
        this.f42121k4.m27815x1(C7182dy.f19585pu, C7182dy.f19466il);
    }

    @Override // com.aspose.slides.internal.p506xo.AbstractC12588to
    /* JADX INFO: renamed from: k4 */
    public float mo58724k4(int i) {
        return this.f42103h4.mo58724k4(i);
    }

    @Override // com.aspose.slides.internal.p506xo.AbstractC12588to
    /* JADX INFO: renamed from: x1 */
    public float mo58725x1() {
        return this.f42103h4.mo58725x1();
    }

    public C12579ck(C7187kk c7187kk) {
        super(c7187kk);
        C7187kk c7187kk2 = (C7187kk) m58723k4().m27787x1(0);
        this.f42104m9 = c7187kk2;
        if (c7187kk2 != null) {
            try {
                this.f42103h4 = C12587m9.m58747k4(c7187kk2);
            } catch (RuntimeException unused) {
            }
        }
    }

    @Override // com.aspose.slides.internal.p506xo.AbstractC12578c5, com.aspose.slides.internal.p506xo.AbstractC12588to
    /* JADX INFO: renamed from: k4 */
    public float mo58717k4(byte[] bArr, int i, int i2) {
        return this.f42103h4.mo58717k4(bArr, i, i2);
    }

    @Override // com.aspose.slides.internal.p506xo.AbstractC12578c5, com.aspose.slides.internal.p506xo.AbstractC12588to
    /* JADX INFO: renamed from: x1 */
    public float mo58722x1(byte[] bArr, int i, int i2) {
        return this.f42103h4.mo58722x1(bArr, i, i2);
    }

    /* JADX INFO: renamed from: k4 */
    private C7186k4 m58723k4() {
        if (this.f42102du == null) {
            this.f42102du = (C7186k4) this.f42121k4.mo27768h4(C7182dy.f19672vt);
        }
        return this.f42102du;
    }
}
