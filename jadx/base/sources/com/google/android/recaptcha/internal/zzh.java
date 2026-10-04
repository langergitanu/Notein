package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33604OooO0OO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.InterfaceC33642Oooo0oo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes7.dex */
final class zzh extends AbstractC32476OooO implements InterfaceC32508OooOOOo {
    int zza;
    final /* synthetic */ zzl zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzh(zzl zzlVar, String str, long j, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzlVar;
        this.zzc = str;
        this.zzd = j;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation create(Object obj, Continuation continuation) {
        zzh zzhVar = new zzh(this.zzb, this.zzc, this.zzd, continuation);
        zzhVar.zze = obj;
        return zzhVar;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzh) create((InterfaceC33636Oooo00o) obj, (Continuation) obj2)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        zzen zzenVarZzf;
        zzen zzenVar;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (this.zza != 0) {
            zzenVar = (zzen) this.zze;
            C32446OooOOOo.OooO0O0(obj);
        } else {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.zze;
            zzek zzekVar = this.zzb.zzb;
            if (zzekVar != null) {
                zzekVar.zzc(this.zzc);
                zzenVarZzf = zzekVar.zzf(31);
            } else {
                zzenVarZzf = null;
            }
            ArrayList arrayList = new ArrayList();
            for (zze zzeVar : this.zzb.zzd()) {
                if (zzeVar.zzl()) {
                    arrayList.add(C33609OooO0oo.OooO00o(interfaceC33636Oooo00o, null, new zzg(zzeVar, this.zzc, this.zzd, null), 3));
                }
            }
            InterfaceC33642Oooo0oo[] interfaceC33642Oooo0ooArr = (InterfaceC33642Oooo0oo[]) arrayList.toArray(new InterfaceC33642Oooo0oo[0]);
            InterfaceC33642Oooo0oo[] interfaceC33642Oooo0ooArr2 = (InterfaceC33642Oooo0oo[]) Arrays.copyOf(interfaceC33642Oooo0ooArr, interfaceC33642Oooo0ooArr.length);
            this.zze = zzenVarZzf;
            this.zza = 1;
            obj = interfaceC33642Oooo0ooArr2.length == 0 ? C34434OooOoO.f123453OooOo0o : new C33604OooO0OO(interfaceC33642Oooo0ooArr2).OooO00o(this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            zzenVar = zzenVarZzf;
        }
        String str = this.zzc;
        zzsh zzshVarZzf = zzsi.zzf();
        zzshVarZzf.zze(str);
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            Object obj2 = ((C32445OooOOOO) it.next()).f116639OooOo0o;
            if (!(obj2 instanceof C32445OooOOOO.OooO00o)) {
                zzshVarZzf.zzh((zzsi) obj2);
            }
        }
        zzsi zzsiVar = (zzsi) zzshVarZzf.zzk();
        if (zzenVar != null) {
            zzenVar.zza();
        }
        return zzsiVar;
    }
}
