package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes.dex */
public final class OooO extends ViewPager2.AbstractC22132OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f66583OooO00o;

    public OooO(ViewPager2 viewPager2) {
        this.f66583OooO00o = viewPager2;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC22132OooO0o0
    public final void onPageSelected(int i) {
        ViewPager2 viewPager2 = this.f66583OooO00o;
        viewPager2.clearFocus();
        if (viewPager2.hasFocus()) {
            viewPager2.f66615Oooo000.requestFocus(2);
        }
    }
}
