package Oooo0OO;

import androidx.compose.material.ripple.RippleHostView;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;

/* JADX INFO: renamed from: Oooo0OO.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC20958OooOOO implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f60497OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f60498OooOo0o;

    public /* synthetic */ RunnableC20958OooOOO(Object obj, int i) {
        this.f60498OooOo0o = i;
        this.f60497OooOo = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f60498OooOo0o) {
            case 0:
                RippleHostView.setRippleState$lambda$2((RippleHostView) this.f60497OooOo);
                break;
            default:
                Iterator<FragmentManager.OooOOO> it = ((FragmentManager) this.f60497OooOo).f64811OooOOOO.iterator();
                while (it.hasNext()) {
                    it.next().getClass();
                }
                break;
        }
    }
}
