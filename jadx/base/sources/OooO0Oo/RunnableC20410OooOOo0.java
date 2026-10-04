package OooO0Oo;

import android.view.KeyEvent;
import com.orion.notein.p607ui.noteeditor.toolbox.favorite.FavoriteToolBox;

/* JADX INFO: renamed from: OooO0Oo.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC20410OooOOo0 implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f58213OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f58214OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f58215OooOoO0;

    public /* synthetic */ RunnableC20410OooOOo0(KeyEvent.Callback callback, Object obj, int i) {
        this.f58214OooOo0o = i;
        this.f58213OooOo = callback;
        this.f58215OooOoO0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f58214OooOo0o) {
            case 0:
                ((OooOO0O) this.f58213OooOo).addObserverForBackInvoker((C20418OooOoo) this.f58215OooOoO0);
                break;
            default:
                FavoriteToolBox.OooO00o((FavoriteToolBox) this.f58213OooOo, (FavoriteToolBox.OooO00o) this.f58215OooOoO0);
                break;
        }
    }
}
