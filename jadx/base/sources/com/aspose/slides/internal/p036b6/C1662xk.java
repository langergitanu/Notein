package com.aspose.slides.internal.p036b6;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.b6.xk */
/* JADX INFO: loaded from: classes3.dex */
public class C1662xk {

    /* JADX INFO: renamed from: k4 */
    private static C1662xk f6369k4 = new C1662xk();

    /* JADX INFO: renamed from: kk */
    private static Dictionary<String, Integer> f6370kk;

    /* JADX INFO: renamed from: x1 */
    private static Dictionary<Integer, String> f6371x1;

    static {
        Dictionary<Integer, String> dictionary = new Dictionary<>();
        f6371x1 = dictionary;
        dictionary.addItem(0, "copyright");
        f6371x1.addItem(1, "fontFamily");
        f6371x1.addItem(2, "fontSubFamily");
        f6371x1.addItem(3, "uniqueSubFamily");
        f6371x1.addItem(4, "fullName");
        f6371x1.addItem(5, "version");
        f6371x1.addItem(6, "postScriptName");
        f6371x1.addItem(7, "tradeMark");
        f6371x1.addItem(8, "manufacturer");
        f6371x1.addItem(9, "designer");
        f6371x1.addItem(10, "description");
        f6371x1.addItem(11, "urlOfFontVendor");
        f6371x1.addItem(12, "urlOfFontDesigner");
        f6371x1.addItem(13, "licence");
        f6371x1.addItem(14, "urlOfLicence");
        f6371x1.addItem(16, "preferredFamily");
        f6371x1.addItem(17, "preferredSubFamily");
        f6371x1.addItem(18, "compatibleFull");
        f6371x1.addItem(19, "sampleText");
        f6370kk = new Dictionary<>();
        Dictionary.KeyCollection.Enumerator<Integer, String> it = f6371x1.getKeys().iterator();
        while (it.hasNext()) {
            try {
                Integer num = (Integer) C7019kk.m27464to(it.next(), Integer.TYPE);
                num.intValue();
                f6370kk.addItem(f6371x1.get_Item(num), num);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static C1662xk m9039x1() {
        return f6369k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final Dictionary<String, Integer> m9040k4() {
        return f6370kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m9041k4(int i) {
        return f6371x1.containsKey(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: x1 */
    public final String m9042x1(int i) {
        return f6371x1.get_Item(Integer.valueOf(i));
    }
}
