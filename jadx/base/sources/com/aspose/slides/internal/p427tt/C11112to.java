package com.aspose.slides.internal.p427tt;

import com.aspose.slides.Collections.Generic.IGenericEqualityComparer;
import com.aspose.slides.internal.p244l7.C6012x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14098up;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tt.to */
/* JADX INFO: loaded from: classes4.dex */
public class C11112to implements IGenericEqualityComparer<C6012x1.k4> {

    /* JADX INFO: renamed from: k4 */
    public static final C11112to f38447k4 = new C11112to();

    /* JADX INFO: renamed from: kk */
    private boolean m53650kk(C6012x1.k4 k4Var, C6012x1.k4 k4Var2) {
        return k4Var.f17019up == k4Var2.f17019up && C14113y2.m67363du(k4Var.f17021yj, k4Var2.f17021yj) && C11113x1.m53660kk(k4Var) == C11113x1.m53660kk(k4Var2);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericEqualityComparer
    public boolean equals(Object obj, Object obj2) {
        return equalsT((C6012x1.k4) C7019kk.m27452k4(obj, C6012x1.k4.class), (C6012x1.k4) C7019kk.m27452k4(obj2, C6012x1.k4.class));
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericEqualityComparer
    public int hashCode(Object obj) {
        return m53651k4((C6012x1.k4) C7019kk.m27452k4(obj, C6012x1.k4.class));
    }

    /* JADX INFO: renamed from: k4 */
    public final int m53651k4(C6012x1.k4 k4Var) {
        if (C14067j2.m66729x1(k4Var, null)) {
            return 0;
        }
        return C14042ak.m66409k4(C11113x1.m53660kk(k4Var)) ^ (((C14098up.m67317k4(k4Var.f17019up) * 397) ^ k4Var.f17021yj.hashCode()) * 397);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericEqualityComparer
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public int hashCodeT(C6012x1.k4 k4Var) {
        return m53651k4(k4Var);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m53652k4(C6012x1.k4 k4Var, C6012x1.k4 k4Var2) {
        if (k4Var == null && k4Var2 == null) {
            return true;
        }
        if ((k4Var2 == null) || (k4Var == null)) {
            return false;
        }
        return m53650kk(k4Var, k4Var2);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericEqualityComparer
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public boolean equalsT(C6012x1.k4 k4Var, C6012x1.k4 k4Var2) {
        return m53652k4(k4Var, k4Var2);
    }
}
