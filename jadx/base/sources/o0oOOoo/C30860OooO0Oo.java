package o0oOOoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0o00oO.C29954OooO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0oOOoo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.viewmodel.GlobalSettingsFastTranslationViewModel$targetLanguageList$1", m80623f = "GlobalSettingsFastTranslationViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30860OooO0Oo extends AbstractC32476OooO implements InterfaceC32510OooOOo0<Map<Integer, ? extends String>, String, Continuation<? super List<? extends C29954OooO>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ String f110322OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Map f110323OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C30861OooO0o0 f110324OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30860OooO0Oo(C30861OooO0o0 c30861OooO0o0, Continuation<? super C30860OooO0Oo> continuation) {
        super(3, continuation);
        this.f110324OooOoO0 = c30861OooO0o0;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(Map<Integer, ? extends String> map, String str, Continuation<? super List<? extends C29954OooO>> continuation) {
        C30860OooO0Oo c30860OooO0Oo = new C30860OooO0Oo(this.f110324OooOoO0, continuation);
        c30860OooO0Oo.f110323OooOo0o = map;
        c30860OooO0Oo.f110322OooOo = str;
        return c30860OooO0Oo.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        Map map = this.f110323OooOo0o;
        String str = this.f110322OooOo;
        Set<Map.Entry> setEntrySet = map.entrySet();
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            C30861OooO0o0 c30861OooO0o0 = this.f110324OooOoO0;
            arrayList.add(new C29954OooO(OooOOO0.OooO0O0(value, c30861OooO0o0.f110327OooO0o) ? c30861OooO0o0.f110329OooO0oO : ((Number) entry.getKey()).intValue(), OooOOO0.OooO0O0(entry.getValue(), str)));
        }
        return arrayList;
    }
}
