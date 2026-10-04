package androidx.ink.brush;

import androidx.ink.nativeloader.UsedByNative;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.orion.penkit.tools.DrawToolFactory;
import kotlin.Metadata;
import o000OOoO.OooO00o;

/* JADX INFO: loaded from: classes.dex */
@UsedByNative
@Metadata(m80611d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0087 ¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH\u0087 ¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\bH\u0087 ¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000fH\u0087 ¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\bH\u0087 ¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0017\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000fH\u0087 ¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\bH\u0087 ¢\u0006\u0004\b\u0019\u0010\u0011¨\u0006\u001a"}, m80612d2 = {"Landroidx/ink/brush/BrushBehaviorNative;", "", "<init>", "()V", "", "orderdNodeNativePointers", "", "developerComment", "", "createFromOrderedNodes", "([JLjava/lang/String;)J", "nativePointer", "LoO00ooO/OooOooO;", DrawToolFactory.LASSO_TYPE_FREE, "(J)V", "", "getNodeCount", "(J)I", FirebaseAnalytics.Param.INDEX, "getNodeTypeInt", "(JI)I", "getDeveloperComment", "(J)Ljava/lang/String;", "newCopyOfNode", "(JI)J", "calculateMinimumRequiredVersion", "ink-brush"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class BrushBehaviorNative {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final BrushBehaviorNative f65345OooO00o = new BrushBehaviorNative();

    static {
        OooO00o.f82887OooO00o.OooO00o();
    }

    @UsedByNative
    public final native int calculateMinimumRequiredVersion(long nativePointer);

    @UsedByNative
    public final native long createFromOrderedNodes(long[] orderdNodeNativePointers, String developerComment);

    @UsedByNative
    public final native void free(long nativePointer);

    @UsedByNative
    public final native String getDeveloperComment(long nativePointer);

    @UsedByNative
    public final native int getNodeCount(long nativePointer);

    @UsedByNative
    public final native int getNodeTypeInt(long nativePointer, int index);

    @UsedByNative
    public final native long newCopyOfNode(long nativePointer, int index);
}
