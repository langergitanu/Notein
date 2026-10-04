package oO000Oo;

import com.google.common.base.Preconditions;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: oO000Oo.o0000Oo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class ExecutorC32040o0000Oo0 implements Executor {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final Logger f114545OooOoO0 = Logger.getLogger(ExecutorC32040o0000Oo0.class.getName());

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public ArrayDeque<Runnable> f114546OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f114547OooOo0o;

    public final void OooO00o() {
        while (true) {
            Runnable runnablePoll = this.f114546OooOo.poll();
            if (runnablePoll == null) {
                return;
            }
            try {
                runnablePoll.run();
            } catch (Throwable th) {
                f114545OooOoO0.log(Level.SEVERE, "Exception while executing runnable " + runnablePoll, th);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Preconditions.checkNotNull(runnable, "'task' must not be null.");
        if (this.f114547OooOo0o) {
            if (this.f114546OooOo == null) {
                this.f114546OooOo = new ArrayDeque<>(4);
            }
            this.f114546OooOo.add(runnable);
            return;
        }
        this.f114547OooOo0o = true;
        try {
            runnable.run();
        } catch (Throwable th) {
            try {
                f114545OooOoO0.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
                if (this.f114546OooOo != null) {
                    OooO00o();
                }
                this.f114547OooOo0o = false;
            } finally {
                if (this.f114546OooOo != null) {
                    OooO00o();
                }
                this.f114547OooOo0o = false;
            }
        }
    }
}
