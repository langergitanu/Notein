package com.orion.notein.domain.models.search;

import OooOooo.C20785Oooo00o;
import Oooo0.o000000O;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.RectF;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.google.firebase.firestore.util.OooOOO;
import com.orion.notein.domain.models.page.Page;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o00OO0O0.OooO0O0;
import o0O0oOOO.C26120OooO0Oo;
import o0O0oOOO.C26121OooO0o0;
import o0O0oo00.OooO00o;
import o0oo000O.C31183OooO00o;
import o0oo000O.C31192OooOOOo;
import oO00ooO.C32443OooOOO;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0002\b\r\b\u0086\b\u0018\u0000 A2\u00020\u0001:\u0001ABQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u001a\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b \u0010\u001eJ\u001c\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006HÂ\u0003¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010\u001eJ\u000f\u0010$\u001a\u00020\u0002H\u0016¢\u0006\u0004\b$\u0010\u001eJ\u000f\u0010%\u001a\u00020\u0002H\u0016¢\u0006\u0004\b%\u0010\u001eJ\u001b\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b&\u0010\"J\u000f\u0010'\u001a\u00020\u0002H\u0016¢\u0006\u0004\b'\u0010\u001eJ\u000f\u0010(\u001a\u00020\u0001H\u0016¢\u0006\u0004\b(\u0010)J\u0018\u0010*\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0086@¢\u0006\u0004\b*\u0010\u001cJ\u0010\u0010+\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003¢\u0006\u0004\b/\u00100Jh\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b3\u0010\u001eJ\u0010\u00104\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b4\u0010.J\u001a\u00107\u001a\u00020\u00112\b\u00106\u001a\u0004\u0018\u000105HÖ\u0003¢\u0006\u0004\b7\u00108R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00109R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00109R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00109R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010:R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\b<\u0010,R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010=\u001a\u0004\b>\u0010.R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010?\u001a\u0004\b@\u00100¨\u0006B"}, m80612d2 = {"Lcom/orion/notein/domain/models/search/TextSearchResult;", "Lcom/orion/notein/domain/models/search/ISearchResult;", "", "query", "id", "tnPath", "LoO00ooO/OooOOO;", "", "tnSize", "Lcom/orion/notein/domain/models/page/Page;", "page", "pageIndex", "", "Landroid/graphics/RectF;", "textRectList", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LoO00ooO/OooOOO;Lcom/orion/notein/domain/models/page/Page;ILjava/util/List;)V", "", "includeEntirePage", "getTnBounds", "(Z)Landroid/graphics/RectF;", "Landroid/content/Context;", "context", "Landroid/graphics/Bitmap;", "resultBitmap", "highlightRectList", "createSearchResultBitmap", "(Landroid/content/Context;Landroid/graphics/Bitmap;Ljava/util/List;)Landroid/graphics/Bitmap;", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()LoO00ooO/OooOOO;", "getQuery", "getId", "getTnPath", "getTnSize", "getName", "deepCopy", "()Lcom/orion/notein/domain/models/search/ISearchResult;", "createTnBitmapByPage", "component5", "()Lcom/orion/notein/domain/models/page/Page;", "component6", "()I", "component7", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LoO00ooO/OooOOO;Lcom/orion/notein/domain/models/page/Page;ILjava/util/List;)Lcom/orion/notein/domain/models/search/TextSearchResult;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "LoO00ooO/OooOOO;", "Lcom/orion/notein/domain/models/page/Page;", "getPage", "I", "getPageIndex", "Ljava/util/List;", "getTextRectList", "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class TextSearchResult implements ISearchResult {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final C32443OooOOO<Integer, Integer> DEFAULT_TN_SIZE = new C32443OooOOO<>(Integer.valueOf(o000000O.OooO0o(130)), Integer.valueOf(o000000O.OooO0o(93)));
    private final String id;
    private final Page page;
    private final int pageIndex;
    private final String query;
    private final List<RectF> textRectList;
    private final String tnPath;
    private final C32443OooOOO<Integer, Integer> tnSize;

    @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m80612d2 = {"Lcom/orion/notein/domain/models/search/TextSearchResult$Companion;", "", "<init>", "()V", "LoO00ooO/OooOOO;", "", "DEFAULT_TN_SIZE", "LoO00ooO/OooOOO;", "getDEFAULT_TN_SIZE", "()LoO00ooO/OooOOO;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final C32443OooOOO<Integer, Integer> getDEFAULT_TN_SIZE() {
            return TextSearchResult.DEFAULT_TN_SIZE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TextSearchResult(String query, String id, String tnPath, C32443OooOOO<Integer, Integer> tnSize, Page page, int i, List<? extends RectF> textRectList) {
        OooOOO0.OooO0oO(query, "query");
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(tnPath, "tnPath");
        OooOOO0.OooO0oO(tnSize, "tnSize");
        OooOOO0.OooO0oO(page, "page");
        OooOOO0.OooO0oO(textRectList, "textRectList");
        this.query = query;
        this.id = id;
        this.tnPath = tnPath;
        this.tnSize = tnSize;
        this.page = page;
        this.pageIndex = i;
        this.textRectList = textRectList;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final String getQuery() {
        return this.query;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    private final String getTnPath() {
        return this.tnPath;
    }

    private final C32443OooOOO<Integer, Integer> component4() {
        return this.tnSize;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TextSearchResult copy$default(TextSearchResult textSearchResult, String str, String str2, String str3, C32443OooOOO c32443OooOOO, Page page, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = textSearchResult.query;
        }
        if ((i2 & 2) != 0) {
            str2 = textSearchResult.id;
        }
        if ((i2 & 4) != 0) {
            str3 = textSearchResult.tnPath;
        }
        if ((i2 & 8) != 0) {
            c32443OooOOO = textSearchResult.tnSize;
        }
        if ((i2 & 16) != 0) {
            page = textSearchResult.page;
        }
        if ((i2 & 32) != 0) {
            i = textSearchResult.pageIndex;
        }
        if ((i2 & 64) != 0) {
            list = textSearchResult.textRectList;
        }
        int i3 = i;
        List list2 = list;
        Page page2 = page;
        String str4 = str3;
        return textSearchResult.copy(str, str2, str4, c32443OooOOO, page2, i3, list2);
    }

    private final Bitmap createSearchResultBitmap(Context context, Bitmap resultBitmap, List<? extends RectF> highlightRectList) {
        Canvas canvas = new Canvas(resultBitmap);
        C32443OooOOO<Integer, Integer> rotatedPageSize = this.page.getRotatedPageSize();
        float fIntValue = rotatedPageSize.f116638OooOo0o.intValue();
        float fIntValue2 = rotatedPageSize.f116637OooOo.intValue();
        C26121OooO0o0 c26121OooO0o0 = new C26121OooO0o0(canvas, context, resultBitmap.getWidth() / fIntValue, resultBitmap.getHeight() / fIntValue2);
        C32443OooOOO<Float, Float> size = c26121OooO0o0.getSize();
        float fFloatValue = size.f116638OooOo0o.floatValue() / fIntValue;
        float fFloatValue2 = size.f116637OooOo.floatValue() / fIntValue2;
        C26120OooO0Oo c26120OooO0Oo = new C26120OooO0Oo();
        c26120OooO0Oo.OooOo00(c26121OooO0o0);
        OooO00o.C19734OooO00o.OooO00o(c26120OooO0Oo, C31183OooO00o.f111221OooO00o, 0.0f, 1, 16, false, 16);
        Iterator<T> it = highlightRectList.iterator();
        while (it.hasNext()) {
            RectF rectF = new RectF((RectF) it.next());
            OooO0O0.OooOO0O(rectF, Math.min(fFloatValue, fFloatValue2));
            c26120OooO0Oo.OooOOoo(rectF);
        }
        c26120OooO0Oo.OooOOOO(1.0f);
        canvas.setBitmap(null);
        return resultBitmap;
    }

    private final RectF getTnBounds(boolean includeEntirePage) {
        C32443OooOOO<Integer, Integer> unrotatedPageSize = this.page.getUnrotatedPageSize();
        int iIntValue = unrotatedPageSize.f116638OooOo0o.intValue();
        int iIntValue2 = unrotatedPageSize.f116637OooOo.intValue();
        if (includeEntirePage) {
            return new RectF(0.0f, 0.0f, iIntValue, iIntValue2);
        }
        RectF rectF = new RectF((RectF) OooOo.Oooo0oO(this.textRectList));
        float f = 2;
        float fWidth = rectF.width() / f;
        C32443OooOOO<Integer, Integer> c32443OooOOO = DEFAULT_TN_SIZE;
        float fMax = Math.max(fWidth, c32443OooOOO.f116638OooOo0o.intValue());
        float fMax2 = Math.max(rectF.height() / f, c32443OooOOO.f116637OooOo.intValue());
        RectF rectFOooO0O0 = this.page.getUnbounded() ? C31192OooOOOo.OooO0O0(this.page, null) : new RectF(0.0f, 0.0f, iIntValue, iIntValue2);
        rectF.left = Math.max(rectFOooO0O0.left, rectF.left - fMax);
        rectF.right = Math.min(rectFOooO0O0.right, rectF.right + fMax);
        rectF.top = Math.max(rectFOooO0O0.top, rectF.top - fMax2);
        rectF.bottom = Math.min(rectFOooO0O0.bottom, rectF.bottom + fMax2);
        return rectF;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Page getPage() {
        return this.page;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getPageIndex() {
        return this.pageIndex;
    }

    public final List<RectF> component7() {
        return this.textRectList;
    }

    public final TextSearchResult copy(String query, String id, String tnPath, C32443OooOOO<Integer, Integer> tnSize, Page page, int pageIndex, List<? extends RectF> textRectList) {
        OooOOO0.OooO0oO(query, "query");
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(tnPath, "tnPath");
        OooOOO0.OooO0oO(tnSize, "tnSize");
        OooOOO0.OooO0oO(page, "page");
        OooOOO0.OooO0oO(textRectList, "textRectList");
        return new TextSearchResult(query, id, tnPath, tnSize, page, pageIndex, textRectList);
    }

    public final Object createTnBitmapByPage(Context context, Continuation<? super Bitmap> continuation) {
        if (this.page.getUnbounded()) {
            return createSearchResultBitmap(context, continuation);
        }
        String tnPath = this.page.getTnPath();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inMutable = true;
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(tnPath, options);
        return bitmapDecodeFile != null ? createSearchResultBitmap(context, bitmapDecodeFile, this.textRectList) : createSearchResultBitmap(context, continuation);
    }

    @Override // com.orion.notein.domain.models.search.ISearchResult
    public ISearchResult deepCopy() {
        return copy$default(this, null, null, null, null, null, 0, null, 127, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextSearchResult)) {
            return false;
        }
        TextSearchResult textSearchResult = (TextSearchResult) other;
        return OooOOO0.OooO0O0(this.query, textSearchResult.query) && OooOOO0.OooO0O0(this.id, textSearchResult.id) && OooOOO0.OooO0O0(this.tnPath, textSearchResult.tnPath) && OooOOO0.OooO0O0(this.tnSize, textSearchResult.tnSize) && OooOOO0.OooO0O0(this.page, textSearchResult.page) && this.pageIndex == textSearchResult.pageIndex && OooOOO0.OooO0O0(this.textRectList, textSearchResult.textRectList);
    }

    @Override // com.orion.notein.domain.models.search.ISearchResult
    public String getId() {
        return this.id;
    }

    @Override // com.orion.notein.domain.models.search.ISearchResult
    public String getName() {
        return "";
    }

    public final Page getPage() {
        return this.page;
    }

    public final int getPageIndex() {
        return this.pageIndex;
    }

    @Override // com.orion.notein.domain.models.search.ISearchResult
    public String getQuery() {
        return this.query;
    }

    public final List<RectF> getTextRectList() {
        return this.textRectList;
    }

    @Override // com.orion.notein.domain.models.search.ISearchResult
    public String getTnPath() {
        return this.tnPath;
    }

    @Override // com.orion.notein.domain.models.search.ISearchResult
    public C32443OooOOO<Integer, Integer> getTnSize() {
        return C32443OooOOO.OooO00o(this.tnSize);
    }

    public int hashCode() {
        return this.textRectList.hashCode() + C20785Oooo00o.OooO00o(this.pageIndex, (this.page.hashCode() + ((this.tnSize.hashCode() + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.query.hashCode() * 31, 31, this.id), 31, this.tnPath)) * 31)) * 31, 31);
    }

    public String toString() {
        String str = this.query;
        String str2 = this.id;
        String str3 = this.tnPath;
        C32443OooOOO<Integer, Integer> c32443OooOOO = this.tnSize;
        Page page = this.page;
        int i = this.pageIndex;
        List<RectF> list = this.textRectList;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("TextSearchResult(query=", str, ", id=", str2, ", tnPath=");
        sbOooO0O0.append(str3);
        sbOooO0O0.append(", tnSize=");
        sbOooO0O0.append(c32443OooOOO);
        sbOooO0O0.append(", page=");
        sbOooO0O0.append(page);
        sbOooO0O0.append(", pageIndex=");
        sbOooO0O0.append(i);
        sbOooO0O0.append(", textRectList=");
        return OooOOO.OooO0O0(")", sbOooO0O0, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object createSearchResultBitmap(Context context, Continuation<? super Bitmap> continuation) {
        RectF tnBounds = getTnBounds(!this.page.getUnbounded());
        C32443OooOOO<Integer, Integer> tnSize = getTnSize();
        float fMin = Math.min(tnSize.f116638OooOo0o.intValue() / tnBounds.width(), tnSize.f116637OooOo.intValue() / tnBounds.height());
        Bitmap bitmapCreateTnBitmapWithBounds$default = Page.createTnBitmapWithBounds$default(this.page, context, tnBounds, fMin, 0, 8, null);
        Canvas canvas = new Canvas(bitmapCreateTnBitmapWithBounds$default);
        RectF rectF = new RectF(tnBounds);
        rectF.offsetTo(-rectF.left, -rectF.top);
        OooO0O0.OooOO0O(rectF, fMin);
        Float f = new Float(rectF.left);
        Float f2 = new Float(rectF.top);
        float fFloatValue = f.floatValue();
        float fFloatValue2 = f2.floatValue();
        C26121OooO0o0 c26121OooO0o0 = new C26121OooO0o0(canvas, context, fFloatValue, fFloatValue2, 0);
        C26120OooO0Oo c26120OooO0Oo = new C26120OooO0Oo();
        c26120OooO0Oo.OooOo00(c26121OooO0o0);
        OooO00o.C19734OooO00o.OooO00o(c26120OooO0Oo, C31183OooO00o.f111221OooO00o, 0.0f, 1, 16, false, 16);
        Iterator<T> it = this.textRectList.iterator();
        while (it.hasNext()) {
            RectF rectF2 = new RectF((RectF) it.next());
            OooO0O0.OooOO0O(rectF2, fMin);
            rectF2.offset(fFloatValue, fFloatValue2);
            c26120OooO0Oo.OooOOoo(rectF2);
        }
        c26120OooO0Oo.OooOOOO(1.0f);
        canvas.setBitmap(null);
        return bitmapCreateTnBitmapWithBounds$default;
    }
}
