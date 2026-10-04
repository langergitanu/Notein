package com.aspose.slides.internal.p347px;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.px.v4 */
/* JADX INFO: loaded from: classes4.dex */
public class C9602v4 {

    /* JADX INFO: renamed from: k4 */
    private final String f34736k4;

    /* JADX INFO: renamed from: x1 */
    private final Dictionary<C9579bv, Integer> f34737x1 = new Dictionary<>();

    public C9602v4(String str) {
        this.f34736k4 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final C9579bv m46901k4(int i, boolean z) {
        C9579bv[] c9579bvArr = {null};
        boolean zM46899k4 = m46899k4(i, this.f34736k4, c9579bvArr);
        C9579bv c9579bv = c9579bvArr[0];
        if (zM46899k4) {
            return c9579bv;
        }
        if (z) {
            return null;
        }
        c9579bvArr[0] = c9579bv;
        boolean zM46900k4 = m46900k4(i, c9579bvArr);
        C9579bv c9579bv2 = c9579bvArr[0];
        if (zM46900k4) {
            return c9579bv2;
        }
        c9579bvArr[0] = c9579bv2;
        boolean zM46900k42 = m46900k4(i, c9579bvArr);
        C9579bv c9579bv3 = c9579bvArr[0];
        if (zM46900k42) {
            return c9579bv3;
        }
        c9579bvArr[0] = c9579bv3;
        boolean zM46900k43 = m46900k4(i, c9579bvArr);
        C9579bv c9579bv4 = c9579bvArr[0];
        if (zM46900k43) {
            return c9579bv4;
        }
        c9579bvArr[0] = c9579bv4;
        boolean zM46900k44 = m46900k4(i, c9579bvArr);
        C9579bv c9579bv5 = c9579bvArr[0];
        if (zM46900k44) {
            return c9579bv5;
        }
        c9579bvArr[0] = c9579bv5;
        boolean zM46900k45 = m46900k4(i, c9579bvArr);
        C9579bv c9579bv6 = c9579bvArr[0];
        if (zM46900k45) {
            return c9579bv6;
        }
        Dictionary.KeyCollection.Enumerator<C9579bv, Integer> it = this.f34737x1.getKeys().iterator();
        try {
            if (it.hasNext()) {
                return it.next();
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
            return null;
        } finally {
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46902k4(C9579bv c9579bv) {
        this.f34737x1.set_Item(c9579bv, Integer.valueOf(c9579bv.m46770h4()));
    }

    /* JADX INFO: renamed from: k4 */
    private final boolean m46899k4(int i, String str, C9579bv[] c9579bvArr) {
        Dictionary.Enumerator<C9579bv, Integer> it = this.f34737x1.iterator();
        while (it.hasNext()) {
            KeyValuePair next = it.next();
            if (((Integer) next.getValue()).intValue() == i && ((C9579bv) next.getKey()).m46778k4().equals(str)) {
                c9579bvArr[0] = (C9579bv) next.getKey();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    private final boolean m46900k4(int i, C9579bv[] c9579bvArr) {
        Dictionary.Enumerator<C9579bv, Integer> it = this.f34737x1.iterator();
        while (it.hasNext()) {
            KeyValuePair next = it.next();
            if (((Integer) next.getValue()).intValue() == i) {
                c9579bvArr[0] = (C9579bv) next.getKey();
                return true;
            }
        }
        return false;
    }
}
