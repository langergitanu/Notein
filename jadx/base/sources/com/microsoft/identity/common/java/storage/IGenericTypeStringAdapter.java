package com.microsoft.identity.common.java.storage;

/* JADX INFO: loaded from: classes9.dex */
public interface IGenericTypeStringAdapter<T> {
    public static final IGenericTypeStringAdapter<Long> LongStringAdapter = new IGenericTypeStringAdapter<Long>() { // from class: com.microsoft.identity.common.java.storage.IGenericTypeStringAdapter.1
        @Override // com.microsoft.identity.common.java.storage.IGenericTypeStringAdapter
        public String adapt(Long l) {
            if (l != null) {
                return String.valueOf(l);
            }
            throw new NullPointerException("value is marked non-null but is null");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microsoft.identity.common.java.storage.IGenericTypeStringAdapter
        public Long adapt(String str) throws NumberFormatException {
            if (str != null) {
                return Long.valueOf(Long.parseLong(str));
            }
            throw new NullPointerException("value is marked non-null but is null");
        }
    };

    T adapt(String str);

    String adapt(T t);
}
