package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.cg */
/* JADX INFO: loaded from: classes3.dex */
class C0853cg {
    /* JADX INFO: renamed from: k4 */
    private static C14198nr[] m4574k4(C13689jk c13689jk, boolean z) {
        Object[] array;
        List list = new List();
        int iM63369kk = c13689jk.m63369kk();
        c13689jk.m63367k4('}');
        if (z && c13689jk.m63371x1()) {
            array = list.toArray(new C14198nr[0]);
        } else {
            String[] strArrM67414k4 = C14113y2.m67414k4(c13689jk.m63366k4(iM63369kk, c13689jk.m63369kk()), ';');
            for (String str : strArrM67414k4) {
                String strM67440x1 = C14113y2.m67440x1(str);
                if (!C14113y2.m67411k4(strM67440x1)) {
                    int iM67429to = C14113y2.m67429to(strM67440x1, ':');
                    list.addItem(new C14198nr(m4577kk(C14113y2.m67440x1(C14113y2.m67443x1(strM67440x1, 0, iM67429to == -1 ? 0 : iM67429to))), m4577kk(C14113y2.m67440x1(C14113y2.m67422kk(strM67440x1, iM67429to == -1 ? 0 : iM67429to + 1)))));
                }
            }
            array = list.toArray(new C14198nr[0]);
        }
        return (C14198nr[]) array;
    }

    /* JADX INFO: renamed from: kk */
    private static String m4577kk(String str) {
        return C14113y2.m67423kk(C14113y2.m67423kk(str, '\''), '\"');
    }

    /* JADX INFO: renamed from: x1 */
    public static C14406rn m4578x1(String str) {
        C13689jk c13689jk = new C13689jk(str);
        if (c13689jk.m63371x1()) {
            return null;
        }
        c13689jk.m63364du();
        return new C14406rn(null, m4574k4(c13689jk, false));
    }

    /* JADX INFO: renamed from: k4 */
    public static C14406rn[] m4575k4(String str) {
        Object[] array;
        List list = new List();
        C13689jk c13689jk = new C13689jk(str);
        if (c13689jk.m63368k4()) {
            array = list.toArray(new C14406rn[0]);
        } else {
            while (!c13689jk.m63371x1()) {
                c13689jk.m63364du();
                String[] strArrM4576k4 = m4576k4(c13689jk);
                if (strArrM4576k4.length == 0) {
                    break;
                }
                c13689jk.m63365h4();
                C14198nr[] c14198nrArrM4579x1 = m4579x1(c13689jk);
                c13689jk.m63365h4();
                list.addItem(new C14406rn(strArrM4576k4, c14198nrArrM4579x1));
            }
            array = list.toArray(new C14406rn[0]);
        }
        return (C14406rn[]) array;
    }

    /* JADX INFO: renamed from: x1 */
    private static C14198nr[] m4579x1(C13689jk c13689jk) {
        return m4574k4(c13689jk, true);
    }

    /* JADX INFO: renamed from: k4 */
    private static String[] m4576k4(C13689jk c13689jk) {
        Object[] array;
        List list = new List();
        int iM63369kk = c13689jk.m63369kk();
        c13689jk.m63367k4('{');
        if (c13689jk.m63371x1()) {
            array = list.toArray(new String[0]);
        } else {
            for (String str : C14113y2.m67414k4(c13689jk.m63366k4(iM63369kk, c13689jk.m63369kk()), ',')) {
                String strM4577kk = m4577kk(C14113y2.m67440x1(str));
                if (!C14113y2.m67411k4(strM4577kk)) {
                    list.addItem(strM4577kk);
                }
            }
            array = list.toArray(new String[0]);
        }
        return (String[]) array;
    }
}
