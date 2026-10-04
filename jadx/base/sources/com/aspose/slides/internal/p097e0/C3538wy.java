package com.aspose.slides.internal.p097e0;

import com.aspose.slides.internal.p051bz.C1921qq;
import com.aspose.slides.internal.p057c6.C1982jd;
import com.aspose.slides.internal.p150gi.AbstractC4275gi;
import com.aspose.slides.internal.p150gi.AbstractC4282kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p380ri.C10017to;
import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C14010x0;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.internal.e0.wy */
/* JADX INFO: loaded from: classes3.dex */
public class C3538wy extends AbstractC4282kp {

    /* JADX INFO: renamed from: k4 */
    private C14062gk f9878k4;

    /* JADX INFO: renamed from: com.aspose.slides.internal.e0.wy$k4 */
    public static class k4 extends AbstractC4275gi implements Cloneable {
        public k4(int i) {
            super(i);
        }

        @Override // com.aspose.slides.internal.p150gi.AbstractC4275gi
        /* JADX INFO: renamed from: k4 */
        public AbstractC4282kp mo14415k4(AbstractC3533um abstractC3533um, String str, AbstractC3524ks abstractC3524ks) {
            boolean z = false;
            if (C12380dy.m57970k4(str, "(?s)^(url\\(('|\")?)?data:.*$").mo58006to()) {
                return new C3538wy(str, z);
            }
            try {
                String strM10112x1 = C1982jd.m10112x1(str);
                C3538wy c3538wy = (C3538wy) abstractC3533um.mo14063k4(StyleIdentifier.GRID_TABLE_3, true, false);
                if (c3538wy != null) {
                    C3538wy c3538wy2 = new C3538wy(new C14010x0().mo65674k4(c3538wy.f9878k4, strM10112x1));
                    c3538wy2.m17253k4(str);
                    return c3538wy2;
                }
                if (this.f11665k4 != 275) {
                    return new C3538wy(str, z);
                }
                C3538wy c3538wy3 = new C3538wy(new C14062gk(strM10112x1));
                c3538wy3.m17253k4(str);
                return c3538wy3;
            } catch (RuntimeException unused) {
                throw new C1921qq("Invalid URI specified");
            }
        }
    }

    public C3538wy(C14062gk c14062gk) {
        this.f9878k4 = c14062gk;
    }

    public boolean equals(Object obj) {
        if (obj == null || !C7019kk.m27469x1(obj, C3538wy.class)) {
            return false;
        }
        C3538wy c3538wy = (C3538wy) obj;
        return C10017to.m49170k4(m17254ks(), c3538wy.m17254ks()) && C10017to.m49170k4(this.f9878k4, c3538wy.f9878k4);
    }

    public int hashCode() {
        return C10017to.m49168k4(this.f9878k4) + ((C10017to.m49168k4(m17254ks()) + 31) * 31);
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4282kp
    /* JADX INFO: renamed from: j_ */
    public String mo9926j_() {
        C14062gk c14062gk = this.f9878k4;
        return c14062gk == null ? m17254ks() : c14062gk.toString();
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4282kp
    public String toString() {
        return mo9926j_();
    }

    private C3538wy(String str, boolean z) {
        if (!z || C14113y2.m67411k4(str)) {
            m17253k4(str);
        } else {
            this.f9878k4 = new C14062gk(str);
        }
    }
}
