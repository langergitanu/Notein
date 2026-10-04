package o000000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import o0O0O00.C25868OooOooo;
import o0O0O00.C25870Oooo00o;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i6)) != layout.getLineCount() - 1) {
            return;
        }
        C25868OooOooo c25868OooOooo = C25870Oooo00o.f88269OooO00o;
        if (layout.getEllipsisCount(lineForOffset) > 0) {
            float fOooO0O0 = C24078OooO0Oo.OooO0O0(layout, lineForOffset, paint) + C24078OooO0Oo.OooO00o(layout, lineForOffset, paint);
            if (fOooO0O0 == 0.0f) {
                return;
            }
            kotlin.jvm.internal.OooOOO0.OooO0Oo(canvas);
            canvas.translate(fOooO0O0, 0.0f);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return 0;
    }
}
