package com.aspose.slides.internal.p508xq;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p085dk.C3179x1;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.xq.du */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC12594du {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f42134kk = new C7017h4("Relationship", "Id", "Type", "Target", "TargetMode");

    /* JADX INFO: renamed from: k4 */
    private final C12593c5 f42135k4 = new C12593c5("/");

    /* JADX INFO: renamed from: x1 */
    private final C12600m9 f42136x1 = new C12600m9();

    /* JADX INFO: renamed from: k4 */
    public final C12596h4 m58788k4(String str) {
        return this.f42136x1.m58813k4(str);
    }

    /* JADX INFO: renamed from: kk */
    public final C12593c5 m58791kk() {
        return this.f42135k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12596h4 m58792x1(String str) {
        C12596h4 c12596h4M58788k4 = m58788k4(str);
        if (c12596h4M58788k4 != null) {
            return c12596h4M58788k4;
        }
        throw new InvalidOperationException(C14113y2.m67402k4("Cannot find part '{0}'.", str));
    }

    /* JADX INFO: renamed from: k4 */
    public static String m58786k4(String str, String str2) {
        if (!C14113y2.m67448x1(str2, "/")) {
            return str2;
        }
        int iM67507x1 = C14116yg.m67507x1(str.length(), str2.length());
        int i = 0;
        for (int i2 = 0; i2 < iM67507x1; i2++) {
            if (str.charAt(i2) == '/') {
                i = i2;
            }
            if (str.charAt(i2) != str2.charAt(i2)) {
                break;
            }
        }
        int i3 = i + 1;
        C6765kp c6765kp = new C6765kp();
        for (int i4 = i3; i4 < str.length(); i4++) {
            if (str.charAt(i4) == '/') {
                c6765kp.m26792k4("../");
            }
        }
        c6765kp.m26793k4(str2, i3, str2.length() - i3);
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public final C12600m9 m58793x1() {
        return this.f42136x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m58789k4() {
        IGenericEnumerator<C12596h4> it = this.f42136x1.iterator();
        while (it.hasNext()) {
            try {
                C12596h4 next = it.next();
                if ("rels".equals(next.m58804x1())) {
                    String strM67401k4 = C14113y2.m67401k4(C14113y2.m67401k4(next.m58800k4(), "/_rels", C14113y2.f47374k4), ".rels", C14113y2.f47374k4);
                    m58787k4(next, "/".equals(strM67401k4) ? this.f42135k4 : m58792x1(strM67401k4).m58799h4());
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void mo58790k4(AbstractC3150x6 abstractC3150x6) {
    }

    /* JADX INFO: renamed from: k4 */
    private static void m58787k4(C12596h4 c12596h4, C12593c5 c12593c5) {
        C3179x1 c3179x1 = new C3179x1(c12596h4.m58803to());
        while (c3179x1.m13613k4("Relationships")) {
            if (f42134kk.m27428k4(c3179x1.m13609du()) != 0) {
                c3179x1.m13612k4();
            } else {
                String strM13610h4 = null;
                String strM13610h42 = null;
                boolean zEquals = false;
                String strM13610h43 = null;
                while (c3179x1.m13617x1()) {
                    int iM27428k4 = f42134kk.m27428k4(c3179x1.m13609du());
                    if (iM27428k4 == 1) {
                        strM13610h4 = c3179x1.m13610h4();
                    } else if (iM27428k4 == 2) {
                        strM13610h43 = c3179x1.m13610h4();
                    } else if (iM27428k4 == 3) {
                        strM13610h42 = c3179x1.m13610h4();
                    } else if (iM27428k4 == 4) {
                        zEquals = "External".equals(c3179x1.m13610h4());
                    }
                }
                c12593c5.m58785k4(strM13610h4, strM13610h43, strM13610h42, zEquals);
            }
        }
    }
}
