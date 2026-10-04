package com.google.android.recaptcha.internal;

import android.content.Context;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import java.util.Timer;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o00OooO0.C25150OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33622OooOo00;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.InterfaceC33642Oooo0oo;
import oO0o0oOo.C33900OooO0o0;
import oO0o0oOo.InterfaceC33895OooO00o;

/* JADX INFO: loaded from: classes7.dex */
public final class zzan {
    public InterfaceC33622OooOo00 zza;
    private final InterfaceC33636Oooo00o zzb;
    private final zzek zzc;
    private final StandardIntegrityManager zzd;
    private long zzf;
    private boolean zzh;
    private zzao zze = zzao.zza;
    private final InterfaceC33895OooO00o zzg = C33900OooO0o0.OooO00o();

    public zzan(Context context, InterfaceC33636Oooo00o interfaceC33636Oooo00o, zzek zzekVar, StandardIntegrityManager standardIntegrityManager, long j) {
        this.zzb = interfaceC33636Oooo00o;
        this.zzc = zzekVar;
        this.zzd = standardIntegrityManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzi(Continuation continuation) throws Exception {
        zzag zzagVar;
        if (continuation instanceof zzag) {
            zzagVar = (zzag) continuation;
            int i = zzagVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzagVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzagVar = new zzag(this, continuation);
            }
        }
        Object obj = zzagVar.zza;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = zzagVar.zzc;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC33642Oooo0oo interfaceC33642Oooo0ooZza = zzbx.zza(this.zzd.prepareIntegrityToken(StandardIntegrityManager.PrepareIntegrityTokenRequest.builder().setCloudProjectNumber(this.zzf).build()));
        zzagVar.zzc = 1;
        Object objAwait = interfaceC33642Oooo0ooZza.await(zzagVar);
        return objAwait == enumC32485OooO00o ? enumC32485OooO00o : objAwait;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzj(String str, Continuation continuation) throws Exception {
        zzah zzahVar;
        if (continuation instanceof zzah) {
            zzahVar = (zzah) continuation;
            int i = zzahVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzahVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzahVar = new zzah(this, continuation);
            }
        }
        Object objAwait = zzahVar.zza;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = zzahVar.zzc;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objAwait);
            InterfaceC33622OooOo00 interfaceC33622OooOo00Zzf = zzf();
            zzahVar.zzd = str;
            zzahVar.zzc = 1;
            objAwait = interfaceC33622OooOo00Zzf.await(zzahVar);
            if (objAwait != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objAwait);
            return ((StandardIntegrityManager.StandardIntegrityToken) objAwait).token();
        }
        str = zzahVar.zzd;
        C32446OooOOOo.OooO0O0(objAwait);
        InterfaceC33642Oooo0oo interfaceC33642Oooo0ooZza = zzbx.zza(((StandardIntegrityManager.StandardIntegrityTokenProvider) objAwait).request(StandardIntegrityManager.StandardIntegrityTokenRequest.builder().setRequestHash(str).build()));
        zzahVar.zzd = null;
        zzahVar.zzc = 2;
        objAwait = interfaceC33642Oooo0ooZza.await(zzahVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0072, code lost:
    
        if (r8 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0067 A[PHI: r2 r7
      0x0067: PHI (r2v6 com.google.android.recaptcha.internal.zzan) = (r2v3 com.google.android.recaptcha.internal.zzan), (r2v8 com.google.android.recaptcha.internal.zzan) binds: [B:29:0x0064, B:16:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x0067: PHI (r7v4 java.lang.String) = (r7v1 java.lang.String), (r7v6 java.lang.String) binds: [B:29:0x0064, B:16:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzc(String str, Continuation continuation) throws Exception {
        zzaf zzafVar;
        zzan zzanVar;
        if (continuation instanceof zzaf) {
            zzafVar = (zzaf) continuation;
            int i = zzafVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzafVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzafVar = new zzaf(this, continuation);
            }
        }
        Object objZzj = zzafVar.zza;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = zzafVar.zzc;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objZzj);
            try {
                zzafVar.zzd = this;
                zzafVar.zze = str;
                zzafVar.zzc = 1;
                objZzj = zzj(str, zzafVar);
                if (objZzj != enumC32485OooO00o) {
                    zzanVar = this;
                }
            } catch (Exception unused) {
                zzanVar = this;
                zzafVar.zzd = zzanVar;
                zzafVar.zze = str;
                zzafVar.zzc = 2;
                if (zzanVar.zze(zzafVar) != enumC32485OooO00o) {
                }
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            str = zzafVar.zze;
            zzanVar = zzafVar.zzd;
            try {
                C32446OooOOOo.OooO0O0(objZzj);
            } catch (Exception unused2) {
                zzafVar.zzd = zzanVar;
                zzafVar.zze = str;
                zzafVar.zzc = 2;
                if (zzanVar.zze(zzafVar) != enumC32485OooO00o) {
                    zzafVar.zzd = null;
                    zzafVar.zze = null;
                    zzafVar.zzc = 3;
                    objZzj = zzanVar.zzj(str, zzafVar);
                }
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objZzj);
                return (String) objZzj;
            }
            str = zzafVar.zze;
            zzanVar = zzafVar.zzd;
            C32446OooOOOo.OooO0O0(objZzj);
            zzafVar.zzd = null;
            zzafVar.zze = null;
            zzafVar.zzc = 3;
            objZzj = zzanVar.zzj(str, zzafVar);
        }
        return (String) objZzj;
    }

    public final Object zzd(long j, Continuation continuation) {
        this.zzf = j;
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ad, code lost:
    
        if (oO00ooO.C32460OooOooO.f116667OooO00o == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zze(Continuation continuation) {
        zzak zzakVar;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        zzan zzanVar;
        if (continuation instanceof zzak) {
            zzakVar = (zzak) continuation;
            int i = zzakVar.zzd;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzakVar.zzd = i - Integer.MIN_VALUE;
            } else {
                zzakVar = new zzak(this, continuation);
            }
        }
        Object obj = zzakVar.zzb;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = zzakVar.zzd;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                interfaceC33895OooO00o = this.zzg;
                zzakVar.zze = this;
                zzakVar.zza = interfaceC33895OooO00o;
                zzakVar.zzd = 1;
                if (interfaceC33895OooO00o.OooO00o(zzakVar) != enumC32485OooO00o) {
                    zzanVar = this;
                }
                return enumC32485OooO00o;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            interfaceC33895OooO00o = (InterfaceC33895OooO00o) zzakVar.zza;
            zzanVar = zzakVar.zze;
            C32446OooOOOo.OooO0O0(obj);
            if (!OooOOO0.OooO0O0(zzanVar.zze, zzao.zza)) {
                return C32460OooOooO.f116667OooO00o;
            }
            zzanVar.zze = zzao.zzb;
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            interfaceC33895OooO00o.OooOOO0(null);
            zzek zzekVar = zzanVar.zzc;
            zzekVar.zzc(zzekVar.zzd());
            zzekVar.zzb(2);
            zzen zzenVarZzf = zzekVar.zzf(38);
            zzanVar.zza = C25150OooO00o.OooO0Oo();
            C33609OooO0oo.OooO0OO(zzanVar.zzb, null, null, new zzam(zzanVar, zzenVarZzf, null), 3);
            zzakVar.zze = null;
            zzakVar.zza = null;
            zzakVar.zzd = 2;
            if (!zzanVar.zzh) {
                new Timer().schedule(new zzai(zzanVar), 28800000L, 28800000L);
                zzanVar.zzh = true;
            }
        } finally {
            interfaceC33895OooO00o.OooOOO0(null);
        }
    }

    public final InterfaceC33622OooOo00 zzf() {
        InterfaceC33622OooOo00 interfaceC33622OooOo00 = this.zza;
        if (interfaceC33622OooOo00 != null) {
            return interfaceC33622OooOo00;
        }
        return null;
    }
}
