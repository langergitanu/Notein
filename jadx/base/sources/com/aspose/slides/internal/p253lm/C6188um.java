package com.aspose.slides.internal.p253lm;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14084qq;

/* JADX INFO: renamed from: com.aspose.slides.internal.lm.um */
/* JADX INFO: loaded from: classes4.dex */
public final class C6188um extends C6116bs {

    /* JADX INFO: renamed from: k4 */
    public static final long f17501k4 = new C14084qq(1970, 1, 1, 0, 0, 0, 1L).m67130fa();

    /* JADX INFO: renamed from: to */
    private C14084qq f17502to;

    public C6188um(double d, C6116bs c6116bs) {
        this(C6191v4.m25080k4(d).Clone(), c6116bs);
    }

    /* JADX INFO: renamed from: k4 */
    public static double m25070k4(C14084qq c14084qq) {
        return (c14084qq.m67151uz().m67130fa() - f17501k4) / 10000;
    }

    @Override // com.aspose.slides.internal.p253lm.C6116bs, com.aspose.slides.internal.p253lm.AbstractC6211yd, com.aspose.slides.internal.p253lm.AbstractC6123ca
    /* JADX INFO: renamed from: C_ */
    public Object mo24769C_() {
        return this.f17502to;
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6123ca
    /* JADX INFO: renamed from: D_ */
    public Object mo24789D_() {
        return this.f17502to;
    }

    @Override // com.aspose.slides.internal.p253lm.C6116bs, com.aspose.slides.internal.p253lm.AbstractC6123ca
    /* JADX INFO: renamed from: to */
    public String mo24774to() {
        return "Date";
    }

    @Override // com.aspose.slides.internal.p253lm.C6116bs, com.aspose.slides.internal.p253lm.AbstractC6123ca
    public String toString() {
        return this.f17502to.m67145ne().mo66517k4("ddd, dd MMM yyyy HH':'mm':'ss 'GMT'zzz", C11697x1.m55250kk());
    }

    @Override // com.aspose.slides.internal.p253lm.C6116bs, com.aspose.slides.internal.p253lm.AbstractC6123ca
    /* JADX INFO: renamed from: x1 */
    public double mo24775x1() {
        return m25070k4(this.f17502to.Clone());
    }

    public C6188um(C14084qq c14084qq, C6116bs c6116bs) {
        super(c6116bs);
        C14084qq c14084qq2 = new C14084qq();
        this.f17502to = c14084qq2;
        c14084qq.CloneTo(c14084qq2);
    }

    @Override // com.aspose.slides.internal.p253lm.C6116bs, com.aspose.slides.internal.p253lm.AbstractC6211yd
    /* JADX INFO: renamed from: k4 */
    public void mo24771k4(Object obj) {
        C14084qq c14084qqM25080k4;
        if (C7019kk.m27469x1(obj, C14084qq.class)) {
            c14084qqM25080k4 = (C14084qq) C7019kk.m27464to(obj, C14084qq.class);
        } else if (!C7019kk.m27469x1(obj, Double.class)) {
            return;
        } else {
            c14084qqM25080k4 = C6191v4.m25080k4(((Double) C7019kk.m27464to(obj, Double.TYPE)).doubleValue());
        }
        c14084qqM25080k4.CloneTo(this.f17502to);
    }
}
