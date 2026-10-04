package com.aspose.slides.internal.p229ki;

import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;

/* JADX INFO: renamed from: com.aspose.slides.internal.ki.yo */
/* JADX INFO: loaded from: classes.dex */
public final class C5769yo extends AbstractC5768yn {
    public C5769yo(AbstractC5728qw abstractC5728qw, String str, String str2, int i) {
        super(abstractC5728qw, str, str2, i);
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9, com.aspose.slides.p559ms.System.InterfaceC14059g8
    /* JADX INFO: renamed from: k4 */
    public AbstractC10929m9 deepClone() {
        return new C5769yo(this);
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: m9 */
    public AbstractC10925du mo23142m9() {
        AbstractC10925du abstractC10925duMo23142m9;
        do {
            abstractC10925duMo23142m9 = this.f15829k4.mo23142m9();
            this.f15832x1 = abstractC10925duMo23142m9;
            if (abstractC10925duMo23142m9 == null) {
                return null;
            }
        } while (!mo23355x1(abstractC10925duMo23142m9));
        this.f15831to = 1;
        return this.f15832x1;
    }

    private C5769yo(C5769yo c5769yo) {
        super((AbstractC5768yn) c5769yo);
    }
}
