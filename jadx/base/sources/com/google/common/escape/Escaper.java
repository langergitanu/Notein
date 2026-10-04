package com.google.common.escape;

import com.google.common.base.Function;
import com.google.errorprone.annotations.DoNotMock;

/* JADX INFO: loaded from: classes8.dex */
@DoNotMock("Use Escapers.nullEscaper() or another methods from the *Escapers classes")
@ElementTypesAreNonnullByDefault
public abstract class Escaper {
    private final Function<String, String> asFunction = new Function() { // from class: com.google.common.escape.OooO00o
        @Override // com.google.common.base.Function
        public final Object apply(Object obj) {
            return this.f67818OooOo0o.escape((String) obj);
        }
    };

    public final Function<String, String> asFunction() {
        return this.asFunction;
    }

    public abstract String escape(String str);
}
