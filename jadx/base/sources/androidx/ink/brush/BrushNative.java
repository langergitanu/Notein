package androidx.ink.brush;

import androidx.ink.nativeloader.UsedByNative;
import com.orion.penkit.tools.DrawToolFactory;
import kotlin.Metadata;
import o000OOoO.OooO00o;

/* JADX INFO: loaded from: classes.dex */
@UsedByNative
@Metadata(m80611d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JP\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0087 ¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0019\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u001a\u0010\u0016¨\u0006\u001b"}, m80612d2 = {"Landroidx/ink/brush/BrushNative;", "", "<init>", "()V", "", "familyNativePointer", "", "colorRed", "colorGreen", "colorBlue", "colorAlpha", "", "colorSpace", "size", "epsilon", "create", "(JFFFFIFF)J", "nativePointer", "LoO00ooO/OooOooO;", DrawToolFactory.LASSO_TYPE_FREE, "(J)V", "computeComposeColorLong", "(J)J", "getSize", "(J)F", "getEpsilon", "newCopyOfBrushFamily", "ink-brush"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class BrushNative {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final BrushNative f65348OooO00o = new BrushNative();

    static {
        OooO00o.f82887OooO00o.OooO00o();
    }

    @UsedByNative
    public final native long computeComposeColorLong(long nativePointer);

    @UsedByNative
    public final native long create(long familyNativePointer, float colorRed, float colorGreen, float colorBlue, float colorAlpha, int colorSpace, float size, float epsilon);

    @UsedByNative
    public final native void free(long nativePointer);

    @UsedByNative
    public final native float getEpsilon(long nativePointer);

    @UsedByNative
    public final native float getSize(long nativePointer);

    @UsedByNative
    public final native long newCopyOfBrushFamily(long nativePointer);
}
