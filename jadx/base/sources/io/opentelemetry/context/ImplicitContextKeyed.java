package io.opentelemetry.context;

/* JADX INFO: loaded from: classes10.dex */
public interface ImplicitContextKeyed {
    default Scope makeCurrent() {
        return Context.current().with(this).makeCurrent();
    }

    Context storeInContext(Context context);
}
