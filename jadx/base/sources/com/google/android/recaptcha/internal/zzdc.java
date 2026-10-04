package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaClient;
import com.google.android.recaptcha.RecaptchaTasksClient;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33588OooOO0;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: loaded from: classes7.dex */
public final class zzdc implements RecaptchaClient, RecaptchaTasksClient {
    private static final C33588OooOO0 zza = new C33588OooOO0("^[a-zA-Z0-9/_]{0,100}$");
    private final zzcn zzb;
    private final String zzc;
    private final zzek zzd;
    private final zzbi zze;

    public zzdc(zzcn zzcnVar, String str, zzbi zzbiVar, zzek zzekVar) {
        this.zzb = zzcnVar;
        this.zzc = str;
        this.zze = zzbiVar;
        this.zzd = zzekVar;
    }

    public static final /* synthetic */ void zze(zzdc zzdcVar, long j, RecaptchaAction recaptchaAction) throws zzbd {
        zzbd zzbdVar = !zza.OooO0O0(recaptchaAction.getAction()) ? new zzbd(zzbb.zzg, zzba.zzh, null) : null;
        if (j < 5000) {
            zzbdVar = new zzbd(zzbb.zzb, zzba.zzI, null);
        }
        if (zzbdVar != null) {
            throw zzbdVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzf(RecaptchaAction recaptchaAction, long j, Continuation continuation) {
        zzcy zzcyVar;
        String string;
        zzbd zzbdVar;
        if (continuation instanceof zzcy) {
            zzcyVar = (zzcy) continuation;
            int i = zzcyVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzcyVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzcyVar = new zzcy(this, continuation);
            }
        }
        Object objZzg = zzcyVar.zza;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = zzcyVar.zzc;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objZzg);
            try {
                string = UUID.randomUUID().toString();
            } catch (zzbd e) {
                e = e;
                zzbdVar = e;
                return C32446OooOOOo.OooO00o(zzbdVar.zzc());
            }
            try {
                InterfaceC32508OooOOOo zzczVar = new zzcz(this, j, recaptchaAction, string, null);
                zzcyVar.zzc = 1;
                objZzg = zzg(string, zzczVar, zzcyVar);
                if (objZzg == obj) {
                    return obj;
                }
            } catch (zzbd e2) {
                e = e2;
                zzbdVar = e;
                return C32446OooOOOo.OooO00o(zzbdVar.zzc());
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                C32446OooOOOo.OooO0O0(objZzg);
            } catch (zzbd e3) {
                zzbdVar = e3;
                return C32446OooOOOo.OooO00o(zzbdVar.zzc());
            }
        }
        return ((C32445OooOOOO) objZzg).f116639OooOo0o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.google.android.recaptcha.internal.zzen] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzg(String str, InterfaceC32508OooOOOo interfaceC32508OooOOOo, Continuation continuation) throws zzbd {
        zzdb zzdbVar;
        if (continuation instanceof zzdb) {
            zzdbVar = (zzdb) continuation;
            int i = zzdbVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzdbVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzdbVar = new zzdb(this, continuation);
            }
        }
        Object objInvoke = zzdbVar.zza;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = zzdbVar.zzc;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objInvoke);
                zzek zzekVarZza = this.zzd.zza();
                zzekVarZza.zzc(str);
                zzen zzenVarZzf = zzekVarZza.zzf(9);
                zzdbVar.zzd = zzenVarZzf;
                zzdbVar.zzc = 1;
                objInvoke = interfaceC32508OooOOOo.invoke(zzekVarZza, zzdbVar);
                str = zzenVarZzf;
                if (objInvoke == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zzen zzenVar = zzdbVar.zzd;
                C32446OooOOOo.OooO0O0(objInvoke);
                str = zzenVar;
            }
            str.zza();
            return objInvoke;
        } catch (zzbd e) {
            str.zzb(e);
            throw e;
        } catch (Exception e2) {
            zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzX, e2.getMessage());
            str.zzb(zzbdVar);
            throw zzbdVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* JADX INFO: renamed from: execute-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo80693execute0E7RQCE(RecaptchaAction recaptchaAction, long j, Continuation<? super C32445OooOOOO<String>> continuation) {
        zzcw zzcwVar;
        if (continuation instanceof zzcw) {
            zzcwVar = (zzcw) continuation;
            int i = zzcwVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzcwVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzcwVar = new zzcw(this, continuation);
            }
        }
        Object obj = zzcwVar.zza;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = zzcwVar.zzc;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return ((C32445OooOOOO) obj).f116639OooOo0o;
        }
        C32446OooOOOo.OooO0O0(obj);
        zzcwVar.zzc = 1;
        Object objZzf = zzf(recaptchaAction, j, zzcwVar);
        return objZzf == obj2 ? obj2 : objZzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* JADX INFO: renamed from: execute-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo80694executegIAlus(RecaptchaAction recaptchaAction, Continuation<? super C32445OooOOOO<String>> continuation) {
        zzcx zzcxVar;
        if (continuation instanceof zzcx) {
            zzcxVar = (zzcx) continuation;
            int i = zzcxVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzcxVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzcxVar = new zzcx(this, continuation);
            }
        }
        Object obj = zzcxVar.zza;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = zzcxVar.zzc;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return ((C32445OooOOOO) obj).f116639OooOo0o;
        }
        C32446OooOOOo.OooO0O0(obj);
        zzcxVar.zzc = 1;
        Object objMo80693execute0E7RQCE = mo80693execute0E7RQCE(recaptchaAction, 10000L, zzcxVar);
        return objMo80693execute0E7RQCE == obj2 ? obj2 : objMo80693execute0E7RQCE;
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction) {
        return zzas.zza(C33609OooO0oo.OooO00o(this.zze.zzb(), null, new zzda(this, recaptchaAction, 10000L, null), 3));
    }

    public final String zzd() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction, long j) {
        return zzas.zza(C33609OooO0oo.OooO00o(this.zze.zzb(), null, new zzda(this, recaptchaAction, j, null), 3));
    }
}
