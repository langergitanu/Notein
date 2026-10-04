package OooooOO;

import OooOo.C20496Oooo0o0;
import OooOoO.C20505OooO0OO;
import OooOoo0.C20703o000000o;
import OooOoo0.C20706o00000oO;
import OooooO0.C21290OooO0o0;

/* JADX INFO: renamed from: OooooOO.o00oO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21362o00oO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final C21362o00oO0o f61780OooO0Oo = new C21362o00oO0o(C20496Oooo0o0.OooO0OO(4278190080L), C21290OooO0o0.f61718OooO0O0, 0.0f);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f61781OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f61782OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f61783OooO0OO;

    public C21362o00oO0o(long j, long j2, float f) {
        this.f61781OooO00o = j;
        this.f61782OooO0O0 = j2;
        this.f61783OooO0OO = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21362o00oO0o)) {
            return false;
        }
        C21362o00oO0o c21362o00oO0o = (C21362o00oO0o) obj;
        return C21348Ooooo0o.OooO0OO(this.f61781OooO00o, c21362o00oO0o.f61781OooO00o) && C21290OooO0o0.OooO00o(this.f61782OooO0O0, c21362o00oO0o.f61782OooO0O0) && this.f61783OooO0OO == c21362o00oO0o.f61783OooO0OO;
    }

    public final int hashCode() {
        int i = C21348Ooooo0o.f61767OooO0oo;
        return Float.hashCode(this.f61783OooO0OO) + C20703o000000o.OooO0O0(Long.hashCode(this.f61781OooO00o) * 31, 31, this.f61782OooO0O0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        C20706o00000oO.OooO0O0(this.f61781OooO00o, ", offset=", sb);
        sb.append((Object) C21290OooO0o0.OooO0oo(this.f61782OooO0O0));
        sb.append(", blurRadius=");
        return C20505OooO0OO.OooO0O0(sb, this.f61783OooO0OO, ')');
    }
}
