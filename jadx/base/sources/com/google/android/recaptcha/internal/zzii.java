package com.google.android.recaptcha.internal;

import android.content.Context;
import java.util.Map;
import oO00ooO.C32443OooOOO;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: loaded from: classes7.dex */
public final class zzii implements zzih {
    private final Context zza;
    private final Map zzb = C34444Oooo0O0.OooO0oo(new C32443OooOOO(2, Context.ACTIVITY_SERVICE), new C32443OooOOO(3, Context.TELEPHONY_SERVICE), new C32443OooOOO(4, Context.INPUT_METHOD_SERVICE), new C32443OooOOO(5, Context.AUDIO_SERVICE));

    public zzii(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.recaptcha.internal.zzih
    /* JADX INFO: renamed from: cs */
    public final /* synthetic */ Object mo75065cs(Object[] objArr) {
        return zzie.zza(this, objArr);
    }

    @Override // com.google.android.recaptcha.internal.zzih
    public final Object zza(Object... objArr) throws zzce {
        Object obj = objArr[0];
        if (true != (obj instanceof Integer)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num == null) {
            throw new zzce(4, 5, null);
        }
        Object obj2 = this.zzb.get(Integer.valueOf(num.intValue()));
        if (obj2 != null) {
            return this.zza.getSystemService((String) obj2);
        }
        throw new zzce(4, 4, null);
    }
}
