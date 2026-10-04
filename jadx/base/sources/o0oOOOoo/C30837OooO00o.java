package o0oOOOoo;

import OooOoo0.C20703o000000o;
import OooOoo0.o00000;
import OooOooo.C20785Oooo00o;
import android.util.Size;
import androidx.appcompat.app.OooOOO;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0oOOOoo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30837OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final boolean f110195OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f110196OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f110197OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f110198OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f110199OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Size f110200OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f110201OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final long f110202OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f110203OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final boolean f110204OooOO0;

    public C30837OooO00o(String id, String noteId, String pageId, int i, String str, Size size, long j, boolean z, boolean z2, boolean z3) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(noteId, "noteId");
        OooOOO0.OooO0oO(pageId, "pageId");
        this.f110196OooO00o = id;
        this.f110197OooO0O0 = noteId;
        this.f110198OooO0OO = pageId;
        this.f110199OooO0Oo = i;
        this.f110201OooO0o0 = str;
        this.f110200OooO0o = size;
        this.f110202OooO0oO = j;
        this.f110203OooO0oo = z;
        this.f110195OooO = z2;
        this.f110204OooOO0 = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30837OooO00o)) {
            return false;
        }
        C30837OooO00o c30837OooO00o = (C30837OooO00o) obj;
        return OooOOO0.OooO0O0(this.f110196OooO00o, c30837OooO00o.f110196OooO00o) && OooOOO0.OooO0O0(this.f110197OooO0O0, c30837OooO00o.f110197OooO0O0) && OooOOO0.OooO0O0(this.f110198OooO0OO, c30837OooO00o.f110198OooO0OO) && this.f110199OooO0Oo == c30837OooO00o.f110199OooO0Oo && OooOOO0.OooO0O0(this.f110201OooO0o0, c30837OooO00o.f110201OooO0o0) && OooOOO0.OooO0O0(this.f110200OooO0o, c30837OooO00o.f110200OooO0o) && this.f110202OooO0oO == c30837OooO00o.f110202OooO0oO && this.f110203OooO0oo == c30837OooO00o.f110203OooO0oo && this.f110195OooO == c30837OooO00o.f110195OooO && this.f110204OooOO0 == c30837OooO00o.f110204OooOO0;
    }

    public final int hashCode() {
        int iOooO00o = C20785Oooo00o.OooO00o(this.f110199OooO0Oo, com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.f110196OooO00o.hashCode() * 31, 31, this.f110197OooO0O0), 31, this.f110198OooO0OO), 31);
        String str = this.f110201OooO0o0;
        return Boolean.hashCode(this.f110204OooOO0) + o00000.OooO0O0(o00000.OooO0O0(C20703o000000o.OooO0O0((this.f110200OooO0o.hashCode() + ((iOooO00o + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.f110202OooO0oO), 31, this.f110203OooO0oo), 31, this.f110195OooO);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PageLayerTnVO(id=");
        sb.append(this.f110196OooO00o);
        sb.append(", noteId=");
        sb.append(this.f110197OooO0O0);
        sb.append(", pageId=");
        sb.append(this.f110198OooO0OO);
        sb.append(", index=");
        sb.append(this.f110199OooO0Oo);
        sb.append(", name=");
        sb.append(this.f110201OooO0o0);
        sb.append(", tnSize=");
        sb.append(this.f110200OooO0o);
        sb.append(", tnModificationTime=");
        sb.append(this.f110202OooO0oO);
        sb.append(", visible=");
        sb.append(this.f110203OooO0oo);
        sb.append(", selected=");
        sb.append(this.f110195OooO);
        sb.append(", showMoreButton=");
        return OooOOO.OooO00o(sb, ")", this.f110204OooOO0);
    }
}
