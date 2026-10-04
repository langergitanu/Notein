package androidx.ink.brush;

import androidx.ink.nativeloader.UsedByNative;
import kotlin.Metadata;
import o000OOoO.OooO00o;

/* JADX INFO: loaded from: classes.dex */
@UsedByNative
@Metadata(m80611d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ja\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0087 J\u0011\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0005H\u0087 J\u0011\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0005H\u0087 J\u0011\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0005H\u0087 J\u0011\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0005H\u0087 J\u0011\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0005H\u0087 J\u0011\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0005H\u0087 J\u0011\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0005H\u0087 J\u0011\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0005H\u0087 J\u0011\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0005H\u0087 J\u0011\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0005H\u0087 ¨\u0006\u001f"}, m80612d2 = {"Landroidx/ink/brush/TilingTextureNative;", "", "<init>", "()V", "create", "", "clientTextureId", "", "sizeX", "", "sizeY", "offsetX", "offsetY", "rotationDegrees", "sizeUnit", "", "origin", "wrapX", "wrapY", "blendMode", "getClientTextureId", "nativePointer", "getSizeX", "getSizeY", "getOffsetX", "getOffsetY", "getRotationDegrees", "getSizeUnitInt", "getOriginInt", "getWrapXInt", "getWrapYInt", "ink-brush"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class TilingTextureNative {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final TilingTextureNative f65356OooO00o = new TilingTextureNative();

    static {
        OooO00o.f82887OooO00o.OooO00o();
    }

    @UsedByNative
    public final native long create(String clientTextureId, float sizeX, float sizeY, float offsetX, float offsetY, float rotationDegrees, int sizeUnit, int origin, int wrapX, int wrapY, int blendMode);

    @UsedByNative
    public final native String getClientTextureId(long nativePointer);

    @UsedByNative
    public final native float getOffsetX(long nativePointer);

    @UsedByNative
    public final native float getOffsetY(long nativePointer);

    @UsedByNative
    public final native int getOriginInt(long nativePointer);

    @UsedByNative
    public final native float getRotationDegrees(long nativePointer);

    @UsedByNative
    public final native int getSizeUnitInt(long nativePointer);

    @UsedByNative
    public final native float getSizeX(long nativePointer);

    @UsedByNative
    public final native float getSizeY(long nativePointer);

    @UsedByNative
    public final native int getWrapXInt(long nativePointer);

    @UsedByNative
    public final native int getWrapYInt(long nativePointer);
}
