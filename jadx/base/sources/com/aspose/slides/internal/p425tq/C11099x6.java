package com.aspose.slides.internal.p425tq;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p380ri.C10013jd;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.tq.x6 */
/* JADX INFO: loaded from: classes4.dex */
public class C11099x6 implements Comparator<InterfaceC11088ks> {

    /* JADX INFO: renamed from: kk */
    private int f38432kk;

    /* JADX INFO: renamed from: k4 */
    private Dictionary<AbstractC14068j5, InterfaceC11088ks> f38431k4 = new Dictionary<>();

    /* JADX INFO: renamed from: x1 */
    private List<InterfaceC11088ks> f38433x1 = new List<>();

    public C11099x6() {
        m53622k4();
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final int compare(InterfaceC11088ks interfaceC11088ks, InterfaceC11088ks interfaceC11088ks2) {
        if (interfaceC11088ks.m53598k4() < interfaceC11088ks2.m53598k4()) {
            return 1;
        }
        return interfaceC11088ks.m53598k4() > interfaceC11088ks2.m53598k4() ? -1 : 0;
    }

    /* JADX INFO: renamed from: k4 */
    private void m53622k4() {
        Iterator<Object> itM49143k4 = C10013jd.m49143k4(InterfaceC11088ks.class);
        if (itM49143k4 != null) {
            while (itM49143k4.hasNext()) {
                try {
                    m53624k4((InterfaceC11088ks) itM49143k4.next());
                } catch (ArgumentException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53624k4(InterfaceC11088ks interfaceC11088ks) {
        this.f38431k4.addItem(interfaceC11088ks.m53599x1(), interfaceC11088ks);
        this.f38433x1.addItem(interfaceC11088ks);
        this.f38433x1.sort(this);
        this.f38432kk++;
    }
}
