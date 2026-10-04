package com.aspose.slides.internal.p404sp;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.sp.c5 */
/* JADX INFO: loaded from: classes4.dex */
public class C10306c5 extends List<Float> {
    /* JADX INFO: renamed from: k4 */
    public static C10306c5 m50260k4(String str) {
        if (C14113y2.m67411k4(str) || C14113y2.m67432to("none", C14113y2.m67440x1(str), (short) 3)) {
            return null;
        }
        String[] strArrM67416k4 = C14113y2.m67416k4(str, new char[]{',', ControlChar.SPACE_CHAR, ControlChar.PARAGRAPH_BREAK_CHAR, '\n', '\t'}, (short) 1);
        C10306c5 c10306c5 = new C10306c5();
        for (String str2 : strArrM67416k4) {
            c10306c5.addItem(Float.valueOf(C10308dy.m50270k4(C14113y2.m67440x1(str2))));
        }
        return c10306c5;
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp();
        Iterator<Float> it = iterator();
        while (it.hasNext()) {
            c6765kp.m26796k4("{0} ", C10308dy.m50272k4(it.next().floatValue()));
        }
        return c6765kp.m26807x1() > 0 ? c6765kp.m26800k4(0, c6765kp.m26807x1() - 1) : C14113y2.f47374k4;
    }
}
