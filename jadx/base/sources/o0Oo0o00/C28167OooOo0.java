package o0Oo0o00;

import com.orion.notein.domain.models.cloudsync.CloudSyncError;
import com.orion.notein.p607ui.datasync.CloudSyncDetailsFragment;
import kotlin.coroutines.Continuation;
import o0oOoOo.C31032OooO0OO;
import o0oOoOo.C31081Ooooo00;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0Oo0o00.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.datasync.CloudSyncDetailsFragment$initAdapters$1$onResolveClicked$2", m80623f = "CloudSyncDetailsFragment.kt", m80624l = {136, 140}, m80625m = "invokeSuspend")
public final class C28167OooOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C31032OooO0OO f99819OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f99820OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ CloudSyncDetailsFragment f99821OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C31081Ooooo00 f99822OooOoO0;

    /* JADX INFO: renamed from: o0Oo0o00.OooOo0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.datasync.CloudSyncDetailsFragment$initAdapters$1$onResolveClicked$2$1", m80623f = "CloudSyncDetailsFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32507OooOO0o<Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C31032OooO0OO f99823OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ CloudSyncDetailsFragment f99824OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(CloudSyncDetailsFragment cloudSyncDetailsFragment, C31032OooO0OO c31032OooO0OO, Continuation<? super OooO00o> continuation) {
            super(1, continuation);
            this.f99824OooOo0o = cloudSyncDetailsFragment;
            this.f99823OooOo = c31032OooO0OO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Continuation<?> continuation) {
            return new OooO00o(this.f99824OooOo0o, this.f99823OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Object invoke(Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            this.f99824OooOo0o.OooOooo().OooOO0o(this.f99823OooOo.f110782OooO00o);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28167OooOo0(C31032OooO0OO c31032OooO0OO, C31081Ooooo00 c31081Ooooo00, CloudSyncDetailsFragment cloudSyncDetailsFragment, Continuation<? super C28167OooOo0> continuation) {
        super(2, continuation);
        this.f99819OooOo = c31032OooO0OO;
        this.f99822OooOoO0 = c31081Ooooo00;
        this.f99821OooOoO = cloudSyncDetailsFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28167OooOo0(this.f99819OooOo, this.f99822OooOoO0, this.f99821OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28167OooOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (com.orion.notein.p607ui.datasync.CloudSyncDetailsFragment.OooOoO(r5, r6, r1, r7) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        if (com.orion.notein.p607ui.datasync.CloudSyncDetailsFragment.OooOoo(r5, r6, r1, r7) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        return r0;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f99820OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            final C31032OooO0OO c31032OooO0OO = this.f99819OooOo;
            String str = c31032OooO0OO.f110786OooO0o0;
            boolean zOooO0O0 = kotlin.jvm.internal.OooOOO0.OooO0O0(str, CloudSyncError.CODE_AUTH_EXPIRED);
            final CloudSyncDetailsFragment cloudSyncDetailsFragment = this.f99821OooOoO;
            C31081Ooooo00 c31081Ooooo00 = this.f99822OooOoO0;
            if (zOooO0O0 && c31081Ooooo00.f110928OooO0O0) {
                OooO00o oooO00o = new OooO00o(cloudSyncDetailsFragment, c31032OooO0OO, null);
                this.f99820OooOo0o = 1;
            } else if (kotlin.jvm.internal.OooOOO0.OooO0O0(str, CloudSyncError.CODE_STORAGE_FULL) && c31081Ooooo00.f110929OooO0OO) {
                oO0O000o.OooO00o oooO00o2 = new oO0O000o.OooO00o() { // from class: o0Oo0o00.OooOOoo
                    @Override // oO0O000o.OooO00o
                    public final Object invoke() {
                        cloudSyncDetailsFragment.OooOooo().OooOO0o(c31032OooO0OO.f110782OooO00o);
                        return C32460OooOooO.f116667OooO00o;
                    }
                };
                this.f99820OooOo0o = 2;
            } else if (kotlin.jvm.internal.OooOOO0.OooO0O0(str, CloudSyncError.CODE_APP_VERSION_INCOMPATIBLE) && c31081Ooooo00.f110930OooO0Oo) {
                CloudSyncDetailsFragment.OooOooO(cloudSyncDetailsFragment, c31081Ooooo00, new oO0O000o.OooO00o() { // from class: o0Oo0o00.OooOo00
                    @Override // oO0O000o.OooO00o
                    public final Object invoke() {
                        cloudSyncDetailsFragment.OooOooo().OooOO0o(c31032OooO0OO.f110782OooO00o);
                        return C32460OooOooO.f116667OooO00o;
                    }
                });
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
