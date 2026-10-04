package o0o000O;

import Oooo0.o000000O;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.strokeeditor.StrokesEditorPanel;
import com.orion.notein.p607ui.noteeditor.strokeeditor.StrokesResizeAndRotateEditor;
import com.orion.notein.p607ui.noteeditor.toolbox.favorite.FavoriteToolBox;
import com.orion.penkit.models.LassoParams;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0o000O.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnTouchListenerC29732OooO00o implements View.OnTouchListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f105446OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f105447OooOo0o;

    public /* synthetic */ ViewOnTouchListenerC29732OooO00o(FrameLayout frameLayout, int i) {
        this.f105447OooOo0o = i;
        this.f105446OooOo = frameLayout;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        FrameLayout frameLayout = this.f105446OooOo;
        boolean z = true;
        switch (this.f105447OooOo0o) {
            case 0:
                int i = StrokesEditorPanel.f76339Oooo0O0;
                float x = motionEvent.getX();
                final StrokesEditorPanel strokesEditorPanel = (StrokesEditorPanel) frameLayout;
                ImageView imageView = strokesEditorPanel.f76340OooOo;
                if (imageView == null) {
                    OooOOO0.OooOOOO("lasso");
                    throw null;
                }
                float x2 = imageView.getX() + x;
                float y = motionEvent.getY();
                ImageView imageView2 = strokesEditorPanel.f76340OooOo;
                if (imageView2 == null) {
                    OooOOO0.OooOOOO("lasso");
                    throw null;
                }
                float y2 = imageView2.getY() + y;
                int action = motionEvent.getAction();
                RectF rectF = strokesEditorPanel.f76347OooOooO;
                Handler handler = strokesEditorPanel.f76345OooOoo;
                PointF pointF = strokesEditorPanel.f76348OooOooo;
                char c = 2;
                if (action == 0) {
                    LassoParams lassoParams = strokesEditorPanel.f76343OooOoO0;
                    List<PointF> polygonBorder = lassoParams != null ? lassoParams.getPolygonBorder() : null;
                    if (polygonBorder != null) {
                        PointF pointF2 = new PointF(x2, y2);
                        List<PointF> list = polygonBorder;
                        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                        for (PointF pointF3 : list) {
                            ImageView imageView3 = strokesEditorPanel.f76340OooOo;
                            if (imageView3 == null) {
                                OooOOO0.OooOOOO("lasso");
                                throw null;
                            }
                            char c2 = c;
                            float translationX = imageView3.getTranslationX() - rectF.left;
                            ImageView imageView4 = strokesEditorPanel.f76340OooOo;
                            if (imageView4 == null) {
                                OooOOO0.OooOOOO("lasso");
                                throw null;
                            }
                            float translationY = imageView4.getTranslationY() - rectF.top;
                            PointF pointF4 = new PointF(pointF3.x, pointF3.y);
                            pointF4.offset(translationX, translationY);
                            arrayList.add(pointF4);
                            c = c2;
                            z = z;
                        }
                        boolean z2 = z;
                        int size = arrayList.size();
                        int i2 = 0;
                        int i3 = 0;
                        while (i3 < size) {
                            PointF pointF5 = (PointF) arrayList.get(i3);
                            i3++;
                            PointF pointF6 = (PointF) arrayList.get(i3 % arrayList.size());
                            float f = pointF5.y;
                            float f2 = pointF6.y;
                            if (f != f2 && pointF2.y >= Math.min(f, f2) && pointF2.y < Math.max(pointF5.y, pointF6.y)) {
                                float f3 = pointF2.y;
                                float f4 = pointF5.y;
                                float f5 = pointF6.x;
                                float f6 = pointF5.x;
                                if ((((f5 - f6) * (f3 - f4)) / (pointF6.y - f4)) + f6 > pointF2.x) {
                                    i2++;
                                }
                            }
                        }
                        z = z2;
                        if (i2 % 2 != z) {
                            strokesEditorPanel.OooO0o0(z);
                            return z;
                        }
                    }
                    strokesEditorPanel.requestDisallowInterceptTouchEvent(z);
                    pointF.set(new PointF(x2, y2));
                    if (view.getId() == R.id.lasso) {
                        handler.postDelayed(new Runnable() { // from class: o0o000O.OooO0OO
                            @Override // java.lang.Runnable
                            public final void run() {
                                ImageView imageView5 = strokesEditorPanel.f76340OooOo;
                                if (imageView5 != null) {
                                    imageView5.performLongClick();
                                } else {
                                    OooOOO0.OooOOOO("lasso");
                                    throw null;
                                }
                            }
                        }, 1000L);
                    }
                    StrokesEditorPanel.OooO00o oooO00o = strokesEditorPanel.f76352Oooo00o;
                    if (oooO00o != null) {
                        oooO00o.OooO00o();
                    }
                    return true;
                }
                if (action != 1) {
                    if (action == 2) {
                        PointF pointF7 = strokesEditorPanel.f76350Oooo000;
                        pointF7.set(new PointF(x2, y2));
                        if (Math.abs(pointF7.x - pointF.x) > 20.0f || Math.abs(pointF7.y - pointF.y) > 20.0f) {
                            handler.removeCallbacksAndMessages(null);
                        }
                        float f7 = pointF7.x - pointF.x;
                        float f8 = pointF7.y - pointF.y;
                        if (view.getId() == R.id.lasso) {
                            strokesEditorPanel.onMove((int) f7, (int) f8);
                            return z;
                        }
                    }
                    return true;
                }
                handler.removeCallbacksAndMessages(null);
                strokesEditorPanel.onFinish();
                strokesEditorPanel.requestDisallowInterceptTouchEvent(false);
                LassoParams lassoParams2 = strokesEditorPanel.f76343OooOoO0;
                if (lassoParams2 != null) {
                    StrokesResizeAndRotateEditor strokesResizeAndRotateEditor = strokesEditorPanel.f76341OooOo0o;
                    if (strokesResizeAndRotateEditor == null) {
                        OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    float left = strokesResizeAndRotateEditor.getLeft();
                    StrokesResizeAndRotateEditor strokesResizeAndRotateEditor2 = strokesEditorPanel.f76341OooOo0o;
                    if (strokesResizeAndRotateEditor2 == null) {
                        OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    float translationX2 = strokesResizeAndRotateEditor2.getTranslationX() + left + o000000O.OooO0o(10);
                    StrokesResizeAndRotateEditor strokesResizeAndRotateEditor3 = strokesEditorPanel.f76341OooOo0o;
                    if (strokesResizeAndRotateEditor3 == null) {
                        OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    float top = strokesResizeAndRotateEditor3.getTop();
                    StrokesResizeAndRotateEditor strokesResizeAndRotateEditor4 = strokesEditorPanel.f76341OooOo0o;
                    if (strokesResizeAndRotateEditor4 == null) {
                        OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    float translationY2 = strokesResizeAndRotateEditor4.getTranslationY() + top + o000000O.OooO0o(10);
                    StrokesResizeAndRotateEditor strokesResizeAndRotateEditor5 = strokesEditorPanel.f76341OooOo0o;
                    if (strokesResizeAndRotateEditor5 == null) {
                        OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    float right = strokesResizeAndRotateEditor5.getRight();
                    StrokesResizeAndRotateEditor strokesResizeAndRotateEditor6 = strokesEditorPanel.f76341OooOo0o;
                    if (strokesResizeAndRotateEditor6 == null) {
                        OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    float translationX3 = (strokesResizeAndRotateEditor6.getTranslationX() + right) - o000000O.OooO0o(10);
                    StrokesResizeAndRotateEditor strokesResizeAndRotateEditor7 = strokesEditorPanel.f76341OooOo0o;
                    if (strokesResizeAndRotateEditor7 == null) {
                        OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    float bottom = strokesResizeAndRotateEditor7.getBottom();
                    StrokesResizeAndRotateEditor strokesResizeAndRotateEditor8 = strokesEditorPanel.f76341OooOo0o;
                    if (strokesResizeAndRotateEditor8 == null) {
                        OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    RectF rectF2 = new RectF(translationX2, translationY2, translationX3, (strokesResizeAndRotateEditor8.getTranslationY() + bottom) - o000000O.OooO0o(10));
                    rectF2.width();
                    strokesEditorPanel.f76342OooOoO.width();
                    LassoParams lassoParamsCopy$default = LassoParams.copy$default(lassoParams2, null, rectF, null, 5, null);
                    StrokesEditorPanel.OooO00o oooO00o2 = strokesEditorPanel.f76352Oooo00o;
                    if (oooO00o2 != null) {
                        oooO00o2.OooO0O0(lassoParamsCopy$default, rectF2);
                        return z;
                    }
                }
                return true;
            default:
                FavoriteToolBox.OooO0O0((FavoriteToolBox) frameLayout, motionEvent);
                return true;
        }
    }
}
