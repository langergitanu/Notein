package androidx.camera.view;

import OooOOo.AbstractC20461OooO0O0;
import OooOOo.C20462OooO0Oo;
import OooOOo.InterfaceC20460OooO00o;
import OooOOoo.C20469OooO00o;
import OooOOoo.C20470OooO0O0;
import OooOo0.C20497OooO00o;
import OooOo0.C20498OooO0O0;
import OooOo00.C20499OooO0Oo;
import OooOo00.C20500OooO0o0;
import OooOo0O.C20501OooO00o;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.camera.view.PreviewView;
import androidx.core.content.ContextCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.C21996Oooo0OO;
import androidx.lifecycle.Oooo0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class PreviewView extends FrameLayout {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final /* synthetic */ int f63278OooOooo = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final ScreenFlashView f63279OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public OooO0OO f63280OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C21996Oooo0OO<EnumC21596OooO0o0> f63281OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final androidx.camera.view.OooO00o f63282OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C20499OooO0Oo f63283OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final OooOo00.OooO0O0 f63284OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final OooO0O0 f63285OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final OooO00o f63286OooOooO;

    public class OooO00o implements OooOOo.OooO0OO {
    }

    public class OooO0O0 implements DisplayManager.DisplayListener {
        public OooO0O0() {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i) {
            PreviewView previewView = PreviewView.this;
            Display defaultDisplay = previewView.getDefaultDisplay();
            if (defaultDisplay == null || defaultDisplay.getDisplayId() != i) {
                return;
            }
            previewView.OooO00o();
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i) {
        }
    }

    public enum OooO0OO {
        PERFORMANCE(0),
        /* JADX INFO: Fake field, exist only in values array */
        COMPATIBLE(1);


        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final int f63290OooOo0o;

        OooO0OO(int i) {
            this.f63290OooOo0o = i;
        }
    }

    /* JADX INFO: renamed from: androidx.camera.view.PreviewView$OooO0Oo, reason: case insensitive filesystem */
    public enum EnumC21595OooO0Oo {
        /* JADX INFO: Fake field, exist only in values array */
        FILL_START(0),
        FILL_CENTER(1),
        /* JADX INFO: Fake field, exist only in values array */
        FILL_END(2),
        /* JADX INFO: Fake field, exist only in values array */
        FIT_START(3),
        /* JADX INFO: Fake field, exist only in values array */
        FIT_CENTER(4),
        /* JADX INFO: Fake field, exist only in values array */
        FIT_END(5);


        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final int f63293OooOo0o;

        EnumC21595OooO0Oo(int i) {
            this.f63293OooOo0o = i;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: androidx.camera.view.PreviewView$OooO0o0, reason: case insensitive filesystem */
    public static final class EnumC21596OooO0o0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final /* synthetic */ EnumC21596OooO0o0[] f63294OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final EnumC21596OooO0o0 f63295OooOo0o;

        static {
            EnumC21596OooO0o0 enumC21596OooO0o0 = new EnumC21596OooO0o0("IDLE", 0);
            f63295OooOo0o = enumC21596OooO0o0;
            f63294OooOo = new EnumC21596OooO0o0[]{enumC21596OooO0o0, new EnumC21596OooO0o0("STREAMING", 1)};
        }

        public EnumC21596OooO0o0() {
            throw null;
        }

        public static EnumC21596OooO0o0 valueOf(String str) {
            return (EnumC21596OooO0o0) Enum.valueOf(EnumC21596OooO0o0.class, str);
        }

        public static EnumC21596OooO0o0[] values() {
            return (EnumC21596OooO0o0[]) f63294OooOo.clone();
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [OooOo00.OooO0O0] */
    public PreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        this.f63280OooOo0o = OooO0OO.PERFORMANCE;
        androidx.camera.view.OooO00o oooO00o = new androidx.camera.view.OooO00o();
        oooO00o.f63277OooO00o = EnumC21595OooO0Oo.FILL_CENTER;
        this.f63282OooOoO0 = oooO00o;
        this.f63281OooOoO = new C21996Oooo0OO<>(0);
        new AtomicReference();
        this.f63283OooOoOO = new C20499OooO0Oo();
        this.f63285OooOoo0 = new OooO0O0();
        this.f63284OooOoo = new View.OnLayoutChangeListener() { // from class: OooOo00.OooO0O0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                int i9 = PreviewView.f63278OooOooo;
                PreviewView previewView = this.f58558OooOo0o;
                if (i3 - i == i7 - i5 && i4 - i2 == i8 - i6) {
                    return;
                }
                previewView.OooO00o();
                C20469OooO00o.OooO00o();
                previewView.getViewPort();
            }
        };
        this.f63286OooOooO = new OooO00o();
        C20469OooO00o.OooO00o();
        Resources.Theme theme = context.getTheme();
        int[] iArr = C20500OooO0o0.f58559OooO00o;
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        try {
            int integer = typedArrayObtainStyledAttributes.getInteger(1, oooO00o.f63277OooO00o.f63293OooOo0o);
            for (EnumC21595OooO0Oo enumC21595OooO0Oo : EnumC21595OooO0Oo.values()) {
                if (enumC21595OooO0Oo.f63293OooOo0o == integer) {
                    setScaleType(enumC21595OooO0Oo);
                    int integer2 = typedArrayObtainStyledAttributes.getInteger(0, 0);
                    for (OooO0OO oooO0OO : OooO0OO.values()) {
                        if (oooO0OO.f63290OooOo0o == integer2) {
                            setImplementationMode(oooO0OO);
                            typedArrayObtainStyledAttributes.recycle();
                            ViewConfiguration.get(context).getScaledTouchSlop();
                            new GestureDetector(context, new C20497OooO00o(new C20498OooO0O0()));
                            if (getBackground() == null) {
                                setBackgroundColor(ContextCompat.getColor(getContext(), R.color.black));
                            }
                            ScreenFlashView screenFlashView = new ScreenFlashView(context, null, 0, 0);
                            screenFlashView.setBackgroundColor(-1);
                            screenFlashView.setAlpha(0.0f);
                            screenFlashView.setElevation(Float.MAX_VALUE);
                            this.f63279OooOo = screenFlashView;
                            screenFlashView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                            return;
                        }
                    }
                    throw new IllegalArgumentException("Unknown implementation mode id " + integer2);
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + integer);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getSystemService("display");
    }

    private InterfaceC20460OooO00o getScreenFlashInternal() {
        return this.f63279OooOo.getScreenFlash();
    }

    private int getViewPortScaleType() {
        int iOrdinal = getScaleType().ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
                    throw new IllegalStateException("Unexpected scale type: " + getScaleType());
                }
            }
        }
        return i;
    }

    private void setScreenFlashUiInfo(InterfaceC20460OooO00o interfaceC20460OooO00o) {
        Log.d("PreviewView", "setScreenFlashUiInfo: mCameraController is null!");
    }

    public final void OooO00o() {
        C20469OooO00o.OooO00o();
        C20499OooO0Oo c20499OooO0Oo = this.f63283OooOoOO;
        Size size = new Size(getWidth(), getHeight());
        getLayoutDirection();
        c20499OooO0Oo.getClass();
        C20469OooO00o.OooO00o();
        synchronized (c20499OooO0Oo) {
            try {
                if (size.getWidth() != 0) {
                    size.getHeight();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Bitmap getBitmap() {
        C20469OooO00o.OooO00o();
        return null;
    }

    public OooOo00.OooO00o getController() {
        C20469OooO00o.OooO00o();
        return null;
    }

    public Display getDefaultDisplay() {
        if (getDisplay() == null) {
            return null;
        }
        Display display = getDisplayManager().getDisplay(0);
        return display != null ? display : getDisplay();
    }

    public OooO0OO getImplementationMode() {
        C20469OooO00o.OooO00o();
        return this.f63280OooOo0o;
    }

    public AbstractC20461OooO0O0 getMeteringPointFactory() {
        C20469OooO00o.OooO00o();
        return this.f63283OooOoOO;
    }

    public C20501OooO00o getOutputTransform() {
        androidx.camera.view.OooO00o oooO00o = this.f63282OooOoO0;
        C20469OooO00o.OooO00o();
        try {
            new Size(getWidth(), getHeight());
            getLayoutDirection();
            oooO00o.getClass();
            Preconditions.checkState(false);
            int i = C20470OooO0O0.f58447OooO00o;
            throw null;
        } catch (IllegalStateException unused) {
            oooO00o.getClass();
            Log.d("PreviewView", "Transform info is not ready");
            return null;
        }
    }

    public Oooo0<EnumC21596OooO0o0> getPreviewStreamState() {
        return this.f63281OooOoO;
    }

    public EnumC21595OooO0Oo getScaleType() {
        C20469OooO00o.OooO00o();
        return this.f63282OooOoO0.f63277OooO00o;
    }

    public InterfaceC20460OooO00o getScreenFlash() {
        return getScreenFlashInternal();
    }

    public Matrix getSensorToViewTransform() {
        C20469OooO00o.OooO00o();
        if (getWidth() != 0 && getHeight() != 0) {
            new Size(getWidth(), getHeight());
            getLayoutDirection();
            this.f63282OooOoO0.getClass();
        }
        return null;
    }

    public OooOOo.OooO0OO getSurfaceProvider() {
        C20469OooO00o.OooO00o();
        return this.f63286OooOooO;
    }

    public C20462OooO0Oo getViewPort() {
        C20469OooO00o.OooO00o();
        Display defaultDisplay = getDefaultDisplay();
        if (defaultDisplay == null) {
            return null;
        }
        defaultDisplay.getRotation();
        C20469OooO00o.OooO00o();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        Rational rational = new Rational(getWidth(), getHeight());
        getViewPortScaleType();
        getLayoutDirection();
        Preconditions.checkNotNull(rational, "The crop aspect ratio must be set.");
        return new C20462OooO0Oo();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        DisplayManager displayManager;
        super.onAttachedToWindow();
        if (!isInEditMode() && (displayManager = getDisplayManager()) != null) {
            displayManager.registerDisplayListener(this.f63285OooOoo0, new Handler(Looper.getMainLooper()));
        }
        addOnLayoutChangeListener(this.f63284OooOoo);
        C20469OooO00o.OooO00o();
        getViewPort();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        DisplayManager displayManager;
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.f63284OooOoo);
        if (isInEditMode() || (displayManager = getDisplayManager()) == null) {
            return;
        }
        displayManager.unregisterDisplayListener(this.f63285OooOoo0);
    }

    public void setController(OooOo00.OooO00o oooO00o) {
        C20469OooO00o.OooO00o();
        C20469OooO00o.OooO00o();
        getViewPort();
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public void setImplementationMode(OooO0OO oooO0OO) {
        C20469OooO00o.OooO00o();
        this.f63280OooOo0o = oooO0OO;
    }

    public void setScaleType(EnumC21595OooO0Oo enumC21595OooO0Oo) {
        C20469OooO00o.OooO00o();
        this.f63282OooOoO0.f63277OooO00o = enumC21595OooO0Oo;
        OooO00o();
        C20469OooO00o.OooO00o();
        getViewPort();
    }

    public void setScreenFlashOverlayColor(int i) {
        this.f63279OooOo.setBackgroundColor(i);
    }

    public void setScreenFlashWindow(Window window) {
        C20469OooO00o.OooO00o();
        this.f63279OooOo.setScreenFlashWindow(window);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }
}
