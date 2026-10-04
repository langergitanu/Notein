package com.aspose.slides.p559ms.System;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p463vm.C11690k4;
import com.aspose.slides.internal.p463vm.C11697x1;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.uz */
/* JADX INFO: loaded from: classes5.dex */
final class C14099uz extends AbstractC14070jw {

    /* JADX INFO: renamed from: m9 */
    private static CharsetEncoder f47339m9 = Charset.forName("US-ASCII").newEncoder();

    /* JADX INFO: renamed from: du */
    private boolean f47340du;

    /* JADX INFO: renamed from: h4 */
    private C11690k4 f47341h4;

    public C14099uz(C11697x1 c11697x1, boolean z) {
        this.f47341h4 = c11697x1.m55271up();
        this.f47340du = z;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14070jw, java.util.Comparator
    /* JADX INFO: renamed from: k4 */
    public int compare(String str, String str2) {
        if (m67324k4(str) && m67324k4(str2)) {
            return this.f47340du ? AbstractC14070jw.f47261kk.compare(str, str2) : AbstractC14070jw.f47262to.compare(str, str2);
        }
        return this.f47341h4.m55132k4(str, str2, this.f47340du ? 1L : 0L);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14070jw, com.aspose.slides.Collections.Generic.IGenericEqualityComparer
    /* JADX INFO: renamed from: x1 */
    public int hashCodeT(String str) {
        if (str != null) {
            return this.f47341h4.m55133k4(str, this.f47340du ? 1L : 0L).hashCode();
        }
        throw new ArgumentNullException("s");
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m67324k4(String str) {
        boolean zCanEncode;
        synchronized (f47339m9) {
            f47339m9.reset();
            zCanEncode = f47339m9.canEncode(str);
        }
        return zCanEncode;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14070jw, com.aspose.slides.Collections.Generic.IGenericEqualityComparer
    /* JADX INFO: renamed from: x1 */
    public boolean equalsT(String str, String str2) {
        return compare(str, str2) == 0;
    }
}
