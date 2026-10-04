package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.ArgumentNullException;

/* JADX INFO: loaded from: classes3.dex */
class c0z {

    /* JADX INFO: renamed from: k4 */
    private final wxb f4272k4;

    public c0z(wxb wxbVar) {
        if (wxbVar == null) {
            throw new ArgumentNullException("stylesContext");
        }
        this.f4272k4 = wxbVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final wxb m4423k4() {
        return this.f4272k4;
    }

    /* JADX INFO: renamed from: kk */
    public final Dictionary<String, Paragraph> m4424kk() {
        return this.f4272k4.m72955dy();
    }

    /* JADX INFO: renamed from: x1 */
    public final Dictionary<String, Shape> m4425x1() {
        return this.f4272k4.m72959m9();
    }
}
