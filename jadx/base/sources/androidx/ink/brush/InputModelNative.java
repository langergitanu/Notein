package androidx.ink.brush;

import androidx.ink.nativeloader.UsedByNative;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.penkit.tools.DrawToolFactory;
import kotlin.Metadata;
import o000OOoO.OooO00o;

/* JADX INFO: loaded from: classes.dex */
@UsedByNative
@Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0087 ¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H\u0087 ¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0017\u0010\b¨\u0006\u0018"}, m80612d2 = {"Landroidx/ink/brush/InputModelNative;", "", "<init>", "()V", "", "nativePointer", "", "calculateMinimumRequiredVersion", "(J)I", C18437z2.f56754h, "createNoParametersModel", "(I)J", "windowDurationMillis", "upsamplingFrequencyHz", "createSlidingWindowModel", "(JI)J", "createSlidingWindowModelWithDefaultParameters", "()J", "LoO00ooO/OooOooO;", DrawToolFactory.LASSO_TYPE_FREE, "(J)V", "getSlidingWindowDurationMillis", "(J)J", "getSlidingUpsamplingFrequencyHz", "ink-brush"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class InputModelNative {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final InputModelNative f65352OooO00o = new InputModelNative();

    static {
        OooO00o.f82887OooO00o.OooO00o();
    }

    @UsedByNative
    public final native int calculateMinimumRequiredVersion(long nativePointer);

    @UsedByNative
    public final native long createNoParametersModel(int type);

    @UsedByNative
    public final native long createSlidingWindowModel(long windowDurationMillis, int upsamplingFrequencyHz);

    @UsedByNative
    public final native long createSlidingWindowModelWithDefaultParameters();

    @UsedByNative
    public final native void free(long nativePointer);

    @UsedByNative
    public final native int getSlidingUpsamplingFrequencyHz(long nativePointer);

    @UsedByNative
    public final native long getSlidingWindowDurationMillis(long nativePointer);
}
