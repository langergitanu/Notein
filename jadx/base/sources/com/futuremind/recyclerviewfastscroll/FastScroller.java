package com.futuremind.recyclerviewfastscroll;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.TextViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import o00ooOoo.InterfaceC25793OooO0O0;
import o00ooOoo.ViewOnTouchListenerC25792OooO00o;
import o00ooo00.AbstractC25813OooO0OO;
import o00ooo00.C25812OooO0O0;
import p618o0.OooO0OO;

/* JADX INFO: loaded from: classes5.dex */
public class FastScroller extends LinearLayout {

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public static final /* synthetic */ int f67535Oooo0OO = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public RecyclerView f67536OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final com.futuremind.recyclerviewfastscroll.OooO00o f67537OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public View f67538OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public View f67539OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public TextView f67540OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f67541OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f67542OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f67543OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f67544OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public AbstractC25813OooO0OO f67545Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public int f67546Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public int f67547Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public boolean f67548Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public InterfaceC25793OooO0O0 f67549Oooo0O0;

    public class OooO00o implements ViewGroup.OnHierarchyChangeListener {
        public OooO00o() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            int i = FastScroller.f67535Oooo0OO;
            FastScroller.this.OooO0O0();
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            int i = FastScroller.f67535Oooo0OO;
            FastScroller.this.OooO0O0();
        }
    }

    public FastScroller(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f67537OooOo0o = new com.futuremind.recyclerviewfastscroll.OooO00o(this);
        setClipChildren(false);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooO0OO.f80958OooO00o, R.attr.fastscroll__style, 0);
        try {
            this.f67543OooOooO = typedArrayObtainStyledAttributes.getColor(0, -1);
            this.f67541OooOoo = typedArrayObtainStyledAttributes.getColor(2, -1);
            this.f67544OooOooo = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            typedArrayObtainStyledAttributes.recycle();
            this.f67547Oooo00O = getVisibility();
            setViewProvider(new C25812OooO0O0());
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecyclerViewPosition(float f) {
        TextView textView;
        RecyclerView recyclerView = this.f67536OooOo;
        if (recyclerView == null) {
            return;
        }
        int itemCount = recyclerView.getAdapter().getItemCount();
        this.f67536OooOo.scrollToPosition((int) Math.min(Math.max(0.0f, (int) (f * itemCount)), itemCount - 1));
        InterfaceC25793OooO0O0 interfaceC25793OooO0O0 = this.f67549Oooo0O0;
        if (interfaceC25793OooO0O0 == null || (textView = this.f67540OooOoOO) == null) {
            return;
        }
        textView.setText(interfaceC25793OooO0O0.OooO00o());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO0O0() {
        if (this.f67536OooOo.getAdapter() != null && this.f67536OooOo.getAdapter().getItemCount() != 0 && this.f67536OooOo.getChildAt(0) != null) {
            if (OooO0OO()) {
                if (this.f67536OooOo.getAdapter().getItemCount() * this.f67536OooOo.getChildAt(0).getHeight() > this.f67536OooOo.getHeight()) {
                    if (this.f67547Oooo00O == 0) {
                        super.setVisibility(0);
                        return;
                    }
                }
            } else {
                if (this.f67536OooOo.getAdapter().getItemCount() * this.f67536OooOo.getChildAt(0).getWidth() > this.f67536OooOo.getWidth()) {
                }
            }
        }
        super.setVisibility(4);
    }

    public final boolean OooO0OO() {
        return this.f67546Oooo000 == 1;
    }

    public AbstractC25813OooO0OO getViewProvider() {
        return this.f67545Oooo0;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float width;
        int width2;
        super.onLayout(z, i, i2, i3, i4);
        this.f67538OooOoO.setOnTouchListener(new ViewOnTouchListenerC25792OooO00o(this));
        C25812OooO0O0 c25812OooO0O0 = (C25812OooO0O0) this.f67545Oooo0;
        if (c25812OooO0O0.f88026OooO00o.OooO0OO()) {
            width = c25812OooO0O0.f88025OooO0Oo.getHeight() / 2.0f;
            width2 = c25812OooO0O0.f88024OooO0OO.getHeight();
        } else {
            width = c25812OooO0O0.f88025OooO0Oo.getWidth() / 2.0f;
            width2 = c25812OooO0O0.f88024OooO0OO.getWidth();
        }
        this.f67542OooOoo0 = (int) (width - width2);
        int i5 = this.f67543OooOooO;
        if (i5 != -1) {
            TextView textView = this.f67540OooOoOO;
            Drawable drawableWrap = DrawableCompat.wrap(textView.getBackground());
            if (drawableWrap != null) {
                DrawableCompat.setTint(drawableWrap.mutate(), i5);
                textView.setBackground(drawableWrap);
            }
        }
        int i6 = this.f67541OooOoo;
        if (i6 != -1) {
            View view = this.f67538OooOoO;
            Drawable drawableWrap2 = DrawableCompat.wrap(view.getBackground());
            if (drawableWrap2 != null) {
                DrawableCompat.setTint(drawableWrap2.mutate(), i6);
                view.setBackground(drawableWrap2);
            }
        }
        int i7 = this.f67544OooOooo;
        if (i7 != -1) {
            TextViewCompat.setTextAppearance(this.f67540OooOoOO, i7);
        }
        if (isInEditMode()) {
            return;
        }
        this.f67537OooOo0o.OooO00o(this.f67536OooOo);
    }

    public void setBubbleColor(int i) {
        this.f67543OooOooO = i;
        invalidate();
    }

    public void setBubbleTextAppearance(int i) {
        this.f67544OooOooo = i;
        invalidate();
    }

    public void setHandleColor(int i) {
        this.f67541OooOoo = i;
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        this.f67546Oooo000 = i;
        super.setOrientation(i == 0 ? 1 : 0);
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        this.f67536OooOo = recyclerView;
        if (recyclerView.getAdapter() instanceof InterfaceC25793OooO0O0) {
            this.f67549Oooo0O0 = (InterfaceC25793OooO0O0) recyclerView.getAdapter();
        }
        recyclerView.addOnScrollListener(this.f67537OooOo0o);
        OooO0O0();
        recyclerView.setOnHierarchyChangeListener(new OooO00o());
    }

    public void setScrollerPosition(float f) {
        if (OooO0OO()) {
            this.f67539OooOoO0.setY(Math.min(Math.max(0.0f, ((getHeight() - this.f67538OooOoO.getHeight()) * f) + this.f67542OooOoo0), getHeight() - this.f67539OooOoO0.getHeight()));
            this.f67538OooOoO.setY(Math.min(Math.max(0.0f, f * (getHeight() - this.f67538OooOoO.getHeight())), getHeight() - this.f67538OooOoO.getHeight()));
            return;
        }
        this.f67539OooOoO0.setX(Math.min(Math.max(0.0f, ((getWidth() - this.f67538OooOoO.getWidth()) * f) + this.f67542OooOoo0), getWidth() - this.f67539OooOoO0.getWidth()));
        this.f67538OooOoO.setX(Math.min(Math.max(0.0f, f * (getWidth() - this.f67538OooOoO.getWidth())), getWidth() - this.f67538OooOoO.getWidth()));
    }

    public void setViewProvider(AbstractC25813OooO0OO abstractC25813OooO0OO) {
        removeAllViews();
        this.f67545Oooo0 = abstractC25813OooO0OO;
        abstractC25813OooO0OO.f88026OooO00o = this;
        C25812OooO0O0 c25812OooO0O0 = (C25812OooO0O0) abstractC25813OooO0OO;
        View viewInflate = LayoutInflater.from(c25812OooO0O0.f88026OooO00o.getContext()).inflate(R.layout.fastscroll__default_bubble, (ViewGroup) this, false);
        c25812OooO0O0.f88024OooO0OO = viewInflate;
        this.f67539OooOoO0 = viewInflate;
        c25812OooO0O0.f88025OooO0Oo = new View(c25812OooO0O0.f88026OooO00o.getContext());
        int dimensionPixelSize = c25812OooO0O0.f88026OooO00o.OooO0OO() ? 0 : c25812OooO0O0.f88026OooO00o.getContext().getResources().getDimensionPixelSize(R.dimen.fastscroll__handle_inset);
        int dimensionPixelSize2 = c25812OooO0O0.f88026OooO00o.OooO0OO() ? c25812OooO0O0.f88026OooO00o.getContext().getResources().getDimensionPixelSize(R.dimen.fastscroll__handle_inset) : 0;
        c25812OooO0O0.f88025OooO0Oo.setBackground(new InsetDrawable(ContextCompat.getDrawable(c25812OooO0O0.f88026OooO00o.getContext(), R.drawable.fastscroll__default_handle), dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize));
        Resources resources = c25812OooO0O0.f88026OooO00o.getContext().getResources();
        boolean zOooO0OO = c25812OooO0O0.f88026OooO00o.OooO0OO();
        int i = R.dimen.fastscroll__handle_height;
        int dimensionPixelSize3 = resources.getDimensionPixelSize(zOooO0OO ? R.dimen.fastscroll__handle_clickable_width : R.dimen.fastscroll__handle_height);
        Resources resources2 = c25812OooO0O0.f88026OooO00o.getContext().getResources();
        if (!c25812OooO0O0.f88026OooO00o.OooO0OO()) {
            i = R.dimen.fastscroll__handle_clickable_width;
        }
        c25812OooO0O0.f88025OooO0Oo.setLayoutParams(new ViewGroup.LayoutParams(dimensionPixelSize3, resources2.getDimensionPixelSize(i)));
        this.f67538OooOoO = c25812OooO0O0.f88025OooO0Oo;
        this.f67540OooOoOO = (TextView) c25812OooO0O0.f88024OooO0OO;
        addView(this.f67539OooOoO0);
        addView(this.f67538OooOoO);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        this.f67547Oooo00O = i;
        OooO0O0();
    }
}
