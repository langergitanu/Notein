package androidx.ink.geometry;

import androidx.ink.nativeloader.UsedByNative;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@UsedByNative
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m80612d2 = {"Landroidx/ink/geometry/Vec;", "", "<init>", "()V", "OooO00o", "ink-geometry"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public abstract class Vec {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f65442OooO00o = 0;

    public static final class OooO00o {
        public static boolean OooO00o(Vec first, Vec second) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(first, "first");
            kotlin.jvm.internal.OooOOO0.OooO0oO(second, "second");
            return first.getF65384OooO0O0() == second.getF65384OooO0O0() && first.getF65385OooO0OO() == second.getF65385OooO0OO();
        }
    }

    static {
        new ImmutableVec(0.0f, 0.0f);
    }

    /* JADX INFO: renamed from: OooO00o */
    public abstract float getF65384OooO0O0();

    /* JADX INFO: renamed from: OooO0O0 */
    public abstract float getF65385OooO0OO();
}
