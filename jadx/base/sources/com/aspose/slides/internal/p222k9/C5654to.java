package com.aspose.slides.internal.p222k9;

import android.graphics.Path;
import android.text.TextPaint;
import com.aspose.slides.internal.p031aw.InterfaceC1565x1;
import com.aspose.slides.internal.p226kf.InterfaceC5670kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.p559ms.backend.System.Drawing.InterfaceC14122k4;
import com.aspose.slides.p559ms.backend.android.System.Drawing.C14137to;
import java.text.AttributedCharacterIterator;
import java.text.AttributedString;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.k9.to */
/* JADX INFO: loaded from: classes.dex */
public class C5654to implements InterfaceC5670kk {

    /* JADX INFO: renamed from: k4 */
    private final String f15483k4;

    /* JADX INFO: renamed from: x1 */
    private List<k4> f15484x1 = new ArrayList();

    /* JADX INFO: renamed from: com.aspose.slides.internal.k9.to$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        public int f15485k4;

        /* JADX INFO: renamed from: kk */
        public TextPaint f15486kk;

        /* JADX INFO: renamed from: x1 */
        public int f15487x1;

        public k4(int i, int i2, TextPaint textPaint) {
            this.f15485k4 = i;
            this.f15487x1 = i2;
            this.f15486kk = textPaint;
        }
    }

    public C5654to(String str, AttributedString attributedString, int i, int i2) {
        this.f15483k4 = str;
        AttributedCharacterIterator iterator = attributedString.getIterator();
        char cFirst = iterator.first();
        TextPaint textPaint = null;
        int i3 = i;
        while (cFirst != 65535) {
            TextPaint textPaint2 = (TextPaint) iterator.getAttribute(C5649du.f15469k4);
            if (textPaint == null) {
                textPaint = textPaint2;
            } else if (textPaint2 != textPaint) {
                this.f15484x1.add(new k4(i, i3, textPaint));
                textPaint = textPaint2;
                i = i3;
            }
            cFirst = iterator.next();
            i3++;
        }
        if (i != i2) {
            this.f15484x1.add(new k4(i, i3, textPaint));
        }
    }

    @Override // com.aspose.slides.internal.p226kf.InterfaceC5670kk
    /* JADX INFO: renamed from: k4 */
    public float mo23078k4() {
        float fMeasureText = 0.0f;
        for (k4 k4Var : this.f15484x1) {
            fMeasureText += k4Var.f15486kk.measureText(this.f15483k4, k4Var.f15485k4, k4Var.f15487x1);
        }
        return fMeasureText;
    }

    @Override // com.aspose.slides.internal.p226kf.InterfaceC5670kk
    /* JADX INFO: renamed from: k4 */
    public InterfaceC1565x1 mo23079k4(C11913yj c11913yj) {
        Path path = new Path();
        float fMeasureText = 0.0f;
        for (k4 k4Var : this.f15484x1) {
            Path path2 = new Path();
            k4Var.f15486kk.getTextPath(this.f15483k4, k4Var.f15485k4, k4Var.f15487x1, fMeasureText, 0.0f, path2);
            path.addPath(path2);
            fMeasureText += k4Var.f15486kk.measureText(this.f15483k4, k4Var.f15485k4, k4Var.f15487x1);
        }
        C11896dy c11896dyM55504k4 = C11896dy.m55504k4(path);
        c11896dyM55504k4.m55577x1(c11913yj);
        return c11896dyM55504k4.m55568ne();
    }

    @Override // com.aspose.slides.internal.p226kf.InterfaceC5670kk
    /* JADX INFO: renamed from: k4 */
    public void mo23080k4(InterfaceC14122k4 interfaceC14122k4, float f, float f2) {
        C14137to c14137to = (C14137to) interfaceC14122k4;
        float fMeasureText = 0.0f;
        for (k4 k4Var : this.f15484x1) {
            float f3 = f2;
            c14137to.m67689k4(this.f15483k4, k4Var.f15485k4, k4Var.f15487x1, f + fMeasureText, f3, k4Var.f15486kk);
            fMeasureText += k4Var.f15486kk.measureText(this.f15483k4, k4Var.f15485k4, k4Var.f15487x1);
            f2 = f3;
        }
    }
}
