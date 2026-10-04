package com.aspose.slides.internal.p166hg;

import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.p559ms.System.C14113y2;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.hg.vh */
/* JADX INFO: loaded from: classes.dex */
public final class C4569vh extends List<AbstractC4570vj> {

    /* JADX INFO: renamed from: k4 */
    private int f12761k4;

    public C4569vh(int i) {
        if (i != -1073741824 && i != 48 && i != 192) {
            throw new NotSupportedException("Unsupported security protocol type.");
        }
        this.f12761k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public IGenericList<String> m18872k4() {
        List list = new List(size());
        Iterator<AbstractC4570vj> it = iterator();
        while (it.hasNext()) {
            list.addItem(it.next().m18881ck());
        }
        return list;
    }

    /* JADX INFO: renamed from: x1 */
    public int m18876x1(String str) {
        Iterator<AbstractC4570vj> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            if (C14113y2.m67426m9(str, it.next().m18881ck()) == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC4570vj m18873k4(String str) {
        int iM18876x1 = m18876x1(str);
        if (iM18876x1 == -1) {
            return null;
        }
        return get_Item(iM18876x1);
    }

    /* JADX INFO: renamed from: x1 */
    public int m18877x1(short s) {
        Iterator<AbstractC4570vj> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().m18887jd() == s) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC4570vj m18874k4(short s) {
        int iM18877x1 = m18877x1(s);
        if (iM18877x1 == -1) {
            return null;
        }
        return get_Item(iM18877x1);
    }

    /* JADX INFO: renamed from: k4 */
    public void m18875k4(short s, String str, int i, int i2, int i3, boolean z, boolean z2, byte b, byte b2, short s2, byte b3, byte b4) {
        int i4 = this.f12761k4;
        if (i4 != -1073741824) {
            if (i4 == 48) {
                addItem(new C4538fa(s, str, i, i2, i3, z, z2, b, b2, s2, b3, b4));
                return;
            } else if (i4 != 192) {
                return;
            }
        }
        addItem(new C4573wp(s, str, i, i2, i3, z, z2, b, b2, s2, b3, b4));
    }
}
