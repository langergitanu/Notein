package androidx.ink.geometry;

import androidx.ink.nativeloader.UsedByNative;
import com.orion.penkit.tools.DrawToolFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@UsedByNative
@Metadata(m80611d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\u000b\n\u0002\b\u000b\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0005\u0010\u0006J@\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0087 ¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0087 ¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0087 ¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0087 ¢\u0006\u0004\b\u001d\u0010\u001eJ(\u0010 \u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u0014H\u0087 ¢\u0006\u0004\b \u0010!J8\u0010%\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010$\u001a\u00020#H\u0087 ¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010\u0010\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b(\u0010)Jx\u00100\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u0007H\u0087 ¢\u0006\u0004\b0\u00101Jh\u0010<\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00072\u0006\u00108\u001a\u00020\u00072\u0006\u00109\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u0007H\u0087 ¢\u0006\u0004\b<\u0010=Jx\u0010J\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\u00072\u0006\u0010?\u001a\u00020\u00072\u0006\u0010@\u001a\u00020\u00072\u0006\u0010A\u001a\u00020\u00072\u0006\u0010B\u001a\u00020\u00072\u0006\u0010C\u001a\u00020\u00072\u0006\u0010D\u001a\u00020\u00072\u0006\u0010E\u001a\u00020\u00072\u0006\u0010F\u001a\u00020\u00072\u0006\u0010G\u001a\u00020\u00072\u0006\u0010H\u001a\u00020\u00072\u0006\u0010I\u001a\u00020\u0007H\u0087 ¢\u0006\u0004\bJ\u00101JP\u0010R\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\u00042\u0006\u0010L\u001a\u00020\u00072\u0006\u0010M\u001a\u00020\u00072\u0006\u0010N\u001a\u00020\u00072\u0006\u0010O\u001a\u00020\u00072\u0006\u0010P\u001a\u00020\u00072\u0006\u0010Q\u001a\u00020\u0007H\u0087 ¢\u0006\u0004\bR\u0010SJ\u0080\u0001\u0010V\u001a\u00020U2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010T\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u0007H\u0087 ¢\u0006\u0004\bV\u0010WJp\u0010X\u001a\u00020U2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u00072\u0006\u0010T\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00072\u0006\u00108\u001a\u00020\u00072\u0006\u00109\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u0007H\u0087 ¢\u0006\u0004\bX\u0010YJ\u0080\u0001\u0010Z\u001a\u00020U2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\u00072\u0006\u0010?\u001a\u00020\u00072\u0006\u0010@\u001a\u00020\u00072\u0006\u0010A\u001a\u00020\u00072\u0006\u0010B\u001a\u00020\u00072\u0006\u0010C\u001a\u00020\u00072\u0006\u0010T\u001a\u00020\u00072\u0006\u0010D\u001a\u00020\u00072\u0006\u0010E\u001a\u00020\u00072\u0006\u0010F\u001a\u00020\u00072\u0006\u0010G\u001a\u00020\u00072\u0006\u0010H\u001a\u00020\u00072\u0006\u0010I\u001a\u00020\u0007H\u0087 ¢\u0006\u0004\bZ\u0010WJX\u0010[\u001a\u00020U2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\u00042\u0006\u0010T\u001a\u00020\u00072\u0006\u0010L\u001a\u00020\u00072\u0006\u0010M\u001a\u00020\u00072\u0006\u0010N\u001a\u00020\u00072\u0006\u0010O\u001a\u00020\u00072\u0006\u0010P\u001a\u00020\u00072\u0006\u0010Q\u001a\u00020\u0007H\u0087 ¢\u0006\u0004\b[\u0010\\J\u0018\u0010]\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b]\u0010\u0013J\u0018\u0010^\u001a\u00020U2\u0006\u0010\u0010\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b^\u0010_¨\u0006`"}, m80612d2 = {"Landroidx/ink/geometry/PartitionedMeshNative;", "", "<init>", "()V", "", "createEmptyForTesting", "()J", "", "triangleP0X", "triangleP0Y", "triangleP1X", "triangleP1Y", "triangleP2X", "triangleP2Y", "createFromTriangleForTesting", "(FFFFFF)J", "nativePointer", "LoO00ooO/OooOooO;", DrawToolFactory.LASSO_TYPE_FREE, "(J)V", "", "groupIndex", "", "getRenderGroupMeshPointers", "(JI)[J", "getRenderGroupCount", "(J)I", "newCopyOfRenderGroupFormat", "(JI)J", "getOutlineCount", "(JI)I", "outlineIndex", "getOutlineVertexCount", "(JII)I", "outlineVertexIndex", "Landroidx/ink/geometry/MutableVec;", "outPosition", "populateOutlineVertexPosition", "(JIIILandroidx/ink/geometry/MutableVec;)V", "Landroidx/ink/geometry/ImmutableBox;", "createBounds", "(J)Landroidx/ink/geometry/ImmutableBox;", "triangleToThisTransformA", "triangleToThisTransformB", "triangleToThisTransformC", "triangleToThisTransformD", "triangleToThisTransformE", "triangleToThisTransformF", "triangleCoverage", "(JFFFFFFFFFFFF)F", "boxXMin", "boxYMin", "boxXMax", "boxYMax", "boxToThisTransformA", "boxToThisTransformB", "boxToThisTransformC", "boxToThisTransformD", "boxToThisTransformE", "boxToThisTransformF", "boxCoverage", "(JFFFFFFFFFF)F", "parallelogramCenterX", "parallelogramCenterY", "parallelogramWidth", "parallelogramHeight", "parallelogramAngleInRadian", "parallelogramShearFactor", "parallelogramToThisTransformA", "parallelogramToThisTransformB", "parallelogramToThisTransformC", "parallelogramToThisTransformD", "parallelogramToThisTransformE", "parallelogramToThisTransformF", "parallelogramCoverage", "otherShapeNativePointer", "otherShapeToThisTransformA", "otherShapeToThisTransformB", "otherShapeToThisTransformC", "otherShapeToThisTransformD", "otherShapeToThisTransformE", "otherShapeToThisTransformF", "partitionedMeshCoverage", "(JJFFFFFF)F", "coverageThreshold", "", "triangleCoverageIsGreaterThan", "(JFFFFFFFFFFFFF)Z", "boxCoverageIsGreaterThan", "(JFFFFFFFFFFF)Z", "parallelogramCoverageIsGreaterThan", "partitionedMeshCoverageIsGreaterThan", "(JJFFFFFFF)Z", "initializeSpatialIndex", "isSpatialIndexInitialized", "(J)Z", "ink-geometry"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class PartitionedMeshNative {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final PartitionedMeshNative f65441OooO00o = new PartitionedMeshNative();

    static {
        o000OOoO.OooO00o.f82887OooO00o.OooO00o();
    }

    @UsedByNative
    public final native float boxCoverage(long nativePointer, float boxXMin, float boxYMin, float boxXMax, float boxYMax, float boxToThisTransformA, float boxToThisTransformB, float boxToThisTransformC, float boxToThisTransformD, float boxToThisTransformE, float boxToThisTransformF);

    @UsedByNative
    public final native boolean boxCoverageIsGreaterThan(long nativePointer, float boxXMin, float boxYMin, float boxXMax, float boxYMax, float coverageThreshold, float boxToThisTransformA, float boxToThisTransformB, float boxToThisTransformC, float boxToThisTransformD, float boxToThisTransformE, float boxToThisTransformF);

    @UsedByNative
    public final native ImmutableBox createBounds(long nativePointer);

    @UsedByNative
    public final native long createEmptyForTesting();

    @UsedByNative
    public final native long createFromTriangleForTesting(float triangleP0X, float triangleP0Y, float triangleP1X, float triangleP1Y, float triangleP2X, float triangleP2Y);

    @UsedByNative
    public final native void free(long nativePointer);

    @UsedByNative
    public final native int getOutlineCount(long nativePointer, int groupIndex);

    @UsedByNative
    public final native int getOutlineVertexCount(long nativePointer, int groupIndex, int outlineIndex);

    @UsedByNative
    public final native int getRenderGroupCount(long nativePointer);

    @UsedByNative
    public final native long[] getRenderGroupMeshPointers(long nativePointer, int groupIndex);

    @UsedByNative
    public final native void initializeSpatialIndex(long nativePointer);

    @UsedByNative
    public final native boolean isSpatialIndexInitialized(long nativePointer);

    @UsedByNative
    public final native long newCopyOfRenderGroupFormat(long nativePointer, int groupIndex);

    @UsedByNative
    public final native float parallelogramCoverage(long nativePointer, float parallelogramCenterX, float parallelogramCenterY, float parallelogramWidth, float parallelogramHeight, float parallelogramAngleInRadian, float parallelogramShearFactor, float parallelogramToThisTransformA, float parallelogramToThisTransformB, float parallelogramToThisTransformC, float parallelogramToThisTransformD, float parallelogramToThisTransformE, float parallelogramToThisTransformF);

    @UsedByNative
    public final native boolean parallelogramCoverageIsGreaterThan(long nativePointer, float parallelogramCenterX, float parallelogramCenterY, float parallelogramWidth, float parallelogramHeight, float parallelogramAngleInRadian, float parallelogramShearFactor, float coverageThreshold, float parallelogramToThisTransformA, float parallelogramToThisTransformB, float parallelogramToThisTransformC, float parallelogramToThisTransformD, float parallelogramToThisTransformE, float parallelogramToThisTransformF);

    @UsedByNative
    public final native float partitionedMeshCoverage(long nativePointer, long otherShapeNativePointer, float otherShapeToThisTransformA, float otherShapeToThisTransformB, float otherShapeToThisTransformC, float otherShapeToThisTransformD, float otherShapeToThisTransformE, float otherShapeToThisTransformF);

    @UsedByNative
    public final native boolean partitionedMeshCoverageIsGreaterThan(long nativePointer, long otherShapeNativePointer, float coverageThreshold, float otherShapeToThisTransformA, float otherShapeToThisTransformB, float otherShapeToThisTransformC, float otherShapeToThisTransformD, float otherShapeToThisTransformE, float otherShapeToThisTransformF);

    @UsedByNative
    public final native void populateOutlineVertexPosition(long nativePointer, int groupIndex, int outlineIndex, int outlineVertexIndex, MutableVec outPosition);

    @UsedByNative
    public final native float triangleCoverage(long nativePointer, float triangleP0X, float triangleP0Y, float triangleP1X, float triangleP1Y, float triangleP2X, float triangleP2Y, float triangleToThisTransformA, float triangleToThisTransformB, float triangleToThisTransformC, float triangleToThisTransformD, float triangleToThisTransformE, float triangleToThisTransformF);

    @UsedByNative
    public final native boolean triangleCoverageIsGreaterThan(long nativePointer, float triangleP0X, float triangleP0Y, float triangleP1X, float triangleP1Y, float triangleP2X, float triangleP2Y, float coverageThreshold, float triangleToThisTransformA, float triangleToThisTransformB, float triangleToThisTransformC, float triangleToThisTransformD, float triangleToThisTransformE, float triangleToThisTransformF);
}
