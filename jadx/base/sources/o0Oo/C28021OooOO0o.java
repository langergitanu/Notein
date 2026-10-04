package o0Oo;

import com.orion.notein.domain.models.LocaleCountryCode;
import java.io.Serializable;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0Oo.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.countrycode.CountryCodeSelectViewModel$searchCountryCode$2", m80623f = "CountryCodeSelectViewModel.kt", m80624l = {73}, m80625m = "invokeSuspend")
public final class C28021OooOO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends LocaleCountryCode>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f99363OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C28022OooOOO0 f99364OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f99365OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C28022OooOOO0 f99366OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ Locale f99367OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28021OooOO0o(C28022OooOOO0 c28022OooOOO0, String str, Locale locale, Continuation<? super C28021OooOO0o> continuation) {
        super(2, continuation);
        this.f99366OooOoO0 = c28022OooOOO0;
        this.f99365OooOoO = str;
        this.f99367OooOoOO = locale;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28021OooOO0o(this.f99366OooOoO0, this.f99365OooOoO, this.f99367OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends LocaleCountryCode>> continuation) {
        return ((C28021OooOO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        C28022OooOOO0 c28022OooOOO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f99363OooOo;
        String str = this.f99365OooOoO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C28022OooOOO0 c28022OooOOO02 = this.f99366OooOoO0;
            this.f99364OooOo0o = c28022OooOOO02;
            this.f99363OooOo = 1;
            Serializable serializableOooO00o = c28022OooOOO02.f99368OooO0Oo.OooO00o(str, this);
            if (serializableOooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c28022OooOOO0 = c28022OooOOO02;
            obj = serializableOooO00o;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c28022OooOOO0 = this.f99364OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        return C28022OooOOO0.OooO0o0(c28022OooOOO0, (List) obj, this.f99367OooOoOO, C33599OooOo0O.Oooooo0(str).toString().length() == 0);
    }
}
