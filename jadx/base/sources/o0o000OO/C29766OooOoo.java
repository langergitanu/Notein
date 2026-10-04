package o0o000OO;

import com.orion.penkit.models.QuoteInfo;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o000OO.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textannoeditor.TextAnnoViewModel$setQuoteInfo$1", m80623f = "TextAnnoViewModel.kt", m80624l = {408}, m80625m = "invokeSuspend")
public final class C29766OooOoo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f105621OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f105622OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ QuoteInfo f105623OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29766OooOoo(OooOO0O oooOO0O, QuoteInfo quoteInfo, Continuation<? super C29766OooOoo> continuation) {
        super(2, continuation);
        this.f105621OooOo = oooOO0O;
        this.f105623OooOoO0 = quoteInfo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29766OooOoo(this.f105621OooOo, this.f105623OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29766OooOoo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f105622OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            int bgColor = this.f105623OooOoO0.getBgColor();
            this.f105622OooOo0o = 1;
            AbstractC24338OooO0o0.OooO00o<Integer> oooO00o = OooOO0O.f105529OooOooo;
            if (this.f105621OooOo.OooOO0(bgColor, this) == enumC32485OooO00o) {
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
