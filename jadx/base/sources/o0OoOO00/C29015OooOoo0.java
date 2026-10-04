package o0OoOO00;

import com.orion.notein.domain.models.page.Page;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0OoOO00.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addpage.AddPageViewModel$_page$1", m80623f = "AddPageViewModel.kt", m80624l = {93}, m80625m = "invokeSuspend")
public final class C29015OooOoo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<String, Continuation<? super Page>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f102780OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f102781OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.addpage.OooO0OO f102782OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29015OooOoo0(com.orion.notein.p607ui.noteeditor.addpage.OooO0OO oooO0OO, Continuation<? super C29015OooOoo0> continuation) {
        super(2, continuation);
        this.f102782OooOoO0 = oooO0OO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C29015OooOoo0 c29015OooOoo0 = new C29015OooOoo0(this.f102782OooOoO0, continuation);
        c29015OooOoo0.f102780OooOo = obj;
        return c29015OooOoo0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(String str, Continuation<? super Page> continuation) {
        return ((C29015OooOoo0) create(str, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f102781OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            String str = (String) this.f102780OooOo;
            com.orion.notein.p607ui.noteeditor.addpage.OooO0OO oooO0OO = this.f102782OooOoO0;
            String str2 = (String) oooO0OO.f73859OooOO0o.getValue();
            this.f102781OooOo0o = 1;
            obj = oooO0OO.f73856OooO0oo.OooO0Oo(str, str2, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        kotlin.jvm.internal.OooOOO0.OooO0Oo(obj);
        return obj;
    }
}
