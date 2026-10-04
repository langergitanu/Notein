package com.aspose.words.internal;

import com.aspose.words.ref.Ref;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZXU implements zzHG {
    private static Map<Character, zzZXU> zzbg = new HashMap();
    private static Object zzcD = new Object();
    private char zzbh;

    private zzZXU(char c) {
        this.zzbh = c;
    }

    public static zzZXU zzf(char c) {
        zzZXU zzzxu;
        synchronized (zzcD) {
            try {
                Ref ref = new Ref(null);
                boolean zZzZ = zzZQF.zzZ((Map<Character, V>) zzbg, Character.valueOf(c), ref);
                zzzxu = (zzZXU) ref.get();
                if (!zZzZ) {
                    zzzxu = new zzZXU(c);
                    zzbg.put(Character.valueOf(c), zzzxu);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzzxu;
    }

    private zzZXU zzqf() {
        return new zzZXU(Character.toLowerCase(this.zzbh));
    }

    private zzZXU zzqg() {
        return new zzZXU(Character.toUpperCase(this.zzbh));
    }

    @Override // com.aspose.words.internal.zzHG
    public final zzHG zzFK() {
        return zzqf();
    }

    @Override // com.aspose.words.internal.zzHG
    public final zzHG zzFL() {
        return zzqg();
    }

    @Override // com.aspose.words.internal.zzHG
    public final char zzFM() {
        return this.zzbh;
    }

    public final char zzqe() {
        return this.zzbh;
    }
}
