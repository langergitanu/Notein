package o0o0OO0;

import com.orion.notein.domain.models.ocr.AiOcrSession;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: o0o0OO0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.viewmodel.AiOcrViewModel$_currentSession$1", m80623f = "AiOcrViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30382OooO0O0 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<List<? extends AiOcrSession>, String, Continuation<? super AiOcrSession>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ String f108444OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f108445OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(List<? extends AiOcrSession> list, String str, Continuation<? super AiOcrSession> continuation) {
        C30382OooO0O0 c30382OooO0O0 = new C30382OooO0O0(3, continuation);
        c30382OooO0O0.f108445OooOo0o = list;
        c30382OooO0O0.f108444OooOo = str;
        return c30382OooO0O0.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List list = this.f108445OooOo0o;
        String str = this.f108444OooOo;
        for (Object obj2 : list) {
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(((AiOcrSession) obj2).getId(), str)) {
                return obj2;
            }
        }
        return null;
    }
}
