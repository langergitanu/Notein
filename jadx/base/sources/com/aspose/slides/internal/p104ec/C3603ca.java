package com.aspose.slides.internal.p104ec;

import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.C3144um;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;

/* JADX INFO: renamed from: com.aspose.slides.internal.ec.ca */
/* JADX INFO: loaded from: classes3.dex */
class C3603ca {
    /* JADX INFO: renamed from: k4 */
    public static KeyValuePair<String, String> m14703k4(C3144um c3144um) {
        if (c3144um == null) {
            throw new ArgumentNullException("reader");
        }
        String strM67423kk = C14113y2.m67423kk(c3144um.mo13429m9(), '\n', ControlChar.PARAGRAPH_BREAK_CHAR, ControlChar.SPACE_CHAR);
        if (C14113y2.m67411k4(strM67423kk)) {
            String str = C14113y2.f47374k4;
            return new KeyValuePair<>(str, str);
        }
        String[] strArrM67369h4 = C14113y2.m67369h4(strM67423kk, '=');
        if (strArrM67369h4.length == 2) {
            return new KeyValuePair<>(strArrM67369h4[0], strArrM67369h4[1]);
        }
        throw new InvalidOperationException();
    }
}
