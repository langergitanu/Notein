package com.aspose.slides.internal.p407st;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.x2 */
/* JADX INFO: loaded from: classes4.dex */
public class C10704x2 extends AbstractC10571o4 {

    /* JADX INFO: renamed from: k4 */
    List<C10756zp> f37495k4 = new List<>();

    public C10704x2() {
        m51409um().m51917k4(4012);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        int iM52171to = 0;
        for (int i = 0; i < this.f37495k4.size(); i++) {
            iM52171to += this.f37495k4.get_Item(i).m52171to();
        }
        return iM52171to;
    }

    /* JADX INFO: renamed from: x1 */
    public final List<C10756zp> m51967x1() {
        return this.f37495k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m51966k4(C10756zp c10756zp) {
        if (c10756zp == null) {
            return -1;
        }
        if (this.f37495k4.size() == 0) {
            this.f37495k4.addItem(new C10756zp());
        }
        int size = this.f37495k4.size();
        int i = size - 1;
        if (this.f37495k4.get_Item(i).m52169k4(c10756zp)) {
            return i;
        }
        this.f37495k4.addItem(c10756zp);
        return size;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        int iM51914du = m51409um().m51914du();
        this.f37495k4.clear();
        while (iM51914du > 0) {
            C10756zp c10756zp = new C10756zp();
            c10756zp.m52167k4(c3134k4);
            this.f37495k4.addItem(c10756zp);
            iM51914du -= c10756zp.m52171to();
        }
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        for (int i = 0; i < this.f37495k4.size(); i++) {
            this.f37495k4.get_Item(i).m52168k4(c3149x1);
        }
    }
}
