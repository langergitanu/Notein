package com.facebook.drawee.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import o00o0Ooo.C25431OooO0oo;
import o00oO00O.C25476OooO0OO;
import o00oOO.C25579OooO00o;
import o00oOO.C25580OooO0O0;
import o00ooO.C25732OooO0O0;
import o0oOOo.C30841OooO0Oo;
import o0ooOO.InterfaceC31496OooO00o;
import o0ooOO.InterfaceC31497OooO0O0;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class DraweeView<DH extends InterfaceC31497OooO0O0> extends ImageView {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static boolean f67238OooOoo = false;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public float f67239OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C25579OooO00o f67240OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f67241OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C25580OooO0O0<DH> f67242OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f67243OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public Object f67244OooOoo0;

    public DraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f67240OooOo0o = new C25579OooO00o();
        this.f67239OooOo = 0.0f;
        this.f67241OooOoO = false;
        this.f67243OooOoOO = false;
        this.f67244OooOoo0 = null;
        OooO00o(context);
    }

    public static void setGlobalLegacyVisibilityHandlingEnabled(boolean z) {
        f67238OooOoo = z;
    }

    public final void OooO00o(Context context) {
        try {
            C25732OooO0O0.OooO00o();
            if (this.f67241OooOoO) {
                C25732OooO0O0.OooO00o();
                return;
            }
            boolean z = true;
            this.f67241OooOoO = true;
            this.f67242OooOoO0 = new C25580OooO0O0<>();
            ColorStateList imageTintList = getImageTintList();
            if (imageTintList == null) {
                C25732OooO0O0.OooO00o();
                return;
            }
            setColorFilter(imageTintList.getDefaultColor());
            if (!f67238OooOoo || context.getApplicationInfo().targetSdkVersion < 24) {
                z = false;
            }
            this.f67243OooOoOO = z;
            C25732OooO0O0.OooO00o();
        } catch (Throwable th) {
            C25732OooO0O0.OooO00o();
            throw th;
        }
    }

    public final void OooO0O0() {
        Drawable drawable;
        if (!this.f67243OooOoOO || (drawable = getDrawable()) == null) {
            return;
        }
        drawable.setVisible(getVisibility() == 0, false);
    }

    public float getAspectRatio() {
        return this.f67239OooOo;
    }

    public InterfaceC31496OooO00o getController() {
        return this.f67242OooOoO0.f87264OooO0o0;
    }

    public Object getExtraData() {
        return this.f67244OooOoo0;
    }

    public DH getHierarchy() {
        DH dh = this.f67242OooOoO0.f87262OooO0Oo;
        dh.getClass();
        return dh;
    }

    public Drawable getTopLevelDrawable() {
        DH dh = this.f67242OooOoO0.f87262OooO0Oo;
        if (dh == null) {
            return null;
        }
        return dh.OooO0O0();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        OooO0O0();
        C25580OooO0O0<DH> c25580OooO0O0 = this.f67242OooOoO0;
        c25580OooO0O0.f87263OooO0o.OooO00o(C25476OooO0OO.OooO00o.f86813Oooo0OO);
        c25580OooO0O0.f87260OooO0O0 = true;
        c25580OooO0O0.OooO0O0();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        OooO0O0();
        C25580OooO0O0<DH> c25580OooO0O0 = this.f67242OooOoO0;
        c25580OooO0O0.f87263OooO0o.OooO00o(C25476OooO0OO.OooO00o.f86815Oooo0o0);
        c25580OooO0O0.f87260OooO0O0 = false;
        c25580OooO0O0.OooO0O0();
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        OooO0O0();
        C25580OooO0O0<DH> c25580OooO0O0 = this.f67242OooOoO0;
        c25580OooO0O0.f87263OooO0o.OooO00o(C25476OooO0OO.OooO00o.f86813Oooo0OO);
        c25580OooO0O0.f87260OooO0O0 = true;
        c25580OooO0O0.OooO0O0();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        C25579OooO00o c25579OooO00o = this.f67240OooOo0o;
        c25579OooO00o.f87257OooO00o = i;
        c25579OooO00o.f87258OooO0O0 = i2;
        float f = this.f67239OooOo;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (f > 0.0f && layoutParams != null) {
            int i3 = layoutParams.height;
            if (i3 == 0 || i3 == -2) {
                c25579OooO00o.f87258OooO0O0 = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(c25579OooO00o.f87257OooO00o) - paddingRight) / f) + paddingBottom), c25579OooO00o.f87258OooO0O0), 1073741824);
            } else {
                int i4 = layoutParams.width;
                if (i4 == 0 || i4 == -2) {
                    c25579OooO00o.f87257OooO00o = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(c25579OooO00o.f87258OooO0O0) - paddingBottom) * f) + paddingRight), c25579OooO00o.f87257OooO00o), 1073741824);
                }
            }
        }
        super.onMeasure(c25579OooO00o.f87257OooO00o, c25579OooO00o.f87258OooO0O0);
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        OooO0O0();
        C25580OooO0O0<DH> c25580OooO0O0 = this.f67242OooOoO0;
        c25580OooO0O0.f87263OooO0o.OooO00o(C25476OooO0OO.OooO00o.f86815Oooo0o0);
        c25580OooO0O0.f87260OooO0O0 = false;
        c25580OooO0O0.OooO0O0();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C25580OooO0O0<DH> c25580OooO0O0 = this.f67242OooOoO0;
        if (!c25580OooO0O0.OooO0OO() ? false : c25580OooO0O0.f87264OooO0o0.OooO00o(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        OooO0O0();
    }

    public void setAspectRatio(float f) {
        if (f == this.f67239OooOo) {
            return;
        }
        this.f67239OooOo = f;
        requestLayout();
    }

    public void setController(InterfaceC31496OooO00o interfaceC31496OooO00o) {
        this.f67242OooOoO0.OooO0o0(interfaceC31496OooO00o);
        DH dh = this.f67242OooOoO0.f87262OooO0Oo;
        super.setImageDrawable(dh == null ? null : dh.OooO0O0());
    }

    public void setExtraData(Object obj) {
        this.f67244OooOoo0 = obj;
    }

    public void setHierarchy(DH dh) {
        C25580OooO0O0<DH> c25580OooO0O0 = this.f67242OooOoO0;
        c25580OooO0O0.f87263OooO0o.OooO00o(C25476OooO0OO.OooO00o.f86799OooOo0o);
        boolean zOooO0OO = c25580OooO0O0.OooO0OO();
        DH dh2 = c25580OooO0O0.f87262OooO0Oo;
        C30841OooO0Oo c30841OooO0OoOooO0O0 = dh2 == null ? null : dh2.OooO0O0();
        if (c30841OooO0OoOooO0O0 != null) {
            c30841OooO0OoOooO0O0.OooOOOO(null);
        }
        dh.getClass();
        c25580OooO0O0.f87262OooO0Oo = dh;
        C30841OooO0Oo c30841OooO0OoOooO0O02 = dh.OooO0O0();
        c25580OooO0O0.OooO0Oo(c30841OooO0OoOooO0O02 == null || c30841OooO0OoOooO0O02.isVisible());
        DH dh3 = c25580OooO0O0.f87262OooO0Oo;
        C30841OooO0Oo c30841OooO0OoOooO0O03 = dh3 != null ? dh3.OooO0O0() : null;
        if (c30841OooO0OoOooO0O03 != null) {
            c30841OooO0OoOooO0O03.OooOOOO(c25580OooO0O0);
        }
        if (zOooO0OO) {
            c25580OooO0O0.f87264OooO0o0.OooO0Oo(dh);
        }
        DH dh4 = this.f67242OooOoO0.f87262OooO0Oo;
        super.setImageDrawable(dh4 == null ? null : dh4.OooO0O0());
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageBitmap(Bitmap bitmap) {
        OooO00o(getContext());
        this.f67242OooOoO0.OooO0o0(null);
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageDrawable(Drawable drawable) {
        OooO00o(getContext());
        this.f67242OooOoO0.OooO0o0(null);
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageResource(int i) {
        OooO00o(getContext());
        this.f67242OooOoO0.OooO0o0(null);
        super.setImageResource(i);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageURI(Uri uri) {
        OooO00o(getContext());
        this.f67242OooOoO0.OooO0o0(null);
        super.setImageURI(uri);
    }

    public void setLegacyVisibilityHandlingEnabled(boolean z) {
        this.f67243OooOoOO = z;
    }

    @Override // android.view.View
    public final String toString() {
        C25431OooO0oo.OooO00o oooO00oOooO0O0 = C25431OooO0oo.OooO0O0(this);
        C25580OooO0O0<DH> c25580OooO0O0 = this.f67242OooOoO0;
        oooO00oOooO0O0.OooO0OO(c25580OooO0O0 != null ? c25580OooO0O0.toString() : "<no holder set>", "holder");
        return oooO00oOooO0O0.toString();
    }
}
