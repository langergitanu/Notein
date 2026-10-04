package o0Oo;

import com.orion.notein.domain.models.LocaleCountryCode;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0Oo.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.countrycode.CountryCodeSelectViewModel$getCountryCodeList$2", m80623f = "CountryCodeSelectViewModel.kt", m80624l = {51}, m80625m = "invokeSuspend")
public final class C28019OooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends LocaleCountryCode>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f99356OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C28022OooOOO0 f99357OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ Locale f99358OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C28022OooOOO0 f99359OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28019OooOO0(C28022OooOOO0 c28022OooOOO0, Locale locale, Continuation<? super C28019OooOO0> continuation) {
        super(2, continuation);
        this.f99359OooOoO0 = c28022OooOOO0;
        this.f99358OooOoO = locale;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28019OooOO0(this.f99359OooOoO0, this.f99358OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends LocaleCountryCode>> continuation) {
        return ((C28019OooOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        C28022OooOOO0 c28022OooOOO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f99356OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C28022OooOOO0 c28022OooOOO02 = this.f99359OooOoO0;
            this.f99357OooOo0o = c28022OooOOO02;
            this.f99356OooOo = 1;
            List listOooO0O0 = c28022OooOOO02.f99368OooO0Oo.OooO0O0(this);
            if (listOooO0O0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c28022OooOOO0 = c28022OooOOO02;
            obj = listOooO0O0;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c28022OooOOO0 = this.f99357OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        return C28022OooOOO0.OooO0o0(c28022OooOOO0, (List) obj, this.f99358OooOoO, true);
    }
}
