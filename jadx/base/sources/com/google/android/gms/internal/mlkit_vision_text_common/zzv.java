package com.google.android.gms.internal.mlkit_vision_text_common;

import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class zzv {
    private final String zza = IOUtils.LINE_SEPARATOR_UNIX;

    private zzv(String str) {
    }

    public static zzv zza(String str) {
        return new zzv(IOUtils.LINE_SEPARATOR_UNIX);
    }

    public static final CharSequence zzc(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public final String zzb(Iterable iterable) {
        Iterator it = iterable.iterator();
        StringBuilder sb = new StringBuilder();
        try {
            if (it.hasNext()) {
                sb.append(zzc(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.zza);
                    sb.append(zzc(it.next()));
                }
            }
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
