package o0o0OO0;

import com.orion.notein.domain.models.ocr.AiOcrTextPage;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0oOoOo.C31030OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0o0OO0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.viewmodel.AiOcrViewModel$aiOcrTextPageVoList$1", m80623f = "AiOcrViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30383OooO0OO extends AbstractC32476OooO implements InterfaceC32510OooOOo0<String, List<? extends AiOcrTextPage>, Continuation<? super List<? extends C31030OooO00o>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ List f108446OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ String f108447OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(String str, List<? extends AiOcrTextPage> list, Continuation<? super List<? extends C31030OooO00o>> continuation) {
        C30383OooO0OO c30383OooO0OO = new C30383OooO0OO(3, continuation);
        c30383OooO0OO.f108447OooOo0o = str;
        c30383OooO0OO.f108446OooOo = list;
        return c30383OooO0OO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        String str = this.f108447OooOo0o;
        List list = this.f108446OooOo;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                C34429OooOOo0.OooOOo();
                throw null;
            }
            AiOcrTextPage aiOcrTextPage = (AiOcrTextPage) obj2;
            arrayList.add(new C31030OooO00o(aiOcrTextPage.getId(), i, aiOcrTextPage.getContent(), kotlin.jvm.internal.OooOOO0.OooO0O0(aiOcrTextPage.getId(), str)));
            i = i2;
        }
        return arrayList;
    }
}
