package androidx.core.widget;

import android.util.Log;
import androidx.hardware.OooO00o;
import androidx.hardware.SyncFenceBindings;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.p607ui.noteeditor.toolbox.favorite.FavoriteToolBox;
import com.orion.notein.p607ui.p609vo.FavoritePenVO;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.internal.OooOOO0;
import o0o00o00.C29938OooO00o;
import oO00ooO.C32460OooOooO;
import oOo000Oo.C34431OooOo0;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f64304OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f64305OooOo0o;

    public /* synthetic */ OooO00o(Object obj, int i) {
        this.f64305OooOo0o = i;
        this.f64304OooOo = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        switch (this.f64305OooOo0o) {
            case 0:
                ((ContentLoadingProgressBar) this.f64304OooOo).lambda$new$0();
                return;
            case 1:
                ((ScheduledFuture) this.f64304OooOo).cancel(false);
                return;
            case 2:
                androidx.hardware.OooO00o this$0 = (androidx.hardware.OooO00o) this.f64304OooOo;
                OooOOO0.OooO0oO(this$0, "this$0");
                File[] fileArrListFiles = this$0.f65144OooO0O0.listFiles();
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        try {
                            int i2 = Integer.parseInt(file.getName());
                            long jNGetSignalTime = SyncFenceBindings.f65152OooO00o.nGetSignalTime(i2);
                            if (androidx.hardware.OooO00o.OooO00o(jNGetSignalTime) > 3000) {
                                this$0.f65147OooO0o.add(new OooO00o.C19020OooO00o(i2, jNGetSignalTime));
                                if (this$0.f65147OooO0o.size() > 100) {
                                    ArrayList<OooO00o.C19020OooO00o> arrayList = this$0.f65147OooO0o;
                                    if (arrayList.size() > 1) {
                                        C34431OooOo0.OooOooO(arrayList, new o000OO0O.OooO0O0(i));
                                    }
                                    while (arrayList.size() > 100) {
                                        try {
                                            int i3 = ((OooO00o.C19020OooO00o) C34431OooOo0.OooOoo0(arrayList)).f65150OooO00o;
                                            SyncFenceBindings.Companion companion = SyncFenceBindings.f65152OooO00o;
                                            if (androidx.hardware.OooO00o.OooO00o(companion.nGetSignalTime(i3)) > 3000) {
                                                companion.nForceClose(i3);
                                            }
                                        } catch (Throwable unused) {
                                        }
                                    }
                                }
                            }
                        } catch (NumberFormatException unused2) {
                            Log.w("FileDescriptorMonitor", "Unable to parse fd value from name " + file.getName());
                        }
                    }
                }
                if (this$0.f65143OooO00o.get()) {
                    o000O0Oo.OooO00o oooO00o = this$0.f65148OooO0o0;
                    if (!oooO00o.f82381OooOoO0) {
                        OooO00o runnable = this$0.f65149OooO0oO;
                        OooOOO0.OooO0oO(runnable, "runnable");
                        oooO00o.f82379OooOo.postDelayed(runnable, 1000L);
                    }
                } else if (this$0.f65146OooO0Oo.get()) {
                    o000O0Oo.OooO00o oooO00o2 = this$0.f65148OooO0o0;
                    if (!oooO00o2.f82381OooOoO0) {
                        oooO00o2.f82380OooOo0o.quit();
                        oooO00o2.f82381OooOoO0 = true;
                    }
                }
                synchronized (this$0.f65145OooO0OO) {
                    try {
                        Iterator<oO0O000o.OooO00o<C32460OooOooO>> it = this$0.f65145OooO0OO.iterator();
                        while (it.hasNext()) {
                            it.next().invoke();
                        }
                        this$0.f65145OooO0OO.clear();
                        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                FavoriteToolBox favoriteToolBox = (FavoriteToolBox) this.f64304OooOo;
                C29938OooO00o c29938OooO00o = favoriteToolBox.f76891OooOoO0;
                if (c29938OooO00o == null) {
                    OooOOO0.OooOOOO("penListAdapter");
                    throw null;
                }
                Iterator it2 = OooOo.o0ooOO0(c29938OooO00o.f106299OooO00o).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        i = -1;
                    } else if (!((FavoritePenVO) it2.next()).getSelected()) {
                        i++;
                    }
                }
                if (i == -1) {
                    return;
                }
                RecyclerView recyclerView = favoriteToolBox.f76888OooOo;
                if (recyclerView == null) {
                    OooOOO0.OooOOOO("penListView");
                    throw null;
                }
                RecyclerView.OooOOOO layoutManager = recyclerView.getLayoutManager();
                OooOOO0.OooO0o0(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                int iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
                if (i > linearLayoutManager.findLastCompletelyVisibleItemPosition() || i < iFindFirstCompletelyVisibleItemPosition) {
                    RecyclerView recyclerView2 = favoriteToolBox.f76888OooOo;
                    if (recyclerView2 != null) {
                        recyclerView2.scrollToPosition(i);
                        return;
                    } else {
                        OooOOO0.OooOOOO("penListView");
                        throw null;
                    }
                }
                return;
        }
    }
}
