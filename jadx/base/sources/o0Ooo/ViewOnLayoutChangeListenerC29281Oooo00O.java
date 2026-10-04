package o0Ooo;

import android.view.View;
import com.orion.notein.p607ui.noteeditor.penbox.PenBoxChildFragment;

/* JADX INFO: renamed from: o0Ooo.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class ViewOnLayoutChangeListenerC29281Oooo00O implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ int f103815OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ PenBoxChildFragment f103816OooOo0o;

    public ViewOnLayoutChangeListenerC29281Oooo00O(PenBoxChildFragment penBoxChildFragment, int i) {
        this.f103816OooOo0o = penBoxChildFragment;
        this.f103815OooOo = i;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        int i9 = PenBoxChildFragment.f75355o0000Ooo;
        this.f103816OooOo0o.Oooo0oo(this.f103815OooOo, true);
    }
}
