package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public class Constraints extends ViewGroup {

    public static class OooO00o extends ConstraintLayout.OooO00o {

        /* JADX INFO: renamed from: o000000, reason: collision with root package name */
        public float f63954o000000;

        /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
        public float f63955o000OOo;

        /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
        public float f63956o00oO0O;

        /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
        public boolean f63957o00oO0o;

        /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
        public float f63958o0O0O00;

        /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
        public float f63959o0OO00O;

        /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
        public float f63960o0OOO0o;

        /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
        public float f63961o0Oo0oo;

        /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
        public float f63962o0ooOO0;

        /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
        public float f63963o0ooOOo;

        /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
        public float f63964o0ooOoO;

        /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
        public float f63965oo000o;

        /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
        public float f63966oo0o0Oo;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        OooO00o oooO00o = new OooO00o(-2, -2);
        oooO00o.f63965oo000o = 1.0f;
        oooO00o.f63957o00oO0o = false;
        oooO00o.f63956o00oO0O = 0.0f;
        oooO00o.f63962o0ooOO0 = 0.0f;
        oooO00o.f63963o0ooOOo = 0.0f;
        oooO00o.f63964o0ooOoO = 0.0f;
        oooO00o.f63960o0OOO0o = 1.0f;
        oooO00o.f63961o0Oo0oo = 1.0f;
        oooO00o.f63959o0OO00O = 0.0f;
        oooO00o.f63966oo0o0Oo = 0.0f;
        oooO00o.f63958o0O0O00 = 0.0f;
        oooO00o.f63955o000OOo = 0.0f;
        oooO00o.f63954o000000 = 0.0f;
        return oooO00o;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        OooO00o oooO00o = new OooO00o(context, attributeSet);
        oooO00o.f63965oo000o = 1.0f;
        oooO00o.f63957o00oO0o = false;
        oooO00o.f63956o00oO0O = 0.0f;
        oooO00o.f63962o0ooOO0 = 0.0f;
        oooO00o.f63963o0ooOOo = 0.0f;
        oooO00o.f63964o0ooOoO = 0.0f;
        oooO00o.f63960o0OOO0o = 1.0f;
        oooO00o.f63961o0Oo0oo = 1.0f;
        oooO00o.f63959o0OO00O = 0.0f;
        oooO00o.f63966oo0o0Oo = 0.0f;
        oooO00o.f63958o0O0O00 = 0.0f;
        oooO00o.f63955o000OOo = 0.0f;
        oooO00o.f63954o000000 = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooO0o.f64133OooO0Oo);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 15) {
                oooO00o.f63965oo000o = typedArrayObtainStyledAttributes.getFloat(index, oooO00o.f63965oo000o);
            } else if (index == 28) {
                oooO00o.f63956o00oO0O = typedArrayObtainStyledAttributes.getFloat(index, oooO00o.f63956o00oO0O);
                oooO00o.f63957o00oO0o = true;
            } else if (index == 23) {
                oooO00o.f63963o0ooOOo = typedArrayObtainStyledAttributes.getFloat(index, oooO00o.f63963o0ooOOo);
            } else if (index == 24) {
                oooO00o.f63964o0ooOoO = typedArrayObtainStyledAttributes.getFloat(index, oooO00o.f63964o0ooOoO);
            } else if (index == 22) {
                oooO00o.f63962o0ooOO0 = typedArrayObtainStyledAttributes.getFloat(index, oooO00o.f63962o0ooOO0);
            } else if (index == 20) {
                oooO00o.f63960o0OOO0o = typedArrayObtainStyledAttributes.getFloat(index, oooO00o.f63960o0OOO0o);
            } else if (index == 21) {
                oooO00o.f63961o0Oo0oo = typedArrayObtainStyledAttributes.getFloat(index, oooO00o.f63961o0Oo0oo);
            } else if (index == 16) {
                oooO00o.f63959o0OO00O = typedArrayObtainStyledAttributes.getFloat(index, oooO00o.f63959o0OO00O);
            } else if (index == 17) {
                oooO00o.f63966oo0o0Oo = typedArrayObtainStyledAttributes.getFloat(index, oooO00o.f63966oo0o0Oo);
            } else if (index == 18) {
                oooO00o.f63958o0O0O00 = typedArrayObtainStyledAttributes.getFloat(index, oooO00o.f63958o0O0O00);
            } else if (index == 19) {
                oooO00o.f63955o000OOo = typedArrayObtainStyledAttributes.getFloat(index, oooO00o.f63955o000OOo);
            } else if (index == 27) {
                oooO00o.f63954o000000 = typedArrayObtainStyledAttributes.getFloat(index, oooO00o.f63954o000000);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return oooO00o;
    }

    public OooO0OO getConstraintSet() {
        getChildCount();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.OooO00o(layoutParams);
    }
}
