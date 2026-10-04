package com.aspose.slides.internal.p550zi;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p299ni.InterfaceC6901du;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.zi.ks */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC13605ks extends AbstractC13599fa {

    /* JADX INFO: renamed from: k4 */
    private AbstractC13605ks f45173k4;

    /* JADX INFO: renamed from: kk */
    private InterfaceC6901du f45174kk;

    /* JADX INFO: renamed from: x1 */
    private boolean f45175x1 = true;

    public AbstractC13605ks() {
    }

    /* JADX INFO: renamed from: c5 */
    public AbstractC13605ks m62754c5() {
        return this.f45173k4;
    }

    /* JADX INFO: renamed from: ck */
    public InterfaceC6901du m62755ck() {
        return this.f45174kk;
    }

    /* JADX INFO: renamed from: dy */
    public C12014ne m62756dy() {
        m62823m9();
        return new C12014ne(C12016rv.f40556k4.Clone(), m62757fa().Clone());
    }

    /* JADX INFO: renamed from: fa */
    public C12023wl m62757fa() {
        m62823m9();
        return new C12023wl(mo10012up(), mo10009jd());
    }

    /* JADX INFO: renamed from: jd */
    public abstract int mo10009jd();

    /* JADX INFO: renamed from: k4 */
    public C12014ne m62758k4(C12014ne c12014ne) {
        return m62752k4(c12014ne.Clone(), mo10012up(), mo10009jd());
    }

    @Override // com.aspose.slides.internal.p550zi.AbstractC13599fa, com.aspose.slides.internal.p550zi.C13614up
    /* JADX INFO: renamed from: to */
    public void mo24306to() {
        this.f45173k4 = null;
        this.f45174kk = null;
        super.mo24306to();
    }

    /* JADX INFO: renamed from: up */
    public abstract int mo10012up();

    /* JADX INFO: renamed from: x1 */
    public void mo24309x1(InterfaceC6901du interfaceC6901du, InterfaceC6901du interfaceC6901du2) {
    }

    /* JADX INFO: renamed from: yj */
    public int mo24310yj() {
        return C12003du.m56385i5().m56506h4();
    }

    public AbstractC13605ks(InterfaceC6901du interfaceC6901du) {
        this.f45174kk = interfaceC6901du;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12014ne m62752k4(C12014ne c12014ne, int i, int i2) {
        C12014ne c12014neClone = C12014ne.m56656k4(c12014ne.Clone(), new C12014ne(new C12016rv(), new C12023wl(C14116yg.m67482k4(i), C14116yg.m67482k4(i2)))).Clone();
        if (c12014neClone.m56663c5() <= 0 || c12014neClone.m56683x1() <= 0) {
            throw new ArgumentException("The rectangle has no common processing area. Cannot proceed.");
        }
        return c12014neClone;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12014ne m62753k4(C12014ne c12014ne, int[] iArr, int i, int i2) {
        if (iArr == null) {
            throw new ArgumentNullException("pixels");
        }
        C12014ne c12014neClone = m62752k4(c12014ne.Clone(), i, i2).Clone();
        if (iArr.length >= c12014neClone.m56683x1() * c12014neClone.m56663c5()) {
            return c12014neClone;
        }
        throw new ArgumentException(C14113y2.m67402k4("The passed rectangle does not correspond to pixels array size. Expected: {0} pixels, passed: {1} pixels.", Integer.valueOf(c12014neClone.m56683x1() * c12014neClone.m56663c5()), Integer.valueOf(iArr.length)));
    }

    /* JADX INFO: renamed from: k4 */
    public void m62759k4(InterfaceC6901du interfaceC6901du) {
        InterfaceC6901du interfaceC6901du2 = this.f45174kk;
        if (interfaceC6901du2 != interfaceC6901du) {
            mo24309x1(interfaceC6901du2, interfaceC6901du);
            this.f45174kk = interfaceC6901du;
            mo24303k4(interfaceC6901du2, interfaceC6901du);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void mo24303k4(InterfaceC6901du interfaceC6901du, InterfaceC6901du interfaceC6901du2) {
    }

    /* JADX INFO: renamed from: k4 */
    public void m62760k4(AbstractC13605ks abstractC13605ks) {
        this.f45173k4 = abstractC13605ks;
    }
}
