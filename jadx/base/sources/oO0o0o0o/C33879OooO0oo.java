package oO0o0o0o;

import Oooo0oO.C21111o0ooOoO;
import oO0o0OO.C33640Oooo0o0;

/* JADX INFO: renamed from: oO0o0o0o.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33879OooO0oo extends AbstractRunnableC33878OooO0oO {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final Runnable f122051OooOoO0;

    public C33879OooO0oo(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.f122051OooOoO0 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f122051OooOoO0.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f122051OooOoO0;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(C33640Oooo0o0.OooO00o(runnable));
        sb.append(", ");
        sb.append(this.f122050OooOo0o);
        sb.append(", ");
        return C21111o0ooOoO.OooO0OO(this.f122049OooOo ? "Blocking" : "Non-blocking", ']', sb);
    }
}
