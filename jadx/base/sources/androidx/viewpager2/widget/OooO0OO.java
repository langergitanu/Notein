package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO extends ViewPager2.AbstractC22132OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f66585OooO00o = new ArrayList(3);

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC22132OooO0o0
    public final void onPageScrollStateChanged(int i) {
        try {
            Iterator it = this.f66585OooO00o.iterator();
            while (it.hasNext()) {
                ((ViewPager2.AbstractC22132OooO0o0) it.next()).onPageScrollStateChanged(i);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC22132OooO0o0
    public final void onPageScrolled(int i, float f, int i2) {
        try {
            Iterator it = this.f66585OooO00o.iterator();
            while (it.hasNext()) {
                ((ViewPager2.AbstractC22132OooO0o0) it.next()).onPageScrolled(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC22132OooO0o0
    public final void onPageSelected(int i) {
        try {
            Iterator it = this.f66585OooO00o.iterator();
            while (it.hasNext()) {
                ((ViewPager2.AbstractC22132OooO0o0) it.next()).onPageSelected(i);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }
}
