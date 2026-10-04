package o0OoOOO0;

import com.aspose.words.StyleIdentifier;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;

/* JADX INFO: renamed from: o0OoOOO0.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.TextBoxViewModel$registerKeyboardVisibilityEventListener$1$1", m80623f = "TextBoxViewModel.kt", m80624l = {StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_6}, m80625m = "invokeSuspend")
public final class C29059OooOOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C29051OooOO0o f102982OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f102983OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ boolean f102984OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29059OooOOOo(C29051OooOO0o c29051OooOO0o, boolean z, Continuation<? super C29059OooOOOo> continuation) {
        super(2, continuation);
        this.f102982OooOo = c29051OooOO0o;
        this.f102984OooOoO0 = z;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29059OooOOOo(this.f102982OooOo, this.f102984OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29059OooOOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f102983OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C33772OooooOo c33772OooooOo = this.f102982OooOo.f102916OooOoO0;
            Boolean boolValueOf = Boolean.valueOf(this.f102984OooOoO0);
            this.f102983OooOo0o = 1;
            if (c33772OooooOo.emit(boolValueOf, this) == enumC32485OooO00o) {
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
