package com.orion.notein.p607ui.ocr;

import Oooo0oO.C21030OooOO0o;
import android.net.Uri;
import com.alibaba.sdk.android.oss.internal.OooO00o;
import com.facebook.soloader.OooOo;
import com.orion.notein.domain.models.ocr.AiOcrSession;
import com.orion.notein.domain.models.ocr.AiOcrSessionInputSource;
import com.orion.notein.p607ui.ocr.TextRecognizeFragment;
import java.text.SimpleDateFormat;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0Oo00o.C28026OooO0OO;
import o0o0OO0.C30386OooO0o0;
import o0o0OO0.C30390OooOO0O;
import o0o0OO0.C30394OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0Oo.C33187OooOooo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.TextRecognizeFragment$ImportCameraCallback$onActivityResult$2", m80623f = "TextRecognizeFragment.kt", m80624l = {1464, 1471}, m80625m = "invokeSuspend")
public final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ TextRecognizeFragment.OooO00o f78153OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f78154OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ SimpleDateFormat f78155OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ TextRecognizeFragment f78156OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ Uri f78157OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(TextRecognizeFragment.OooO00o oooO00o, TextRecognizeFragment textRecognizeFragment, SimpleDateFormat simpleDateFormat, Uri uri, Continuation<? super OooO0O0> continuation) {
        super(2, continuation);
        this.f78153OooOo = oooO00o;
        this.f78156OooOoO0 = textRecognizeFragment;
        this.f78155OooOoO = simpleDateFormat;
        this.f78157OooOoOO = uri;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooO0O0(this.f78153OooOo, this.f78156OooOoO0, this.f78155OooOoO, this.f78157OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
    
        if (r14 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008d, code lost:
    
        if (r14 == r0) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        AiOcrSession aiOcrSession;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f78154OooOo0o;
        TextRecognizeFragment textRecognizeFragment = this.f78156OooOoO0;
        TextRecognizeFragment.OooO00o oooO00o = this.f78153OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            boolean z = oooO00o.f78211OooOo0o;
            Uri uri = this.f78157OooOoOO;
            if (z) {
                String strOooO00o = OooO00o.OooO00o("Camera ", this.f78155OooOoO.format(new Long(System.currentTimeMillis())));
                List listOooO0oO = OooOo.OooO0oO(uri);
                this.f78154OooOo0o = 1;
                C30394OooOOOO c30394OooOOOOOooo00O = textRecognizeFragment.Oooo00O();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C30390OooOO0O(c30394OooOOOOOooo00O, strOooO00o, 0, listOooO0oO, null, null), this);
            } else {
                AiOcrSession aiOcrSession2 = (AiOcrSession) textRecognizeFragment.Oooo00O().f108506OooOOo0.f121747OooOo0o.getValue();
                if (aiOcrSession2 != null) {
                    C30394OooOOOO c30394OooOOOOOooo00O2 = textRecognizeFragment.Oooo00O();
                    String id = aiOcrSession2.getId();
                    List listOooO0oO2 = OooOo.OooO0oO(uri);
                    this.f78154OooOo0o = 2;
                    C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                    obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C30386OooO0o0(c30394OooOOOOOooo00O2, id, 0, listOooO0oO2, null, null), this);
                } else {
                    aiOcrSession = null;
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
        if (aiOcrSession == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("ImportCameraCallback");
            c20358OooO00o.OooO0OO(com.aspose.slides.internal.p332p7.OooO0O0.OooO0O0("Failed to create session. createNewSession=", oooO00o.f78211OooOo0o), new Object[0]);
            return C32460OooOooO.f116667OooO00o;
        }
        AiOcrSessionInputSource input = aiOcrSession.getInputSource();
        OooOOO0.OooO0oO(input, "input");
        C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(textRecognizeFragment), new C33187OooOooo(input, 0));
        return C32460OooOooO.f116667OooO00o;
    }
}
