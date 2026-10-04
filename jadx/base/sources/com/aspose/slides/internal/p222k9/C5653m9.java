package com.aspose.slides.internal.p222k9;

import android.text.TextPaint;
import com.aspose.slides.internal.p226kf.InterfaceC5670kk;
import com.aspose.slides.internal.p226kf.InterfaceC5671to;
import java.text.AttributedString;

/* JADX INFO: renamed from: com.aspose.slides.internal.k9.m9 */
/* JADX INFO: loaded from: classes.dex */
public class C5653m9 {

    /* JADX INFO: renamed from: com.aspose.slides.internal.k9.m9$k4 */
    public static class k4 implements InterfaceC5671to {

        /* JADX INFO: renamed from: k4 */
        private final String f15479k4;

        /* JADX INFO: renamed from: x1 */
        private final AttributedString f15480x1;

        private k4(String str, AttributedString attributedString) {
            this.f15479k4 = str;
            this.f15480x1 = attributedString;
        }

        @Override // com.aspose.slides.internal.p226kf.InterfaceC5671to
        /* JADX INFO: renamed from: k4 */
        public InterfaceC5670kk mo23090k4(int i, int i2) {
            return new C5654to(this.f15479k4, this.f15480x1, i, i2);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.k9.m9$x1 */
    public static class x1 implements InterfaceC5671to {

        /* JADX INFO: renamed from: k4 */
        private final String f15481k4;

        /* JADX INFO: renamed from: x1 */
        private final TextPaint f15482x1;

        private x1(String str, TextPaint textPaint) {
            this.f15481k4 = str;
            this.f15482x1 = textPaint;
        }

        @Override // com.aspose.slides.internal.p226kf.InterfaceC5671to
        /* JADX INFO: renamed from: k4 */
        public InterfaceC5670kk mo23090k4(int i, int i2) {
            return new C5650h4(this.f15481k4, i, i2, this.f15482x1);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static InterfaceC5671to m23088k4(String str, TextPaint textPaint) {
        return new x1(str, textPaint);
    }

    /* JADX INFO: renamed from: k4 */
    public static InterfaceC5671to m23089k4(String str, AttributedString attributedString) {
        return new k4(str, attributedString);
    }
}
