package o0oOoOo;

import OooOoo0.o00000;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: o0oOoOo.Ooooo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31081Ooooo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f110927OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f110928OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f110929OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f110930OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Map<String, String> f110931OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f110932OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Object f110933OooO0oO;

    public C31081Ooooo00(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Map<String, String> map, List<String> list) {
        this.f110927OooO00o = z;
        this.f110928OooO0O0 = z2;
        this.f110929OooO0OO = z3;
        this.f110930OooO0Oo = z4;
        this.f110932OooO0o0 = z5;
        this.f110931OooO0o = map;
        this.f110933OooO0oO = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31081Ooooo00)) {
            return false;
        }
        C31081Ooooo00 c31081Ooooo00 = (C31081Ooooo00) obj;
        return this.f110927OooO00o == c31081Ooooo00.f110927OooO00o && this.f110928OooO0O0 == c31081Ooooo00.f110928OooO0O0 && this.f110929OooO0OO == c31081Ooooo00.f110929OooO0OO && this.f110930OooO0Oo == c31081Ooooo00.f110930OooO0Oo && this.f110932OooO0o0 == c31081Ooooo00.f110932OooO0o0 && this.f110931OooO0o.equals(c31081Ooooo00.f110931OooO0o) && this.f110933OooO0oO.equals(c31081Ooooo00.f110933OooO0oO);
    }

    public final int hashCode() {
        return this.f110933OooO0oO.hashCode() + ((this.f110931OooO0o.hashCode() + o00000.OooO0O0(o00000.OooO0O0(o00000.OooO0O0(o00000.OooO0O0(Boolean.hashCode(this.f110927OooO00o) * 31, 31, this.f110928OooO0O0), 31, this.f110929OooO0OO), 31, this.f110930OooO0Oo), 31, this.f110932OooO0o0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SyncIssuesSummary(hasNetworkStrategyError=");
        sb.append(this.f110927OooO00o);
        sb.append(", hasAuthError=");
        sb.append(this.f110928OooO0O0);
        sb.append(", hasStorageFullError=");
        sb.append(this.f110929OooO0OO);
        sb.append(", hasVersionIncompatibleError=");
        sb.append(this.f110930OooO0Oo);
        sb.append(", hasHwComponentNotAvailableError=");
        sb.append(this.f110932OooO0o0);
        sb.append(", conflictFiles=");
        sb.append(this.f110931OooO0o);
        sb.append(", otherErrorIds=");
        return androidx.concurrent.futures.OooO0o.OooO0O0(sb, this.f110933OooO0oO, ")");
    }
}
