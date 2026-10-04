package o00o0OO;

import java.io.File;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o00o0OO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25327OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final File f86173OooO00o;

    public C25327OooO00o(File file) {
        this.f86173OooO00o = file;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C25327OooO00o)) {
            return false;
        }
        return OooOOO0.OooO0O0(this.f86173OooO00o, ((C25327OooO00o) obj).f86173OooO00o);
    }

    public final int hashCode() {
        return this.f86173OooO00o.hashCode();
    }
}
