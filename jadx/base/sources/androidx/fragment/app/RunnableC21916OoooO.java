package androidx.fragment.app;

import android.view.View;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.OoooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC21916OoooO implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ ArrayList f65054OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f65055OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ ArrayList f65056OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ ArrayList f65057OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ ArrayList f65058OooOoOO;

    public RunnableC21916OoooO(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f65055OooOo0o = i;
        this.f65054OooOo = arrayList;
        this.f65057OooOoO0 = arrayList2;
        this.f65056OooOoO = arrayList3;
        this.f65058OooOoOO = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i = 0; i < this.f65055OooOo0o; i++) {
            ViewCompat.setTransitionName((View) this.f65054OooOo.get(i), (String) this.f65057OooOoO0.get(i));
            ViewCompat.setTransitionName((View) this.f65056OooOoO.get(i), (String) this.f65058OooOoOO.get(i));
        }
    }
}
