package o0OoO;

import OooOoO.C20509OooO0oo;
import Oooo0.o000000O;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.addimage.ImageSizeAndRotationEditor;
import com.orion.notein.p607ui.noteeditor.itemeditor.ItemsEditor;
import com.orion.notein.p607ui.noteeditor.itemeditor.ItemsEditorPanel;
import com.orion.penkit.models.LassoParams;
import java.util.List;
import o00o0o0o.C25446OooO0Oo;

/* JADX INFO: renamed from: o0OoO.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnTouchListenerC28505OooOO0o implements View.OnTouchListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f101064OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101065OooOo0o;

    public /* synthetic */ ViewOnTouchListenerC28505OooOO0o(ViewGroup viewGroup, int i) {
        this.f101065OooOo0o = i;
        this.f101064OooOo = viewGroup;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ViewGroup viewGroup = this.f101064OooOo;
        int i = 1;
        switch (this.f101065OooOo0o) {
            case 0:
                int i2 = ImageSizeAndRotationEditor.f73763Oooo0O0;
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                float rawX = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                StringBuilder sbOooO0Oo = C20509OooO0oo.OooO0Oo("scaleAndRotateListener:(", x, ",", y, "),(");
                sbOooO0Oo.append(rawX);
                sbOooO0Oo.append(",");
                sbOooO0Oo.append(rawY);
                sbOooO0Oo.append(")");
                Log.d("ImageEditor", sbOooO0Oo.toString());
                int action = motionEvent.getAction();
                ImageSizeAndRotationEditor imageSizeAndRotationEditor = (ImageSizeAndRotationEditor) viewGroup;
                if (action == 0) {
                    imageSizeAndRotationEditor.requestDisallowInterceptTouchEvent(true);
                    imageSizeAndRotationEditor.f73770OooOoo0.set(motionEvent.getRawX(), motionEvent.getRawY());
                    imageSizeAndRotationEditor.getLocationOnScreen(new int[2]);
                    PointF pointFOooOO0O = C25446OooO0Oo.OooOO0O(new PointF((-imageSizeAndRotationEditor.getWidth()) / 2.0f, (-imageSizeAndRotationEditor.getHeight()) / 2.0f), new PointF(0.0f, 0.0f), imageSizeAndRotationEditor.getRotation());
                    imageSizeAndRotationEditor.f73771OooOooO.set(r14[0] - pointFOooOO0O.x, r14[1] - pointFOooOO0O.y);
                    ImageSizeAndRotationEditor.OooO00o oooO00o = imageSizeAndRotationEditor.eventListener;
                    if (oooO00o != null) {
                        oooO00o.OooO0O0();
                    }
                } else if (action == 1) {
                    ImageSizeAndRotationEditor.OooO00o oooO00o2 = imageSizeAndRotationEditor.eventListener;
                    if (oooO00o2 != null) {
                        oooO00o2.onFinish();
                    }
                    imageSizeAndRotationEditor.requestDisallowInterceptTouchEvent(false);
                    ImageSizeAndRotationEditor.OooO00o oooO00o3 = imageSizeAndRotationEditor.eventListener;
                    if (oooO00o3 != null) {
                        oooO00o3.OooO0OO();
                    }
                } else if (action == 2) {
                    imageSizeAndRotationEditor.f73769OooOoo.set(motionEvent.getRawX(), motionEvent.getRawY());
                    PointF pointF = imageSizeAndRotationEditor.f73771OooOooO;
                    PointF pointF2 = imageSizeAndRotationEditor.f73770OooOoo0;
                    PointF pointF3 = imageSizeAndRotationEditor.f73769OooOoo;
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
                    ImageSizeAndRotationEditor.OooO00o oooO00o4 = imageSizeAndRotationEditor.eventListener;
                    if (oooO00o4 != null) {
                        oooO00o4.OooO00o((float) d, fSqrt);
                    }
                }
                return true;
            default:
                int i3 = ItemsEditorPanel.f74688Oooo0OO;
                float x2 = motionEvent.getX();
                ItemsEditorPanel itemsEditorPanel = (ItemsEditorPanel) viewGroup;
                ImageView imageView = itemsEditorPanel.f74689OooOo;
                if (imageView == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("lasso");
                    throw null;
                }
                float x3 = imageView.getX() + x2;
                float y2 = motionEvent.getY();
                ImageView imageView2 = itemsEditorPanel.f74689OooOo;
                if (imageView2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("lasso");
                    throw null;
                }
                float y3 = imageView2.getY() + y2;
                int action2 = motionEvent.getAction();
                Handler handler = itemsEditorPanel.f74697OooOooo;
                PointF pointF4 = itemsEditorPanel.f74700Oooo00O;
                if (action2 == 0) {
                    LassoParams lassoParams = itemsEditorPanel.f74693OooOoOO;
                    List<PointF> polygonBorder = lassoParams != null ? lassoParams.getPolygonBorder() : null;
                    if (polygonBorder == null || C25446OooO0Oo.OooO0oO(new PointF(x3, y3), polygonBorder)) {
                        itemsEditorPanel.requestDisallowInterceptTouchEvent(true);
                        pointF4.set(new PointF(x3, y3));
                        if (view.getId() == R.id.lasso) {
                            handler.postDelayed(new OooOOO(itemsEditorPanel, i), 1000L);
                        }
                        ItemsEditorPanel.OooO00o oooO00o5 = itemsEditorPanel.eventListener;
                        if (oooO00o5 != null) {
                            oooO00o5.OooO00o();
                        }
                    } else {
                        itemsEditorPanel.OooO0o(true, false);
                    }
                } else if (action2 == 1) {
                    handler.removeCallbacksAndMessages(null);
                    itemsEditorPanel.onFinish();
                    itemsEditorPanel.requestDisallowInterceptTouchEvent(false);
                    LassoParams lassoParams2 = itemsEditorPanel.f74693OooOoOO;
                    if (lassoParams2 != null) {
                        ItemsEditor itemsEditor = itemsEditorPanel.f74690OooOo0o;
                        if (itemsEditor == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                            throw null;
                        }
                        float left = itemsEditor.getLeft();
                        ItemsEditor itemsEditor2 = itemsEditorPanel.f74690OooOo0o;
                        if (itemsEditor2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                            throw null;
                        }
                        float translationX = itemsEditor2.getTranslationX() + left + o000000O.OooO0o(10);
                        ItemsEditor itemsEditor3 = itemsEditorPanel.f74690OooOo0o;
                        if (itemsEditor3 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                            throw null;
                        }
                        float top = itemsEditor3.getTop();
                        ItemsEditor itemsEditor4 = itemsEditorPanel.f74690OooOo0o;
                        if (itemsEditor4 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                            throw null;
                        }
                        float translationY = itemsEditor4.getTranslationY() + top + o000000O.OooO0o(10);
                        ItemsEditor itemsEditor5 = itemsEditorPanel.f74690OooOo0o;
                        if (itemsEditor5 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                            throw null;
                        }
                        float right = itemsEditor5.getRight();
                        ItemsEditor itemsEditor6 = itemsEditorPanel.f74690OooOo0o;
                        if (itemsEditor6 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                            throw null;
                        }
                        float translationX2 = (itemsEditor6.getTranslationX() + right) - o000000O.OooO0o(10);
                        ItemsEditor itemsEditor7 = itemsEditorPanel.f74690OooOo0o;
                        if (itemsEditor7 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                            throw null;
                        }
                        float bottom = itemsEditor7.getBottom();
                        ItemsEditor itemsEditor8 = itemsEditorPanel.f74690OooOo0o;
                        if (itemsEditor8 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                            throw null;
                        }
                        RectF rectF = new RectF(translationX, translationY, translationX2, (itemsEditor8.getTranslationY() + bottom) - o000000O.OooO0o(10));
                        float fWidth = rectF.width() / itemsEditorPanel.f74695OooOoo0.width();
                        LassoParams lassoParamsCopy$default = LassoParams.copy$default(lassoParams2, null, itemsEditorPanel.f74699Oooo000, null, 5, null);
                        ItemsEditorPanel.OooO00o oooO00o6 = itemsEditorPanel.eventListener;
                        if (oooO00o6 != null) {
                            oooO00o6.OooO0o(lassoParamsCopy$default, rectF, fWidth);
                        }
                    }
                } else if (action2 == 2) {
                    PointF pointF5 = itemsEditorPanel.f74701Oooo00o;
                    pointF5.set(new PointF(x3, y3));
                    if (Math.abs(pointF5.x - pointF4.x) > 20.0f || Math.abs(pointF5.y - pointF4.y) > 20.0f) {
                        handler.removeCallbacksAndMessages(null);
                    }
                    float f13 = pointF5.x - pointF4.x;
                    float f14 = pointF5.y - pointF4.y;
                    if (view.getId() == R.id.lasso) {
                        itemsEditorPanel.onMove((int) f13, (int) f14);
                    }
                }
                return true;
        }
    }
}
