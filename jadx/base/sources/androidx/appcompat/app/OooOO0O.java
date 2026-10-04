package androidx.appcompat.app;

import android.content.Context;
import com.google.android.material.search.SearchView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOO0O implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f62442OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f62443OooOo0o;

    public /* synthetic */ OooOO0O(Object obj, int i) {
        this.f62443OooOo0o = i;
        this.f62442OooOo = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f62443OooOo0o) {
            case 0:
                AbstractC21486OooOO0o.Oooo00O((Context) this.f62442OooOo);
                break;
            default:
                ((SearchView) this.f62442OooOo).show();
                break;
        }
    }
}
