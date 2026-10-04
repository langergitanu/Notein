package o0Ooo0oo;

import com.orion.notein.domain.models.note.PenInfo;
import com.orion.notein.p607ui.p609vo.PenColorVO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0Ooo0oo.o000000, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarViewModel$penColorList$1", m80623f = "PenBarViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29502o000000 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<List<? extends PenInfo>, C32443OooOOO<? extends Boolean, ? extends Integer>, Continuation<? super List<? extends PenColorVO>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ C32443OooOOO f104621OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f104622OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(List<? extends PenInfo> list, C32443OooOOO<? extends Boolean, ? extends Integer> c32443OooOOO, Continuation<? super List<? extends PenColorVO>> continuation) {
        C29502o000000 c29502o000000 = new C29502o000000(3, continuation);
        c29502o000000.f104622OooOo0o = list;
        c29502o000000.f104621OooOo = c32443OooOOO;
        return c29502o000000.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Object next;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List list = this.f104622OooOo0o;
        C32443OooOOO c32443OooOOO = this.f104621OooOo;
        boolean zBooleanValue = ((Boolean) c32443OooOOO.f116638OooOo0o).booleanValue();
        Integer num = (Integer) c32443OooOOO.f116637OooOo;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((PenInfo) next).getSelected()) {
                break;
            }
        }
        PenInfo penInfo = (PenInfo) next;
        if (penInfo == null) {
            return C34434OooOoO.f123453OooOo0o;
        }
        boolean z = penInfo.getType() == 4 ? zBooleanValue : true;
        List<Integer> colorList = penInfo.getColorList();
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(colorList, 10));
        int i = 0;
        for (Object obj2 : colorList) {
            int i2 = i + 1;
            if (i < 0) {
                C34429OooOOo0.OooOOo();
                throw null;
            }
            int iIntValue = ((Number) obj2).intValue();
            arrayList.add(new PenColorVO(i, penInfo.getType(), iIntValue, penInfo.getType() != 4 ? penInfo.getColorIndex() == i : !(num == null || iIntValue != num.intValue()), z));
            i = i2;
        }
        return arrayList;
    }
}
