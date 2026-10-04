package o0o0O00O;

import com.orion.notein.p607ui.notelist.label.LabelListFragment;
import com.orion.notein.p607ui.p609vo.NoteVO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import o0o00oOo.C30035OooO0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0o0O00O.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.label.LabelListFragment$onNoteListItemMoved$1", m80623f = "LabelListFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30252OooOoo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ LabelListFragment f107800OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f107801OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ NoteVO f107802OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ NoteVO f107803OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30252OooOoo0(boolean z, LabelListFragment labelListFragment, NoteVO noteVO, NoteVO noteVO2, Continuation<? super C30252OooOoo0> continuation) {
        super(2, continuation);
        this.f107801OooOo0o = z;
        this.f107800OooOo = labelListFragment;
        this.f107803OooOoO0 = noteVO;
        this.f107802OooOoO = noteVO2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30252OooOoo0(this.f107801OooOo0o, this.f107800OooOo, this.f107803OooOoO0, this.f107802OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30252OooOoo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        NoteVO noteVO;
        ArrayList arrayListO0ooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LabelListFragment labelListFragment = this.f107800OooOo;
        boolean z = this.f107801OooOo0o;
        int i = 0;
        NoteVO noteVO2 = this.f107803OooOoO0;
        if (z) {
            C30035OooO0oO c30035OooO0oO = labelListFragment.f77763Oooo00O;
            if (c30035OooO0oO == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("noteAdapter");
                throw null;
            }
            Iterable iterable = c30035OooO0oO.f66021OooO00o.f65811OooO0o;
            kotlin.jvm.internal.OooOOO0.OooO0o(iterable, "getCurrentList(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : iterable) {
                if (!((NoteVO) obj2).isSelected()) {
                    arrayList.add(obj2);
                }
            }
            arrayListO0ooOoO = oOo000Oo.OooOo.o0ooOoO(arrayList);
            C30035OooO0oO c30035OooO0oO2 = labelListFragment.f77763Oooo00O;
            if (c30035OooO0oO2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("noteAdapter");
                throw null;
            }
            Iterable iterable2 = c30035OooO0oO2.f66021OooO00o.f65811OooO0o;
            kotlin.jvm.internal.OooOOO0.OooO0o(iterable2, "getCurrentList(...)");
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : iterable2) {
                if (((NoteVO) obj3).isSelected()) {
                    arrayList2.add(obj3);
                }
            }
            int iIndexOf = arrayListO0ooOoO.indexOf(noteVO2);
            if (iIndexOf == -1) {
                arrayListO0ooOoO.addAll(arrayList2);
            } else {
                ArrayList arrayList3 = new ArrayList();
                int i2 = 0;
                for (Object obj4 : arrayListO0ooOoO) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        C34429OooOOo0.OooOOo();
                        throw null;
                    }
                    Integer num = (i2 < iIndexOf || ((NoteVO) obj4).isSelected()) ? null : new Integer(i2);
                    if (num != null) {
                        arrayList3.add(num);
                    }
                    i2 = i3;
                }
                Integer num2 = (Integer) oOo000Oo.OooOo.Oooo(arrayList3);
                if (num2 == null) {
                    arrayListO0ooOoO.addAll(arrayList2);
                } else {
                    arrayListO0ooOoO.addAll(num2.intValue(), arrayList2);
                }
            }
        } else {
            C30035OooO0oO c30035OooO0oO3 = labelListFragment.f77763Oooo00O;
            if (c30035OooO0oO3 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("noteAdapter");
                throw null;
            }
            Iterable iterable3 = c30035OooO0oO3.f66021OooO00o.f65811OooO0o;
            kotlin.jvm.internal.OooOOO0.OooO0o(iterable3, "getCurrentList(...)");
            ArrayList arrayList4 = new ArrayList();
            Iterator it = iterable3.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                noteVO = this.f107802OooOoO;
                if (!zHasNext) {
                    break;
                }
                Object next = it.next();
                if (!kotlin.jvm.internal.OooOOO0.OooO0O0(((NoteVO) next).getId(), noteVO.getId())) {
                    arrayList4.add(next);
                }
            }
            arrayListO0ooOoO = oOo000Oo.OooOo.o0ooOoO(arrayList4);
            if (noteVO2 == null) {
                arrayListO0ooOoO.add(noteVO);
            } else {
                arrayListO0ooOoO.add(arrayListO0ooOoO.indexOf(noteVO2), noteVO);
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            }
        }
        for (Object obj5 : arrayListO0ooOoO) {
            int i4 = i + 1;
            if (i < 0) {
                C34429OooOOo0.OooOOo();
                throw null;
            }
            NoteVO noteVO3 = (NoteVO) obj5;
            if (noteVO3.getType() == 0) {
                linkedHashMap.put(noteVO3.getId(), new Integer(i));
            } else if (noteVO3.getType() == 1) {
                linkedHashMap2.put(noteVO3.getId(), new Integer(i));
            }
            i = i4;
        }
        labelListFragment.OooOoo().Oooo0OO(linkedHashMap, linkedHashMap2);
        return C32460OooOooO.f116667OooO00o;
    }
}
