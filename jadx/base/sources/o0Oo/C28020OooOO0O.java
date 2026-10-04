package o0Oo;

import com.orion.notein.domain.models.CountryCode;
import java.util.Iterator;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import o0OOo0Oo.InterfaceC27294OooOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: renamed from: o0Oo.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.countrycode.CountryCodeSelectViewModel$getCurrentCode$1", m80623f = "CountryCodeSelectViewModel.kt", m80624l = {42}, m80625m = "invokeSuspend")
public final class C28020OooOO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C28022OooOOO0 f99360OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f99361OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Locale f99362OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28020OooOO0O(C28022OooOOO0 c28022OooOOO0, Locale locale, Continuation<? super C28020OooOO0O> continuation) {
        super(2, continuation);
        this.f99360OooOo = c28022OooOOO0;
        this.f99362OooOoO0 = locale;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28020OooOO0O(this.f99360OooOo, this.f99362OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28020OooOO0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Object next;
        String code;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f99361OooOo0o;
        C28022OooOOO0 c28022OooOOO0 = this.f99360OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC27294OooOO0 interfaceC27294OooOO0 = c28022OooOOO0.f99368OooO0Oo;
            this.f99361OooOo0o = 1;
            obj = interfaceC27294OooOO0.OooO0O0(this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        Iterator it = ((Iterable) obj).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(((CountryCode) next).getCountryCode(), this.f99362OooOoO0.getCountry())) {
                break;
            }
        }
        CountryCode countryCode = (CountryCode) next;
        if (countryCode == null || (code = countryCode.getCode()) == null) {
            code = "86";
        }
        c28022OooOOO0.getClass();
        C33781o00o0O c33781o00o0O = c28022OooOOO0.f99370OooO0o0;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, code);
        return C32460OooOooO.f116667OooO00o;
    }
}
