package o0o0OO0;

import com.orion.notein.domain.models.ocr.AiOcrSession;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.C33716OooO;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0o0OO0.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.viewmodel.AiOcrViewModel$special$$inlined$flatMapLatest$3", m80623f = "AiOcrViewModel.kt", m80624l = {189}, m80625m = "invokeSuspend")
public final class C30409OooOoo0 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super List<? extends AiOcrSession>>, String, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f108593OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f108594OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C30394OooOOOO f108595OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f108596OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30409OooOoo0(Continuation continuation, C30394OooOOOO c30394OooOOOO) {
        super(3, continuation);
        this.f108595OooOoO = c30394OooOOOO;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super List<? extends AiOcrSession>> interfaceC33723OooO0oO, String str, Continuation<? super C32460OooOooO> continuation) {
        C30409OooOoo0 c30409OooOoo0 = new C30409OooOoo0(continuation, this.f108595OooOoO);
        c30409OooOoo0.f108593OooOo = interfaceC33723OooO0oO;
        c30409OooOoo0.f108596OooOoO0 = str;
        return c30409OooOoo0.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108594OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33723OooO0oO interfaceC33723OooO0oO = this.f108593OooOo;
            String str = (String) this.f108596OooOoO0;
            InterfaceC33721OooO0o c33716OooO = str == null ? new C33716OooO(C34434OooOoO.f123453OooOo0o) : this.f108595OooOoO.f108495OooO0o0.OooO00o(str);
            this.f108594OooOo0o = 1;
            if (C25252OooO0Oo.OooOOO0(interfaceC33723OooO0oO, c33716OooO, this) == enumC32485OooO00o) {
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
