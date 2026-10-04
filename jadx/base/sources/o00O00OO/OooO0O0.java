package o00O00OO;

import OooOOOo.OooOOO0;
import OooOo.OooO0O0;
import OooOo.OooOOO;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.InterfaceC21986OooOoOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.aspose.slides.internal.p332p7.C22237OooO0o0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO0O0 extends RecyclerView.AbstractC22062OooO0oO<OooO> implements OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractC21979OooOOo0 f84094OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final FragmentManager f84095OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooOOO<Fragment> f84096OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOOO<Fragment.SavedState> f84097OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public OooO0OO f84098OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooOOO<Integer> f84099OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f84100OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f84101OooO0oo;

    public class OooO00o implements InterfaceC21986OooOoOO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ OooO f84103OooOo0o;

        public OooO00o(OooO oooO) {
            this.f84103OooOo0o = oooO;
        }

        @Override // androidx.lifecycle.InterfaceC21986OooOoOO
        public final void OooOOo0(InterfaceC21987OooOoo interfaceC21987OooOoo, AbstractC21979OooOOo0.OooO00o oooO00o) {
            OooO0O0 oooO0O0 = OooO0O0.this;
            if (oooO0O0.f84095OooO0O0.OoooO00()) {
                return;
            }
            interfaceC21987OooOoo.getLifecycle().OooO0OO(this);
            OooO oooO = this.f84103OooOo0o;
            if (ViewCompat.isAttachedToWindow((FrameLayout) oooO.itemView)) {
                oooO0O0.OooO0oo(oooO);
            }
        }
    }

    /* JADX INFO: renamed from: o00O00OO.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static abstract class AbstractC19653OooO0O0 extends RecyclerView.OooO {
        @Override // androidx.recyclerview.widget.RecyclerView.OooO
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.OooO
        public final void onItemRangeChanged(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooO
        public final void onItemRangeInserted(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooO
        public final void onItemRangeMoved(int i, int i2, int i3) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooO
        public final void onItemRangeRemoved(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooO
        public final void onItemRangeChanged(int i, int i2, Object obj) {
            onChanged();
        }
    }

    public class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public OooO0o f84104OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public C24800OooO0oO f84105OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public C24801OooO0oo f84106OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public ViewPager2 f84107OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public long f84109OooO0o0 = -1;

        public OooO0OO() {
        }

        public static ViewPager2 OooO00o(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        public final void OooO0O0(boolean z) {
            int currentItem;
            Fragment fragmentOooO0O0;
            OooO0O0 oooO0O0 = OooO0O0.this;
            FragmentManager fragmentManager = oooO0O0.f84095OooO0O0;
            if (!fragmentManager.OoooO00() && this.f84107OooO0Oo.getScrollState() == 0) {
                OooOOO<Fragment> oooOOO = oooO0O0.f84096OooO0OO;
                if (oooOOO.OooO0oO() == 0 || oooO0O0.getItemCount() == 0 || (currentItem = this.f84107OooO0Oo.getCurrentItem()) >= oooO0O0.getItemCount()) {
                    return;
                }
                long itemId = oooO0O0.getItemId(currentItem);
                if ((itemId != this.f84109OooO0o0 || z) && (fragmentOooO0O0 = oooOOO.OooO0O0(itemId)) != null && fragmentOooO0O0.isAdded()) {
                    this.f84109OooO0o0 = itemId;
                    androidx.fragment.app.OooO00o oooO00oOooO0OO = OooOOO0.OooO0OO(fragmentManager, fragmentManager);
                    Fragment fragment = null;
                    for (int i = 0; i < oooOOO.OooO0oO(); i++) {
                        long jOooO0Oo = oooOOO.OooO0Oo(i);
                        Fragment fragmentOooO0oo = oooOOO.OooO0oo(i);
                        if (fragmentOooO0oo.isAdded()) {
                            if (jOooO0Oo != this.f84109OooO0o0) {
                                oooO00oOooO0OO.OooOOO(fragmentOooO0oo, AbstractC21979OooOOo0.OooO0O0.f65539OooOoO);
                            } else {
                                fragment = fragmentOooO0oo;
                            }
                            fragmentOooO0oo.setMenuVisibility(jOooO0Oo == this.f84109OooO0o0);
                        }
                    }
                    if (fragment != null) {
                        oooO00oOooO0OO.OooOOO(fragment, AbstractC21979OooOOo0.OooO0O0.f65541OooOoOO);
                    }
                    if (oooO00oOooO0OO.f65008OooO0OO.isEmpty()) {
                        return;
                    }
                    oooO00oOooO0OO.OooOO0();
                }
            }
        }
    }

    public OooO0O0(Fragment fragment) {
        this(fragment.getChildFragmentManager(), fragment.getLifecycle());
    }

    public static void OooO0OO(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    public final void OooO(long j) {
        ViewParent parent;
        OooOOO<Fragment> oooOOO = this.f84096OooO0OO;
        Fragment fragmentOooO0O0 = oooOOO.OooO0O0(j);
        if (fragmentOooO0O0 == null) {
            return;
        }
        if (fragmentOooO0O0.getView() != null && (parent = fragmentOooO0O0.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        boolean zOooO0Oo = OooO0Oo(j);
        OooOOO<Fragment.SavedState> oooOOO2 = this.f84097OooO0Oo;
        if (!zOooO0Oo) {
            oooOOO2.OooO0o(j);
        }
        if (!fragmentOooO0O0.isAdded()) {
            oooOOO.OooO0o(j);
            return;
        }
        FragmentManager fragmentManager = this.f84095OooO0O0;
        if (fragmentManager.OoooO00()) {
            this.f84101OooO0oo = true;
            return;
        }
        if (fragmentOooO0O0.isAdded() && OooO0Oo(j)) {
            oooOOO2.OooO0o0(j, fragmentManager.Ooooo0o(fragmentOooO0O0));
        }
        androidx.fragment.app.OooO00o oooO00o = new androidx.fragment.app.OooO00o(fragmentManager);
        oooO00o.OooOOO0(fragmentOooO0O0);
        oooO00o.OooOO0();
        oooOOO.OooO0o(j);
    }

    @Override // o00O00OO.OooOO0
    public final Bundle OooO00o() {
        OooOOO<Fragment> oooOOO = this.f84096OooO0OO;
        int iOooO0oO = oooOOO.OooO0oO();
        OooOOO<Fragment.SavedState> oooOOO2 = this.f84097OooO0Oo;
        Bundle bundle = new Bundle(oooOOO2.OooO0oO() + iOooO0oO);
        for (int i = 0; i < oooOOO.OooO0oO(); i++) {
            long jOooO0Oo = oooOOO.OooO0Oo(i);
            Fragment fragmentOooO0O0 = oooOOO.OooO0O0(jOooO0Oo);
            if (fragmentOooO0O0 != null && fragmentOooO0O0.isAdded()) {
                this.f84095OooO0O0.OoooOOO(bundle, fragmentOooO0O0, androidx.concurrent.futures.OooO00o.OooO0O0(jOooO0Oo, "f#"));
            }
        }
        for (int i2 = 0; i2 < oooOOO2.OooO0oO(); i2++) {
            long jOooO0Oo2 = oooOOO2.OooO0Oo(i2);
            if (OooO0Oo(jOooO0Oo2)) {
                bundle.putParcelable(androidx.concurrent.futures.OooO00o.OooO0O0(jOooO0Oo2, "s#"), oooOOO2.OooO0O0(jOooO0Oo2));
            }
        }
        return bundle;
    }

    @Override // o00O00OO.OooOO0
    public final void OooO0O0(Parcelable parcelable) {
        String next;
        OooOOO<Fragment.SavedState> oooOOO = this.f84097OooO0Oo;
        if (oooOOO.OooO0oO() == 0) {
            OooOOO<Fragment> oooOOO2 = this.f84096OooO0OO;
            if (oooOOO2.OooO0oO() == 0) {
                Bundle bundle = (Bundle) parcelable;
                if (bundle.getClassLoader() == null) {
                    bundle.setClassLoader(getClass().getClassLoader());
                }
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        if (oooOOO2.OooO0oO() == 0) {
                            return;
                        }
                        this.f84101OooO0oo = true;
                        this.f84100OooO0oO = true;
                        OooO0o();
                        Handler handler = new Handler(Looper.getMainLooper());
                        RunnableC24798OooO0Oo runnableC24798OooO0Oo = new RunnableC24798OooO0Oo(this);
                        this.f84094OooO00o.OooO00o(new C24799OooO0o0(handler, runnableC24798OooO0Oo));
                        handler.postDelayed(runnableC24798OooO0Oo, 10000L);
                        return;
                    }
                    next = it.next();
                    if (next.startsWith("f#") && next.length() > 2) {
                        long j = Long.parseLong(next.substring(2));
                        FragmentManager fragmentManager = this.f84095OooO0O0;
                        fragmentManager.getClass();
                        String string = bundle.getString(next);
                        Fragment fragment = null;
                        if (string != null) {
                            Fragment fragmentOooO0O0 = fragmentManager.f64800OooO0OO.OooO0O0(string);
                            if (fragmentOooO0O0 == null) {
                                fragmentManager.ooOO(new IllegalStateException(C22237OooO0o0.OooO00o("Fragment no longer exists for key ", next, ": unique id ", string)));
                                throw null;
                            }
                            fragment = fragmentOooO0O0;
                        }
                        oooOOO2.OooO0o0(j, fragment);
                    } else {
                        if (!next.startsWith("s#") || next.length() <= 2) {
                            break;
                        }
                        long j2 = Long.parseLong(next.substring(2));
                        Fragment.SavedState savedState = (Fragment.SavedState) bundle.getParcelable(next);
                        if (OooO0Oo(j2)) {
                            oooOOO.OooO0o0(j2, savedState);
                        }
                    }
                }
                throw new IllegalArgumentException("Unexpected key in savedState: ".concat(next));
            }
        }
        throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
    }

    public boolean OooO0Oo(long j) {
        return j >= 0 && j < ((long) getItemCount());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0o() {
        OooOOO<Fragment> oooOOO;
        OooOOO<Integer> oooOOO2;
        Fragment fragmentOooO0O0;
        View view;
        if (!this.f84101OooO0oo || this.f84095OooO0O0.OoooO00()) {
            return;
        }
        OooOo.OooO0O0 oooO0O0 = new OooOo.OooO0O0();
        int i = 0;
        while (true) {
            oooOOO = this.f84096OooO0OO;
            int iOooO0oO = oooOOO.OooO0oO();
            oooOOO2 = this.f84099OooO0o0;
            if (i >= iOooO0oO) {
                break;
            }
            long jOooO0Oo = oooOOO.OooO0Oo(i);
            if (!OooO0Oo(jOooO0Oo)) {
                oooO0O0.add(Long.valueOf(jOooO0Oo));
                oooOOO2.OooO0o(jOooO0Oo);
            }
            i++;
        }
        if (!this.f84100OooO0oO) {
            this.f84101OooO0oo = false;
            for (int i2 = 0; i2 < oooOOO.OooO0oO(); i2++) {
                long jOooO0Oo2 = oooOOO.OooO0Oo(i2);
                if (oooOOO2.OooO0OO(jOooO0Oo2) < 0 && ((fragmentOooO0O0 = oooOOO.OooO0O0(jOooO0Oo2)) == null || (view = fragmentOooO0O0.getView()) == null || view.getParent() == null)) {
                    oooO0O0.add(Long.valueOf(jOooO0Oo2));
                }
            }
        }
        OooO0O0.OooO00o oooO00o = new OooO0O0.OooO00o();
        while (oooO00o.hasNext()) {
            OooO(((Long) oooO00o.next()).longValue());
        }
    }

    public abstract Fragment OooO0o0(int i);

    public final Long OooO0oO(int i) {
        Long lValueOf = null;
        int i2 = 0;
        while (true) {
            OooOOO<Integer> oooOOO = this.f84099OooO0o0;
            if (i2 >= oooOOO.OooO0oO()) {
                return lValueOf;
            }
            if (oooOOO.OooO0oo(i2).intValue() == i) {
                if (lValueOf != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                lValueOf = Long.valueOf(oooOOO.OooO0Oo(i2));
            }
            i2++;
        }
    }

    public final void OooO0oo(OooO oooO) {
        Fragment fragmentOooO0O0 = this.f84096OooO0OO.OooO0O0(oooO.getItemId());
        if (fragmentOooO0O0 == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout frameLayout = (FrameLayout) oooO.itemView;
        View view = fragmentOooO0O0.getView();
        if (!fragmentOooO0O0.isAdded() && view != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        boolean zIsAdded = fragmentOooO0O0.isAdded();
        FragmentManager fragmentManager = this.f84095OooO0O0;
        if (zIsAdded && view == null) {
            fragmentManager.OoooOOo(new o00O00OO.OooO0OO(this, fragmentOooO0O0, frameLayout), false);
            return;
        }
        if (fragmentOooO0O0.isAdded() && view.getParent() != null) {
            if (view.getParent() != frameLayout) {
                OooO0OO(view, frameLayout);
                return;
            }
            return;
        }
        if (fragmentOooO0O0.isAdded()) {
            OooO0OO(view, frameLayout);
            return;
        }
        if (fragmentManager.OoooO00()) {
            if (fragmentManager.f64836Oooo0o0) {
                return;
            }
            this.f84094OooO00o.OooO00o(new OooO00o(oooO));
            return;
        }
        fragmentManager.OoooOOo(new o00O00OO.OooO0OO(this, fragmentOooO0O0, frameLayout), false);
        androidx.fragment.app.OooO00o oooO00o = new androidx.fragment.app.OooO00o(fragmentManager);
        oooO00o.OooO0Oo(0, fragmentOooO0O0, "f" + oooO.getItemId(), 1);
        oooO00o.OooOOO(fragmentOooO0O0, AbstractC21979OooOOo0.OooO0O0.f65539OooOoO);
        oooO00o.OooOO0();
        this.f84098OooO0o.OooO0O0(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Preconditions.checkArgument(this.f84098OooO0o == null);
        OooO0OO oooO0OO = new OooO0OO();
        this.f84098OooO0o = oooO0OO;
        oooO0OO.f84107OooO0Oo = OooO0OO.OooO00o(recyclerView);
        OooO0o oooO0o = new OooO0o(oooO0OO);
        oooO0OO.f84104OooO00o = oooO0o;
        oooO0OO.f84107OooO0Oo.OooO00o(oooO0o);
        C24800OooO0oO c24800OooO0oO = new C24800OooO0oO(oooO0OO);
        oooO0OO.f84105OooO0O0 = c24800OooO0oO;
        registerAdapterDataObserver(c24800OooO0oO);
        C24801OooO0oo c24801OooO0oo = new C24801OooO0oo(oooO0OO);
        oooO0OO.f84106OooO0OO = c24801OooO0oo;
        this.f84094OooO00o.OooO00o(c24801OooO0oo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        OooO oooO = (OooO) abstractC22078OooOooO;
        long itemId = oooO.getItemId();
        int id = ((FrameLayout) oooO.itemView).getId();
        Long lOooO0oO = OooO0oO(id);
        OooOOO<Integer> oooOOO = this.f84099OooO0o0;
        if (lOooO0oO != null && lOooO0oO.longValue() != itemId) {
            OooO(lOooO0oO.longValue());
            oooOOO.OooO0o(lOooO0oO.longValue());
        }
        oooOOO.OooO0o0(itemId, Integer.valueOf(id));
        long itemId2 = getItemId(i);
        OooOOO<Fragment> oooOOO2 = this.f84096OooO0OO;
        if (oooOOO2.OooO0OO(itemId2) < 0) {
            Fragment fragmentOooO0o0 = OooO0o0(i);
            fragmentOooO0o0.setInitialSavedState(this.f84097OooO0Oo.OooO0O0(itemId2));
            oooOOO2.OooO0o0(itemId2, fragmentOooO0o0);
        }
        FrameLayout frameLayout = (FrameLayout) oooO.itemView;
        if (ViewCompat.isAttachedToWindow(frameLayout)) {
            if (frameLayout.getParent() != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            frameLayout.addOnLayoutChangeListener(new o00O00OO.OooO00o(this, frameLayout, oooO));
        }
        OooO0o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = OooO.f84090OooO00o;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(ViewCompat.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new OooO(frameLayout);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        OooO0OO oooO0OO = this.f84098OooO0o;
        oooO0OO.getClass();
        ViewPager2 viewPager2OooO00o = OooO0OO.OooO00o(recyclerView);
        viewPager2OooO00o.f66607OooOoO0.f66585OooO00o.remove(oooO0OO.f84104OooO00o);
        C24800OooO0oO c24800OooO0oO = oooO0OO.f84105OooO0O0;
        OooO0O0 oooO0O0 = OooO0O0.this;
        oooO0O0.unregisterAdapterDataObserver(c24800OooO0oO);
        oooO0O0.f84094OooO00o.OooO0OO(oooO0OO.f84106OooO0OO);
        oooO0OO.f84107OooO0Oo = null;
        this.f84098OooO0o = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final /* bridge */ /* synthetic */ boolean onFailedToRecycleView(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onViewAttachedToWindow(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO) {
        OooO0oo((OooO) abstractC22078OooOooO);
        OooO0o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onViewRecycled(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO) {
        Long lOooO0oO = OooO0oO(((FrameLayout) ((OooO) abstractC22078OooOooO).itemView).getId());
        if (lOooO0oO != null) {
            OooO(lOooO0oO.longValue());
            this.f84099OooO0o0.OooO0o(lOooO0oO.longValue());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    public OooO0O0(FragmentManager fragmentManager, AbstractC21979OooOOo0 abstractC21979OooOOo0) {
        this.f84096OooO0OO = new OooOOO<>();
        this.f84097OooO0Oo = new OooOOO<>();
        this.f84099OooO0o0 = new OooOOO<>();
        this.f84100OooO0oO = false;
        this.f84101OooO0oo = false;
        this.f84095OooO0O0 = fragmentManager;
        this.f84094OooO00o = abstractC21979OooOOo0;
        super.setHasStableIds(true);
    }
}
