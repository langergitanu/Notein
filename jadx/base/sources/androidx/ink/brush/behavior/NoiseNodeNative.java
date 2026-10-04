package androidx.ink.brush.behavior;

import androidx.ink.nativeloader.UsedByNative;
import kotlin.Metadata;
import o000OOoO.OooO00o;

/* JADX INFO: loaded from: classes.dex */
@UsedByNative
@Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0087 J\u0011\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0005H\u0087 J\u0011\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0005H\u0087 J\u0011\u0010\u000e\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005H\u0087 ¨\u0006\u000f"}, m80612d2 = {"Landroidx/ink/brush/behavior/NoiseNodeNative;", "", "<init>", "()V", "create", "", "seed", "", "varyOver", "basePeriod", "", "getSeed", "nativePointer", "getVaryOverInt", "getBasePeriod", "ink-brush"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class NoiseNodeNative {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final NoiseNodeNative f65364OooO00o = new NoiseNodeNative();

    static {
        OooO00o.f82887OooO00o.OooO00o();
    }

    @UsedByNative
    public final native long create(int seed, int varyOver, float basePeriod);

    @UsedByNative
    public final native float getBasePeriod(long nativePointer);

    @UsedByNative
    public final native int getSeed(long nativePointer);

    @UsedByNative
    public final native int getVaryOverInt(long nativePointer);
}
