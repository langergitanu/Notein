package o0o000OO;

import com.orion.penkit.models.QuoteInfo;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;

/* JADX INFO: renamed from: o0o000OO.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textannoeditor.TextAnnoViewModel$deleteQuote$1", m80623f = "TextAnnoViewModel.kt", m80624l = {458}, m80625m = "invokeSuspend")
public final class C29756OooOOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f105573OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f105574OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29756OooOOOo(Continuation continuation, OooOO0O oooOO0O) {
        super(2, continuation);
        this.f105573OooOo = oooOO0O;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29756OooOOOo(continuation, this.f105573OooOo);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29756OooOOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f105574OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            OooOO0O oooOO0O = this.f105573OooOo;
            oooOO0O.f105544OooOOo0.setValue(null);
            QuoteInfo quoteInfo = (QuoteInfo) oooOO0O.f105541OooOOOO.getValue();
            if (quoteInfo != null) {
                C33772OooooOo c33772OooooOo = oooOO0O.f105553OooOoOO;
                this.f105574OooOo0o = 1;
                if (c33772OooooOo.emit(quoteInfo, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
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
