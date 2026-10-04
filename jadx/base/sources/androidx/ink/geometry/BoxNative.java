package androidx.ink.geometry;

import androidx.ink.nativeloader.UsedByNative;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@UsedByNative
@Metadata(m80611d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\n\u0010\u000bJ8\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0087 ¢\u0006\u0004\b\u000f\u0010\u0010J@\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0014\u0010\u0015JP\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m80612d2 = {"Landroidx/ink/geometry/BoxNative;", "", "<init>", "()V", "", "rectXMin", "rectYMin", "rectXMax", "rectYMax", "Landroidx/ink/geometry/ImmutableVec;", "createCenter", "(FFFF)Landroidx/ink/geometry/ImmutableVec;", "Landroidx/ink/geometry/MutableVec;", "out", "LoO00ooO/OooOooO;", "populateCenter", "(FFFFLandroidx/ink/geometry/MutableVec;)V", "pointX", "pointY", "", "containsPoint", "(FFFFFF)Z", "otherXMin", "otherYMin", "otherXMax", "otherYMax", "containsBox", "(FFFFFFFF)Z", "ink-geometry"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class BoxNative {
    static {
        new BoxNative();
        o000OOoO.OooO00o.f82887OooO00o.OooO00o();
    }

    @UsedByNative
    public final native boolean containsBox(float rectXMin, float rectYMin, float rectXMax, float rectYMax, float otherXMin, float otherYMin, float otherXMax, float otherYMax);

    @UsedByNative
    public final native boolean containsPoint(float rectXMin, float rectYMin, float rectXMax, float rectYMax, float pointX, float pointY);

    @UsedByNative
    public final native ImmutableVec createCenter(float rectXMin, float rectYMin, float rectXMax, float rectYMax);

    @UsedByNative
    public final native void populateCenter(float rectXMin, float rectYMin, float rectXMax, float rectYMax, MutableVec out);
}
