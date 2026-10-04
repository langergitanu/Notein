package oO0Oo;

import androidx.appcompat.widget.C21532OooOOo;
import androidx.lifecycle.o0OoOo0;
import com.orion.notein.domain.models.ocr.AiOcrSessionInputSource;
import com.orion.notein.p607ui.ocr.TextRecognizeFragment;
import kotlin.coroutines.Continuation;
import o0o0OO0.C30394OooOOOO;
import o0o0OO0.C30413Oooo00O;
import o0o0OO0.C30415Oooo0O0;
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

/* JADX INFO: renamed from: oO0Oo.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.TextRecognizeFragment$handleReplacePageAction$1", m80623f = "TextRecognizeFragment.kt", m80624l = {779}, m80625m = "invokeSuspend")
public final class C33177OooOOoo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ TextRecognizeFragment f120061OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f120062OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ int f120063OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ AiOcrSessionInputSource f120064OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ int f120065OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33177OooOOoo(TextRecognizeFragment textRecognizeFragment, AiOcrSessionInputSource aiOcrSessionInputSource, int i, int i2, Continuation<? super C33177OooOOoo> continuation) {
        super(2, continuation);
        this.f120061OooOo = textRecognizeFragment;
        this.f120064OooOoO0 = aiOcrSessionInputSource;
        this.f120063OooOoO = i;
        this.f120065OooOoOO = i2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C33177OooOOoo(this.f120061OooOo, this.f120064OooOoO0, this.f120063OooOoO, this.f120065OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C33177OooOOoo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f120062OooOo0o;
        TextRecognizeFragment textRecognizeFragment = this.f120061OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f120062OooOo0o = 1;
            obj = TextRecognizeFragment.OooOoo(textRecognizeFragment, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            TextRecognizeFragment.OooOoo0(textRecognizeFragment, "100008");
            return C32460OooOooO.f116667OooO00o;
        }
        AiOcrSessionInputSource aiOcrSessionInputSource = this.f120064OooOoO0;
        int sourceType = aiOcrSessionInputSource.getSourceType();
        if (sourceType == 0) {
            String uriStr = aiOcrSessionInputSource.getSourceUris().get(this.f120063OooOoO);
            C30394OooOOOO c30394OooOOOOOooo00O = textRecognizeFragment.Oooo00O();
            kotlin.jvm.internal.OooOOO0.OooO0oO(uriStr, "uriStr");
            InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c30394OooOOOOOooo00O);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new o0o0OO0.Oooo0(c30394OooOOOOOooo00O, this.f120065OooOoOO, uriStr, null), 2);
        } else if (sourceType == 1) {
            String pdfPassword = aiOcrSessionInputSource.getPdfPassword();
            C30394OooOOOO c30394OooOOOOOooo00O2 = textRecognizeFragment.Oooo00O();
            String pdfUriStr = (String) oOo000Oo.OooOo.Oooo0oO(aiOcrSessionInputSource.getSourceUris());
            kotlin.jvm.internal.OooOOO0.OooO0oO(pdfUriStr, "pdfUriStr");
            InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o2 = o0OoOo0.OooO00o(c30394OooOOOOOooo00O2);
            C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o2, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30415Oooo0O0(c30394OooOOOOOooo00O2, this.f120065OooOoOO, pdfUriStr, this.f120063OooOoO, pdfPassword, null), 2);
        } else if (sourceType != 3) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("TextRecognizeFragment");
            c20358OooO00o.OooO0OO(C21532OooOOo.OooO0OO(aiOcrSessionInputSource.getSourceType(), "Unsupported input source type: "), new Object[0]);
        } else {
            C30394OooOOOO c30394OooOOOOOooo00O3 = textRecognizeFragment.Oooo00O();
            String noteId = (String) oOo000Oo.OooOo.Oooo0oO(aiOcrSessionInputSource.getSourceUris());
            kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
            InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o3 = o0OoOo0.OooO00o(c30394OooOOOOOooo00O3);
            C33874OooO0OO c33874OooO0OO3 = C33649OoooOOo.f121328OooO00o;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o3, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30413Oooo00O(c30394OooOOOOOooo00O3, this.f120065OooOoOO, noteId, this.f120063OooOoO, null), 2);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
