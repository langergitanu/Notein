package o0oOoOo;

import OooOoo0.o00000;
import android.net.Uri;

/* JADX INFO: renamed from: o0oOoOo.OoooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31078OoooOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Uri f110914OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f110915OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f110916OooO0OO;

    public C31078OoooOo0(Uri uri, boolean z, boolean z2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(uri, "uri");
        this.f110914OooO00o = uri;
        this.f110915OooO0O0 = z;
        this.f110916OooO0OO = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31078OoooOo0)) {
            return false;
        }
        C31078OoooOo0 c31078OoooOo0 = (C31078OoooOo0) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110914OooO00o, c31078OoooOo0.f110914OooO00o) && this.f110915OooO0O0 == c31078OoooOo0.f110915OooO0O0 && this.f110916OooO0OO == c31078OoooOo0.f110916OooO0OO;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f110916OooO0OO) + o00000.OooO0O0(this.f110914OooO00o.hashCode() * 31, 31, this.f110915OooO0O0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerPreviewVO(uri=");
        sb.append(this.f110914OooO00o);
        sb.append(", isSVG=");
        sb.append(this.f110915OooO0O0);
        sb.append(", removeAble=");
        return androidx.appcompat.app.OooOOO.OooO00o(sb, ")", this.f110916OooO0OO);
    }
}
