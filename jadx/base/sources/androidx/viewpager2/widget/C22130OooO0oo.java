package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: renamed from: androidx.viewpager2.widget.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C22130OooO0oo extends ViewPager2.AbstractC22132OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f66602OooO00o;

    public C22130OooO0oo(ViewPager2 viewPager2) {
        this.f66602OooO00o = viewPager2;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC22132OooO0o0
    public final void onPageScrollStateChanged(int i) {
        if (i == 0) {
            this.f66602OooO00o.OooO0o0();
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC22132OooO0o0
    public final void onPageSelected(int i) {
        ViewPager2 viewPager2 = this.f66602OooO00o;
        if (viewPager2.f66606OooOoO != i) {
            viewPager2.f66606OooOoO = i;
            viewPager2.f66613Oooo.OooO00o();
        }
    }
}
