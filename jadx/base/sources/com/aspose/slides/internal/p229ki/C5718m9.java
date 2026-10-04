package com.aspose.slides.internal.p229ki;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.ki.m9 */
/* JADX INFO: loaded from: classes.dex */
public final class C5718m9 extends AbstractC5772zm {
    private C5718m9(C5718m9 c5718m9) {
        super((AbstractC5772zm) c5718m9);
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: k4 */
    public AbstractC10925du mo23147k4(AbstractC10925du abstractC10925du) {
        AbstractC10925du abstractC10925duMo23142m9;
        mo23148k4((AbstractC10929m9) new C5720na(abstractC10925du, true));
        do {
            abstractC10925duMo23142m9 = mo23142m9();
            if (abstractC10925duMo23142m9 == null) {
                return null;
            }
        } while (!abstractC10925duMo23142m9.mo21876x1(abstractC10925du));
        return abstractC10925du;
    }

    public C5718m9(AbstractC5728qw abstractC5728qw) {
        super(abstractC5728qw);
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9, com.aspose.slides.p559ms.System.InterfaceC14059g8
    /* JADX INFO: renamed from: k4 */
    public AbstractC10929m9 deepClone() {
        return new C5718m9(this);
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5772zm, com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: k4 */
    public Object mo23148k4(AbstractC10929m9 abstractC10929m9) {
        String strM23378k4;
        Object objMo23148k4 = super.mo23148k4(abstractC10929m9);
        AbstractC10925du abstractC10925duDeepClone = abstractC10929m9.mo21834kk().deepClone();
        int iM23318k4 = m23318k4(objMo23148k4);
        if (iM23318k4 == 0) {
            strM23378k4 = C5771zj.m23378k4(((Double) C7019kk.m27464to(objMo23148k4, Double.TYPE)).doubleValue());
        } else if (iM23318k4 == 1) {
            strM23378k4 = (String) objMo23148k4;
        } else {
            if (iM23318k4 != 2) {
                if (iM23318k4 == 3) {
                    while (true) {
                        AbstractC10925du abstractC10925duMo23142m9 = this.f15840k4.mo23142m9();
                        if (abstractC10925duMo23142m9 == null) {
                            break;
                        }
                        m23306k4(abstractC10925duDeepClone, abstractC10925duMo23142m9.mo21843dy());
                    }
                } else if (iM23318k4 == 4) {
                    strM23378k4 = ((AbstractC10925du) objMo23148k4).mo21843dy();
                }
                return this;
            }
            strM23378k4 = C5771zj.m23379k4(((Boolean) C7019kk.m27464to(objMo23148k4, Boolean.TYPE)).booleanValue());
        }
        m23306k4(abstractC10925duDeepClone, strM23378k4);
        return this;
    }

    /* JADX INFO: renamed from: k4 */
    private void m23306k4(AbstractC10925du abstractC10925du, String str) {
        for (String str2 : C13850af.m65133v4(str)) {
            if (abstractC10925du.mo21869to(str2)) {
                m23319k4(this.f15841x1, abstractC10925du);
            }
        }
    }
}
