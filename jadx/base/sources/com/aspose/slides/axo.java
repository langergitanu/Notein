package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p294n9.C6765kp;

/* JADX INFO: loaded from: classes3.dex */
abstract class axo {

    /* JADX INFO: renamed from: k4 */
    private final Dictionary<Byte, vbz> f3976k4;

    /* JADX INFO: renamed from: kk */
    private final int f3977kk;

    /* JADX INFO: renamed from: to */
    private final mcc f3978to;

    /* JADX INFO: renamed from: x1 */
    private final int f3979x1;

    public axo(Dictionary<Byte, vbz> dictionary, int i, mcc mccVar) {
        if (dictionary == null) {
            throw new ArgumentNullException("textString");
        }
        this.f3976k4 = dictionary;
        this.f3979x1 = i;
        this.f3977kk = i + 1;
        this.f3978to = mccVar;
    }

    /* JADX INFO: renamed from: c5 */
    public final kup m3784c5() {
        if (m3792to().m64831kk().containsKey(Integer.valueOf(m3786dy()))) {
            int iM5605k4 = m3792to().m64831kk().get_Item(Integer.valueOf(m3786dy())).m5605k4();
            if (m3792to().m64824du().containsKey(Integer.valueOf(iM5605k4))) {
                eng engVar = m3792to().m64824du().get_Item(Integer.valueOf(iM5605k4));
                if (m3792to().m64826h4().containsKey(Integer.valueOf(engVar.m5605k4()))) {
                    return m3792to().m64826h4().get_Item(Integer.valueOf(engVar.m5605k4()));
                }
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: du */
    public String m3785du() {
        kup kupVarM3788jd = m3788jd();
        return kupVarM3788jd != null ? kupVarM3788jd.m64181k4().m72172k4().toString() : "";
    }

    /* JADX INFO: renamed from: dy */
    public final int m3786dy() {
        return this.f3977kk;
    }

    /* JADX INFO: renamed from: h4 */
    public String m3787h4() {
        kup kupVarM3784c5 = m3784c5();
        return kupVarM3784c5 != null ? kupVarM3784c5.m64181k4().m72172k4().toString() : "";
    }

    /* JADX INFO: renamed from: jd */
    public final kup m3788jd() {
        if (!m3792to().m64831kk().containsKey(Integer.valueOf(m3786dy()))) {
            return null;
        }
        eng engVar = m3792to().m64831kk().get_Item(Integer.valueOf(m3786dy()));
        if (m3792to().m64834to().containsKey(Integer.valueOf(engVar.m5605k4()))) {
            return m3792to().m64834to().get_Item(Integer.valueOf(engVar.m5605k4()));
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract String mo3789k4();

    /* JADX INFO: renamed from: kk */
    public final Dictionary<Byte, vbz> m3790kk() {
        return this.f3976k4;
    }

    /* JADX INFO: renamed from: m9 */
    public String m3791m9() {
        C6765kp c6765kp = new C6765kp();
        int iM3786dy = m3786dy();
        if (m3792to().m64833m9().containsKey(Integer.valueOf(iM3786dy))) {
            eng engVar = m3792to().m64833m9().get_Item(Integer.valueOf(iM3786dy));
            if (!m3792to().m64825dy().containsKey(Integer.valueOf(engVar.m5605k4()))) {
                return "";
            }
            c6765kp.m26791k4((Object) m3792to().m64825dy().get_Item(Integer.valueOf(engVar.m5605k4())));
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: to */
    public final mcc m3792to() {
        return this.f3978to;
    }

    /* JADX INFO: renamed from: x1 */
    public final gt8 m3793x1() {
        return new gt8(mo3789k4(), m3787h4(), m3785du(), m3791m9());
    }
}
