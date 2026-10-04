package o0Oooo;

import android.content.Context;
import com.orion.notein.domain.models.p605ai.AiFeatureConfig;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;
import java.io.File;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0Oooo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.ai.EditorAiViewModel$isPdfFileValidForGemini$2", m80623f = "EditorAiViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29592OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o f104932OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ File f104933OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Context f104934OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29592OooO0OO(File file, com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o oooO00o, Context context, Continuation<? super C29592OooO0OO> continuation) {
        super(2, continuation);
        this.f104933OooOo0o = file;
        this.f104932OooOo = oooO00o;
        this.f104934OooOoO0 = context;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29592OooO0OO(this.f104933OooOo0o, this.f104932OooOo, this.f104934OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C29592OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        File file = this.f104933OooOo0o;
        if (!file.exists()) {
            return Boolean.FALSE;
        }
        long length = file.length();
        com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o oooO00o = this.f104932OooOo;
        AiFeatureConfig aiFeatureConfigOooOO0O = oooO00o.OooOO0O();
        if (length > (aiFeatureConfigOooOO0O != null ? aiFeatureConfigOooOO0O.getMaxPdfFileBytes() : AiFeatureConfig.DEFAULT_MAX_PDF_FILE_SIZE)) {
            return Boolean.FALSE;
        }
        PdfiumCore pdfiumCore = new PdfiumCore(this.f104934OooOoO0);
        PdfDocument pdfDocumentNewDocument = null;
        try {
            try {
                pdfDocumentNewDocument = pdfiumCore.newDocument(file.getAbsolutePath(), (String) null);
                int pageCount = pdfiumCore.getPageCount(pdfDocumentNewDocument);
                AiFeatureConfig aiFeatureConfigOooOO0O2 = oooO00o.OooOO0O();
                Boolean boolValueOf = Boolean.valueOf(pageCount <= (aiFeatureConfigOooOO0O2 != null ? aiFeatureConfigOooOO0O2.getMaxNumOfPdfPages() : 1000));
                if (pdfDocumentNewDocument != null) {
                    pdfiumCore.closeDocument(pdfDocumentNewDocument);
                }
                return boolValueOf;
            } catch (Exception e) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("EditorChatViewModel");
                c20358OooO00o.OooO0Oo(e, "isPdfFileValidForGemini: error", new Object[0]);
                Boolean bool = Boolean.FALSE;
                if (pdfDocumentNewDocument != null) {
                    pdfiumCore.closeDocument(pdfDocumentNewDocument);
                }
                return bool;
            }
        } catch (Throwable th) {
            if (pdfDocumentNewDocument != null) {
                pdfiumCore.closeDocument(pdfDocumentNewDocument);
            }
            throw th;
        }
    }
}
