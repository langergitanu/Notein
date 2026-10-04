package com.aspose.slides.internal.p421tk;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p026an.C1494rv;
import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.internal.p522yc.C12805k4;
import com.aspose.slides.internal.p539z4.AbstractC13405sv;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tk.gi */
/* JADX INFO: loaded from: classes4.dex */
public class C11001gi extends AbstractC10990c6 {

    /* JADX INFO: renamed from: k4 */
    private C12805k4 f38316k4;

    /* JADX INFO: renamed from: kk */
    private byte[] f38317kk;

    /* JADX INFO: renamed from: to */
    private AbstractC13405sv f38318to;

    /* JADX INFO: renamed from: x1 */
    private long f38319x1;

    public C11001gi(C10988bz c10988bz) {
        super(c10988bz);
        this.f38316k4 = new C12805k4();
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public short au_() {
        return super.au_();
    }

    /* JADX INFO: renamed from: dy */
    public final AbstractC13405sv m53262dy() {
        return this.f38318to;
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
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
        return m53267k4((C11001gi) obj);
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public int hashCode() {
        return (((((((super.hashCode() * 397) ^ this.f38316k4.hashCode()) * 397) ^ ((int) m53270to())) * 397) ^ (m53269m9() != null ? AbstractC14092to.m67208k4((Object) m53269m9()).hashCode() : 0)) * 397) ^ (m53262dy() != null ? m53262dy().hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53263k4(long j) {
        this.f38319x1 = j;
    }

    /* JADX INFO: renamed from: kk */
    public final C12805k4 m53268kk() {
        return this.f38316k4;
    }

    /* JADX INFO: renamed from: m9 */
    public final byte[] m53269m9() {
        return this.f38317kk;
    }

    /* JADX INFO: renamed from: to */
    public final long m53270to() {
        return this.f38319x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53264k4(C12805k4 c12805k4) {
        if (!C1494rv.m8299k4(c12805k4.toString())) {
            throw new ArgumentOutOfRangeException("value");
        }
        c12805k4.CloneTo(this.f38316k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53265k4(AbstractC13405sv abstractC13405sv) {
        this.f38318to = abstractC13405sv;
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    /* JADX INFO: renamed from: k4 */
    public void mo53201k4(short s) {
        if (s != 0) {
            throw new ArgumentOutOfRangeException("value");
        }
        super.mo53201k4(s);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53266k4(byte[] bArr) {
        this.f38317kk = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m53267k4(C11001gi c11001gi) {
        return m53202k4((C10988bz) c11001gi) && this.f38316k4.m59514k4(c11001gi.f38316k4.Clone()) && m53270to() == c11001gi.m53270to() && C3022m9.m12719k4(m53269m9(), c11001gi.m53269m9()) && C14067j2.m66728k4(m53262dy(), c11001gi.m53262dy());
    }
}
