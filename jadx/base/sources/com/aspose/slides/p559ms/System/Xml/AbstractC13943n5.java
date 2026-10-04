package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14062gk;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.n5 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC13943n5 {
    /* JADX INFO: renamed from: k4 */
    public C14062gk mo65674k4(C14062gk c14062gk, String str) {
        if (c14062gk == null || (!c14062gk.m66683ix() && c14062gk.m66694u4().length() == 0)) {
            C14062gk c14062gk2 = new C14062gk(str, 0);
            return (c14062gk2.m66683ix() || c14062gk2.m66694u4().length() <= 0) ? c14062gk2 : new C14062gk(C3141rv.m13406kk(str));
        }
        if (str == null || str.length() == 0) {
            return c14062gk;
        }
        if (c14062gk.m66683ix()) {
            return new C14062gk(c14062gk, str);
        }
        throw new NotSupportedException(C13968ri.m65818k4("Relative URIs are not supported."));
    }

    /* JADX INFO: renamed from: k4 */
    public abstract Object mo5312k4(C14062gk c14062gk, String str, AbstractC14068j5 abstractC14068j5);

    /* JADX INFO: renamed from: k4 */
    public boolean m65675k4(C14062gk c14062gk, AbstractC14068j5 abstractC14068j5) {
        if (c14062gk != null) {
            return abstractC14068j5 == null || abstractC14068j5 == C7019kk.m27443k4((Class<?>) AbstractC3150x6.class);
        }
        throw new ArgumentNullException("absoluteUri");
    }
}
