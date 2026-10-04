package com.google.android.gms.measurement.internal;

import android.app.BroadcastOptions;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.core.location.LocationRequestCompat;
import com.android.billingclient.api.C22172OooOoO;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzpr;
import com.google.android.gms.internal.measurement.zzqp;
import com.google.android.gms.internal.measurement.zzrb;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.network.embedded.C18168f2;
import com.huawei.hms.network.embedded.C18250l0;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes7.dex */
public final class zzpg implements zzjg {
    private static volatile zzpg zzb;
    private List zzA;
    private long zzB;
    private final Map zzC;
    private final Map zzD;
    private final Map zzE;
    private zzlu zzG;
    private String zzH;
    private zzay zzI;
    private long zzJ;
    long zza;
    private final zzht zzc;
    private final zzgz zzd;
    private zzav zze;
    private zzhb zzf;
    private zzok zzg;
    private zzad zzh;
    private final zzpk zzi;
    private zzlp zzj;
    private zznn zzk;
    private final zzou zzl;
    private zzhk zzm;
    private final zzic zzn;
    private boolean zzp;
    private List zzq;
    private int zzs;
    private int zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private FileLock zzx;
    private FileChannel zzy;
    private List zzz;
    private final AtomicBoolean zzo = new AtomicBoolean(false);
    private final Deque zzr = new LinkedList();
    private final Map zzF = new HashMap();
    private final zzpo zzK = new zzpb(this);

    public zzpg(zzph zzphVar, zzic zzicVar) {
        Preconditions.checkNotNull(zzphVar);
        this.zzn = zzic.zzy(zzphVar.zza, null, null);
        this.zzB = -1L;
        this.zzl = new zzou(this);
        zzpk zzpkVar = new zzpk(this);
        zzpkVar.zzax();
        this.zzi = zzpkVar;
        zzgz zzgzVar = new zzgz(this);
        zzgzVar.zzax();
        this.zzd = zzgzVar;
        zzht zzhtVar = new zzht(this);
        zzhtVar.zzax();
        this.zzc = zzhtVar;
        this.zzC = new HashMap();
        this.zzD = new HashMap();
        this.zzE = new HashMap();
        zzaW().zzj(new zzov(this, zzphVar));
    }

