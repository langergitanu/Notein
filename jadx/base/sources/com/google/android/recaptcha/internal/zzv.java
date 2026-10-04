package com.google.android.recaptcha.internal;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24018OooO0oo;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34436OooOoOO;
import oOo000Oo.Oooo0;

/* JADX INFO: loaded from: classes7.dex */
public final class zzv extends zze {
    private final zzek zza;
    private final List zzb;
    private zzle zzc;
    private final Map zzd;

    public /* synthetic */ zzv(Context context, zzek zzekVar, zzbi zzbiVar, List list, int i, C24018OooO0oo c24018OooO0oo) {
        zzab zzabVar = new zzab(zzekVar.zza());
        zzp zzpVar = new zzp(zzekVar.zza());
        zzm zzmVar = new zzm(zzekVar.zza(), context.getContentResolver());
        zzn zznVar = new zzn(zzekVar.zza());
        zzek zzekVarZza = zzekVar.zza();
        InterfaceC33636Oooo00o interfaceC33636Oooo00oZzc = zzbiVar.zzc();
        List listOooOO0o = C34429OooOOo0.OooOO0o(zzabVar, zzpVar, zzmVar, zznVar, new zzae(zzekVarZza, context, interfaceC33636Oooo00oZzc, new zzan(context, interfaceC33636Oooo00oZzc, zzekVarZza, IntegrityManagerFactory.createStandard(context), 28800000L), new zzbs(GoogleApiAvailabilityLight.getInstance())));
        this.zza = zzekVar;
        this.zzb = listOooOO0o;
        this.zzd = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzsi zzq(String str) {
        Map linkedHashMap;
        List list = (List) this.zzd.remove(str);
        if (list != null) {
            List<zzaa> list2 = list;
            int iOooO0Oo = Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list2, 10));
            if (iOooO0Oo < 16) {
                iOooO0Oo = 16;
            }
            linkedHashMap = new LinkedHashMap(iOooO0Oo);
            for (zzaa zzaaVar : list2) {
                linkedHashMap.put(Integer.valueOf(zzaaVar.zzb()), zzaaVar);
            }
        } else {
            linkedHashMap = C34436OooOoOO.f123455OooOo0o;
        }
        zzsz zzszVarZzs = zzs(linkedHashMap, str);
        zzsh zzshVarZzf = zzsi.zzf();
        zzshVarZzf.zze(str);
        zzsf zzsfVarZzf = zzsg.zzf();
        byte[] bArrZzd = zzszVarZzs.zzd();
        zzsfVarZzf.zze(zzkh.zzh().zzi(bArrZzd, 0, bArrZzd.length));
        zzshVarZzf.zzf(zzsfVarZzf);
        return (zzsi) zzshVarZzf.zzk();
    }

    private final zzsx zzr(zzaa zzaaVar) {
        zzle zzleVar;
        zzsv zzsvVarZzf = zzsx.zzf();
        zzsvVarZzf.zzq(3);
        if (zzaaVar instanceof zzx) {
            zzti zztiVarZza = ((zzx) zzaaVar).zza();
            zzle zzleVar2 = this.zzc;
            zzleVar = zzleVar2 != null ? zzleVar2 : null;
            byte[] bArrZzd = zztiVarZza.zzd();
            zzsvVarZzf.zzf(zzcf.zza(zzkh.zzh().zzi(bArrZzd, 0, bArrZzd.length), zzleVar));
        } else {
            if (!(zzaaVar instanceof zzw)) {
                throw new C32442OooOO0o();
            }
            zzte zzteVarZza = ((zzw) zzaaVar).zza();
            zzle zzleVar3 = this.zzc;
            zzleVar = zzleVar3 != null ? zzleVar3 : null;
            byte[] bArrZzd2 = zzteVarZza.zzd();
            zzsvVarZzf.zze(zzcf.zza(zzkh.zzh().zzi(bArrZzd2, 0, bArrZzd2.length), zzleVar));
        }
        return (zzsx) zzsvVarZzf.zzk();
    }

    private final zzsz zzs(Map map, String str) {
        zzsy zzsyVarZzf = zzsz.zzf();
        zzsyVarZzf.zzq(str);
        List list = this.zzb;
        ArrayList<zzy> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((zzy) obj).zzf()) {
                arrayList.add(obj);
            }
        }
        for (zzy zzyVar : arrayList) {
            if (!map.containsKey(Integer.valueOf(zzyVar.zza()))) {
                int iZza = zzyVar.zza();
                zztd zztdVarZzf = zzte.zzf();
                zztdVarZzf.zzf(iZza);
                zztdVarZzf.zzr(13);
                zztdVarZzf.zzq(27);
                zzsyVarZzf.zzf(zzr(new zzw(iZza, (zzte) zztdVarZzf.zzk())));
            }
        }
        Collection collectionValues = map.values();
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(collectionValues, 10));
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList2.add(zzr((zzaa) it.next()));
        }
        zzsyVarZzf.zze(arrayList2);
        return (zzsz) zzsyVarZzf.zzk();
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final zzen zza(String str) {
        zzek zzekVar = this.zza;
        zzekVar.zzc(str);
        return zzekVar.zzf(35);
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final zzen zzb() {
        zzek zzekVar = this.zza;
        zzekVar.zzc(zzekVar.zzd());
        return zzekVar.zzf(34);
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzd(String str, Continuation continuation) {
        return zzq(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzf(String str, Continuation continuation) {
        zzq zzqVar;
        if (continuation instanceof zzq) {
            zzqVar = (zzq) continuation;
            int i = zzqVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzqVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzqVar = new zzq(this, continuation);
            }
        }
        Object objOooO0o0 = zzqVar.zza;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = zzqVar.zzc;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o0);
            zzs zzsVar = new zzs(this, str, null);
            zzqVar.zzc = 1;
            objOooO0o0 = C33633Oooo0.OooO0o0(zzsVar, zzqVar);
            if (objOooO0o0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0o0);
        }
        return ((C32445OooOOOO) objOooO0o0).f116639OooOo0o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzh(zzsc zzscVar, Continuation continuation) {
        zzt zztVar;
        if (continuation instanceof zzt) {
            zztVar = (zzt) continuation;
            int i = zztVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zztVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zztVar = new zzt(this, continuation);
            }
        }
        Object objOooO0o0 = zztVar.zza;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = zztVar.zzc;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o0);
            zzu zzuVar = new zzu(zzscVar, this, null);
            zztVar.zzc = 1;
            objOooO0o0 = C33633Oooo0.OooO0o0(zzuVar, zztVar);
            if (objOooO0o0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0o0);
        }
        return ((C32445OooOOOO) objOooO0o0).f116639OooOo0o;
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final void zzk(zzsr zzsrVar) {
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            ((zzy) it.next()).zze(zzsrVar);
        }
    }

    public final Map zzo() {
        return this.zzd;
    }
}
