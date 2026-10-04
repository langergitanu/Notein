package OooooOO;

import OooooOo.AbstractC21374OooO0OO;
import OooooOo.C21376OooO0o;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;

/* JADX INFO: renamed from: OooooOO.Oooo0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21336Oooo0oo {
    public static final AbstractC21374OooO0OO OooO00o(Bitmap bitmap) {
        AbstractC21374OooO0OO abstractC21374OooO0OOOooO0O0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(bitmap, "<this>");
        ColorSpace colorSpace = bitmap.getColorSpace();
        return (colorSpace == null || (abstractC21374OooO0OOOooO0O0 = OooO0O0(colorSpace)) == null) ? C21376OooO0o.f61833OooO0OO : abstractC21374OooO0OOOooO0O0;
    }

    public static final AbstractC21374OooO0OO OooO0O0(ColorSpace colorSpace) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(colorSpace, "<this>");
        return colorSpace.equals(ColorSpace.get(ColorSpace.Named.SRGB)) ? C21376OooO0o.f61833OooO0OO : colorSpace.equals(ColorSpace.get(ColorSpace.Named.ACES)) ? C21376OooO0o.f61844OooOOOO : colorSpace.equals(ColorSpace.get(ColorSpace.Named.ACESCG)) ? C21376OooO0o.f61845OooOOOo : colorSpace.equals(ColorSpace.get(ColorSpace.Named.ADOBE_RGB)) ? C21376OooO0o.f61843OooOOO0 : colorSpace.equals(ColorSpace.get(ColorSpace.Named.BT2020)) ? C21376OooO0o.f61838OooO0oo : colorSpace.equals(ColorSpace.get(ColorSpace.Named.BT709)) ? C21376OooO0o.f61837OooO0oO : colorSpace.equals(ColorSpace.get(ColorSpace.Named.CIE_LAB)) ? C21376OooO0o.f61846OooOOo : colorSpace.equals(ColorSpace.get(ColorSpace.Named.CIE_XYZ)) ? C21376OooO0o.f61847OooOOo0 : colorSpace.equals(ColorSpace.get(ColorSpace.Named.DCI_P3)) ? C21376OooO0o.f61830OooO : colorSpace.equals(ColorSpace.get(ColorSpace.Named.DISPLAY_P3)) ? C21376OooO0o.f61839OooOO0 : colorSpace.equals(ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB)) ? C21376OooO0o.f61836OooO0o0 : colorSpace.equals(ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB)) ? C21376OooO0o.f61835OooO0o : colorSpace.equals(ColorSpace.get(ColorSpace.Named.LINEAR_SRGB)) ? C21376OooO0o.f61834OooO0Oo : colorSpace.equals(ColorSpace.get(ColorSpace.Named.NTSC_1953)) ? C21376OooO0o.f61840OooOO0O : colorSpace.equals(ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB)) ? C21376OooO0o.f61842OooOOO : colorSpace.equals(ColorSpace.get(ColorSpace.Named.SMPTE_C)) ? C21376OooO0o.f61841OooOO0o : C21376OooO0o.f61833OooO0OO;
    }

    public static final Bitmap OooO0OO(int i, int i2, int i3, boolean z, AbstractC21374OooO0OO colorSpace) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(colorSpace, "colorSpace");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i2, C21330Oooo00o.OooO0O0(i3), z, OooO0Oo(colorSpace));
        kotlin.jvm.internal.OooOOO0.OooO0o(bitmapCreateBitmap, "createBitmap(\n          …orkColorSpace()\n        )");
        return bitmapCreateBitmap;
    }

    public static final ColorSpace OooO0Oo(AbstractC21374OooO0OO abstractC21374OooO0OO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(abstractC21374OooO0OO, "<this>");
        ColorSpace colorSpace = ColorSpace.get(abstractC21374OooO0OO.equals(C21376OooO0o.f61833OooO0OO) ? ColorSpace.Named.SRGB : abstractC21374OooO0OO.equals(C21376OooO0o.f61844OooOOOO) ? ColorSpace.Named.ACES : abstractC21374OooO0OO.equals(C21376OooO0o.f61845OooOOOo) ? ColorSpace.Named.ACESCG : abstractC21374OooO0OO.equals(C21376OooO0o.f61843OooOOO0) ? ColorSpace.Named.ADOBE_RGB : abstractC21374OooO0OO.equals(C21376OooO0o.f61838OooO0oo) ? ColorSpace.Named.BT2020 : abstractC21374OooO0OO.equals(C21376OooO0o.f61837OooO0oO) ? ColorSpace.Named.BT709 : abstractC21374OooO0OO.equals(C21376OooO0o.f61846OooOOo) ? ColorSpace.Named.CIE_LAB : abstractC21374OooO0OO.equals(C21376OooO0o.f61847OooOOo0) ? ColorSpace.Named.CIE_XYZ : abstractC21374OooO0OO.equals(C21376OooO0o.f61830OooO) ? ColorSpace.Named.DCI_P3 : abstractC21374OooO0OO.equals(C21376OooO0o.f61839OooOO0) ? ColorSpace.Named.DISPLAY_P3 : abstractC21374OooO0OO.equals(C21376OooO0o.f61836OooO0o0) ? ColorSpace.Named.EXTENDED_SRGB : abstractC21374OooO0OO.equals(C21376OooO0o.f61835OooO0o) ? ColorSpace.Named.LINEAR_EXTENDED_SRGB : abstractC21374OooO0OO.equals(C21376OooO0o.f61834OooO0Oo) ? ColorSpace.Named.LINEAR_SRGB : abstractC21374OooO0OO.equals(C21376OooO0o.f61840OooOO0O) ? ColorSpace.Named.NTSC_1953 : abstractC21374OooO0OO.equals(C21376OooO0o.f61842OooOOO) ? ColorSpace.Named.PRO_PHOTO_RGB : abstractC21374OooO0OO.equals(C21376OooO0o.f61841OooOO0o) ? ColorSpace.Named.SMPTE_C : ColorSpace.Named.SRGB);
        kotlin.jvm.internal.OooOOO0.OooO0o(colorSpace, "get(frameworkNamedSpace)");
        return colorSpace;
    }
}
