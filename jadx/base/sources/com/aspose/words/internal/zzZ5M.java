package com.aspose.words.internal;

import java.security.Permission;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ5M extends Permission {
    private final Set<String> zzWlU;

    public zzZ5M(String str) {
        super(str);
        HashSet hashSet = new HashSet();
        this.zzWlU = hashSet;
        if (str.equals("exportKeys")) {
            hashSet.add("exportPrivateKey");
            hashSet.add("exportSecretKey");
        } else if (!str.equals("tlsAlgorithmsEnabled")) {
            hashSet.add(str);
        } else {
            hashSet.add("tlsNullDigestEnabled");
            hashSet.add("tlsPKCS15KeyWrapEnabled");
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzZ5M) && this.zzWlU.equals(((zzZ5M) obj).zzWlU);
    }

    @Override // java.security.Permission
    public final String getActions() {
        return this.zzWlU.toString();
    }

    public final int hashCode() {
        return this.zzWlU.hashCode();
    }

    @Override // java.security.Permission
    public final boolean implies(Permission permission) {
        if (!(permission instanceof zzZ5M)) {
            return false;
        }
        zzZ5M zzz5m = (zzZ5M) permission;
        return getName().equals(zzz5m.getName()) || this.zzWlU.containsAll(zzz5m.zzWlU);
    }
}
