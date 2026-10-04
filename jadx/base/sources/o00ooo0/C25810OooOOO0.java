package o00ooo0;

import android.widget.ImageView;

/* JADX INFO: renamed from: o00ooo0.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25810OooOOO0 {

    /* JADX INFO: renamed from: o00ooo0.OooOOO0$OooO00o */
    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f88022OooO00o;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f88022OooO00o = iArr;
            try {
                iArr[ImageView.ScaleType.MATRIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static void OooO00o(float f, float f2, float f3) {
        if (f >= f2) {
            throw new IllegalArgumentException("Minimum zoom has to be less than Medium zoom. Call setMinimumZoom() with a more appropriate value");
        }
        if (f2 >= f3) {
            throw new IllegalArgumentException("Medium zoom has to be less than Maximum zoom. Call setMaximumZoom() with a more appropriate value");
        }
    }
}
