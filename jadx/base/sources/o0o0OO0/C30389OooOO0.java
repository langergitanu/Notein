package o0o0OO0;

import android.content.ClipData;
import android.content.ClipboardManager;
import com.orion.notein.richeditor.converter.ConverterHtmlToText;
import java.util.List;
import kotlin.coroutines.Continuation;
import o000oo0.C24684Oooo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0o0OO0.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.viewmodel.AiOcrViewModel$copyAllTextToClipboard$2", m80623f = "AiOcrViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30389OooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ ClipboardManager f108462OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C30394OooOOOO f108463OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30389OooOO0(C30394OooOOOO c30394OooOOOO, ClipboardManager clipboardManager, Continuation<? super C30389OooOO0> continuation) {
        super(2, continuation);
        this.f108463OooOo0o = c30394OooOOOO;
        this.f108462OooOo = clipboardManager;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30389OooOO0(this.f108463OooOo0o, this.f108462OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C30389OooOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C30394OooOOOO c30394OooOOOO = this.f108463OooOo0o;
        List list = (List) c30394OooOOOO.f108512OooOo0o.f121747OooOo0o.getValue();
        if (list.isEmpty()) {
            return Boolean.FALSE;
        }
        try {
            String strOooO0o0 = C30394OooOOOO.OooO0o0(c30394OooOOOO, list);
            this.f108462OooOo.setPrimaryClip(ClipData.newHtmlText("notein_styled_text", ConverterHtmlToText.convert(strOooO0o0), strOooO0o0));
            return Boolean.TRUE;
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO0OO(C24684Oooo.OooO0O0(c20358OooO00o, "AiOcrViewModel", "Failed to copy text to clipboard. ", e), new Object[0]);
            return Boolean.FALSE;
        }
    }
}
