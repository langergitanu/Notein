package com.aspose.slides;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: loaded from: classes3.dex */
class jua extends AbstractC7020m9<jua> {

    /* JADX INFO: renamed from: k4 */
    public static final jua f45581k4 = new jua(0);

    /* JADX INFO: renamed from: kk */
    public char f45582kk;

    /* JADX INFO: renamed from: to */
    public char f45583to;

    /* JADX INFO: renamed from: x1 */
    public boolean f45584x1;

    public jua() {
        this.f45584x1 = false;
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
        if (obj instanceof jua) {
            return m63549x1((jua) obj);
        }
        return false;
    }

    public int hashCode() {
        return C12569rv.m58664k4(Boolean.valueOf(this.f45584x1), Character.valueOf(this.f45582kk), Character.valueOf(this.f45583to));
    }

    /* JADX INFO: renamed from: k4 */
    public final int m63550k4() {
        return this.f45584x1 ? C14117yj.m67525k4(this.f45582kk, this.f45583to) : this.f45582kk;
    }

    public String toString() {
        return this.f45584x1 ? C14117yj.m67529k4(C14117yj.m67525k4(this.f45582kk, this.f45583to)) : C14113y2.m67389k4(this.f45582kk, 1);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public jua Clone() {
        jua juaVar = new jua();
        CloneTo(juaVar);
        return juaVar;
    }

    public jua(char c) {
        this.f45584x1 = false;
        this.f45582kk = c;
        this.f45583to = (char) 0;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m63549x1(jua juaVar) {
        return juaVar.f45584x1 == this.f45584x1 && juaVar.f45582kk == this.f45582kk && juaVar.f45583to == this.f45583to;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(jua juaVar) {
        juaVar.f45584x1 = this.f45584x1;
        juaVar.f45582kk = this.f45582kk;
        juaVar.f45583to = this.f45583to;
    }

    public jua(char c, char c2) {
        this.f45584x1 = true;
        this.f45582kk = c;
        this.f45583to = c2;
    }
}
