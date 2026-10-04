package androidx.ink.strokes;

import androidx.ink.nativeloader.UsedByNative;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.orion.penkit.tools.DrawToolFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@UsedByNative
@Metadata(m80611d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u000e\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0017\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0018\u0010\u0016J\u0018\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0019\u0010\u0016J\u0018\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u001a\u0010\rJ\u0018\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u001b\u0010\u0013J(\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0087 ¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, m80612d2 = {"Landroidx/ink/strokes/StrokeInputBatchNative;", "", "<init>", "()V", "", "create", "()J", "nativePointer", "LoO00ooO/OooOooO;", DrawToolFactory.LASSO_TYPE_FREE, "(J)V", "", "getSize", "(J)I", "getToolType", "getDurationMillis", "(J)J", "", "getStrokeUnitLengthCm", "(J)F", "", "hasStrokeUnitLength", "(J)Z", "hasPressure", "hasTilt", "hasOrientation", "getNoiseSeed", "getBaseAnimationPhase", FirebaseAnalytics.Param.INDEX, "Landroidx/ink/strokes/StrokeInput;", "input", "populate", "(JILandroidx/ink/strokes/StrokeInput;)V", "ink-strokes"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class StrokeInputBatchNative {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final StrokeInputBatchNative f65498OooO00o = new StrokeInputBatchNative();

    static {
        o000OOoO.OooO00o.f82887OooO00o.OooO00o();
    }

    @UsedByNative
    public final native long create();

    @UsedByNative
    public final native void free(long nativePointer);

    @UsedByNative
    public final native float getBaseAnimationPhase(long nativePointer);

    @UsedByNative
    public final native long getDurationMillis(long nativePointer);

    @UsedByNative
    public final native int getNoiseSeed(long nativePointer);

    @UsedByNative
    public final native int getSize(long nativePointer);

    @UsedByNative
    public final native float getStrokeUnitLengthCm(long nativePointer);

    @UsedByNative
    public final native int getToolType(long nativePointer);

    @UsedByNative
    public final native boolean hasOrientation(long nativePointer);

    @UsedByNative
    public final native boolean hasPressure(long nativePointer);

    @UsedByNative
    public final native boolean hasStrokeUnitLength(long nativePointer);

    @UsedByNative
    public final native boolean hasTilt(long nativePointer);

    @UsedByNative
    public final native void populate(long nativePointer, int index, StrokeInput input);
}
