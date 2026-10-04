package androidx.appcompat.widget;

import OooO0oo.C20441OooO00o;
import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final TextView f62878OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000O0o.OooO0o f62879OooO0O0;

    public OooO(TextView textView) {
        this.f62878OooO00o = textView;
        this.f62879OooO0O0 = new o000O0o.OooO0o(textView);
    }

    public final InputFilter[] OooO00o(InputFilter[] inputFilterArr) {
        return this.f62879OooO0O0.f82394OooO00o.OooO00o(inputFilterArr);
    }

    public final boolean OooO0O0() {
        return this.f62879OooO0O0.f82394OooO00o.OooO0O0();
    }

    public final void OooO0OO(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.f62878OooO00o.getContext().obtainStyledAttributes(attributeSet, C20441OooO00o.f58278OooO, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            OooO0o0(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void OooO0Oo(boolean z) {
        this.f62879OooO0O0.f82394OooO00o.OooO0OO(z);
    }

    public final void OooO0o0(boolean z) {
        this.f62879OooO0O0.f82394OooO00o.OooO0Oo(z);
    }
}
