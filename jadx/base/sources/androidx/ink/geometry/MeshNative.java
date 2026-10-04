package androidx.ink.geometry;

import androidx.ink.nativeloader.UsedByNative;
import com.orion.penkit.tools.DrawToolFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@UsedByNative
@Metadata(m80611d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0011\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0012\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0013\u0010\u0010J\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\n\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0015\u0010\u0016J0\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0087 ¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u001d\u0010\tJ(\u0010!\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001fH\u0087 ¢\u0006\u0004\b!\u0010\"¨\u0006#"}, m80612d2 = {"Landroidx/ink/geometry/MeshNative;", "", "<init>", "()V", "", "createEmpty", "()J", "otherNativePointer", "newCopy", "(J)J", "nativePointer", "LoO00ooO/OooOooO;", DrawToolFactory.LASSO_TYPE_FREE, "(J)V", "", "getVertexCount", "(J)I", "getVertexStride", "getTriangleCount", "getAttributeCount", "Landroidx/ink/geometry/ImmutableBox;", "createBounds", "(J)Landroidx/ink/geometry/ImmutableBox;", "attributeIndex", "", "offsets", "scales", "fillAttributeUnpackingParams", "(JI[F[F)I", "newCopyOfFormat", "vertexIndex", "Landroidx/ink/geometry/MutableVec;", "outPosition", "fillPosition", "(JILandroidx/ink/geometry/MutableVec;)V", "ink-geometry"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class MeshNative {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final MeshNative f65388OooO00o = new MeshNative();

    static {
        o000OOoO.OooO00o.f82887OooO00o.OooO00o();
    }

    @UsedByNative
    public final native ImmutableBox createBounds(long nativePointer);

    @UsedByNative
    public final native long createEmpty();

    @UsedByNative
    public final native int fillAttributeUnpackingParams(long nativePointer, int attributeIndex, float[] offsets, float[] scales);

    @UsedByNative
    public final native void fillPosition(long nativePointer, int vertexIndex, MutableVec outPosition);

    @UsedByNative
    public final native void free(long nativePointer);

    @UsedByNative
    public final native int getAttributeCount(long nativePointer);

    @UsedByNative
    public final native int getTriangleCount(long nativePointer);

    @UsedByNative
    public final native int getVertexCount(long nativePointer);

    @UsedByNative
    public final native int getVertexStride(long nativePointer);

    @UsedByNative
    public final native long newCopy(long otherNativePointer);

    @UsedByNative
    public final native long newCopyOfFormat(long nativePointer);
}
