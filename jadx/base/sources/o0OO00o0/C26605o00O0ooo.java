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

/* JADX INFO: renamed from: o0OO00o0.o00O0ooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.LabelRepoImpl$getLabelsForNoteIds$1", m80623f = "LabelRepoImpl.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C26605o00O0ooo extends AbstractC32476OooO implements InterfaceC32510OooOOo0<List<? extends ItemLabelCrossRef>, List<? extends LabelEntity>, Continuation<? super Map<String, ? extends List<? extends Label>>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ List f91775OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f91776OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ o00O f91777OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26605o00O0ooo(o00O o00o2, Continuation<? super C26605o00O0ooo> continuation) {
        super(3, continuation);
        this.f91777OooOoO0 = o00o2;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(List<? extends ItemLabelCrossRef> list, List<? extends LabelEntity> list2, Continuation<? super Map<String, ? extends List<? extends Label>>> continuation) {
        C26605o00O0ooo c26605o00O0ooo = new C26605o00O0ooo(this.f91777OooOoO0, continuation);
        c26605o00O0ooo.f91776OooOo0o = list;
        c26605o00O0ooo.f91775OooOo = list2;
        return c26605o00O0ooo.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Object next;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List list = this.f91776OooOo0o;
        List list2 = this.f91775OooOo;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : list) {
            String itemId = ((ItemLabelCrossRef) obj2).getItemId();
            Object arrayList = linkedHashMap.get(itemId);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(itemId, arrayList);
            }
            ((List) arrayList).add(obj2);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(oOo000Oo.Oooo0.OooO0Oo(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            List<ItemLabelCrossRef> list3 = (List) entry.getValue();
            ArrayList arrayList2 = new ArrayList();
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
                Label model = labelEntity != null ? this.f91777OooOoO0.f91623OooO0O0.toModel(labelEntity) : null;
                if (model != null) {
                    arrayList2.add(model);
                }
            }
            linkedHashMap2.put(key, arrayList2);
        }
        return linkedHashMap2;
    }
}
