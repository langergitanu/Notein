package com.aspose.slides.internal.p222k9;

import android.graphics.Paint;
import android.text.TextPaint;
import com.aspose.slides.internal.p226kf.InterfaceC5669k4;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.p559ms.backend.android.System.Drawing.C14137to;

/* JADX INFO: renamed from: com.aspose.slides.internal.k9.x1 */
/* JADX INFO: loaded from: classes.dex */
public class C5655x1 implements InterfaceC5669k4 {

    /* JADX INFO: renamed from: k4 */
    private final C11913yj f15488k4;

    /* JADX INFO: renamed from: x1 */
    private final TextPaint f15489x1;

    public C5655x1(C5655x1 c5655x1, boolean z, boolean z2) {
        this(c5655x1.m23092x1(), z, z2);
        this.f15489x1.set(c5655x1.f15489x1);
    }

    /* JADX INFO: renamed from: k4 */
    public TextPaint m23091k4() {
        return this.f15489x1;
    }

    /* JADX INFO: renamed from: x1 */
    public C11913yj m23092x1() {
        return this.f15488k4;
    }

    public C5655x1(C11913yj c11913yj, boolean z, boolean z2) {
        this.f15488k4 = c11913yj != null ? c11913yj.m55760h4() : new C11913yj();
        TextPaint textPaint = new TextPaint();
        this.f15489x1 = textPaint;
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setAntiAlias(z);
        textPaint.setSubpixelText(z2);
    }

    public C5655x1(C14137to c14137to) {
        this.f15488k4 = new C11913yj();
        TextPaint textPaint = new TextPaint();
        this.f15489x1 = textPaint;
        textPaint.set(c14137to.m67687dy());
        textPaint.setAntiAlias(c14137to.m67686c5());
        textPaint.setSubpixelText(c14137to.m67688jd());
        textPaint.setStyle(Paint.Style.FILL);
    }
}
