package o0OO00o0;

import com.orion.notein.data.p602db.entity.ItemLabelCrossRef;
import com.orion.notein.data.p602db.entity.LabelEntity;
import com.orion.notein.domain.models.Label;
import java.util.ArrayList;
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

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.LabelRepoImpl$getLabelsForPageIdsForSingleNote$1", m80623f = "LabelRepoImpl.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class o00OO000 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<List<? extends ItemLabelCrossRef>, List<? extends LabelEntity>, Continuation<? super Map<String, ? extends List<? extends Label>>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ List f91783OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f91784OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ o00O f91785OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ List<String> f91786OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO000(List<String> list, o00O o00o2, Continuation<? super o00OO000> continuation) {
        super(3, continuation);
        this.f91786OooOoO0 = list;
        this.f91785OooOoO = o00o2;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(List<? extends ItemLabelCrossRef> list, List<? extends LabelEntity> list2, Continuation<? super Map<String, ? extends List<? extends Label>>> continuation) {
        o00OO000 o00oo0002 = new o00OO000(this.f91786OooOoO0, this.f91785OooOoO, continuation);
        o00oo0002.f91784OooOo0o = list;
        o00oo0002.f91783OooOo = list2;
        return o00oo0002.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Object next;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List list = this.f91784OooOo0o;
        List list2 = this.f91783OooOo;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (this.f91786OooOoO0.contains(((ItemLabelCrossRef) obj2).getItemId())) {
                arrayList.add(obj2);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj3 : arrayList) {
            String itemId = ((ItemLabelCrossRef) obj3).getItemId();
            Object arrayList2 = linkedHashMap.get(itemId);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(itemId, arrayList2);
            }
            ((List) arrayList2).add(obj3);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(oOo000Oo.Oooo0.OooO0Oo(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            List<ItemLabelCrossRef> list3 = (List) entry.getValue();
            ArrayList arrayList3 = new ArrayList();
            for (ItemLabelCrossRef itemLabelCrossRef : list3) {
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((LabelEntity) next).getId() == itemLabelCrossRef.getLabelId()) {
                        break;
                    }
                }
                LabelEntity labelEntity = (LabelEntity) next;
                Label model = labelEntity != null ? this.f91785OooOoO.f91623OooO0O0.toModel(labelEntity) : null;
                if (model != null) {
                    arrayList3.add(model);
                }
            }
            linkedHashMap2.put(key, arrayList3);
        }
        return linkedHashMap2;
    }
}
