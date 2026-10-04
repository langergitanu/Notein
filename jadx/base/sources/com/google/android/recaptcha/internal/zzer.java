package com.google.android.recaptcha.internal;

import android.content.ContentValues;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes7.dex */
final class zzer extends AbstractC32476OooO implements InterfaceC32508OooOOOo {
    final /* synthetic */ zzes zza;
    final /* synthetic */ zztx zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzer(zzes zzesVar, zztx zztxVar, Continuation continuation) {
        super(2, continuation);
        this.zza = zzesVar;
        this.zzb = zztxVar;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzer(this.zza, this.zzb, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzer) create((InterfaceC33636Oooo00o) obj, (Continuation) obj2)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        zztx zztxVar = this.zzb;
        zzes zzesVar = this.zza;
        synchronized (zzeo.class) {
            try {
                if (zzesVar.zze != null) {
                    byte[] bArrZzd = zztxVar.zzd();
                    zzej zzejVar = new zzej(zzkh.zzg().zzi(bArrZzd, 0, bArrZzd.length), System.currentTimeMillis(), 0);
                    zzei zzeiVar = zzesVar.zze;
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("ss", zzejVar.zzc());
                    contentValues.put("ts", Long.valueOf(zzejVar.zzb()));
                    zzeiVar.getWritableDatabase().insert("ce", null, contentValues);
                    int iZzb = zzesVar.zze.zzb() - 500;
                    if (iZzb > 0) {
                        zzesVar.zze.zza(OooOo.o00Oo0(zzesVar.zze.zzd(), iZzb));
                    }
                    if (zzesVar.zze.zzb() >= 20) {
                        zzesVar.zzg();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
