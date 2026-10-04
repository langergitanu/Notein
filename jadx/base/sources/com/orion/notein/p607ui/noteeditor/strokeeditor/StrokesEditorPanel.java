package com.orion.notein.p607ui.noteeditor.strokeeditor;

import Oooo0.o000000O;
import android.content.ClipData;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.strokeeditor.StrokesEditorPanel;
import com.orion.notein.p607ui.noteeditor.strokeeditor.StrokesResizeAndRotateEditor;
import com.orion.notein.ui.noteeditor.strokeeditor.StrokesEditorPanel.OooO0O0;
import com.orion.penkit.models.DrawRecord;
import com.orion.penkit.models.LassoParams;
import com.orion.penkit.models.PressurePoint;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0O0oOOO.C26120OooO0Oo;
import o0O0oOOO.C26121OooO0o0;
import o0OoO0oo.InterfaceC28684OooO;
import o0o000O.OooOO0;
import o0o000O.ViewOnTouchListenerC29732OooO00o;
import o0oo0Oo.AbstractC31239OooO00o;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001cJ\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/strokeeditor/StrokesEditorPanel;", "Landroid/widget/FrameLayout;", "Lcom/orion/notein/ui/noteeditor/strokeeditor/StrokesResizeAndRotateEditor$OooO00o;", "Lo0OoO0oo/OooO;", "", "enabled", "LoO00ooO/OooOooO;", "setColorInversion", "(Z)V", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "", "Oooo00O", "F", "getScaleFactor", "()F", "setScaleFactor", "(F)V", "scaleFactor", "Lcom/orion/notein/ui/noteeditor/strokeeditor/StrokesEditorPanel$OooO00o;", "Oooo00o", "Lcom/orion/notein/ui/noteeditor/strokeeditor/StrokesEditorPanel$OooO00o;", "getEventListener", "()Lcom/orion/notein/ui/noteeditor/strokeeditor/StrokesEditorPanel$OooO00o;", "setEventListener", "(Lcom/orion/notein/ui/noteeditor/strokeeditor/StrokesEditorPanel$OooO00o;)V", "eventListener", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class StrokesEditorPanel extends FrameLayout implements StrokesResizeAndRotateEditor.OooO00o, InterfaceC28684OooO {

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public static final /* synthetic */ int f76339Oooo0O0 = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public ImageView f76340OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public StrokesResizeAndRotateEditor f76341OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final RectF f76342OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public LassoParams f76343OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public float f76344OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final Handler f76345OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f76346OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final RectF f76347OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final PointF f76348OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final ViewOnTouchListenerC29732OooO00o f76349Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final PointF f76350Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name and from kotlin metadata */
    public float scaleFactor;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name and from kotlin metadata */
    public OooO00o eventListener;

    public interface OooO00o {
        void OooO00o();

        void OooO0O0(LassoParams lassoParams, RectF rectF);

        void OooO0OO(List list, float f, RectF rectF, float f2);

        Object OooO0Oo(OooOO0 oooOO02);

        void OooO0o0(ArrayList arrayList);
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.strokeeditor.StrokesEditorPanel$onFinishInflate$1$1", m80623f = "StrokesEditorPanel.kt", m80624l = {122}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f76354OooOo0o;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return StrokesEditorPanel.this.new OooO0O0(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f76354OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                StrokesResizeAndRotateEditor strokesResizeAndRotateEditor = StrokesEditorPanel.this.f76341OooOo0o;
                if (strokesResizeAndRotateEditor == null) {
                    OooOOO0.OooOOOO("editor");
                    throw null;
                }
                this.f76354OooOo0o = 1;
                if (strokesResizeAndRotateEditor.OooO0O0(this) == enumC32485OooO00o) {
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
    public StrokesEditorPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        OooOOO0.OooO0oO(context, "context");
        this.f76342OooOoO = new RectF();
        this.f76345OooOoo = new Handler(Looper.getMainLooper());
        this.f76347OooOooO = new RectF();
        this.f76348OooOooo = new PointF();
        this.f76350Oooo000 = new PointF();
        this.scaleFactor = 1.0f;
        View.inflate(context, R.layout.layout_strokes_editor_panel, this);
        this.f76349Oooo0 = new ViewOnTouchListenerC29732OooO00o(this, 0);
    }

    @Override // com.orion.notein.ui.noteeditor.strokeeditor.StrokesResizeAndRotateEditor.OooO00o
    public final void OooO00o(float f, float f2) {
        double d = this.f76344OooOoOO + f;
        double dOooO00o = oO0O00O.OooO00o.OooO00o(d / ((double) 45.0f)) * 45.0f;
        if (Math.abs(d - dOooO00o) < 6.0f) {
            d = dOooO00o;
        }
        StrokesResizeAndRotateEditor strokesResizeAndRotateEditor = this.f76341OooOo0o;
        if (strokesResizeAndRotateEditor == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        strokesResizeAndRotateEditor.setRotation((float) d);
        RectF rectF = this.f76342OooOoO;
        float fWidth = ((rectF.width() - o000000O.OooO0o(20)) * f2) + o000000O.OooO0o(20);
        float fHeight = ((rectF.height() - o000000O.OooO0o(20)) * f2) + o000000O.OooO0o(20);
        StrokesResizeAndRotateEditor strokesResizeAndRotateEditor2 = this.f76341OooOo0o;
        if (strokesResizeAndRotateEditor2 == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = strokesResizeAndRotateEditor2.getLayoutParams();
        if (fWidth >= 0.0f || layoutParams.width > o000000O.OooO0o(30)) {
            if (fHeight >= 0.0f || layoutParams.height > o000000O.OooO0o(30)) {
                StrokesResizeAndRotateEditor strokesResizeAndRotateEditor3 = this.f76341OooOo0o;
                if (strokesResizeAndRotateEditor3 == null) {
                    OooOOO0.OooOOOO("editor");
                    throw null;
                }
                float f3 = 2;
                strokesResizeAndRotateEditor3.setTranslationX(rectF.left - ((fWidth - rectF.width()) / f3));
                StrokesResizeAndRotateEditor strokesResizeAndRotateEditor4 = this.f76341OooOo0o;
                if (strokesResizeAndRotateEditor4 == null) {
                    OooOOO0.OooOOOO("editor");
                    throw null;
                }
                strokesResizeAndRotateEditor4.setTranslationY(rectF.top - ((fHeight - rectF.height()) / f3));
                layoutParams.width = oO0O00O.OooO00o.OooO0O0(fWidth);
                layoutParams.height = oO0O00O.OooO00o.OooO0O0(fHeight);
                StrokesResizeAndRotateEditor strokesResizeAndRotateEditor5 = this.f76341OooOo0o;
                if (strokesResizeAndRotateEditor5 == null) {
                    OooOOO0.OooOOOO("editor");
                    throw null;
                }
                strokesResizeAndRotateEditor5.setLayoutParams(layoutParams);
                requestLayout();
            }
        }
    }

    @Override // com.orion.notein.ui.noteeditor.strokeeditor.StrokesResizeAndRotateEditor.OooO00o
    public final void OooO0O0(int i, int i2) {
        StrokesResizeAndRotateEditor strokesResizeAndRotateEditor = this.f76341OooOo0o;
        if (strokesResizeAndRotateEditor == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = strokesResizeAndRotateEditor.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        StrokesResizeAndRotateEditor strokesResizeAndRotateEditor2 = this.f76341OooOo0o;
        if (strokesResizeAndRotateEditor2 == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        strokesResizeAndRotateEditor2.setLayoutParams(layoutParams);
        requestLayout();
    }

    @Override // com.orion.notein.ui.noteeditor.strokeeditor.StrokesResizeAndRotateEditor.OooO00o
    public final Object OooO0OO(ClipData clipData, OooOO0 oooOO02) {
        Object objOooO0Oo;
        OooO00o oooO00o = this.eventListener;
        return (oooO00o == null || (objOooO0Oo = oooO00o.OooO0Oo(oooOO02)) != EnumC32485OooO00o.f116726OooOo0o) ? C32460OooOooO.f116667OooO00o : objOooO0Oo;
    }

    public final void OooO0Oo(ArrayList arrayList, final float f, final boolean z) {
        if (arrayList.isEmpty()) {
            return;
        }
        StrokesResizeAndRotateEditor strokesResizeAndRotateEditor = this.f76341OooOo0o;
        if (strokesResizeAndRotateEditor == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        strokesResizeAndRotateEditor.setColorInversion(this.f76346OooOoo0);
        InterfaceC31284OooO0O0.f111702OooO0O0.getClass();
        RectF rectF = new RectF(InterfaceC31284OooO0O0.OooO00o.OooO00o(f, arrayList));
        rectF.left -= o000000O.OooO0o(10);
        rectF.top -= o000000O.OooO0o(10);
        rectF.right += o000000O.OooO0o(10);
        rectF.bottom += o000000O.OooO0o(10);
        StrokesResizeAndRotateEditor strokesResizeAndRotateEditor2 = this.f76341OooOo0o;
        if (strokesResizeAndRotateEditor2 == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        strokesResizeAndRotateEditor2.setTranslationX(rectF.left);
        strokesResizeAndRotateEditor2.setTranslationY(rectF.top);
        final RectF rectF2 = new RectF(InterfaceC31284OooO0O0.OooO00o.OooO00o(f, arrayList));
        Bitmap bitmapCreateBitmap = (((int) rectF2.width()) <= 0 || ((int) rectF2.height()) <= 0) ? null : Bitmap.createBitmap((int) rectF2.width(), (int) rectF2.height(), Bitmap.Config.ARGB_8888);
        strokesResizeAndRotateEditor2.bitmap = bitmapCreateBitmap;
        if (bitmapCreateBitmap != null) {
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            final C26121OooO0o0 c26121OooO0o0 = new C26121OooO0o0(canvas, strokesResizeAndRotateEditor2.getContext());
            c26121OooO0o0.f89175OooO0OO = strokesResizeAndRotateEditor2.colorInversion;
            c26121OooO0o0.f89176OooO0Oo = true;
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                DrawRecord drawRecord = (DrawRecord) it.next();
                if (drawRecord.getPenType() == 6 || drawRecord.getPenType() == 2 || drawRecord.getPenType() == 9) {
                    arrayList2.add(drawRecord);
                } else {
                    arrayList3.add(drawRecord);
                }
            }
            InterfaceC32507OooOO0o interfaceC32507OooOO0o = new InterfaceC32507OooOO0o() { // from class: o0o000O.OooO0oO
                @Override // oO0O000o.InterfaceC32507OooOO0o
                public final Object invoke(Object obj) {
                    DrawRecord record = (DrawRecord) obj;
                    int i = StrokesResizeAndRotateEditor.f76355Oooo0;
                    OooOOO0.OooO0oO(record, "record");
                    AbstractC31239OooO00o abstractC31239OooO00oCreateTool = DrawToolFactory.INSTANCE.createTool(record.getType(), record.getColor(), record.getWidth(), new Bundle(), new C26120OooO0Oo());
                    boolean z2 = z;
                    float f2 = f;
                    if (z2) {
                        abstractC31239OooO00oCreateTool.OooOO0o(f2);
                    }
                    abstractC31239OooO00oCreateTool.f111424OooOO0o = f2;
                    for (PressurePoint pressurePoint : record.getPoints()) {
                        float x = pressurePoint.getX();
                        RectF rectF3 = rectF2;
                        abstractC31239OooO00oCreateTool.OooO(x - rectF3.left, pressurePoint.getY() - rectF3.top, pressurePoint.getP(), pressurePoint.getAction(), C34434OooOoO.f123453OooOo0o);
                        if (pressurePoint.getAction() == 1) {
                            abstractC31239OooO00oCreateTool.OooOO0(c26121OooO0o0, false);
                        }
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            };
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                interfaceC32507OooOO0o.invoke((DrawRecord) it2.next());
            }
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                interfaceC32507OooOO0o.invoke((DrawRecord) it3.next());
            }
            canvas.setBitmap(null);
            ImageView imageView = strokesResizeAndRotateEditor2.f76357OooOo0o;
            if (imageView == null) {
                OooOOO0.OooOOOO("image");
                throw null;
            }
            imageView.setImageBitmap(strokesResizeAndRotateEditor2.bitmap);
            int iWidth = (int) rectF.width();
            int iHeight = (int) rectF.height();
            StrokesResizeAndRotateEditor.OooO00o oooO00o = strokesResizeAndRotateEditor2.eventListener;
            if (oooO00o != null) {
                oooO00o.OooO0O0(iWidth, iHeight);
            }
        }
        StrokesResizeAndRotateEditor strokesResizeAndRotateEditor3 = this.f76341OooOo0o;
        if (strokesResizeAndRotateEditor3 == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        float f2 = rectF.left;
        float f3 = rectF.top;
        strokesResizeAndRotateEditor3.setRotation(0.0f);
        strokesResizeAndRotateEditor3.setTranslationX(f2);
        strokesResizeAndRotateEditor3.setTranslationY(f3);
        strokesResizeAndRotateEditor3.setVisibility(0);
        strokesResizeAndRotateEditor3.requestFocus();
        this.f76342OooOoO.set(rectF);
        this.f76344OooOoOO = 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [oOo000Oo.OooOoO] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v16, types: [com.orion.notein.ui.noteeditor.strokeeditor.StrokesEditorPanel$OooO00o] */
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
    public final void OooO0o0(boolean z) {
        ?? arrayList;
        List<InterfaceC31284OooO0O0> selectedItems;
        if (getVisibility() == 0) {
            if (z) {
                LassoParams lassoParams = this.f76343OooOoO0;
                if (lassoParams == null || (selectedItems = lassoParams.getSelectedItems()) == null) {
                    arrayList = C34434OooOoO.f123453OooOo0o;
                } else {
                    arrayList = new ArrayList();
                    for (Object obj : selectedItems) {
                        if (obj instanceof DrawRecord) {
                            arrayList.add(obj);
                        }
                    }
                }
                StrokesResizeAndRotateEditor strokesResizeAndRotateEditor = this.f76341OooOo0o;
                if (strokesResizeAndRotateEditor == null) {
                    OooOOO0.OooOOOO("editor");
                    throw null;
                }
                float left = strokesResizeAndRotateEditor.getLeft();
                StrokesResizeAndRotateEditor strokesResizeAndRotateEditor2 = this.f76341OooOo0o;
                if (strokesResizeAndRotateEditor2 == null) {
                    OooOOO0.OooOOOO("editor");
                    throw null;
                }
                float translationX = strokesResizeAndRotateEditor2.getTranslationX() + left + o000000O.OooO0o(10);
                StrokesResizeAndRotateEditor strokesResizeAndRotateEditor3 = this.f76341OooOo0o;
                if (strokesResizeAndRotateEditor3 == null) {
                    OooOOO0.OooOOOO("editor");
                    throw null;
                }
                float top = strokesResizeAndRotateEditor3.getTop();
                StrokesResizeAndRotateEditor strokesResizeAndRotateEditor4 = this.f76341OooOo0o;
                if (strokesResizeAndRotateEditor4 == null) {
                    OooOOO0.OooOOOO("editor");
                    throw null;
                }
                float translationY = strokesResizeAndRotateEditor4.getTranslationY() + top + o000000O.OooO0o(10);
                StrokesResizeAndRotateEditor strokesResizeAndRotateEditor5 = this.f76341OooOo0o;
                if (strokesResizeAndRotateEditor5 == null) {
                    OooOOO0.OooOOOO("editor");
                    throw null;
                }
                float right = strokesResizeAndRotateEditor5.getRight();
                StrokesResizeAndRotateEditor strokesResizeAndRotateEditor6 = this.f76341OooOo0o;
                if (strokesResizeAndRotateEditor6 == null) {
                    OooOOO0.OooOOOO("editor");
                    throw null;
                }
                float translationX2 = (strokesResizeAndRotateEditor6.getTranslationX() + right) - o000000O.OooO0o(10);
                StrokesResizeAndRotateEditor strokesResizeAndRotateEditor7 = this.f76341OooOo0o;
                if (strokesResizeAndRotateEditor7 == null) {
                    OooOOO0.OooOOOO("editor");
                    throw null;
                }
                float bottom = strokesResizeAndRotateEditor7.getBottom();
                StrokesResizeAndRotateEditor strokesResizeAndRotateEditor8 = this.f76341OooOo0o;
                if (strokesResizeAndRotateEditor8 == null) {
                    OooOOO0.OooOOOO("editor");
                    throw null;
                }
                RectF rectF = new RectF(translationX, translationY, translationX2, (strokesResizeAndRotateEditor8.getTranslationY() + bottom) - o000000O.OooO0o(10));
                InterfaceC31284OooO0O0.OooO00o oooO00o = InterfaceC31284OooO0O0.f111702OooO0O0;
                float f = this.scaleFactor;
                oooO00o.getClass();
                float fWidth = rectF.width() / new RectF(InterfaceC31284OooO0O0.OooO00o.OooO00o(f, arrayList)).width();
                StrokesResizeAndRotateEditor strokesResizeAndRotateEditor9 = this.f76341OooOo0o;
                if (strokesResizeAndRotateEditor9 == null) {
                    OooOOO0.OooOOOO("editor");
                    throw null;
                }
                float rotation = strokesResizeAndRotateEditor9.getRotation();
                ?? r5 = this.eventListener;
                if (r5 != 0) {
                    r5.OooO0OO(arrayList, fWidth, rectF, rotation);
                }
            }
            this.f76343OooOoO0 = null;
            StrokesResizeAndRotateEditor strokesResizeAndRotateEditor10 = this.f76341OooOo0o;
            if (strokesResizeAndRotateEditor10 == null) {
                OooOOO0.OooOOOO("editor");
                throw null;
            }
            strokesResizeAndRotateEditor10.OooO00o();
            setVisibility(8);
        }
    }

    @Override // o0OoO0oo.InterfaceC28684OooO
    public Bitmap getBitmap() {
        StrokesResizeAndRotateEditor strokesResizeAndRotateEditor = this.f76341OooOo0o;
        if (strokesResizeAndRotateEditor != null) {
            return strokesResizeAndRotateEditor.getBitmap();
        }
        OooOOO0.OooOOOO("editor");
        throw null;
    }

    public final OooO00o getEventListener() {
        return this.eventListener;
    }

    public final float getScaleFactor() {
        return this.scaleFactor;
    }

    @Override // com.orion.notein.ui.noteeditor.strokeeditor.StrokesResizeAndRotateEditor.OooO00o
    public final void onCancel() {
        List<InterfaceC31284OooO0O0> selectedItems;
        LassoParams lassoParams = this.f76343OooOoO0;
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
            oooO00o.OooO0o0(arrayList);
        }
        StrokesResizeAndRotateEditor strokesResizeAndRotateEditor = this.f76341OooOo0o;
        if (strokesResizeAndRotateEditor == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        strokesResizeAndRotateEditor.OooO00o();
        setVisibility(8);
    }

    @Override // com.orion.notein.ui.noteeditor.strokeeditor.StrokesResizeAndRotateEditor.OooO00o
    public final void onFinish() {
        List<PointF> polygonBorder;
        RectF rectF = this.f76342OooOoO;
        StrokesResizeAndRotateEditor strokesResizeAndRotateEditor = this.f76341OooOo0o;
        if (strokesResizeAndRotateEditor == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        float translationX = strokesResizeAndRotateEditor.getTranslationX();
        StrokesResizeAndRotateEditor strokesResizeAndRotateEditor2 = this.f76341OooOo0o;
        if (strokesResizeAndRotateEditor2 == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        float translationY = strokesResizeAndRotateEditor2.getTranslationY();
        StrokesResizeAndRotateEditor strokesResizeAndRotateEditor3 = this.f76341OooOo0o;
        if (strokesResizeAndRotateEditor3 == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        float translationX2 = strokesResizeAndRotateEditor3.getTranslationX();
        if (this.f76341OooOo0o == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        float width = translationX2 + r6.getWidth();
        StrokesResizeAndRotateEditor strokesResizeAndRotateEditor4 = this.f76341OooOo0o;
        if (strokesResizeAndRotateEditor4 == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        float translationY2 = strokesResizeAndRotateEditor4.getTranslationY();
        if (this.f76341OooOo0o == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        rectF.set(translationX, translationY, width, translationY2 + r7.getHeight());
        StrokesResizeAndRotateEditor strokesResizeAndRotateEditor5 = this.f76341OooOo0o;
        if (strokesResizeAndRotateEditor5 == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        this.f76344OooOoOO = strokesResizeAndRotateEditor5.getRotation();
        LassoParams lassoParams = this.f76343OooOoO0;
        RectF rectF2 = this.f76347OooOooO;
        if (lassoParams != null && (polygonBorder = lassoParams.getPolygonBorder()) != null) {
            for (PointF pointF : polygonBorder) {
                ImageView imageView = this.f76340OooOo;
                if (imageView == null) {
                    OooOOO0.OooOOOO("lasso");
                    throw null;
                }
                float translationX3 = imageView.getTranslationX() - rectF2.left;
                ImageView imageView2 = this.f76340OooOo;
                if (imageView2 == null) {
                    OooOOO0.OooOOOO("lasso");
                    throw null;
                }
                pointF.offset(translationX3, imageView2.getTranslationY() - rectF2.top);
            }
        }
        ImageView imageView3 = this.f76340OooOo;
        if (imageView3 == null) {
            OooOOO0.OooOOOO("lasso");
            throw null;
        }
        float translationX4 = imageView3.getTranslationX();
        ImageView imageView4 = this.f76340OooOo;
        if (imageView4 == null) {
            OooOOO0.OooOOOO("lasso");
            throw null;
        }
        float translationY3 = imageView4.getTranslationY();
        ImageView imageView5 = this.f76340OooOo;
        if (imageView5 == null) {
            OooOOO0.OooOOOO("lasso");
            throw null;
        }
        float translationX5 = imageView5.getTranslationX();
        if (this.f76340OooOo == null) {
            OooOOO0.OooOOOO("lasso");
            throw null;
        }
        float width2 = translationX5 + r6.getWidth();
        ImageView imageView6 = this.f76340OooOo;
        if (imageView6 == null) {
            OooOOO0.OooOOOO("lasso");
            throw null;
        }
        float translationY4 = imageView6.getTranslationY();
        if (this.f76340OooOo == null) {
            OooOOO0.OooOOOO("lasso");
            throw null;
        }
        rectF2.set(translationX4, translationY3, width2, translationY4 + r7.getHeight());
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        StrokesResizeAndRotateEditor strokesResizeAndRotateEditor = (StrokesResizeAndRotateEditor) findViewById(R.id.strokes_editor);
        this.f76341OooOo0o = strokesResizeAndRotateEditor;
        if (strokesResizeAndRotateEditor == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        strokesResizeAndRotateEditor.setEventListener(this);
        StrokesResizeAndRotateEditor strokesResizeAndRotateEditor2 = this.f76341OooOo0o;
        if (strokesResizeAndRotateEditor2 == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        strokesResizeAndRotateEditor2.setColorInversion(this.f76346OooOoo0);
        ImageView imageView = (ImageView) findViewById(R.id.lasso);
        this.f76340OooOo = imageView;
        if (imageView == null) {
            OooOOO0.OooOOOO("lasso");
            throw null;
        }
        imageView.setOnTouchListener(this.f76349Oooo0);
        ImageView imageView2 = this.f76340OooOo;
        if (imageView2 != null) {
            imageView2.setOnLongClickListener(new View.OnLongClickListener() { // from class: o0o000O.OooO0O0
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    StrokesEditorPanel strokesEditorPanel = this.f105448OooO00o;
                    LassoParams lassoParams = strokesEditorPanel.f76343OooOoO0;
                    List<InterfaceC31284OooO0O0> selectedItems = lassoParams != null ? lassoParams.getSelectedItems() : null;
                    if (selectedItems == null || selectedItems.isEmpty()) {
                        return true;
                    }
                    C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, strokesEditorPanel.new OooO0O0(null), 3);
                    return true;
                }
            });
        } else {
            OooOOO0.OooOOOO("lasso");
            throw null;
        }
    }

    @Override // com.orion.notein.ui.noteeditor.strokeeditor.StrokesResizeAndRotateEditor.OooO00o
    public final void onMove(int i, int i2) {
        StrokesResizeAndRotateEditor strokesResizeAndRotateEditor = this.f76341OooOo0o;
        if (strokesResizeAndRotateEditor == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        RectF rectF = this.f76342OooOoO;
        float f = i;
        strokesResizeAndRotateEditor.setTranslationX(rectF.left + f);
        StrokesResizeAndRotateEditor strokesResizeAndRotateEditor2 = this.f76341OooOo0o;
        if (strokesResizeAndRotateEditor2 == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        float f2 = i2;
        strokesResizeAndRotateEditor2.setTranslationY(rectF.top + f2);
        ImageView imageView = this.f76340OooOo;
        if (imageView == null) {
            OooOOO0.OooOOOO("lasso");
            throw null;
        }
        RectF rectF2 = this.f76347OooOooO;
        imageView.setTranslationX(rectF2.left + f);
        ImageView imageView2 = this.f76340OooOo;
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
        if (event.getActionMasked() == 0) {
            LassoParams lassoParams = this.f76343OooOoO0;
            List<InterfaceC31284OooO0O0> selectedItems = lassoParams != null ? lassoParams.getSelectedItems() : null;
            if (!(selectedItems == null || selectedItems.isEmpty())) {
                RectF rectF = this.f76347OooOooO;
                float f = 20;
                if (new RectF(rectF.centerX() - o000000O.OooO0o0(169.0f), (rectF.top - f) - o000000O.OooO0o0(37.0f), o000000O.OooO0o0(169.0f) + rectF.centerX(), rectF.top - f).contains(event.getX(), event.getY())) {
                    return false;
                }
            }
            OooO0o0(true);
        }
        return true;
    }

    public final void setColorInversion(boolean enabled) {
        this.f76346OooOoo0 = enabled;
        StrokesResizeAndRotateEditor strokesResizeAndRotateEditor = this.f76341OooOo0o;
        if (strokesResizeAndRotateEditor != null) {
            if (strokesResizeAndRotateEditor != null) {
                strokesResizeAndRotateEditor.setColorInversion(enabled);
            } else {
                OooOOO0.OooOOOO("editor");
                throw null;
            }
        }
    }

    public final void setEventListener(OooO00o oooO00o) {
        this.eventListener = oooO00o;
    }

    public final void setScaleFactor(float f) {
        this.scaleFactor = f;
    }
}
