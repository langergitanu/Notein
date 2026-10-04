package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
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
final class zzk extends AbstractC32476OooO implements InterfaceC32508OooOOOo {
    int zza;
    final /* synthetic */ zzl zzb;
    final /* synthetic */ zzek zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzsc zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzk(zzl zzlVar, zzek zzekVar, long j, zzsc zzscVar, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzlVar;
        this.zzc = zzekVar;
        this.zzd = j;
        this.zze = zzscVar;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation create(Object obj, Continuation continuation) {
        zzk zzkVar = new zzk(this.zzb, this.zzc, this.zzd, this.zze, continuation);
        zzkVar.zzf = obj;
        return zzkVar;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzk) create((InterfaceC33636Oooo00o) obj, (Continuation) obj2)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        zzen zzenVar;
        Object objOooO00o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (this.zza != 0) {
            zzenVar = (zzen) this.zzf;
            C32446OooOOOo.OooO0O0(obj);
        } else {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.zzf;
            this.zzb.zzb = this.zzc;
            zzek zzekVar = this.zzc;
            zzekVar.zzc(zzekVar.zzd());
            zzen zzenVarZzf = zzekVar.zzf(30);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzb.zzd().iterator();
            while (it.hasNext()) {
                arrayList.add(C33609OooO0oo.OooO00o(interfaceC33636Oooo00o, null, new zzj((zze) it.next(), this.zzd, this.zze, null), 3));
            }
            InterfaceC33642Oooo0oo[] interfaceC33642Oooo0ooArr = (InterfaceC33642Oooo0oo[]) arrayList.toArray(new InterfaceC33642Oooo0oo[0]);
            InterfaceC33642Oooo0oo[] interfaceC33642Oooo0ooArr2 = (InterfaceC33642Oooo0oo[]) Arrays.copyOf(interfaceC33642Oooo0ooArr, interfaceC33642Oooo0ooArr.length);
            this.zzf = zzenVarZzf;
            this.zza = 1;
            obj = interfaceC33642Oooo0ooArr2.length == 0 ? C34434OooOoO.f123453OooOo0o : new C33604OooO0OO(interfaceC33642Oooo0ooArr2).OooO00o(this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            zzenVar = zzenVarZzf;
        }
        List list = (List) obj;
        if ((list instanceof Collection) && list.isEmpty()) {
            zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzY, null);
            zzenVar.zzb(zzbdVar);
            objOooO00o = C32446OooOOOo.OooO00o(zzbdVar);
        } else {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (!(((C32445OooOOOO) it2.next()).f116639OooOo0o instanceof C32445OooOOOO.OooO00o)) {
                    zzenVar.zza();
                    objOooO00o = C32460OooOooO.f116667OooO00o;
                    break;
                }
            }
            zzbd zzbdVar2 = new zzbd(zzbb.zzb, zzba.zzY, null);
            zzenVar.zzb(zzbdVar2);
            objOooO00o = C32446OooOOOo.OooO00o(zzbdVar2);
        }
        return new C32445OooOOOO(objOooO00o);
    }
}
