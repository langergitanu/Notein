package com.aspose.slides.internal.p174hz;

/* JADX INFO: renamed from: com.aspose.slides.internal.hz.f9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4713f9 extends AbstractC4736my {

    /* JADX INFO: renamed from: k4 */
    protected int f13139k4;

    public AbstractC4713f9() {
        this.f13206du = 128;
        this.f13211kk = 64;
        this.f13204c5 = 8;
        this.f13207dy = new C4711e0[]{new C4711e0(40, 128, 8)};
        this.f13212m9 = new C4711e0[]{new C4711e0(64, 64, 0)};
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC4713f9 m19605k4(String str) {
        return (AbstractC4713f9) C4756up.m19759k4(str);
    }

    /* JADX INFO: renamed from: kk */
    public static AbstractC4713f9 m19606kk() {
        return m19605k4(C4749t6.class.getName());
    }

    /* JADX INFO: renamed from: du */
    public int mo19607du() {
        int i = this.f13139k4;
        return i == 0 ? this.f13206du : i;
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4736my
    /* JADX INFO: renamed from: h4 */
    public int mo19608h4() {
        return super.mo19608h4();
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4736my
    /* JADX INFO: renamed from: k4 */
    public void mo19609k4(int i) {
        super.mo19609k4(i);
        this.f13139k4 = i;
    }
}
