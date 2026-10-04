package o0oOoOo;

import java.util.Map;

/* JADX INFO: renamed from: o0oOoOo.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31057OooOoo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f110879OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f110880OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Map<String, String> f110881OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Map<String, String> f110882OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f110883OooO0o0;

    public C31057OooOoo0(String id, String str, Map<String, String> title, Map<String, String> content, long j) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(id, "id");
        kotlin.jvm.internal.OooOOO0.OooO0oO(title, "title");
        kotlin.jvm.internal.OooOOO0.OooO0oO(content, "content");
        this.f110879OooO00o = id;
        this.f110880OooO0O0 = str;
        this.f110881OooO0OO = title;
        this.f110882OooO0Oo = content;
        this.f110883OooO0o0 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31057OooOoo0)) {
            return false;
        }
        C31057OooOoo0 c31057OooOoo0 = (C31057OooOoo0) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110879OooO00o, c31057OooOoo0.f110879OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110880OooO0O0, c31057OooOoo0.f110880OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110881OooO0OO, c31057OooOoo0.f110881OooO0OO) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110882OooO0Oo, c31057OooOoo0.f110882OooO0Oo) && this.f110883OooO0o0 == c31057OooOoo0.f110883OooO0o0;
    }

    public final int hashCode() {
        int iHashCode = this.f110879OooO00o.hashCode() * 31;
        String str = this.f110880OooO0O0;
        return Long.hashCode(this.f110883OooO0o0) + ((this.f110882OooO0Oo.hashCode() + ((this.f110881OooO0OO.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NoteinMessageVO(id=");
        sb.append(this.f110879OooO00o);
        sb.append(", uid=");
        sb.append(this.f110880OooO0O0);
        sb.append(", title=");
        sb.append(this.f110881OooO0OO);
        sb.append(", content=");
        sb.append(this.f110882OooO0Oo);
        sb.append(", creationTime=");
        return android.support.v4.media.session.OooO00o.OooO00o(this.f110883OooO0o0, ")", sb);
    }
}
