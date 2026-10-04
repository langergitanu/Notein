package o0OoOOO0;

import com.orion.notein.p607ui.p609vo.PenColorVO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import o0OOo0Oo.InterfaceC27324Oooo0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: renamed from: o0OoOOO0.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.TextBoxViewModel$setTextStyleLocked$2", m80623f = "TextBoxViewModel.kt", m80624l = {519, 524}, m80625m = "invokeSuspend")
public final class C29067OooOo0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f103010OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public LinkedHashMap f103011OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ Map<Integer, Object> f103012OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C29051OooOO0o f103013OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29067OooOo0o(C29051OooOO0o c29051OooOO0o, Map<Integer, ? extends Object> map, Continuation<? super C29067OooOo0o> continuation) {
        super(2, continuation);
        this.f103013OooOoO0 = c29051OooOO0o;
        this.f103012OooOoO = map;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29067OooOo0o(this.f103013OooOoO0, this.f103012OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29067OooOo0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0170, code lost:
    
        if (r6.OooO0Oo(r1, r11) == r0) goto L62;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        LinkedHashMap linkedHashMap;
        Object next;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f103010OooOo;
        C29051OooOO0o c29051OooOO0o = this.f103013OooOoO0;
        InterfaceC27324Oooo0oo interfaceC27324Oooo0oo = c29051OooOO0o.f102895OooO0Oo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            LinkedHashMap linkedHashMapOooOOOO = C34444Oooo0O0.OooOOOO((Map) c29051OooOO0o.f102902OooOO0o.f121747OooOo0o.getValue());
            linkedHashMapOooOOOO.remove(new Integer(5));
            linkedHashMapOooOOOO.remove(new Integer(6));
            linkedHashMap = new LinkedHashMap(oOo000Oo.Oooo0.OooO0Oo(linkedHashMapOooOOOO.size()));
            for (Map.Entry entry : linkedHashMapOooOOOO.entrySet()) {
                Object key = entry.getKey();
                int iIntValue = ((Number) entry.getKey()).intValue();
                Object value = entry.getValue();
                Object obj2 = this.f103012OooOoO.get(new Integer(iIntValue));
                if (obj2 != null) {
                    value = obj2;
                }
                linkedHashMap.put(key, value);
            }
            if (linkedHashMap.containsKey(new Integer(12))) {
                Object obj3 = linkedHashMap.get(new Integer(12));
                kotlin.jvm.internal.OooOOO0.OooO0o0(obj3, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue2 = ((Integer) obj3).intValue();
                List list = (List) c29051OooOO0o.f102903OooOOO.f121747OooOo0o.getValue();
                List list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (((PenColorVO) it.next()).getColor() == iIntValue2) {
                            break;
                        }
                    }
                }
                if (!list.isEmpty()) {
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        if (((PenColorVO) next).getSelected()) {
                            break;
                        }
                    }
                    PenColorVO penColorVO = (PenColorVO) next;
                    if (penColorVO == null || iIntValue2 != penColorVO.getColor()) {
                        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            arrayList.add(new Integer(((PenColorVO) it3.next()).getColor()));
                        }
                        ArrayList arrayListO0ooOoO = oOo000Oo.OooOo.o0ooOoO(arrayList);
                        int index = penColorVO != null ? penColorVO.getIndex() : 0;
                        if (index >= arrayListO0ooOoO.size() || index < 0) {
                            arrayListO0ooOoO.set(0, new Integer(iIntValue2));
                        } else {
                            arrayListO0ooOoO.set(index, new Integer(iIntValue2));
                        }
                        this.f103011OooOo0o = linkedHashMap;
                        this.f103010OooOo = 1;
                        if (interfaceC27324Oooo0oo.OooO0oo(arrayListO0ooOoO, this) != enumC32485OooO00o) {
                            break;
                        }
                        return enumC32485OooO00o;
                    }
                }
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            linkedHashMap = this.f103011OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        this.f103011OooOo0o = null;
        this.f103010OooOo = 2;
    }
}
