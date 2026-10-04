package o0o00o00;

import android.os.Handler;
import com.orion.notein.p607ui.noteeditor.toolbox.favorite.FavoriteToolBox;
import java.util.ArrayList;

/* JADX INFO: renamed from: o0o00o00.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class RunnableC29941OooO0Oo implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ ArrayList f106314OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f106315OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ FavoriteToolBox f106316OooOoO0;

    public /* synthetic */ RunnableC29941OooO0Oo(int i, ArrayList arrayList, FavoriteToolBox favoriteToolBox) {
        this.f106315OooOo0o = i;
        this.f106314OooOo = arrayList;
        this.f106316OooOoO0 = favoriteToolBox;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = FavoriteToolBox.f76887Oooo0OO;
        if (this.f106315OooOo0o < this.f106314OooOo.size()) {
            FavoriteToolBox favoriteToolBox = this.f106316OooOoO0;
            Handler handler = favoriteToolBox.f76898Oooo000;
            androidx.core.widget.OooO00o oooO00o = favoriteToolBox.f76901Oooo0O0;
            handler.removeCallbacks(oooO00o);
            favoriteToolBox.f76898Oooo000.postDelayed(oooO00o, 100L);
        }
    }
}
