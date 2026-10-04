package io.opentelemetry.context;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes10.dex */
public interface Context {
    static Context current() {
        Context contextCurrent = ContextStorage.get().current();
        return contextCurrent != null ? contextCurrent : root();
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ void lambda$taskWrapping$0(Executor executor, Runnable runnable) {
        executor.execute(current().wrap(runnable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default void lambda$wrap$1(Runnable runnable) {
        Scope scopeMakeCurrent = makeCurrent();
        try {
            runnable.run();
            if (scopeMakeCurrent != null) {
                scopeMakeCurrent.close();
            }
        } catch (Throwable th) {
            if (scopeMakeCurrent != null) {
                try {
                    scopeMakeCurrent.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default Object lambda$wrap$2(Callable callable) throws Exception {
        Scope scopeMakeCurrent = makeCurrent();
        try {
            Object objCall = callable.call();
            if (scopeMakeCurrent != null) {
                scopeMakeCurrent.close();
            }
            return objCall;
        } catch (Throwable th) {
            if (scopeMakeCurrent != null) {
                try {
                    scopeMakeCurrent.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default void lambda$wrap$3(Executor executor, Runnable runnable) {
        executor.execute(wrap(runnable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default void lambda$wrapConsumer$6(Consumer consumer, Object obj) {
        Scope scopeMakeCurrent = makeCurrent();
        try {
            consumer.accept(obj);
            if (scopeMakeCurrent != null) {
                scopeMakeCurrent.close();
            }
        } catch (Throwable th) {
            if (scopeMakeCurrent != null) {
                try {
                    scopeMakeCurrent.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default void lambda$wrapConsumer$7(BiConsumer biConsumer, Object obj, Object obj2) {
        Scope scopeMakeCurrent = makeCurrent();
        try {
            biConsumer.accept(obj, obj2);
            if (scopeMakeCurrent != null) {
                scopeMakeCurrent.close();
            }
        } catch (Throwable th) {
            if (scopeMakeCurrent != null) {
                try {
                    scopeMakeCurrent.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default Object lambda$wrapFunction$4(Function function, Object obj) {
        Scope scopeMakeCurrent = makeCurrent();
        try {
            Object objApply = function.apply(obj);
            if (scopeMakeCurrent != null) {
                scopeMakeCurrent.close();
            }
            return objApply;
        } catch (Throwable th) {
            if (scopeMakeCurrent != null) {
                try {
                    scopeMakeCurrent.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default Object lambda$wrapFunction$5(BiFunction biFunction, Object obj, Object obj2) {
        Scope scopeMakeCurrent = makeCurrent();
        try {
            Object objApply = biFunction.apply(obj, obj2);
            if (scopeMakeCurrent != null) {
                scopeMakeCurrent.close();
            }
            return objApply;
        } catch (Throwable th) {
            if (scopeMakeCurrent != null) {
                try {
                    scopeMakeCurrent.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default Object lambda$wrapSupplier$8(Supplier supplier) {
        Scope scopeMakeCurrent = makeCurrent();
        try {
            Object obj = supplier.get();
            if (scopeMakeCurrent != null) {
                scopeMakeCurrent.close();
            }
            return obj;
        } catch (Throwable th) {
            if (scopeMakeCurrent != null) {
                try {
                    scopeMakeCurrent.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static Context root() {
        return ContextStorage.get().root();
    }

    static Executor taskWrapping(final Executor executor) {
        return new Executor() { // from class: io.opentelemetry.context.OooO0OO
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                Context.lambda$taskWrapping$0(executor, runnable);
            }
        };
    }

    <V> V get(ContextKey<V> contextKey);

    default Scope makeCurrent() {
        return ContextStorage.get().attach(this);
    }

    <V> Context with(ContextKey<V> contextKey, V v);

    default Context with(ImplicitContextKeyed implicitContextKeyed) {
        return implicitContextKeyed.storeInContext(this);
    }

    default Runnable wrap(final Runnable runnable) {
        return new Runnable() { // from class: io.opentelemetry.context.OooO0o
            @Override // java.lang.Runnable
            public final void run() {
                this.f80912OooOo0o.lambda$wrap$1(runnable);
            }
        };
    }

    default <T> Consumer<T> wrapConsumer(final Consumer<T> consumer) {
        return new Consumer() { // from class: io.opentelemetry.context.OooO
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f80903OooOo0o.lambda$wrapConsumer$6(consumer, obj);
            }
        };
    }

    default <T, U> Function<T, U> wrapFunction(final Function<T, U> function) {
        return new Function() { // from class: io.opentelemetry.context.OooO0O0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f80906OooO00o.lambda$wrapFunction$4(function, obj);
            }
        };
    }

    default <T> Supplier<T> wrapSupplier(final Supplier<T> supplier) {
        return new Supplier() { // from class: io.opentelemetry.context.OooO00o
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.f80904OooO00o.lambda$wrapSupplier$8(supplier);
            }
        };
    }

    static ExecutorService taskWrapping(ExecutorService executorService) {
        return new CurrentContextExecutorService(executorService);
    }

    default <T> Callable<T> wrap(final Callable<T> callable) {
        return new Callable() { // from class: io.opentelemetry.context.OooO0o0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f80914OooOo0o.lambda$wrap$2(callable);
            }
        };
    }

    default <T, U> BiConsumer<T, U> wrapConsumer(final BiConsumer<T, U> biConsumer) {
        return new BiConsumer() { // from class: io.opentelemetry.context.OooO0Oo
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                this.f80909OooO00o.lambda$wrapConsumer$7(biConsumer, obj, obj2);
            }
        };
    }

    default <T, U, V> BiFunction<T, U, V> wrapFunction(final BiFunction<T, U, V> biFunction) {
        return new BiFunction() { // from class: io.opentelemetry.context.OooO0oO
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return this.f80915OooO00o.lambda$wrapFunction$5(biFunction, obj, obj2);
            }
        };
    }

    default Executor wrap(final Executor executor) {
        return new Executor() { // from class: io.opentelemetry.context.OooO0oo
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.f80918OooOo0o.lambda$wrap$3(executor, runnable);
            }
        };
    }

    default ExecutorService wrap(ExecutorService executorService) {
        return new ContextExecutorService(this, executorService);
    }

    default ScheduledExecutorService wrap(ScheduledExecutorService scheduledExecutorService) {
        return new ContextScheduledExecutorService(this, scheduledExecutorService);
    }
}
