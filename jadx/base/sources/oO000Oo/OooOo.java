package oO000Oo;

import com.google.common.base.Preconditions;
import com.google.firebase.firestore.remote.RunnableC22702OooOOo0;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public ArrayList<OooO00o> f114038OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public volatile oO0OOo0o.OooOOO f114039OooO0O0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final RunnableC22702OooOOo0 f114040OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Executor f114041OooO0O0;

        public OooO00o(RunnableC22702OooOOo0 runnableC22702OooOOo0, Executor executor) {
            this.f114040OooO00o = runnableC22702OooOOo0;
            this.f114041OooO0O0 = executor;
        }
    }

    public final void OooO00o(oO0OOo0o.OooOOO oooOOO) {
        Preconditions.checkNotNull(oooOOO, "newState");
        if (this.f114039OooO0O0 == oooOOO || this.f114039OooO0O0 == oO0OOo0o.OooOOO.f119556OooOoOO) {
            return;
        }
        this.f114039OooO0O0 = oooOOO;
        if (this.f114038OooO00o.isEmpty()) {
            return;
        }
        ArrayList<OooO00o> arrayList = this.f114038OooO00o;
        this.f114038OooO00o = new ArrayList<>();
        for (OooO00o oooO00o : arrayList) {
            oooO00o.f114041OooO0O0.execute(oooO00o.f114040OooO00o);
        }
    }
}
