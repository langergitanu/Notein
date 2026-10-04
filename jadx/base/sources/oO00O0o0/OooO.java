package oO00O0o0;

import java.util.Locale;
import oO0o0O0o.C33595OooOOo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f115509OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f115510OooO0O0;

    public OooO(String name, String value) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
        this.f115509OooO00o = name;
        this.f115510OooO0O0 = value;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof OooO)) {
            return false;
        }
        OooO oooO = (OooO) obj;
        return C33595OooOOo.OooOOo(oooO.f115509OooO00o, this.f115509OooO00o, true) && C33595OooOOo.OooOOo(oooO.f115510OooO0O0, this.f115510OooO0O0, true);
    }

    public final int hashCode() {
        Locale locale = Locale.ROOT;
        String lowerCase = this.f115509OooO00o.toLowerCase(locale);
        kotlin.jvm.internal.OooOOO0.OooO0o(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        int iHashCode = lowerCase.hashCode();
        String lowerCase2 = this.f115510OooO0O0.toLowerCase(locale);
        kotlin.jvm.internal.OooOOO0.OooO0o(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase2.hashCode() + (iHashCode * 31) + iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeaderValueParam(name=");
        sb.append(this.f115509OooO00o);
        sb.append(", value=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f115510OooO0O0, ", escapeValue=false)");
    }
}
