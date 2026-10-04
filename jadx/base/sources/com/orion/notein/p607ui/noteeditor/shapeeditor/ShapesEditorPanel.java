package com.orion.notein.p607ui.noteeditor.shapeeditor;

import OooOOOo.C20454OooO0oo;
import OooOoOO.C20519OooO0Oo;
import Oooo0.o000000O;
import android.content.ClipData;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.core.os.PersistableBundleKt;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.DragConstants;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.shapeeditor.AnchorAssistLinePaintingDelegate;
import com.orion.notein.p607ui.noteeditor.shapeeditor.ShapesEditorPanel;
import com.orion.notein.ui.noteeditor.shapeeditor.ShapesEditorPanel.OooO0O0;
import com.orion.penkit.models.LassoParams;
import com.orion.penkit.models.ShapeInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o000oooo.C24761OooO;
import o00o0o0o.C25446OooO0Oo;
import o0O0oOOO.C26120OooO0Oo;
import o0O0oOOO.C26121OooO0o0;
import o0OOOoo0.C27216OooO0Oo;
import o0OoO0oo.C28957o00oOo0O;
import o0OoO0oo.InterfaceC28684OooO;
import o0o000O0.C29746OooOOo;
import o0o000O0.OooO0o;
import o0o000O0.ViewOnTouchListenerC29744OooOO0o;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u00016J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0011\u001a\u00020\f8\u0002@\u0002X\u0083.¢\u0006\f\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010!\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010'\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\bR\u001b\u0010-\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u00102\u001a\u00020.8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b/\u00100\u0012\u0004\b1\u0010\u0010R\u001e\u00103\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b3\u00104\u0012\u0004\b5\u0010\u0010¨\u00069²\u0006\f\u00108\u001a\u0002078\nX\u008a\u0084\u0002"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/shapeeditor/ShapesEditorPanel;", "Landroid/widget/FrameLayout;", "Lo0o000O0/OooO0o;", "Lo0OoO0oo/OooO;", "", "enabled", "LoO00ooO/OooOooO;", "setColorInversion", "(Z)V", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "Landroid/widget/ImageView;", "OooOo0o", "Landroid/widget/ImageView;", "getLasso$annotations", "()V", "lasso", "", "Oooo00o", "F", "getScaleFactor", "()F", "setScaleFactor", "(F)V", "scaleFactor", "Lcom/orion/notein/ui/noteeditor/shapeeditor/ShapesEditorPanel$OooO00o;", "Oooo0", "Lcom/orion/notein/ui/noteeditor/shapeeditor/ShapesEditorPanel$OooO00o;", "getEventListener", "()Lcom/orion/notein/ui/noteeditor/shapeeditor/ShapesEditorPanel$OooO00o;", "setEventListener", "(Lcom/orion/notein/ui/noteeditor/shapeeditor/ShapesEditorPanel$OooO00o;)V", "eventListener", "Oooo0O0", "Z", "getPenWidthScale", "()Z", "setPenWidthScale", "penWidthScale", "Lcom/orion/notein/ui/noteeditor/shapeeditor/AnchorAssistLinePaintingDelegate;", "Oooo0oO", "LoO00ooO/OooOO0;", "getMAnchorAssistLinePaintingDelegate", "()Lcom/orion/notein/ui/noteeditor/shapeeditor/AnchorAssistLinePaintingDelegate;", "mAnchorAssistLinePaintingDelegate", "Landroid/view/View$OnTouchListener;", "OoooO00", "Landroid/view/View$OnTouchListener;", "getTouchListener$annotations", "touchListener", "lassoBitmap", "Landroid/graphics/Bitmap;", "getLassoBitmap$annotations", "OooO00o", "Landroid/graphics/RectF;", "singleShapeRect", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class ShapesEditorPanel extends FrameLayout implements OooO0o, InterfaceC28684OooO {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public static final /* synthetic */ int f76301OoooO0 = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public LassoParams f76302OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name and from kotlin metadata */
    public ImageView lasso;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final RectF f76304OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String f76305OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public ShapesResizeAndRotateEditor f76306OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public AbstractShapeEditor f76307OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public ShapesAnchorEditor f76308OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final RectF f76309OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public float f76310OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public long f76311Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name and from kotlin metadata */
    public OooO00o eventListener;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final PointF f76313Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final PointF f76314Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name and from kotlin metadata */
    public float scaleFactor;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name and from kotlin metadata */
    public boolean penWidthScale;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public boolean f76317Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f76318Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public boolean f76319Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final C32447OooOOo f76320Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public boolean f76321Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final ViewOnTouchListenerC29744OooOO0o f76322OoooO00;

    public interface OooO00o {
        void OooO00o();

        void OooO0O0(LassoParams lassoParams, RectF rectF);

        void OooO0OO(ArrayList arrayList);

        void OooO0Oo();

        ArrayList OooO0o();

        default void OooO0o0() {
        }

        void OooO0oO(List list, ArrayList arrayList, String str, boolean z, LinkedHashMap linkedHashMap);

        Object OooO0oo(AbstractC32479OooO0OO abstractC32479OooO0OO);
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.shapeeditor.ShapesEditorPanel$onFinishInflate$1$1", m80623f = "ShapesEditorPanel.kt", m80624l = {651}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f76324OooOo0o;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return ShapesEditorPanel.this.new OooO0O0(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f76324OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f76324OooOo0o = 1;
                if (ShapesEditorPanel.OooO0o0(ShapesEditorPanel.this, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [o0o000O0.OooOO0o] */
    public ShapesEditorPanel(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        OooOOO0.OooO0oO(context, "context");
        this.f76305OooOoO0 = C24761OooO.OooO00o("toString(...)");
        this.f76304OooOoO = new RectF();
        this.f76309OooOooO = new RectF();
        this.f76313Oooo000 = new PointF();
        this.f76314Oooo00O = new PointF();
        this.scaleFactor = 1.0f;
        this.penWidthScale = true;
        this.f76317Oooo0OO = true;
        this.f76318Oooo0o = -1;
        this.f76320Oooo0oO = C20519OooO0Oo.OooO0OO(new oO0O000o.OooO00o() { // from class: o0o000O0.OooOO0O
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                int i = ShapesEditorPanel.f76301OoooO0;
                return new AnchorAssistLinePaintingDelegate(context, this);
            }
        });
        View.inflate(context, R.layout.layout_shape_editor_panel, this);
        setWillNotDraw(false);
        this.f76322OoooO00 = new View.OnTouchListener() { // from class: o0o000O0.OooOO0o
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int i = ShapesEditorPanel.f76301OoooO0;
                float x = motionEvent.getX();
                ShapesEditorPanel shapesEditorPanel = this.f105471OooOo0o;
                ImageView imageView = shapesEditorPanel.lasso;
                if (imageView == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("lasso");
                    throw null;
                }
                float x2 = imageView.getX() + x;
                float y = motionEvent.getY();
                ImageView imageView2 = shapesEditorPanel.lasso;
                if (imageView2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("lasso");
                    throw null;
                }
                float y2 = imageView2.getY() + y;
                int action = motionEvent.getAction();
                PointF pointF = shapesEditorPanel.f76313Oooo000;
                if (action == 0) {
                    LassoParams lassoParams = shapesEditorPanel.f76302OooOo;
                    List<PointF> polygonBorder = lassoParams != null ? lassoParams.getPolygonBorder() : null;
                    if (polygonBorder != null && !C25446OooO0Oo.OooO0oO(new PointF(x2, y2), polygonBorder)) {
                        shapesEditorPanel.OooO0oO(true);
                        return true;
                    }
                    shapesEditorPanel.requestDisallowInterceptTouchEvent(true);
                    pointF.set(new PointF(x2, y2));
                    ShapesEditorPanel.OooO00o oooO00o = shapesEditorPanel.eventListener;
                    if (oooO00o != null) {
                        oooO00o.OooO00o();
                    }
                } else {
                    if (action == 1) {
                        shapesEditorPanel.onFinish();
                        shapesEditorPanel.requestDisallowInterceptTouchEvent(false);
                        shapesEditorPanel.OooO0oo();
                        return true;
                    }
                    if (action == 2) {
                        PointF pointF2 = shapesEditorPanel.f76314Oooo00O;
                        pointF2.set(new PointF(x2, y2));
                        float f = pointF2.x - pointF.x;
                        float f2 = pointF2.y - pointF.y;
                        if (view.getId() == R.id.lasso) {
                            shapesEditorPanel.onMove((int) f, (int) f2);
                            return true;
                        }
                    }
                }
                return true;
            }
        };
    }

    public static void OooO(ShapesEditorPanel shapesEditorPanel, LassoParams params, float f, boolean z, boolean z2, String batchId, boolean z3, int i) {
        if ((i & 16) != 0) {
            batchId = UUID.randomUUID().toString();
        }
        boolean z4 = false;
        boolean z5 = (i & 32) == 0;
        if ((i & 64) != 0) {
            z3 = false;
        }
        shapesEditorPanel.getClass();
        OooOOO0.OooO0oO(params, "params");
        OooOOO0.OooO0oO(batchId, "batchId");
        shapesEditorPanel.f76317Oooo0OO = z2;
        shapesEditorPanel.f76302OooOo = params;
        shapesEditorPanel.f76305OooOoO0 = batchId;
        List<InterfaceC31284OooO0O0> selectedItems = params.getSelectedItems();
        ArrayList<ShapeInfo> arrayList = new ArrayList();
        for (Object obj : selectedItems) {
            if (obj instanceof ShapeInfo) {
                arrayList.add(obj);
            }
        }
        ArrayList<ShapeInfo> arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
        for (ShapeInfo shapeInfo : arrayList) {
            arrayList2.add(shapeInfo.deepCopy(shapeInfo.getId()));
        }
        shapesEditorPanel.setVisibility(0);
        ShapesAnchorEditor shapesAnchorEditor = shapesEditorPanel.f76308OooOoo0;
        if (shapesAnchorEditor == null) {
            OooOOO0.OooOOOO("anchorEditor");
            throw null;
        }
        shapesAnchorEditor.setVisibility(0);
        ShapesResizeAndRotateEditor shapesResizeAndRotateEditor = shapesEditorPanel.f76306OooOoOO;
        if (shapesResizeAndRotateEditor == null) {
            OooOOO0.OooOOOO("resizeAndRotateEditor");
            throw null;
        }
        shapesResizeAndRotateEditor.setVisibility(8);
        shapesEditorPanel.scaleFactor = f;
        shapesEditorPanel.penWidthScale = z;
        if (z5) {
            ShapesAnchorEditor shapesAnchorEditor2 = shapesEditorPanel.f76308OooOoo0;
            if (shapesAnchorEditor2 == null) {
                OooOOO0.OooOOOO("anchorEditor");
                throw null;
            }
            shapesAnchorEditor2.setLassoParams(params);
        }
        if (!arrayList2.isEmpty()) {
            InterfaceC31284OooO0O0.f111702OooO0O0.getClass();
            RectF rectF = new RectF(InterfaceC31284OooO0O0.OooO00o.OooO00o(f, arrayList2));
            rectF.left -= o000000O.OooO0o(10);
            rectF.top -= o000000O.OooO0o(10);
            rectF.right += o000000O.OooO0o(10);
            rectF.bottom += o000000O.OooO0o(10);
            for (ShapeInfo shapeInfo2 : arrayList2) {
                shapeInfo2.scale(1.0f, z);
                shapeInfo2.offset(-rectF.left, -rectF.top);
            }
            ShapesAnchorEditor shapesAnchorEditor3 = shapesEditorPanel.f76308OooOoo0;
            if (shapesAnchorEditor3 == null) {
                OooOOO0.OooOOOO("anchorEditor");
                throw null;
            }
            shapesAnchorEditor3.setColorInversion(shapesEditorPanel.f76319Oooo0o0);
            ShapesAnchorEditor shapesAnchorEditor4 = shapesEditorPanel.f76308OooOoo0;
            if (shapesAnchorEditor4 == null) {
                OooOOO0.OooOOOO("anchorEditor");
                throw null;
            }
            shapesAnchorEditor4.OooO0O0(arrayList2, rectF, f, z);
            ShapesAnchorEditor shapesAnchorEditor5 = shapesEditorPanel.f76308OooOoo0;
            if (shapesAnchorEditor5 == null) {
                OooOOO0.OooOOOO("anchorEditor");
                throw null;
            }
            shapesAnchorEditor5.setVisibility(0);
            ShapesAnchorEditor shapesAnchorEditor6 = shapesEditorPanel.f76308OooOoo0;
            if (shapesAnchorEditor6 == null) {
                OooOOO0.OooOOOO("anchorEditor");
                throw null;
            }
            shapesAnchorEditor6.OooO0OO(rectF.left, rectF.top);
            ShapesResizeAndRotateEditor shapesResizeAndRotateEditor2 = shapesEditorPanel.f76306OooOoOO;
            if (shapesResizeAndRotateEditor2 == null) {
                OooOOO0.OooOOOO("resizeAndRotateEditor");
                throw null;
            }
            shapesResizeAndRotateEditor2.setColorInversion(shapesEditorPanel.f76319Oooo0o0);
            ShapesResizeAndRotateEditor shapesResizeAndRotateEditor3 = shapesEditorPanel.f76306OooOoOO;
            if (shapesResizeAndRotateEditor3 == null) {
                OooOOO0.OooOOOO("resizeAndRotateEditor");
                throw null;
            }
            shapesResizeAndRotateEditor3.OooO0O0(arrayList2, rectF, f, z);
            shapesEditorPanel.f76309OooOooO.set(rectF);
            shapesEditorPanel.f76310OooOooo = 0.0f;
        }
        shapesEditorPanel.OooO0o(1, false);
        ShapesAnchorEditor shapesAnchorEditor7 = shapesEditorPanel.f76308OooOoo0;
        if (shapesAnchorEditor7 == null) {
            OooOOO0.OooOOOO("anchorEditor");
            throw null;
        }
        if (!z3 && !z5) {
            z4 = true;
        }
        shapesAnchorEditor7.setAnchorEditMode(z4);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0o0(ShapesEditorPanel shapesEditorPanel, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o0o000O0.OooOOO0 oooOOO0;
        ClipData clipData;
        if (abstractC32479OooO0OO instanceof o0o000O0.OooOOO0) {
            oooOOO0 = (o0o000O0.OooOOO0) abstractC32479OooO0OO;
            int i = oooOOO0.f105477OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOO0.f105477OooOoOO = i - Integer.MIN_VALUE;
            } else {
                oooOOO0 = new o0o000O0.OooOOO0(shapesEditorPanel, abstractC32479OooO0OO);
            }
        }
        Object obj = oooOOO0.f105476OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooOOO0.f105477OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            Integer fragmentHostId = DragConstants.INSTANCE.getFragmentHostId(shapesEditorPanel);
            int iIntValue = fragmentHostId != null ? fragmentHostId.intValue() : 0;
            clipData = new ClipData(DragConstants.NOTEIN_DRAG_LABEL, new String[]{"application/octet-stream"}, new ClipData.Item(""));
            clipData.getDescription().setExtras(PersistableBundleKt.persistableBundleOf(new C32443OooOOO(DragConstants.NOTEIN_DRAG_DATA_TYPE, new Integer(8)), new C32443OooOOO(DragConstants.NOTEIN_DRAG_HOST_FRAGMENT_ID, new Integer(iIntValue))));
            OooO00o oooO00o = shapesEditorPanel.eventListener;
            if (oooO00o != null) {
                oooOOO0.f105474OooOo0o = shapesEditorPanel;
                oooOOO0.f105473OooOo = clipData;
                oooOOO0.f105477OooOoOO = 1;
                if (oooO00o.OooO0oo(oooOOO0) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ClipData clipData2 = oooOOO0.f105473OooOo;
            ShapesEditorPanel shapesEditorPanel2 = oooOOO0.f105474OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            clipData = clipData2;
            shapesEditorPanel = shapesEditorPanel2;
        }
        AbstractShapeEditor abstractShapeEditor = shapesEditorPanel.f76307OooOoo;
        if (abstractShapeEditor == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        C28957o00oOo0O c28957o00oOo0O = new C28957o00oOo0O(abstractShapeEditor);
        AbstractShapeEditor abstractShapeEditor2 = shapesEditorPanel.f76307OooOoo;
        if (abstractShapeEditor2 != null) {
            abstractShapeEditor2.startDragAndDrop(clipData, c28957o00oOo0O, null, 257);
            return C32460OooOooO.f116667OooO00o;
        }
        OooOOO0.OooOOOO("editor");
        throw null;
    }

    private static /* synthetic */ void getLasso$annotations() {
    }

    private static /* synthetic */ void getLassoBitmap$annotations() {
    }

    private final AnchorAssistLinePaintingDelegate getMAnchorAssistLinePaintingDelegate() {
        return (AnchorAssistLinePaintingDelegate) this.f76320Oooo0oO.getValue();
    }

    private static /* synthetic */ void getTouchListener$annotations() {
    }

    @Override // o0o000O0.OooO0o
    public final void OooO00o(float f, float f2) {
        double d = this.f76310OooOooo + f;
        double dOooO00o = oO0O00O.OooO00o.OooO00o(d / ((double) 45.0f)) * 45.0f;
        if (Math.abs(d - dOooO00o) < 6.0f) {
            d = dOooO00o;
        }
        AbstractShapeEditor abstractShapeEditor = this.f76307OooOoo;
        if (abstractShapeEditor == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        abstractShapeEditor.setRotation((float) d);
        RectF rectF = this.f76309OooOooO;
        float fWidth = ((rectF.width() - o000000O.OooO0o(20)) * f2) + o000000O.OooO0o(20);
        float fHeight = ((rectF.height() - o000000O.OooO0o(20)) * f2) + o000000O.OooO0o(20);
        AbstractShapeEditor abstractShapeEditor2 = this.f76307OooOoo;
        if (abstractShapeEditor2 == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = abstractShapeEditor2.getLayoutParams();
        if (fWidth >= 0.0f || layoutParams.width > o000000O.OooO0o(30)) {
            if (fHeight >= 0.0f || layoutParams.height > o000000O.OooO0o(30)) {
                AbstractShapeEditor abstractShapeEditor3 = this.f76307OooOoo;
                if (abstractShapeEditor3 == null) {
                    OooOOO0.OooOOOO("editor");
                    throw null;
                }
                float f3 = 2;
                abstractShapeEditor3.setTranslationX(rectF.left - ((fWidth - rectF.width()) / f3));
                AbstractShapeEditor abstractShapeEditor4 = this.f76307OooOoo;
                if (abstractShapeEditor4 == null) {
                    OooOOO0.OooOOOO("editor");
                    throw null;
                }
                abstractShapeEditor4.setTranslationY(rectF.top - ((fHeight - rectF.height()) / f3));
                layoutParams.width = oO0O00O.OooO00o.OooO0O0(fWidth);
                layoutParams.height = oO0O00O.OooO00o.OooO0O0(fHeight);
                AbstractShapeEditor abstractShapeEditor5 = this.f76307OooOoo;
                if (abstractShapeEditor5 == null) {
                    OooOOO0.OooOOOO("editor");
                    throw null;
                }
                abstractShapeEditor5.setLayoutParams(layoutParams);
                requestLayout();
            }
        }
    }

    @Override // o0o000O0.OooO0o
    public final void OooO0O0(int i, int i2) {
        AbstractShapeEditor abstractShapeEditor = this.f76307OooOoo;
        if (abstractShapeEditor == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = abstractShapeEditor.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        AbstractShapeEditor abstractShapeEditor2 = this.f76307OooOoo;
        if (abstractShapeEditor2 == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        abstractShapeEditor2.setLayoutParams(layoutParams);
        requestLayout();
    }

    @Override // o0o000O0.OooO0o
    public final Object OooO0OO(C29746OooOOo c29746OooOOo) {
        Object objOooO0oo;
        OooO00o oooO00o = this.eventListener;
        return (oooO00o == null || (objOooO0oo = oooO00o.OooO0oo(c29746OooOOo)) != EnumC32485OooO00o.f116726OooOo0o) ? C32460OooOooO.f116667OooO00o : objOooO0oo;
    }

    @Override // o0o000O0.OooO0o
    public final void OooO0Oo(ShapeInfo item) {
        OooOOO0.OooO0oO(item, "item");
        OooO00o oooO00o = this.eventListener;
        if (oooO00o != null) {
            oooO00o.OooO0o0();
        }
        getMAnchorAssistLinePaintingDelegate().OooO0Oo(item);
    }

    public final void OooO0o(int i, boolean z) {
        ImageView imageView = this.lasso;
        if (imageView == null) {
            OooOOO0.OooOOOO("lasso");
            throw null;
        }
        imageView.setVisibility(8);
        AbstractShapeEditor abstractShapeEditor = this.f76307OooOoo;
        if (abstractShapeEditor == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        float translationX = abstractShapeEditor.getTranslationX();
        AbstractShapeEditor abstractShapeEditor2 = this.f76307OooOoo;
        if (abstractShapeEditor2 == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        float translationY = abstractShapeEditor2.getTranslationY();
        this.f76318Oooo0o = i;
        if (i != 0) {
            ShapesAnchorEditor shapesAnchorEditor = this.f76308OooOoo0;
            if (shapesAnchorEditor == null) {
                OooOOO0.OooOOOO("anchorEditor");
                throw null;
            }
            this.f76307OooOoo = shapesAnchorEditor;
            shapesAnchorEditor.OooO00o(translationX, translationY);
            if (z) {
                ShapesAnchorEditor shapesAnchorEditor2 = this.f76308OooOoo0;
                if (shapesAnchorEditor2 == null) {
                    OooOOO0.OooOOOO("anchorEditor");
                    throw null;
                }
                shapesAnchorEditor2.setAnchorEditMode(true);
                ShapesAnchorEditor shapesAnchorEditor3 = this.f76308OooOoo0;
                if (shapesAnchorEditor3 == null) {
                    OooOOO0.OooOOOO("anchorEditor");
                    throw null;
                }
                shapesAnchorEditor3.setLassoParams(null);
            }
            AbstractShapeEditor abstractShapeEditor3 = this.f76307OooOoo;
            if (abstractShapeEditor3 == null) {
                OooOOO0.OooOOOO("editor");
                throw null;
            }
            abstractShapeEditor3.setTranslationX(0.0f);
            AbstractShapeEditor abstractShapeEditor4 = this.f76307OooOoo;
            if (abstractShapeEditor4 == null) {
                OooOOO0.OooOOOO("editor");
                throw null;
            }
            abstractShapeEditor4.setTranslationY(0.0f);
            AbstractShapeEditor abstractShapeEditor5 = this.f76307OooOoo;
            if (abstractShapeEditor5 == null) {
                OooOOO0.OooOOOO("editor");
                throw null;
            }
            abstractShapeEditor5.getLayoutParams().width = -1;
            AbstractShapeEditor abstractShapeEditor6 = this.f76307OooOoo;
            if (abstractShapeEditor6 != null) {
                abstractShapeEditor6.getLayoutParams().height = -1;
                return;
            } else {
                OooOOO0.OooOOOO("editor");
                throw null;
            }
        }
        LassoParams lassoParams = this.f76302OooOo;
        OooOOO0.OooO0Oo(lassoParams);
        List<InterfaceC31284OooO0O0> selectedItems = lassoParams.getSelectedItems();
        ArrayList<ShapeInfo> arrayList = new ArrayList();
        for (Object obj : selectedItems) {
            if (obj instanceof ShapeInfo) {
                arrayList.add(obj);
            }
        }
        ShapesAnchorEditor shapesAnchorEditor4 = this.f76308OooOoo0;
        if (shapesAnchorEditor4 == null) {
            OooOOO0.OooOOOO("anchorEditor");
            throw null;
        }
        shapesAnchorEditor4.setVisibility(8);
        ShapesResizeAndRotateEditor shapesResizeAndRotateEditor = this.f76306OooOoOO;
        if (shapesResizeAndRotateEditor == null) {
            OooOOO0.OooOOOO("resizeAndRotateEditor");
            throw null;
        }
        this.f76307OooOoo = shapesResizeAndRotateEditor;
        InterfaceC31284OooO0O0.OooO00o oooO00o = InterfaceC31284OooO0O0.f111702OooO0O0;
        float f = this.scaleFactor;
        oooO00o.getClass();
        RectF rectF = new RectF(InterfaceC31284OooO0O0.OooO00o.OooO00o(f, arrayList));
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
        for (ShapeInfo shapeInfo : arrayList) {
            ShapeInfo shapeInfoDeepCopy = shapeInfo.deepCopy(shapeInfo.getId());
            shapeInfoDeepCopy.offset(-rectF.left, -rectF.top);
            arrayList2.add(shapeInfoDeepCopy);
        }
        rectF.left -= o000000O.OooO0o(10);
        rectF.top -= o000000O.OooO0o(10);
        rectF.right += o000000O.OooO0o(10);
        rectF.bottom += o000000O.OooO0o(10);
        AbstractShapeEditor abstractShapeEditor7 = this.f76307OooOoo;
        if (abstractShapeEditor7 == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        abstractShapeEditor7.OooO0O0(arrayList2, rectF, this.scaleFactor, this.penWidthScale);
        AbstractShapeEditor abstractShapeEditor8 = this.f76307OooOoo;
        if (abstractShapeEditor8 == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        abstractShapeEditor8.setVisibility(0);
        AbstractShapeEditor abstractShapeEditor9 = this.f76307OooOoo;
        if (abstractShapeEditor9 == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        abstractShapeEditor9.OooO0OO(rectF.left, rectF.top);
        AbstractShapeEditor abstractShapeEditor10 = this.f76307OooOoo;
        if (abstractShapeEditor10 == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        abstractShapeEditor10.OooO00o(translationX, translationY);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x030a  */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v0, types: [oOo000Oo.OooOoO] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.orion.notein.ui.noteeditor.shapeeditor.ShapesEditorPanel$OooO00o] */
    /* JADX WARN: Type inference failed for: r8v13, types: [com.orion.notein.ui.noteeditor.shapeeditor.ShapesEditorPanel$OooO00o] */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.orion.notein.ui.noteeditor.shapeeditor.ShapesEditorPanel$OooO00o] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.List] */
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
    public final void OooO0oO(boolean z) {
        String str;
        LassoParams lassoParams;
        ?? arrayList;
        LassoParams lassoParams2;
        int i;
        List<InterfaceC31284OooO0O0> selectedItems;
        if (getVisibility() == 0) {
            OooO00o oooO00o = this.eventListener;
            if (oooO00o != null) {
                oooO00o.OooO0Oo();
            }
            String str2 = "resizeAndRotateEditor";
            if (z) {
                LassoParams lassoParams3 = this.f76302OooOo;
                if (lassoParams3 == null || (selectedItems = lassoParams3.getSelectedItems()) == null) {
                    arrayList = C34434OooOoO.f123453OooOo0o;
                } else {
                    arrayList = new ArrayList();
                    for (Object obj : selectedItems) {
                        if (obj instanceof ShapeInfo) {
                            arrayList.add(obj);
                        }
                    }
                }
                ?? r9 = arrayList;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (!r9.isEmpty()) {
                    AbstractShapeEditor abstractShapeEditor = this.f76307OooOoo;
                    if (abstractShapeEditor == null) {
                        OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    ShapesResizeAndRotateEditor shapesResizeAndRotateEditor = this.f76306OooOoOO;
                    if (shapesResizeAndRotateEditor == null) {
                        OooOOO0.OooOOOO("resizeAndRotateEditor");
                        throw null;
                    }
                    if (abstractShapeEditor.equals(shapesResizeAndRotateEditor)) {
                        C34406OooO00o.f123390OooO00o.OooO00o("editor is resizeAndRotateEditor", new Object[0]);
                        AbstractShapeEditor abstractShapeEditor2 = this.f76307OooOoo;
                        if (abstractShapeEditor2 == null) {
                            OooOOO0.OooOOOO("editor");
                            throw null;
                        }
                        float left = abstractShapeEditor2.getLeft();
                        AbstractShapeEditor abstractShapeEditor3 = this.f76307OooOoo;
                        if (abstractShapeEditor3 == null) {
                            OooOOO0.OooOOOO("editor");
                            throw null;
                        }
                        float translationX = abstractShapeEditor3.getTranslationX() + left + o000000O.OooO0o(10);
                        AbstractShapeEditor abstractShapeEditor4 = this.f76307OooOoo;
                        if (abstractShapeEditor4 == null) {
                            OooOOO0.OooOOOO("editor");
                            throw null;
                        }
                        float top = abstractShapeEditor4.getTop();
                        lassoParams2 = null;
                        AbstractShapeEditor abstractShapeEditor5 = this.f76307OooOoo;
                        if (abstractShapeEditor5 == null) {
                            OooOOO0.OooOOOO("editor");
                            throw null;
                        }
                        float translationY = abstractShapeEditor5.getTranslationY() + top + o000000O.OooO0o(10);
                        AbstractShapeEditor abstractShapeEditor6 = this.f76307OooOoo;
                        if (abstractShapeEditor6 == null) {
                            OooOOO0.OooOOOO("editor");
                            throw null;
                        }
                        float right = abstractShapeEditor6.getRight();
                        AbstractShapeEditor abstractShapeEditor7 = this.f76307OooOoo;
                        if (abstractShapeEditor7 == null) {
                            OooOOO0.OooOOOO("editor");
                            throw null;
                        }
                        float translationX2 = (abstractShapeEditor7.getTranslationX() + right) - o000000O.OooO0o(10);
                        AbstractShapeEditor abstractShapeEditor8 = this.f76307OooOoo;
                        if (abstractShapeEditor8 == null) {
                            OooOOO0.OooOOOO("editor");
                            throw null;
                        }
                        float bottom = abstractShapeEditor8.getBottom();
                        AbstractShapeEditor abstractShapeEditor9 = this.f76307OooOoo;
                        if (abstractShapeEditor9 == null) {
                            OooOOO0.OooOOOO("editor");
                            throw null;
                        }
                        RectF rectF = new RectF(translationX, translationY, translationX2, (abstractShapeEditor9.getTranslationY() + bottom) - o000000O.OooO0o(10));
                        InterfaceC31284OooO0O0.OooO00o oooO00o2 = InterfaceC31284OooO0O0.f111702OooO0O0;
                        float f = this.scaleFactor;
                        oooO00o2.getClass();
                        RectF rectFOooO00o = InterfaceC31284OooO0O0.OooO00o.OooO00o(f, r9);
                        OooOOO0.OooO0Oo(rectFOooO00o);
                        float fMax = Math.max(rectF.width() / rectFOooO00o.width(), rectF.height() / rectFOooO00o.height());
                        AbstractShapeEditor abstractShapeEditor10 = this.f76307OooOoo;
                        if (abstractShapeEditor10 == null) {
                            OooOOO0.OooOOOO("editor");
                            throw null;
                        }
                        float rotation = abstractShapeEditor10.getRotation();
                        RectF rectF2 = new RectF(InterfaceC31284OooO0O0.OooO00o.OooO00o(this.scaleFactor, r9));
                        float f2 = 2;
                        PointF pointF = new PointF((rectF.left + rectF.right) / f2, (rectF.top + rectF.bottom) / f2);
                        Iterable<ShapeInfo> iterable = (Iterable) r9;
                        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
                        for (ShapeInfo shapeInfo : iterable) {
                            String string = UUID.randomUUID().toString();
                            OooOOO0.OooO0o(string, "toString(...)");
                            ShapeInfo shapeInfoDeepCopy = shapeInfo.deepCopy(string);
                            shapeInfoDeepCopy.offset(-rectF2.left, -rectF2.top);
                            shapeInfoDeepCopy.scale(fMax, false);
                            shapeInfoDeepCopy.offset(rectF.left, rectF.top);
                            shapeInfoDeepCopy.rotate(rotation, pointF);
                            linkedHashMap.put(shapeInfo.getId(), shapeInfoDeepCopy.getId());
                            arrayList2.add(shapeInfoDeepCopy);
                            str2 = str2;
                        }
                        str = str2;
                        ?? r8 = this.eventListener;
                        if (r8 != 0) {
                            r8.OooO0oO(r9, arrayList2, this.f76305OooOoO0, this.f76318Oooo0o == -1, linkedHashMap);
                        }
                    } else {
                        str = "resizeAndRotateEditor";
                        lassoParams2 = null;
                        AbstractShapeEditor abstractShapeEditor11 = this.f76307OooOoo;
                        if (abstractShapeEditor11 == null) {
                            OooOOO0.OooOOOO("editor");
                            throw null;
                        }
                        ShapesAnchorEditor shapesAnchorEditor = this.f76308OooOoo0;
                        if (shapesAnchorEditor == null) {
                            OooOOO0.OooOOOO("anchorEditor");
                            throw null;
                        }
                        if (abstractShapeEditor11.equals(shapesAnchorEditor) && (i = this.f76318Oooo0o) == 1) {
                            C34406OooO00o.f123390OooO00o.OooO00o(C21532OooOOo.OooO0OO(i, "editor is anchorEditor, editType = "), new Object[0]);
                            AbstractShapeEditor abstractShapeEditor12 = this.f76307OooOoo;
                            if (abstractShapeEditor12 == null) {
                                OooOOO0.OooOOOO("editor");
                                throw null;
                            }
                            List<ShapeInfo> items = abstractShapeEditor12.getItems();
                            ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(items, 10));
                            for (ShapeInfo shapeInfo2 : items) {
                                ShapeInfo shapeInfoCopy$default = ShapeInfo.copy$default(shapeInfo2, C24761OooO.OooO00o("toString(...)"), 0, 0.0f, null, 0, 0, null, 0L, 0, false, 0, false, StyleIdentifier.USER, null);
                                linkedHashMap.put(shapeInfo2.getId(), shapeInfoCopy$default.getId());
                                arrayList3.add(shapeInfoCopy$default);
                            }
                            ?? r82 = this.eventListener;
                            if (r82 != 0) {
                                r82.OooO0oO(r9, arrayList3, this.f76305OooOoO0, false, linkedHashMap);
                            }
                        } else {
                            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o.OooO00o("editor is null", new Object[0]);
                            InterfaceC31284OooO0O0.f111702OooO0O0.getClass();
                            RectF rectFOooO00o2 = InterfaceC31284OooO0O0.OooO00o.OooO00o(1.0f, r9);
                            OooOOO0.OooO0Oo(rectFOooO00o2);
                            c20358OooO00o.OooO00o("bounds: " + rectFOooO00o2 + ", zoomedBounds: " + new RectF(InterfaceC31284OooO0O0.OooO00o.OooO00o(this.scaleFactor, r9)), new Object[0]);
                            float f3 = (float) 2;
                            new PointF((rectFOooO00o2.left + rectFOooO00o2.right) / f3, (rectFOooO00o2.top + rectFOooO00o2.bottom) / f3);
                            Iterable<ShapeInfo> iterable2 = (Iterable) r9;
                            ArrayList arrayList4 = new ArrayList(C34428OooOOo.OooOOoo(iterable2, 10));
                            for (ShapeInfo shapeInfo3 : iterable2) {
                                String string2 = UUID.randomUUID().toString();
                                OooOOO0.OooO0o(string2, "toString(...)");
                                ShapeInfo shapeInfoDeepCopy2 = shapeInfo3.deepCopy(string2);
                                linkedHashMap.put(shapeInfo3.getId(), shapeInfoDeepCopy2.getId());
                                arrayList4.add(shapeInfoDeepCopy2);
                            }
                            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                            InterfaceC31284OooO0O0.OooO00o oooO00o3 = InterfaceC31284OooO0O0.f111702OooO0O0;
                            float f4 = this.scaleFactor;
                            oooO00o3.getClass();
                            c20358OooO00o2.OooO00o("newItems bounds: " + InterfaceC31284OooO0O0.OooO00o.OooO00o(f4, r9), new Object[0]);
                            ?? r83 = this.eventListener;
                            if (r83 != 0) {
                                r83.OooO0oO(r9, arrayList4, this.f76305OooOoO0, false, linkedHashMap);
                            }
                        }
                    }
                    lassoParams = lassoParams2;
                }
            } else {
                str = "resizeAndRotateEditor";
                lassoParams = null;
            }
            this.f76302OooOo = lassoParams;
            ShapesAnchorEditor shapesAnchorEditor2 = this.f76308OooOoo0;
            if (shapesAnchorEditor2 == null) {
                ?? r16 = lassoParams;
                OooOOO0.OooOOOO("anchorEditor");
                throw r16;
            }
            shapesAnchorEditor2.setLassoParams(lassoParams);
            ShapesAnchorEditor shapesAnchorEditor3 = this.f76308OooOoo0;
            if (shapesAnchorEditor3 == null) {
                OooOOO0.OooOOOO("anchorEditor");
                throw null;
            }
            shapesAnchorEditor3.setAnchorEditMode(false);
            if (this.f76308OooOoo0 == null) {
                OooOOO0.OooOOOO("anchorEditor");
                throw null;
            }
            ShapesResizeAndRotateEditor shapesResizeAndRotateEditor2 = this.f76306OooOoOO;
            if (shapesResizeAndRotateEditor2 == null) {
                OooOOO0.OooOOOO(str);
                throw null;
            }
            shapesResizeAndRotateEditor2.OooO0o0();
            ShapesAnchorEditor shapesAnchorEditor4 = this.f76308OooOoo0;
            if (shapesAnchorEditor4 == null) {
                OooOOO0.OooOOOO("anchorEditor");
                throw null;
            }
            this.f76307OooOoo = shapesAnchorEditor4;
            setVisibility(8);
            this.f76318Oooo0o = -1;
        }
    }

    public final void OooO0oo() {
        List<ShapeInfo> items;
        ShapeInfo shapeInfo;
        RectF border;
        List<PointF> polygonBorder;
        LassoParams lassoParams = this.f76302OooOo;
        if (lassoParams == null) {
            return;
        }
        AbstractShapeEditor abstractShapeEditor = this.f76307OooOoo;
        ArrayList arrayList = null;
        if (abstractShapeEditor == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        boolean z = abstractShapeEditor instanceof ShapesAnchorEditor;
        ShapesAnchorEditor shapesAnchorEditor = z ? (ShapesAnchorEditor) abstractShapeEditor : null;
        if (shapesAnchorEditor == null || !shapesAnchorEditor.f76291Oooo00o) {
            ShapesAnchorEditor shapesAnchorEditor2 = z ? (ShapesAnchorEditor) abstractShapeEditor : null;
            if (shapesAnchorEditor2 == null || (items = shapesAnchorEditor2.getItems()) == null || (shapeInfo = (ShapeInfo) OooOo.Oooo(items)) == null) {
                return;
            }
            AbstractShapeEditor abstractShapeEditor2 = this.f76307OooOoo;
            if (abstractShapeEditor2 == null) {
                OooOOO0.OooOOOO("editor");
                throw null;
            }
            ShapesAnchorEditor shapesAnchorEditor3 = abstractShapeEditor2 instanceof ShapesAnchorEditor ? (ShapesAnchorEditor) abstractShapeEditor2 : null;
            LassoParams lassoParams2 = shapesAnchorEditor3 != null ? shapesAnchorEditor3.getLassoParams() : null;
            C32447OooOOo c32447OooOOoOooO0OO = C20519OooO0Oo.OooO0OO(new C27216OooO0Oo(shapeInfo, 2));
            if ((lassoParams2 != null ? lassoParams2.getPolygonBorder() : null) != null) {
                List<PointF> polygonBorder2 = lassoParams2.getPolygonBorder();
                border = polygonBorder2 != null ? C25446OooO0Oo.OooO0OO(polygonBorder2) : null;
                OooOOO0.OooO0Oo(border);
            } else {
                border = (lassoParams2 != null ? lassoParams2.getBorder() : null) != null ? lassoParams2.getBorder() : (RectF) c32447OooOOoOooO0OO.getValue();
            }
            List<InterfaceC31284OooO0O0> selectedItems = lassoParams.getSelectedItems();
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(selectedItems, 10));
            for (InterfaceC31284OooO0O0 interfaceC31284OooO0O0 : selectedItems) {
                arrayList2.add(interfaceC31284OooO0O0.deepCopy(interfaceC31284OooO0O0.getId()));
            }
            if (lassoParams2 != null && (polygonBorder = lassoParams2.getPolygonBorder()) != null) {
                List<PointF> list = polygonBorder;
                arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                for (PointF pointF : list) {
                    arrayList.add(new PointF(pointF.x, pointF.y));
                }
            }
            LassoParams lassoParamsCopy = lassoParams.copy(arrayList2, border, arrayList);
            border.width();
            this.f76309OooOooO.width();
            OooO00o oooO00o = this.eventListener;
            if (oooO00o != null) {
                oooO00o.OooO0O0(lassoParamsCopy, border);
            }
        }
    }

    @Override // o0OoO0oo.InterfaceC28684OooO
    public Bitmap getBitmap() {
        List<InterfaceC31284OooO0O0> selectedItems;
        LassoParams lassoParams = this.f76302OooOo;
        if (lassoParams == null || (selectedItems = lassoParams.getSelectedItems()) == null) {
            return null;
        }
        ArrayList<ShapeInfo> arrayList = new ArrayList();
        for (Object obj : selectedItems) {
            if (obj instanceof ShapeInfo) {
                arrayList.add(obj);
            }
        }
        ArrayList<ShapeInfo> arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
        for (ShapeInfo shapeInfo : arrayList) {
            arrayList2.add(shapeInfo.deepCopy(shapeInfo.getId()));
        }
        InterfaceC31284OooO0O0.OooO00o oooO00o = InterfaceC31284OooO0O0.f111702OooO0O0;
        float f = this.scaleFactor;
        oooO00o.getClass();
        RectF rectF = new RectF(InterfaceC31284OooO0O0.OooO00o.OooO00o(f, arrayList2));
        int iCeil = (int) Math.ceil(rectF.width());
        if (iCeil == 0) {
            iCeil = 1;
        }
        int iCeil2 = (int) Math.ceil(rectF.height());
        if (iCeil2 == 0) {
            iCeil2 = 1;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iCeil, iCeil2, Bitmap.Config.ARGB_8888);
        OooOOO0.OooO0o(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        C26121OooO0o0 c26121OooO0o0 = new C26121OooO0o0(canvas, getContext());
        c26121OooO0o0.f89176OooO0Oo = true;
        C26120OooO0Oo c26120OooO0Oo = new C26120OooO0Oo();
        c26120OooO0Oo.OooOo00(c26121OooO0o0);
        c26120OooO0Oo.OooO0oO(this.scaleFactor);
        for (ShapeInfo shapeInfo2 : arrayList2) {
            shapeInfo2.offset(-rectF.left, -rectF.top);
            if (this.penWidthScale) {
                shapeInfo2.render(c26120OooO0Oo, c26121OooO0o0, this.scaleFactor);
            } else {
                shapeInfo2.render(c26120OooO0Oo, c26121OooO0o0, 1.0f);
            }
        }
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public final OooO00o getEventListener() {
        return this.eventListener;
    }

    public final boolean getPenWidthScale() {
        return this.penWidthScale;
    }

    public final float getScaleFactor() {
        return this.scaleFactor;
    }

    @Override // o0o000O0.OooO0o
    public final void onCancel() {
        List<InterfaceC31284OooO0O0> selectedItems;
        LassoParams lassoParams = this.f76302OooOo;
        if (lassoParams == null || (selectedItems = lassoParams.getSelectedItems()) == null) {
            selectedItems = C34434OooOoO.f123453OooOo0o;
        }
        OooO00o oooO00o = this.eventListener;
        if (oooO00o != null) {
            List<InterfaceC31284OooO0O0> list = selectedItems;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC31284OooO0O0) it.next()).getId());
            }
            oooO00o.OooO0OO(arrayList);
        }
        if (this.f76308OooOoo0 == null) {
            OooOOO0.OooOOOO("anchorEditor");
            throw null;
        }
        ShapesResizeAndRotateEditor shapesResizeAndRotateEditor = this.f76306OooOoOO;
        if (shapesResizeAndRotateEditor == null) {
            OooOOO0.OooOOOO("resizeAndRotateEditor");
            throw null;
        }
        shapesResizeAndRotateEditor.OooO0o0();
        setVisibility(8);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        OooOOO0.OooO0oO(canvas, "canvas");
        super.onDraw(canvas);
        getMAnchorAssistLinePaintingDelegate().draw(canvas);
    }

    @Override // o0o000O0.OooO0o
    public final void onFinish() {
        List<PointF> polygonBorder;
        RectF rectF = this.f76309OooOooO;
        AbstractShapeEditor abstractShapeEditor = this.f76307OooOoo;
        if (abstractShapeEditor == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        float translationX = abstractShapeEditor.getTranslationX();
        AbstractShapeEditor abstractShapeEditor2 = this.f76307OooOoo;
        if (abstractShapeEditor2 == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        float translationY = abstractShapeEditor2.getTranslationY();
        AbstractShapeEditor abstractShapeEditor3 = this.f76307OooOoo;
        if (abstractShapeEditor3 == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        float translationX2 = abstractShapeEditor3.getTranslationX();
        if (this.f76307OooOoo == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        float width = translationX2 + r6.getWidth();
        AbstractShapeEditor abstractShapeEditor4 = this.f76307OooOoo;
        if (abstractShapeEditor4 == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        float translationY2 = abstractShapeEditor4.getTranslationY();
        if (this.f76307OooOoo == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        rectF.set(translationX, translationY, width, translationY2 + r7.getHeight());
        AbstractShapeEditor abstractShapeEditor5 = this.f76307OooOoo;
        if (abstractShapeEditor5 == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        this.f76310OooOooo = abstractShapeEditor5.getRotation();
        LassoParams lassoParams = this.f76302OooOo;
        RectF rectF2 = this.f76304OooOoO;
        if (lassoParams != null && (polygonBorder = lassoParams.getPolygonBorder()) != null) {
            for (PointF pointF : polygonBorder) {
                ImageView imageView = this.lasso;
                if (imageView == null) {
                    OooOOO0.OooOOOO("lasso");
                    throw null;
                }
                float translationX3 = imageView.getTranslationX() - rectF2.left;
                ImageView imageView2 = this.lasso;
                if (imageView2 == null) {
                    OooOOO0.OooOOOO("lasso");
                    throw null;
                }
                pointF.offset(translationX3, imageView2.getTranslationY() - rectF2.top);
            }
        }
        ImageView imageView3 = this.lasso;
        if (imageView3 == null) {
            OooOOO0.OooOOOO("lasso");
            throw null;
        }
        float translationX4 = imageView3.getTranslationX();
        ImageView imageView4 = this.lasso;
        if (imageView4 == null) {
            OooOOO0.OooOOOO("lasso");
            throw null;
        }
        float translationY3 = imageView4.getTranslationY();
        ImageView imageView5 = this.lasso;
        if (imageView5 == null) {
            OooOOO0.OooOOOO("lasso");
            throw null;
        }
        float translationX5 = imageView5.getTranslationX();
        if (this.lasso == null) {
            OooOOO0.OooOOOO("lasso");
            throw null;
        }
        float width2 = translationX5 + r6.getWidth();
        ImageView imageView6 = this.lasso;
        if (imageView6 == null) {
            OooOOO0.OooOOOO("lasso");
            throw null;
        }
        float translationY4 = imageView6.getTranslationY();
        if (this.lasso == null) {
            OooOOO0.OooOOOO("lasso");
            throw null;
        }
        rectF2.set(translationX4, translationY3, width2, translationY4 + r7.getHeight());
        getMAnchorAssistLinePaintingDelegate().OooO0o0();
        OooO0oo();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        ShapesResizeAndRotateEditor shapesResizeAndRotateEditor = (ShapesResizeAndRotateEditor) findViewById(R.id.shape_rar_editor);
        this.f76306OooOoOO = shapesResizeAndRotateEditor;
        if (shapesResizeAndRotateEditor == null) {
            OooOOO0.OooOOOO("resizeAndRotateEditor");
            throw null;
        }
        shapesResizeAndRotateEditor.setEventListener(this);
        ShapesResizeAndRotateEditor shapesResizeAndRotateEditor2 = this.f76306OooOoOO;
        if (shapesResizeAndRotateEditor2 == null) {
            OooOOO0.OooOOOO("resizeAndRotateEditor");
            throw null;
        }
        shapesResizeAndRotateEditor2.setColorInversion(this.f76319Oooo0o0);
        ShapesAnchorEditor shapesAnchorEditor = (ShapesAnchorEditor) findViewById(R.id.shape_anchor_editor);
        this.f76308OooOoo0 = shapesAnchorEditor;
        if (shapesAnchorEditor == null) {
            OooOOO0.OooOOOO("anchorEditor");
            throw null;
        }
        shapesAnchorEditor.setEventListener(this);
        ShapesAnchorEditor shapesAnchorEditor2 = this.f76308OooOoo0;
        if (shapesAnchorEditor2 == null) {
            OooOOO0.OooOOOO("anchorEditor");
            throw null;
        }
        shapesAnchorEditor2.setColorInversion(this.f76319Oooo0o0);
        ShapesAnchorEditor shapesAnchorEditor3 = this.f76308OooOoo0;
        if (shapesAnchorEditor3 == null) {
            OooOOO0.OooOOOO("anchorEditor");
            throw null;
        }
        this.f76307OooOoo = shapesAnchorEditor3;
        ImageView imageView = (ImageView) findViewById(R.id.lasso);
        this.lasso = imageView;
        if (imageView == null) {
            OooOOO0.OooOOOO("lasso");
            throw null;
        }
        imageView.setOnTouchListener(this.f76322OoooO00);
        ImageView imageView2 = this.lasso;
        if (imageView2 == null) {
            OooOOO0.OooOOOO("lasso");
            throw null;
        }
        imageView2.setOnLongClickListener(new View.OnLongClickListener() { // from class: o0o000O0.OooOO0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                int i = ShapesEditorPanel.f76301OoooO0;
                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, this.f105468OooO00o.new OooO0O0(null), 3);
                return true;
            }
        });
        getMAnchorAssistLinePaintingDelegate().setOnAssistLineChangeListener(new C20454OooO0oo(this));
    }

    @Override // o0o000O0.OooO0o
    public final void onMove(int i, int i2) {
        AbstractShapeEditor abstractShapeEditor = this.f76307OooOoo;
        if (abstractShapeEditor == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        RectF rectF = this.f76309OooOooO;
        float f = i;
        abstractShapeEditor.setTranslationX(rectF.left + f);
        AbstractShapeEditor abstractShapeEditor2 = this.f76307OooOoo;
        if (abstractShapeEditor2 == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        float f2 = i2;
        abstractShapeEditor2.setTranslationY(rectF.top + f2);
        ImageView imageView = this.lasso;
        if (imageView == null) {
            OooOOO0.OooOOOO("lasso");
            throw null;
        }
        RectF rectF2 = this.f76304OooOoO;
        imageView.setTranslationX(rectF2.left + f);
        ImageView imageView2 = this.lasso;
        if (imageView2 != null) {
            imageView2.setTranslationY(rectF2.top + f2);
        } else {
            OooOOO0.OooOOOO("lasso");
            throw null;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        OooOOO0.OooO0oO(event, "event");
        if (this.f76317Oooo0OO) {
            if (event.getActionMasked() == 0 && event.getToolType(0) == 2) {
                OooO0oO(true);
                return true;
            }
            int actionMasked = event.getActionMasked();
            if (actionMasked == 0) {
                this.f76321Oooo0oo = true;
                this.f76311Oooo = System.currentTimeMillis();
                return true;
            }
            if (actionMasked == 1 && this.f76321Oooo0oo) {
                this.f76321Oooo0oo = false;
                if (System.currentTimeMillis() - this.f76311Oooo < 300) {
                    OooO0oO(true);
                    return true;
                }
            }
        } else if (event.getActionMasked() == 1) {
            OooO0oO(true);
        }
        return true;
    }

    public final void setColorInversion(boolean enabled) {
        this.f76319Oooo0o0 = enabled;
        ShapesAnchorEditor shapesAnchorEditor = this.f76308OooOoo0;
        if (shapesAnchorEditor != null) {
            if (shapesAnchorEditor == null) {
                OooOOO0.OooOOOO("anchorEditor");
                throw null;
            }
            shapesAnchorEditor.setColorInversion(enabled);
            ShapesAnchorEditor shapesAnchorEditor2 = this.f76308OooOoo0;
            if (shapesAnchorEditor2 == null) {
                OooOOO0.OooOOOO("anchorEditor");
                throw null;
            }
            shapesAnchorEditor2.invalidate();
        }
        ShapesResizeAndRotateEditor shapesResizeAndRotateEditor = this.f76306OooOoOO;
        if (shapesResizeAndRotateEditor != null) {
            if (shapesResizeAndRotateEditor != null) {
                shapesResizeAndRotateEditor.setColorInversion(enabled);
            } else {
                OooOOO0.OooOOOO("resizeAndRotateEditor");
                throw null;
            }
        }
    }

    public final void setEventListener(OooO00o oooO00o) {
        this.eventListener = oooO00o;
    }

    public final void setPenWidthScale(boolean z) {
        this.penWidthScale = z;
    }

    public final void setScaleFactor(float f) {
        this.scaleFactor = f;
    }
}
