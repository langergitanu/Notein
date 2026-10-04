package o0oOoOo;

import android.net.Uri;

/* JADX INFO: renamed from: o0oOoOo.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31029OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f110771OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Uri f110772OooO0O0;

    public C31029OooO(Uri uri, String str) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(uri, "uri");
        this.f110771OooO00o = str;
        this.f110772OooO0O0 = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31029OooO)) {
            return false;
        }
        C31029OooO c31029OooO = (C31029OooO) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110771OooO00o, c31029OooO.f110771OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110772OooO0O0, c31029OooO.f110772OooO0O0);
    }

    public final int hashCode() {
        return this.f110772OooO0O0.hashCode() + (this.f110771OooO00o.hashCode() * 31);
    }

    public final String toString() {
        return "FeedbackPicVO(id=" + this.f110771OooO00o + ", uri=" + this.f110772OooO0O0 + ")";
    }
}
