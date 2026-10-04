package o0o0OO0;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: renamed from: o0o0OO0.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.viewmodel.AiOcrViewModel$setTextStyleLocked$2", m80623f = "AiOcrViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30406OooOoO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Map<Integer, Object> f108583OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C30394OooOOOO f108584OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30406OooOoO0(C30394OooOOOO c30394OooOOOO, Map<Integer, ? extends Object> map, Continuation<? super C30406OooOoO0> continuation) {
        super(2, continuation);
        this.f108584OooOo0o = c30394OooOOOO;
        this.f108583OooOo = map;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30406OooOoO0(this.f108584OooOo0o, this.f108583OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30406OooOoO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C33781o00o0O c33781o00o0O = this.f108584OooOo0o.f108523Oooo00o;
        LinkedHashMap linkedHashMapOooOOOO = C34444Oooo0O0.OooOOOO((Map) c33781o00o0O.getValue());
        linkedHashMapOooOOOO.remove(new Integer(5));
        linkedHashMapOooOOOO.remove(new Integer(6));
        LinkedHashMap linkedHashMap = new LinkedHashMap(oOo000Oo.Oooo0.OooO0Oo(linkedHashMapOooOOOO.size()));
        for (Map.Entry entry : linkedHashMapOooOOOO.entrySet()) {
            Object key = entry.getKey();
            int iIntValue = ((Number) entry.getKey()).intValue();
            Object value = entry.getValue();
            Object obj2 = this.f108583OooOo.get(new Integer(iIntValue));
            if (obj2 != null) {
                value = obj2;
            }
            linkedHashMap.put(key, value);
        }
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, linkedHashMap);
        return C32460OooOooO.f116667OooO00o;
    }
}
