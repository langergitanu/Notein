package com.orion.notein.p607ui.noteeditor.pagelayereditor;

import Oooo0.o000000O;
import Oooo0o0.C21009OooOooO;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Size;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C21929Ooooo0o;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.OooOo;
import androidx.lifecycle.o0OoOo0;
import androidx.recyclerview.widget.C22041OooOOo;
import androidx.recyclerview.widget.RecyclerView;
import com.aspose.slides.C22227OoooO;
import com.aspose.words.StyleIdentifier;
import com.orion.editor.AbstractC22830OooO0Oo;
import com.orion.editor.PDFView;
import com.orion.notein.MainActivity;
import com.orion.notein.domain.models.page.PageLayer;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.TipsDialogFragment;
import com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0OO;
import com.orion.notein.p607ui.noteeditor.pagelayereditor.PageLayerEditor;
import com.orion.penkit.models.LayerInfo;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o000oooo.C24761OooO;
import o00o00.C25206OooO0Oo;
import o0O0o0oO.ViewOnClickListenerC26051OoooOOo;
import o0O0o0oO.ViewOnClickListenerC26054OoooOoo;
import o0O0oOO.C26112OooO0oo;
import o0Oo00oO.C28036OooO0O0;
import o0Ooo0O.C29375OooO00o;
import o0Ooo0O0.C29379OooO0O0;
import o0Ooo0O0.C29381OooO0Oo;
import o0Ooo0O0.C29382OooO0o;
import o0Ooo0O0.C29383OooO0o0;
import o0Ooo0O0.C29392OooOOOo;
import o0Ooo0O0.ViewOnClickListenerC29384OooO0oO;
import o0OoooO0.C29632OooO0OO;
import o0oOOOoo.C30837OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u0013J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR$\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/pagelayereditor/PageLayerEditor;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/orion/editor/PDFView;", "pdfView", "LoO00ooO/OooOooO;", "setPdfView", "(Lcom/orion/editor/PDFView;)V", "", "pageIndex", "setPageIndex", "(I)V", "Lcom/orion/notein/ui/noteeditor/pagelayereditor/PageLayerEditor$OooO00o;", "OooOooO", "Lcom/orion/notein/ui/noteeditor/pagelayereditor/PageLayerEditor$OooO00o;", "getEventListener", "()Lcom/orion/notein/ui/noteeditor/pagelayereditor/PageLayerEditor$OooO00o;", "setEventListener", "(Lcom/orion/notein/ui/noteeditor/pagelayereditor/PageLayerEditor$OooO00o;)V", "eventListener", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class PageLayerEditor extends ConstraintLayout {

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public static final /* synthetic */ int f74865Oooo0o0 = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public OooOo f74866OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public OooO0OO f74867OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public C29375OooO00o f74868OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public RecyclerView f74869OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public View f74870OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public PDFView f74871OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public C29632OooO0OO f74872OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name and from kotlin metadata */
    public OooO00o eventListener;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final ConcurrentHashMap<String, C29381OooO0Oo> f74874OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final ViewOnClickListenerC26051OoooOOo f74875Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C29381OooO0Oo f74876Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final ConcurrentHashMap<String, C30837OooO00o> f74877Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final OooO0O0 f74878Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final C29383OooO0o0 f74879Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final C29382OooO0o f74880Oooo0OO;

    public interface OooO00o {
        void OooO0O0();

        void OooO0OO();

        void OooO0o0(PageLayer pageLayer, int i);

        void OooO0oO(PageLayer pageLayer, int i);
    }

    public final class OooO0O0 implements C29375OooO00o.InterfaceC19985OooO00o {

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagelayereditor.PageLayerEditor$adapterItemClickListener$1$onAddEmptyLayerClick$1", m80623f = "PageLayerEditor.kt", m80624l = {StyleIdentifier.SMART_HYPERLINK}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PageLayerEditor f74882OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f74883OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ C30837OooO00o f74884OooOoO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(PageLayerEditor pageLayerEditor, C30837OooO00o c30837OooO00o, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f74882OooOo = pageLayerEditor;
                this.f74884OooOoO0 = c30837OooO00o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f74882OooOo, this.f74884OooOoO0, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f74883OooOo0o;
                PageLayerEditor pageLayerEditor = this.f74882OooOo;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    this.f74883OooOo0o = 1;
                    obj = PageLayerEditor.OooO0O0(pageLayerEditor, 27, this);
                    if (obj == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    OooO0OO oooO0OO = pageLayerEditor.f74867OooOo0o;
                    Integer numValueOf = null;
                    if (oooO0OO == null) {
                        OooOOO0.OooOOOO("viewModel");
                        throw null;
                    }
                    String targetLayerId = this.f74884OooOoO0.f110196OooO00o;
                    OooOOO0.OooO0oO(targetLayerId, "targetLayerId");
                    C34406OooO00o.f123390OooO00o.OooO0o0("addEmptyLayerAboveLayer start. targetLayerId=".concat(targetLayerId), new Object[0]);
                    List list = (List) oooO0OO.f74786OooOOoo.f121747OooOo0o.getValue();
                    if (list != null) {
                        Iterator it = list.iterator();
                        int i2 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i2 = -1;
                                break;
                            }
                            if (OooOOO0.OooO0O0(((PageLayer) it.next()).getId(), targetLayerId)) {
                                break;
                            }
                            i2++;
                        }
                        numValueOf = Integer.valueOf(i2);
                    }
                    if (numValueOf == null || numValueOf.intValue() == -1) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        StringBuilder sbOooO00o = C22227OoooO.OooO00o(c20358OooO00o, "PageLayerViewModel", "addEmptyLayerAboveLayer. invalid targetLayerId=", targetLayerId, ", insertIndex=");
                        sbOooO00o.append(numValueOf);
                        c20358OooO00o.OooO0OO(sbOooO00o.toString(), new Object[0]);
                    } else {
                        oooO0OO.OooO0oo(numValueOf.intValue() + 1, new PageLayer(C24761OooO.OooO00o("toString(...)"), (String) oooO0OO.f74783OooOOOo.getValue(), true, null, null, 16, null), true);
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public OooO0O0() {
        }

        @Override // o0Ooo0O.C29375OooO00o.InterfaceC19985OooO00o
        public final void OooO00o(View view) {
            Object tag = view.getTag();
            OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.pagelayereditor.model.PageLayerTnVO");
            C30837OooO00o c30837OooO00o = (C30837OooO00o) tag;
            PageLayerEditor pageLayerEditor = PageLayerEditor.this;
            OooOo oooOo = pageLayerEditor.f74866OooOo;
            if (oooOo != null) {
                C33609OooO0oo.OooO0OO(oooOo, null, null, new com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO00o(pageLayerEditor, view, c30837OooO00o, null), 3);
            } else {
                OooOOO0.OooOOOO("viewScope");
                throw null;
            }
        }

        @Override // o0Ooo0O.C29375OooO00o.InterfaceC19985OooO00o
        public final Bitmap OooO0O0(C30837OooO00o c30837OooO00o) {
            PageLayerEditor pageLayerEditor = PageLayerEditor.this;
            OooO0OO oooO0OO = pageLayerEditor.f74867OooOo0o;
            if (oooO0OO == null) {
                OooOOO0.OooOOOO("viewModel");
                throw null;
            }
            OooO0OO.OooO0Oo oooO0Oo = (OooO0OO.OooO0Oo) oooO0OO.f74779OooOO0o.get(OooO0OO.OooOO0(c30837OooO00o));
            Bitmap bitmap = oooO0Oo != null ? oooO0Oo.f74805OooO00o : null;
            if (bitmap != null) {
                return bitmap;
            }
            pageLayerEditor.OooO0Oo(c30837OooO00o);
            return null;
        }

        @Override // o0Ooo0O.C29375OooO00o.InterfaceC19985OooO00o
        public final void OooO0OO(View view) {
            Object tag = view.getTag();
            OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.pagelayereditor.model.PageLayerTnVO");
            C30837OooO00o c30837OooO00o = (C30837OooO00o) tag;
            PageLayerEditor pageLayerEditor = PageLayerEditor.this;
            OooOo oooOo = pageLayerEditor.f74866OooOo;
            if (oooOo != null) {
                C33609OooO0oo.OooO0OO(oooOo, null, null, new OooO00o(pageLayerEditor, c30837OooO00o, null), 3);
            } else {
                OooOOO0.OooOOOO("viewScope");
                throw null;
            }
        }

        @Override // o0Ooo0O.C29375OooO00o.InterfaceC19985OooO00o
        public final void OooO0Oo(View view) {
            Object tag = view.getTag();
            OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.pagelayereditor.model.PageLayerTnVO");
            C30837OooO00o c30837OooO00o = (C30837OooO00o) tag;
            OooO0OO oooO0OO = PageLayerEditor.this.f74867OooOo0o;
            if (oooO0OO != null) {
                oooO0OO.OooO0oO(c30837OooO00o.f110196OooO00o, c30837OooO00o.f110197OooO0O0);
            } else {
                OooOOO0.OooOOOO("viewModel");
                throw null;
            }
        }

        @Override // o0Ooo0O.C29375OooO00o.InterfaceC19985OooO00o
        public final void OooO0o0(View view) {
            Object tag = view.getTag();
            OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.pagelayereditor.model.PageLayerTnVO");
            C30837OooO00o c30837OooO00o = (C30837OooO00o) tag;
            OooO0OO oooO0OO = PageLayerEditor.this.f74867OooOo0o;
            if (oooO0OO == null) {
                OooOOO0.OooOOOO("viewModel");
                throw null;
            }
            C34406OooO00o.f123390OooO00o.OooO0o0("toggleLayerVisibility start. layerId=" + c30837OooO00o, new Object[0]);
            C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(oooO0OO), oooO0OO.f74775OooO0oO, null, new OooO0o(oooO0OO, c30837OooO00o, null), 2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageLayerEditor(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        OooOOO0.OooO0oO(context, "context");
        this.f74874OooOooo = new ConcurrentHashMap<>();
        this.f74876Oooo000 = new C29381OooO0Oo();
        this.f74877Oooo00O = new ConcurrentHashMap<>();
        View.inflate(context, R.layout.layout_layer_editor, this);
        this.f74878Oooo00o = new OooO0O0();
        this.f74875Oooo0 = new ViewOnClickListenerC26051OoooOOo(this, 2);
        this.f74879Oooo0O0 = new C29383OooO0o0(this);
        this.f74880Oooo0OO = new C29382OooO0o(this);
    }

    public static final C32460OooOooO OooO00o(PageLayerEditor pageLayerEditor, int i, C30837OooO00o c30837OooO00o) {
        AbstractC22830OooO0Oo abstractC22830OooO0Oo;
        Bitmap bitmap;
        float f;
        int i2;
        float f2;
        int i3;
        Paint paint;
        PDFView pDFView = pageLayerEditor.f74871OooOoo;
        if (pDFView == null || (abstractC22830OooO0Oo = pDFView.f69170OooOooO) == null) {
            return C32460OooOooO.f116667OooO00o;
        }
        String pageId = c30837OooO00o.f110198OooO0OO;
        if (i < 0 || i >= abstractC22830OooO0Oo.f69111OooO0Oo) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            int i4 = abstractC22830OooO0Oo.f69111OooO0Oo;
            StringBuilder sbOooO0OO = C21009OooOooO.OooO0OO(i, "Invalid pageIndex ", " for vo.pageId=", pageId, ", total pages=");
            sbOooO0OO.append(i4);
            c20358OooO00o.OooOO0O(sbOooO0OO.toString(), new Object[0]);
            return C32460OooOooO.f116667OooO00o;
        }
        String id = c30837OooO00o.f110196OooO00o;
        OooOOO0.OooO0oO(id, "id");
        String noteId = c30837OooO00o.f110197OooO0O0;
        OooOOO0.OooO0oO(noteId, "noteId");
        OooOOO0.OooO0oO(pageId, "pageId");
        Size size = c30837OooO00o.f110200OooO0o;
        int i5 = 0;
        C30837OooO00o c30837OooO00o2 = new C30837OooO00o(id, noteId, pageId, c30837OooO00o.f110199OooO0Oo, c30837OooO00o.f110201OooO0o0, size, c30837OooO00o.f110202OooO0oO, c30837OooO00o.f110203OooO0oo, c30837OooO00o.f110195OooO, c30837OooO00o.f110204OooOO0);
        int width = size.getWidth();
        int height = size.getHeight();
        if (width <= 0 || height <= 0) {
            return C32460OooOooO.f116667OooO00o;
        }
        int iOooO0o = o000000O.OooO0o(10);
        Paint paint2 = new Paint();
        paint2.setColor(Color.parseColor("#DEFFFFFF"));
        Paint paint3 = new Paint();
        paint3.setColor(Color.parseColor("#1F000000"));
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        int i6 = (width / iOooO0o) + 1;
        int i7 = (height / iOooO0o) + 1;
        int i8 = 0;
        while (i8 < i6) {
            int i9 = i5;
            while (i9 < i7) {
                float f3 = i8 * iOooO0o;
                float f4 = i9 * iOooO0o;
                float f5 = iOooO0o;
                int i10 = i9;
                float f6 = f3 + f5;
                float f7 = f5 + f4;
                if ((i8 + i10) % 2 == 0) {
                    f = f7;
                    i2 = i8;
                    f2 = f3;
                    i3 = i10;
                    paint = paint2;
                } else {
                    f = f7;
                    i2 = i8;
                    f2 = f3;
                    i3 = i10;
                    paint = paint3;
                }
                canvas.drawRect(f2, f4, f6, f, paint);
                i9 = i3 + 1;
                i8 = i2;
            }
            i8++;
            i5 = 0;
        }
        canvas.setBitmap(null);
        C26112OooO0oo c26112OooO0ooOooOO0O = abstractC22830OooO0Oo.OooOO0O(i);
        float f8 = c26112OooO0ooOooOO0O.f89149OooO00o;
        float f9 = c26112OooO0ooOooOO0O.f89150OooO0O0;
        if (f8 <= 0.0f || f9 <= 0.0f) {
            C34406OooO00o.f123390OooO00o.OooOO0O("Invalid page size for pageIndex " + i + ": " + f8 + "x" + f9, new Object[0]);
            return C32460OooOooO.f116667OooO00o;
        }
        RectF rectF = new RectF(0.0f, 0.0f, f8, f9);
        PDFView pDFView2 = pageLayerEditor.f74871OooOoo;
        if (pDFView2 != null) {
            bitmap = bitmapCreateBitmap;
            pDFView2.Ooooo0o(bitmap, i, rectF, c30837OooO00o2.f110196OooO00o, 14);
        } else {
            bitmap = bitmapCreateBitmap;
        }
        OooO0OO oooO0OO = pageLayerEditor.f74867OooOo0o;
        if (oooO0OO == null) {
            OooOOO0.OooOOOO("viewModel");
            throw null;
        }
        OooOOO0.OooO0oO(bitmap, "bitmap");
        C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(oooO0OO), oooO0OO.f74775OooO0oO, null, new C23445OooO0oO(oooO0OO, c30837OooO00o2, bitmap, null), 2);
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0O0(PageLayerEditor pageLayerEditor, int i, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C29392OooOOOo c29392OooOOOo;
        boolean zBooleanValue;
        pageLayerEditor.getClass();
        if (abstractC32479OooO0OO instanceof C29392OooOOOo) {
            c29392OooOOOo = (C29392OooOOOo) abstractC32479OooO0OO;
            int i2 = c29392OooOOOo.f104227OooOoO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c29392OooOOOo.f104227OooOoO0 = i2 - Integer.MIN_VALUE;
            } else {
                c29392OooOOOo = new C29392OooOOOo(pageLayerEditor, abstractC32479OooO0OO);
            }
        }
        C29392OooOOOo c29392OooOOOo2 = c29392OooOOOo;
        Object objShowNonVipFeatureLimitedDialog$default = c29392OooOOOo2.f104226OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c29392OooOOOo2.f104227OooOoO0;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objShowNonVipFeatureLimitedDialog$default);
            Context context = pageLayerEditor.getContext();
            Activity activityOooO00o = context != null ? C28036OooO0O0.OooO00o(context) : null;
            MainActivity mainActivity = activityOooO00o instanceof MainActivity ? (MainActivity) activityOooO00o : null;
            if (mainActivity == null) {
                zBooleanValue = false;
                return Boolean.valueOf(zBooleanValue);
            }
            c29392OooOOOo2.f104227OooOoO0 = 1;
            objShowNonVipFeatureLimitedDialog$default = MainActivity.showNonVipFeatureLimitedDialog$default(mainActivity, i, 0, null, c29392OooOOOo2, 6, null);
            if (objShowNonVipFeatureLimitedDialog$default == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objShowNonVipFeatureLimitedDialog$default);
        }
        zBooleanValue = ((Boolean) objShowNonVipFeatureLimitedDialog$default).booleanValue();
        return Boolean.valueOf(zBooleanValue);
    }

    public final void OooO0OO(final C30837OooO00o c30837OooO00o, final boolean z) {
        if (OooOOO0.OooO0O0(c30837OooO00o.f110196OooO00o, LayerInfo.PAPER_THEME_LAYER_ID)) {
            Context context = getContext();
            OooOOO0.OooO0o(context, "getContext(...)");
            String string = getContext().getString(R.string.toast_can_not_merge_this_paper);
            OooOOO0.OooO0o(string, "getString(...)");
            C25206OooO0Oo.OooO0oO(context, string);
            return;
        }
        FragmentManager childFragmentManager = C21929Ooooo0o.OooO0Oo(this).getChildFragmentManager();
        OooOOO0.OooO0o(childFragmentManager, "getChildFragmentManager(...)");
        if (childFragmentManager.OooOooo("TipsDialogFragment") != null) {
            return;
        }
        ViewOnClickListenerC29384OooO0oO viewOnClickListenerC29384OooO0oO = new ViewOnClickListenerC29384OooO0oO();
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: o0Ooo0O0.OooO0oo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PageLayerEditor pageLayerEditor = this.f104199OooOo0o;
                PageLayerEditor.OooO00o oooO00o = pageLayerEditor.eventListener;
                if (oooO00o != null) {
                    oooO00o.OooO0O0();
                }
                com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0OO oooO0OO = pageLayerEditor.f74867OooOo0o;
                if (oooO0OO == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("viewModel");
                    throw null;
                }
                C30837OooO00o c30837OooO00o2 = c30837OooO00o;
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                StringBuilder sb = new StringBuilder("mergeOtherLayers start. anchorLayerId=");
                String str = c30837OooO00o2.f110196OooO00o;
                sb.append(str);
                sb.append(", onlyVisible=");
                boolean z2 = z;
                sb.append(z2);
                c20358OooO00o.OooO0o0(sb.toString(), new Object[0]);
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(str, "none") || kotlin.jvm.internal.OooOOO0.OooO0O0(str, LayerInfo.PAPER_THEME_LAYER_ID) || kotlin.jvm.internal.OooOOO0.OooO0O0(str, LayerInfo.UNSPECIFIED_LAYER_ID)) {
                    return;
                }
                C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(oooO0OO), oooO0OO.f74775OooO0oO, null, new C29403OooOoo0(oooO0OO, z2, str, null), 2);
            }
        };
        String string2 = getContext().getString(R.string.merge_layers);
        OooOOO0.OooO0o(string2, "getString(...)");
        String string3 = getContext().getString(R.string.alter_merge_layers);
        OooOOO0.OooO0o(string3, "getString(...)");
        new TipsDialogFragment(string2, string3, viewOnClickListenerC29384OooO0oO, onClickListener).show(childFragmentManager, "TipsDialogFragment");
    }

    public final void OooO0Oo(final C30837OooO00o c30837OooO00o) {
        C29381OooO0Oo c29381OooO0OoPutIfAbsent;
        AbstractC22830OooO0Oo abstractC22830OooO0Oo;
        PDFView pDFView = this.f74871OooOoo;
        final int iOooOOo = (pDFView == null || (abstractC22830OooO0Oo = pDFView.f69170OooOooO) == null) ? -1 : abstractC22830OooO0Oo.f69109OooO0O0.OooOOo(c30837OooO00o.f110198OooO0OO);
        if (iOooOOo == -1) {
            return;
        }
        ConcurrentHashMap<String, C29381OooO0Oo> concurrentHashMap = this.f74874OooOooo;
        String str = c30837OooO00o.f110196OooO00o;
        C29381OooO0Oo c29381OooO0Oo = concurrentHashMap.get(str);
        if (c29381OooO0Oo == null && (c29381OooO0OoPutIfAbsent = concurrentHashMap.putIfAbsent(str, (c29381OooO0Oo = new C29381OooO0Oo()))) != null) {
            c29381OooO0Oo = c29381OooO0OoPutIfAbsent;
        }
        c29381OooO0Oo.OooO00o(str, new Runnable() { // from class: o0Ooo0O0.OooO
            @Override // java.lang.Runnable
            public final void run() {
                PageLayerEditor pageLayerEditor = this.f104174OooOo0o;
                androidx.lifecycle.OooOo oooOo = pageLayerEditor.f74866OooOo;
                if (oooOo == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("viewScope");
                    throw null;
                }
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(oooOo, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C29391OooOOOO(pageLayerEditor, iOooOOo, c30837OooO00o, null), 2);
            }
        });
    }

    public final OooO00o getEventListener() {
        return this.eventListener;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Context context = getContext();
        OooOOO0.OooO0o(context, "getContext(...)");
        this.f74872OooOoo0 = new C29632OooO0OO(context, this.f74875Oooo0);
        C29375OooO00o c29375OooO00o = new C29375OooO00o();
        this.f74868OooOoO = c29375OooO00o;
        c29375OooO00o.f104160OooO0O0 = this.f74878Oooo00o;
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_layer);
        this.f74869OooOoO0 = recyclerView;
        if (recyclerView == null) {
            OooOOO0.OooOOOO("recyclerView");
            throw null;
        }
        recyclerView.setItemAnimator(null);
        RecyclerView recyclerView2 = this.f74869OooOoO0;
        if (recyclerView2 == null) {
            OooOOO0.OooOOOO("recyclerView");
            throw null;
        }
        C29375OooO00o c29375OooO00o2 = this.f74868OooOoO;
        if (c29375OooO00o2 == null) {
            OooOOO0.OooOOOO("adapter");
            throw null;
        }
        recyclerView2.setAdapter(c29375OooO00o2);
        C29379OooO0O0 c29379OooO0O0 = new C29379OooO0O0();
        c29379OooO0O0.f104178OooO0o = this.f74880Oooo0OO;
        c29379OooO0O0.f104179OooO0o0 = this.f74879Oooo0O0;
        C22041OooOOo c22041OooOOo = new C22041OooOOo(c29379OooO0O0);
        RecyclerView recyclerView3 = this.f74869OooOoO0;
        if (recyclerView3 == null) {
            OooOOO0.OooOOOO("recyclerView");
            throw null;
        }
        c22041OooOOo.OooO0o(recyclerView3);
        View viewFindViewById = findViewById(R.id.iv_close);
        this.f74870OooOoOO = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new ViewOnClickListenerC26054OoooOoo(this, 3));
        } else {
            OooOOO0.OooOOOO("btnClose");
            throw null;
        }
    }

    public final void setEventListener(OooO00o oooO00o) {
        this.eventListener = oooO00o;
    }

    public final void setPageIndex(int pageIndex) {
        AbstractC22830OooO0Oo abstractC22830OooO0Oo;
        PDFView pDFView = this.f74871OooOoo;
        String strOooOOo0 = (pDFView == null || (abstractC22830OooO0Oo = pDFView.f69170OooOooO) == null) ? null : abstractC22830OooO0Oo.f69109OooO0O0.OooOOo0(pageIndex);
        if (strOooOOo0 == null) {
            return;
        }
        OooO0OO oooO0OO = this.f74867OooOo0o;
        if (oooO0OO == null) {
            OooOOO0.OooOOOO("viewModel");
            throw null;
        }
        C33781o00o0O c33781o00o0O = oooO0OO.f74784OooOOo;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, strOooOOo0);
    }

    public final void setPdfView(PDFView pdfView) {
        this.f74871OooOoo = pdfView;
        C29375OooO00o c29375OooO00o = this.f74868OooOoO;
        if (c29375OooO00o != null) {
            c29375OooO00o.notifyDataSetChanged();
        } else {
            OooOOO0.OooOOOO("adapter");
            throw null;
        }
    }
}
