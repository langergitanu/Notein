package o0o0OO0;

import com.orion.notein.domain.models.ocr.AiOcrSession;
import com.orion.notein.domain.models.ocr.AiOcrSessionInputSource;
import kotlin.coroutines.Continuation;
import o000oooo.C24761OooO;
import o0OOo0Oo.InterfaceC27288OooO0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o0OO0.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.viewmodel.AiOcrViewModel$changeInputSourceForNote$2", m80623f = "AiOcrViewModel.kt", m80624l = {547, 558, 559}, m80625m = "invokeSuspend")
public final class C30385OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super AiOcrSession>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30394OooOOOO f108450OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f108451OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f108452OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f108453OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30385OooO0o(C30394OooOOOO c30394OooOOOO, String str, String str2, Continuation<? super C30385OooO0o> continuation) {
        super(2, continuation);
        this.f108450OooOo = c30394OooOOOO;
        this.f108453OooOoO0 = str;
        this.f108452OooOoO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30385OooO0o(this.f108450OooOo, this.f108453OooOoO0, this.f108452OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super AiOcrSession> continuation) {
        return ((C30385OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007b A[RETURN] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooO0O0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108451OooOo0o;
        C30394OooOOOO c30394OooOOOO = this.f108450OooOo;
        String str = this.f108453OooOoO0;
        InterfaceC27288OooO0OO interfaceC27288OooO0OO = c30394OooOOOO.f108495OooO0o0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f108451OooOo0o = 1;
            objOooO0O0 = interfaceC27288OooO0OO.OooO0O0(str, this);
            if (objOooO0O0 != enumC32485OooO00o) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return obj;
            }
            C32446OooOOOo.OooO0O0(obj);
            this.f108451OooOo0o = 3;
            Object objOooO0oO = C30394OooOOOO.OooO0oO(c30394OooOOOO, str, this);
            return objOooO0oO != enumC32485OooO00o ? enumC32485OooO00o : objOooO0oO;
        }
        C32446OooOOOo.OooO0O0(obj);
        objOooO0O0 = obj;
        AiOcrSession aiOcrSession = (AiOcrSession) objOooO0O0;
        if (aiOcrSession == null) {
            return null;
        }
        AiOcrSession aiOcrSessionCopy$default = AiOcrSession.copy$default(aiOcrSession, null, null, null, null, new AiOcrSessionInputSource(C24761OooO.OooO00o("toString(...)"), 3, com.facebook.soloader.OooOo.OooO0oO(this.f108452OooOoO), null, 8, null), 0L, 0L, 111, null);
        this.f108451OooOo0o = 2;
        if (interfaceC27288OooO0OO.OooO0oo(aiOcrSessionCopy$default, this) != enumC32485OooO00o) {
            this.f108451OooOo0o = 3;
            Object objOooO0oO2 = C30394OooOOOO.OooO0oO(c30394OooOOOO, str, this);
            if (objOooO0oO2 != enumC32485OooO00o) {
            }
        }
    }
}
