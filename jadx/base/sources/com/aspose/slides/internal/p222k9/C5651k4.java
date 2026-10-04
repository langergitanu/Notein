package com.aspose.slides.internal.p222k9;

import android.text.TextPaint;
import com.aspose.slides.internal.p373qy.InterfaceC9964k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.k9.k4 */
/* JADX INFO: loaded from: classes.dex */
public class C5651k4 implements InterfaceC9964k4 {

    /* JADX INFO: renamed from: k4 */
    private final String f15474k4;

    /* JADX INFO: renamed from: x1 */
    private TextPaint f15475x1;

    public C5651k4(String str, TextPaint textPaint) {
        this.f15474k4 = str;
        this.f15475x1 = textPaint;
    }

    @Override // com.aspose.slides.internal.p373qy.InterfaceC9964k4
    /* JADX INFO: renamed from: k4 */
    public float mo23081k4(int i, int i2) {
        if (i < i2) {
            return this.f15475x1.measureText(this.f15474k4, i, i2);
        }
        return 0.0f;
    }

    @Override // com.aspose.slides.internal.p373qy.InterfaceC9964k4
    /* JADX INFO: renamed from: k4 */
    public int mo23082k4(int i, float f) {
        TextPaint textPaint = this.f15475x1;
        String str = this.f15474k4;
        return textPaint.breakText(str, i, str.length(), true, f, null);
    }
}
