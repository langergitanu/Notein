package o000000o;

import OooOooo.C20785Oooo00o;

/* JADX INFO: renamed from: o000000o.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24100OooOoOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractC24088OooO0oO f81197OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C24093OooOOo0 f81198OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f81199OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f81200OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Object f81201OooO0o0;

    public C24100OooOoOO(AbstractC24088OooO0oO abstractC24088OooO0oO, C24093OooOOo0 c24093OooOOo0, int i, int i2, Object obj) {
        this.f81197OooO00o = abstractC24088OooO0oO;
        this.f81198OooO0O0 = c24093OooOOo0;
        this.f81199OooO0OO = i;
        this.f81200OooO0Oo = i2;
        this.f81201OooO0o0 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24100OooOoOO)) {
            return false;
        }
        C24100OooOoOO c24100OooOoOO = (C24100OooOoOO) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f81197OooO00o, c24100OooOoOO.f81197OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f81198OooO0O0, c24100OooOoOO.f81198OooO0O0) && this.f81199OooO0OO == c24100OooOoOO.f81199OooO0OO && this.f81200OooO0Oo == c24100OooOoOO.f81200OooO0Oo && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f81201OooO0o0, c24100OooOoOO.f81201OooO0o0);
    }

    public final int hashCode() {
        AbstractC24088OooO0oO abstractC24088OooO0oO = this.f81197OooO00o;
        int iOooO00o = C20785Oooo00o.OooO00o(this.f81200OooO0Oo, C20785Oooo00o.OooO00o(this.f81199OooO0OO, (((abstractC24088OooO0oO == null ? 0 : abstractC24088OooO0oO.hashCode()) * 31) + this.f81198OooO0O0.f81193OooOo0o) * 31, 31), 31);
        Object obj = this.f81201OooO0o0;
        return iOooO00o + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.f81197OooO00o);
        sb.append(", fontWeight=");
        sb.append(this.f81198OooO0O0);
        sb.append(", fontStyle=");
        String str = "Invalid";
        int i = this.f81199OooO0OO;
        sb.append((Object) (i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid"));
        sb.append(", fontSynthesis=");
        int i2 = this.f81200OooO0Oo;
        if (i2 == 0) {
            str = "None";
        } else if (i2 == 1) {
            str = "All";
        } else if (i2 == 2) {
            str = "Weight";
        } else if (i2 == 3) {
            str = "Style";
        }
        sb.append((Object) str);
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.f81201OooO0o0);
        sb.append(')');
        return sb.toString();
    }
}
