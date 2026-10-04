package com.aspose.slides;

import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p407st.C10499jv;
import com.aspose.slides.internal.p407st.C10641ss;
import com.aspose.slides.internal.p407st.C10659tx;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class nmb {
    /* JADX INFO: renamed from: k4 */
    private static int m68088k4(Audio audio, C10499jv c10499jv) {
        int iM68090k4 = m68090k4(c10499jv);
        C10659tx c10659tx = new C10659tx();
        c10499jv.m50513yj().addItem(c10659tx);
        String strM72978k4 = audio.m255k4().m72978k4();
        if (strM72978k4 == null) {
            strM72978k4 = C14113y2.f47374k4;
        }
        c10659tx.m51788x1().m51658k4(strM72978k4);
        String strM13397du = C3141rv.m13397du(audio.m255k4().m72978k4());
        if (strM13397du == null) {
            strM13397du = C14113y2.f47374k4;
        }
        if (C14113y2.m67432to(strM13397du, ".wav", (short) 5) || C14113y2.m67432to(strM13397du, ".aif", (short) 5)) {
            c10659tx.m51787to().m51658k4(strM13397du);
        } else {
            c10659tx.m51787to().m51658k4("wave");
        }
        c10659tx.m51785k4(iM68090k4);
        c10659tx.m51784h4().m52101k4(audio.getBinaryData());
        return iM68090k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m68089k4(IAudio iAudio, y2n y2nVar) {
        Integer[] numArr = {0};
        Audio audio = (Audio) iAudio;
        boolean zTryGetValue = y2nVar.m73726v4().tryGetValue(Long.valueOf(audio.m257kk()), numArr);
        int iIntValue = numArr[0].intValue();
        if (zTryGetValue) {
            return iIntValue;
        }
        int iM68088k4 = m68088k4(audio, m68091k4(y2nVar));
        y2nVar.m73726v4().addItem(Long.valueOf(audio.m257kk()), Integer.valueOf(iM68088k4));
        return iM68088k4;
    }

    /* JADX INFO: renamed from: k4 */
    private static int m68090k4(C10499jv c10499jv) {
        int iM51279x1 = c10499jv.m51044x1().m51279x1() + 1;
        c10499jv.m51044x1().m51278k4(iM51279x1);
        return iM51279x1;
    }

    /* JADX INFO: renamed from: k4 */
    private static C10499jv m68091k4(y2n y2nVar) {
        C10641ss c10641ssM50965m9 = y2nVar.m71954x1().m51483du().m50965m9();
        C10499jv c10499jvM51705jd = c10641ssM50965m9.m51705jd();
        if (c10499jvM51705jd != null) {
            return c10499jvM51705jd;
        }
        C10499jv c10499jv = new C10499jv();
        c10499jv.m51044x1().m51278k4(0);
        c10641ssM50965m9.m50507k4(c10499jv);
        return c10499jv;
    }
}
