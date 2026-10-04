package com.aspose.slides.internal.p077d8;

import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.d8.ca */
/* JADX INFO: loaded from: classes3.dex */
public class C3042ca {

    /* JADX INFO: renamed from: k4 */
    private List<C3116zj> f8946k4;

    public C3042ca() {
        List<C3116zj> list = new List<>(16);
        this.f8946k4 = list;
        list.addItem(new C3116zj(0, new C3032ai(0, Integer.MAX_VALUE, null)));
    }

    /* JADX INFO: renamed from: k4 */
    private int m12826k4(int i) {
        int size = this.f8946k4.size();
        int i2 = 0;
        while (size - i2 > 1) {
            int i3 = (i2 + size) >> 1;
            if (i < this.f8946k4.get_Item(i3).f9253k4) {
                size = i3;
            } else {
                i2 = i3;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12827k4(int i, int i2) {
        int iM12826k4 = m12826k4(i);
        int i3 = i + i2;
        int iM12826k42 = m12826k4(i3);
        C3116zj c3116zj = this.f8946k4.get_Item(iM12826k4);
        int i4 = c3116zj.f9253k4;
        if (i < i4) {
            if (i2 - (i4 - i) < 0) {
                return;
            } else {
                i = i4;
            }
        }
        if (i > i4) {
            C3032ai c3032ai = c3116zj.f9254x1;
            if (c3032ai.f8885x1 > i) {
                c3032ai.f8885x1 = i;
            }
            iM12826k4++;
        }
        if (iM12826k42 > iM12826k4) {
            this.f8946k4.removeRange(iM12826k4, iM12826k42 - iM12826k4);
        }
        if (iM12826k4 == this.f8946k4.size()) {
            this.f8946k4.addItem(new C3116zj(i3, new C3032ai(i3, Integer.MAX_VALUE, null)));
            return;
        }
        C3116zj c3116zj2 = this.f8946k4.get_Item(iM12826k4);
        int i5 = i3 - c3116zj2.f9253k4;
        if (i5 > 0) {
            c3116zj2.f9253k4 = i3;
            c3116zj2.f9254x1.f8883k4 += i5;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12828k4(char[] cArr, int i) {
        m12829k4(cArr, 0, cArr.length, i);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12829k4(char[] cArr, int i, int i2, int i3) {
        int iM12826k4 = m12826k4(i3);
        C3116zj c3116zj = this.f8946k4.get_Item(iM12826k4);
        int i4 = c3116zj.f9253k4;
        if (i4 < i3) {
            if (i3 < i4 + c3116zj.f9254x1.m12770k4()) {
                C3032ai c3032ai = c3116zj.f9254x1;
                C3116zj c3116zj2 = new C3116zj(i3, new C3032ai((c3032ai.f8883k4 + i3) - c3116zj.f9253k4, c3032ai.f8885x1, c3032ai.f8884kk));
                c3032ai.f8885x1 = (c3032ai.f8883k4 + i3) - c3116zj.f9253k4;
                this.f8946k4.insertItem(iM12826k4 + 1, c3116zj2);
            }
            iM12826k4++;
        }
        this.f8946k4.insertItem(iM12826k4, new C3116zj(i3, new C3032ai(i, i2, cArr)));
    }

    /* JADX INFO: renamed from: k4 */
    public final C3032ai[] m12830k4() {
        int size = this.f8946k4.size();
        C3032ai[] c3032aiArr = new C3032ai[size];
        for (int i = 0; i < size; i++) {
            c3032aiArr[i] = this.f8946k4.get_Item(i).f9254x1;
        }
        return c3032aiArr;
    }
}
