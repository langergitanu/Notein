package com.aspose.slides.internal.p229ki;

import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;

/* JADX INFO: renamed from: com.aspose.slides.internal.ki.m4 */
/* JADX INFO: loaded from: classes.dex */
public class C5717m4 extends AbstractC5762y2 {
    public C5717m4(C5717m4 c5717m4) {
        super(c5717m4);
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9, com.aspose.slides.p559ms.System.InterfaceC14059g8
    /* JADX INFO: renamed from: k4 */
    public AbstractC10929m9 deepClone() {
        return new C5717m4(this);
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9
    /* JADX INFO: renamed from: x1 */
    public boolean mo21770x1() {
        do {
            if (this.f15812dy) {
                if (!this.f15814k4.mo21878x6()) {
                    return false;
                }
            } else if (!this.f15814k4.mo21865rv()) {
                return false;
            }
            this.f15812dy = false;
        } while (!m23361h4());
        this.f15813h4++;
        return true;
    }

    public C5717m4(AbstractC10925du abstractC10925du, int i) {
        super(abstractC10925du, i, false);
    }

    public C5717m4(AbstractC10925du abstractC10925du, String str, String str2) {
        super(abstractC10925du, str, str2, false);
    }
}
