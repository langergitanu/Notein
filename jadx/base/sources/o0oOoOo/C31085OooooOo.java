package o0oOoOo;

import android.graphics.Typeface;

/* JADX INFO: renamed from: o0oOoOo.OooooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31085OooooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f110942OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Typeface f110943OooO0O0;

    public C31085OooooOo(String fontName, Typeface typeface) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(fontName, "fontName");
        kotlin.jvm.internal.OooOOO0.OooO0oO(typeface, "typeface");
        this.f110942OooO00o = fontName;
        this.f110943OooO0O0 = typeface;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31085OooooOo)) {
            return false;
        }
        C31085OooooOo c31085OooooOo = (C31085OooooOo) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110942OooO00o, c31085OooooOo.f110942OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110943OooO0O0, c31085OooooOo.f110943OooO0O0);
    }

    public final int hashCode() {
        return this.f110943OooO0O0.hashCode() + (this.f110942OooO00o.hashCode() * 31);
    }

    public final String toString() {
        return "TextFontSimpleVO(fontName=" + this.f110942OooO00o + ", typeface=" + this.f110943OooO0O0 + ")";
    }
}
