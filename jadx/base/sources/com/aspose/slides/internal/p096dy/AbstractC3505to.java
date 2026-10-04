package com.aspose.slides.internal.p096dy;

import com.aspose.slides.Collections.Specialized.OooO00o;
import com.aspose.slides.internal.p056c5.C1950ar;
import com.aspose.slides.internal.p056c5.C1951bv;
import com.aspose.slides.internal.p056c5.C1953ck;
import com.aspose.slides.internal.p056c5.C1954du;
import com.aspose.slides.internal.p056c5.C1955dy;
import com.aspose.slides.internal.p056c5.C1956fa;
import com.aspose.slides.internal.p056c5.C1957h4;
import com.aspose.slides.internal.p056c5.C1958ix;
import com.aspose.slides.internal.p056c5.C1960k4;
import com.aspose.slides.internal.p056c5.C1961kk;
import com.aspose.slides.internal.p056c5.C1962ks;
import com.aspose.slides.internal.p056c5.C1963m9;
import com.aspose.slides.internal.p056c5.C1964ne;
import com.aspose.slides.internal.p056c5.C1965qq;
import com.aspose.slides.internal.p056c5.C1966rv;
import com.aspose.slides.internal.p056c5.C1967to;
import com.aspose.slides.internal.p056c5.C1968u4;
import com.aspose.slides.internal.p056c5.C1969um;
import com.aspose.slides.internal.p056c5.C1970up;
import com.aspose.slides.internal.p056c5.C1971uz;
import com.aspose.slides.internal.p056c5.C1972v4;
import com.aspose.slides.internal.p056c5.C1973wl;
import com.aspose.slides.internal.p056c5.C1974x1;
import com.aspose.slides.internal.p056c5.C1975x6;
import com.aspose.slides.internal.p056c5.C1976yj;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.dy.to */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3505to extends AbstractC3504kk {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f9743kk = new C7017h4("color", "color-index", "monochrome", "grid", "width", "min-width", "max-width", "height", "min-height", "max-height", "device-width", "min-device-width", "max-device-width", "device-height", "min-device-height", "max-device-height", "orientation", "aspect-ratio", "device-aspect-ratio", "min-color", "max-color", "resolution", "min-resolution", "max-resolution", "scan");

    /* JADX INFO: renamed from: k4 */
    private String f9744k4;

    /* JADX INFO: renamed from: x1 */
    private AbstractC5788h4 f9745x1;

    public AbstractC3505to(String str) {
        this.f9744k4 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC3505to m14060k4(String str) {
        int iM27428k4 = f9743kk.m27428k4(C14113y2.m67368h4(str));
        if (iM27428k4 == 0) {
            return new C1974x1(str);
        }
        if (iM27428k4 == 1) {
            return new C1961kk(str);
        }
        if (iM27428k4 == 2) {
            return new C1965qq(str);
        }
        if (iM27428k4 != 3) {
            return null;
        }
        return new C1963m9(str);
    }

    public AbstractC3505to(String str, AbstractC5788h4 abstractC5788h4) {
        this(str);
        this.f9745x1 = abstractC5788h4;
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC3505to m14061k4(String str, AbstractC5788h4 abstractC5788h4) {
        switch (f9743kk.m27428k4(C14113y2.m67368h4(str))) {
            case 0:
                return new C1974x1(str, abstractC5788h4);
            case 1:
                return new C1961kk(str, abstractC5788h4);
            case 2:
                return new C1965qq(str, abstractC5788h4);
            case 3:
                return new C1963m9(str, abstractC5788h4);
            case 4:
                return new C1972v4(str, abstractC5788h4);
            case 5:
                return new C1973wl(str, abstractC5788h4);
            case 6:
                return new C1966rv(str, abstractC5788h4);
            case 7:
                return new C1955dy(str, abstractC5788h4);
            case 8:
                return new C1968u4(str, abstractC5788h4);
            case 9:
                return new C1976yj(str, abstractC5788h4);
            case 10:
                return new C1957h4(str, abstractC5788h4);
            case 11:
                return new C1958ix(str, abstractC5788h4);
            case 12:
                return new C1970up(str, abstractC5788h4);
            case 13:
                return new C1954du(str, abstractC5788h4);
            case 14:
                return new C1964ne(str, abstractC5788h4);
            case 15:
                return new C1956fa(str, abstractC5788h4);
            case 16:
                return new C1950ar(str, abstractC5788h4);
            case 17:
                return new C1960k4(str, abstractC5788h4);
            case 18:
                return new C1967to(str, abstractC5788h4);
            case 19:
                return new C1975x6(str, abstractC5788h4);
            case 20:
                return new C1953ck(str, abstractC5788h4);
            case 21:
                return new C1969um(str, abstractC5788h4);
            case 22:
                return new C1971uz(str, abstractC5788h4);
            case 23:
                return new C1962ks(str, abstractC5788h4);
            case 24:
                return new C1951bv(str, abstractC5788h4);
            default:
                return null;
        }
    }

    @Override // com.aspose.slides.internal.p096dy.InterfaceC3506x1
    /* JADX INFO: renamed from: k4 */
    public String mo14058k4() {
        C6765kp c6765kpOooO00o = OooO00o.OooO00o("(");
        c6765kpOooO00o.m26792k4(this.f9744k4);
        AbstractC5788h4 abstractC5788h4 = this.f9745x1;
        if (abstractC5788h4 != null) {
            c6765kpOooO00o.m26796k4(": {0}", abstractC5788h4.mo23414h4());
        }
        c6765kpOooO00o.m26792k4(")");
        return c6765kpOooO00o.toString();
    }
}
