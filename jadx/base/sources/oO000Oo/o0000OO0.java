package oO000Oo;

import java.util.Collection;
import java.util.concurrent.Future;
import oO000Oo.o0000O;

/* JADX INFO: loaded from: classes10.dex */
public final class o0000OO0 implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ o0000O.C32033OooOoO f114523OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Collection f114524OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ Future f114525OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Future f114526OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ o0000O f114527OooOoOO;

    public o0000OO0(o0000O o0000o2, Collection collection, o0000O.C32033OooOoO c32033OooOoO, Future future, Future future2) {
        this.f114527OooOoOO = o0000o2;
        this.f114524OooOo0o = collection;
        this.f114523OooOo = c32033OooOoO;
        this.f114526OooOoO0 = future;
        this.f114525OooOoO = future2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (o0000O.C32033OooOoO c32033OooOoO : this.f114524OooOo0o) {
            if (c32033OooOoO != this.f114523OooOo) {
                c32033OooOoO.f114481OooO00o.OooOO0o(o0000O.f114412OooOoo);
            }
        }
        Future future = this.f114526OooOoO0;
        if (future != null) {
            future.cancel(false);
        }
        Future future2 = this.f114525OooOoO;
        if (future2 != null) {
            future2.cancel(false);
        }
        this.f114527OooOoOO.OooOo0O();
    }
}
