package com.orion.notein.p607ui.notelist;

import com.orion.notein.domain.models.Label;
import com.orion.notein.p607ui.notelist.OooO0OO;
import com.orion.notein.p607ui.p609vo.ItemLabelVO;
import com.orion.notein.p607ui.p609vo.NoteVO;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListViewModel$noteList$3", m80623f = "NoteListViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class OooOO0O extends AbstractC32476OooO implements InterfaceC32510OooOOo0<List<? extends NoteVO>, OooO0OO.OooO0Oo, Continuation<? super List<? extends NoteVO>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ OooO0OO.OooO0Oo f77275OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f77276OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ OooO0OO f77277OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(OooO0OO oooO0OO, Continuation<? super OooOO0O> continuation) {
        super(3, continuation);
        this.f77277OooOoO0 = oooO0OO;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(List<? extends NoteVO> list, OooO0OO.OooO0Oo oooO0Oo, Continuation<? super List<? extends NoteVO>> continuation) {
        OooOO0O oooOO0O = new OooOO0O(this.f77277OooOoO0, continuation);
        oooOO0O.f77276OooOo0o = list;
        oooOO0O.f77275OooOo = oooO0Oo;
        return oooOO0O.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        List<Label> list;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List list2 = this.f77276OooOo0o;
        OooO0OO.OooO0Oo oooO0Oo = this.f77275OooOo;
        this.f77277OooOoO0.getClass();
        List<NoteVO> list3 = list2;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list3, 10));
        boolean z = false;
        for (NoteVO noteVOCopy$default : list3) {
            int type = noteVOCopy$default.getType();
            List<Label> list4 = C34434OooOoO.f123453OooOo0o;
            if (type == 0 ? (list = oooO0Oo.f77195OooO00o.get(noteVOCopy$default.getId())) != null : type == 1 ? (list = oooO0Oo.f77196OooO0O0.get(noteVOCopy$default.getId())) != null : type == 2 && (list = oooO0Oo.f77197OooO0OO.get(new C32443OooOOO(noteVOCopy$default.getId(), noteVOCopy$default.getPageNoteId()))) != null) {
                list4 = list;
            }
            List<Label> list5 = list4;
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list5, 10));
            for (Label label : list5) {
                arrayList2.add(new ItemLabelVO(label.getId(), label.getName(), label.getColor(), label.getIndex()));
            }
            if (!OooOOO0.OooO0O0(noteVOCopy$default.getLabelList(), arrayList2)) {
                z = true;
                noteVOCopy$default = NoteVO.copy$default(noteVOCopy$default, null, null, null, null, null, null, 0, 0, null, false, 0L, 0L, false, false, false, 0, 0, null, null, null, null, null, null, 0, null, false, false, 0L, false, arrayList2, false, 1610612735, null);
            }
            arrayList.add(noteVOCopy$default);
        }
        return z ? arrayList : list2;
    }
}
