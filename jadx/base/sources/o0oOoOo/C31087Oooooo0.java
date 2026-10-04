package o0oOoOo;

import OooOoo0.o00000;
import android.graphics.Typeface;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: o0oOoOo.Oooooo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31087Oooooo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f110946OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Typeface f110947OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f110948OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f110949OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f110950OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Integer f110951OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Integer f110952OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f110953OooO0oo;

    /* JADX INFO: renamed from: o0oOoOo.Oooooo0$OooO00o */
    public static final class OooO00o {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public static Integer OooO00o(String fontName) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(fontName, "fontName");
            switch (fontName.hashCode()) {
                case -690819730:
                    if (fontName.equals("Playwrite US Trad")) {
                        return Integer.valueOf(R.string.font_name_cursive);
                    }
                    return null;
                case -413473563:
                    if (fontName.equals("Edu AU VIC WA NT Hand")) {
                        return Integer.valueOf(R.string.font_name_schoolbook);
                    }
                    return null;
                case 72260706:
                    if (fontName.equals("Kalam")) {
                        return Integer.valueOf(R.string.font_name_casual);
                    }
                    return null;
                case 370640794:
                    if (fontName.equals("Caveat Brush")) {
                        return Integer.valueOf(R.string.font_name_brush);
                    }
                    return null;
                case 592365930:
                    if (fontName.equals("Great Vibes")) {
                        return Integer.valueOf(R.string.font_name_elegant);
                    }
                    return null;
                case 612859771:
                    if (fontName.equals("Dancing Script")) {
                        return Integer.valueOf(R.string.font_name_script);
                    }
                    return null;
                case 990094466:
                    if (fontName.equals("Pacifico Regular")) {
                        return Integer.valueOf(R.string.font_name_retro);
                    }
                    return null;
                case 1389107725:
                    if (fontName.equals("Patrick Hand")) {
                        return Integer.valueOf(R.string.font_name_neat);
                    }
                    return null;
                case 1639089708:
                    if (fontName.equals("Playwrite US Modern")) {
                        return Integer.valueOf(R.string.font_name_handwriting);
                    }
                    return null;
                case 2011350176:
                    if (fontName.equals("Caveat")) {
                        return Integer.valueOf(R.string.font_name_pen);
                    }
                    return null;
                default:
                    return null;
            }
        }
    }

    public /* synthetic */ C31087Oooooo0(String str, Typeface typeface, Integer num, boolean z, Integer num2, boolean z2, int i) {
        this(str, typeface, false, false, num, z, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? false : z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31087Oooooo0)) {
            return false;
        }
        C31087Oooooo0 c31087Oooooo0 = (C31087Oooooo0) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110946OooO00o, c31087Oooooo0.f110946OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110947OooO0O0, c31087Oooooo0.f110947OooO0O0) && this.f110948OooO0OO == c31087Oooooo0.f110948OooO0OO && this.f110949OooO0Oo == c31087Oooooo0.f110949OooO0Oo && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110951OooO0o0, c31087Oooooo0.f110951OooO0o0) && this.f110950OooO0o == c31087Oooooo0.f110950OooO0o && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110952OooO0oO, c31087Oooooo0.f110952OooO0oO) && this.f110953OooO0oo == c31087Oooooo0.f110953OooO0oo;
    }

    public final int hashCode() {
        int iHashCode = this.f110946OooO00o.hashCode() * 31;
        Typeface typeface = this.f110947OooO0O0;
        int iOooO0O0 = o00000.OooO0O0(o00000.OooO0O0((iHashCode + (typeface == null ? 0 : typeface.hashCode())) * 31, 31, this.f110948OooO0OO), 31, this.f110949OooO0Oo);
        Integer num = this.f110951OooO0o0;
        int iOooO0O02 = o00000.OooO0O0((iOooO0O0 + (num == null ? 0 : num.hashCode())) * 31, 31, this.f110950OooO0o);
        Integer num2 = this.f110952OooO0oO;
        return Boolean.hashCode(this.f110953OooO0oo) + ((iOooO0O02 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextFontVO(name=");
        sb.append(this.f110946OooO00o);
        sb.append(", typeface=");
        sb.append(this.f110947OooO0O0);
        sb.append(", isSelected=");
        sb.append(this.f110948OooO0OO);
        sb.append(", isDownloading=");
        sb.append(this.f110949OooO0Oo);
        sb.append(", type=");
        sb.append(this.f110951OooO0o0);
        sb.append(", removable=");
        sb.append(this.f110950OooO0o);
        sb.append(", nameResId=");
        sb.append(this.f110952OooO0oO);
        sb.append(", isVipBadgeVisible=");
        return androidx.appcompat.app.OooOOO.OooO00o(sb, ")", this.f110953OooO0oo);
    }

    public C31087Oooooo0(String name, Typeface typeface, boolean z, boolean z2, Integer num, boolean z3, Integer num2, boolean z4) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        this.f110946OooO00o = name;
        this.f110947OooO0O0 = typeface;
        this.f110948OooO0OO = z;
        this.f110949OooO0Oo = z2;
        this.f110951OooO0o0 = num;
        this.f110950OooO0o = z3;
        this.f110952OooO0oO = num2;
        this.f110953OooO0oo = z4;
    }
}
