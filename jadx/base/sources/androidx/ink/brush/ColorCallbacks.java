package androidx.ink.brush;

import OooooO0.C21292OooO0oo;
import androidx.ink.nativeloader.UsedByNative;
import kotlin.Metadata;
import o000OOO.C24498OooO0o0;
import o000OOO.C24504OooOOo0;

/* JADX INFO: loaded from: classes.dex */
@UsedByNative
@Metadata(m80611d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0007¨\u0006\r"}, m80612d2 = {"Landroidx/ink/brush/ColorCallbacks;", "", "<init>", "()V", "composeColorLongFromComponents", "", "colorSpaceId", "", "redGammaCorrected", "", "greenGammaCorrected", "blueGammaCorrected", "alpha", "ink-brush"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class ColorCallbacks {
    static {
        new ColorCallbacks();
    }

    @UsedByNative
    public static final long composeColorLongFromComponents(int colorSpaceId, float redGammaCorrected, float greenGammaCorrected, float blueGammaCorrected, float alpha) {
        C24504OooOOo0 c24504OooOOo0;
        if (colorSpaceId == 0) {
            c24504OooOOo0 = C24498OooO0o0.f82834OooO0o0;
        } else {
            if (colorSpaceId != 1) {
                throw new IllegalArgumentException("Unsupported Compose color space");
            }
            c24504OooOOo0 = C24498OooO0o0.f82835OooO0oO;
        }
        return C21292OooO0oo.OooO00o(redGammaCorrected, greenGammaCorrected, blueGammaCorrected, alpha, c24504OooOOo0);
    }
}
