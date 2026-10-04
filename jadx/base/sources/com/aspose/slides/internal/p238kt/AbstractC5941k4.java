package com.aspose.slides.internal.p238kt;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.SortedList;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.C13940my;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.kt.k4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5941k4 {

    /* JADX INFO: renamed from: k4 */
    public ArrayList f16798k4 = new ArrayList();

    /* JADX INFO: renamed from: k4 */
    public final C5957s7 m24038k4() {
        return m24039k4(this.f16798k4.size() - 1);
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo23936k4(C13940my c13940my, SortedList sortedList, Hashtable hashtable);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo23937k4(C13940my c13940my, SortedList sortedList, SortedList sortedList2, Hashtable hashtable);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo23938k4(C13981tl c13981tl, SortedList sortedList, SortedList sortedList2, Hashtable hashtable);

    /* JADX INFO: renamed from: kk */
    public final void m24044kk() {
        this.f16798k4.removeAt(r0.size() - 1);
    }

    /* JADX INFO: renamed from: x1 */
    public final C13940my m24045x1(String str, int[] iArr) {
        iArr[0] = -1;
        for (int size = this.f16798k4.size() - 1; size >= 0; size--) {
            C13940my c13940myM24104x1 = m24039k4(size).m24104x1(str);
            if (c13940myM24104x1 != null) {
                iArr[0] = size;
                return c13940myM24104x1;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final C5957s7 m24039k4(int i) {
        return (C5957s7) this.f16798k4.get_Item(i);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m24046x1() {
        this.f16798k4.addItem(new C5957s7());
    }

    /* JADX INFO: renamed from: k4 */
    public final C13940my m24040k4(String str, int[] iArr) {
        iArr[0] = -1;
        for (int size = this.f16798k4.size() - 1; size >= 0; size--) {
            C13940my c13940myM24102k4 = m24039k4(size).m24102k4(str);
            if (c13940myM24102k4 != null) {
                iArr[0] = size;
                return c13940myM24102k4;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m24047x1(C13940my c13940my) {
        m24038k4().m24105x1(c13940my);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24041k4(Hashtable hashtable) {
        int size = hashtable.size();
        Object[] objArr = new Object[size];
        hashtable.getValues().copyTo(AbstractC14092to.m67208k4((Object) objArr), 0);
        for (int i = 0; i < size; i++) {
            m24047x1((C13940my) objArr[i]);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24042k4(SortedList sortedList) {
        Iterator it = sortedList.getKeyList().iterator();
        while (it.hasNext()) {
            try {
                m24043k4((C13940my) it.next());
            } finally {
                if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24043k4(C13940my c13940my) {
        m24038k4().m24103k4(c13940my);
    }
}
