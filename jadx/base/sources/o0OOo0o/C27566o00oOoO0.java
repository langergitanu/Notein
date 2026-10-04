package o0OOo0o;

import android.graphics.Rect;
import android.net.Uri;
import com.orion.notein.domain.models.note.PdfInfo;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.page.PaperOrientation;
import com.orion.notein.domain.models.page.PaperSpec;
import com.orion.notein.domain.models.papertheme.LocalUriPaperTheme;
import com.orion.notein.domain.models.papertheme.MyTemplate;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.domain.models.papertheme.PdfPaperTheme;
import java.io.File;
import java.io.Serializable;
import kotlin.coroutines.Continuation;
import o000oooo.C24761OooO;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0OOOO00.C27095OooOo0O;
import o0OoO0oo.C28692OooO0oo;
import o0oo000O.C31190OooO0oo;
import o0oo000O.C31194OooOOo0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOo0o.o00oOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.ThemeUseCase$importPageToMyTemplate$2", m80623f = "ThemeUseCase.kt", m80624l = {238, 236}, m80625m = "invokeSuspend")
public final class C27566o00oOoO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super String>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f96719OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Serializable f96720OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public MyTemplate[] f96721OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public PaperTheme f96722OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public C27095OooOo0O f96723OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f96724OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public MyTemplate[] f96725OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ Page f96726OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ C27570o00oOoo0 f96727OooOooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27566o00oOoO0(Page page, C27570o00oOoo0 c27570o00oOoo0, Continuation<? super C27566o00oOoO0> continuation) {
        super(2, continuation);
        this.f96726OooOooO = page;
        this.f96727OooOooo = c27570o00oOoo0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27566o00oOoO0(this.f96726OooOooO, this.f96727OooOooo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super String> continuation) {
        return ((C27566o00oOoO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x01d8  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        PaperSpec paperSpecCopy$default;
        PaperSpec paperSpec;
        PaperTheme paperThemeCopy$default;
        String str;
        C27095OooOo0O c27095OooOo0O;
        MyTemplate[] myTemplateArr;
        Object objOooO00o;
        PaperTheme paperTheme;
        MyTemplate[] myTemplateArr2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96724OooOoo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            Page page = this.f96726OooOooO;
            PaperTheme paperTheme2 = page.getPaperTheme();
            if (paperTheme2 != null) {
                PaperSpec paperSpec2 = page.getPaperSpec();
                Rect unrotatedPaperPadding = page.getUnrotatedPaperPadding();
                if (page.getPaperOrientation() == PaperOrientation.VERTICAL) {
                    PaperSpec paperSpec3 = page.getPaperSpec();
                    int width = (paperSpec2.getWidth() - unrotatedPaperPadding.left) - unrotatedPaperPadding.right;
                    int height = (paperSpec2.getHeight() - unrotatedPaperPadding.top) - unrotatedPaperPadding.bottom;
                    Float preciseWidth = paperSpec2.getPreciseWidth();
                    Float f = preciseWidth != null ? new Float(preciseWidth.floatValue() - (unrotatedPaperPadding.left + unrotatedPaperPadding.right)) : null;
                    Float preciseHeight = paperSpec2.getPreciseHeight();
                    paperSpecCopy$default = PaperSpec.copy$default(paperSpec3, null, null, false, width, height, f, preciseHeight != null ? new Float(preciseHeight.floatValue() - (unrotatedPaperPadding.top + unrotatedPaperPadding.bottom)) : null, 0, 0, 391, null);
                } else {
                    PaperSpec paperSpec4 = page.getPaperSpec();
                    int width2 = (paperSpec2.getWidth() - unrotatedPaperPadding.top) - unrotatedPaperPadding.bottom;
                    int height2 = (paperSpec2.getHeight() - unrotatedPaperPadding.left) - unrotatedPaperPadding.right;
                    Float preciseWidth2 = paperSpec2.getPreciseWidth();
                    Float f2 = preciseWidth2 != null ? new Float(preciseWidth2.floatValue() - (unrotatedPaperPadding.top + unrotatedPaperPadding.bottom)) : null;
                    Float preciseHeight2 = paperSpec2.getPreciseHeight();
                    paperSpecCopy$default = PaperSpec.copy$default(paperSpec4, null, null, false, width2, height2, f2, preciseHeight2 != null ? new Float(preciseHeight2.floatValue() - (unrotatedPaperPadding.left + unrotatedPaperPadding.right)) : null, 0, 0, 391, null);
                }
                paperSpec = paperSpecCopy$default;
                String strOooO00o = C24761OooO.OooO00o("toString(...)");
                boolean z = paperTheme2 instanceof LocalUriPaperTheme;
                C27570o00oOoo0 c27570o00oOoo0 = this.f96727OooOooo;
                if (z) {
                    LocalUriPaperTheme localUriPaperTheme = (LocalUriPaperTheme) paperTheme2;
                    File file = new File(localUriPaperTheme.getUri());
                    if (file.exists()) {
                        File fileOooO00o = C28692OooO0oo.OooO00o(C28692OooO0oo.OooO0O0(c27570o00oOoo0.f96739OooO00o), file.getName());
                        if (fileOooO00o != null && C31190OooO0oo.OooO00o(file, fileOooO00o)) {
                            String absolutePath = fileOooO00o.getAbsolutePath();
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(absolutePath);
                            paperThemeCopy$default = LocalUriPaperTheme.copy$default(localUriPaperTheme, null, null, null, null, absolutePath, absolutePath, strOooO00o, 15, null);
                            str = strOooO00o;
                            c27095OooOo0O = c27570o00oOoo0.f96740OooO0O0;
                            myTemplateArr = new MyTemplate[1];
                            this.f96720OooOo0o = paperSpec;
                            this.f96719OooOo = str;
                            this.f96722OooOoO0 = paperThemeCopy$default;
                            this.f96721OooOoO = myTemplateArr;
                            this.f96723OooOoOO = c27095OooOo0O;
                            this.f96725OooOoo0 = myTemplateArr;
                            this.f96724OooOoo = 1;
                            objOooO00o = C27570o00oOoo0.OooO00o(c27570o00oOoo0, this);
                            if (objOooO00o != enumC32485OooO00o) {
                                paperTheme = paperThemeCopy$default;
                                myTemplateArr2 = myTemplateArr;
                            }
                        }
                    }
                } else {
                    if (paperTheme2 instanceof PdfPaperTheme) {
                        try {
                            Uri uriOooO00o = C31194OooOOo0.OooO00o(c27570o00oOoo0.f96739OooO00o, new File(((PdfPaperTheme) paperTheme2).getPdfInfo().getPdfPath()));
                            AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO = c27570o00oOoo0.f96739OooO00o;
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(uriOooO00o);
                            String strOooO0o0 = C28692OooO0oo.OooO0o0(abstractApplicationC26277OooOoOO, uriOooO00o, C28692OooO0oo.OooO0O0(abstractApplicationC26277OooOoOO));
                            if (strOooO0o0 != null) {
                                PdfPaperTheme pdfPaperTheme = (PdfPaperTheme) paperTheme2;
                                paperThemeCopy$default = PdfPaperTheme.copy$default(pdfPaperTheme, null, PdfInfo.copy$default(pdfPaperTheme.getPdfInfo(), null, strOooO0o0, null, null, 13, null), 0, null, null, strOooO00o, 29, null);
                                str = strOooO00o;
                            }
                        } catch (Exception unused) {
                        }
                    } else {
                        str = strOooO00o;
                        paperTheme2.setMyTemplateId(str);
                        paperThemeCopy$default = paperTheme2;
                    }
                    c27095OooOo0O = c27570o00oOoo0.f96740OooO0O0;
                    myTemplateArr = new MyTemplate[1];
                    this.f96720OooOo0o = paperSpec;
                    this.f96719OooOo = str;
                    this.f96722OooOoO0 = paperThemeCopy$default;
                    this.f96721OooOoO = myTemplateArr;
                    this.f96723OooOoOO = c27095OooOo0O;
                    this.f96725OooOoo0 = myTemplateArr;
                    this.f96724OooOoo = 1;
                    objOooO00o = C27570o00oOoo0.OooO00o(c27570o00oOoo0, this);
                    if (objOooO00o != enumC32485OooO00o) {
                    }
                }
            }
            return null;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str2 = (String) this.f96720OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            return str2;
        }
        myTemplateArr2 = this.f96725OooOoo0;
        C27095OooOo0O c27095OooOo0O2 = this.f96723OooOoOO;
        MyTemplate[] myTemplateArr3 = this.f96721OooOoO;
        PaperTheme paperTheme3 = this.f96722OooOoO0;
        str = this.f96719OooOo;
        paperSpec = (PaperSpec) this.f96720OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        myTemplateArr = myTemplateArr3;
        paperTheme = paperTheme3;
        c27095OooOo0O = c27095OooOo0O2;
        objOooO00o = obj;
        String str3 = str;
        myTemplateArr2[0] = new MyTemplate(str3, paperTheme, paperSpec, 0L, 0L, (String) objOooO00o, 24, null);
        this.f96720OooOo0o = str3;
        this.f96719OooOo = null;
        this.f96722OooOoO0 = null;
        this.f96721OooOoO = null;
        this.f96723OooOoOO = null;
        this.f96725OooOoo0 = null;
        this.f96724OooOoo = 2;
        return c27095OooOo0O.OooO00o(myTemplateArr, this) == enumC32485OooO00o ? enumC32485OooO00o : str3;
    }
}
