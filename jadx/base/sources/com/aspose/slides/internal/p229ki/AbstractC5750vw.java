package com.aspose.slides.internal.p229ki;

import com.aspose.slides.exceptions.XPathException;
import com.aspose.slides.internal.p418tf.AbstractC10925du;

/* JADX INFO: renamed from: com.aspose.slides.internal.ki.vw */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5750vw extends AbstractC5768yn {

    /* JADX INFO: renamed from: du */
    protected boolean f15800du;

    /* JADX INFO: renamed from: h4 */
    protected boolean f15801h4;

    public AbstractC5750vw(AbstractC5728qw abstractC5728qw, String str, String str2, int i, boolean z, boolean z2) {
        super(abstractC5728qw, str, str2, i);
        this.f15800du = z;
        this.f15801h4 = z2;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: k4 */
    public AbstractC10925du mo23147k4(AbstractC10925du abstractC10925du) {
        AbstractC10925du abstractC10925duMo23147k4;
        if (abstractC10925du == null) {
            return null;
        }
        if (!this.f15801h4) {
            throw XPathException.create("'{0}' is an invalid XSLT pattern.");
        }
        if (!mo23355x1(abstractC10925du)) {
            return null;
        }
        if (this.f15800du && (abstractC10925duMo23147k4 = this.f15829k4.mo23147k4(abstractC10925du)) != null) {
            return abstractC10925duMo23147k4;
        }
        AbstractC10925du abstractC10925duDeepClone = abstractC10925du.deepClone();
        while (abstractC10925duDeepClone.mo21864ne()) {
            AbstractC10925du abstractC10925duMo23147k42 = this.f15829k4.mo23147k4(abstractC10925duDeepClone);
            if (abstractC10925duMo23147k42 != null) {
                return abstractC10925duMo23147k42;
            }
        }
        return null;
    }

    public AbstractC5750vw(AbstractC5750vw abstractC5750vw) {
        super((AbstractC5768yn) abstractC5750vw);
        this.f15800du = abstractC5750vw.f15800du;
        this.f15801h4 = abstractC5750vw.f15801h4;
    }
}
