package androidx.ink.strokes;

import androidx.ink.nativeloader.UsedByNative;
import com.huawei.hms.network.embedded.C18437z2;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@UsedByNative
@Metadata(m80611d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0007\u0010\bJX\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0087 ¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\tH\u0087 ¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u000bH\u0087 ¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, m80612d2 = {"Landroidx/ink/strokes/MutableStrokeInputBatchNative;", "", "<init>", "()V", "", "nativePointer", "LoO00ooO/OooOooO;", "clear", "(J)V", "", C18437z2.f56754h, "", "x", "y", "elapsedTimeMillis", "strokeUnitLengthCm", "pressure", "tilt", "orientation", "", "appendSingle", "(JIFFJFFFF)Z", "addedNativePointer", "appendBatch", "(JJ)Z", "newCopy", "(J)J", "seed", "setNoiseSeed", "(JI)V", "phase", "setBaseAnimationPhase", "(JF)V", "ink-strokes"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class MutableStrokeInputBatchNative {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final MutableStrokeInputBatchNative f65459OooO00o = new MutableStrokeInputBatchNative();

    static {
        o000OOoO.OooO00o.f82887OooO00o.OooO00o();
    }

    @UsedByNative
    public final native boolean appendBatch(long nativePointer, long addedNativePointer);

    @UsedByNative
    public final native boolean appendSingle(long nativePointer, int type, float x, float y, long elapsedTimeMillis, float strokeUnitLengthCm, float pressure, float tilt, float orientation);

    @UsedByNative
    public final native void clear(long nativePointer);

    @UsedByNative
    public final native long newCopy(long nativePointer);

    @UsedByNative
    public final native void setBaseAnimationPhase(long nativePointer, float phase);

    @UsedByNative
    public final native void setNoiseSeed(long nativePointer, int seed);
}
