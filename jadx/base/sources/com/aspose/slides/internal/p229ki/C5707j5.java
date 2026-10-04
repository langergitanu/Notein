package com.aspose.slides.internal.p229ki;

import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;

/* JADX INFO: renamed from: com.aspose.slides.internal.ki.j5 */
/* JADX INFO: loaded from: classes.dex */
public class C5707j5 extends AbstractC5762y2 {

    /* JADX INFO: renamed from: c5 */
    private int f15744c5;

    public C5707j5(C5707j5 c5707j5) {
        super(c5707j5);
        this.f15744c5 = 0;
        this.f15744c5 = c5707j5.f15744c5;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9, com.aspose.slides.p559ms.System.InterfaceC14059g8
    /* JADX INFO: renamed from: k4 */
    public AbstractC10929m9 deepClone() {
        return new C5707j5(this);
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9
    /* JADX INFO: renamed from: x1 */
    public boolean mo21770x1() {
        if (this.f15812dy) {
            this.f15812dy = false;
            if (this.f15815m9 && m23361h4()) {
                this.f15813h4 = 1;
                return true;
            }
        }
        do {
            if (!this.f15814k4.mo21878x6()) {
                while (this.f15744c5 != 0) {
                    if (!this.f15814k4.mo21865rv()) {
                        this.f15814k4.mo21864ne();
                        this.f15744c5--;
                    }
                }
                return false;
            }
            this.f15744c5++;
        } while (!m23361h4());
        this.f15813h4++;
        return true;
    }

    public C5707j5(AbstractC10925du abstractC10925du, int i, boolean z) {
        super(abstractC10925du, i, z);
        this.f15744c5 = 0;
    }

    public C5707j5(AbstractC10925du abstractC10925du, String str, String str2, boolean z) {
        super(abstractC10925du, str, str2, z);
        this.f15744c5 = 0;
    }
}
