package com.aspose.slides.internal.p222k9;

import android.graphics.Path;
import android.text.TextPaint;
import com.aspose.slides.internal.p031aw.InterfaceC1565x1;
import com.aspose.slides.internal.p226kf.InterfaceC5670kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.p559ms.backend.System.Drawing.InterfaceC14122k4;
import com.aspose.slides.p559ms.backend.android.System.Drawing.C14137to;

/* JADX INFO: renamed from: com.aspose.slides.internal.k9.h4 */
/* JADX INFO: loaded from: classes.dex */
public class C5650h4 implements InterfaceC5670kk {

    /* JADX INFO: renamed from: k4 */
    private String f15470k4;

    /* JADX INFO: renamed from: kk */
    private int f15471kk;

    /* JADX INFO: renamed from: to */
    private final TextPaint f15472to;

    /* JADX INFO: renamed from: x1 */
    private int f15473x1;

    public C5650h4(String str, int i, int i2, TextPaint textPaint) {
        this.f15470k4 = str;
        this.f15473x1 = i;
        this.f15471kk = i2;
        this.f15472to = textPaint;
    }

    @Override // com.aspose.slides.internal.p226kf.InterfaceC5670kk
    /* JADX INFO: renamed from: k4 */
    public float mo23078k4() {
        return this.f15472to.measureText(this.f15470k4, this.f15473x1, this.f15471kk);
    }

    @Override // com.aspose.slides.internal.p226kf.InterfaceC5670kk
    /* JADX INFO: renamed from: k4 */
    public InterfaceC1565x1 mo23079k4(C11913yj c11913yj) {
        Path path = new Path();
        this.f15472to.getTextPath(this.f15470k4, this.f15473x1, this.f15471kk, 0.0f, 0.0f, path);
        C11896dy c11896dyM55504k4 = C11896dy.m55504k4(path);
        c11896dyM55504k4.m55577x1(c11913yj);
        return c11896dyM55504k4.m55568ne();
    }

    @Override // com.aspose.slides.internal.p226kf.InterfaceC5670kk
    /* JADX INFO: renamed from: k4 */
    public void mo23080k4(InterfaceC14122k4 interfaceC14122k4, float f, float f2) {
        ((C14137to) interfaceC14122k4).m67689k4(this.f15470k4, this.f15473x1, this.f15471kk, f, f2, this.f15472to);
    }
}
