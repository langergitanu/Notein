package androidx.ink.brush;

import androidx.ink.nativeloader.UsedByNative;
import com.orion.penkit.tools.DrawToolFactory;
import kotlin.Metadata;
import o000OOoO.OooO00o;

/* JADX INFO: loaded from: classes.dex */
@UsedByNative
@Metadata(m80611d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\n\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u000b\u0010\bJ\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\r\u0010\bJ8\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0087 ¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0006H\u0087 ¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0006H\u0087 ¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0006H\u0087 ¢\u0006\u0004\b\u001c\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0006H\u0087 ¢\u0006\u0004\b\u001d\u0010\u001bJ\u0018\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0006H\u0087 ¢\u0006\u0004\b\u001e\u0010\u001bJ\u0018\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0087 ¢\u0006\u0004\b\u001f\u0010 J@\u0010!\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0087 ¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0006H\u0087 ¢\u0006\u0004\b#\u0010$¨\u0006%"}, m80612d2 = {"Landroidx/ink/brush/ColorFunctionNative;", "", "<init>", "()V", "", "multiplier", "", "createOpacityMultiplier", "(F)J", "offsetDegrees", "createHueOffset", "createSaturationMultiplier", "offset", "createLuminosityOffset", "colorRed", "colorGreen", "colorBlue", "colorAlpha", "", "colorSpace", "createReplaceColor", "(FFFFI)J", "nativePointer", "LoO00ooO/OooOooO;", DrawToolFactory.LASSO_TYPE_FREE, "(J)V", "getOpacityMultiplier", "(J)F", "getHueOffsetDegrees", "getSaturationMultiplier", "getLuminosityOffset", "computeReplaceColorLong", "(J)J", "computeTransformedColorLong", "(JFFFFI)J", "calculateMinimumRequiredVersion", "(J)I", "ink-brush"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class ColorFunctionNative {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final ColorFunctionNative f65351OooO00o = new ColorFunctionNative();

    static {
        OooO00o.f82887OooO00o.OooO00o();
    }

    @UsedByNative
    public final native int calculateMinimumRequiredVersion(long nativePointer);

    @UsedByNative
    public final native long computeReplaceColorLong(long nativePointer);

    @UsedByNative
    public final native long computeTransformedColorLong(long nativePointer, float colorRed, float colorGreen, float colorBlue, float colorAlpha, int colorSpace);

    @UsedByNative
    public final native long createHueOffset(float offsetDegrees);

    @UsedByNative
    public final native long createLuminosityOffset(float offset);

    @UsedByNative
    public final native long createOpacityMultiplier(float multiplier);

    @UsedByNative
    public final native long createReplaceColor(float colorRed, float colorGreen, float colorBlue, float colorAlpha, int colorSpace);

    @UsedByNative
    public final native long createSaturationMultiplier(float multiplier);

    @UsedByNative
    public final native void free(long nativePointer);

    @UsedByNative
    public final native float getHueOffsetDegrees(long nativePointer);

    @UsedByNative
    public final native float getLuminosityOffset(long nativePointer);

    @UsedByNative
    public final native float getOpacityMultiplier(long nativePointer);

    @UsedByNative
    public final native float getSaturationMultiplier(long nativePointer);
}
