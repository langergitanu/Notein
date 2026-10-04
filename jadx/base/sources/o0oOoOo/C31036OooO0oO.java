package o0oOoOo;

import java.util.List;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0oOoOo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31036OooO0oO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final List<C31036OooO0oO> f110808OooO0OO = C34429OooOOo0.OooOO0o(new C31036OooO0oO("yy/MM/dd", true), new C31036OooO0oO("yyyy.MM.dd", false), new C31036OooO0oO("MM/dd/yy", false), new C31036OooO0oO("MM.dd.yyyy", false), new C31036OooO0oO("dd/MM/yy", false), new C31036OooO0oO("dd.MM.yyyy", false));

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f110809OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f110810OooO0O0;

    public C31036OooO0oO(String format, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(format, "format");
        this.f110809OooO00o = format;
        this.f110810OooO0O0 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31036OooO0oO)) {
            return false;
        }
        C31036OooO0oO c31036OooO0oO = (C31036OooO0oO) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110809OooO00o, c31036OooO0oO.f110809OooO00o) && this.f110810OooO0O0 == c31036OooO0oO.f110810OooO0O0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f110810OooO0O0) + (this.f110809OooO00o.hashCode() * 31);
    }

    public final String toString() {
        return "DateFormatVO(format=" + this.f110809OooO00o + ", isSelected=" + this.f110810OooO0O0 + ")";
    }
}
