package o0oOOoo;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24332OooO;
import o0000oOO.C24334OooO0O0;
import o0OOOoo.C27205OooO0OO;
import o0o00oO.C29954OooO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33769Ooooo0o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: o0oOOoo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.viewmodel.GlobalSettingsFastTranslationViewModel$selectLanguage$1", m80623f = "GlobalSettingsFastTranslationViewModel.kt", m80624l = {100}, m80625m = "invokeSuspend")
public final class C30857OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30861OooO0o0 f110309OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f110310OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ int f110311OooOoO0;

    /* JADX INFO: renamed from: o0oOOoo.OooO00o$OooO00o, reason: collision with other inner class name */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.viewmodel.GlobalSettingsFastTranslationViewModel$selectLanguage$1$1", m80623f = "GlobalSettingsFastTranslationViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class C20138OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24334OooO0O0, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ String f110312OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f110313OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20138OooO00o(String str, Continuation<? super C20138OooO00o> continuation) {
            super(2, continuation);
            this.f110312OooOo = str;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            C20138OooO00o c20138OooO00o = new C20138OooO00o(this.f110312OooOo, continuation);
            c20138OooO00o.f110313OooOo0o = obj;
            return c20138OooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(C24334OooO0O0 c24334OooO0O0, Continuation<? super C32460OooOooO> continuation) {
            return ((C20138OooO00o) create(c24334OooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            C24334OooO0O0 c24334OooO0O0 = (C24334OooO0O0) this.f110313OooOo0o;
            AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = C27205OooO0OO.f95002OooO00o;
            c24334OooO0O0.OooO0oO(C27205OooO0OO.f95015OooOOOO, this.f110312OooOo);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30857OooO00o(C30861OooO0o0 c30861OooO0o0, int i, Continuation<? super C30857OooO00o> continuation) {
        super(2, continuation);
        this.f110309OooOo = c30861OooO0o0;
        this.f110311OooOoO0 = i;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30857OooO00o(this.f110309OooOo, this.f110311OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30857OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Object next;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f110310OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C30861OooO0o0 c30861OooO0o0 = this.f110309OooOo;
            List list = (List) c30861OooO0o0.f110325OooO.f121747OooOo0o.getValue();
            int i2 = this.f110311OooOoO0;
            C29954OooO c29954OooO = (C29954OooO) OooOo.OoooO00(i2, list);
            C33769Ooooo0o c33769Ooooo0o = c30861OooO0o0.f110325OooO;
            if (c29954OooO == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("GlobalSettingsFastTranslationViewModel");
                c20358OooO00o.OooO0OO("selectLanguage: languageName is null. " + i2 + ", " + c33769Ooooo0o.f121747OooOo0o.getValue(), new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            Iterator it = ((Map) c30861OooO0o0.f110330OooO0oo.getValue()).entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((Number) ((Map.Entry) next).getKey()).intValue() == c29954OooO.f106400OooO00o) {
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) next;
            String str = entry != null ? (String) entry.getValue() : null;
            if (str == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("GlobalSettingsFastTranslationViewModel");
                c20358OooO00o2.OooO0OO("selectLanguage: languageTag is null. " + i2 + ", " + c33769Ooooo0o.f121747OooOo0o.getValue(), new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            C20138OooO00o c20138OooO00o = new C20138OooO00o(str, null);
            this.f110310OooOo0o = 1;
            if (C24332OooO.OooO00o(c30861OooO0o0.f110328OooO0o0, c20138OooO00o, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
