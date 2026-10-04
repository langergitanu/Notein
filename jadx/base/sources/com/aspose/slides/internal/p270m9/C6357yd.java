package com.aspose.slides.internal.p270m9;

import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p447up.C11539rv;

/* JADX INFO: renamed from: com.aspose.slides.internal.m9.yd */
/* JADX INFO: loaded from: classes4.dex */
public class C6357yd extends AbstractC6355x1 {

    /* JADX INFO: renamed from: k4 */
    private C11539rv f18085k4;

    public C6357yd(C11539rv c11539rv, C6344m9 c6344m9) {
        super(c6344m9);
        this.f18085k4 = c11539rv;
        int iM25981du = c6344m9.m25981du();
        for (int i = 0; i < iM25981du; i++) {
            AbstractC5788h4 abstractC5788h4M54525k4 = c11539rv.m54525k4(i);
            if (abstractC5788h4M54525k4 != null) {
                mo25908k4(i, abstractC5788h4M54525k4, c11539rv.m54532x1(i));
            }
        }
    }

    @Override // com.aspose.slides.internal.p270m9.AbstractC6355x1
    /* JADX INFO: renamed from: k4 */
    public void mo25908k4(int i, AbstractC5788h4 abstractC5788h4, boolean z) {
        super.mo25908k4(i, abstractC5788h4, z);
        this.f18085k4.m54531x1(i, false);
    }
}
