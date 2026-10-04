package androidx.ink.brush;

import androidx.ink.nativeloader.UsedByNative;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.orion.penkit.tools.DrawToolFactory;
import kotlin.Metadata;
import o000OOoO.OooO00o;

/* JADX INFO: loaded from: classes.dex */
@UsedByNative
@Metadata(m80611d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0087 ¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0087 ¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0006H\u0087 ¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0006H\u0087 ¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0006H\u0087 ¢\u0006\u0004\b\u0016\u0010\u0015J\u0018\u0010\u0017\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0087 ¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0006H\u0087 ¢\u0006\u0004\b\u0019\u0010\u0013J\u0018\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u0006H\u0087 ¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\u001e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0011H\u0087 ¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0006H\u0087 ¢\u0006\u0004\b \u0010\u0013J\u0018\u0010!\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0087 ¢\u0006\u0004\b!\u0010\u0018¨\u0006\""}, m80612d2 = {"Landroidx/ink/brush/BrushFamilyNative;", "", "<init>", "()V", "", "coatNativePointers", "", "inputModelPointer", "", "clientBrushFamilyId", "developerComment", "create", "([JJLjava/lang/String;Ljava/lang/String;)J", "nativePointer", "LoO00ooO/OooOooO;", DrawToolFactory.LASSO_TYPE_FREE, "(J)V", "", "getBrushCoatCount", "(J)I", "getClientBrushFamilyId", "(J)Ljava/lang/String;", "getDeveloperComment", "getTextureAnimationLoopDurationMillis", "(J)J", "calculateMinimumRequiredVersion", "", "hasFallbacks", "(J)Z", FirebaseAnalytics.Param.INDEX, "newCopyOfBrushCoat", "(JI)J", "getInputModelType", "newCopyOfInputModel", "ink-brush"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class BrushFamilyNative {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final BrushFamilyNative f65347OooO00o = new BrushFamilyNative();

    static {
        OooO00o.f82887OooO00o.OooO00o();
    }

    @UsedByNative
    public final native int calculateMinimumRequiredVersion(long nativePointer);

    @UsedByNative
    public final native long create(long[] coatNativePointers, long inputModelPointer, String clientBrushFamilyId, String developerComment);

    @UsedByNative
    public final native void free(long nativePointer);

    @UsedByNative
    public final native int getBrushCoatCount(long nativePointer);

    @UsedByNative
    public final native String getClientBrushFamilyId(long nativePointer);

    @UsedByNative
    public final native String getDeveloperComment(long nativePointer);

    @UsedByNative
    public final native int getInputModelType(long nativePointer);

    @UsedByNative
    public final native long getTextureAnimationLoopDurationMillis(long nativePointer);

    @UsedByNative
    public final native boolean hasFallbacks(long nativePointer);

    @UsedByNative
    public final native long newCopyOfBrushCoat(long nativePointer, int index);

    @UsedByNative
    public final native long newCopyOfInputModel(long nativePointer);
}
