package com.aspose.slides.internal.p183ij;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.internal.p143g4.C4201h4;
import com.aspose.slides.internal.p498xe.C12520up;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.ar */
/* JADX INFO: loaded from: classes.dex */
public class C4954ar extends AbstractC4967ca {

    /* JADX INFO: renamed from: du */
    private byte[] f13526du;

    /* JADX INFO: renamed from: k4 */
    private long f13527k4;

    /* JADX INFO: renamed from: kk */
    private long f13528kk;

    /* JADX INFO: renamed from: to */
    private long f13529to;

    /* JADX INFO: renamed from: x1 */
    private C12520up f13530x1;

    public C4954ar(C5061vw c5061vw) {
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
        return m20793k4((C4954ar) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = ((super.hashCode() * 397) ^ ((int) this.f13527k4)) * 397;
        C12520up c12520up = this.f13530x1;
        int iHashCode2 = (((((iHashCode ^ (c12520up != null ? c12520up.hashCode() : 0)) * 397) ^ ((int) this.f13528kk)) * 397) ^ ((int) this.f13529to)) * 397;
        byte[] bArr = this.f13526du;
        return iHashCode2 ^ (bArr != null ? AbstractC14092to.m67208k4((Object) bArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m20788k4() {
        return this.f13527k4;
    }

    /* JADX INFO: renamed from: kk */
    public final long m20794kk() {
        return this.f13529to;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12520up m20796x1() {
        return this.f13530x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final Object m20789k4(C4201h4 c4201h4) {
        throw new NotImplementedException();
    }

    /* JADX INFO: renamed from: kk */
    public final void m20795kk(long j) {
        this.f13529to = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m20797x1(long j) {
        this.f13528kk = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20790k4(long j) {
        this.f13527k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20791k4(C12520up c12520up) {
        this.f13530x1 = c12520up;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20792k4(byte[] bArr) {
        this.f13526du = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m20793k4(C4954ar c4954ar) {
        return m21559k4((C5061vw) c4954ar) && this.f13527k4 == c4954ar.f13527k4 && C14067j2.m66728k4(this.f13530x1, c4954ar.f13530x1) && this.f13528kk == c4954ar.f13528kk && this.f13529to == c4954ar.f13529to && C3022m9.m12719k4(this.f13526du, c4954ar.f13526du);
    }
}
