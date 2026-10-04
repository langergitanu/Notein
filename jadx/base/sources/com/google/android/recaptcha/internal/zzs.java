package com.google.android.recaptcha.internal;

import Oooo0.C20857Oooooo;
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
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.InterfaceC33672o00ooo;

/* JADX INFO: loaded from: classes7.dex */
final class zzs extends AbstractC32476OooO implements InterfaceC32508OooOOOo {
    int zza;
    final /* synthetic */ zzv zzb;
    final /* synthetic */ String zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(zzv zzvVar, String str, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzvVar;
        this.zzc = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation create(Object obj, Continuation continuation) {
        zzs zzsVar = new zzs(this.zzb, this.zzc, continuation);
        zzsVar.zzd = obj;
        return zzsVar;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzs) create((InterfaceC33636Oooo00o) obj, (Continuation) obj2)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.zza;
        C32446OooOOOo.OooO0O0(obj);
        if (i == 0) {
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.zzd;
            ArrayList arrayList = new ArrayList();
            zzv zzvVar = this.zzb;
            zzvVar.zzo().put(this.zzc, arrayList);
            ArrayList arrayList2 = new ArrayList();
            List list = this.zzb.zzb;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (((zzy) obj2).zzf()) {
                    arrayList3.add(obj2);
                }
            }
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList2.add(C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new zzr((zzy) it.next(), this.zzc, arrayList, null), 3));
            }
            InterfaceC33672o00ooo[] interfaceC33672o00oooArr = (InterfaceC33672o00ooo[]) arrayList2.toArray(new InterfaceC33672o00ooo[0]);
            InterfaceC33672o00ooo[] interfaceC33672o00oooArr2 = (InterfaceC33672o00ooo[]) Arrays.copyOf(interfaceC33672o00oooArr, interfaceC33672o00oooArr.length);
            this.zza = 1;
            if (C20857Oooooo.OooO0o0(interfaceC33672o00oooArr2, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        }
        return new C32445OooOOOO(this.zzb.zzq(this.zzc));
    }
}
