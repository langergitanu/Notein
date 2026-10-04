package androidx.ink.brush;

import androidx.ink.nativeloader.UsedByNative;
import kotlin.Metadata;
import o000OOoO.OooO00o;

/* JADX INFO: loaded from: classes.dex */
@UsedByNative
@Metadata(m80611d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0087 J\u0011\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0005H\u0087 J\u0011\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0005H\u0087 J\u0011\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0005H\u0087 J\u0011\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0005H\u0087 J\u0011\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0087 J\u0011\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0005H\u0087 ¨\u0006\u0016"}, m80612d2 = {"Landroidx/ink/brush/StampingTextureNative;", "", "<init>", "()V", "create", "", "clientTextureId", "", "animationFrames", "", "animationRows", "animationColumns", "animationDurationMillis", "animationRepeatMode", "blendMode", "getClientTextureId", "nativePointer", "getAnimationFrames", "getAnimationRows", "getAnimationColumns", "getAnimationDurationMillis", "getAnimationRepeatModeInt", "ink-brush"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class StampingTextureNative {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final StampingTextureNative f65353OooO00o = new StampingTextureNative();

    static {
        OooO00o.f82887OooO00o.OooO00o();
    }

    @UsedByNative
    public final native long create(String clientTextureId, int animationFrames, int animationRows, int animationColumns, long animationDurationMillis, int animationRepeatMode, int blendMode);

    @UsedByNative
    public final native int getAnimationColumns(long nativePointer);

    @UsedByNative
    public final native long getAnimationDurationMillis(long nativePointer);

    @UsedByNative
    public final native int getAnimationFrames(long nativePointer);

    @UsedByNative
    public final native int getAnimationRepeatModeInt(long nativePointer);

    @UsedByNative
    public final native int getAnimationRows(long nativePointer);

    @UsedByNative
    public final native String getClientTextureId(long nativePointer);
}
