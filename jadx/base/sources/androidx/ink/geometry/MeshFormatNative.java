package androidx.ink.geometry;

import androidx.ink.nativeloader.UsedByNative;
import com.orion.penkit.tools.DrawToolFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@UsedByNative
@Metadata(m80611d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\b\u0010\tJ \u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\n\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m80612d2 = {"Landroidx/ink/geometry/MeshFormatNative;", "", "<init>", "()V", "", "nativePointer", "otherNativePointer", "", "isPackedEquivalent", "(JJ)Z", "isUnpackedEquivalent", "", "attributeCount", "(J)I", "LoO00ooO/OooOooO;", DrawToolFactory.LASSO_TYPE_FREE, "(J)V", "ink-geometry"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class MeshFormatNative {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final MeshFormatNative f65387OooO00o = new MeshFormatNative();

    static {
        o000OOoO.OooO00o.f82887OooO00o.OooO00o();
    }

    @UsedByNative
    public final native int attributeCount(long nativePointer);

    @UsedByNative
    public final native void free(long nativePointer);

    @UsedByNative
    public final native boolean isPackedEquivalent(long nativePointer, long otherNativePointer);

    @UsedByNative
    public final native boolean isUnpackedEquivalent(long nativePointer, long otherNativePointer);
}
