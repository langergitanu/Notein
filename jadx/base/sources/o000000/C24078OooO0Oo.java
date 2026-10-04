package o000000;

import OooOoO.C20503OooO00o;
import android.graphics.Paint;
import android.text.Layout;
import o0O0O00.C25868OooOooo;
import o0O0O00.C25870Oooo00o;

/* JADX INFO: renamed from: o000000.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24078OooO0Oo {

    /* JADX INFO: renamed from: o000000.OooO0Oo$OooO00o */
    public /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f81134OooO00o;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            try {
                iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f81134OooO00o = iArr;
        }
    }

    public static final float OooO00o(Layout layout, int i, Paint paint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(layout, "<this>");
        float lineLeft = layout.getLineLeft(i);
        C25868OooOooo c25868OooOooo = C25870Oooo00o.f88269OooO00o;
        if (!(layout.getEllipsisCount(i) > 0) || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment == null ? -1 : OooO00o.f81134OooO00o[paragraphAlignment.ordinal()]) == 1) {
            return C20503OooO00o.OooO0O0(layout.getWidth(), fMeasureText, 2.0f, Math.abs(lineLeft));
        }
        return (layout.getWidth() - fMeasureText) + Math.abs(lineLeft);
    }

    public static final float OooO0O0(Layout layout, int i, Paint paint) {
        float width;
        float width2;
        kotlin.jvm.internal.OooOOO0.OooO0oO(layout, "<this>");
        C25868OooOooo c25868OooOooo = C25870Oooo00o.f88269OooO00o;
        if (layout.getEllipsisCount(i) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i) != -1 || layout.getWidth() >= layout.getLineRight(i)) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment != null ? OooO00o.f81134OooO00o[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }
}
