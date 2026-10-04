package o00000OO;

import android.os.LocaleList;
import android.text.style.LocaleSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.OooOOO0;
import o00000O.C24105OooO0o0;
import o00000O0.C24108OooO0Oo;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f81246OooO00o = new OooO00o();

    public final Object OooO00o(C24108OooO0Oo localeList) {
        OooOOO0.OooO0oO(localeList, "localeList");
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(localeList, 10));
        for (o00000O0.OooO0OO oooO0OO : localeList.f81244OooOo0o) {
            OooOOO0.OooO0oO(oooO0OO, "<this>");
            arrayList.add((Locale) oooO0OO.f81242OooO00o.f81237OooO00o);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public final void OooO0O0(C24105OooO0o0 textPaint, C24108OooO0Oo localeList) {
        OooOOO0.OooO0oO(textPaint, "textPaint");
        OooOOO0.OooO0oO(localeList, "localeList");
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(localeList, 10));
        for (o00000O0.OooO0OO oooO0OO : localeList.f81244OooOo0o) {
            OooOOO0.OooO0oO(oooO0OO, "<this>");
            arrayList.add((Locale) oooO0OO.f81242OooO00o.f81237OooO00o);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        textPaint.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}
