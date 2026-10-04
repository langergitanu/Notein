package com.google.android.recaptcha.internal;

import java.util.Iterator;
import kotlin.coroutines.Continuation;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes7.dex */
final class zzu extends AbstractC32476OooO implements InterfaceC32508OooOOOo {
    Object zza;
    Object zzb;
    int zzc;
    final /* synthetic */ zzsc zzd;
    final /* synthetic */ zzv zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzu(zzsc zzscVar, zzv zzvVar, Continuation continuation) {
        super(2, continuation);
        this.zzd = zzscVar;
        this.zze = zzvVar;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzu(this.zzd, this.zze, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzu) create((InterfaceC33636Oooo00o) obj, (Continuation) obj2)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        zzse zzseVarZzj;
        Iterator it;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (this.zzc != 0) {
            it = (Iterator) this.zzb;
            zzseVarZzj = (zzse) this.zza;
            C32446OooOOOo.OooO0O0(obj);
        } else {
            C32446OooOOOo.OooO0O0(obj);
            if (!this.zzd.zzS()) {
                return new C32445OooOOOO(C32446OooOOOo.OooO00o(new zzbd(zzbb.zzb, zzba.zzab, null)));
            }
            zzseVarZzj = this.zzd.zzj();
            if (zzseVarZzj.zzi().zzd() == 0) {
                return new C32445OooOOOO(C32446OooOOOo.OooO00o(new zzbd(zzbb.zzb, zzba.zzab, null)));
            }
            this.zze.zzc = zzseVarZzj.zzi();
            it = this.zze.zzb.iterator();
        }
        while (it.hasNext()) {
            zzy zzyVar = (zzy) it.next();
            this.zza = zzseVarZzj;
            this.zzb = it;
            this.zzc = 1;
            if (zzyVar.zzd(zzseVarZzj, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        }
        return new C32445OooOOOO(C32460OooOooO.f116667OooO00o);
    }
}
