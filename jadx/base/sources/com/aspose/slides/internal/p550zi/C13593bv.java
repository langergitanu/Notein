package com.aspose.slides.internal.p550zi;

import com.aspose.slides.internal.p299ni.InterfaceC6899c5;
import com.aspose.slides.internal.p299ni.InterfaceC6900ck;
import com.aspose.slides.internal.p299ni.InterfaceC6908m9;
import com.aspose.slides.internal.p475wh.C12014ne;

/* JADX INFO: renamed from: com.aspose.slides.internal.zi.bv */
/* JADX INFO: loaded from: classes5.dex */
public class C13593bv extends C13614up implements InterfaceC6900ck {

    /* JADX INFO: renamed from: k4 */
    private AbstractC13613um f45146k4;

    /* JADX INFO: renamed from: x1 */
    private boolean f45147x1;

    @Override // com.aspose.slides.internal.p299ni.InterfaceC6903fa
    /* JADX INFO: renamed from: ix */
    public boolean mo10016ix() {
        return this.f45146k4.mo10016ix();
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC13613um m62708k4() {
        return this.f45146k4;
    }

    @Override // com.aspose.slides.internal.p550zi.C13614up
    /* JADX INFO: renamed from: to */
    public void mo24306to() {
        if (this.f45147x1) {
            this.f45146k4.dispose();
        }
        super.mo24306to();
    }

    @Override // com.aspose.slides.internal.p299ni.InterfaceC6900ck
    /* JADX INFO: renamed from: x1 */
    public void mo10018x1(C12014ne c12014ne, InterfaceC6908m9 interfaceC6908m9) {
        this.f45146k4.mo10018x1(c12014ne.Clone(), interfaceC6908m9);
    }

    @Override // com.aspose.slides.internal.p299ni.InterfaceC6903fa
    /* JADX INFO: renamed from: k4 */
    public void mo10017k4(C12014ne c12014ne, C13616v4 c13616v4, InterfaceC6899c5 interfaceC6899c5) {
        this.f45146k4.mo10017k4(c12014ne.Clone(), c13616v4, interfaceC6899c5);
    }
}
