package o0oooOo0;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: o0oooOo0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31859OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f113555OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f113556OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Map<String, List<String>> f113557OooO0OO;

    /* JADX INFO: renamed from: o0oooOo0.OooO0O0$OooO00o */
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Map<String, List<String>> f113558OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f113559OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public String f113560OooO0OO;
    }

    public C31859OooO0O0(OooO00o oooO00o) {
        this.f113555OooO00o = oooO00o.f113559OooO0O0;
        this.f113556OooO0O0 = oooO00o.f113560OooO0OO;
        this.f113557OooO0OO = oooO00o.f113558OooO00o;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{code:");
        sb.append(this.f113555OooO00o);
        sb.append(", body:");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f113556OooO0O0, "}");
    }
}
