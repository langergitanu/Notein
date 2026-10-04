package com.aspose.slides.internal.p238kt;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.SortedList;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13901ga;
import com.aspose.slides.p559ms.System.Xml.C13940my;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.kt.kk */
/* JADX INFO: loaded from: classes.dex */
public class C5942kk extends AbstractC5941k4 {
    @Override // com.aspose.slides.internal.p238kt.AbstractC5941k4
    /* JADX INFO: renamed from: k4 */
    public void mo23936k4(C13940my c13940my, SortedList sortedList, Hashtable hashtable) {
        hashtable.addItem(C5934he.m23977k4(c13940my), c13940my);
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5941k4
    /* JADX INFO: renamed from: k4 */
    public void mo23937k4(C13940my c13940my, SortedList sortedList, SortedList sortedList2, Hashtable hashtable) {
        hashtable.addItem(C5934he.m23977k4(c13940my), c13940my);
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5941k4
    /* JADX INFO: renamed from: k4 */
    public void mo23938k4(C13981tl c13981tl, SortedList sortedList, SortedList sortedList2, Hashtable hashtable) {
        int size = hashtable.size();
        Object[] objArr = new Object[size];
        hashtable.getValues().copyTo(AbstractC14092to.m67208k4((Object) objArr), 0);
        for (int i = 0; i < size; i++) {
            C13940my c13940my = (C13940my) objArr[i];
            if (C5934he.m23987k4(c13940my, m24040k4(C5934he.m23977k4(c13940my), new int[]{0}))) {
                hashtable.removeItem(C5934he.m23977k4(c13940my));
                if (C5934he.m24002x1((AbstractC13901ga) c13940my)) {
                    sortedList.addItem(c13940my, null);
                } else {
                    sortedList2.addItem(c13940my, null);
                }
            }
        }
        for (int size2 = this.f16798k4.size() - 1; size2 >= 0; size2--) {
            Iterator it = m24039k4(size2).m24101k4().getValues().iterator();
            while (it.hasNext()) {
                try {
                    C13940my c13940my2 = (C13940my) it.next();
                    if (c13940my2 != null) {
                        m24048k4(C5934he.m23977k4(c13940my2), sortedList, sortedList2, hashtable);
                    }
                } finally {
                    if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
                        ((IDisposable) it).dispose();
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m24048k4(String str, SortedList sortedList, SortedList sortedList2, Hashtable hashtable) {
        boolean zM27456k4;
        Iterator it = sortedList2.getKeyList().iterator();
        while (true) {
            try {
                if (!it.hasNext()) {
                    if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
                        ((IDisposable) it).dispose();
                    }
                    it = sortedList.getKeyList().iterator();
                    while (it.hasNext()) {
                        try {
                            if (C14113y2.m67363du(((C13940my) it.next()).getLocalName(), str)) {
                                if (!C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
                                    return;
                                }
                            }
                        } finally {
                            if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
                                ((IDisposable) it).dispose();
                            }
                        }
                    }
                    if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
                        ((IDisposable) it).dispose();
                    }
                    C13940my c13940my = (C13940my) hashtable.get_Item(str);
                    int[] iArr = {0};
                    C13940my c13940myM24040k4 = m24040k4(str, iArr);
                    int i = iArr[0];
                    if (c13940my != null) {
                        if (C5934he.m23987k4(c13940my, c13940myM24040k4)) {
                            hashtable.removeItem(str);
                            if (C5934he.m24002x1((AbstractC13901ga) c13940my)) {
                                sortedList.addItem(c13940my, null);
                                return;
                            } else {
                                sortedList2.addItem(c13940my, null);
                                return;
                            }
                        }
                        return;
                    }
                    int[] iArr2 = {0};
                    C13940my c13940myM24045x1 = m24045x1(str, iArr2);
                    int i2 = iArr2[0];
                    if (c13940myM24045x1 == null || i2 <= i || !C5934he.m23987k4(c13940myM24045x1, c13940myM24040k4)) {
                        return;
                    }
                    if (C5934he.m24002x1((AbstractC13901ga) c13940myM24045x1)) {
                        sortedList.addItem(c13940myM24045x1, null);
                        return;
                    } else {
                        sortedList2.addItem(c13940myM24045x1, null);
                        return;
                    }
                }
                if (C5934he.m23988k4((C13940my) it.next(), str)) {
                    if (!zM27456k4) {
                        return;
                    }
                }
            } finally {
                if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
            }
        }
    }
}
