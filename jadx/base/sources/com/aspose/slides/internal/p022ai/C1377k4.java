package com.aspose.slides.internal.p022ai;

import com.aspose.slides.internal.p150gi.C4308x1;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p380ri.C10015kk;
import com.aspose.slides.internal.p475wh.C12003du;

/* JADX INFO: renamed from: com.aspose.slides.internal.ai.k4 */
/* JADX INFO: loaded from: classes3.dex */
public class C1377k4 {

    /* JADX INFO: renamed from: du */
    public C4308x1 f5972du;

    /* JADX INFO: renamed from: k4 */
    public int f5973k4;

    /* JADX INFO: renamed from: kk */
    public int f5974kk;

    /* JADX INFO: renamed from: to */
    public int f5975to;

    /* JADX INFO: renamed from: x1 */
    public C12003du f5976x1;

    public C1377k4(int i, int i2, C12003du c12003du, int i3, C4308x1 c4308x1) {
        C12003du c12003du2 = new C12003du();
        this.f5976x1 = c12003du2;
        this.f5972du = null;
        this.f5973k4 = i;
        this.f5974kk = i2;
        c12003du.CloneTo(c12003du2);
        this.f5975to = i3;
        this.f5972du = c4308x1;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m8167k4(C1377k4 c1377k4) {
        if (c1377k4 == null || c1377k4.f5975to == 0) {
            return 0;
        }
        return c1377k4.f5974kk / 2;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (C7019kk.m27469x1(obj, C1377k4.class)) {
            C1377k4 c1377k4 = (C1377k4) obj;
            if (this.f5973k4 == c1377k4.f5973k4 && this.f5976x1.equals(c1377k4.f5976x1.Clone()) && this.f5974kk == c1377k4.f5974kk && this.f5975to == c1377k4.f5975to) {
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
        c6765kp.m26792k4(m8168k4());
        c6765kp.m26780k4(',');
        c6765kp.m26792k4(C10015kk.m49155k4(this.f5976x1.Clone()));
        c6765kp.m26780k4(',');
        c6765kp.m26805kk(this.f5974kk);
        if (this.f5975to != 0) {
            c6765kp.m26780k4(',');
            c6765kp.m26792k4(this.f5975to == 1 ? "collapse-inner" : "collapse-outer");
        }
        c6765kp.m26780k4(')');
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    private String m8168k4() {
        return C1382x1.m8176k4(this.f5973k4).m8126k4();
    }
}
