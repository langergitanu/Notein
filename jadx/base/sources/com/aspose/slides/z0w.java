package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
class z0w extends AbstractC14770x9 {

    /* JADX INFO: renamed from: k4 */
    private List<xhm> f50432k4 = new List<>();

    /* JADX INFO: renamed from: x1 */
    private zsm f50433x1;

    public z0w(zsm zsmVar) {
        this.f50433x1 = zsmVar;
    }

    /* JADX INFO: renamed from: to */
    private List<String> m74184to() {
        String strM34182k4;
        boolean z;
        List<String> list = new List<>();
        if (this.f50433x1.m74792m9().m74307kk().getDisplayRSquaredValue()) {
            list.addItem(C14113y2.m67400k4("", "R"));
            list.addItem("2");
            if ("".equals(this.f50433x1.m74792m9().m74307kk().m3026k4().m70595x1().m34182k4()) || "General".equals(this.f50433x1.m74792m9().m74307kk().m3026k4().m70595x1().m34182k4())) {
                strM34182k4 = "0.0000";
                z = true;
            } else {
                strM34182k4 = this.f50433x1.m74792m9().m74307kk().m3026k4().m70595x1().m34182k4();
                z = false;
            }
            String strM66433k4 = C14044b3.m66433k4(this.f50433x1.m74787jd(), strM34182k4);
            if (z) {
                if (C14044b3.m66426k4(strM66433k4) == 0.0d) {
                    String[] strArrM67414k4 = C14113y2.m67414k4(strM66433k4, 'E');
                    if (strArrM67414k4.length > 1) {
                        strM66433k4 = C14113y2.m67408k4(cs8.m4804k4(strArrM67414k4[0]), "E");
                        for (int i = 1; i < strArrM67414k4.length; i++) {
                            strM66433k4 = C14113y2.m67400k4(strM66433k4, strArrM67414k4[i]);
                        }
                    }
                } else {
                    strM66433k4 = cs8.m4804k4(strM66433k4);
                }
            }
            list.addItem(C14113y2.m67400k4(" = ", strM66433k4));
        }
        return list;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        List<String> listM74184to = m74184to();
        this.f50432k4.addItem(new oir(this.f50433x1, listM74184to.get_Item(0)));
        this.f50432k4.addItem(new suf(this.f50433x1, listM74184to.get_Item(1)));
        this.f50432k4.addItem(new oir(this.f50433x1, listM74184to.get_Item(2)));
        m73215k4(this.f50432k4.get_Item(0));
        m73215k4(this.f50432k4.get_Item(1));
        m73215k4(this.f50432k4.get_Item(2));
        this.f50432k4.get_Item(0).m73210fa(c14713vw);
        this.f50432k4.get_Item(1).m73210fa(c14713vw);
        this.f50432k4.get_Item(2).m73210fa(c14713vw);
        m73222to(C14116yg.m67481k4(this.f50432k4.get_Item(0).m73203ak(), this.f50432k4.get_Item(2).m73203ak()));
        m73217kk(this.f50432k4.get_Item(0).m73225wy() + this.f50432k4.get_Item(1).m73225wy() + this.f50432k4.get_Item(2).m73225wy());
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
        this.f50432k4.get_Item(1).m73208du(this.f50432k4.get_Item(0).m73225wy());
        this.f50432k4.get_Item(2).m73208du(this.f50432k4.get_Item(1).m73205bz() + this.f50432k4.get_Item(1).m73225wy());
        for (AbstractC14770x9 abstractC14770x9 : m73204b3()) {
            abstractC14770x9.m73220ss();
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: to */
    public void mo3230to(C14713vw c14713vw) {
    }
}
