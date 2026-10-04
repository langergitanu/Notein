package com.orion.notein.p607ui.settings.language;

import OooOoOO.C20519OooO0Oo;
import OooOooo.C20785Oooo00o;
import Oooo0oO.C21023OooO0Oo;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AbstractC21486OooOO0o;
import androidx.core.os.LocaleListCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.settings.page.BasePageOptionFragment;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000o00.AbstractC24555OooO00o;
import o0oOOoOO.C30844OooO00o;
import o0oOOoOO.C30846OooO0OO;
import oO00ooO.C32460OooOooO;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Ooo.C33833OooOOOO;
import oO0o0o0o.C33874OooO0OO;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m80612d2 = {"Lcom/orion/notein/ui/settings/language/GlobalSettingsLanguageFragment;", "Lcom/orion/notein/ui/settings/page/BasePageOptionFragment;", "", "<init>", "()V", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class GlobalSettingsLanguageFragment extends Hilt_GlobalSettingsLanguageFragment<String> {

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final List<OooO00o> f79167Oooo000;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final C22026ooOO f79168OooOooo;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f79169OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f79170OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f79171OooO0OO;

        public OooO00o(String str, int i, int i2) {
            this.f79169OooO00o = str;
            this.f79170OooO0O0 = i;
            this.f79171OooO0OO = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return this.f79169OooO00o.equals(oooO00o.f79169OooO00o) && this.f79170OooO0O0 == oooO00o.f79170OooO0O0 && this.f79171OooO0OO == oooO00o.f79171OooO0OO;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f79171OooO0OO) + C20785Oooo00o.OooO00o(this.f79170OooO0O0, this.f79169OooO00o.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LanguageOption(tag=");
            sb.append(this.f79169OooO00o);
            sb.append(", titleRes=");
            sb.append(this.f79170OooO0O0);
            sb.append(", subtitleRes=");
            return C21023OooO0Oo.OooO0OO(")", this.f79171OooO0OO, sb);
        }
    }

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return GlobalSettingsLanguageFragment.this;
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ OooO0O0 f79173OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(OooO0O0 oooO0O0) {
            super(0);
            this.f79173OooOo0o = oooO0O0;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f79173OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.settings.language.GlobalSettingsLanguageFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23823OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f79174OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23823OooO0Oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f79174OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f79174OooOo0o.getValue()).getViewModelStore();
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f79175OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f79175OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f79175OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? GlobalSettingsLanguageFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.settings.language.GlobalSettingsLanguageFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23824OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f79177OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23824OooO0o0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f79177OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f79177OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    static {
        String languageTag = Locale.GERMAN.toLanguageTag();
        OooOOO0.OooO0o(languageTag, "toLanguageTag(...)");
        OooO00o oooO00o = new OooO00o(languageTag, R.string.language_german, R.string.language_german_native);
        String languageTag2 = Locale.ENGLISH.toLanguageTag();
        OooOOO0.OooO0o(languageTag2, "toLanguageTag(...)");
        OooO00o oooO00o2 = new OooO00o(languageTag2, R.string.language_english, R.string.language_english_native);
        String languageTag3 = new Locale(TranslateLanguage.SPANISH, "").toLanguageTag();
        OooOOO0.OooO0o(languageTag3, "toLanguageTag(...)");
        OooO00o oooO00o3 = new OooO00o(languageTag3, R.string.language_spanish, R.string.language_spanish_native);
        String languageTag4 = Locale.FRENCH.toLanguageTag();
        OooOOO0.OooO0o(languageTag4, "toLanguageTag(...)");
        OooO00o oooO00o4 = new OooO00o(languageTag4, R.string.language_french, R.string.language_french_native);
        String languageTag5 = new Locale("id", "").toLanguageTag();
        OooOOO0.OooO0o(languageTag5, "toLanguageTag(...)");
        OooO00o oooO00o5 = new OooO00o(languageTag5, R.string.language_indonesian, R.string.language_indonesian_native);
        String languageTag6 = Locale.ITALIAN.toLanguageTag();
        OooOOO0.OooO0o(languageTag6, "toLanguageTag(...)");
        OooO00o oooO00o6 = new OooO00o(languageTag6, R.string.language_italian, R.string.language_italian_native);
        String languageTag7 = Locale.JAPANESE.toLanguageTag();
        OooOOO0.OooO0o(languageTag7, "toLanguageTag(...)");
        OooO00o oooO00o7 = new OooO00o(languageTag7, R.string.language_japanese, R.string.language_japanese_native);
        String languageTag8 = Locale.KOREAN.toLanguageTag();
        OooOOO0.OooO0o(languageTag8, "toLanguageTag(...)");
        OooO00o oooO00o8 = new OooO00o(languageTag8, R.string.language_korean, R.string.language_korean_native);
        String languageTag9 = new Locale(TranslateLanguage.POLISH, "").toLanguageTag();
        OooOOO0.OooO0o(languageTag9, "toLanguageTag(...)");
        OooO00o oooO00o9 = new OooO00o(languageTag9, R.string.language_polish, R.string.language_polish_native);
        String languageTag10 = new Locale(TranslateLanguage.PORTUGUESE, "").toLanguageTag();
        OooOOO0.OooO0o(languageTag10, "toLanguageTag(...)");
        OooO00o oooO00o10 = new OooO00o(languageTag10, R.string.language_portuguese, R.string.language_portuguese_native);
        String languageTag11 = new Locale(TranslateLanguage.RUSSIAN, "").toLanguageTag();
        OooOOO0.OooO0o(languageTag11, "toLanguageTag(...)");
        OooO00o oooO00o11 = new OooO00o(languageTag11, R.string.language_russian, R.string.language_russian_native);
        String languageTag12 = new Locale(TranslateLanguage.THAI, "").toLanguageTag();
        OooOOO0.OooO0o(languageTag12, "toLanguageTag(...)");
        OooO00o oooO00o12 = new OooO00o(languageTag12, R.string.language_thai, R.string.language_thai_native);
        String languageTag13 = new Locale(TranslateLanguage.TURKISH, "").toLanguageTag();
        OooOOO0.OooO0o(languageTag13, "toLanguageTag(...)");
        OooO00o oooO00o13 = new OooO00o(languageTag13, R.string.language_turkish, R.string.language_turkish_native);
        String languageTag14 = new Locale(TranslateLanguage.VIETNAMESE, "").toLanguageTag();
        OooOOO0.OooO0o(languageTag14, "toLanguageTag(...)");
        OooO00o oooO00o14 = new OooO00o(languageTag14, R.string.language_vietnamese, R.string.language_vietnamese_native);
        String languageTag15 = Locale.SIMPLIFIED_CHINESE.toLanguageTag();
        OooOOO0.OooO0o(languageTag15, "toLanguageTag(...)");
        OooO00o oooO00o15 = new OooO00o(languageTag15, R.string.language_simplified_chinese, R.string.language_simplified_chinese_native);
        String languageTag16 = Locale.TRADITIONAL_CHINESE.toLanguageTag();
        OooOOO0.OooO0o(languageTag16, "toLanguageTag(...)");
        f79167Oooo000 = C34429OooOOo0.OooOO0o(oooO00o, oooO00o2, oooO00o3, oooO00o4, oooO00o5, oooO00o6, oooO00o7, oooO00o8, oooO00o9, oooO00o10, oooO00o11, oooO00o12, oooO00o13, oooO00o14, oooO00o15, new OooO00o(languageTag16, R.string.language_traditional_chinese, R.string.language_traditional_chinese_native));
    }

    public GlobalSettingsLanguageFragment() {
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new OooO0OO(new OooO0O0()));
        this.f79168OooOooo = new C22026ooOO(C24035Oooo00o.f80943OooO00o.OooO0O0(C30846OooO0OO.class), new C23823OooO0Oo(interfaceC32440OooOO0OooO0O0), new OooO0o(interfaceC32440OooOO0OooO0O0), new C23824OooO0o0(interfaceC32440OooOO0OooO0O0));
    }

    @Override // com.orion.notein.p607ui.settings.page.BasePageOptionFragment
    public final Object OooOoO(Object obj, com.orion.notein.p607ui.settings.page.OooO00o oooO00o) throws Throwable {
        String tag = (String) obj;
        C30846OooO0OO c30846OooO0OO = (C30846OooO0OO) this.f79168OooOooo.getValue();
        OooOOO0.OooO0oO(tag, "tag");
        Locale localeForLanguageTag = Locale.forLanguageTag(tag);
        if (localeForLanguageTag == null) {
            localeForLanguageTag = Locale.getDefault();
        }
        c30846OooO0OO.f110243OooO0Oo.setValue(localeForLanguageTag);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(C33833OooOOOO.f121946OooO00o, new C30844OooO00o(tag, null), oooO00o);
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO0o != enumC32485OooO00o) {
            objOooO0o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO0o == enumC32485OooO00o ? objOooO0o : C32460OooOooO.f116667OooO00o;
    }

    @Override // com.orion.notein.p607ui.settings.page.BasePageOptionFragment
    public final List<BasePageOptionFragment.OooO0O0<String>> OooOoOO() {
        List<OooO00o> list = f79167Oooo000;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        for (OooO00o oooO00o : list) {
            arrayList.add(new BasePageOptionFragment.OooO0O0(Integer.valueOf(oooO00o.f79170OooO0O0), null, Integer.valueOf(oooO00o.f79171OooO0OO), oooO00o.f79169OooO00o, 10));
        }
        return arrayList;
    }

    @Override // com.orion.notein.p607ui.settings.page.BasePageOptionFragment
    public final C33769Ooooo0o OooOoo0() {
        return ((C30846OooO0OO) this.f79168OooOooo.getValue()).f110244OooO0o0;
    }

    @Override // com.orion.notein.p607ui.settings.page.BasePageOptionFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        LocaleListCompat localeListCompatOooO0o = AbstractC21486OooOO0o.OooO0o();
        OooOOO0.OooO0o(localeListCompatOooO0o, "getApplicationLocales(...)");
        Locale locale = !localeListCompatOooO0o.isEmpty() ? localeListCompatOooO0o.get(0) : Locale.getDefault();
        C30846OooO0OO c30846OooO0OO = (C30846OooO0OO) this.f79168OooOooo.getValue();
        if (locale == null) {
            locale = Locale.getDefault();
        }
        c30846OooO0OO.f110243OooO0Oo.setValue(locale);
    }
}
