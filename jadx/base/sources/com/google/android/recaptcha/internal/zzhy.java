package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.OooOOO;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes7.dex */
public final class zzhy {
    private List zza = C34434OooOoO.f123453OooOo0o;

    public final long zza(long[] jArr) {
        Iterator it = OooOo.OooooOO(this.zza, OooOOO.OoooO(jArr)).iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = Long.valueOf(((Number) next).longValue() ^ ((Number) it.next()).longValue());
        }
        return ((Number) next).longValue();
    }

    public final void zzb(long[] jArr) {
        this.zza = OooOOO.OoooO(jArr);
    }
}
