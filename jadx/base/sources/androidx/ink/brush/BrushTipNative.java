package androidx.ink.brush;

import androidx.ink.nativeloader.UsedByNative;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.orion.penkit.tools.DrawToolFactory;
import kotlin.Metadata;
import o000OOoO.OooO00o;

/* JADX INFO: loaded from: classes.dex */
@UsedByNative
@Metadata(m80611d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JX\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0087 ¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\fH\u0087 ¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\fH\u0087 ¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\fH\u0087 ¢\u0006\u0004\b\u0018\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\fH\u0087 ¢\u0006\u0004\b\u0019\u0010\u0017J\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\fH\u0087 ¢\u0006\u0004\b\u001a\u0010\u0017J\u0018\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\fH\u0087 ¢\u0006\u0004\b\u001b\u0010\u0017J\u0018\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\fH\u0087 ¢\u0006\u0004\b\u001c\u0010\u0017J\u0018\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\fH\u0087 ¢\u0006\u0004\b\u001d\u0010\u0017J\u0018\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0087 ¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010!\u001a\u00020 2\u0006\u0010\u0012\u001a\u00020\fH\u0087 ¢\u0006\u0004\b!\u0010\"J \u0010$\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010#\u001a\u00020 H\u0087 ¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\u00020 2\u0006\u0010\u0012\u001a\u00020\fH\u0087 ¢\u0006\u0004\b&\u0010\"¨\u0006'"}, m80612d2 = {"Landroidx/ink/brush/BrushTipNative;", "", "<init>", "()V", "", "scaleX", "scaleY", "cornerRounding", "slantDegrees", "pinch", "rotationDegrees", "particleGapDistanceScale", "", "particleGapDurationMillis", "", "behaviorNativePointersArray", "create", "(FFFFFFFJ[J)J", "nativePointer", "LoO00ooO/OooOooO;", DrawToolFactory.LASSO_TYPE_FREE, "(J)V", "getScaleX", "(J)F", "getScaleY", "getCornerRounding", "getSlantDegrees", "getPinch", "getRotationDegrees", "getParticleGapDistanceScale", "getParticleGapDurationMillis", "(J)J", "", "getBehaviorCount", "(J)I", FirebaseAnalytics.Param.INDEX, "newCopyOfBrushBehavior", "(JI)J", "calculateMinimumRequiredVersion", "ink-brush"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class BrushTipNative {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final BrushTipNative f65350OooO00o = new BrushTipNative();

    static {
        OooO00o.f82887OooO00o.OooO00o();
    }

    @UsedByNative
    public final native int calculateMinimumRequiredVersion(long nativePointer);

    @UsedByNative
    public final native long create(float scaleX, float scaleY, float cornerRounding, float slantDegrees, float pinch, float rotationDegrees, float particleGapDistanceScale, long particleGapDurationMillis, long[] behaviorNativePointersArray);

    @UsedByNative
    public final native void free(long nativePointer);

    @UsedByNative
    public final native int getBehaviorCount(long nativePointer);

    @UsedByNative
    public final native float getCornerRounding(long nativePointer);

    @UsedByNative
    public final native float getParticleGapDistanceScale(long nativePointer);

    @UsedByNative
    public final native long getParticleGapDurationMillis(long nativePointer);

    @UsedByNative
    public final native float getPinch(long nativePointer);

    @UsedByNative
    public final native float getRotationDegrees(long nativePointer);

    @UsedByNative
    public final native float getScaleX(long nativePointer);

    @UsedByNative
    public final native float getScaleY(long nativePointer);

    @UsedByNative
    public final native float getSlantDegrees(long nativePointer);

    @UsedByNative
    public final native long newCopyOfBrushBehavior(long nativePointer, int index);
}
