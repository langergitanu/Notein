package com.aspose.slides.internal.p532yu;

import com.aspose.slides.Collections.ArrayList;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.y6 */
/* JADX INFO: loaded from: classes5.dex */
public class C13300y6 extends C13060k4 {

    /* JADX INFO: renamed from: k4 */
    private C13073ks f44601k4;

    /* JADX INFO: renamed from: kk */
    private int f44602kk;

    /* JADX INFO: renamed from: x1 */
    private ArrayList f44603x1;

    public C13300y6(C13068kk c13068kk, C13073ks c13073ks) {
        super(c13068kk);
        this.f44602kk = 0;
        this.f44603x1 = new ArrayList();
        this.f44601k4 = c13073ks;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m61764k4(int i, int i2) {
        C13174qn c13174qn;
        C13172qk c13172qk = new C13172qk(this.f44601k4.m61064k4(), i, i2);
        int i3 = 0;
        if (this.f44602kk < this.f44603x1.size()) {
            c13174qn = (C13174qn) this.f44603x1.get_Item(this.f44602kk);
            c13174qn.f44240x1 = c13172qk;
            while (i3 < this.f44601k4.m61064k4()) {
                c13174qn.f44239kk[i3].m61595k4(c13172qk);
                i3++;
            }
        } else {
            c13174qn = new C13174qn(c13172qk, this.f44601k4.m61064k4());
            while (i3 < this.f44601k4.m61064k4()) {
                c13174qn.f44239kk[i3] = new C13207sq(this.f44601k4.f44052k4.m61637kk()[i3], c13172qk, i3);
                this.f44601k4.f44053kk.addItem(c13174qn.f44239kk[i3]);
                i3++;
            }
            this.f44603x1.addItem(c13174qn);
        }
        c13174qn.f44238k4 = m61018k4() - 1;
        int i4 = this.f44602kk;
        this.f44602kk = i4 + 1;
        return i4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m61765kk() {
        int i = this.f44602kk;
        if (i == 0) {
            return -1;
        }
        return ((C13174qn) this.f44603x1.get_Item(i - 1)).f44238k4;
    }

    /* JADX INFO: renamed from: to */
    public final C13172qk m61766to() {
        ArrayList arrayList = this.f44603x1;
        int i = this.f44602kk - 1;
        this.f44602kk = i;
        return ((C13174qn) arrayList.get_Item(i)).f44240x1;
    }

    @Override // com.aspose.slides.internal.p532yu.C13060k4
    /* JADX INFO: renamed from: x1 */
    public boolean mo61022x1(String str, String str2) {
        super.mo61022x1(str, str2);
        return this.f44602kk > 0 && m61018k4() == m61765kk();
    }
}
