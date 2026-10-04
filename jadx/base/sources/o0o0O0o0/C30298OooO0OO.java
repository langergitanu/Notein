package o0o0O0o0;

import com.orion.notein.domain.models.note.NoteMeta;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o0O0o0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.search.viewmodel.SearchViewModel$isNoteExist$2", m80623f = "SearchViewModel.kt", m80624l = {517}, m80625m = "invokeSuspend")
public final class C30298OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30296OooO00o f108015OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f108016OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f108017OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30298OooO0OO(C30296OooO00o c30296OooO00o, String str, Continuation<? super C30298OooO0OO> continuation) {
        super(2, continuation);
        this.f108015OooOo = c30296OooO00o;
        this.f108017OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30298OooO0OO(this.f108015OooOo, this.f108017OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C30298OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108016OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C30296OooO00o c30296OooO00o = this.f108015OooOo;
            this.f108016OooOo0o = 1;
            obj = c30296OooO00o.f107988OooO0Oo.OooOoOO(this.f108017OooOoO0, this);
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
        return Boolean.valueOf((noteMeta == null || noteMeta.getInTrashBin()) ? false : true);
    }
}
