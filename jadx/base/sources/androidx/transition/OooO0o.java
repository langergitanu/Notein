package androidx.transition;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o extends C22103OooOOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Object f66338OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ ArrayList f66339OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ Object f66340OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ArrayList f66341OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ C22093OooO0o0 f66342OooO0o0;

    public OooO0o(C22093OooO0o0 c22093OooO0o0, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f66342OooO0o0 = c22093OooO0o0;
        this.f66338OooO00o = obj;
        this.f66339OooO0O0 = arrayList;
        this.f66340OooO0OO = obj2;
        this.f66341OooO0Oo = arrayList2;
    }

    @Override // androidx.transition.C22103OooOOo0, androidx.transition.OooOOO0.OooO
    public final void onTransitionEnd(OooOOO0 oooOOO0) {
        oooOOO0.removeListener(this);
    }

    @Override // androidx.transition.C22103OooOOo0, androidx.transition.OooOOO0.OooO
    public final void onTransitionStart(OooOOO0 oooOOO0) {
        C22093OooO0o0 c22093OooO0o0 = this.f66342OooO0o0;
        Object obj = this.f66338OooO00o;
        if (obj != null) {
            c22093OooO0o0.OooOoOO(obj, this.f66339OooO0O0, null);
        }
        Object obj2 = this.f66340OooO0OO;
        if (obj2 != null) {
            c22093OooO0o0.OooOoOO(obj2, this.f66341OooO0Oo, null);
        }
    }
}
