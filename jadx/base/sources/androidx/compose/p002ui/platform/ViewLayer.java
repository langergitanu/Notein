package androidx.compose.p002ui.platform;

import OooOo.C20496Oooo0o0;
import OooooO0.C21288OooO0Oo;
import OooooO0.C21290OooO0o0;
import OooooO0.C21293OooOO0;
import OooooO0.C21294OooOO0O;
import OooooOO.C21325OooOooo;
import OooooOO.C21343OoooOOo;
import OooooOO.C21355Ooooooo;
import OooooOO.C21359o00Ooo;
import OooooOO.InterfaceC21342OoooOOO;
import OooooOO.InterfaceC21361o00oO0O;
import OooooOO.InterfaceC21370ooOO;
import OooooOO.o0OO00O;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o0000Ooo.C24226OooO;
import o0000Ooo.EnumC24238OooOOO;
import o0000Ooo.InterfaceC24229OooO0OO;
import o00oO0O.AbstractC25521OoooO;
import o00oO0O.InterfaceC25540Oooooo;
import o0ooOO0.o000O0;
import o0ooOO0.o000OO0O;
import o0ooOO0.o0Oo0oo;
import o0ooOO0.oo0o0Oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002*+R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR*\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR$\u0010%\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020 8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0016\u0010)\u001a\u0004\u0018\u00010&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006,"}, m80612d2 = {"Landroidx/compose/ui/platform/ViewLayer;", "Landroid/view/View;", "Lo00oO0O/Oooooo;", "", "Landroidx/compose/ui/platform/AndroidComposeView;", "OooOo0o", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Landroidx/compose/ui/platform/DrawChildContainer;", "OooOo", "Landroidx/compose/ui/platform/DrawChildContainer;", "getContainer", "()Landroidx/compose/ui/platform/DrawChildContainer;", "container", "", "value", "OooOooO", "Z", "isInvalidated", "()Z", "setInvalidated", "(Z)V", "", "Oooo0O0", "J", "getLayerId", "()J", "layerId", "getOwnerViewId", "ownerViewId", "", "getCameraDistancePx", "()F", "setCameraDistancePx", "(F)V", "cameraDistancePx", "LOooooOO/ooOO;", "getManualClipPath", "()LOooooOO/ooOO;", "manualClipPath", "OooO0OO", "OooO0Oo", "ui_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class ViewLayer extends View implements InterfaceC25540Oooooo {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static boolean f63520Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static Method f63522Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public static Field f63524Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public static boolean f63525Oooo0oo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name and from kotlin metadata */
    public final DrawChildContainer container;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name and from kotlin metadata */
    public final AndroidComposeView ownerView;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public AbstractC25521OoooO.OooO0o f63528OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public AbstractC25521OoooO f63529OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final oo0o0Oo f63530OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public Rect f63531OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f63532OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name and from kotlin metadata */
    public boolean isInvalidated;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public boolean f63534OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public boolean f63535Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C21343OoooOOo f63536Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final o0Oo0oo<View> f63537Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public long f63538Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name and from kotlin metadata */
    public final long layerId;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public static final OooO0O0 f63521Oooo0OO = OooO0O0.f63540OooOo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public static final OooO00o f63523Oooo0o0 = new OooO00o();

    public static final class OooO00o extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            OooOOO0.OooO0oO(view, "view");
            OooOOO0.OooO0oO(outline, "outline");
            Outline outlineOooO0O0 = ((ViewLayer) view).f63530OooOoOO.OooO0O0();
            OooOOO0.OooO0Oo(outlineOooO0O0);
            outline.set(outlineOooO0O0);
        }
    }

    public static final class OooO0O0 extends OooOOOO implements InterfaceC32508OooOOOo<View, Matrix, C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0O0 f63540OooOo0o = new OooO0O0(2);

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final C32460OooOooO invoke(View view, Matrix matrix) {
            View view2 = view;
            Matrix matrix2 = matrix;
            OooOOO0.OooO0oO(view2, "view");
            OooOOO0.OooO0oO(matrix2, "matrix");
            matrix2.set(view2.getMatrix());
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooO0OO {
        public static void OooO00o(View view) {
            try {
                if (!ViewLayer.f63525Oooo0oo) {
                    ViewLayer.f63525Oooo0oo = true;
                    if (Build.VERSION.SDK_INT < 28) {
                        ViewLayer.f63522Oooo0o = View.class.getDeclaredMethod("updateDisplayListIfDirty", new Class[0]);
                        ViewLayer.f63524Oooo0oO = View.class.getDeclaredField("mRecreateDisplayList");
                    } else {
                        ViewLayer.f63522Oooo0o = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                        ViewLayer.f63524Oooo0oO = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                    }
                    Method method = ViewLayer.f63522Oooo0o;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Field field = ViewLayer.f63524Oooo0oO;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                Field field2 = ViewLayer.f63524Oooo0oO;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                Method method2 = ViewLayer.f63522Oooo0o;
                if (method2 != null) {
                    method2.invoke(view, new Object[0]);
                }
            } catch (Throwable unused) {
                ViewLayer.f63520Oooo = true;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.ViewLayer$OooO0Oo, reason: case insensitive filesystem */
    public static final class C21613OooO0Oo {
        public static final long OooO00o(View view) {
            OooOOO0.OooO0oO(view, "view");
            return view.getUniqueDrawingId();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewLayer(AndroidComposeView ownerView, DrawChildContainer container, AbstractC25521OoooO abstractC25521OoooO, AbstractC25521OoooO.OooO0o invalidateParentLayer) {
        super(ownerView.getContext());
        OooOOO0.OooO0oO(ownerView, "ownerView");
        OooOOO0.OooO0oO(container, "container");
        OooOOO0.OooO0oO(invalidateParentLayer, "invalidateParentLayer");
        this.ownerView = ownerView;
        this.container = container;
        this.f63529OooOoO0 = abstractC25521OoooO;
        this.f63528OooOoO = invalidateParentLayer;
        this.f63530OooOoOO = new oo0o0Oo(ownerView.getDensity());
        this.f63536Oooo000 = new C21343OoooOOo();
        this.f63537Oooo00O = new o0Oo0oo<>(f63521Oooo0OO);
        this.f63538Oooo00o = o0OO00O.f61796OooO0O0;
        this.f63535Oooo0 = true;
        setWillNotDraw(false);
        container.addView(this);
        this.layerId = View.generateViewId();
    }

    private final InterfaceC21370ooOO getManualClipPath() {
        if (!getClipToOutline()) {
            return null;
        }
        oo0o0Oo oo0o0oo = this.f63530OooOoOO;
        if (!oo0o0oo.f112937OooO) {
            return null;
        }
        oo0o0oo.OooO0o0();
        return oo0o0oo.f112944OooO0oO;
    }

    private final void setInvalidated(boolean z) {
        if (z != this.isInvalidated) {
            this.isInvalidated = z;
            this.ownerView.OooOO0o(this, z);
        }
    }

    @Override // o00oO0O.InterfaceC25540Oooooo
    public final void OooO() {
        if (!this.isInvalidated || f63520Oooo) {
            return;
        }
        setInvalidated(false);
        OooO0OO.OooO00o(this);
    }

    @Override // o00oO0O.InterfaceC25540Oooooo
    public final void OooO00o(float f, float f2, float f3, float f4, float f5, long j, InterfaceC21361o00oO0O shape, boolean z, long j2, long j3, EnumC24238OooOOO layoutDirection, InterfaceC24229OooO0OO density) {
        AbstractC25521OoooO.OooO0o oooO0o;
        OooOOO0.OooO0oO(shape, "shape");
        OooOOO0.OooO0oO(layoutDirection, "layoutDirection");
        OooOOO0.OooO0oO(density, "density");
        this.f63538Oooo00o = j;
        setScaleX(f);
        setScaleY(f2);
        setAlpha(f3);
        setTranslationX(0.0f);
        setTranslationY(0.0f);
        setElevation(f4);
        setRotation(0.0f);
        setRotationX(0.0f);
        setRotationY(0.0f);
        long j4 = this.f63538Oooo00o;
        int i = o0OO00O.f61797OooO0OO;
        setPivotX(Float.intBitsToFloat((int) (j4 >> 32)) * getWidth());
        setPivotY(Float.intBitsToFloat((int) (this.f63538Oooo00o & 4294967295L)) * getHeight());
        setCameraDistancePx(f5);
        C21359o00Ooo.OooO00o oooO00o = C21359o00Ooo.f61779OooO00o;
        this.f63532OooOoo0 = z && shape == oooO00o;
        OooOO0();
        boolean z2 = getManualClipPath() != null;
        setClipToOutline(z && shape != oooO00o);
        boolean zOooO0Oo = this.f63530OooOoOO.OooO0Oo(shape, getAlpha(), getClipToOutline(), getElevation(), layoutDirection, density);
        setOutlineProvider(this.f63530OooOoOO.OooO0O0() != null ? f63523Oooo0o0 : null);
        boolean z3 = getManualClipPath() != null;
        if (z2 != z3 || (z3 && zOooO0Oo)) {
            invalidate();
        }
        if (!this.f63534OooOooo && getElevation() > 0.0f && (oooO0o = this.f63528OooOoO) != null) {
            oooO0o.invoke();
        }
        this.f63537Oooo00O.OooO0OO();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            o000O0 o000o0 = o000O0.f112847OooO00o;
            o000o0.OooO00o(this, C20496Oooo0o0.OooO0oo(j2));
            o000o0.OooO0O0(this, C20496Oooo0o0.OooO0oo(j3));
        }
        if (i2 >= 31) {
            o000OO0O.f112865OooO00o.OooO00o(this, null);
        }
        setLayerType(0, null);
        this.f63535Oooo0 = true;
    }

    @Override // o00oO0O.InterfaceC25540Oooooo
    public final void OooO0O0(InterfaceC21342OoooOOO canvas) {
        OooOOO0.OooO0oO(canvas, "canvas");
        boolean z = getElevation() > 0.0f;
        this.f63534OooOooo = z;
        if (z) {
            canvas.OooOOOO();
        }
        this.container.OooO00o(canvas, this, getDrawingTime());
        if (this.f63534OooOooo) {
            canvas.OooO0o0();
        }
    }

    @Override // o00oO0O.InterfaceC25540Oooooo
    public final long OooO0OO(long j, boolean z) {
        o0Oo0oo<View> o0oo0oo2 = this.f63537Oooo00O;
        if (!z) {
            return C21355Ooooooo.OooO0OO(o0oo0oo2.OooO0O0(this), j);
        }
        float[] fArrOooO00o = o0oo0oo2.OooO00o(this);
        return fArrOooO00o != null ? C21355Ooooooo.OooO0OO(fArrOooO00o, j) : C21290OooO0o0.f61719OooO0OO;
    }

    @Override // o00oO0O.InterfaceC25540Oooooo
    public final void OooO0Oo(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (i == getWidth() && i2 == getHeight()) {
            return;
        }
        long j2 = this.f63538Oooo00o;
        int i3 = o0OO00O.f61797OooO0OO;
        float f = i;
        setPivotX(Float.intBitsToFloat((int) (j2 >> 32)) * f);
        float f2 = i2;
        setPivotY(Float.intBitsToFloat((int) (4294967295L & this.f63538Oooo00o)) * f2);
        long jOooO00o = C21294OooOO0O.OooO00o(f, f2);
        oo0o0Oo oo0o0oo = this.f63530OooOoOO;
        if (!C21293OooOO0.OooO00o(oo0o0oo.f112941OooO0Oo, jOooO00o)) {
            oo0o0oo.f112941OooO0Oo = jOooO00o;
            oo0o0oo.f112945OooO0oo = true;
        }
        setOutlineProvider(oo0o0oo.OooO0O0() != null ? f63523Oooo0o0 : null);
        layout(getLeft(), getTop(), getLeft() + i, getTop() + i2);
        OooOO0();
        this.f63537Oooo00O.OooO0OO();
    }

    @Override // o00oO0O.InterfaceC25540Oooooo
    public final void OooO0o(AbstractC25521OoooO abstractC25521OoooO, AbstractC25521OoooO.OooO0o invalidateParentLayer) {
        OooOOO0.OooO0oO(invalidateParentLayer, "invalidateParentLayer");
        this.container.addView(this);
        this.f63532OooOoo0 = false;
        this.f63534OooOooo = false;
        this.f63538Oooo00o = o0OO00O.f61796OooO0O0;
        this.f63529OooOoO0 = abstractC25521OoooO;
        this.f63528OooOoO = invalidateParentLayer;
    }

    @Override // o00oO0O.InterfaceC25540Oooooo
    public final void OooO0o0(C21288OooO0Oo c21288OooO0Oo, boolean z) {
        o0Oo0oo<View> o0oo0oo2 = this.f63537Oooo00O;
        if (!z) {
            C21355Ooooooo.OooO0Oo(o0oo0oo2.OooO0O0(this), c21288OooO0Oo);
            return;
        }
        float[] fArrOooO00o = o0oo0oo2.OooO00o(this);
        if (fArrOooO00o != null) {
            C21355Ooooooo.OooO0Oo(fArrOooO00o, c21288OooO0Oo);
            return;
        }
        c21288OooO0Oo.f61714OooO00o = 0.0f;
        c21288OooO0Oo.f61715OooO0O0 = 0.0f;
        c21288OooO0Oo.f61716OooO0OO = 0.0f;
        c21288OooO0Oo.f61717OooO0Oo = 0.0f;
    }

    @Override // o00oO0O.InterfaceC25540Oooooo
    public final boolean OooO0oO(long j) {
        float fOooO0OO = C21290OooO0o0.OooO0OO(j);
        float fOooO0Oo = C21290OooO0o0.OooO0Oo(j);
        if (this.f63532OooOoo0) {
            return 0.0f <= fOooO0OO && fOooO0OO < ((float) getWidth()) && 0.0f <= fOooO0Oo && fOooO0Oo < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.f63530OooOoOO.OooO0OO(j);
        }
        return true;
    }

    @Override // o00oO0O.InterfaceC25540Oooooo
    public final void OooO0oo(long j) {
        int i = C24226OooO.f81469OooO0OO;
        int i2 = (int) (j >> 32);
        int left = getLeft();
        o0Oo0oo<View> o0oo0oo2 = this.f63537Oooo00O;
        if (i2 != left) {
            offsetLeftAndRight(i2 - getLeft());
            o0oo0oo2.OooO0OO();
        }
        int i3 = (int) (j & 4294967295L);
        if (i3 != getTop()) {
            offsetTopAndBottom(i3 - getTop());
            o0oo0oo2.OooO0OO();
        }
    }

    public final void OooOO0() {
        Rect rect;
        if (this.f63532OooOoo0) {
            Rect rect2 = this.f63531OooOoo;
            if (rect2 == null) {
                this.f63531OooOoo = new Rect(0, 0, getWidth(), getHeight());
            } else {
                OooOOO0.OooO0Oo(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.f63531OooOoo;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    @Override // o00oO0O.InterfaceC25540Oooooo
    public final void destroy() {
        setInvalidated(false);
        AndroidComposeView androidComposeView = this.ownerView;
        androidComposeView.f63388OoooO00 = true;
        this.f63529OooOoO0 = null;
        this.f63528OooOoO = null;
        androidComposeView.OooOo00(this);
        this.container.removeViewInLayout(this);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        OooOOO0.OooO0oO(canvas, "canvas");
        boolean z = false;
        setInvalidated(false);
        C21343OoooOOo c21343OoooOOo = this.f63536Oooo000;
        C21325OooOooo c21325OooOooo = c21343OoooOOo.f61756OooO00o;
        Canvas canvas2 = c21325OooOooo.f61733OooO00o;
        c21325OooOooo.f61733OooO00o = canvas;
        InterfaceC21370ooOO manualClipPath = getManualClipPath();
        C21325OooOooo c21325OooOooo2 = c21343OoooOOo.f61756OooO00o;
        if (manualClipPath != null || !canvas.isHardwareAccelerated()) {
            c21325OooOooo2.OooOOo0();
            this.f63530OooOoOO.OooO00o(c21325OooOooo2);
            z = true;
        }
        AbstractC25521OoooO abstractC25521OoooO = this.f63529OooOoO0;
        if (abstractC25521OoooO != null) {
            abstractC25521OoooO.invoke(c21325OooOooo2);
        }
        if (z) {
            c21325OooOooo2.OooOO0o();
        }
        c21325OooOooo2.getClass();
        OooOOO0.OooO0oO(canvas2, "<set-?>");
        c21325OooOooo2.f61733OooO00o = canvas2;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final DrawChildContainer getContainer() {
        return this.container;
    }

    public long getLayerId() {
        return this.layerId;
    }

    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return C21613OooO0Oo.OooO00o(this.ownerView);
        }
        return -1L;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f63535Oooo0;
    }

    @Override // android.view.View, o00oO0O.InterfaceC25540Oooooo
    public final void invalidate() {
        if (this.isInvalidated) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.ownerView.invalidate();
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public final void setCameraDistancePx(float f) {
        setCameraDistance(f * getResources().getDisplayMetrics().densityDpi);
    }
}
