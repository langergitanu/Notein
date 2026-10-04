package com.orion.notein.p607ui.noteeditor.captureeditor;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.aspose.slides.internal.p332p7.C22236OooO0Oo;
import com.orion.notein.global.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0Oo0ooO.C28460OooooO0;
import oO00ooo.AbstractC32479OooO0OO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0007\bR\u001c\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/captureeditor/CaptureEditorPanel;", "Landroid/widget/FrameLayout;", "", "sourceType", "I", "getSourceType$annotations", "()V", "OooO0O0", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class CaptureEditorPanel extends FrameLayout {

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final float f74443Oooo000 = C28460OooooO0.OooO00o(12.0f);

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public RectF f74444OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public CaptureResizeEditor f74445OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public List<? extends RectF> f74446OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public RectF f74447OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public RectF f74448OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public OooO0O0 f74449OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public PointF f74450OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public String f74451OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public String f74452OooOooo;

    public final class OooO00o extends View.DragShadowBuilder {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Bitmap f74453OooO00o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Bitmap shadow, View view) {
            super(view);
            OooOOO0.OooO0oO(shadow, "shadow");
            OooOOO0.OooO0oO(view, "view");
            this.f74453OooO00o = shadow;
        }

        @Override // android.view.View.DragShadowBuilder
        public final void onDrawShadow(Canvas canvas) {
            OooOOO0.OooO0oO(canvas, "canvas");
            Bitmap bitmap = this.f74453OooO00o;
            canvas.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(0, 0, canvas.getWidth(), canvas.getHeight()), (Paint) null);
        }

        @Override // android.view.View.DragShadowBuilder
        public final void onProvideShadowMetrics(Point size, Point touch) {
            OooOOO0.OooO0oO(size, "size");
            OooOOO0.OooO0oO(touch, "touch");
            Bitmap bitmap = this.f74453OooO00o;
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            size.set(width, height);
            String str = Build.MANUFACTURER;
            if (str == null ? false : str.equalsIgnoreCase("samsung")) {
                touch.set(width / 2, height / 2);
            } else {
                touch.set(0, 0);
            }
        }
    }

    public interface OooO0O0 {
        Object OooO00o(RectF rectF, AbstractC32479OooO0OO abstractC32479OooO0OO);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureEditorPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        OooOOO0.OooO0oO(context, "context");
        this.f74446OooOoO = C34434OooOoO.f123453OooOo0o;
        this.f74450OooOoo0 = new PointF();
        View.inflate(context, R.layout.layout_capture_editor_panel, this);
    }

    private static /* synthetic */ void getSourceType$annotations() {
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f74445OooOo0o = (CaptureResizeEditor) findViewById(R.id.capture_content);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0243  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent event) {
        RectF rectF;
        CaptureResizeEditor captureResizeEditor;
        Object next;
        OooOOO0.OooO0oO(event, "event");
        int actionMasked = event.getActionMasked();
        float f = f74443Oooo000;
        if (actionMasked == 0) {
            RectF rectF2 = this.f74444OooOo;
            if (rectF2 == null) {
                OooOOO0.OooOOOO("editorBounds");
                throw null;
            }
            float f2 = rectF2.left;
            float f3 = rectF2.top;
            RectF rectF3 = new RectF(f2 - f, f3 - f, f2 + f, f3 + f);
            RectF rectF4 = this.f74444OooOo;
            if (rectF4 == null) {
                OooOOO0.OooOOOO("editorBounds");
                throw null;
            }
            float f4 = rectF4.right;
            float f5 = rectF4.top;
            RectF rectF5 = new RectF(f4 - f, f5 - f, f4 + f, f5 + f);
            RectF rectF6 = this.f74444OooOo;
            if (rectF6 == null) {
                OooOOO0.OooOOOO("editorBounds");
                throw null;
            }
            float f6 = rectF6.right;
            float f7 = rectF6.bottom;
            RectF rectF7 = new RectF(f6 - f, f7 - f, f6 + f, f7 + f);
            RectF rectF8 = this.f74444OooOo;
            if (rectF8 == null) {
                OooOOO0.OooOOOO("editorBounds");
                throw null;
            }
            float f8 = rectF8.left;
            float f9 = rectF8.bottom;
            List<? extends RectF> listOooOO0o = C34429OooOOo0.OooOO0o(rectF3, rectF5, rectF7, new RectF(f8 - f, f9 - f, f8 + f, f9 + f));
            this.f74446OooOoO = listOooOO0o;
            Iterator<T> it = listOooOO0o.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((RectF) next).contains(event.getX(), event.getY())) {
                    break;
                }
            }
            RectF rectF9 = (RectF) next;
            this.f74448OooOoOO = rectF9;
            if (rectF9 != null) {
                List<? extends RectF> list = this.f74446OooOoO;
                OooOOO0.OooO0oO(list, "<this>");
                int iIndexOf = list.indexOf(rectF9);
                this.f74450OooOoo0 = new PointF(event.getX(), event.getY());
                C22236OooO0Oo.OooO00o(iIndexOf, "dragHandle index: ", "CaptureEditorPanel");
                return true;
            }
        }
        if (event.getActionMasked() == 2 && (rectF = this.f74448OooOoOO) != null) {
            float x = event.getX() - this.f74450OooOoo0.x;
            float y = event.getY();
            PointF pointF = this.f74450OooOoo0;
            float f10 = y - pointF.y;
            pointF.set(event.getX(), event.getY());
            int iIndexOf2 = this.f74446OooOoO.indexOf(rectF);
            if (iIndexOf2 == 0) {
                RectF rectF10 = this.f74444OooOo;
                if (rectF10 == null) {
                    OooOOO0.OooOOOO("editorBounds");
                    throw null;
                }
                float f11 = 2 * f;
                if (rectF10.width() - x >= f11) {
                    RectF rectF11 = this.f74444OooOo;
                    if (rectF11 == null) {
                        OooOOO0.OooOOOO("editorBounds");
                        throw null;
                    }
                    if (rectF11.height() - f10 >= f11) {
                        RectF rectF12 = this.f74444OooOo;
                        if (rectF12 == null) {
                            OooOOO0.OooOOOO("editorBounds");
                            throw null;
                        }
                        rectF12.left += x;
                        rectF12.top += f10;
                        captureResizeEditor = this.f74445OooOo0o;
                        if (captureResizeEditor != null) {
                        }
                    }
                }
            } else if (iIndexOf2 == 1) {
                RectF rectF13 = this.f74444OooOo;
                if (rectF13 == null) {
                    OooOOO0.OooOOOO("editorBounds");
                    throw null;
                }
                float f12 = 2 * f;
                if (rectF13.width() + x >= f12) {
                    RectF rectF14 = this.f74444OooOo;
                    if (rectF14 == null) {
                        OooOOO0.OooOOOO("editorBounds");
                        throw null;
                    }
                    if (rectF14.height() - f10 >= f12) {
                        RectF rectF15 = this.f74444OooOo;
                        if (rectF15 == null) {
                            OooOOO0.OooOOOO("editorBounds");
                            throw null;
                        }
                        rectF15.right += x;
                        rectF15.top += f10;
                        captureResizeEditor = this.f74445OooOo0o;
                        if (captureResizeEditor != null) {
                        }
                    }
                }
            } else {
                if (iIndexOf2 != 2) {
                    if (iIndexOf2 == 3) {
                        RectF rectF16 = this.f74444OooOo;
                        if (rectF16 == null) {
                            OooOOO0.OooOOOO("editorBounds");
                            throw null;
                        }
                        float f13 = 2 * f;
                        if (rectF16.width() - x >= f13) {
                            RectF rectF17 = this.f74444OooOo;
                            if (rectF17 == null) {
                                OooOOO0.OooOOOO("editorBounds");
                                throw null;
                            }
                            if (rectF17.height() + f10 >= f13) {
                                RectF rectF18 = this.f74444OooOo;
                                if (rectF18 == null) {
                                    OooOOO0.OooOOOO("editorBounds");
                                    throw null;
                                }
                                rectF18.left += x;
                                rectF18.bottom += f10;
                            }
                        }
                    }
                    captureResizeEditor = this.f74445OooOo0o;
                    if (captureResizeEditor != null) {
                        OooOOO0.OooOOOO("captureContent");
                        throw null;
                    }
                    ViewGroup.LayoutParams layoutParams = captureResizeEditor.getLayoutParams();
                    RectF rectF19 = this.f74444OooOo;
                    if (rectF19 == null) {
                        OooOOO0.OooOOOO("editorBounds");
                        throw null;
                    }
                    int i = ((int) f) * 2;
                    layoutParams.width = ((int) rectF19.width()) + i;
                    RectF rectF20 = this.f74444OooOo;
                    if (rectF20 == null) {
                        OooOOO0.OooOOOO("editorBounds");
                        throw null;
                    }
                    layoutParams.height = i + ((int) rectF20.height());
                    CaptureResizeEditor captureResizeEditor2 = this.f74445OooOo0o;
                    if (captureResizeEditor2 == null) {
                        OooOOO0.OooOOOO("captureContent");
                        throw null;
                    }
                    RectF rectF21 = this.f74444OooOo;
                    if (rectF21 == null) {
                        OooOOO0.OooOOOO("editorBounds");
                        throw null;
                    }
                    captureResizeEditor2.setTranslationX(rectF21.left - f);
                    CaptureResizeEditor captureResizeEditor3 = this.f74445OooOo0o;
                    if (captureResizeEditor3 == null) {
                        OooOOO0.OooOOOO("captureContent");
                        throw null;
                    }
                    RectF rectF22 = this.f74444OooOo;
                    if (rectF22 == null) {
                        OooOOO0.OooOOOO("editorBounds");
                        throw null;
                    }
                    captureResizeEditor3.setTranslationY(rectF22.top - f);
                    CaptureResizeEditor captureResizeEditor4 = this.f74445OooOo0o;
                    if (captureResizeEditor4 == null) {
                        OooOOO0.OooOOOO("captureContent");
                        throw null;
                    }
                    captureResizeEditor4.requestLayout();
                    invalidate();
                    return true;
                }
                RectF rectF23 = this.f74444OooOo;
                if (rectF23 == null) {
                    OooOOO0.OooOOOO("editorBounds");
                    throw null;
                }
                float f14 = 2 * f;
                if (rectF23.width() + x >= f14) {
                    RectF rectF24 = this.f74444OooOo;
                    if (rectF24 == null) {
                        OooOOO0.OooOOOO("editorBounds");
                        throw null;
                    }
                    if (rectF24.height() + f10 >= f14) {
                        RectF rectF25 = this.f74444OooOo;
                        if (rectF25 == null) {
                            OooOOO0.OooOOOO("editorBounds");
                            throw null;
                        }
                        rectF25.right += x;
                        rectF25.bottom += f10;
                        captureResizeEditor = this.f74445OooOo0o;
                        if (captureResizeEditor != null) {
                        }
                    }
                }
            }
        } else {
            if (event.getActionMasked() == 1) {
                this.f74448OooOoOO = null;
                return true;
            }
            RectF rectF26 = this.f74444OooOo;
            if (rectF26 == null) {
                OooOOO0.OooOOOO("editorBounds");
                throw null;
            }
            if (rectF26.contains(event.getX(), event.getY()) && event.getActionMasked() == 0) {
                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new com.orion.notein.p607ui.noteeditor.captureeditor.OooO00o(this, null), 3);
                return true;
            }
            if (event.getActionMasked() == 0) {
                RectF rectF27 = this.f74444OooOo;
                if (rectF27 == null) {
                    OooOOO0.OooOOOO("editorBounds");
                    throw null;
                }
                if (!rectF27.contains(event.getX(), event.getY())) {
                    setVisibility(8);
                    return true;
                }
            }
        }
        return true;
    }
}
