package o0o00oOo;

import com.orion.notein.p607ui.notelist.NoteListFragment;
import com.orion.notein.p607ui.p609vo.NoteVO;
import com.orion.notein.p607ui.p609vo.NoteVOFilter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0o00oOo.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListFragment$onNoteListItemMoved$1", m80623f = "NoteListFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30047OooOoO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ boolean f106845OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ NoteListFragment f106846OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ NoteVO f106847OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ NoteVO f106848OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30047OooOoO0(NoteListFragment noteListFragment, NoteVO noteVO, NoteVO noteVO2, Continuation continuation, boolean z) {
        super(2, continuation);
        this.f106846OooOo0o = noteListFragment;
        this.f106845OooOo = z;
        this.f106848OooOoO0 = noteVO;
        this.f106847OooOoO = noteVO2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30047OooOoO0(this.f106846OooOo0o, this.f106848OooOoO0, this.f106847OooOoO, continuation, this.f106845OooOo);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30047OooOoO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r16v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r16v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        ?? r16;
        NoteVO noteVO;
        Object next;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        NoteListFragment noteListFragment = this.f106846OooOo0o;
        ArrayList arrayListO0ooOoO = oOo000Oo.OooOo.o0ooOoO((Collection) noteListFragment.OooOoo().f77170Ooooo0o.f121747OooOo0o.getValue());
        Iterable iterable = (Iterable) noteListFragment.OooOoo().f77170Ooooo0o.f121747OooOo0o.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                try {
                    boolean z = this.f106845OooOo;
                    NoteVO noteVO2 = this.f106848OooOoO0;
                    int i2 = -1;
                    if (z) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : arrayList) {
                            if (!((NoteVO) ((C32443OooOOO) obj2).f116637OooOo).isSelected()) {
                                arrayList2.add(obj2);
                            }
                        }
                        ArrayList arrayListO0ooOoO2 = oOo000Oo.OooOo.o0ooOoO(arrayList2);
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj3 : arrayList) {
                            if (((NoteVO) ((C32443OooOOO) obj3).f116637OooOo).isSelected()) {
                                arrayList3.add(obj3);
                            }
                        }
                        Iterator it2 = arrayListO0ooOoO2.iterator();
                        int i3 = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                i3 = -1;
                                break;
                            }
                            if (kotlin.jvm.internal.OooOOO0.OooO0O0(((NoteVO) ((C32443OooOOO) it2.next()).f116637OooOo).getId(), noteVO2 != null ? noteVO2.getId() : null)) {
                                break;
                            }
                            i3++;
                        }
                        if (i3 == -1) {
                            arrayListO0ooOoO2.addAll(arrayList3);
                            r16 = 0;
                        } else {
                            ArrayList arrayList4 = new ArrayList();
                            int i4 = 0;
                            for (Object obj4 : arrayListO0ooOoO2) {
                                int i5 = i4 + 1;
                                if (i4 < 0) {
                                    ?? r162 = c32443OooOOO;
                                    C34429OooOOo0.OooOOo();
                                    throw r162;
                                }
                                C32443OooOOO c32443OooOOO = (C32443OooOOO) obj4;
                                C32443OooOOO c32443OooOOO2 = c32443OooOOO;
                                ((Number) c32443OooOOO.f116638OooOo0o).intValue();
                                Object num = (i4 < i3 || ((NoteVO) c32443OooOOO.f116637OooOo).isSelected()) ? c32443OooOOO2 : new Integer(i4);
                                if (num != null) {
                                    arrayList4.add(num);
                                }
                                i4 = i5;
                                c32443OooOOO = c32443OooOOO2;
                            }
                            C32443OooOOO c32443OooOOO3 = c32443OooOOO;
                            Integer num2 = (Integer) oOo000Oo.OooOo.Oooo(arrayList4);
                            if (num2 == null) {
                                arrayListO0ooOoO2.addAll(arrayList3);
                                r16 = c32443OooOOO3;
                            } else {
                                arrayListO0ooOoO2.addAll(num2.intValue(), arrayList3);
                                r16 = c32443OooOOO3;
                            }
                        }
                        int i6 = 0;
                        for (Object obj5 : arrayList) {
                            int i7 = i6 + 1;
                            if (i6 < 0) {
                                C34429OooOOo0.OooOOo();
                                throw r16;
                            }
                            arrayListO0ooOoO.set(((Number) ((C32443OooOOO) obj5).f116638OooOo0o).intValue(), ((C32443OooOOO) arrayListO0ooOoO2.get(i6)).f116637OooOo);
                            i6 = i7;
                        }
                    } else {
                        r16 = 0;
                        ArrayList arrayList5 = new ArrayList();
                        Iterator it3 = arrayList.iterator();
                        while (true) {
                            boolean zHasNext = it3.hasNext();
                            noteVO = this.f106847OooOoO;
                            if (!zHasNext) {
                                break;
                            }
                            Object next2 = it3.next();
                            if (!kotlin.jvm.internal.OooOOO0.OooO0O0(((NoteVO) ((C32443OooOOO) next2).f116637OooOo).getId(), noteVO.getId())) {
                                arrayList5.add(next2);
                            }
                        }
                        ArrayList arrayListO0ooOoO3 = oOo000Oo.OooOo.o0ooOoO(arrayList5);
                        Iterator it4 = arrayList.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it4.next();
                            if (kotlin.jvm.internal.OooOOO0.OooO0O0(((NoteVO) ((C32443OooOOO) next).f116637OooOo).getId(), noteVO.getId())) {
                                break;
                            }
                        }
                        C32443OooOOO c32443OooOOO4 = (C32443OooOOO) next;
                        if (c32443OooOOO4 == null) {
                            return C32460OooOooO.f116667OooO00o;
                        }
                        if (noteVO2 == null) {
                            arrayListO0ooOoO3.add(c32443OooOOO4);
                        } else {
                            Iterator it5 = arrayListO0ooOoO3.iterator();
                            int i8 = 0;
                            while (true) {
                                if (!it5.hasNext()) {
                                    break;
                                }
                                if (kotlin.jvm.internal.OooOOO0.OooO0O0(((NoteVO) ((C32443OooOOO) it5.next()).f116637OooOo).getId(), noteVO2.getId())) {
                                    i2 = i8;
                                    break;
                                }
                                i8++;
                            }
                            arrayListO0ooOoO3.add(i2, c32443OooOOO4);
                        }
                        int i9 = 0;
                        for (Object obj6 : arrayList) {
                            int i10 = i9 + 1;
                            if (i9 < 0) {
                                C34429OooOOo0.OooOOo();
                                throw null;
                            }
                            arrayListO0ooOoO.set(((Number) ((C32443OooOOO) obj6).f116638OooOo0o).intValue(), ((C32443OooOOO) arrayListO0ooOoO3.get(i9)).f116637OooOo);
                            i9 = i10;
                        }
                    }
                    int i11 = 0;
                    for (Object obj7 : arrayListO0ooOoO) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            C34429OooOOo0.OooOOo();
                            throw r16;
                        }
                        NoteVO noteVO3 = (NoteVO) obj7;
                        if (noteVO3.getType() == 0) {
                            linkedHashMap.put(noteVO3.getId(), new Integer(i11));
                        } else if (noteVO3.getType() == 1) {
                            linkedHashMap2.put(noteVO3.getId(), new Integer(i11));
                        }
                        i11 = i12;
                    }
                    noteListFragment.OooOoo().Oooo0OO(linkedHashMap, linkedHashMap2);
                } catch (Exception unused) {
                }
                return C32460OooOooO.f116667OooO00o;
            }
            Object next3 = it.next();
            int i13 = i + 1;
            if (i < 0) {
                C34429OooOOo0.OooOOo();
                throw null;
            }
            NoteVO noteVO4 = (NoteVO) next3;
            NoteVOFilter noteVOFilter = noteListFragment.f77014OooOooo;
            if (noteVOFilter == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("filterVO");
                throw null;
            }
            c32443OooOOO = noteVOFilter.getFilterFunction().invoke(noteVO4).booleanValue() ? new C32443OooOOO(new Integer(i), noteVO4) : null;
            if (c32443OooOOO != null) {
                arrayList.add(c32443OooOOO);
            }
            i = i13;
        }
    }
}
