package o0o0OOO;

import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27566o00oOoO0;
import o0OOo0o.C27570o00oOoo0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0o0OOO.Ooooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.PaperConfigDialogViewModel$addCurrentThemeToMyTemplate$2", m80623f = "PaperConfigDialogViewModel.kt", m80624l = {1784}, m80625m = "invokeSuspend")
public final class C30512Ooooo0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30520o000000o f108946OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f108947OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30512Ooooo0o(Continuation continuation, C30520o000000o c30520o000000o) {
        super(2, continuation);
        this.f108946OooOo = c30520o000000o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30512Ooooo0o(continuation, this.f108946OooOo);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C30512Ooooo0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOooO0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108947OooOo0o;
        C30520o000000o c30520o000000o = this.f108946OooOo;
        boolean z = false;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                PaperTheme paperTheme = (PaperTheme) c30520o000000o.f109044OoooOo0.f121747OooOo0o.getValue();
                if (paperTheme == null) {
                    return Boolean.FALSE;
                }
                Page page = new Page(null, null, C30520o000000o.OooOOo((String) c30520o000000o.f109012OooOOo0.getValue()), null, paperTheme, null, null, null, false, 0, 0L, 0L, null, null, 0, false, null, null, null, 524267, null);
                C27570o00oOoo0 c27570o00oOoo0 = c30520o000000o.f109000OooO0o;
                this.f108947OooOo0o = 1;
                c27570o00oOoo0.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27566o00oOoO0(page, c27570o00oOoo0, null), this);
                if (objOooO0o == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                objOooO0o = obj;
            }
            String str = (String) objOooO0o;
            if (str != null) {
                c30520o000000o.f109008OooOOO0.OooO0o(str);
                z = true;
            }
        } catch (Exception unused) {
        }
        return Boolean.valueOf(z);
    }
}
