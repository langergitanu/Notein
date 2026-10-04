package o0OOo0o;

import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import com.orion.notein.domain.models.cache.PdfTextCache;
import com.orion.notein.domain.models.handwriting.RecognizedTextElement;
import com.orion.notein.domain.models.note.PdfInfo;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.page.PageGrid;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.domain.models.papertheme.PdfPaperTheme;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27545o00o0oo0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34431OooOo0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0OOo0o.o00oO00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.TextRecognitionAndSearchUseCase$findPdfTextInPage$2", m80623f = "TextRecognitionAndSearchUseCase.kt", m80624l = {737, 754}, m80625m = "invokeSuspend")
public final class C27549o00oO00O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends RectF>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public PageGrid f96611OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Page f96612OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f96613OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public PdfPaperTheme f96614OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f96615OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ C27545o00o0oo0 f96616OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C27545o00o0oo0.OooO00o f96617OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ String f96618OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27549o00oO00O(C27545o00o0oo0.OooO00o oooO00o, C27545o00o0oo0 c27545o00o0oo0, String str, Continuation<? super C27549o00oO00O> continuation) {
        super(2, continuation);
        this.f96617OooOoo0 = oooO00o;
        this.f96616OooOoo = c27545o00o0oo0;
        this.f96618OooOooO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27549o00oO00O(this.f96617OooOoo0, this.f96616OooOoo, this.f96618OooOooO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends RectF>> continuation) {
        return ((C27549o00oO00O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0103  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Page page;
        int pageNum;
        PageGrid pageGrid;
        PdfPaperTheme pdfPaperTheme;
        Page page2;
        List<RecognizedTextElement> elements;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96615OooOoOO;
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        C27545o00o0oo0 c27545o00o0oo0 = this.f96616OooOoo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C27545o00o0oo0.OooO00o oooO00o = this.f96617OooOoo0;
            page = oooO00o.f96586OooO00o;
            PaperTheme paperTheme = page.getPaperTheme();
            PdfPaperTheme pdfPaperTheme2 = paperTheme instanceof PdfPaperTheme ? (PdfPaperTheme) paperTheme : null;
            if (pdfPaperTheme2 == null) {
                return c34434OooOoO;
            }
            String pdfPath = pdfPaperTheme2.getPdfInfo().getPdfPath();
            pageNum = pdfPaperTheme2.getPageNum();
            this.f96612OooOo0o = page;
            PageGrid pageGrid2 = oooO00o.f96588OooO0OO;
            this.f96611OooOo = pageGrid2;
            this.f96614OooOoO0 = pdfPaperTheme2;
            this.f96613OooOoO = pageNum;
            this.f96615OooOoOO = 1;
            Object objOooO0O0 = c27545o00o0oo0.f96575OooO.OooO0O0(pageNum, pdfPath, this);
            if (objOooO0O0 != enumC32485OooO00o) {
                PdfPaperTheme pdfPaperTheme3 = pdfPaperTheme2;
                pageGrid = pageGrid2;
                obj = objOooO0O0;
                pdfPaperTheme = pdfPaperTheme3;
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            page2 = this.f96612OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            PdfTextCache pdfTextCache = (PdfTextCache) obj;
            elements = pdfTextCache != null ? pdfTextCache.getElements() : null;
            page = page2;
            if (elements == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("SearchUseCase");
                c20358OooO00o.OooO00o(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("findPdfTextInPage: Cannot get or create cache for page ", page.getId()), new Object[0]);
                return c34434OooOoO;
            }
            String lowerCase = this.f96618OooOooO.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.OooOOO0.OooO0o(lowerCase, "toLowerCase(...)");
            ArrayList arrayList = new ArrayList();
            for (RecognizedTextElement recognizedTextElement : elements) {
                String lowerCase2 = recognizedTextElement.getText().toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.OooOOO0.OooO0o(lowerCase2, "toLowerCase(...)");
                List<C32443OooOOO> listOooO0OO = C27545o00o0oo0.OooO0OO(c27545o00o0oo0, lowerCase2, lowerCase);
                ArrayList arrayList2 = new ArrayList();
                for (C32443OooOOO c32443OooOOO : listOooO0OO) {
                    RectF rectFOooO0O0 = C27545o00o0oo0.OooO0O0(c27545o00o0oo0, recognizedTextElement, ((Number) c32443OooOOO.f116638OooOo0o).intValue(), ((Number) c32443OooOOO.f116637OooOo).intValue());
                    if (rectFOooO0O0 != null) {
                        arrayList2.add(rectFOooO0O0);
                    }
                }
                C34431OooOo0.OooOo0o(arrayList, arrayList2);
            }
            return arrayList;
        }
        int i2 = this.f96613OooOoO;
        pdfPaperTheme = this.f96614OooOoO0;
        pageGrid = this.f96611OooOo;
        Page page3 = this.f96612OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        pageNum = i2;
        page = page3;
        PdfTextCache pdfTextCache2 = (PdfTextCache) obj;
        if (pdfTextCache2 == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("SearchUseCase");
            c20358OooO00o2.OooO00o("findPdfTextInPage: cache miss. pageGrid: " + pageGrid, new Object[0]);
            C32443OooOOO<Integer, Integer> unrotatedPageSize = page.getUnrotatedPageSize();
            int iIntValue = unrotatedPageSize.f116638OooOo0o.intValue();
            int iIntValue2 = unrotatedPageSize.f116637OooOo.intValue();
            Rect unrotatedPaperPadding = page.getUnrotatedPaperPadding();
            int i3 = (iIntValue - unrotatedPaperPadding.left) - unrotatedPaperPadding.right;
            int i4 = (iIntValue2 - unrotatedPaperPadding.top) - unrotatedPaperPadding.bottom;
            PdfInfo pdfInfo = pdfPaperTheme.getPdfInfo();
            Size size = new Size(i3, i4);
            this.f96612OooOo0o = page;
            this.f96611OooOo = null;
            this.f96614OooOoO0 = null;
            this.f96615OooOoOO = 2;
            obj = c27545o00o0oo0.OooOO0O(pdfInfo, pageNum, size, this);
            if (obj != enumC32485OooO00o) {
                page2 = page;
                PdfTextCache pdfTextCache3 = (PdfTextCache) obj;
                if (pdfTextCache3 != null) {
                }
                page = page2;
                if (elements == null) {
                }
            }
            return enumC32485OooO00o;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o3.OooOOO0("SearchUseCase");
        c20358OooO00o3.OooO00o("findPdfTextInPage: cache hit. pageGrid: " + pageGrid, new Object[0]);
        elements = pdfTextCache2.getElements();
        if (elements == null) {
        }
    }
}
