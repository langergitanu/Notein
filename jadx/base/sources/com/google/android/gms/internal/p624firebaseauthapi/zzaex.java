package com.google.android.gms.internal.p624firebaseauthapi;

import com.alibaba.sdk.android.oss.internal.OooO00o;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes7.dex */
public class zzaex {
    private zzaex() {
    }

    public static Object zza(String str, Type type) throws zzacn {
        if (type != String.class) {
            if (type == Void.class) {
                return null;
            }
            try {
                try {
                    return ((zzaez) ((Class) type).getConstructor(new Class[0]).newInstance(new Object[0])).zza(str);
                } catch (Exception e) {
                    throw new zzacn(OooO00o.OooO00o("Json conversion failed! ", e.getMessage()), e);
                }
            } catch (Exception e2) {
                throw new zzacn("Instantiation of JsonResponse failed! ".concat(String.valueOf(type)), e2);
            }
        }
        try {
            zzagt zzagtVar = (zzagt) new zzagt().zza(str);
            if (zzagtVar.zzb()) {
                return zzagtVar.zza();
            }
            throw new zzacn("No error message: " + str);
        } catch (Exception e3) {
            throw new zzacn(OooO00o.OooO00o("Json conversion failed! ", e3.getMessage()), e3);
        }
    }
}
