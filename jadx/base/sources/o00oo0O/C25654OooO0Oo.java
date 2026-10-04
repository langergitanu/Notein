package o00oo0O;

import com.aspose.slides.Oooo0;
import java.util.Arrays;

/* JADX INFO: renamed from: o00oo0O.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25654OooO0Oo {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C25654OooO0Oo f87571OooO0O0 = new C25654OooO0Oo(false);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final C25654OooO0Oo f87572OooO0OO = new C25654OooO0Oo(true);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f87573OooO00o;

    public C25654OooO0Oo(boolean z) {
        this.f87573OooO00o = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C25654OooO0Oo)) {
            return false;
        }
        C25654OooO0Oo c25654OooO0Oo = (C25654OooO0Oo) obj;
        c25654OooO0Oo.getClass();
        return this.f87573OooO00o == c25654OooO0Oo.f87573OooO00o;
    }

    public final int hashCode() {
        Integer num = -1;
        return Oooo0.OooO00o(num.hashCode(), 31, 31, Boolean.valueOf(this.f87573OooO00o).hashCode());
    }

    public final String toString() {
        return String.format(null, "%d defer:%b", Arrays.copyOf(new Object[]{-1, Boolean.valueOf(this.f87573OooO00o)}, 2));
    }
}
