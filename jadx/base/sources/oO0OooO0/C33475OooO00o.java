package oO0OooO0;

import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import kotlin.jvm.internal.OooOOO0;
import oO0o0O0o.C33595OooOOo;

/* JADX INFO: renamed from: oO0OooO0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33475OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C33477OooO0OO f120965OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C33479OooO0o f120966OooO0O0;

    static {
        C33477OooO0OO.OooOO0(C33482OooO0oo.f120987OooO0o);
    }

    public C33475OooO00o(C33477OooO0OO packageName, C33479OooO0o c33479OooO0o) {
        OooOOO0.OooO0oO(packageName, "packageName");
        this.f120965OooO00o = packageName;
        this.f120966OooO0O0 = c33479OooO0o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33475OooO00o)) {
            return false;
        }
        C33475OooO00o c33475OooO00o = (C33475OooO00o) obj;
        return OooOOO0.OooO0O0(this.f120965OooO00o, c33475OooO00o.f120965OooO00o) && this.f120966OooO0O0.equals(c33475OooO00o.f120966OooO0O0);
    }

    public final int hashCode() {
        return (this.f120966OooO0O0.hashCode() + (this.f120965OooO00o.hashCode() * 961)) * 31;
    }

    public final String toString() {
        String str = C33595OooOOo.OooOo0(this.f120965OooO00o.OooO0O0(), FilenameUtils.EXTENSION_SEPARATOR, IOUtils.DIR_SEPARATOR_UNIX) + "/" + this.f120966OooO0O0;
        OooOOO0.OooO0o(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }
}
