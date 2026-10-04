package o0o00oOo;

import com.orion.notein.domain.models.file.ImportFileResult;
import com.orion.notein.p607ui.p609vo.NoteVO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0o00oOo.OooooOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListViewModel$noteList$2", m80623f = "NoteListViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30075OooooOO extends AbstractC32476OooO implements InterfaceC32510OooOOo0<List<? extends NoteVO>, ImportFileResult, Continuation<? super List<? extends NoteVO>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ ImportFileResult f106998OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f106999OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(List<? extends NoteVO> list, ImportFileResult importFileResult, Continuation<? super List<? extends NoteVO>> continuation) {
        C30075OooooOO c30075OooooOO = new C30075OooooOO(3, continuation);
        c30075OooooOO.f106999OooOo0o = list;
        c30075OooooOO.f106998OooOo = importFileResult;
        return c30075OooooOO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List arrayList = this.f106999OooOo0o;
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(this.f106998OooOo.getMsg(), "mark_import_note_in_file_success")) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            List<NoteVO> list = arrayList;
            Iterator it = list.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    long jAbs = Math.abs(((NoteVO) next).getCreationTime() - jCurrentTimeMillis);
                    do {
                        Object next2 = it.next();
                        long jAbs2 = Math.abs(((NoteVO) next2).getCreationTime() - jCurrentTimeMillis);
                        if (jAbs > jAbs2) {
                            next = next2;
                            jAbs = jAbs2;
                        }
                    } while (it.hasNext());
                }
                obj2 = next;
            } else {
                obj2 = null;
            }
            NoteVO noteVO = (NoteVO) obj2;
            if (noteVO != null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("NoteListViewModel");
                c20358OooO00o.OooO00o(androidx.core.database.OooO00o.OooO00o("NoteListVm imported note from file manager, ", noteVO.getName(), " for ", noteVO.getId(), "."), new Object[0]);
                arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                for (NoteVO noteVO2 : list) {
                    arrayList.add(NoteVO.copy$default(noteVO2, null, null, null, null, null, null, 0, 0, null, false, 0L, 0L, false, false, false, 0, 0, null, null, null, null, null, null, 0, null, false, false, 0L, kotlin.jvm.internal.OooOOO0.OooO0O0(noteVO2.getId(), noteVO.getId()), null, false, 1879048191, null));
                }
            }
        }
        return arrayList;
    }
}
