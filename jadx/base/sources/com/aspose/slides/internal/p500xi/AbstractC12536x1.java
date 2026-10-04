package com.aspose.slides.internal.p500xi;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p146g9.AbstractC4229kk;
import com.aspose.slides.internal.p298nh.AbstractC6888dy;
import com.aspose.slides.internal.p438ub.C11301k4;
import com.aspose.slides.internal.p438ub.C11302kk;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.xi.x1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC12536x1 extends AbstractC6888dy {

    /* JADX INFO: renamed from: k4 */
    private C12529du f41971k4 = new C12529du();

    public AbstractC12536x1() {
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6888dy, com.aspose.slides.p559ms.System.IDisposable
    public void dispose() {
        this.f41971k4 = null;
    }

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
        return m58365k4((AbstractC12536x1) obj);
    }

    public int hashCode() {
        C12529du c12529du = this.f41971k4;
        if (c12529du != null) {
            return c12529du.hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12529du m58364k4() {
        return this.f41971k4;
    }

    /* JADX INFO: renamed from: kk */
    public abstract C12014ne mo13623kk();

    @Override // com.aspose.slides.internal.p298nh.AbstractC6888dy
    /* JADX INFO: renamed from: to */
    public C12009k4 mo13505to() {
        return AbstractC4229kk.m17034k4(this).mo17032to();
    }

    /* JADX INFO: renamed from: x1 */
    public abstract int mo13625x1();

    public AbstractC12536x1(int i, int i2) {
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC12536x1 m58363k4(AbstractC3150x6 abstractC3150x6) {
        C11301k4 c11301k4 = new C11301k4(abstractC3150x6);
        if (c11301k4.m54289x1()) {
            return c11301k4.m54288k4();
        }
        C11302kk c11302kk = new C11302kk(abstractC3150x6);
        if (c11302kk.m54291x1()) {
            return c11302kk.m54290k4();
        }
        throw new ArgumentException("Unable to read Metafile.");
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m58365k4(AbstractC12536x1 abstractC12536x1) {
        return C14067j2.m66728k4(this.f41971k4, abstractC12536x1.f41971k4);
    }
}
