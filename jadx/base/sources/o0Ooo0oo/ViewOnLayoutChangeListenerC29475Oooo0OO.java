package o0Ooo0oo;

import android.view.View;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;

/* JADX INFO: renamed from: o0Ooo0oo.Oooo0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class ViewOnLayoutChangeListenerC29475Oooo0OO implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ PenBarChildFragment f104560OooOo0o;

    public ViewOnLayoutChangeListenerC29475Oooo0OO(PenBarChildFragment penBarChildFragment) {
        this.f104560OooOo0o = penBarChildFragment;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        int i9 = PenBarChildFragment.f75240o0000OOo;
        this.f104560OooOo0o.OooooOo();
    }
}
