package com.aspose.slides.internal.p430tx;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.ar */
/* JADX INFO: loaded from: classes4.dex */
public class C11170ar extends AbstractC7020m9<C11170ar> {

    /* JADX INFO: renamed from: k4 */
    private AbstractC10925du f38457k4;

    /* JADX INFO: renamed from: x1 */
    private Hashtable f38458x1;

    public C11170ar() {
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
        if (obj instanceof C11170ar) {
            return m53672x1((C11170ar) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC10925du m53673k4() {
        return this.f38457k4;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: kk, reason: merged with bridge method [inline-methods] */
    public C11170ar Clone() {
        C11170ar c11170ar = new C11170ar();
        CloneTo(c11170ar);
        return c11170ar;
    }

    /* JADX INFO: renamed from: x1 */
    public final Hashtable m53676x1() {
        return this.f38458x1;
    }

    public C11170ar(AbstractC10925du abstractC10925du, Hashtable hashtable) {
        this.f38457k4 = abstractC10925du;
        this.f38458x1 = hashtable;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m53672x1(C11170ar c11170ar) {
        return C14067j2.m66728k4(c11170ar.f38457k4, this.f38457k4) && C14067j2.m66728k4(c11170ar.f38458x1, this.f38458x1);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C11170ar c11170ar) {
        if (c11170ar == null) {
            c11170ar = new C11170ar();
        }
        c11170ar.f38457k4 = this.f38457k4;
        c11170ar.f38458x1 = this.f38458x1;
    }
}
