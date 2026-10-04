package o0o0OO0;

import com.orion.notein.domain.models.ocr.AiOcrSession;
import kotlin.coroutines.Continuation;
import o0OOo0Oo.InterfaceC27288OooO0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o0OO0.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.viewmodel.AiOcrViewModel$updateSessionTitle$1", m80623f = "AiOcrViewModel.kt", m80624l = {601, 604}, m80625m = "invokeSuspend")
public final class C30414Oooo00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30394OooOOOO f108629OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f108630OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f108631OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f108632OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30414Oooo00o(C30394OooOOOO c30394OooOOOO, String str, String str2, Continuation<? super C30414Oooo00o> continuation) {
        super(2, continuation);
        this.f108629OooOo = c30394OooOOOO;
        this.f108632OooOoO0 = str;
        this.f108631OooOoO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30414Oooo00o(this.f108629OooOo, this.f108632OooOoO0, this.f108631OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30414Oooo00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r3.OooO0oo(r2, r17) == r1) goto L19;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooO0O0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108630OooOo0o;
        InterfaceC27288OooO0OO interfaceC27288OooO0OO = this.f108629OooOo.f108495OooO0o0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f108630OooOo0o = 1;
            objOooO0O0 = interfaceC27288OooO0OO.OooO0O0(this.f108632OooOoO0, this);
            if (objOooO0O0 != enumC32485OooO00o) {
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
        objOooO0O0 = obj;
        AiOcrSession aiOcrSession = (AiOcrSession) objOooO0O0;
        if (aiOcrSession == null) {
            return C32460OooOooO.f116667OooO00o;
        }
        AiOcrSession aiOcrSessionCopy$default = AiOcrSession.copy$default(aiOcrSession, null, null, this.f108631OooOoO, null, null, 0L, 0L, 123, null);
        this.f108630OooOo0o = 2;
    }
}
