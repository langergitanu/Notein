package o0OOo0oo;

import Oooo.C20813OooO0o0;
import com.orion.notein.domain.models.cloudsync.CloudMetaLocal;
import com.orion.notein.domain.models.cloudsync.CloudMetaRemote;
import com.orion.notein.domain.models.note.NoteFile;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.note.NotePlaceHolder;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C24033OooOooo;
import o00o00O0.C25252OooO0Oo;
import o0OOOO0o.C27129OoooOOO;
import o0OOo0Oo.EnumC27285OooO;
import o0OOo0Oo.InterfaceC27311OooOoOO;
import o0OOo0Oo.InterfaceC27313OooOoo0;
import o0OOo0Oo.InterfaceC27314OooOooO;
import o0OOo0o0.InterfaceC27605OooO00o;
import o0OOoO0.C27715OooO0o;
import o0OOoO0.C27718OooO0oo;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0O0o.C33599OooOo0O;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34431OooOo0;

/* JADX INFO: renamed from: o0OOo0oo.OooooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27665OooooO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C27715OooO0o f97299OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C20813OooO0o0 f97300OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0O0O00 f97301OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C27616OooO0o f97302OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0OOoO0.OooOO0O f97303OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final InterfaceC27313OooOoo0 f97304OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final InterfaceC27311OooOoOO f97305OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C27129OoooOOO f97306OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C27718OooO0oo f97307OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final InterfaceC27314OooOooO f97308OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final AtomicBoolean f97309OooOO0O;

    public C27665OooooO0(C20813OooO0o0 c20813OooO0o0, o0O0O00 pullRemoteChangesUseCase, C27616OooO0o aboutCloudSyncUseCase, o0OOoO0.OooOO0O migrationStore, InterfaceC27311OooOoOO noteFileRepo, InterfaceC27313OooOoo0 noteMetaRepo, C27129OoooOOO c27129OoooOOO, C27718OooO0oo c27718OooO0oo, C27715OooO0o migrationGuard, InterfaceC27314OooOooO notePlaceholderRepo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(pullRemoteChangesUseCase, "pullRemoteChangesUseCase");
        kotlin.jvm.internal.OooOOO0.OooO0oO(aboutCloudSyncUseCase, "aboutCloudSyncUseCase");
        kotlin.jvm.internal.OooOOO0.OooO0oO(migrationStore, "migrationStore");
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteFileRepo, "noteFileRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteMetaRepo, "noteMetaRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(migrationGuard, "migrationGuard");
        kotlin.jvm.internal.OooOOO0.OooO0oO(notePlaceholderRepo, "notePlaceholderRepo");
        this.f97300OooO00o = c20813OooO0o0;
        this.f97301OooO0O0 = pullRemoteChangesUseCase;
        this.f97302OooO0OO = aboutCloudSyncUseCase;
        this.f97303OooO0Oo = migrationStore;
        this.f97305OooO0o0 = noteFileRepo;
        this.f97304OooO0o = noteMetaRepo;
        this.f97306OooO0oO = c27129OoooOOO;
        this.f97307OooO0oo = c27718OooO0oo;
        this.f97299OooO = migrationGuard;
        this.f97308OooOO0 = notePlaceholderRepo;
        this.f97309OooOO0O = new AtomicBoolean(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27662OoooOoo c27662OoooOoo;
        C27665OooooO0 c27665OooooO0;
        String[] strArr;
        if (abstractC32479OooO0OO instanceof C27662OoooOoo) {
            c27662OoooOoo = (C27662OoooOoo) abstractC32479OooO0OO;
            int i = c27662OoooOoo.f97280OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27662OoooOoo.f97280OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27662OoooOoo = new C27662OoooOoo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOo = c27662OoooOoo.f97278OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27662OoooOoo.f97280OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOo);
            o0OO.OooOo oooOoOooO0O0 = this.f97308OooOO0.OooO0O0();
            c27662OoooOoo.f97279OooOo0o = this;
            c27662OoooOoo.f97280OooOoO = 1;
            objOooOOo = C25252OooO0Oo.OooOOo(oooOoOooO0O0, c27662OoooOoo);
            if (objOooOOo != enumC32485OooO00o) {
                c27665OooooO0 = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            strArr = (String[]) c27662OoooOoo.f97279OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOOo);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("LegacyCloudSyncMigration");
            c20358OooO00o.OooO0o0("Cleaned up %d legacy cloud sync placeholders", new Integer(strArr.length));
            return C32460OooOooO.f116667OooO00o;
        }
        c27665OooooO0 = (C27665OooooO0) c27662OoooOoo.f97279OooOo0o;
        C32446OooOOOo.OooO0O0(objOooOOo);
        ArrayList arrayList = new ArrayList();
        for (Object obj : (List) objOooOOo) {
            NotePlaceHolder notePlaceHolder = (NotePlaceHolder) obj;
            if (notePlaceHolder.getState() == 2 || notePlaceHolder.getState() == 3 || notePlaceHolder.getState() == 4) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((NotePlaceHolder) it.next()).getId());
        }
        String[] strArr2 = (String[]) arrayList2.toArray(new String[0]);
        if (strArr2.length != 0) {
            InterfaceC27314OooOooO interfaceC27314OooOooO = c27665OooooO0.f97308OooOO0;
            String[] strArr3 = (String[]) Arrays.copyOf(strArr2, strArr2.length);
            c27662OoooOoo.f97279OooOo0o = strArr2;
            c27662OoooOoo.f97280OooOoO = 2;
            if (interfaceC27314OooOooO.OooO0o(strArr3, c27662OoooOoo) != enumC32485OooO00o) {
                strArr = strArr2;
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("LegacyCloudSyncMigration");
                c20358OooO00o2.OooO0o0("Cleaned up %d legacy cloud sync placeholders", new Integer(strArr.length));
            }
            return enumC32485OooO00o;
        }
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0391, code lost:
    
        if (r5.OooO00o(r8, r3) == r4) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x03e7, code lost:
    
        if (r2.OooO00o(r5, r3) != r4) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0486, code lost:
    
        if (r2 != r4) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0547, code lost:
    
        if (r2 == r4) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x05dc, code lost:
    
        if (r2.OooO00o(r5, r3) != r4) goto L178;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d6 A[PHI: r1 r2 r5 r7 r12
      0x00d6: PHI (r1v48 java.util.Set) = (r1v45 java.util.Set), (r1v51 java.util.Set) binds: [B:127:0x0432, B:18:0x00c3] A[DONT_GENERATE, DONT_INLINE]
      0x00d6: PHI (r2v52 java.lang.Object) = (r2v51 java.lang.Object), (r2v1 java.lang.Object) binds: [B:127:0x0432, B:18:0x00c3] A[DONT_GENERATE, DONT_INLINE]
      0x00d6: PHI (r5v36 java.util.Map) = (r5v33 java.util.Map), (r5v41 java.util.Map) binds: [B:127:0x0432, B:18:0x00c3] A[DONT_GENERATE, DONT_INLINE]
      0x00d6: PHI (r7v6 java.lang.String) = (r7v4 java.lang.String), (r7v8 java.lang.String) binds: [B:127:0x0432, B:18:0x00c3] A[DONT_GENERATE, DONT_INLINE]
      0x00d6: PHI (r12v34 o0OOo0oo.OooooO0) = (r12v31 o0OOo0oo.OooooO0), (r12v37 o0OOo0oo.OooooO0) binds: [B:127:0x0432, B:18:0x00c3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01e7 A[PHI: r1 r5 r12
      0x01e7: PHI (r1v9 o0OOo0Oo.OooO) = (r1v6 o0OOo0Oo.OooO), (r1v12 o0OOo0Oo.OooO) binds: [B:40:0x01e3, B:28:0x015a] A[DONT_GENERATE, DONT_INLINE]
      0x01e7: PHI (r5v10 java.lang.String) = (r5v8 java.lang.String), (r5v12 java.lang.String) binds: [B:40:0x01e3, B:28:0x015a] A[DONT_GENERATE, DONT_INLINE]
      0x01e7: PHI (r12v9 o0OOo0oo.OooooO0) = (r12v6 o0OOo0oo.OooooO0), (r12v11 o0OOo0oo.OooooO0) binds: [B:40:0x01e3, B:28:0x015a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02e2 A[LOOP:2: B:87:0x02dc->B:89:0x02e2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x032a A[PHI: r1 r5 r12 r13
      0x032a: PHI (r1v21 java.util.Set) = (r1v18 java.util.Set), (r1v24 java.util.Set) binds: [B:94:0x0326, B:25:0x0125] A[DONT_GENERATE, DONT_INLINE]
      0x032a: PHI (r5v20 java.util.Map) = (r5v17 java.util.Map), (r5v22 java.util.Map) binds: [B:94:0x0326, B:25:0x0125] A[DONT_GENERATE, DONT_INLINE]
      0x032a: PHI (r12v26 java.lang.String) = (r12v24 java.lang.String), (r12v27 java.lang.String) binds: [B:94:0x0326, B:25:0x0125] A[DONT_GENERATE, DONT_INLINE]
      0x032a: PHI (r13v7 o0OOo0oo.OooooO0) = (r13v4 o0OOo0oo.OooooO0), (r13v9 o0OOo0oo.OooooO0) binds: [B:94:0x0326, B:25:0x0125] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0363  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:150:0x04da -> B:170:0x0589). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:168:0x057e -> B:169:0x0585). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(String str, EnumC27285OooO enumC27285OooO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27663Ooooo00 c27663Ooooo00;
        EnumC27285OooO enumC27285OooO2;
        C27665OooooO0 c27665OooooO0;
        o0OOoO0.OooOO0O oooOO0O;
        o0OOoO0.OooOO0 oooOO02;
        String str2;
        EnumC27285OooO enumC27285OooO3;
        String str3;
        C27665OooooO0 c27665OooooO02;
        int iOooO0Oo;
        Serializable serializableOooOOo0;
        String str4;
        C27665OooooO0 c27665OooooO03;
        Set set;
        Map map;
        String noteId;
        Iterator it;
        Set setO0Oo0oo;
        Object objOooO0O0;
        Object objOooO00o;
        Set set2;
        Object obj;
        Set set3;
        String str5;
        C27665OooooO0 c27665OooooO04;
        String str6;
        C27665OooooO0 c27665OooooO05;
        String str7;
        C27665OooooO0 c27665OooooO06;
        Map map2;
        C24033OooOooo c24033OooOooo;
        C24033OooOooo c24033OooOooo2;
        List list;
        Map linkedHashMap;
        Iterator it2;
        CloudMetaRemote cloudMetaRemote;
        Iterator it3;
        Map map3;
        C24033OooOooo c24033OooOooo3;
        C24033OooOooo c24033OooOooo4;
        Map map4;
        String str8;
        C27665OooooO0 c27665OooooO07;
        C27715OooO0o c27715OooO0o;
        String driveId;
        String id;
        Iterator it4;
        Map map5;
        C24033OooOooo c24033OooOooo5;
        C24033OooOooo c24033OooOooo6;
        CloudMetaLocal cloudMetaLocal;
        String str9;
        C27665OooooO0 c27665OooooO08;
        Map map6;
        String str10 = str;
        if (abstractC32479OooO0OO instanceof C27663Ooooo00) {
            c27663Ooooo00 = (C27663Ooooo00) abstractC32479OooO0OO;
            int i = c27663Ooooo00.f97292Oooo00O;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27663Ooooo00.f97292Oooo00O = i - Integer.MIN_VALUE;
            } else {
                c27663Ooooo00 = new C27663Ooooo00(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o2 = c27663Ooooo00.f97290OooOooo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        boolean z = true;
        switch (c27663Ooooo00.f97292Oooo00O) {
            case 0:
                C32446OooOOOo.OooO0O0(objOooO00o2);
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("LegacyCloudSyncMigration");
                c20358OooO00o.OooO0o0("Migration start. driveId=%s", str10);
                o0OOoO0.OooOO0 oooOO03 = new o0OOoO0.OooOO0(str10, o0OOoO0.OooO.f97726OooOo, null);
                c27663Ooooo00.f97283OooOo0o = this;
                c27663Ooooo00.f97282OooOo = str10;
                enumC27285OooO2 = enumC27285OooO;
                c27663Ooooo00.f97285OooOoO0 = enumC27285OooO2;
                c27663Ooooo00.f97292Oooo00O = 1;
                if (this.f97303OooO0Oo.OooO00o(oooOO03, c27663Ooooo00) != enumC32485OooO00o) {
                    c27665OooooO0 = this;
                    oooOO0O = c27665OooooO0.f97303OooO0Oo;
                    oooOO02 = new o0OOoO0.OooOO0(str10, o0OOoO0.OooO.f97729OooOoO0, null);
                    c27663Ooooo00.f97283OooOo0o = c27665OooooO0;
                    c27663Ooooo00.f97282OooOo = str10;
                    c27663Ooooo00.f97285OooOoO0 = enumC27285OooO2;
                    c27663Ooooo00.f97292Oooo00O = 2;
                    if (oooOO0O.OooO00o(oooOO02, c27663Ooooo00) != enumC32485OooO00o) {
                        EnumC27285OooO enumC27285OooO4 = enumC27285OooO2;
                        str2 = str10;
                        enumC27285OooO3 = enumC27285OooO4;
                        c27663Ooooo00.f97283OooOo0o = c27665OooooO0;
                        c27663Ooooo00.f97282OooOo = str2;
                        c27663Ooooo00.f97285OooOoO0 = enumC27285OooO3;
                        c27663Ooooo00.f97292Oooo00O = 3;
                        if (c27665OooooO0.OooO00o(c27663Ooooo00) != enumC32485OooO00o) {
                            InterfaceC27311OooOoOO interfaceC27311OooOoOO = c27665OooooO0.f97305OooO0o0;
                            c27663Ooooo00.f97283OooOo0o = c27665OooooO0;
                            c27663Ooooo00.f97282OooOo = str2;
                            c27663Ooooo00.f97285OooOoO0 = null;
                            c27663Ooooo00.f97292Oooo00O = 4;
                            objOooO00o2 = interfaceC27311OooOoOO.OooO00o(enumC27285OooO3, c27663Ooooo00);
                            if (objOooO00o2 != enumC32485OooO00o) {
                                str3 = str2;
                                c27665OooooO02 = c27665OooooO0;
                                List list2 = (List) objOooO00o2;
                                iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list2, 10));
                                if (iOooO0Oo < 16) {
                                    iOooO0Oo = 16;
                                }
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iOooO0Oo);
                                for (Object obj2 : list2) {
                                    NoteFile noteFile = (NoteFile) obj2;
                                    String mimeType = noteFile.getMimeType();
                                    boolean z2 = z;
                                    if (mimeType == null) {
                                        noteId = noteFile.getNoteId();
                                    } else {
                                        int iHashCode = mimeType.hashCode();
                                        if (iHashCode != -2039968287) {
                                            if (iHashCode != -1214862943) {
                                                if (iHashCode == -956902466 && mimeType.equals("application/vnd.notein-apps.folders")) {
                                                    noteId = noteFile.getFolderId();
                                                }
                                            } else if (mimeType.equals("application/vnd.notein-apps.template")) {
                                                noteId = noteFile.getTemplateId();
                                            }
                                        } else if (mimeType.equals("application/vnd.notein-apps.dbfile")) {
                                            noteId = noteFile.getNoteId();
                                        }
                                    }
                                    if (noteId == null) {
                                        noteId = "";
                                    }
                                    linkedHashMap2.put(noteId, obj2);
                                    z = z2;
                                }
                                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                                    if (!C33599OooOo0O.Oooo0o0((String) entry.getKey())) {
                                        linkedHashMap3.put(entry.getKey(), entry.getValue());
                                    }
                                }
                                Set setKeySet = linkedHashMap3.keySet();
                                C20813OooO0o0 c20813OooO0o0 = c27665OooooO02.f97300OooO00o;
                                c27663Ooooo00.f97283OooOo0o = c27665OooooO02;
                                c27663Ooooo00.f97282OooOo = str3;
                                c27663Ooooo00.f97285OooOoO0 = linkedHashMap3;
                                c27663Ooooo00.f97284OooOoO = setKeySet;
                                c27663Ooooo00.f97292Oooo00O = 5;
                                serializableOooOOo0 = ((InterfaceC27605OooO00o) c20813OooO0o0.f59765OooO00o).OooOOo0(str3, c27663Ooooo00);
                                if (serializableOooOOo0 != enumC32485OooO00o) {
                                    str4 = str3;
                                    c27665OooooO03 = c27665OooooO02;
                                    set = setKeySet;
                                    map = linkedHashMap3;
                                    objOooO00o2 = serializableOooOOo0;
                                    List list3 = (List) objOooO00o2;
                                    ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list3, 10));
                                    it = list3.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((CloudMetaLocal) it.next()).getId());
                                    }
                                    Set set4 = set;
                                    Set setO0OO00O = oOo000Oo.OooOo.o0OO00O(arrayList);
                                    kotlin.jvm.internal.OooOOO0.OooO0oO(set4, "<this>");
                                    setO0Oo0oo = oOo000Oo.OooOo.o0Oo0oo(set4);
                                    setO0Oo0oo.removeAll(C34431OooOo0.OooOoO0(setO0OO00O));
                                    C27715OooO0o c27715OooO0o2 = c27665OooooO03.f97299OooO;
                                    Set setO0OO00O2 = oOo000Oo.OooOo.o0OO00O(setO0Oo0oo);
                                    c27663Ooooo00.f97283OooOo0o = c27665OooooO03;
                                    c27663Ooooo00.f97282OooOo = str4;
                                    c27663Ooooo00.f97285OooOoO0 = map;
                                    c27663Ooooo00.f97284OooOoO = setO0Oo0oo;
                                    c27663Ooooo00.f97292Oooo00O = 6;
                                    objOooO0O0 = c27715OooO0o2.f97755OooO00o.OooO0O0(str4, setO0OO00O2, c27663Ooooo00);
                                    if (objOooO0O0 != EnumC32485OooO00o.f116726OooOo0o) {
                                        objOooO0O0 = C32460OooOooO.f116667OooO00o;
                                    }
                                    if (objOooO0O0 != enumC32485OooO00o) {
                                        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                                        c20358OooO00o2.OooOOO0("LegacyCloudSyncMigration");
                                        c20358OooO00o2.OooO0o0("Metas to migrate " + setO0Oo0oo, new Object[0]);
                                        c20358OooO00o2.OooOOO0("LegacyCloudSyncMigration");
                                        c20358OooO00o2.OooO0o0("Pull remote changes for migration. driveId=%s", str4);
                                        o0O0O00 o0o0o00 = c27665OooooO03.f97301OooO0O0;
                                        c27663Ooooo00.f97283OooOo0o = c27665OooooO03;
                                        c27663Ooooo00.f97282OooOo = str4;
                                        c27663Ooooo00.f97285OooOoO0 = map;
                                        c27663Ooooo00.f97284OooOoO = setO0Oo0oo;
                                        c27663Ooooo00.f97292Oooo00O = 7;
                                        objOooO00o = o0o0o00.OooO00o(c27663Ooooo00);
                                        if (objOooO00o != enumC32485OooO00o) {
                                            set2 = setO0Oo0oo;
                                            obj = objOooO00o;
                                            if (!(obj instanceof C32445OooOOOO.OooO00o)) {
                                                Throwable thOooO00o = C32445OooOOOO.OooO00o(obj);
                                                String message = thOooO00o != null ? thOooO00o.getMessage() : null;
                                                o0OOoO0.OooOO0O oooOO0O2 = c27665OooooO03.f97303OooO0Oo;
                                                o0OOoO0.OooOO0 oooOO04 = new o0OOoO0.OooOO0(str4, o0OOoO0.OooO.f97732OooOoo0, message);
                                                c27663Ooooo00.f97283OooOo0o = obj;
                                                c27663Ooooo00.f97282OooOo = null;
                                                c27663Ooooo00.f97285OooOoO0 = null;
                                                c27663Ooooo00.f97284OooOoO = null;
                                                c27663Ooooo00.f97292Oooo00O = 8;
                                            } else if (set2.isEmpty()) {
                                                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                                                c20358OooO00o3.OooOOO0("LegacyCloudSyncMigration");
                                                c20358OooO00o3.OooO0o0("No metas need to migrate. driveId=%s", str4);
                                                C27715OooO0o c27715OooO0o3 = c27665OooooO03.f97299OooO;
                                                c27663Ooooo00.f97283OooOo0o = c27665OooooO03;
                                                c27663Ooooo00.f97282OooOo = str4;
                                                c27663Ooooo00.f97285OooOoO0 = null;
                                                c27663Ooooo00.f97284OooOoO = null;
                                                c27663Ooooo00.f97292Oooo00O = 9;
                                                if (c27715OooO0o3.OooO00o(str4, c27663Ooooo00) != enumC32485OooO00o) {
                                                    str6 = str4;
                                                    c27665OooooO05 = c27665OooooO03;
                                                    o0OOoO0.OooOO0O oooOO0O3 = c27665OooooO05.f97303OooO0Oo;
                                                    o0OOoO0.OooOO0 oooOO05 = new o0OOoO0.OooOO0(str6, o0OOoO0.OooO.f97730OooOoOO, null);
                                                    c27663Ooooo00.f97283OooOo0o = null;
                                                    c27663Ooooo00.f97282OooOo = null;
                                                    c27663Ooooo00.f97292Oooo00O = 10;
                                                }
                                            } else {
                                                o0OOoO0.OooOO0O oooOO0O4 = c27665OooooO03.f97303OooO0Oo;
                                                o0OOoO0.OooOO0 oooOO06 = new o0OOoO0.OooOO0(str4, o0OOoO0.OooO.f97728OooOoO, null);
                                                c27663Ooooo00.f97283OooOo0o = c27665OooooO03;
                                                c27663Ooooo00.f97282OooOo = str4;
                                                c27663Ooooo00.f97285OooOoO0 = map;
                                                c27663Ooooo00.f97284OooOoO = set2;
                                                c27663Ooooo00.f97292Oooo00O = 11;
                                                if (oooOO0O4.OooO00o(oooOO06, c27663Ooooo00) != enumC32485OooO00o) {
                                                    set3 = set2;
                                                    str5 = str4;
                                                    c27665OooooO04 = c27665OooooO03;
                                                    C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                                                    c20358OooO00o4.OooOOO0("LegacyCloudSyncMigration");
                                                    c20358OooO00o4.OooO0o0("Building local metas for migration. driveId=%s", str5);
                                                    C20813OooO0o0 c20813OooO0o02 = c27665OooooO04.f97300OooO00o;
                                                    c27663Ooooo00.f97283OooOo0o = c27665OooooO04;
                                                    c27663Ooooo00.f97282OooOo = str5;
                                                    c27663Ooooo00.f97285OooOoO0 = map;
                                                    c27663Ooooo00.f97284OooOoO = set3;
                                                    c27663Ooooo00.f97292Oooo00O = 12;
                                                    objOooO00o2 = ((InterfaceC27605OooO00o) c20813OooO0o02.f59765OooO00o).Oooo0o(str5, c27663Ooooo00);
                                                    if (objOooO00o2 != enumC32485OooO00o) {
                                                        str7 = str5;
                                                        c27665OooooO06 = c27665OooooO04;
                                                        map2 = map;
                                                        ArrayList arrayList2 = new ArrayList();
                                                        for (Object obj3 : (Iterable) objOooO00o2) {
                                                            if (set3.contains(((CloudMetaRemote) obj3).getId())) {
                                                                arrayList2.add(obj3);
                                                            }
                                                        }
                                                        c24033OooOooo = new C24033OooOooo();
                                                        c24033OooOooo2 = new C24033OooOooo();
                                                        o0OOO00o.OooO0O0 oooO0O0OooOo0o = c27665OooooO06.f97304OooO0o.OooOo0o(c27665OooooO06.f97306OooO0oO.OooO0Oo());
                                                        c27663Ooooo00.f97283OooOo0o = c27665OooooO06;
                                                        c27663Ooooo00.f97282OooOo = str7;
                                                        c27663Ooooo00.f97285OooOoO0 = map2;
                                                        c27663Ooooo00.f97284OooOoO = arrayList2;
                                                        c27663Ooooo00.f97286OooOoOO = c24033OooOooo;
                                                        c27663Ooooo00.f97288OooOoo0 = c24033OooOooo2;
                                                        c27663Ooooo00.f97292Oooo00O = 13;
                                                        objOooO00o2 = C25252OooO0Oo.OooOOo(oooO0O0OooOo0o, c27663Ooooo00);
                                                        list = arrayList2;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                return enumC32485OooO00o;
            case 1:
                EnumC27285OooO enumC27285OooO5 = (EnumC27285OooO) c27663Ooooo00.f97285OooOoO0;
                String str11 = c27663Ooooo00.f97282OooOo;
                c27665OooooO0 = (C27665OooooO0) c27663Ooooo00.f97283OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO00o2);
                enumC27285OooO2 = enumC27285OooO5;
                str10 = str11;
                oooOO0O = c27665OooooO0.f97303OooO0Oo;
                oooOO02 = new o0OOoO0.OooOO0(str10, o0OOoO0.OooO.f97729OooOoO0, null);
                c27663Ooooo00.f97283OooOo0o = c27665OooooO0;
                c27663Ooooo00.f97282OooOo = str10;
                c27663Ooooo00.f97285OooOoO0 = enumC27285OooO2;
                c27663Ooooo00.f97292Oooo00O = 2;
                if (oooOO0O.OooO00o(oooOO02, c27663Ooooo00) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 2:
                enumC27285OooO3 = (EnumC27285OooO) c27663Ooooo00.f97285OooOoO0;
                str2 = c27663Ooooo00.f97282OooOo;
                c27665OooooO0 = (C27665OooooO0) c27663Ooooo00.f97283OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO00o2);
                c27663Ooooo00.f97283OooOo0o = c27665OooooO0;
                c27663Ooooo00.f97282OooOo = str2;
                c27663Ooooo00.f97285OooOoO0 = enumC27285OooO3;
                c27663Ooooo00.f97292Oooo00O = 3;
                if (c27665OooooO0.OooO00o(c27663Ooooo00) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 3:
                enumC27285OooO3 = (EnumC27285OooO) c27663Ooooo00.f97285OooOoO0;
                str2 = c27663Ooooo00.f97282OooOo;
                c27665OooooO0 = (C27665OooooO0) c27663Ooooo00.f97283OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO00o2);
                InterfaceC27311OooOoOO interfaceC27311OooOoOO2 = c27665OooooO0.f97305OooO0o0;
                c27663Ooooo00.f97283OooOo0o = c27665OooooO0;
                c27663Ooooo00.f97282OooOo = str2;
                c27663Ooooo00.f97285OooOoO0 = null;
                c27663Ooooo00.f97292Oooo00O = 4;
                objOooO00o2 = interfaceC27311OooOoOO2.OooO00o(enumC27285OooO3, c27663Ooooo00);
                if (objOooO00o2 != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 4:
                str3 = c27663Ooooo00.f97282OooOo;
                c27665OooooO02 = (C27665OooooO0) c27663Ooooo00.f97283OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO00o2);
                List list22 = (List) objOooO00o2;
                iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list22, 10));
                if (iOooO0Oo < 16) {
                }
                LinkedHashMap linkedHashMap22 = new LinkedHashMap(iOooO0Oo);
                while (r2.hasNext()) {
                }
                LinkedHashMap linkedHashMap32 = new LinkedHashMap();
                while (r8.hasNext()) {
                }
                Set setKeySet2 = linkedHashMap32.keySet();
                C20813OooO0o0 c20813OooO0o03 = c27665OooooO02.f97300OooO00o;
                c27663Ooooo00.f97283OooOo0o = c27665OooooO02;
                c27663Ooooo00.f97282OooOo = str3;
                c27663Ooooo00.f97285OooOoO0 = linkedHashMap32;
                c27663Ooooo00.f97284OooOoO = setKeySet2;
                c27663Ooooo00.f97292Oooo00O = 5;
                serializableOooOOo0 = ((InterfaceC27605OooO00o) c20813OooO0o03.f59765OooO00o).OooOOo0(str3, c27663Ooooo00);
                if (serializableOooOOo0 != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 5:
                set = (Set) c27663Ooooo00.f97284OooOoO;
                map = (Map) c27663Ooooo00.f97285OooOoO0;
                str4 = c27663Ooooo00.f97282OooOo;
                c27665OooooO03 = (C27665OooooO0) c27663Ooooo00.f97283OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO00o2);
                List list32 = (List) objOooO00o2;
                ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(list32, 10));
                it = list32.iterator();
                while (it.hasNext()) {
                }
                Set set42 = set;
                Set setO0OO00O3 = oOo000Oo.OooOo.o0OO00O(arrayList3);
                kotlin.jvm.internal.OooOOO0.OooO0oO(set42, "<this>");
                setO0Oo0oo = oOo000Oo.OooOo.o0Oo0oo(set42);
                setO0Oo0oo.removeAll(C34431OooOo0.OooOoO0(setO0OO00O3));
                C27715OooO0o c27715OooO0o22 = c27665OooooO03.f97299OooO;
                Set setO0OO00O22 = oOo000Oo.OooOo.o0OO00O(setO0Oo0oo);
                c27663Ooooo00.f97283OooOo0o = c27665OooooO03;
                c27663Ooooo00.f97282OooOo = str4;
                c27663Ooooo00.f97285OooOoO0 = map;
                c27663Ooooo00.f97284OooOoO = setO0Oo0oo;
                c27663Ooooo00.f97292Oooo00O = 6;
                objOooO0O0 = c27715OooO0o22.f97755OooO00o.OooO0O0(str4, setO0OO00O22, c27663Ooooo00);
                if (objOooO0O0 != EnumC32485OooO00o.f116726OooOo0o) {
                }
                if (objOooO0O0 != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 6:
                setO0Oo0oo = (Set) c27663Ooooo00.f97284OooOoO;
                map = (Map) c27663Ooooo00.f97285OooOoO0;
                str4 = c27663Ooooo00.f97282OooOo;
                c27665OooooO03 = (C27665OooooO0) c27663Ooooo00.f97283OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO00o2);
                C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o22.OooOOO0("LegacyCloudSyncMigration");
                c20358OooO00o22.OooO0o0("Metas to migrate " + setO0Oo0oo, new Object[0]);
                c20358OooO00o22.OooOOO0("LegacyCloudSyncMigration");
                c20358OooO00o22.OooO0o0("Pull remote changes for migration. driveId=%s", str4);
                o0O0O00 o0o0o002 = c27665OooooO03.f97301OooO0O0;
                c27663Ooooo00.f97283OooOo0o = c27665OooooO03;
                c27663Ooooo00.f97282OooOo = str4;
                c27663Ooooo00.f97285OooOoO0 = map;
                c27663Ooooo00.f97284OooOoO = setO0Oo0oo;
                c27663Ooooo00.f97292Oooo00O = 7;
                objOooO00o = o0o0o002.OooO00o(c27663Ooooo00);
                if (objOooO00o != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 7:
                Set set5 = (Set) c27663Ooooo00.f97284OooOoO;
                map = (Map) c27663Ooooo00.f97285OooOoO0;
                str4 = c27663Ooooo00.f97282OooOo;
                c27665OooooO03 = (C27665OooooO0) c27663Ooooo00.f97283OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO00o2);
                Object obj4 = ((C32445OooOOOO) objOooO00o2).f116639OooOo0o;
                set2 = set5;
                obj = obj4;
                if (!(obj instanceof C32445OooOOOO.OooO00o)) {
                }
                return enumC32485OooO00o;
            case 8:
                obj = c27663Ooooo00.f97283OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO00o2);
                C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o5.OooOOO0("LegacyCloudSyncMigration");
                c20358OooO00o5.OooO0Oo(C32445OooOOOO.OooO00o(obj), "pullRemoteChanges failed", new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            case 9:
                str6 = c27663Ooooo00.f97282OooOo;
                c27665OooooO05 = (C27665OooooO0) c27663Ooooo00.f97283OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO00o2);
                o0OOoO0.OooOO0O oooOO0O32 = c27665OooooO05.f97303OooO0Oo;
                o0OOoO0.OooOO0 oooOO052 = new o0OOoO0.OooOO0(str6, o0OOoO0.OooO.f97730OooOoOO, null);
                c27663Ooooo00.f97283OooOo0o = null;
                c27663Ooooo00.f97282OooOo = null;
                c27663Ooooo00.f97292Oooo00O = 10;
                break;
            case 10:
                C32446OooOOOo.OooO0O0(objOooO00o2);
                return C32460OooOooO.f116667OooO00o;
            case 11:
                set3 = (Set) c27663Ooooo00.f97284OooOoO;
                map = (Map) c27663Ooooo00.f97285OooOoO0;
                str5 = c27663Ooooo00.f97282OooOo;
                c27665OooooO04 = (C27665OooooO0) c27663Ooooo00.f97283OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO00o2);
                C34406OooO00o.C20358OooO00o c20358OooO00o42 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o42.OooOOO0("LegacyCloudSyncMigration");
                c20358OooO00o42.OooO0o0("Building local metas for migration. driveId=%s", str5);
                C20813OooO0o0 c20813OooO0o022 = c27665OooooO04.f97300OooO00o;
                c27663Ooooo00.f97283OooOo0o = c27665OooooO04;
                c27663Ooooo00.f97282OooOo = str5;
                c27663Ooooo00.f97285OooOoO0 = map;
                c27663Ooooo00.f97284OooOoO = set3;
                c27663Ooooo00.f97292Oooo00O = 12;
                objOooO00o2 = ((InterfaceC27605OooO00o) c20813OooO0o022.f59765OooO00o).Oooo0o(str5, c27663Ooooo00);
                if (objOooO00o2 != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 12:
                set3 = (Set) c27663Ooooo00.f97284OooOoO;
                map = (Map) c27663Ooooo00.f97285OooOoO0;
                str5 = c27663Ooooo00.f97282OooOo;
                c27665OooooO04 = (C27665OooooO0) c27663Ooooo00.f97283OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO00o2);
                str7 = str5;
                c27665OooooO06 = c27665OooooO04;
                map2 = map;
                ArrayList arrayList22 = new ArrayList();
                while (r2.hasNext()) {
                }
                c24033OooOooo = new C24033OooOooo();
                c24033OooOooo2 = new C24033OooOooo();
                o0OOO00o.OooO0O0 oooO0O0OooOo0o2 = c27665OooooO06.f97304OooO0o.OooOo0o(c27665OooooO06.f97306OooO0oO.OooO0Oo());
                c27663Ooooo00.f97283OooOo0o = c27665OooooO06;
                c27663Ooooo00.f97282OooOo = str7;
                c27663Ooooo00.f97285OooOoO0 = map2;
                c27663Ooooo00.f97284OooOoO = arrayList22;
                c27663Ooooo00.f97286OooOoOO = c24033OooOooo;
                c27663Ooooo00.f97288OooOoo0 = c24033OooOooo2;
                c27663Ooooo00.f97292Oooo00O = 13;
                objOooO00o2 = C25252OooO0Oo.OooOOo(oooO0O0OooOo0o2, c27663Ooooo00);
                list = arrayList22;
                break;
            case 13:
                c24033OooOooo2 = (C24033OooOooo) c27663Ooooo00.f97288OooOoo0;
                c24033OooOooo = c27663Ooooo00.f97286OooOoOO;
                List list4 = (List) c27663Ooooo00.f97284OooOoO;
                map2 = (Map) c27663Ooooo00.f97285OooOoO0;
                str7 = c27663Ooooo00.f97282OooOo;
                c27665OooooO06 = (C27665OooooO0) c27663Ooooo00.f97283OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO00o2);
                list = list4;
                List list5 = (List) objOooO00o2;
                int iOooO0Oo2 = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list5, 10));
                if (iOooO0Oo2 < 16) {
                    iOooO0Oo2 = 16;
                }
                linkedHashMap = new LinkedHashMap(iOooO0Oo2);
                for (Object obj5 : list5) {
                    linkedHashMap.put(((NoteMeta) obj5).getId(), obj5);
                }
                it2 = list.iterator();
                if (!it2.hasNext()) {
                    CloudMetaRemote cloudMetaRemote2 = (CloudMetaRemote) it2.next();
                    NoteFile noteFile2 = (NoteFile) map2.get(cloudMetaRemote2.getId());
                    if (noteFile2 == null) {
                        map6 = linkedHashMap;
                        linkedHashMap = map6;
                        if (!it2.hasNext()) {
                            C27663Ooooo00 c27663Ooooo002 = c27663Ooooo00;
                            C34406OooO00o.C20358OooO00o c20358OooO00o6 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o6.OooOOO0("LegacyCloudSyncMigration");
                            c20358OooO00o6.OooO0o0("Migration local meta build done. driveId=%s, built=%d, skipped=%d", str7, new Integer(c24033OooOooo.f80940OooOo0o), new Integer(c24033OooOooo2.f80940OooOo0o));
                            C27715OooO0o c27715OooO0o4 = c27665OooooO06.f97299OooO;
                            c27663Ooooo002.f97283OooOo0o = c27665OooooO06;
                            c27663Ooooo002.f97282OooOo = str7;
                            c27663Ooooo002.f97285OooOoO0 = null;
                            c27663Ooooo002.f97284OooOoO = null;
                            c27663Ooooo002.f97286OooOoOO = null;
                            c27663Ooooo002.f97288OooOoo0 = null;
                            c27663Ooooo002.f97287OooOoo = null;
                            c27663Ooooo002.f97292Oooo00O = 17;
                            if (c27715OooO0o4.OooO00o(str7, c27663Ooooo002) != enumC32485OooO00o) {
                                c27663Ooooo00 = c27663Ooooo002;
                                str9 = str7;
                                c27665OooooO08 = c27665OooooO06;
                                o0OOoO0.OooOO0O oooOO0O5 = c27665OooooO08.f97303OooO0Oo;
                                o0OOoO0.OooOO0 oooOO07 = new o0OOoO0.OooOO0(str9, o0OOoO0.OooO.f97730OooOoOO, null);
                                c27663Ooooo00.f97283OooOo0o = str9;
                                c27663Ooooo00.f97282OooOo = null;
                                c27663Ooooo00.f97292Oooo00O = 18;
                            }
                            break;
                        }
                    } else {
                        NoteMeta noteMeta = (NoteMeta) linkedHashMap.get(cloudMetaRemote2.getId());
                        C27718OooO0oo c27718OooO0oo = c27665OooooO06.f97307OooO0oo;
                        c27663Ooooo00.f97283OooOo0o = c27665OooooO06;
                        c27663Ooooo00.f97282OooOo = str7;
                        c27663Ooooo00.f97285OooOoO0 = map2;
                        c27663Ooooo00.f97284OooOoO = c24033OooOooo;
                        c27663Ooooo00.f97286OooOoOO = c24033OooOooo2;
                        c27663Ooooo00.f97288OooOoo0 = linkedHashMap;
                        c27663Ooooo00.f97287OooOoo = it2;
                        c27663Ooooo00.f97289OooOooO = cloudMetaRemote2;
                        c27663Ooooo00.f97292Oooo00O = 14;
                        C27663Ooooo00 c27663Ooooo003 = c27663Ooooo00;
                        Object objOooO00o3 = c27718OooO0oo.OooO00o(cloudMetaRemote2, noteFile2, str7, noteMeta, c27663Ooooo003);
                        if (objOooO00o3 != enumC32485OooO00o) {
                            c24033OooOooo3 = c24033OooOooo2;
                            c27665OooooO07 = c27665OooooO06;
                            cloudMetaRemote = cloudMetaRemote2;
                            str8 = str7;
                            map4 = map2;
                            c24033OooOooo4 = c24033OooOooo;
                            it3 = it2;
                            objOooO00o2 = objOooO00o3;
                            c27663Ooooo00 = c27663Ooooo003;
                            map3 = linkedHashMap;
                            cloudMetaLocal = (CloudMetaLocal) objOooO00o2;
                            if (cloudMetaLocal == null) {
                                C20813OooO0o0 c20813OooO0o04 = c27665OooooO07.f97300OooO00o;
                                c27663Ooooo00.f97283OooOo0o = c27665OooooO07;
                                c27663Ooooo00.f97282OooOo = str8;
                                c27663Ooooo00.f97285OooOoO0 = map4;
                                c27663Ooooo00.f97284OooOoO = c24033OooOooo4;
                                c27663Ooooo00.f97286OooOoOO = c24033OooOooo3;
                                c27663Ooooo00.f97288OooOoo0 = map3;
                                c27663Ooooo00.f97287OooOoo = it3;
                                c27663Ooooo00.f97289OooOooO = cloudMetaRemote;
                                c27663Ooooo00.f97292Oooo00O = 15;
                                Object objOooOOOO = ((InterfaceC27605OooO00o) c20813OooO0o04.f59765OooO00o).OooOOOO(cloudMetaLocal, c27663Ooooo00);
                                if (objOooOOOO != EnumC32485OooO00o.f116726OooOo0o) {
                                    objOooOOOO = C32460OooOooO.f116667OooO00o;
                                }
                                break;
                            } else {
                                c24033OooOooo3.f80940OooOo0o++;
                                c27715OooO0o = c27665OooooO07.f97299OooO;
                                driveId = cloudMetaRemote.getDriveId();
                                id = cloudMetaRemote.getId();
                                c27663Ooooo00.f97283OooOo0o = c27665OooooO07;
                                c27663Ooooo00.f97282OooOo = str8;
                                c27663Ooooo00.f97285OooOoO0 = map4;
                                c27663Ooooo00.f97284OooOoO = c24033OooOooo4;
                                c27663Ooooo00.f97286OooOoOO = c24033OooOooo3;
                                c27663Ooooo00.f97288OooOoo0 = map3;
                                c27663Ooooo00.f97287OooOoo = it3;
                                c27663Ooooo00.f97289OooOooO = null;
                                c27663Ooooo00.f97292Oooo00O = 16;
                                if (c27715OooO0o.OooO0o0(driveId, id, c27663Ooooo00) != enumC32485OooO00o) {
                                    it4 = it3;
                                    map5 = map3;
                                    c24033OooOooo5 = c24033OooOooo3;
                                    c24033OooOooo6 = c24033OooOooo4;
                                    map2 = map4;
                                    str7 = str8;
                                    c27665OooooO06 = c27665OooooO07;
                                    it2 = it4;
                                    c24033OooOooo2 = c24033OooOooo5;
                                    map6 = map5;
                                    c24033OooOooo = c24033OooOooo6;
                                    linkedHashMap = map6;
                                    if (!it2.hasNext()) {
                                    }
                                }
                            }
                        }
                    }
                }
                return enumC32485OooO00o;
            case 14:
                cloudMetaRemote = c27663Ooooo00.f97289OooOooO;
                it3 = c27663Ooooo00.f97287OooOoo;
                map3 = (Map) c27663Ooooo00.f97288OooOoo0;
                c24033OooOooo3 = c27663Ooooo00.f97286OooOoOO;
                c24033OooOooo4 = (C24033OooOooo) c27663Ooooo00.f97284OooOoO;
                map4 = (Map) c27663Ooooo00.f97285OooOoO0;
                str8 = c27663Ooooo00.f97282OooOo;
                c27665OooooO07 = (C27665OooooO0) c27663Ooooo00.f97283OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO00o2);
                cloudMetaLocal = (CloudMetaLocal) objOooO00o2;
                if (cloudMetaLocal == null) {
                }
                break;
            case 15:
                cloudMetaRemote = c27663Ooooo00.f97289OooOooO;
                it3 = c27663Ooooo00.f97287OooOoo;
                map3 = (Map) c27663Ooooo00.f97288OooOoo0;
                c24033OooOooo3 = c27663Ooooo00.f97286OooOoOO;
                c24033OooOooo4 = (C24033OooOooo) c27663Ooooo00.f97284OooOoO;
                map4 = (Map) c27663Ooooo00.f97285OooOoO0;
                str8 = c27663Ooooo00.f97282OooOo;
                c27665OooooO07 = (C27665OooooO0) c27663Ooooo00.f97283OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO00o2);
                c24033OooOooo4.f80940OooOo0o++;
                c27715OooO0o = c27665OooooO07.f97299OooO;
                driveId = cloudMetaRemote.getDriveId();
                id = cloudMetaRemote.getId();
                c27663Ooooo00.f97283OooOo0o = c27665OooooO07;
                c27663Ooooo00.f97282OooOo = str8;
                c27663Ooooo00.f97285OooOoO0 = map4;
                c27663Ooooo00.f97284OooOoO = c24033OooOooo4;
                c27663Ooooo00.f97286OooOoOO = c24033OooOooo3;
                c27663Ooooo00.f97288OooOoo0 = map3;
                c27663Ooooo00.f97287OooOoo = it3;
                c27663Ooooo00.f97289OooOooO = null;
                c27663Ooooo00.f97292Oooo00O = 16;
                if (c27715OooO0o.OooO0o0(driveId, id, c27663Ooooo00) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 16:
                it4 = c27663Ooooo00.f97287OooOoo;
                map5 = (Map) c27663Ooooo00.f97288OooOoo0;
                c24033OooOooo5 = c27663Ooooo00.f97286OooOoOO;
                c24033OooOooo6 = (C24033OooOooo) c27663Ooooo00.f97284OooOoO;
                map2 = (Map) c27663Ooooo00.f97285OooOoO0;
                str7 = c27663Ooooo00.f97282OooOo;
                c27665OooooO06 = (C27665OooooO0) c27663Ooooo00.f97283OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO00o2);
                it2 = it4;
                c24033OooOooo2 = c24033OooOooo5;
                map6 = map5;
                c24033OooOooo = c24033OooOooo6;
                linkedHashMap = map6;
                if (!it2.hasNext()) {
                }
                return enumC32485OooO00o;
            case 17:
                str9 = c27663Ooooo00.f97282OooOo;
                c27665OooooO08 = (C27665OooooO0) c27663Ooooo00.f97283OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO00o2);
                o0OOoO0.OooOO0O oooOO0O52 = c27665OooooO08.f97303OooO0Oo;
                o0OOoO0.OooOO0 oooOO072 = new o0OOoO0.OooOO0(str9, o0OOoO0.OooO.f97730OooOoOO, null);
                c27663Ooooo00.f97283OooOo0o = str9;
                c27663Ooooo00.f97282OooOo = null;
                c27663Ooooo00.f97292Oooo00O = 18;
                break;
            case 18:
                str9 = (String) c27663Ooooo00.f97283OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO00o2);
                C34406OooO00o.C20358OooO00o c20358OooO00o7 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o7.OooOOO0("LegacyCloudSyncMigration");
                c20358OooO00o7.OooO0o0("Migration done. driveId=%s", str9);
                return C32460OooOooO.f116667OooO00o;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0055: MOVE (r0 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]), block:B:28:0x0055 */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0OO(AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C27664Ooooo0o c27664Ooooo0o;
        C27665OooooO0 c27665OooooO0;
        C27665OooooO0 c27665OooooO02;
        C27665OooooO0 c27665OooooO03;
        String str;
        EnumC27285OooO enumC27285OooO;
        EnumC27285OooO enumC27285OooO2;
        o0OOoO0.OooO oooO;
        String str2;
        EnumC27285OooO enumC27285OooO3;
        C27665OooooO0 c27665OooooO04;
        o0OOoO0.OooOO0O oooOO0O;
        o0OOoO0.OooOO0 oooOO02;
        AtomicBoolean atomicBoolean;
        if (abstractC32479OooO0OO instanceof C27664Ooooo0o) {
            c27664Ooooo0o = (C27664Ooooo0o) abstractC32479OooO0OO;
            int i = c27664Ooooo0o.f97298OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27664Ooooo0o.f97298OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c27664Ooooo0o = new C27664Ooooo0o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0Oo = c27664Ooooo0o.f97295OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        try {
            switch (c27664Ooooo0o.f97298OooOoo0) {
                case 0:
                    C32446OooOOOo.OooO0O0(objOooO0Oo);
                    c27664Ooooo0o.f97294OooOo0o = this;
                    c27664Ooooo0o.f97298OooOoo0 = 1;
                    objOooO0Oo = this.f97302OooO0OO.OooO0Oo(c27664Ooooo0o);
                    if (objOooO0Oo != enumC32485OooO00o) {
                        c27665OooooO03 = this;
                        str = (String) objOooO0Oo;
                        if (str != null) {
                            return C32460OooOooO.f116667OooO00o;
                        }
                        C27616OooO0o c27616OooO0o = c27665OooooO03.f97302OooO0OO;
                        c27664Ooooo0o.f97294OooOo0o = c27665OooooO03;
                        c27664Ooooo0o.f97293OooOo = str;
                        c27664Ooooo0o.f97298OooOoo0 = 2;
                        objOooO0Oo = c27616OooO0o.OooO0OO(c27664Ooooo0o);
                        if (objOooO0Oo != enumC32485OooO00o) {
                            enumC27285OooO = (EnumC27285OooO) objOooO0Oo;
                            if (enumC27285OooO != EnumC27285OooO.f95076OooOo0o) {
                                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o.OooOOO0("LegacyCloudSyncMigration");
                                c20358OooO00o.OooO0o0("Cloud sync not authorized, skip migration.", new Object[0]);
                                return C32460OooOooO.f116667OooO00o;
                            }
                            o0OOoO0.OooOO0O oooOO0O2 = c27665OooooO03.f97303OooO0Oo;
                            c27664Ooooo0o.f97294OooOo0o = c27665OooooO03;
                            c27664Ooooo0o.f97293OooOo = str;
                            c27664Ooooo0o.f97296OooOoO0 = enumC27285OooO;
                            c27664Ooooo0o.f97298OooOoo0 = 3;
                            Object objOooO0o0 = oooOO0O2.OooO0o0(str, c27664Ooooo0o);
                            if (objOooO0o0 != enumC32485OooO00o) {
                                enumC27285OooO2 = enumC27285OooO;
                                objOooO0Oo = objOooO0o0;
                                o0OOoO0.OooOO0 oooOO03 = (o0OOoO0.OooOO0) objOooO0Oo;
                                oooO = oooOO03 == null ? oooOO03.f97776OooO0O0 : null;
                                if (oooO != o0OOoO0.OooO.f97730OooOoOO) {
                                    return C32460OooOooO.f116667OooO00o;
                                }
                                if (!c27665OooooO03.f97309OooOO0O.compareAndSet(false, true)) {
                                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                                    c20358OooO00o2.OooOOO0("LegacyCloudSyncMigration");
                                    c20358OooO00o2.OooO0o0("Migration already in progress, skip. driveId=%s", str);
                                    return C32460OooOooO.f116667OooO00o;
                                }
                                try {
                                } catch (Exception e) {
                                    e = e;
                                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                                    c20358OooO00o3.OooOOO0("LegacyCloudSyncMigration");
                                    c20358OooO00o3.OooO0Oo(e, "Migration failed with exception. driveId=%s", str);
                                    oooOO0O = c27665OooooO03.f97303OooO0Oo;
                                    oooOO02 = new o0OOoO0.OooOO0(str, o0OOoO0.OooO.f97732OooOoo0, e.getMessage());
                                    c27664Ooooo0o.f97294OooOo0o = c27665OooooO03;
                                    c27664Ooooo0o.f97293OooOo = null;
                                    c27664Ooooo0o.f97296OooOoO0 = null;
                                    c27664Ooooo0o.f97298OooOoo0 = 6;
                                    if (oooOO0O.OooO00o(oooOO02, c27664Ooooo0o) != enumC32485OooO00o) {
                                    }
                                }
                                if (oooO == o0OOoO0.OooO.f97726OooOo || oooO == o0OOoO0.OooO.f97729OooOoO0 || oooO == o0OOoO0.OooO.f97728OooOoO) {
                                    C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                                    c20358OooO00o4.OooOOO0("LegacyCloudSyncMigration");
                                    c20358OooO00o4.OooOO0O("Resetting stuck migration (crash recovery). driveId=%s, phase=%s", str, oooO);
                                    o0OOoO0.OooOO0O oooOO0O3 = c27665OooooO03.f97303OooO0Oo;
                                    o0OOoO0.OooOO0 oooOO04 = new o0OOoO0.OooOO0(str, o0OOoO0.OooO.f97727OooOo0o, null);
                                    c27664Ooooo0o.f97294OooOo0o = c27665OooooO03;
                                    c27664Ooooo0o.f97293OooOo = str;
                                    c27664Ooooo0o.f97296OooOoO0 = enumC27285OooO2;
                                    c27664Ooooo0o.f97298OooOoo0 = 4;
                                    if (oooOO0O3.OooO00o(oooOO04, c27664Ooooo0o) != enumC32485OooO00o) {
                                        str2 = str;
                                        enumC27285OooO3 = enumC27285OooO2;
                                        enumC27285OooO2 = enumC27285OooO3;
                                        str = str2;
                                        c27664Ooooo0o.f97294OooOo0o = c27665OooooO03;
                                        c27664Ooooo0o.f97293OooOo = str;
                                        c27664Ooooo0o.f97296OooOoO0 = null;
                                        c27664Ooooo0o.f97298OooOoo0 = 5;
                                        if (c27665OooooO03.OooO0O0(str, enumC27285OooO2, c27664Ooooo0o) != enumC32485OooO00o) {
                                            c27665OooooO04 = c27665OooooO03;
                                            atomicBoolean = c27665OooooO04.f97309OooOO0O;
                                            atomicBoolean.set(false);
                                            return C32460OooOooO.f116667OooO00o;
                                        }
                                    }
                                } else {
                                    c27664Ooooo0o.f97294OooOo0o = c27665OooooO03;
                                    c27664Ooooo0o.f97293OooOo = str;
                                    c27664Ooooo0o.f97296OooOoO0 = null;
                                    c27664Ooooo0o.f97298OooOoo0 = 5;
                                    if (c27665OooooO03.OooO0O0(str, enumC27285OooO2, c27664Ooooo0o) != enumC32485OooO00o) {
                                    }
                                }
                            }
                        }
                    }
                    return enumC32485OooO00o;
                case 1:
                    C27665OooooO0 c27665OooooO05 = c27664Ooooo0o.f97294OooOo0o;
                    C32446OooOOOo.OooO0O0(objOooO0Oo);
                    c27665OooooO03 = c27665OooooO05;
                    str = (String) objOooO0Oo;
                    if (str != null) {
                    }
                    break;
                case 2:
                    str = c27664Ooooo0o.f97293OooOo;
                    c27665OooooO03 = c27664Ooooo0o.f97294OooOo0o;
                    C32446OooOOOo.OooO0O0(objOooO0Oo);
                    enumC27285OooO = (EnumC27285OooO) objOooO0Oo;
                    if (enumC27285OooO != EnumC27285OooO.f95076OooOo0o) {
                    }
                    break;
                case 3:
                    EnumC27285OooO enumC27285OooO4 = c27664Ooooo0o.f97296OooOoO0;
                    String str3 = c27664Ooooo0o.f97293OooOo;
                    C27665OooooO0 c27665OooooO06 = c27664Ooooo0o.f97294OooOo0o;
                    C32446OooOOOo.OooO0O0(objOooO0Oo);
                    enumC27285OooO2 = enumC27285OooO4;
                    str = str3;
                    c27665OooooO03 = c27665OooooO06;
                    o0OOoO0.OooOO0 oooOO032 = (o0OOoO0.OooOO0) objOooO0Oo;
                    if (oooOO032 == null) {
                    }
                    if (oooO != o0OOoO0.OooO.f97730OooOoOO) {
                    }
                    break;
                case 4:
                    enumC27285OooO3 = c27664Ooooo0o.f97296OooOoO0;
                    str2 = c27664Ooooo0o.f97293OooOo;
                    c27665OooooO03 = c27664Ooooo0o.f97294OooOo0o;
                    try {
                        C32446OooOOOo.OooO0O0(objOooO0Oo);
                        enumC27285OooO2 = enumC27285OooO3;
                        str = str2;
                        c27664Ooooo0o.f97294OooOo0o = c27665OooooO03;
                        c27664Ooooo0o.f97293OooOo = str;
                        c27664Ooooo0o.f97296OooOoO0 = null;
                        c27664Ooooo0o.f97298OooOoo0 = 5;
                        if (c27665OooooO03.OooO0O0(str, enumC27285OooO2, c27664Ooooo0o) != enumC32485OooO00o) {
                        }
                    } catch (Exception e2) {
                        e = e2;
                        str = str2;
                        C34406OooO00o.C20358OooO00o c20358OooO00o32 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o32.OooOOO0("LegacyCloudSyncMigration");
                        c20358OooO00o32.OooO0Oo(e, "Migration failed with exception. driveId=%s", str);
                        oooOO0O = c27665OooooO03.f97303OooO0Oo;
                        oooOO02 = new o0OOoO0.OooOO0(str, o0OOoO0.OooO.f97732OooOoo0, e.getMessage());
                        c27664Ooooo0o.f97294OooOo0o = c27665OooooO03;
                        c27664Ooooo0o.f97293OooOo = null;
                        c27664Ooooo0o.f97296OooOoO0 = null;
                        c27664Ooooo0o.f97298OooOoo0 = 6;
                        if (oooOO0O.OooO00o(oooOO02, c27664Ooooo0o) != enumC32485OooO00o) {
                            c27665OooooO02 = c27665OooooO03;
                            atomicBoolean = c27665OooooO02.f97309OooOO0O;
                            atomicBoolean.set(false);
                            return C32460OooOooO.f116667OooO00o;
                        }
                    }
                    return enumC32485OooO00o;
                case 5:
                    str = c27664Ooooo0o.f97293OooOo;
                    c27665OooooO04 = c27664Ooooo0o.f97294OooOo0o;
                    try {
                        C32446OooOOOo.OooO0O0(objOooO0Oo);
                        atomicBoolean = c27665OooooO04.f97309OooOO0O;
                    } catch (Exception e3) {
                        e = e3;
                        c27665OooooO03 = c27665OooooO04;
                        C34406OooO00o.C20358OooO00o c20358OooO00o322 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o322.OooOOO0("LegacyCloudSyncMigration");
                        c20358OooO00o322.OooO0Oo(e, "Migration failed with exception. driveId=%s", str);
                        oooOO0O = c27665OooooO03.f97303OooO0Oo;
                        oooOO02 = new o0OOoO0.OooOO0(str, o0OOoO0.OooO.f97732OooOoo0, e.getMessage());
                        c27664Ooooo0o.f97294OooOo0o = c27665OooooO03;
                        c27664Ooooo0o.f97293OooOo = null;
                        c27664Ooooo0o.f97296OooOoO0 = null;
                        c27664Ooooo0o.f97298OooOoo0 = 6;
                        if (oooOO0O.OooO00o(oooOO02, c27664Ooooo0o) != enumC32485OooO00o) {
                        }
                        return enumC32485OooO00o;
                    } catch (Throwable th) {
                        th = th;
                        c27665OooooO02 = c27665OooooO04;
                        c27665OooooO02.f97309OooOO0O.set(false);
                        throw th;
                    }
                    atomicBoolean.set(false);
                    return C32460OooOooO.f116667OooO00o;
                case 6:
                    c27665OooooO02 = c27664Ooooo0o.f97294OooOo0o;
                    try {
                        C32446OooOOOo.OooO0O0(objOooO0Oo);
                        atomicBoolean = c27665OooooO02.f97309OooOO0O;
                        atomicBoolean.set(false);
                        return C32460OooOooO.f116667OooO00o;
                    } catch (Throwable th2) {
                        th = th2;
                        c27665OooooO02.f97309OooOO0O.set(false);
                        throw th;
                    }
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Throwable th3) {
            th = th3;
            c27665OooooO02 = c27665OooooO0;
        }
    }
}
