package oO0Oo;

import com.orion.notein.domain.models.ocr.AiOcrSession;
import com.orion.notein.p607ui.ocr.TextRecognizeFragment;
import kotlin.coroutines.Continuation;
import o0o0OO0.C30385OooO0o;
import o0o0OO0.C30391OooOO0o;
import o0o0OO0.C30394OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: oO0Oo.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.TextRecognizeFragment$handleNoteInputSourceSelected$1", m80623f = "TextRecognizeFragment.kt", m80624l = {1226, 1229}, m80625m = "invokeSuspend")
public final class C33175OooOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ boolean f120055OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f120056OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f120057OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ TextRecognizeFragment f120058OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33175OooOOo(boolean z, TextRecognizeFragment textRecognizeFragment, String str, Continuation<? super C33175OooOOo> continuation) {
        super(2, continuation);
        this.f120055OooOo = z;
        this.f120058OooOoO0 = textRecognizeFragment;
        this.f120057OooOoO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C33175OooOOo(this.f120055OooOo, this.f120058OooOoO0, this.f120057OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C33175OooOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r9 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (r9 == r0) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        AiOcrSession aiOcrSession;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f120056OooOo0o;
        TextRecognizeFragment textRecognizeFragment = this.f120058OooOoO0;
        boolean z = this.f120055OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            String str = this.f120057OooOoO;
            aiOcrSession = null;
            if (z) {
                this.f120056OooOo0o = 1;
                C30394OooOOOO c30394OooOOOOOooo00O = textRecognizeFragment.Oooo00O();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C30391OooOO0o(c30394OooOOOOOooo00O, str, null), this);
            } else {
                AiOcrSession aiOcrSession2 = (AiOcrSession) textRecognizeFragment.Oooo00O().f108506OooOOo0.f121747OooOo0o.getValue();
                if (aiOcrSession2 != null) {
                    C30394OooOOOO c30394OooOOOOOooo00O2 = textRecognizeFragment.Oooo00O();
                    String id = aiOcrSession2.getId();
                    this.f120056OooOo0o = 2;
                    C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                    obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C30385OooO0o(c30394OooOOOOOooo00O2, id, str, null), this);
                }
            }
            return enumC32485OooO00o;
        }
        if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
            aiOcrSession = (AiOcrSession) obj;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            aiOcrSession = (AiOcrSession) obj;
        }
        if (aiOcrSession != null) {
            TextRecognizeFragment.OooOoOO(textRecognizeFragment, aiOcrSession);
            return C32460OooOooO.f116667OooO00o;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("documentLauncher");
        c20358OooO00o.OooO0OO("Failed to create session. createNewSession=" + z, new Object[0]);
        return C32460OooOooO.f116667OooO00o;
    }
}
