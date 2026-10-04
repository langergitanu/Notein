package com.aspose.slides.internal.p418tf;

import com.aspose.slides.Collections.IEqualityComparer;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p184ik.C5098m9;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.tf.h4 */
/* JADX INFO: loaded from: classes4.dex */
public class C10926h4 implements IEqualityComparer {
    @Override // com.aspose.slides.Collections.IEqualityComparer
    public final boolean equals(Object obj, Object obj2) {
        AbstractC10925du abstractC10925du = (AbstractC10925du) C7019kk.m27452k4(obj, AbstractC10925du.class);
        AbstractC10925du abstractC10925du2 = (AbstractC10925du) C7019kk.m27452k4(obj2, AbstractC10925du.class);
        return (abstractC10925du == null || abstractC10925du2 == null || !abstractC10925du.mo21876x1(abstractC10925du2)) ? false : true;
    }

    @Override // com.aspose.slides.Collections.IEqualityComparer
    public final int hashCode(Object obj) {
        if (obj == null) {
            throw new ArgumentNullException("obj");
        }
        C5098m9 c5098m9 = (C5098m9) C7019kk.m27452k4(obj, C5098m9.class);
        if (c5098m9 != null) {
            return c5098m9.m21862lr();
        }
        AbstractC10925du abstractC10925du = (AbstractC10925du) C7019kk.m27452k4(obj, AbstractC10925du.class);
        if (abstractC10925du == null) {
            return obj.hashCode();
        }
        Object objMo21844fa = abstractC10925du.mo21844fa();
        return objMo21844fa != null ? objMo21844fa.hashCode() : ((abstractC10925du.mo21857kk() ^ abstractC10925du.mo21867to().hashCode()) ^ abstractC10925du.mo21863m9().hashCode()) ^ abstractC10925du.mo21841du().hashCode();
    }
}
