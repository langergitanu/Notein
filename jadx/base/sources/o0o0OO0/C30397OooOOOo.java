package o0o0OO0;

import com.orion.notein.domain.models.ocr.AiOcrSession;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o0OO0.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.viewmodel.AiOcrViewModel$deletePage$1", m80623f = "AiOcrViewModel.kt", m80624l = {649, 650}, m80625m = "invokeSuspend")
public final class C30397OooOOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30394OooOOOO f108544OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f108545OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f108546OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30397OooOOOo(C30394OooOOOO c30394OooOOOO, String str, Continuation<? super C30397OooOOOo> continuation) {
        super(2, continuation);
        this.f108544OooOo = c30394OooOOOO;
        this.f108546OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30397OooOOOo(this.f108544OooOo, this.f108546OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30397OooOOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        if (r3.f108494OooO0o.OooO0O0(r4, r19) == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108545OooOo0o;
        C30394OooOOOO c30394OooOOOO = this.f108544OooOo;
        String str = this.f108546OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AiOcrSession aiOcrSession = (AiOcrSession) c30394OooOOOO.f108504OooOOOo.f121747OooOo0o.getValue();
            if (aiOcrSession == null) {
                return C32460OooOooO.f116667OooO00o;
            }
            List<String> pageIds = aiOcrSession.getPageIds();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : pageIds) {
                if (!kotlin.jvm.internal.OooOOO0.OooO0O0((String) obj2, str)) {
                    arrayList.add(obj2);
                }
            }
            AiOcrSession aiOcrSessionCopy$default = AiOcrSession.copy$default(aiOcrSession, null, null, null, arrayList, null, 0L, System.currentTimeMillis(), 55, null);
            this.f108545OooOo0o = 1;
            if (c30394OooOOOO.f108495OooO0o0.OooO0oo(aiOcrSessionCopy$default, this) != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        this.f108545OooOo0o = 2;
    }
}
