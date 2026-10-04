package com.aspose.slides.internal.p407st;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.of */
/* JADX INFO: loaded from: classes4.dex */
public class C10575of extends C10704x2 {

    /* JADX INFO: renamed from: x1 */
    private int f37267x1 = 65535;

    /* JADX INFO: renamed from: kk */
    private final List<C10541md> f37266kk = new List<>();

    public C10575of() {
        m51409um().m51917k4(4013);
    }

    @Override // com.aspose.slides.internal.p407st.C10704x2, com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        int iM51284x1 = 2;
        for (int i = 0; i < this.f37266kk.size(); i++) {
            iM51284x1 += this.f37266kk.get_Item(i).m51284x1();
        }
        return iM51284x1;
    }

    /* JADX INFO: renamed from: kk */
    public final List<C10541md> m51428kk() {
        return this.f37266kk;
    }

    @Override // com.aspose.slides.internal.p407st.C10704x2, com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f37267x1 = c3134k4.m13382u4();
        m51428kk().clear();
        for (int i = 0; i < (this.f37267x1 & 65535); i++) {
            C10541md c10541md = new C10541md();
            c10541md.m51282k4(c3134k4);
            this.f37266kk.addItem(c10541md);
        }
    }

    @Override // com.aspose.slides.internal.p407st.C10704x2, com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        int size = this.f37266kk.size();
        c3149x1.m13448k4((short) size);
        for (int i = 0; i < size; i++) {
            this.f37266kk.get_Item(i).m51283k4(c3149x1);
        }
    }
}
