package com.aspose.slides.internal.p549zg;

import android.graphics.Typeface;
import android.text.TextPaint;
import com.aspose.slides.internal.p167hh.AbstractC4584k4;
import com.aspose.slides.internal.p167hh.C4582du;
import com.aspose.slides.internal.p167hh.C4585kk;
import com.aspose.slides.internal.p347px.AbstractC9608yj;
import com.aspose.slides.internal.p347px.C9579bv;
import com.aspose.slides.p559ms.backend.System.Drawing.GraphicsEnv;
import com.aspose.slides.p559ms.backend.android.System.Drawing.C14134kk;
import java.util.Objects;

/* JADX INFO: renamed from: com.aspose.slides.internal.zg.k4 */
/* JADX INFO: loaded from: classes5.dex */
public class C13589k4 extends C4585kk {

    /* JADX INFO: renamed from: c5 */
    private Typeface f45143c5;

    public C13589k4(C4582du c4582du, C9579bv c9579bv) {
        super(c4582du, c9579bv);
    }

    /* JADX INFO: renamed from: fa */
    private Typeface m62701fa() {
        if (this.f45143c5 == null) {
            this.f45143c5 = ((C14134kk) GraphicsEnv.m67573du()).m67672k4(this.f12797k4, this.f12799to);
        }
        return this.f45143c5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C13589k4 c13589k4 = (C13589k4) obj;
            if (this.f12799to == c13589k4.f12799to && Float.compare(c13589k4.f12798kk, this.f12798kk) == 0 && Objects.equals(this.f12800x1, c13589k4.f12800x1) && Objects.equals(this.f12797k4, c13589k4.f12797k4)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f12797k4, this.f12800x1, Float.valueOf(this.f12798kk), Integer.valueOf(this.f12799to));
    }

    /* JADX INFO: renamed from: k4 */
    public TextPaint m62702k4(TextPaint textPaint) {
        TextPaint textPaint2 = new TextPaint(textPaint);
        textPaint2.setTextSize(this.f12798kk);
        textPaint2.setTypeface(m62701fa());
        textPaint2.setStrikeThruText(m18935m9());
        textPaint2.setUnderlineText(m18925dy());
        return textPaint2;
    }

    @Override // com.aspose.slides.internal.p167hh.C4585kk, com.aspose.slides.internal.p167hh.C4586to, com.aspose.slides.internal.p167hh.AbstractC4584k4
    /* JADX INFO: renamed from: kk, reason: merged with bridge method [inline-methods] */
    public C13589k4 mo18931k4(int i) {
        C9579bv c9579bv = this.f12808m9;
        return c9579bv != null ? new C13589k4(this.f12805du, c9579bv, this.f12798kk, i) : new C13589k4(this.f12805du, this.f12806h4, this.f12797k4, this.f12800x1, this.f12798kk, i);
    }

    @Override // com.aspose.slides.internal.p167hh.C4585kk, com.aspose.slides.internal.p167hh.C4586to, com.aspose.slides.internal.p167hh.AbstractC4584k4
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public C13589k4 mo18929k4(float f) {
        C9579bv c9579bv = this.f12808m9;
        return c9579bv != null ? new C13589k4(this.f12805du, c9579bv, f, this.f12799to) : new C13589k4(this.f12805du, this.f12806h4, this.f12797k4, this.f12800x1, f, this.f12799to);
    }

    private C13589k4(C4582du c4582du, C9579bv c9579bv, float f, int i) {
        super(c4582du, c9579bv, f, i);
    }

    private C13589k4(C4582du c4582du, AbstractC9608yj abstractC9608yj, String str, String str2, float f, int i) {
        super(c4582du, abstractC9608yj, str, str2, f, i);
    }

    @Override // com.aspose.slides.internal.p167hh.C4585kk, com.aspose.slides.internal.p167hh.C4586to, com.aspose.slides.internal.p167hh.AbstractC4584k4
    /* JADX INFO: renamed from: k4 */
    public AbstractC4584k4 mo18930k4(float f, int i) {
        C9579bv c9579bv = this.f12808m9;
        return c9579bv != null ? new C13589k4(this.f12805du, c9579bv, f, i) : new C13589k4(this.f12805du, this.f12806h4, this.f12797k4, this.f12800x1, f, i);
    }

    public C13589k4(C4582du c4582du, AbstractC9608yj abstractC9608yj, String str, String str2, int i) {
        this(c4582du, abstractC9608yj, str, str2, 1.0f, i);
    }
}
