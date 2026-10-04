package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes7.dex */
final class zzil extends AbstractC32476OooO implements InterfaceC32508OooOOOo {
    Object zza;
    int zzb;
    final /* synthetic */ zzja zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzil(zzja zzjaVar, Continuation continuation) {
        super(2, continuation);
        this.zzc = zzjaVar;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzil(this.zzc, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzil) create((InterfaceC33636Oooo00o) obj, (Continuation) obj2)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        if (r7 == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055 A[PHI: r7
      0x0055: PHI (r7v15 java.lang.Object) = (r7v11 java.lang.Object), (r7v0 java.lang.Object) binds: [B:16:0x0053, B:7:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.zzb;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            zzja zzjaVar = this.zzc;
            this.zzb = 1;
            obj = zzjaVar.zzw(this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                C32446OooOOOo.OooO0O0(obj);
                if (i == 3) {
                    ((WebView) obj).addJavascriptInterface(this.zzc.zzq(), "RN");
                    zzja zzjaVar2 = this.zzc;
                    this.zzb = 4;
                    obj = zzjaVar2.zzw(this);
                }
                ((WebView) obj).setWebViewClient(new zzik(this.zzc));
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            ((WebView) obj).getSettings().setJavaScriptEnabled(true);
            zzja zzjaVar3 = this.zzc;
            this.zza = null;
            this.zzb = 3;
            obj = zzjaVar3.zzw(this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        ((WebView) obj).removeJavascriptInterface("RN");
        zzja zzjaVar4 = this.zzc;
        this.zza = zzjaVar4;
        this.zzb = 2;
        obj = zzjaVar4.zzw(this);
        if (obj != enumC32485OooO00o) {
            ((WebView) obj).getSettings().setJavaScriptEnabled(true);
            zzja zzjaVar32 = this.zzc;
            this.zza = null;
            this.zzb = 3;
            obj = zzjaVar32.zzw(this);
            if (obj != enumC32485OooO00o) {
            }
        }
        return enumC32485OooO00o;
    }
}
