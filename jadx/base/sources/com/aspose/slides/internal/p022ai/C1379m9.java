package com.aspose.slides.internal.p022ai;

import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p380ri.C10015kk;
import com.aspose.slides.internal.p475wh.C12003du;

/* JADX INFO: renamed from: com.aspose.slides.internal.ai.m9 */
/* JADX INFO: loaded from: classes3.dex */
public class C1379m9 {

    /* JADX INFO: renamed from: k4 */
    public int f5984k4;

    /* JADX INFO: renamed from: kk */
    public int f5985kk;

    /* JADX INFO: renamed from: x1 */
    public C12003du f5986x1;

    public C1379m9(int i, int i2, C12003du c12003du) {
        C12003du c12003du2 = new C12003du();
        this.f5986x1 = c12003du2;
        this.f5984k4 = i;
        this.f5985kk = i2;
        c12003du.CloneTo(c12003du2);
    }

    /* JADX INFO: renamed from: k4 */
    private String m8169k4() {
        return C1382x1.m8176k4(this.f5984k4).m8126k4();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (C7019kk.m27469x1(obj, C1379m9.class)) {
            C1379m9 c1379m9 = (C1379m9) obj;
            if (this.f5984k4 == c1379m9.f5984k4 && this.f5986x1.equals(c1379m9.f5986x1.Clone()) && this.f5985kk == c1379m9.f5985kk) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26780k4('(');
        c6765kp.m26792k4(m8169k4());
        c6765kp.m26780k4(',');
        c6765kp.m26792k4(C10015kk.m49155k4(this.f5986x1.Clone()));
        c6765kp.m26780k4(',');
        c6765kp.m26805kk(this.f5985kk);
        c6765kp.m26780k4(')');
        return c6765kp.toString();
    }
}
