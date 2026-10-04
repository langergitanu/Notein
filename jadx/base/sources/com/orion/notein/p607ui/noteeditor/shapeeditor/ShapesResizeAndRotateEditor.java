package com.orion.notein.p607ui.noteeditor.shapeeditor;

import OooOoO.C20509OooO0oo;
import android.content.ClipData;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.core.os.PersistableBundleKt;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.DragConstants;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.shapeeditor.ShapesResizeAndRotateEditor;
import com.orion.notein.ui.noteeditor.shapeeditor.ShapesResizeAndRotateEditor.OooO00o;
import com.orion.penkit.models.ShapeInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o00o0o0o.C25446OooO0Oo;
import o0O0oOOO.C26120OooO0Oo;
import o0O0oOOO.C26121OooO0o0;
import o0OoO000.o0OO00O;
import o0OoO0oo.C28957o00oOo0O;
import o0o000O0.C29746OooOOo;
import o0o000O0.OooO0o;
import o0o000O0.OooOOO;
import o0o000O0.OooOOOO;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R$\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/shapeeditor/ShapesResizeAndRotateEditor;", "Lcom/orion/notein/ui/noteeditor/shapeeditor/AbstractShapeEditor;", "", "Lcom/orion/penkit/models/ShapeInfo;", "getItems", "()Ljava/util/List;", "Landroid/graphics/Bitmap;", "Oooo00O", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "setBitmap", "(Landroid/graphics/Bitmap;)V", "bitmap", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class ShapesResizeAndRotateEditor extends AbstractShapeEditor {

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public static final /* synthetic */ int f76325Oooo0O0 = 0;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public View f76326OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public ImageView f76327OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public View f76328OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final PointF f76329OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final PointF f76330OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final PointF f76331OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final C26120OooO0Oo f76332OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final OooOOOO f76333Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final Handler f76334Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name and from kotlin metadata */
    public Bitmap bitmap;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final OooOOO f76336Oooo00o;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.shapeeditor.ShapesResizeAndRotateEditor$enterEditMode$1$1", m80623f = "ShapesResizeAndRotateEditor.kt", m80624l = {StyleIdentifier.GRID_TABLE_3_ACCENT_3}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f76338OooOo0o;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return ShapesResizeAndRotateEditor.this.new OooO00o(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f76338OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f76338OooOo0o = 1;
                if (ShapesResizeAndRotateEditor.OooO0Oo(ShapesResizeAndRotateEditor.this, this) == enumC32485OooO00o) {
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
    /* JADX WARN: Type inference failed for: r3v6, types: [o0o000O0.OooOOO] */
    /* JADX WARN: Type inference failed for: r3v7, types: [o0o000O0.OooOOOO] */
    public ShapesResizeAndRotateEditor(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        OooOOO0.OooO0oO(context, "context");
        this.f76330OooOoo0 = new PointF();
        this.f76329OooOoo = new PointF();
        this.f76331OooOooO = new PointF();
        this.f76332OooOooo = new C26120OooO0Oo();
        this.f76334Oooo000 = new Handler(Looper.getMainLooper());
        this.f76336Oooo00o = new View.OnTouchListener() { // from class: o0o000O0.OooOOO
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int i = ShapesResizeAndRotateEditor.f76325Oooo0O0;
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                float rawX = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                StringBuilder sbOooO0Oo = C20509OooO0oo.OooO0Oo("scaleAndRotateListener:(", x, ",", y, "),(");
                sbOooO0Oo.append(rawX);
                sbOooO0Oo.append(",");
                sbOooO0Oo.append(rawY);
                sbOooO0Oo.append(")");
                Log.d("StrokesEditor", sbOooO0Oo.toString());
                int action = motionEvent.getAction();
                ShapesResizeAndRotateEditor shapesResizeAndRotateEditor = this.f105472OooOo0o;
                if (action == 0) {
                    shapesResizeAndRotateEditor.requestDisallowInterceptTouchEvent(true);
                    shapesResizeAndRotateEditor.f76330OooOoo0.set(motionEvent.getRawX(), motionEvent.getRawY());
                    shapesResizeAndRotateEditor.getLocationOnScreen(new int[2]);
                    PointF pointFOooOO0O = C25446OooO0Oo.OooOO0O(new PointF((-shapesResizeAndRotateEditor.getWidth()) / 2.0f, (-shapesResizeAndRotateEditor.getHeight()) / 2.0f), new PointF(0.0f, 0.0f), shapesResizeAndRotateEditor.getRotation());
                    shapesResizeAndRotateEditor.f76331OooOooO.set(r13[0] - pointFOooOO0O.x, r13[1] - pointFOooOO0O.y);
                    return true;
                }
                if (action == 1) {
                    OooO0o eventListener = shapesResizeAndRotateEditor.getEventListener();
                    if (eventListener != null) {
                        eventListener.onFinish();
                    }
                    shapesResizeAndRotateEditor.requestDisallowInterceptTouchEvent(false);
                    return true;
                }
                if (action == 2) {
                    shapesResizeAndRotateEditor.f76329OooOoo.set(motionEvent.getRawX(), motionEvent.getRawY());
                    PointF pointF = shapesResizeAndRotateEditor.f76331OooOooO;
                    PointF pointF2 = shapesResizeAndRotateEditor.f76330OooOoo0;
                    PointF pointF3 = shapesResizeAndRotateEditor.f76329OooOoo;
                    float f = pointF2.x;
                    float f2 = pointF.x;
                    float f3 = pointF2.y;
                    float f4 = pointF.y;
                    double dAtan2 = ((double) ((float) Math.atan2(f - f2, f3 - f4))) - ((double) ((float) Math.atan2(pointF3.x - f2, pointF3.y - f4)));
                    if (dAtan2 > 3.141592653589793d) {
                        dAtan2 -= 6.283185307179586d;
                    }
                    if (dAtan2 < -3.141592653589793d) {
                        dAtan2 += 6.283185307179586d;
                    }
                    double d = (dAtan2 * ((double) 180)) / 3.141592653589793d;
                    float f5 = pointF2.x;
                    float f6 = pointF.x;
                    float f7 = f5 - f6;
                    float f8 = pointF2.y;
                    float f9 = pointF.y;
                    float f10 = f8 - f9;
                    float f11 = pointF3.x - f6;
                    float f12 = pointF3.y - f9;
                    float fSqrt = ((float) Math.sqrt((f11 * f11) + (f12 * f12))) / ((float) Math.sqrt((f7 * f7) + (f10 * f10)));
                    OooO0o eventListener2 = shapesResizeAndRotateEditor.getEventListener();
                    if (eventListener2 != null) {
                        eventListener2.OooO00o((float) d, fSqrt);
                    }
                }
                return true;
            }
        };
        this.f76333Oooo0 = new View.OnTouchListener() { // from class: o0o000O0.OooOOOO
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                OooO0o eventListener;
                int i = ShapesResizeAndRotateEditor.f76325Oooo0O0;
                int action = motionEvent.getAction();
                final ShapesResizeAndRotateEditor shapesResizeAndRotateEditor = this.f105478OooOo0o;
                if (action == 0) {
                    shapesResizeAndRotateEditor.requestDisallowInterceptTouchEvent(true);
                    shapesResizeAndRotateEditor.f76330OooOoo0.set(motionEvent.getRawX(), motionEvent.getRawY());
                    if (view.getId() == R.id.img_content) {
                        shapesResizeAndRotateEditor.f76334Oooo000.postDelayed(new Runnable() { // from class: o0o000O0.OooOOOo
                            @Override // java.lang.Runnable
                            public final void run() {
                                ImageView imageView = shapesResizeAndRotateEditor.f76327OooOoO0;
                                if (imageView != null) {
                                    imageView.performLongClick();
                                } else {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("image");
                                    throw null;
                                }
                            }
                        }, 1000L);
                    }
                } else {
                    if (action == 1) {
                        shapesResizeAndRotateEditor.f76334Oooo000.removeCallbacksAndMessages(null);
                        OooO0o eventListener2 = shapesResizeAndRotateEditor.getEventListener();
                        if (eventListener2 != null) {
                            eventListener2.onFinish();
                        }
                        shapesResizeAndRotateEditor.requestDisallowInterceptTouchEvent(false);
                        return true;
                    }
                    if (action == 2) {
                        shapesResizeAndRotateEditor.f76329OooOoo.set(motionEvent.getRawX(), motionEvent.getRawY());
                        PointF pointF = shapesResizeAndRotateEditor.f76329OooOoo;
                        float f = pointF.x;
                        PointF pointF2 = shapesResizeAndRotateEditor.f76330OooOoo0;
                        if (Math.abs(f - pointF2.x) > 20.0f || Math.abs(pointF.y - pointF2.y) > 20.0f) {
                            shapesResizeAndRotateEditor.f76334Oooo000.removeCallbacksAndMessages(null);
                        }
                        float f2 = pointF.x - pointF2.x;
                        float f3 = pointF.y - pointF2.y;
                        if (view.getId() == R.id.img_content && (eventListener = shapesResizeAndRotateEditor.getEventListener()) != null) {
                            eventListener.onMove((int) f2, (int) f3);
                            return true;
                        }
                    }
                }
                return true;
            }
        };
        View.inflate(context, R.layout.layout_strokes_editor, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0Oo(ShapesResizeAndRotateEditor shapesResizeAndRotateEditor, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C29746OooOOo c29746OooOOo;
        ClipData clipData;
        shapesResizeAndRotateEditor.getClass();
        if (abstractC32479OooO0OO instanceof C29746OooOOo) {
            c29746OooOOo = (C29746OooOOo) abstractC32479OooO0OO;
            int i = c29746OooOOo.f105484OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29746OooOOo.f105484OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c29746OooOOo = new C29746OooOOo(shapesResizeAndRotateEditor, abstractC32479OooO0OO);
            }
        }
        Object obj = c29746OooOOo.f105483OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c29746OooOOo.f105484OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            Integer fragmentHostId = DragConstants.INSTANCE.getFragmentHostId(shapesResizeAndRotateEditor);
            int iIntValue = fragmentHostId != null ? fragmentHostId.intValue() : 0;
            clipData = new ClipData(DragConstants.NOTEIN_DRAG_LABEL, new String[]{"application/octet-stream"}, new ClipData.Item(""));
            clipData.getDescription().setExtras(PersistableBundleKt.persistableBundleOf(new C32443OooOOO(DragConstants.NOTEIN_DRAG_DATA_TYPE, new Integer(8)), new C32443OooOOO(DragConstants.NOTEIN_DRAG_HOST_FRAGMENT_ID, new Integer(iIntValue))));
            OooO0o eventListener = shapesResizeAndRotateEditor.getEventListener();
            if (eventListener != null) {
                c29746OooOOo.f105481OooOo0o = shapesResizeAndRotateEditor;
                c29746OooOOo.f105480OooOo = clipData;
                c29746OooOOo.f105484OooOoOO = 1;
                if (eventListener.OooO0OO(c29746OooOOo) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ClipData clipData2 = c29746OooOOo.f105480OooOo;
            ShapesResizeAndRotateEditor shapesResizeAndRotateEditor2 = c29746OooOOo.f105481OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            clipData = clipData2;
            shapesResizeAndRotateEditor = shapesResizeAndRotateEditor2;
        }
        ImageView imageView = shapesResizeAndRotateEditor.f76327OooOoO0;
        if (imageView == null) {
            OooOOO0.OooOOOO("image");
            throw null;
        }
        C28957o00oOo0O c28957o00oOo0O = new C28957o00oOo0O(imageView);
        ImageView imageView2 = shapesResizeAndRotateEditor.f76327OooOoO0;
        if (imageView2 != null) {
            imageView2.startDragAndDrop(clipData, c28957o00oOo0O, null, 257);
            return C32460OooOooO.f116667OooO00o;
        }
        OooOOO0.OooOOOO("image");
        throw null;
    }

    @Override // com.orion.notein.p607ui.noteeditor.shapeeditor.AbstractShapeEditor
    public final void OooO00o(float f, float f2) {
        ImageView imageView = this.f76327OooOoO0;
        if (imageView == null) {
            OooOOO0.OooOOOO("image");
            throw null;
        }
        imageView.setBackground(getContext().getDrawable(R.drawable.bg_strokes_editor));
        View view = this.f76326OooOoO;
        if (view == null) {
            OooOOO0.OooOOOO("cancel");
            throw null;
        }
        view.setVisibility(0);
        View view2 = this.f76328OooOoOO;
        if (view2 == null) {
            OooOOO0.OooOOOO("scale");
            throw null;
        }
        view2.setVisibility(0);
        ImageView imageView2 = this.f76327OooOoO0;
        if (imageView2 == null) {
            OooOOO0.OooOOOO("image");
            throw null;
        }
        imageView2.setClickable(true);
        ImageView imageView3 = this.f76327OooOoO0;
        if (imageView3 == null) {
            OooOOO0.OooOOOO("image");
            throw null;
        }
        imageView3.setLongClickable(true);
        ImageView imageView4 = this.f76327OooOoO0;
        if (imageView4 == null) {
            OooOOO0.OooOOOO("image");
            throw null;
        }
        imageView4.setOnTouchListener(this.f76333Oooo0);
        ImageView imageView5 = this.f76327OooOoO0;
        if (imageView5 != null) {
            imageView5.setOnLongClickListener(new View.OnLongClickListener() { // from class: o0o000O0.OooOOo0
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view3) {
                    int i = ShapesResizeAndRotateEditor.f76325Oooo0O0;
                    C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, this.f105485OooO00o.new OooO00o(null), 3);
                    return true;
                }
            });
        } else {
            OooOOO0.OooOOOO("image");
            throw null;
        }
    }

    @Override // com.orion.notein.p607ui.noteeditor.shapeeditor.AbstractShapeEditor
    public final void OooO0O0(List<ShapeInfo> list, RectF rectF, float f, boolean z) {
        setTranslationX(rectF.left);
        setTranslationY(rectF.top);
        InterfaceC31284OooO0O0.f111702OooO0O0.getClass();
        RectF rectF2 = new RectF(InterfaceC31284OooO0O0.OooO00o.OooO00o(f, list));
        int iCeil = (int) Math.ceil(rectF2.width());
        if (iCeil == 0) {
            iCeil = 1;
        }
        int iCeil2 = (int) Math.ceil(rectF2.height());
        if (iCeil2 == 0) {
            iCeil2 = 1;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iCeil, iCeil2, Bitmap.Config.ARGB_8888);
        this.bitmap = bitmapCreateBitmap;
        if (bitmapCreateBitmap != null) {
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            C26121OooO0o0 c26121OooO0o0 = new C26121OooO0o0(canvas, getContext(), f, f);
            c26121OooO0o0.f89175OooO0OO = getColorInversion();
            c26121OooO0o0.f89176OooO0Oo = true;
            C26120OooO0Oo c26120OooO0Oo = this.f76332OooOooo;
            c26120OooO0Oo.OooOo00(c26121OooO0o0);
            c26120OooO0Oo.OooO0oO(f);
            for (ShapeInfo shapeInfo : list) {
                if (z) {
                    shapeInfo.render(c26120OooO0Oo, c26121OooO0o0, f);
                } else {
                    shapeInfo.render(c26120OooO0Oo, c26121OooO0o0, 1.0f);
                }
            }
            ImageView imageView = this.f76327OooOoO0;
            if (imageView == null) {
                OooOOO0.OooOOOO("image");
                throw null;
            }
            imageView.setImageBitmap(this.bitmap);
            canvas.setBitmap(null);
            int iWidth = (int) rectF.width();
            int iHeight = (int) rectF.height();
            OooO0o eventListener = getEventListener();
            if (eventListener != null) {
                eventListener.OooO0O0(iWidth, iHeight);
            }
        }
    }

    @Override // com.orion.notein.p607ui.noteeditor.shapeeditor.AbstractShapeEditor
    public final void OooO0OO(float f, float f2) {
        setRotation(0.0f);
        setTranslationX(f);
        setTranslationY(f2);
        setVisibility(0);
        requestFocus();
    }

    public final void OooO0o0() {
        setRotation(0.0f);
        setTranslationX(0.0f);
        setTranslationY(0.0f);
        setVisibility(8);
        ImageView imageView = this.f76327OooOoO0;
        if (imageView == null) {
            OooOOO0.OooOOOO("image");
            throw null;
        }
        imageView.setBackground(null);
        View view = this.f76326OooOoO;
        if (view == null) {
            OooOOO0.OooOOOO("cancel");
            throw null;
        }
        view.setVisibility(8);
        View view2 = this.f76328OooOoOO;
        if (view2 == null) {
            OooOOO0.OooOOOO("scale");
            throw null;
        }
        view2.setVisibility(8);
        ImageView imageView2 = this.f76327OooOoO0;
        if (imageView2 == null) {
            OooOOO0.OooOOOO("image");
            throw null;
        }
        imageView2.setOnTouchListener(null);
        ImageView imageView3 = this.f76327OooOoO0;
        if (imageView3 == null) {
            OooOOO0.OooOOOO("image");
            throw null;
        }
        imageView3.setOnLongClickListener(null);
        ImageView imageView4 = this.f76327OooOoO0;
        if (imageView4 == null) {
            OooOOO0.OooOOOO("image");
            throw null;
        }
        imageView4.setClickable(false);
        ImageView imageView5 = this.f76327OooOoO0;
        if (imageView5 != null) {
            imageView5.setLongClickable(false);
        } else {
            OooOOO0.OooOOOO("image");
            throw null;
        }
    }

    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    @Override // com.orion.notein.p607ui.noteeditor.shapeeditor.AbstractShapeEditor
    public List<ShapeInfo> getItems() {
        return C34434OooOoO.f123453OooOo0o;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        View viewFindViewById = findViewById(R.id.img_cancel);
        viewFindViewById.setOnClickListener(new o0OO00O(this, 3));
        this.f76326OooOoO = viewFindViewById;
        this.f76327OooOoO0 = (ImageView) findViewById(R.id.img_content);
        View viewFindViewById2 = findViewById(R.id.img_scale);
        viewFindViewById2.setOnTouchListener(this.f76336Oooo00o);
        this.f76328OooOoOO = viewFindViewById2;
        ImageView imageView = this.f76327OooOoO0;
        if (imageView == null) {
            OooOOO0.OooOOOO("image");
            throw null;
        }
        imageView.setClickable(false);
        ImageView imageView2 = this.f76327OooOoO0;
        if (imageView2 != null) {
            imageView2.setLongClickable(false);
        } else {
            OooOOO0.OooOOOO("image");
            throw null;
        }
    }

    public final void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }
}
