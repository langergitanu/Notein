package com.google.android.recaptcha.internal;

import java.util.List;
import kotlin.coroutines.Continuation;
import o00o00Oo.C25261OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes7.dex */
final class zzfq extends AbstractC32476OooO implements InterfaceC32508OooOOOo {
    int zza;
    final /* synthetic */ zzgd zzb;
    final /* synthetic */ List zzc;
    final /* synthetic */ zzft zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfq(zzgd zzgdVar, List list, zzft zzftVar, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzgdVar;
        this.zzc = list;
        this.zzd = zzftVar;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation create(Object obj, Continuation continuation) {
        zzfq zzfqVar = new zzfq(this.zzb, this.zzc, this.zzd, continuation);
        zzfqVar.zze = obj;
        return zzfqVar;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfq) create((InterfaceC33636Oooo00o) obj, (Continuation) obj2)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.zza;
        C32446OooOOOo.OooO0O0(obj);
        if (i == 0) {
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.zze;
            while (true) {
                zzgd zzgdVar = this.zzb;
                if (zzgdVar.zza() < 0) {
                    break;
                }
                if (zzgdVar.zza() >= this.zzc.size() || !C33633Oooo0.OooO0o(interfaceC33636Oooo00o)) {
                    break;
                }
                zzuf zzufVar = (zzuf) this.zzc.get(this.zzb.zza());
                try {
                    zzft.zzf(this.zzd, zzufVar, this.zzb);
                } catch (Exception e) {
                    zzufVar.zzk();
                    C25261OooO0o0.OooO0OO(zzufVar.zzg());
                    OooOo.o000oOoO(zzufVar.zzj(), null, null, null, new zzfp(this.zzd), 31);
                    zzft zzftVar = this.zzd;
                    zzgd zzgdVar2 = this.zzb;
                    this.zza = 1;
                    if (zzftVar.zzh(e, zzgdVar2, this) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                }
            }
            return C32460OooOooO.f116667OooO00o;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
