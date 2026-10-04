package o000O0o;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* JADX INFO: renamed from: o000O0o.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24407OooO0oo implements TransformationMethod {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final TransformationMethod f82405OooO00o;

    public C24407OooO0oo(TransformationMethod transformationMethod) {
        this.f82405OooO00o = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f82405OooO00o;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || androidx.emoji2.text.OooO0OO.OooO00o().OooO0O0() != 1) {
            return charSequence;
        }
        androidx.emoji2.text.OooO0OO oooO0OOOooO00o = androidx.emoji2.text.OooO0OO.OooO00o();
        oooO0OOOooO00o.getClass();
        return oooO0OOOooO00o.OooO0o(charSequence, 0, charSequence.length());
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f82405OooO00o;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}
