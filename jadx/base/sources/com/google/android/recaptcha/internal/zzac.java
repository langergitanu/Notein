package com.google.android.recaptcha.internal;

import com.google.android.play.core.integrity.StandardIntegrityException;
import com.google.android.play.core.integrity.model.StandardIntegrityErrorCode;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes7.dex */
final class zzac extends AbstractC32476OooO implements InterfaceC32508OooOOOo {
    Object zza;
    int zzb;
    final /* synthetic */ zzae zzc;
    final /* synthetic */ String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzac(zzae zzaeVar, String str, Continuation continuation) {
        super(2, continuation);
        this.zzc = zzaeVar;
        this.zzd = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzac(this.zzc, this.zzd, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzac) create((InterfaceC33636Oooo00o) obj, (Continuation) obj2)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (r7 != r0) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.google.android.recaptcha.internal.zzen] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzy zzyVar;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        zzen zzenVar = this.zzb;
        try {
        } catch (Exception e) {
            zzenVar.zzb(new zzbd(zzbb.zzb, zzba.zzaa, e.getMessage()));
            zzae zzaeVar = this.zzc;
            this.zza = zzaeVar;
            int i = 2;
            this.zzb = 2;
            if (e instanceof StandardIntegrityException) {
                int errorCode = ((StandardIntegrityException) e).getErrorCode();
                if (errorCode == -100) {
                    i = 44;
                } else if (errorCode == -12) {
                    i = 39;
                } else if (errorCode == -3) {
                    i = 30;
                } else if (errorCode == -2) {
                    i = 29;
                } else if (errorCode != -1) {
                    switch (errorCode) {
                        case StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                            i = 54;
                            break;
                        case StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                            i = 53;
                            break;
                        case -17:
                            i = 52;
                            break;
                        case -16:
                            i = 43;
                            break;
                        case -15:
                            i = 42;
                            break;
                        case -14:
                            i = 41;
                            break;
                        default:
                            switch (errorCode) {
                                case -9:
                                    i = 36;
                                    break;
                                case -8:
                                    i = 35;
                                    break;
                                case -7:
                                    i = 34;
                                    break;
                                case -6:
                                    i = 33;
                                    break;
                                case -5:
                                    i = 32;
                                    break;
                            }
                            break;
                    }
                } else {
                    i = 28;
                }
            } else {
                i = 45;
            }
            zztd zztdVarZzf = zzte.zzf();
            zztdVarZzf.zzq(i);
            zztdVarZzf.zzr(15);
            obj = zztdVarZzf.zzk();
            if (obj != enumC32485OooO00o) {
                zzyVar = zzaeVar;
            }
            return enumC32485OooO00o;
        }
        if (zzenVar == 0) {
            C32446OooOOOo.OooO0O0(obj);
            zzen zzenVarZzb = zzz.zzb(this.zzc, this.zzd);
            zzae zzaeVar2 = this.zzc;
            zzan zzanVar = zzaeVar2.zzc;
            String str = zzaeVar2.zze;
            this.zza = zzenVarZzb;
            this.zzb = 1;
            obj = zzanVar.zzc(str, this);
            zzenVar = zzenVarZzb;
        } else {
            if (zzenVar != 1) {
                zzyVar = (zzy) this.zza;
                C32446OooOOOo.OooO0O0(obj);
                int iZza = zzyVar.zza();
                zztd zztdVar = (zztd) ((zzte) obj).zzr();
                zztdVar.zzf(zzyVar.zza());
                return new zzw(iZza, (zzte) zztdVar.zzk());
            }
            zzen zzenVar2 = (zzen) this.zza;
            C32446OooOOOo.OooO0O0(obj);
            zzenVar = zzenVar2;
        }
        zzenVar.zza();
        zzae zzaeVar3 = this.zzc;
        zztf zztfVarZzf = zzti.zzf();
        zztg zztgVarZzf = zzth.zzf();
        zztgVarZzf.zzw((String) obj);
        zztfVarZzf.zzf((zzth) zztgVarZzf.zzk());
        return zzz.zza(zzaeVar3, (zzti) zztfVarZzf.zzk());
    }
}
