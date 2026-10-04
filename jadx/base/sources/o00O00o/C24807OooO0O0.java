package o00O00o;

import Oooo0.C20855OooooOO;
import Oooo0oO.C21023OooO0Oo;
import android.graphics.Rect;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o00O00o.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24807OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f84129OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f84130OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f84131OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f84132OooO0Oo;

    public C24807OooO0O0(Rect rect) {
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        this.f84129OooO00o = i;
        this.f84130OooO0O0 = i2;
        this.f84131OooO0OO = i3;
        this.f84132OooO0Oo = i4;
        if (i > i3) {
            throw new IllegalArgumentException(C20855OooooOO.OooO0OO(i, i3, "Left must be less than or equal to right, left: ", ", right: ").toString());
        }
        if (i2 > i4) {
            throw new IllegalArgumentException(C20855OooooOO.OooO0OO(i2, i4, "top must be less than or equal to bottom, top: ", ", bottom: ").toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C24807OooO0O0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        C24807OooO0O0 c24807OooO0O0 = (C24807OooO0O0) obj;
        return this.f84129OooO00o == c24807OooO0O0.f84129OooO00o && this.f84130OooO0O0 == c24807OooO0O0.f84130OooO0O0 && this.f84131OooO0OO == c24807OooO0O0.f84131OooO0OO && this.f84132OooO0Oo == c24807OooO0O0.f84132OooO0Oo;
    }

    public final int hashCode() {
        return (((((this.f84129OooO00o * 31) + this.f84130OooO0O0) * 31) + this.f84131OooO0OO) * 31) + this.f84132OooO0Oo;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C24807OooO0O0.class.getSimpleName());
        sb.append(" { [");
        sb.append(this.f84129OooO00o);
        sb.append(',');
        sb.append(this.f84130OooO0O0);
        sb.append(',');
        sb.append(this.f84131OooO0OO);
        sb.append(',');
        return C21023OooO0Oo.OooO0OO("] }", this.f84132OooO0Oo, sb);
    }
}
