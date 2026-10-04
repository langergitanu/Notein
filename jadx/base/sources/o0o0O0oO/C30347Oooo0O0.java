package o0o0O0oO;

import com.orion.notein.domain.models.note.NoteMeta;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27449o00O0OoO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o0O0oO.Oooo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.trashbin.TrashBinListViewModel$recoverNote$2$1", m80623f = "TrashBinListViewModel.kt", m80624l = {699}, m80625m = "invokeSuspend")
public final class C30347Oooo0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30351Oooo0oO f108209OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f108210OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f108211OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30347Oooo0O0(C30351Oooo0oO c30351Oooo0oO, String str, Continuation<? super C30347Oooo0O0> continuation) {
        super(2, continuation);
        this.f108209OooOo = c30351Oooo0oO;
        this.f108211OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30347Oooo0O0(this.f108209OooOo, this.f108211OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30347Oooo0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108210OooOo0o;
        String str = this.f108211OooOoO0;
        C30351Oooo0oO c30351Oooo0oO = this.f108209OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C27449o00O0OoO c27449o00O0OoO = c30351Oooo0oO.f108226OooO0Oo;
            this.f108210OooOo0o = 1;
            obj = c27449o00O0OoO.OooOoOO(str, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        NoteMeta noteMeta = (NoteMeta) obj;
        if (noteMeta != null && !noteMeta.getInTrashBin()) {
            c30351Oooo0oO.f108227OooO0o.OooO0Oo(str, true);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
