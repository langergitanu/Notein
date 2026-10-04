package o0o0O0o0;

import com.orion.notein.domain.models.folder.Folder;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o0O0o0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.search.viewmodel.SearchViewModel$isFolderExist$2", m80623f = "SearchViewModel.kt", m80624l = {521}, m80625m = "invokeSuspend")
public final class C30297OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30296OooO00o f108012OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f108013OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f108014OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30297OooO0O0(C30296OooO00o c30296OooO00o, String str, Continuation<? super C30297OooO0O0> continuation) {
        super(2, continuation);
        this.f108012OooOo = c30296OooO00o;
        this.f108014OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30297OooO0O0(this.f108012OooOo, this.f108014OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C30297OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108013OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C30296OooO00o c30296OooO00o = this.f108012OooOo;
            this.f108013OooOo0o = 1;
            obj = c30296OooO00o.f107990OooO0o0.OooO0Oo(this.f108014OooOoO0, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        Folder folder = (Folder) obj;
        return Boolean.valueOf((folder == null || folder.getInTrashBin()) ? false : true);
    }
}
