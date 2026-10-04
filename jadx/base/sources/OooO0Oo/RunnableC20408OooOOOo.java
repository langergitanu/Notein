package OooO0Oo;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.util.concurrent.ClosingFuture;
import com.orion.notein.p607ui.creative_library.CreativeLibraryDetailFragment;
import java.io.Closeable;
import o0o0OOoo.C30584OooOOOo;
import o0o0OOoo.C30591OooOo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: OooO0Oo.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC20408OooOOOo implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f58211OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f58212OooOo0o;

    public /* synthetic */ RunnableC20408OooOOOo(Object obj, int i) {
        this.f58212OooOo0o = i;
        this.f58211OooOo = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f58212OooOo0o) {
            case 0:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e) {
                    if (!kotlin.jvm.internal.OooOOO0.OooO0O0(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e;
                    }
                    return;
                } catch (NullPointerException e2) {
                    if (!kotlin.jvm.internal.OooOOO0.OooO0O0(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e2;
                    }
                    return;
                }
            case 1:
                ClosingFuture.lambda$closeQuietly$0((Closeable) this.f58211OooOo);
                return;
            case 2:
                CreativeLibraryDetailFragment creativeLibraryDetailFragment = (CreativeLibraryDetailFragment) this.f58211OooOo;
                o0OOOoO.OooO0O0 oooO0O0 = creativeLibraryDetailFragment.f70835OooOoo0;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO0O0);
                RecyclerView.OooOOOO layoutManager = oooO0O0.f94916OooO0o.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("CreativeLibraryDetailFragment");
                Integer numValueOf = linearLayoutManager != null ? Integer.valueOf(linearLayoutManager.findFirstVisibleItemPosition()) : null;
                o0OOOoO.OooO0O0 oooO0O02 = creativeLibraryDetailFragment.f70835OooOoo0;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO0O02);
                int scrollX = oooO0O02.f94916OooO0o.getScrollX();
                o0OOOoO.OooO0O0 oooO0O03 = creativeLibraryDetailFragment.f70835OooOoo0;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO0O03);
                c20358OooO00o.OooO00o("afterLayoutUpdate: firstVisiblePosition=" + numValueOf + ", scrollX=" + scrollX + ", paddingStart=" + oooO0O03.f94916OooO0o.getPaddingStart(), new Object[0]);
                return;
            default:
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("PayViewModel");
                c20358OooO00o2.OooO0o0("retryBillingConnection", new Object[0]);
                C30584OooOOOo c30584OooOOOo = (C30584OooOOOo) this.f58211OooOo;
                if (c30584OooOOOo.f109420OooOoO.OooOOOo()) {
                    return;
                }
                c30584OooOOOo.f109420OooOoO.OooO0o0(new C30591OooOo(c30584OooOOOo));
                return;
        }
    }
}
