package com.aspose.slides.internal.p404sp;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p136fr.C4113k4;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.sp.h4 */
/* JADX INFO: loaded from: classes4.dex */
public class C10309h4 extends List<C10307du> {
    public C10309h4() {
    }

    /* JADX INFO: renamed from: k4 */
    public static C10309h4 m50273k4(String str) {
        if (C14113y2.m67411k4(str) || C14113y2.m67432to("none", C14113y2.m67440x1(str), (short) 3)) {
            return new C10309h4();
        }
        String[] strArrM67416k4 = C14113y2.m67416k4(str, new char[]{',', ControlChar.SPACE_CHAR, ControlChar.PARAGRAPH_BREAK_CHAR, '\n', '\t'}, (short) 1);
        C10309h4 c10309h4 = new C10309h4();
        for (String str2 : strArrM67416k4) {
            try {
                c10309h4.addItem(C10307du.m50261k4(C14113y2.m67440x1(str2)));
            } catch (RuntimeException e) {
                if (!C4113k4.f11284k4) {
                    throw e;
                }
            }
        }
        return c10309h4;
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp();
        Iterator<C10307du> it = iterator();
        while (it.hasNext()) {
            c6765kp.m26796k4("{0}, ", it.next());
        }
        return c6765kp.m26807x1() > 0 ? c6765kp.m26800k4(0, c6765kp.m26807x1() - 2) : C14113y2.f47374k4;
    }

    public C10309h4(C10307du c10307du) {
        addItem(c10307du);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m50274k4(C10309h4 c10309h4) {
        return c10309h4 == null || c10309h4.size() < 1;
    }
}
