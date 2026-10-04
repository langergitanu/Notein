package androidx.ink.storage;

import androidx.ink.nativeloader.UsedByNative;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.orion.penkit.tools.DrawToolFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@UsedByNative
@Metadata(m80611d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u0006H\u0087 ¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000bH\u0087 ¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0006H\u0087 ¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000bH\u0087 ¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m80612d2 = {"Landroidx/ink/storage/MultipleBrushFamiliesNative;", "", "<init>", "()V", "", "brushFamilyByteArray", "", "length", "Landroidx/ink/storage/OnDecodeTexturePngBytes;", "onDecodeTexture", "maxVersion", "", "createFromProto", "([BILandroidx/ink/storage/OnDecodeTexturePngBytes;I)J", "nativePointer", "getBrushFamilyCount", "(J)I", FirebaseAnalytics.Param.INDEX, "releaseBrushFamily", "(JI)J", "LoO00ooO/OooOooO;", DrawToolFactory.LASSO_TYPE_FREE, "(J)V", "ink-storage"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class MultipleBrushFamiliesNative {
    public static final MultipleBrushFamiliesNative INSTANCE = new MultipleBrushFamiliesNative();

    static {
        o000OOoO.OooO00o.f82887OooO00o.OooO00o();
    }

    private MultipleBrushFamiliesNative() {
    }

    @UsedByNative
    public final native long createFromProto(byte[] brushFamilyByteArray, int length, OnDecodeTexturePngBytes onDecodeTexture, int maxVersion);

    @UsedByNative
    public final native void free(long nativePointer);

    @UsedByNative
    public final native int getBrushFamilyCount(long nativePointer);

    @UsedByNative
    public final native long releaseBrushFamily(long nativePointer, int index);
}
