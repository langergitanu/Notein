package com.aspose.slides.internal.p416tb;

/* JADX INFO: renamed from: com.aspose.slides.internal.tb.uz */
/* JADX INFO: loaded from: classes4.dex */
public class C10915uz extends AbstractC10914up {

    /* JADX INFO: renamed from: k4 */
    private final C10913um f37963k4;

    /* JADX INFO: renamed from: kk */
    private final C10917wl f37964kk;

    public C10915uz(C10898dy c10898dy) {
        super(c10898dy);
        this.f37964kk = new C10917wl();
        this.f37963k4 = new C10913um(c10898dy);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m52571k4() {
        return this.f37964kk.size();
    }

    /* JADX INFO: renamed from: x1 */
    public final C10913um m52573x1() {
        return this.f37963k4;
    }

    @Override // com.aspose.slides.internal.p416tb.AbstractC10914up
    /* JADX INFO: renamed from: k4 */
    public void mo9082k4(C10922yj c10922yj) {
        c10922yj.m52676k4(this);
        c10922yj.m52643dy();
        c10922yj.m52666kk("/Type", "/Pages");
        c10922yj.m52652k4("/Count", this.f37964kk.size());
        c10922yj.m52650k4("/Kids");
        this.f37964kk.m52590k4(c10922yj);
        c10922yj.m52640c5();
        c10922yj.m52678x1();
        this.f37963k4.m52564x1(c10922yj);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52572k4(String str) {
        this.f37964kk.addItem(str);
    }
}
