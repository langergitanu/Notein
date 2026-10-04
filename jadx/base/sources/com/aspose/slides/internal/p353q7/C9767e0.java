package com.aspose.slides.internal.p353q7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.q7.e0 */
/* JADX INFO: loaded from: classes4.dex */
public class C9767e0 {

    /* JADX INFO: renamed from: k4 */
    private final String f35288k4;

    /* JADX INFO: renamed from: x1 */
    private final Dictionary<C9790ts, Integer> f35289x1 = new Dictionary<>();

    public C9767e0(String str) {
        this.f35288k4 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m48048k4() {
        return this.f35289x1.size();
    }

    /* JADX INFO: renamed from: k4 */
    public final C9790ts m48049k4(int i, boolean z) {
        C9790ts[] c9790tsArr = {null};
        boolean zM48046k4 = m48046k4(i, this.f35288k4, c9790tsArr);
        C9790ts c9790ts = c9790tsArr[0];
        if (zM48046k4) {
            return c9790ts;
        }
        if (z) {
            return null;
        }
        c9790tsArr[0] = c9790ts;
        boolean zM48047k4 = m48047k4(i & (-5), c9790tsArr);
        C9790ts c9790ts2 = c9790tsArr[0];
        if (zM48047k4) {
            return c9790ts2;
        }
        c9790tsArr[0] = c9790ts2;
        boolean zM48047k42 = m48047k4(i & (-9), c9790tsArr);
        C9790ts c9790ts3 = c9790tsArr[0];
        if (zM48047k42) {
            return c9790ts3;
        }
        c9790tsArr[0] = c9790ts3;
        boolean zM48047k43 = m48047k4(i & (-3), c9790tsArr);
        C9790ts c9790ts4 = c9790tsArr[0];
        if (zM48047k43) {
            return c9790ts4;
        }
        c9790tsArr[0] = c9790ts4;
        boolean zM48047k44 = m48047k4(i & (-2), c9790tsArr);
        C9790ts c9790ts5 = c9790tsArr[0];
        if (zM48047k44) {
            return c9790ts5;
        }
        c9790tsArr[0] = c9790ts5;
        boolean zM48047k45 = m48047k4(0, c9790tsArr);
        C9790ts c9790ts6 = c9790tsArr[0];
        if (zM48047k45) {
            return c9790ts6;
        }
        Dictionary.KeyCollection.Enumerator<C9790ts, Integer> it = this.f35289x1.getKeys().iterator();
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
    public final void m48050k4(C9790ts c9790ts) {
        this.f35289x1.set_Item(c9790ts, Integer.valueOf(c9790ts.m48183dy()));
    }

    /* JADX INFO: renamed from: k4 */
    private final boolean m48046k4(int i, String str, C9790ts[] c9790tsArr) {
        Dictionary.Enumerator<C9790ts, Integer> it = this.f35289x1.iterator();
        while (it.hasNext()) {
            KeyValuePair next = it.next();
            if (((Integer) next.getValue()).intValue() == i && ((C9790ts) next.getKey()).m48202k4().equals(str)) {
                c9790tsArr[0] = (C9790ts) next.getKey();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    private final boolean m48047k4(int i, C9790ts[] c9790tsArr) {
        Dictionary.Enumerator<C9790ts, Integer> it = this.f35289x1.iterator();
        while (it.hasNext()) {
            KeyValuePair next = it.next();
            if (((Integer) next.getValue()).intValue() == i) {
                c9790tsArr[0] = (C9790ts) next.getKey();
                return true;
            }
        }
        return false;
    }
}
