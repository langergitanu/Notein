package com.aspose.slides.internal.p229ki;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p205ji.C5449c5;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.aspose.slides.p559ms.System.Xml.C13968ri;
import java.util.Comparator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ki.m2 */
/* JADX INFO: loaded from: classes.dex */
public final class C5716m2 implements Comparator {

    /* JADX INFO: renamed from: k4 */
    private int f15756k4;

    /* JADX INFO: renamed from: kk */
    private C11697x1 f15757kk;

    /* JADX INFO: renamed from: to */
    private int f15758to;

    /* JADX INFO: renamed from: x1 */
    private int f15759x1;

    public C5716m2(int i, int i2, String str, int i3) {
        if (str == null) {
            this.f15757kk = C5449c5.m22523k4().m22531h4();
        } else {
            this.f15757kk = new C11697x1(str);
        }
        if (i == 2) {
            if (i2 == 2) {
                i2 = 1;
            } else if (i2 == 1) {
                i2 = 2;
            }
        }
        this.f15756k4 = i;
        this.f15759x1 = i2;
        this.f15758to = i3;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.f15758to;
        if (i != 1) {
            if (i != 2) {
                throw new InvalidOperationException(C13968ri.m65818k4("Operation is not valid due to the current state of the object."));
            }
            int iM66430k4 = C14044b3.m66430k4(C13850af.m65076k4(obj), C13850af.m65076k4(obj2));
            return this.f15756k4 == 1 ? iM66430k4 : -iM66430k4;
        }
        String strM66987ks = C14080ne.m66987ks(obj, this.f15757kk);
        String strM66987ks2 = C14080ne.m66987ks(obj2, this.f15757kk);
        int iM67383k4 = C14113y2.m67383k4(strM66987ks, strM66987ks2, this.f15759x1 != 0, this.f15757kk);
        if (iM67383k4 != 0 || this.f15759x1 == 0) {
            return this.f15756k4 == 1 ? iM67383k4 : -iM67383k4;
        }
        int iM67383k42 = C14113y2.m67383k4(strM66987ks, strM66987ks2, false, this.f15757kk);
        return this.f15759x1 == 2 ? iM67383k42 : -iM67383k42;
    }
}
