package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.internal.OooO00o;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.p624firebaseauthapi.zzaao;
import com.google.android.gms.internal.p624firebaseauthapi.zzahv;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorGenerator;
import com.google.firebase.auth.TotpMultiFactorInfo;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcb {
    private Context zza;
    private String zzb;
    private SharedPreferences zzc;
    private Logger zzd;

    public zzcb(Context context, String str) {
        Preconditions.checkNotNull(context);
        this.zzb = Preconditions.checkNotEmpty(str);
        this.zza = context.getApplicationContext();
        this.zzc = this.zza.getSharedPreferences(OooO00o.OooO00o("com.google.firebase.auth.api.Store.", this.zzb), 0);
        this.zzd = new Logger("StorageHelpers", new String[0]);
    }

    private final void zzb(String str) {
        this.zzc.edit().remove(str).apply();
    }

    private final String zzd(FirebaseUser firebaseUser) {
        boolean z;
        JSONObject jSONObject = new JSONObject();
        if (!(firebaseUser instanceof zzaf)) {
            return null;
        }
        zzaf zzafVar = (zzaf) firebaseUser;
        try {
            jSONObject.put("cachedTokenState", zzafVar.zze());
            jSONObject.put("applicationName", zzafVar.zza().getName());
            jSONObject.put(C18437z2.f56754h, "com.google.firebase.auth.internal.DefaultFirebaseUser");
            if (zzafVar.zzj() != null) {
                JSONArray jSONArray = new JSONArray();
                List<zzab> listZzj = zzafVar.zzj();
                int size = listZzj.size();
                if (listZzj.size() > 30) {
                    this.zzd.m74924w("Provider user info list size larger than max size, truncating list to %d. Actual list size: %d", 30, Integer.valueOf(listZzj.size()));
                    size = 30;
                }
                int i = 0;
                boolean z2 = false;
                while (true) {
                    z = true;
                    if (i >= size) {
                        break;
                    }
                    zzab zzabVar = listZzj.get(i);
                    if (zzabVar.getProviderId().equals("firebase")) {
                        z2 = true;
                    }
                    if (i == size - 1 && !z2) {
                        break;
                    }
                    jSONArray.put(zzabVar.zzb());
                    i++;
                }
                if (!z2) {
                    for (int i2 = size - 1; i2 < listZzj.size() && i2 >= 0; i2++) {
                        zzab zzabVar2 = listZzj.get(i2);
                        if (zzabVar2.getProviderId().equals("firebase")) {
                            jSONArray.put(zzabVar2.zzb());
                            break;
                        }
                        if (i2 == listZzj.size() - 1) {
                            jSONArray.put(zzabVar2.zzb());
                        }
                    }
                    z = z2;
                    if (!z) {
                        this.zzd.m74924w("Malformed user object! No Firebase Auth provider id found. Provider user info list size: %d, trimmed size: %d", Integer.valueOf(listZzj.size()), Integer.valueOf(size));
                        if (listZzj.size() < 5) {
                            StringBuilder sb = new StringBuilder("Provider user info list:\n");
                            Iterator<zzab> it = listZzj.iterator();
                            while (it.hasNext()) {
                                sb.append("Provider - " + it.next().getProviderId() + IOUtils.LINE_SEPARATOR_UNIX);
                            }
                            this.zzd.m74924w(sb.toString(), new Object[0]);
                        }
                    }
                }
                jSONObject.put("userInfos", jSONArray);
            }
            jSONObject.put("anonymous", zzafVar.isAnonymous());
            jSONObject.put("version", "2");
            if (zzafVar.getMetadata() != null) {
                jSONObject.put("userMetadata", ((zzah) zzafVar.getMetadata()).zza());
            }
            List<MultiFactorInfo> enrolledFactors = ((zzaj) zzafVar.getMultiFactor()).getEnrolledFactors();
            if (enrolledFactors != null && !enrolledFactors.isEmpty()) {
                JSONArray jSONArray2 = new JSONArray();
                for (int i3 = 0; i3 < enrolledFactors.size(); i3++) {
                    jSONArray2.put(enrolledFactors.get(i3).toJson());
                }
                jSONObject.put("userMultiFactorInfo", jSONArray2);
            }
            List<com.google.firebase.auth.zzan> listZzf = zzafVar.zzf();
            if (listZzf != null && !listZzf.isEmpty()) {
                JSONArray jSONArray3 = new JSONArray();
                for (int i4 = 0; i4 < listZzf.size(); i4++) {
                    jSONArray3.put(com.google.firebase.auth.zzan.zza(listZzf.get(i4)));
                }
                jSONObject.put("passkeyInfo", jSONArray3);
            }
            return jSONObject.toString();
        } catch (Exception e) {
            this.zzd.wtf("Failed to turn object into JSON", e, new Object[0]);
            throw new zzaao(e);
        }
    }

    public final FirebaseUser zza() {
        String strZza = zza("com.google.firebase.auth.FIREBASE_USER");
        if (TextUtils.isEmpty(strZza)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(strZza);
            if (jSONObject.has(C18437z2.f56754h) && "com.google.firebase.auth.internal.DefaultFirebaseUser".equalsIgnoreCase(jSONObject.optString(C18437z2.f56754h))) {
                return zza(jSONObject);
            }
        } catch (Exception unused) {
            this.zzd.m74921i("Failed to restore user data from persistent storage.", new Object[0]);
        }
        return null;
    }

    public final void zzc(FirebaseUser firebaseUser) {
        Preconditions.checkNotNull(firebaseUser);
        String strZzd = zzd(firebaseUser);
        if (TextUtils.isEmpty(strZzd)) {
            return;
        }
        zza("com.google.firebase.auth.FIREBASE_USER", strZzd);
    }

    public final void zzb() {
        zzb("com.google.firebase.auth.FIREBASE_USER");
    }

    public final void zzb(FirebaseUser firebaseUser) {
        Preconditions.checkNotNull(firebaseUser);
        zzb(OooO00o.OooO00o("com.google.firebase.auth.GET_TOKEN_RESPONSE.", firebaseUser.getUid()));
    }

    public final zzahv zza(FirebaseUser firebaseUser) {
        Preconditions.checkNotNull(firebaseUser);
        String strZza = zza(OooO00o.OooO00o("com.google.firebase.auth.GET_TOKEN_RESPONSE.", firebaseUser.getUid()));
        if (strZza == null) {
            return null;
        }
        try {
            return zzahv.zzb(strZza);
        } catch (zzaao unused) {
            this.zzd.m74921i("Failed to restore token data from persistent storage.", new Object[0]);
            return null;
        }
    }

    private final zzaf zza(JSONObject jSONObject) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        SafeParcelable safeParcelableZza;
        zzah zzahVarZza;
        try {
            String string = jSONObject.getString("cachedTokenState");
            String string2 = jSONObject.getString("applicationName");
            boolean z = jSONObject.getBoolean("anonymous");
            String string3 = jSONObject.getString("version");
            String str = string3 != null ? string3 : "2";
            JSONArray jSONArray3 = jSONObject.getJSONArray("userInfos");
            int length = jSONArray3.length();
            if (length == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(zzab.zza(jSONArray3.getString(i)));
            }
            zzaf zzafVar = new zzaf(FirebaseApp.getInstance(string2), arrayList);
            if (!TextUtils.isEmpty(string)) {
                zzafVar.zza(zzahv.zzb(string));
            }
            if (!z) {
                zzafVar.zzb();
            }
            zzafVar.zza(str);
            if (jSONObject.has("userMetadata") && (zzahVarZza = zzah.zza(jSONObject.getJSONObject("userMetadata"))) != null) {
                zzafVar.zza(zzahVarZza);
            }
            if (jSONObject.has("userMultiFactorInfo") && (jSONArray2 = jSONObject.getJSONArray("userMultiFactorInfo")) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    JSONObject jSONObject2 = new JSONObject(jSONArray2.getString(i2));
                    String strOptString = jSONObject2.optString(MultiFactorInfo.FACTOR_ID_KEY);
                    if ("phone".equals(strOptString)) {
                        safeParcelableZza = PhoneMultiFactorInfo.zza(jSONObject2);
                    } else {
                        safeParcelableZza = Objects.equals(strOptString, TotpMultiFactorGenerator.FACTOR_ID) ? TotpMultiFactorInfo.zza(jSONObject2) : null;
                    }
                    arrayList2.add(safeParcelableZza);
                }
                zzafVar.zzc(arrayList2);
            }
            if (jSONObject.has("passkeyInfo") && (jSONArray = jSONObject.getJSONArray("passkeyInfo")) != null) {
                ArrayList arrayList3 = new ArrayList();
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    arrayList3.add(com.google.firebase.auth.zzan.zza(new JSONObject(jSONArray.getString(i3))));
                }
                zzafVar.zzb(arrayList3);
            }
            return zzafVar;
        } catch (zzaao e) {
            e = e;
            this.zzd.wtf(e);
            return null;
        } catch (ArrayIndexOutOfBoundsException e2) {
            e = e2;
            this.zzd.wtf(e);
            return null;
        } catch (IllegalArgumentException e3) {
            e = e3;
            this.zzd.wtf(e);
            return null;
        } catch (JSONException e4) {
            e = e4;
            this.zzd.wtf(e);
            return null;
        }
    }

    private final String zza(String str) {
        String string = this.zzc.getString(str, null);
        if (string != null) {
            return string.startsWith("ENCRYPTED:") ? zzby.zza(this.zza, this.zzb).zza(string.substring(10)) : string;
        }
        return null;
    }

    private final void zza(String str, String str2) {
        String strZzb = zzby.zza(this.zza, this.zzb).zzb(str2);
        if (strZzb != null) {
            this.zzc.edit().putString(str, "ENCRYPTED:".concat(strZzb)).apply();
        }
    }

    public final void zza(FirebaseUser firebaseUser, zzahv zzahvVar) {
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotNull(zzahvVar);
        zza(OooO00o.OooO00o("com.google.firebase.auth.GET_TOKEN_RESPONSE.", firebaseUser.getUid()), zzahvVar.zzf());
    }
}
