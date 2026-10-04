package androidx.ink.strokes;

import androidx.ink.nativeloader.UsedByNative;
import com.orion.penkit.tools.DrawToolFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@UsedByNative
@Metadata(m80611d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000f\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u000f\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0011\u0010\u0012J\u0080\u0001\u0010\"\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u0015H\u0087 ¢\u0006\u0004\b\"\u0010#¨\u0006$"}, m80612d2 = {"Landroidx/ink/strokes/StrokeNative;", "", "<init>", "()V", "", "brushNativePointer", "inputs", "createWithBrushAndInputs", "(JJ)J", "shape", "createWithBrushInputsAndShape", "(JJJ)J", "nativePointer", "newShallowCopyOfInputs", "(J)J", "newShallowCopyOfShape", "LoO00ooO/OooOooO;", DrawToolFactory.LASSO_TYPE_FREE, "(J)V", "targetStrokePointer", "maskShapePointer", "", "maskA", "maskB", "maskC", "maskD", "maskE", "maskF", "strokeA", "strokeB", "strokeC", "strokeD", "strokeE", "strokeF", "createWithSubtract", "(JJFFFFFFFFFFFF)J", "ink-strokes"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class StrokeNative {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final StrokeNative f65499OooO00o = new StrokeNative();

    static {
        o000OOoO.OooO00o.f82887OooO00o.OooO00o();
    }

    @UsedByNative
    public final native long createWithBrushAndInputs(long brushNativePointer, long inputs);

    @UsedByNative
    public final native long createWithBrushInputsAndShape(long brushNativePointer, long inputs, long shape);

    @UsedByNative
    public final native long createWithSubtract(long targetStrokePointer, long maskShapePointer, float maskA, float maskB, float maskC, float maskD, float maskE, float maskF, float strokeA, float strokeB, float strokeC, float strokeD, float strokeE, float strokeF);

    @UsedByNative
    public final native void free(long nativePointer);

    @UsedByNative
    public final native long newShallowCopyOfInputs(long nativePointer);

    @UsedByNative
    public final native long newShallowCopyOfShape(long nativePointer);
}
