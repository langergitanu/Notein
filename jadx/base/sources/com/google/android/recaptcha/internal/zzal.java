package com.google.android.recaptcha.internal;

import com.google.android.play.core.integrity.StandardIntegrityException;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24034Oooo00O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes7.dex */
final class zzal extends AbstractC32476OooO implements InterfaceC32508OooOOOo {
    long zza;
    boolean zzb;
    int zzc;
    final /* synthetic */ zzan zzd;
    final /* synthetic */ zzen zze;
    final /* synthetic */ C24034Oooo00O zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzal(zzan zzanVar, zzen zzenVar, C24034Oooo00O c24034Oooo00O, Continuation continuation) {
        super(2, continuation);
        this.zzd = zzanVar;
        this.zze = zzenVar;
        this.zzf = c24034Oooo00O;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzal(this.zzd, this.zze, this.zzf, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzal) create((InterfaceC33636Oooo00o) obj, (Continuation) obj2)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        if (r8 != r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
    
        if (oO0o0OO.C33644OoooO0.OooO00o(r4, r7) != r0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007f, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0024 A[Catch: Exception -> 0x001a, TRY_ENTER, TryCatch #0 {Exception -> 0x001a, blocks: (B:14:0x0024, B:16:0x0030, B:8:0x0016), top: B:41:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0081  */
    /* JADX WARN: Type inference failed for: r8v2, types: [T, java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0047 -> B:13:0x0022). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x007a -> B:6:0x0011). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        boolean z;
        boolean z2;
        int errorCode;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.zzc;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            j = 1000;
            z = true;
            if (!z) {
            }
        } else if (i != 1) {
            z2 = this.zzb;
            j = this.zza;
            C32446OooOOOo.OooO0O0(obj);
            z = z2;
            j += j;
            if (!z) {
                return C32460OooOooO.f116667OooO00o;
            }
            zzan zzanVar = this.zzd;
            this.zza = j;
            this.zzc = 1;
            obj = zzanVar.zzi(this);
        } else {
            j = this.zza;
            try {
                C32446OooOOOo.OooO0O0(obj);
            } catch (Exception e) {
                this.zzf.f80942OooOo0o = e;
                z2 = (e instanceof StandardIntegrityException) && ((errorCode = ((StandardIntegrityException) e).getErrorCode()) == -100 || errorCode == -18 || errorCode == -12 || errorCode == -8 || errorCode == -3);
                if (!z2) {
                    throw e;
                }
                this.zza = j;
                this.zzb = true;
                this.zzc = 2;
            }
            this.zzd.zzf().Oooo0((StandardIntegrityManager.StandardIntegrityTokenProvider) obj);
            this.zzd.zze = zzao.zzc;
            this.zze.zza();
            z = false;
            if (!z) {
            }
        }
    }
}
