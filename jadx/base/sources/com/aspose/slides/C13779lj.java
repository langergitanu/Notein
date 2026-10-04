package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.ControlChar;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.lj */
/* JADX INFO: loaded from: classes3.dex */
class C13779lj {
    /* JADX INFO: renamed from: k4 */
    public static void m64402k4(C0735a7 c0735a7, C12007ix c12007ix, com.aspose.slides.internal.p332p7.vyd vydVar) {
        C0735a7 c0735a72;
        int i;
        int i2;
        C0735a7 c0735a73 = c0735a7;
        if (c0735a73 == null) {
            throw new ArgumentNullException("geometry");
        }
        if (vydVar == null) {
            throw new ArgumentNullException("enhancedGeometryElementData");
        }
        boolean zM72731kk = wgi.m72731kk(vydVar.m43422m9());
        C14422rx c14422rx = new C14422rx(vydVar, c12007ix.Clone(), zM72731kk && vydVar.m43414dy() > 0.0d && vydVar.m43411c5() > 0.0d && !m64403k4(vydVar.m43422m9()));
        c14422rx.m70374k4(vydVar);
        List list = new List(c14422rx.m70376kk().size());
        for (int i3 = 0; i3 < c14422rx.m70372k4().size(); i3++) {
            list.addItem(null);
            list.set_Item(i3, new C0899df(c14422rx.m70372k4().get_Item(i3), c14422rx.m70376kk().get_Item(c14422rx.m70372k4().get_Item(i3)), c14422rx.m70378to(), list));
        }
        c0735a73.m3319k4((C0899df[]) list.toArray(new C0899df[0]));
        c0735a73.m3324k4(new C14843yd[1]);
        c0735a73.m3332x1(new C14843yd[1]);
        c0735a73.m3329m9()[0] = new C14843yd(c14422rx.m70370h4()[0], c14422rx.m70370h4()[1], c14422rx.m70378to(), list);
        c0735a73.m3310dy()[0] = new C14843yd(c14422rx.m70370h4()[2], c14422rx.m70370h4()[3], c14422rx.m70378to(), list);
        if (c14422rx.m70380x1() != null && c14422rx.m70380x1().size() > 0) {
            c0735a73.m3322k4(new C13791lr[c14422rx.m70380x1().size()]);
            Dictionary.Enumerator<String, String> it = c14422rx.m70380x1().iterator();
            int i4 = 0;
            while (it.hasNext()) {
                try {
                    KeyValuePair next = it.next();
                    c0735a73.m3334x1()[i4] = new C13791lr((String) next.getKey(), (String) next.getValue());
                    i4++;
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
        if (zM72731kk) {
            List list2 = new List();
            int iM67482k4 = C14116yg.m67482k4(c14422rx.m70369du().m72213kk() - c14422rx.m70369du().m72212k4());
            int iM67482k42 = C14116yg.m67482k4(c14422rx.m70369du().m72215x1() - c14422rx.m70369du().m72214to());
            String strM67440x1 = C14113y2.m67440x1(vydVar.m43422m9());
            int iM67429to = C14113y2.m67429to(strM67440x1, 'N');
            if (iM67429to == -1 || iM67429to == strM67440x1.length() - 1) {
                c0735a72 = c0735a7;
                list2.addItem(new f7k(strM67440x1, iM67482k4, iM67482k42, c0735a72, c14422rx.m70378to(), (List<C0899df>) list, c14422rx.m70377m9()));
            } else {
                String[] strArrM67414k4 = C14113y2.m67414k4(C14113y2.m67362du(vydVar.m43422m9(), new char[0]), 'N');
                int length = strArrM67414k4.length;
                int i5 = 0;
                while (i5 < length) {
                    String str = strArrM67414k4[i5];
                    if (C14113y2.m67411k4(str)) {
                        i = length;
                        i2 = i5;
                    } else {
                        i = length;
                        i2 = i5;
                        list2.addItem(new f7k(C14113y2.m67408k4(str, " N"), iM67482k4, iM67482k42, c0735a73, c14422rx.m70378to(), (List<C0899df>) list, c14422rx.m70377m9()));
                    }
                    i5 = i2 + 1;
                    c0735a73 = c0735a7;
                    length = i;
                }
                c0735a72 = c0735a7;
            }
            c0735a72.m3320k4((f7k[]) list2.toArray(new f7k[0]));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m64403k4(String str) {
        int i = 0;
        for (String str2 : C14113y2.m67414k4(str, ControlChar.SPACE_CHAR)) {
            int[] iArr = {i};
            boolean zM66590k4 = C14057f9.m66590k4(C14113y2.m67440x1(str2), iArr);
            i = iArr[0];
            if (zM66590k4) {
                return true;
            }
        }
        return false;
    }
}
