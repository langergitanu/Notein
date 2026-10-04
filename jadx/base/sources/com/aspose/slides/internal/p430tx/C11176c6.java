package com.aspose.slides.internal.p430tx;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.p559ms.System.Xml.C13890ei;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.c6 */
/* JADX INFO: loaded from: classes4.dex */
public class C11176c6 {

    /* JADX INFO: renamed from: k4 */
    private C13890ei f38480k4;

    /* JADX INFO: renamed from: kk */
    private int f38481kk;

    /* JADX INFO: renamed from: to */
    private ArrayList f38482to = null;

    /* JADX INFO: renamed from: x1 */
    private int f38483x1;

    public C11176c6(C13890ei c13890ei, int i, int i2) {
        this.f38480k4 = c13890ei;
        this.f38483x1 = i;
        this.f38481kk = i2;
    }

    /* JADX INFO: renamed from: k4 */
    public final Hashtable m53685k4(AbstractC10925du abstractC10925du) {
        if (this.f38482to == null) {
            return null;
        }
        for (int i = 0; i < this.f38482to.size(); i++) {
            if (((C11170ar) C7019kk.m27464to(this.f38482to.get_Item(i), C11170ar.class)).m53673k4().mo21876x1(abstractC10925du)) {
                return ((C11170ar) C7019kk.m27464to(this.f38482to.get_Item(i), C11170ar.class)).m53676x1();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: kk */
    public final int m53688kk() {
        return this.f38481kk;
    }

    /* JADX INFO: renamed from: to */
    public final C11176c6 m53689to() {
        return new C11176c6(this.f38480k4, this.f38483x1, this.f38481kk);
    }

    /* JADX INFO: renamed from: x1 */
    public final int m53690x1() {
        return this.f38483x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final C13890ei m53686k4() {
        return this.f38480k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53687k4(AbstractC10925du abstractC10925du, Hashtable hashtable) {
        if (this.f38482to == null) {
            this.f38482to = new ArrayList();
        }
        this.f38482to.addItem(new C11170ar(abstractC10925du, hashtable));
    }
}
