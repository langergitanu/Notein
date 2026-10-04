package o0Oo;

import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.domain.models.CountryCode;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import o000OoO.C24536OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0O0o.C33600OooOo0o;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: o0Oo.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.countrycode.CountryCodeSelectViewModel$getCountryCodeFirstLetterList$2", m80623f = "CountryCodeSelectViewModel.kt", m80624l = {58}, m80625m = "invokeSuspend")
public final class C28010OooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends String>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f99339OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f99340OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ Locale f99341OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C28022OooOOO0 f99342OooOoO0;

    /* JADX INFO: renamed from: o0Oo.OooO$OooO00o */
    public static final class OooO00o<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C24536OooO0Oo.OooO0O0((String) t, (String) t2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28010OooO(C28022OooOOO0 c28022OooOOO0, Locale locale, Continuation<? super C28010OooO> continuation) {
        super(2, continuation);
        this.f99342OooOoO0 = c28022OooOOO0;
        this.f99341OooOoO = locale;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28010OooO(this.f99342OooOoO0, this.f99341OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends String>> continuation) {
        return ((C28010OooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        boolean z;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f99339OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C28022OooOOO0 c28022OooOOO0 = this.f99342OooOoO0;
            String language = this.f99341OooOoO.getLanguage();
            kotlin.jvm.internal.OooOOO0.OooO0o(language, "getLanguage(...)");
            boolean zOooOoOO = C33599OooOo0O.OooOoOO(language, TranslateLanguage.CHINESE, true);
            this.f99340OooOo0o = zOooOoOO;
            this.f99339OooOo = 1;
            obj = c28022OooOOO0.f99368OooO0Oo.OooO0O0(this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            z = zOooOoOO;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = this.f99340OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        Iterable<CountryCode> iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        for (CountryCode countryCode : iterable) {
            arrayList.add(z ? String.valueOf(C33600OooOo0o.OoooooO(countryCode.getPinyinName())) : String.valueOf(C33600OooOo0o.OoooooO(countryCode.getEnName())));
        }
        return OooOo.Oooo0(OooOo.o00O0O(arrayList, new OooO00o()));
    }
}
