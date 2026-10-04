package o0o0OoOo;

import com.aspose.slides.C22227OoooO;
import com.orion.notein.domain.models.cloudsync.CloudMetaLocal;
import com.orion.notein.domain.models.cloudsync.CloudMetaRemote;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOo0Oo.EnumC27285OooO;
import o0OOo0o0.InterfaceC27605OooO00o;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0o0OoOo.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.debug.viewmodel.DebugViewModel$logCloudSyncStatus$2", m80623f = "DebugViewModel.kt", m80624l = {193, 194, 197, 202}, m80625m = "invokeSuspend")
public final class C30733OooOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f109921OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f109922OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C30722OooO00o f109923OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30733OooOOO(C30722OooO00o c30722OooO00o, Continuation<? super C30733OooOOO> continuation) {
        super(2, continuation);
        this.f109923OooOoO0 = c30722OooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30733OooOOO(this.f109923OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30733OooOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a4, code lost:
    
        if (r12 != r0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b A[PHI: r12
      0x007b: PHI (r12v10 java.lang.Object) = (r12v9 java.lang.Object), (r12v0 java.lang.Object) binds: [B:24:0x0078, B:11:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089 A[LOOP:1: B:27:0x0083->B:29:0x0089, LOOP_END] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooO0Oo;
        String str;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f109921OooOo;
        InterfaceC27605OooO00o interfaceC27605OooO00o = this.f109923OooOoO0.f109871OooOOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f109921OooOo = 1;
            objOooO0Oo = interfaceC27605OooO00o.OooO0Oo(this);
            if (objOooO0Oo != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
            objOooO0Oo = ((C32445OooOOOO) obj).f116639OooOo0o;
        } else {
            if (i == 2) {
                str = this.f109922OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                StringBuilder sbOooO00o = C22227OoooO.OooO00o(c20358OooO00o, "DebugViewModel", "logCloudSyncStatus, driveId: ", str, ", currentCloudSyncType: ");
                sbOooO00o.append((EnumC27285OooO) obj);
                c20358OooO00o.OooO0o0(sbOooO00o.toString(), new Object[0]);
                this.f109922OooOo0o = null;
                this.f109921OooOo = 3;
                obj = interfaceC27605OooO00o.OooOoO0(this);
                if (obj != enumC32485OooO00o) {
                    while (r12.hasNext()) {
                    }
                    this.f109921OooOo = 4;
                    obj = interfaceC27605OooO00o.OooOOOo(this);
                }
                return enumC32485OooO00o;
            }
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                for (CloudMetaRemote cloudMetaRemote : (List) obj) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("DebugViewModel");
                    c20358OooO00o2.OooO0o0(String.valueOf(cloudMetaRemote), new Object[0]);
                }
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            for (CloudMetaLocal cloudMetaLocal : (List) obj) {
                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o3.OooOOO0("DebugViewModel");
                c20358OooO00o3.OooO0o0(String.valueOf(cloudMetaLocal), new Object[0]);
            }
            this.f109921OooOo = 4;
            obj = interfaceC27605OooO00o.OooOOOo(this);
        }
        if (objOooO0Oo instanceof C32445OooOOOO.OooO00o) {
            objOooO0Oo = null;
        }
        str = (String) objOooO0Oo;
        this.f109922OooOo0o = str;
        this.f109921OooOo = 2;
        obj = interfaceC27605OooO00o.OooO0o(this);
        if (obj != enumC32485OooO00o) {
            C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
            StringBuilder sbOooO00o2 = C22227OoooO.OooO00o(c20358OooO00o4, "DebugViewModel", "logCloudSyncStatus, driveId: ", str, ", currentCloudSyncType: ");
            sbOooO00o2.append((EnumC27285OooO) obj);
            c20358OooO00o4.OooO0o0(sbOooO00o2.toString(), new Object[0]);
            this.f109922OooOo0o = null;
            this.f109921OooOo = 3;
            obj = interfaceC27605OooO00o.OooOoO0(this);
            if (obj != enumC32485OooO00o) {
            }
        }
        return enumC32485OooO00o;
    }
}
