package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class dm1 extends AbstractC7020m9<dm1> {

    /* JADX INFO: renamed from: k4 */
    public String f4609k4;

    /* JADX INFO: renamed from: kk */
    public String f4610kk;

    /* JADX INFO: renamed from: to */
    private C14214o4 f4611to;

    /* JADX INFO: renamed from: x1 */
    public String f4612x1;

    public dm1() {
        this.f4611to = null;
        this.f4609k4 = null;
        this.f4612x1 = null;
        this.f4610kk = null;
    }

    public Object clone() {
        return Clone();
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof dm1) {
            return m5150x1((dm1) obj);
        }
        return false;
    }

    public int hashCode() {
        return C12569rv.m58664k4(this.f4611to, this.f4609k4, this.f4612x1, this.f4610kk);
    }

    /* JADX INFO: renamed from: k4 */
    public final dm1 m5151k4(String str) {
        if (str == null) {
            return m5155x1();
        }
        try {
            C11697x1 c11697x1M55244k4 = C11697x1.m55244k4(str);
            return new dm1(C14113y2.m67444x1(this.f4609k4, c11697x1M55244k4), C14113y2.m67444x1(this.f4610kk, c11697x1M55244k4), C14113y2.m67444x1(this.f4612x1, c11697x1M55244k4), this.f4611to);
        } catch (RuntimeException unused) {
            return m5155x1();
        }
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: kk, reason: merged with bridge method [inline-methods] */
    public dm1 Clone() {
        dm1 dm1Var = new dm1();
        CloneTo(dm1Var);
        return dm1Var;
    }

    /* JADX INFO: renamed from: x1 */
    public final dm1 m5155x1() {
        return new dm1(C14113y2.m67358c5(this.f4609k4), C14113y2.m67358c5(this.f4610kk), C14113y2.m67358c5(this.f4612x1), this.f4611to);
    }

    public dm1(String str) {
        this.f4612x1 = str;
        this.f4609k4 = str;
        this.f4610kk = str;
        this.f4611to = null;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m5150x1(dm1 dm1Var) {
        return C14067j2.m66728k4(dm1Var.f4611to, this.f4611to) && C14067j2.m66728k4(dm1Var.f4609k4, this.f4609k4) && C14067j2.m66728k4(dm1Var.f4612x1, this.f4612x1) && C14067j2.m66728k4(dm1Var.f4610kk, this.f4610kk);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m5152k4() {
        C14214o4 c14214o4 = this.f4611to;
        return c14214o4 == null ? this.f4610kk : (c14214o4.m68331to() && this.f4611to.m68326du()) ? this.f4609k4 : this.f4610kk;
    }

    public dm1(String str, C14214o4 c14214o4) {
        this.f4612x1 = str;
        this.f4609k4 = str;
        this.f4610kk = str;
        this.f4611to = c14214o4;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(dm1 dm1Var) {
        dm1Var.f4611to = this.f4611to;
        dm1Var.f4609k4 = this.f4609k4;
        dm1Var.f4612x1 = this.f4612x1;
        dm1Var.f4610kk = this.f4610kk;
    }

    public dm1(String str, String str2, String str3, C14214o4 c14214o4) {
        if (str == null) {
            throw new ArgumentNullException("originalString");
        }
        if (str2 == null) {
            throw new ArgumentNullException("validatedString");
        }
        this.f4609k4 = str;
        this.f4612x1 = str3;
        this.f4610kk = str2;
        this.f4611to = c14214o4;
    }
}
