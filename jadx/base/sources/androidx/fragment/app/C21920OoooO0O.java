package androidx.fragment.app;

import android.transition.Transition;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.OoooO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21920OoooO0O implements Transition.TransitionListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Object f65066OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ ArrayList f65067OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ Object f65068OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ArrayList f65069OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ C21917OoooO0 f65070OooO0o0;

    public C21920OoooO0O(C21917OoooO0 c21917OoooO0, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f65070OooO0o0 = c21917OoooO0;
        this.f65066OooO00o = obj;
        this.f65067OooO0O0 = arrayList;
        this.f65068OooO0OO = obj2;
        this.f65069OooO0Oo = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        C21917OoooO0 c21917OoooO0 = this.f65070OooO0o0;
        Object obj = this.f65066OooO00o;
        if (obj != null) {
            c21917OoooO0.OooOoOO(obj, this.f65067OooO0O0, null);
        }
        Object obj2 = this.f65068OooO0OO;
        if (obj2 != null) {
            c21917OoooO0.OooOoOO(obj2, this.f65069OooO0Oo, null);
        }
    }
}
