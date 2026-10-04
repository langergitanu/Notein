package com.google.android.recaptcha.internal;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import oO0o0O0o.C33595OooOOo;
import oOo000Oo.AbstractC34427OooOOOo;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes7.dex */
public final class zzbm implements zzaq {
    private final Context zza;
    private final String zzb = "rce_";

    public zzbm(Context context) {
        this.zza = context;
        new zzcd(context);
    }

    @Override // com.google.android.recaptcha.internal.zzaq
    public final String zza(String str) {
        File file = new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str)));
        if (file.exists()) {
            return new String(zzcd.zza(file), StandardCharsets.UTF_8);
        }
        return null;
    }

    @Override // com.google.android.recaptcha.internal.zzaq
    public final void zzb() {
        try {
            File[] fileArrListFiles = this.zza.getCacheDir().listFiles();
            if (fileArrListFiles != null) {
                ArrayList arrayList = new ArrayList();
                for (File file : fileArrListFiles) {
                    if (C33595OooOOo.OooOoO0(file.getName(), this.zzb, false)) {
                        arrayList.add(file);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.google.android.recaptcha.internal.zzaq
    public final void zzc(String str, String str2) throws GeneralSecurityException, IOException {
        oO0O00oo.OooO0OO oooO0OO = new oO0O00oo.OooO0OO('A', 'z');
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(oooO0OO, 10));
        Iterator<Character> it = oooO0OO.iterator();
        while (((oO0O00oo.OooO0O0) it).f116810OooOoO0) {
            arrayList.add(Character.valueOf(((AbstractC34427OooOOOo) it).OooO00o()));
        }
        List listO0OOO0o = OooOo.o0OOO0o(arrayList);
        Collections.shuffle(listO0OOO0o);
        String strO000oOoO = OooOo.o000oOoO(((ArrayList) listO0OOO0o).subList(0, 8), "", null, null, null, 62);
        File file = new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(strO000oOoO)));
        zzcd.zzb(file, String.valueOf(str2).getBytes(StandardCharsets.UTF_8));
        file.renameTo(new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str))));
    }

    @Override // com.google.android.recaptcha.internal.zzaq
    public final boolean zzd(String str) {
        File file;
        try {
            File[] fileArrListFiles = this.zza.getCacheDir().listFiles();
            file = null;
            if (fileArrListFiles != null) {
                int length = fileArrListFiles.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    File file2 = fileArrListFiles[i];
                    if (OooOOO0.OooO0O0(file2.getName(), this.zzb + str)) {
                        file = file2;
                        break;
                    }
                    i++;
                }
            }
        } catch (Exception unused) {
        }
        return file != null;
    }
}
