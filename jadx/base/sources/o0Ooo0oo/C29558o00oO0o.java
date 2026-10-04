package o0Ooo0oo;

import com.orion.notein.p607ui.p609vo.PenColorVO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0o00Ooo.C29920OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0Ooo0oo.o00oO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarViewModel$colorSetFavorite$1", m80623f = "PenBarViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29558o00oO0o extends AbstractC32476OooO implements InterfaceC32510OooOOo0<List<? extends C29920OooO0oo>, List<? extends PenColorVO>, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ List f104853OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f104854OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(List<? extends C29920OooO0oo> list, List<? extends PenColorVO> list2, Continuation<? super Boolean> continuation) {
        C29558o00oO0o c29558o00oO0o = new C29558o00oO0o(3, continuation);
        c29558o00oO0o.f104854OooOo0o = list;
        c29558o00oO0o.f104853OooOo = list2;
        return c29558o00oO0o.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        boolean z;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List list = this.f104854OooOo0o;
        List list2 = this.f104853OooOo;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new Integer(((PenColorVO) it.next()).getColor()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list.iterator();
        while (true) {
            z = true;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((C29920OooO0oo) next).f106162OooO0o == 1) {
                arrayList2.add(next);
            }
        }
        if (arrayList2.isEmpty()) {
            z = false;
        } else {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(((C29920OooO0oo) it3.next()).f106160OooO0OO, arrayList)) {
                    break;
                }
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
