package io.opentelemetry.context;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes10.dex */
enum ThreadLocalContextStorage implements ContextStorage {
    INSTANCE;

    private static final Logger logger = Logger.getLogger(ThreadLocalContextStorage.class.getName());
    private static final ThreadLocal<Context> THREAD_LOCAL_STORAGE = new ThreadLocal<>();

    public enum NoopScope implements Scope {
        INSTANCE;

        @Override // io.opentelemetry.context.Scope, java.lang.AutoCloseable
        public void close() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$attach$0(Context context, Context context2) {
        if (current() != context) {
            logger.log(Level.FINE, "Context in storage not the expected context, Scope.close was not called correctly");
        }
        THREAD_LOCAL_STORAGE.set(context2);
    }

    @Override // io.opentelemetry.context.ContextStorage
    public Scope attach(final Context context) {
        final Context contextCurrent;
        if (context != null && context != (contextCurrent = current())) {
            THREAD_LOCAL_STORAGE.set(context);
            return new Scope() { // from class: io.opentelemetry.context.OooOO0O
                @Override // io.opentelemetry.context.Scope, java.lang.AutoCloseable
                public final void close() {
                    this.f80920OooOo0o.lambda$attach$0(context, contextCurrent);
                }
            };
        }
        return NoopScope.INSTANCE;
    }

    @Override // io.opentelemetry.context.ContextStorage
    public Context current() {
        return THREAD_LOCAL_STORAGE.get();
    }
}
