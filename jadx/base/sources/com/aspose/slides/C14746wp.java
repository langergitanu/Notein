package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7543ea;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.wp */
/* JADX INFO: loaded from: classes3.dex */
class C14746wp {

    /* JADX INFO: renamed from: k4 */
    private static final Dictionary<String, String> f49834k4;

    /* JADX INFO: renamed from: kk */
    private static final Dictionary<String, Integer> f49835kk;

    /* JADX INFO: renamed from: to */
    private static final Dictionary<String, Integer> f49836to;

    /* JADX INFO: renamed from: x1 */
    private static final Dictionary<String, String> f49837x1;

    static {
        Dictionary<String, String> dictionary = new Dictionary<>();
        f49834k4 = dictionary;
        dictionary.addItem("visible", "visible");
        Dictionary<String, String> dictionary2 = new Dictionary<>();
        f49837x1 = dictionary2;
        dictionary2.addItem("visibility", "style.visibility");
        dictionary2.addItem("width", "ppt_w");
        dictionary2.addItem("height", "ppt_h");
        dictionary2.addItem("x", "ppt_x");
        dictionary2.addItem("y", "ppt_y");
        dictionary2.addItem("rotate", "r");
        dictionary2.addItem("skewX", "xshear");
        dictionary2.addItem("skewY", "yshear");
        Dictionary<String, Integer> dictionary3 = new Dictionary<>();
        f49835kk = dictionary3;
        dictionary3.addItem("", 0);
        dictionary3.addItem("blindsWipe", 2);
        dictionary3.addItem("irisWipe-rectangle", 3);
        dictionary3.addItem("checkerBoardWipe", 4);
        dictionary3.addItem("ellipseWipe", 5);
        dictionary3.addItem("irisWipe-diamond", 6);
        dictionary3.addItem("dissolve", 7);
        dictionary3.addItem("fade", 8);
        dictionary3.addItem("fourBoxWipe", 11);
        dictionary3.addItem("randomBarWipe", 12);
        dictionary3.addItem("waterfallWipe", 15);
        dictionary3.addItem("fanWipe", 16);
        dictionary3.addItem("pinWheelWipe", 17);
        dictionary3.addItem("barWipe", 18);
        Dictionary<String, Integer> dictionary4 = new Dictionary<>();
        f49836to = dictionary4;
        dictionary4.addItem("", 0);
        dictionary4.addItem("horizontal", 9);
        dictionary4.addItem("vertical", 26);
        dictionary4.addItem("across", 1);
        dictionary4.addItem("up", 23);
        dictionary4.addItem("down", 2);
        dictionary4.addItem("left", 13);
        dictionary4.addItem("right", 17);
        dictionary4.addItem("cornersIn", 10);
        dictionary4.addItem("cornersOut", 14);
        dictionary4.addItem("horizontalRight", 3);
        dictionary4.addItem("horizontalLeft", 4);
        dictionary4.addItem("verticalRight", 24);
        dictionary4.addItem("verticalLeft", 25);
        dictionary4.addItem("topToBottom", 2);
        dictionary4.addItem("leftToRight", 17);
        dictionary4.addItem("oneBlade", 18);
        dictionary4.addItem("twoBladeHorizontal", 19);
        dictionary4.addItem("twoBladeVertical", 19);
        dictionary4.addItem("fourBlade", 21);
    }

