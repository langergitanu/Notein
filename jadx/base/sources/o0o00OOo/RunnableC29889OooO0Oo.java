package o0o00OOo;

import com.huawei.hms.network.embedded.C18231j9;

/* JADX INFO: renamed from: o0o00OOo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class RunnableC29889OooO0Oo implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f106031OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f106032OooOo0o;

    public /* synthetic */ RunnableC29889OooO0Oo(Object obj, int i) {
        this.f106032OooOo0o = i;
        this.f106031OooOo = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f106032OooOo0o) {
            case 0:
                ((C29891OooO0o0) this.f106031OooOo).f106038OooO0OO.setVisibility(4);
                break;
            default:
                ((C18231j9) this.f106031OooOo).m78889d();
                break;
        }
    }
}
