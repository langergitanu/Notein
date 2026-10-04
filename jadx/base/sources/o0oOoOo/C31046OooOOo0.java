package o0oOoOo;

import com.google.mlkit.p567nl.translate.TranslateLanguage;
import java.util.Locale;
import oO00ooO.C32443OooOOO;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: renamed from: o0oOoOo.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31046OooOOo0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Object f110846OooO0o0 = C34444Oooo0O0.OooO0oo(new C32443OooOOO(TranslateLanguage.GERMAN, Locale.GERMAN), new C32443OooOOO(TranslateLanguage.ENGLISH, Locale.ENGLISH), new C32443OooOOO(TranslateLanguage.SPANISH, new Locale(TranslateLanguage.SPANISH, "")), new C32443OooOOO(TranslateLanguage.FRENCH, Locale.FRENCH), new C32443OooOOO("id", new Locale("id", "")), new C32443OooOOO(TranslateLanguage.ITALIAN, Locale.ITALIAN), new C32443OooOOO(TranslateLanguage.JAPANESE, Locale.JAPANESE), new C32443OooOOO(TranslateLanguage.KOREAN, Locale.KOREAN), new C32443OooOOO(TranslateLanguage.POLISH, new Locale(TranslateLanguage.POLISH, "")), new C32443OooOOO(TranslateLanguage.PORTUGUESE, new Locale(TranslateLanguage.PORTUGUESE, "")), new C32443OooOOO(TranslateLanguage.RUSSIAN, new Locale(TranslateLanguage.RUSSIAN, "")), new C32443OooOOO(TranslateLanguage.THAI, new Locale(TranslateLanguage.THAI, "")), new C32443OooOOO(TranslateLanguage.TURKISH, new Locale(TranslateLanguage.TURKISH, "")), new C32443OooOOO(TranslateLanguage.VIETNAMESE, new Locale(TranslateLanguage.VIETNAMESE, "")), new C32443OooOOO("zh-CN", Locale.SIMPLIFIED_CHINESE), new C32443OooOOO("zh-TW", Locale.TRADITIONAL_CHINESE));

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f110847OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f110848OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f110849OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f110850OooO0Oo;

    public C31046OooOOo0(String str, String str2, String str3, boolean z) {
        this.f110847OooO00o = str;
        this.f110848OooO0O0 = str2;
        this.f110849OooO0OO = str3;
        this.f110850OooO0Oo = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31046OooOOo0)) {
            return false;
        }
        C31046OooOOo0 c31046OooOOo0 = (C31046OooOOo0) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110847OooO00o, c31046OooOOo0.f110847OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110848OooO0O0, c31046OooOOo0.f110848OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110849OooO0OO, c31046OooOOo0.f110849OooO0OO) && this.f110850OooO0Oo == c31046OooOOo0.f110850OooO0Oo;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f110850OooO0Oo) + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.f110847OooO00o.hashCode() * 31, 31, this.f110848OooO0O0), 31, this.f110849OooO0OO);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LanguageSettingVO(language=");
        sb.append(this.f110847OooO00o);
        sb.append(", country=");
        sb.append(this.f110848OooO0O0);
        sb.append(", tag=");
        sb.append(this.f110849OooO0OO);
        sb.append(", selected=");
        return androidx.appcompat.app.OooOOO.OooO00o(sb, ")", this.f110850OooO0Oo);
    }
}
