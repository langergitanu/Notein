package o0OOo0o;

import com.aspose.slides.C22227OoooO;
import com.orion.notein.domain.models.material.Orientation;
import com.orion.notein.domain.models.material.PageSize;
import com.orion.notein.domain.models.material.TemplateBook;
import com.orion.notein.domain.models.material.TemplateFile;
import com.orion.notein.domain.models.page.PaperSpec;
import com.orion.notein.domain.models.papertheme.MyTemplate;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.domain.models.papertheme.TemplateBookPaperTheme;
import com.orion.notein.domain.models.papertheme.TemplateBookVariantFile;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o000oooo.C24761OooO;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0OOOO00.C27095OooOo0O;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOo0o.o00oOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.ThemeUseCase$addTemplateBookToMyTemplate$2", m80623f = "ThemeUseCase.kt", m80624l = {564, 652}, m80625m = "invokeSuspend")
public final class C27554o00oOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super String>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f96656OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public ArrayList f96657OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f96658OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f96659OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ TemplateBook f96660OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C27570o00oOoo0 f96661OooOoo0;

    /* JADX INFO: renamed from: o0OOo0o.o00oOO$OooO00o */
    public /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f96662OooO00o;

        static {
            int[] iArr = new int[PageSize.values().length];
            try {
                iArr[PageSize.f57843A4.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PageSize.f57844A5.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PageSize.LETTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PageSize.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f96662OooO00o = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27554o00oOO(TemplateBook templateBook, C27570o00oOoo0 c27570o00oOoo0, Continuation<? super C27554o00oOO> continuation) {
        super(2, continuation);
        this.f96660OooOoOO = templateBook;
        this.f96661OooOoo0 = c27570o00oOoo0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27554o00oOO(this.f96660OooOoOO, this.f96661OooOoo0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super String> continuation) {
        return ((C27554o00oOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0212 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x020f  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooO0o0;
        Object next;
        AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO;
        TemplateBook templateBook;
        int i;
        int i2;
        ArrayList arrayList;
        int i3;
        String str;
        TemplateBook templateBook2;
        ArrayList arrayList2;
        int i4;
        String absolutePath;
        TemplateBookVariantFile templateBookVariantFile;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i5 = this.f96658OooOoO;
        C27570o00oOoo0 c27570o00oOoo0 = this.f96661OooOoo0;
        TemplateBook templateBook3 = this.f96660OooOoOO;
        C27095OooOo0O c27095OooOo0O = c27570o00oOoo0.f96740OooO0O0;
        if (i5 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("ThemeUseCase");
            c20358OooO00o.OooO00o(androidx.core.database.OooO00o.OooO00o("addTemplateBookToMyTemplate: START - template=", templateBook3.getTitle(), " (id=", templateBook3.getId(), ")"), new Object[0]);
            this.f96658OooOoO = 1;
            objOooO0o0 = c27095OooOo0O.OooO0o0(this);
            if (objOooO0o0 != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i5 != 1) {
            if (i5 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = this.f96659OooOoO0;
            str = this.f96656OooOo;
            arrayList = this.f96657OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            templateBook = templateBook3;
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("ThemeUseCase");
            String id = templateBook.getId();
            int size = arrayList.size();
            StringBuilder sbOooO0O0 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("addTemplateBookToMyTemplate: SUCCESS - myTemplateId=", str, ", materialId=", id, ", pageCount=");
            sbOooO0O0.append(i3);
            sbOooO0O0.append(", variantFiles=");
            sbOooO0O0.append(size);
            c20358OooO00o2.OooO00o(sbOooO0O0.toString(), new Object[0]);
            return str;
        }
        C32446OooOOOo.OooO0O0(obj);
        objOooO0o0 = obj;
        Iterator it = ((Iterable) objOooO0o0).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            PaperTheme paperTheme = ((MyTemplate) next).getPaperTheme();
            TemplateBookPaperTheme templateBookPaperTheme = paperTheme instanceof TemplateBookPaperTheme ? (TemplateBookPaperTheme) paperTheme : null;
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(templateBookPaperTheme != null ? templateBookPaperTheme.getMaterialId() : null, templateBook3.getId())) {
                break;
            }
        }
        MyTemplate myTemplate = (MyTemplate) next;
        if (myTemplate != null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("ThemeUseCase");
            c20358OooO00o3.OooO00o(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Template book already in my templates: ", templateBook3.getId()), new Object[0]);
            return myTemplate.getId();
        }
        List<TemplateFile> files = templateBook3.getFiles();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = files.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            abstractApplicationC26277OooOoOO = c27570o00oOoo0.f96739OooO00o;
            if (!zHasNext) {
                break;
            }
            TemplateFile templateFile = (TemplateFile) it2.next();
            String id2 = templateBook3.getId();
            String path = templateFile.getPath();
            File file = new File(abstractApplicationC26277OooOoOO.getFilesDir(), com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("my_templates/material_", id2));
            C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o4.OooOOO0("ThemeUseCase");
            String absolutePath2 = file.getAbsolutePath();
            Iterator it3 = it2;
            C27570o00oOoo0 c27570o00oOoo02 = c27570o00oOoo0;
            StringBuilder sbOooO0O02 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("getTemplateBookFilePath: templateId=", id2, ", relativePath=", path, ", appliedDir=");
            sbOooO0O02.append(absolutePath2);
            c20358OooO00o4.OooO00o(sbOooO0O02.toString(), new Object[0]);
            c20358OooO00o4.OooOOO0("ThemeUseCase");
            boolean zExists = file.exists();
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                templateBook2 = templateBook3;
                arrayList2 = new ArrayList(fileArrListFiles.length);
                int i6 = 0;
                for (int length = fileArrListFiles.length; i6 < length; length = length) {
                    arrayList2.add(fileArrListFiles[i6].getName());
                    i6++;
                }
            } else {
                templateBook2 = templateBook3;
                arrayList2 = null;
            }
            c20358OooO00o4.OooO00o("  appliedDir exists=" + zExists + ", contents=" + arrayList2, new Object[0]);
            File file2 = new File(file, path);
            C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o5.OooOOO0("ThemeUseCase");
            c20358OooO00o5.OooO00o("  trying: " + file2.getAbsolutePath() + ", exists=" + file2.exists(), new Object[0]);
            if (file2.exists()) {
                absolutePath = file2.getAbsolutePath();
            } else {
                String strOoooO0 = C33599OooOo0O.OoooO0(path, "资源/");
                if (!strOoooO0.equals(path)) {
                    File file3 = new File(file, strOoooO0);
                    c20358OooO00o5.OooOOO0("ThemeUseCase");
                    c20358OooO00o5.OooO00o("  trying normalized: " + file3.getAbsolutePath() + ", exists=" + file3.exists(), new Object[0]);
                    if (file3.exists()) {
                        absolutePath = file3.getAbsolutePath();
                    }
                }
                StringBuilder sbOooO00o = C22227OoooO.OooO00o(c20358OooO00o5, "ThemeUseCase", "getTemplateBookFilePath: file not found - templateId=", id2, ", relativePath=");
                sbOooO00o.append(path);
                i4 = 0;
                c20358OooO00o5.OooOO0O(sbOooO00o.toString(), new Object[0]);
                absolutePath = null;
                if (absolutePath != null) {
                    c20358OooO00o5.OooOOO0("ThemeUseCase");
                    c20358OooO00o5.OooOO0O(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Variant file not found: ", templateFile.getPath()), new Object[i4]);
                    templateBookVariantFile = null;
                } else {
                    templateBookVariantFile = new TemplateBookVariantFile(templateFile.getOrientation(), templateFile.getColor(), templateFile.getColorName(), absolutePath);
                }
                if (templateBookVariantFile == null) {
                    arrayList3.add(templateBookVariantFile);
                }
                it2 = it3;
                c27570o00oOoo0 = c27570o00oOoo02;
                templateBook3 = templateBook2;
            }
            i4 = 0;
            if (absolutePath != null) {
            }
            if (templateBookVariantFile == null) {
            }
            it2 = it3;
            c27570o00oOoo0 = c27570o00oOoo02;
            templateBook3 = templateBook2;
        }
        templateBook = templateBook3;
        if (arrayList3.isEmpty()) {
            C34406OooO00o.C20358OooO00o c20358OooO00o6 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o6.OooOOO0("ThemeUseCase");
            c20358OooO00o6.OooO0OO(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("No valid variant files found for template_book: ", templateBook.getId()), new Object[0]);
            return null;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o7 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o7.OooOOO0("ThemeUseCase");
        c20358OooO00o7.OooO00o(Oooo0oO.o0Oo0oo.OooO0O0(arrayList3.size(), "Mapped ", " variant files"), new Object[0]);
        Orientation orientation = (Orientation) oOo000Oo.OooOo.Oooo(templateBook.getAvailableOrientations());
        if (orientation == null) {
            orientation = Orientation.PORTRAIT;
        }
        C32443OooOOO c32443OooOOO = (C32443OooOOO) oOo000Oo.OooOo.Oooo(templateBook.getAvailableColorOptions());
        if (c32443OooOOO == null) {
            c32443OooOOO = new C32443OooOOO("#FFFFFF", "白色");
        }
        c20358OooO00o7.OooOOO0("ThemeUseCase");
        StringBuilder sb = new StringBuilder("Selected default variant: orientation=");
        sb.append(orientation);
        sb.append(", color=");
        Object obj2 = c32443OooOOO.f116637OooOo;
        sb.append(obj2);
        sb.append(" (");
        A a = c32443OooOOO.f116638OooOo0o;
        c20358OooO00o7.OooO00o(androidx.concurrent.futures.OooO0o.OooO0O0(sb, a, ")"), new Object[0]);
        String absolutePath3 = ((TemplateBookVariantFile) oOo000Oo.OooOo.Oooo0oO(arrayList3)).getAbsolutePath();
        try {
            PdfiumCore pdfiumCore = new PdfiumCore(abstractApplicationC26277OooOoOO);
            PdfDocument pdfDocumentNewDocument = pdfiumCore.newDocument(absolutePath3, (String) null);
            int pageCount = pdfiumCore.getPageCount(pdfDocumentNewDocument);
            pdfiumCore.closeDocument(pdfDocumentNewDocument);
            i2 = pageCount;
            i = 0;
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o8 = C34406OooO00o.f123390OooO00o;
            i = 0;
            c20358OooO00o8.OooO0Oo(e, androidx.core.app.OooO.OooO0O0(c20358OooO00o8, "ThemeUseCase", "Failed to read PDF page count: ", absolutePath3), new Object[0]);
            i2 = 0;
        }
        if (i2 == 0) {
            C34406OooO00o.C20358OooO00o c20358OooO00o9 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o9.OooO0OO(androidx.core.app.OooO.OooO0O0(c20358OooO00o9, "ThemeUseCase", "Invalid PDF or no pages: ", absolutePath3), new Object[i]);
            return null;
        }
        String strOooO00o = C24761OooO.OooO00o("toString(...)");
        TemplateBookPaperTheme templateBookPaperTheme2 = new TemplateBookPaperTheme(null, templateBook.getId(), arrayList3, i2, orientation, (String) a, (String) obj2, templateBook.getTitle(), strOooO00o);
        arrayList = arrayList3;
        i3 = i2;
        int i7 = OooO00o.f96662OooO00o[templateBook.getPageSize().ordinal()];
        if (i7 != 1 && i7 != 2 && i7 != 3 && i7 != 4) {
            throw new C32442OooOO0o();
        }
        PaperSpec a4 = PaperSpec.INSTANCE.getA4();
        MyTemplate[] myTemplateArr = {new MyTemplate(strOooO00o, templateBookPaperTheme2, a4, System.currentTimeMillis(), System.currentTimeMillis(), templateBook.getTitle())};
        this.f96657OooOo0o = arrayList;
        this.f96656OooOo = strOooO00o;
        this.f96659OooOoO0 = i3;
        this.f96658OooOoO = 2;
        if (c27095OooOo0O.OooO00o(myTemplateArr, this) != enumC32485OooO00o) {
            str = strOooO00o;
            C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o22.OooOOO0("ThemeUseCase");
            String id3 = templateBook.getId();
            int size2 = arrayList.size();
            StringBuilder sbOooO0O03 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("addTemplateBookToMyTemplate: SUCCESS - myTemplateId=", str, ", materialId=", id3, ", pageCount=");
            sbOooO0O03.append(i3);
            sbOooO0O03.append(", variantFiles=");
            sbOooO0O03.append(size2);
            c20358OooO00o22.OooO00o(sbOooO0O03.toString(), new Object[0]);
            return str;
        }
        return enumC32485OooO00o;
    }
}
