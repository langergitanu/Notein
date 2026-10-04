package o0OOOO00;

import com.orion.notein.domain.models.papertheme.PaperTheme;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.theme.ThemeLocalDataSource$getAllPageThemes$1", m80623f = "ThemeLocalDataSource.kt", m80624l = {1388}, m80625m = "invokeSuspend")
public final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33723OooO0oO<? super List<? extends PaperTheme>>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f94334OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f94335OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f94336OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(OooOO0O oooOO0O, Continuation<? super OooO0O0> continuation) {
        super(2, continuation);
        this.f94336OooOoO0 = oooOO0O;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        OooO0O0 oooO0O0 = new OooO0O0(this.f94336OooOoO0, continuation);
        oooO0O0.f94334OooOo = obj;
        return oooO0O0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33723OooO0oO<? super List<? extends PaperTheme>> interfaceC33723OooO0oO, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO0O0) create(interfaceC33723OooO0oO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f94335OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33723OooO0oO interfaceC33723OooO0oO = (InterfaceC33723OooO0oO) this.f94334OooOo;
            OooOO0O oooOO0O = this.f94336OooOoO0;
            ArrayList arrayListOooooOO = OooOo.OooooOO(OooOo.OooooOO(oooOO0O.f94379OooO0oo, oooOO0O.f94371OooO), oooOO0O.f94375OooO0Oo);
            this.f94335OooOo0o = 1;
            if (interfaceC33723OooO0oO.emit(arrayListOooooOO, this) == enumC32485OooO00o) {
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
