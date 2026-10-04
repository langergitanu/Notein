package o0o0OoOo;

import com.orion.notein.domain.models.note.NoteMeta;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0o0OOO0.C30544OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32509OooOOo;
import oO0o0O0o.C33599OooOo0O;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0o0OoOo.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.debug.viewmodel.SelectNoteViewModel$allNotesInDesktop$1", m80623f = "SelectNoteViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30750OooOooO extends AbstractC32476OooO implements InterfaceC32509OooOOo<List<? extends NoteMeta>, String, String, Continuation<? super List<? extends C30544OooO0O0>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ String f109982OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f109983OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ String f109984OooOoO0;

    @Override // oO0O000o.InterfaceC32509OooOOo
    public final Object invoke(List<? extends NoteMeta> list, String str, String str2, Continuation<? super List<? extends C30544OooO0O0>> continuation) {
        C30750OooOooO c30750OooOooO = new C30750OooOooO(4, continuation);
        c30750OooOooO.f109983OooOo0o = list;
        c30750OooOooO.f109982OooOo = str;
        c30750OooOooO.f109984OooOoO0 = str2;
        return c30750OooOooO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List list = this.f109983OooOo0o;
        String str = this.f109982OooOo;
        String str2 = this.f109984OooOoO0;
        ArrayList<NoteMeta> arrayList = new ArrayList();
        for (Object obj2 : list) {
            NoteMeta noteMeta = (NoteMeta) obj2;
            boolean z = true;
            if (str2.length() != 0 && !C33599OooOo0O.OooOoOO(noteMeta.getTitle(), str2, true)) {
                z = false;
            }
            if (!noteMeta.getInTrashBin() && z) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
        for (NoteMeta noteMeta2 : arrayList) {
            arrayList2.add(new C30544OooO0O0(noteMeta2.getId(), noteMeta2.getTitle(), noteMeta2.getCreationTime(), kotlin.jvm.internal.OooOOO0.OooO0O0(noteMeta2.getId(), str), noteMeta2.getLastModificationTime()));
        }
        return arrayList2;
    }
}
