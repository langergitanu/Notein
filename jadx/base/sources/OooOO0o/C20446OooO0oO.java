package OooOO0o;

import android.view.View;
import android.view.animation.BaseInterpolator;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: OooOO0o.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20446OooO0oO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public BaseInterpolator f58382OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ViewPropertyAnimatorListenerAdapter f58383OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f58385OooO0o0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public long f58381OooO0O0 = -1;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooO00o f58384OooO0o = new OooO00o();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList<ViewPropertyAnimatorCompat> f58380OooO00o = new ArrayList<>();

    /* JADX INFO: renamed from: OooOO0o.OooO0oO$OooO00o */
    public class OooO00o extends ViewPropertyAnimatorListenerAdapter {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f58386OooO00o = false;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f58387OooO0O0 = 0;

        public OooO00o() {
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public final void onAnimationEnd(View view) {
            int i = this.f58387OooO0O0 + 1;
            this.f58387OooO0O0 = i;
            C20446OooO0oO c20446OooO0oO = C20446OooO0oO.this;
            if (i == c20446OooO0oO.f58380OooO00o.size()) {
                ViewPropertyAnimatorListenerAdapter viewPropertyAnimatorListenerAdapter = c20446OooO0oO.f58383OooO0Oo;
                if (viewPropertyAnimatorListenerAdapter != null) {
                    viewPropertyAnimatorListenerAdapter.onAnimationEnd(null);
                }
                this.f58387OooO0O0 = 0;
                this.f58386OooO00o = false;
                c20446OooO0oO.f58385OooO0o0 = false;
            }
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public final void onAnimationStart(View view) {
            if (this.f58386OooO00o) {
                return;
            }
            this.f58386OooO00o = true;
            ViewPropertyAnimatorListenerAdapter viewPropertyAnimatorListenerAdapter = C20446OooO0oO.this.f58383OooO0Oo;
            if (viewPropertyAnimatorListenerAdapter != null) {
                viewPropertyAnimatorListenerAdapter.onAnimationStart(null);
            }
        }
    }

    public final void OooO00o() {
        if (this.f58385OooO0o0) {
            Iterator<ViewPropertyAnimatorCompat> it = this.f58380OooO00o.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
            this.f58385OooO0o0 = false;
        }
    }

    public final void OooO0O0() {
        if (this.f58385OooO0o0) {
            return;
        }
        for (ViewPropertyAnimatorCompat viewPropertyAnimatorCompat : this.f58380OooO00o) {
            long j = this.f58381OooO0O0;
            if (j >= 0) {
                viewPropertyAnimatorCompat.setDuration(j);
            }
            BaseInterpolator baseInterpolator = this.f58382OooO0OO;
            if (baseInterpolator != null) {
                viewPropertyAnimatorCompat.setInterpolator(baseInterpolator);
            }
            if (this.f58383OooO0Oo != null) {
                viewPropertyAnimatorCompat.setListener(this.f58384OooO0o);
            }
            viewPropertyAnimatorCompat.start();
        }
        this.f58385OooO0o0 = true;
    }
}
