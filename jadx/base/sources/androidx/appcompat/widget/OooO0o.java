package androidx.appcompat.widget;

import OooO0oo.C20441OooO00o;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.CompoundButtonCompat;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final CompoundButton f62898OooO00o;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f62902OooO0o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ColorStateList f62899OooO0O0 = null;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public PorterDuff.Mode f62900OooO0OO = null;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f62901OooO0Oo = false;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f62903OooO0o0 = false;

    public OooO0o(CompoundButton compoundButton) {
        this.f62898OooO00o = compoundButton;
    }

    public final void OooO00o() {
        CompoundButton compoundButton = this.f62898OooO00o;
        Drawable buttonDrawable = CompoundButtonCompat.getButtonDrawable(compoundButton);
        if (buttonDrawable != null) {
            if (this.f62901OooO0Oo || this.f62903OooO0o0) {
                Drawable drawableMutate = DrawableCompat.wrap(buttonDrawable).mutate();
                if (this.f62901OooO0Oo) {
                    DrawableCompat.setTintList(drawableMutate, this.f62899OooO0O0);
                }
                if (this.f62903OooO0o0) {
                    DrawableCompat.setTintMode(drawableMutate, this.f62900OooO0OO);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public final void OooO0O0(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = this.f62898OooO00o;
        Context context = compoundButton.getContext();
        int[] iArr = C20441OooO00o.f58291OooOOO0;
        C21565OoooOO0 c21565OoooOO0OooO0o = C21565OoooOO0.OooO0o(context, attributeSet, iArr, i, 0);
        TypedArray typedArray = c21565OoooOO0OooO0o.f63093OooO0O0;
        CompoundButton compoundButton2 = this.f62898OooO00o;
        ViewCompat.saveAttributeDataForStyleable(compoundButton2, compoundButton2.getContext(), iArr, attributeSet, c21565OoooOO0OooO0o.f63093OooO0O0, i, 0);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(OooO.OooO00o.OooO0OO(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        compoundButton.setButtonDrawable(OooO.OooO00o.OooO0OO(compoundButton.getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(OooO.OooO00o.OooO0OO(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                CompoundButtonCompat.setButtonTintList(compoundButton, c21565OoooOO0OooO0o.OooO00o(2));
            }
            if (typedArray.hasValue(3)) {
                CompoundButtonCompat.setButtonTintMode(compoundButton, C21545OooOooO.OooO0OO(typedArray.getInt(3, -1), null));
            }
            c21565OoooOO0OooO0o.OooO0oO();
        } catch (Throwable th) {
            c21565OoooOO0OooO0o.OooO0oO();
            throw th;
        }
    }
}
