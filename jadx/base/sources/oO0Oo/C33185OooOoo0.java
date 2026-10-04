package oO0Oo;

import Oooo0oO.C21030OooOO0o;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.view.InputDeviceCompat;
import com.orion.notein.domain.models.ocr.AiOcrSession;
import com.orion.notein.domain.models.ocr.AiOcrSessionInputSource;
import com.orion.notein.p607ui.ocr.TextRecognizeFragment;
import kotlin.coroutines.Continuation;
import o0Oo00o.C28026OooO0OO;
import o0o0OO0.C30391OooOO0o;
import o0o0OO0.C30394OooOOOO;
import o0o0OO0.C30398OooOOo;
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

/* JADX INFO: renamed from: oO0Oo.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.TextRecognizeFragment$selectDefaultSession$1", m80623f = "TextRecognizeFragment.kt", m80624l = {FrameMetricsAggregator.EVERY_DURATION, InputDeviceCompat.SOURCE_DPAD, 517}, m80625m = "invokeSuspend")
public final class C33185OooOoo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ TextRecognizeFragment f120091OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f120092OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f120093OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33185OooOoo0(TextRecognizeFragment textRecognizeFragment, String str, Continuation<? super C33185OooOoo0> continuation) {
        super(2, continuation);
        this.f120091OooOo = textRecognizeFragment;
        this.f120093OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C33185OooOoo0(this.f120091OooOo, this.f120093OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C33185OooOoo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
    
        if (r10 == r0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        AiOcrSession aiOcrSession;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f120092OooOo0o;
        TextRecognizeFragment textRecognizeFragment = this.f120091OooOo;
        String str = this.f120093OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C30394OooOOOO c30394OooOOOOOooo00O = textRecognizeFragment.Oooo00O();
            this.f120092OooOo0o = 1;
            obj = c30394OooOOOOOooo00O.OooOO0O(this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                AiOcrSession aiOcrSession2 = (AiOcrSession) obj;
                if (aiOcrSession2 == null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooO0OO(androidx.core.app.OooO.OooO0O0(c20358OooO00o, "TextRecognizeFragment", "Failed to create session for note: ", str), new Object[0]);
                    textRecognizeFragment.Oooo0oO(true);
                    return C32460OooOooO.f116667OooO00o;
                }
                AiOcrSessionInputSource input = aiOcrSession2.getInputSource();
                C33186OooOooO c33186OooOooO = (C33186OooOooO) textRecognizeFragment.f78164OooOoo0.getValue();
                kotlin.jvm.internal.OooOOO0.OooO0oO(input, "input");
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(textRecognizeFragment), new C33187OooOooo(input, c33186OooOooO.f120095OooO0O0));
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            aiOcrSession = (AiOcrSession) obj;
            if (aiOcrSession == null) {
                textRecognizeFragment.Oooo00O().OooOOO0(aiOcrSession.getId());
                return C32460OooOooO.f116667OooO00o;
            }
            this.f120092OooOo0o = 3;
            C30394OooOOOO c30394OooOOOOOooo00O2 = textRecognizeFragment.Oooo00O();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C30391OooOO0o(c30394OooOOOOOooo00O2, str, null), this);
        }
        String str2 = (String) obj;
        if (str2 == null) {
            return C32460OooOooO.f116667OooO00o;
        }
        C30394OooOOOO c30394OooOOOOOooo00O3 = textRecognizeFragment.Oooo00O();
        this.f120092OooOo0o = 2;
        if (str == null) {
            obj = null;
        } else {
            C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
            obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C30398OooOOo(c30394OooOOOOOooo00O3, str2, str, null), this);
        }
        if (obj != enumC32485OooO00o) {
            aiOcrSession = (AiOcrSession) obj;
            if (aiOcrSession == null) {
            }
        }
        return enumC32485OooO00o;
    }
}
