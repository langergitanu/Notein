package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
@ViewPager.InterfaceC22123OooO0Oo
public class PagerTitleStrip extends ViewGroup {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f66516OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public ViewPager f66517OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public WeakReference<o00O00O.OooO00o> f66518OooOoO0;

    public static class OooO00o extends SingleLineTransformationMethod {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Locale f66519OooO00o;

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public final CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.f66519OooO00o);
            }
            return null;
        }
    }

    private static void setSingleLineAllCaps(TextView textView) {
        Context context = textView.getContext();
        OooO00o oooO00o = new OooO00o();
        oooO00o.f66519OooO00o = context.getResources().getConfiguration().locale;
        textView.setTransformationMethod(oooO00o);
    }

    public final void OooO00o(o00O00O.OooO00o oooO00o, o00O00O.OooO00o oooO00o2) {
        if (oooO00o != null) {
            oooO00o.f84087OooO00o.unregisterObserver(null);
            this.f66518OooOoO0 = null;
        }
        if (oooO00o2 != null) {
            oooO00o2.f84087OooO00o.registerObserver(null);
            this.f66518OooOoO0 = new WeakReference<>(oooO00o2);
        }
        ViewPager viewPager = this.f66517OooOo0o;
        if (viewPager == null) {
            return;
        }
        viewPager.getCurrentItem();
        if (oooO00o2 != null) {
            oooO00o2.OooO00o();
        }
        throw null;
    }

    public void OooO0O0(float f) {
        throw null;
    }

    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.f66516OooOo;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof ViewPager)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        ViewPager viewPager = (ViewPager) parent;
        o00O00O.OooO00o adapter = viewPager.getAdapter();
        if (viewPager.f66565o00Ooo == null) {
            viewPager.f66565o00Ooo = new ArrayList();
        }
        viewPager.f66565o00Ooo.add(null);
        this.f66517OooOo0o = viewPager;
        WeakReference<o00O00O.OooO00o> weakReference = this.f66518OooOoO0;
        OooO00o(weakReference != null ? weakReference.get() : null, adapter);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.f66517OooOo0o;
        if (viewPager != null) {
            OooO00o(viewPager.getAdapter(), null);
            ViewPager viewPager2 = this.f66517OooOo0o;
            viewPager2.getClass();
            ArrayList arrayList = viewPager2.f66565o00Ooo;
            if (arrayList != null) {
                arrayList.remove((Object) null);
            }
            this.f66517OooOo0o = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f66517OooOo0o != null) {
            OooO0O0(0.0f);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), -2);
        ViewGroup.getChildMeasureSpec(i, (int) (View.MeasureSpec.getSize(i) * 0.2f), -2);
        throw null;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    public void setGravity(int i) {
    }

    public void setNonPrimaryAlpha(float f) {
        throw null;
    }

    public void setTextColor(int i) {
        throw null;
    }

    public void setTextSpacing(int i) {
        this.f66516OooOo = i;
    }
}
