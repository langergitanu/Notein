package o0Oo;

import android.content.Context;
import androidx.lifecycle.AbstractC22019Ooooooo;
import androidx.lifecycle.o0OoOo0;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.domain.models.CountryCode;
import com.orion.notein.domain.models.LocaleCountryCode;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import o0OOo0Oo.InterfaceC27294OooOO0;
import oO0o0O0o.C33599OooOo0O;
import oO0o0O0o.C33600OooOo0o;
import oO0o0OO.C33609OooO0oo;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.C33784o00ooo;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: o0Oo.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lo0Oo/OooOOO0;", "Landroidx/lifecycle/Ooooooo;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class C28022OooOOO0 extends AbstractC22019Ooooooo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final InterfaceC27294OooOO0 f99368OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C33781o00o0O f99369OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C33781o00o0O f99370OooO0o0;

    public C28022OooOOO0(InterfaceC27294OooOO0 countryCodeRepo, Context context) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(countryCodeRepo, "countryCodeRepo");
        this.f99368OooO0Oo = countryCodeRepo;
        C33781o00o0O c33781o00o0OOooO00o = C33784o00ooo.OooO00o("86");
        this.f99370OooO0o0 = c33781o00o0OOooO00o;
        this.f99369OooO0o = c33781o00o0OOooO00o;
        Locale locale = context.getResources().getConfiguration().getLocales().get(0);
        kotlin.jvm.internal.OooOOO0.OooO0o(locale, "get(...)");
        C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(this), null, null, new C28020OooOO0O(this, locale, null), 3);
    }

    public static final ArrayList OooO0o0(C28022OooOOO0 c28022OooOOO0, List list, Locale locale, boolean z) {
        c28022OooOOO0.getClass();
        String language = locale.getLanguage();
        kotlin.jvm.internal.OooOOO0.OooO0o(language, "getLanguage(...)");
        boolean zOooOoOO = C33599OooOo0O.OooOoOO(language, TranslateLanguage.CHINESE, true);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            Character chValueOf = Character.valueOf(C33600OooOo0o.OoooooO(((CountryCode) obj).getPinyinName()));
            Object arrayList = linkedHashMap.get(chValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(chValueOf, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        TreeMap treeMap = new TreeMap(new C28017OooO0oO());
        treeMap.putAll(linkedHashMap);
        ArrayList arrayList2 = new ArrayList(treeMap.size());
        for (Map.Entry entry : treeMap.entrySet()) {
            Object value = entry.getValue();
            kotlin.jvm.internal.OooOOO0.OooO0o(value, "<get-value>(...)");
            Iterable<CountryCode> iterable = (Iterable) value;
            ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
            for (CountryCode countryCode : iterable) {
                arrayList3.add(new LocaleCountryCode(zOooOoOO ? countryCode.getZhName() : countryCode.getEnName(), countryCode.getCode(), zOooOoOO ? String.valueOf(C33600OooOo0o.OoooooO(countryCode.getPinyinName())) : String.valueOf(C33600OooOo0o.OoooooO(countryCode.getEnName())), false, 8, null));
            }
            arrayList2.add(OooOo.OooooOO(com.facebook.soloader.OooOo.OooO0oO(new LocaleCountryCode(((Character) entry.getKey()).toString(), null, null, true, 6, null)), OooOo.o00O0O(arrayList3, new C28018OooO0oo(0))));
        }
        ArrayList arrayListOooOo00 = C34428OooOOo.OooOo00(arrayList2);
        if (z) {
            return OooOo.OooooOO(com.facebook.soloader.OooOo.OooO0oO(new LocaleCountryCode(zOooOoOO ? "中国" : "china", "86", null, false, 12, null)), arrayListOooOo00);
        }
        return arrayListOooOo00;
    }
}
