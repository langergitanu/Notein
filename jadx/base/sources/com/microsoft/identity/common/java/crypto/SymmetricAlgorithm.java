package com.microsoft.identity.common.java.crypto;

/* JADX INFO: loaded from: classes9.dex */
public interface SymmetricAlgorithm extends Algorithm {

    public static class Builder {
        /* JADX INFO: renamed from: of */
        public static SymmetricAlgorithm m80240of(final String str) {
            if (str != null) {
                return new SymmetricAlgorithm() { // from class: com.microsoft.identity.common.java.crypto.SymmetricAlgorithm.Builder.1
                    @Override // com.microsoft.identity.common.java.crypto.SymmetricAlgorithm, com.microsoft.identity.common.java.crypto.Algorithm
                    public String name() {
                        return str;
                    }
                };
            }
            throw new NullPointerException("name is marked non-null but is null");
        }
    }

    @Override // com.microsoft.identity.common.java.crypto.Algorithm
    String name();
}
