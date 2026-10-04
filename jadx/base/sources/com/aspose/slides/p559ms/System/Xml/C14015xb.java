package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.exceptions.XmlException;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.xb */
/* JADX INFO: loaded from: classes5.dex */
public class C14015xb {

    /* JADX INFO: renamed from: c5 */
    private String f47071c5;

    /* JADX INFO: renamed from: du */
    private String f47072du;

    /* JADX INFO: renamed from: dy */
    private int f47073dy;

    /* JADX INFO: renamed from: h4 */
    private String f47074h4;

    /* JADX INFO: renamed from: jd */
    private AbstractC6747ar f47075jd;

    /* JADX INFO: renamed from: k4 */
    private AbstractC13883dt f47076k4;

    /* JADX INFO: renamed from: kk */
    private String f47077kk;

    /* JADX INFO: renamed from: m9 */
    private String f47078m9;

    /* JADX INFO: renamed from: to */
    private String f47079to;

    /* JADX INFO: renamed from: x1 */
    private C13950o3 f47080x1;

    public C14015xb(AbstractC13883dt abstractC13883dt, C13950o3 c13950o3, String str, int i) {
        this(abstractC13883dt, c13950o3, null, null, null, null, C14113y2.f47374k4, str, i);
    }

    /* JADX INFO: renamed from: c5 */
    public final int m66296c5() {
        return this.f47073dy;
    }

    /* JADX INFO: renamed from: ck */
    public final boolean m66297ck() {
        return (C14113y2.m67363du(this.f47074h4, C14113y2.f47374k4) && C14113y2.m67363du(this.f47079to, C14113y2.f47374k4) && C14113y2.m67363du(this.f47072du, C14113y2.f47374k4)) ? false : true;
    }

    /* JADX INFO: renamed from: du */
    public final String m66298du() {
        return this.f47072du;
    }

    /* JADX INFO: renamed from: dy */
    public final String m66299dy() {
        return this.f47078m9;
    }

    /* JADX INFO: renamed from: h4 */
    public final String m66300h4() {
        return this.f47071c5;
    }

    /* JADX INFO: renamed from: jd */
    public final AbstractC6747ar m66301jd() {
        return this.f47075jd;
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC13883dt m66302k4() {
        return this.f47076k4;
    }

    /* JADX INFO: renamed from: kk */
    public final String m66303kk() {
        return this.f47077kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final String m66304m9() {
        return this.f47074h4;
    }

    /* JADX INFO: renamed from: to */
    public final String m66305to() {
        return this.f47079to;
    }

    /* JADX INFO: renamed from: x1 */
    public final C13950o3 m66306x1() {
        return this.f47080x1;
    }

    public C14015xb(AbstractC13883dt abstractC13883dt, C13950o3 c13950o3, String str, String str2, String str3, String str4, String str5, String str6, int i) {
        this(abstractC13883dt, c13950o3, str, str2, str3, str4, str5, str6, i, null);
    }

    public C14015xb(AbstractC13883dt abstractC13883dt, C13950o3 c13950o3, String str, String str2, String str3, String str4, String str5, String str6, int i, AbstractC6747ar abstractC6747ar) {
        this.f47076k4 = null;
        this.f47080x1 = null;
        String str7 = C14113y2.f47374k4;
        this.f47077kk = str7;
        this.f47079to = str7;
        this.f47072du = str7;
        this.f47074h4 = str7;
        this.f47078m9 = str7;
        this.f47071c5 = str7;
        this.f47075jd = null;
        if (c13950o3 != null) {
            if (abstractC13883dt == null) {
                abstractC13883dt = c13950o3.m65706k4();
            } else if (abstractC13883dt != c13950o3.m65706k4()) {
                throw new XmlException("Not the same name table.", C14113y2.f47374k4);
            }
        }
        this.f47076k4 = abstractC13883dt;
        this.f47080x1 = c13950o3;
        this.f47077kk = str == null ? C14113y2.f47374k4 : str;
        this.f47079to = str2 == null ? C14113y2.f47374k4 : str2;
        this.f47072du = str3 == null ? C14113y2.f47374k4 : str3;
        this.f47074h4 = str4 == null ? C14113y2.f47374k4 : str4;
        this.f47071c5 = str5 == null ? C14113y2.f47374k4 : str5;
        this.f47078m9 = str6 == null ? C14113y2.f47374k4 : str6;
        this.f47073dy = i;
        this.f47075jd = abstractC6747ar;
    }
}
