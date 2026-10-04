package com.nimbusds.jose.shaded.json.reader;

import com.nimbusds.jose.shaded.json.JSONStyle;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public interface JsonWriterI<T> {
    <E extends T> void writeJSONString(E e, Appendable appendable, JSONStyle jSONStyle) throws IOException;
}
