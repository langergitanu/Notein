package com.orion.notein.p607ui.noteeditor.strokeeditor;

import OooOoO.C20509OooO0oo;
import android.content.ClipData;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.PersistableBundleKt;
import com.orion.notein.domain.models.DragConstants;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.strokeeditor.StrokesResizeAndRotateEditor;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o00o0o0o.C25446OooO0Oo;
import o0OoO000.ViewOnClickListenerC28565Ooooo00;
import o0OoO0oo.C28957o00oOo0O;
import o0o000O.OooOO0;
import o0o000O.ViewOnTouchListenerC29735OooO0Oo;
import o0o000O.ViewOnTouchListenerC29736OooO0o0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u001aR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/strokeeditor/StrokesResizeAndRotateEditor;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/graphics/Bitmap;", "OooOooO", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "setBitmap", "(Landroid/graphics/Bitmap;)V", "bitmap", "", "OooOooo", "Z", "getColorInversion", "()Z", "setColorInversion", "(Z)V", "colorInversion", "Lcom/orion/notein/ui/noteeditor/strokeeditor/StrokesResizeAndRotateEditor$OooO00o;", "Oooo00o", "Lcom/orion/notein/ui/noteeditor/strokeeditor/StrokesResizeAndRotateEditor$OooO00o;", "getEventListener", "()Lcom/orion/notein/ui/noteeditor/strokeeditor/StrokesResizeAndRotateEditor$OooO00o;", "setEventListener", "(Lcom/orion/notein/ui/noteeditor/strokeeditor/StrokesResizeAndRotateEditor$OooO00o;)V", "eventListener", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class StrokesResizeAndRotateEditor extends ConstraintLayout {

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public static final /* synthetic */ int f76355Oooo0 = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public View f76356OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public ImageView f76357OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final PointF f76358OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public View f76359OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final PointF f76360OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final Handler f76361OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final PointF f76362OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name and from kotlin metadata */
    public Bitmap bitmap;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name and from kotlin metadata */
    public boolean colorInversion;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final ViewOnTouchListenerC29735OooO0Oo f76365Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final ViewOnTouchListenerC29736OooO0o0 f76366Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name and from kotlin metadata */
    public OooO00o eventListener;

    public interface OooO00o {
        void OooO00o(float f, float f2);

        void OooO0O0(int i, int i2);

        Object OooO0OO(ClipData clipData, OooOO0 oooOO02);

        void onCancel();

        void onFinish();

        void onMove(int i, int i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v5, types: [o0o000O.OooO0Oo] */
    /* JADX WARN: Type inference failed for: r3v6, types: [o0o000O.OooO0o0] */
    public StrokesResizeAndRotateEditor(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        OooOOO0.OooO0oO(context, "context");
        this.f76358OooOoO = new PointF();
        this.f76360OooOoOO = new PointF();
        this.f76362OooOoo0 = new PointF();
        this.f76361OooOoo = new Handler(Looper.getMainLooper());
        this.f76365Oooo000 = new View.OnTouchListener() { // from class: o0o000O.OooO0Oo
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int i = StrokesResizeAndRotateEditor.f76355Oooo0;
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                float rawX = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                StringBuilder sbOooO0Oo = C20509OooO0oo.OooO0Oo("scaleAndRotateListener:(", x, ",", y, "),(");
                sbOooO0Oo.append(rawX);
                sbOooO0Oo.append(",");
                sbOooO0Oo.append(rawY);
                sbOooO0Oo.append(")");
                c20358OooO00o.OooO00o(sbOooO0Oo.toString(), new Object[0]);
                int action = motionEvent.getAction();
                StrokesResizeAndRotateEditor strokesResizeAndRotateEditor = this.f105450OooOo0o;
                if (action == 0) {
                    strokesResizeAndRotateEditor.requestDisallowInterceptTouchEvent(true);
                    strokesResizeAndRotateEditor.f76358OooOoO.set(motionEvent.getRawX(), motionEvent.getRawY());
                    strokesResizeAndRotateEditor.getLocationOnScreen(new int[2]);
                    PointF pointFOooOO0O = C25446OooO0Oo.OooOO0O(new PointF((-strokesResizeAndRotateEditor.getWidth()) / 2.0f, (-strokesResizeAndRotateEditor.getHeight()) / 2.0f), new PointF(0.0f, 0.0f), strokesResizeAndRotateEditor.getRotation());
                    strokesResizeAndRotateEditor.f76362OooOoo0.set(r0[0] - pointFOooOO0O.x, r0[1] - pointFOooOO0O.y);
                    return true;
                }
                if (action == 1) {
                    StrokesResizeAndRotateEditor.OooO00o oooO00o = strokesResizeAndRotateEditor.eventListener;
                    if (oooO00o != null) {
                        oooO00o.onFinish();
                    }
                    strokesResizeAndRotateEditor.requestDisallowInterceptTouchEvent(false);
                    return true;
                }
                if (action == 2) {
                    strokesResizeAndRotateEditor.f76360OooOoOO.set(motionEvent.getRawX(), motionEvent.getRawY());
                    PointF pointF = strokesResizeAndRotateEditor.f76362OooOoo0;
                    PointF pointF2 = strokesResizeAndRotateEditor.f76358OooOoO;
                    PointF pointF3 = strokesResizeAndRotateEditor.f76360OooOoOO;
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
                    c20358OooO00o.OooO00o("ACTION_MOVE angle:" + d + ", scale:" + fSqrt, new Object[0]);
                    StrokesResizeAndRotateEditor.OooO00o oooO00o2 = strokesResizeAndRotateEditor.eventListener;
                    if (oooO00o2 != null) {
                        oooO00o2.OooO00o((float) d, fSqrt);
                    }
                }
                return true;
            }
        };
        this.f76366Oooo00O = new View.OnTouchListener() { // from class: o0o000O.OooO0o0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                StrokesResizeAndRotateEditor.OooO00o oooO00o;
                int i = StrokesResizeAndRotateEditor.f76355Oooo0;
                int action = motionEvent.getAction();
                final StrokesResizeAndRotateEditor strokesResizeAndRotateEditor = this.f105452OooOo0o;
                if (action == 0) {
                    strokesResizeAndRotateEditor.requestDisallowInterceptTouchEvent(true);
                    strokesResizeAndRotateEditor.f76358OooOoO.set(motionEvent.getRawX(), motionEvent.getRawY());
                    if (view.getId() == R.id.img_content) {
                        strokesResizeAndRotateEditor.f76361OooOoo.postDelayed(new Runnable() { // from class: o0o000O.OooO0o
                            @Override // java.lang.Runnable
                            public final void run() {
                                ImageView imageView = strokesResizeAndRotateEditor.f76357OooOo0o;
                                if (imageView != null) {
                                    imageView.performLongClick();
                                } else {
                                    OooOOO0.OooOOOO("image");
                                    throw null;
                                }
                            }
                        }, 1000L);
                    }
                } else {
                    if (action == 1) {
                        strokesResizeAndRotateEditor.f76361OooOoo.removeCallbacksAndMessages(null);
                        StrokesResizeAndRotateEditor.OooO00o oooO00o2 = strokesResizeAndRotateEditor.eventListener;
                        if (oooO00o2 != null) {
                            oooO00o2.onFinish();
                        }
                        strokesResizeAndRotateEditor.requestDisallowInterceptTouchEvent(false);
                        return true;
                    }
                    if (action == 2) {
                        strokesResizeAndRotateEditor.f76360OooOoOO.set(motionEvent.getRawX(), motionEvent.getRawY());
                        PointF pointF = strokesResizeAndRotateEditor.f76360OooOoOO;
                        float f = pointF.x;
                        PointF pointF2 = strokesResizeAndRotateEditor.f76358OooOoO;
                        if (Math.abs(f - pointF2.x) > 20.0f || Math.abs(pointF.y - pointF2.y) > 20.0f) {
                            strokesResizeAndRotateEditor.f76361OooOoo.removeCallbacksAndMessages(null);
                        }
                        float f2 = pointF.x - pointF2.x;
                        float f3 = pointF.y - pointF2.y;
                        if (view.getId() == R.id.img_content && (oooO00o = strokesResizeAndRotateEditor.eventListener) != null) {
                            oooO00o.onMove((int) f2, (int) f3);
                            return true;
                        }
                    }
                }
                return true;
            }
        };
        View.inflate(context, R.layout.layout_strokes_editor, this);
    }

    public final void OooO00o() {
        Log.d("StrokesEditor", "hide");
        setRotation(0.0f);
        setTranslationX(0.0f);
        setTranslationY(0.0f);
        setVisibility(8);
        ImageView imageView = this.f76357OooOo0o;
        if (imageView == null) {
            OooOOO0.OooOOOO("image");
            throw null;
        }
        imageView.setBackground(null);
        View view = this.f76356OooOo;
        if (view == null) {
            OooOOO0.OooOOOO("cancel");
            throw null;
        }
        view.setVisibility(8);
        View view2 = this.f76359OooOoO0;
        if (view2 == null) {
            OooOOO0.OooOOOO("scale");
            throw null;
        }
        view2.setVisibility(8);
        ImageView imageView2 = this.f76357OooOo0o;
        if (imageView2 == null) {
            OooOOO0.OooOOOO("image");
            throw null;
        }
        imageView2.setOnTouchListener(null);
        ImageView imageView3 = this.f76357OooOo0o;
        if (imageView3 == null) {
            OooOOO0.OooOOOO("image");
            throw null;
        }
        imageView3.setOnLongClickListener(null);
        ImageView imageView4 = this.f76357OooOo0o;
        if (imageView4 == null) {
            OooOOO0.OooOOOO("image");
            throw null;
        }
        imageView4.setClickable(false);
        ImageView imageView5 = this.f76357OooOo0o;
        if (imageView5 != null) {
            imageView5.setLongClickable(false);
        } else {
            OooOOO0.OooOOOO("image");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooOO0 oooOO02;
        ClipData clipData;
        StrokesResizeAndRotateEditor strokesResizeAndRotateEditor;
        ClipData clipData2;
        ImageView imageView;
        if (abstractC32479OooO0OO instanceof OooOO0) {
            oooOO02 = (OooOO0) abstractC32479OooO0OO;
            int i = oooOO02.f105462OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOO02.f105462OooOoOO = i - Integer.MIN_VALUE;
            } else {
                oooOO02 = new OooOO0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = oooOO02.f105461OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooOO02.f105462OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            ClipData.Item item = new ClipData.Item("");
            Integer fragmentHostId = DragConstants.INSTANCE.getFragmentHostId(this);
            int iIntValue = fragmentHostId != null ? fragmentHostId.intValue() : 0;
            clipData = new ClipData(DragConstants.NOTEIN_DRAG_LABEL, new String[]{"application/octet-stream"}, item);
            clipData.getDescription().setExtras(PersistableBundleKt.persistableBundleOf(new C32443OooOOO(DragConstants.NOTEIN_DRAG_DATA_TYPE, new Integer(3)), new C32443OooOOO(DragConstants.NOTEIN_DRAG_HOST_FRAGMENT_ID, new Integer(iIntValue))));
            OooO00o oooO00o = this.eventListener;
            if (oooO00o == null) {
                strokesResizeAndRotateEditor = this;
                imageView = strokesResizeAndRotateEditor.f76357OooOo0o;
                if (imageView != null) {
                    OooOOO0.OooOOOO("image");
                    throw null;
                }
                C28957o00oOo0O c28957o00oOo0O = new C28957o00oOo0O(imageView);
                ImageView imageView2 = strokesResizeAndRotateEditor.f76357OooOo0o;
                if (imageView2 != null) {
                    imageView2.startDragAndDrop(clipData, c28957o00oOo0O, null, 257);
                    return C32460OooOooO.f116667OooO00o;
                }
                OooOOO0.OooOOOO("image");
                throw null;
            }
            oooOO02.f105459OooOo0o = this;
            oooOO02.f105458OooOo = clipData;
            oooOO02.f105462OooOoOO = 1;
            if (oooO00o.OooO0OO(clipData, oooOO02) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            strokesResizeAndRotateEditor = this;
            clipData2 = clipData;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            clipData2 = oooOO02.f105458OooOo;
            strokesResizeAndRotateEditor = oooOO02.f105459OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        clipData = clipData2;
        imageView = strokesResizeAndRotateEditor.f76357OooOo0o;
        if (imageView != null) {
        }
    }

    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    public final boolean getColorInversion() {
        return this.colorInversion;
    }

    public final OooO00o getEventListener() {
        return this.eventListener;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        View viewFindViewById = findViewById(R.id.img_cancel);
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC28565Ooooo00(this, 3));
        this.f76356OooOo = viewFindViewById;
        this.f76357OooOo0o = (ImageView) findViewById(R.id.img_content);
        View viewFindViewById2 = findViewById(R.id.img_scale);
        viewFindViewById2.setOnTouchListener(this.f76365Oooo000);
        this.f76359OooOoO0 = viewFindViewById2;
        ImageView imageView = this.f76357OooOo0o;
        if (imageView == null) {
            OooOOO0.OooOOOO("image");
            throw null;
        }
        imageView.setClickable(false);
        ImageView imageView2 = this.f76357OooOo0o;
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

    public final void setColorInversion(boolean z) {
        this.colorInversion = z;
    }

    public final void setEventListener(OooO00o oooO00o) {
        this.eventListener = oooO00o;
    }
}
