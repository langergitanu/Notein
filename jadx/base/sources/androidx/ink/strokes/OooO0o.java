package androidx.ink.strokes;

import Oooo0.C20856OooooOo;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o {
    public static final ShortBuffer OooO00o(C21967OooO0Oo c21967OooO0Oo, int i, int i2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(c21967OooO0Oo, "<this>");
        if (i2 < 0 || i2 >= c21967OooO0Oo.OooO0Oo(i)) {
            throw new IllegalArgumentException(C20856OooooOo.OooO0O0("Cannot get raw triangle index buffer at partitionIndex ", i2, " out of range [0, ", ").", c21967OooO0Oo.OooO0Oo(i)).toString());
        }
        ByteBuffer unsafelyMutableInProgressStrokeOwnedRawTriangleIndexData = JvmInProgressStrokeNative.f65458OooO00o.getUnsafelyMutableInProgressStrokeOwnedRawTriangleIndexData(c21967OooO0Oo.OooO0o0(), i, i2);
        if (unsafelyMutableInProgressStrokeOwnedRawTriangleIndexData == null) {
            unsafelyMutableInProgressStrokeOwnedRawTriangleIndexData = ByteBuffer.allocateDirect(0);
        }
        if (!unsafelyMutableInProgressStrokeOwnedRawTriangleIndexData.isDirect()) {
            throw new IllegalStateException("getUnsafelyMutableInProgressStrokeOwnedRawTriangleIndexData returned a non-direct buffer.");
        }
        ShortBuffer shortBufferAsReadOnlyBuffer = unsafelyMutableInProgressStrokeOwnedRawTriangleIndexData.order(ByteOrder.nativeOrder()).asShortBuffer().asReadOnlyBuffer();
        kotlin.jvm.internal.OooOOO0.OooO0o(shortBufferAsReadOnlyBuffer, "asReadOnlyBuffer(...)");
        return shortBufferAsReadOnlyBuffer;
    }

    public static final ByteBuffer OooO0O0(C21967OooO0Oo c21967OooO0Oo, int i, int i2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(c21967OooO0Oo, "<this>");
        if (i2 < 0 || i2 >= c21967OooO0Oo.OooO0Oo(i)) {
            throw new IllegalArgumentException(C20856OooooOo.OooO0O0("Cannot get raw vertex buffer at partitionIndex ", i2, " out of range [0, ", ").", c21967OooO0Oo.OooO0Oo(i)).toString());
        }
        ByteBuffer unsafelyMutableInProgressStrokeOwnedRawVertexData = JvmInProgressStrokeNative.f65458OooO00o.getUnsafelyMutableInProgressStrokeOwnedRawVertexData(c21967OooO0Oo.OooO0o0(), i, i2);
        if (unsafelyMutableInProgressStrokeOwnedRawVertexData == null) {
            unsafelyMutableInProgressStrokeOwnedRawVertexData = ByteBuffer.allocateDirect(0);
        }
        if (!unsafelyMutableInProgressStrokeOwnedRawVertexData.isDirect()) {
            throw new IllegalStateException("getUnsafelyMutableInProgressStrokeOwnedRawVertexData returned a non-direct buffer.");
        }
        ByteBuffer byteBufferAsReadOnlyBuffer = unsafelyMutableInProgressStrokeOwnedRawVertexData.asReadOnlyBuffer();
        kotlin.jvm.internal.OooOOO0.OooO0o(byteBufferAsReadOnlyBuffer, "asReadOnlyBuffer(...)");
        return byteBufferAsReadOnlyBuffer;
    }
}
