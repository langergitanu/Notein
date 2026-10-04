package o0OOo0oo;

import com.orion.notein.domain.models.cloudsync.CloudMetaRemote;
import com.orion.notein.domain.models.cloudsync.CloudMetaType;
import com.orion.notein.domain.models.cloudsync.CloudSyncError;
import java.io.File;
import java.util.Map;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0OOo0o0.InterfaceC27605OooO00o;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOo0oo.Oooo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27643Oooo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f97215OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC27605OooO00o f97216OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Map<CloudMetaType, InterfaceC27660OoooOo0> f97217OooO0OO;

    public C27643Oooo0(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO, InterfaceC27605OooO00o cloudSyncRepo, Map map) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(cloudSyncRepo, "cloudSyncRepo");
        this.f97215OooO00o = abstractApplicationC26277OooOoOO;
        this.f97216OooO0O0 = cloudSyncRepo;
        this.f97217OooO0OO = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO00o(C27643Oooo0 c27643Oooo0, CloudMetaRemote cloudMetaRemote, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27644Oooo000 c27644Oooo000;
        Object objOooOOo;
        c27643Oooo0.getClass();
        if (abstractC32479OooO0OO instanceof C27644Oooo000) {
            c27644Oooo000 = (C27644Oooo000) abstractC32479OooO0OO;
            int i = c27644Oooo000.f97222OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27644Oooo000.f97222OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27644Oooo000 = new C27644Oooo000(c27643Oooo0, abstractC32479OooO0OO);
            }
        }
        Object obj = c27644Oooo000.f97221OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27644Oooo000.f97222OooOoOO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                if (cloudMetaRemote.getContentTag().isEmpty()) {
                    throw new IllegalArgumentException("etag empty");
                }
                File file = new File(str);
                if (!file.exists() || !cloudMetaRemote.getContentTag().matchesForFile(file)) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("FetchCloudBundleUseCase");
                    c20358OooO00o.OooO00o("Bundle missing or invalid for " + cloudMetaRemote.getId() + "; fetching remote", new Object[0]);
                    File parentFile = file.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    InterfaceC27605OooO00o interfaceC27605OooO00o = c27643Oooo0.f97216OooO0O0;
                    String id = cloudMetaRemote.getId();
                    c27644Oooo000.f97219OooOo0o = cloudMetaRemote;
                    c27644Oooo000.f97218OooOo = str;
                    c27644Oooo000.f97222OooOoOO = 1;
                    objOooOOo = interfaceC27605OooO00o.OooOOo(id, str, c27644Oooo000);
                    if (objOooOOo == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c27644Oooo000.f97218OooOo;
            cloudMetaRemote = c27644Oooo000.f97219OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            objOooOOo = ((C32445OooOOOO) obj).f116639OooOo0o;
            if (objOooOOo instanceof C32445OooOOOO.OooO00o) {
                Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooOOo);
                kotlin.jvm.internal.OooOOO0.OooO0Oo(thOooO00o);
                throw thOooO00o;
            }
            if (!cloudMetaRemote.getContentTag().matchesForFile(new File(str))) {
                throw new CloudSyncError.ChecksumMismatch(null, 1, null);
            }
            return C32460OooOooO.f116667OooO00o;
        } catch (Throwable th) {
            return C32446OooOOOo.OooO00o(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(CloudMetaRemote cloudMetaRemote, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27645Oooo00O c27645Oooo00O;
        if (abstractC32479OooO0OO instanceof C27645Oooo00O) {
            c27645Oooo00O = (C27645Oooo00O) abstractC32479OooO0OO;
            int i = c27645Oooo00O.f97225OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27645Oooo00O.f97225OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c27645Oooo00O = new C27645Oooo00O(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c27645Oooo00O.f97224OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27645Oooo00O.f97225OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            C27646Oooo00o c27646Oooo00o = new C27646Oooo00o(cloudMetaRemote, this, null);
            c27645Oooo00O.f97225OooOoO0 = 1;
            objOooO0o = C33609OooO0oo.OooO0o(executorC33873OooO0O0, c27646Oooo00o, c27645Oooo00O);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0o);
        }
        return ((C32445OooOOOO) objOooO0o).f116639OooOo0o;
    }
}
