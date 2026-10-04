package androidx.ink.rendering.android.canvas.internal;

import androidx.ink.nativeloader.UsedByNative;
import kotlin.Metadata;
import o000OOoO.OooO00o;

/* JADX INFO: loaded from: classes.dex */
@UsedByNative
@Metadata(m80611d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0096\u0001\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0087 ¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m80612d2 = {"Landroidx/ink/rendering/android/canvas/internal/CanvasMeshRendererNative;", "", "<init>", "()V", "", "meshFormatNativePointer", "", "isPacked", "", "attributeTypesOut", "attributeOffsetsBytesOut", "", "", "attributeNamesOut", "vertexStrideBytesOut", "varyingTypesOut", "varyingNamesOut", "uniformIdsOut", "uniformUnpackingIndicesOut", "uniformNamesOut", "vertexShaderOut", "fragmentShaderOut", "LoO00ooO/OooOooO;", "fillSkiaMeshSpecData", "(JZ[I[I[Ljava/lang/String;[I[I[Ljava/lang/String;[I[I[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)V", "ink-rendering"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class CanvasMeshRendererNative {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final CanvasMeshRendererNative f65444OooO00o = new CanvasMeshRendererNative();

    static {
        OooO00o.f82887OooO00o.OooO00o();
    }

    @UsedByNative
    public final native void fillSkiaMeshSpecData(long meshFormatNativePointer, boolean isPacked, int[] attributeTypesOut, int[] attributeOffsetsBytesOut, String[] attributeNamesOut, int[] vertexStrideBytesOut, int[] varyingTypesOut, String[] varyingNamesOut, int[] uniformIdsOut, int[] uniformUnpackingIndicesOut, String[] uniformNamesOut, String[] vertexShaderOut, String[] fragmentShaderOut);
}
