package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.C10462h9;
import com.aspose.slides.internal.p407st.C10724y1;

/* JADX INFO: loaded from: classes3.dex */
class q0x extends uz3 {

    /* JADX INFO: renamed from: c5 */
    private ILineFormat f48219c5;

    public q0x(ILineFormat iLineFormat, r9q r9qVar) {
        super(r9qVar);
        this.f48219c5 = iLineFormat;
    }

    /* JADX INFO: renamed from: c5 */
    public final r9q m69354c5() {
        return (r9q) C7019kk.m27452k4((Object) this.f3955kk, r9q.class);
    }

    /* JADX INFO: renamed from: ck */
    public final ILineFormat m69355ck() {
        return this.f48219c5;
    }

    @Override // com.aspose.slides.uz3
    /* JADX INFO: renamed from: dy */
    public void mo5827dy() {
        oiv oivVar = ((uz3) this).f49441to;
        if (oivVar != null) {
            oivVar.m68606x1();
        }
        m72012x6();
        if (this.f49440m9) {
            return;
        }
        this.f3955kk.m74353ck().m50513yj().addItem(m72000ix());
        this.f49440m9 = true;
    }

    @Override // com.aspose.slides.uz3, com.aspose.slides.au9
    /* JADX INFO: renamed from: k4 */
    public void mo3740k4() {
        C10462h9 c10462h9 = new C10462h9();
        c10462h9.m50512x1(true);
        C10724y1 c10724y1Mo50864to = c10462h9.mo50864to();
        c10724y1Mo50864to.m52046x1(true);
        c10724y1Mo50864to.m52035jd(true);
        c10724y1Mo50864to.m52032fa(true);
        c10724y1Mo50864to.m52036k4(20);
        this.f3957x1 = c10462h9;
        this.f3955kk.m74353ck().m50513yj().addItem(this.f3957x1);
        this.f49440m9 = true;
    }
}
