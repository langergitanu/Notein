package o00O0O;

import android.view.KeyEvent;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final KeyEvent f84203OooO00o;

    public final boolean equals(Object obj) {
        if (obj instanceof OooO0O0) {
            return OooOOO0.OooO0O0(this.f84203OooO00o, ((OooO0O0) obj).f84203OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f84203OooO00o.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f84203OooO00o + ')';
    }
}
