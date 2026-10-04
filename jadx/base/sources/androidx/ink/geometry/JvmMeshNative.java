package androidx.ink.geometry;

import androidx.ink.nativeloader.UsedByNative;
import java.nio.ByteBuffer;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@UsedByNative
@Metadata(m80611d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0087 J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0087 ¨\u0006\t"}, m80612d2 = {"Landroidx/ink/geometry/JvmMeshNative;", "", "<init>", "()V", "createUnsafelyMutableMeshOwnedRawVertexBuffer", "Ljava/nio/ByteBuffer;", "nativePointer", "", "createUnsafelyMutableMeshOwnedRawTriangleIndexBuffer", "ink-geometry"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
final class JvmMeshNative {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final JvmMeshNative f65386OooO00o = new JvmMeshNative();

    @UsedByNative
    public final native ByteBuffer createUnsafelyMutableMeshOwnedRawTriangleIndexBuffer(long nativePointer);

    @UsedByNative
    public final native ByteBuffer createUnsafelyMutableMeshOwnedRawVertexBuffer(long nativePointer);
}
