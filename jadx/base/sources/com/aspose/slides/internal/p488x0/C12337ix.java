package com.aspose.slides.internal.p488x0;

import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p500xi.C12535to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14088s7;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.x0.ix */
/* JADX INFO: loaded from: classes5.dex */
public class C12337ix extends C12535to {

    /* JADX INFO: renamed from: k4 */
    private short f41242k4;

    /* JADX INFO: renamed from: x1 */
    private short f41243x1;

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (C14067j2.m66727k4(obj) != C14067j2.m66727k4(this)) {
            return false;
        }
        return m57705k4((C12337ix) obj);
    }

    public int hashCode() {
        return (C14088s7.m67172k4(this.f41242k4) * 397) ^ C14088s7.m67172k4(this.f41243x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final short m57703k4() {
        return this.f41242k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C12025x6 m57706kk() {
        return new C12025x6(this.f41242k4, this.f41243x1);
    }

    /* JADX INFO: renamed from: to */
    public final C12016rv m57707to() {
        return new C12016rv(this.f41242k4, this.f41243x1);
    }

    public String toString() {
        return C14113y2.m67402k4("[X: {0}, Y: {1}]", Short.valueOf(this.f41242k4), Short.valueOf(this.f41243x1));
    }

    /* JADX INFO: renamed from: x1 */
    public final short m57708x1() {
        return this.f41243x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57704k4(short s) {
        this.f41242k4 = s;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m57709x1(short s) {
        this.f41243x1 = s;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m57705k4(C12337ix c12337ix) {
        return this.f41242k4 == c12337ix.f41242k4 && this.f41243x1 == c12337ix.f41243x1;
    }
}
