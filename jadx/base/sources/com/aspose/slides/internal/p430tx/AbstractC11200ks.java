package com.aspose.slides.internal.p430tx;

import com.aspose.slides.exceptions.XsltException;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.ks */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11200ks extends AbstractC11197k4 {
    /* JADX INFO: renamed from: k4 */
    public static String m53849k4(C11204m9[] c11204m9Arr) {
        C11204m9 c11204m9 = c11204m9Arr[0];
        if (c11204m9 == null || !c11204m9.m53860k4()) {
            return null;
        }
        String strM53859k4 = c11204m9Arr[0].m53859k4((C11234xw) null, (C11231x1) null);
        c11204m9Arr[0] = null;
        return strM53859k4;
    }

    /* JADX INFO: renamed from: du */
    public final void m53850du(C11212rv c11212rv) {
        String strM53748up = c11212rv.m53964to().m53748up();
        if (c11212rv.m53924h4()) {
            do {
                int iM53734fa = c11212rv.m53964to().m53734fa();
                if (iM53734fa != 6 && iM53734fa != 8 && iM53734fa != 7) {
                    throw XsltException.create("The contents of '{0}' must be empty.", strM53748up);
                }
            } while (c11212rv.m53913du());
            c11212rv.m53954m9();
        }
    }

    /* JADX INFO: renamed from: kk */
    public boolean mo53670kk(C11212rv c11212rv) {
        return false;
    }

    /* JADX INFO: renamed from: to */
    public final void m53853to(C11212rv c11212rv) {
        C11186g8 c11186g8M53964to = c11212rv.m53964to();
        String strM53753yj = c11186g8M53964to.m53753yj();
        if (c11186g8M53964to.m53747u4()) {
            do {
                if (c11186g8M53964to.m53741ks().length() == 0) {
                    try {
                        if (!mo53670kk(c11212rv)) {
                            throw XsltException.create("'{0}' is an invalid attribute for the '{1}' element.", c11186g8M53964to.m53753yj(), strM53753yj);
                        }
                    } catch (RuntimeException e) {
                        if (!c11212rv.m53919fa()) {
                            throw e;
                        }
                    }
                }
            } while (c11186g8M53964to.m53749uz());
            c11186g8M53964to.m53733dy();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53851k4(C11212rv c11212rv, Object obj, String str) {
        m53852k4(c11212rv, obj != null, str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53852k4(C11212rv c11212rv, boolean z, String str) {
        if (!z) {
            throw XsltException.create("Missing mandatory attribute '{0}'.", str);
        }
    }
}
