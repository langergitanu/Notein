package o0OOo0oo;

import OooOo.C20485OooOoO;
import OooOoo.C20593OooO0Oo;
import com.aspose.slides.C22201OooO0oO;
import com.aspose.slides.C22205OooOOo;
import com.orion.notein.domain.models.cloudsync.CloudBundle;
import com.orion.notein.domain.models.cloudsync.CloudContentTag;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtraKt;
import com.orion.notein.domain.models.cloudsync.CloudMetaLocal;
import com.orion.notein.domain.models.cloudsync.CloudMetaRemote;
import com.orion.notein.domain.models.cloudsync.CloudMetaType;
import com.orion.notein.domain.models.cloudsync.CloudSyncError;
import com.orion.notein.domain.models.cloudsync.ConflictResolution;
import com.orion.notein.domain.models.cloudsync.SyncPhase;
import com.orion.notein.domain.models.cloudsync.SyncPostAction;
import java.io.File;
import java.util.Map;
import kotlin.jvm.internal.C24034Oooo00O;
import o0OOo0o0.InterfaceC27605OooO00o;
import o0OOo0oo.o0000;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0O0o.C33599OooOo0O;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOo0oo.o00000oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27677o00000oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC27605OooO00o f97421OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C27643Oooo0 f97422OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000OO f97423OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0OOO0o f97424OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Map<CloudMetaType, InterfaceC27660OoooOo0> f97425OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0000 f97426OooO0o0;

    public C27677o00000oo(InterfaceC27605OooO00o repo, C27643Oooo0 c27643Oooo0, o000OO o000oo2, o0OOO0o o0ooo0o2, o0000 resolveRemoteNotFound, Map<CloudMetaType, InterfaceC27660OoooOo0> map) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(repo, "repo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(resolveRemoteNotFound, "resolveRemoteNotFound");
        this.f97421OooO00o = repo;
        this.f97422OooO0O0 = c27643Oooo0;
        this.f97423OooO0OO = o000oo2;
        this.f97424OooO0Oo = o0ooo0o2;
        this.f97426OooO0o0 = resolveRemoteNotFound;
        this.f97425OooO0o = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(String str, CloudMetaLocal cloudMetaLocal, CloudMetaRemote cloudMetaRemote, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o00000OO o00000oo2;
        Object objOooO0O0;
        CloudMetaLocal cloudMetaLocal2;
        CloudMetaRemote cloudMetaRemote2;
        if (abstractC32479OooO0OO instanceof o00000OO) {
            o00000oo2 = (o00000OO) abstractC32479OooO0OO;
            int i = o00000oo2.f97403OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o00000oo2.f97403OooOoOO = i - Integer.MIN_VALUE;
            } else {
                o00000oo2 = new o00000OO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = o00000oo2.f97402OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o00000oo2.f97403OooOoOO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("ResolveConflictUseCase");
                c20358OooO00o.OooO0o0("Handling cloud deleted conflict for " + str, new Object[0]);
                CloudBundle cloudBundle = new CloudBundle(null, null, cloudMetaRemote.getExtra(), CloudMetaExtraKt.computeMetaHash(cloudMetaRemote.getExtra()), cloudMetaRemote.getMimeType());
                o000OO o000oo2 = this.f97423OooO0OO;
                o00000oo2.f97400OooOo0o = cloudMetaLocal;
                o00000oo2.f97399OooOo = cloudMetaRemote;
                o00000oo2.f97403OooOoOO = 1;
                objOooO0O0 = o000oo2.OooO0O0(cloudMetaLocal, cloudBundle, o00000oo2);
                if (objOooO0O0 == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                cloudMetaLocal2 = cloudMetaLocal;
                cloudMetaRemote2 = cloudMetaRemote;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cloudMetaRemote2 = o00000oo2.f97399OooOo;
                CloudMetaLocal cloudMetaLocal3 = o00000oo2.f97400OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooO0O0 = ((C32445OooOOOO) obj).f116639OooOo0o;
                cloudMetaLocal2 = cloudMetaLocal3;
            }
            C32446OooOOOo.OooO0O0(objOooO0O0);
            return new ConflictResolution(CloudMetaLocal.copy$default(cloudMetaLocal2, null, null, null, cloudMetaRemote2.getMetaVersion(), cloudMetaLocal2.getContentTag(), cloudMetaRemote2.getMetaHash(), null, null, false, cloudMetaRemote2.getDeleted(), cloudMetaRemote2.getLastSyncTime(), null, 2439, null), null, 2, null);
        } catch (Throwable th) {
            return C32446OooOOOo.OooO00o(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(String str, CloudMetaLocal cloudMetaLocal, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27674o00000Oo c27674o00000Oo;
        Object objOooO0O0;
        CloudMetaLocal cloudMetaLocal2 = cloudMetaLocal;
        if (abstractC32479OooO0OO instanceof C27674o00000Oo) {
            c27674o00000Oo = (C27674o00000Oo) abstractC32479OooO0OO;
            int i = c27674o00000Oo.f97406OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27674o00000Oo.f97406OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27674o00000Oo = new C27674o00000Oo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27674o00000Oo.f97404OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27674o00000Oo.f97406OooOoO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("ResolveConflictUseCase");
                c20358OooO00o.OooO0o0("Handling remote not found conflict for " + str, new Object[0]);
                o0000 o0000Var = this.f97426OooO0o0;
                SyncPhase syncPhase = SyncPhase.UPLOADING;
                c27674o00000Oo.f97405OooOo0o = cloudMetaLocal2;
                c27674o00000Oo.f97406OooOoO = 1;
                objOooO0O0 = o0000Var.OooO0O0(cloudMetaLocal2, syncPhase, c27674o00000Oo);
                if (objOooO0O0 == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cloudMetaLocal2 = c27674o00000Oo.f97405OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooO0O0 = ((C32445OooOOOO) obj).f116639OooOo0o;
            }
            CloudMetaLocal cloudMetaLocal3 = cloudMetaLocal2;
            C32446OooOOOo.OooO0O0(objOooO0O0);
            return new ConflictResolution(CloudMetaLocal.copy$default(cloudMetaLocal3, null, null, null, 0, null, null, null, null, false, false, 0L, null, 4031, null), ((o0000.OooO00o) objOooO0O0).f97353OooO00o);
        } catch (Throwable th) {
            return C32446OooOOOo.OooO00o(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0OO(String str, CloudMetaLocal cloudMetaLocal, CloudMetaRemote cloudMetaRemote, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27675o00000o0 c27675o00000o0;
        Object objOooO0O0;
        CloudMetaLocal cloudMetaLocal2;
        CloudMetaRemote cloudMetaRemote2;
        if (abstractC32479OooO0OO instanceof C27675o00000o0) {
            c27675o00000o0 = (C27675o00000o0) abstractC32479OooO0OO;
            int i = c27675o00000o0.f97412OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27675o00000o0.f97412OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27675o00000o0 = new C27675o00000o0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27675o00000o0.f97411OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27675o00000o0.f97412OooOoOO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("ResolveConflictUseCase");
                c20358OooO00o.OooO0o0("Handling meta version stale for " + str, new Object[0]);
                CloudBundle cloudBundle = new CloudBundle(null, null, cloudMetaRemote.getExtra(), CloudMetaExtraKt.computeMetaHash(cloudMetaRemote.getExtra()), cloudMetaRemote.getMimeType());
                o000OO o000oo2 = this.f97423OooO0OO;
                c27675o00000o0.f97409OooOo0o = cloudMetaLocal;
                c27675o00000o0.f97408OooOo = cloudMetaRemote;
                c27675o00000o0.f97412OooOoOO = 1;
                objOooO0O0 = o000oo2.OooO0O0(cloudMetaLocal, cloudBundle, c27675o00000o0);
                if (objOooO0O0 == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                cloudMetaLocal2 = cloudMetaLocal;
                cloudMetaRemote2 = cloudMetaRemote;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cloudMetaRemote2 = c27675o00000o0.f97408OooOo;
                CloudMetaLocal cloudMetaLocal3 = c27675o00000o0.f97409OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooO0O0 = ((C32445OooOOOO) obj).f116639OooOo0o;
                cloudMetaLocal2 = cloudMetaLocal3;
            }
            C32446OooOOOo.OooO0O0(objOooO0O0);
            return new ConflictResolution(CloudMetaLocal.copy$default(cloudMetaLocal2, null, null, null, cloudMetaRemote2.getMetaVersion(), cloudMetaRemote2.getContentTag(), cloudMetaRemote2.getMetaHash(), null, null, false, cloudMetaRemote2.getDeleted(), cloudMetaRemote2.getLastSyncTime(), null, 2439, null), null, 2, null);
        } catch (Throwable th) {
            return C32446OooOOOo.OooO00o(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x0476, code lost:
    
        if (r2 == r1) goto L172;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03c1 A[Catch: all -> 0x03d4, TryCatch #2 {all -> 0x03d4, blocks: (B:107:0x0391, B:109:0x03c1, B:114:0x03cb, B:118:0x03da, B:117:0x03d8), top: B:158:0x0391 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x024e A[Catch: all -> 0x03f2, TRY_LEAVE, TryCatch #1 {all -> 0x03f2, blocks: (B:59:0x023e, B:62:0x024e), top: B:156:0x023e }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x030d A[Catch: all -> 0x034f, TRY_LEAVE, TryCatch #10 {all -> 0x034f, blocks: (B:82:0x0306, B:84:0x030d, B:95:0x0351, B:98:0x0356, B:100:0x035a), top: B:173:0x0306 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0351 A[Catch: all -> 0x034f, TRY_ENTER, TryCatch #10 {all -> 0x034f, blocks: (B:82:0x0306, B:84:0x030d, B:95:0x0351, B:98:0x0356, B:100:0x035a), top: B:173:0x0306 }] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v36, types: [int] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v42, types: [o0OOo0oo.o000OO] */
    /* JADX WARN: Type inference failed for: r0v45, types: [o0OOo0oo.o000OO] */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r0v71 */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r0v73 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r11v1, types: [kotlin.jvm.internal.Oooo00O] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v15, types: [kotlin.jvm.internal.Oooo00O] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17, types: [kotlin.jvm.internal.Oooo00O] */
    /* JADX WARN: Type inference failed for: r11v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v20, types: [kotlin.jvm.internal.Oooo00O] */
    /* JADX WARN: Type inference failed for: r11v21, types: [o0OOo0oo.o00000oo] */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r11v37 */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r11v39 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r11v41 */
    /* JADX WARN: Type inference failed for: r11v42 */
    /* JADX WARN: Type inference failed for: r11v43 */
    /* JADX WARN: Type inference failed for: r11v44 */
    /* JADX WARN: Type inference failed for: r11v45 */
    /* JADX WARN: Type inference failed for: r11v46 */
    /* JADX WARN: Type inference failed for: r11v47 */
    /* JADX WARN: Type inference failed for: r11v48 */
    /* JADX WARN: Type inference failed for: r11v49 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v41 */
    /* JADX WARN: Type inference failed for: r12v43 */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r13v1, types: [com.orion.notein.domain.models.cloudsync.CloudMetaLocal] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v20, types: [com.orion.notein.domain.models.cloudsync.CloudMetaLocal] */
    /* JADX WARN: Type inference failed for: r13v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v24, types: [com.orion.notein.domain.models.cloudsync.CloudMetaLocal] */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v34, types: [com.orion.notein.domain.models.cloudsync.CloudMetaType, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v36 */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r13v38 */
    /* JADX WARN: Type inference failed for: r13v39 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v42 */
    /* JADX WARN: Type inference failed for: r13v43 */
    /* JADX WARN: Type inference failed for: r13v44 */
    /* JADX WARN: Type inference failed for: r13v45 */
    /* JADX WARN: Type inference failed for: r13v46 */
    /* JADX WARN: Type inference failed for: r13v47 */
    /* JADX WARN: Type inference failed for: r13v48 */
    /* JADX WARN: Type inference failed for: r13v49 */
    /* JADX WARN: Type inference failed for: r13v51 */
    /* JADX WARN: Type inference failed for: r13v52 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v1, types: [o0OOo0oo.o00000oo] */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.lang.Object, o0OOo0oo.o00000oo] */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12, types: [java.lang.Object, o0OOo0oo.o00000oo] */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v22, types: [o0OOo0oo.o00000oo] */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24, types: [kotlin.jvm.internal.Oooo00O] */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r14v33 */
    /* JADX WARN: Type inference failed for: r14v34 */
    /* JADX WARN: Type inference failed for: r14v35 */
    /* JADX WARN: Type inference failed for: r14v38 */
    /* JADX WARN: Type inference failed for: r14v39 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v40 */
    /* JADX WARN: Type inference failed for: r14v41 */
    /* JADX WARN: Type inference failed for: r14v42 */
    /* JADX WARN: Type inference failed for: r14v43 */
    /* JADX WARN: Type inference failed for: r14v44 */
    /* JADX WARN: Type inference failed for: r14v45 */
    /* JADX WARN: Type inference failed for: r14v46 */
    /* JADX WARN: Type inference failed for: r14v47 */
    /* JADX WARN: Type inference failed for: r14v48 */
    /* JADX WARN: Type inference failed for: r14v49 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v50 */
    /* JADX WARN: Type inference failed for: r14v51 */
    /* JADX WARN: Type inference failed for: r14v52 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v14, types: [o0OOo0oo.o00000oo] */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v19, types: [kotlin.jvm.internal.Oooo00O] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v30 */
    /* JADX WARN: Type inference failed for: r15v31 */
    /* JADX WARN: Type inference failed for: r15v32 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v7, types: [int] */
    /* JADX WARN: Type inference failed for: r15v8, types: [int] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4, types: [com.orion.notein.domain.models.cloudsync.CloudMetaLocal] */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, o0OOo0oo.o00000oo] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r1v54 */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r1v56 */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r1v58 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v28, types: [T] */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v36, types: [java.lang.Object, o0OOo0oo.OoooOo0] */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v69 */
    /* JADX WARN: Type inference failed for: r2v70 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v27, types: [com.orion.notein.domain.models.cloudsync.CloudMetaLocal, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [o0OOo0oo.OoooOo0] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v27, types: [o0OOo0oo.OoooOo0] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.jvm.internal.Oooo00O] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v52 */
    /* JADX WARN: Type inference failed for: r4v53 */
    /* JADX WARN: Type inference failed for: r4v54 */
    /* JADX WARN: Type inference failed for: r4v55 */
    /* JADX WARN: Type inference failed for: r4v56 */
    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r4v58 */
    /* JADX WARN: Type inference failed for: r4v59 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v7, types: [kotlin.jvm.internal.Oooo00O] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [o0OOo0oo.o000OO] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r7v0, types: [int] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.lang.Object, kotlin.jvm.internal.Oooo00O] */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31, types: [kotlin.jvm.internal.Oooo00O] */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v40, types: [kotlin.jvm.internal.Oooo00O] */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v56 */
    /* JADX WARN: Type inference failed for: r7v57 */
    /* JADX WARN: Type inference failed for: r7v58 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:137:0x042f -> B:141:0x0453). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:139:0x0450 -> B:141:0x0453). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:139:0x0450 -> B:172:0x0478). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0Oo(String str, CloudMetaLocal cloudMetaLocal, CloudMetaRemote cloudMetaRemote, boolean z, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27682o0000Ooo c27682o0000Ooo;
        ?? r15;
        ?? r14;
        ?? r13;
        ?? r11;
        ?? r7;
        ?? r4;
        Object objOooO00o;
        ?? r1;
        int i;
        Throwable thOooO00o;
        File file;
        ?? r152;
        ?? r142;
        ?? r132;
        ?? r112;
        ?? r6;
        ?? r143;
        ?? r12;
        ?? r62;
        ?? r3;
        ?? r16;
        ?? r63;
        ?? r42;
        ?? r32;
        ?? r17;
        String str2;
        CloudMetaLocal cloudMetaLocal2;
        Object obj;
        C24034Oooo00O c24034Oooo00O;
        InterfaceC27660OoooOo0 interfaceC27660OoooOo0;
        CloudMetaRemote cloudMetaRemote2;
        CloudMetaType cloudMetaType;
        boolean z2;
        EnumC32485OooO00o enumC32485OooO00o;
        Object objOooO00o2;
        String str3;
        CloudMetaRemote cloudMetaRemote3;
        ?? r43;
        ?? r0;
        ?? r10;
        InterfaceC27660OoooOo0 interfaceC27660OoooOo02;
        C24034Oooo00O c24034Oooo00O2;
        String str4;
        InterfaceC27660OoooOo0 interfaceC27660OoooOo03;
        ?? r33;
        ?? r113;
        ?? r64;
        ?? r18;
        ?? r2;
        ?? r153;
        ?? r144;
        ?? r72;
        Object objOooO0O0;
        ?? r133;
        ?? r22;
        Object obj2;
        ?? r02;
        ?? r145;
        ?? r114;
        ?? r73;
        ?? r65;
        ?? r19;
        Object objOooO0OO;
        ?? r23;
        ?? r115;
        CloudMetaType cloudMetaType2;
        ?? r74;
        ?? r03;
        ?? r162;
        Object obj3;
        ?? r44;
        CloudMetaType cloudMetaType3;
        ?? r75;
        ?? r116;
        ?? r134;
        ?? r146;
        CloudMetaRemote cloudMetaRemote4;
        Object obj4;
        ?? r45;
        CloudMetaType cloudMetaType4;
        ?? r76;
        ?? r117;
        ?? r135;
        ?? r147;
        ?? r110;
        ?? r136;
        String str5;
        SyncPostAction pushDuplicateFull;
        ?? r137;
        CloudMetaType cloudMetaType5;
        ?? r111;
        ?? r118 = this;
        String str6 = str;
        ?? r46 = "Backing up local note ";
        if (abstractC32479OooO0OO instanceof C27682o0000Ooo) {
            c27682o0000Ooo = (C27682o0000Ooo) abstractC32479OooO0OO;
            int i2 = c27682o0000Ooo.f97527Oooo0O0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c27682o0000Ooo.f97527Oooo0O0 = i2 - Integer.MIN_VALUE;
            } else {
                c27682o0000Ooo = new C27682o0000Ooo(r118, abstractC32479OooO0OO);
            }
        }
        Object obj5 = c27682o0000Ooo.f97526Oooo00o;
        EnumC32485OooO00o enumC32485OooO00o2 = EnumC32485OooO00o.f116726OooOo0o;
        ?? r77 = c27682o0000Ooo.f97527Oooo0O0;
        try {
            try {
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            r118 = enumC32485OooO00o2;
        }
        switch (r77) {
            case 0:
                C32446OooOOOo.OooO0O0(obj5);
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooO0o0(androidx.core.app.OooO.OooO0O0(c20358OooO00o, "ResolveConflictUseCase", "Handling unrecoverable conflict for ", str6), new Object[0]);
                C24034Oooo00O c24034Oooo00O3 = new C24034Oooo00O();
                C24034Oooo00O c24034Oooo00O4 = new C24034Oooo00O();
                String mimeType = cloudMetaRemote.getMimeType();
                CloudMetaType cloudMetaTypeFromMime = CloudMetaType.INSTANCE.fromMime(mimeType);
                InterfaceC27660OoooOo0 interfaceC27660OoooOo04 = r118.f97425OooO0o.get(cloudMetaTypeFromMime);
                if (interfaceC27660OoooOo04 == null) {
                    return C32446OooOOOo.OooO00o(new IllegalStateException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("No processor for ", mimeType)));
                }
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(cloudMetaLocal.getMimeType(), CloudMetaType.NOTE.getMime()) && !z) {
                    c20358OooO00o.OooOO0O(C22201OooO0oO.OooO0O0(c20358OooO00o, "ResolveConflictUseCase", "Content conflict detected for note ", str6, ", aborting"), new Object[0]);
                    return C32446OooOOOo.OooO00o(new CloudSyncError.ContentConflict(null, 1, null));
                }
                c27682o0000Ooo.f97515OooOo0o = r118;
                c27682o0000Ooo.f97514OooOo = str6;
                c27682o0000Ooo.f97517OooOoO0 = cloudMetaLocal;
                c27682o0000Ooo.f97516OooOoO = cloudMetaRemote;
                c27682o0000Ooo.f97518OooOoOO = c24034Oooo00O3;
                c27682o0000Ooo.f97520OooOoo0 = c24034Oooo00O4;
                c27682o0000Ooo.f97519OooOoo = cloudMetaTypeFromMime;
                c27682o0000Ooo.f97521OooOooO = interfaceC27660OoooOo04;
                c27682o0000Ooo.f97527Oooo0O0 = 1;
                Object objOooOo0O = r118.f97421OooO00o.OooOo0O(str6, c27682o0000Ooo);
                if (objOooOo0O == enumC32485OooO00o2) {
                    return enumC32485OooO00o2;
                }
                cloudMetaLocal2 = cloudMetaLocal;
                obj = objOooOo0O;
                c24034Oooo00O = c24034Oooo00O3;
                interfaceC27660OoooOo0 = interfaceC27660OoooOo04;
                cloudMetaRemote2 = cloudMetaRemote;
                cloudMetaType = cloudMetaTypeFromMime;
                r142 = r118;
                r77 = c24034Oooo00O4;
                z2 = C32445OooOOOO.OooO00o(obj) instanceof CloudSyncError.ResourceNotFound;
                r152 = !z2;
                if (z2) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    enumC32485OooO00o = enumC32485OooO00o2;
                    c20358OooO00o2.OooO0o0(C22201OooO0oO.OooO0O0(c20358OooO00o2, "ResolveConflictUseCase", "Cloud content exists for ", str6, ", will restore content"), new Object[0]);
                } else {
                    enumC32485OooO00o = enumC32485OooO00o2;
                }
                try {
                } catch (Throwable th3) {
                    th = th3;
                    r118 = enumC32485OooO00o;
                    C24034Oooo00O c24034Oooo00O5 = c24034Oooo00O;
                    r132 = cloudMetaLocal2;
                    r112 = c24034Oooo00O5;
                    r46 = interfaceC27660OoooOo0;
                }
                if (!cloudMetaLocal2.getDeleted()) {
                    str4 = str6;
                    interfaceC27660OoooOo03 = interfaceC27660OoooOo0;
                    r33 = cloudMetaLocal2;
                    r113 = c24034Oooo00O;
                    r64 = r142;
                    r18 = enumC32485OooO00o;
                    r2 = 0;
                    r72 = r77;
                    r144 = r142;
                    r153 = r152;
                    try {
                        c24034Oooo00O.f80942OooOo0o = r2;
                        C27643Oooo0 c27643Oooo0 = r144.f97422OooO0O0;
                        c27682o0000Ooo.f97515OooOo0o = r64;
                        c27682o0000Ooo.f97514OooOo = str4;
                        c27682o0000Ooo.f97517OooOoO0 = r33;
                        c27682o0000Ooo.f97516OooOoO = cloudMetaRemote2;
                        c27682o0000Ooo.f97518OooOoOO = r113;
                        c27682o0000Ooo.f97520OooOoo0 = r72;
                        c27682o0000Ooo.f97519OooOoo = cloudMetaType;
                        c27682o0000Ooo.f97521OooOooO = interfaceC27660OoooOo03;
                        c27682o0000Ooo.f97522OooOooo = r144;
                        c27682o0000Ooo.f97524Oooo000 = null;
                        c27682o0000Ooo.f97525Oooo00O = r153;
                        c27682o0000Ooo.f97527Oooo0O0 = 3;
                        objOooO0O0 = c27643Oooo0.OooO0O0(cloudMetaRemote2, c27682o0000Ooo);
                        break;
                    } catch (Throwable th4) {
                        th = th4;
                        r132 = r33;
                        r118 = r18;
                        r46 = interfaceC27660OoooOo03;
                        r6 = r64;
                        r77 = r72;
                        r112 = r113;
                        r152 = r153;
                        r142 = r6;
                        objOooO00o = C32446OooOOOo.OooO00o(th);
                        r1 = r118;
                        r4 = r46;
                        r7 = r77;
                        r11 = r112;
                        r13 = r132;
                        r14 = r142;
                        r15 = r152;
                        ?? r34 = r4;
                        ?? r47 = r7;
                        if (objOooO00o instanceof C32445OooOOOO.OooO00o) {
                        }
                        thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                        if (thOooO00o == null) {
                        }
                    }
                    if (objOooO0O0 == r18) {
                        return r18;
                    }
                    r133 = r33;
                    r22 = interfaceC27660OoooOo03;
                    obj2 = objOooO0O0;
                    r02 = r153;
                    r19 = r18;
                    r65 = r64;
                    r73 = r72;
                    r114 = r113;
                    r145 = r144;
                    if (r02 != 0) {
                        try {
                            C32446OooOOOo.OooO0O0(obj2);
                        } catch (Throwable th5) {
                            th = th5;
                            r46 = r22;
                            r118 = r19;
                            r6 = r65;
                            r77 = r73;
                            r112 = r114;
                            r132 = r133;
                            r152 = r153;
                            r142 = r6;
                        }
                    }
                    c27682o0000Ooo.f97515OooOo0o = r65;
                    c27682o0000Ooo.f97514OooOo = r133;
                    c27682o0000Ooo.f97517OooOoO0 = cloudMetaRemote2;
                    c27682o0000Ooo.f97516OooOoO = r114;
                    c27682o0000Ooo.f97518OooOoOO = r73;
                    c27682o0000Ooo.f97520OooOoo0 = cloudMetaType;
                    c27682o0000Ooo.f97519OooOoo = r22;
                    c27682o0000Ooo.f97521OooOooO = r145;
                    c27682o0000Ooo.f97522OooOooo = r73;
                    c27682o0000Ooo.f97524Oooo000 = obj2;
                    c27682o0000Ooo.f97525Oooo00O = r02;
                    c27682o0000Ooo.f97527Oooo0O0 = 4;
                    objOooO0OO = r22.OooO0OO(str4, c27682o0000Ooo);
                    if (objOooO0OO != r19) {
                        return r19;
                    }
                    r12 = r22;
                    r23 = objOooO0OO;
                    r152 = r114;
                    r3 = r133;
                    r115 = r145;
                    r143 = r73;
                    cloudMetaType2 = cloudMetaType;
                    r03 = r02;
                    r16 = r19;
                    r62 = r65;
                    r74 = r73;
                    try {
                        C32446OooOOOo.OooO0O0(r23);
                        r74.f80942OooOo0o = r23;
                    } catch (Throwable th6) {
                        th = th6;
                        r132 = r3;
                        r46 = r12;
                        r77 = r143;
                        r112 = r152;
                        r118 = r16;
                        r6 = r62;
                        r152 = r152;
                        r142 = r6;
                    }
                    if (r03 == 0) {
                        C32446OooOOOo.OooO0O0(obj2);
                        ?? r04 = r115.f97423OooO0OO;
                        c27682o0000Ooo.f97515OooOo0o = r62;
                        c27682o0000Ooo.f97514OooOo = r3;
                        c27682o0000Ooo.f97517OooOoO0 = cloudMetaRemote2;
                        c27682o0000Ooo.f97516OooOoO = r152;
                        c27682o0000Ooo.f97518OooOoOO = r143;
                        c27682o0000Ooo.f97520OooOoo0 = cloudMetaType2;
                        c27682o0000Ooo.f97519OooOoo = r12;
                        c27682o0000Ooo.f97521OooOooO = null;
                        c27682o0000Ooo.f97522OooOooo = null;
                        c27682o0000Ooo.f97524Oooo000 = null;
                        c27682o0000Ooo.f97527Oooo0O0 = 5;
                        Object objOooO0OO2 = r04.OooO0OO(r3, (CloudBundle) obj2, true, c27682o0000Ooo);
                        r16 = r16;
                        r3 = r3;
                        r62 = r62;
                        r12 = r12;
                        r143 = r143;
                        r152 = r152;
                        if (objOooO0OO2 != r16) {
                            obj4 = objOooO0OO2;
                            r45 = r12;
                            cloudMetaType4 = cloudMetaType2;
                            r76 = r143;
                            r117 = r152;
                            r135 = r3;
                            r147 = r62;
                            cloudMetaRemote4 = cloudMetaRemote2;
                            r110 = r16;
                            C32446OooOOOo.OooO0O0(obj4);
                            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                            cloudMetaType5 = cloudMetaType4;
                            r118 = r110;
                            r46 = r45;
                            r77 = r76;
                            r112 = r117;
                            r137 = r135;
                            r142 = r147;
                            cloudMetaRemote2 = cloudMetaRemote4;
                            r162 = r137;
                            r132 = cloudMetaType5;
                            r118 = r118;
                            r46 = r46;
                            r77 = r77;
                            r112 = r112;
                            r136 = r132;
                            r142 = r142;
                            try {
                                CloudMetaLocal cloudMetaLocalCopy$default = CloudMetaLocal.copy$default(r162, null, null, null, cloudMetaRemote2.getMetaVersion(), cloudMetaRemote2.getContentTag(), cloudMetaRemote2.getMetaHash(), null, null, false, cloudMetaRemote2.getDeleted(), cloudMetaRemote2.getLastSyncTime(), null, 2439, null);
                                str5 = (String) r77.f80942OooOo0o;
                            } catch (Throwable th7) {
                                th = th7;
                                r132 = r162;
                                objOooO00o = C32446OooOOOo.OooO00o(th);
                                r1 = r118;
                                r4 = r46;
                                r7 = r77;
                                r11 = r112;
                                r13 = r132;
                                r14 = r142;
                                r15 = r152;
                            }
                            if (str5 != null) {
                                if (C33599OooOo0O.Oooo0o0(str5)) {
                                    str5 = null;
                                }
                                if (str5 != null) {
                                    kotlin.jvm.internal.OooOOO0.OooO0Oo(r136);
                                    pushDuplicateFull = new SyncPostAction.PushDuplicateFull(str5, r136);
                                }
                                objOooO00o = new ConflictResolution(cloudMetaLocalCopy$default, pushDuplicateFull);
                                r13 = r162;
                                r1 = r118;
                                r4 = r46;
                                r7 = r77;
                                r11 = r112;
                                r14 = r142;
                                r15 = r152;
                                ?? r342 = r4;
                                ?? r472 = r7;
                                if (objOooO00o instanceof C32445OooOOOO.OooO00o) {
                                    i = 0;
                                } else {
                                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                                    c20358OooO00o3.OooOOO0("ResolveConflictUseCase");
                                    i = 0;
                                    c20358OooO00o3.OooO0o0(C20485OooOoO.OooO0O0("create a duplicate note ", r472.f80942OooOo0o, " for conflict resolution"), new Object[0]);
                                }
                                thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                                if (thOooO00o == null) {
                                    CloudBundle cloudBundle = (CloudBundle) r11.f80942OooOo0o;
                                    if (cloudBundle != null && (file = cloudBundle.getFile()) != null) {
                                        file.delete();
                                    }
                                    return objOooO00o;
                                }
                                C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o4.OooOOO0("ResolveConflictUseCase");
                                c20358OooO00o4.OooOO0o(thOooO00o, "sync failed, start rollback", new Object[i]);
                                CloudBundle cloudBundle2 = (CloudBundle) r11.f80942OooOo0o;
                                r17 = r1;
                                r32 = r342;
                                r42 = r472;
                                r63 = "sync failed, start rollback";
                                int i3 = i;
                                if (cloudBundle2 != null) {
                                    ?? r66 = r14.f97423OooO0OO;
                                    c27682o0000Ooo.f97515OooOo0o = r472;
                                    c27682o0000Ooo.f97514OooOo = r342;
                                    c27682o0000Ooo.f97517OooOoO0 = thOooO00o;
                                    c27682o0000Ooo.f97516OooOoO = null;
                                    c27682o0000Ooo.f97518OooOoOO = null;
                                    c27682o0000Ooo.f97520OooOoo0 = null;
                                    c27682o0000Ooo.f97519OooOoo = null;
                                    c27682o0000Ooo.f97521OooOooO = null;
                                    c27682o0000Ooo.f97522OooOooo = null;
                                    c27682o0000Ooo.f97524Oooo000 = null;
                                    c27682o0000Ooo.f97527Oooo0O0 = 7;
                                    i3 = 1;
                                    r12 = 1;
                                    Object objOooO0OO3 = r66.OooO0OO(r13, cloudBundle2, true, c27682o0000Ooo);
                                    r17 = r1;
                                    r32 = r342;
                                    r42 = r472;
                                    r63 = r66;
                                    r16 = r1;
                                    r3 = r342;
                                    r62 = r66;
                                    r143 = r14;
                                    r152 = r15;
                                    if (objOooO0OO3 != r1) {
                                    }
                                }
                                str2 = (String) r42.f80942OooOo0o;
                                if (str2 != null) {
                                    c27682o0000Ooo.f97515OooOo0o = thOooO00o;
                                    c27682o0000Ooo.f97514OooOo = null;
                                    c27682o0000Ooo.f97517OooOoO0 = null;
                                    c27682o0000Ooo.f97516OooOoO = null;
                                    c27682o0000Ooo.f97518OooOoOO = null;
                                    c27682o0000Ooo.f97520OooOoo0 = null;
                                    c27682o0000Ooo.f97519OooOoo = null;
                                    c27682o0000Ooo.f97521OooOooO = null;
                                    c27682o0000Ooo.f97522OooOooo = null;
                                    c27682o0000Ooo.f97524Oooo000 = null;
                                    c27682o0000Ooo.f97527Oooo0O0 = 8;
                                    Object objOooO0o = r32.OooO0o(str2, c27682o0000Ooo);
                                    r16 = r17;
                                    r3 = r32;
                                    r62 = r63;
                                    r12 = i3;
                                    r143 = r14;
                                    r152 = r15;
                                    break;
                                }
                                return C32446OooOOOo.OooO00o(thOooO00o);
                            }
                            pushDuplicateFull = SyncPostAction.None.INSTANCE;
                            objOooO00o = new ConflictResolution(cloudMetaLocalCopy$default, pushDuplicateFull);
                            r13 = r162;
                            r1 = r118;
                            r4 = r46;
                            r7 = r77;
                            r11 = r112;
                            r14 = r142;
                            r15 = r152;
                            ?? r3422 = r4;
                            ?? r4722 = r7;
                            if (objOooO00o instanceof C32445OooOOOO.OooO00o) {
                            }
                            thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                            if (thOooO00o == null) {
                            }
                        }
                    } else {
                        if (obj2 instanceof C32445OooOOOO.OooO00o) {
                            obj2 = null;
                        }
                        CloudBundle cloudBundle3 = (CloudBundle) obj2;
                        if (cloudBundle3 != null) {
                            ?? r05 = r115.f97423OooO0OO;
                            c27682o0000Ooo.f97515OooOo0o = r62;
                            c27682o0000Ooo.f97514OooOo = r3;
                            c27682o0000Ooo.f97517OooOoO0 = cloudMetaRemote2;
                            c27682o0000Ooo.f97516OooOoO = r152;
                            c27682o0000Ooo.f97518OooOoOO = r143;
                            c27682o0000Ooo.f97520OooOoo0 = cloudMetaType2;
                            c27682o0000Ooo.f97519OooOoo = r12;
                            c27682o0000Ooo.f97521OooOooO = null;
                            c27682o0000Ooo.f97522OooOooo = null;
                            c27682o0000Ooo.f97524Oooo000 = null;
                            c27682o0000Ooo.f97527Oooo0O0 = 6;
                            Object objOooO0OO4 = r05.OooO0OO(r3, cloudBundle3, true, c27682o0000Ooo);
                            r16 = r16;
                            r3 = r3;
                            r62 = r62;
                            r12 = r12;
                            r143 = r143;
                            r152 = r152;
                            if (objOooO0OO4 != r16) {
                                obj3 = objOooO0OO4;
                                r44 = r12;
                                cloudMetaType3 = cloudMetaType2;
                                r75 = r143;
                                r116 = r152;
                                r134 = r3;
                                r146 = r62;
                                cloudMetaRemote4 = cloudMetaRemote2;
                                r111 = r16;
                                C32446OooOOOo.OooO0O0(obj3);
                                C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                                cloudMetaType5 = cloudMetaType3;
                                r118 = r111;
                                r46 = r44;
                                r77 = r75;
                                r112 = r116;
                                r137 = r134;
                                r142 = r146;
                                cloudMetaRemote2 = cloudMetaRemote4;
                                r162 = r137;
                                r132 = cloudMetaType5;
                                r118 = r118;
                                r46 = r46;
                                r77 = r77;
                                r112 = r112;
                                r136 = r132;
                                r142 = r142;
                                CloudMetaLocal cloudMetaLocalCopy$default2 = CloudMetaLocal.copy$default(r162, null, null, null, cloudMetaRemote2.getMetaVersion(), cloudMetaRemote2.getContentTag(), cloudMetaRemote2.getMetaHash(), null, null, false, cloudMetaRemote2.getDeleted(), cloudMetaRemote2.getLastSyncTime(), null, 2439, null);
                                str5 = (String) r77.f80942OooOo0o;
                                if (str5 != null) {
                                }
                                pushDuplicateFull = SyncPostAction.None.INSTANCE;
                                objOooO00o = new ConflictResolution(cloudMetaLocalCopy$default2, pushDuplicateFull);
                                r13 = r162;
                                r1 = r118;
                                r4 = r46;
                                r7 = r77;
                                r11 = r112;
                                r14 = r142;
                                r15 = r152;
                                ?? r34222 = r4;
                                ?? r47222 = r7;
                                if (objOooO00o instanceof C32445OooOOOO.OooO00o) {
                                }
                                thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                                if (thOooO00o == null) {
                                }
                            }
                        } else {
                            r162 = r3;
                            r46 = r12;
                            r77 = r143;
                            r112 = r152;
                            r142 = r62;
                            r118 = r16;
                            r136 = cloudMetaType2;
                            CloudMetaLocal cloudMetaLocalCopy$default22 = CloudMetaLocal.copy$default(r162, null, null, null, cloudMetaRemote2.getMetaVersion(), cloudMetaRemote2.getContentTag(), cloudMetaRemote2.getMetaHash(), null, null, false, cloudMetaRemote2.getDeleted(), cloudMetaRemote2.getLastSyncTime(), null, 2439, null);
                            str5 = (String) r77.f80942OooOo0o;
                            if (str5 != null) {
                            }
                            pushDuplicateFull = SyncPostAction.None.INSTANCE;
                            objOooO00o = new ConflictResolution(cloudMetaLocalCopy$default22, pushDuplicateFull);
                            r13 = r162;
                            r1 = r118;
                            r4 = r46;
                            r7 = r77;
                            r11 = r112;
                            r14 = r142;
                            r15 = r152;
                            ?? r342222 = r4;
                            ?? r472222 = r7;
                            if (objOooO00o instanceof C32445OooOOOO.OooO00o) {
                            }
                            thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                            if (thOooO00o == null) {
                            }
                        }
                    }
                    return r16;
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o5.OooOOO0("ResolveConflictUseCase");
                c20358OooO00o5.OooO0o0("Backing up local note " + str6 + " before conflict resolution", new Object[0]);
                o0OOO0o o0ooo0o2 = r142.f97424OooO0Oo;
                c27682o0000Ooo.f97515OooOo0o = r142;
                c27682o0000Ooo.f97514OooOo = str6;
                c27682o0000Ooo.f97517OooOoO0 = cloudMetaLocal2;
                c27682o0000Ooo.f97516OooOoO = cloudMetaRemote2;
                c27682o0000Ooo.f97518OooOoOO = c24034Oooo00O;
                c27682o0000Ooo.f97520OooOoo0 = r77;
                c27682o0000Ooo.f97519OooOoo = cloudMetaType;
                c27682o0000Ooo.f97521OooOooO = interfaceC27660OoooOo0;
                c27682o0000Ooo.f97522OooOooo = r142;
                c27682o0000Ooo.f97524Oooo000 = c24034Oooo00O;
                c27682o0000Ooo.f97525Oooo00O = r152;
                c27682o0000Ooo.f97527Oooo0O0 = 2;
                objOooO00o2 = o0ooo0o2.OooO00o(str6, false, c27682o0000Ooo);
                EnumC32485OooO00o enumC32485OooO00o3 = enumC32485OooO00o;
                if (objOooO00o2 == enumC32485OooO00o3) {
                    return enumC32485OooO00o3;
                }
                str3 = str6;
                cloudMetaRemote3 = cloudMetaRemote2;
                r43 = r142;
                r0 = r152;
                r10 = r77;
                interfaceC27660OoooOo02 = interfaceC27660OoooOo0;
                c24034Oooo00O2 = c24034Oooo00O;
                r132 = cloudMetaLocal2;
                r112 = c24034Oooo00O2;
                r118 = enumC32485OooO00o3;
                r142 = r142;
                r152 = r152;
                try {
                    C32446OooOOOo.OooO0O0(objOooO00o2);
                    ?? r154 = r132;
                    c24034Oooo00O = c24034Oooo00O2;
                    r33 = r154;
                    ?? r155 = r142;
                    r144 = r43;
                    interfaceC27660OoooOo03 = interfaceC27660OoooOo02;
                    r72 = r10;
                    cloudMetaRemote2 = cloudMetaRemote3;
                    str4 = str3;
                    r64 = r155;
                    r153 = r0;
                    r18 = r118;
                    r2 = (CloudBundle) objOooO00o2;
                    r113 = r112;
                    c24034Oooo00O.f80942OooOo0o = r2;
                    C27643Oooo0 c27643Oooo02 = r144.f97422OooO0O0;
                    c27682o0000Ooo.f97515OooOo0o = r64;
                    c27682o0000Ooo.f97514OooOo = str4;
                    c27682o0000Ooo.f97517OooOoO0 = r33;
                    c27682o0000Ooo.f97516OooOoO = cloudMetaRemote2;
                    c27682o0000Ooo.f97518OooOoOO = r113;
                    c27682o0000Ooo.f97520OooOoo0 = r72;
                    c27682o0000Ooo.f97519OooOoo = cloudMetaType;
                    c27682o0000Ooo.f97521OooOooO = interfaceC27660OoooOo03;
                    c27682o0000Ooo.f97522OooOooo = r144;
                    c27682o0000Ooo.f97524Oooo000 = null;
                    c27682o0000Ooo.f97525Oooo00O = r153;
                    c27682o0000Ooo.f97527Oooo0O0 = 3;
                    objOooO0O0 = c27643Oooo02.OooO0O0(cloudMetaRemote2, c27682o0000Ooo);
                    if (objOooO0O0 == r18) {
                    }
                } catch (Throwable th8) {
                    th = th8;
                    r46 = interfaceC27660OoooOo02;
                    r77 = r10;
                }
                objOooO00o = C32446OooOOOo.OooO00o(th);
                r1 = r118;
                r4 = r46;
                r7 = r77;
                r11 = r112;
                r13 = r132;
                r14 = r142;
                r15 = r152;
                ?? r3422222 = r4;
                ?? r4722222 = r7;
                if (objOooO00o instanceof C32445OooOOOO.OooO00o) {
                }
                thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                if (thOooO00o == null) {
                }
                break;
            case 1:
                InterfaceC27660OoooOo0 interfaceC27660OoooOo05 = (InterfaceC27660OoooOo0) c27682o0000Ooo.f97521OooOooO;
                CloudMetaType cloudMetaType6 = (CloudMetaType) c27682o0000Ooo.f97519OooOoo;
                C24034Oooo00O c24034Oooo00O6 = (C24034Oooo00O) c27682o0000Ooo.f97520OooOoo0;
                C24034Oooo00O c24034Oooo00O7 = c27682o0000Ooo.f97518OooOoOO;
                cloudMetaRemote2 = (CloudMetaRemote) c27682o0000Ooo.f97516OooOoO;
                cloudMetaLocal2 = (CloudMetaLocal) c27682o0000Ooo.f97517OooOoO0;
                String str7 = (String) c27682o0000Ooo.f97514OooOo;
                C27677o00000oo c27677o00000oo = (C27677o00000oo) c27682o0000Ooo.f97515OooOo0o;
                C32446OooOOOo.OooO0O0(obj5);
                obj = ((C32445OooOOOO) obj5).f116639OooOo0o;
                r142 = c27677o00000oo;
                c24034Oooo00O = c24034Oooo00O7;
                cloudMetaType = cloudMetaType6;
                interfaceC27660OoooOo0 = interfaceC27660OoooOo05;
                str6 = str7;
                r77 = c24034Oooo00O6;
                z2 = C32445OooOOOO.OooO00o(obj) instanceof CloudSyncError.ResourceNotFound;
                r152 = !z2;
                if (z2) {
                }
                if (!cloudMetaLocal2.getDeleted()) {
                }
                objOooO00o = C32446OooOOOo.OooO00o(th);
                r1 = r118;
                r4 = r46;
                r7 = r77;
                r11 = r112;
                r13 = r132;
                r14 = r142;
                r15 = r152;
                ?? r34222222 = r4;
                ?? r47222222 = r7;
                if (objOooO00o instanceof C32445OooOOOO.OooO00o) {
                }
                thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                if (thOooO00o == null) {
                }
                break;
            case 2:
                int i4 = c27682o0000Ooo.f97525Oooo00O;
                c24034Oooo00O2 = (C24034Oooo00O) c27682o0000Ooo.f97524Oooo000;
                C27677o00000oo c27677o00000oo2 = (C27677o00000oo) c27682o0000Ooo.f97522OooOooo;
                interfaceC27660OoooOo02 = (InterfaceC27660OoooOo0) c27682o0000Ooo.f97521OooOooO;
                cloudMetaType = (CloudMetaType) c27682o0000Ooo.f97519OooOoo;
                C24034Oooo00O c24034Oooo00O8 = (C24034Oooo00O) c27682o0000Ooo.f97520OooOoo0;
                r112 = c27682o0000Ooo.f97518OooOoOO;
                cloudMetaRemote3 = (CloudMetaRemote) c27682o0000Ooo.f97516OooOoO;
                r132 = (CloudMetaLocal) c27682o0000Ooo.f97517OooOoO0;
                String str8 = (String) c27682o0000Ooo.f97514OooOo;
                r152 = (C27677o00000oo) c27682o0000Ooo.f97515OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj5);
                    objOooO00o2 = ((C32445OooOOOO) obj5).f116639OooOo0o;
                    r118 = enumC32485OooO00o2;
                    str3 = str8;
                    r142 = r152;
                    r0 = i4;
                    r43 = c27677o00000oo2;
                    r10 = c24034Oooo00O8;
                    r112 = r112;
                    r132 = r132;
                    r152 = r152;
                    C32446OooOOOo.OooO0O0(objOooO00o2);
                    ?? r1542 = r132;
                    c24034Oooo00O = c24034Oooo00O2;
                    r33 = r1542;
                    ?? r1552 = r142;
                    r144 = r43;
                    interfaceC27660OoooOo03 = interfaceC27660OoooOo02;
                    r72 = r10;
                    cloudMetaRemote2 = cloudMetaRemote3;
                    str4 = str3;
                    r64 = r1552;
                    r153 = r0;
                    r18 = r118;
                    r2 = (CloudBundle) objOooO00o2;
                    r113 = r112;
                    c24034Oooo00O.f80942OooOo0o = r2;
                    C27643Oooo0 c27643Oooo022 = r144.f97422OooO0O0;
                    c27682o0000Ooo.f97515OooOo0o = r64;
                    c27682o0000Ooo.f97514OooOo = str4;
                    c27682o0000Ooo.f97517OooOoO0 = r33;
                    c27682o0000Ooo.f97516OooOoO = cloudMetaRemote2;
                    c27682o0000Ooo.f97518OooOoOO = r113;
                    c27682o0000Ooo.f97520OooOoo0 = r72;
                    c27682o0000Ooo.f97519OooOoo = cloudMetaType;
                    c27682o0000Ooo.f97521OooOooO = interfaceC27660OoooOo03;
                    c27682o0000Ooo.f97522OooOooo = r144;
                    c27682o0000Ooo.f97524Oooo000 = null;
                    c27682o0000Ooo.f97525Oooo00O = r153;
                    c27682o0000Ooo.f97527Oooo0O0 = 3;
                    objOooO0O0 = c27643Oooo022.OooO0O0(cloudMetaRemote2, c27682o0000Ooo);
                    if (objOooO0O0 == r18) {
                    }
                } catch (Throwable th9) {
                    th = th9;
                    r118 = enumC32485OooO00o2;
                    r46 = interfaceC27660OoooOo02;
                    r77 = c24034Oooo00O8;
                    r142 = r152;
                    break;
                }
                break;
            case 3:
                int i5 = c27682o0000Ooo.f97525Oooo00O;
                C27677o00000oo c27677o00000oo3 = (C27677o00000oo) c27682o0000Ooo.f97522OooOooo;
                r46 = (InterfaceC27660OoooOo0) c27682o0000Ooo.f97521OooOooO;
                CloudMetaType cloudMetaType7 = (CloudMetaType) c27682o0000Ooo.f97519OooOoo;
                C24034Oooo00O c24034Oooo00O9 = (C24034Oooo00O) c27682o0000Ooo.f97520OooOoo0;
                r112 = c27682o0000Ooo.f97518OooOoOO;
                cloudMetaRemote2 = (CloudMetaRemote) c27682o0000Ooo.f97516OooOoO;
                r132 = (CloudMetaLocal) c27682o0000Ooo.f97517OooOoO0;
                str4 = (String) c27682o0000Ooo.f97514OooOo;
                r142 = (C27677o00000oo) c27682o0000Ooo.f97515OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj5);
                    obj2 = ((C32445OooOOOO) obj5).f116639OooOo0o;
                    r22 = r46;
                    cloudMetaType = cloudMetaType7;
                    r73 = c24034Oooo00O9;
                    r19 = enumC32485OooO00o2;
                    r65 = r142;
                    r145 = c27677o00000oo3;
                    r02 = i5;
                    r114 = r112;
                    r133 = r132;
                    if (r02 != 0) {
                    }
                    c27682o0000Ooo.f97515OooOo0o = r65;
                    c27682o0000Ooo.f97514OooOo = r133;
                    c27682o0000Ooo.f97517OooOoO0 = cloudMetaRemote2;
                    c27682o0000Ooo.f97516OooOoO = r114;
                    c27682o0000Ooo.f97518OooOoOO = r73;
                    c27682o0000Ooo.f97520OooOoo0 = cloudMetaType;
                    c27682o0000Ooo.f97519OooOoo = r22;
                    c27682o0000Ooo.f97521OooOooO = r145;
                    c27682o0000Ooo.f97522OooOooo = r73;
                    c27682o0000Ooo.f97524Oooo000 = obj2;
                    c27682o0000Ooo.f97525Oooo00O = r02;
                    c27682o0000Ooo.f97527Oooo0O0 = 4;
                    objOooO0OO = r22.OooO0OO(str4, c27682o0000Ooo);
                    if (objOooO0OO != r19) {
                    }
                } catch (Throwable th10) {
                    th = th10;
                    r118 = enumC32485OooO00o2;
                    r77 = c24034Oooo00O9;
                    break;
                }
                break;
            case 4:
                int i6 = c27682o0000Ooo.f97525Oooo00O;
                obj2 = c27682o0000Ooo.f97524Oooo000;
                C24034Oooo00O c24034Oooo00O10 = (C24034Oooo00O) c27682o0000Ooo.f97522OooOooo;
                C27677o00000oo c27677o00000oo4 = (C27677o00000oo) c27682o0000Ooo.f97521OooOooO;
                InterfaceC27660OoooOo0 interfaceC27660OoooOo06 = (InterfaceC27660OoooOo0) c27682o0000Ooo.f97519OooOoo;
                CloudMetaType cloudMetaType8 = (CloudMetaType) c27682o0000Ooo.f97520OooOoo0;
                C24034Oooo00O c24034Oooo00O11 = c27682o0000Ooo.f97518OooOoOO;
                r152 = (C24034Oooo00O) c27682o0000Ooo.f97516OooOoO;
                CloudMetaRemote cloudMetaRemote5 = (CloudMetaRemote) c27682o0000Ooo.f97517OooOoO0;
                CloudMetaLocal cloudMetaLocal3 = (CloudMetaLocal) c27682o0000Ooo.f97514OooOo;
                C27677o00000oo c27677o00000oo5 = (C27677o00000oo) c27682o0000Ooo.f97515OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj5);
                    cloudMetaRemote2 = cloudMetaRemote5;
                    r3 = cloudMetaLocal3;
                    r16 = enumC32485OooO00o2;
                    r62 = c27677o00000oo5;
                    r03 = i6;
                    r23 = ((C32445OooOOOO) obj5).f116639OooOo0o;
                    r74 = c24034Oooo00O10;
                    r115 = c27677o00000oo4;
                    r12 = interfaceC27660OoooOo06;
                    cloudMetaType2 = cloudMetaType8;
                    r143 = c24034Oooo00O11;
                    r152 = r152;
                    C32446OooOOOo.OooO0O0(r23);
                    r74.f80942OooOo0o = r23;
                    if (r03 == 0) {
                    }
                } catch (Throwable th11) {
                    th = th11;
                    r118 = enumC32485OooO00o2;
                    r132 = cloudMetaLocal3;
                    r46 = interfaceC27660OoooOo06;
                    r77 = c24034Oooo00O11;
                    r112 = r152;
                    r142 = c27677o00000oo5;
                    break;
                }
                return r16;
            case 5:
                InterfaceC27660OoooOo0 interfaceC27660OoooOo07 = (InterfaceC27660OoooOo0) c27682o0000Ooo.f97519OooOoo;
                CloudMetaType cloudMetaType9 = (CloudMetaType) c27682o0000Ooo.f97520OooOoo0;
                C24034Oooo00O c24034Oooo00O12 = c27682o0000Ooo.f97518OooOoOO;
                C24034Oooo00O c24034Oooo00O13 = (C24034Oooo00O) c27682o0000Ooo.f97516OooOoO;
                cloudMetaRemote4 = (CloudMetaRemote) c27682o0000Ooo.f97517OooOoO0;
                CloudMetaLocal cloudMetaLocal4 = (CloudMetaLocal) c27682o0000Ooo.f97514OooOo;
                C27677o00000oo c27677o00000oo6 = (C27677o00000oo) c27682o0000Ooo.f97515OooOo0o;
                C32446OooOOOo.OooO0O0(obj5);
                obj4 = ((C32445OooOOOO) obj5).f116639OooOo0o;
                r110 = enumC32485OooO00o2;
                cloudMetaType4 = cloudMetaType9;
                r45 = interfaceC27660OoooOo07;
                r76 = c24034Oooo00O12;
                r117 = c24034Oooo00O13;
                r135 = cloudMetaLocal4;
                r147 = c27677o00000oo6;
                C32446OooOOOo.OooO0O0(obj4);
                C32460OooOooO c32460OooOooO3 = C32460OooOooO.f116667OooO00o;
                cloudMetaType5 = cloudMetaType4;
                r118 = r110;
                r46 = r45;
                r77 = r76;
                r112 = r117;
                r137 = r135;
                r142 = r147;
                cloudMetaRemote2 = cloudMetaRemote4;
                r162 = r137;
                r132 = cloudMetaType5;
                r118 = r118;
                r46 = r46;
                r77 = r77;
                r112 = r112;
                r136 = r132;
                r142 = r142;
                CloudMetaLocal cloudMetaLocalCopy$default222 = CloudMetaLocal.copy$default(r162, null, null, null, cloudMetaRemote2.getMetaVersion(), cloudMetaRemote2.getContentTag(), cloudMetaRemote2.getMetaHash(), null, null, false, cloudMetaRemote2.getDeleted(), cloudMetaRemote2.getLastSyncTime(), null, 2439, null);
                str5 = (String) r77.f80942OooOo0o;
                if (str5 != null) {
                }
                pushDuplicateFull = SyncPostAction.None.INSTANCE;
                objOooO00o = new ConflictResolution(cloudMetaLocalCopy$default222, pushDuplicateFull);
                r13 = r162;
                r1 = r118;
                r4 = r46;
                r7 = r77;
                r11 = r112;
                r14 = r142;
                r15 = r152;
                ?? r342222222 = r4;
                ?? r472222222 = r7;
                if (objOooO00o instanceof C32445OooOOOO.OooO00o) {
                }
                thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                if (thOooO00o == null) {
                }
                break;
            case 6:
                InterfaceC27660OoooOo0 interfaceC27660OoooOo08 = (InterfaceC27660OoooOo0) c27682o0000Ooo.f97519OooOoo;
                CloudMetaType cloudMetaType10 = (CloudMetaType) c27682o0000Ooo.f97520OooOoo0;
                C24034Oooo00O c24034Oooo00O14 = c27682o0000Ooo.f97518OooOoOO;
                C24034Oooo00O c24034Oooo00O15 = (C24034Oooo00O) c27682o0000Ooo.f97516OooOoO;
                cloudMetaRemote4 = (CloudMetaRemote) c27682o0000Ooo.f97517OooOoO0;
                CloudMetaLocal cloudMetaLocal5 = (CloudMetaLocal) c27682o0000Ooo.f97514OooOo;
                C27677o00000oo c27677o00000oo7 = (C27677o00000oo) c27682o0000Ooo.f97515OooOo0o;
                C32446OooOOOo.OooO0O0(obj5);
                obj3 = ((C32445OooOOOO) obj5).f116639OooOo0o;
                r111 = enumC32485OooO00o2;
                cloudMetaType3 = cloudMetaType10;
                r44 = interfaceC27660OoooOo08;
                r75 = c24034Oooo00O14;
                r116 = c24034Oooo00O15;
                r134 = cloudMetaLocal5;
                r146 = c27677o00000oo7;
                C32446OooOOOo.OooO0O0(obj3);
                C32460OooOooO c32460OooOooO22 = C32460OooOooO.f116667OooO00o;
                cloudMetaType5 = cloudMetaType3;
                r118 = r111;
                r46 = r44;
                r77 = r75;
                r112 = r116;
                r137 = r134;
                r142 = r146;
                cloudMetaRemote2 = cloudMetaRemote4;
                r162 = r137;
                r132 = cloudMetaType5;
                r118 = r118;
                r46 = r46;
                r77 = r77;
                r112 = r112;
                r136 = r132;
                r142 = r142;
                CloudMetaLocal cloudMetaLocalCopy$default2222 = CloudMetaLocal.copy$default(r162, null, null, null, cloudMetaRemote2.getMetaVersion(), cloudMetaRemote2.getContentTag(), cloudMetaRemote2.getMetaHash(), null, null, false, cloudMetaRemote2.getDeleted(), cloudMetaRemote2.getLastSyncTime(), null, 2439, null);
                str5 = (String) r77.f80942OooOo0o;
                if (str5 != null) {
                }
                pushDuplicateFull = SyncPostAction.None.INSTANCE;
                objOooO00o = new ConflictResolution(cloudMetaLocalCopy$default2222, pushDuplicateFull);
                r13 = r162;
                r1 = r118;
                r4 = r46;
                r7 = r77;
                r11 = r112;
                r14 = r142;
                r15 = r152;
                ?? r3422222222 = r4;
                ?? r4722222222 = r7;
                if (objOooO00o instanceof C32445OooOOOO.OooO00o) {
                }
                thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                if (thOooO00o == null) {
                }
                break;
            case 7:
                thOooO00o = (Throwable) c27682o0000Ooo.f97517OooOoO0;
                InterfaceC27660OoooOo0 interfaceC27660OoooOo09 = (InterfaceC27660OoooOo0) c27682o0000Ooo.f97514OooOo;
                C24034Oooo00O c24034Oooo00O16 = (C24034Oooo00O) c27682o0000Ooo.f97515OooOo0o;
                C32446OooOOOo.OooO0O0(obj5);
                Object obj6 = ((C32445OooOOOO) obj5).f116639OooOo0o;
                r17 = enumC32485OooO00o2;
                r32 = interfaceC27660OoooOo09;
                r42 = c24034Oooo00O16;
                r63 = enumC32485OooO00o2;
                str2 = (String) r42.f80942OooOo0o;
                if (str2 != null) {
                }
                return C32446OooOOOo.OooO00o(thOooO00o);
            case 8:
                thOooO00o = (Throwable) c27682o0000Ooo.f97515OooOo0o;
                C32446OooOOOo.OooO0O0(obj5);
                Object obj7 = ((C32445OooOOOO) obj5).f116639OooOo0o;
                return C32446OooOOOo.OooO00o(thOooO00o);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o0(String str, boolean z, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27676o00000oO c27676o00000oO;
        boolean z2;
        Object objOooOO0O;
        C27677o00000oo c27677o00000oo;
        CloudMetaLocal cloudMetaLocal;
        String str2;
        boolean z3;
        Object obj;
        C27677o00000oo c27677o00000oo2;
        CloudMetaLocal cloudMetaLocal2;
        CloudMetaRemote cloudMetaRemote;
        CloudContentTag stagedContentTag;
        Object objOooo0O0;
        CloudMetaRemote cloudMetaRemote2;
        boolean z4;
        String str3;
        C27677o00000oo c27677o00000oo3;
        CloudMetaRemote cloudMetaRemote3;
        CloudMetaLocal cloudMetaLocal3;
        CloudContentTag cloudContentTag;
        Object objOooO0oo;
        boolean z5;
        Object objOooO00o;
        boolean z6;
        CloudMetaRemote cloudMetaRemote4;
        CloudMetaRemote cloudMetaRemote5;
        boolean z7;
        boolean z8;
        CloudMetaLocal cloudMetaLocal4;
        CloudContentTag stagedContentTag2;
        boolean z9;
        Long l;
        Object objOooO0OO;
        String str4 = str;
        if (abstractC32479OooO0OO instanceof C27676o00000oO) {
            c27676o00000oO = (C27676o00000oO) abstractC32479OooO0OO;
            int i = c27676o00000oO.f97420OooOooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27676o00000oO.f97420OooOooO = i - Integer.MIN_VALUE;
            } else {
                c27676o00000oO = new C27676o00000oO(this, abstractC32479OooO0OO);
            }
        }
        C27676o00000oO c27676o00000oO2 = c27676o00000oO;
        Object obj2 = c27676o00000oO2.f97419OooOoo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        switch (c27676o00000oO2.f97420OooOooO) {
            case 0:
                C32446OooOOOo.OooO0O0(obj2);
                c27676o00000oO2.f97414OooOo0o = this;
                c27676o00000oO2.f97413OooOo = str4;
                z2 = z;
                c27676o00000oO2.f97417OooOoOO = z2;
                c27676o00000oO2.f97420OooOooO = 1;
                objOooOO0O = this.f97421OooO00o.OooOO0O(str4, null, c27676o00000oO2);
                if (objOooOO0O != enumC32485OooO00o) {
                    c27677o00000oo = this;
                    cloudMetaLocal = (CloudMetaLocal) objOooOO0O;
                    if (cloudMetaLocal != null) {
                        return C32446OooOOOo.OooO00o(new IllegalStateException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Local meta not found: ", str4)));
                    }
                    InterfaceC27605OooO00o interfaceC27605OooO00o = c27677o00000oo.f97421OooO00o;
                    c27676o00000oO2.f97414OooOo0o = c27677o00000oo;
                    c27676o00000oO2.f97413OooOo = str4;
                    c27676o00000oO2.f97416OooOoO0 = cloudMetaLocal;
                    c27676o00000oO2.f97417OooOoOO = z2;
                    c27676o00000oO2.f97420OooOooO = 2;
                    Object objOooOo = interfaceC27605OooO00o.OooOo(str4, c27676o00000oO2);
                    if (objOooOo != enumC32485OooO00o) {
                        str2 = str4;
                        z3 = z2;
                        obj = objOooOo;
                        c27677o00000oo2 = c27677o00000oo;
                        cloudMetaLocal2 = cloudMetaLocal;
                        boolean z10 = obj instanceof C32445OooOOOO.OooO00o;
                        cloudMetaRemote = (CloudMetaRemote) (!z10 ? null : obj);
                        if (cloudMetaRemote != null) {
                            if (z10) {
                                Throwable thOooO00o = C32445OooOOOO.OooO00o(obj);
                                kotlin.jvm.internal.OooOOO0.OooO0Oo(thOooO00o);
                                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o.OooOO0o(thOooO00o, androidx.core.app.OooO.OooO0O0(c20358OooO00o, "ResolveConflictUseCase", "Failed to fetch remote meta for ", str2), new Object[0]);
                                return C32446OooOOOo.OooO00o(thOooO00o);
                            }
                            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o2.OooOOO0("ResolveConflictUseCase");
                            c20358OooO00o2.OooOO0O("Remote meta truly not found for %s", str2);
                            c27676o00000oO2.f97414OooOo0o = null;
                            c27676o00000oO2.f97413OooOo = null;
                            c27676o00000oO2.f97416OooOoO0 = null;
                            c27676o00000oO2.f97420OooOooO = 3;
                            Object objOooO0O0 = c27677o00000oo2.OooO0O0(str2, cloudMetaLocal2, c27676o00000oO2);
                            if (objOooO0O0 != enumC32485OooO00o) {
                                return objOooO0O0;
                            }
                        } else if (cloudMetaLocal2.getDeleted() || cloudMetaRemote.getDeleted() || cloudMetaLocal2.getContentTag().matches(cloudMetaRemote.getContentTag()) || ((stagedContentTag = cloudMetaLocal2.getStagedContentTag()) != null && stagedContentTag.matches(cloudMetaRemote.getContentTag()))) {
                            z4 = z3;
                            C27677o00000oo c27677o00000oo4 = c27677o00000oo2;
                            if (cloudMetaLocal2.getMetaVersion() > cloudMetaRemote.getMetaVersion()) {
                                c27676o00000oO2.f97414OooOo0o = null;
                                c27676o00000oO2.f97413OooOo = null;
                                c27676o00000oO2.f97416OooOoO0 = null;
                                c27676o00000oO2.f97415OooOoO = null;
                                c27676o00000oO2.f97420OooOooO = 5;
                                Object objOooO0Oo = c27677o00000oo4.OooO0Oo(str2, cloudMetaLocal2, cloudMetaRemote, z4, c27676o00000oO2);
                                if (objOooO0Oo != enumC32485OooO00o) {
                                    return objOooO0Oo;
                                }
                            } else {
                                CloudMetaLocal cloudMetaLocal5 = cloudMetaLocal2;
                                str3 = str2;
                                c27677o00000oo3 = c27677o00000oo4;
                                cloudMetaRemote3 = cloudMetaRemote;
                                if (cloudMetaLocal5.getDeleted()) {
                                    c27676o00000oO2.f97414OooOo0o = null;
                                    c27676o00000oO2.f97413OooOo = null;
                                    c27676o00000oO2.f97416OooOoO0 = null;
                                    c27676o00000oO2.f97415OooOoO = null;
                                    c27676o00000oO2.f97420OooOooO = 6;
                                    c27677o00000oo3.getClass();
                                    try {
                                        C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                                        c20358OooO00o3.OooOOO0("ResolveConflictUseCase");
                                        c20358OooO00o3.OooO0o0("Handling local deleted conflict for " + cloudMetaLocal5.getId(), new Object[0]);
                                        objOooO00o = new ConflictResolution(CloudMetaLocal.copy$default(cloudMetaLocal5, null, null, null, cloudMetaRemote3.getMetaVersion(), cloudMetaRemote3.getContentTag(), cloudMetaRemote3.getMetaHash(), null, null, false, cloudMetaRemote3.getDeleted(), cloudMetaRemote3.getLastSyncTime(), null, 2439, null), null, 2, null);
                                    } catch (Throwable th) {
                                        objOooO00o = C32446OooOOOo.OooO00o(th);
                                    }
                                    if (objOooO00o != enumC32485OooO00o) {
                                        return objOooO00o;
                                    }
                                    break;
                                } else {
                                    CloudMetaType cloudMetaTypeFromMime = CloudMetaType.INSTANCE.fromMime(cloudMetaRemote3.getMimeType());
                                    InterfaceC27660OoooOo0 interfaceC27660OoooOo0 = cloudMetaTypeFromMime != null ? c27677o00000oo3.f97425OooO0o.get(cloudMetaTypeFromMime) : null;
                                    if (interfaceC27660OoooOo0 != null) {
                                        c27676o00000oO2.f97414OooOo0o = c27677o00000oo3;
                                        c27676o00000oO2.f97413OooOo = str3;
                                        c27676o00000oO2.f97416OooOoO0 = cloudMetaLocal5;
                                        c27676o00000oO2.f97415OooOoO = cloudMetaRemote3;
                                        c27676o00000oO2.f97417OooOoOO = z4;
                                        c27676o00000oO2.f97420OooOooO = 7;
                                        objOooO0oo = interfaceC27660OoooOo0.OooO0oo(str3, c27676o00000oO2);
                                        if (objOooO0oo != enumC32485OooO00o) {
                                            cloudMetaLocal3 = cloudMetaLocal5;
                                            z5 = z4;
                                            if (objOooO0oo instanceof C32445OooOOOO.OooO00o) {
                                                objOooO0oo = null;
                                            }
                                            cloudContentTag = (CloudContentTag) objOooO0oo;
                                            z4 = z5;
                                            cloudMetaRemote5 = cloudMetaRemote3;
                                            C27677o00000oo c27677o00000oo5 = c27677o00000oo3;
                                            String str5 = str3;
                                            if (cloudMetaLocal3.getContentTag().matches(cloudMetaRemote5.getContentTag())) {
                                                z7 = true;
                                            } else {
                                                CloudContentTag stagedContentTag3 = cloudMetaLocal3.getStagedContentTag();
                                                if (stagedContentTag3 != null) {
                                                    z7 = true;
                                                    if (stagedContentTag3.matches(cloudMetaRemote5.getContentTag())) {
                                                    }
                                                    if (cloudContentTag != null) {
                                                        cloudMetaLocal4 = cloudMetaLocal3;
                                                        boolean z11 = cloudContentTag.isLastModifiedOldThan(cloudMetaRemote5.getContentTag().getLastModified()) == z7 ? z7 : false;
                                                        if (cloudContentTag != null || cloudContentTag.matches(cloudMetaRemote5.getContentTag()) != z7) {
                                                            z7 = false;
                                                        }
                                                        C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                                                        c20358OooO00o4.OooOOO0("ResolveConflictUseCase");
                                                        boolean z12 = z7;
                                                        Long l2 = cloudContentTag == null ? new Long(cloudContentTag.getLastModified()) : null;
                                                        long lastModified = cloudMetaRemote5.getContentTag().getLastModified();
                                                        long lastModified2 = cloudMetaLocal4.getContentTag().getLastModified();
                                                        stagedContentTag2 = cloudMetaLocal4.getStagedContentTag();
                                                        CloudContentTag cloudContentTag2 = cloudContentTag;
                                                        if (stagedContentTag2 == null) {
                                                            long lastModified3 = stagedContentTag2.getLastModified();
                                                            z9 = z4;
                                                            l = new Long(lastModified3);
                                                        } else {
                                                            z9 = z4;
                                                            l = null;
                                                        }
                                                        StringBuilder sb = new StringBuilder("Conflict resolution for ");
                                                        sb.append(str5);
                                                        sb.append(": isContentConsistency=");
                                                        sb.append(z8);
                                                        sb.append(", isLocalOlderThanCloud=");
                                                        sb.append(z11);
                                                        sb.append(", localActualContentTag=");
                                                        sb.append(l2);
                                                        sb.append(", cloudContentTag=");
                                                        sb.append(lastModified);
                                                        C22205OooOOo.OooO0OO(lastModified2, ", localMetaContentTag=", ", stagedContentTag=", sb);
                                                        sb.append(l);
                                                        c20358OooO00o4.OooO0o0(sb.toString(), new Object[0]);
                                                        if (!z8 || z12) {
                                                            CloudMetaLocal cloudMetaLocal6 = cloudMetaLocal4;
                                                            c27676o00000oO2.f97414OooOo0o = null;
                                                            c27676o00000oO2.f97413OooOo = null;
                                                            c27676o00000oO2.f97416OooOoO0 = null;
                                                            c27676o00000oO2.f97415OooOoO = null;
                                                            c27676o00000oO2.f97420OooOooO = 8;
                                                            objOooO0OO = c27677o00000oo5.OooO0OO(str5, cloudMetaLocal6, cloudMetaRemote5, c27676o00000oO2);
                                                            if (objOooO0OO == enumC32485OooO00o) {
                                                                return objOooO0OO;
                                                            }
                                                        } else {
                                                            if (z11) {
                                                                c27677o00000oo5.getClass();
                                                                try {
                                                                    c20358OooO00o4.OooOOO0("ResolveConflictUseCase");
                                                                    c20358OooO00o4.OooO0o0("Handling local older conflict for " + str5 + ", will accept remote update via RetryPull", new Object[0]);
                                                                    return new ConflictResolution(CloudMetaLocal.copy$default(cloudMetaLocal4, null, null, null, 0, cloudContentTag2 == null ? cloudMetaLocal4.getContentTag() : cloudContentTag2, null, null, null, false, false, 0L, null, 4015, null), SyncPostAction.RetryPull.INSTANCE);
                                                                } catch (Throwable th2) {
                                                                    return C32446OooOOOo.OooO00o(th2);
                                                                }
                                                            }
                                                            CloudMetaLocal cloudMetaLocal7 = cloudMetaLocal4;
                                                            if (cloudMetaRemote5.getDeleted()) {
                                                                c27676o00000oO2.f97414OooOo0o = null;
                                                                c27676o00000oO2.f97413OooOo = null;
                                                                c27676o00000oO2.f97416OooOoO0 = null;
                                                                c27676o00000oO2.f97415OooOoO = null;
                                                                c27676o00000oO2.f97420OooOooO = 9;
                                                                Object objOooO00o2 = c27677o00000oo5.OooO00o(str5, cloudMetaLocal7, cloudMetaRemote5, c27676o00000oO2);
                                                                if (objOooO00o2 != enumC32485OooO00o) {
                                                                    return objOooO00o2;
                                                                }
                                                            } else {
                                                                c27676o00000oO2.f97414OooOo0o = null;
                                                                c27676o00000oO2.f97413OooOo = null;
                                                                c27676o00000oO2.f97416OooOoO0 = null;
                                                                c27676o00000oO2.f97415OooOoO = null;
                                                                c27676o00000oO2.f97420OooOooO = 10;
                                                                Object objOooO0Oo2 = c27677o00000oo5.OooO0Oo(str5, cloudMetaLocal7, cloudMetaRemote5, z9, c27676o00000oO2);
                                                                if (objOooO0Oo2 != enumC32485OooO00o) {
                                                                    return objOooO0Oo2;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        cloudMetaLocal4 = cloudMetaLocal3;
                                                    }
                                                    if (cloudContentTag != null) {
                                                        z7 = false;
                                                        C34406OooO00o.C20358OooO00o c20358OooO00o42 = C34406OooO00o.f123390OooO00o;
                                                        c20358OooO00o42.OooOOO0("ResolveConflictUseCase");
                                                        boolean z122 = z7;
                                                        if (cloudContentTag == null) {
                                                        }
                                                        long lastModified4 = cloudMetaRemote5.getContentTag().getLastModified();
                                                        long lastModified22 = cloudMetaLocal4.getContentTag().getLastModified();
                                                        stagedContentTag2 = cloudMetaLocal4.getStagedContentTag();
                                                        CloudContentTag cloudContentTag22 = cloudContentTag;
                                                        if (stagedContentTag2 == null) {
                                                        }
                                                        StringBuilder sb2 = new StringBuilder("Conflict resolution for ");
                                                        sb2.append(str5);
                                                        sb2.append(": isContentConsistency=");
                                                        sb2.append(z8);
                                                        sb2.append(", isLocalOlderThanCloud=");
                                                        sb2.append(z11);
                                                        sb2.append(", localActualContentTag=");
                                                        sb2.append(l2);
                                                        sb2.append(", cloudContentTag=");
                                                        sb2.append(lastModified4);
                                                        C22205OooOOo.OooO0OO(lastModified22, ", localMetaContentTag=", ", stagedContentTag=", sb2);
                                                        sb2.append(l);
                                                        c20358OooO00o42.OooO0o0(sb2.toString(), new Object[0]);
                                                        if (z8) {
                                                            CloudMetaLocal cloudMetaLocal62 = cloudMetaLocal4;
                                                            c27676o00000oO2.f97414OooOo0o = null;
                                                            c27676o00000oO2.f97413OooOo = null;
                                                            c27676o00000oO2.f97416OooOoO0 = null;
                                                            c27676o00000oO2.f97415OooOoO = null;
                                                            c27676o00000oO2.f97420OooOooO = 8;
                                                            objOooO0OO = c27677o00000oo5.OooO0OO(str5, cloudMetaLocal62, cloudMetaRemote5, c27676o00000oO2);
                                                            if (objOooO0OO == enumC32485OooO00o) {
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    z7 = true;
                                                }
                                                z8 = false;
                                                if (cloudContentTag != null) {
                                                }
                                                if (cloudContentTag != null) {
                                                }
                                            }
                                            z8 = z7;
                                            if (cloudContentTag != null) {
                                            }
                                            if (cloudContentTag != null) {
                                            }
                                        }
                                    } else {
                                        cloudMetaLocal3 = cloudMetaLocal5;
                                        cloudContentTag = null;
                                        cloudMetaRemote5 = cloudMetaRemote3;
                                        C27677o00000oo c27677o00000oo52 = c27677o00000oo3;
                                        String str52 = str3;
                                        if (cloudMetaLocal3.getContentTag().matches(cloudMetaRemote5.getContentTag())) {
                                        }
                                        z8 = z7;
                                        if (cloudContentTag != null) {
                                        }
                                        if (cloudContentTag != null) {
                                        }
                                    }
                                }
                            }
                        } else {
                            InterfaceC27605OooO00o interfaceC27605OooO00o2 = c27677o00000oo2.f97421OooO00o;
                            c27676o00000oO2.f97414OooOo0o = c27677o00000oo2;
                            c27676o00000oO2.f97413OooOo = str2;
                            c27676o00000oO2.f97416OooOoO0 = cloudMetaLocal2;
                            c27676o00000oO2.f97415OooOoO = cloudMetaRemote;
                            c27676o00000oO2.f97417OooOoOO = z3;
                            c27676o00000oO2.f97420OooOooO = 4;
                            objOooo0O0 = interfaceC27605OooO00o2.Oooo0O0(str2, c27676o00000oO2);
                            if (objOooo0O0 != enumC32485OooO00o) {
                                cloudMetaRemote2 = cloudMetaRemote;
                                z6 = objOooo0O0 instanceof C32445OooOOOO.OooO00o;
                                cloudMetaRemote4 = (CloudMetaRemote) (!z6 ? null : objOooo0O0);
                                if (cloudMetaRemote4 == null) {
                                    cloudMetaRemote4 = cloudMetaRemote2;
                                }
                                if (z6) {
                                    C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
                                    c20358OooO00o5.OooOOO0("ResolveConflictUseCase");
                                    c20358OooO00o5.OooOO0o(C32445OooOOOO.OooO00o(objOooo0O0), C20593OooO0Oo.OooO0O0("fetchReconciledCloudMeta failed for ", str2, ", using fetched meta"), new Object[0]);
                                }
                                cloudMetaRemote = cloudMetaRemote4;
                                z4 = z3;
                                C27677o00000oo c27677o00000oo42 = c27677o00000oo2;
                                if (cloudMetaLocal2.getMetaVersion() > cloudMetaRemote.getMetaVersion()) {
                                }
                            }
                        }
                    }
                }
                return enumC32485OooO00o;
            case 1:
                boolean z13 = c27676o00000oO2.f97417OooOoOO;
                String str6 = c27676o00000oO2.f97413OooOo;
                c27677o00000oo = c27676o00000oO2.f97414OooOo0o;
                C32446OooOOOo.OooO0O0(obj2);
                z2 = z13;
                str4 = str6;
                objOooOO0O = obj2;
                cloudMetaLocal = (CloudMetaLocal) objOooOO0O;
                if (cloudMetaLocal != null) {
                }
                break;
            case 2:
                z3 = c27676o00000oO2.f97417OooOoOO;
                cloudMetaLocal = c27676o00000oO2.f97416OooOoO0;
                String str7 = c27676o00000oO2.f97413OooOo;
                C27677o00000oo c27677o00000oo6 = c27676o00000oO2.f97414OooOo0o;
                C32446OooOOOo.OooO0O0(obj2);
                obj = ((C32445OooOOOO) obj2).f116639OooOo0o;
                c27677o00000oo2 = c27677o00000oo6;
                str2 = str7;
                cloudMetaLocal2 = cloudMetaLocal;
                boolean z102 = obj instanceof C32445OooOOOO.OooO00o;
                cloudMetaRemote = (CloudMetaRemote) (!z102 ? null : obj);
                if (cloudMetaRemote != null) {
                }
                return enumC32485OooO00o;
            case 3:
                C32446OooOOOo.OooO0O0(obj2);
                return ((C32445OooOOOO) obj2).f116639OooOo0o;
            case 4:
                z3 = c27676o00000oO2.f97417OooOoOO;
                cloudMetaRemote2 = c27676o00000oO2.f97415OooOoO;
                cloudMetaLocal2 = c27676o00000oO2.f97416OooOoO0;
                str2 = c27676o00000oO2.f97413OooOo;
                c27677o00000oo2 = c27676o00000oO2.f97414OooOo0o;
                C32446OooOOOo.OooO0O0(obj2);
                objOooo0O0 = ((C32445OooOOOO) obj2).f116639OooOo0o;
                z6 = objOooo0O0 instanceof C32445OooOOOO.OooO00o;
                cloudMetaRemote4 = (CloudMetaRemote) (!z6 ? null : objOooo0O0);
                if (cloudMetaRemote4 == null) {
                }
                if (z6) {
                }
                cloudMetaRemote = cloudMetaRemote4;
                z4 = z3;
                C27677o00000oo c27677o00000oo422 = c27677o00000oo2;
                if (cloudMetaLocal2.getMetaVersion() > cloudMetaRemote.getMetaVersion()) {
                }
                return enumC32485OooO00o;
            case 5:
                C32446OooOOOo.OooO0O0(obj2);
                return ((C32445OooOOOO) obj2).f116639OooOo0o;
            case 6:
                C32446OooOOOo.OooO0O0(obj2);
                return ((C32445OooOOOO) obj2).f116639OooOo0o;
            case 7:
                z5 = c27676o00000oO2.f97417OooOoOO;
                cloudMetaRemote3 = c27676o00000oO2.f97415OooOoO;
                cloudMetaLocal3 = c27676o00000oO2.f97416OooOoO0;
                str3 = c27676o00000oO2.f97413OooOo;
                c27677o00000oo3 = c27676o00000oO2.f97414OooOo0o;
                C32446OooOOOo.OooO0O0(obj2);
                objOooO0oo = ((C32445OooOOOO) obj2).f116639OooOo0o;
                if (objOooO0oo instanceof C32445OooOOOO.OooO00o) {
                }
                cloudContentTag = (CloudContentTag) objOooO0oo;
                z4 = z5;
                cloudMetaRemote5 = cloudMetaRemote3;
                C27677o00000oo c27677o00000oo522 = c27677o00000oo3;
                String str522 = str3;
                if (cloudMetaLocal3.getContentTag().matches(cloudMetaRemote5.getContentTag())) {
                }
                z8 = z7;
                if (cloudContentTag != null) {
                }
                if (cloudContentTag != null) {
                }
                return enumC32485OooO00o;
            case 8:
                C32446OooOOOo.OooO0O0(obj2);
                return ((C32445OooOOOO) obj2).f116639OooOo0o;
            case 9:
                C32446OooOOOo.OooO0O0(obj2);
                return ((C32445OooOOOO) obj2).f116639OooOo0o;
            case 10:
                C32446OooOOOo.OooO0O0(obj2);
                return ((C32445OooOOOO) obj2).f116639OooOo0o;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
