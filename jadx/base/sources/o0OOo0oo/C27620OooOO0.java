package o0OOo0oo;

import com.huawei.hms.network.embedded.C18385v2;
import com.orion.notein.domain.models.cloudsync.CloudSyncError;
import java.io.File;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOo0oo.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.CloudEventHandlerUseCase$start$1", m80623f = "CloudEventHandlerUseCase.kt", m80624l = {58, 61, 66}, m80625m = "invokeSuspend")
public final class C27620OooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f97123OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f97124OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C27618OooO0oO f97125OooOoO0;

    /* JADX INFO: renamed from: o0OOo0oo.OooOO0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.CloudEventHandlerUseCase$start$1$1", m80623f = "CloudEventHandlerUseCase.kt", m80624l = {55}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C27618OooO0oO f97126OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f97127OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C27618OooO0oO c27618OooO0oO, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f97126OooOo = c27618OooO0oO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f97126OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f97127OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f97127OooOo0o = 1;
                C27618OooO0oO c27618OooO0oO = this.f97126OooOo;
                c27618OooO0oO.getClass();
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("CloudEventHandlerUseCase");
                c20358OooO00o.OooO0o0("CloudEventHandler started, observing cloud events...", new Object[0]);
                Object objCollect = c27618OooO0oO.f97111OooO0O0.OooO0oO().collect(new C27611OooO(c27618OooO0oO), this);
                if (objCollect != enumC32485OooO00o) {
                    objCollect = C32460OooOooO.f116667OooO00o;
                }
                if (objCollect == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27620OooOO0(C27618OooO0oO c27618OooO0oO, Continuation<? super C27620OooOO0> continuation) {
        super(2, continuation);
        this.f97125OooOoO0 = c27618OooO0oO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C27620OooOO0 c27620OooOO0 = new C27620OooOO0(this.f97125OooOoO0, continuation);
        c27620OooOO0.f97123OooOo = obj;
        return c27620OooOO0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27620OooOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x014b, code lost:
    
        if (r8.f97114OooO0o.OooO00o(r21) != r4) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0107  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        File file;
        int i2 = 1;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = this.f97124OooOo0o;
        C27618OooO0oO c27618OooO0oO = this.f97125OooOoO0;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f97123OooOo;
            c27618OooO0oO.getClass();
            try {
                file = new File(c27618OooO0oO.f97110OooO00o.getFilesDir(), "cloud_cache_dir");
            } catch (Exception e) {
                e = e;
                i = i2;
            }
            if (file.exists() && file.isDirectory()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    int length = fileArrListFiles.length;
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < length) {
                        File file2 = fileArrListFiles[i4];
                        if (file2.isFile() && jCurrentTimeMillis - file2.lastModified() > C18385v2.f56338j && file2.delete()) {
                            i5 += i2;
                            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o.OooOOO0("CloudEventHandlerUseCase");
                            String name = file2.getName();
                            i = i2;
                            try {
                                c20358OooO00o.OooO00o("Deleted stale cache file: " + name, new Object[0]);
                            } catch (Exception e2) {
                                e = e2;
                            }
                        } else {
                            i = i2;
                        }
                        i4++;
                        i2 = i;
                    }
                    i = i2;
                    if (i5 > 0) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o2.OooOOO0("CloudEventHandlerUseCase");
                        c20358OooO00o2.OooO0o0("Cleaned up " + i5 + " stale cache files", new Object[0]);
                    }
                    if (c27618OooO0oO.f97109OooO.OooO00o()) {
                        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(c27618OooO0oO, null), 3);
                        this.f97124OooOo0o = i;
                        if (c27618OooO0oO.f97116OooO0oO.OooO0OO(this) != obj2) {
                        }
                        return obj2;
                    }
                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o3.OooOOO0("CloudEventHandlerUseCase");
                    c20358OooO00o3.OooOO0O("Cloud sync is remotely disabled, skipping startup sync", new Object[0]);
                    c27618OooO0oO.f97115OooO0o0.OooO00o(new CloudSyncError.RemoteDisabled(null, i, null));
                    return C32460OooOooO.f116667OooO00o;
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o4.OooOOO0("CloudEventHandlerUseCase");
                c20358OooO00o4.OooOO0o(e, "Failed to cleanup stale cache files", new Object[0]);
                if (c27618OooO0oO.f97109OooO.OooO00o()) {
                }
            }
            i = 1;
            if (c27618OooO0oO.f97109OooO.OooO00o()) {
            }
        } else if (i3 == 1) {
            C32446OooOOOo.OooO0O0(obj);
        } else {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            c27618OooO0oO.f97112OooO0OO.f97800OooO00o.OooOOOo();
            this.f97124OooOo0o = 3;
        }
        C27629OooOOoo c27629OooOOoo = c27618OooO0oO.f97113OooO0Oo;
        this.f97124OooOo0o = 2;
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27628OooOOo0(c27629OooOOoo, null), this);
        if (objOooO0o != EnumC32485OooO00o.f116726OooOo0o) {
            objOooO0o = C32460OooOooO.f116667OooO00o;
        }
        if (objOooO0o != obj2) {
            c27618OooO0oO.f97112OooO0OO.f97800OooO00o.OooOOOo();
            this.f97124OooOo0o = 3;
        }
        return obj2;
    }
}
