package androidx.ink.geometry;

import androidx.ink.nativeloader.UsedByNative;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@UsedByNative
@Metadata(m80611d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\b\u0010\tJ(\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0087 ¢\u0006\u0004\b\r\u0010\u000eJ0\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0013\u0010\u0014J0\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, m80612d2 = {"Landroidx/ink/geometry/VecNative;", "", "<init>", "()V", "", "vecX", "vecY", "Landroidx/ink/geometry/ImmutableVec;", "unitVec", "(FF)Landroidx/ink/geometry/ImmutableVec;", "Landroidx/ink/geometry/MutableVec;", "output", "LoO00ooO/OooOooO;", "populateUnitVec", "(FFLandroidx/ink/geometry/MutableVec;)V", "firstVecX", "firstVecY", "secondVecX", "secondVecY", "absoluteAngleBetweenInDegrees", "(FFFF)F", "signedAngleBetweenInDegrees", "ink-geometry"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class VecNative {
    static {
        new VecNative();
        o000OOoO.OooO00o.f82887OooO00o.OooO00o();
    }

    @UsedByNative
    public final native float absoluteAngleBetweenInDegrees(float firstVecX, float firstVecY, float secondVecX, float secondVecY);

    @UsedByNative
    public final native void populateUnitVec(float vecX, float vecY, MutableVec output);

    @UsedByNative
    public final native float signedAngleBetweenInDegrees(float firstVecX, float firstVecY, float secondVecX, float secondVecY);

    @UsedByNative
    public final native ImmutableVec unitVec(float vecX, float vecY);
}
