package androidx.ink.brush.behavior;

import androidx.ink.nativeloader.UsedByNative;
import kotlin.Metadata;
import o000OOoO.OooO00o;

/* JADX INFO: loaded from: classes.dex */
@UsedByNative
@Metadata(m80611d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0087 J\u0011\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0005H\u0087 J\u0011\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005H\u0087 ¨\u0006\r"}, m80612d2 = {"Landroidx/ink/brush/behavior/DampingNodeNative;", "", "<init>", "()V", "create", "", "dampingSource", "", "dampingGap", "", "getDampingSourceInt", "nativePointer", "getDampingGap", "ink-brush"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class DampingNodeNative {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final DampingNodeNative f65359OooO00o = new DampingNodeNative();

    static {
        OooO00o.f82887OooO00o.OooO00o();
    }

    @UsedByNative
    public final native long create(int dampingSource, float dampingGap);

    @UsedByNative
    public final native float getDampingGap(long nativePointer);

    @UsedByNative
    public final native int getDampingSourceInt(long nativePointer);
}
