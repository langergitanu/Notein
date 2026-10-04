package o0OOoOo0;

import com.orion.notein.domain.models.note.NoteMeta;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0OOoOo0.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.label.GetItemsByLabelUseCase$findNotesByLabelColor$2$1", m80623f = "GetItemsByLabelUseCase.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C27815OooOo0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends NoteMeta>, Continuation<? super List<? extends NoteMeta>>, Object> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f98254OooOo0o;

    public C27815OooOo0o() {
        throw null;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C27815OooOo0o c27815OooOo0o = new C27815OooOo0o(2, continuation);
        c27815OooOo0o.f98254OooOo0o = obj;
        return c27815OooOo0o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(List<? extends NoteMeta> list, Continuation<? super List<? extends NoteMeta>> continuation) {
        return ((C27815OooOo0o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List list = (List) this.f98254OooOo0o;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!((NoteMeta) obj2).getInTrashBin()) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
