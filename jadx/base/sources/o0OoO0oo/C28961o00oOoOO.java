package o0OoO0oo;

import android.graphics.PointF;

/* JADX INFO: renamed from: o0OoO0oo.o00oOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28961o00oOoOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f102615OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f102616OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final PointF f102617OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f102618OooO0Oo;

    public C28961o00oOoOO(String noteId, String pageId, PointF pointF, String str) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
        kotlin.jvm.internal.OooOOO0.OooO0oO(pageId, "pageId");
        this.f102615OooO00o = noteId;
        this.f102616OooO0O0 = pageId;
        this.f102617OooO0OO = pointF;
        this.f102618OooO0Oo = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28961o00oOoOO)) {
            return false;
        }
        C28961o00oOoOO c28961o00oOoOO = (C28961o00oOoOO) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f102615OooO00o, c28961o00oOoOO.f102615OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f102616OooO0O0, c28961o00oOoOO.f102616OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f102617OooO0OO, c28961o00oOoOO.f102617OooO0OO) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f102618OooO0Oo, c28961o00oOoOO.f102618OooO0Oo);
    }

    public final int hashCode() {
        int iHashCode = (this.f102617OooO0OO.hashCode() + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.f102615OooO00o.hashCode() * 31, 31, this.f102616OooO0O0)) * 31;
        String str = this.f102618OooO0Oo;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotePosVO(noteId=");
        sb.append(this.f102615OooO00o);
        sb.append(", pageId=");
        sb.append(this.f102616OooO0O0);
        sb.append(", offset=");
        sb.append(this.f102617OooO0OO);
        sb.append(", itemId=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f102618OooO0Oo, ")");
    }
}
