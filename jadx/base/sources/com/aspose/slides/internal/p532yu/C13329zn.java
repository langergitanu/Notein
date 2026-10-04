package com.aspose.slides.internal.p532yu;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.zn */
/* JADX INFO: loaded from: classes5.dex */
public class C13329zn implements InterfaceC13298y4 {

    /* JADX INFO: renamed from: du */
    private C12943dd f44644du;

    /* JADX INFO: renamed from: dy */
    private int f44645dy;

    /* JADX INFO: renamed from: h4 */
    private C13164q9 f44646h4;

    /* JADX INFO: renamed from: k4 */
    private boolean f44647k4;

    /* JADX INFO: renamed from: kk */
    private C13021hu f44648kk;

    /* JADX INFO: renamed from: m9 */
    private int f44649m9;

    /* JADX INFO: renamed from: to */
    private C13146p4 f44650to;

    /* JADX INFO: renamed from: x1 */
    private boolean f44651x1;

    public C13329zn() {
        m61902jd();
    }

    @Override // com.aspose.slides.internal.p532yu.InterfaceC13298y4
    public final boolean aj_() {
        return this.f44651x1;
    }

    @Override // com.aspose.slides.internal.p532yu.InterfaceC13298y4
    public final int ak_() {
        return this.f44649m9;
    }

    @Override // com.aspose.slides.internal.p532yu.InterfaceC13298y4
    public final C13164q9 al_() {
        return this.f44646h4;
    }

    @Override // com.aspose.slides.internal.p532yu.InterfaceC13298y4
    public final C12943dd am_() {
        return this.f44644du;
    }

    @Override // com.aspose.slides.internal.p532yu.InterfaceC13298y4
    public final C13021hu an_() {
        return this.f44648kk;
    }

    @Override // com.aspose.slides.internal.p532yu.InterfaceC13298y4
    public final C13146p4 ao_() {
        return this.f44650to;
    }

    /* JADX INFO: renamed from: c5 */
    public final boolean m61900c5() {
        C12943dd c12943dd = this.f44644du;
        return (c12943dd == null || c12943dd.m60211bz() == null || this.f44644du.m60211bz().mo60017ck() != 2) ? false : true;
    }

    /* JADX INFO: renamed from: dy */
    public final C12943dd m61901dy() {
        C13164q9 c13164q9 = this.f44646h4;
        return c13164q9 != null ? c13164q9 : this.f44644du;
    }

    /* JADX INFO: renamed from: jd */
    public final void m61902jd() {
        this.f44651x1 = false;
        this.f44647k4 = false;
        this.f44644du = null;
        this.f44648kk = null;
        this.f44650to = null;
        this.f44646h4 = null;
        this.f44649m9 = 0;
        this.f44645dy = 1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61903k4(int i) {
        this.f44649m9 = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m61909x1(boolean z) {
        this.f44651x1 = z;
    }

    public C13329zn(int i) {
        this();
        this.f44649m9 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61904k4(C12943dd c12943dd) {
        this.f44644du = c12943dd;
        this.f44645dy = c12943dd != null ? c12943dd.m60222sv() : 1;
    }

    @Override // com.aspose.slides.internal.p532yu.InterfaceC13298y4
    /* JADX INFO: renamed from: x1 */
    public final boolean mo61763x1() {
        return this.f44647k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61905k4(C13021hu c13021hu) {
        this.f44648kk = c13021hu;
        if (c13021hu != null) {
            this.f44650to = null;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61906k4(C13146p4 c13146p4) {
        this.f44650to = c13146p4;
        if (c13146p4 != null) {
            this.f44648kk = null;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61907k4(C13164q9 c13164q9) {
        this.f44646h4 = c13164q9;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61908k4(boolean z) {
        this.f44647k4 = z;
    }
}
