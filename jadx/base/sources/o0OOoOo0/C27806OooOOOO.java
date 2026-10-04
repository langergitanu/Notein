package o0OOoOo0;

import com.orion.notein.domain.models.folder.Folder;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0OOoOo0.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.label.GetItemsByLabelUseCase$findFoldersByLabelId$1$2", m80623f = "GetItemsByLabelUseCase.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C27806OooOOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends Folder>, Continuation<? super List<? extends Folder>>, Object> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f98214OooOo0o;

    public C27806OooOOOO() {
        throw null;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C27806OooOOOO c27806OooOOOO = new C27806OooOOOO(2, continuation);
        c27806OooOOOO.f98214OooOo0o = obj;
        return c27806OooOOOO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(List<? extends Folder> list, Continuation<? super List<? extends Folder>> continuation) {
        return ((C27806OooOOOO) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List list = (List) this.f98214OooOo0o;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!((Folder) obj2).getInTrashBin()) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
