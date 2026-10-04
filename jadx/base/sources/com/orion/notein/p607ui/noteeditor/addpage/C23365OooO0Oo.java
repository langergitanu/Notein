package com.orion.notein.p607ui.noteeditor.addpage;

import Oooo0.o000000O;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.lifecycle.AbstractC22019Ooooooo;
import androidx.lifecycle.o0OoOo0;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfPasswordException;
import com.shockwave.pdfium.PdfiumCore;
import com.shockwave.pdfium.util.Size;
import java.io.FileNotFoundException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32509OooOOo;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33763OoooOOO;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.C33773Oooooo;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.C33784o00ooo;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0Oo.InterfaceC33788ooOO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.addpage.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/addpage/OooO0Oo;", "Landroidx/lifecycle/Ooooooo;", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class C23365OooO0Oo extends AbstractC22019Ooooooo {

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final float f73882OooOOo0 = o000000O.OooO0o0(130.0f);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C33781o00o0O f73883OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Context f73884OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C33772OooooOo f73885OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C33772OooooOo f73886OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C33781o00o0O f73887OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C33781o00o0O f73888OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final C33781o00o0O f73889OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final C33781o00o0O f73890OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final C33769Ooooo0o f73891OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final C33769Ooooo0o f73892OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final C33769Ooooo0o f73893OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final C33769Ooooo0o f73894OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final C33769Ooooo0o f73895OooOOOo;

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.addpage.OooO0Oo$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Uri f73896OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f73897OooO0O0;

        public OooO00o(Uri uri, String str) {
            this.f73896OooO00o = uri;
            this.f73897OooO0O0 = str;
        }

        public static OooO00o OooO00o(OooO00o oooO00o, Uri uri, String str, int i) {
            if ((i & 1) != 0) {
                uri = oooO00o.f73896OooO00o;
            }
            if ((i & 2) != 0) {
                str = oooO00o.f73897OooO0O0;
            }
            return new OooO00o(uri, str);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return OooOOO0.OooO0O0(this.f73896OooO00o, oooO00o.f73896OooO00o) && OooOOO0.OooO0O0(this.f73897OooO0O0, oooO00o.f73897OooO0O0);
        }

        public final int hashCode() {
            int iHashCode = this.f73896OooO00o.hashCode() * 31;
            String str = this.f73897OooO0O0;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "PDFUri(uri=" + this.f73896OooO00o + ", password=" + this.f73897OooO0O0 + ")";
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.addpage.OooO0Oo$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addpage.PDFPageSelectorViewModel$document$1", m80623f = "PDFPageSelectorViewModel.kt", m80624l = {78}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<PdfiumCore, OooO00o, Continuation<? super PdfDocument>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ PdfiumCore f73898OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f73899OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public /* synthetic */ OooO00o f73901OooOoO0;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(3, continuation);
        }

        @Override // oO0O000o.InterfaceC32510OooOOo0
        public final Object invoke(PdfiumCore pdfiumCore, OooO00o oooO00o, Continuation<? super PdfDocument> continuation) {
            OooO0O0 oooO0O0 = C23365OooO0Oo.this.new OooO0O0(continuation);
            oooO0O0.f73898OooOo = pdfiumCore;
            oooO0O0.f73901OooOoO0 = oooO00o;
            return oooO0O0.invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            C23365OooO0Oo c23365OooO0Oo = C23365OooO0Oo.this;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f73899OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                PdfiumCore pdfiumCore = this.f73898OooOo;
                OooO00o oooO00o = this.f73901OooOoO0;
                if (oooO00o != null) {
                    try {
                        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = c23365OooO0Oo.f73884OooO0Oo.getContentResolver().openFileDescriptor(oooO00o.f73896OooO00o, "r");
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                            return pdfiumCore.newDocument(parcelFileDescriptorOpenFileDescriptor, oooO00o.f73897OooO0O0);
                        }
                    } catch (PdfPasswordException unused) {
                        C33772OooooOo c33772OooooOo = c23365OooO0Oo.f73886OooO0o0;
                        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                        this.f73898OooOo = null;
                        this.f73899OooOo0o = 1;
                        if (c33772OooooOo.emit(c32460OooOooO, this) == enumC32485OooO00o) {
                            return enumC32485OooO00o;
                        }
                    } catch (FileNotFoundException unused2) {
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.addpage.OooO0Oo$OooO0OO */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addpage.PDFPageSelectorViewModel$pageCount$1", m80623f = "PDFPageSelectorViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32510OooOOo0<PdfiumCore, PdfDocument, Continuation<? super Integer>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ PdfDocument f73902OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ PdfiumCore f73903OooOo0o;

        @Override // oO0O000o.InterfaceC32510OooOOo0
        public final Object invoke(PdfiumCore pdfiumCore, PdfDocument pdfDocument, Continuation<? super Integer> continuation) {
            OooO0OO oooO0OO = new OooO0OO(3, continuation);
            oooO0OO.f73903OooOo0o = pdfiumCore;
            oooO0OO.f73902OooOo = pdfDocument;
            return oooO0OO.invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            PdfiumCore pdfiumCore = this.f73903OooOo0o;
            PdfDocument pdfDocument = this.f73902OooOo;
            return new Integer(pdfDocument != null ? pdfiumCore.getPageCount(pdfDocument) : 0);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.addpage.OooO0Oo$OooO0Oo, reason: collision with other inner class name */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addpage.PDFPageSelectorViewModel$pageNumString$1", m80623f = "PDFPageSelectorViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class C19271OooO0Oo extends AbstractC32476OooO implements InterfaceC32510OooOOo0<Integer, Integer, Continuation<? super String>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ int f73904OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ int f73905OooOo0o;

        @Override // oO0O000o.InterfaceC32510OooOOo0
        public final Object invoke(Integer num, Integer num2, Continuation<? super String> continuation) {
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            C19271OooO0Oo c19271OooO0Oo = new C19271OooO0Oo(3, continuation);
            c19271OooO0Oo.f73905OooOo0o = iIntValue;
            c19271OooO0Oo.f73904OooOo = iIntValue2;
            return c19271OooO0Oo.invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            return this.f73905OooOo0o + "/" + this.f73904OooOo;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.addpage.OooO0Oo$OooO0o */
    public static final class OooO0o implements InterfaceC33721OooO0o<PdfiumCore> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C33781o00o0O f73906OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.addpage.OooO0Oo$OooO0o$OooO00o */
        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO f73907OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.addpage.OooO0Oo$OooO0o$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addpage.PDFPageSelectorViewModel$special$$inlined$map$1$2", m80623f = "PDFPageSelectorViewModel.kt", m80624l = {50}, m80625m = "emit")
            public static final class C19272OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f73908OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f73909OooOo0o;

                public C19272OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f73909OooOo0o = obj;
                    this.f73908OooOo |= Integer.MIN_VALUE;
                    return OooO00o.this.emit(null, this);
                }
            }

            public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
                this.f73907OooOo0o = interfaceC33723OooO0oO;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C19272OooO00o c19272OooO00o;
                if (continuation instanceof C19272OooO00o) {
                    c19272OooO00o = (C19272OooO00o) continuation;
                    int i = c19272OooO00o.f73908OooOo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c19272OooO00o.f73908OooOo = i - Integer.MIN_VALUE;
                    } else {
                        c19272OooO00o = new C19272OooO00o(continuation);
                    }
                }
                Object obj2 = c19272OooO00o.f73909OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c19272OooO00o.f73908OooOo;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj2);
                    PdfiumCore pdfiumCore = new PdfiumCore(((Number) obj).intValue());
                    c19272OooO00o.f73908OooOo = 1;
                    if (this.f73907OooOo0o.emit(pdfiumCore, c19272OooO00o) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj2);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public OooO0o(C33781o00o0O c33781o00o0O) {
            this.f73906OooOo0o = c33781o00o0O;
        }

        @Override // oO0o0Oo.InterfaceC33721OooO0o
        public final Object collect(InterfaceC33723OooO0oO<? super PdfiumCore> interfaceC33723OooO0oO, Continuation continuation) {
            this.f73906OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO), continuation);
            return EnumC32485OooO00o.f116726OooOo0o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.addpage.OooO0Oo$OooO0o0, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addpage.PDFPageSelectorViewModel$pagePreview$1", m80623f = "PDFPageSelectorViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class C23366OooO0o0 extends AbstractC32476OooO implements InterfaceC32509OooOOo<PdfiumCore, PdfDocument, Integer, Continuation<? super Bitmap>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ PdfDocument f73911OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ PdfiumCore f73912OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public /* synthetic */ int f73914OooOoO0;

        public C23366OooO0o0(Continuation<? super C23366OooO0o0> continuation) {
            super(4, continuation);
        }

        @Override // oO0O000o.InterfaceC32509OooOOo
        public final Object invoke(PdfiumCore pdfiumCore, PdfDocument pdfDocument, Integer num, Continuation<? super Bitmap> continuation) {
            int iIntValue = num.intValue();
            C23366OooO0o0 c23366OooO0o0 = C23365OooO0Oo.this.new C23366OooO0o0(continuation);
            c23366OooO0o0.f73912OooOo0o = pdfiumCore;
            c23366OooO0o0.f73911OooOo = pdfDocument;
            c23366OooO0o0.f73914OooOoO0 = iIntValue;
            return c23366OooO0o0.invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            PdfiumCore pdfiumCore = this.f73912OooOo0o;
            PdfDocument pdfDocument = this.f73911OooOo;
            int i = this.f73914OooOoO0;
            if (pdfDocument == null) {
                return null;
            }
            int i2 = i - 1;
            pdfiumCore.openPage(pdfDocument, i2);
            float f = C23365OooO0Oo.f73882OooOOo0;
            C23365OooO0Oo.this.getClass();
            Size pageSize = pdfiumCore.getPageSize(pdfDocument, i2);
            Point point = new Point(pageSize.getWidth(), pageSize.getHeight());
            int iMax = Math.max(point.x, point.y);
            int iMin = Math.min(point.x, point.y);
            float f2 = C23365OooO0Oo.f73882OooOOo0;
            int iOooO0o0 = (int) o000000O.OooO0o0(f2);
            int iOooO0o02 = (int) ((o000000O.OooO0o0(f2) / iMax) * iMin);
            Point point2 = point.x > point.y ? new Point(iOooO0o0, iOooO0o02) : new Point(iOooO0o02, iOooO0o0);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(point2.x, point2.y, Bitmap.Config.ARGB_8888);
            OooOOO0.OooO0o(bitmapCreateBitmap, "createBitmap(...)");
            pdfiumCore.renderPageBitmap(pdfDocument, bitmapCreateBitmap, i2, 0, 0, point2.x, point2.y, false);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            float[] fArr = {o000000O.OooO0o0(3.0f), o000000O.OooO0o0(3.0f)};
            Rect rect = new Rect(1, 1, bitmapCreateBitmap.getWidth() - 2, bitmapCreateBitmap.getHeight() - 2);
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(o000000O.OooO0o0(3.0f));
            paint.setColor(Color.parseColor("#007AFF"));
            paint.setPathEffect(new DashPathEffect(fArr, 0.0f));
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            canvas.drawRect(rect, paint);
            return bitmapCreateBitmap;
        }
    }

    public C23365OooO0Oo(Context context) {
        this.f73884OooO0Oo = context;
        C33772OooooOo c33772OooooOoOooO0O0 = C33773Oooooo.OooO0O0(0, 0, 6);
        this.f73886OooO0o0 = c33772OooooOoOooO0O0;
        this.f73885OooO0o = c33772OooooOoOooO0O0;
        C33781o00o0O c33781o00o0OOooO00o = C33784o00ooo.OooO00o(null);
        this.f73887OooO0oO = c33781o00o0OOooO00o;
        this.f73888OooO0oo = c33781o00o0OOooO00o;
        C33781o00o0O c33781o00o0OOooO00o2 = C33784o00ooo.OooO00o(1);
        this.f73883OooO = c33781o00o0OOooO00o2;
        this.f73889OooOO0 = c33781o00o0OOooO00o2;
        C33781o00o0O c33781o00o0OOooO00o3 = C33784o00ooo.OooO00o(400);
        this.f73890OooOO0O = c33781o00o0OOooO00o3;
        C33769Ooooo0o c33769Ooooo0oOooOoO0 = C25252OooO0Oo.OooOoO0(new OooO0o(c33781o00o0OOooO00o3), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), new PdfiumCore(400));
        this.f73891OooOO0o = c33769Ooooo0oOooOoO0;
        C33763OoooOOO c33763OoooOOO = new C33763OoooOOO(c33769Ooooo0oOooOoO0, c33781o00o0OOooO00o, new OooO0O0(null));
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(this);
        ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
        C33769Ooooo0o c33769Ooooo0oOooOoO02 = C25252OooO0Oo.OooOoO0(c33763OoooOOO, C33633Oooo0.OooO0oO(interfaceC33636Oooo00oOooO00o, executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), null);
        this.f73893OooOOO0 = c33769Ooooo0oOooOoO02;
        C33769Ooooo0o c33769Ooooo0oOooOoO03 = C25252OooO0Oo.OooOoO0(new C33763OoooOOO(c33769Ooooo0oOooOoO0, c33769Ooooo0oOooOoO02, new OooO0OO(3, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), 0);
        this.f73892OooOOO = c33769Ooooo0oOooOoO03;
        this.f73894OooOOOO = C25252OooO0Oo.OooOoO0(new C33763OoooOOO(c33781o00o0OOooO00o2, c33769Ooooo0oOooOoO03, new C19271OooO0Oo(3, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), "");
        this.f73895OooOOOo = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooO0oo(c33769Ooooo0oOooOoO0, c33769Ooooo0oOooOoO02, c33781o00o0OOooO00o2, new C23366OooO0o0(null)), C33633Oooo0.OooO0oO(o0OoOo0.OooO00o(this), executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.AbstractC22019Ooooooo
    public final void OooO0OO() {
        PdfiumCore pdfiumCore = (PdfiumCore) this.f73891OooOO0o.f121747OooOo0o.getValue();
        PdfDocument pdfDocument = (PdfDocument) this.f73893OooOOO0.f121747OooOo0o.getValue();
        if (pdfDocument != null) {
            pdfiumCore.closeDocument(pdfDocument);
        }
    }
}
