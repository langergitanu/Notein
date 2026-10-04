package com.aspose.slides.internal.p253lm;

import com.aspose.slides.p559ms.System.C14057f9;

/* JADX INFO: renamed from: com.aspose.slides.internal.lm.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C6201x1 extends C6116bs {

    /* JADX INFO: renamed from: du */
    private InterfaceC6173qw f17526du;

    /* JADX INFO: renamed from: k4 */
    protected C6165o9 f17527k4;

    /* JADX INFO: renamed from: to */
    private int f17528to;

    public C6201x1(InterfaceC6173qw interfaceC6173qw, C6198wp c6198wp, AbstractC6123ca[] abstractC6123caArr) {
        super(interfaceC6173qw.mo24967fa().m24759jd());
        this.f17526du = interfaceC6173qw;
        for (int i = 0; i < abstractC6123caArr.length; i++) {
            C6165o9 c6165o9 = new C6165o9(this, C14057f9.m66591x1(i), abstractC6123caArr[i]);
            c6165o9.m24911k4(false);
            mo25036k4((AbstractC6155lr) c6165o9);
        }
        this.f17528to = abstractC6123caArr.length;
        C6165o9 c6165o92 = new C6165o9(this, "callee", c6198wp);
        this.f17527k4 = c6165o92;
        c6165o92.m24911k4(false);
        mo25036k4((AbstractC6155lr) this.f17527k4);
        C6151kk c6151kk = new C6151kk(interfaceC6173qw, this, "length");
        c6151kk.m24911k4(false);
        mo25036k4((AbstractC6155lr) c6151kk);
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6211yd
    /* JADX INFO: renamed from: k4 */
    public void mo24947k4(int i) {
        this.f17528to = i;
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6211yd
    /* JADX INFO: renamed from: kk */
    public int mo24948kk() {
        return this.f17528to;
    }

    @Override // com.aspose.slides.internal.p253lm.C6116bs, com.aspose.slides.internal.p253lm.AbstractC6123ca
    /* JADX INFO: renamed from: to */
    public String mo24774to() {
        return "Arguments";
    }

    @Override // com.aspose.slides.internal.p253lm.C6116bs, com.aspose.slides.internal.p253lm.AbstractC6123ca
    /* JADX INFO: renamed from: x1 */
    public double mo24775x1() {
        return mo24948kk();
    }

    @Override // com.aspose.slides.internal.p253lm.C6116bs, com.aspose.slides.internal.p253lm.AbstractC6123ca
    /* JADX INFO: renamed from: k4 */
    public boolean mo24772k4() {
        return false;
    }
}
