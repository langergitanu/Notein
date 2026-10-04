package o0OOo0o;

import OooOooo.C20785Oooo00o;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.appcompat.view.menu.C21505OooO0Oo;
import androidx.core.view.ViewCompat;
import com.huawei.hms.network.embedded.C18361t4;
import com.orion.notein.domain.models.cache.HandWritingTextCache;
import com.orion.notein.domain.models.cache.PdfTextCache;
import com.orion.notein.domain.models.handwriting.RecognizedTextElement;
import com.orion.notein.domain.models.note.Note;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.note.PdfInfo;
import com.orion.notein.domain.models.page.LayeredDisplayItems;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.page.PageGrid;
import com.orion.notein.domain.models.page.PageLayer;
import com.orion.notein.domain.models.page.PaperOrientation;
import com.orion.notein.domain.models.page.PaperSpec;
import com.orion.notein.domain.models.page.Stroke;
import com.orion.notein.domain.models.page.TextBox;
import com.orion.notein.domain.models.papertheme.ColorPaperTheme;
import com.orion.notein.domain.models.papertheme.LambdaPaperTheme;
import com.orion.notein.domain.models.papertheme.PaperColors;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle;
import com.orion.notein.domain.models.search.TextSearchResult;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import com.orion.penkit.models.DrawRecord;
import com.orion.penkit.models.InkStrokeInfo;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfPasswordException;
import com.shockwave.pdfium.PdfiumCore;
import com.shockwave.pdfium.util.Size;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import o000O00.C24378OooOoO0;
import o000oooo.C24761OooO;
import o00o00O0.C25252OooO0Oo;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0O0oooO.C26264OooOOO0;
import o0OO00o0.C26596o00O0o0;
import o0OO00o0.C26620o00Oo00o;
import o0OO00o0.C26649o00OoooO;
import o0OOo0Oo.InterfaceC27302OooOOo0;
import o0OOo0Oo.InterfaceC27317Oooo00O;
import o0OOo0Oo.InterfaceC27320Oooo0OO;
import o0OOo0Oo.InterfaceC27323Oooo0oO;
import o0OOooO.C27881OooOO0O;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32449OooOOoo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.C33661OoooooO;
import oO0o0Oo.C33763OoooOOO;
import oO0o0Oo.C33770OooooO0;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34431OooOo0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0OOo0o.o00o0oo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27545o00o0oo0 {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final /* synthetic */ int f96574OooOO0o = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final InterfaceC27320Oooo0OO f96575OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f96576OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C27449o00O0OoO f96577OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C27881OooOO0O f96578OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C27597o00ooo00 f96579OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final InterfaceC27323Oooo0oO f96580OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C27585o00ooO0 f96581OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C26264OooOOO0 f96582OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final InterfaceC27302OooOOo0 f96583OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final InterfaceC27317Oooo00O f96584OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final o00000O f96585OooOO0O;

    /* JADX INFO: renamed from: o0OOo0o.o00o0oo0$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Page f96586OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f96587OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final PageGrid f96588OooO0OO;

        public OooO00o(Page parentPage, int i, PageGrid pageGrid) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(parentPage, "parentPage");
            kotlin.jvm.internal.OooOOO0.OooO0oO(pageGrid, "pageGrid");
            this.f96586OooO00o = parentPage;
            this.f96587OooO0O0 = i;
            this.f96588OooO0OO = pageGrid;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f96586OooO00o, oooO00o.f96586OooO00o) && this.f96587OooO0O0 == oooO00o.f96587OooO0O0 && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f96588OooO0OO, oooO00o.f96588OooO0OO);
        }

        public final int hashCode() {
            return this.f96588OooO0OO.hashCode() + C20785Oooo00o.OooO00o(this.f96587OooO0O0, this.f96586OooO00o.hashCode() * 31, 31);
        }

        public final String toString() {
            return "PageGridWrapper(parentPage=" + this.f96586OooO00o + ", pageIndex=" + this.f96587OooO0O0 + ", pageGrid=" + this.f96588OooO0OO + ")";
        }
    }

    static {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(4);
        kotlin.jvm.internal.OooOOO0.OooO0o(executorServiceNewFixedThreadPool, "newFixedThreadPool(...)");
        new C33661OoooooO(executorServiceNewFixedThreadPool);
    }

    public C27545o00o0oo0(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO, C27449o00O0OoO c27449o00O0OoO, C27881OooOO0O c27881OooOO0O, C27600o0ooOO0 c27600o0ooOO0, C27597o00ooo00 vipFeatureUseCase, C27585o00ooO0 c27585o00ooO0, InterfaceC27323Oooo0oO strokeRepo, C26596o00O0o0 c26596o00O0o0, C26264OooOOO0 c26264OooOOO0, C24378OooOoO0 c24378OooOoO0, C26649o00OoooO c26649o00OoooO, o0OO00o0.OooOo00 oooOo00, C26620o00Oo00o c26620o00Oo00o, InterfaceC27302OooOOo0 handWritingRepo, InterfaceC27320Oooo0OO pdfTextRepo, InterfaceC27317Oooo00O pageGridModificationRecordRepo, o00000O getRemoteConfigUseCase) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(vipFeatureUseCase, "vipFeatureUseCase");
        kotlin.jvm.internal.OooOOO0.OooO0oO(strokeRepo, "strokeRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(handWritingRepo, "handWritingRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(pdfTextRepo, "pdfTextRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(pageGridModificationRecordRepo, "pageGridModificationRecordRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(getRemoteConfigUseCase, "getRemoteConfigUseCase");
        this.f96576OooO00o = abstractApplicationC26277OooOoOO;
        this.f96577OooO0O0 = c27449o00O0OoO;
        this.f96578OooO0OO = c27881OooOO0O;
        this.f96579OooO0Oo = vipFeatureUseCase;
        this.f96581OooO0o0 = c27585o00ooO0;
        this.f96580OooO0o = strokeRepo;
        this.f96582OooO0oO = c26264OooOOO0;
        this.f96583OooO0oo = handWritingRepo;
        this.f96575OooO = pdfTextRepo;
        this.f96584OooOO0 = pageGridModificationRecordRepo;
        this.f96585OooOO0O = getRemoteConfigUseCase;
        Object systemService = abstractApplicationC26277OooOoOO.getSystemService(C18361t4.f56218b);
        kotlin.jvm.internal.OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO00o(C27545o00o0oo0 c27545o00o0oo0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27544o00o0oo c27544o00o0oo;
        if (abstractC32479OooO0OO instanceof C27544o00o0oo) {
            c27544o00o0oo = (C27544o00o0oo) abstractC32479OooO0OO;
            int i = c27544o00o0oo.f96572OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27544o00o0oo.f96572OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27544o00o0oo = new C27544o00o0oo(c27545o00o0oo0, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c27544o00o0oo.f96570OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27544o00o0oo.f96572OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            c27544o00o0oo.f96571OooOo0o = c27545o00o0oo0;
            c27544o00o0oo.f96572OooOoO = 1;
            objOooO0o = c27545o00o0oo0.f96579OooO0Oo.OooO0o(25, c27544o00o0oo);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c27545o00o0oo0 = c27544o00o0oo.f96571OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o);
        }
        if (((Number) objOooO0o).intValue() != 0) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("SearchUseCase");
            c20358OooO00o.OooO00o("canSearchHandWritingText, vip is false", new Object[0]);
            return Boolean.FALSE;
        }
        boolean valueAsBoolean = c27545o00o0oo0.f96585OooOO0O.f95374OooO00o.getValueAsBoolean("rconfig_enable_handwriting_text_search");
        if (!valueAsBoolean) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("SearchUseCase");
            c20358OooO00o2.OooO00o("canSearchHandWritingText, remote config is false", new Object[0]);
        }
        return Boolean.valueOf(valueAsBoolean);
    }

    public static final RectF OooO0O0(C27545o00o0oo0 c27545o00o0oo0, RecognizedTextElement recognizedTextElement, int i, int i2) {
        c27545o00o0oo0.getClass();
        RectF rectF = new RectF();
        while (i < i2) {
            RecognizedTextElement.CharElement charElement = (RecognizedTextElement.CharElement) oOo000Oo.OooOo.OoooO00(i, recognizedTextElement.getChars());
            if (charElement == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("SearchUseCase");
                c20358OooO00o.OooO0OO("extractTextBoundingBox: recognizedChar is null", new Object[0]);
                return null;
            }
            if (rectF.isEmpty()) {
                rectF.set(charElement.getBounds());
            } else {
                rectF.union(charElement.getBounds());
            }
            i++;
        }
        return rectF;
    }

    public static final List OooO0OO(C27545o00o0oo0 c27545o00o0oo0, String str, String str2) {
        char cCharAt;
        c27545o00o0oo0.getClass();
        if (str2.length() == 0 || str2.length() > str.length()) {
            return C34434OooOoO.f123453OooOo0o;
        }
        int[] iArr = new int[str2.length() + 1];
        int length = str2.length();
        int i = 1;
        while (i < length) {
            int i2 = i + 1;
            int i3 = iArr[i2];
            while (i3 > 0 && str2.charAt(i3) != str2.charAt(i)) {
                i3 = iArr[i3];
            }
            if (i3 > 0 || str2.charAt(i3) == str2.charAt(i)) {
                iArr[i2] = i3 + 1;
            }
            i = i2;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i4 = 0;
        int i5 = 0;
        while (i4 < str.length()) {
            if (str.charAt(i4) == 65279 || (8203 <= (cCharAt = str.charAt(i4)) && cCharAt < 8206)) {
                i4++;
            } else {
                if (arrayList2.isEmpty() || ((Number) oOo000Oo.OooOo.OoooOOo(arrayList2)).intValue() != i4) {
                    arrayList2.add(Integer.valueOf(i4));
                }
                if (i5 < str2.length() && io.ktor.utils.p616io.Oooo000.OooO0OO(str.charAt(i4), str2.charAt(i5), true)) {
                    i5++;
                    if (i5 == str2.length()) {
                        arrayList.add(new C32443OooOOO(Integer.valueOf(((Number) C21505OooO0Oo.OooO00o(i5, arrayList2)).intValue()), Integer.valueOf(i4 + 1)));
                    }
                } else if (i5 > 0) {
                    i5 = iArr[i5];
                    i4--;
                }
                i4++;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0157 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0Oo(C27545o00o0oo0 c27545o00o0oo0, OooO00o oooO00o, ArrayList arrayList, String str, boolean z, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C27550o00oO00o c27550o00oO00o;
        Page page;
        ArrayList arrayList2;
        List list;
        C27545o00o0oo0 c27545o00o0oo02;
        int i;
        Object objOooO0o;
        Object objOooO0o2;
        String str2;
        Page page2;
        List list2;
        List list3;
        ArrayList arrayListOooooOO;
        OooO00o oooO00o2 = oooO00o;
        String str3 = str;
        c27545o00o0oo0.getClass();
        if (abstractC32479OooO0OO instanceof C27550o00oO00o) {
            c27550o00oO00o = (C27550o00oO00o) abstractC32479OooO0OO;
            int i2 = c27550o00oO00o.f96627OooOooo;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c27550o00oO00o.f96627OooOooo = i2 - Integer.MIN_VALUE;
            } else {
                c27550o00oO00o = new C27550o00oO00o(c27545o00o0oo0, abstractC32479OooO0OO);
            }
        }
        Object obj = c27550o00oO00o.f96624OooOoo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c27550o00oO00o.f96627OooOooo;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            page = oooO00o2.f96586OooO00o;
            arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TextBox textBox = (TextBox) it.next();
                List<RectF> listFindTextRectListInPageCoordinate = textBox.findTextRectListInPageCoordinate(c27545o00o0oo0.f96576OooO00o, str3);
                float rotationDeg = textBox.getRotationDeg();
                if (rotationDeg != 0.0f) {
                    List<RectF> list4 = listFindTextRectListInPageCoordinate;
                    ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(list4, 10));
                    for (RectF rectF : list4) {
                        Matrix matrix = new Matrix();
                        RectF boundingBox = textBox.getBoundingBox(1.0f);
                        matrix.postRotate(rotationDeg, boundingBox.centerX(), boundingBox.centerY());
                        RectF rectF2 = new RectF();
                        matrix.mapRect(rectF2, rectF);
                        arrayList3.add(rectF2);
                    }
                    listFindTextRectListInPageCoordinate = arrayList3;
                }
                C34431OooOo0.OooOo0o(arrayList2, listFindTextRectListInPageCoordinate);
            }
            int i4 = oooO00o2.f96587OooO0O0;
            if (z) {
                c27550o00oO00o.f96620OooOo0o = c27545o00o0oo0;
                c27550o00oO00o.f96619OooOo = oooO00o2;
                c27550o00oO00o.f96622OooOoO0 = str3;
                c27550o00oO00o.f96621OooOoO = page;
                c27550o00oO00o.f96623OooOoOO = arrayList2;
                c27550o00oO00o.f96625OooOoo0 = i4;
                c27550o00oO00o.f96627OooOooo = 1;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27548o00oO000(oooO00o2, c27545o00o0oo0, str3, null), c27550o00oO00o);
                if (objOooO0o != enumC32485OooO00o) {
                    c27545o00o0oo02 = c27545o00o0oo0;
                    i = i4;
                }
                return enumC32485OooO00o;
            }
            list = C34434OooOoO.f123453OooOo0o;
            c27545o00o0oo02 = c27545o00o0oo0;
            i = i4;
            c27550o00oO00o.f96620OooOo0o = str3;
            c27550o00oO00o.f96619OooOo = page;
            c27550o00oO00o.f96622OooOoO0 = arrayList2;
            c27550o00oO00o.f96621OooOoO = list;
            c27550o00oO00o.f96623OooOoOO = null;
            c27550o00oO00o.f96625OooOoo0 = i;
            c27550o00oO00o.f96627OooOooo = 2;
            c27545o00o0oo02.getClass();
            C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
            objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27549o00oO00O(oooO00o2, c27545o00o0oo02, str3, null), c27550o00oO00o);
            if (objOooO0o2 != enumC32485OooO00o) {
                str2 = str3;
                page2 = page;
                list2 = arrayList2;
                obj = objOooO0o2;
                list3 = list;
                int i5 = i;
                arrayListOooooOO = oOo000Oo.OooOo.OooooOO(oOo000Oo.OooOo.OooooOO(list2, list3), (List) obj);
                if (!arrayListOooooOO.isEmpty()) {
                }
            }
            return enumC32485OooO00o;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c27550o00oO00o.f96625OooOoo0;
            list3 = (List) c27550o00oO00o.f96621OooOoO;
            list2 = (List) c27550o00oO00o.f96622OooOoO0;
            page2 = (Page) c27550o00oO00o.f96619OooOo;
            String str4 = (String) c27550o00oO00o.f96620OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            str2 = str4;
            int i52 = i;
            arrayListOooooOO = oOo000Oo.OooOo.OooooOO(oOo000Oo.OooOo.OooooOO(list2, list3), (List) obj);
            if (!arrayListOooooOO.isEmpty()) {
                return null;
            }
            o0oo000O.OooOO0.f111232OooO00o.getClass();
            return new TextSearchResult(str2, C24761OooO.OooO00o("toString(...)"), "", page2.getOriginTnSize(), page2, i52, o0oo000O.OooOO0.OooO0o(page2, arrayListOooooOO));
        }
        i = c27550o00oO00o.f96625OooOoo0;
        ArrayList arrayList4 = c27550o00oO00o.f96623OooOoOO;
        Page page3 = (Page) c27550o00oO00o.f96621OooOoO;
        String str5 = (String) c27550o00oO00o.f96622OooOoO0;
        OooO00o oooO00o3 = (OooO00o) c27550o00oO00o.f96619OooOo;
        c27545o00o0oo02 = (C27545o00o0oo0) c27550o00oO00o.f96620OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        arrayList2 = arrayList4;
        oooO00o2 = oooO00o3;
        objOooO0o = obj;
        page = page3;
        str3 = str5;
        list = (List) objOooO0o;
        c27550o00oO00o.f96620OooOo0o = str3;
        c27550o00oO00o.f96619OooOo = page;
        c27550o00oO00o.f96622OooOoO0 = arrayList2;
        c27550o00oO00o.f96621OooOoO = list;
        c27550o00oO00o.f96623OooOoOO = null;
        c27550o00oO00o.f96625OooOoo0 = i;
        c27550o00oO00o.f96627OooOooo = 2;
        c27545o00o0oo02.getClass();
        C33874OooO0OO c33874OooO0OO22 = C33649OoooOOo.f121328OooO00o;
        objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27549o00oO00O(oooO00o2, c27545o00o0oo02, str3, null), c27550o00oO00o);
        if (objOooO0o2 != enumC32485OooO00o) {
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00b4 -> B:24:0x00b5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0o0(C27545o00o0oo0 c27545o00o0oo0, Note note, String str, ArrayList arrayList, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o0oOOo o0oooo2;
        C27545o00o0oo0 c27545o00o0oo02;
        Note note2;
        String str2;
        Iterator it;
        Collection collection;
        c27545o00o0oo0.getClass();
        if (abstractC32479OooO0OO instanceof o0oOOo) {
            o0oooo2 = (o0oOOo) abstractC32479OooO0OO;
            int i = o0oooo2.f96979OooOooo;
            if ((i & Integer.MIN_VALUE) != 0) {
                o0oooo2.f96979OooOooo = i - Integer.MIN_VALUE;
            } else {
                o0oooo2 = new o0oOOo(c27545o00o0oo0, abstractC32479OooO0OO);
            }
        }
        Object objOooOo0O = o0oooo2.f96976OooOoo;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o0oooo2.f96979OooOooo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOo0O);
            int iCeil = (int) Math.ceil((arrayList.size() * 1.0f) / 4);
            if (iCeil < 1) {
                iCeil = 1;
            }
            List listO0OOO0o = oOo000Oo.OooOo.o0OOO0o(arrayList);
            Collections.shuffle(listO0OOO0o);
            ArrayList arrayListOo0o0Oo = oOo000Oo.OooOo.oo0o0Oo(iCeil, iCeil, listO0OOO0o);
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayListOo0o0Oo, 10));
            c27545o00o0oo02 = c27545o00o0oo0;
            note2 = note;
            str2 = str;
            it = arrayListOo0o0Oo.iterator();
            collection = arrayList2;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            collection = o0oooo2.f96977OooOoo0;
            it = o0oooo2.f96975OooOoOO;
            Collection collection2 = o0oooo2.f96973OooOoO;
            String str3 = o0oooo2.f96974OooOoO0;
            Note note3 = o0oooo2.f96971OooOo;
            C27545o00o0oo0 c27545o00o0oo03 = o0oooo2.f96972OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOo0O);
            str2 = str3;
            note2 = note3;
            c27545o00o0oo02 = c27545o00o0oo03;
            collection.add((InterfaceC33721OooO0o) objOooOo0O);
            collection = collection2;
            if (it.hasNext()) {
                List list = (List) it.next();
                o0oooo2.f96972OooOo0o = c27545o00o0oo02;
                o0oooo2.f96971OooOo = note2;
                o0oooo2.f96974OooOoO0 = str2;
                Collection collection3 = collection;
                o0oooo2.f96973OooOoO = collection3;
                o0oooo2.f96975OooOoOO = it;
                o0oooo2.f96977OooOoo0 = collection3;
                o0oooo2.f96979OooOooo = 1;
                c27545o00o0oo02.getClass();
                C33770OooooO0 c33770OooooO0 = new C33770OooooO0(new C27552o00oO0O0(c27545o00o0oo02, note2, list, str2, null));
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                objOooOo0O = C25252OooO0Oo.OooOo0O(c33770OooooO0, ExecutorC33873OooO0O0.f122045OooOoO0);
                if (objOooOo0O == obj) {
                    return obj;
                }
                collection2 = collection;
                collection.add((InterfaceC33721OooO0o) objOooOo0O);
                collection = collection2;
                if (it.hasNext()) {
                    Iterator it2 = ((List) collection).iterator();
                    if (!it2.hasNext()) {
                        throw new UnsupportedOperationException("Empty collection can't be reduced.");
                    }
                    Object next = it2.next();
                    while (it2.hasNext()) {
                        next = new C33763OoooOOO((InterfaceC33721OooO0o) next, (InterfaceC33721OooO0o) it2.next(), new C27599o0ooOO(3, null));
                    }
                    return next;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0048 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C32449OooOOoo OooO(ArrayList arrayList) {
        Object next;
        Stroke stroke;
        InterfaceC31284OooO0O0.f111702OooO0O0.getClass();
        RectF rectFOooO00o = InterfaceC31284OooO0O0.OooO00o.OooO00o(1.0f, arrayList);
        PaperTheme paperTheme = null;
        Object[] objArr = 0;
        if (rectFOooO00o == null) {
            return null;
        }
        List<PageLayer> defaultPageLayers = PageLayer.INSTANCE.getDefaultPageLayers("");
        Iterator<T> it = defaultPageLayers.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(((PageLayer) next).getId(), "default")) {
                break;
            }
        }
        kotlin.jvm.internal.OooOOO0.OooO0Oo(next);
        PageLayer pageLayer = (PageLayer) next;
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = (InterfaceC31284OooO0O0) it2.next();
            if (interfaceC31284OooO0O0 instanceof DrawRecord) {
                DrawRecord drawRecord = (DrawRecord) interfaceC31284OooO0O0;
                DrawRecord drawRecordDeepCopy = drawRecord.deepCopy(drawRecord.getId());
                drawRecordDeepCopy.setColor(ViewCompat.MEASURED_STATE_MASK);
                stroke = new Stroke(null, null, pageLayer.getId(), System.currentTimeMillis(), drawRecordDeepCopy, null, 35, null);
            } else {
                if (interfaceC31284OooO0O0 instanceof InkStrokeInfo) {
                    InkStrokeInfo inkStrokeInfo = (InkStrokeInfo) interfaceC31284OooO0O0;
                    stroke = new Stroke(null, null, pageLayer.getId(), System.currentTimeMillis(), null, inkStrokeInfo.copyWithColorIntArgb(inkStrokeInfo.getId(), ViewCompat.MEASURED_STATE_MASK), 3, null);
                } else {
                    stroke = null;
                }
                if (stroke == null) {
                    stroke = null;
                }
                if (stroke == null) {
                    arrayList2.add(stroke);
                }
            }
            stroke.offset(-rectFOooO00o.left, -rectFOooO00o.top);
            if (stroke == null) {
            }
        }
        PaperSpec paperSpec = new PaperSpec("dummy", null, false, (int) rectFOooO00o.width(), (int) rectFOooO00o.height(), null, null, 0, 0, 486, null);
        LambdaPaperTheme lambdaPaperTheme = new LambdaPaperTheme(new ColorPaperTheme(paperTheme, PaperColors.INSTANCE.getCOLOR_02(), 1, objArr == true ? 1 : 0), o0OOOO00.OooOO0O.f94361OooOOOO, PaperOrientation.VERTICAL, null, PaperStyle.INSTANCE.getBLANK_PAPER(), null, 40, null);
        ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(defaultPageLayers, 10));
        for (PageLayer pageLayer2 : defaultPageLayers) {
            arrayList3.add(kotlin.jvm.internal.OooOOO0.OooO0O0(pageLayer2.getId(), "default") ? new LayeredDisplayItems(pageLayer2, arrayList2) : new LayeredDisplayItems(pageLayer2, C34434OooOoO.f123453OooOo0o));
        }
        Page page = new Page(null, null, paperSpec, null, lambdaPaperTheme, null, null, null, false, 0, 0L, 0L, null, null, 0, false, null, arrayList3, null, 393195, null);
        RectF rectF = new RectF(0.0f, 0.0f, rectFOooO00o.width(), rectFOooO00o.height());
        float fMax = Math.max(rectF.width(), rectF.height());
        float fMin = Math.min(rectF.width(), rectF.height());
        float f = fMax > 1024.0f ? 1024.0f / fMax : 1.0f;
        if (fMin < 32.0f) {
            f = 32 / fMin;
        }
        float f2 = f;
        return new C32449OooOOoo(Page.createTnBitmapWithBounds$default(page, this.f96576OooO00o, rectF, f2, 0, 8, null), new PointF(-rectFOooO00o.left, -rectFOooO00o.top), new Float(f2));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList OooO0o(List list) throws IOException {
        Bitmap bitmapDecodeStream;
        List list2 = list;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            InputStream inputStreamOpenInputStream = this.f96576OooO00o.getContentResolver().openInputStream((Uri) it.next());
            if (inputStreamOpenInputStream != null) {
                try {
                    bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream);
                    inputStreamOpenInputStream.close();
                    if (bitmapDecodeStream == null) {
                        bitmapDecodeStream = null;
                    } else if (bitmapDecodeStream.getWidth() >= 1024.0f || bitmapDecodeStream.getHeight() >= 1024.0f) {
                        float fMax = 1024.0f / Math.max(bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                        int width = (int) (bitmapDecodeStream.getWidth() * fMax);
                        if (width < 1) {
                            width = 1;
                        }
                        int height = (int) (bitmapDecodeStream.getHeight() * fMax);
                        if (height < 1) {
                            height = 1;
                        }
                        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeStream, width, height, true);
                        kotlin.jvm.internal.OooOOO0.OooO0o(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
                        bitmapDecodeStream.recycle();
                        bitmapDecodeStream = bitmapCreateScaledBitmap;
                    }
                } finally {
                }
            }
            arrayList.add(bitmapDecodeStream);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO0oO(String str, int i, int i2, int i3, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27546o00o0ooo c27546o00o0ooo;
        int i4;
        int i5;
        int i6;
        Object objOooOoO0;
        C27545o00o0oo0 c27545o00o0oo0;
        C27545o00o0oo0 c27545o00o0oo02;
        String str2 = str;
        if (abstractC32479OooO0OO instanceof C27546o00o0ooo) {
            c27546o00o0ooo = (C27546o00o0ooo) abstractC32479OooO0OO;
            int i7 = c27546o00o0ooo.f96596OooOooO;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c27546o00o0ooo.f96596OooOooO = i7 - Integer.MIN_VALUE;
            } else {
                c27546o00o0ooo = new C27546o00o0ooo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooo0OO = c27546o00o0ooo.f96595OooOoo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i8 = c27546o00o0ooo.f96596OooOooO;
        if (i8 == 0) {
            C32446OooOOOo.OooO0O0(objOooo0OO);
            c27546o00o0ooo.f96590OooOo0o = this;
            c27546o00o0ooo.f96589OooOo = str2;
            i4 = i;
            c27546o00o0ooo.f96592OooOoO0 = i4;
            i5 = i2;
            c27546o00o0ooo.f96591OooOoO = i5;
            i6 = i3;
            c27546o00o0ooo.f96593OooOoOO = i6;
            c27546o00o0ooo.f96596OooOooO = 1;
            objOooOoO0 = this.f96577OooO0O0.OooOoO0(str2, c27546o00o0ooo);
            if (objOooOoO0 != enumC32485OooO00o) {
                c27545o00o0oo0 = this;
            }
            return enumC32485OooO00o;
        }
        if (i8 != 1) {
            if (i8 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c27545o00o0oo02 = c27546o00o0ooo.f96590OooOo0o;
            C32446OooOOOo.OooO0O0(objOooo0OO);
            List<Page> list = (List) objOooo0OO;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
            for (Page page : list) {
                C32443OooOOO<Integer, Integer> unrotatedPageSize = page.getUnrotatedPageSize();
                RectF rectF = new RectF(0.0f, 0.0f, unrotatedPageSize.f116638OooOo0o.intValue(), unrotatedPageSize.f116637OooOo.intValue());
                float fMax = Math.max(rectF.width(), rectF.height());
                float fMin = Math.min(rectF.width(), rectF.height());
                float f = fMax > 1024.0f ? 1024.0f / fMax : 1.0f;
                if (fMin < 32.0f) {
                    f = 32.0f / fMin;
                }
                arrayList.add(Page.createTnBitmapWithBounds$default(page, c27545o00o0oo02.f96576OooO00o, rectF, f, 0, 8, null));
            }
            return arrayList;
        }
        int i9 = c27546o00o0ooo.f96593OooOoOO;
        i5 = c27546o00o0ooo.f96591OooOoO;
        int i10 = c27546o00o0ooo.f96592OooOoO0;
        String str3 = c27546o00o0ooo.f96589OooOo;
        c27545o00o0oo0 = c27546o00o0ooo.f96590OooOo0o;
        C32446OooOOOo.OooO0O0(objOooo0OO);
        i6 = i9;
        str2 = str3;
        objOooOoO0 = objOooo0OO;
        i4 = i10;
        NoteContent noteContent = (NoteContent) objOooOoO0;
        if (noteContent == null) {
            return C34434OooOoO.f123453OooOo0o;
        }
        List<Page> pages = noteContent.getPages();
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        for (Object obj : pages) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C34429OooOOo0.OooOOo();
                throw null;
            }
            if (i4 <= i11 && i11 < i5) {
                arrayList2.add(obj);
            }
            i11 = i12;
        }
        ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((Page) it.next()).getId());
        }
        C27449o00O0OoO c27449o00O0OoO = c27545o00o0oo0.f96577OooO0O0;
        c27546o00o0ooo.f96590OooOo0o = c27545o00o0oo0;
        c27546o00o0ooo.f96589OooOo = null;
        c27546o00o0ooo.f96596OooOooO = 2;
        objOooo0OO = c27449o00O0OoO.Oooo0OO(i6, str2, arrayList3, c27546o00o0ooo);
        if (objOooo0OO != enumC32485OooO00o) {
            c27545o00o0oo02 = c27545o00o0oo0;
            List<Page> list2 = (List) objOooo0OO;
            ArrayList arrayList4 = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
            while (r2.hasNext()) {
            }
            return arrayList4;
        }
        return enumC32485OooO00o;
    }

    public final Object OooO0oo(Uri uri, int i, int i2, String str) throws IOException {
        ArrayList arrayList = new ArrayList();
        AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO = this.f96576OooO00o;
        PdfiumCore pdfiumCore = new PdfiumCore(abstractApplicationC26277OooOoOO);
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = abstractApplicationC26277OooOoOO.getContentResolver().openFileDescriptor(uri, "r");
        if (parcelFileDescriptorOpenFileDescriptor == null) {
            return arrayList;
        }
        try {
            try {
                PdfDocument pdfDocumentNewDocument = pdfiumCore.newDocument(parcelFileDescriptorOpenFileDescriptor, str);
                int pageCount = pdfiumCore.getPageCount(pdfDocumentNewDocument);
                for (int i3 = i; i3 < i2; i3++) {
                    if (i3 >= pageCount) {
                        arrayList.add(null);
                    } else {
                        Size pageSize = pdfiumCore.getPageSize(pdfDocumentNewDocument, i3);
                        pdfiumCore.openPage(pdfDocumentNewDocument, i3);
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(pageSize.getWidth(), pageSize.getHeight(), Bitmap.Config.ARGB_8888);
                        kotlin.jvm.internal.OooOOO0.OooO0o(bitmapCreateBitmap, "createBitmap(...)");
                        pdfiumCore.renderPageBitmap(pdfDocumentNewDocument, bitmapCreateBitmap, i3, 0, 0, pageSize.getWidth(), pageSize.getHeight(), false);
                        if (bitmapCreateBitmap.getWidth() > 1024.0f || bitmapCreateBitmap.getHeight() > 1024.0f) {
                            float fMax = 1024.0f / Math.max(bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                            int width = (int) (bitmapCreateBitmap.getWidth() * fMax);
                            if (width < 1) {
                                width = 1;
                            }
                            int height = (int) (bitmapCreateBitmap.getHeight() * fMax);
                            if (height < 1) {
                                height = 1;
                            }
                            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, width, height, true);
                            kotlin.jvm.internal.OooOOO0.OooO0o(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
                            bitmapCreateBitmap.recycle();
                            arrayList.add(bitmapCreateScaledBitmap);
                        } else {
                            arrayList.add(bitmapCreateBitmap);
                        }
                    }
                }
                pdfiumCore.closeDocument(pdfDocumentNewDocument);
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                parcelFileDescriptorOpenFileDescriptor.close();
                return arrayList;
            } catch (PdfPasswordException e) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("SearchUseCase");
                c20358OooO00o.OooO0Oo(e, "createBitmapForPdfPageOCR: newDocument failed", new Object[0]);
                C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
                parcelFileDescriptorOpenFileDescriptor.close();
                return c34434OooOoO;
            }
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0117 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0118 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0(Page page, ArrayList arrayList, Point point, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27511o00o c27511o00o;
        Page page2;
        Object objOooO;
        Point point2;
        C27545o00o0oo0 c27545o00o0oo0;
        C27545o00o0oo0 c27545o00o0oo02;
        List list;
        List<DrawRecord> list2;
        Object objOooOO0o;
        C27545o00o0oo0 c27545o00o0oo03;
        List<DrawRecord> list3;
        Object objOooO0O0;
        List<DrawRecord> list4;
        List list5;
        ArrayList arrayList2 = arrayList;
        if (abstractC32479OooO0OO instanceof C27511o00o) {
            c27511o00o = (C27511o00o) abstractC32479OooO0OO;
            int i = c27511o00o.f96416OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27511o00o.f96416OooOoo = i - Integer.MIN_VALUE;
            } else {
                c27511o00o = new C27511o00o(this, abstractC32479OooO0OO);
            }
        }
        C27511o00o c27511o00o2 = c27511o00o;
        Object obj = c27511o00o2.f96415OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27511o00o2.f96416OooOoo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (!arrayList2.isEmpty()) {
                c27511o00o2.f96412OooOo0o = this;
                page2 = page;
                c27511o00o2.f96411OooOo = page2;
                c27511o00o2.f96414OooOoO0 = arrayList2;
                c27511o00o2.f96413OooOoO = point;
                c27511o00o2.f96416OooOoo = 1;
                objOooO = OooO(arrayList2);
                if (objOooO != enumC32485OooO00o) {
                    point2 = point;
                    c27545o00o0oo0 = this;
                    list2 = arrayList2;
                }
            }
            point2 = point;
            c27545o00o0oo02 = this;
            list = C34434OooOoO.f123453OooOo0o;
            page2 = page;
            list3 = arrayList2;
            HandWritingTextCache handWritingTextCache = new HandWritingTextCache(page2.getId(), point2.x, point2.y, DrawRecord.INSTANCE.getTrajectoryHash(list3), page2.getLastModificationTime(), oOo000Oo.OooOo.o000oOoO(list, IOUtils.LINE_SEPARATOR_UNIX, null, null, new C27542o00o0oOO(0), 30), list);
            c27511o00o2.f96412OooOo0o = handWritingTextCache;
            c27511o00o2.f96411OooOo = null;
            c27511o00o2.f96414OooOoO0 = null;
            c27511o00o2.f96413OooOoO = null;
            c27511o00o2.f96416OooOoo = 3;
            objOooO0O0 = c27545o00o0oo02.f96583OooO0oo.OooO0O0(handWritingTextCache, c27511o00o2);
            if (objOooO0O0 != enumC32485OooO00o) {
            }
            if (objOooO0O0 != enumC32485OooO00o) {
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    HandWritingTextCache handWritingTextCache2 = (HandWritingTextCache) c27511o00o2.f96412OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    return handWritingTextCache2;
                }
                Point point3 = c27511o00o2.f96413OooOoO;
                List<DrawRecord> list6 = c27511o00o2.f96414OooOoO0;
                Page page3 = c27511o00o2.f96411OooOo;
                C27545o00o0oo0 c27545o00o0oo04 = (C27545o00o0oo0) c27511o00o2.f96412OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooOO0o = obj;
                page2 = page3;
                point2 = point3;
                list4 = list6;
                c27545o00o0oo03 = c27545o00o0oo04;
                list5 = (List) objOooOO0o;
                if (list5 != null) {
                    list = list5;
                    list3 = list4;
                    c27545o00o0oo02 = c27545o00o0oo03;
                    HandWritingTextCache handWritingTextCache3 = new HandWritingTextCache(page2.getId(), point2.x, point2.y, DrawRecord.INSTANCE.getTrajectoryHash(list3), page2.getLastModificationTime(), oOo000Oo.OooOo.o000oOoO(list, IOUtils.LINE_SEPARATOR_UNIX, null, null, new C27542o00o0oOO(0), 30), list);
                    c27511o00o2.f96412OooOo0o = handWritingTextCache3;
                    c27511o00o2.f96411OooOo = null;
                    c27511o00o2.f96414OooOoO0 = null;
                    c27511o00o2.f96413OooOoO = null;
                    c27511o00o2.f96416OooOoo = 3;
                    objOooO0O0 = c27545o00o0oo02.f96583OooO0oo.OooO0O0(handWritingTextCache3, c27511o00o2);
                    if (objOooO0O0 != enumC32485OooO00o) {
                        objOooO0O0 = C32460OooOooO.f116667OooO00o;
                    }
                    return objOooO0O0 != enumC32485OooO00o ? enumC32485OooO00o : handWritingTextCache3;
                }
                return null;
            }
            Point point4 = c27511o00o2.f96413OooOoO;
            List<DrawRecord> list7 = c27511o00o2.f96414OooOoO0;
            Page page4 = c27511o00o2.f96411OooOo;
            C27545o00o0oo0 c27545o00o0oo05 = (C27545o00o0oo0) c27511o00o2.f96412OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            objOooO = obj;
            page2 = page4;
            point2 = point4;
            list2 = list7;
            c27545o00o0oo0 = c27545o00o0oo05;
        }
        C32449OooOOoo c32449OooOOoo = (C32449OooOOoo) objOooO;
        if (c32449OooOOoo != null) {
            Bitmap bitmap = (Bitmap) c32449OooOOoo.f116648OooOo0o;
            PointF pointF = (PointF) c32449OooOOoo.f116647OooOo;
            float fFloatValue = ((Number) c32449OooOOoo.f116649OooOoO0).floatValue();
            c27511o00o2.f96412OooOo0o = c27545o00o0oo0;
            c27511o00o2.f96411OooOo = page2;
            c27511o00o2.f96414OooOoO0 = list2;
            c27511o00o2.f96413OooOoO = point2;
            c27511o00o2.f96416OooOoo = 2;
            objOooOO0o = c27545o00o0oo0.OooOO0o(bitmap, pointF, fFloatValue, false, c27511o00o2);
            if (objOooOO0o != enumC32485OooO00o) {
                c27545o00o0oo03 = c27545o00o0oo0;
                list4 = list2;
                list5 = (List) objOooOO0o;
                if (list5 != null) {
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0O(PdfInfo pdfInfo, int i, android.util.Size size, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27575o00oo000 c27575o00oo000;
        C27545o00o0oo0 c27545o00o0oo0;
        int i2;
        PdfInfo pdfInfo2 = pdfInfo;
        if (abstractC32479OooO0OO instanceof C27575o00oo000) {
            c27575o00oo000 = (C27575o00oo000) abstractC32479OooO0OO;
            int i3 = c27575o00oo000.f96781OooOoo0;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c27575o00oo000.f96781OooOoo0 = i3 - Integer.MIN_VALUE;
            } else {
                c27575o00oo000 = new C27575o00oo000(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0Oo = c27575o00oo000.f96778OooOoO;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i4 = c27575o00oo000.f96781OooOoo0;
        if (i4 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0Oo);
            c27575o00oo000.f96777OooOo0o = this;
            c27575o00oo000.f96776OooOo = pdfInfo2;
            c27575o00oo000.f96779OooOoO0 = i;
            c27575o00oo000.f96781OooOoo0 = 1;
            objOooO0Oo = this.f96575OooO.OooO0Oo(pdfInfo2, i, size);
            if (objOooO0Oo != obj) {
                c27545o00o0oo0 = this;
                i2 = i;
            }
        }
        if (i4 != 1) {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            PdfTextCache pdfTextCache = (PdfTextCache) c27575o00oo000.f96777OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0Oo);
            return pdfTextCache;
        }
        int i5 = c27575o00oo000.f96779OooOoO0;
        PdfInfo pdfInfo3 = c27575o00oo000.f96776OooOo;
        c27545o00o0oo0 = (C27545o00o0oo0) c27575o00oo000.f96777OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0Oo);
        i2 = i5;
        pdfInfo2 = pdfInfo3;
        List list = (List) objOooO0Oo;
        if (list == null) {
            return null;
        }
        PdfTextCache pdfTextCache2 = new PdfTextCache(null, i2, pdfInfo2.getPdfPath(), System.currentTimeMillis(), oOo000Oo.OooOo.o000oOoO(list, IOUtils.LINE_SEPARATOR_UNIX, null, null, new C27543o00o0oOo(0), 30), list, 1, null);
        c27575o00oo000.f96777OooOo0o = pdfTextCache2;
        c27575o00oo000.f96776OooOo = null;
        c27575o00oo000.f96781OooOoo0 = 2;
        Object objOooO0OO = c27545o00o0oo0.f96575OooO.OooO0OO(pdfTextCache2, c27575o00oo000);
        if (objOooO0OO != obj) {
            objOooO0OO = C32460OooOooO.f116667OooO00o;
        }
        return objOooO0OO == obj ? obj : pdfTextCache2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooOO0o(Bitmap bitmap, PointF pointF, float f, boolean z, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27561o00oOo c27561o00oOo;
        if (abstractC32479OooO0OO instanceof C27561o00oOo) {
            c27561o00oOo = (C27561o00oOo) abstractC32479OooO0OO;
            int i = c27561o00oOo.f96696OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27561o00oOo.f96696OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27561o00oOo = new C27561o00oOo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c27561o00oOo.f96695OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27561o00oOo.f96696OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            c27561o00oOo.f96693OooOo0o = pointF;
            c27561o00oOo.f96692OooOo = f;
            c27561o00oOo.f96696OooOoOO = 1;
            objOooO00o = this.f96583OooO0oo.OooO00o(bitmap, z, c27561o00oOo);
            if (objOooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f = c27561o00oOo.f96692OooOo;
            pointF = c27561o00oOo.f96693OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
        }
        List list = (List) objOooO00o;
        if (list == null) {
            return null;
        }
        List<RecognizedTextElement> list2 = list;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        for (RecognizedTextElement recognizedTextElement : list2) {
            List<RecognizedTextElement.CharElement> chars = recognizedTextElement.getChars();
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(chars, 10));
            for (RecognizedTextElement.CharElement charElement : chars) {
                RectF rectF = new RectF(charElement.getBounds());
                o00OO0O0.OooO0O0.OooOO0O(rectF, 1 / f);
                rectF.offset(-pointF.x, -pointF.y);
                arrayList2.add(RecognizedTextElement.CharElement.copy$default(charElement, null, rectF, 1, null));
            }
            arrayList.add(RecognizedTextElement.copy$default(recognizedTextElement, null, null, arrayList2, 3, null));
        }
        return arrayList;
    }
}
