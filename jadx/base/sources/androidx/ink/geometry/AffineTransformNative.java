package androidx.ink.geometry;

import androidx.ink.nativeloader.UsedByNative;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@UsedByNative
@Metadata(m80611d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jx\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0087 ¢\u0006\u0004\b\u0014\u0010\u0015Jp\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m80612d2 = {"Landroidx/ink/geometry/AffineTransformNative;", "", "<init>", "()V", "", "affineTransformA", "affineTransformB", "affineTransformC", "affineTransformD", "affineTransformE", "affineTransformF", "parallelogramCenterX", "parallelogramCenterY", "parallelogramWidth", "parallelogramHeight", "parallelogramRotationDegrees", "parallelogramShearFactor", "Landroidx/ink/geometry/MutableParallelogram;", "out", "LoO00ooO/OooOooO;", "populateTransformedParallelogram", "(FFFFFFFFFFFFLandroidx/ink/geometry/MutableParallelogram;)V", "Landroidx/ink/geometry/ImmutableParallelogram;", "createTransformedParallelogram", "(FFFFFFFFFFFF)Landroidx/ink/geometry/ImmutableParallelogram;", "ink-geometry"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class AffineTransformNative {
    static {
        new AffineTransformNative();
        o000OOoO.OooO00o.f82887OooO00o.OooO00o();
    }

    @UsedByNative
    public final native ImmutableParallelogram createTransformedParallelogram(float affineTransformA, float affineTransformB, float affineTransformC, float affineTransformD, float affineTransformE, float affineTransformF, float parallelogramCenterX, float parallelogramCenterY, float parallelogramWidth, float parallelogramHeight, float parallelogramRotationDegrees, float parallelogramShearFactor);

    @UsedByNative
    public final native void populateTransformedParallelogram(float affineTransformA, float affineTransformB, float affineTransformC, float affineTransformD, float affineTransformE, float affineTransformF, float parallelogramCenterX, float parallelogramCenterY, float parallelogramWidth, float parallelogramHeight, float parallelogramRotationDegrees, float parallelogramShearFactor, MutableParallelogram out);
}
