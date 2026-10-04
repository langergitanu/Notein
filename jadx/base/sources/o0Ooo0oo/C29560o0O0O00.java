package o0Ooo0oo;

import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.domain.models.note.PenInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0oOoOo.C31045OooOOo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0Ooo0oo.o0O0O00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarViewModel$laserDisappears$1", m80623f = "PenBarViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29560o0O0O00 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<List<? extends Integer>, List<? extends PenInfo>, Continuation<? super List<? extends C31045OooOOo>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ List f104864OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f104865OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(List<? extends Integer> list, List<? extends PenInfo> list2, Continuation<? super List<? extends C31045OooOOo>> continuation) {
        C29560o0O0O00 c29560o0O0O00 = new C29560o0O0O00(3, continuation);
        c29560o0O0O00.f104865OooOo0o = list;
        c29560o0O0O00.f104864OooOo = list2;
        return c29560o0O0O00.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Object next;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List list = this.f104865OooOo0o;
        Iterator it = this.f104864OooOo.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((PenInfo) next).getType() == 7) {
                break;
            }
        }
        PenInfo penInfo = (PenInfo) next;
        if (penInfo == null) {
            return C34434OooOoO.f123453OooOo0o;
        }
        Integer num = new Integer((int) penInfo.getExtra().getDouble(PenInfo.LASER_DISAPPEAR_DURATION));
        Integer num2 = num.intValue() != 0 ? num : null;
        int iIntValue = num2 != null ? num2.intValue() : 3;
        boolean zOooO0O0 = kotlin.jvm.internal.OooOOO0.OooO0O0(penInfo.getExtra().getString(C18437z2.f56754h), "spot");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            int iIntValue2 = ((Number) obj2).intValue();
            if (!zOooO0O0 || iIntValue2 > 0) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            int iIntValue3 = ((Number) it2.next()).intValue();
            arrayList2.add(new C31045OooOOo(iIntValue3, iIntValue3 == iIntValue));
        }
        return arrayList2;
    }
}
