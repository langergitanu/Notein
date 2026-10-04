package o0o00oO;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0o00oO.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.translate.TranslateViewModel$toLanguageList$1", m80623f = "TranslateViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29983OooOooo extends AbstractC32476OooO implements InterfaceC32510OooOOo0<Map<Integer, ? extends String>, Integer, Continuation<? super List<? extends C29954OooO>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ int f106509OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Map f106510OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(Map<Integer, ? extends String> map, Integer num, Continuation<? super List<? extends C29954OooO>> continuation) {
        int iIntValue = num.intValue();
        C29983OooOooo c29983OooOooo = new C29983OooOooo(3, continuation);
        c29983OooOooo.f106510OooOo0o = map;
        c29983OooOooo.f106509OooOo = iIntValue;
        return c29983OooOooo.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        Map map = this.f106510OooOo0o;
        int i = this.f106509OooOo;
        Set setEntrySet = map.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : setEntrySet) {
            if (!kotlin.jvm.internal.OooOOO0.OooO0O0(((Map.Entry) obj2).getValue(), "auto")) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
        int i2 = 0;
        for (Object obj3 : arrayList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C34429OooOOo0.OooOOo();
                throw null;
            }
            arrayList2.add(new C29954OooO(((Number) ((Map.Entry) obj3).getKey()).intValue(), i2 == i));
            i2 = i3;
        }
        return arrayList2;
    }
}
