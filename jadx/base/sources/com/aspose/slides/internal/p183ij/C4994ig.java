package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.internal.p498xe.C12514ne;
import com.aspose.slides.internal.p498xe.C12521uz;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.ig */
/* JADX INFO: loaded from: classes.dex */
public class C4994ig extends AbstractC4953ak {

    /* JADX INFO: renamed from: k4 */
    private C12521uz f13672k4;

    /* JADX INFO: renamed from: kk */
    private C12514ne[] f13673kk;

    /* JADX INFO: renamed from: x1 */
    private long f13674x1;

    public C4994ig(C5061vw c5061vw) {
        super(c5061vw);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
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
        return m21095k4((C4994ig) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12521uz c12521uz = this.f13672k4;
        int iHashCode2 = (((iHashCode ^ (c12521uz != null ? c12521uz.hashCode() : 0)) * 397) ^ ((int) this.f13674x1)) * 397;
        C12514ne[] c12514neArr = this.f13673kk;
        return iHashCode2 ^ (c12514neArr != null ? AbstractC14092to.m67208k4((Object) c12514neArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m21091k4() {
        return this.f13674x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12514ne[] m21096x1() {
        return this.f13673kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21092k4(long j) {
        this.f13674x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21093k4(C12521uz c12521uz) {
        this.f13672k4 = c12521uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21094k4(C12514ne[] c12514neArr) {
        this.f13673kk = c12514neArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21095k4(C4994ig c4994ig) {
        return m21559k4((C5061vw) c4994ig) && C14067j2.m66728k4(this.f13672k4, c4994ig.f13672k4) && this.f13674x1 == c4994ig.f13674x1 && C3022m9.m12723k4(this.f13673kk, c4994ig.f13673kk);
    }
}
