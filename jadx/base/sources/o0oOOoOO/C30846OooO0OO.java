package o0oOOoOO;

import androidx.lifecycle.AbstractC22019Ooooooo;
import androidx.lifecycle.o0OoOo0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o00o00O0.C25252OooO0Oo;
import o0oOoOo.C31046OooOOo0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.C33779o00Oo0;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.C33784o00ooo;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0Oo.InterfaceC33788ooOO;

/* JADX INFO: renamed from: o0oOOoOO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lo0oOOoOO/OooO0OO;", "Landroidx/lifecycle/Ooooooo;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class C30846OooO0OO extends AbstractC22019Ooooooo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C33781o00o0O f110243OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C33769Ooooo0o f110244OooO0o0;

    /* JADX INFO: renamed from: o0oOOoOO.OooO0OO$OooO00o */
    public static final class OooO00o implements InterfaceC33721OooO0o<List<? extends C31046OooOOo0>> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C33781o00o0O f110245OooOo0o;

        /* JADX INFO: renamed from: o0oOOoOO.OooO0OO$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C20131OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO f110246OooOo0o;

            /* JADX INFO: renamed from: o0oOOoOO.OooO0OO$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.language.GlobalSettingsLanguageViewModel$special$$inlined$map$1$2", m80623f = "GlobalSettingsLanguageViewModel.kt", m80624l = {50}, m80625m = "emit")
            public static final class C20132OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f110247OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f110248OooOo0o;

                public C20132OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f110248OooOo0o = obj;
                    this.f110247OooOo |= Integer.MIN_VALUE;
                    return C20131OooO00o.this.emit(null, this);
                }
            }

            public C20131OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
                this.f110246OooOo0o = interfaceC33723OooO0oO;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, java.util.Map] */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C20132OooO00o c20132OooO00o;
                if (continuation instanceof C20132OooO00o) {
                    c20132OooO00o = (C20132OooO00o) continuation;
                    int i = c20132OooO00o.f110247OooOo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c20132OooO00o.f110247OooOo = i - Integer.MIN_VALUE;
                    } else {
                        c20132OooO00o = new C20132OooO00o(continuation);
                    }
                }
                Object obj2 = c20132OooO00o.f110248OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c20132OooO00o.f110247OooOo;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj2);
                    Locale locale = (Locale) obj;
                    ?? r13 = C31046OooOOo0.f110846OooO0o0;
                    ArrayList arrayList = new ArrayList(r13.size());
                    Iterator it = r13.entrySet().iterator();
                    while (it.hasNext()) {
                        Locale locale2 = (Locale) ((Map.Entry) it.next()).getValue();
                        String languageTag = locale2.toLanguageTag();
                        boolean zOooO0O0 = OooOOO0.OooO0O0(locale2.getLanguage(), locale.getLanguage());
                        String country = locale2.getCountry();
                        boolean z = false;
                        boolean z2 = country == null || country.length() == 0 || OooOOO0.OooO0O0(locale2.getCountry(), locale.getCountry());
                        String str = OooOOO0.OooO0O0(languageTag, Locale.SIMPLIFIED_CHINESE.toLanguageTag()) ? "Hans" : OooOOO0.OooO0O0(languageTag, Locale.TRADITIONAL_CHINESE.toLanguageTag()) ? "Hant" : null;
                        boolean z3 = str == null || str.length() == 0 || str.equals(locale.getScript());
                        if (zOooO0O0 && (z3 || z2)) {
                            z = true;
                        }
                        String language = locale2.getLanguage();
                        OooOOO0.OooO0o(language, "getLanguage(...)");
                        String country2 = locale2.getCountry();
                        OooOOO0.OooO0o(country2, "getCountry(...)");
                        OooOOO0.OooO0Oo(languageTag);
                        arrayList.add(new C31046OooOOo0(language, country2, languageTag, z));
                    }
                    c20132OooO00o.f110247OooOo = 1;
                    if (this.f110246OooOo0o.emit(arrayList, c20132OooO00o) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj2);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public OooO00o(C33781o00o0O c33781o00o0O) {
            this.f110245OooOo0o = c33781o00o0O;
        }

        @Override // oO0o0Oo.InterfaceC33721OooO0o
        public final Object collect(InterfaceC33723OooO0oO<? super List<? extends C31046OooOOo0>> interfaceC33723OooO0oO, Continuation continuation) {
            this.f110245OooOo0o.collect(new C20131OooO00o(interfaceC33723OooO0oO), continuation);
            return EnumC32485OooO00o.f116726OooOo0o;
        }
    }

    /* JADX INFO: renamed from: o0oOOoOO.OooO0OO$OooO0O0 */
    public static final class OooO0O0 implements InterfaceC33721OooO0o<String> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C33781o00o0O f110250OooOo0o;

        /* JADX INFO: renamed from: o0oOOoOO.OooO0OO$OooO0O0$OooO00o */
        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO f110251OooOo0o;

            /* JADX INFO: renamed from: o0oOOoOO.OooO0OO$OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.language.GlobalSettingsLanguageViewModel$special$$inlined$map$2$2", m80623f = "GlobalSettingsLanguageViewModel.kt", m80624l = {50}, m80625m = "emit")
            public static final class C20133OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f110252OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f110253OooOo0o;

                public C20133OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f110253OooOo0o = obj;
                    this.f110252OooOo |= Integer.MIN_VALUE;
                    return OooO00o.this.emit(null, this);
                }
            }

            public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
                this.f110251OooOo0o = interfaceC33723OooO0oO;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C20133OooO00o c20133OooO00o;
                if (continuation instanceof C20133OooO00o) {
                    c20133OooO00o = (C20133OooO00o) continuation;
                    int i = c20133OooO00o.f110252OooOo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c20133OooO00o.f110252OooOo = i - Integer.MIN_VALUE;
                    } else {
                        c20133OooO00o = new C20133OooO00o(continuation);
                    }
                }
                Object obj2 = c20133OooO00o.f110253OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c20133OooO00o.f110252OooOo;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj2);
                    String languageTag = ((Locale) obj).toLanguageTag();
                    c20133OooO00o.f110252OooOo = 1;
                    if (this.f110251OooOo0o.emit(languageTag, c20133OooO00o) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj2);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public OooO0O0(C33781o00o0O c33781o00o0O) {
            this.f110250OooOo0o = c33781o00o0O;
        }

        @Override // oO0o0Oo.InterfaceC33721OooO0o
        public final Object collect(InterfaceC33723OooO0oO<? super String> interfaceC33723OooO0oO, Continuation continuation) {
            this.f110250OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO), continuation);
            return EnumC32485OooO00o.f116726OooOo0o;
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    public C30846OooO0OO() {
        C33781o00o0O c33781o00o0OOooO00o = C33784o00ooo.OooO00o(Locale.getDefault());
        this.f110243OooO0Oo = c33781o00o0OOooO00o;
        OooO00o oooO00o = new OooO00o(c33781o00o0OOooO00o);
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(this);
        C33779o00Oo0 c33779o00Oo0OooO00o = InterfaceC33788ooOO.OooO00o.OooO00o(2);
        ?? r4 = C31046OooOOo0.f110846OooO0o0;
        ArrayList arrayList = new ArrayList(r4.size());
        Iterator it = r4.entrySet().iterator();
        while (it.hasNext()) {
            Locale locale = (Locale) ((Map.Entry) it.next()).getValue();
            String languageTag = locale.toLanguageTag();
            String language = locale.getLanguage();
            OooOOO0.OooO0o(language, "getLanguage(...)");
            String country = locale.getCountry();
            OooOOO0.OooO0o(country, "getCountry(...)");
            OooOOO0.OooO0Oo(languageTag);
            arrayList.add(new C31046OooOOo0(language, country, languageTag, languageTag.equals(Locale.getDefault().toLanguageTag())));
        }
        C25252OooO0Oo.OooOoO0(oooO00o, interfaceC33636Oooo00oOooO00o, c33779o00Oo0OooO00o, arrayList);
        this.f110244OooO0o0 = C25252OooO0Oo.OooOoO0(new OooO0O0(this.f110243OooO0Oo), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), Locale.getDefault().toLanguageTag());
    }
}
