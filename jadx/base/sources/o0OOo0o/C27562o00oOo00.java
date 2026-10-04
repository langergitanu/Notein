package o0OOo0o;

import android.net.Uri;
import com.orion.notein.domain.models.note.PdfInfo;
import com.orion.notein.domain.models.page.PaperOrientation;
import com.orion.notein.domain.models.page.PaperSpec;
import com.orion.notein.domain.models.papertheme.PdfPaperTheme;
import com.orion.notein.domain.models.pdf.DuplicatedPdfResult;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;
import com.shockwave.pdfium.util.Size;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32443OooOOO;
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

/* JADX INFO: renamed from: o0OOo0o.o00oOo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.ThemeUseCase$generatePaperThemeByPdfPage$2", m80623f = "ThemeUseCase.kt", m80624l = {113, 156}, m80625m = "invokeSuspend")
public final class C27562o00oOo00 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32443OooOOO<? extends PdfPaperTheme, ? extends PaperSpec>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public PdfInfo f96697OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public PaperSpec f96698OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f96699OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public PaperOrientation f96700OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C27570o00oOoo0 f96701OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ int f96702OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ Uri f96703OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ String f96704OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ String f96705OooOooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27562o00oOo00(C27570o00oOoo0 c27570o00oOoo0, Uri uri, int i, String str, String str2, Continuation<? super C27562o00oOo00> continuation) {
        super(2, continuation);
        this.f96701OooOoOO = c27570o00oOoo0;
        this.f96703OooOoo0 = uri;
        this.f96702OooOoo = i;
        this.f96704OooOooO = str;
        this.f96705OooOooo = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27562o00oOo00(this.f96701OooOoOO, this.f96703OooOoo0, this.f96702OooOoo, this.f96704OooOooO, this.f96705OooOooo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32443OooOOO<? extends PdfPaperTheme, ? extends PaperSpec>> continuation) {
        return ((C27562o00oOo00) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOooO0o;
        Object objOooO00o;
        PdfInfo pdfInfo;
        PaperSpec paperSpec;
        PaperOrientation paperOrientation;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96699OooOoO;
        C27570o00oOoo0 c27570o00oOoo0 = this.f96701OooOoOO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C27499o00Ooo0 c27499o00Ooo0 = c27570o00oOoo0.f96742OooO0Oo;
            List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(new Integer(this.f96702OooOoo - 1));
            this.f96699OooOoO = 1;
            c27499o00Ooo0.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27488o00OoO00(c27499o00Ooo0, listOooO0oO, this.f96703OooOoo0, this.f96704OooOooO, null), this);
            if (objOooO0o != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            PaperOrientation paperOrientation2 = this.f96700OooOoO0;
            PdfInfo pdfInfo2 = this.f96697OooOo;
            PaperSpec paperSpec2 = this.f96698OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            paperOrientation = paperOrientation2;
            pdfInfo = pdfInfo2;
            paperSpec = paperSpec2;
            objOooO00o = obj;
            return new C32443OooOOO(new PdfPaperTheme(null, pdfInfo, 0, paperOrientation, (String) objOooO00o, this.f96705OooOooo), paperSpec);
        }
        C32446OooOOOo.OooO0O0(obj);
        objOooO0o = obj;
        DuplicatedPdfResult duplicatedPdfResult = (DuplicatedPdfResult) objOooO0o;
        if (duplicatedPdfResult == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("ThemeUseCase");
            c20358OooO00o.OooO0OO("duplicated pages failed.", new Object[0]);
            return null;
        }
        String duplicatedPdfPath = duplicatedPdfResult.getDuplicatedPdfPath();
        if (duplicatedPdfPath == null || duplicatedPdfPath.length() == 0) {
            return null;
        }
        PdfInfo pdfInfo3 = new PdfInfo(null, duplicatedPdfPath, null, this.f96704OooOooO, 5, null);
        PdfiumCore pdfiumCore = new PdfiumCore(c27570o00oOoo0.f96739OooO00o);
        PdfDocument pdfDocumentNewDocument = pdfiumCore.newDocument(pdfInfo3.getPdfPath(), pdfInfo3.getPassword());
        Size pageSize = pdfiumCore.getPageSize(pdfDocumentNewDocument, 0);
        Integer num = new Integer(pageSize.getWidth());
        Integer num2 = new Integer(pageSize.getHeight());
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        pdfiumCore.closeDocument(pdfDocumentNewDocument);
        PaperOrientation orientation = PaperOrientation.INSTANCE.getOrientation(iIntValue, iIntValue2);
        float height = (orientation == PaperOrientation.HORIZONTAL ? PaperSpec.INSTANCE.getA4().getHeight() : PaperSpec.INSTANCE.getA4().getWidth()) / iIntValue;
        int i2 = (int) (iIntValue * height);
        int i3 = (int) (iIntValue2 * height);
        PaperSpec paperSpec3 = new PaperSpec("PDF", "", false, Integer.min(i2, i3), Integer.max(i2, i3), null, null, 0, 0, 484, null);
        this.f96698OooOo0o = paperSpec3;
        this.f96697OooOo = pdfInfo3;
        this.f96700OooOoO0 = orientation;
        this.f96699OooOoO = 2;
        objOooO00o = C27570o00oOoo0.OooO00o(c27570o00oOoo0, this);
        if (objOooO00o != enumC32485OooO00o) {
            pdfInfo = pdfInfo3;
            paperSpec = paperSpec3;
            paperOrientation = orientation;
            return new C32443OooOOO(new PdfPaperTheme(null, pdfInfo, 0, paperOrientation, (String) objOooO00o, this.f96705OooOooo), paperSpec);
        }
        return enumC32485OooO00o;
    }
}
