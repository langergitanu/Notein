package o0o00oOo;

import com.orion.notein.domain.models.Label;
import com.orion.notein.p607ui.p609vo.ItemLabelVO;
import com.orion.notein.p607ui.p609vo.NoteVO;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0o00oOo.Ooooooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListViewModel$recentNoteList$2", m80623f = "NoteListViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30080Ooooooo extends AbstractC32476OooO implements InterfaceC32510OooOOo0<List<? extends NoteVO>, Map<String, ? extends List<? extends Label>>, Continuation<? super List<? extends NoteVO>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Map f107018OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f107019OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(List<? extends NoteVO> list, Map<String, ? extends List<? extends Label>> map, Continuation<? super List<? extends NoteVO>> continuation) {
        C30080Ooooooo c30080Ooooooo = new C30080Ooooooo(3, continuation);
        c30080Ooooooo.f107019OooOo0o = list;
        c30080Ooooooo.f107018OooOo = map;
        return c30080Ooooooo.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List list = this.f107019OooOo0o;
        Map map = this.f107018OooOo;
        List<NoteVO> list2 = list;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        for (NoteVO noteVOCopy$default : list2) {
            if (noteVOCopy$default.getType() == 0) {
                Iterable iterable = (List) map.get(noteVOCopy$default.getId());
                if (iterable == null) {
                    iterable = C34434OooOoO.f123453OooOo0o;
                }
                Iterable<Label> iterable2 = iterable;
                ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(iterable2, 10));
                for (Label label : iterable2) {
                    arrayList2.add(new ItemLabelVO(label.getId(), label.getName(), label.getColor(), label.getIndex()));
                }
                if (!kotlin.jvm.internal.OooOOO0.OooO0O0(noteVOCopy$default.getLabelList(), arrayList2)) {
                    noteVOCopy$default = NoteVO.copy$default(noteVOCopy$default, null, null, null, null, null, null, 0, 0, null, false, 0L, 0L, false, false, false, 0, 0, null, null, null, null, null, null, 0, null, false, false, 0L, false, arrayList2, false, 1610612735, null);
                }
            }
            arrayList.add(noteVOCopy$default);
        }
        return arrayList;
    }
}
