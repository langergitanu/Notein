package com.aspose.slides.internal.p430tx;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.p559ms.System.Xml.C13890ei;
import java.util.Comparator;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.ri */
/* JADX INFO: loaded from: classes4.dex */
public class C11211ri {

    /* JADX INFO: renamed from: to */
    private static k4 f38632to = new k4();

    /* JADX INFO: renamed from: k4 */
    public ArrayList f38633k4;

    /* JADX INFO: renamed from: kk */
    private C11207os f38634kk;

    /* JADX INFO: renamed from: x1 */
    private C13890ei f38635x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.tx.ri$k4 */
    public static class k4 implements Comparator {
        private k4() {
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            C11183em c11183em = (C11183em) obj;
            C11183em c11183em2 = (C11183em) obj2;
            return c11183em.m53718kk() == c11183em2.m53718kk() ? c11183em.m53715du() - c11183em2.m53715du() : c11183em.m53718kk() > c11183em2.m53718kk() ? 1 : -1;
        }
    }

    public C11211ri(C11207os c11207os, C13890ei c13890ei) {
        this.f38635x1 = c13890ei;
        this.f38634kk = c11207os;
    }

    /* JADX INFO: renamed from: k4 */
    public final C11183em m53892k4(C11234xw c11234xw, AbstractC10925du abstractC10925du) {
        ArrayList arrayList = this.f38633k4;
        if (arrayList == null) {
            return null;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C11183em c11183em = (C11183em) this.f38633k4.get_Item(size);
            int iM53716k4 = c11183em.m53716k4();
            if (iM53716k4 != -1 && c11234xw.m54190k4(abstractC10925du, iM53716k4)) {
                return c11183em;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53893k4() {
        ArrayList arrayList = this.f38633k4;
        if (arrayList != null) {
            arrayList.sort(f38632to);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53894k4(C11183em c11183em) {
        if (this.f38633k4 == null) {
            this.f38633k4 = new ArrayList();
        }
        this.f38633k4.addItem(c11183em);
    }
}
