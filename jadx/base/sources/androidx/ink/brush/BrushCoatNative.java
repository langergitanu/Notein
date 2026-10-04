package androidx.ink.brush;

import androidx.ink.nativeloader.UsedByNative;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.orion.penkit.tools.DrawToolFactory;
import kotlin.Metadata;
import o000OOoO.OooO00o;

/* JADX INFO: loaded from: classes.dex */
@UsedByNative
@Metadata(m80611d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0087 ¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\f\u0010\rJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0018\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0014H\u0087 ¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u001a\u0010\u0016¨\u0006\u001b"}, m80612d2 = {"Landroidx/ink/brush/BrushCoatNative;", "", "<init>", "()V", "", "tipNativePointer", "", "paintPreferencesNativePointers", "create", "(J[J)J", "nativePointer", "LoO00ooO/OooOooO;", DrawToolFactory.LASSO_TYPE_FREE, "(J)V", "meshFormatNativePointer", "", "isCompatibleWithMeshFormat", "(JJ)Z", "newCopyOfBrushTip", "(J)J", "", "getBrushPaintPreferencesCount", "(J)I", FirebaseAnalytics.Param.INDEX, "newCopyOfBrushPaintPreference", "(JI)J", "calculateMinimumRequiredVersion", "ink-brush"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class BrushCoatNative {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final BrushCoatNative f65346OooO00o = new BrushCoatNative();

    static {
        OooO00o.f82887OooO00o.OooO00o();
    }

    @UsedByNative
    public final native int calculateMinimumRequiredVersion(long nativePointer);

    @UsedByNative
    public final native long create(long tipNativePointer, long[] paintPreferencesNativePointers);

    @UsedByNative
    public final native void free(long nativePointer);

    @UsedByNative
    public final native int getBrushPaintPreferencesCount(long nativePointer);

    @UsedByNative
    public final native boolean isCompatibleWithMeshFormat(long nativePointer, long meshFormatNativePointer);

    @UsedByNative
    public final native long newCopyOfBrushPaintPreference(long nativePointer, int index);

    @UsedByNative
    public final native long newCopyOfBrushTip(long nativePointer);
}
