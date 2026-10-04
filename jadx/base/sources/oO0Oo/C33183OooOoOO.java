package oO0Oo;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.orion.notein.p607ui.ocr.TextRecognizeFragment;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;
import kotlin.coroutines.Continuation;
import o0o0OO0.C30394OooOOOO;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0OOooo.C33163OooO0oO;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: oO0Oo.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.TextRecognizeFragment$recognizeEntirePdf$1", m80623f = "TextRecognizeFragment.kt", m80624l = {1403}, m80625m = "invokeSuspend")
public final class C33183OooOoOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ TextRecognizeFragment f120083OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f120084OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f120085OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C33163OooO0oO f120086OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f120087OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33183OooOoOO(TextRecognizeFragment textRecognizeFragment, C33163OooO0oO c33163OooO0oO, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f120083OooOo = textRecognizeFragment;
        this.f120086OooOoO0 = c33163OooO0oO;
        this.f120085OooOoO = str;
        this.f120087OooOoOO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C33183OooOoOO(this.f120083OooOo, this.f120086OooOoO0, this.f120085OooOoO, this.f120087OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C33183OooOoOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        int pageCount;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f120084OooOo0o;
        TextRecognizeFragment textRecognizeFragment = this.f120083OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f120084OooOo0o = 1;
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
        C30394OooOOOO c30394OooOOOOOooo00O = textRecognizeFragment.Oooo00O();
        C33163OooO0oO c33163OooO0oO = this.f120086OooOoO0;
        String pdfUriStr = this.f120085OooOoO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(pdfUriStr, "pdfUriStr");
        Uri uri = Uri.parse(pdfUriStr);
        kotlin.jvm.internal.OooOOO0.OooO0o(uri, "parse(...)");
        PdfiumCore pdfiumCore = new PdfiumCore(c33163OooO0oO);
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = c33163OooO0oO.getContentResolver().openFileDescriptor(uri, "r");
            PdfDocument pdfDocumentNewDocument = parcelFileDescriptorOpenFileDescriptor != null ? pdfiumCore.newDocument(parcelFileDescriptorOpenFileDescriptor, (String) null) : null;
            if (pdfDocumentNewDocument == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("AiOcrViewModel");
                c20358OooO00o.OooO0OO("Failed to open PDF document: " + uri, new Object[0]);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                pageCount = 0;
            } else {
                pageCount = pdfiumCore.getPageCount(pdfDocumentNewDocument);
                try {
                    pdfiumCore.closeDocument(pdfDocumentNewDocument);
                } catch (Exception unused) {
                }
            }
            c30394OooOOOOOooo00O.OooO(pdfUriStr, new C32443OooOOO<>(0, Integer.valueOf(pageCount)), this.f120087OooOoOO);
            return C32460OooOooO.f116667OooO00o;
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    pdfiumCore.closeDocument(null);
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }
}
