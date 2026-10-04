package androidx.ink.brush;

import androidx.ink.nativeloader.UsedByNative;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.orion.penkit.tools.DrawToolFactory;
import kotlin.Metadata;
import o000OOoO.OooO00o;

/* JADX INFO: loaded from: classes.dex */
@UsedByNative
@Metadata(m80611d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000f\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0087 ¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\tH\u0087 ¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\tH\u0087 ¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0013\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0007H\u0087 ¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0015\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0007H\u0087 ¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\tH\u0087 ¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u0018\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0007H\u0087 ¢\u0006\u0004\b\u0018\u0010\u0014J \u0010\u0019\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0007H\u0087 ¢\u0006\u0004\b\u0019\u0010\u0016J\u0018\u0010\u001a\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\tH\u0087 ¢\u0006\u0004\b\u001a\u0010\u0011J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\tH\u0087 ¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\tH\u0087 ¢\u0006\u0004\b\u001f\u0010\u0011J\u0018\u0010!\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007H\u0087 ¢\u0006\u0004\b!\u0010\"J\u0018\u0010$\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0007H\u0087 ¢\u0006\u0004\b$\u0010\"J\u0018\u0010&\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u0007H\u0087 ¢\u0006\u0004\b&\u0010\"J\u0018\u0010(\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u0007H\u0087 ¢\u0006\u0004\b(\u0010\"J\u0018\u0010*\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007H\u0087 ¢\u0006\u0004\b*\u0010\"¨\u0006+"}, m80612d2 = {"Landroidx/ink/brush/BrushPaintNative;", "", "<init>", "()V", "", "textureLayerNativePointers", "colorFunctionNativePointers", "", "selfOverlapInt", "", "create", "([J[JI)J", "nativePointer", "LoO00ooO/OooOooO;", DrawToolFactory.LASSO_TYPE_FREE, "(J)V", "getTextureLayerCount", "(J)I", FirebaseAnalytics.Param.INDEX, "getTextureLayerMappingInt", "(JI)I", "newCopyOfTextureLayer", "(JI)J", "getColorFunctionCount", "getColorFunctionParametersTypeInt", "newCopyOfColorFunction", "getSelfOverlapInt", "meshFormatNativePointer", "", "isCompatibleWithMeshFormat", "(JJ)Z", "calculateMinimumRequiredVersion", "blendModeInt", "getBlendModeMinimumRequiredVersion", "(I)I", "wrapInt", "getTextureWrapMinimumRequiredVersion", "originInt", "getTextureOriginMinimumRequiredVersion", "sizeUnitInt", "getTextureSizeUnitMinimumRequiredVersion", "animationRepeatModeInt", "getAnimationRepeatModeMinimumRequiredVersion", "ink-brush"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class BrushPaintNative {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final BrushPaintNative f65349OooO00o = new BrushPaintNative();

    static {
        OooO00o.f82887OooO00o.OooO00o();
    }

    @UsedByNative
    public final native int calculateMinimumRequiredVersion(long nativePointer);

    @UsedByNative
    public final native long create(long[] textureLayerNativePointers, long[] colorFunctionNativePointers, int selfOverlapInt);

    @UsedByNative
    public final native void free(long nativePointer);

    @UsedByNative
    public final native int getAnimationRepeatModeMinimumRequiredVersion(int animationRepeatModeInt);

    @UsedByNative
    public final native int getBlendModeMinimumRequiredVersion(int blendModeInt);

    @UsedByNative
    public final native int getColorFunctionCount(long nativePointer);

    @UsedByNative
    public final native int getColorFunctionParametersTypeInt(long nativePointer, int index);

    @UsedByNative
    public final native int getSelfOverlapInt(long nativePointer);

    @UsedByNative
    public final native int getTextureLayerCount(long nativePointer);

    @UsedByNative
    public final native int getTextureLayerMappingInt(long nativePointer, int index);

    @UsedByNative
    public final native int getTextureOriginMinimumRequiredVersion(int originInt);

    @UsedByNative
    public final native int getTextureSizeUnitMinimumRequiredVersion(int sizeUnitInt);

    @UsedByNative
    public final native int getTextureWrapMinimumRequiredVersion(int wrapInt);

    @UsedByNative
    public final native boolean isCompatibleWithMeshFormat(long nativePointer, long meshFormatNativePointer);

    @UsedByNative
    public final native long newCopyOfColorFunction(long nativePointer, int index);

    @UsedByNative
    public final native long newCopyOfTextureLayer(long nativePointer, int index);
}
