package o0OOo0o;

import android.graphics.RectF;
import com.orion.notein.domain.models.cache.HandWritingTextCache;
import com.orion.notein.domain.models.cache.PageGridModificationRecord;
import com.orion.notein.domain.models.handwriting.RecognizedTextElement;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.page.PageGrid;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import o0OOo0Oo.InterfaceC27302OooOOo0;
import o0OOo0Oo.InterfaceC27317Oooo00O;
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

/* JADX INFO: renamed from: o0OOo0o.o00oO000, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.TextRecognitionAndSearchUseCase$findHandWritingTextInPage$2", m80623f = "TextRecognitionAndSearchUseCase.kt", m80624l = {791, 793}, m80625m = "invokeSuspend")
public final class C27548o00oO000 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends RectF>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public PageGrid f96604OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Page f96605OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f96606OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public HandWritingTextCache f96607OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C27545o00o0oo0.OooO00o f96608OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ String f96609OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C27545o00o0oo0 f96610OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27548o00oO000(C27545o00o0oo0.OooO00o oooO00o, C27545o00o0oo0 c27545o00o0oo0, String str, Continuation<? super C27548o00oO000> continuation) {
        super(2, continuation);
        this.f96608OooOoOO = oooO00o;
        this.f96610OooOoo0 = c27545o00o0oo0;
        this.f96609OooOoo = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27548o00oO000(this.f96608OooOoOO, this.f96610OooOoo0, this.f96609OooOoo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends RectF>> continuation) {
        return ((C27548o00oO000) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a9  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        PageGrid pageGrid;
        Page page;
        HandWritingTextCache handWritingTextCache;
        Page page2;
        List<RecognizedTextElement> elements;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96606OooOoO;
        C27545o00o0oo0 c27545o00o0oo0 = this.f96610OooOoo0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C27545o00o0oo0.OooO00o oooO00o = this.f96608OooOoOO;
            Page page3 = oooO00o.f96586OooO00o;
            InterfaceC27302OooOOo0 interfaceC27302OooOOo0 = c27545o00o0oo0.f96583OooO0oo;
            this.f96605OooOo0o = page3;
            PageGrid pageGrid2 = oooO00o.f96588OooO0OO;
            this.f96604OooOo = pageGrid2;
            this.f96606OooOoO = 1;
            Object objOooO0Oo = interfaceC27302OooOOo0.OooO0Oo(pageGrid2, this);
            if (objOooO0Oo != enumC32485OooO00o) {
                pageGrid = pageGrid2;
                obj = objOooO0Oo;
                page = page3;
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            handWritingTextCache = this.f96607OooOoO0;
            pageGrid = this.f96604OooOo;
            page2 = this.f96605OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            PageGridModificationRecord pageGridModificationRecord = (PageGridModificationRecord) obj;
            long lastModificationTime = pageGridModificationRecord == null ? pageGridModificationRecord.getLastModificationTime() : 0L;
            if (handWritingTextCache != null || handWritingTextCache.getCreationTime() < lastModificationTime) {
                elements = null;
            } else {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("SearchUseCase");
                c20358OooO00o.OooO00o("findHandWritingTextRectListInPage: cache hit. pageGrid: " + pageGrid, new Object[0]);
                elements = handWritingTextCache.getElements();
            }
            if (elements != null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("SearchUseCase");
                c20358OooO00o2.OooO00o(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("findHandWritingTextRectListInPage: Cannot get or create cache for page ", page2.getId()), new Object[0]);
                return C34434OooOoO.f123453OooOo0o;
            }
            String lowerCase = this.f96609OooOoo.toLowerCase(Locale.ROOT);
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
        pageGrid = this.f96604OooOo;
        page = this.f96605OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        HandWritingTextCache handWritingTextCache2 = (HandWritingTextCache) obj;
        InterfaceC27317Oooo00O interfaceC27317Oooo00O = c27545o00o0oo0.f96584OooOO0;
        this.f96605OooOo0o = page;
        this.f96604OooOo = pageGrid;
        this.f96607OooOoO0 = handWritingTextCache2;
        this.f96606OooOoO = 2;
        Object objOooO0O0 = interfaceC27317Oooo00O.OooO0O0(pageGrid, this);
        if (objOooO0O0 != enumC32485OooO00o) {
            handWritingTextCache = handWritingTextCache2;
            obj = objOooO0O0;
            page2 = page;
            PageGridModificationRecord pageGridModificationRecord2 = (PageGridModificationRecord) obj;
            if (pageGridModificationRecord2 == null) {
            }
            if (handWritingTextCache != null) {
                elements = null;
            }
            if (elements != null) {
            }
        }
        return enumC32485OooO00o;
    }
}
