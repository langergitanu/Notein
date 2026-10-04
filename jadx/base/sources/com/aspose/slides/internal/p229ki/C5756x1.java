package com.aspose.slides.internal.p229ki;

import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;

/* JADX INFO: renamed from: com.aspose.slides.internal.ki.x1 */
/* JADX INFO: loaded from: classes.dex */
public class C5756x1 extends AbstractC5772zm {
    public C5756x1(AbstractC5728qw abstractC5728qw) {
        super(abstractC5728qw);
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: k4 */
    public AbstractC10925du mo23147k4(AbstractC10925du abstractC10925du) {
        return this.f15840k4.mo23147k4(abstractC10925du);
    }

    public C5756x1(C5756x1 c5756x1) {
        super((AbstractC5772zm) c5756x1);
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9, com.aspose.slides.p559ms.System.InterfaceC14059g8
    /* JADX INFO: renamed from: k4 */
    public AbstractC10929m9 deepClone() {
        return new C5756x1(this);
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5772zm, com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: k4 */
    public Object mo23148k4(AbstractC10929m9 abstractC10929m9) {
        super.mo23148k4(abstractC10929m9);
        while (true) {
            AbstractC10925du abstractC10925duMo23142m9 = this.f15840k4.mo23142m9();
            if (abstractC10925duMo23142m9 == null) {
                return this;
            }
            this.f15841x1.addItem(abstractC10925duMo23142m9.deepClone());
        }
    }
}
