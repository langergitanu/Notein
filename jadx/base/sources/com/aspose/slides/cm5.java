package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class cm5 {

    /* JADX INFO: renamed from: k4 */
    private final C0950eh f4380k4;

    /* JADX INFO: renamed from: kk */
    private final IShapeCollection f4381kk;

    /* JADX INFO: renamed from: x1 */
    private List<InterfaceC14190no> f4382x1 = new List<>();

    public cm5(C0950eh c0950eh, IShapeCollection iShapeCollection) {
        this.f4380k4 = c0950eh;
        this.f4381kk = iShapeCollection;
        m4664k4();
    }

    /* JADX INFO: renamed from: k4 */
    private float m4662k4(IShape iShape) {
        return iShape.getHeight() * iShape.getWidth();
    }

    /* JADX INFO: renamed from: x1 */
    private void m4666x1() {
        List<InterfaceC14190no> list = new List<>(this.f4382x1);
        int i = 0;
        while (i < this.f4382x1.size() - 1) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.f4382x1.size(); i3++) {
                if (list.get_Item(i).mo4878x1() > list.get_Item(i3).mo4878x1() || (C14064he.m66718x1(list.get_Item(i).mo4878x1(), list.get_Item(i3).mo4878x1()) && list.get_Item(i).mo4870k4() > list.get_Item(i3).mo4870k4())) {
                    InterfaceC14190no interfaceC14190no = list.get_Item(i3);
                    list.set_Item(i3, list.get_Item(i));
                    list.set_Item(i, interfaceC14190no);
                }
            }
            i = i2;
        }
        this.f4382x1 = list;
    }

    /* JADX INFO: renamed from: k4 */
    private List<IShape> m4663k4(IShapeCollection iShapeCollection) {
        List<IShape> list = new List<>(iShapeCollection);
        int i = 0;
        while (i < iShapeCollection.size() - 1) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < iShapeCollection.size(); i3++) {
                if (m4662k4(iShapeCollection.get_Item(i)) < m4662k4(iShapeCollection.get_Item(i3))) {
                    IShape iShape = list.get_Item(i3);
                    list.set_Item(i3, list.get_Item(i));
                    list.set_Item(i, iShape);
                }
            }
            i = i2;
        }
        return list;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m4667k4(InterfaceC1140gd interfaceC1140gd) {
        C6765kp c6765kp = new C6765kp();
        List.Enumerator<InterfaceC14190no> it = this.f4382x1.iterator();
        while (it.hasNext()) {
            try {
                String strMo4871k4 = it.next().mo4871k4(interfaceC1140gd);
                if (!C14113y2.m67363du(strMo4871k4, C14113y2.f47374k4)) {
                    c6765kp.m26792k4(this.f4380k4.f4791x1.m64571to(strMo4871k4));
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    private void m4664k4() {
        if (this.f4380k4.f4790kk.getExportType() != 2) {
            IGenericEnumerator<IShape> it = this.f4381kk.iterator();
            while (it.hasNext()) {
                try {
                    this.f4382x1.addItem(new w6f(it.next(), this.f4380k4));
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        } else {
            List<IShape> listM4663k4 = m4663k4(this.f4381kk);
            int i = 0;
            while (i < listM4663k4.size()) {
                int i2 = i + 1;
                cxw cxwVar = null;
                int i3 = i2;
                while (i3 < listM4663k4.size()) {
                    if (m4665k4(listM4663k4.get_Item(i), listM4663k4.get_Item(i3))) {
                        if (cxwVar == null) {
                            cxwVar = new cxw(this.f4380k4, listM4663k4.get_Item(i));
                        }
                        cxwVar.m4873k4(listM4663k4.get_Item(i3));
                        listM4663k4.removeItem(listM4663k4.get_Item(i3));
                        i3--;
                    }
                    i3++;
                }
                if (cxwVar == null) {
                    this.f4382x1.addItem(new w6f(listM4663k4.get_Item(i), this.f4380k4));
                } else {
                    this.f4382x1.addItem(cxwVar);
                }
                i = i2;
            }
        }
        m4666x1();
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m4665k4(IShape iShape, IShape iShape2) {
        if (iShape.getX() <= iShape2.getX() || iShape.getY() <= iShape2.getY()) {
            return false;
        }
        if (iShape.getHeight() + iShape.getY() < iShape2.getHeight() + iShape2.getY()) {
            return iShape.getWidth() + iShape.getX() < iShape2.getWidth() + iShape2.getX();
        }
        return false;
    }
}
