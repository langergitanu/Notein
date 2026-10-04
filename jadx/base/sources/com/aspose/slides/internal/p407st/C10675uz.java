package com.aspose.slides.internal.p407st;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.uz */
/* JADX INFO: loaded from: classes4.dex */
public class C10675uz extends AbstractC10571o4 {

    /* JADX INFO: renamed from: k4 */
    private List<Long> f37437k4;

    public C10675uz() {
        List<Long> list = new List<>();
        this.f37437k4 = list;
        list.addItem(16777215L);
        this.f37437k4.addItem(0L);
        this.f37437k4.addItem(8421504L);
        this.f37437k4.addItem(0L);
        this.f37437k4.addItem(14934203L);
        this.f37437k4.addItem(10040115L);
        this.f37437k4.addItem(10066176L);
        this.f37437k4.addItem(52377L);
        m51409um().m51920k4((short) 1);
        m51409um().m51917k4(2032);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return 32;
    }

    /* JADX INFO: renamed from: x1 */
    public final List<Long> m51835x1() {
        return this.f37437k4;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f37437k4.clear();
        for (int i = 0; i < 8; i++) {
            this.f37437k4.addItem(Long.valueOf(c3134k4.m13384uz()));
        }
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        for (int i = 0; i < 8; i++) {
            c3149x1.m13455x1(this.f37437k4.get_Item(i).intValue());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51834k4(C10675uz c10675uz) {
        if (c10675uz == null) {
            return;
        }
        this.f37437k4.clear();
        this.f37437k4.addRange(c10675uz.m51835x1());
    }
}
