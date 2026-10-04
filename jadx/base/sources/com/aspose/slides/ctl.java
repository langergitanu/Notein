package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.AbstractC10456gv;
import com.aspose.slides.internal.p407st.C10467hj;
import com.aspose.slides.internal.p407st.C10626rv;
import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class ctl {
    /* JADX INFO: renamed from: k4 */
    public static void m4807k4(ITagCollection iTagCollection, AbstractC10456gv abstractC10456gv) {
        String str;
        if (abstractC10456gv == null) {
            return;
        }
        for (C10467hj c10467hj : abstractC10456gv.m50855dy()) {
            String str2 = "";
            if (c10467hj.m50897x1() == null || c10467hj.m50896to() == null) {
                str = "";
            } else {
                String strM51659x1 = c10467hj.m50897x1().m51659x1();
                boolean zM67411k4 = C14113y2.m67411k4(c10467hj.m50896to().m51659x1());
                String strM51659x12 = c10467hj.m50896to().m51659x1();
                if (!zM67411k4) {
                    strM51659x12 = C12380dy.m57972k4(strM51659x12, "[\\u0000-\\u0008\\u000B\\u000C\\u000E-\\u001F]", "");
                }
                str = strM51659x12;
                str2 = strM51659x1;
            }
            if (str2.length() > 0) {
                iTagCollection.add(C14113y2.m67358c5(str2), str);
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static void m4808x1(ITagCollection iTagCollection, AbstractC10456gv abstractC10456gv) {
        if (iTagCollection == null) {
            return;
        }
        IGenericEnumerator<KeyValuePair<String, String>> it = iTagCollection.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair<String, String> next = it.next();
                C10467hj c10467hj = new C10467hj();
                abstractC10456gv.m50513yj().addItem(c10467hj);
                c10467hj.m50513yj().addItem(new C10626rv(next.getKey(), (short) 0));
                c10467hj.m50513yj().addItem(new C10626rv(next.getValue(), (short) 1));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }
}
