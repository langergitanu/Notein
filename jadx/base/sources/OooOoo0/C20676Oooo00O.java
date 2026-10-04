package OooOoo0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: renamed from: OooOoo0.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20676Oooo00O extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<Boolean> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ View f59361OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20676Oooo00O(View view) {
        super(0);
        this.f59361OooOo0o = view;
    }

    @Override // oO0O000o.OooO00o
    public final Boolean invoke() {
        boolean z;
        ViewParent parent = this.f59361OooOo0o.getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                z = true;
                break;
            }
            parent = viewGroup.getParent();
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
