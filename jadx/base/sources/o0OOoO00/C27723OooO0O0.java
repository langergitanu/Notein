package o0OOoO00;

import com.orion.notein.domain.models.cloudsync.CloudMetaRemote;
import com.orion.notein.domain.models.cloudsync.CloudMetaType;
import com.orion.notein.domain.models.cloudsync.SyncEvent;
import com.orion.notein.domain.models.cloudsync.SyncPhase;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0OOo0oo.o0O0O00;
import o0OOoO0O.C27750OooOoO0;
import o0OOoO0o.C27755OooO0Oo;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0Oo.C33769Ooooo0o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOoO00.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27723OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C27755OooO0Oo f97800OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C27750OooOoO0 f97801OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0O0O00 f97802OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C33769Ooooo0o f97803OooO0Oo;

    /* JADX INFO: renamed from: o0OOoO00.OooO0O0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.facade.CloudSyncFacade$2", m80623f = "CloudSyncFacade.kt", m80624l = {57}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<SyncEvent, Continuation<? super SyncPhase>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ Object f97804OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f97805OooOo0o;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = C27723OooO0O0.this.new OooO00o(continuation);
            oooO00o.f97804OooOo = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(SyncEvent syncEvent, Continuation<? super SyncPhase> continuation) {
            return ((OooO00o) create(syncEvent, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f97805OooOo0o;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return obj;
            }
            C32446OooOOOo.OooO0O0(obj);
            SyncEvent syncEvent = (SyncEvent) this.f97804OooOo;
            C27750OooOoO0 c27750OooOoO0 = C27723OooO0O0.this.f97801OooO0O0;
            this.f97805OooOo0o = 1;
            Enum enumOooO0O0 = c27750OooOoO0.OooO0O0(syncEvent, this);
            return enumOooO0O0 == enumC32485OooO00o ? enumC32485OooO00o : enumOooO0O0;
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [o0OOoO00.OooO00o] */
    public C27723OooO0O0(C27755OooO0Oo scheduler, C27750OooOoO0 eventProcessor, o0O0O00 pollRemoteChanges) {
        OooOOO0.OooO0oO(scheduler, "scheduler");
        OooOOO0.OooO0oO(eventProcessor, "eventProcessor");
        OooOOO0.OooO0oO(pollRemoteChanges, "pollRemoteChanges");
        this.f97800OooO00o = scheduler;
        this.f97801OooO0O0 = eventProcessor;
        this.f97802OooO0OO = pollRemoteChanges;
        this.f97803OooO0Oo = scheduler.f97992OooO0o0;
        eventProcessor.f97969OooOOO0 = new InterfaceC32507OooOO0o() { // from class: o0OOoO00.OooO00o
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) {
                SyncEvent event = (SyncEvent) obj;
                OooOOO0.OooO0oO(event, "event");
                this.f97799OooOo0o.f97800OooO00o.OooO0o0(event);
                return C32460OooOooO.f116667OooO00o;
            }
        };
        scheduler.f97998OooOOO = new OooO00o(null);
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("CloudSyncFacade");
        c20358OooO00o.OooO0o0("CloudSyncFacade initialized", new Object[0]);
    }

    public static void OooO0o0(C27723OooO0O0 c27723OooO0O0, String metaId, CloudMetaType metaType) {
        c27723OooO0O0.getClass();
        OooOOO0.OooO0oO(metaId, "metaId");
        OooOOO0.OooO0oO(metaType, "metaType");
        c27723OooO0O0.f97800OooO00o.OooO0o0(new SyncEvent.RequestPush(metaId, metaType, false));
    }

    public final void OooO00o(String metaId, CloudMetaRemote dirtyCloudMeta) {
        OooOOO0.OooO0oO(metaId, "metaId");
        OooOOO0.OooO0oO(dirtyCloudMeta, "dirtyCloudMeta");
        this.f97800OooO00o.OooO0o0(new SyncEvent.CloudDeleted(metaId, dirtyCloudMeta));
    }

    public final void OooO0O0(String metaId, CloudMetaRemote dirtyCloudMeta) {
        OooOOO0.OooO0oO(metaId, "metaId");
        OooOOO0.OooO0oO(dirtyCloudMeta, "dirtyCloudMeta");
        this.f97800OooO00o.OooO0o0(new SyncEvent.CloudModified(metaId, dirtyCloudMeta));
    }

    public final void OooO0OO(String metaId, CloudMetaType metaType) {
        OooOOO0.OooO0oO(metaId, "metaId");
        OooOOO0.OooO0oO(metaType, "metaType");
        this.f97800OooO00o.OooO0o0(new SyncEvent.LocalModified(metaId, metaType));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0Oo(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27724OooO0OO c27724OooO0OO;
        if (abstractC32479OooO0OO instanceof C27724OooO0OO) {
            c27724OooO0OO = (C27724OooO0OO) abstractC32479OooO0OO;
            int i = c27724OooO0OO.f97809OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27724OooO0OO.f97809OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c27724OooO0OO = new C27724OooO0OO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27724OooO0OO.f97808OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27724OooO0OO.f97809OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c27724OooO0OO.f97809OooOoO0 = 1;
            if (this.f97802OooO0OO.OooO00o(c27724OooO0OO) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            ((C32445OooOOOO) obj).getClass();
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