    public static zzpg zza(Context context) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzb == null) {
            synchronized (zzpg.class) {
                try {
                    if (zzb == null) {
                        zzb = new zzpg((zzph) Preconditions.checkNotNull(new zzph(context)), null);
                    }
                } finally {
                }
            }
        }
        return zzb;
    }

    public static final void zzaA(com.google.android.gms.internal.measurement.zzhr zzhrVar, int i, String str) {
        List listZza = zzhrVar.zza();
        for (int i2 = 0; i2 < listZza.size(); i2++) {
            if ("_err".equals(((com.google.android.gms.internal.measurement.zzhw) listZza.get(i2)).zzb())) {
                return;
            }
        }
        com.google.android.gms.internal.measurement.zzhv zzhvVarZzn = com.google.android.gms.internal.measurement.zzhw.zzn();
        zzhvVarZzn.zzb("_err");
        zzhvVarZzn.zzf(i);
        com.google.android.gms.internal.measurement.zzhw zzhwVar = (com.google.android.gms.internal.measurement.zzhw) zzhvVarZzn.zzbc();
        com.google.android.gms.internal.measurement.zzhv zzhvVarZzn2 = com.google.android.gms.internal.measurement.zzhw.zzn();
        zzhvVarZzn2.zzb("_ev");
        zzhvVarZzn2.zzd(str);
        com.google.android.gms.internal.measurement.zzhw zzhwVar2 = (com.google.android.gms.internal.measurement.zzhw) zzhvVarZzn2.zzbc();
        zzhrVar.zzf(zzhwVar);
        zzhrVar.zzf(zzhwVar2);
    }

    public static final void zzaB(com.google.android.gms.internal.measurement.zzhr zzhrVar, String str) {
        List listZza = zzhrVar.zza();
        for (int i = 0; i < listZza.size(); i++) {
            if (str.equals(((com.google.android.gms.internal.measurement.zzhw) listZza.get(i)).zzb())) {
                zzhrVar.zzj(i);
                return;
            }
        }
    }

    private final int zzaC(String str, zzan zzanVar) {
        zzjk zzjkVar;
        zzji zzjiVarZzA;
        zzht zzhtVar = this.zzc;
        if (zzhtVar.zzx(str) == null) {
            zzanVar.zzc(zzjk.AD_PERSONALIZATION, zzam.FAILSAFE);
            return 1;
        }
        zzh zzhVarZzu = zzj().zzu(str);
        if (zzhVarZzu != null && zze.zzc(zzhVarZzu.zzaH()).zza() == zzji.POLICY && (zzjiVarZzA = zzhtVar.zzA(str, (zzjkVar = zzjk.AD_PERSONALIZATION))) != zzji.UNINITIALIZED) {
            zzanVar.zzc(zzjkVar, zzam.REMOTE_ENFORCED_DEFAULT);
            return zzjiVarZzA == zzji.GRANTED ? 0 : 1;
        }
        zzjk zzjkVar2 = zzjk.AD_PERSONALIZATION;
        zzanVar.zzc(zzjkVar2, zzam.REMOTE_DEFAULT);
        return zzhtVar.zzv(str, zzjkVar2) ? 0 : 1;
    }

    private final Map zzaD(com.google.android.gms.internal.measurement.zzhs zzhsVar) {
        HashMap map = new HashMap();
        zzp();
        for (Map.Entry entry : zzpk.zzH(zzhsVar, "gad_").entrySet()) {
            map.put((String) entry.getKey(), String.valueOf(entry.getValue()));
        }
        return map;
    }

    private final zzay zzaE() {
        if (this.zzI == null) {
            this.zzI = new zzoy(this, this.zzn);
        }
        return this.zzI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzaF, reason: merged with bridge method [inline-methods] */
    public final void zzav() {
        zzaW().zzg();
        if (this.zzr.isEmpty() || zzaE().zzc()) {
            return;
        }
        long jMax = Math.max(0L, ((long) ((Integer) zzfy.zzaB.zzb(null)).intValue()) - (zzaZ().elapsedRealtime() - this.zzJ));
        zzaV().zzk().zzb("Scheduling notify next app runnable, delay in ms", Long.valueOf(jMax));
        zzaE().zzb(jMax);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(40:8|(5:9|10|(5:12|13|(3:15|(1:22)|25)(23:27|28|(2:36|(3:38|(1:45)(1:44)|46)(0))(1:35)|47|(2:49|(3:51|(4:54|(1:492)(2:60|489)|61|52)|488))|62|63|(9:65|66|(0)(1:72)|(4:119|(3:120|121|(3:123|(2:125|503)(2:126|(2:128|502)(1:504))|129)(1:501))|130|(2:133|(3:138|(1:140)(2:141|(3:143|(3:146|(1:148)(1:520)|144)|519))|149)(1:137))(1:132))(1:150)|151|(5:153|(3:(2:158|(2:160|161))|162|163)|164|165|196)(2:166|(5:168|(3:(2:173|(2:175|161))|176|163)|164|165|196)(3:177|(4:179|(2:181|(1:183))(1:184)|185|(2:189|(2:190|(2:192|(2:517|194)(1:195))(1:518)))(0))(1:165)|196))|197|(9:199|(4:202|(2:215|(2:217|506)(1:508))(5:206|(5:209|(2:212|210)|510|213|207)|509|214|507)|218|200)|505|219|(4:222|(3:512|224|515)(1:514)|513|220)|511|225|(2:228|226)|516)(1:229)|230)(1:73)|71|(3:74|75|(3:77|(2:79|495)(2:80|(2:82|496)(2:83|494))|84)(1:493))|85|(1:89)(1:88)|(1:91)|92|(1:94)(1:95)|96|(4:101|(4:104|(2:106|499)(2:107|(2:109|498)(1:500))|110|102)|497|(1:(1:116)(1:117))(1:(1:113)(2:114|(0)(0))))|(0)(0)|151|(0)(0)|197|(0)(0)|230)|26|231)(1:487)|476|477)|232|(3:234|(2:236|(2:238|523)(2:239|(1:524)(3:241|(1:243)(1:244)|(1:526)(2:248|522))))(0)|249)|521|250|(2:251|(1:527)(2:253|(2:528|255)(1:529)))|256|(1:258)(2:259|(1:261))|262|(1:264)(1:265)|266|(1:268)(1:269)|270|(6:273|(1:275)|276|(2:278|531)(1:532)|279|271)|530|280|(2:285|(1:289))(1:284)|290|(1:292)|293|(1:295)|296|(1:304)|305|(10:483|307|(7:310|311|(5:313|(1:317)|(1:333)(5:321|(1:325)|326|(1:331)(1:330)|332)|334|335)(4:337|338|(4:485|340|345|(7:347|(3:350|(3:540|352|(4:354|360|(1:362)(6:364|(1:369)(1:368)|370|(1:372)(1:374)|373|(3:376|(1:384)|385)(4:386|(3:388|(1:390)|391)(5:392|(1:394)(1:395)|396|(3:398|(1:400)|401)(2:403|(1:405))|402)|406|537))|363)(3:355|(0)(0)|363))(1:358)|348)|539|359|360|(0)(0)|363)(4:359|360|(0)(0)|363))(3:344|345|(0)(0))|407)|336|538|407|308)|536|408|(1:410)|411|(2:414|412)|541|415)(1:416)|417|(1:419)(13:421|(9:423|(1:425)(1:426)|427|(1:429)(1:430)|431|(1:433)(1:434)|435|(1:437)(1:438)|439)|440|(4:442|443|(2:451|(1:453)(1:454))(1:448)|455)(1:456)|457|(3:(2:461|534)(1:535)|462|458)|533|463|(1:465)|466|481|467|471)|420|440|(0)(0)|457|(1:458)|533|463|(0)|466|481|467|471) */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x0e20, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x0e21, code lost:
    
        r3.zzu.zzaV().zzb().zzc("Failed to remove unused event metadata. appId", com.google.android.gms.measurement.internal.zzgu.zzl(r1), r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03cf A[Catch: all -> 0x0103, TryCatch #1 {all -> 0x0103, blocks: (B:3:0x0017, B:5:0x0035, B:8:0x003f, B:9:0x0057, B:12:0x006f, B:15:0x0095, B:17:0x00cc, B:20:0x00dd, B:22:0x00e7, B:231:0x070b, B:27:0x011a, B:30:0x012c, B:32:0x0132, B:47:0x0174, B:49:0x0182, B:52:0x01a2, B:54:0x01a8, B:56:0x01b8, B:58:0x01c6, B:60:0x01d6, B:61:0x01e3, B:62:0x01e6, B:65:0x01fc, B:74:0x022c, B:77:0x0236, B:79:0x0244, B:84:0x028e, B:80:0x025f, B:82:0x026d, B:88:0x0299, B:91:0x02cc, B:92:0x02f6, B:94:0x032f, B:96:0x0335, B:99:0x0341, B:101:0x037a, B:102:0x0395, B:104:0x039b, B:106:0x03ab, B:110:0x03c1, B:107:0x03b5, B:113:0x03c8, B:116:0x03cf, B:117:0x03e7, B:119:0x0400, B:120:0x040c, B:123:0x0418, B:129:0x043b, B:126:0x042a, B:151:0x04bd, B:153:0x04c9, B:156:0x04da, B:158:0x04eb, B:160:0x04f7, B:197:0x05cb, B:199:0x05d1, B:200:0x05dd, B:202:0x05e3, B:204:0x05f3, B:206:0x05fd, B:207:0x0614, B:209:0x061a, B:210:0x0635, B:212:0x063b, B:213:0x0659, B:214:0x0662, B:218:0x068d, B:215:0x0668, B:217:0x067a, B:219:0x0699, B:220:0x06b5, B:222:0x06bb, B:224:0x06ce, B:225:0x06db, B:226:0x06df, B:228:0x06e5, B:230:0x06f7, B:166:0x0517, B:168:0x0523, B:171:0x0536, B:173:0x0547, B:175:0x0553, B:177:0x0563, B:179:0x0572, B:181:0x057e, B:185:0x058d, B:187:0x0597, B:190:0x05a2, B:192:0x05a8, B:194:0x05b8, B:195:0x05c3, B:133:0x0445, B:135:0x0451, B:137:0x045d, B:149:0x04a2, B:141:0x047a, B:144:0x048c, B:146:0x0492, B:148:0x049c, B:36:0x013c, B:38:0x0149, B:40:0x0155, B:42:0x015b, B:46:0x0166, B:234:0x0724, B:236:0x0732, B:238:0x073b, B:249:0x076f, B:239:0x0745, B:241:0x0750, B:243:0x0756, B:246:0x0762, B:248:0x076a, B:250:0x0772, B:251:0x077e, B:253:0x0784, B:255:0x0796, B:256:0x07a1, B:258:0x07a9, B:262:0x07cf, B:264:0x07e9, B:266:0x07fe, B:268:0x0818, B:270:0x082d, B:271:0x083b, B:273:0x0841, B:275:0x0851, B:276:0x0858, B:278:0x0864, B:279:0x086b, B:280:0x0870, B:282:0x08b2, B:284:0x08b8, B:290:0x08df, B:292:0x08e7, B:293:0x08f0, B:295:0x08f6, B:296:0x08fc, B:298:0x0911, B:300:0x0921, B:302:0x0931, B:304:0x0939, B:305:0x093c, B:313:0x09b0, B:315:0x09c9, B:317:0x09df, B:319:0x09e4, B:321:0x09e8, B:323:0x09ec, B:325:0x09f6, B:326:0x09fc, B:328:0x0a00, B:330:0x0a06, B:332:0x0a17, B:334:0x0a23, B:340:0x0a4b, B:343:0x0a51, B:285:0x08c6, B:287:0x08cc, B:289:0x08d2, B:269:0x082a, B:265:0x07fb, B:259:0x07af, B:261:0x07b5), top: B:479:0x0017, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03e7 A[Catch: all -> 0x0103, TryCatch #1 {all -> 0x0103, blocks: (B:3:0x0017, B:5:0x0035, B:8:0x003f, B:9:0x0057, B:12:0x006f, B:15:0x0095, B:17:0x00cc, B:20:0x00dd, B:22:0x00e7, B:231:0x070b, B:27:0x011a, B:30:0x012c, B:32:0x0132, B:47:0x0174, B:49:0x0182, B:52:0x01a2, B:54:0x01a8, B:56:0x01b8, B:58:0x01c6, B:60:0x01d6, B:61:0x01e3, B:62:0x01e6, B:65:0x01fc, B:74:0x022c, B:77:0x0236, B:79:0x0244, B:84:0x028e, B:80:0x025f, B:82:0x026d, B:88:0x0299, B:91:0x02cc, B:92:0x02f6, B:94:0x032f, B:96:0x0335, B:99:0x0341, B:101:0x037a, B:102:0x0395, B:104:0x039b, B:106:0x03ab, B:110:0x03c1, B:107:0x03b5, B:113:0x03c8, B:116:0x03cf, B:117:0x03e7, B:119:0x0400, B:120:0x040c, B:123:0x0418, B:129:0x043b, B:126:0x042a, B:151:0x04bd, B:153:0x04c9, B:156:0x04da, B:158:0x04eb, B:160:0x04f7, B:197:0x05cb, B:199:0x05d1, B:200:0x05dd, B:202:0x05e3, B:204:0x05f3, B:206:0x05fd, B:207:0x0614, B:209:0x061a, B:210:0x0635, B:212:0x063b, B:213:0x0659, B:214:0x0662, B:218:0x068d, B:215:0x0668, B:217:0x067a, B:219:0x0699, B:220:0x06b5, B:222:0x06bb, B:224:0x06ce, B:225:0x06db, B:226:0x06df, B:228:0x06e5, B:230:0x06f7, B:166:0x0517, B:168:0x0523, B:171:0x0536, B:173:0x0547, B:175:0x0553, B:177:0x0563, B:179:0x0572, B:181:0x057e, B:185:0x058d, B:187:0x0597, B:190:0x05a2, B:192:0x05a8, B:194:0x05b8, B:195:0x05c3, B:133:0x0445, B:135:0x0451, B:137:0x045d, B:149:0x04a2, B:141:0x047a, B:144:0x048c, B:146:0x0492, B:148:0x049c, B:36:0x013c, B:38:0x0149, B:40:0x0155, B:42:0x015b, B:46:0x0166, B:234:0x0724, B:236:0x0732, B:238:0x073b, B:249:0x076f, B:239:0x0745, B:241:0x0750, B:243:0x0756, B:246:0x0762, B:248:0x076a, B:250:0x0772, B:251:0x077e, B:253:0x0784, B:255:0x0796, B:256:0x07a1, B:258:0x07a9, B:262:0x07cf, B:264:0x07e9, B:266:0x07fe, B:268:0x0818, B:270:0x082d, B:271:0x083b, B:273:0x0841, B:275:0x0851, B:276:0x0858, B:278:0x0864, B:279:0x086b, B:280:0x0870, B:282:0x08b2, B:284:0x08b8, B:290:0x08df, B:292:0x08e7, B:293:0x08f0, B:295:0x08f6, B:296:0x08fc, B:298:0x0911, B:300:0x0921, B:302:0x0931, B:304:0x0939, B:305:0x093c, B:313:0x09b0, B:315:0x09c9, B:317:0x09df, B:319:0x09e4, B:321:0x09e8, B:323:0x09ec, B:325:0x09f6, B:326:0x09fc, B:328:0x0a00, B:330:0x0a06, B:332:0x0a17, B:334:0x0a23, B:340:0x0a4b, B:343:0x0a51, B:285:0x08c6, B:287:0x08cc, B:289:0x08d2, B:269:0x082a, B:265:0x07fb, B:259:0x07af, B:261:0x07b5), top: B:479:0x0017, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0400 A[Catch: all -> 0x0103, TryCatch #1 {all -> 0x0103, blocks: (B:3:0x0017, B:5:0x0035, B:8:0x003f, B:9:0x0057, B:12:0x006f, B:15:0x0095, B:17:0x00cc, B:20:0x00dd, B:22:0x00e7, B:231:0x070b, B:27:0x011a, B:30:0x012c, B:32:0x0132, B:47:0x0174, B:49:0x0182, B:52:0x01a2, B:54:0x01a8, B:56:0x01b8, B:58:0x01c6, B:60:0x01d6, B:61:0x01e3, B:62:0x01e6, B:65:0x01fc, B:74:0x022c, B:77:0x0236, B:79:0x0244, B:84:0x028e, B:80:0x025f, B:82:0x026d, B:88:0x0299, B:91:0x02cc, B:92:0x02f6, B:94:0x032f, B:96:0x0335, B:99:0x0341, B:101:0x037a, B:102:0x0395, B:104:0x039b, B:106:0x03ab, B:110:0x03c1, B:107:0x03b5, B:113:0x03c8, B:116:0x03cf, B:117:0x03e7, B:119:0x0400, B:120:0x040c, B:123:0x0418, B:129:0x043b, B:126:0x042a, B:151:0x04bd, B:153:0x04c9, B:156:0x04da, B:158:0x04eb, B:160:0x04f7, B:197:0x05cb, B:199:0x05d1, B:200:0x05dd, B:202:0x05e3, B:204:0x05f3, B:206:0x05fd, B:207:0x0614, B:209:0x061a, B:210:0x0635, B:212:0x063b, B:213:0x0659, B:214:0x0662, B:218:0x068d, B:215:0x0668, B:217:0x067a, B:219:0x0699, B:220:0x06b5, B:222:0x06bb, B:224:0x06ce, B:225:0x06db, B:226:0x06df, B:228:0x06e5, B:230:0x06f7, B:166:0x0517, B:168:0x0523, B:171:0x0536, B:173:0x0547, B:175:0x0553, B:177:0x0563, B:179:0x0572, B:181:0x057e, B:185:0x058d, B:187:0x0597, B:190:0x05a2, B:192:0x05a8, B:194:0x05b8, B:195:0x05c3, B:133:0x0445, B:135:0x0451, B:137:0x045d, B:149:0x04a2, B:141:0x047a, B:144:0x048c, B:146:0x0492, B:148:0x049c, B:36:0x013c, B:38:0x0149, B:40:0x0155, B:42:0x015b, B:46:0x0166, B:234:0x0724, B:236:0x0732, B:238:0x073b, B:249:0x076f, B:239:0x0745, B:241:0x0750, B:243:0x0756, B:246:0x0762, B:248:0x076a, B:250:0x0772, B:251:0x077e, B:253:0x0784, B:255:0x0796, B:256:0x07a1, B:258:0x07a9, B:262:0x07cf, B:264:0x07e9, B:266:0x07fe, B:268:0x0818, B:270:0x082d, B:271:0x083b, B:273:0x0841, B:275:0x0851, B:276:0x0858, B:278:0x0864, B:279:0x086b, B:280:0x0870, B:282:0x08b2, B:284:0x08b8, B:290:0x08df, B:292:0x08e7, B:293:0x08f0, B:295:0x08f6, B:296:0x08fc, B:298:0x0911, B:300:0x0921, B:302:0x0931, B:304:0x0939, B:305:0x093c, B:313:0x09b0, B:315:0x09c9, B:317:0x09df, B:319:0x09e4, B:321:0x09e8, B:323:0x09ec, B:325:0x09f6, B:326:0x09fc, B:328:0x0a00, B:330:0x0a06, B:332:0x0a17, B:334:0x0a23, B:340:0x0a4b, B:343:0x0a51, B:285:0x08c6, B:287:0x08cc, B:289:0x08d2, B:269:0x082a, B:265:0x07fb, B:259:0x07af, B:261:0x07b5), top: B:479:0x0017, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04c9 A[Catch: all -> 0x0103, TryCatch #1 {all -> 0x0103, blocks: (B:3:0x0017, B:5:0x0035, B:8:0x003f, B:9:0x0057, B:12:0x006f, B:15:0x0095, B:17:0x00cc, B:20:0x00dd, B:22:0x00e7, B:231:0x070b, B:27:0x011a, B:30:0x012c, B:32:0x0132, B:47:0x0174, B:49:0x0182, B:52:0x01a2, B:54:0x01a8, B:56:0x01b8, B:58:0x01c6, B:60:0x01d6, B:61:0x01e3, B:62:0x01e6, B:65:0x01fc, B:74:0x022c, B:77:0x0236, B:79:0x0244, B:84:0x028e, B:80:0x025f, B:82:0x026d, B:88:0x0299, B:91:0x02cc, B:92:0x02f6, B:94:0x032f, B:96:0x0335, B:99:0x0341, B:101:0x037a, B:102:0x0395, B:104:0x039b, B:106:0x03ab, B:110:0x03c1, B:107:0x03b5, B:113:0x03c8, B:116:0x03cf, B:117:0x03e7, B:119:0x0400, B:120:0x040c, B:123:0x0418, B:129:0x043b, B:126:0x042a, B:151:0x04bd, B:153:0x04c9, B:156:0x04da, B:158:0x04eb, B:160:0x04f7, B:197:0x05cb, B:199:0x05d1, B:200:0x05dd, B:202:0x05e3, B:204:0x05f3, B:206:0x05fd, B:207:0x0614, B:209:0x061a, B:210:0x0635, B:212:0x063b, B:213:0x0659, B:214:0x0662, B:218:0x068d, B:215:0x0668, B:217:0x067a, B:219:0x0699, B:220:0x06b5, B:222:0x06bb, B:224:0x06ce, B:225:0x06db, B:226:0x06df, B:228:0x06e5, B:230:0x06f7, B:166:0x0517, B:168:0x0523, B:171:0x0536, B:173:0x0547, B:175:0x0553, B:177:0x0563, B:179:0x0572, B:181:0x057e, B:185:0x058d, B:187:0x0597, B:190:0x05a2, B:192:0x05a8, B:194:0x05b8, B:195:0x05c3, B:133:0x0445, B:135:0x0451, B:137:0x045d, B:149:0x04a2, B:141:0x047a, B:144:0x048c, B:146:0x0492, B:148:0x049c, B:36:0x013c, B:38:0x0149, B:40:0x0155, B:42:0x015b, B:46:0x0166, B:234:0x0724, B:236:0x0732, B:238:0x073b, B:249:0x076f, B:239:0x0745, B:241:0x0750, B:243:0x0756, B:246:0x0762, B:248:0x076a, B:250:0x0772, B:251:0x077e, B:253:0x0784, B:255:0x0796, B:256:0x07a1, B:258:0x07a9, B:262:0x07cf, B:264:0x07e9, B:266:0x07fe, B:268:0x0818, B:270:0x082d, B:271:0x083b, B:273:0x0841, B:275:0x0851, B:276:0x0858, B:278:0x0864, B:279:0x086b, B:280:0x0870, B:282:0x08b2, B:284:0x08b8, B:290:0x08df, B:292:0x08e7, B:293:0x08f0, B:295:0x08f6, B:296:0x08fc, B:298:0x0911, B:300:0x0921, B:302:0x0931, B:304:0x0939, B:305:0x093c, B:313:0x09b0, B:315:0x09c9, B:317:0x09df, B:319:0x09e4, B:321:0x09e8, B:323:0x09ec, B:325:0x09f6, B:326:0x09fc, B:328:0x0a00, B:330:0x0a06, B:332:0x0a17, B:334:0x0a23, B:340:0x0a4b, B:343:0x0a51, B:285:0x08c6, B:287:0x08cc, B:289:0x08d2, B:269:0x082a, B:265:0x07fb, B:259:0x07af, B:261:0x07b5), top: B:479:0x0017, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0517 A[Catch: all -> 0x0103, TryCatch #1 {all -> 0x0103, blocks: (B:3:0x0017, B:5:0x0035, B:8:0x003f, B:9:0x0057, B:12:0x006f, B:15:0x0095, B:17:0x00cc, B:20:0x00dd, B:22:0x00e7, B:231:0x070b, B:27:0x011a, B:30:0x012c, B:32:0x0132, B:47:0x0174, B:49:0x0182, B:52:0x01a2, B:54:0x01a8, B:56:0x01b8, B:58:0x01c6, B:60:0x01d6, B:61:0x01e3, B:62:0x01e6, B:65:0x01fc, B:74:0x022c, B:77:0x0236, B:79:0x0244, B:84:0x028e, B:80:0x025f, B:82:0x026d, B:88:0x0299, B:91:0x02cc, B:92:0x02f6, B:94:0x032f, B:96:0x0335, B:99:0x0341, B:101:0x037a, B:102:0x0395, B:104:0x039b, B:106:0x03ab, B:110:0x03c1, B:107:0x03b5, B:113:0x03c8, B:116:0x03cf, B:117:0x03e7, B:119:0x0400, B:120:0x040c, B:123:0x0418, B:129:0x043b, B:126:0x042a, B:151:0x04bd, B:153:0x04c9, B:156:0x04da, B:158:0x04eb, B:160:0x04f7, B:197:0x05cb, B:199:0x05d1, B:200:0x05dd, B:202:0x05e3, B:204:0x05f3, B:206:0x05fd, B:207:0x0614, B:209:0x061a, B:210:0x0635, B:212:0x063b, B:213:0x0659, B:214:0x0662, B:218:0x068d, B:215:0x0668, B:217:0x067a, B:219:0x0699, B:220:0x06b5, B:222:0x06bb, B:224:0x06ce, B:225:0x06db, B:226:0x06df, B:228:0x06e5, B:230:0x06f7, B:166:0x0517, B:168:0x0523, B:171:0x0536, B:173:0x0547, B:175:0x0553, B:177:0x0563, B:179:0x0572, B:181:0x057e, B:185:0x058d, B:187:0x0597, B:190:0x05a2, B:192:0x05a8, B:194:0x05b8, B:195:0x05c3, B:133:0x0445, B:135:0x0451, B:137:0x045d, B:149:0x04a2, B:141:0x047a, B:144:0x048c, B:146:0x0492, B:148:0x049c, B:36:0x013c, B:38:0x0149, B:40:0x0155, B:42:0x015b, B:46:0x0166, B:234:0x0724, B:236:0x0732, B:238:0x073b, B:249:0x076f, B:239:0x0745, B:241:0x0750, B:243:0x0756, B:246:0x0762, B:248:0x076a, B:250:0x0772, B:251:0x077e, B:253:0x0784, B:255:0x0796, B:256:0x07a1, B:258:0x07a9, B:262:0x07cf, B:264:0x07e9, B:266:0x07fe, B:268:0x0818, B:270:0x082d, B:271:0x083b, B:273:0x0841, B:275:0x0851, B:276:0x0858, B:278:0x0864, B:279:0x086b, B:280:0x0870, B:282:0x08b2, B:284:0x08b8, B:290:0x08df, B:292:0x08e7, B:293:0x08f0, B:295:0x08f6, B:296:0x08fc, B:298:0x0911, B:300:0x0921, B:302:0x0931, B:304:0x0939, B:305:0x093c, B:313:0x09b0, B:315:0x09c9, B:317:0x09df, B:319:0x09e4, B:321:0x09e8, B:323:0x09ec, B:325:0x09f6, B:326:0x09fc, B:328:0x0a00, B:330:0x0a06, B:332:0x0a17, B:334:0x0a23, B:340:0x0a4b, B:343:0x0a51, B:285:0x08c6, B:287:0x08cc, B:289:0x08d2, B:269:0x082a, B:265:0x07fb, B:259:0x07af, B:261:0x07b5), top: B:479:0x0017, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x05d1 A[Catch: all -> 0x0103, TryCatch #1 {all -> 0x0103, blocks: (B:3:0x0017, B:5:0x0035, B:8:0x003f, B:9:0x0057, B:12:0x006f, B:15:0x0095, B:17:0x00cc, B:20:0x00dd, B:22:0x00e7, B:231:0x070b, B:27:0x011a, B:30:0x012c, B:32:0x0132, B:47:0x0174, B:49:0x0182, B:52:0x01a2, B:54:0x01a8, B:56:0x01b8, B:58:0x01c6, B:60:0x01d6, B:61:0x01e3, B:62:0x01e6, B:65:0x01fc, B:74:0x022c, B:77:0x0236, B:79:0x0244, B:84:0x028e, B:80:0x025f, B:82:0x026d, B:88:0x0299, B:91:0x02cc, B:92:0x02f6, B:94:0x032f, B:96:0x0335, B:99:0x0341, B:101:0x037a, B:102:0x0395, B:104:0x039b, B:106:0x03ab, B:110:0x03c1, B:107:0x03b5, B:113:0x03c8, B:116:0x03cf, B:117:0x03e7, B:119:0x0400, B:120:0x040c, B:123:0x0418, B:129:0x043b, B:126:0x042a, B:151:0x04bd, B:153:0x04c9, B:156:0x04da, B:158:0x04eb, B:160:0x04f7, B:197:0x05cb, B:199:0x05d1, B:200:0x05dd, B:202:0x05e3, B:204:0x05f3, B:206:0x05fd, B:207:0x0614, B:209:0x061a, B:210:0x0635, B:212:0x063b, B:213:0x0659, B:214:0x0662, B:218:0x068d, B:215:0x0668, B:217:0x067a, B:219:0x0699, B:220:0x06b5, B:222:0x06bb, B:224:0x06ce, B:225:0x06db, B:226:0x06df, B:228:0x06e5, B:230:0x06f7, B:166:0x0517, B:168:0x0523, B:171:0x0536, B:173:0x0547, B:175:0x0553, B:177:0x0563, B:179:0x0572, B:181:0x057e, B:185:0x058d, B:187:0x0597, B:190:0x05a2, B:192:0x05a8, B:194:0x05b8, B:195:0x05c3, B:133:0x0445, B:135:0x0451, B:137:0x045d, B:149:0x04a2, B:141:0x047a, B:144:0x048c, B:146:0x0492, B:148:0x049c, B:36:0x013c, B:38:0x0149, B:40:0x0155, B:42:0x015b, B:46:0x0166, B:234:0x0724, B:236:0x0732, B:238:0x073b, B:249:0x076f, B:239:0x0745, B:241:0x0750, B:243:0x0756, B:246:0x0762, B:248:0x076a, B:250:0x0772, B:251:0x077e, B:253:0x0784, B:255:0x0796, B:256:0x07a1, B:258:0x07a9, B:262:0x07cf, B:264:0x07e9, B:266:0x07fe, B:268:0x0818, B:270:0x082d, B:271:0x083b, B:273:0x0841, B:275:0x0851, B:276:0x0858, B:278:0x0864, B:279:0x086b, B:280:0x0870, B:282:0x08b2, B:284:0x08b8, B:290:0x08df, B:292:0x08e7, B:293:0x08f0, B:295:0x08f6, B:296:0x08fc, B:298:0x0911, B:300:0x0921, B:302:0x0931, B:304:0x0939, B:305:0x093c, B:313:0x09b0, B:315:0x09c9, B:317:0x09df, B:319:0x09e4, B:321:0x09e8, B:323:0x09ec, B:325:0x09f6, B:326:0x09fc, B:328:0x0a00, B:330:0x0a06, B:332:0x0a17, B:334:0x0a23, B:340:0x0a4b, B:343:0x0a51, B:285:0x08c6, B:287:0x08cc, B:289:0x08d2, B:269:0x082a, B:265:0x07fb, B:259:0x07af, B:261:0x07b5), top: B:479:0x0017, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0745 A[Catch: all -> 0x0103, TryCatch #1 {all -> 0x0103, blocks: (B:3:0x0017, B:5:0x0035, B:8:0x003f, B:9:0x0057, B:12:0x006f, B:15:0x0095, B:17:0x00cc, B:20:0x00dd, B:22:0x00e7, B:231:0x070b, B:27:0x011a, B:30:0x012c, B:32:0x0132, B:47:0x0174, B:49:0x0182, B:52:0x01a2, B:54:0x01a8, B:56:0x01b8, B:58:0x01c6, B:60:0x01d6, B:61:0x01e3, B:62:0x01e6, B:65:0x01fc, B:74:0x022c, B:77:0x0236, B:79:0x0244, B:84:0x028e, B:80:0x025f, B:82:0x026d, B:88:0x0299, B:91:0x02cc, B:92:0x02f6, B:94:0x032f, B:96:0x0335, B:99:0x0341, B:101:0x037a, B:102:0x0395, B:104:0x039b, B:106:0x03ab, B:110:0x03c1, B:107:0x03b5, B:113:0x03c8, B:116:0x03cf, B:117:0x03e7, B:119:0x0400, B:120:0x040c, B:123:0x0418, B:129:0x043b, B:126:0x042a, B:151:0x04bd, B:153:0x04c9, B:156:0x04da, B:158:0x04eb, B:160:0x04f7, B:197:0x05cb, B:199:0x05d1, B:200:0x05dd, B:202:0x05e3, B:204:0x05f3, B:206:0x05fd, B:207:0x0614, B:209:0x061a, B:210:0x0635, B:212:0x063b, B:213:0x0659, B:214:0x0662, B:218:0x068d, B:215:0x0668, B:217:0x067a, B:219:0x0699, B:220:0x06b5, B:222:0x06bb, B:224:0x06ce, B:225:0x06db, B:226:0x06df, B:228:0x06e5, B:230:0x06f7, B:166:0x0517, B:168:0x0523, B:171:0x0536, B:173:0x0547, B:175:0x0553, B:177:0x0563, B:179:0x0572, B:181:0x057e, B:185:0x058d, B:187:0x0597, B:190:0x05a2, B:192:0x05a8, B:194:0x05b8, B:195:0x05c3, B:133:0x0445, B:135:0x0451, B:137:0x045d, B:149:0x04a2, B:141:0x047a, B:144:0x048c, B:146:0x0492, B:148:0x049c, B:36:0x013c, B:38:0x0149, B:40:0x0155, B:42:0x015b, B:46:0x0166, B:234:0x0724, B:236:0x0732, B:238:0x073b, B:249:0x076f, B:239:0x0745, B:241:0x0750, B:243:0x0756, B:246:0x0762, B:248:0x076a, B:250:0x0772, B:251:0x077e, B:253:0x0784, B:255:0x0796, B:256:0x07a1, B:258:0x07a9, B:262:0x07cf, B:264:0x07e9, B:266:0x07fe, B:268:0x0818, B:270:0x082d, B:271:0x083b, B:273:0x0841, B:275:0x0851, B:276:0x0858, B:278:0x0864, B:279:0x086b, B:280:0x0870, B:282:0x08b2, B:284:0x08b8, B:290:0x08df, B:292:0x08e7, B:293:0x08f0, B:295:0x08f6, B:296:0x08fc, B:298:0x0911, B:300:0x0921, B:302:0x0931, B:304:0x0939, B:305:0x093c, B:313:0x09b0, B:315:0x09c9, B:317:0x09df, B:319:0x09e4, B:321:0x09e8, B:323:0x09ec, B:325:0x09f6, B:326:0x09fc, B:328:0x0a00, B:330:0x0a06, B:332:0x0a17, B:334:0x0a23, B:340:0x0a4b, B:343:0x0a51, B:285:0x08c6, B:287:0x08cc, B:289:0x08d2, B:269:0x082a, B:265:0x07fb, B:259:0x07af, B:261:0x07b5), top: B:479:0x0017, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0a87 A[Catch: all -> 0x0ab8, TryCatch #3 {all -> 0x0ab8, blocks: (B:307:0x097e, B:308:0x0991, B:310:0x0997, B:407:0x0c60, B:338:0x0a35, B:345:0x0a65, B:347:0x0a87, B:348:0x0a8f, B:350:0x0a95, B:352:0x0aa7, B:360:0x0ac2, B:362:0x0ad6, B:364:0x0aff, B:366:0x0b0b, B:368:0x0b1f, B:370:0x0b60, B:376:0x0b7a, B:378:0x0b85, B:380:0x0b89, B:382:0x0b8d, B:384:0x0b91, B:385:0x0b9d, B:386:0x0ba2, B:388:0x0ba8, B:390:0x0bbe, B:391:0x0bc3, B:406:0x0c5b, B:392:0x0bdc, B:394:0x0be0, B:398:0x0c09, B:400:0x0c2d, B:401:0x0c34, B:405:0x0c4e, B:395:0x0bf0, B:408:0x0c6e, B:410:0x0c7c, B:411:0x0c82, B:412:0x0c8a, B:414:0x0c90, B:417:0x0ca9, B:419:0x0cb9, B:440:0x0d37, B:421:0x0cd2, B:423:0x0cd8, B:425:0x0ce0, B:427:0x0ce7, B:433:0x0cf5, B:435:0x0cfc, B:437:0x0d28, B:439:0x0d2f, B:438:0x0d2c, B:434:0x0cf9, B:426:0x0ce4), top: B:483:0x097e }] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0ac0 A[PHI: r10
      0x0ac0: PHI (r10v6 ??) = (r10v5 ??), (r10v19 ??) binds: [B:346:0x0a85, B:539:0x0ac0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0ad6 A[Catch: all -> 0x0ab8, TryCatch #3 {all -> 0x0ab8, blocks: (B:307:0x097e, B:308:0x0991, B:310:0x0997, B:407:0x0c60, B:338:0x0a35, B:345:0x0a65, B:347:0x0a87, B:348:0x0a8f, B:350:0x0a95, B:352:0x0aa7, B:360:0x0ac2, B:362:0x0ad6, B:364:0x0aff, B:366:0x0b0b, B:368:0x0b1f, B:370:0x0b60, B:376:0x0b7a, B:378:0x0b85, B:380:0x0b89, B:382:0x0b8d, B:384:0x0b91, B:385:0x0b9d, B:386:0x0ba2, B:388:0x0ba8, B:390:0x0bbe, B:391:0x0bc3, B:406:0x0c5b, B:392:0x0bdc, B:394:0x0be0, B:398:0x0c09, B:400:0x0c2d, B:401:0x0c34, B:405:0x0c4e, B:395:0x0bf0, B:408:0x0c6e, B:410:0x0c7c, B:411:0x0c82, B:412:0x0c8a, B:414:0x0c90, B:417:0x0ca9, B:419:0x0cb9, B:440:0x0d37, B:421:0x0cd2, B:423:0x0cd8, B:425:0x0ce0, B:427:0x0ce7, B:433:0x0cf5, B:435:0x0cfc, B:437:0x0d28, B:439:0x0d2f, B:438:0x0d2c, B:434:0x0cf9, B:426:0x0ce4), top: B:483:0x097e }] */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0aff A[Catch: all -> 0x0ab8, TryCatch #3 {all -> 0x0ab8, blocks: (B:307:0x097e, B:308:0x0991, B:310:0x0997, B:407:0x0c60, B:338:0x0a35, B:345:0x0a65, B:347:0x0a87, B:348:0x0a8f, B:350:0x0a95, B:352:0x0aa7, B:360:0x0ac2, B:362:0x0ad6, B:364:0x0aff, B:366:0x0b0b, B:368:0x0b1f, B:370:0x0b60, B:376:0x0b7a, B:378:0x0b85, B:380:0x0b89, B:382:0x0b8d, B:384:0x0b91, B:385:0x0b9d, B:386:0x0ba2, B:388:0x0ba8, B:390:0x0bbe, B:391:0x0bc3, B:406:0x0c5b, B:392:0x0bdc, B:394:0x0be0, B:398:0x0c09, B:400:0x0c2d, B:401:0x0c34, B:405:0x0c4e, B:395:0x0bf0, B:408:0x0c6e, B:410:0x0c7c, B:411:0x0c82, B:412:0x0c8a, B:414:0x0c90, B:417:0x0ca9, B:419:0x0cb9, B:440:0x0d37, B:421:0x0cd2, B:423:0x0cd8, B:425:0x0ce0, B:427:0x0ce7, B:433:0x0cf5, B:435:0x0cfc, B:437:0x0d28, B:439:0x0d2f, B:438:0x0d2c, B:434:0x0cf9, B:426:0x0ce4), top: B:483:0x097e }] */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0d3d  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0d9f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0dbe  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0df3 A[Catch: all -> 0x0d63, TryCatch #0 {all -> 0x0d63, blocks: (B:443:0x0d3f, B:445:0x0d54, B:448:0x0d5b, B:455:0x0d8f, B:457:0x0da1, B:458:0x0db8, B:461:0x0dc0, B:462:0x0dc5, B:463:0x0dd7, B:465:0x0df3, B:466:0x0e0e, B:467:0x0e16, B:471:0x0e34, B:470:0x0e21, B:451:0x0d66, B:453:0x0d72, B:454:0x0d78, B:472:0x0e3e), top: B:478:0x0033, inners: #2 }] */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v44 */
    /* JADX WARN: Type inference failed for: r10v45 */
    /* JADX WARN: Type inference failed for: r10v46 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v10 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r21v8 */
    /* JADX WARN: Type inference failed for: r21v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v117 */
    /* JADX WARN: Type inference failed for: r2v127 */
    /* JADX WARN: Type inference failed for: r2v128 */
    /* JADX WARN: Type inference failed for: r2v129 */
    /* JADX WARN: Type inference failed for: r2v130 */
    /* JADX WARN: Type inference failed for: r2v131 */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.gms.measurement.internal.zzpg] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.google.android.gms.measurement.internal.zzpg] */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52, types: [com.google.android.gms.measurement.internal.zzpg] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v78 */
    /* JADX WARN: Type inference failed for: r7v79 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v80 */
    /* JADX WARN: Type inference failed for: r7v81 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zzaG(String str, long j) throws Throwable {
        ?? r2;
        zzpc zzpcVar;
        List list;
        boolean z;
        ?? r22;
        ?? r21;
        long j2;
        long j3;
        long j4;
        ?? r212;
        ?? r213;
        int iZzm;
        long j5;
        SecureRandom secureRandom;
        int i;
        zzpc zzpcVar2;
        com.google.android.gms.internal.measurement.zzic zzicVar;
        long jZzaj;
        ?? r7;
        int i2;
        ?? r72;
        ?? r10;
        ?? r102;
        int i3;
        List list2;
        int i4;
        int iDelete;
        String str2;
        boolean z2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i5;
        String str7;
        String str8;
        com.google.android.gms.internal.measurement.zzhr zzhrVar;
        com.google.android.gms.internal.measurement.zzhr zzhrVar2;
        String str9;
        String str10;
        int i6;
        com.google.android.gms.internal.measurement.zzhr zzhrVar3;
        com.google.android.gms.internal.measurement.zzhr zzhrVar4;
        String str11;
        int i7;
        boolean z3;
        zzpg zzpgVar = this;
        ?? r23 = "_efs";
        String str12 = "_v";
        String str13 = "_f";
        String str14 = "_ai";
        String str15 = FirebaseAnalytics.Event.PURCHASE;
        String str16 = FirebaseAnalytics.Param.ITEMS;
        zzpgVar.zzj().zzb();
        try {
            zzpc zzpcVar3 = new zzpc(zzpgVar, null);
            zzpgVar.zzj().zzat(str, j, zzpgVar.zzB, zzpcVar3);
            zzpcVar = zzpcVar3;
            list = zzpcVar.zzc;
            try {
            } catch (Throwable th) {
                th = th;
                r2 = r23;
            }
        } catch (Throwable th2) {
            th = th2;
            r2 = zzpgVar;
        }
        if (list == null || list.isEmpty()) {
            zzpg zzpgVar2 = zzpgVar;
            zzpgVar2.zzj().zzc();
            z = false;
            r22 = zzpgVar2;
        } else {
            com.google.android.gms.internal.measurement.zzic zzicVar2 = (com.google.android.gms.internal.measurement.zzic) zzpcVar.zza.zzcl();
            zzicVar2.zzi();
            com.google.android.gms.internal.measurement.zzhr zzhrVar5 = null;
            com.google.android.gms.internal.measurement.zzhr zzhrVar6 = null;
            int i8 = 0;
            int i9 = -1;
            int i10 = -1;
            boolean z4 = false;
            int i11 = 0;
            boolean z5 = false;
            ?? r24 = "_efs";
            while (true) {
                com.google.android.gms.internal.measurement.zzhr zzhrVar7 = zzhrVar5;
                com.google.android.gms.internal.measurement.zzhr zzhrVar8 = zzhrVar6;
                r21 = r24;
                int i12 = i10;
                if (i8 >= zzpcVar.zzc.size()) {
                    break;
                }
                com.google.android.gms.internal.measurement.zzhr zzhrVar9 = (com.google.android.gms.internal.measurement.zzhr) ((com.google.android.gms.internal.measurement.zzhs) zzpcVar.zzc.get(i8)).zzcl();
                int i13 = i8;
                if (zzpgVar.zzh().zzj(zzpcVar.zza.zzA(), zzhrVar9.zzk())) {
                    String str17 = str16;
                    zzpgVar.zzaV().zze().zzc("Dropping blocked raw event. appId", zzgu.zzl(zzpcVar.zza.zzA()), zzpgVar.zzn.zzl().zza(zzhrVar9.zzk()));
                    if (!zzpgVar.zzh().zzn(zzpcVar.zza.zzA()) && !zzpgVar.zzh().zzo(zzpcVar.zza.zzA()) && !"_err".equals(zzhrVar9.zzk())) {
                        zzpgVar.zzt().zzN(zzpgVar.zzK, zzpcVar.zza.zzA(), 11, "_ev", zzhrVar9.zzk(), 0);
                    }
                    str9 = str12;
                    str7 = str13;
                    str4 = str14;
                    str3 = str15;
                    i10 = i12;
                    i6 = i13;
                    str10 = str17;
                } else {
                    String str18 = str16;
                    String strZzk = zzhrVar9.zzk();
                    if (strZzk.equals(str15) || strZzk.equals("_iap") || strZzk.equals("ecommerce_purchase")) {
                        com.google.android.gms.internal.measurement.zzhv zzhvVarZzn = com.google.android.gms.internal.measurement.zzhw.zzn();
                        str2 = str12;
                        zzhvVarZzn.zzb("_ct");
                        if (!z4) {
                            String strZzA = zzpcVar.zza.zzA();
                            String str19 = (zzpgVar.zzaP(strZzA, str15) && zzpgVar.zzaP(strZzA, "_iap") && zzpgVar.zzaP(strZzA, "ecommerce_purchase")) ? "new" : "returning";
                            zzhvVarZzn.zzd(str19);
                            zzhrVar9.zzf((com.google.android.gms.internal.measurement.zzhw) zzhvVarZzn.zzbc());
                            z4 = true;
                        }
                    } else {
                        str2 = str12;
                    }
                    if (zzhrVar9.zzk().equals(zzjm.zza(str14))) {
                        zzhrVar9.zzl(str14);
                        zzpgVar.zzaV().zzk().zza("Renaming ad_impression to _ai");
                        if (Log.isLoggable(zzpgVar.zzaV().zzn(), 5)) {
                            for (int i14 = 0; i14 < zzhrVar9.zzb(); i14++) {
                                if (FirebaseAnalytics.Param.AD_PLATFORM.equals(zzhrVar9.zzc(i14).zzb()) && !zzhrVar9.zzc(i14).zzd().isEmpty() && "admob".equalsIgnoreCase(zzhrVar9.zzc(i14).zzd())) {
                                    zzpgVar.zzaV().zzh().zza("AdMob ad impression logged from app. Potentially duplicative.");
                                }
                            }
                        }
                    }
                    boolean zZzk = zzpgVar.zzh().zzk(zzpcVar.zza.zzA(), zzhrVar9.zzk());
                    if (zZzk) {
                        z2 = zZzk;
                    } else {
                        zzpgVar.zzp();
                        String strZzk2 = zzhrVar9.zzk();
                        Preconditions.checkNotEmpty(strZzk2);
                        z2 = zZzk;
                        if (strZzk2.hashCode() != 95027 || !strZzk2.equals("_ui")) {
                            str5 = str13;
                            str4 = str14;
                            str3 = str15;
                            z2 = false;
                        }
                        if (z2) {
                            str6 = str5;
                        } else {
                            ArrayList arrayList = new ArrayList(zzhrVar9.zza());
                            int i15 = 0;
                            int i16 = -1;
                            int i17 = -1;
                            while (true) {
                                str6 = str5;
                                if (i15 >= arrayList.size()) {
                                    break;
                                }
                                if ("value".equals(((com.google.android.gms.internal.measurement.zzhw) arrayList.get(i15)).zzb())) {
                                    i16 = i15;
                                } else if (FirebaseAnalytics.Param.CURRENCY.equals(((com.google.android.gms.internal.measurement.zzhw) arrayList.get(i15)).zzb())) {
                                    i17 = i15;
                                }
                                i15++;
                                str5 = str6;
                            }
                            if (i16 != -1) {
                                if (((com.google.android.gms.internal.measurement.zzhw) arrayList.get(i16)).zze() || ((com.google.android.gms.internal.measurement.zzhw) arrayList.get(i16)).zzi()) {
                                    if (i17 != -1) {
                                        String strZzd = ((com.google.android.gms.internal.measurement.zzhw) arrayList.get(i17)).zzd();
                                        if (strZzd.length() == 3) {
                                            int iCharCount = 0;
                                            while (iCharCount < strZzd.length()) {
                                                int iCodePointAt = strZzd.codePointAt(iCharCount);
                                                if (Character.isLetter(iCodePointAt)) {
                                                    iCharCount += Character.charCount(iCodePointAt);
                                                }
                                            }
                                        }
                                    }
                                    zzpgVar.zzaV().zzh().zza("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
                                    zzhrVar9.zzj(i16);
                                    zzaB(zzhrVar9, "_c");
                                    zzaA(zzhrVar9, 19, FirebaseAnalytics.Param.CURRENCY);
                                    break;
                                }
                                zzpgVar.zzaV().zzh().zza("Value must be specified with a numeric type.");
                                zzhrVar9.zzj(i16);
                                zzaB(zzhrVar9, "_c");
                                zzaA(zzhrVar9, 18, "value");
                            }
                        }
                        if (!"_e".equals(zzhrVar9.zzk())) {
                            zzpgVar.zzp();
                            if (zzpk.zzF((com.google.android.gms.internal.measurement.zzhs) zzhrVar9.zzbc(), "_fr") == null) {
                                if (zzhrVar8 != null && Math.abs(zzhrVar8.zzn() - zzhrVar9.zzn()) <= 1000) {
                                    com.google.android.gms.internal.measurement.zzhr zzhrVar10 = (com.google.android.gms.internal.measurement.zzhr) zzhrVar8.clone();
                                    if (zzpgVar.zzaI(zzhrVar9, zzhrVar10)) {
                                        zzicVar2.zzf(i9, zzhrVar10);
                                        i10 = i12;
                                        str7 = str6;
                                        str8 = str2;
                                        zzhrVar = null;
                                        zzhrVar2 = null;
                                    }
                                }
                                zzhrVar2 = zzhrVar8;
                                zzhrVar = zzhrVar9;
                                i10 = i11;
                                str7 = str6;
                                str8 = str2;
                            }
                            i5 = i12;
                            str7 = str6;
                            str8 = str2;
                            zzhrVar = zzhrVar7;
                            i10 = i5;
                            zzhrVar2 = zzhrVar8;
                        } else if ("_vs".equals(zzhrVar9.zzk())) {
                            zzpgVar.zzp();
                            if (zzpk.zzF((com.google.android.gms.internal.measurement.zzhs) zzhrVar9.zzbc(), "_et") == null) {
                                if (zzhrVar7 != null && Math.abs(zzhrVar7.zzn() - zzhrVar9.zzn()) <= 1000) {
                                    com.google.android.gms.internal.measurement.zzhr zzhrVar11 = (com.google.android.gms.internal.measurement.zzhr) zzhrVar7.clone();
                                    if (zzpgVar.zzaI(zzhrVar11, zzhrVar9)) {
                                        zzicVar2.zzf(i12, zzhrVar11);
                                        i10 = i12;
                                        str7 = str6;
                                        str8 = str2;
                                        zzhrVar = null;
                                        zzhrVar2 = null;
                                    }
                                }
                                zzhrVar = zzhrVar7;
                                i10 = i12;
                                zzhrVar2 = zzhrVar9;
                                i9 = i11;
                                str7 = str6;
                                str8 = str2;
                            }
                            i5 = i12;
                            str7 = str6;
                            str8 = str2;
                            zzhrVar = zzhrVar7;
                            i10 = i5;
                            zzhrVar2 = zzhrVar8;
                        } else {
                            i5 = i12;
                            if (zzpgVar.zzd().zzp(null, zzfy.zzbj)) {
                                str7 = str6;
                                if (str7.equals(zzhrVar9.zzk())) {
                                    str8 = str2;
                                } else {
                                    str8 = str2;
                                    if (str8.equals(zzhrVar9.zzk())) {
                                    }
                                }
                                if (str7.equals(zzhrVar9.zzk()) || str8.equals(zzhrVar9.zzk())) {
                                    int i18 = 0;
                                    while (true) {
                                        if (i18 >= zzhrVar9.zzb()) {
                                            break;
                                        }
                                        com.google.android.gms.internal.measurement.zzhw zzhwVarZzc = zzhrVar9.zzc(i18);
                                        if ("_elt".equals(zzhwVarZzc.zzb())) {
                                            zzhrVar9.zzr(zzhwVarZzc.zzf());
                                            zzhrVar9.zzj(i18);
                                            break;
                                        }
                                        i18++;
                                    }
                                }
                            } else {
                                str7 = str6;
                                str8 = str2;
                            }
                            zzhrVar = zzhrVar7;
                            i10 = i5;
                            zzhrVar2 = zzhrVar8;
                        }
                        if (zzhrVar9.zzb() == 0) {
                            zzpgVar.zzp();
                            Bundle bundleZzE = zzpk.zzE(zzhrVar9.zza());
                            int i19 = 0;
                            while (i19 < zzhrVar9.zzb()) {
                                com.google.android.gms.internal.measurement.zzhw zzhwVarZzc2 = zzhrVar9.zzc(i19);
                                String str20 = str18;
                                if (!zzhwVarZzc2.zzb().equals(str20) || zzhwVarZzc2.zzk().isEmpty()) {
                                    zzhrVar3 = zzhrVar;
                                    zzhrVar4 = zzhrVar2;
                                    str11 = str8;
                                    i7 = i19;
                                    if (!zzhwVarZzc2.zzb().equals(str20)) {
                                        zzpgVar.zzU(zzhrVar9.zzk(), (com.google.android.gms.internal.measurement.zzhv) zzhwVarZzc2.zzcl(), bundleZzE, zzpcVar.zza.zzA());
                                    }
                                } else {
                                    String strZzA2 = zzpcVar.zza.zzA();
                                    List listZzk = zzhwVarZzc2.zzk();
                                    zzhrVar3 = zzhrVar;
                                    Bundle[] bundleArr = new Bundle[listZzk.size()];
                                    zzhrVar4 = zzhrVar2;
                                    str11 = str8;
                                    int i20 = 0;
                                    while (i20 < listZzk.size()) {
                                        com.google.android.gms.internal.measurement.zzhw zzhwVar = (com.google.android.gms.internal.measurement.zzhw) listZzk.get(i20);
                                        zzpgVar.zzp();
                                        int i21 = i20;
                                        Bundle bundleZzE2 = zzpk.zzE(zzhwVar.zzk());
                                        Iterator it = zzhwVar.zzk().iterator();
                                        while (it.hasNext()) {
                                            zzpgVar.zzU(zzhrVar9.zzk(), (com.google.android.gms.internal.measurement.zzhv) ((com.google.android.gms.internal.measurement.zzhw) it.next()).zzcl(), bundleZzE2, strZzA2);
                                            it = it;
                                            i19 = i19;
                                        }
                                        bundleArr[i21] = bundleZzE2;
                                        i20 = i21 + 1;
                                        i19 = i19;
                                    }
                                    i7 = i19;
                                    bundleZzE.putParcelableArray(str20, bundleArr);
                                }
                                i19 = i7 + 1;
                                zzhrVar = zzhrVar3;
                                zzhrVar2 = zzhrVar4;
                                str18 = str20;
                                str8 = str11;
                            }
                            zzhrVar7 = zzhrVar;
                            zzhrVar8 = zzhrVar2;
                            str9 = str8;
                            str10 = str18;
                            zzhrVar9.zzi();
                            zzpk zzpkVarZzp = zzpgVar.zzp();
                            ArrayList arrayList2 = new ArrayList();
                            for (String str21 : bundleZzE.keySet()) {
                                com.google.android.gms.internal.measurement.zzhv zzhvVarZzn2 = com.google.android.gms.internal.measurement.zzhw.zzn();
                                zzhvVarZzn2.zzb(str21);
                                Object obj = bundleZzE.get(str21);
                                if (obj != null) {
                                    zzpkVarZzp.zzd(zzhvVarZzn2, obj);
                                    arrayList2.add((com.google.android.gms.internal.measurement.zzhw) zzhvVarZzn2.zzbc());
                                }
                            }
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                zzhrVar9.zzf((com.google.android.gms.internal.measurement.zzhw) it2.next());
                            }
                        } else {
                            zzhrVar7 = zzhrVar;
                            zzhrVar8 = zzhrVar2;
                            str9 = str8;
                            str10 = str18;
                        }
                        i6 = i13;
                        zzpcVar.zzc.set(i6, (com.google.android.gms.internal.measurement.zzhs) zzhrVar9.zzbc());
                        zzicVar2.zzg(zzhrVar9);
                        i11++;
                    }
                    str4 = str14;
                    int i22 = 0;
                    boolean z6 = false;
                    boolean z7 = false;
                    while (true) {
                        str3 = str15;
                        if (i22 >= zzhrVar9.zzb()) {
                            break;
                        }
                        if ("_c".equals(zzhrVar9.zzc(i22).zzb())) {
                            com.google.android.gms.internal.measurement.zzhv zzhvVar = (com.google.android.gms.internal.measurement.zzhv) zzhrVar9.zzc(i22).zzcl();
                            zzhvVar.zzf(1L);
                            zzhrVar9.zzd(i22, (com.google.android.gms.internal.measurement.zzhw) zzhvVar.zzbc());
                            z6 = true;
                        } else if ("_r".equals(zzhrVar9.zzc(i22).zzb())) {
                            com.google.android.gms.internal.measurement.zzhv zzhvVar2 = (com.google.android.gms.internal.measurement.zzhv) zzhrVar9.zzc(i22).zzcl();
                            zzhvVar2.zzf(1L);
                            zzhrVar9.zzd(i22, (com.google.android.gms.internal.measurement.zzhw) zzhvVar2.zzbc());
                            z7 = true;
                            z6 = z6;
                        }
                        i22++;
                        str15 = str3;
                    }
                    if (z6 || !z2) {
                        str5 = str13;
                        z3 = z7;
                    } else {
                        z3 = z7;
                        zzpgVar.zzaV().zzk().zzb("Marking event as conversion", zzpgVar.zzn.zzl().zza(zzhrVar9.zzk()));
                        com.google.android.gms.internal.measurement.zzhv zzhvVarZzn3 = com.google.android.gms.internal.measurement.zzhw.zzn();
                        zzhvVarZzn3.zzb("_c");
                        str5 = str13;
                        zzhvVarZzn3.zzf(1L);
                        zzhrVar9.zzg(zzhvVarZzn3);
                    }
                    if (!z3) {
                        zzpgVar.zzaV().zzk().zzb("Marking event as real-time", zzpgVar.zzn.zzl().zza(zzhrVar9.zzk()));
                        com.google.android.gms.internal.measurement.zzhv zzhvVarZzn4 = com.google.android.gms.internal.measurement.zzhw.zzn();
                        zzhvVarZzn4.zzb("_r");
                        zzhvVarZzn4.zzf(1L);
                        zzhrVar9.zzg(zzhvVarZzn4);
                    }
                    if (zzpgVar.zzj().zzw(zzpgVar.zzC(), zzpcVar.zza.zzA(), false, false, false, false, true, false, false).zze > zzpgVar.zzd().zzm(zzpcVar.zza.zzA(), zzfy.zzo)) {
                        zzaB(zzhrVar9, "_r");
                    } else {
                        z5 = true;
                    }
                    if (zzpp.zzh(zzhrVar9.zzk()) && z2 && zzpgVar.zzj().zzw(zzpgVar.zzC(), zzpcVar.zza.zzA(), false, false, true, false, false, false, false).zzc > zzpgVar.zzd().zzm(zzpcVar.zza.zzA(), zzfy.zzn)) {
                        zzpgVar.zzaV().zze().zzb("Too many conversions. Not logging as conversion. appId", zzgu.zzl(zzpcVar.zza.zzA()));
                        int i23 = 0;
                        com.google.android.gms.internal.measurement.zzhv zzhvVar3 = null;
                        boolean z8 = false;
                        int i24 = -1;
                        while (i23 < zzhrVar9.zzb()) {
                            com.google.android.gms.internal.measurement.zzhw zzhwVarZzc3 = zzhrVar9.zzc(i23);
                            int i25 = i23;
                            if ("_c".equals(zzhwVarZzc3.zzb())) {
                                zzhvVar3 = (com.google.android.gms.internal.measurement.zzhv) zzhwVarZzc3.zzcl();
                                i24 = i25;
                            } else if ("_err".equals(zzhwVarZzc3.zzb())) {
                                z8 = true;
                            }
                            i23 = i25 + 1;
                        }
                        if (z8) {
                            if (zzhvVar3 != null) {
                                zzhrVar9.zzj(i24);
                            } else {
                                zzhvVar3 = null;
                                if (zzhvVar3 == null) {
                                }
                            }
                        } else if (zzhvVar3 == null) {
                            com.google.android.gms.internal.measurement.zzhv zzhvVar4 = (com.google.android.gms.internal.measurement.zzhv) zzhvVar3.clone();
                            zzhvVar4.zzb("_err");
                            zzhvVar4.zzf(10L);
                            zzhrVar9.zzd(i24, (com.google.android.gms.internal.measurement.zzhw) zzhvVar4.zzbc());
                        } else {
                            zzpgVar.zzaV().zzb().zzb("Did not find conversion parameter. appId", zzgu.zzl(zzpcVar.zza.zzA()));
                        }
                    }
                    if (z2) {
                    }
                    if (!"_e".equals(zzhrVar9.zzk())) {
                    }
                    if (zzhrVar9.zzb() == 0) {
                    }
                    i6 = i13;
                    zzpcVar.zzc.set(i6, (com.google.android.gms.internal.measurement.zzhs) zzhrVar9.zzbc());
                    zzicVar2.zzg(zzhrVar9);
                    i11++;
                }
                zzhrVar5 = zzhrVar7;
                i8 = i6 + 1;
                str13 = str7;
                str16 = str10;
                str12 = str9;
                str14 = str4;
                str15 = str3;
                zzhrVar6 = zzhrVar8;
                r24 = r21;
                r2.zzj().zzd();
                throw th;
            }
            long j6 = 0;
            long jLongValue = 0;
            int i26 = i11;
            int i27 = 0;
            while (i27 < i26) {
                com.google.android.gms.internal.measurement.zzhs zzhsVarZzd = zzicVar2.zzd(i27);
                if ("_e".equals(zzhsVarZzd.zzd())) {
                    zzpgVar.zzp();
                    if (zzpk.zzF(zzhsVarZzd, "_fr") != null) {
                        zzicVar2.zzj(i27);
                        i26--;
                        i27--;
                    } else {
                        zzpgVar.zzp();
                        com.google.android.gms.internal.measurement.zzhw zzhwVarZzF = zzpk.zzF(zzhsVarZzd, "_et");
                        if (zzhwVarZzF != null) {
                            Long lValueOf = zzhwVarZzF.zze() ? Long.valueOf(zzhwVarZzF.zzf()) : null;
                            if (lValueOf != null && lValueOf.longValue() > 0) {
                                jLongValue += lValueOf.longValue();
                            }
                        }
                    }
                }
                i27++;
            }
            zzpgVar.zzaH(zzicVar2, jLongValue, false);
            Iterator it3 = zzicVar2.zzb().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                if ("_s".equals(((com.google.android.gms.internal.measurement.zzhs) it3.next()).zzd())) {
                    zzpgVar.zzj().zzk(zzicVar2.zzK(), "_se");
                    break;
                }
            }
            if (zzpk.zzx(zzicVar2, "_sid") >= 0) {
                zzpgVar.zzaH(zzicVar2, jLongValue, true);
            } else {
                int iZzx = zzpk.zzx(zzicVar2, "_se");
                if (iZzx >= 0) {
                    zzicVar2.zzr(iZzx);
                    zzpgVar.zzaV().zzb().zzb("Session engagement user property is in the bundle without session ID. appId", zzgu.zzl(zzpcVar.zza.zzA()));
                }
            }
            String strZzA3 = zzpcVar.zza.zzA();
            zzpgVar.zzaW().zzg();
            zzpgVar.zzu();
            zzh zzhVarZzu = zzpgVar.zzj().zzu(strZzA3);
            if (zzhVarZzu == null) {
                zzpgVar.zzaV().zzb().zzb("Cannot fix consent fields without appInfo. appId", zzgu.zzl(strZzA3));
            } else {
                zzpgVar.zzI(zzhVarZzu, zzicVar2);
            }
            String strZzA4 = zzpcVar.zza.zzA();
            zzpgVar.zzaW().zzg();
            zzpgVar.zzu();
            zzh zzhVarZzu2 = zzpgVar.zzj().zzu(strZzA4);
            if (zzhVarZzu2 == null) {
                zzpgVar.zzaV().zze().zzb("Cannot populate ad_campaign_info without appInfo. appId", zzgu.zzl(strZzA4));
            } else {
                zzpgVar.zzJ(zzhVarZzu2, zzicVar2);
            }
            zzicVar2.zzv(LocationRequestCompat.PASSIVE_INTERVAL);
            zzicVar2.zzx(Long.MIN_VALUE);
            for (int i28 = 0; i28 < zzicVar2.zzc(); i28++) {
                com.google.android.gms.internal.measurement.zzhs zzhsVarZzd2 = zzicVar2.zzd(i28);
                if (zzhsVarZzd2.zzf() < zzicVar2.zzu()) {
                    zzicVar2.zzv(zzhsVarZzd2.zzf());
                }
                if (zzhsVarZzd2.zzf() > zzicVar2.zzw()) {
                    zzicVar2.zzx(zzhsVarZzd2.zzf());
                }
            }
            zzicVar2.zzak();
            zzjl zzjlVar = zzjl.zza;
            zzjl zzjlVarZzs = zzpgVar.zzB(zzpcVar.zza.zzA()).zzs(zzjl.zzf(zzpcVar.zza.zzaf(), 100));
            zzjl zzjlVarZzad = zzpgVar.zzj().zzad(zzpcVar.zza.zzA());
            zzpgVar.zzj().zzac(zzpcVar.zza.zzA(), zzjlVarZzs);
            zzjk zzjkVar = zzjk.ANALYTICS_STORAGE;
            if (!zzjlVarZzs.zzo(zzjkVar) && zzjlVarZzad.zzo(zzjkVar)) {
                zzpgVar.zzj().zzi(zzpcVar.zza.zzA());
            } else if (zzjlVarZzs.zzo(zzjkVar) && !zzjlVarZzad.zzo(zzjkVar)) {
                zzpgVar.zzj().zzj(zzpcVar.zza.zzA());
            }
            zzjk zzjkVar2 = zzjk.AD_STORAGE;
            if (!zzjlVarZzs.zzo(zzjkVar2)) {
                zzicVar2.zzR();
                zzicVar2.zzU();
                zzicVar2.zzan();
            }
            if (!zzjlVarZzs.zzo(zzjkVar)) {
                zzicVar2.zzX();
                zzicVar2.zzav();
            }
            zzqp.zza();
            if (zzpgVar.zzd().zzp(zzpcVar.zza.zzA(), zzfy.zzaP) && zzpgVar.zzt().zzX(zzpcVar.zza.zzA()) && zzpgVar.zzB(zzpcVar.zza.zzA()).zzo(zzjkVar2) && zzpcVar.zza.zzak()) {
                zzpgVar.zzT(zzicVar2, zzpcVar);
            }
            zzicVar2.zzag();
            zzicVar2.zzaf(zzpgVar.zzm().zzb(zzicVar2.zzK(), zzicVar2.zzb(), zzicVar2.zzk(), Long.valueOf(zzicVar2.zzu()), Long.valueOf(zzicVar2.zzw()), !zzjlVarZzs.zzo(zzjkVar)));
            if (zzpgVar.zzd().zzD(zzpcVar.zza.zzA())) {
                try {
                    HashMap map = new HashMap();
                    ArrayList arrayList3 = new ArrayList();
                    SecureRandom secureRandomZzf = zzpgVar.zzt().zzf();
                    int i29 = 0;
                    ?? r214 = r21;
                    while (i29 < zzicVar2.zzc()) {
                        com.google.android.gms.internal.measurement.zzhr zzhrVar12 = (com.google.android.gms.internal.measurement.zzhr) zzicVar2.zzd(i29).zzcl();
                        if (zzhrVar12.zzk().equals("_ep")) {
                            zzpgVar.zzp();
                            String str22 = (String) zzpk.zzI((com.google.android.gms.internal.measurement.zzhs) zzhrVar12.zzbc(), "_en");
                            zzbc zzbcVarZzf = (zzbc) map.get(str22);
                            if (zzbcVarZzf == null && (zzbcVarZzf = zzpgVar.zzj().zzf(zzpcVar.zza.zzA(), (String) Preconditions.checkNotNull(str22))) != null) {
                                map.put(str22, zzbcVarZzf);
                            }
                            if (zzbcVarZzf == null || zzbcVarZzf.zzi != null) {
                                r10 = r214;
                            } else {
                                Long l = zzbcVarZzf.zzj;
                                if (l != null && l.longValue() > 1) {
                                    zzpgVar.zzp();
                                    zzpk.zzC(zzhrVar12, "_sr", l);
                                }
                                Boolean bool = zzbcVarZzf.zzk;
                                if (bool == null || !bool.booleanValue()) {
                                    r102 = r214;
                                } else {
                                    zzpgVar.zzp();
                                    ?? r103 = r214;
                                    zzpk.zzC(zzhrVar12, r103, 1L);
                                    r102 = r103;
                                }
                                arrayList3.add((com.google.android.gms.internal.measurement.zzhs) zzhrVar12.zzbc());
                                r10 = r102;
                            }
                            zzicVar2.zzf(i29, zzhrVar12);
                            j4 = j6;
                            secureRandom = secureRandomZzf;
                            i2 = i29;
                            r72 = r10;
                            zzpcVar2 = zzpcVar;
                        } else {
                            ?? r104 = r214;
                            zzht zzhtVarZzh = zzpgVar.zzh();
                            String strZzA5 = zzpcVar.zza.zzA();
                            String strZza = zzhtVarZzh.zza(strZzA5, "measurement.account.time_zone_offset_minutes");
                            if (TextUtils.isEmpty(strZza)) {
                                j3 = j6;
                                j4 = j6;
                                long jZzaj2 = zzpgVar.zzt().zzaj(zzhrVar12.zzn(), j3);
                                com.google.android.gms.internal.measurement.zzhs zzhsVar = (com.google.android.gms.internal.measurement.zzhs) zzhrVar12.zzbc();
                                Long l2 = 1L;
                                if (TextUtils.isEmpty("_dbg")) {
                                }
                            } else {
                                try {
                                    j3 = Long.parseLong(strZza);
                                } catch (NumberFormatException e) {
                                    zzhtVarZzh.zzu.zzaV().zze().zzc("Unable to parse timezone offset. appId", zzgu.zzl(strZzA5), e);
                                    j3 = j6;
                                }
                                j4 = j6;
                                long jZzaj22 = zzpgVar.zzt().zzaj(zzhrVar12.zzn(), j3);
                                com.google.android.gms.internal.measurement.zzhs zzhsVar2 = (com.google.android.gms.internal.measurement.zzhs) zzhrVar12.zzbc();
                                Long l22 = 1L;
                                if (TextUtils.isEmpty("_dbg")) {
                                    r104 = r104;
                                    for (com.google.android.gms.internal.measurement.zzhw zzhwVar2 : zzhsVar2.zza()) {
                                        ?? r215 = r104;
                                        if (!"_dbg".equals(zzhwVar2.zzb())) {
                                            r104 = r215;
                                        } else if (l22.equals(Long.valueOf(zzhwVar2.zzf()))) {
                                            iZzm = 1;
                                            r213 = r215;
                                            if (iZzm > 0) {
                                            }
                                            secureRandom = secureRandomZzf;
                                            i2 = i29;
                                            zzpcVar2 = zzpcVar;
                                            r72 = r213;
                                        } else {
                                            r212 = r215;
                                            iZzm = zzh().zzm(zzpcVar.zza.zzA(), zzhrVar12.zzk());
                                            r213 = r212;
                                            if (iZzm > 0) {
                                                zzaV().zze().zzc("Sample rate must be positive. event, rate", zzhrVar12.zzk(), Integer.valueOf(iZzm));
                                                arrayList3.add((com.google.android.gms.internal.measurement.zzhs) zzhrVar12.zzbc());
                                                zzicVar2.zzf(i29, zzhrVar12);
                                            } else {
                                                zzbc zzbcVarZzc = (zzbc) map.get(zzhrVar12.zzk());
                                                if (zzbcVarZzc == null && (zzbcVarZzc = zzj().zzf(zzpcVar.zza.zzA(), zzhrVar12.zzk())) == null) {
                                                    j5 = j3;
                                                    zzaV().zze().zzc("Event being bundled has no eventAggregate. appId, eventName", zzpcVar.zza.zzA(), zzhrVar12.zzk());
                                                    zzbcVarZzc = new zzbc(zzpcVar.zza.zzA(), zzhrVar12.zzk(), 1L, 1L, 1L, zzhrVar12.zzn(), 0L, null, null, null, null);
                                                } else {
                                                    j5 = j3;
                                                }
                                                zzp();
                                                Long l3 = (Long) zzpk.zzI((com.google.android.gms.internal.measurement.zzhs) zzhrVar12.zzbc(), "_eid");
                                                boolean z9 = l3 != null;
                                                if (iZzm == 1) {
                                                    arrayList3.add((com.google.android.gms.internal.measurement.zzhs) zzhrVar12.zzbc());
                                                    if (z9 && (zzbcVarZzc.zzi != null || zzbcVarZzc.zzj != null || zzbcVarZzc.zzk != null)) {
                                                        map.put(zzhrVar12.zzk(), zzbcVarZzc.zzc(null, null, null));
                                                    }
                                                    zzicVar2.zzf(i29, zzhrVar12);
                                                } else {
                                                    if (secureRandomZzf.nextInt(iZzm) == 0) {
                                                        zzp();
                                                        Long lValueOf2 = Long.valueOf(iZzm);
                                                        zzpk.zzC(zzhrVar12, "_sr", lValueOf2);
                                                        arrayList3.add((com.google.android.gms.internal.measurement.zzhs) zzhrVar12.zzbc());
                                                        if (z9) {
                                                            zzbcVarZzc = zzbcVarZzc.zzc(null, lValueOf2, null);
                                                        }
                                                        map.put(zzhrVar12.zzk(), zzbcVarZzc.zzb(zzhrVar12.zzn(), jZzaj22));
                                                        secureRandom = secureRandomZzf;
                                                        i2 = i29;
                                                        zzpcVar2 = zzpcVar;
                                                        r72 = r213;
                                                    } else {
                                                        Long l4 = zzbcVarZzc.zzh;
                                                        if (l4 != null) {
                                                            i = i29;
                                                            zzpcVar2 = zzpcVar;
                                                            zzicVar = zzicVar2;
                                                            secureRandom = secureRandomZzf;
                                                            jZzaj = l4.longValue();
                                                        } else {
                                                            secureRandom = secureRandomZzf;
                                                            i = i29;
                                                            zzpcVar2 = zzpcVar;
                                                            zzicVar = zzicVar2;
                                                            jZzaj = zzt().zzaj(zzhrVar12.zzp(), j5);
                                                        }
                                                        if (jZzaj != jZzaj22) {
                                                            zzp();
                                                            ?? r73 = r213;
                                                            zzpk.zzC(zzhrVar12, r73, 1L);
                                                            zzp();
                                                            Long lValueOf3 = Long.valueOf(iZzm);
                                                            zzpk.zzC(zzhrVar12, "_sr", lValueOf3);
                                                            arrayList3.add((com.google.android.gms.internal.measurement.zzhs) zzhrVar12.zzbc());
                                                            if (z9) {
                                                                zzbcVarZzc = zzbcVarZzc.zzc(null, lValueOf3, Boolean.TRUE);
                                                            }
                                                            map.put(zzhrVar12.zzk(), zzbcVarZzc.zzb(zzhrVar12.zzn(), jZzaj22));
                                                            r7 = r73;
                                                        } else {
                                                            ?? r74 = r213;
                                                            r7 = r74;
                                                            if (z9) {
                                                                map.put(zzhrVar12.zzk(), zzbcVarZzc.zzc(l3, null, null));
                                                                r7 = r74;
                                                            }
                                                        }
                                                        i2 = i;
                                                        zzicVar2 = zzicVar;
                                                        r72 = r7;
                                                    }
                                                    zzicVar2.zzf(i2, zzhrVar12);
                                                }
                                            }
                                            secureRandom = secureRandomZzf;
                                            i2 = i29;
                                            zzpcVar2 = zzpcVar;
                                            r72 = r213;
                                        }
                                    }
                                    r212 = r104;
                                    iZzm = zzh().zzm(zzpcVar.zza.zzA(), zzhrVar12.zzk());
                                    r213 = r212;
                                    if (iZzm > 0) {
                                    }
                                    secureRandom = secureRandomZzf;
                                    i2 = i29;
                                    zzpcVar2 = zzpcVar;
                                    r72 = r213;
                                } else {
                                    r212 = r104;
                                    iZzm = zzh().zzm(zzpcVar.zza.zzA(), zzhrVar12.zzk());
                                    r213 = r212;
                                    if (iZzm > 0) {
                                    }
                                    secureRandom = secureRandomZzf;
                                    i2 = i29;
                                    zzpcVar2 = zzpcVar;
                                    r72 = r213;
                                }
                            }
                            int i30 = i2 + 1;
                            zzpgVar = this;
                            j6 = j4;
                            r214 = r72;
                            secureRandomZzf = secureRandom;
                            zzpcVar = zzpcVar2;
                            i29 = i30;
                        }
                        int i302 = i2 + 1;
                        zzpgVar = this;
                        j6 = j4;
                        r214 = r72;
                        secureRandomZzf = secureRandom;
                        zzpcVar = zzpcVar2;
                        i29 = i302;
                    }
                    j2 = j6;
                    zzpc zzpcVar4 = zzpcVar;
                    if (arrayList3.size() < zzicVar2.zzc()) {
                        zzicVar2.zzi();
                        zzicVar2.zzh(arrayList3);
                    }
                    Iterator it4 = map.entrySet().iterator();
                    while (it4.hasNext()) {
                        zzj().zzh((zzbc) ((Map.Entry) it4.next()).getValue());
                    }
                    zzpcVar = zzpcVar4;
                } catch (Throwable th3) {
                    th = th3;
                    r2 = this;
                }
            } else {
                j2 = 0;
            }
            String strZzA6 = zzpcVar.zza.zzA();
            zzh zzhVarZzu3 = zzj().zzu(strZzA6);
            if (zzhVarZzu3 == null) {
                zzaV().zzb().zzb("Bundling raw events w/o app info. appId", zzgu.zzl(zzpcVar.zza.zzA()));
            } else {
                if (zzicVar2.zzc() > 0) {
                    long jZzp = zzhVarZzu3.zzp();
                    if (jZzp != j2) {
                        zzicVar2.zzA(jZzp);
                    } else {
                        zzicVar2.zzB();
                    }
                    long jZzn = zzhVarZzu3.zzn();
                    if (jZzn != j2) {
                        jZzp = jZzn;
                    }
                    if (jZzp != j2) {
                        zzicVar2.zzy(jZzp);
                    } else {
                        zzicVar2.zzz();
                    }
                    zzhVarZzu3.zzM(zzicVar2.zzc());
                    zzicVar2.zzaJ((int) zzhVarZzu3.zzaF());
                    zzicVar2.zzZ((int) zzhVarZzu3.zzG());
                    zzhVarZzu3.zzo(zzicVar2.zzu());
                    zzhVarZzu3.zzq(zzicVar2.zzw());
                    String strZzaa = zzhVarZzu3.zzaa();
                    if (strZzaa != null) {
                        zzicVar2.zzaa(strZzaa);
                    } else {
                        zzicVar2.zzab();
                    }
                    i3 = 0;
                    zzj().zzv(zzhVarZzu3, false, false);
                }
                if (zzicVar2.zzc() <= 0) {
                    zzpg zzpgVar3 = this;
                    zzpgVar3.zzn.zzaU();
                    com.google.android.gms.internal.measurement.zzgl zzglVarZzb = zzpgVar3.zzh().zzb(zzpcVar.zza.zzA());
                    if (zzglVarZzb != null && zzglVarZzb.zza()) {
                        zzicVar2.zzal(zzglVarZzb.zzb());
                    } else if (zzpcVar.zza.zzP().isEmpty()) {
                        zzicVar2.zzal(-1L);
                    } else {
                        zzpgVar3.zzaV().zze().zzb("Did not find measurement config or missing version info. appId", zzgu.zzl(zzpcVar.zza.zzA()));
                    }
                    zzpgVar3.zzj().zzz((com.google.android.gms.internal.measurement.zzid) zzicVar2.zzbc(), z5);
                    r23 = zzpgVar3;
                } else {
                    r23 = this;
                }
                zzav zzavVarZzj = r23.zzj();
                list2 = zzpcVar.zzb;
                Preconditions.checkNotNull(list2);
                zzavVarZzj.zzg();
                zzavVarZzj.zzaw();
                StringBuilder sb = new StringBuilder("rowid in (");
                for (i4 = i3; i4 < list2.size(); i4++) {
                    if (i4 != 0) {
                        sb.append(",");
                    }
                    sb.append(((Long) list2.get(i4)).longValue());
                }
                sb.append(")");
                iDelete = zzavVarZzj.zze().delete("raw_events", sb.toString(), null);
                if (iDelete != list2.size()) {
                    zzavVarZzj.zzu.zzaV().zzb().zzc("Deleted fewer rows from raw events table than expected", Integer.valueOf(iDelete), Integer.valueOf(list2.size()));
                }
                zzav zzavVarZzj2 = r23.zzj();
                zzavVarZzj2.zze().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{strZzA6, strZzA6});
                r23.zzj().zzc();
                z = true;
                r22 = r23;
            }
            i3 = 0;
            if (zzicVar2.zzc() <= 0) {
            }
            zzav zzavVarZzj3 = r23.zzj();
            list2 = zzpcVar.zzb;
            Preconditions.checkNotNull(list2);
            zzavVarZzj3.zzg();
            zzavVarZzj3.zzaw();
            StringBuilder sb2 = new StringBuilder("rowid in (");
            while (i4 < list2.size()) {
            }
            sb2.append(")");
            iDelete = zzavVarZzj3.zze().delete("raw_events", sb2.toString(), null);
            if (iDelete != list2.size()) {
            }
            zzav zzavVarZzj22 = r23.zzj();
            zzavVarZzj22.zze().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{strZzA6, strZzA6});
            r23.zzj().zzc();
            z = true;
            r22 = r23;
        }
        r22.zzj().zzd();
        return z;
    }

    private final void zzaH(com.google.android.gms.internal.measurement.zzic zzicVar, long j, boolean z) {
        Object obj;
        String str = true != z ? "_lte" : "_se";
        zzpn zzpnVarZzm = zzj().zzm(zzicVar.zzK(), str);
        zzpn zzpnVar = (zzpnVarZzm == null || (obj = zzpnVarZzm.zze) == null) ? new zzpn(zzicVar.zzK(), "auto", str, zzaZ().currentTimeMillis(), Long.valueOf(j)) : new zzpn(zzicVar.zzK(), "auto", str, zzaZ().currentTimeMillis(), Long.valueOf(((Long) obj).longValue() + j));
        com.google.android.gms.internal.measurement.zzit zzitVarZzm = com.google.android.gms.internal.measurement.zziu.zzm();
        zzitVarZzm.zzb(str);
        zzitVarZzm.zza(zzaZ().currentTimeMillis());
        Object obj2 = zzpnVar.zze;
        zzitVarZzm.zze(((Long) obj2).longValue());
        com.google.android.gms.internal.measurement.zziu zziuVar = (com.google.android.gms.internal.measurement.zziu) zzitVarZzm.zzbc();
        int iZzx = zzpk.zzx(zzicVar, str);
        if (iZzx >= 0) {
            zzicVar.zzn(iZzx, zziuVar);
        } else {
            zzicVar.zzo(zziuVar);
        }
        if (j > 0) {
            zzj().zzl(zzpnVar);
            zzaV().zzk().zzc("Updated engagement user property. scope, value", true != z ? "lifetime" : "session-scoped", obj2);
        }
    }

    private final boolean zzaI(com.google.android.gms.internal.measurement.zzhr zzhrVar, com.google.android.gms.internal.measurement.zzhr zzhrVar2) {
        Preconditions.checkArgument("_e".equals(zzhrVar.zzk()));
        zzp();
        com.google.android.gms.internal.measurement.zzhw zzhwVarZzF = zzpk.zzF((com.google.android.gms.internal.measurement.zzhs) zzhrVar.zzbc(), "_sc");
        String strZzd = zzhwVarZzF == null ? null : zzhwVarZzF.zzd();
        zzp();
        com.google.android.gms.internal.measurement.zzhw zzhwVarZzF2 = zzpk.zzF((com.google.android.gms.internal.measurement.zzhs) zzhrVar2.zzbc(), "_pc");
        String strZzd2 = zzhwVarZzF2 != null ? zzhwVarZzF2.zzd() : null;
        if (strZzd2 == null || !strZzd2.equals(strZzd)) {
            return false;
        }
        Preconditions.checkArgument("_e".equals(zzhrVar.zzk()));
        zzp();
        com.google.android.gms.internal.measurement.zzhw zzhwVarZzF3 = zzpk.zzF((com.google.android.gms.internal.measurement.zzhs) zzhrVar.zzbc(), "_et");
        if (zzhwVarZzF3 == null || !zzhwVarZzF3.zze() || zzhwVarZzF3.zzf() <= 0) {
            return true;
        }
        long jZzf = zzhwVarZzF3.zzf();
        zzp();
        com.google.android.gms.internal.measurement.zzhw zzhwVarZzF4 = zzpk.zzF((com.google.android.gms.internal.measurement.zzhs) zzhrVar2.zzbc(), "_et");
        if (zzhwVarZzF4 != null && zzhwVarZzF4.zzf() > 0) {
            jZzf += zzhwVarZzF4.zzf();
        }
        zzp();
        zzpk.zzC(zzhrVar2, "_et", Long.valueOf(jZzf));
        zzp();
        zzpk.zzC(zzhrVar, "_fr", 1L);
        return true;
    }

    private final boolean zzaJ() {
        zzaW().zzg();
        zzu();
        return zzj().zzP() || !TextUtils.isEmpty(zzj().zzF());
    }

    private static String zzaK(Map map, String str) {
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                if (((List) entry.getValue()).isEmpty()) {
                    return null;
                }
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    private final void zzaL() {
        long jMax;
        long jMax2;
        zzaW().zzg();
        zzu();
        if (this.zza > 0) {
            long jAbs = C18250l0.g.f55493g - Math.abs(zzaZ().elapsedRealtime() - this.zza);
            if (jAbs > 0) {
                zzaV().zzk().zzb("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(jAbs));
                zzk().zzb();
                zzl().zzd();
                return;
            }
            this.zza = 0L;
        }
        if (!this.zzn.zzH() || !zzaJ()) {
            zzaV().zzk().zza("Nothing to upload or uploading impossible");
            zzk().zzb();
            zzl().zzd();
            return;
        }
        long jCurrentTimeMillis = zzaZ().currentTimeMillis();
        zzd();
        long jMax3 = Math.max(0L, ((Long) zzfy.zzO.zzb(null)).longValue());
        boolean z = true;
        if (!zzj().zzR() && !zzj().zzG()) {
            z = false;
        }
        if (z) {
            String strZzA = zzd().zzA();
            if (TextUtils.isEmpty(strZzA) || ".none.".equals(strZzA)) {
                zzd();
                jMax = Math.max(0L, ((Long) zzfy.zzI.zzb(null)).longValue());
            } else {
                zzd();
                jMax = Math.max(0L, ((Long) zzfy.zzJ.zzb(null)).longValue());
            }
        } else {
            zzd();
            jMax = Math.max(0L, ((Long) zzfy.zzH.zzb(null)).longValue());
        }
        long jZza = this.zzk.zzd.zza();
        long jZza2 = this.zzk.zze.zza();
        long j = 0;
        boolean z2 = z;
        long jMax4 = Math.max(zzj().zzM(), zzj().zzO());
        if (jMax4 == 0) {
            jMax2 = 0;
        } else {
            long jAbs2 = jCurrentTimeMillis - Math.abs(jMax4 - jCurrentTimeMillis);
            long jAbs3 = jCurrentTimeMillis - Math.abs(jZza - jCurrentTimeMillis);
            long jAbs4 = jCurrentTimeMillis - Math.abs(jZza2 - jCurrentTimeMillis);
            jMax2 = jMax3 + jAbs2;
            long jMax5 = Math.max(jAbs3, jAbs4);
            if (z2 && jMax5 > 0) {
                jMax2 = Math.min(jAbs2, jMax5) + jMax;
            }
            if (!zzp().zzs(jMax5, jMax)) {
                jMax2 = jMax5 + jMax;
            }
            if (jAbs4 != 0 && jAbs4 >= jAbs2) {
                int i = 0;
                while (true) {
                    zzd();
                    if (i >= Math.min(20, Math.max(0, ((Integer) zzfy.zzQ.zzb(null)).intValue()))) {
                        jMax2 = 0;
                        break;
                    }
                    zzd();
                    jMax2 += Math.max(j, ((Long) zzfy.zzP.zzb(null)).longValue()) * (1 << i);
                    if (jMax2 > jAbs4) {
                        break;
                    }
                    i++;
                    j = 0;
                }
            }
            j = 0;
        }
        if (jMax2 == j) {
            zzaV().zzk().zza("Next upload time is 0");
            zzk().zzb();
            zzl().zzd();
            return;
        }
        if (!zzi().zzb()) {
            zzaV().zzk().zza("No network");
            zzk().zza();
            zzl().zzd();
            return;
        }
        long jZza3 = this.zzk.zzc.zza();
        zzd();
        long jMax6 = Math.max(0L, ((Long) zzfy.zzF.zzb(null)).longValue());
        if (!zzp().zzs(jZza3, jMax6)) {
            jMax2 = Math.max(jMax2, jZza3 + jMax6);
        }
        zzk().zzb();
        long jCurrentTimeMillis2 = jMax2 - zzaZ().currentTimeMillis();
        if (jCurrentTimeMillis2 <= 0) {
            zzd();
            jCurrentTimeMillis2 = Math.max(0L, ((Long) zzfy.zzK.zzb(null)).longValue());
            this.zzk.zzd.zzb(zzaZ().currentTimeMillis());
        }
        zzaV().zzk().zzb("Upload scheduled in approximately ms", Long.valueOf(jCurrentTimeMillis2));
        zzl().zzc(jCurrentTimeMillis2);
    }

    private final void zzaM() {
        zzaW().zzg();
        if (this.zzu || this.zzv || this.zzw) {
            zzaV().zzk().zzd("Not stopping services. fetch, network, upload", Boolean.valueOf(this.zzu), Boolean.valueOf(this.zzv), Boolean.valueOf(this.zzw));
            return;
        }
        zzaV().zzk().zza("Stopping uploading service(s)");
        List list = this.zzq;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ((List) Preconditions.checkNotNull(this.zzq)).clear();
    }

    private final Boolean zzaN(zzh zzhVar) {
        try {
            if (zzhVar.zzt() != -2147483648L) {
                if (zzhVar.zzt() == Wrappers.packageManager(this.zzn.zzaY()).getPackageInfo(zzhVar.zzc(), 0).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = Wrappers.packageManager(this.zzn.zzaY()).getPackageInfo(zzhVar.zzc(), 0).versionName;
                String strZzr = zzhVar.zzr();
                if (strZzr != null && strZzr.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final zzr zzaO(String str) {
        zzh zzhVarZzu = zzj().zzu(str);
        if (zzhVarZzu == null || TextUtils.isEmpty(zzhVarZzu.zzr())) {
            zzaV().zzj().zzb("No app data available; dropping", str);
            return null;
        }
        Boolean boolZzaN = zzaN(zzhVarZzu);
        if (boolZzaN == null || boolZzaN.booleanValue()) {
            return new zzr(str, zzhVarZzu.zzf(), zzhVarZzu.zzr(), zzhVarZzu.zzt(), zzhVarZzu.zzv(), zzhVarZzu.zzx(), zzhVarZzu.zzz(), (String) null, zzhVarZzu.zzD(), false, zzhVarZzu.zzl(), 0L, 0, zzhVarZzu.zzac(), false, zzhVarZzu.zzae(), zzhVarZzu.zzB(), zzhVarZzu.zzag(), zzB(str).zzl(), "", (String) null, zzhVarZzu.zzai(), zzhVarZzu.zzak(), zzB(str).zzb(), zzx(str).zze(), zzhVarZzu.zzao(), zzhVarZzu.zzaw(), zzhVarZzu.zzay(), zzhVarZzu.zzaH(), 0L, zzhVarZzu.zzaL());
        }
        zzaV().zzb().zzb("App version does not match; dropping. appId", zzgu.zzl(str));
        return null;
    }

    private final boolean zzaP(String str, String str2) {
        zzbc zzbcVarZzf = zzj().zzf(str, str2);
        return zzbcVarZzf == null || zzbcVarZzf.zzc < 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzaQ(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT < 34) {
            context.sendBroadcast(intent);
        } else {
            context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
        }
    }

    private static final boolean zzaR(zzr zzrVar) {
        return !TextUtils.isEmpty(zzrVar.zzb);
    }

    private static final zzos zzaS(zzos zzosVar) {
        if (zzosVar == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (zzosVar.zzav()) {
            return zzosVar;
        }
        throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(zzosVar.getClass())));
    }

    private static final Boolean zzaT(zzr zzrVar) {
        Boolean bool = zzrVar.zzp;
        String str = zzrVar.zzC;
        if (!TextUtils.isEmpty(str)) {
            zzji zzjiVarZza = zze.zzc(str).zza();
            zzji zzjiVar = zzji.UNINITIALIZED;
            int iOrdinal = zzjiVarZza.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                return null;
            }
            if (iOrdinal == 2) {
                return Boolean.TRUE;
            }
            if (iOrdinal == 3) {
                return Boolean.FALSE;
            }
        }
        return bool;
    }

    public final void zzA(String str, zzjl zzjlVar) {
        zzaW().zzg();
        zzu();
        this.zzC.put(str, zzjlVar);
        zzj().zzZ(str, zzjlVar);
    }

    public final zzjl zzB(String str) {
        zzjl zzjlVar = zzjl.zza;
        zzaW().zzg();
        zzu();
        zzjl zzjlVarZzX = (zzjl) this.zzC.get(str);
        if (zzjlVarZzX == null) {
            zzjlVarZzX = zzj().zzX(str);
            if (zzjlVarZzX == null) {
                zzjlVarZzX = zzjl.zza;
            }
            zzA(str, zzjlVarZzX);
        }
        return zzjlVarZzX;
    }

    public final long zzC() {
        long jCurrentTimeMillis = zzaZ().currentTimeMillis();
        zznn zznnVar = this.zzk;
        zznnVar.zzaw();
        zznnVar.zzg();
        zzhe zzheVar = zznnVar.zzf;
        long jZza = zzheVar.zza();
        if (jZza == 0) {
            jZza = ((long) zznnVar.zzu.zzk().zzf().nextInt(C18168f2.f54714c)) + 1;
            zzheVar.zzb(jZza);
        }
        return ((((jCurrentTimeMillis + jZza) / 1000) / 60) / 60) / 24;
    }

    public final void zzD(zzbg zzbgVar, String str) {
        zzh zzhVarZzu = zzj().zzu(str);
        if (zzhVarZzu == null || TextUtils.isEmpty(zzhVarZzu.zzr())) {
            zzaV().zzj().zzb("No app data available; dropping event", str);
            return;
        }
        Boolean boolZzaN = zzaN(zzhVarZzu);
        if (boolZzaN == null) {
            if (!"_ui".equals(zzbgVar.zza)) {
                zzaV().zze().zzb("Could not find package. appId", zzgu.zzl(str));
            }
        } else if (!boolZzaN.booleanValue()) {
            zzaV().zzb().zzb("App version does not match; dropping event. appId", zzgu.zzl(str));
            return;
        }
        zzE(zzbgVar, new zzr(str, zzhVarZzu.zzf(), zzhVarZzu.zzr(), zzhVarZzu.zzt(), zzhVarZzu.zzv(), zzhVarZzu.zzx(), zzhVarZzu.zzz(), (String) null, zzhVarZzu.zzD(), false, zzhVarZzu.zzl(), 0L, 0, zzhVarZzu.zzac(), false, zzhVarZzu.zzae(), zzhVarZzu.zzB(), zzhVarZzu.zzag(), zzB(str).zzl(), "", (String) null, zzhVarZzu.zzai(), zzhVarZzu.zzak(), zzB(str).zzb(), zzx(str).zze(), zzhVarZzu.zzao(), zzhVarZzu.zzaw(), zzhVarZzu.zzay(), zzhVarZzu.zzaH(), 0L, zzhVarZzu.zzaL()));
    }

    public final void zzE(zzbg zzbgVar, zzr zzrVar) {
        String str = zzrVar.zza;
        Preconditions.checkNotEmpty(str);
        zzgv zzgvVarZza = zzgv.zza(zzbgVar);
        zzt().zzI(zzgvVarZza.zzd, zzj().zzU(str));
        zzt().zzG(zzgvVarZza, zzd().zzd(str));
        zzbg zzbgVarZzb = zzgvVarZza.zzb();
        if (!zzd().zzp(null, zzfy.zzbf) && Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN.equals(zzbgVarZzb.zza)) {
            zzbe zzbeVar = zzbgVarZzb.zzb;
            if ("referrer API v2".equals(zzbeVar.zzd("_cis"))) {
                String strZzd = zzbeVar.zzd("gclid");
                if (!TextUtils.isEmpty(strZzd)) {
                    zzac(new zzpl("_lgclid", zzbgVarZzb.zzd, strZzd, "auto"), zzrVar);
                }
            }
        }
        zzF(zzbgVarZzb, zzrVar);
    }

    public final void zzF(zzbg zzbgVar, zzr zzrVar) {
        zzbg zzbgVar2;
        List<zzah> listZzt;
        List<zzah> listZzt2;
        List<zzah> listZzt3;
        String str;
        Preconditions.checkNotNull(zzrVar);
        String str2 = zzrVar.zza;
        Preconditions.checkNotEmpty(str2);
        zzaW().zzg();
        zzu();
        long j = zzbgVar.zzd;
        zzgv zzgvVarZza = zzgv.zza(zzbgVar);
        zzaW().zzg();
        zzpp.zzav((this.zzG == null || (str = this.zzH) == null || !str.equals(str2)) ? null : this.zzG, zzgvVarZza.zzd, false);
        zzbg zzbgVarZzb = zzgvVarZza.zzb();
        zzp();
        if (zzpk.zzD(zzbgVarZzb, zzrVar)) {
            if (!zzrVar.zzh) {
                zzao(zzrVar);
                return;
            }
            List list = zzrVar.zzr;
            if (list != null) {
                String str3 = zzbgVarZzb.zza;
                if (!list.contains(str3)) {
                    zzaV().zzj().zzd("Dropping non-safelisted event. appId, event name, origin", str2, zzbgVarZzb.zza, zzbgVarZzb.zzc);
                    return;
                } else {
                    Bundle bundleZzf = zzbgVarZzb.zzb.zzf();
                    bundleZzf.putLong("ga_safelisted", 1L);
                    zzbgVar2 = new zzbg(str3, new zzbe(bundleZzf), zzbgVarZzb.zzc, zzbgVarZzb.zzd);
                }
            } else {
                zzbgVar2 = zzbgVarZzb;
            }
            zzj().zzb();
            try {
                String str4 = zzbgVar2.zza;
                if ("_s".equals(str4) && !zzj().zzQ(str2, "_s") && zzbgVar2.zzb.zzb("_sid").longValue() != 0) {
                    if (zzj().zzQ(str2, "_f") || zzj().zzQ(str2, "_v")) {
                        zzj().zzW(str2, null, "_sid", zzG(str2, zzbgVar2));
                    } else {
                        zzj().zzW(str2, Long.valueOf(zzaZ().currentTimeMillis() - 15000), "_sid", zzG(str2, zzbgVar2));
                    }
                }
                zzav zzavVarZzj = zzj();
                Preconditions.checkNotEmpty(str2);
                zzavVarZzj.zzg();
                zzavVarZzj.zzaw();
                if (j < 0) {
                    zzavVarZzj.zzu.zzaV().zze().zzc("Invalid time querying timed out conditional properties", zzgu.zzl(str2), Long.valueOf(j));
                    listZzt = Collections.EMPTY_LIST;
                } else {
                    listZzt = zzavVarZzj.zzt("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
                }
                for (zzah zzahVar : listZzt) {
                    if (zzahVar != null) {
                        zzaV().zzk().zzd("User property timed out", zzahVar.zza, this.zzn.zzl().zzc(zzahVar.zzc.zzb), zzahVar.zzc.zza());
                        zzbg zzbgVar3 = zzahVar.zzg;
                        if (zzbgVar3 != null) {
                            zzH(new zzbg(zzbgVar3, j), zzrVar);
                        }
                        zzj().zzr(str2, zzahVar.zzc.zzb);
                    }
                }
                zzav zzavVarZzj2 = zzj();
                Preconditions.checkNotEmpty(str2);
                zzavVarZzj2.zzg();
                zzavVarZzj2.zzaw();
                if (j < 0) {
                    zzavVarZzj2.zzu.zzaV().zze().zzc("Invalid time querying expired conditional properties", zzgu.zzl(str2), Long.valueOf(j));
                    listZzt2 = Collections.EMPTY_LIST;
                } else {
                    listZzt2 = zzavVarZzj2.zzt("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
                }
                ArrayList arrayList = new ArrayList(listZzt2.size());
                for (zzah zzahVar2 : listZzt2) {
                    if (zzahVar2 != null) {
                        zzaV().zzk().zzd("User property expired", zzahVar2.zza, this.zzn.zzl().zzc(zzahVar2.zzc.zzb), zzahVar2.zzc.zza());
                        zzj().zzk(str2, zzahVar2.zzc.zzb);
                        zzbg zzbgVar4 = zzahVar2.zzk;
                        if (zzbgVar4 != null) {
                            arrayList.add(zzbgVar4);
                        }
                        zzj().zzr(str2, zzahVar2.zzc.zzb);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    zzH(new zzbg((zzbg) it.next(), j), zzrVar);
                }
                zzav zzavVarZzj3 = zzj();
                Preconditions.checkNotEmpty(str2);
                Preconditions.checkNotEmpty(str4);
                zzavVarZzj3.zzg();
                zzavVarZzj3.zzaw();
                if (j < 0) {
                    zzic zzicVar = zzavVarZzj3.zzu;
                    zzicVar.zzaV().zze().zzd("Invalid time querying triggered conditional properties", zzgu.zzl(str2), zzicVar.zzl().zza(str4), Long.valueOf(j));
                    listZzt3 = Collections.EMPTY_LIST;
                } else {
                    listZzt3 = zzavVarZzj3.zzt("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str4, String.valueOf(j)});
                }
                ArrayList arrayList2 = new ArrayList(listZzt3.size());
                for (zzah zzahVar3 : listZzt3) {
                    if (zzahVar3 != null) {
                        zzpl zzplVar = zzahVar3.zzc;
                        zzpn zzpnVar = new zzpn((String) Preconditions.checkNotNull(zzahVar3.zza), zzahVar3.zzb, zzplVar.zzb, j, Preconditions.checkNotNull(zzplVar.zza()));
                        if (zzj().zzl(zzpnVar)) {
                            zzaV().zzk().zzd("User property triggered", zzahVar3.zza, this.zzn.zzl().zzc(zzpnVar.zzc), zzpnVar.zze);
                        } else {
                            zzaV().zzb().zzd("Too many active user properties, ignoring", zzgu.zzl(zzahVar3.zza), this.zzn.zzl().zzc(zzpnVar.zzc), zzpnVar.zze);
                        }
                        zzbg zzbgVar5 = zzahVar3.zzi;
                        if (zzbgVar5 != null) {
                            arrayList2.add(zzbgVar5);
                        }
                        zzahVar3.zzc = new zzpl(zzpnVar);
                        zzahVar3.zze = true;
                        zzj().zzp(zzahVar3);
                    }
                }
                zzH(zzbgVar2, zzrVar);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    zzH(new zzbg((zzbg) it2.next(), j), zzrVar);
                }
                zzj().zzc();
                zzj().zzd();
            } catch (Throwable th) {
                zzj().zzd();
                throw th;
            }
        }
    }

    public final Bundle zzG(String str, zzbg zzbgVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", zzbgVar.zzb.zzb("_sid").longValue());
        zzpn zzpnVarZzm = zzj().zzm(str, "_sno");
        if (zzpnVarZzm != null) {
            Object obj = zzpnVarZzm.zze;
            if (obj instanceof Long) {
                bundle.putLong("_sno", ((Long) obj).longValue());
            }
        }
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0366 A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:36:0x0155, B:39:0x0164, B:41:0x016c, B:47:0x0179, B:89:0x02f2, B:98:0x0325, B:100:0x0366, B:102:0x036b, B:103:0x0382, B:105:0x038d, B:107:0x03a6, B:109:0x03ab, B:110:0x03c2, B:113:0x03e4, B:117:0x0407, B:118:0x041e, B:120:0x042a, B:123:0x0447, B:124:0x045b, B:126:0x0463, B:128:0x046f, B:130:0x0475, B:131:0x047c, B:133:0x0489, B:135:0x0491, B:137:0x0499, B:139:0x04a1, B:140:0x04ad, B:141:0x04ba, B:147:0x04fc, B:148:0x0511, B:150:0x0533, B:153:0x054a, B:156:0x0585, B:158:0x05b0, B:160:0x05e8, B:161:0x05eb, B:163:0x05f3, B:164:0x05f6, B:166:0x05fe, B:167:0x0601, B:169:0x0609, B:170:0x060c, B:172:0x0615, B:173:0x0619, B:175:0x0626, B:176:0x0629, B:178:0x0655, B:180:0x065f, B:184:0x0674, B:189:0x0680, B:192:0x0689, B:196:0x0696, B:200:0x06a4, B:204:0x06b2, B:208:0x06c0, B:212:0x06ce, B:216:0x06d9, B:220:0x06e6, B:221:0x06f2, B:223:0x06f8, B:224:0x06fb, B:226:0x071e, B:229:0x0727, B:232:0x0730, B:233:0x074a, B:235:0x0750, B:237:0x0764, B:239:0x0770, B:241:0x077d, B:244:0x0796, B:245:0x07a6, B:249:0x07af, B:250:0x07b2, B:252:0x07bf, B:253:0x07c4, B:255:0x07e2, B:257:0x07e6, B:259:0x07f6, B:261:0x0801, B:262:0x080a, B:264:0x0814, B:266:0x0820, B:268:0x082a, B:270:0x0830, B:272:0x083f, B:274:0x0855, B:276:0x085b, B:277:0x0864, B:279:0x0872, B:281:0x08ae, B:283:0x08b8, B:284:0x08bb, B:286:0x08c5, B:288:0x08e1, B:289:0x08ec, B:291:0x0924, B:293:0x092c, B:295:0x0936, B:296:0x0943, B:298:0x094d, B:299:0x095a, B:300:0x0963, B:302:0x0969, B:304:0x09a5, B:306:0x09af, B:308:0x09c1, B:310:0x09c7, B:311:0x0a0c, B:312:0x0a17, B:313:0x0a22, B:315:0x0a28, B:324:0x0a75, B:325:0x0ac0, B:327:0x0ad1, B:341:0x0b32, B:332:0x0ae9, B:333:0x0aec, B:318:0x0a35, B:320:0x0a61, B:338:0x0b05, B:339:0x0b1c, B:340:0x0b1d, B:227:0x0721, B:157:0x05a2, B:144:0x04e3, B:92:0x0306, B:93:0x030d, B:95:0x0313, B:97:0x031f, B:54:0x0191, B:56:0x019d, B:58:0x01b2, B:64:0x01d2, B:69:0x0208, B:71:0x020e, B:73:0x021c, B:75:0x022a, B:78:0x0236, B:86:0x02bb, B:88:0x02c5, B:80:0x025f, B:81:0x0278, B:85:0x029e, B:84:0x028b, B:67:0x01de, B:68:0x01fc), top: B:353:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x086f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018d A[PHI: r28 r29
      0x018d: PHI (r28v6 java.lang.String) = (r28v1 java.lang.String), (r28v1 java.lang.String), (r28v7 java.lang.String) binds: [B:70:0x020c, B:72:0x021a, B:52:0x0189] A[DONT_GENERATE, DONT_INLINE]
      0x018d: PHI (r29v6 java.lang.String) = (r29v1 java.lang.String), (r29v1 java.lang.String), (r29v7 java.lang.String) binds: [B:70:0x020c, B:72:0x021a, B:52:0x0189] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019d A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:36:0x0155, B:39:0x0164, B:41:0x016c, B:47:0x0179, B:89:0x02f2, B:98:0x0325, B:100:0x0366, B:102:0x036b, B:103:0x0382, B:105:0x038d, B:107:0x03a6, B:109:0x03ab, B:110:0x03c2, B:113:0x03e4, B:117:0x0407, B:118:0x041e, B:120:0x042a, B:123:0x0447, B:124:0x045b, B:126:0x0463, B:128:0x046f, B:130:0x0475, B:131:0x047c, B:133:0x0489, B:135:0x0491, B:137:0x0499, B:139:0x04a1, B:140:0x04ad, B:141:0x04ba, B:147:0x04fc, B:148:0x0511, B:150:0x0533, B:153:0x054a, B:156:0x0585, B:158:0x05b0, B:160:0x05e8, B:161:0x05eb, B:163:0x05f3, B:164:0x05f6, B:166:0x05fe, B:167:0x0601, B:169:0x0609, B:170:0x060c, B:172:0x0615, B:173:0x0619, B:175:0x0626, B:176:0x0629, B:178:0x0655, B:180:0x065f, B:184:0x0674, B:189:0x0680, B:192:0x0689, B:196:0x0696, B:200:0x06a4, B:204:0x06b2, B:208:0x06c0, B:212:0x06ce, B:216:0x06d9, B:220:0x06e6, B:221:0x06f2, B:223:0x06f8, B:224:0x06fb, B:226:0x071e, B:229:0x0727, B:232:0x0730, B:233:0x074a, B:235:0x0750, B:237:0x0764, B:239:0x0770, B:241:0x077d, B:244:0x0796, B:245:0x07a6, B:249:0x07af, B:250:0x07b2, B:252:0x07bf, B:253:0x07c4, B:255:0x07e2, B:257:0x07e6, B:259:0x07f6, B:261:0x0801, B:262:0x080a, B:264:0x0814, B:266:0x0820, B:268:0x082a, B:270:0x0830, B:272:0x083f, B:274:0x0855, B:276:0x085b, B:277:0x0864, B:279:0x0872, B:281:0x08ae, B:283:0x08b8, B:284:0x08bb, B:286:0x08c5, B:288:0x08e1, B:289:0x08ec, B:291:0x0924, B:293:0x092c, B:295:0x0936, B:296:0x0943, B:298:0x094d, B:299:0x095a, B:300:0x0963, B:302:0x0969, B:304:0x09a5, B:306:0x09af, B:308:0x09c1, B:310:0x09c7, B:311:0x0a0c, B:312:0x0a17, B:313:0x0a22, B:315:0x0a28, B:324:0x0a75, B:325:0x0ac0, B:327:0x0ad1, B:341:0x0b32, B:332:0x0ae9, B:333:0x0aec, B:318:0x0a35, B:320:0x0a61, B:338:0x0b05, B:339:0x0b1c, B:340:0x0b1d, B:227:0x0721, B:157:0x05a2, B:144:0x04e3, B:92:0x0306, B:93:0x030d, B:95:0x0313, B:97:0x031f, B:54:0x0191, B:56:0x019d, B:58:0x01b2, B:64:0x01d2, B:69:0x0208, B:71:0x020e, B:73:0x021c, B:75:0x022a, B:78:0x0236, B:86:0x02bb, B:88:0x02c5, B:80:0x025f, B:81:0x0278, B:85:0x029e, B:84:0x028b, B:67:0x01de, B:68:0x01fc), top: B:353:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01fc A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:36:0x0155, B:39:0x0164, B:41:0x016c, B:47:0x0179, B:89:0x02f2, B:98:0x0325, B:100:0x0366, B:102:0x036b, B:103:0x0382, B:105:0x038d, B:107:0x03a6, B:109:0x03ab, B:110:0x03c2, B:113:0x03e4, B:117:0x0407, B:118:0x041e, B:120:0x042a, B:123:0x0447, B:124:0x045b, B:126:0x0463, B:128:0x046f, B:130:0x0475, B:131:0x047c, B:133:0x0489, B:135:0x0491, B:137:0x0499, B:139:0x04a1, B:140:0x04ad, B:141:0x04ba, B:147:0x04fc, B:148:0x0511, B:150:0x0533, B:153:0x054a, B:156:0x0585, B:158:0x05b0, B:160:0x05e8, B:161:0x05eb, B:163:0x05f3, B:164:0x05f6, B:166:0x05fe, B:167:0x0601, B:169:0x0609, B:170:0x060c, B:172:0x0615, B:173:0x0619, B:175:0x0626, B:176:0x0629, B:178:0x0655, B:180:0x065f, B:184:0x0674, B:189:0x0680, B:192:0x0689, B:196:0x0696, B:200:0x06a4, B:204:0x06b2, B:208:0x06c0, B:212:0x06ce, B:216:0x06d9, B:220:0x06e6, B:221:0x06f2, B:223:0x06f8, B:224:0x06fb, B:226:0x071e, B:229:0x0727, B:232:0x0730, B:233:0x074a, B:235:0x0750, B:237:0x0764, B:239:0x0770, B:241:0x077d, B:244:0x0796, B:245:0x07a6, B:249:0x07af, B:250:0x07b2, B:252:0x07bf, B:253:0x07c4, B:255:0x07e2, B:257:0x07e6, B:259:0x07f6, B:261:0x0801, B:262:0x080a, B:264:0x0814, B:266:0x0820, B:268:0x082a, B:270:0x0830, B:272:0x083f, B:274:0x0855, B:276:0x085b, B:277:0x0864, B:279:0x0872, B:281:0x08ae, B:283:0x08b8, B:284:0x08bb, B:286:0x08c5, B:288:0x08e1, B:289:0x08ec, B:291:0x0924, B:293:0x092c, B:295:0x0936, B:296:0x0943, B:298:0x094d, B:299:0x095a, B:300:0x0963, B:302:0x0969, B:304:0x09a5, B:306:0x09af, B:308:0x09c1, B:310:0x09c7, B:311:0x0a0c, B:312:0x0a17, B:313:0x0a22, B:315:0x0a28, B:324:0x0a75, B:325:0x0ac0, B:327:0x0ad1, B:341:0x0b32, B:332:0x0ae9, B:333:0x0aec, B:318:0x0a35, B:320:0x0a61, B:338:0x0b05, B:339:0x0b1c, B:340:0x0b1d, B:227:0x0721, B:157:0x05a2, B:144:0x04e3, B:92:0x0306, B:93:0x030d, B:95:0x0313, B:97:0x031f, B:54:0x0191, B:56:0x019d, B:58:0x01b2, B:64:0x01d2, B:69:0x0208, B:71:0x020e, B:73:0x021c, B:75:0x022a, B:78:0x0236, B:86:0x02bb, B:88:0x02c5, B:80:0x025f, B:81:0x0278, B:85:0x029e, B:84:0x028b, B:67:0x01de, B:68:0x01fc), top: B:353:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x020e A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:36:0x0155, B:39:0x0164, B:41:0x016c, B:47:0x0179, B:89:0x02f2, B:98:0x0325, B:100:0x0366, B:102:0x036b, B:103:0x0382, B:105:0x038d, B:107:0x03a6, B:109:0x03ab, B:110:0x03c2, B:113:0x03e4, B:117:0x0407, B:118:0x041e, B:120:0x042a, B:123:0x0447, B:124:0x045b, B:126:0x0463, B:128:0x046f, B:130:0x0475, B:131:0x047c, B:133:0x0489, B:135:0x0491, B:137:0x0499, B:139:0x04a1, B:140:0x04ad, B:141:0x04ba, B:147:0x04fc, B:148:0x0511, B:150:0x0533, B:153:0x054a, B:156:0x0585, B:158:0x05b0, B:160:0x05e8, B:161:0x05eb, B:163:0x05f3, B:164:0x05f6, B:166:0x05fe, B:167:0x0601, B:169:0x0609, B:170:0x060c, B:172:0x0615, B:173:0x0619, B:175:0x0626, B:176:0x0629, B:178:0x0655, B:180:0x065f, B:184:0x0674, B:189:0x0680, B:192:0x0689, B:196:0x0696, B:200:0x06a4, B:204:0x06b2, B:208:0x06c0, B:212:0x06ce, B:216:0x06d9, B:220:0x06e6, B:221:0x06f2, B:223:0x06f8, B:224:0x06fb, B:226:0x071e, B:229:0x0727, B:232:0x0730, B:233:0x074a, B:235:0x0750, B:237:0x0764, B:239:0x0770, B:241:0x077d, B:244:0x0796, B:245:0x07a6, B:249:0x07af, B:250:0x07b2, B:252:0x07bf, B:253:0x07c4, B:255:0x07e2, B:257:0x07e6, B:259:0x07f6, B:261:0x0801, B:262:0x080a, B:264:0x0814, B:266:0x0820, B:268:0x082a, B:270:0x0830, B:272:0x083f, B:274:0x0855, B:276:0x085b, B:277:0x0864, B:279:0x0872, B:281:0x08ae, B:283:0x08b8, B:284:0x08bb, B:286:0x08c5, B:288:0x08e1, B:289:0x08ec, B:291:0x0924, B:293:0x092c, B:295:0x0936, B:296:0x0943, B:298:0x094d, B:299:0x095a, B:300:0x0963, B:302:0x0969, B:304:0x09a5, B:306:0x09af, B:308:0x09c1, B:310:0x09c7, B:311:0x0a0c, B:312:0x0a17, B:313:0x0a22, B:315:0x0a28, B:324:0x0a75, B:325:0x0ac0, B:327:0x0ad1, B:341:0x0b32, B:332:0x0ae9, B:333:0x0aec, B:318:0x0a35, B:320:0x0a61, B:338:0x0b05, B:339:0x0b1c, B:340:0x0b1d, B:227:0x0721, B:157:0x05a2, B:144:0x04e3, B:92:0x0306, B:93:0x030d, B:95:0x0313, B:97:0x031f, B:54:0x0191, B:56:0x019d, B:58:0x01b2, B:64:0x01d2, B:69:0x0208, B:71:0x020e, B:73:0x021c, B:75:0x022a, B:78:0x0236, B:86:0x02bb, B:88:0x02c5, B:80:0x025f, B:81:0x0278, B:85:0x029e, B:84:0x028b, B:67:0x01de, B:68:0x01fc), top: B:353:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0306 A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:36:0x0155, B:39:0x0164, B:41:0x016c, B:47:0x0179, B:89:0x02f2, B:98:0x0325, B:100:0x0366, B:102:0x036b, B:103:0x0382, B:105:0x038d, B:107:0x03a6, B:109:0x03ab, B:110:0x03c2, B:113:0x03e4, B:117:0x0407, B:118:0x041e, B:120:0x042a, B:123:0x0447, B:124:0x045b, B:126:0x0463, B:128:0x046f, B:130:0x0475, B:131:0x047c, B:133:0x0489, B:135:0x0491, B:137:0x0499, B:139:0x04a1, B:140:0x04ad, B:141:0x04ba, B:147:0x04fc, B:148:0x0511, B:150:0x0533, B:153:0x054a, B:156:0x0585, B:158:0x05b0, B:160:0x05e8, B:161:0x05eb, B:163:0x05f3, B:164:0x05f6, B:166:0x05fe, B:167:0x0601, B:169:0x0609, B:170:0x060c, B:172:0x0615, B:173:0x0619, B:175:0x0626, B:176:0x0629, B:178:0x0655, B:180:0x065f, B:184:0x0674, B:189:0x0680, B:192:0x0689, B:196:0x0696, B:200:0x06a4, B:204:0x06b2, B:208:0x06c0, B:212:0x06ce, B:216:0x06d9, B:220:0x06e6, B:221:0x06f2, B:223:0x06f8, B:224:0x06fb, B:226:0x071e, B:229:0x0727, B:232:0x0730, B:233:0x074a, B:235:0x0750, B:237:0x0764, B:239:0x0770, B:241:0x077d, B:244:0x0796, B:245:0x07a6, B:249:0x07af, B:250:0x07b2, B:252:0x07bf, B:253:0x07c4, B:255:0x07e2, B:257:0x07e6, B:259:0x07f6, B:261:0x0801, B:262:0x080a, B:264:0x0814, B:266:0x0820, B:268:0x082a, B:270:0x0830, B:272:0x083f, B:274:0x0855, B:276:0x085b, B:277:0x0864, B:279:0x0872, B:281:0x08ae, B:283:0x08b8, B:284:0x08bb, B:286:0x08c5, B:288:0x08e1, B:289:0x08ec, B:291:0x0924, B:293:0x092c, B:295:0x0936, B:296:0x0943, B:298:0x094d, B:299:0x095a, B:300:0x0963, B:302:0x0969, B:304:0x09a5, B:306:0x09af, B:308:0x09c1, B:310:0x09c7, B:311:0x0a0c, B:312:0x0a17, B:313:0x0a22, B:315:0x0a28, B:324:0x0a75, B:325:0x0ac0, B:327:0x0ad1, B:341:0x0b32, B:332:0x0ae9, B:333:0x0aec, B:318:0x0a35, B:320:0x0a61, B:338:0x0b05, B:339:0x0b1c, B:340:0x0b1d, B:227:0x0721, B:157:0x05a2, B:144:0x04e3, B:92:0x0306, B:93:0x030d, B:95:0x0313, B:97:0x031f, B:54:0x0191, B:56:0x019d, B:58:0x01b2, B:64:0x01d2, B:69:0x0208, B:71:0x020e, B:73:0x021c, B:75:0x022a, B:78:0x0236, B:86:0x02bb, B:88:0x02c5, B:80:0x025f, B:81:0x0278, B:85:0x029e, B:84:0x028b, B:67:0x01de, B:68:0x01fc), top: B:353:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzH(zzbg zzbgVar, zzr zzrVar) {
        String strZzd;
        String str;
        String str2;
        long jLongValue;
        zzbg zzbgVar2;
        zzpn zzpnVar;
        zzbe zzbeVar;
        long length;
        long jZzH;
        long j;
        ?? r5;
        long jDelete;
        zzbb zzbbVar;
        zzbc zzbcVar;
        ArrayList arrayList;
        String str3;
        zzjk zzjkVar;
        int i;
        int i2;
        zzh zzhVarZzu;
        zzpn zzpnVarZzm;
        Preconditions.checkNotNull(zzrVar);
        String str4 = zzrVar.zza;
        Preconditions.checkNotEmpty(str4);
        long jNanoTime = System.nanoTime();
        zzaW().zzg();
        zzu();
        zzp();
        if (zzpk.zzD(zzbgVar, zzrVar)) {
            if (!zzrVar.zzh) {
                zzao(zzrVar);
                return;
            }
            zzht zzhtVarZzh = zzh();
            String str5 = zzbgVar.zza;
            if (zzhtVarZzh.zzj(str4, str5)) {
                zzaV().zze().zzc("Dropping blocked event. appId", zzgu.zzl(str4), this.zzn.zzl().zza(str5));
                if (!zzh().zzn(str4) && !zzh().zzo(str4)) {
                    if ("_err".equals(str5)) {
                        return;
                    }
                    zzt().zzN(this.zzK, str4, 11, "_ev", str5, 0);
                    return;
                }
                zzh zzhVarZzu2 = zzj().zzu(str4);
                if (zzhVarZzu2 != null) {
                    long jAbs = Math.abs(zzaZ().currentTimeMillis() - Math.max(zzhVarZzu2.zzJ(), zzhVarZzu2.zzH()));
                    zzd();
                    if (jAbs > ((Long) zzfy.zzN.zzb(null)).longValue()) {
                        zzaV().zzj().zza("Fetching config for blocked app");
                        zzW(zzhVarZzu2);
                        return;
                    }
                    return;
                }
                return;
            }
            zzgv zzgvVarZza = zzgv.zza(zzbgVar);
            zzt().zzG(zzgvVarZza, zzd().zzd(str4));
            int iZzn = zzd().zzn(str4, zzfy.zzag, 10, 35);
            Bundle bundle = zzgvVarZza.zzd;
            for (String str6 : new TreeSet(bundle.keySet())) {
                if (FirebaseAnalytics.Param.ITEMS.equals(str6)) {
                    zzt().zzH(bundle.getParcelableArray(str6), iZzn);
                }
            }
            zzbg zzbgVarZzb = zzgvVarZza.zzb();
            if (Log.isLoggable(zzaV().zzn(), 2)) {
                zzaV().zzk().zzb("Logging event", this.zzn.zzl().zzd(zzbgVarZzb));
            }
            zzj().zzb();
            try {
                zzao(zzrVar);
                String str7 = zzbgVarZzb.zza;
                boolean z = "ecommerce_purchase".equals(str7) || FirebaseAnalytics.Event.PURCHASE.equals(str7) || FirebaseAnalytics.Event.REFUND.equals(str7);
                if ("_iap".equals(str7)) {
                    zzbe zzbeVar2 = zzbgVarZzb.zzb;
                    strZzd = zzbeVar2.zzd(FirebaseAnalytics.Param.CURRENCY);
                    if (z) {
                        str = HiAnalyticsConstant.BI_KEY_APP_ID;
                        str2 = "_fx";
                        jLongValue = zzbeVar2.zzb("value").longValue();
                    } else {
                        double dDoubleValue = zzbeVar2.zzc("value").doubleValue() * 1000000.0d;
                        if (dDoubleValue == 0.0d) {
                            Long lZzb = zzbeVar2.zzb("value");
                            str = HiAnalyticsConstant.BI_KEY_APP_ID;
                            str2 = "_fx";
                            dDoubleValue = lZzb.longValue() * 1000000.0d;
                        } else {
                            str = HiAnalyticsConstant.BI_KEY_APP_ID;
                            str2 = "_fx";
                        }
                        if (dDoubleValue > 9.223372036854776E18d || dDoubleValue < -9.223372036854776E18d) {
                            zzaV().zze().zzc("Data lost. Currency value is too big. appId", zzgu.zzl(str4), Double.valueOf(dDoubleValue));
                            zzj().zzc();
                        } else {
                            jLongValue = Math.round(dDoubleValue);
                            if (FirebaseAnalytics.Event.REFUND.equals(str7)) {
                                jLongValue = -jLongValue;
                            }
                        }
                    }
                    if (TextUtils.isEmpty(strZzd)) {
                        String upperCase = strZzd.toUpperCase(Locale.US);
                        if (upperCase.matches("[A-Z]{3}")) {
                            String strConcat = "_ltv_".concat(upperCase);
                            zzpn zzpnVarZzm2 = zzj().zzm(str4, strConcat);
                            if (zzpnVarZzm2 != null) {
                                Object obj = zzpnVarZzm2.zze;
                                if (obj instanceof Long) {
                                    zzbgVar2 = zzbgVarZzb;
                                    zzpnVar = new zzpn(str4, zzbgVarZzb.zzc, strConcat, zzaZ().currentTimeMillis(), Long.valueOf(((Long) obj).longValue() + jLongValue));
                                    str4 = str4;
                                } else {
                                    zzav zzavVarZzj = zzj();
                                    int iZzm = zzd().zzm(str4, zzfy.zzT) - 1;
                                    Preconditions.checkNotEmpty(str4);
                                    zzavVarZzj.zzg();
                                    zzavVarZzj.zzaw();
                                    try {
                                        zzavVarZzj.zze().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '!_ltv!_%' escape '!'order by set_timestamp desc limit ?,10);", new String[]{str4, str4, String.valueOf(iZzm)});
                                    } catch (SQLiteException e) {
                                        zzavVarZzj.zzu.zzaV().zzb().zzc("Error pruning currencies. appId", zzgu.zzl(str4), e);
                                    }
                                    zzbgVar2 = zzbgVarZzb;
                                    zzpnVar = new zzpn(str4, zzbgVarZzb.zzc, strConcat, zzaZ().currentTimeMillis(), Long.valueOf(jLongValue));
                                    str4 = str4;
                                }
                                zzpn zzpnVar2 = zzpnVar;
                                if (!zzj().zzl(zzpnVar2)) {
                                    zzaV().zzb().zzd("Too many unique user properties are set. Ignoring user property. appId", zzgu.zzl(str4), this.zzn.zzl().zzc(zzpnVar2.zzc), zzpnVar2.zze);
                                    zzt().zzN(this.zzK, str4, 9, null, null, 0);
                                }
                            }
                        } else {
                            zzbgVar2 = zzbgVarZzb;
                        }
                        String str8 = zzbgVar2.zza;
                        boolean zZzh = zzpp.zzh(str8);
                        boolean zEquals = "_err".equals(str8);
                        zzt();
                        zzbeVar = zzbgVar2.zzb;
                        if (zzbeVar != null) {
                            length = 0;
                        } else {
                            zzbd zzbdVar = new zzbd(zzbeVar);
                            length = 0;
                            while (zzbdVar.hasNext()) {
                                Object objZza = zzbeVar.zza(zzbdVar.next());
                                if (objZza instanceof Parcelable[]) {
                                    length += (long) ((Parcelable[]) objZza).length;
                                }
                            }
                        }
                        String str9 = str4;
                        zzbg zzbgVar3 = zzbgVar2;
                        zzar zzarVarZzx = zzj().zzx(zzC(), str9, length + 1, true, zZzh, false, zEquals, false, false, false);
                        long j2 = zzarVarZzx.zzb;
                        zzd();
                        jZzH = j2 - zzal.zzH();
                        if (jZzH <= 0) {
                            if (jZzH % 1000 == 1) {
                                zzaV().zzb().zzc("Data loss. Too many events logged. appId, count", zzgu.zzl(str9), Long.valueOf(zzarVarZzx.zzb));
                            }
                            zzj().zzc();
                        } else if (zZzh) {
                            long j3 = zzarVarZzx.zza;
                            zzd();
                            long jIntValue = j3 - ((long) ((Integer) zzfy.zzm.zzb(null)).intValue());
                            if (jIntValue <= 0) {
                                if (zEquals) {
                                    j = 1;
                                    r5 = 0;
                                    long jMax = zzarVarZzx.zzd - ((long) Math.max(0, Math.min(1000000, zzd().zzm(zzrVar.zza, zzfy.zzl))));
                                    if (jMax > 0) {
                                        if (jMax == 1) {
                                            zzaV().zzb().zzc("Too many error events logged. appId, count", zzgu.zzl(str9), Long.valueOf(zzarVarZzx.zzd));
                                        }
                                        zzj().zzc();
                                    }
                                } else {
                                    j = 1;
                                    r5 = 0;
                                }
                                Bundle bundleZzf = zzbeVar.zzf();
                                zzpp zzppVarZzt = zzt();
                                String str10 = zzbgVar3.zzc;
                                zzppVarZzt.zzM(bundleZzf, "_o", str10);
                                if (zzt().zzaa(str9, zzrVar.zzB)) {
                                    zzpp zzppVarZzt2 = zzt();
                                    Long lValueOf = Long.valueOf(j);
                                    zzppVarZzt2.zzM(bundleZzf, "_dbg", lValueOf);
                                    zzt().zzM(bundleZzf, "_r", lValueOf);
                                }
                                if ("_s".equals(str8) && (zzpnVarZzm = zzj().zzm(zzrVar.zza, "_sno")) != null) {
                                    Object obj2 = zzpnVarZzm.zze;
                                    if (obj2 instanceof Long) {
                                        zzt().zzM(bundleZzf, "_sno", obj2);
                                    }
                                }
                                if (zzd().zzp(null, zzfy.zzaX) && Objects.equals(str10, "am") && Objects.equals(str8, "_ai")) {
                                    Object obj3 = bundleZzf.get("value");
                                    if (obj3 instanceof String) {
                                        try {
                                            double d = Double.parseDouble((String) obj3);
                                            bundleZzf.remove("value");
                                            bundleZzf.putDouble("value", d);
                                        } catch (NumberFormatException unused) {
                                        }
                                    }
                                }
                                zzav zzavVarZzj2 = zzj();
                                Preconditions.checkNotEmpty(str9);
                                zzavVarZzj2.zzg();
                                zzavVarZzj2.zzaw();
                                try {
                                    jDelete = zzavVarZzj2.zze().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str9, String.valueOf(Math.max((int) r5, Math.min(1000000, zzavVarZzj2.zzu.zzc().zzm(str9, zzfy.zzp))))});
                                } catch (SQLiteException e2) {
                                    zzavVarZzj2.zzu.zzaV().zzb().zzc("Error deleting over the limit events. appId", zzgu.zzl(str9), e2);
                                    jDelete = 0;
                                }
                                if (jDelete > 0) {
                                    zzaV().zze().zzc("Data lost. Too many events stored on disk, deleted. appId", zzgu.zzl(str9), Long.valueOf(jDelete));
                                }
                                zzic zzicVar = this.zzn;
                                zzbb zzbbVar2 = new zzbb(zzicVar, zzbgVar3.zzc, str9, zzbgVar3.zza, zzbgVar3.zzd, 0L, bundleZzf);
                                zzav zzavVarZzj3 = zzj();
                                String str11 = zzbbVar2.zzb;
                                zzbc zzbcVarZzf = zzavVarZzj3.zzf(str9, str11);
                                if (zzbcVarZzf != null) {
                                    zzbb zzbbVarZza = zzbbVar2.zza(zzicVar, zzbcVarZzf.zzf);
                                    zzbc zzbcVarZza = zzbcVarZzf.zza(zzbbVarZza.zzd);
                                    zzbbVar = zzbbVarZza;
                                    zzbcVar = zzbcVarZza;
                                } else if (zzj().zzS(str9) < zzd().zzh(str9) || !zZzh) {
                                    zzbcVar = new zzbc(str9, str11, 0L, 0L, 0L, zzbbVar2.zzd, 0L, null, null, null, null);
                                    zzbbVar = zzbbVar2;
                                } else {
                                    zzaV().zzb().zzd("Too many event names used, ignoring event. appId, name, supported count", zzgu.zzl(str9), zzicVar.zzl().zza(str11), Integer.valueOf(zzd().zzh(str9)));
                                    zzt().zzN(this.zzK, str9, 8, null, null, 0);
                                }
                                zzj().zzh(zzbcVar);
                                zzaW().zzg();
                                zzu();
                                Preconditions.checkNotNull(zzbbVar);
                                Preconditions.checkNotNull(zzrVar);
                                String str12 = zzbbVar.zza;
                                Preconditions.checkNotEmpty(str12);
                                String str13 = zzrVar.zza;
                                Preconditions.checkArgument(str12.equals(str13));
                                com.google.android.gms.internal.measurement.zzic zzicVarZzaE = com.google.android.gms.internal.measurement.zzid.zzaE();
                                zzicVarZzaE.zza(1);
                                zzicVarZzaE.zzC(TelemetryEventStrings.C18741Os.OS_NAME);
                                if (!TextUtils.isEmpty(str13)) {
                                    zzicVarZzaE.zzL(str13);
                                }
                                String str14 = zzrVar.zzd;
                                if (!TextUtils.isEmpty(str14)) {
                                    zzicVarZzaE.zzJ(str14);
                                }
                                String str15 = zzrVar.zzc;
                                if (!TextUtils.isEmpty(str15)) {
                                    zzicVarZzaE.zzM(str15);
                                }
                                String str16 = zzrVar.zzu;
                                if (!TextUtils.isEmpty(str16)) {
                                    zzicVarZzaE.zzau(str16);
                                }
                                long j4 = zzrVar.zzj;
                                if (j4 != -2147483648L) {
                                    zzicVarZzaE.zzaj((int) j4);
                                }
                                zzicVarZzaE.zzN(zzrVar.zze);
                                String str17 = zzrVar.zzb;
                                if (!TextUtils.isEmpty(str17)) {
                                    zzicVarZzaE.zzad(str17);
                                }
                                zzjl zzjlVarZzs = zzB((String) Preconditions.checkNotNull(str13)).zzs(zzjl.zzf(zzrVar.zzs, 100));
                                zzicVarZzaE.zzat(zzjlVarZzs.zzk());
                                zzqp.zza();
                                if (zzd().zzp(str13, zzfy.zzaP) && zzt().zzX(str13)) {
                                    zzicVarZzaE.zzaH(zzrVar.zzz);
                                    long j5 = zzrVar.zzA;
                                    if (!zzjlVarZzs.zzo(zzjk.AD_STORAGE) && j5 != 0) {
                                        j5 = (j5 & (-2)) | 32;
                                    }
                                    zzicVarZzaE.zzaz(j5 == j ? 1 : r5);
                                    if (j5 != 0) {
                                        com.google.android.gms.internal.measurement.zzhd zzhdVarZzh = com.google.android.gms.internal.measurement.zzhe.zzh();
                                        zzhdVarZzh.zza((j5 & j) != 0 ? 1 : r5);
                                        zzhdVarZzh.zzb((j5 & 2) != 0 ? 1 : r5);
                                        zzhdVarZzh.zzc((j5 & 4) != 0 ? 1 : r5);
                                        zzhdVarZzh.zzd((j5 & 8) != 0 ? 1 : r5);
                                        zzhdVarZzh.zze((j5 & 16) != 0 ? 1 : r5);
                                        zzhdVarZzh.zzf((32 & j5) != 0 ? 1 : r5);
                                        zzhdVarZzh.zzg((j5 & 64) != 0 ? 1 : r5);
                                        zzicVarZzaE.zzaI((com.google.android.gms.internal.measurement.zzhe) zzhdVarZzh.zzbc());
                                    }
                                }
                                long j6 = zzrVar.zzf;
                                if (j6 != 0) {
                                    zzicVarZzaE.zzY(j6);
                                }
                                zzicVarZzaE.zzar(zzrVar.zzq);
                                zzpk zzpkVarZzp = zzp();
                                com.google.android.gms.internal.measurement.zzjr zzjrVarZza = com.google.android.gms.internal.measurement.zzjr.zza(zzpkVarZzp.zzg.zzn.zzaY().getContentResolver(), com.google.android.gms.internal.measurement.zzkb.zza("com.google.android.gms.measurement"), zzfu.zza);
                                Map mapZzb = zzjrVarZza == null ? Collections.EMPTY_MAP : zzjrVarZza.zzb();
                                if (mapZzb == null || mapZzb.isEmpty()) {
                                    arrayList = null;
                                } else {
                                    arrayList = new ArrayList();
                                    int iIntValue = ((Integer) zzfy.zzaf.zzb(null)).intValue();
                                    for (Map.Entry entry : mapZzb.entrySet()) {
                                        if (((String) entry.getKey()).startsWith("measurement.id.")) {
                                            try {
                                                int i3 = Integer.parseInt((String) entry.getValue());
                                                if (i3 != 0) {
                                                    arrayList.add(Integer.valueOf(i3));
                                                    if (arrayList.size() >= iIntValue) {
                                                        zzpkVarZzp.zzu.zzaV().zze().zzb("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                                                        break;
                                                    }
                                                    continue;
                                                } else {
                                                    continue;
                                                }
                                            } catch (NumberFormatException e3) {
                                                zzpkVarZzp.zzu.zzaV().zze().zzb("Experiment ID NumberFormatException", e3);
                                            }
                                        }
                                    }
                                    if (arrayList.isEmpty()) {
                                        arrayList = null;
                                    }
                                }
                                if (arrayList != null) {
                                    zzicVarZzaE.zzaq(arrayList);
                                }
                                if (zzd().zzp(null, zzfy.zzba)) {
                                    zzicVarZzaE.zzaP("");
                                }
                                String str18 = zzrVar.zza;
                                zzjl zzjlVarZzs2 = zzB((String) Preconditions.checkNotNull(str18)).zzs(zzjl.zzf(zzrVar.zzs, 100));
                                zzjk zzjkVar2 = zzjk.AD_STORAGE;
                                if (zzjlVarZzs2.zzo(zzjkVar2) && zzrVar.zzn) {
                                    Pair pairZzc = this.zzk.zzc(str18, zzjlVarZzs2);
                                    if (!TextUtils.isEmpty((CharSequence) pairZzc.first)) {
                                        zzicVarZzaE.zzQ((String) pairZzc.first);
                                        Object obj4 = pairZzc.second;
                                        if (obj4 != null) {
                                            zzicVarZzaE.zzT(((Boolean) obj4).booleanValue());
                                        }
                                        String str19 = str2;
                                        if (!zzbbVar.zzb.equals(str19) && !((String) pairZzc.first).equals("00000000-0000-0000-0000-000000000000") && (zzhVarZzu = zzj().zzu(str18)) != null && zzhVarZzu.zzaq()) {
                                            zzR(str18, r5, null, null);
                                            Bundle bundle2 = new Bundle();
                                            Long lZzas = zzhVarZzu.zzas();
                                            if (lZzas != null) {
                                                str3 = "raw_events";
                                                long jLongValue2 = lZzas.longValue();
                                                zzjkVar = zzjkVar2;
                                                bundle2.putLong("_pfo", Math.max(0L, jLongValue2));
                                            } else {
                                                str3 = "raw_events";
                                                zzjkVar = zzjkVar2;
                                            }
                                            Long lZzau = zzhVarZzu.zzau();
                                            if (lZzau != null) {
                                                bundle2.putLong("_uwa", lZzau.longValue());
                                            }
                                            bundle2.putLong("_r", j);
                                            this.zzK.zza(str18, str19, bundle2);
                                        }
                                    }
                                } else {
                                    str3 = "raw_events";
                                    zzjkVar = zzjkVar2;
                                }
                                zzic zzicVar2 = this.zzn;
                                zzicVar2.zzu().zzw();
                                zzicVarZzaE.zzF(Build.MODEL);
                                zzicVar2.zzu().zzw();
                                zzicVarZzaE.zzE(Build.VERSION.RELEASE);
                                zzicVarZzaE.zzI((int) zzicVar2.zzu().zzb());
                                zzicVarZzaE.zzH(zzicVar2.zzu().zzc());
                                zzicVarZzaE.zzay(zzrVar.zzw);
                                if (zzicVar2.zzB()) {
                                    zzicVarZzaE.zzK();
                                    if (!TextUtils.isEmpty(null)) {
                                        zzicVarZzaE.zzam(null);
                                    }
                                }
                                zzh zzhVarZzu3 = zzj().zzu(str18);
                                if (zzhVarZzu3 == null) {
                                    zzhVarZzu3 = new zzh(zzicVar2, str18);
                                    zzhVarZzu3.zze(zzK(zzjlVarZzs2));
                                    zzhVarZzu3.zzm(zzrVar.zzk);
                                    zzhVarZzu3.zzg(zzrVar.zzb);
                                    if (zzjlVarZzs2.zzo(zzjkVar)) {
                                        zzhVarZzu3.zzk(this.zzk.zzf(str18, zzrVar.zzn));
                                    }
                                    zzhVarZzu3.zzF(0L);
                                    zzhVarZzu3.zzo(0L);
                                    zzhVarZzu3.zzq(0L);
                                    zzhVarZzu3.zzs(zzrVar.zzc);
                                    zzhVarZzu3.zzu(zzrVar.zzj);
                                    zzhVarZzu3.zzw(zzrVar.zzd);
                                    zzhVarZzu3.zzy(zzrVar.zze);
                                    zzhVarZzu3.zzA(zzrVar.zzf);
                                    zzhVarZzu3.zzE(zzrVar.zzh);
                                    zzhVarZzu3.zzC(zzrVar.zzq);
                                    i = 0;
                                    zzj().zzv(zzhVarZzu3, false, false);
                                } else {
                                    i = 0;
                                }
                                if (zzjlVarZzs2.zzo(zzjk.ANALYTICS_STORAGE) && !TextUtils.isEmpty(zzhVarZzu3.zzd())) {
                                    zzicVarZzaE.zzW((String) Preconditions.checkNotNull(zzhVarZzu3.zzd()));
                                }
                                if (!TextUtils.isEmpty(zzhVarZzu3.zzl())) {
                                    zzicVarZzaE.zzah((String) Preconditions.checkNotNull(zzhVarZzu3.zzl()));
                                }
                                List listZzn = zzj().zzn(str18);
                                for (int i4 = i; i4 < listZzn.size(); i4++) {
                                    com.google.android.gms.internal.measurement.zzit zzitVarZzm = com.google.android.gms.internal.measurement.zziu.zzm();
                                    zzitVarZzm.zzb(((zzpn) listZzn.get(i4)).zzc);
                                    zzitVarZzm.zza(((zzpn) listZzn.get(i4)).zzd);
                                    zzp().zzc(zzitVarZzm, ((zzpn) listZzn.get(i4)).zze);
                                    zzicVarZzaE.zzp(zzitVarZzm);
                                    if ("_sid".equals(((zzpn) listZzn.get(i4)).zzc) && zzhVarZzu3.zzam() != 0 && zzp().zzu(zzrVar.zzu) != zzhVarZzu3.zzam()) {
                                        zzicVarZzaE.zzav();
                                    }
                                }
                                try {
                                    zzav zzavVarZzj4 = zzj();
                                    com.google.android.gms.internal.measurement.zzid zzidVar = (com.google.android.gms.internal.measurement.zzid) zzicVarZzaE.zzbc();
                                    zzavVarZzj4.zzg();
                                    zzavVarZzj4.zzaw();
                                    Preconditions.checkNotNull(zzidVar);
                                    Preconditions.checkNotEmpty(zzidVar.zzA());
                                    byte[] bArrZzcc = zzidVar.zzcc();
                                    long jZzt = zzavVarZzj4.zzg.zzp().zzt(bArrZzcc);
                                    ContentValues contentValues = new ContentValues();
                                    String str20 = str;
                                    contentValues.put(str20, zzidVar.zzA());
                                    contentValues.put("metadata_fingerprint", Long.valueOf(jZzt));
                                    contentValues.put("metadata", bArrZzcc);
                                    try {
                                        zzavVarZzj4.zze().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
                                        zzav zzavVarZzj5 = zzj();
                                        zzbd zzbdVar2 = new zzbd(zzbbVar.zzf);
                                        while (true) {
                                            if (zzbdVar2.hasNext()) {
                                                if ("_r".equals(zzbdVar2.next())) {
                                                    break;
                                                }
                                            } else {
                                                zzht zzhtVarZzh2 = zzh();
                                                String str21 = zzbbVar.zza;
                                                boolean zZzk = zzhtVarZzh2.zzk(str21, zzbbVar.zzb);
                                                zzar zzarVarZzw = zzj().zzw(zzC(), str21, false, false, false, false, false, false, false);
                                                if (!zZzk || zzarVarZzw.zze >= zzd().zzm(str21, zzfy.zzo)) {
                                                    i2 = i;
                                                }
                                            }
                                        }
                                        i2 = 1;
                                        zzavVarZzj5.zzg();
                                        zzavVarZzj5.zzaw();
                                        Preconditions.checkNotNull(zzbbVar);
                                        String str22 = zzbbVar.zza;
                                        Preconditions.checkNotEmpty(str22);
                                        byte[] bArrZzcc2 = zzavVarZzj5.zzg.zzp().zzh(zzbbVar).zzcc();
                                        ContentValues contentValues2 = new ContentValues();
                                        contentValues2.put(str20, str22);
                                        contentValues2.put("name", zzbbVar.zzb);
                                        contentValues2.put("timestamp", Long.valueOf(zzbbVar.zzd));
                                        contentValues2.put("metadata_fingerprint", Long.valueOf(jZzt));
                                        contentValues2.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, bArrZzcc2);
                                        contentValues2.put("realtime", Integer.valueOf(i2));
                                        try {
                                            if (zzavVarZzj5.zze().insert(str3, null, contentValues2) == -1) {
                                                zzavVarZzj5.zzu.zzaV().zzb().zzb("Failed to insert raw event (got -1). appId", zzgu.zzl(str22));
                                            } else {
                                                this.zza = 0L;
                                            }
                                        } catch (SQLiteException e4) {
                                            zzavVarZzj5.zzu.zzaV().zzb().zzc("Error storing raw event. appId", zzgu.zzl(zzbbVar.zza), e4);
                                        }
                                    } catch (SQLiteException e5) {
                                        zzavVarZzj4.zzu.zzaV().zzb().zzc("Error storing raw event metadata. appId", zzgu.zzl(zzidVar.zzA()), e5);
                                        throw e5;
                                    }
                                } catch (IOException e6) {
                                    zzaV().zzb().zzc("Data loss. Failed to insert raw event metadata. appId", zzgu.zzl(zzicVarZzaE.zzK()), e6);
                                }
                                zzj().zzc();
                                zzj().zzd();
                                zzaL();
                                zzaV().zzk().zzb("Background event processing time, ms", Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000));
                                return;
                            }
                            if (jIntValue % 1000 == 1) {
                                zzaV().zzb().zzc("Data loss. Too many public events logged. appId, count", zzgu.zzl(str9), Long.valueOf(zzarVarZzx.zza));
                            }
                            zzt().zzN(this.zzK, str9, 16, "_ev", zzbgVar3.zza, 0);
                            zzj().zzc();
                        }
                    }
                } else if (z) {
                    z = true;
                    zzbe zzbeVar22 = zzbgVarZzb.zzb;
                    strZzd = zzbeVar22.zzd(FirebaseAnalytics.Param.CURRENCY);
                    if (z) {
                    }
                    if (TextUtils.isEmpty(strZzd)) {
                    }
                } else {
                    str = HiAnalyticsConstant.BI_KEY_APP_ID;
                    str2 = "_fx";
                    zzbgVar2 = zzbgVarZzb;
                    String str82 = zzbgVar2.zza;
                    boolean zZzh2 = zzpp.zzh(str82);
                    boolean zEquals2 = "_err".equals(str82);
                    zzt();
                    zzbeVar = zzbgVar2.zzb;
                    if (zzbeVar != null) {
                    }
                    String str92 = str4;
                    zzbg zzbgVar32 = zzbgVar2;
                    zzar zzarVarZzx2 = zzj().zzx(zzC(), str92, length + 1, true, zZzh2, false, zEquals2, false, false, false);
                    long j22 = zzarVarZzx2.zzb;
                    zzd();
                    jZzH = j22 - zzal.zzH();
                    if (jZzH <= 0) {
                    }
                }
                zzj().zzd();
            } catch (Throwable th) {
                zzj().zzd();
                throw th;
            }
        }
    }

    public final void zzI(zzh zzhVar, com.google.android.gms.internal.measurement.zzic zzicVar) {
        com.google.android.gms.internal.measurement.zziu zziuVar;
        zzaW().zzg();
        zzu();
        zzan zzanVarZzd = zzan.zzd(zzicVar.zzaA());
        String strZzc = zzhVar.zzc();
        zzaW().zzg();
        zzu();
        zzjl zzjlVarZzB = zzB(strZzc);
        zzji zzjiVar = zzji.UNINITIALIZED;
        int iOrdinal = zzjlVarZzB.zzp().ordinal();
        if (iOrdinal == 1) {
            zzanVarZzd.zzc(zzjk.AD_STORAGE, zzam.REMOTE_ENFORCED_DEFAULT);
        } else if (iOrdinal == 2 || iOrdinal == 3) {
            zzanVarZzd.zzb(zzjk.AD_STORAGE, zzjlVarZzB.zzb());
        } else {
            zzanVarZzd.zzc(zzjk.AD_STORAGE, zzam.FAILSAFE);
        }
        int iOrdinal2 = zzjlVarZzB.zzq().ordinal();
        if (iOrdinal2 == 1) {
            zzanVarZzd.zzc(zzjk.ANALYTICS_STORAGE, zzam.REMOTE_ENFORCED_DEFAULT);
        } else if (iOrdinal2 == 2 || iOrdinal2 == 3) {
            zzanVarZzd.zzb(zzjk.ANALYTICS_STORAGE, zzjlVarZzB.zzb());
        } else {
            zzanVarZzd.zzc(zzjk.ANALYTICS_STORAGE, zzam.FAILSAFE);
        }
        String strZzc2 = zzhVar.zzc();
        zzaW().zzg();
        zzu();
        zzaz zzazVarZzz = zzz(strZzc2, zzx(strZzc2), zzB(strZzc2), zzanVarZzd);
        zzicVar.zzaD(((Boolean) Preconditions.checkNotNull(zzazVarZzz.zzj())).booleanValue());
        if (!TextUtils.isEmpty(zzazVarZzz.zzk())) {
            zzicVar.zzaF(zzazVarZzz.zzk());
        }
        zzaW().zzg();
        zzu();
        Iterator it = zzicVar.zzk().iterator();
        while (true) {
            if (it.hasNext()) {
                zziuVar = (com.google.android.gms.internal.measurement.zziu) it.next();
                if ("_npa".equals(zziuVar.zzc())) {
                    break;
                }
            } else {
                zziuVar = null;
                break;
            }
        }
        if (zziuVar != null) {
            zzjk zzjkVar = zzjk.AD_PERSONALIZATION;
            if (zzanVarZzd.zza(zzjkVar) == zzam.UNSET) {
                zzpn zzpnVarZzm = zzj().zzm(zzhVar.zzc(), "_npa");
                if (zzpnVarZzm != null) {
                    String str = zzpnVarZzm.zzb;
                    if ("tcf".equals(str)) {
                        zzanVarZzd.zzc(zzjkVar, zzam.TCF);
                    } else if ("app".equals(str)) {
                        zzanVarZzd.zzc(zzjkVar, zzam.API);
                    } else {
                        zzanVarZzd.zzc(zzjkVar, zzam.MANIFEST);
                    }
                } else {
                    Boolean boolZzae = zzhVar.zzae();
                    if (boolZzae == null || ((boolZzae.booleanValue() && zziuVar.zzg() != 1) || !(boolZzae.booleanValue() || zziuVar.zzg() == 0))) {
                        zzanVarZzd.zzc(zzjkVar, zzam.API);
                    } else {
                        zzanVarZzd.zzc(zzjkVar, zzam.MANIFEST);
                    }
                }
            }
        } else {
            int iZzaC = zzaC(zzhVar.zzc(), zzanVarZzd);
            com.google.android.gms.internal.measurement.zzit zzitVarZzm = com.google.android.gms.internal.measurement.zziu.zzm();
            zzitVarZzm.zzb("_npa");
            zzitVarZzm.zza(zzaZ().currentTimeMillis());
            zzitVarZzm.zze(iZzaC);
            zzicVar.zzo((com.google.android.gms.internal.measurement.zziu) zzitVarZzm.zzbc());
            zzaV().zzk().zzc("Setting user property", "non_personalized_ads(_npa)", Integer.valueOf(iZzaC));
        }
        zzicVar.zzaB(zzanVarZzd.toString());
        boolean zZzy = this.zzc.zzy(zzhVar.zzc());
        List listZzb = zzicVar.zzb();
        int i = 0;
        for (int i2 = 0; i2 < listZzb.size(); i2++) {
            if ("_tcf".equals(((com.google.android.gms.internal.measurement.zzhs) listZzb.get(i2)).zzd())) {
                com.google.android.gms.internal.measurement.zzhr zzhrVar = (com.google.android.gms.internal.measurement.zzhr) ((com.google.android.gms.internal.measurement.zzhs) listZzb.get(i2)).zzcl();
                List listZza = zzhrVar.zza();
                int i3 = 0;
                while (true) {
                    if (i3 >= listZza.size()) {
                        break;
                    }
                    if ("_tcfd".equals(((com.google.android.gms.internal.measurement.zzhw) listZza.get(i3)).zzb())) {
                        String strZzd = ((com.google.android.gms.internal.measurement.zzhw) listZza.get(i3)).zzd();
                        if (zZzy && strZzd.length() > 4) {
                            char[] charArray = strZzd.toCharArray();
                            int i4 = 1;
                            while (true) {
                                if (i4 >= 64) {
                                    break;
                                }
                                if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i4)) {
                                    i = i4;
                                    break;
                                }
                                i4++;
                            }
                            charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(1 | i);
                            strZzd = String.valueOf(charArray);
                        }
                        com.google.android.gms.internal.measurement.zzhv zzhvVarZzn = com.google.android.gms.internal.measurement.zzhw.zzn();
                        zzhvVarZzn.zzb("_tcfd");
                        zzhvVarZzn.zzd(strZzd);
                        zzhrVar.zze(i3, zzhvVarZzn);
                    } else {
                        i3++;
                    }
                }
                zzicVar.zzf(i2, zzhrVar);
                return;
            }
        }
    }

    public final void zzJ(zzh zzhVar, com.google.android.gms.internal.measurement.zzic zzicVar) {
        zzaW().zzg();
        zzu();
        com.google.android.gms.internal.measurement.zzgx zzgxVarZzr = com.google.android.gms.internal.measurement.zzha.zzr();
        byte[] bArrZzaJ = zzhVar.zzaJ();
        if (bArrZzaJ != null) {
            try {
                zzgxVarZzr = (com.google.android.gms.internal.measurement.zzgx) zzpk.zzw(zzgxVarZzr, bArrZzaJ);
            } catch (com.google.android.gms.internal.measurement.zzmr unused) {
                zzaV().zze().zzb("Failed to parse locally stored ad campaign info. appId", zzgu.zzl(zzhVar.zzc()));
            }
        }
        for (com.google.android.gms.internal.measurement.zzhs zzhsVar : zzicVar.zzb()) {
            if (zzhsVar.zzd().equals(Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN)) {
                String str = (String) zzpk.zzJ(zzhsVar, "gclid", "");
                String str2 = (String) zzpk.zzJ(zzhsVar, "gbraid", "");
                String str3 = (String) zzpk.zzJ(zzhsVar, "gad_source", "");
                String[] strArrSplit = ((String) zzfy.zzbg.zzb(null)).split(",");
                zzp();
                if (!zzpk.zzG(zzhsVar, strArrSplit).isEmpty()) {
                    long jLongValue = ((Long) zzpk.zzJ(zzhsVar, "click_timestamp", 0L)).longValue();
                    if (jLongValue <= 0) {
                        jLongValue = zzhsVar.zzf();
                    }
                    if ("referrer API v2".equals(zzpk.zzI(zzhsVar, "_cis"))) {
                        if (jLongValue > zzgxVarZzr.zzo()) {
                            if (str.isEmpty()) {
                                zzgxVarZzr.zzj();
                            } else {
                                zzgxVarZzr.zzi(str);
                            }
                            if (str2.isEmpty()) {
                                zzgxVarZzr.zzl();
                            } else {
                                zzgxVarZzr.zzk(str2);
                            }
                            if (str3.isEmpty()) {
                                zzgxVarZzr.zzn();
                            } else {
                                zzgxVarZzr.zzm(str3);
                            }
                            zzgxVarZzr.zzp(jLongValue);
                            zzgxVarZzr.zzs();
                            zzgxVarZzr.zzt(zzaD(zzhsVar));
                        }
                    } else if (jLongValue > zzgxVarZzr.zzg()) {
                        if (str.isEmpty()) {
                            zzgxVarZzr.zzb();
                        } else {
                            zzgxVarZzr.zza(str);
                        }
                        if (str2.isEmpty()) {
                            zzgxVarZzr.zzd();
                        } else {
                            zzgxVarZzr.zzc(str2);
                        }
                        if (str3.isEmpty()) {
                            zzgxVarZzr.zzf();
                        } else {
                            zzgxVarZzr.zze(str3);
                        }
                        zzgxVarZzr.zzh(jLongValue);
                        zzgxVarZzr.zzq();
                        zzgxVarZzr.zzr(zzaD(zzhsVar));
                    }
                }
            }
        }
        if (!((com.google.android.gms.internal.measurement.zzha) zzgxVarZzr.zzbc()).equals(com.google.android.gms.internal.measurement.zzha.zzs())) {
            zzicVar.zzaM((com.google.android.gms.internal.measurement.zzha) zzgxVarZzr.zzbc());
        }
        zzhVar.zzaI(((com.google.android.gms.internal.measurement.zzha) zzgxVarZzr.zzbc()).zzcc());
        if (zzhVar.zza()) {
            zzj().zzv(zzhVar, false, false);
        }
        if (zzd().zzp(null, zzfy.zzbf)) {
            zzj().zzk(zzhVar.zzc(), "_lgclid");
        }
    }

    public final String zzK(zzjl zzjlVar) {
        if (!zzjlVar.zzo(zzjk.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        zzt().zzf().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final void zzL(List list) {
        Preconditions.checkArgument(!list.isEmpty());
        if (this.zzz != null) {
            zzaV().zzb().zza("Set uploading progress before finishing the previous upload");
        } else {
            this.zzz = new ArrayList(list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.google.android.gms.measurement.internal.zzpg] */
    /* JADX WARN: Type inference failed for: r1v12, types: [long] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v22, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v25, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.database.Cursor] */
    public final void zzM() {
        zzav zzavVarZzj;
        long jZzF;
        SQLiteException e;
        zzh zzhVarZzu;
        zzaW().zzg();
        zzu();
        this.zzw = true;
        try {
            zzic zzicVar = this.zzn;
            zzicVar.zzaU();
            Boolean boolZzJ = zzicVar.zzt().zzJ();
            if (boolZzJ == null) {
                zzaV().zze().zza("Upload data called on the client side before use of service was decided");
            } else if (boolZzJ.booleanValue()) {
                zzaV().zzb().zza("Upload called in the client side when service should be used");
            } else if (this.zza > 0) {
                zzaL();
            } else {
                zzaW().zzg();
                if (this.zzz != null) {
                    zzaV().zzk().zza("Uploading requested multiple times");
                } else if (zzi().zzb()) {
                    ?? CurrentTimeMillis = zzaZ().currentTimeMillis();
                    ?? r7 = 0;
                    cursorRawQuery = null;
                    Cursor cursorRawQuery = null;
                    string = null;
                    string = null;
                    String string = null;
                    int iZzm = zzd().zzm(null, zzfy.zzai);
                    zzd();
                    long jZzF2 = CurrentTimeMillis - zzal.zzF();
                    for (int i = 0; i < iZzm && zzaG(null, jZzF2); i++) {
                    }
                    zzqp.zza();
                    zzaW().zzg();
                    zzav();
                    long jZza = this.zzk.zzd.zza();
                    if (jZza != 0) {
                        zzaV().zzj().zzb("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(CurrentTimeMillis - jZza)));
                    }
                    String strZzF = zzj().zzF();
                    long j = -1;
                    if (TextUtils.isEmpty(strZzF)) {
                        try {
                            this.zzB = -1L;
                            zzavVarZzj = zzj();
                            zzd();
                            jZzF = CurrentTimeMillis - zzal.zzF();
                            zzavVarZzj.zzg();
                            zzavVarZzj.zzaw();
                        } catch (Throwable th) {
                            th = th;
                            r7 = CurrentTimeMillis;
                        }
                        try {
                            CurrentTimeMillis = zzavVarZzj.zze().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(jZzF)});
                            try {
                                if (CurrentTimeMillis.moveToFirst()) {
                                    string = CurrentTimeMillis.getString(0);
                                } else {
                                    zzavVarZzj.zzu.zzaV().zzk().zza("No expired configs for apps with pending events");
                                }
                            } catch (SQLiteException e2) {
                                e = e2;
                                zzavVarZzj.zzu.zzaV().zzb().zzb("Error selecting expired configs", e);
                                if (CurrentTimeMillis != 0) {
                                }
                                if (!TextUtils.isEmpty(string)) {
                                    zzW(zzhVarZzu);
                                }
                                this.zzw = false;
                                zzaM();
                            }
                        } catch (SQLiteException e3) {
                            e = e3;
                            CurrentTimeMillis = 0;
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                        CurrentTimeMillis.close();
                        if (!TextUtils.isEmpty(string) && (zzhVarZzu = zzj().zzu(string)) != null) {
                            zzW(zzhVarZzu);
                        }
                    } else {
                        if (this.zzB == -1) {
                            zzav zzavVarZzj2 = zzj();
                            try {
                                try {
                                    cursorRawQuery = zzavVarZzj2.zze().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                                    if (cursorRawQuery.moveToFirst()) {
                                        j = cursorRawQuery.getLong(0);
                                    }
                                } finally {
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                }
                            } catch (SQLiteException e4) {
                                zzavVarZzj2.zzu.zzaV().zzb().zzb("Error querying raw events", e4);
                                if (cursorRawQuery != null) {
                                }
                                this.zzB = j;
                                zzN(strZzF, CurrentTimeMillis);
                                this.zzw = false;
                                zzaM();
                            }
                            cursorRawQuery.close();
                            this.zzB = j;
                        }
                        zzN(strZzF, CurrentTimeMillis);
                    }
                } else {
                    zzaV().zzk().zza("Network not connected, ignoring upload request");
                    zzaL();
                }
            }
            this.zzw = false;
            zzaM();
        } catch (Throwable th3) {
            this.zzw = false;
            zzaM();
            throw th3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00be, code lost:
    
        r22 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x045e A[PHI: r10 r16 r23
      0x045e: PHI (r10v39 java.util.List) = (r10v75 java.util.List), (r10v76 java.util.List) binds: [B:184:0x0484, B:176:0x045c] A[DONT_GENERATE, DONT_INLINE]
      0x045e: PHI (r16v7 java.util.List) = (r16v18 java.util.List), (r16v19 java.util.List) binds: [B:184:0x0484, B:176:0x045c] A[DONT_GENERATE, DONT_INLINE]
      0x045e: PHI (r23v12 android.database.Cursor) = (r23v18 android.database.Cursor), (r23v22 android.database.Cursor) binds: [B:184:0x0484, B:176:0x045c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b A[PHI: r0 r10 r23
      0x006b: PHI (r0v117 java.util.List) = (r0v8 java.util.List), (r0v141 java.util.List) binds: [B:108:0x022a, B:16:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x006b: PHI (r10v57 android.database.Cursor) = (r10v5 android.database.Cursor), (r10v59 android.database.Cursor) binds: [B:108:0x022a, B:16:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x006b: PHI (r23v28 long) = (r23v2 long), (r23v29 long) binds: [B:108:0x022a, B:16:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x07cb  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x07fb  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x080c  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0822 A[LOOP:7: B:336:0x081c->B:338:0x0822, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:341:0x084d  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0850  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0865  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0941  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0944  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x09b0  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0a0b  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x07e0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:471:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzN(String str, long j) throws Throwable {
        long j2;
        Cursor cursor;
        Cursor cursorQuery;
        List list;
        List<Pair> list2;
        List listSubList;
        Iterator it;
        String string;
        String strZzc;
        Iterator it2;
        Object objZzi;
        zzot zzotVar;
        boolean z;
        List list3;
        boolean z2;
        int i;
        String strZzG;
        List list4;
        List list5;
        Cursor cursor2;
        Cursor cursor3;
        List list6;
        List list7;
        List list8;
        List list9;
        Iterator it3;
        List list10;
        int i2;
        int i3;
        SQLiteDatabase sQLiteDatabaseZze;
        long jCurrentTimeMillis;
        Cursor cursorQuery2;
        Cursor cursor4;
        byte[] blob;
        zzpk zzpkVarZzp;
        com.google.android.gms.internal.measurement.zzid zzidVar;
        long jZzg;
        long j3;
        long jZzg2;
        int iZzm = zzd().zzm(str, zzfy.zzg);
        int i4 = 0;
        int iMax = Math.max(0, zzd().zzm(str, zzfy.zzh));
        zzav zzavVarZzj = zzj();
        zzavVarZzj.zzg();
        zzavVarZzj.zzaw();
        int i5 = 1;
        Preconditions.checkArgument(iZzm > 0);
        Preconditions.checkArgument(iMax > 0);
        Preconditions.checkNotEmpty(str);
        try {
            try {
                j2 = -1;
                try {
                    cursorQuery = zzavVarZzj.zze().query("queue", new String[]{"rowid", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(iZzm));
                    try {
                    } catch (SQLiteException e) {
                        e = e;
                        cursor4 = cursorQuery;
                    } catch (Throwable th) {
                        th = th;
                        cursor4 = cursorQuery;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    cursorQuery = null;
                    try {
                        zzavVarZzj.zzu.zzaV().zzb().zzc("Error querying bundles. appId", zzgu.zzl(str), e);
                        list = Collections.EMPTY_LIST;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        list2 = list;
                        if (list2.isEmpty()) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                cursor = null;
            }
        } catch (SQLiteException e3) {
            e = e3;
            j2 = -1;
        }
        if (!cursorQuery.moveToFirst()) {
            list = Collections.EMPTY_LIST;
            cursorQuery.close();
            list2 = list;
            if (list2.isEmpty()) {
                return;
            }
            com.google.android.gms.internal.measurement.zzpo.zza();
            zzal zzalVarZzd = zzd();
            zzfx zzfxVar = zzfy.zzbh;
            if (zzalVarZzd.zzp(null, zzfxVar)) {
                com.google.android.gms.internal.measurement.zzpo.zza();
                if (!zzd().zzp(null, zzfxVar)) {
                    list4 = list2;
                } else if (zzB(str).zzo(zzjk.ANALYTICS_STORAGE) || !zzh().zzB(str)) {
                    ArrayList arrayList = new ArrayList(list2.size());
                    zzav zzavVarZzj2 = zzj();
                    Preconditions.checkNotEmpty(str);
                    zzavVarZzj2.zzg();
                    zzavVarZzj2.zzaw();
                    ArrayList arrayList2 = new ArrayList();
                    try {
                        try {
                            sQLiteDatabaseZze = zzavVarZzj2.zze();
                            jCurrentTimeMillis = zzavVarZzj2.zzu.zzaZ().currentTimeMillis();
                            cursorQuery2 = sQLiteDatabaseZze.query("no_data_mode_events", new String[]{Constants.ScionAnalytics.MessageType.DATA_MESSAGE}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str, String.valueOf(jCurrentTimeMillis)}, null, null, "rowid", null);
                            list5 = list2;
                        } catch (Throwable th4) {
                            th = th4;
                            cursor2 = null;
                        }
                        try {
                        } catch (SQLiteException e4) {
                            e = e4;
                            cursor3 = cursorQuery2;
                        } catch (Throwable th5) {
                            th = th5;
                            cursor3 = cursorQuery2;
                            cursor2 = cursor3;
                            if (cursor2 != null) {
                            }
                            throw th;
                        }
                    } catch (SQLiteException e5) {
                        e = e5;
                        list5 = list2;
                    }
                    if (cursorQuery2.moveToFirst()) {
                        while (true) {
                            try {
                                arrayList2.add((com.google.android.gms.internal.measurement.zzhs) ((com.google.android.gms.internal.measurement.zzhr) zzpk.zzw(com.google.android.gms.internal.measurement.zzhs.zzk(), cursorQuery2.getBlob(0))).zzbc());
                                cursor3 = cursorQuery2;
                            } catch (com.google.android.gms.internal.measurement.zzmr e6) {
                                cursor3 = cursorQuery2;
                                try {
                                    try {
                                        zzavVarZzj2.zzu.zzaV().zzh().zzc("Failed to parse stored NO_DATA mode event, appId", zzgu.zzl(str), e6);
                                    } catch (SQLiteException e7) {
                                        e = e7;
                                        zzavVarZzj2.zzu.zzaV().zzb().zzc("Error flushing NO_DATA mode events. appId", zzgu.zzl(str), e);
                                        List list11 = Collections.EMPTY_LIST;
                                        list9 = list11;
                                        list8 = list5;
                                        list7 = list11;
                                        list6 = list5;
                                        if (cursor3 != null) {
                                        }
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    cursor2 = cursor3;
                                    if (cursor2 != null) {
                                    }
                                    throw th;
                                }
                            }
                            if (!cursor3.moveToNext()) {
                                break;
                            } else {
                                cursorQuery2 = cursor3;
                            }
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            throw th;
                        }
                        cursor3.close();
                        try {
                            int iDelete = sQLiteDatabaseZze.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str, String.valueOf(jCurrentTimeMillis)});
                            zzgs zzgsVarZzk = zzavVarZzj2.zzu.zzaV().zzk();
                            StringBuilder sb = new StringBuilder(String.valueOf(iDelete).length() + 34);
                            sb.append("Pruned ");
                            sb.append(iDelete);
                            sb.append(" NO_DATA mode events. appId");
                            zzgsVarZzk.zzb(sb.toString(), str);
                            list9 = arrayList2;
                            list8 = list5;
                        } catch (SQLiteException e8) {
                            e = e8;
                            cursor3 = null;
                            zzavVarZzj2.zzu.zzaV().zzb().zzc("Error flushing NO_DATA mode events. appId", zzgu.zzl(str), e);
                            List list112 = Collections.EMPTY_LIST;
                            list9 = list112;
                            list8 = list5;
                            list7 = list112;
                            list6 = list5;
                            if (cursor3 != null) {
                            }
                        }
                        it3 = list8.iterator();
                        boolean z3 = true;
                        List list12 = list9;
                        while (it3.hasNext()) {
                            Pair pair = (Pair) it3.next();
                            com.google.android.gms.internal.measurement.zzic zzicVar = (com.google.android.gms.internal.measurement.zzic) ((com.google.android.gms.internal.measurement.zzid) pair.first).zzcl();
                            if (z3 && !list12.isEmpty()) {
                                List listZzb = zzicVar.zzb();
                                zzicVar.zzi();
                                zzicVar.zzh(list12);
                                zzicVar.zzh(listZzb);
                                z3 = false;
                            }
                            com.google.android.gms.internal.measurement.zzhh zzhhVarZzb = com.google.android.gms.internal.measurement.zzho.zzb();
                            com.google.android.gms.internal.measurement.zzgf zzgfVarZzx = zzh().zzx(str);
                            ArrayList arrayList3 = new ArrayList();
                            if (zzgfVarZzx != null) {
                                list12 = list12;
                                for (com.google.android.gms.internal.measurement.zzfu zzfuVar : zzgfVarZzx.zza()) {
                                    com.google.android.gms.internal.measurement.zzhk zzhkVarZza = com.google.android.gms.internal.measurement.zzhl.zza();
                                    int iZzb = zzfuVar.zzb();
                                    zzji zzjiVar = zzji.UNINITIALIZED;
                                    Iterator it4 = it3;
                                    int i6 = iZzb - 1;
                                    boolean z4 = z3;
                                    if (i6 == 1) {
                                        list10 = list12;
                                        i2 = 3;
                                        i3 = 2;
                                    } else if (i6 != 2) {
                                        List list13 = list12;
                                        i2 = 3;
                                        if (i6 == 3) {
                                            i3 = 4;
                                            list10 = list13;
                                        } else if (i6 != 4) {
                                            i3 = 1;
                                            list10 = list13;
                                        } else {
                                            i3 = 5;
                                            list10 = list13;
                                        }
                                    } else {
                                        list10 = list12;
                                        i2 = 3;
                                        i3 = 3;
                                    }
                                    zzhkVarZza.zza(i3);
                                    int iZzd = zzfuVar.zzd() - 1;
                                    if (iZzd == 1) {
                                        i2 = 2;
                                    } else if (iZzd != 2) {
                                        i2 = 1;
                                    }
                                    zzhkVarZza.zzb(i2);
                                    arrayList3.add((com.google.android.gms.internal.measurement.zzhl) zzhkVarZza.zzbc());
                                    z3 = z4;
                                    it3 = it4;
                                    list12 = list10;
                                }
                            }
                            Iterator it5 = it3;
                            boolean z5 = z3;
                            List list14 = list12;
                            zzhhVarZzb.zza(arrayList3);
                            zzicVar.zzaQ(zzhhVarZzb);
                            arrayList.add(Pair.create((com.google.android.gms.internal.measurement.zzid) zzicVar.zzbc(), (Long) pair.second));
                            z3 = z5;
                            it3 = it5;
                            list12 = list14;
                        }
                        list4 = arrayList;
                    } else {
                        cursor3 = cursorQuery2;
                        list7 = arrayList2;
                        list6 = list5;
                        cursor3.close();
                        list9 = list7;
                        list8 = list6;
                        it3 = list8.iterator();
                        boolean z32 = true;
                        List list122 = list9;
                        while (it3.hasNext()) {
                        }
                        list4 = arrayList;
                    }
                    zzavVarZzj2.zzu.zzaV().zzb().zzc("Error flushing NO_DATA mode events. appId", zzgu.zzl(str), e);
                    List list1122 = Collections.EMPTY_LIST;
                    list9 = list1122;
                    list8 = list5;
                    list7 = list1122;
                    list6 = list5;
                    if (cursor3 != null) {
                        cursor3.close();
                        list9 = list7;
                        list8 = list6;
                    }
                    it3 = list8.iterator();
                    boolean z322 = true;
                    List list1222 = list9;
                    while (it3.hasNext()) {
                    }
                    list4 = arrayList;
                } else {
                    List listAsList = Arrays.asList(((String) zzfy.zzbi.zzb(null)).split(","));
                    for (Pair pair2 : list2) {
                        try {
                            zzj().zzH(((Long) pair2.second).longValue());
                            for (com.google.android.gms.internal.measurement.zzhs zzhsVar : ((com.google.android.gms.internal.measurement.zzid) pair2.first).zzc()) {
                                if (listAsList.contains(zzhsVar.zzd())) {
                                    if (zzhsVar.zzd().equals("_f") || zzhsVar.zzd().equals("_v")) {
                                        com.google.android.gms.internal.measurement.zzhr zzhrVar = (com.google.android.gms.internal.measurement.zzhr) zzhsVar.zzcl();
                                        zzp();
                                        zzpk.zzC(zzhrVar, "_dac", 1L);
                                        zzhsVar = (com.google.android.gms.internal.measurement.zzhs) zzhrVar.zzbc();
                                    }
                                    zzav zzavVarZzj3 = zzj();
                                    zzavVarZzj3.zzg();
                                    zzavVarZzj3.zzaw();
                                    Preconditions.checkNotNull(zzhsVar);
                                    Preconditions.checkNotEmpty(str);
                                    zzic zzicVar2 = zzavVarZzj3.zzu;
                                    zzicVar2.zzaV().zzk().zzb("Caching events in NO_DATA mode", zzhsVar);
                                    ContentValues contentValues = new ContentValues();
                                    contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str);
                                    contentValues.put("name", zzhsVar.zzd());
                                    contentValues.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, zzhsVar.zzcc());
                                    contentValues.put("timestamp_millis", Long.valueOf(zzhsVar.zzf()));
                                    try {
                                        if (zzavVarZzj3.zze().insert("no_data_mode_events", null, contentValues) == j2) {
                                            zzicVar2.zzaV().zzb().zzb("Failed to insert NO_DATA mode event (got -1). appId", zzgu.zzl(str));
                                        }
                                    } catch (SQLiteException e9) {
                                        zzavVarZzj3.zzu.zzaV().zzb().zzc("Error storing NO_DATA mode event. appId", zzgu.zzl(str), e9);
                                    }
                                }
                            }
                        } catch (SQLiteException unused) {
                            zzaV().zzh().zzb("Failed handling NO_DATA mode bundles. appId", str);
                        }
                    }
                    list4 = Collections.EMPTY_LIST;
                }
                boolean zIsEmpty = list4.isEmpty();
                listSubList = list4;
                if (zIsEmpty) {
                    return;
                }
            } else {
                listSubList = list2;
            }
            zzjl zzjlVarZzB = zzB(str);
            zzjk zzjkVar = zzjk.AD_STORAGE;
            if (zzjlVarZzB.zzo(zzjkVar)) {
                Iterator it6 = listSubList.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        strZzG = null;
                        break;
                    }
                    com.google.android.gms.internal.measurement.zzid zzidVar2 = (com.google.android.gms.internal.measurement.zzid) ((Pair) it6.next()).first;
                    if (!zzidVar2.zzG().isEmpty()) {
                        strZzG = zzidVar2.zzG();
                        break;
                    }
                }
                if (strZzG != null) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= listSubList.size()) {
                            break;
                        }
                        com.google.android.gms.internal.measurement.zzid zzidVar3 = (com.google.android.gms.internal.measurement.zzid) ((Pair) listSubList.get(i7)).first;
                        if (!zzidVar3.zzG().isEmpty() && !zzidVar3.zzG().equals(strZzG)) {
                            listSubList = listSubList.subList(0, i7);
                            break;
                        }
                        i7++;
                    }
                }
            }
            com.google.android.gms.internal.measurement.zzhz zzhzVarZzh = com.google.android.gms.internal.measurement.zzib.zzh();
            int size = listSubList.size();
            ArrayList arrayList4 = new ArrayList(listSubList.size());
            boolean z6 = zzd().zzC(str) && zzB(str).zzo(zzjkVar);
            boolean zZzo = zzB(str).zzo(zzjkVar);
            boolean zZzo2 = zzB(str).zzo(zzjk.ANALYTICS_STORAGE);
            zzrb.zza();
            boolean zZzp = zzd().zzp(str, zzfy.zzaM);
            zzou zzouVar = this.zzl;
            zzot zzotVarZza = zzouVar.zza(str);
            int i8 = 0;
            List list15 = listSubList;
            while (i8 < size) {
                boolean z7 = zZzo;
                com.google.android.gms.internal.measurement.zzic zzicVar3 = (com.google.android.gms.internal.measurement.zzic) ((com.google.android.gms.internal.measurement.zzid) ((Pair) list15.get(i8)).first).zzcl();
                int i9 = size;
                arrayList4.add((Long) ((Pair) list15.get(i8)).second);
                zzd().zzi();
                boolean z8 = z6;
                boolean z9 = zZzo2;
                zzicVar3.zzO(133005L);
                zzicVar3.zzs(j);
                this.zzn.zzaU();
                zzicVar3.zzae(false);
                if (!z8) {
                    zzicVar3.zzan();
                }
                if (!z7) {
                    zzicVar3.zzR();
                    zzicVar3.zzU();
                }
                if (!z9) {
                    zzicVar3.zzX();
                }
                zzS(str, zzicVar3);
                if (!zZzp) {
                    zzicVar3.zzav();
                }
                if (!z9) {
                    zzicVar3.zzag();
                }
                String strZzP = zzicVar3.zzP();
                if (TextUtils.isEmpty(strZzP) || strZzP.equals("00000000-0000-0000-0000-000000000000")) {
                    ArrayList arrayList5 = new ArrayList(zzicVar3.zzb());
                    Iterator it7 = arrayList5.iterator();
                    z = z8;
                    Long lValueOf = null;
                    Long lValueOf2 = null;
                    boolean z10 = false;
                    boolean z11 = false;
                    while (it7.hasNext()) {
                        List list16 = list15;
                        com.google.android.gms.internal.measurement.zzhs zzhsVar2 = (com.google.android.gms.internal.measurement.zzhs) it7.next();
                        boolean z12 = zZzp;
                        int i10 = i8;
                        if ("_fx".equals(zzhsVar2.zzd())) {
                            it7.remove();
                            zZzp = z12;
                            list15 = list16;
                            i8 = i10;
                            z10 = true;
                        } else if ("_f".equals(zzhsVar2.zzd())) {
                            zzp();
                            com.google.android.gms.internal.measurement.zzhw zzhwVarZzF = zzpk.zzF(zzhsVar2, "_pfo");
                            if (zzhwVarZzF != null) {
                                lValueOf = Long.valueOf(zzhwVarZzF.zzf());
                            }
                            zzp();
                            com.google.android.gms.internal.measurement.zzhw zzhwVarZzF2 = zzpk.zzF(zzhsVar2, "_uwa");
                            if (zzhwVarZzF2 != null) {
                                lValueOf2 = Long.valueOf(zzhwVarZzF2.zzf());
                            }
                            zZzp = z12;
                            list15 = list16;
                            i8 = i10;
                        } else {
                            zZzp = z12;
                            list15 = list16;
                            i8 = i10;
                        }
                        z11 = true;
                    }
                    list3 = list15;
                    z2 = zZzp;
                    i = i8;
                    if (z10) {
                        zzicVar3.zzi();
                        zzicVar3.zzh(arrayList5);
                    }
                    if (z11) {
                        zzR(zzicVar3.zzK(), true, lValueOf, lValueOf2);
                    }
                } else {
                    z = z8;
                    list3 = list15;
                    z2 = zZzp;
                    i = i8;
                }
                if (zzicVar3.zzc() != 0) {
                    if (zzd().zzp(str, zzfy.zzaC)) {
                        zzicVar3.zzas(zzp().zzt(((com.google.android.gms.internal.measurement.zzid) zzicVar3.zzbc()).zzcc()));
                    }
                    com.google.android.gms.internal.measurement.zzis zzisVarZzd = zzotVarZza.zzd();
                    if (zzisVarZzd != null) {
                        zzicVar3.zzaN(zzisVarZzd);
                    }
                    zzhzVarZzh.zze(zzicVar3);
                }
                i8 = i + 1;
                zZzo2 = z9;
                zZzo = z7;
                size = i9;
                z6 = z;
                zZzp = z2;
                list15 = list3;
            }
            if (zzhzVarZzh.zzb() == 0) {
                zzL(arrayList4);
                zzV(false, 204, null, null, str, Collections.EMPTY_LIST);
                return;
            }
            com.google.android.gms.internal.measurement.zzib zzibVar = (com.google.android.gms.internal.measurement.zzib) zzhzVarZzh.zzbc();
            ArrayList arrayList6 = new ArrayList();
            boolean z13 = zzotVarZza.zzc() == zzls.SGTM_CLIENT;
            if (zzotVarZza.zzc() == zzls.SGTM) {
                it = ((com.google.android.gms.internal.measurement.zzib) zzhzVarZzh.zzbc()).zza().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        if (((com.google.android.gms.internal.measurement.zzid) it.next()).zzY()) {
                            string = UUID.randomUUID().toString();
                            break;
                        }
                    } else {
                        string = null;
                        break;
                    }
                }
                com.google.android.gms.internal.measurement.zzib zzibVar2 = (com.google.android.gms.internal.measurement.zzib) zzhzVarZzh.zzbc();
                zzaW().zzg();
                zzu();
                com.google.android.gms.internal.measurement.zzhz zzhzVarZzi = com.google.android.gms.internal.measurement.zzib.zzi(zzibVar2);
                if (!TextUtils.isEmpty(string)) {
                    zzhzVarZzi.zzi(string);
                }
                strZzc = zzh().zzc(str);
                if (!TextUtils.isEmpty(strZzc)) {
                    zzhzVarZzi.zzj(strZzc);
                }
                ArrayList arrayList7 = new ArrayList();
                it2 = zzibVar2.zza().iterator();
                while (it2.hasNext()) {
                    com.google.android.gms.internal.measurement.zzic zzicVarZzaF = com.google.android.gms.internal.measurement.zzid.zzaF((com.google.android.gms.internal.measurement.zzid) it2.next());
                    zzicVarZzaF.zzan();
                    arrayList7.add((com.google.android.gms.internal.measurement.zzid) zzicVarZzaF.zzbc());
                }
                zzhzVarZzi.zzg();
                zzhzVarZzi.zzf(arrayList7);
                zzaV().zzk().zzb("[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ", !TextUtils.isEmpty(string) ? CloudMetaExtra.DEFINE_NON_PARENT_ID : zzhzVarZzi.zzh());
                com.google.android.gms.internal.measurement.zzib zzibVar3 = (com.google.android.gms.internal.measurement.zzib) zzhzVarZzi.zzbc();
                if (TextUtils.isEmpty(string)) {
                    com.google.android.gms.internal.measurement.zzib zzibVar4 = (com.google.android.gms.internal.measurement.zzib) zzhzVarZzh.zzbc();
                    zzaW().zzg();
                    zzu();
                    com.google.android.gms.internal.measurement.zzhz zzhzVarZzh2 = com.google.android.gms.internal.measurement.zzib.zzh();
                    zzaV().zzk().zzb("[sgtm] Processing Google Signal, sgtmJoinId:", string);
                    zzhzVarZzh2.zzi(string);
                    for (com.google.android.gms.internal.measurement.zzid zzidVar4 : zzibVar4.zza()) {
                        com.google.android.gms.internal.measurement.zzic zzicVarZzaE = com.google.android.gms.internal.measurement.zzid.zzaE();
                        zzicVarZzaE.zzam(zzidVar4.zzZ());
                        zzicVarZzaE.zzaJ(zzidVar4.zzav());
                        zzhzVarZzh2.zze(zzicVarZzaE);
                    }
                    com.google.android.gms.internal.measurement.zzib zzibVar5 = (com.google.android.gms.internal.measurement.zzib) zzhzVarZzh2.zzbc();
                    String strZzc2 = zzouVar.zzg.zzh().zzc(str);
                    if (TextUtils.isEmpty(strZzc2)) {
                        objZzi = null;
                        zzotVar = new zzot((String) zzfy.zzr.zzb(null), Collections.EMPTY_MAP, z13 ? zzls.GOOGLE_SIGNAL_PENDING : zzls.GOOGLE_SIGNAL, null);
                    } else {
                        Uri uri = Uri.parse((String) zzfy.zzr.zzb(null));
                        Uri.Builder builderBuildUpon = uri.buildUpon();
                        String authority = uri.getAuthority();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(strZzc2).length() + 1 + String.valueOf(authority).length());
                        sb2.append(strZzc2);
                        sb2.append(".");
                        sb2.append(authority);
                        builderBuildUpon.authority(sb2.toString());
                        objZzi = null;
                        zzotVar = new zzot(builderBuildUpon.build().toString(), Collections.EMPTY_MAP, z13 ? zzls.GOOGLE_SIGNAL_PENDING : zzls.GOOGLE_SIGNAL, null);
                    }
                    arrayList6.add(Pair.create(zzibVar5, zzotVar));
                } else {
                    objZzi = null;
                }
                if (!z13) {
                    com.google.android.gms.internal.measurement.zzhz zzhzVar = (com.google.android.gms.internal.measurement.zzhz) zzibVar3.zzcl();
                    for (int i11 = 0; i11 < zzibVar3.zzb(); i11++) {
                        com.google.android.gms.internal.measurement.zzic zzicVar4 = (com.google.android.gms.internal.measurement.zzic) zzibVar3.zzc(i11).zzcl();
                        zzicVar4.zzt();
                        zzicVar4.zzaO(j);
                        zzhzVar.zzd(i11, zzicVar4);
                    }
                    arrayList6.add(Pair.create((com.google.android.gms.internal.measurement.zzib) zzhzVar.zzbc(), zzotVarZza));
                    zzL(arrayList4);
                    zzV(false, 204, null, null, str, arrayList6);
                    if (zzO(str, zzotVarZza.zza())) {
                        zzaV().zzk().zzb("[sgtm] Sending sgtm batches available notification to app", str);
                        Intent intent = new Intent();
                        intent.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        intent.setPackage(str);
                        zzaQ(this.zzn.zzaY(), intent);
                        return;
                    }
                    return;
                }
                zzibVar = zzibVar3;
            } else if (z13) {
                z13 = true;
                it = ((com.google.android.gms.internal.measurement.zzib) zzhzVarZzh.zzbc()).zza().iterator();
                while (true) {
                    if (!it.hasNext()) {
                    }
                }
                com.google.android.gms.internal.measurement.zzib zzibVar22 = (com.google.android.gms.internal.measurement.zzib) zzhzVarZzh.zzbc();
                zzaW().zzg();
                zzu();
                com.google.android.gms.internal.measurement.zzhz zzhzVarZzi2 = com.google.android.gms.internal.measurement.zzib.zzi(zzibVar22);
                if (!TextUtils.isEmpty(string)) {
                }
                strZzc = zzh().zzc(str);
                if (!TextUtils.isEmpty(strZzc)) {
                }
                ArrayList arrayList72 = new ArrayList();
                it2 = zzibVar22.zza().iterator();
                while (it2.hasNext()) {
                }
                zzhzVarZzi2.zzg();
                zzhzVarZzi2.zzf(arrayList72);
                zzaV().zzk().zzb("[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ", !TextUtils.isEmpty(string) ? CloudMetaExtra.DEFINE_NON_PARENT_ID : zzhzVarZzi2.zzh());
                com.google.android.gms.internal.measurement.zzib zzibVar32 = (com.google.android.gms.internal.measurement.zzib) zzhzVarZzi2.zzbc();
                if (TextUtils.isEmpty(string)) {
                }
                if (!z13) {
                }
            } else {
                objZzi = null;
            }
            if (zzi().zzb()) {
                if (Log.isLoggable(zzaV().zzn(), 2)) {
                    objZzi = zzp().zzi(zzibVar);
                }
                zzp();
                byte[] bArrZzcc = zzibVar.zzcc();
                zzL(arrayList4);
                this.zzk.zze.zzb(j);
                zzaV().zzk().zzd("Uploading data. app, uncompressed size, data", str, Integer.valueOf(bArrZzcc.length), objZzi);
                this.zzv = true;
                zzi().zzc(str, zzotVarZza, zzibVar, new zzow(this, str, arrayList6));
                return;
            }
            return;
        }
        ArrayList arrayList8 = new ArrayList();
        int length = 0;
        while (true) {
            long j4 = cursorQuery.getLong(i4);
            try {
                blob = cursorQuery.getBlob(i5);
                zzpkVarZzp = zzavVarZzj.zzg.zzp();
            } catch (IOException e10) {
                e = e10;
                cursor4 = cursorQuery;
            }
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(blob);
                GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int i12 = gZIPInputStream.read(bArr);
                    if (i12 <= 0) {
                        break;
                    }
                    cursor4 = cursorQuery;
                    try {
                        try {
                            byteArrayOutputStream.write(bArr, 0, i12);
                            cursorQuery = cursor4;
                        } catch (IOException e11) {
                            e = e11;
                            try {
                                zzpkVarZzp.zzu.zzaV().zzb().zzb("Failed to ungzip content", e);
                                throw e;
                            } catch (IOException e12) {
                                e = e12;
                                zzavVarZzj.zzu.zzaV().zzb().zzc("Failed to unzip queued bundle. appId", zzgu.zzl(str), e);
                                if (cursor4.moveToNext()) {
                                    break;
                                } else {
                                    break;
                                }
                                cursor4.close();
                                list2 = arrayList8;
                                if (list2.isEmpty()) {
                                }
                            }
                        }
                    } catch (SQLiteException e13) {
                        e = e13;
                        cursorQuery = cursor4;
                        zzavVarZzj.zzu.zzaV().zzb().zzc("Error querying bundles. appId", zzgu.zzl(str), e);
                        list = Collections.EMPTY_LIST;
                        if (cursorQuery != null) {
                        }
                        list2 = list;
                        if (list2.isEmpty()) {
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        cursor = cursor4;
                        if (cursor != null) {
                        }
                        throw th;
                    }
                }
                gZIPInputStream.close();
                byteArrayInputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                if (!arrayList8.isEmpty() && byteArray.length + length > iMax) {
                    break;
                }
                try {
                    com.google.android.gms.internal.measurement.zzic zzicVar5 = (com.google.android.gms.internal.measurement.zzic) zzpk.zzw(com.google.android.gms.internal.measurement.zzid.zzaE(), byteArray);
                    if (!arrayList8.isEmpty()) {
                        com.google.android.gms.internal.measurement.zzid zzidVar5 = (com.google.android.gms.internal.measurement.zzid) ((Pair) arrayList8.get(0)).first;
                        com.google.android.gms.internal.measurement.zzid zzidVar6 = (com.google.android.gms.internal.measurement.zzid) zzicVar5.zzbc();
                        if (!zzidVar5.zzaf().equals(zzidVar6.zzaf()) || !zzidVar5.zzam().equals(zzidVar6.zzam()) || zzidVar5.zzao() != zzidVar6.zzao() || !zzidVar5.zzaq().equals(zzidVar6.zzaq())) {
                            break;
                        }
                        Iterator it8 = zzidVar5.zzf().iterator();
                        while (true) {
                            Iterator it9 = it8;
                            if (!it8.hasNext()) {
                                zzidVar = zzidVar6;
                                jZzg = -1;
                                break;
                            }
                            com.google.android.gms.internal.measurement.zziu zziuVar = (com.google.android.gms.internal.measurement.zziu) it9.next();
                            zzidVar = zzidVar6;
                            if ("_npa".equals(zziuVar.zzc())) {
                                jZzg = zziuVar.zzg();
                                break;
                            } else {
                                it8 = it9;
                                zzidVar6 = zzidVar;
                            }
                        }
                        Iterator it10 = zzidVar.zzf().iterator();
                        while (true) {
                            if (!it10.hasNext()) {
                                j3 = jZzg;
                                jZzg2 = -1;
                                break;
                            }
                            com.google.android.gms.internal.measurement.zziu zziuVar2 = (com.google.android.gms.internal.measurement.zziu) it10.next();
                            j3 = jZzg;
                            if ("_npa".equals(zziuVar2.zzc())) {
                                jZzg2 = zziuVar2.zzg();
                                break;
                            }
                            jZzg = j3;
                        }
                        if (j3 != jZzg2) {
                            break;
                        }
                    }
                    if (!cursorQuery.isNull(2)) {
                        zzicVar5.zzao(cursorQuery.getInt(2));
                    }
                    length += byteArray.length;
                    arrayList8.add(Pair.create((com.google.android.gms.internal.measurement.zzid) zzicVar5.zzbc(), Long.valueOf(j4)));
                } catch (IOException e14) {
                    zzavVarZzj.zzu.zzaV().zzb().zzc("Failed to merge queued bundle. appId", zzgu.zzl(str), e14);
                }
                cursor4 = cursorQuery;
                if (cursor4.moveToNext() || length > iMax) {
                    break;
                    break;
                } else {
                    cursorQuery = cursor4;
                    i4 = 0;
                    i5 = 1;
                }
            } catch (IOException e15) {
                e = e15;
                cursor4 = cursorQuery;
            }
        }
        cursor4.close();
        list2 = arrayList8;
        if (list2.isEmpty()) {
        }
    }

    public final boolean zzO(String str, String str2) {
        zzh zzhVarZzu = zzj().zzu(str);
        if (zzhVarZzu != null && zzt().zzaa(str, zzhVarZzu.zzay())) {
            this.zzF.remove(str2);
            return true;
        }
        zzpe zzpeVar = (zzpe) this.zzF.get(str2);
        if (zzpeVar == null) {
            return true;
        }
        return zzpeVar.zzb();
    }

    public final void zzP(String str) {
        com.google.android.gms.internal.measurement.zzib zzibVarZzd;
        zzaW().zzg();
        zzu();
        this.zzw = true;
        try {
            zzic zzicVar = this.zzn;
            zzicVar.zzaU();
            Boolean boolZzJ = zzicVar.zzt().zzJ();
            if (boolZzJ == null) {
                zzaV().zze().zza("Upload data called on the client side before use of service was decided");
            } else if (boolZzJ.booleanValue()) {
                zzaV().zzb().zza("Upload called in the client side when service should be used");
            } else if (this.zza > 0) {
                zzaL();
            } else if (!zzi().zzb()) {
                zzaV().zzk().zza("Network not connected, ignoring upload request");
                zzaL();
            } else if (zzj().zzD(str)) {
                zzav zzavVarZzj = zzj();
                Preconditions.checkNotEmpty(str);
                zzavVarZzj.zzg();
                zzavVarZzj.zzaw();
                List listZzC = zzavVarZzj.zzC(str, zzoo.zza(zzls.GOOGLE_SIGNAL), 1);
                zzpj zzpjVar = listZzC.isEmpty() ? null : (zzpj) listZzC.get(0);
                if (zzpjVar != null && (zzibVarZzd = zzpjVar.zzd()) != null) {
                    zzaV().zzk().zzd("[sgtm] Uploading data from upload queue. appId, type, url", str, zzpjVar.zzf(), zzpjVar.zze());
                    byte[] bArrZzcc = zzibVarZzd.zzcc();
                    if (Log.isLoggable(zzaV().zzn(), 2)) {
                        zzaV().zzk().zzd("[sgtm] Uploading data from upload queue. appId, uncompressed size, data", str, Integer.valueOf(bArrZzcc.length), zzp().zzi(zzibVarZzd));
                    }
                    zzot zzotVarZza = zzpjVar.zza();
                    this.zzv = true;
                    zzi().zzc(str, zzotVarZza, zzibVarZzd, new zzox(this, str, zzpjVar));
                }
            } else {
                zzaV().zzk().zzb("[sgtm] Upload queue has no batches for appId", str);
            }
            this.zzw = false;
            zzaM();
        } catch (Throwable th) {
            this.zzw = false;
            zzaM();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001e A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:4:0x000d, B:19:0x005a, B:22:0x0080, B:13:0x001e, B:15:0x0048, B:17:0x0052, B:18:0x0056), top: B:27:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzQ(String str, int i, Throwable th, byte[] bArr, zzpj zzpjVar) {
        zzaW().zzg();
        zzu();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.zzv = false;
                zzaM();
                throw th2;
            }
        }
        if (i != 200) {
            if (i == 204) {
                i = 204;
                if (th != null) {
                }
            }
            String str2 = new String(bArr, StandardCharsets.UTF_8);
            String strSubstring = str2.substring(0, Math.min(32, str2.length()));
            zzgs zzgsVarZzh = zzaV().zzh();
            Integer numValueOf = Integer.valueOf(i);
            Object obj = th;
            if (th == null) {
            }
            zzgsVarZzh.zzd("Network upload failed. Will retry later. appId, status, error", str, numValueOf, obj);
            zzj().zzK(Long.valueOf(zzpjVar.zzc()));
            zzaL();
        } else if (th != null) {
            zzj().zzE(Long.valueOf(zzpjVar.zzc()));
            zzaV().zzk().zzc("Successfully uploaded batch from upload queue. appId, status", str, Integer.valueOf(i));
            if (zzi().zzb() && zzj().zzD(str)) {
                zzP(str);
            } else {
                zzaL();
            }
        } else {
            String str22 = new String(bArr, StandardCharsets.UTF_8);
            String strSubstring2 = str22.substring(0, Math.min(32, str22.length()));
            zzgs zzgsVarZzh2 = zzaV().zzh();
            Integer numValueOf2 = Integer.valueOf(i);
            Object obj2 = th;
            if (th == null) {
                obj2 = strSubstring2;
            }
            zzgsVarZzh2.zzd("Network upload failed. Will retry later. appId, status, error", str, numValueOf2, obj2);
            zzj().zzK(Long.valueOf(zzpjVar.zzc()));
            zzaL();
        }
        this.zzv = false;
        zzaM();
    }

    public final void zzR(String str, boolean z, Long l, Long l2) {
        zzh zzhVarZzu = zzj().zzu(str);
        if (zzhVarZzu != null) {
            zzhVarZzu.zzar(z);
            zzhVarZzu.zzat(l);
            zzhVarZzu.zzav(l2);
            if (zzhVarZzu.zza()) {
                zzj().zzv(zzhVarZzu, false, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzS(String str, com.google.android.gms.internal.measurement.zzic zzicVar) {
        int iZzx;
        int iIndexOf;
        Set setZzl = zzh().zzl(str);
        if (setZzl != null) {
            zzicVar.zzaw(setZzl);
        }
        if (zzh().zzp(str)) {
            zzicVar.zzG();
        }
        if (zzh().zzq(str)) {
            String strZzD = zzicVar.zzD();
            if (!TextUtils.isEmpty(strZzD) && (iIndexOf = strZzD.indexOf(".")) != -1) {
                zzicVar.zzE(strZzD.substring(0, iIndexOf));
            }
        }
        if (zzh().zzr(str) && (iZzx = zzpk.zzx(zzicVar, "_id")) != -1) {
            zzicVar.zzr(iZzx);
        }
        if (zzh().zzs(str)) {
            zzicVar.zzan();
        }
        if (zzh().zzt(str)) {
            zzicVar.zzX();
            if (zzB(str).zzo(zzjk.ANALYTICS_STORAGE)) {
                Map map = this.zzE;
                zzpd zzpdVar = (zzpd) map.get(str);
                if (zzpdVar != null) {
                    if (zzd().zzl(str, zzfy.zzak) + zzpdVar.zzb < zzaZ().elapsedRealtime()) {
                        zzpdVar = new zzpd(this, (byte[]) null);
                        map.put(str, zzpdVar);
                    }
                    zzicVar.zzax(zzpdVar.zza);
                }
            }
        }
        if (zzh().zzu(str)) {
            zzicVar.zzav();
        }
    }

    public final void zzT(com.google.android.gms.internal.measurement.zzic zzicVar, zzpc zzpcVar) {
        for (int i = 0; i < zzicVar.zzc(); i++) {
            com.google.android.gms.internal.measurement.zzhr zzhrVar = (com.google.android.gms.internal.measurement.zzhr) zzicVar.zzd(i).zzcl();
            Iterator it = zzhrVar.zza().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if ("_c".equals(((com.google.android.gms.internal.measurement.zzhw) it.next()).zzb())) {
                    if (zzpcVar.zza.zzar() >= zzd().zzm(zzpcVar.zza.zzA(), zzfy.zzal)) {
                        int iZzm = zzd().zzm(zzpcVar.zza.zzA(), zzfy.zzay);
                        String strZzaw = null;
                        if (iZzm <= 0) {
                            if (zzd().zzp(zzpcVar.zza.zzA(), zzfy.zzaR)) {
                                strZzaw = zzt().zzaw();
                                com.google.android.gms.internal.measurement.zzhv zzhvVarZzn = com.google.android.gms.internal.measurement.zzhw.zzn();
                                zzhvVarZzn.zzb("_tu");
                                zzhvVarZzn.zzd(strZzaw);
                                zzhrVar.zzf((com.google.android.gms.internal.measurement.zzhw) zzhvVarZzn.zzbc());
                            }
                            com.google.android.gms.internal.measurement.zzhv zzhvVarZzn2 = com.google.android.gms.internal.measurement.zzhw.zzn();
                            zzhvVarZzn2.zzb("_tr");
                            zzhvVarZzn2.zzf(1L);
                            zzhrVar.zzf((com.google.android.gms.internal.measurement.zzhw) zzhvVarZzn2.zzbc());
                            zzoh zzohVarZzf = zzp().zzf(zzpcVar.zza.zzA(), zzicVar, zzhrVar, strZzaw);
                            if (zzohVarZzf != null) {
                                zzaV().zzk().zzc("Generated trigger URI. appId, uri", zzpcVar.zza.zzA(), zzohVarZzf.zza);
                                zzj().zzY(zzpcVar.zza.zzA(), zzohVarZzf);
                                Deque deque = this.zzr;
                                if (!deque.contains(zzpcVar.zza.zzA())) {
                                    deque.add(zzpcVar.zza.zzA());
                                }
                            }
                        } else if (zzj().zzw(zzC(), zzpcVar.zza.zzA(), false, false, false, false, false, false, true).zzg > iZzm) {
                            com.google.android.gms.internal.measurement.zzhv zzhvVarZzn3 = com.google.android.gms.internal.measurement.zzhw.zzn();
                            zzhvVarZzn3.zzb("_tnr");
                            zzhvVarZzn3.zzf(1L);
                            zzhrVar.zzf((com.google.android.gms.internal.measurement.zzhw) zzhvVarZzn3.zzbc());
                        } else {
                            if (zzd().zzp(zzpcVar.zza.zzA(), zzfy.zzaR)) {
                                strZzaw = zzt().zzaw();
                                com.google.android.gms.internal.measurement.zzhv zzhvVarZzn4 = com.google.android.gms.internal.measurement.zzhw.zzn();
                                zzhvVarZzn4.zzb("_tu");
                                zzhvVarZzn4.zzd(strZzaw);
                                zzhrVar.zzf((com.google.android.gms.internal.measurement.zzhw) zzhvVarZzn4.zzbc());
                            }
                            com.google.android.gms.internal.measurement.zzhv zzhvVarZzn5 = com.google.android.gms.internal.measurement.zzhw.zzn();
                            zzhvVarZzn5.zzb("_tr");
                            zzhvVarZzn5.zzf(1L);
                            zzhrVar.zzf((com.google.android.gms.internal.measurement.zzhw) zzhvVarZzn5.zzbc());
                            zzoh zzohVarZzf2 = zzp().zzf(zzpcVar.zza.zzA(), zzicVar, zzhrVar, strZzaw);
                            if (zzohVarZzf2 != null) {
                                zzaV().zzk().zzc("Generated trigger URI. appId, uri", zzpcVar.zza.zzA(), zzohVarZzf2.zza);
                                zzj().zzY(zzpcVar.zza.zzA(), zzohVarZzf2);
                                Deque deque2 = this.zzr;
                                if (!deque2.contains(zzpcVar.zza.zzA())) {
                                    deque2.add(zzpcVar.zza.zzA());
                                }
                            }
                        }
                    }
                    zzicVar.zze(i, (com.google.android.gms.internal.measurement.zzhs) zzhrVar.zzbc());
                }
            }
        }
    }

    public final void zzU(String str, com.google.android.gms.internal.measurement.zzhv zzhvVar, Bundle bundle, String str2) {
        List listListOf = CollectionUtils.listOf((Object[]) new String[]{"_o", "_sn", "_sc", "_si"});
        long jZzf = (zzpp.zzZ(zzhvVar.zza()) || zzpp.zzZ(str)) ? zzd().zzf(str2, true) : zzd().zze(str2, true);
        long jCodePointCount = zzhvVar.zzc().codePointCount(0, zzhvVar.zzc().length());
        zzpp zzppVarZzt = zzt();
        String strZza = zzhvVar.zza();
        zzd();
        String strZzC = zzppVarZzt.zzC(strZza, 40, true);
        if (jCodePointCount <= jZzf || listListOf.contains(zzhvVar.zza())) {
            return;
        }
        if ("_ev".equals(zzhvVar.zza())) {
            bundle.putString("_ev", zzt().zzC(zzhvVar.zzc(), zzd().zzf(str2, true), true));
            return;
        }
        zzaV().zzh().zzc("Param value is too long; discarded. Name, value length", strZzC, Long.valueOf(jCodePointCount));
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", 4L);
            if (bundle.getString("_ev") == null) {
                bundle.putString("_ev", strZzC);
                bundle.putLong("_el", jCodePointCount);
            }
        }
        bundle.remove(zzhvVar.zza());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0071 A[Catch: all -> 0x0016, TryCatch #2 {all -> 0x0016, blocks: (B:4:0x0013, B:8:0x001b, B:16:0x0034, B:21:0x0080, B:20:0x0071, B:22:0x008c, B:24:0x00a3, B:27:0x00b6, B:29:0x00c4, B:31:0x00e4, B:73:0x021f, B:75:0x0232, B:77:0x023c, B:85:0x025c, B:79:0x0242, B:81:0x024c, B:83:0x0252, B:84:0x0256, B:86:0x025f, B:87:0x0266, B:30:0x00d7, B:88:0x0267), top: B:95:0x0013, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c A[Catch: all -> 0x0016, PHI: r0
      0x008c: PHI (r0v2 int) = (r0v0 int), (r0v37 int) binds: [B:9:0x0027, B:15:0x0032] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {all -> 0x0016, blocks: (B:4:0x0013, B:8:0x001b, B:16:0x0034, B:21:0x0080, B:20:0x0071, B:22:0x008c, B:24:0x00a3, B:27:0x00b6, B:29:0x00c4, B:31:0x00e4, B:73:0x021f, B:75:0x0232, B:77:0x023c, B:85:0x025c, B:79:0x0242, B:81:0x024c, B:83:0x0252, B:84:0x0256, B:86:0x025f, B:87:0x0266, B:30:0x00d7, B:88:0x0267), top: B:95:0x0013, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c4 A[Catch: all -> 0x0016, SQLiteException -> 0x00b3, TryCatch #1 {SQLiteException -> 0x00b3, blocks: (B:24:0x00a3, B:27:0x00b6, B:29:0x00c4, B:31:0x00e4, B:73:0x021f, B:75:0x0232, B:77:0x023c, B:85:0x025c, B:79:0x0242, B:81:0x024c, B:83:0x0252, B:84:0x0256, B:86:0x025f, B:87:0x0266, B:30:0x00d7), top: B:94:0x00a3, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d7 A[Catch: all -> 0x0016, SQLiteException -> 0x00b3, TryCatch #1 {SQLiteException -> 0x00b3, blocks: (B:24:0x00a3, B:27:0x00b6, B:29:0x00c4, B:31:0x00e4, B:73:0x021f, B:75:0x0232, B:77:0x023c, B:85:0x025c, B:79:0x0242, B:81:0x024c, B:83:0x0252, B:84:0x0256, B:86:0x025f, B:87:0x0266, B:30:0x00d7), top: B:94:0x00a3, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fc A[Catch: all -> 0x0155, TryCatch #0 {all -> 0x0155, blocks: (B:32:0x00eb, B:33:0x00f4, B:35:0x00fc, B:37:0x0113, B:41:0x013d, B:43:0x0147, B:47:0x0158, B:48:0x015d, B:50:0x0163, B:52:0x017a, B:54:0x019f, B:56:0x01ba, B:58:0x01dd, B:59:0x01ee, B:60:0x01f2, B:62:0x01f8, B:63:0x01ff, B:66:0x020c, B:68:0x0210, B:71:0x0217, B:72:0x0218), top: B:93:0x00eb, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0163 A[Catch: all -> 0x0155, TryCatch #0 {all -> 0x0155, blocks: (B:32:0x00eb, B:33:0x00f4, B:35:0x00fc, B:37:0x0113, B:41:0x013d, B:43:0x0147, B:47:0x0158, B:48:0x015d, B:50:0x0163, B:52:0x017a, B:54:0x019f, B:56:0x01ba, B:58:0x01dd, B:59:0x01ee, B:60:0x01f2, B:62:0x01f8, B:63:0x01ff, B:66:0x020c, B:68:0x0210, B:71:0x0217, B:72:0x0218), top: B:93:0x00eb, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ba A[Catch: all -> 0x0155, TryCatch #0 {all -> 0x0155, blocks: (B:32:0x00eb, B:33:0x00f4, B:35:0x00fc, B:37:0x0113, B:41:0x013d, B:43:0x0147, B:47:0x0158, B:48:0x015d, B:50:0x0163, B:52:0x017a, B:54:0x019f, B:56:0x01ba, B:58:0x01dd, B:59:0x01ee, B:60:0x01f2, B:62:0x01f8, B:63:0x01ff, B:66:0x020c, B:68:0x0210, B:71:0x0217, B:72:0x0218), top: B:93:0x00eb, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f8 A[Catch: all -> 0x0155, TRY_LEAVE, TryCatch #0 {all -> 0x0155, blocks: (B:32:0x00eb, B:33:0x00f4, B:35:0x00fc, B:37:0x0113, B:41:0x013d, B:43:0x0147, B:47:0x0158, B:48:0x015d, B:50:0x0163, B:52:0x017a, B:54:0x019f, B:56:0x01ba, B:58:0x01dd, B:59:0x01ee, B:60:0x01f2, B:62:0x01f8, B:63:0x01ff, B:66:0x020c, B:68:0x0210, B:71:0x0217, B:72:0x0218), top: B:93:0x00eb, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0242 A[Catch: all -> 0x0016, SQLiteException -> 0x00b3, TryCatch #1 {SQLiteException -> 0x00b3, blocks: (B:24:0x00a3, B:27:0x00b6, B:29:0x00c4, B:31:0x00e4, B:73:0x021f, B:75:0x0232, B:77:0x023c, B:85:0x025c, B:79:0x0242, B:81:0x024c, B:83:0x0252, B:84:0x0256, B:86:0x025f, B:87:0x0266, B:30:0x00d7), top: B:94:0x00a3, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0256 A[Catch: all -> 0x0016, SQLiteException -> 0x00b3, TryCatch #1 {SQLiteException -> 0x00b3, blocks: (B:24:0x00a3, B:27:0x00b6, B:29:0x00c4, B:31:0x00e4, B:73:0x021f, B:75:0x0232, B:77:0x023c, B:85:0x025c, B:79:0x0242, B:81:0x024c, B:83:0x0252, B:84:0x0256, B:86:0x025f, B:87:0x0266, B:30:0x00d7), top: B:94:0x00a3, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzV(boolean z, int i, Throwable th, byte[] bArr, String str, List list) {
        byte[] bArr2;
        Iterator it;
        Iterator it2;
        List listZzC;
        int i2 = i;
        zzaW().zzg();
        zzu();
        if (bArr == null) {
            try {
                bArr2 = new byte[0];
            } catch (Throwable th2) {
                this.zzv = false;
                zzaM();
                throw th2;
            }
        } else {
            bArr2 = bArr;
        }
        List<Long> list2 = (List) Preconditions.checkNotNull(this.zzz);
        this.zzz = null;
        if (!z) {
            zzgs zzgsVarZzk = zzaV().zzk();
            Integer numValueOf = Integer.valueOf(i2);
            zzgsVarZzk.zzc("Network upload successful with code, uploadAttempted", numValueOf, Boolean.valueOf(z));
            if (z) {
                try {
                    this.zzk.zzd.zzb(zzaZ().currentTimeMillis());
                    this.zzk.zze.zzb(0L);
                    zzaL();
                    if (z) {
                        zzaV().zzk().zza("Purged empty bundles");
                    } else {
                        zzaV().zzk().zzc("Successful upload. Got network response. code, size", numValueOf, Integer.valueOf(bArr2.length));
                    }
                    zzj().zzb();
                    try {
                        HashMap map = new HashMap();
                        it = list.iterator();
                        while (it.hasNext()) {
                            Pair pair = (Pair) it.next();
                            com.google.android.gms.internal.measurement.zzib zzibVar = (com.google.android.gms.internal.measurement.zzib) pair.first;
                            zzot zzotVar = (zzot) pair.second;
                            if (zzotVar.zzc() != zzls.SGTM_CLIENT) {
                                long jZzA = zzj().zzA(str, zzibVar, zzotVar.zza(), zzotVar.zzb(), zzotVar.zzc(), null);
                                if (zzotVar.zzc() == zzls.GOOGLE_SIGNAL_PENDING && jZzA != -1 && !zzibVar.zze().isEmpty()) {
                                    map.put(zzibVar.zze(), Long.valueOf(jZzA));
                                }
                            }
                        }
                        it2 = list.iterator();
                        while (it2.hasNext()) {
                            Pair pair2 = (Pair) it2.next();
                            com.google.android.gms.internal.measurement.zzib zzibVar2 = (com.google.android.gms.internal.measurement.zzib) pair2.first;
                            zzot zzotVar2 = (zzot) pair2.second;
                            if (zzotVar2.zzc() == zzls.SGTM_CLIENT) {
                                zzj().zzA(str, zzibVar2, zzotVar2.zza(), zzotVar2.zzb(), zzotVar2.zzc(), (Long) map.get(zzibVar2.zze()));
                            }
                        }
                        listZzC = zzj().zzC(str, zzoo.zza(zzls.SGTM_CLIENT), 1);
                        if (!listZzC.isEmpty()) {
                            long jZzg = ((zzpj) listZzC.get(0)).zzg();
                            if (zzaZ().currentTimeMillis() > ((Long) zzfy.zzE.zzb(null)).longValue() + jZzg) {
                                zzaV().zze().zzc("[sgtm] client batches are queued too long. appId, creationTime", str, Long.valueOf(jZzg));
                            }
                        }
                        for (Long l : list2) {
                            try {
                                zzj().zzH(l.longValue());
                            } catch (SQLiteException e) {
                                List list3 = this.zzA;
                                if (list3 == null || !list3.contains(l)) {
                                    throw e;
                                }
                            }
                        }
                        zzj().zzc();
                        zzj().zzd();
                        this.zzA = null;
                        if (!zzi().zzb() && zzj().zzD(str)) {
                            zzP(str);
                        } else if (zzi().zzb() || !zzaJ()) {
                            this.zzB = -1L;
                            zzaL();
                        } else {
                            zzM();
                        }
                        this.zza = 0L;
                    } catch (Throwable th3) {
                        zzj().zzd();
                        throw th3;
                    }
                } catch (SQLiteException e2) {
                    zzaV().zzb().zzb("Database error while trying to delete uploaded bundles", e2);
                    this.zza = zzaZ().elapsedRealtime();
                    zzaV().zzk().zzb("Disable upload, time", Long.valueOf(this.zza));
                }
            } else {
                this.zzk.zze.zzb(0L);
                zzaL();
                if (z) {
                }
                zzj().zzb();
                HashMap map2 = new HashMap();
                it = list.iterator();
                while (it.hasNext()) {
                }
                it2 = list.iterator();
                while (it2.hasNext()) {
                }
                listZzC = zzj().zzC(str, zzoo.zza(zzls.SGTM_CLIENT), 1);
                if (!listZzC.isEmpty()) {
                }
                while (r2.hasNext()) {
                }
                zzj().zzc();
                zzj().zzd();
                this.zzA = null;
                if (!zzi().zzb()) {
                    if (zzi().zzb()) {
                        this.zzB = -1L;
                        zzaL();
                        this.zza = 0L;
                    }
                }
            }
        } else if (i2 != 200) {
            if (i2 == 204) {
                i2 = 204;
                if (th == null) {
                }
            }
            String str2 = new String(bArr2, StandardCharsets.UTF_8);
            zzaV().zzh().zzd("Network upload failed. Will retry later. code, error", Integer.valueOf(i2), th, str2.substring(0, Math.min(32, str2.length())));
            this.zzk.zze.zzb(zzaZ().currentTimeMillis());
            if (i2 != 503) {
                this.zzk.zzc.zzb(zzaZ().currentTimeMillis());
                zzj().zzJ(list2);
                zzaL();
            }
        } else if (th == null) {
            String str22 = new String(bArr2, StandardCharsets.UTF_8);
            zzaV().zzh().zzd("Network upload failed. Will retry later. code, error", Integer.valueOf(i2), th, str22.substring(0, Math.min(32, str22.length())));
            this.zzk.zze.zzb(zzaZ().currentTimeMillis());
            if (i2 != 503 || i2 == 429) {
                this.zzk.zzc.zzb(zzaZ().currentTimeMillis());
            }
            zzj().zzJ(list2);
            zzaL();
        }
        this.zzv = false;
        zzaM();
    }

    public final void zzW(zzh zzhVar) {
        zzaW().zzg();
        if (TextUtils.isEmpty(zzhVar.zzf())) {
            zzX((String) Preconditions.checkNotNull(zzhVar.zzc()), 204, null, null, null);
            return;
        }
        String str = (String) Preconditions.checkNotNull(zzhVar.zzc());
        zzaV().zzk().zzb("Fetching remote configuration", str);
        com.google.android.gms.internal.measurement.zzgl zzglVarZzb = zzh().zzb(str);
        String strZzd = zzh().zzd(str);
        OooOo.OooO00o oooO00o = null;
        if (zzglVarZzb != null) {
            if (!TextUtils.isEmpty(strZzd)) {
                oooO00o = new OooOo.OooO00o();
                oooO00o.put("If-Modified-Since", strZzd);
            }
            String strZze = zzh().zze(str);
            if (!TextUtils.isEmpty(strZze)) {
                if (oooO00o == null) {
                    oooO00o = new OooOo.OooO00o();
                }
                oooO00o.put("If-None-Match", strZze);
            }
        }
        this.zzu = true;
        zzi().zzd(zzhVar, oooO00o, new zzgw() { // from class: com.google.android.gms.measurement.internal.zzpf
            @Override // com.google.android.gms.measurement.internal.zzgw
            public final /* synthetic */ void zza(String str2, int i, Throwable th, byte[] bArr, Map map) {
                this.zza.zzX(str2, i, th, bArr, map);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzX(String str, int i, Throwable th, byte[] bArr, Map map) {
        boolean z;
        zzaW().zzg();
        zzu();
        Preconditions.checkNotEmpty(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.zzu = false;
                zzaM();
                throw th2;
            }
        }
        zzgs zzgsVarZzk = zzaV().zzk();
        Integer numValueOf = Integer.valueOf(bArr.length);
        zzgsVarZzk.zzb("onConfigFetched. Response size", numValueOf);
        zzj().zzb();
        try {
            zzh zzhVarZzu = zzj().zzu(str);
            if (i == 200 || i == 204) {
                z = th != null;
            } else {
                if (i == 304) {
                    i = 304;
                    if (th != null) {
                    }
                }
            }
            if (zzhVarZzu == null) {
                zzaV().zze().zzb("App does not exist in onConfigFetched. appId", zzgu.zzl(str));
            } else if (z || i == 404) {
                String strZzaK = zzaK(map, "Last-Modified");
                String strZzaK2 = zzaK(map, "ETag");
                if (i != 404 && i != 304) {
                    zzh().zzi(str, bArr, strZzaK, strZzaK2);
                } else if (zzh().zzb(str) == null) {
                    zzh().zzi(str, null, null, null);
                }
                zzhVarZzu.zzI(zzaZ().currentTimeMillis());
                zzj().zzv(zzhVarZzu, false, false);
                if (i == 404) {
                    zzaV().zzh().zzb("Config not found. Using empty config. appId", str);
                } else {
                    zzaV().zzk().zzc("Successfully fetched config. Got network response. code, size", Integer.valueOf(i), numValueOf);
                }
                if (zzi().zzb() && zzaJ()) {
                    zzM();
                } else if (zzi().zzb() && zzj().zzD(zzhVarZzu.zzc())) {
                    zzP(zzhVarZzu.zzc());
                } else {
                    zzaL();
                }
            } else {
                zzhVarZzu.zzK(zzaZ().currentTimeMillis());
                zzj().zzv(zzhVarZzu, false, false);
                zzaV().zzk().zzc("Fetching config failed. code, error", Integer.valueOf(i), th);
                zzh().zzf(str);
                this.zzk.zze.zzb(zzaZ().currentTimeMillis());
                if (i == 503 || i == 429) {
                    this.zzk.zzc.zzb(zzaZ().currentTimeMillis());
                }
                zzaL();
            }
            zzj().zzc();
            zzj().zzd();
            this.zzu = false;
            zzaM();
        } catch (Throwable th3) {
            zzj().zzd();
            throw th3;
        }
    }

    public final void zzY(Runnable runnable) {
        zzaW().zzg();
        if (this.zzq == null) {
            this.zzq = new ArrayList();
        }
        this.zzq.add(runnable);
    }

    public final void zzZ() {
        zzaW().zzg();
        zzu();
        if (this.zzp) {
            return;
        }
        this.zzp = true;
        if (zzaa()) {
            FileChannel fileChannel = this.zzy;
            zzaW().zzg();
            int i = 0;
            if (fileChannel == null || !fileChannel.isOpen()) {
                zzaV().zzb().zza("Bad channel to read from");
            } else {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
                try {
                    fileChannel.position(0L);
                    int i2 = fileChannel.read(byteBufferAllocate);
                    if (i2 == 4) {
                        byteBufferAllocate.flip();
                        i = byteBufferAllocate.getInt();
                    } else if (i2 != -1) {
                        zzaV().zze().zzb("Unexpected data length. Bytes read", Integer.valueOf(i2));
                    }
                } catch (IOException e) {
                    zzaV().zzb().zzb("Failed to read from channel", e);
                }
            }
            int iZzm = this.zzn.zzv().zzm();
            zzaW().zzg();
            if (i > iZzm) {
                zzaV().zzb().zzc("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i), Integer.valueOf(iZzm));
                return;
            }
            if (i < iZzm) {
                FileChannel fileChannel2 = this.zzy;
                zzaW().zzg();
                if (fileChannel2 == null || !fileChannel2.isOpen()) {
                    zzaV().zzb().zza("Bad channel to read from");
                } else {
                    ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
                    byteBufferAllocate2.putInt(iZzm);
                    byteBufferAllocate2.flip();
                    try {
                        fileChannel2.truncate(0L);
                        fileChannel2.write(byteBufferAllocate2);
                        fileChannel2.force(true);
                        if (fileChannel2.size() != 4) {
                            zzaV().zzb().zzb("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                        }
                        zzaV().zzk().zzc("Storage version upgraded. Previous, current version", Integer.valueOf(i), Integer.valueOf(iZzm));
                        return;
                    } catch (IOException e2) {
                        zzaV().zzb().zzb("Failed to write to channel", e2);
                    }
                }
                zzaV().zzb().zzc("Storage version upgrade failed. Previous, current version", Integer.valueOf(i), Integer.valueOf(iZzm));
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzjg
    public final zzae zzaU() {
        return this.zzn.zzaU();
    }

    @Override // com.google.android.gms.measurement.internal.zzjg
    public final zzgu zzaV() {
        return ((zzic) Preconditions.checkNotNull(this.zzn)).zzaV();
    }

    @Override // com.google.android.gms.measurement.internal.zzjg
    public final zzhz zzaW() {
        return ((zzic) Preconditions.checkNotNull(this.zzn)).zzaW();
    }

    @Override // com.google.android.gms.measurement.internal.zzjg
    public final Context zzaY() {
        return this.zzn.zzaY();
    }

    @Override // com.google.android.gms.measurement.internal.zzjg
    public final Clock zzaZ() {
        return ((zzic) Preconditions.checkNotNull(this.zzn)).zzaZ();
    }

    public final boolean zzaa() {
        zzaW().zzg();
        FileLock fileLock = this.zzx;
        if (fileLock != null && fileLock.isValid()) {
            zzaV().zzk().zza("Storage concurrent access okay");
            return true;
        }
        this.zze.zzu.zzc();
        File filesDir = this.zzn.zzaY().getFilesDir();
        com.google.android.gms.internal.measurement.zzbv.zza();
        int i = com.google.android.gms.internal.measurement.zzca.zzb;
        try {
            FileChannel channel = new RandomAccessFile(new File(new File(filesDir, "google_app_measurement.db").getPath()), "rw").getChannel();
            this.zzy = channel;
            FileLock fileLockTryLock = channel.tryLock();
            this.zzx = fileLockTryLock;
            if (fileLockTryLock != null) {
                zzaV().zzk().zza("Storage concurrent access okay");
                return true;
            }
            zzaV().zzb().zza("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e) {
            zzaV().zzb().zzb("Failed to acquire storage lock", e);
            return false;
        } catch (IOException e2) {
            zzaV().zzb().zzb("Failed to access storage lock file", e2);
            return false;
        } catch (OverlappingFileLockException e3) {
            zzaV().zze().zzb("Storage lock already acquired", e3);
            return false;
        }
    }

    public final void zzab(zzr zzrVar) {
        if (this.zzz != null) {
            ArrayList arrayList = new ArrayList();
            this.zzA = arrayList;
            arrayList.addAll(this.zzz);
        }
        zzav zzavVarZzj = zzj();
        String str = (String) Preconditions.checkNotNull(zzrVar.zza);
        Preconditions.checkNotEmpty(str);
        zzavVarZzj.zzg();
        zzavVarZzj.zzaw();
        try {
            SQLiteDatabase sQLiteDatabaseZze = zzavVarZzj.zze();
            String[] strArr = {str};
            int iDelete = sQLiteDatabaseZze.delete("apps", "app_id=?", strArr) + sQLiteDatabaseZze.delete("events", "app_id=?", strArr) + sQLiteDatabaseZze.delete("events_snapshot", "app_id=?", strArr) + sQLiteDatabaseZze.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseZze.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseZze.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseZze.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseZze.delete("queue", "app_id=?", strArr) + sQLiteDatabaseZze.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseZze.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseZze.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseZze.delete("trigger_uris", "app_id=?", strArr) + sQLiteDatabaseZze.delete("upload_queue", "app_id=?", strArr);
            com.google.android.gms.internal.measurement.zzpo.zza();
            zzic zzicVar = zzavVarZzj.zzu;
            if (zzicVar.zzc().zzp(null, zzfy.zzbh)) {
                iDelete += sQLiteDatabaseZze.delete("no_data_mode_events", "app_id=?", strArr);
            }
            if (iDelete > 0) {
                zzicVar.zzaV().zzk().zzc("Reset analytics data. app, records", str, Integer.valueOf(iDelete));
            }
        } catch (SQLiteException e) {
            zzavVarZzj.zzu.zzaV().zzb().zzc("Error resetting analytics data. appId, error", zzgu.zzl(str), e);
        }
        if (zzrVar.zzh) {
            zzah(zzrVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzac(zzpl zzplVar, zzr zzrVar) {
        zzpn zzpnVarZzm;
        long jLongValue;
        zzaW().zzg();
        zzu();
        if (zzaR(zzrVar)) {
            if (!zzrVar.zzh) {
                zzao(zzrVar);
                return;
            }
            zzpp zzppVarZzt = zzt();
            String str = zzplVar.zzb;
            int iZzp = zzppVarZzt.zzp(str);
            if (iZzp != 0) {
                zzpp zzppVarZzt2 = zzt();
                zzd();
                zzt().zzN(this.zzK, zzrVar.zza, iZzp, "_ev", zzppVarZzt2.zzC(str, 24, true), str != null ? str.length() : 0);
                return;
            }
            int iZzK = zzt().zzK(str, zzplVar.zza());
            if (iZzK != 0) {
                zzpp zzppVarZzt3 = zzt();
                zzd();
                String strZzC = zzppVarZzt3.zzC(str, 24, true);
                Object objZza = zzplVar.zza();
                if (objZza != null && ((objZza instanceof String) || (objZza instanceof CharSequence))) {
                    length = objZza.toString().length();
                }
                zzt().zzN(this.zzK, zzrVar.zza, iZzK, "_ev", strZzC, length);
                return;
            }
            Object objZzL = zzt().zzL(str, zzplVar.zza());
            if (objZzL != null) {
                if ("_sid".equals(str)) {
                    long j = zzplVar.zzc;
                    String str2 = zzplVar.zzf;
                    String str3 = (String) Preconditions.checkNotNull(zzrVar.zza);
                    zzpn zzpnVarZzm2 = zzj().zzm(str3, "_sno");
                    if (zzpnVarZzm2 != null) {
                        Object obj = zzpnVarZzm2.zze;
                        if (obj instanceof Long) {
                            jLongValue = ((Long) obj).longValue();
                        } else {
                            if (zzpnVarZzm2 != null) {
                                zzaV().zze().zzb("Retrieved last session number from database does not contain a valid (long) value", zzpnVarZzm2.zze);
                            }
                            zzbc zzbcVarZzf = zzj().zzf(str3, "_s");
                            if (zzbcVarZzf != null) {
                                zzgs zzgsVarZzk = zzaV().zzk();
                                long j2 = zzbcVarZzf.zzc;
                                zzgsVarZzk.zzb("Backfill the session number. Last used session number", Long.valueOf(j2));
                                jLongValue = j2;
                            } else {
                                jLongValue = 0;
                            }
                        }
                        zzac(new zzpl("_sno", j, Long.valueOf(jLongValue + 1), str2), zzrVar);
                    }
                }
                String str4 = zzrVar.zza;
                zzpn zzpnVar = new zzpn((String) Preconditions.checkNotNull(str4), (String) Preconditions.checkNotNull(zzplVar.zzf), str, zzplVar.zzc, objZzL);
                zzgs zzgsVarZzk2 = zzaV().zzk();
                zzic zzicVar = this.zzn;
                String str5 = zzpnVar.zzc;
                zzgsVarZzk2.zzc("Setting user property", zzicVar.zzl().zzc(str5), objZzL);
                zzj().zzb();
                try {
                    if ("_id".equals(str5) && (zzpnVarZzm = zzj().zzm(str4, "_id")) != null && !zzpnVar.zze.equals(zzpnVarZzm.zze)) {
                        zzj().zzk(str4, "_lair");
                    }
                    zzao(zzrVar);
                    boolean zZzl = zzj().zzl(zzpnVar);
                    if ("_sid".equals(str)) {
                        long jZzu = zzp().zzu(zzrVar.zzu);
                        zzh zzhVarZzu = zzj().zzu(str4);
                        if (zzhVarZzu != null) {
                            zzhVarZzu.zzan(jZzu);
                            if (zzhVarZzu.zza()) {
                                zzj().zzv(zzhVarZzu, false, false);
                            }
                        }
                    }
                    zzj().zzc();
                    if (!zZzl) {
                        zzaV().zzb().zzc("Too many unique user properties are set. Ignoring user property", zzicVar.zzl().zzc(str5), zzpnVar.zze);
                        zzt().zzN(this.zzK, str4, 9, null, null, 0);
                    }
                    zzj().zzd();
                } catch (Throwable th) {
                    zzj().zzd();
                    throw th;
                }
            }
        }
    }

    public final void zzad(String str, zzr zzrVar) {
        zzaW().zzg();
        zzu();
        if (zzaR(zzrVar)) {
            if (!zzrVar.zzh) {
                zzao(zzrVar);
                return;
            }
            Boolean boolZzaT = zzaT(zzrVar);
            if ("_npa".equals(str) && boolZzaT != null) {
                zzaV().zzj().zza("Falling back to manifest metadata value for ad personalization");
                zzac(new zzpl("_npa", zzaZ().currentTimeMillis(), Long.valueOf(true != boolZzaT.booleanValue() ? 0L : 1L), "auto"), zzrVar);
                return;
            }
            zzgs zzgsVarZzj = zzaV().zzj();
            zzic zzicVar = this.zzn;
            zzgsVarZzj.zzb("Removing user property", zzicVar.zzl().zzc(str));
            zzj().zzb();
            try {
                zzao(zzrVar);
                if ("_id".equals(str)) {
                    zzj().zzk((String) Preconditions.checkNotNull(zzrVar.zza), "_lair");
                }
                zzj().zzk((String) Preconditions.checkNotNull(zzrVar.zza), str);
                zzj().zzc();
                zzaV().zzj().zzb("User property removed", zzicVar.zzl().zzc(str));
                zzj().zzd();
            } catch (Throwable th) {
                zzj().zzd();
                throw th;
            }
        }
    }

    public final void zzae() {
        this.zzs++;
    }

    public final void zzaf() {
        this.zzt++;
    }

    public final zzic zzag() {
        return this.zzn;
    }

    public final void zzah(zzr zzrVar) {
        long j;
        long j2;
        zzbc zzbcVarZzf;
        boolean z;
        String str;
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        long j3;
        boolean z2;
        zzaW().zzg();
        zzu();
        Preconditions.checkNotNull(zzrVar);
        String str2 = zzrVar.zza;
        Preconditions.checkNotEmpty(str2);
        if (zzaR(zzrVar)) {
            zzh zzhVarZzu = zzj().zzu(str2);
            if (zzhVarZzu != null && TextUtils.isEmpty(zzhVarZzu.zzf()) && !TextUtils.isEmpty(zzrVar.zzb)) {
                zzhVarZzu.zzI(0L);
                zzj().zzv(zzhVarZzu, false, false);
                zzh().zzh(str2);
            }
            if (!zzrVar.zzh) {
                zzao(zzrVar);
                return;
            }
            long jCurrentTimeMillis = zzrVar.zzl;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = zzaZ().currentTimeMillis();
            }
            long j4 = jCurrentTimeMillis;
            int i = zzrVar.zzm;
            if (i != 0 && i != 1) {
                zzaV().zze().zzc("Incorrect app type, assuming installed app. appId, appType", zzgu.zzl(str2), Integer.valueOf(i));
                i = 0;
            }
            zzj().zzb();
            try {
                zzpn zzpnVarZzm = zzj().zzm(str2, "_npa");
                Boolean boolZzaT = zzaT(zzrVar);
                if (zzpnVarZzm != null && !"auto".equals(zzpnVarZzm.zzb)) {
                    j = j4;
                    j2 = 1;
                } else if (boolZzaT != null) {
                    zzpl zzplVar = new zzpl("_npa", j4, Long.valueOf(true != boolZzaT.booleanValue() ? 0L : 1L), "auto");
                    j2 = 1;
                    j = j4;
                    if (zzpnVarZzm == null || !zzpnVarZzm.zze.equals(zzplVar.zzd)) {
                        zzac(zzplVar, zzrVar);
                    }
                } else {
                    j = j4;
                    j2 = 1;
                    if (zzpnVarZzm != null) {
                        zzad("_npa", zzrVar);
                    }
                }
                if (zzd().zzp(null, zzfy.zzbb)) {
                    zzan(zzrVar, zzrVar.zzD);
                } else {
                    zzan(zzrVar, j);
                }
                zzao(zzrVar);
                if (i == 0) {
                    zzbcVarZzf = zzj().zzf(str2, "_f");
                    z = false;
                } else {
                    zzbcVarZzf = zzj().zzf(str2, "_v");
                    z = true;
                }
                if (zzbcVarZzf == null) {
                    long j5 = ((j / C18250l0.g.f55493g) + j2) * C18250l0.g.f55493g;
                    if (z) {
                        long j6 = j;
                        zzac(new zzpl("_fvt", j6, Long.valueOf(j5), "auto"), zzrVar);
                        zzaW().zzg();
                        zzu();
                        Bundle bundle = new Bundle();
                        bundle.putLong("_c", 1L);
                        bundle.putLong("_r", 1L);
                        bundle.putLong("_et", 1L);
                        if (zzrVar.zzo) {
                            bundle.putLong("_dac", 1L);
                        }
                        if (zzd().zzp(null, zzfy.zzbj)) {
                            bundle.putLong("_elt", zzaZ().currentTimeMillis());
                        }
                        zzE(new zzbg("_v", new zzbe(bundle), "auto", j6), zzrVar);
                    } else {
                        Long lValueOf = Long.valueOf(j5);
                        long j7 = j;
                        zzac(new zzpl("_fot", j7, lValueOf, "auto"), zzrVar);
                        zzaW().zzg();
                        zzhk zzhkVar = (zzhk) Preconditions.checkNotNull(this.zzm);
                        if (str2 == null || str2.isEmpty()) {
                            str = "_elt";
                            zzhkVar.zza.zzaV().zzf().zza("Install Referrer Reporter was called with invalid app package name");
                        } else {
                            zzic zzicVar = zzhkVar.zza;
                            zzicVar.zzaW().zzg();
                            if (zzhkVar.zza()) {
                                zzhj zzhjVar = new zzhj(zzhkVar, str2);
                                zzicVar.zzaW().zzg();
                                Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                str = "_elt";
                                intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                PackageManager packageManager = zzicVar.zzaY().getPackageManager();
                                if (packageManager == null) {
                                    zzicVar.zzaV().zzf().zza("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                } else {
                                    List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
                                    if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                                        zzicVar.zzaV().zzi().zza("Play Service for fetching Install Referrer is unavailable on device");
                                    } else {
                                        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                                        if (serviceInfo != null) {
                                            String str3 = serviceInfo.packageName;
                                            if (serviceInfo.name != null && "com.android.vending".equals(str3) && zzhkVar.zza()) {
                                                try {
                                                    zzicVar.zzaV().zzk().zzb("Install Referrer Service is", ConnectionTracker.getInstance().bindService(zzicVar.zzaY(), new Intent(intent), zzhjVar, 1) ? "available" : "not available");
                                                } catch (RuntimeException e) {
                                                    zzhkVar.zza.zzaV().zzb().zzb("Exception occurred while binding to Install Referrer Service", e.getMessage());
                                                }
                                            } else {
                                                zzicVar.zzaV().zze().zza("Play Store version 8.3.73 or higher required for Install Referrer");
                                            }
                                        }
                                    }
                                }
                            } else {
                                zzicVar.zzaV().zzi().zza("Install Referrer Reporter is not available");
                                str = "_elt";
                            }
                        }
                        zzaW().zzg();
                        zzu();
                        Bundle bundle2 = new Bundle();
                        long j8 = j2;
                        bundle2.putLong("_c", j8);
                        bundle2.putLong("_r", j8);
                        bundle2.putLong("_uwa", 0L);
                        bundle2.putLong("_pfo", 0L);
                        bundle2.putLong("_sys", 0L);
                        bundle2.putLong("_sysu", 0L);
                        bundle2.putLong("_et", j8);
                        if (zzrVar.zzo) {
                            bundle2.putLong("_dac", j8);
                        }
                        String str4 = (String) Preconditions.checkNotNull(zzrVar.zza);
                        zzav zzavVarZzj = zzj();
                        Preconditions.checkNotEmpty(str4);
                        zzavVarZzj.zzg();
                        zzavVarZzj.zzaw();
                        long jZzN = zzavVarZzj.zzN(str4, "first_open_count");
                        zzic zzicVar2 = this.zzn;
                        if (zzicVar2.zzaY().getPackageManager() == null) {
                            zzaV().zzb().zzb("PackageManager is null, first open report might be inaccurate. appId", zzgu.zzl(str4));
                        } else {
                            try {
                                packageInfo = Wrappers.packageManager(zzicVar2.zzaY()).getPackageInfo(str4, 0);
                            } catch (PackageManager.NameNotFoundException e2) {
                                zzaV().zzb().zzc("Package info is null, first open report might be inaccurate. appId", zzgu.zzl(str4), e2);
                                packageInfo = null;
                            }
                            if (packageInfo != null) {
                                long j9 = packageInfo.firstInstallTime;
                                if (j9 != 0) {
                                    if (j9 != packageInfo.lastUpdateTime) {
                                        if (!zzd().zzp(null, zzfy.zzaI)) {
                                            bundle2.putLong("_uwa", 1L);
                                        } else if (jZzN == 0) {
                                            bundle2.putLong("_uwa", 1L);
                                            jZzN = 0;
                                        }
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    zzac(new zzpl("_fi", j7, Long.valueOf(true != z2 ? 0L : 1L), "auto"), zzrVar);
                                }
                            }
                            try {
                                applicationInfo = Wrappers.packageManager(this.zzn.zzaY()).getApplicationInfo(str4, 0);
                            } catch (PackageManager.NameNotFoundException e3) {
                                zzaV().zzb().zzc("Application info is null, first open report might be inaccurate. appId", zzgu.zzl(str4), e3);
                                applicationInfo = null;
                            }
                            if (applicationInfo != null) {
                                if ((applicationInfo.flags & 1) != 0) {
                                    j3 = 1;
                                    bundle2.putLong("_sys", 1L);
                                } else {
                                    j3 = 1;
                                }
                                if ((applicationInfo.flags & 128) != 0) {
                                    bundle2.putLong("_sysu", j3);
                                }
                            }
                        }
                        if (jZzN >= 0) {
                            bundle2.putLong("_pfo", jZzN);
                        }
                        if (zzd().zzp(null, zzfy.zzbj)) {
                            bundle2.putLong(str, zzaZ().currentTimeMillis());
                        }
                        zzE(new zzbg("_f", new zzbe(bundle2), "auto", j7), zzrVar);
                    }
                } else {
                    long j10 = j;
                    if (zzrVar.zzi) {
                        zzE(new zzbg("_cd", new zzbe(new Bundle()), "auto", j10), zzrVar);
                    }
                }
                zzj().zzc();
                zzj().zzd();
            } catch (Throwable th) {
                zzj().zzd();
                throw th;
            }
        }
    }

    public final void zzai(zzr zzrVar) throws Throwable {
        zzaW().zzg();
        zzu();
        Preconditions.checkNotNull(zzrVar);
        String str = zzrVar.zza;
        Preconditions.checkNotEmpty(str);
        int i = 0;
        if (zzd().zzp(null, zzfy.zzaz)) {
            long jCurrentTimeMillis = zzaZ().currentTimeMillis();
            int iZzm = zzd().zzm(null, zzfy.zzai);
            zzd();
            long jZzF = jCurrentTimeMillis - zzal.zzF();
            while (i < iZzm && zzaG(null, jZzF)) {
                i++;
            }
        } else {
            zzd();
            long jZzH = zzal.zzH();
            while (i < jZzH && zzaG(str, 0L)) {
                i++;
            }
        }
        if (zzd().zzp(null, zzfy.zzaA)) {
            zzaW().zzg();
            zzav();
        }
        if (this.zzl.zzc(str, com.google.android.gms.internal.measurement.zzin.zzb(zzrVar.zzE))) {
            zzaV().zzk().zzb("[sgtm] Going background, trigger client side upload. appId", str);
            zzN(str, zzaZ().currentTimeMillis());
        }
    }

    public final void zzaj(zzah zzahVar) {
        zzr zzrVarZzaO = zzaO((String) Preconditions.checkNotNull(zzahVar.zza));
        if (zzrVarZzaO != null) {
            zzak(zzahVar, zzrVarZzaO);
        }
    }

    public final void zzak(zzah zzahVar, zzr zzrVar) {
        Preconditions.checkNotNull(zzahVar);
        Preconditions.checkNotEmpty(zzahVar.zza);
        Preconditions.checkNotNull(zzahVar.zzb);
        Preconditions.checkNotNull(zzahVar.zzc);
        Preconditions.checkNotEmpty(zzahVar.zzc.zzb);
        zzaW().zzg();
        zzu();
        if (zzaR(zzrVar)) {
            if (!zzrVar.zzh) {
                zzao(zzrVar);
                return;
            }
            zzah zzahVar2 = new zzah(zzahVar);
            boolean z = false;
            zzahVar2.zze = false;
            zzj().zzb();
            try {
                zzah zzahVarZzq = zzj().zzq((String) Preconditions.checkNotNull(zzahVar2.zza), zzahVar2.zzc.zzb);
                if (zzahVarZzq != null && !zzahVarZzq.zzb.equals(zzahVar2.zzb)) {
                    zzaV().zze().zzd("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.zzn.zzl().zzc(zzahVar2.zzc.zzb), zzahVar2.zzb, zzahVarZzq.zzb);
                }
                if (zzahVarZzq != null && zzahVarZzq.zze) {
                    zzahVar2.zzb = zzahVarZzq.zzb;
                    zzahVar2.zzd = zzahVarZzq.zzd;
                    zzahVar2.zzh = zzahVarZzq.zzh;
                    zzahVar2.zzf = zzahVarZzq.zzf;
                    zzahVar2.zzi = zzahVarZzq.zzi;
                    zzahVar2.zze = true;
                    zzpl zzplVar = zzahVar2.zzc;
                    zzahVar2.zzc = new zzpl(zzplVar.zzb, zzahVarZzq.zzc.zzc, zzplVar.zza(), zzahVarZzq.zzc.zzf);
                } else if (TextUtils.isEmpty(zzahVar2.zzf)) {
                    zzpl zzplVar2 = zzahVar2.zzc;
                    zzahVar2.zzc = new zzpl(zzplVar2.zzb, zzahVar2.zzd, zzplVar2.zza(), zzahVar2.zzc.zzf);
                    zzahVar2.zze = true;
                    z = true;
                }
                if (zzahVar2.zze) {
                    zzpl zzplVar3 = zzahVar2.zzc;
                    zzpn zzpnVar = new zzpn((String) Preconditions.checkNotNull(zzahVar2.zza), zzahVar2.zzb, zzplVar3.zzb, zzplVar3.zzc, Preconditions.checkNotNull(zzplVar3.zza()));
                    if (zzj().zzl(zzpnVar)) {
                        zzaV().zzj().zzd("User property updated immediately", zzahVar2.zza, this.zzn.zzl().zzc(zzpnVar.zzc), zzpnVar.zze);
                    } else {
                        zzaV().zzb().zzd("(2)Too many active user properties, ignoring", zzgu.zzl(zzahVar2.zza), this.zzn.zzl().zzc(zzpnVar.zzc), zzpnVar.zze);
                    }
                    if (z && zzahVar2.zzi != null) {
                        zzH(new zzbg(zzahVar2.zzi, zzahVar2.zzd), zzrVar);
                    }
                }
                if (zzj().zzp(zzahVar2)) {
                    zzaV().zzj().zzd("Conditional property added", zzahVar2.zza, this.zzn.zzl().zzc(zzahVar2.zzc.zzb), zzahVar2.zzc.zza());
                } else {
                    zzaV().zzb().zzd("Too many conditional properties, ignoring", zzgu.zzl(zzahVar2.zza), this.zzn.zzl().zzc(zzahVar2.zzc.zzb), zzahVar2.zzc.zza());
                }
                zzj().zzc();
                zzj().zzd();
            } catch (Throwable th) {
                zzj().zzd();
                throw th;
            }
        }
    }

    public final void zzal(zzah zzahVar) {
        zzr zzrVarZzaO = zzaO((String) Preconditions.checkNotNull(zzahVar.zza));
        if (zzrVarZzaO != null) {
            zzam(zzahVar, zzrVarZzaO);
        }
    }

    public final void zzam(zzah zzahVar, zzr zzrVar) {
        Preconditions.checkNotNull(zzahVar);
        Preconditions.checkNotEmpty(zzahVar.zza);
        Preconditions.checkNotNull(zzahVar.zzc);
        Preconditions.checkNotEmpty(zzahVar.zzc.zzb);
        zzaW().zzg();
        zzu();
        if (zzaR(zzrVar)) {
            if (!zzrVar.zzh) {
                zzao(zzrVar);
                return;
            }
            zzj().zzb();
            try {
                zzao(zzrVar);
                String str = (String) Preconditions.checkNotNull(zzahVar.zza);
                zzah zzahVarZzq = zzj().zzq(str, zzahVar.zzc.zzb);
                if (zzahVarZzq != null) {
                    zzaV().zzj().zzc("Removing conditional user property", zzahVar.zza, this.zzn.zzl().zzc(zzahVar.zzc.zzb));
                    zzj().zzr(str, zzahVar.zzc.zzb);
                    if (zzahVarZzq.zze) {
                        zzj().zzk(str, zzahVar.zzc.zzb);
                    }
                    zzbg zzbgVar = zzahVar.zzk;
                    if (zzbgVar != null) {
                        zzbe zzbeVar = zzbgVar.zzb;
                        zzH((zzbg) Preconditions.checkNotNull(zzt().zzac(str, ((zzbg) Preconditions.checkNotNull(zzbgVar)).zza, zzbeVar != null ? zzbeVar.zzf() : null, zzahVarZzq.zzb, zzbgVar.zzd, true, true)), zzrVar);
                    }
                } else {
                    zzaV().zze().zzc("Conditional user property doesn't exist", zzgu.zzl(zzahVar.zza), this.zzn.zzl().zzc(zzahVar.zzc.zzb));
                }
                zzj().zzc();
                zzj().zzd();
            } catch (Throwable th) {
                zzj().zzd();
                throw th;
            }
        }
    }

    public final void zzan(zzr zzrVar, long j) {
        zzh zzhVarZzu = zzj().zzu((String) Preconditions.checkNotNull(zzrVar.zza));
        if (zzhVarZzu != null && zzt().zzB(zzrVar.zzb, zzhVarZzu.zzf())) {
            zzaV().zze().zzb("New GMP App Id passed in. Removing cached database data. appId", zzgu.zzl(zzhVarZzu.zzc()));
            zzav zzavVarZzj = zzj();
            String strZzc = zzhVarZzu.zzc();
            zzavVarZzj.zzaw();
            zzavVarZzj.zzg();
            Preconditions.checkNotEmpty(strZzc);
            try {
                SQLiteDatabase sQLiteDatabaseZze = zzavVarZzj.zze();
                String[] strArr = {strZzc};
                int iDelete = sQLiteDatabaseZze.delete("events", "app_id=?", strArr) + sQLiteDatabaseZze.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseZze.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseZze.delete("apps", "app_id=?", strArr) + sQLiteDatabaseZze.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseZze.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseZze.delete("event_filters", "app_id=?", strArr) + sQLiteDatabaseZze.delete("property_filters", "app_id=?", strArr) + sQLiteDatabaseZze.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseZze.delete("consent_settings", "app_id=?", strArr) + sQLiteDatabaseZze.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseZze.delete("trigger_uris", "app_id=?", strArr);
                com.google.android.gms.internal.measurement.zzpo.zza();
                zzic zzicVar = zzavVarZzj.zzu;
                if (zzicVar.zzc().zzp(null, zzfy.zzbh)) {
                    iDelete += sQLiteDatabaseZze.delete("no_data_mode_events", "app_id=?", strArr);
                }
                if (iDelete > 0) {
                    zzicVar.zzaV().zzk().zzc("Deleted application data. app, records", strZzc, Integer.valueOf(iDelete));
                }
            } catch (SQLiteException e) {
                zzavVarZzj.zzu.zzaV().zzb().zzc("Error deleting application data. appId, error", zzgu.zzl(strZzc), e);
            }
            zzhVarZzu = null;
        }
        if (zzhVarZzu != null) {
            boolean z = (zzhVarZzu.zzt() == -2147483648L || zzhVarZzu.zzt() == zzrVar.zzj) ? false : true;
            String strZzr = zzhVarZzu.zzr();
            if (z || ((zzhVarZzu.zzt() != -2147483648L || strZzr == null || strZzr.equals(zzrVar.zzc)) ? false : true)) {
                zzbg zzbgVar = new zzbg("_au", new zzbe(C22172OooOoO.OooO00o("_pv", strZzr)), "auto", j);
                if (zzd().zzp(null, zzfy.zzbc)) {
                    zzE(zzbgVar, zzrVar);
                } else {
                    zzF(zzbgVar, zzrVar);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzh zzao(zzr zzrVar) {
        boolean z;
        String str;
        long j;
        String str2;
        String str3;
        String str4;
        zzaW().zzg();
        zzu();
        Preconditions.checkNotNull(zzrVar);
        String str5 = zzrVar.zza;
        Preconditions.checkNotEmpty(str5);
        String str6 = zzrVar.zzt;
        byte[] bArr = null;
        if (!str6.isEmpty()) {
            this.zzE.put(str5, new zzpd(this, str6, bArr));
        }
        zzh zzhVarZzu = zzj().zzu(str5);
        zzjl zzjlVarZzs = zzB(str5).zzs(zzjl.zzf(zzrVar.zzs, 100));
        zzjk zzjkVar = zzjk.AD_STORAGE;
        String strZzf = zzjlVarZzs.zzo(zzjkVar) ? this.zzk.zzf(str5, zzrVar.zzn) : "";
        boolean z2 = true;
        if (zzhVarZzu == null) {
            zzh zzhVar = new zzh(this.zzn, str5);
            if (zzjlVarZzs.zzo(zzjk.ANALYTICS_STORAGE)) {
                zzhVar.zze(zzK(zzjlVarZzs));
            }
            if (zzjlVarZzs.zzo(zzjkVar)) {
                zzhVar.zzk(strZzf);
            }
            zzhVarZzu = zzhVar;
        } else if (zzjlVarZzs.zzo(zzjkVar) && strZzf != null && !strZzf.equals(zzhVarZzu.zzj())) {
            boolean zIsEmpty = TextUtils.isEmpty(zzhVarZzu.zzj());
            zzhVarZzu.zzk(strZzf);
            if (zzrVar.zzn && !"00000000-0000-0000-0000-000000000000".equals(this.zzk.zzc(str5, zzjlVarZzs).first) && !zIsEmpty) {
                if (zzjlVarZzs.zzo(zzjk.ANALYTICS_STORAGE)) {
                    zzhVarZzu.zze(zzK(zzjlVarZzs));
                    z = false;
                } else {
                    z = true;
                }
                if (zzj().zzm(str5, "_id") != null && zzj().zzm(str5, "_lair") == null) {
                    zzj().zzl(new zzpn(str5, "auto", "_lair", zzaZ().currentTimeMillis(), 1L));
                }
                zzhVarZzu.zzg(zzrVar.zzb);
                str = zzrVar.zzk;
                if (!TextUtils.isEmpty(str)) {
                    zzhVarZzu.zzm(str);
                }
                j = zzrVar.zze;
                if (j != 0) {
                    zzhVarZzu.zzy(j);
                }
                str2 = zzrVar.zzc;
                if (!TextUtils.isEmpty(str2)) {
                    zzhVarZzu.zzs(str2);
                }
                zzhVarZzu.zzu(zzrVar.zzj);
                str3 = zzrVar.zzd;
                if (str3 != null) {
                    zzhVarZzu.zzw(str3);
                }
                zzhVarZzu.zzA(zzrVar.zzf);
                zzhVarZzu.zzE(zzrVar.zzh);
                str4 = zzrVar.zzg;
                if (!TextUtils.isEmpty(str4)) {
                    zzhVarZzu.zzab(str4);
                }
                zzhVarZzu.zzad(zzrVar.zzn);
                zzhVarZzu.zzaf(zzrVar.zzp);
                zzhVarZzu.zzC(zzrVar.zzq);
                zzhVarZzu.zzi(zzrVar.zzu);
                zzpr.zza();
                if (zzd().zzp(null, zzfy.zzaL)) {
                    zzpr.zza();
                    if (zzd().zzp(null, zzfy.zzaK)) {
                        zzhVarZzu.zzah(null);
                    }
                } else {
                    zzhVarZzu.zzah(zzrVar.zzr);
                }
                zzhVarZzu.zzaj(zzrVar.zzv);
                zzhVarZzu.zzaz(zzrVar.zzB);
                zzqp.zza();
                if (zzd().zzp(null, zzfy.zzaP)) {
                    zzhVarZzu.zzap(zzrVar.zzz);
                }
                zzhVarZzu.zzal(zzrVar.zzw);
                zzhVarZzu.zzaG(zzrVar.zzC);
                zzhVarZzu.zzaK(zzrVar.zzE);
                if (!zzhVarZzu.zza()) {
                    z2 = z;
                } else if (!z) {
                    return zzhVarZzu;
                }
                zzj().zzv(zzhVarZzu, z2, false);
                return zzhVarZzu;
            }
            if (TextUtils.isEmpty(zzhVarZzu.zzd()) && zzjlVarZzs.zzo(zzjk.ANALYTICS_STORAGE)) {
                zzhVarZzu.zze(zzK(zzjlVarZzs));
            }
        } else if (TextUtils.isEmpty(zzhVarZzu.zzd()) && zzjlVarZzs.zzo(zzjk.ANALYTICS_STORAGE)) {
            zzhVarZzu.zze(zzK(zzjlVarZzs));
        }
        z = false;
        zzhVarZzu.zzg(zzrVar.zzb);
        str = zzrVar.zzk;
        if (!TextUtils.isEmpty(str)) {
        }
        j = zzrVar.zze;
        if (j != 0) {
        }
        str2 = zzrVar.zzc;
        if (!TextUtils.isEmpty(str2)) {
        }
        zzhVarZzu.zzu(zzrVar.zzj);
        str3 = zzrVar.zzd;
        if (str3 != null) {
        }
        zzhVarZzu.zzA(zzrVar.zzf);
        zzhVarZzu.zzE(zzrVar.zzh);
        str4 = zzrVar.zzg;
        if (!TextUtils.isEmpty(str4)) {
        }
        zzhVarZzu.zzad(zzrVar.zzn);
        zzhVarZzu.zzaf(zzrVar.zzp);
        zzhVarZzu.zzC(zzrVar.zzq);
        zzhVarZzu.zzi(zzrVar.zzu);
        zzpr.zza();
        if (zzd().zzp(null, zzfy.zzaL)) {
        }
        zzhVarZzu.zzaj(zzrVar.zzv);
        zzhVarZzu.zzaz(zzrVar.zzB);
        zzqp.zza();
        if (zzd().zzp(null, zzfy.zzaP)) {
        }
        zzhVarZzu.zzal(zzrVar.zzw);
        zzhVarZzu.zzaG(zzrVar.zzC);
        zzhVarZzu.zzaK(zzrVar.zzE);
        if (!zzhVarZzu.zza()) {
        }
        zzj().zzv(zzhVarZzu, z2, false);
        return zzhVarZzu;
    }

    public final String zzap(zzr zzrVar) {
        try {
            return (String) zzaW().zzh(new zzoz(this, zzrVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzaV().zzb().zzc("Failed to get app instance id. appId", zzgu.zzl(zzrVar.zza), e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    public final List zzaq(zzr zzrVar, Bundle bundle) {
        zzaW().zzg();
        zzqp.zza();
        zzal zzalVarZzd = zzd();
        String str = zzrVar.zza;
        if (!zzalVarZzd.zzp(str, zzfy.zzaP) || str == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    zzaV().zzb().zza("Uri sources and timestamps do not match");
                } else {
                    for (int i = 0; i < intArray.length; i++) {
                        zzav zzavVarZzj = zzj();
                        int i2 = intArray[i];
                        long j = longArray[i];
                        Preconditions.checkNotEmpty(str);
                        zzavVarZzj.zzg();
                        zzavVarZzj.zzaw();
                        try {
                            int iDelete = zzavVarZzj.zze().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i2), String.valueOf(j)});
                            zzgs zzgsVarZzk = zzavVarZzj.zzu.zzaV().zzk();
                            StringBuilder sb = new StringBuilder(String.valueOf(iDelete).length() + 46);
                            sb.append("Pruned ");
                            sb.append(iDelete);
                            sb.append(" trigger URIs. appId, source, timestamp");
                            zzgsVarZzk.zzd(sb.toString(), str, Integer.valueOf(i2), Long.valueOf(j));
                        } catch (SQLiteException e) {
                            zzavVarZzj.zzu.zzaV().zzb().zzc("Error pruning trigger URIs. appId", zzgu.zzl(str), e);
                        }
                    }
                }
            }
        }
        zzav zzavVarZzj2 = zzj();
        String str2 = zzrVar.zza;
        Preconditions.checkNotEmpty(str2);
        zzavVarZzj2.zzg();
        zzavVarZzj2.zzaw();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = zzavVarZzj2.zze().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str2}, null, null, "rowid", null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string == null) {
                            string = "";
                        }
                        arrayList.add(new zzoh(string, cursorQuery.getLong(1), cursorQuery.getInt(2)));
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e2) {
                zzavVarZzj2.zzu.zzaV().zzb().zzc("Error querying trigger uris. appId", zzgu.zzl(str2), e2);
                arrayList = Collections.EMPTY_LIST;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return arrayList;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public final void zzar(String str, zzaf zzafVar) {
        zzaW().zzg();
        zzu();
        zzav zzavVarZzj = zzj();
        long j = zzafVar.zza;
        zzpj zzpjVarZzB = zzavVarZzj.zzB(j);
        if (zzpjVarZzB == null) {
            zzaV().zze().zzc("[sgtm] Queued batch doesn't exist. appId, rowId", str, Long.valueOf(j));
            return;
        }
        String strZze = zzpjVarZzB.zze();
        if (zzafVar.zzb != zzlr.SUCCESS.zza()) {
            if (zzafVar.zzb == zzlr.BACKOFF.zza()) {
                Map map = this.zzF;
                zzpe zzpeVar = (zzpe) map.get(strZze);
                if (zzpeVar == null) {
                    zzpeVar = new zzpe(this);
                    map.put(strZze, zzpeVar);
                } else {
                    zzpeVar.zza();
                }
                zzaV().zzk().zzd("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str, strZze, Long.valueOf((zzpeVar.zzc() - zzaZ().currentTimeMillis()) / 1000));
            }
            zzav zzavVarZzj2 = zzj();
            Long lValueOf = Long.valueOf(zzafVar.zza);
            zzavVarZzj2.zzK(lValueOf);
            zzaV().zzk().zzc("[sgtm] increased batch retry count after failed client upload. appId, rowId", str, lValueOf);
            return;
        }
        Map map2 = this.zzF;
        if (map2.containsKey(strZze)) {
            map2.remove(strZze);
        }
        zzav zzavVarZzj3 = zzj();
        Long lValueOf2 = Long.valueOf(j);
        zzavVarZzj3.zzE(lValueOf2);
        zzaV().zzk().zzc("[sgtm] queued batch deleted after successful client upload. appId, rowId", str, lValueOf2);
        long j2 = zzafVar.zzc;
        if (j2 > 0) {
            zzav zzavVarZzj4 = zzj();
            zzavVarZzj4.zzg();
            zzavVarZzj4.zzaw();
            Long lValueOf3 = Long.valueOf(j2);
            Preconditions.checkNotNull(lValueOf3);
            ContentValues contentValues = new ContentValues();
            contentValues.put("upload_type", Integer.valueOf(zzls.GOOGLE_SIGNAL.zza()));
            zzic zzicVar = zzavVarZzj4.zzu;
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzicVar.zzaZ().currentTimeMillis()));
            try {
                if (zzavVarZzj4.zze().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j2), str, String.valueOf(zzls.GOOGLE_SIGNAL_PENDING.zza())}) != 1) {
                    zzicVar.zzaV().zze().zzc("Google Signal pending batch not updated. appId, rowId", str, lValueOf3);
                }
                zzaV().zzk().zzc("[sgtm] queued Google Signal batch updated. appId, signalRowId", str, Long.valueOf(zzafVar.zzc));
                zzP(str);
            } catch (SQLiteException e) {
                zzavVarZzj4.zzu.zzaV().zzb().zzd("Failed to update google Signal pending batch. appid, rowId", str, Long.valueOf(j2), e);
                throw e;
            }
        }
    }

    public final void zzas(boolean z) {
        zzaL();
    }

    public final void zzat(String str, zzlu zzluVar) {
        zzaW().zzg();
        String str2 = this.zzH;
        if (str2 == null || str2.equals(str) || zzluVar != null) {
            this.zzH = str;
            this.zzG = zzluVar;
        }
    }

    public final /* synthetic */ void zzau(zzph zzphVar) {
        zzaW().zzg();
        this.zzm = new zzhk(this);
        zzav zzavVar = new zzav(this);
        zzavVar.zzax();
        this.zze = zzavVar;
        zzd().zza((zzak) Preconditions.checkNotNull(this.zzc));
        zznn zznnVar = new zznn(this);
        zznnVar.zzax();
        this.zzk = zznnVar;
        zzad zzadVar = new zzad(this);
        zzadVar.zzax();
        this.zzh = zzadVar;
        zzlp zzlpVar = new zzlp(this);
        zzlpVar.zzax();
        this.zzj = zzlpVar;
        zzok zzokVar = new zzok(this);
        zzokVar.zzax();
        this.zzg = zzokVar;
        this.zzf = new zzhb(this);
        if (this.zzs != this.zzt) {
            zzaV().zzb().zzc("Not all upload components initialized", Integer.valueOf(this.zzs), Integer.valueOf(this.zzt));
        }
        this.zzo.set(true);
        zzaV().zzk().zza("UploadController is now fully initialized");
    }

    public final /* synthetic */ zzic zzax() {
        return this.zzn;
    }

    public final /* synthetic */ Deque zzay() {
        return this.zzr;
    }

    public final /* synthetic */ void zzaz(long j) {
        this.zzJ = j;
    }

    public final void zzc() {
        zzaW().zzg();
        zzj().zzI();
        zzav zzavVarZzj = zzj();
        zzavVarZzj.zzg();
        zzavVarZzj.zzaw();
        if (zzavVarZzj.zzag()) {
            zzfx zzfxVar = zzfy.zzav;
            if (((Long) zzfxVar.zzb(null)).longValue() != 0) {
                SQLiteDatabase sQLiteDatabaseZze = zzavVarZzj.zze();
                zzic zzicVar = zzavVarZzj.zzu;
                int iDelete = sQLiteDatabaseZze.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(zzicVar.zzaZ().currentTimeMillis()), String.valueOf(zzfxVar.zzb(null))});
                if (iDelete > 0) {
                    zzicVar.zzaV().zzk().zzb("Deleted stale trigger uris. rowsDeleted", Integer.valueOf(iDelete));
                }
            }
        }
        if (this.zzk.zzd.zza() == 0) {
            this.zzk.zzd.zzb(zzaZ().currentTimeMillis());
        }
        zzaL();
    }

    public final zzal zzd() {
        return ((zzic) Preconditions.checkNotNull(this.zzn)).zzc();
    }

    public final zzou zzf() {
        return this.zzl;
    }

    public final zzht zzh() {
        zzht zzhtVar = this.zzc;
        zzaS(zzhtVar);
        return zzhtVar;
    }

    public final zzgz zzi() {
        zzgz zzgzVar = this.zzd;
        zzaS(zzgzVar);
        return zzgzVar;
    }

    public final zzav zzj() {
        zzav zzavVar = this.zze;
        zzaS(zzavVar);
        return zzavVar;
    }

    public final zzhb zzk() {
        zzhb zzhbVar = this.zzf;
        if (zzhbVar != null) {
            return zzhbVar;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final zzok zzl() {
        zzok zzokVar = this.zzg;
        zzaS(zzokVar);
        return zzokVar;
    }

    public final zzad zzm() {
        zzad zzadVar = this.zzh;
        zzaS(zzadVar);
        return zzadVar;
    }

    public final zzlp zzn() {
        zzlp zzlpVar = this.zzj;
        zzaS(zzlpVar);
        return zzlpVar;
    }

    public final zzpk zzp() {
        zzpk zzpkVar = this.zzi;
        zzaS(zzpkVar);
        return zzpkVar;
    }

    public final zznn zzq() {
        return this.zzk;
    }

    public final zzgn zzs() {
        return this.zzn.zzl();
    }

    public final zzpp zzt() {
        return ((zzic) Preconditions.checkNotNull(this.zzn)).zzk();
    }

    public final void zzu() {
        if (!this.zzo.get()) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    public final void zzv(zzr zzrVar) {
        zzaW().zzg();
        zzu();
        String str = zzrVar.zza;
        Preconditions.checkNotEmpty(str);
        zzjl zzjlVarZzf = zzjl.zzf(zzrVar.zzs, zzrVar.zzx);
        zzB(str);
        zzaV().zzk().zzc("Setting storage consent for package", str, zzjlVarZzf);
        zzA(str, zzjlVarZzf);
    }

    public final void zzw(zzr zzrVar) {
        zzaW().zzg();
        zzu();
        String str = zzrVar.zza;
        Preconditions.checkNotEmpty(str);
        zzaz zzazVarZzg = zzaz.zzg(zzrVar.zzy);
        zzaV().zzk().zzc("Setting DMA consent for package", str, zzazVarZzg);
        zzaW().zzg();
        zzu();
        zzji zzjiVarZzc = zzaz.zzh(zzy(str), 100).zzc();
        this.zzD.put(str, zzazVarZzg);
        zzj().zzab(str, zzazVarZzg);
        zzji zzjiVarZzc2 = zzaz.zzh(zzy(str), 100).zzc();
        zzaW().zzg();
        zzu();
        zzji zzjiVar = zzji.DENIED;
        boolean z = zzjiVarZzc == zzjiVar && zzjiVarZzc2 == zzji.GRANTED;
        boolean z2 = zzjiVarZzc == zzji.GRANTED && zzjiVarZzc2 == zzjiVar;
        if (z || z2) {
            zzaV().zzk().zzb("Generated _dcu event for", str);
            Bundle bundle = new Bundle();
            if (zzj().zzw(zzC(), str, false, false, false, false, false, false, false).zzf < zzd().zzm(str, zzfy.zzam)) {
                bundle.putLong("_r", 1L);
                zzaV().zzk().zzc("_dcu realtime event count", str, Long.valueOf(zzj().zzw(zzC(), str, false, false, false, false, false, true, false).zzf));
            }
            this.zzK.zza(str, "_dcu", bundle);
        }
    }

    public final zzaz zzx(String str) {
        zzaW().zzg();
        zzu();
        Map map = this.zzD;
        zzaz zzazVar = (zzaz) map.get(str);
        if (zzazVar != null) {
            return zzazVar;
        }
        zzaz zzazVarZzaa = zzj().zzaa(str);
        map.put(str, zzazVarZzaa);
        return zzazVarZzaa;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final Bundle zzy(String str) {
        zzaW().zzg();
        zzu();
        if (zzh().zzx(str) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        zzjl zzjlVarZzB = zzB(str);
        bundle.putAll(zzjlVarZzB.zzn());
        bundle.putAll(zzz(str, zzx(str), zzjlVarZzB, new zzan()).zzf());
        zzpn zzpnVarZzm = zzj().zzm(str, "_npa");
        bundle.putString("ad_personalization", 1 != (zzpnVarZzm != null ? zzpnVarZzm.zze.equals(1L) : zzaC(str, new zzan())) ? "granted" : "denied");
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzaz zzz(String str, zzaz zzazVar, zzjl zzjlVar, zzan zzanVar) {
        zzji zzjiVar;
        int iZzb = 90;
        if (zzh().zzx(str) == null) {
            if (zzazVar.zzc() == zzji.DENIED) {
                iZzb = zzazVar.zzb();
                zzanVar.zzb(zzjk.AD_USER_DATA, iZzb);
            } else {
                zzanVar.zzc(zzjk.AD_USER_DATA, zzam.FAILSAFE);
            }
            return new zzaz(Boolean.FALSE, iZzb, Boolean.TRUE, CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR);
        }
        zzji zzjiVarZzc = zzazVar.zzc();
        zzji zzjiVar2 = zzji.GRANTED;
        if (zzjiVarZzc == zzjiVar2 || zzjiVarZzc == (zzjiVar = zzji.DENIED)) {
            iZzb = zzazVar.zzb();
            zzanVar.zzb(zzjk.AD_USER_DATA, iZzb);
        } else if (zzjiVarZzc == zzji.POLICY) {
            zzht zzhtVar = this.zzc;
            zzjk zzjkVar = zzjk.AD_USER_DATA;
            zzji zzjiVarZzA = zzhtVar.zzA(str, zzjkVar);
            if (zzjiVarZzA != zzji.UNINITIALIZED) {
                zzanVar.zzc(zzjkVar, zzam.REMOTE_ENFORCED_DEFAULT);
                zzjiVarZzc = zzjiVarZzA;
            } else {
                zzht zzhtVar2 = this.zzc;
                zzjk zzjkVar2 = zzjk.AD_USER_DATA;
                zzjk zzjkVarZzw = zzhtVar2.zzw(str, zzjkVar2);
                zzji zzjiVarZzp = zzjlVar.zzp();
                boolean z = zzjiVarZzp == zzjiVar2 || zzjiVarZzp == zzjiVar;
                if (zzjkVarZzw == zzjk.AD_STORAGE && z) {
                    zzanVar.zzc(zzjkVar2, zzam.REMOTE_DELEGATION);
                    zzjiVarZzc = zzjiVarZzp;
                } else {
                    zzanVar.zzc(zzjkVar2, zzam.REMOTE_DEFAULT);
                    zzjiVarZzc = true != zzhtVar2.zzv(str, zzjkVar2) ? zzjiVar : zzjiVar2;
                }
            }
        }
        boolean zZzy = this.zzc.zzy(str);
        SortedSet sortedSetZzz = zzh().zzz(str);
        if (zzjiVarZzc == zzji.DENIED || sortedSetZzz.isEmpty()) {
            return new zzaz(Boolean.FALSE, iZzb, Boolean.valueOf(zZzy), CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR);
        }
        return new zzaz(Boolean.TRUE, iZzb, Boolean.valueOf(zZzy), zZzy ? TextUtils.join("", sortedSetZzz) : "");
    }
}
