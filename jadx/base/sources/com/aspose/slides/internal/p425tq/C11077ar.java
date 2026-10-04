package com.aspose.slides.internal.p425tq;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p380ri.C10013jd;
import com.huawei.hms.network.embedded.C18358t1;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.tq.ar */
/* JADX INFO: loaded from: classes4.dex */
public class C11077ar {

    /* JADX INFO: renamed from: k4 */
    private Dictionary<String, List<InterfaceC11100yj>> f38404k4 = new Dictionary<>();

    public C11077ar() {
        m53531k4();
    }

    /* JADX INFO: renamed from: k4 */
    private void m53531k4() {
        Iterator<Object> itM49143k4 = C10013jd.m49143k4(InterfaceC11100yj.class);
        if (itM49143k4 != null) {
            while (itM49143k4.hasNext()) {
                try {
                    m53534k4((InterfaceC11100yj) itM49143k4.next());
                } catch (IllegalArgumentException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m53533x1(InterfaceC11100yj interfaceC11100yj) {
        m53532k4(C18358t1.g.f56183c, interfaceC11100yj);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53534k4(InterfaceC11100yj interfaceC11100yj) {
        String strM53625k4 = interfaceC11100yj.m53625k4();
        if (strM53625k4 == null) {
            m53533x1(interfaceC11100yj);
        } else {
            m53532k4(strM53625k4, interfaceC11100yj);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m53532k4(String str, InterfaceC11100yj interfaceC11100yj) {
        List<InterfaceC11100yj> list = (List) C7019kk.m27452k4((Object) this.f38404k4.get_Item(str), List.class);
        if (list == null) {
            list = new List<>();
            this.f38404k4.addItem(str, list);
        }
        list.addItem(interfaceC11100yj);
    }
}
