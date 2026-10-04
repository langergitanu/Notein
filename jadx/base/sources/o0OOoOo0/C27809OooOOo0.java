package o0OOoOo0;

import com.orion.notein.data.p602db.entity.LabelCount;
import com.orion.notein.domain.models.Label;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: o0OOoOo0.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.label.GetItemsByLabelUseCase$findLabelsByItemDataList$1", m80623f = "GetItemsByLabelUseCase.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C27809OooOOo0 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<List<? extends LabelCount>, List<? extends Label>, Continuation<? super Map<Label, Integer>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ List f98229OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f98230OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(List<? extends LabelCount> list, List<? extends Label> list2, Continuation<? super Map<Label, Integer>> continuation) {
        C27809OooOOo0 c27809OooOOo0 = new C27809OooOOo0(3, continuation);
        c27809OooOOo0.f98230OooOo0o = list;
        c27809OooOOo0.f98229OooOo = list2;
        return c27809OooOOo0.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Object next;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List<LabelCount> list = this.f98230OooOo0o;
        List list2 = this.f98229OooOo;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (LabelCount labelCount : list) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((Label) next).getId() == labelCount.getLabelId()) {
                    break;
                }
            }
            Label label = (Label) next;
            if (label != null) {
                linkedHashMap.put(label, new Integer(labelCount.getCount()));
            }
        }
        return linkedHashMap;
    }
}
