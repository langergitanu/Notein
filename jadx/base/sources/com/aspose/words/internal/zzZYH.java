package com.aspose.words.internal;

import com.aspose.words.ref.Ref;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZYH<TValue> {
    private HashMap<TValue, String> zzbZ;
    private zzZYG<TValue> zzc0;

    public zzZYH() {
        this((byte) 0);
    }

    private boolean zzZ(String str, Ref<TValue> ref) {
        if (str == null || !this.zzc0.containsKey(str)) {
            ref.set(null);
            return false;
        }
        ref.set(this.zzc0.get(str));
        return true;
    }

    public final String zzS(TValue tvalue, String str) {
        Ref<String> ref = new Ref<>(null);
        boolean zZzZ = zzZ(tvalue, ref);
        String str2 = ref.get();
        if (zZzZ) {
            return str2;
        }
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("A key for the specified value is missed and the default key value is not provided.");
    }

    public final TValue zzX(String str, TValue tvalue) {
        Ref<TValue> ref = new Ref<>(null);
        boolean zZzZ = zzZ(str, ref);
        TValue tvalue2 = ref.get();
        if (zZzZ) {
            return tvalue2;
        }
        if (tvalue != null) {
            return tvalue;
        }
        throw new IllegalStateException("A value for the specified key is missed and the default value is not provided.");
    }

    public final void zzY(String str, TValue tvalue) {
        this.zzc0.zzW(str, tvalue);
        zzZQF.zzY(this.zzbZ, tvalue, str);
    }

    private zzZYH(byte b) {
        this.zzc0 = new zzZYG<>(true);
        this.zzbZ = new HashMap<>();
    }

    private boolean zzZ(TValue tvalue, Ref<String> ref) {
        ref.set(tvalue != null ? (String) zzQW.zzZ(this.zzbZ, tvalue) : null);
        return ref.get() != null;
    }
}
