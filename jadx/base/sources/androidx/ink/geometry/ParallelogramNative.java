package androidx.ink.geometry;

import androidx.ink.nativeloader.UsedByNative;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@UsedByNative
@Metadata(m80611d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\f\u0010\rJH\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0087 ¢\u0006\u0004\b\u0011\u0010\u0012JF\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0015\u0010\u0016JP\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0087 ¢\u0006\u0004\b\u001a\u0010\u001bJF\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u001c\u0010\u0016J`\u0010!\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u0017H\u0087 ¢\u0006\u0004\b!\u0010\"JP\u0010&\u001a\u00020%2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b&\u0010'¨\u0006("}, m80612d2 = {"Landroidx/ink/geometry/ParallelogramNative;", "", "<init>", "()V", "", "centerX", "centerY", "width", "height", "rotationDegrees", "skew", "Landroidx/ink/geometry/ImmutableBox;", "createBoundingBox", "(FFFFFF)Landroidx/ink/geometry/ImmutableBox;", "Landroidx/ink/geometry/MutableBox;", "outBox", "LoO00ooO/OooOooO;", "populateBoundingBox", "(FFFFFFLandroidx/ink/geometry/MutableBox;)V", "", "Landroidx/ink/geometry/ImmutableVec;", "createSemiAxes", "(FFFFFF)[Landroidx/ink/geometry/ImmutableVec;", "Landroidx/ink/geometry/MutableVec;", "outAxis1", "outAxis2", "populateSemiAxes", "(FFFFFFLandroidx/ink/geometry/MutableVec;Landroidx/ink/geometry/MutableVec;)V", "createCorners", "outCorner1", "outCorner2", "outCorner3", "outCorner4", "populateCorners", "(FFFFFFLandroidx/ink/geometry/MutableVec;Landroidx/ink/geometry/MutableVec;Landroidx/ink/geometry/MutableVec;Landroidx/ink/geometry/MutableVec;)V", "pointX", "pointY", "", "contains", "(FFFFFFFF)Z", "ink-geometry"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class ParallelogramNative {
    static {
        new ParallelogramNative();
        o000OOoO.OooO00o.f82887OooO00o.OooO00o();
    }

    @UsedByNative
    public final native boolean contains(float centerX, float centerY, float width, float height, float rotationDegrees, float skew, float pointX, float pointY);

    @UsedByNative
    public final native ImmutableBox createBoundingBox(float centerX, float centerY, float width, float height, float rotationDegrees, float skew);

    @UsedByNative
    public final native ImmutableVec[] createCorners(float centerX, float centerY, float width, float height, float rotationDegrees, float skew);

    @UsedByNative
    public final native ImmutableVec[] createSemiAxes(float centerX, float centerY, float width, float height, float rotationDegrees, float skew);

    @UsedByNative
    public final native void populateBoundingBox(float centerX, float centerY, float width, float height, float rotationDegrees, float skew, MutableBox outBox);

    @UsedByNative
    public final native void populateCorners(float centerX, float centerY, float width, float height, float rotationDegrees, float skew, MutableVec outCorner1, MutableVec outCorner2, MutableVec outCorner3, MutableVec outCorner4);

    @UsedByNative
    public final native void populateSemiAxes(float centerX, float centerY, float width, float height, float rotationDegrees, float skew, MutableVec outAxis1, MutableVec outAxis2);
}
