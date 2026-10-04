package com.nimbusds.jose;

import com.nimbusds.jose.util.JSONStringUtils;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class CompressionAlgorithm implements Serializable {
    public static final CompressionAlgorithm DEF = new CompressionAlgorithm("DEF");
    private static final long serialVersionUID = 1;
    private final String name;

    public CompressionAlgorithm(String str) {
        if (str == null) {
            throw new IllegalArgumentException("The compression algorithm name must not be null");
        }
        this.name = str;
    }

    public boolean equals(Object obj) {
        return (obj instanceof CompressionAlgorithm) && toString().equals(obj.toString());
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public String toJSONString() {
        return JSONStringUtils.toJSONString(this.name);
    }

    public String toString() {
        return this.name;
    }
}
