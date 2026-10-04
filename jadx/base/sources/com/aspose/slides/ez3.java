package com.aspose.slides;

import com.aspose.slides.internal.p332p7.C7399cd;
import com.aspose.slides.internal.p332p7.C7801gu;
import com.aspose.slides.internal.p332p7.C7840hf;
import com.aspose.slides.internal.p332p7.C8479ow;
import com.aspose.slides.internal.p332p7.C9195xg;
import com.aspose.slides.internal.p332p7.C9229xr;

/* JADX INFO: loaded from: classes3.dex */
class ez3 extends wsu {
    public ez3(C9229xr c9229xr) {
    }

    /* JADX INFO: renamed from: kk */
    private C9229xr m5785kk() {
        return (C9229xr) m72921ne();
    }

    /* JADX INFO: renamed from: k4 */
    public String m5786k4(int i) {
        return m5784k4(m5785kk(), i);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m5784k4(C9229xr c9229xr, int i) {
        if (c9229xr == null) {
            return null;
        }
        if (c9229xr.m44606jd() != null && i == 1) {
            return C7840hf.m33309k4(c9229xr.m44606jd().m35941k4());
        }
        if (c9229xr.m44601c5() != null && i == 2) {
            return C8479ow.m38491k4(c9229xr.m44601c5().m31991k4());
        }
        if (c9229xr.m44605h4() != null && i == 3) {
            return c9229xr.m44605h4().m41371k4() ? "1" : "0";
        }
        if (c9229xr.m44610to() != null && i == 4) {
            return c9229xr.m44610to().toString();
        }
        if (c9229xr.m44603du() != null && i == 5) {
            return c9229xr.m44603du().toString();
        }
        if (c9229xr.m44609m9() != null && i == 6) {
            return C7801gu.m32926k4(c9229xr.m44609m9().m30246k4());
        }
        if (c9229xr.m44604dy() != null && i == 7) {
            return C7399cd.m29566k4(c9229xr.m44604dy().m42591k4());
        }
        if (c9229xr.m44608kk() != null && i == 8) {
            return c9229xr.m44608kk().m34607k4() ? "1" : "0";
        }
        if (c9229xr.m44602ck() == null || i != 9) {
            return null;
        }
        return C9195xg.m44336k4(c9229xr.m44602ck().m28958k4());
    }
}
