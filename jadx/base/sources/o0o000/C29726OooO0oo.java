package o0o000;

import android.graphics.RectF;
import android.util.Size;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0o000.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29726OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RectF f105406OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Size f105407OooO0O0;

    public C29726OooO0oo(RectF rectF, Size screenSize) {
        OooOOO0.OooO0oO(screenSize, "screenSize");
        this.f105406OooO00o = rectF;
        this.f105407OooO0O0 = screenSize;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29726OooO0oo)) {
            return false;
        }
        C29726OooO0oo c29726OooO0oo = (C29726OooO0oo) obj;
        return OooOOO0.OooO0O0(this.f105406OooO00o, c29726OooO0oo.f105406OooO00o) && OooOOO0.OooO0O0(this.f105407OooO0O0, c29726OooO0oo.f105407OooO0O0);
    }

    public final int hashCode() {
        return this.f105407OooO0O0.hashCode() + (this.f105406OooO00o.hashCode() * 31);
    }

    public final String toString() {
        return "ScreenshotRoiInfo(bounds=" + this.f105406OooO00o + ", screenSize=" + this.f105407OooO0O0 + ")";
    }
}
