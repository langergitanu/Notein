package com.google.common.p563io;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
@ElementTypesAreNonnullByDefault
public interface LineProcessor<T> {
    @ParametricNullness
    T getResult();

    boolean processLine(String str) throws IOException;
}
