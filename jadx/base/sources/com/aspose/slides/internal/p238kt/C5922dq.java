package com.aspose.slides.internal.p238kt;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.SortedList;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.C13940my;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.kt.dq */
/* JADX INFO: loaded from: classes.dex */
public class C5922dq extends AbstractC5941k4 {

    /* JADX INFO: renamed from: x1 */
    private Hashtable f16748x1;

    public C5922dq(String str) {
        this.f16748x1 = null;
        this.f16748x1 = C5934he.m23993kk(str);
    }

    /* JADX INFO: renamed from: kk */
    private boolean m23935kk(C13940my c13940my) {
        String strM23977k4 = C5934he.m23977k4(c13940my);
        return this.f16748x1.containsKey(strM23977k4) && C5934he.m23987k4(c13940my, m24040k4(strM23977k4, new int[]{0}));
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5941k4
    /* JADX INFO: renamed from: k4 */
    public void mo23936k4(C13940my c13940my, SortedList sortedList, Hashtable hashtable) {
        if (C5934he.m24003x1(c13940my)) {
            return;
        }
        if (m23935kk(c13940my)) {
            sortedList.addItem(c13940my, null);
        } else {
            hashtable.addItem(C5934he.m23977k4(c13940my), c13940my);
        }
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5941k4
    /* JADX INFO: renamed from: k4 */
    public void mo23937k4(C13940my c13940my, SortedList sortedList, SortedList sortedList2, Hashtable hashtable) {
        sortedList2.addItem(c13940my, null);
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5941k4
    /* JADX INFO: renamed from: k4 */
    public void mo23938k4(C13981tl c13981tl, SortedList sortedList, SortedList sortedList2, Hashtable hashtable) {
        m23934k4(c13981tl.getPrefix(), sortedList2, hashtable);
        Iterator it = sortedList.getKeyList().iterator();
        while (it.hasNext()) {
            try {
                String prefix = ((C13940my) it.next()).getPrefix();
                if (prefix.length() > 0) {
                    m23934k4(prefix, sortedList2, hashtable);
                }
            } finally {
                if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m23934k4(String str, SortedList sortedList, Hashtable hashtable) {
        boolean zM27456k4;
        Iterator it = sortedList.getKeyList().iterator();
        while (it.hasNext()) {
            try {
                if (C5934he.m23988k4((C13940my) it.next(), str)) {
                    if (zM27456k4) {
                        return;
                    } else {
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
                sortedList.addItem(c13940my, null);
                return;
            }
            return;
        }
        int[] iArr2 = {0};
        C13940my c13940myM24045x1 = m24045x1(str, iArr2);
        int i2 = iArr2[0];
        if (c13940myM24045x1 == null || i2 <= i || !C5934he.m23987k4(c13940myM24045x1, c13940myM24040k4)) {
            return;
        }
        sortedList.addItem(c13940myM24045x1, null);
    }
}
