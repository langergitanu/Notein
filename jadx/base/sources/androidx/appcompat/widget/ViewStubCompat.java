package androidx.appcompat.widget;

import OooO0oo.C20441OooO00o;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f63200OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f63201OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public LayoutInflater f63202OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public WeakReference<View> f63203OooOoO0;

    public interface OooO00o {
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f63201OooOo0o = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C20441OooO00o.f58305OooOoo, 0, 0);
        this.f63200OooOo = typedArrayObtainStyledAttributes.getResourceId(2, -1);
        this.f63201OooOo0o = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(0, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final View OooO00o() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f63201OooOo0o == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflaterFrom = this.f63202OooOoO;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(getContext());
        }
        View viewInflate = layoutInflaterFrom.inflate(this.f63201OooOo0o, viewGroup, false);
        int i = this.f63200OooOo;
        if (i != -1) {
            viewInflate.setId(i);
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(viewInflate, iIndexOfChild);
        }
        this.f63203OooOoO0 = new WeakReference<>(viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f63200OooOo;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f63202OooOoO;
    }

    public int getLayoutResource() {
        return this.f63201OooOo0o;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f63200OooOo = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f63202OooOoO = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f63201OooOo0o = i;
    }

    public void setOnInflateListener(OooO00o oooO00o) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.f63203OooOoO0;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i);
            return;
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            OooO00o();
        }
    }
}
