package com.aspose.slides.internal.p365qn;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p420th.C10948ar;
import com.aspose.slides.internal.p420th.C10951c5;
import com.aspose.slides.internal.p420th.C10971um;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.p559ms.System.C14113y2;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.domain.models.backup.BackupFile;

/* JADX INFO: renamed from: com.aspose.slides.internal.qn.m9 */
/* JADX INFO: loaded from: classes4.dex */
public class C9899m9 {

    /* JADX INFO: renamed from: k4 */
    private float f35752k4 = 96.0f;

    /* JADX INFO: renamed from: kk */
    private float f35753kk;

    /* JADX INFO: renamed from: x1 */
    private float f35754x1;

    public C9899m9() {
    }

    /* JADX INFO: renamed from: k4 */
    private static int m48746k4(double d, String str, float f) {
        double d2;
        if (C14113y2.m67363du("px", str)) {
            d2 = f * 1000.0f;
        } else if (C14113y2.m67363du(BackupFile.EXTENSION_NOTEIN_FILE, str)) {
            d2 = 72000.0d;
        } else if (C14113y2.m67363du("cm", str)) {
            d2 = 28346.4567d;
        } else if (C14113y2.m67363du("mm", str)) {
            d2 = 2834.64567d;
        } else if (C14113y2.m67363du(TranslateLanguage.PORTUGUESE, str)) {
            d2 = 1000.0d;
        } else {
            if (!C14113y2.m67363du("pc", str)) {
                if (!C14113y2.m67363du("mpt", str)) {
                    d = 0.0d;
                }
                return C7019kk.m27462to(Double.valueOf(d), 14);
            }
            d2 = 12000.0d;
        }
        d *= d2;
        return C7019kk.m27462to(Double.valueOf(d), 14);
    }

    public C9899m9(C9901x1 c9901x1) {
        float fM48721x1 = m48747k4(c9901x1.m48761k4().m48713k4()).m48721x1();
        this.f35754x1 = fM48721x1;
        this.f35754x1 = fM48721x1 - m48747k4(c9901x1.m48765x1().m48753to()).m48721x1();
        this.f35753kk = m48747k4(c9901x1.m48765x1().m48753to()).m48721x1();
    }

    /* JADX INFO: renamed from: k4 */
    public final C9894du m48747k4(C9894du c9894du) {
        return new C9894du(m48746k4(c9894du.m48721x1(), C9894du.m48717x1(c9894du.m48718k4()), 72.0f / this.f35752k4) / 1000.0f, 4);
    }

    /* JADX INFO: renamed from: k4 */
    public final C10948ar[] m48748k4(C10948ar[] c10948arArr) {
        for (int i = 0; i < c10948arArr.length; i++) {
            C10948ar c10948ar = c10948arArr[i];
            C10948ar c10948ar2 = new C10948ar(c10948ar.m52873k4().Clone(), c10948ar.m52872h4());
            C10951c5 c10951c5 = new C10951c5();
            c10951c5.m52907k4(C10971um.m53087k4(new C12007ix(this.f35753kk - 1.0f, 0.0f, this.f35754x1 + 2.0f, c10948ar.m52874kk())));
            for (int i2 = 0; i2 < c10948ar.m52927c5(); i2++) {
                c10951c5.m52930k4(c10948ar.m52931k4(i2));
            }
            c10948ar2.m52930k4(c10951c5);
            c10948arArr[i] = c10948ar2;
        }
        return c10948arArr;
    }
}