    /* JADX INFO: renamed from: k4 */
    private static String m72855k4(String str) {
        Dictionary.Enumerator<String, String> it = f49837x1.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                str = C14113y2.m67401k4(str, (String) next.getKey(), C14113y2.m67402k4("#{0}", next.getValue()));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m72856k4(IFilterEffect iFilterEffect, cl1 cl1Var, c0z c0zVar) {
        int iIntValue;
        String strM4636x1 = cl1Var.m4636x1();
        if (C14113y2.m67363du("irisWipe", strM4636x1)) {
            C14113y2.m67408k4(strM4636x1, CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR, cl1Var.m4629kk());
        }
        if (wgi.m72731kk(cl1Var.m4636x1())) {
            Dictionary<String, Integer> dictionary = f49835kk;
            if (dictionary.containsKey(cl1Var.m4636x1())) {
                iFilterEffect.setType(dictionary.get_Item(cl1Var.m4636x1()).intValue());
                if (wgi.m72731kk(cl1Var.m4629kk())) {
                    Dictionary<String, Integer> dictionary2 = f49836to;
                    iIntValue = dictionary2.containsKey(cl1Var.m4629kk()) ? dictionary2.get_Item(cl1Var.m4629kk()).intValue() : 0;
                }
                iFilterEffect.setSubtype(iIntValue);
                int iM4637x6 = cl1Var.m4637x6();
                if (iM4637x6 == 1) {
                    iFilterEffect.setReveal(1);
                    return;
                } else if (iM4637x6 != 2) {
                    iFilterEffect.setReveal(-1);
                    return;
                } else {
                    iFilterEffect.setReveal(2);
                    return;
                }
            }
        }
        m72860k4(cl1Var.m4634to(), c0zVar);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m72857k4(IPropertyEffect iPropertyEffect, cl1 cl1Var, c0z c0zVar) {
        Dictionary<String, String> dictionary = f49837x1;
        if (!dictionary.containsKey(cl1Var.m4634to())) {
            m72860k4(cl1Var.m4634to(), c0zVar);
        } else {
            iPropertyEffect.getProperties().addItem(BehaviorProperty.getOrCreateByValue(dictionary.get_Item(cl1Var.m4634to())));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m72858k4(IPropertyEffect iPropertyEffect, C7543ea c7543ea, c0z c0zVar) {
        PointCollection pointCollection = (PointCollection) iPropertyEffect.getPoints();
        String strM72855k4 = m72855k4(wgi.m72731kk(c7543ea.m30846du()) ? c7543ea.m30846du() : "");
        if (c7543ea.m30858to() == null || c7543ea.m30855m9() == null) {
            return;
        }
        String[] strArrM67414k4 = C14113y2.m67414k4(c7543ea.m30858to(), ';');
        String[] strArrM67414k42 = C14113y2.m67414k4(c7543ea.m30855m9(), ';');
        if (strArrM67414k4.length == strArrM67414k42.length) {
            for (int i = 0; i < strArrM67414k4.length; i++) {
                String str = strArrM67414k4[i];
                String str2 = strArrM67414k42[i];
                String strM72855k42 = m72855k4(str);
                float[] fArr = {0.0f};
                boolean zM66713k4 = C14064he.m66713k4(str2, 111, C11697x1.m55250kk(), fArr);
                float f = fArr[0];
                if (zM66713k4) {
                    pointCollection.m2275k4(new Point(f * 100.0f, strM72855k42, strM72855k4));
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m72859k4(ISetEffect iSetEffect, cl1 cl1Var, c0z c0zVar) {
        Dictionary<String, String> dictionary = f49834k4;
        if (dictionary.containsKey(cl1Var.m4623du())) {
            iSetEffect.setTo(dictionary.get_Item(cl1Var.m4623du()));
        } else {
            c0zVar.m4423k4().m72957k4().m69954k4(C14113y2.m67402k4("Unknown \"to\" effect: {0}", cl1Var.m4623du()), 1);
        }
        Dictionary<String, String> dictionary2 = f49837x1;
        if (!dictionary2.containsKey(cl1Var.m4634to())) {
            m72860k4(cl1Var.m4634to(), c0zVar);
        } else {
            iSetEffect.getProperties().addItem(BehaviorProperty.getOrCreateByValue(dictionary2.get_Item(cl1Var.m4634to())));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m72860k4(String str, c0z c0zVar) {
        c0zVar.m4423k4().m72957k4().m69954k4(C14113y2.m67402k4("Unknown effect attribute: {0}", str), 1);
    }
}
