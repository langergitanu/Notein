package androidx.ink.brush.behavior;

import androidx.ink.nativeloader.UsedByNative;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.orion.penkit.tools.DrawToolFactory;
import kotlin.Metadata;
import o000OOoO.OooO00o;

/* JADX INFO: loaded from: classes.dex */
@UsedByNative
@Metadata(m80611d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0016\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0087 ¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\u0011\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0087 ¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0087 ¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bH\u0087 ¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b!\u0010 J\u0018\u0010\"\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b$\u0010#J\u0018\u0010%\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b%\u0010#J\u0018\u0010&\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b&\u0010#J\u0018\u0010'\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b'\u0010 J \u0010)\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\bH\u0087 ¢\u0006\u0004\b)\u0010*J \u0010+\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\bH\u0087 ¢\u0006\u0004\b+\u0010*J\u0018\u0010,\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b,\u0010 J\u0018\u0010-\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b-\u0010 J\u0018\u0010.\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b.\u0010 J\u0018\u00100\u001a\u00020\b2\u0006\u0010/\u001a\u00020\bH\u0087 ¢\u0006\u0004\b0\u00101¨\u00062"}, m80612d2 = {"Landroidx/ink/brush/behavior/EasingFunctionNative;", "", "<init>", "()V", "", "otherEasingFunctionNativePointer", "createCopyOf", "(J)J", "", "value", "createPredefined", "(I)J", "", "x1", "y1", "x2", "y2", "createCubicBezier", "(FFFF)J", "", "points", "createLinear", "([F)J", "stepCount", "stepPosition", "createSteps", "(II)J", "nativePointer", "LoO00ooO/OooOooO;", DrawToolFactory.LASSO_TYPE_FREE, "(J)V", "getParametersType", "(J)I", "getPredefinedValueInt", "getCubicBezierX1", "(J)F", "getCubicBezierY1", "getCubicBezierX2", "getCubicBezierY2", "getLinearNumPoints", FirebaseAnalytics.Param.INDEX, "getLinearPointX", "(JI)F", "getLinearPointY", "getStepsCount", "getStepsPositionInt", "calculateMinimumRequiredVersion", "stepPositionInt", "getStepPositionMinimumRequiredVersion", "(I)I", "ink-brush"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class EasingFunctionNative {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final EasingFunctionNative f65360OooO00o = new EasingFunctionNative();

    static {
        OooO00o.f82887OooO00o.OooO00o();
    }

    @UsedByNative
    public final native int calculateMinimumRequiredVersion(long nativePointer);

    @UsedByNative
    public final native long createCopyOf(long otherEasingFunctionNativePointer);

    @UsedByNative
    public final native long createCubicBezier(float x1, float y1, float x2, float y2);

    @UsedByNative
    public final native long createLinear(float[] points);

    @UsedByNative
    public final native long createPredefined(int value);

    @UsedByNative
    public final native long createSteps(int stepCount, int stepPosition);

    @UsedByNative
    public final native void free(long nativePointer);

    @UsedByNative
    public final native float getCubicBezierX1(long nativePointer);

    @UsedByNative
    public final native float getCubicBezierX2(long nativePointer);

    @UsedByNative
    public final native float getCubicBezierY1(long nativePointer);

    @UsedByNative
    public final native float getCubicBezierY2(long nativePointer);

    @UsedByNative
    public final native int getLinearNumPoints(long nativePointer);

    @UsedByNative
    public final native float getLinearPointX(long nativePointer, int index);

    @UsedByNative
    public final native float getLinearPointY(long nativePointer, int index);

    @UsedByNative
    public final native int getParametersType(long nativePointer);

    @UsedByNative
    public final native int getPredefinedValueInt(long nativePointer);

    @UsedByNative
    public final native int getStepPositionMinimumRequiredVersion(int stepPositionInt);

    @UsedByNative
    public final native int getStepsCount(long nativePointer);

    @UsedByNative
    public final native int getStepsPositionInt(long nativePointer);
}
