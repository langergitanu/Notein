package androidx.appcompat.widget;

import android.view.ViewGroup;
import android.widget.ScrollView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000oOoO implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f63204OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f63205OooOo0o;

    public /* synthetic */ o000oOoO(ViewGroup viewGroup, int i) {
        this.f63205OooOo0o = i;
        this.f63204OooOo = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f63205OooOo0o) {
            case 0:
                ((Toolbar) this.f63204OooOo).collapseActionView();
                break;
            default:
                ((ScrollView) this.f63204OooOo).fullScroll(130);
                break;
        }
    }
}
