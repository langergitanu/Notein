package o0Oo0o00;

import com.aspose.words.StyleIdentifier;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.orion.notein.domain.models.cloudsync.CloudAuthResult;
import com.orion.notein.p607ui.datasync.CloudSyncFragment;
import kotlin.coroutines.Continuation;
import o0OOo0Oo.EnumC27285OooO;
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

/* JADX INFO: renamed from: o0Oo0o00.Oooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.datasync.CloudSyncFragment$handleGoogleSignInResult$1", m80623f = "CloudSyncFragment.kt", m80624l = {304, 315, StyleIdentifier.GRID_TABLE_2_ACCENT_6}, m80625m = "invokeSuspend")
public final class C28185Oooo0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ CloudSyncFragment f99877OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f99878OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28185Oooo0o(CloudSyncFragment cloudSyncFragment, Continuation<? super C28185Oooo0o> continuation) {
        super(2, continuation);
        this.f99877OooOo = cloudSyncFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28185Oooo0o(this.f99877OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28185Oooo0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x009f, code lost:
    
        if (r10.OooO0oO(r1, r9) != r0) goto L34;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f99878OooOo0o;
        CloudSyncFragment cloudSyncFragment = this.f99877OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C28194OoooOOO c28194OoooOOOOooOoo = cloudSyncFragment.OooOoo();
            EnumC27285OooO enumC27285OooO = EnumC27285OooO.f95079OooOoOO;
            this.f99878OooOo0o = 1;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28190OoooO0(c28194OoooOOOOooOoo, enumC27285OooO, null, null), this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            C28194OoooOOO c28194OoooOOOOooOoo2 = cloudSyncFragment.OooOoo();
            EnumC27285OooO enumC27285OooO2 = EnumC27285OooO.f95076OooOo0o;
            this.f99878OooOo0o = 3;
        }
        CloudAuthResult cloudAuthResult = (CloudAuthResult) obj;
        if (cloudAuthResult instanceof CloudAuthResult.Success) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("CloudSyncFragment");
            c20358OooO00o.OooO0o0("Google Drive authorization completed successfully after sign-in", new Object[0]);
        } else {
            if (cloudAuthResult instanceof CloudAuthResult.Failure) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("CloudSyncFragment");
                CloudAuthResult.Failure failure = (CloudAuthResult.Failure) cloudAuthResult;
                Throwable throwable = failure.getThrowable();
                String errorCode = failure.getErrorCode();
                if (errorCode == null) {
                    errorCode = failure.getMessage();
                }
                c20358OooO00o2.OooO0Oo(throwable, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Google Drive authorization failed after sign-in: ", errorCode), new Object[0]);
                SwitchMaterial switchMaterial = cloudSyncFragment.f71441OooOooo;
                if (switchMaterial == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("googleDriveSwitch");
                    throw null;
                }
                switchMaterial.setChecked(false);
                C28194OoooOOO c28194OoooOOOOooOoo3 = cloudSyncFragment.OooOoo();
                EnumC27285OooO enumC27285OooO3 = EnumC27285OooO.f95079OooOoOO;
                this.f99878OooOo0o = 2;
                if (c28194OoooOOOOooOoo3.OooO0o(enumC27285OooO3, this) != enumC32485OooO00o) {
                    C28194OoooOOO c28194OoooOOOOooOoo22 = cloudSyncFragment.OooOoo();
                    EnumC27285OooO enumC27285OooO22 = EnumC27285OooO.f95076OooOo0o;
                    this.f99878OooOo0o = 3;
                }
                return enumC32485OooO00o;
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("CloudSyncFragment");
            c20358OooO00o3.OooOO0O("Unexpected auth result after Google sign-in: " + cloudAuthResult, new Object[0]);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
