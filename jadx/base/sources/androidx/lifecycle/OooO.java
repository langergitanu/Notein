package androidx.lifecycle;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f65501OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f65502OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f65500OooO00o = true;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayDeque f65503OooO0Oo = new ArrayDeque();

    public final void OooO00o() {
        if (this.f65502OooO0OO) {
            return;
        }
        try {
            this.f65502OooO0OO = true;
            while (true) {
                ArrayDeque arrayDeque = this.f65503OooO0Oo;
                if (arrayDeque.isEmpty()) {
                    break;
                }
                if (!(this.f65501OooO0O0 || !this.f65500OooO00o)) {
                    break;
                }
                Runnable runnable = (Runnable) arrayDeque.poll();
                if (runnable != null) {
                    runnable.run();
                }
            }
        } finally {
            this.f65502OooO0OO = false;
        }
    }
}
