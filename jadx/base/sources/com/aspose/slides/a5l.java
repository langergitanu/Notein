package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.AbstractC14106wy;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class a5l {

    /* JADX INFO: renamed from: k4 */
    private static final Dictionary<String, Integer> f3812k4 = new Dictionary<>();

    /* JADX INFO: renamed from: x1 */
    private static final Dictionary<Integer, String> f3816x1 = new Dictionary<>();

    /* JADX INFO: renamed from: kk */
    private static final Dictionary<Integer, String> f3813kk = new Dictionary<>();

    /* JADX INFO: renamed from: to */
    private static final Dictionary<String, Integer> f3815to = new Dictionary<>();

    /* JADX INFO: renamed from: du */
    private static final Dictionary<String, String> f3810du = new Dictionary<>();

    /* JADX INFO: renamed from: h4 */
    private static final String[] f3811h4 = {".xlsx", ".xlsm", ".xltx", ".xltm"};

    /* JADX INFO: renamed from: m9 */
    private static final String[] f3814m9 = {"application/vnd.openxmlformats-officedocument.spreadsheetml.sheet.main+xml", "application/vnd.ms-excel.sheet.macroEnabled.main+xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.template.main+xml", "application/vnd.ms-excel.template.macroEnabled.main+xml"};

    static {
        List list = new List();
        IEnumerator it = AbstractC14106wy.getValues(C7019kk.m27443k4((Class<?>) jn2.class)).iterator();
        while (it.hasNext()) {
            try {
                list.addItem(Integer.valueOf(C7019kk.m27462to(it.next(), 11)));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
            }
        }
        int i = 0;
        while (true) {
            String[] strArr = f3814m9;
            if (i >= AbstractC14092to.m67208k4((Object) strArr).m67266du(0)) {
                return;
            }
            f3812k4.addItem(strArr[i], (Integer) list.get_Item(i));
            f3816x1.addItem((Integer) list.get_Item(i), strArr[i]);
            Dictionary<Integer, String> dictionary = f3813kk;
            Object obj = list.get_Item(i);
            String[] strArr2 = f3811h4;
            dictionary.addItem((Integer) obj, strArr2[i]);
            f3815to.addItem(strArr2[i], (Integer) list.get_Item(i));
            f3810du.addItem(strArr[i], strArr2[i]);
            i++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static int m3285k4(String str, int i) {
        Integer[] numArr = {0};
        if (f3812k4.tryGetValue(str, numArr)) {
            i = numArr[0].intValue();
        }
        numArr[0].getClass();
        return i;
    }
}
