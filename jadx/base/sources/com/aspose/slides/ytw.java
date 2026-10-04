package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEqualityComparer;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14088s7;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class ytw implements IGenericEqualityComparer<KeyValuePair<qy7, String>> {
    @Override // com.aspose.slides.Collections.Generic.IGenericEqualityComparer
    public boolean equals(Object obj, Object obj2) {
        return C14067j2.m66729x1(obj, obj2);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericEqualityComparer
    public int hashCode(Object obj) {
        return obj.hashCode();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericEqualityComparer
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final int hashCodeT(KeyValuePair<qy7, String> keyValuePair) {
        return keyValuePair.getValue().hashCode() + ((m74084k4(keyValuePair.getKey()) - 324743029) * 486187739);
    }

    /* JADX INFO: renamed from: k4 */
    private int m74084k4(qy7 qy7Var) {
        return C14042ak.m66409k4(qy7Var.m69931xk()) + ((C14042ak.m66413x1(qy7Var.m69895ix()) + ((C14088s7.m67172k4(qy7Var.m69909ks()) + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0((C14064he.m66708k4(qy7Var.m69883bv()) + ((C14064he.m66708k4(qy7Var.m69930x6()) + ((C14042ak.m66408k4(qy7Var.m69921up()) - 324743029) * 486187739)) * 486187739)) * 486187739, 486187739, qy7Var.m69912ne())) * 486187739)) * 486187739);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericEqualityComparer
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final boolean equalsT(KeyValuePair<qy7, String> keyValuePair, KeyValuePair<qy7, String> keyValuePair2) {
        if (keyValuePair.getKey() == null || keyValuePair2.getKey() == null || keyValuePair.getValue() == null || keyValuePair2.getValue() == null) {
            throw new InvalidOperationException();
        }
        return m74085k4(keyValuePair.getKey(), keyValuePair2.getKey()) && C14113y2.m67363du(keyValuePair.getValue(), keyValuePair2.getValue());
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m74085k4(qy7 qy7Var, qy7 qy7Var2) {
        return qy7Var.m69921up() == qy7Var2.m69921up() && C3085sv.m13089k4(qy7Var.m69930x6(), qy7Var2.m69930x6()) && C3085sv.m13089k4(qy7Var.m69883bv(), qy7Var2.m69883bv()) && C14113y2.m67363du(qy7Var.m69912ne(), qy7Var2.m69912ne()) && qy7Var.m69909ks() == qy7Var2.m69909ks() && qy7Var.m69895ix() == qy7Var2.m69895ix() && qy7Var.m69931xk() == qy7Var2.m69931xk();
    }
}
