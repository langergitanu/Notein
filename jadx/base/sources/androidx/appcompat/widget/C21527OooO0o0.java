package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.CheckedTextViewCompat;

/* JADX INFO: renamed from: androidx.appcompat.widget.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21527OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AppCompatCheckedTextView f62904OooO00o;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f62908OooO0o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ColorStateList f62905OooO0O0 = null;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public PorterDuff.Mode f62906OooO0OO = null;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f62907OooO0Oo = false;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f62909OooO0o0 = false;

    public C21527OooO0o0(AppCompatCheckedTextView appCompatCheckedTextView) {
        this.f62904OooO00o = appCompatCheckedTextView;
    }

    public final void OooO00o() {
        AppCompatCheckedTextView appCompatCheckedTextView = this.f62904OooO00o;
        Drawable checkMarkDrawable = CheckedTextViewCompat.getCheckMarkDrawable(appCompatCheckedTextView);
        if (checkMarkDrawable != null) {
            if (this.f62907OooO0Oo || this.f62909OooO0o0) {
                Drawable drawableMutate = DrawableCompat.wrap(checkMarkDrawable).mutate();
                if (this.f62907OooO0Oo) {
                    DrawableCompat.setTintList(drawableMutate, this.f62905OooO0O0);
                }
                if (this.f62909OooO0o0) {
                    DrawableCompat.setTintMode(drawableMutate, this.f62906OooO0OO);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(appCompatCheckedTextView.getDrawableState());
                }
                appCompatCheckedTextView.setCheckMarkDrawable(drawableMutate);
            }
        }
    }
}
