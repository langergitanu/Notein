package androidx.ink.strokes;

import androidx.ink.geometry.BoxAccumulator;
import androidx.ink.geometry.MutableVec;
import androidx.ink.nativeloader.UsedByNative;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.orion.penkit.tools.DrawToolFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@UsedByNative
@Metadata(m80611d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\t\u0010\nJ0\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0087 ¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u001a\u0010\nJ\u0018\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u001d\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u001e\u0010\u001cJ\u0018\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b!\u0010 J\u0018\u0010\"\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b$\u0010#J\u0018\u0010%\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b%\u0010#J0\u0010)\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\f2\u0006\u0010(\u001a\u00020\fH\u0087 ¢\u0006\u0004\b)\u0010*J(\u0010.\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\fH\u0087 ¢\u0006\u0004\b.\u0010/J\u0018\u00100\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b0\u00101J\u0018\u00102\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b2\u0010#J(\u00106\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u00103\u001a\u00020\f2\u0006\u00105\u001a\u000204H\u0087 ¢\u0006\u0004\b6\u00107J \u00108\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u00103\u001a\u00020\fH\u0087 ¢\u0006\u0004\b8\u00109J(\u0010;\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u00103\u001a\u00020\f2\u0006\u0010:\u001a\u00020\fH\u0087 ¢\u0006\u0004\b;\u0010<J \u0010=\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u00103\u001a\u00020\fH\u0087 ¢\u0006\u0004\b=\u0010>J \u0010?\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u00105\u001a\u000204H\u0087 ¢\u0006\u0004\b?\u0010@J\u0018\u0010A\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\bA\u0010\nJ \u0010B\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u00103\u001a\u00020\fH\u0087 ¢\u0006\u0004\bB\u00109J(\u0010D\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u00103\u001a\u00020\f2\u0006\u0010C\u001a\u00020\fH\u0087 ¢\u0006\u0004\bD\u0010<J8\u0010H\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u00103\u001a\u00020\f2\u0006\u0010C\u001a\u00020\f2\u0006\u0010E\u001a\u00020\f2\u0006\u0010G\u001a\u00020FH\u0087 ¢\u0006\u0004\bH\u0010IJ8\u0010K\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u00103\u001a\u00020\f2\u0006\u0010:\u001a\u00020\f2\u0006\u0010J\u001a\u00020\f2\u0006\u0010G\u001a\u00020FH\u0087 ¢\u0006\u0004\bK\u0010IJ\u0018\u0010L\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\bL\u0010\n¨\u0006M"}, m80612d2 = {"Landroidx/ink/strokes/InProgressStrokeNative;", "", "<init>", "()V", "", "create", "()J", "nativePointer", "LoO00ooO/OooOooO;", "clear", "(J)V", "brushNativePointer", "", "noiseSeed", "", "baseAnimationPhase", "start", "(JJIF)V", "realInputsPointer", "predictedInputsPointer", "", "enqueueInputs", "(JJJ)Z", "currentElapsedTime", "updateShape", "(JJ)Z", "finishInput", "isInputFinished", "(J)Z", "isUpdateNeeded", "changesWithTime", "newStrokeFromCopy", "(J)J", "newStrokeFromPrunedCopy", "getInputCount", "(J)I", "getRealInputCount", "getPredictedInputCount", "mutableStrokeInputBatchPointer", Constants.MessagePayloadKeys.FROM, "to", "populateInputs", "(JJII)V", "Landroidx/ink/strokes/StrokeInput;", "input", FirebaseAnalytics.Param.INDEX, "getAndOverwriteInput", "(JLandroidx/ink/strokes/StrokeInput;I)V", "getBaseAnimationPhase", "(J)F", "getBrushCoatCount", "coatIndex", "Landroidx/ink/geometry/BoxAccumulator;", "outEnvelope", "fillMeshBounds", "(JILandroidx/ink/geometry/BoxAccumulator;)V", "getMeshPartitionCount", "(JI)I", "partitionIndex", "getVertexCount", "(JII)I", "newCopyOfMeshFormat", "(JI)J", "fillUpdatedRegion", "(JLandroidx/ink/geometry/BoxAccumulator;)V", "resetUpdatedRegion", "getOutlineCount", "outlineIndex", "getOutlineVertexCount", "outlineVertexIndex", "Landroidx/ink/geometry/MutableVec;", "outPosition", "fillOutlinePosition", "(JIIILandroidx/ink/geometry/MutableVec;)V", "vertexIndex", "fillPosition", DrawToolFactory.LASSO_TYPE_FREE, "ink-strokes"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class InProgressStrokeNative {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final InProgressStrokeNative f65457OooO00o = new InProgressStrokeNative();

    static {
        o000OOoO.OooO00o.f82887OooO00o.OooO00o();
    }

    @UsedByNative
    public final native boolean changesWithTime(long nativePointer);

    @UsedByNative
    public final native void clear(long nativePointer);

    @UsedByNative
    public final native long create();

    @UsedByNative
    public final native boolean enqueueInputs(long nativePointer, long realInputsPointer, long predictedInputsPointer);

    @UsedByNative
    public final native void fillMeshBounds(long nativePointer, int coatIndex, BoxAccumulator outEnvelope);

    @UsedByNative
    public final native void fillOutlinePosition(long nativePointer, int coatIndex, int outlineIndex, int outlineVertexIndex, MutableVec outPosition);

    @UsedByNative
    public final native void fillPosition(long nativePointer, int coatIndex, int partitionIndex, int vertexIndex, MutableVec outPosition);

    @UsedByNative
    public final native void fillUpdatedRegion(long nativePointer, BoxAccumulator outEnvelope);

    @UsedByNative
    public final native void finishInput(long nativePointer);

    @UsedByNative
    public final native void free(long nativePointer);

    @UsedByNative
    public final native void getAndOverwriteInput(long nativePointer, StrokeInput input, int index);

    @UsedByNative
    public final native float getBaseAnimationPhase(long nativePointer);

    @UsedByNative
    public final native int getBrushCoatCount(long nativePointer);

    @UsedByNative
    public final native int getInputCount(long nativePointer);

    @UsedByNative
    public final native int getMeshPartitionCount(long nativePointer, int coatIndex);

    @UsedByNative
    public final native int getOutlineCount(long nativePointer, int coatIndex);

    @UsedByNative
    public final native int getOutlineVertexCount(long nativePointer, int coatIndex, int outlineIndex);

    @UsedByNative
    public final native int getPredictedInputCount(long nativePointer);

    @UsedByNative
    public final native int getRealInputCount(long nativePointer);

    @UsedByNative
    public final native int getVertexCount(long nativePointer, int coatIndex, int partitionIndex);

    @UsedByNative
    public final native boolean isInputFinished(long nativePointer);

    @UsedByNative
    public final native boolean isUpdateNeeded(long nativePointer);

    @UsedByNative
    public final native long newCopyOfMeshFormat(long nativePointer, int coatIndex);

    @UsedByNative
    public final native long newStrokeFromCopy(long nativePointer);

    @UsedByNative
    public final native long newStrokeFromPrunedCopy(long nativePointer);

    @UsedByNative
    public final native void populateInputs(long nativePointer, long mutableStrokeInputBatchPointer, int from, int to);

    @UsedByNative
    public final native void resetUpdatedRegion(long nativePointer);

    @UsedByNative
    public final native void start(long nativePointer, long brushNativePointer, int noiseSeed, float baseAnimationPhase);

    @UsedByNative
    public final native boolean updateShape(long nativePointer, long currentElapsedTime);
}
