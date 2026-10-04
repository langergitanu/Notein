package com.google.android.gms.internal.mlkit_translate;

import androidx.appcompat.widget.C21532OooOOo;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.domain.models.backup.BackupFile;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public abstract class zzw implements Map, Serializable {
    private transient zzy zza;
    private transient zzy zzb;
    private transient zzp zzc;

    public static zzw zzc() {
        return zzag.zza;
    }

    public static zzw zzd(Object obj, Object obj2) {
        zzl.zza("optional-module-barcode", OptionalModuleUtils.BARCODE_MODULE_ID);
        return zzag.zzi(1, new Object[]{"optional-module-barcode", OptionalModuleUtils.BARCODE_MODULE_ID}, null);
    }

    public static zzw zze(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        zzl.zza("iw", TranslateLanguage.HEBREW);
        zzl.zza(BackupFile.EXTENSION_NOTEIN_FILE, "id");
        zzl.zza("nb", TranslateLanguage.NORWEGIAN);
        return zzag.zzi(3, new Object[]{"iw", TranslateLanguage.HEBREW, BackupFile.EXTENSION_NOTEIN_FILE, "id", "nb", TranslateLanguage.NORWEGIAN}, null);
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzai.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        zzy zzyVar = this.zzb;
        if (zzyVar != null) {
            return zzyVar;
        }
        zzy zzyVarZzg = zzg();
        this.zzb = zzyVarZzg;
        return zzyVarZzg;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        if (size < 0) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(size, "size cannot be negative but was: "));
        }
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    public abstract zzp zza();

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzp values() {
        zzp zzpVar = this.zzc;
        if (zzpVar != null) {
            return zzpVar;
        }
        zzp zzpVarZza = zza();
        this.zzc = zzpVarZza;
        return zzpVarZza;
    }

    public abstract zzy zzf();

    public abstract zzy zzg();

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzy entrySet() {
        zzy zzyVar = this.zza;
        if (zzyVar != null) {
            return zzyVar;
        }
        zzy zzyVarZzf = zzf();
        this.zza = zzyVarZzf;
        return zzyVarZzf;
    }
}
