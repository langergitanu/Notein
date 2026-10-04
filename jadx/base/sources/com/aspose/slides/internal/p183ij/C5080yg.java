package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.internal.p498xe.C12514ne;
import com.aspose.slides.internal.p498xe.C12521uz;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.yg */
/* JADX INFO: loaded from: classes.dex */
public class C5080yg extends AbstractC4953ak {

    /* JADX INFO: renamed from: du */
    private C12514ne[] f13945du;

    /* JADX INFO: renamed from: k4 */
    private C12521uz f13946k4;

    /* JADX INFO: renamed from: kk */
    private long f13947kk;

    /* JADX INFO: renamed from: to */
    private long[] f13948to;

    /* JADX INFO: renamed from: x1 */
    private long f13949x1;

    public C5080yg(C5061vw c5061vw) {
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
        return m21659k4((C5080yg) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12521uz c12521uz = this.f13946k4;
        int iHashCode2 = (((((iHashCode ^ (c12521uz != null ? c12521uz.hashCode() : 0)) * 397) ^ ((int) this.f13949x1)) * 397) ^ ((int) this.f13947kk)) * 397;
        long[] jArr = this.f13948to;
        int iHashCode3 = (iHashCode2 ^ (jArr != null ? AbstractC14092to.m67208k4(jArr).hashCode() : 0)) * 397;
        C12514ne[] c12514neArr = this.f13945du;
        return iHashCode3 ^ (c12514neArr != null ? AbstractC14092to.m67208k4((Object) c12514neArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m21654k4() {
        return this.f13949x1;
    }

    /* JADX INFO: renamed from: kk */
    public final long[] m21660kk() {
        return this.f13948to;
    }

    /* JADX INFO: renamed from: to */
    public final C12514ne[] m21661to() {
        return this.f13945du;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m21662x1() {
        return this.f13947kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21655k4(long j) {
        this.f13949x1 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m21663x1(long j) {
        this.f13947kk = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21656k4(C12521uz c12521uz) {
        this.f13946k4 = c12521uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21657k4(long[] jArr) {
        this.f13948to = jArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21658k4(C12514ne[] c12514neArr) {
        this.f13945du = c12514neArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21659k4(C5080yg c5080yg) {
        return m21559k4((C5061vw) c5080yg) && C14067j2.m66728k4(this.f13946k4, c5080yg.f13946k4) && this.f13949x1 == c5080yg.f13949x1 && this.f13947kk == c5080yg.f13947kk && C3022m9.m12722k4(this.f13948to, c5080yg.f13948to) && C3022m9.m12723k4(this.f13945du, c5080yg.f13945du);
    }
}
