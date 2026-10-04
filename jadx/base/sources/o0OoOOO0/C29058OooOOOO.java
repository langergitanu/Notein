package o0OoOOO0;

import androidx.core.view.ViewCompat;
import com.orion.notein.p607ui.p609vo.PenColorVO;
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
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0OoOOO0.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.TextBoxViewModel$fullPenColorVOList$1", m80623f = "TextBoxViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29058OooOOOO extends AbstractC32476OooO implements InterfaceC32510OooOOo0<Map<Integer, ? extends Object>, List<? extends Integer>, Continuation<? super List<? extends PenColorVO>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ List f102980OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Map f102981OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(Map<Integer, ? extends Object> map, List<? extends Integer> list, Continuation<? super List<? extends PenColorVO>> continuation) {
        C29058OooOOOO c29058OooOOOO = new C29058OooOOOO(3, continuation);
        c29058OooOOOO.f102981OooOo0o = map;
        c29058OooOOOO.f102980OooOo = list;
        return c29058OooOOOO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        Map map = this.f102981OooOo0o;
        List list = this.f102980OooOo;
        Object obj2 = map.get(new Integer(12));
        Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
        int iIntValue = num != null ? num.intValue() : ViewCompat.MEASURED_STATE_MASK;
        List list2 = list;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        int i = 0;
        for (Object obj3 : list2) {
            int i2 = i + 1;
            if (i < 0) {
                C34429OooOOo0.OooOOo();
                throw null;
            }
            int iIntValue2 = ((Number) obj3).intValue();
            arrayList.add(new PenColorVO(i, 0, iIntValue2, iIntValue2 == iIntValue, false, 16, null));
            i = i2;
        }
        return arrayList;
    }
}
