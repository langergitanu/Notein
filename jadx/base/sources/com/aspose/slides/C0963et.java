package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEqualityComparer;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.et */
/* JADX INFO: loaded from: classes3.dex */
class C0963et {

    /* JADX INFO: renamed from: k4 */
    static final IGenericEqualityComparer<C14784xf> f4870k4 = new IGenericEqualityComparer<C14784xf>() { // from class: com.aspose.slides.et.1
        @Override // com.aspose.slides.Collections.Generic.IGenericEqualityComparer
        public boolean equals(Object obj, Object obj2) {
            if ((obj instanceof C14784xf) && (obj2 instanceof C14784xf)) {
                return equalsT((C14784xf) obj, (C14784xf) obj2);
            }
            return false;
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericEqualityComparer
        public int hashCode(Object obj) {
            return hashCodeT((C14784xf) obj);
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericEqualityComparer
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public int hashCodeT(C14784xf c14784xf) {
            long j = c14784xf.f50066k4;
            ColorFormat colorFormat = c14784xf.f50068x1;
            long jHashCode = j + ((long) (colorFormat != null ? colorFormat.hashCode() : 0));
            C14321pz c14321pz = c14784xf.f50067kk;
            return (int) (jHashCode + ((long) (c14321pz != null ? c14321pz.hashCode() : 0)));
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericEqualityComparer
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public boolean equalsT(C14784xf c14784xf, C14784xf c14784xf2) {
            if (C14067j2.m66729x1(null, c14784xf) || C14067j2.m66729x1(null, c14784xf2)) {
                return false;
            }
            if (C14067j2.m66729x1(c14784xf, c14784xf2)) {
                return true;
            }
            return c14784xf.f50066k4 == c14784xf2.f50066k4 && C14067j2.m66728k4(c14784xf.f50068x1, c14784xf2.f50068x1) && C14067j2.m66728k4(c14784xf.f50067kk, c14784xf2.f50067kk);
        }
    };

    /* JADX INFO: renamed from: x1 */
    private final Dictionary<C14784xf, InterfaceC14398rk> f4871x1 = new Dictionary<>(f4870k4);

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC14398rk m5684k4(C14784xf c14784xf) {
        InterfaceC14398rk[] interfaceC14398rkArr = {null};
        boolean zTryGetValue = this.f4871x1.tryGetValue(c14784xf.Clone(), interfaceC14398rkArr);
        InterfaceC14398rk interfaceC14398rk = interfaceC14398rkArr[0];
        if (zTryGetValue) {
            return interfaceC14398rk;
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m5685k4(C14784xf c14784xf, InterfaceC14398rk interfaceC14398rk) {
        if (this.f4871x1.containsKey(c14784xf.Clone())) {
            throw new InvalidOperationException("Trying to add new cached value with the same keys.");
        }
        this.f4871x1.addItem(c14784xf.Clone(), interfaceC14398rk);
    }
}
