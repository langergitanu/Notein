package o0o00oO;

import com.orion.notein.domain.models.translate.TranslateResult;
import java.io.Serializable;
import java.util.Map;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32511OooOOoo;

/* JADX INFO: renamed from: o0o00oO.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.translate.TranslateViewModel$result$1", m80623f = "TranslateViewModel.kt", m80624l = {99}, m80625m = "invokeSuspend")
public final class C29971OooOOo0 extends AbstractC32476OooO implements InterfaceC32511OooOOoo<String, Integer, Integer, Map<Integer, ? extends String>, Continuation<? super TranslateResult>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ String f106453OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f106454OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ int f106455OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ int f106456OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ Map f106457OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C29970OooOOo f106458OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29971OooOOo0(C29970OooOOo c29970OooOOo, Continuation<? super C29971OooOOo0> continuation) {
        super(5, continuation);
        this.f106458OooOoo0 = c29970OooOOo;
    }

    @Override // oO0O000o.InterfaceC32511OooOOoo
    public final Object Oooo0oO(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable) {
        int iIntValue = ((Number) obj2).intValue();
        int iIntValue2 = ((Number) obj3).intValue();
        C29971OooOOo0 c29971OooOOo0 = new C29971OooOOo0(this.f106458OooOoo0, (Continuation) serializable);
        c29971OooOOo0.f106453OooOo = (String) obj;
        c29971OooOOo0.f106456OooOoO0 = iIntValue;
        c29971OooOOo0.f106455OooOoO = iIntValue2;
        c29971OooOOo0.f106457OooOoOO = (Map) obj4;
        return c29971OooOOo0.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f106454OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        String str = this.f106453OooOo;
        int i2 = this.f106456OooOoO0;
        int i3 = this.f106455OooOoO;
        Map map = this.f106457OooOoOO;
        String str2 = (String) ((Map.Entry) oOo000Oo.OooOo.o0ooOO0(map.entrySet()).get(i2)).getValue();
        String str3 = (String) ((Map.Entry) oOo000Oo.OooOo.o0ooOO0(map.entrySet()).get(i3 + 1)).getValue();
        o0OOOO0.OooO0o oooO0o = this.f106458OooOoo0.f106434OooO0Oo;
        this.f106453OooOo = null;
        this.f106454OooOo0o = 1;
        Object objOooO0OO = oooO0o.f94327OooO00o.OooO0OO(str, str2, str3, this);
        return objOooO0OO == enumC32485OooO00o ? enumC32485OooO00o : objOooO0OO;
    }
}
