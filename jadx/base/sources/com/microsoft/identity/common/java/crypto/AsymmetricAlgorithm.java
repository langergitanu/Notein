package com.microsoft.identity.common.java.crypto;

/* JADX INFO: loaded from: classes9.dex */
public interface AsymmetricAlgorithm extends Algorithm {

    public static class Builder {
        /* JADX INFO: renamed from: of */
        public static AsymmetricAlgorithm m80239of(final String str) {
            if (str != null) {
                return new AsymmetricAlgorithm() { // from class: com.microsoft.identity.common.java.crypto.AsymmetricAlgorithm.Builder.1
                    @Override // com.microsoft.identity.common.java.crypto.Algorithm
                    public String name() {
                        return str;
                    }
                };
            }
            throw new NullPointerException("name is marked non-null but is null");
        }
    }
}
