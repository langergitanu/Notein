package com.aspose.slides.internal.p540z5;

import com.aspose.slides.internal.p291n4.C6740x1;
import com.aspose.slides.internal.p299ni.InterfaceC6906k4;
import com.aspose.slides.internal.p383rp.AbstractC10036kk;
import com.aspose.slides.internal.p475wh.C12014ne;

/* JADX INFO: renamed from: com.aspose.slides.internal.z5.du */
/* JADX INFO: loaded from: classes5.dex */
public class C13432du extends AbstractC10036kk {

    /* JADX INFO: renamed from: k4 */
    private final int f44936k4;

    /* JADX INFO: renamed from: kk */
    private C13435k4 f44937kk;

    /* JADX INFO: renamed from: x1 */
    private final int f44938x1;

    public C13432du(C6740x1 c6740x1, int i, int i2) {
        super(c6740x1, i, i2);
        this.f44936k4 = i;
        this.f44938x1 = i2;
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10036kk
    /* JADX INFO: renamed from: k4 */
    public void mo49347k4(int[] iArr, C12014ne c12014ne, InterfaceC6906k4 interfaceC6906k4) {
        if (this.f44937kk == null) {
            this.f44937kk = new C13435k4(this.f44936k4, this.f44938x1, interfaceC6906k4, m49327kk());
        }
        this.f44937kk.m62520k4(iArr, c12014ne.Clone());
    }
}
