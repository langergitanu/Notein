package com.orion.notein.p607ui.noteeditor.screenshot;

import Oooo0.o000000O;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Size;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.google.gson.Gson;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.screenshot.ScreenshotPanel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0000oOO.AbstractC24338OooO0o0;
import o00o00O0.C25252OooO0Oo;
import o0OOOoo.C27205OooO0OO;
import o0Oo0O00.C28051OooO00o;
import o0OoO000.ViewOnClickListenerC28540OooOoOO;
import o0OoO000.ViewOnClickListenerC28542OooOoo0;
import o0o000.C29725OooO0oO;
import o0o000.C29726OooO0oo;
import o0o000.OooO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo0000O.OooO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u0010J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/screenshot/ScreenshotPanel;", "Landroid/widget/FrameLayout;", "Landroid/util/Size;", "getScreenSize", "()Landroid/util/Size;", "Landroid/graphics/RectF;", "getLastRoiBounds", "()Landroid/graphics/RectF;", "Lcom/orion/notein/ui/noteeditor/screenshot/ScreenshotPanel$OooO00o;", "Oooo0o0", "Lcom/orion/notein/ui/noteeditor/screenshot/ScreenshotPanel$OooO00o;", "getEventListener", "()Lcom/orion/notein/ui/noteeditor/screenshot/ScreenshotPanel$OooO00o;", "setEventListener", "(Lcom/orion/notein/ui/noteeditor/screenshot/ScreenshotPanel$OooO00o;)V", "eventListener", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class ScreenshotPanel extends FrameLayout {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public View f76249OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Handler f76250OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public ViewGroup f76251OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public View f76252OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public View f76253OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public View f76254OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public View f76255OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public View f76256OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public View f76257OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public View f76258Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public View f76259Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public View f76260Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public View f76261Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public View f76262Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final PointF f76263Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final OooO0o f76264Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name and from kotlin metadata */
    public OooO00o eventListener;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public static final int f76247Oooo0oO = Color.parseColor("#99000000");

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public static final int f76248Oooo0oo = o000000O.OooO0o(60);

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static final int f76246Oooo = o000000O.OooO0o(60);

    public interface OooO00o {
        void OooO00o();

        void OooO0O0(C29726OooO0oo c29726OooO0oo);
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.screenshot.ScreenshotPanel$getLastRoiBounds$settings$1", m80623f = "ScreenshotPanel.kt", m80624l = {162}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super AbstractC24338OooO0o0>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f76267OooOo0o;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return ScreenshotPanel.this.new OooO0O0(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super AbstractC24338OooO0o0> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f76267OooOo0o;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return obj;
            }
            C32446OooOOOo.OooO0O0(obj);
            Context context = ScreenshotPanel.this.getContext();
            OooOOO0.OooO0o(context, "getContext(...)");
            InterfaceC33721OooO0o<AbstractC24338OooO0o0> data = C28051OooO00o.OooO00o(context).getData();
            this.f76267OooOo0o = 1;
            Object objOooOOo = C25252OooO0Oo.OooOOo(data, this);
            return objOooOOo == enumC32485OooO00o ? enumC32485OooO00o : objOooOOo;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [o0o000.OooO0o] */
    public ScreenshotPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        OooOOO0.OooO0oO(context, "context");
        this.f76250OooOo0o = new Handler(Looper.getMainLooper());
        this.f76263Oooo0OO = new PointF();
        View.inflate(context, R.layout.layout_screenshot_panel, this);
        this.f76264Oooo0o = new View.OnTouchListener() { // from class: o0o000.OooO0o
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int i = ScreenshotPanel.f76247Oooo0oO;
                int action = motionEvent.getAction();
                ScreenshotPanel screenshotPanel = this.f105400OooOo0o;
                if (action == 0) {
                    screenshotPanel.requestDisallowInterceptTouchEvent(true);
                    screenshotPanel.f76263Oooo0OO.set(motionEvent.getRawX(), motionEvent.getRawY());
                } else if (action == 1) {
                    screenshotPanel.requestDisallowInterceptTouchEvent(false);
                } else if (action == 2) {
                    float rawX = motionEvent.getRawX() - screenshotPanel.f76263Oooo0OO.x;
                    float rawY = motionEvent.getRawY();
                    PointF pointF = screenshotPanel.f76263Oooo0OO;
                    float f = rawY - pointF.y;
                    pointF.set(motionEvent.getRawX(), motionEvent.getRawY());
                    int id = view.getId();
                    if (id != R.id.roi) {
                        switch (id) {
                            case R.id.scale_bottom /* 2131298663 */:
                                screenshotPanel.OooO0O0(rawX, f, 8);
                                break;
                            case R.id.scale_bottom_left /* 2131298664 */:
                                screenshotPanel.OooO0O0(rawX, f, 9);
                                break;
                            case R.id.scale_bottom_right /* 2131298665 */:
                                screenshotPanel.OooO0O0(rawX, f, 10);
                                break;
                            case R.id.scale_left /* 2131298666 */:
                                screenshotPanel.OooO0O0(rawX, f, 1);
                                break;
                            case R.id.scale_right /* 2131298667 */:
                                screenshotPanel.OooO0O0(rawX, f, 2);
                                break;
                            case R.id.scale_top /* 2131298668 */:
                                screenshotPanel.OooO0O0(rawX, f, 4);
                                break;
                            case R.id.scale_top_left /* 2131298669 */:
                                screenshotPanel.OooO0O0(rawX, f, 5);
                                break;
                            case R.id.scale_top_right /* 2131298670 */:
                                screenshotPanel.OooO0O0(rawX, f, 6);
                                break;
                        }
                    } else {
                        int i2 = (int) rawX;
                        int i3 = (int) f;
                        View view2 = screenshotPanel.f76252OooOoO0;
                        if (view2 == null) {
                            OooOOO0.OooOOOO("roi");
                            throw null;
                        }
                        float f2 = -view2.getX();
                        float right = screenshotPanel.getRight();
                        if (screenshotPanel.f76249OooOo == null) {
                            OooOOO0.OooOOOO("editor");
                            throw null;
                        }
                        float width = right - r6.getWidth();
                        View view3 = screenshotPanel.f76252OooOoO0;
                        if (view3 == null) {
                            OooOOO0.OooOOOO("roi");
                            throw null;
                        }
                        float x = view3.getX() + width;
                        View view4 = screenshotPanel.f76249OooOo;
                        if (view4 == null) {
                            OooOOO0.OooOOOO("editor");
                            throw null;
                        }
                        float fMax = Math.max(f2, Math.min(x, view4.getX() + i2));
                        View view5 = screenshotPanel.f76252OooOoO0;
                        if (view5 == null) {
                            OooOOO0.OooOOOO("roi");
                            throw null;
                        }
                        float f3 = -view5.getY();
                        float bottom = screenshotPanel.getBottom();
                        if (screenshotPanel.f76249OooOo == null) {
                            OooOOO0.OooOOOO("editor");
                            throw null;
                        }
                        float height = bottom - r6.getHeight();
                        View view6 = screenshotPanel.f76252OooOoO0;
                        if (view6 == null) {
                            OooOOO0.OooOOOO("roi");
                            throw null;
                        }
                        float y = view6.getY() + height;
                        View view7 = screenshotPanel.f76249OooOo;
                        if (view7 == null) {
                            OooOOO0.OooOOOO("editor");
                            throw null;
                        }
                        float fMax2 = Math.max(f3, Math.min(y, view7.getY() + i3));
                        View view8 = screenshotPanel.f76249OooOo;
                        if (view8 == null) {
                            OooOOO0.OooOOOO("editor");
                            throw null;
                        }
                        view8.setX(fMax);
                        View view9 = screenshotPanel.f76249OooOo;
                        if (view9 == null) {
                            OooOOO0.OooOOOO("editor");
                            throw null;
                        }
                        view9.setY(fMax2);
                        screenshotPanel.OooO0OO();
                        screenshotPanel.invalidate();
                    }
                }
                return true;
            }
        };
    }

    public static void OooO00o(ScreenshotPanel screenshotPanel) {
        int[] iArr = new int[2];
        View view = screenshotPanel.f76252OooOoO0;
        if (view == null) {
            OooOOO0.OooOOOO("roi");
            throw null;
        }
        view.getLocationOnScreen(iArr);
        float f = iArr[0];
        float f2 = iArr[1];
        if (screenshotPanel.f76252OooOoO0 == null) {
            OooOOO0.OooOOOO("roi");
            throw null;
        }
        float width = r5.getWidth() + f;
        if (screenshotPanel.f76252OooOoO0 == null) {
            OooOOO0.OooOOOO("roi");
            throw null;
        }
        C29726OooO0oo c29726OooO0oo = new C29726OooO0oo(new RectF(f, f2, width, r6.getHeight() + f2), screenshotPanel.getScreenSize());
        OooO00o oooO00o = screenshotPanel.eventListener;
        if (oooO00o != null) {
            oooO00o.OooO0O0(c29726OooO0oo);
        }
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(ExecutorC33873OooO0O0.f122045OooOoO0), null, null, new C29725OooO0oO(screenshotPanel, null), 3);
    }

    private final RectF getLastRoiBounds() {
        String str = (String) ((AbstractC24338OooO0o0) C33609OooO0oo.OooO0Oo(OooO.f123416OooOo0o, new OooO0O0(null))).OooO0OO(C27205OooO0OO.f95001OooO);
        if (str != null) {
            try {
                return (RectF) new Gson().fromJson(str, RectF.class);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private final Size getScreenSize() {
        Object systemService = getContext().getSystemService("window");
        OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        Size size = new Size(point.x, point.y);
        C34406OooO00o.f123390OooO00o.OooO00o("getScreenSize screenSize: " + size, new Object[0]);
        return size;
    }

    public final void OooO0O0(float f, float f2, int i) {
        View view = this.f76249OooOo;
        if (view == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i2 = (int) f;
        int i3 = (int) f2;
        int i4 = i & 1;
        int i5 = f76248Oooo0oo;
        if (i4 != 0) {
            int i6 = layoutParams.width;
            View view2 = this.f76249OooOo;
            if (view2 == null) {
                OooOOO0.OooOOOO("editor");
                throw null;
            }
            layoutParams.width = Math.max(i5, view2.getWidth() - i2);
            View view3 = this.f76249OooOo;
            if (view3 == null) {
                OooOOO0.OooOOOO("editor");
                throw null;
            }
            view3.setX(view3.getX() + (i6 - layoutParams.width));
        }
        if ((i & 2) != 0) {
            View view4 = this.f76249OooOo;
            if (view4 == null) {
                OooOOO0.OooOOOO("editor");
                throw null;
            }
            layoutParams.width = Math.max(i5, view4.getWidth() + i2);
        }
        int i7 = i & 4;
        int i8 = f76246Oooo;
        if (i7 != 0) {
            int i9 = layoutParams.height;
            View view5 = this.f76249OooOo;
            if (view5 == null) {
                OooOOO0.OooOOOO("editor");
                throw null;
            }
            layoutParams.height = Math.max(i8, view5.getHeight() - i3);
            View view6 = this.f76249OooOo;
            if (view6 == null) {
                OooOOO0.OooOOOO("editor");
                throw null;
            }
            view6.setY(view6.getY() + (i9 - layoutParams.height));
        }
        if ((i & 8) != 0) {
            View view7 = this.f76249OooOo;
            if (view7 == null) {
                OooOOO0.OooOOOO("editor");
                throw null;
            }
            layoutParams.height = Math.max(i8, view7.getHeight() + i3);
        }
        View view8 = this.f76249OooOo;
        if (view8 == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        view8.setLayoutParams(layoutParams);
        OooO0OO();
        requestLayout();
    }

    public final void OooO0OO() {
        View view = this.f76249OooOo;
        if (view == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        float y = view.getY();
        if (this.f76249OooOo == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        float height = y + r3.getHeight();
        float fOooO0o = o000000O.OooO0o(18);
        int bottom = getBottom();
        if (this.f76251OooOoO == null) {
            OooOOO0.OooOOOO("btnViewGroup");
            throw null;
        }
        float fMin = Math.min(fOooO0o, (bottom - r5.getHeight()) - height);
        ViewGroup viewGroup = this.f76251OooOoO;
        if (viewGroup == null) {
            OooOOO0.OooOOOO("btnViewGroup");
            throw null;
        }
        viewGroup.setY(height + fMin);
        View view2 = this.f76249OooOo;
        if (view2 == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        float x = view2.getX();
        if (this.f76249OooOo == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        float width = x + (r3.getWidth() / 2);
        ViewGroup viewGroup2 = this.f76251OooOoO;
        if (viewGroup2 == null) {
            OooOOO0.OooOOOO("btnViewGroup");
            throw null;
        }
        if (viewGroup2 != null) {
            viewGroup2.setX(Math.max(0.0f, width - (viewGroup2.getWidth() / 2)));
        } else {
            OooOOO0.OooOOOO("btnViewGroup");
            throw null;
        }
    }

    public final OooO00o getEventListener() {
        return this.eventListener;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        OooOOO0.OooO0oO(canvas, "canvas");
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(f76247Oooo0oO);
        View view = this.f76249OooOo;
        if (view == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        float x = view.getX();
        View view2 = this.f76252OooOoO0;
        if (view2 == null) {
            OooOOO0.OooOOOO("roi");
            throw null;
        }
        float x2 = view2.getX() + x;
        View view3 = this.f76249OooOo;
        if (view3 == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        float y = view3.getY();
        View view4 = this.f76252OooOoO0;
        if (view4 == null) {
            OooOOO0.OooOOOO("roi");
            throw null;
        }
        float y2 = view4.getY() + y;
        if (this.f76252OooOoO0 == null) {
            OooOOO0.OooOOOO("roi");
            throw null;
        }
        canvas.drawRect(new RectF(0.0f, y2, x2, r6.getHeight() + y2), paint);
        canvas.drawRect(new RectF(0.0f, 0.0f, getWidth(), y2), paint);
        if (this.f76252OooOoO0 == null) {
            OooOOO0.OooOOOO("roi");
            throw null;
        }
        float width = x2 + r6.getWidth();
        float width2 = getWidth();
        if (this.f76252OooOoO0 == null) {
            OooOOO0.OooOOOO("roi");
            throw null;
        }
        canvas.drawRect(new RectF(width, y2, width2, r8.getHeight() + y2), paint);
        if (this.f76252OooOoO0 != null) {
            canvas.drawRect(new RectF(0.0f, y2 + r4.getHeight(), getWidth(), getHeight()), paint);
        } else {
            OooOOO0.OooOOOO("roi");
            throw null;
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f76249OooOo = findViewById(R.id.editor);
        View viewFindViewById = findViewById(R.id.roi);
        OooO0o oooO0o = this.f76264Oooo0o;
        viewFindViewById.setOnTouchListener(oooO0o);
        this.f76252OooOoO0 = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.scale_left);
        viewFindViewById2.setOnTouchListener(oooO0o);
        this.f76254OooOoo = viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.scale_right);
        viewFindViewById3.setOnTouchListener(oooO0o);
        this.f76257OooOooo = viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.scale_top);
        viewFindViewById4.setOnTouchListener(oooO0o);
        this.f76256OooOooO = viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.scale_bottom);
        viewFindViewById5.setOnTouchListener(oooO0o);
        this.f76259Oooo000 = viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.scale_bottom_left);
        viewFindViewById6.setOnTouchListener(oooO0o);
        this.f76262Oooo0O0 = viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.scale_top_left);
        viewFindViewById7.setOnTouchListener(oooO0o);
        this.f76260Oooo00O = viewFindViewById7;
        View viewFindViewById8 = findViewById(R.id.scale_bottom_right);
        viewFindViewById8.setOnTouchListener(oooO0o);
        this.f76258Oooo0 = viewFindViewById8;
        View viewFindViewById9 = findViewById(R.id.scale_top_right);
        viewFindViewById9.setOnTouchListener(oooO0o);
        this.f76261Oooo00o = viewFindViewById9;
        this.f76251OooOoO = (ViewGroup) findViewById(R.id.cl_btn_opeartion);
        View viewFindViewById10 = findViewById(R.id.btn_done);
        viewFindViewById10.setOnClickListener(new ViewOnClickListenerC28540OooOoOO(this, 2));
        this.f76253OooOoOO = viewFindViewById10;
        View viewFindViewById11 = findViewById(R.id.btn_cancel);
        viewFindViewById11.setOnClickListener(new ViewOnClickListenerC28542OooOoo0(this, 1));
        this.f76255OooOoo0 = viewFindViewById11;
        setWillNotDraw(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0086  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onVisibilityChanged(View changedView, int i) {
        OooOOO0.OooO0oO(changedView, "changedView");
        super.onVisibilityChanged(changedView, i);
        if (i == 0) {
            RectF lastRoiBounds = getLastRoiBounds();
            if (lastRoiBounds != null) {
                float f = lastRoiBounds.right;
                View view = this.f76252OooOoO0;
                if (view == null) {
                    OooOOO0.OooOOOO("roi");
                    throw null;
                }
                if (f - view.getX() <= getWidth()) {
                    float f2 = lastRoiBounds.bottom;
                    View view2 = this.f76252OooOoO0;
                    if (view2 == null) {
                        OooOOO0.OooOOOO("roi");
                        throw null;
                    }
                    if (f2 - view2.getY() > getHeight()) {
                        View view3 = this.f76249OooOo;
                        if (view3 == null) {
                            OooOOO0.OooOOOO("editor");
                            throw null;
                        }
                        int width = getWidth();
                        if (this.f76249OooOo == null) {
                            OooOOO0.OooOOOO("editor");
                            throw null;
                        }
                        view3.setX((width - r2.getWidth()) / 2.0f);
                        View view4 = this.f76249OooOo;
                        if (view4 == null) {
                            OooOOO0.OooOOOO("editor");
                            throw null;
                        }
                        int height = getHeight();
                        if (this.f76249OooOo == null) {
                            OooOOO0.OooOOOO("editor");
                            throw null;
                        }
                        view4.setY((height - r3.getHeight()) / 2.0f);
                    } else {
                        View view5 = this.f76249OooOo;
                        if (view5 == null) {
                            OooOOO0.OooOOOO("editor");
                            throw null;
                        }
                        view5.setX(lastRoiBounds.left);
                        View view6 = this.f76249OooOo;
                        if (view6 == null) {
                            OooOOO0.OooOOOO("editor");
                            throw null;
                        }
                        view6.setY(lastRoiBounds.top);
                        View view7 = this.f76249OooOo;
                        if (view7 == null) {
                            OooOOO0.OooOOOO("editor");
                            throw null;
                        }
                        ViewGroup.LayoutParams layoutParams = view7.getLayoutParams();
                        layoutParams.width = (int) lastRoiBounds.width();
                        layoutParams.height = (int) lastRoiBounds.height();
                        View view8 = this.f76249OooOo;
                        if (view8 == null) {
                            OooOOO0.OooOOOO("editor");
                            throw null;
                        }
                        view8.setLayoutParams(layoutParams);
                    }
                }
            }
            requestLayout();
            this.f76250OooOo0o.post(new Runnable() { // from class: o0o000.OooO0o0
                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = ScreenshotPanel.f76247Oooo0oO;
                    this.f105401OooOo0o.OooO0OO();
                }
            });
        }
    }

    public final void setEventListener(OooO00o oooO00o) {
        this.eventListener = oooO00o;
    }
}
