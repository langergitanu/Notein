package com.aspose.slides;

import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.qn */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC14353qn {

    /* JADX INFO: renamed from: k4 */
    protected boolean f48362k4 = false;

    /* JADX INFO: renamed from: kk */
    private C14237oh f48363kk;

    /* JADX INFO: renamed from: x1 */
    private C0974f2 f48364x1;

    public AbstractC14353qn(C14237oh c14237oh, C0974f2 c0974f2) {
        this.f48363kk = c14237oh;
        this.f48364x1 = c0974f2;
    }

    /* JADX INFO: renamed from: du */
    public final Chart m69704du() {
        return this.f48364x1.m7149to().m69834fa();
    }

    /* JADX INFO: renamed from: h4 */
    public final C0974f2 m69705h4() {
        return this.f48364x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC14763x3 m69706k4() {
        return this.f48363kk.m68551du();
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo3141k4(C14713vw c14713vw);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo3142k4(C12025x6[] c12025x6Arr, C12015qq[] c12015qqArr);

    /* JADX INFO: renamed from: kk */
    public final AbstractC14763x3 m69708kk() {
        return this.f48363kk.m68559m9();
    }

    /* JADX INFO: renamed from: m9 */
    public final C14237oh m69709m9() {
        return this.f48363kk;
    }

    /* JADX INFO: renamed from: to */
    public final AbstractC14763x3 m69710to() {
        return this.f48363kk.m68554h4();
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC14763x3 m69711x1() {
        return this.f48363kk.m68561to();
    }

    /* JADX INFO: renamed from: k4 */
    private void m69702k4(C12015qq[] c12015qqArr, C12025x6[] c12025x6Arr, float f, float f2) {
        float width = m69704du().getWidth();
        if (f > c12025x6Arr[0].m56897x1()) {
            c12025x6Arr[0].m56891k4(f);
        }
        if (((c12015qqArr[0].m56699x1() + c12025x6Arr[0].m56897x1()) + f2) - width > 0.0f) {
            C12015qq c12015qq = c12015qqArr[0];
            c12015qq.m56695k4(c12015qq.m56699x1() - (((c12015qqArr[0].m56699x1() + c12025x6Arr[0].m56897x1()) + f2) - width));
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m69703x1(C12015qq[] c12015qqArr, C12025x6[] c12025x6Arr, float f, float f2) {
        float height = m69704du().getHeight();
        if (f > c12025x6Arr[0].m56895kk()) {
            c12025x6Arr[0].m56898x1(f);
        }
        if (((c12015qqArr[0].m56697kk() + c12025x6Arr[0].m56895kk()) + f2) - height > 0.0f) {
            C12015qq c12015qq = c12015qqArr[0];
            c12015qq.m56700x1(c12015qq.m56697kk() - (((c12015qqArr[0].m56697kk() + c12025x6Arr[0].m56895kk()) + f2) - height));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m69707k4(C12025x6[] c12025x6Arr, C12015qq[] c12015qqArr, float f, float f2, float f3, float f4) {
        boolean z;
        boolean z2;
        if (f > c12025x6Arr[0].m56897x1()) {
            c12025x6Arr[0].m56891k4(f);
            m69702k4(c12015qqArr, c12025x6Arr, f, f2);
            z = true;
        } else {
            z = false;
        }
        if (f2 > C14116yg.m67477k4(m69704du().getWidth() - (c12015qqArr[0].m56699x1() + c12025x6Arr[0].m56897x1()), 2)) {
            C12025x6 c12025x6 = c12025x6Arr[0];
            c12025x6.m56891k4(c12025x6.m56897x1() - (((c12015qqArr[0].m56699x1() + c12025x6Arr[0].m56897x1()) + f2) - m69704du().getWidth()));
            m69702k4(c12015qqArr, c12025x6Arr, f, f2);
            z = true;
        }
        if (f3 > c12025x6Arr[0].m56895kk()) {
            c12025x6Arr[0].m56898x1(f3);
            m69703x1(c12015qqArr, c12025x6Arr, f3, f4);
            z2 = true;
        } else {
            z2 = false;
        }
        if (f4 > C14116yg.m67477k4(m69704du().getHeight() - (c12015qqArr[0].m56697kk() + c12025x6Arr[0].m56895kk()), 2)) {
            C12025x6 c12025x62 = c12025x6Arr[0];
            c12025x62.m56898x1(c12025x62.m56895kk() - (((c12015qqArr[0].m56697kk() + c12025x6Arr[0].m56895kk()) + f4) - m69704du().getHeight()));
            m69703x1(c12015qqArr, c12025x6Arr, f3, f4);
            z2 = true;
        }
        return z2 || z;
    }
}
