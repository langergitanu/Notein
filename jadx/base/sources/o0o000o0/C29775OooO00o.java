package o0o000o0;

import OooOoo0.o00000;
import OooOooo.C20785Oooo00o;
import androidx.appcompat.app.OooOOO;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0o000o0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29775OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f105673OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f105674OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f105675OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f105676OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f105677OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f105678OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f105679OooO0oO;

    public C29775OooO00o(String id, String username, String text, boolean z, int i, String str, boolean z2) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(username, "username");
        OooOOO0.OooO0oO(text, "text");
        this.f105673OooO00o = id;
        this.f105674OooO0O0 = username;
        this.f105675OooO0OO = i;
        this.f105676OooO0Oo = text;
        this.f105678OooO0o0 = str;
        this.f105677OooO0o = z;
        this.f105679OooO0oO = z2;
    }

    public static C29775OooO00o OooO00o(C29775OooO00o c29775OooO00o, String text) {
        String str = c29775OooO00o.f105678OooO0o0;
        String id = c29775OooO00o.f105673OooO00o;
        OooOOO0.OooO0oO(id, "id");
        String username = c29775OooO00o.f105674OooO0O0;
        OooOOO0.OooO0oO(username, "username");
        OooOOO0.OooO0oO(text, "text");
        return new C29775OooO00o(id, username, text, c29775OooO00o.f105677OooO0o, c29775OooO00o.f105675OooO0OO, str, c29775OooO00o.f105679OooO0oO);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29775OooO00o)) {
            return false;
        }
        C29775OooO00o c29775OooO00o = (C29775OooO00o) obj;
        return OooOOO0.OooO0O0(this.f105673OooO00o, c29775OooO00o.f105673OooO00o) && OooOOO0.OooO0O0(this.f105674OooO0O0, c29775OooO00o.f105674OooO0O0) && this.f105675OooO0OO == c29775OooO00o.f105675OooO0OO && OooOOO0.OooO0O0(this.f105676OooO0Oo, c29775OooO00o.f105676OooO0Oo) && OooOOO0.OooO0O0(this.f105678OooO0o0, c29775OooO00o.f105678OooO0o0) && this.f105677OooO0o == c29775OooO00o.f105677OooO0o && this.f105679OooO0oO == c29775OooO00o.f105679OooO0oO;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f105679OooO0oO) + o00000.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(C20785Oooo00o.OooO00o(this.f105675OooO0OO, com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.f105673OooO00o.hashCode() * 31, 31, this.f105674OooO0O0), 31), 31, this.f105676OooO0Oo), 31, this.f105678OooO0o0), 31, this.f105677OooO0o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextAnnoVO(id=");
        sb.append(this.f105673OooO00o);
        sb.append(", username=");
        sb.append(this.f105674OooO0O0);
        sb.append(", type=");
        sb.append(this.f105675OooO0OO);
        sb.append(", text=");
        sb.append(this.f105676OooO0Oo);
        sb.append(", creationTime=");
        sb.append(this.f105678OooO0o0);
        sb.append(", isLast=");
        sb.append(this.f105677OooO0o);
        sb.append(", uncompleted=");
        return OooOOO.OooO00o(sb, ")", this.f105679OooO0oO);
    }
}
