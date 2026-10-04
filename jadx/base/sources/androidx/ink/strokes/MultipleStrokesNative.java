package androidx.ink.strokes;

import androidx.ink.nativeloader.UsedByNative;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.orion.penkit.tools.DrawToolFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@UsedByNative
@Metadata(m80611d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JP\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0087 ¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0011H\u0087 ¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m80612d2 = {"Landroidx/ink/strokes/MultipleStrokesNative;", "", "<init>", "()V", "", "targetStrokePointer", "", "transformA", "transformB", "transformC", "transformD", "transformE", "transformF", "tolerance", "createWithSplit", "(JFFFFFFF)J", "nativePointer", "", "getStrokeCount", "(J)I", FirebaseAnalytics.Param.INDEX, "releaseStroke", "(JI)J", "LoO00ooO/OooOooO;", DrawToolFactory.LASSO_TYPE_FREE, "(J)V", "ink-strokes"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class MultipleStrokesNative {
    static {
        new MultipleStrokesNative();
        o000OOoO.OooO00o.f82887OooO00o.OooO00o();
    }

    @UsedByNative
    public final native long createWithSplit(long targetStrokePointer, float transformA, float transformB, float transformC, float transformD, float transformE, float transformF, float tolerance);

    @UsedByNative
    public final native void free(long nativePointer);

    @UsedByNative
    public final native int getStrokeCount(long nativePointer);

    @UsedByNative
    public final native long releaseStroke(long nativePointer, int index);
}
