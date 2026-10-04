package o0OoooOo;

import java.util.Map;
import kotlin.coroutines.Continuation;
import o0OO00o0.C26479OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OoooOo.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.comment.EditorCommentViewModel$updateCommentsSortKey$2", m80623f = "EditorCommentViewModel.kt", m80624l = {234}, m80625m = "invokeSuspend")
public final class C29658OooOoO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C29652OooOOoo f105165OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f105166OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Map<String, Integer> f105167OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29658OooOoO(C29652OooOOoo c29652OooOOoo, Map<String, Integer> map, Continuation<? super C29658OooOoO> continuation) {
        super(2, continuation);
        this.f105165OooOo = c29652OooOOoo;
        this.f105167OooOoO0 = map;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29658OooOoO(this.f105165OooOo, this.f105167OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29658OooOoO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f105166OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C29652OooOOoo c29652OooOOoo = this.f105165OooOo;
            String str = (String) c29652OooOOoo.f105135OooO0oo.getValue();
            this.f105166OooOo0o = 1;
            C26479OooOO0o c26479OooOO0o = c29652OooOOoo.f105133OooO0o0.f97721OooO00o.f91041OooO00o;
            c26479OooOO0o.getClass();
            Object objOooO00o = c26479OooOO0o.OooO00o(str, new o0OO00o0.OooOO0(this.f105167OooOoO0, null));
            if (objOooO00o != enumC32485OooO00o) {
                objOooO00o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO00o != enumC32485OooO00o) {
                objOooO00o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO00o != enumC32485OooO00o) {
                objOooO00o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO00o == enumC32485OooO00o) {
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
