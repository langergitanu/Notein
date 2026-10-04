package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;

/* JADX INFO: loaded from: classes3.dex */
class kup {

    /* JADX INFO: renamed from: k4 */
    private vbz f45878k4;

    /* JADX INFO: renamed from: x1 */
    private List<jrz> f45879x1;

    public kup() {
        this.f45878k4 = new vbz();
    }

    /* JADX INFO: renamed from: k4 */
    public final vbz m64181k4() {
        return this.f45878k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final List<jrz> m64183x1() {
        return this.f45879x1;
    }

    public kup(vbz vbzVar) {
        if (vbzVar == null) {
            throw new ArgumentNullException("textResult");
        }
        this.f45878k4 = vbzVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64182k4(List<jrz> list) {
        this.f45879x1 = list;
    }
}
