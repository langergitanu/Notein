package androidx.ink.strokes;

import androidx.ink.nativeloader.UsedByNative;
import java.nio.ByteBuffer;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@UsedByNative
@Metadata(m80611d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0087 J#\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0087 ¨\u0006\f"}, m80612d2 = {"Landroidx/ink/strokes/JvmInProgressStrokeNative;", "", "<init>", "()V", "getUnsafelyMutableInProgressStrokeOwnedRawVertexData", "Ljava/nio/ByteBuffer;", "nativePointer", "", "coatIndex", "", "partitionIndex", "getUnsafelyMutableInProgressStrokeOwnedRawTriangleIndexData", "ink-strokes"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
final class JvmInProgressStrokeNative {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final JvmInProgressStrokeNative f65458OooO00o = new JvmInProgressStrokeNative();

    static {
        o000OOoO.OooO00o.f82887OooO00o.OooO00o();
    }

    @UsedByNative
    public final native ByteBuffer getUnsafelyMutableInProgressStrokeOwnedRawTriangleIndexData(long nativePointer, int coatIndex, int partitionIndex);

    @UsedByNative
    public final native ByteBuffer getUnsafelyMutableInProgressStrokeOwnedRawVertexData(long nativePointer, int coatIndex, int partitionIndex);
}
