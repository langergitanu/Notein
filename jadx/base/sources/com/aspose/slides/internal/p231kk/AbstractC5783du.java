package com.aspose.slides.internal.p231kk;

import com.aspose.slides.internal.p270m9.C6345ne;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14088s7;

/* JADX INFO: renamed from: com.aspose.slides.internal.kk.du */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5783du implements InterfaceC5797ne {

    /* JADX INFO: renamed from: k4 */
    private C6345ne f15848k4;

    /* JADX INFO: renamed from: kk */
    private short f15849kk;

    /* JADX INFO: renamed from: x1 */
    private InterfaceC5797ne f15850x1;

    public AbstractC5783du(C6345ne c6345ne, InterfaceC5797ne interfaceC5797ne, short s) {
        this.f15848k4 = c6345ne;
        this.f15850x1 = interfaceC5797ne;
        this.f15849kk = s;
    }

    /* JADX INFO: renamed from: a_ */
    public final C6345ne m23401a_() {
        return this.f15848k4;
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5797ne
    /* JADX INFO: renamed from: du */
    public final InterfaceC5797ne mo23402du() {
        return this.f15850x1;
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
        return m23404k4((AbstractC5783du) obj);
    }

    public int hashCode() {
        String strMo23406x1 = mo23406x1();
        return ((strMo23406x1 != null ? strMo23406x1.hashCode() : 0) * 397) ^ C14088s7.m67172k4(this.f15849kk);
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5797ne
    /* JADX INFO: renamed from: k4 */
    public final short mo23403k4() {
        return this.f15849kk;
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5797ne
    /* JADX INFO: renamed from: to */
    public final InterfaceC5775ar mo23405to() {
        return this.f15848k4;
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5797ne
    /* JADX INFO: renamed from: x1 */
    public abstract String mo23406x1();

    /* JADX INFO: renamed from: k4 */
    public final boolean m23404k4(AbstractC5783du abstractC5783du) {
        return C14067j2.m66728k4(mo23406x1(), abstractC5783du.mo23406x1()) && this.f15849kk == abstractC5783du.f15849kk;
    }
}
