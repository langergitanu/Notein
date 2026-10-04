package com.orion.notein.domain.models.cloudsync;

import androidx.core.app.NotificationCompat;
import com.orion.notein.domain.models.cloudsync.SyncEvent;
import com.orion.notein.domain.models.cloudsync.SyncPostAction;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0OOo000.OooO0O0;
import oO00ooO.C32442OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a9\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u001a\b\u0002\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00000\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/SyncPhase;", "", "isStable", "(Lcom/orion/notein/domain/models/cloudsync/SyncPhase;)Z", "isProcessing", "Lcom/orion/notein/domain/models/cloudsync/SyncState;", "state", "Lcom/orion/notein/domain/models/cloudsync/SyncEvent;", NotificationCompat.CATEGORY_EVENT, "Lkotlin/Function2;", "illegal", "reduce", "(Lcom/orion/notein/domain/models/cloudsync/SyncState;Lcom/orion/notein/domain/models/cloudsync/SyncEvent;LoO0O000o/OooOOOo;)Lcom/orion/notein/domain/models/cloudsync/SyncState;", "app_google_playRelease"}, m80613k = 2, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class SyncStateKt {

    @Metadata(m80613k = 3, m80614mv = {2, 1, 0}, m80616xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SyncPhase.values().length];
            try {
                iArr[SyncPhase.CLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SyncPhase.DIRTY_LOCAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SyncPhase.DIRTY_CLOUD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SyncPhase.CONFLICT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SyncPhase.PACKAGING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SyncPhase.UPLOADING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SyncPhase.DOWNLOADING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SyncPhase.RESTORING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SyncPhase.RESOLVING_CONFLICT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean isProcessing(SyncPhase syncPhase) {
        OooOOO0.OooO0oO(syncPhase, "<this>");
        return !isStable(syncPhase);
    }

    public static final boolean isStable(SyncPhase syncPhase) {
        OooOOO0.OooO0oO(syncPhase, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[syncPhase.ordinal()];
        return i == 1 || i == 2 || i == 3 || i == 4;
    }

    public static final SyncState reduce(SyncState state, SyncEvent event, InterfaceC32508OooOOOo<? super SyncPhase, ? super SyncEvent, ? extends SyncPhase> illegal) {
        SyncPhase syncPhaseInvoke;
        OooOOO0.OooO0oO(state, "state");
        OooOOO0.OooO0oO(event, "event");
        OooOOO0.OooO0oO(illegal, "illegal");
        switch (WhenMappings.$EnumSwitchMapping$0[state.getPhase().ordinal()]) {
            case 1:
                syncPhaseInvoke = (!(event instanceof SyncEvent.LocalModified) && !(event instanceof SyncEvent.LocalDeleted)) ? (!(event instanceof SyncEvent.CloudModified) && !(event instanceof SyncEvent.CloudDeleted)) ? illegal.invoke(state.getPhase(), event) : SyncPhase.DIRTY_CLOUD : SyncPhase.DIRTY_LOCAL;
                break;
            case 2:
                syncPhaseInvoke = !(event instanceof SyncEvent.RequestPush) ? (!(event instanceof SyncEvent.LocalDeleted) && !(event instanceof SyncEvent.LocalModified)) ? (!(event instanceof SyncEvent.CloudDeleted) && !(event instanceof SyncEvent.CloudModified) && !(event instanceof SyncEvent.ContentConflict)) ? illegal.invoke(state.getPhase(), event) : SyncPhase.CONFLICT : SyncPhase.DIRTY_LOCAL : SyncPhase.PACKAGING;
                break;
            case 3:
                syncPhaseInvoke = !(event instanceof SyncEvent.RequestPull) ? (!(event instanceof SyncEvent.LocalModified) && !(event instanceof SyncEvent.LocalDeleted)) ? (!(event instanceof SyncEvent.CloudModified) && !(event instanceof SyncEvent.CloudDeleted)) ? !(event instanceof SyncEvent.ContentConflict) ? illegal.invoke(state.getPhase(), event) : SyncPhase.CONFLICT : SyncPhase.DIRTY_CLOUD : SyncPhase.CONFLICT : SyncPhase.DOWNLOADING;
                break;
            case 4:
                if (event instanceof SyncEvent.RequestResolve) {
                    syncPhaseInvoke = SyncPhase.RESOLVING_CONFLICT;
                } else if (!(event instanceof SyncEvent.AutoResolveSucceeded)) {
                    syncPhaseInvoke = !(event instanceof SyncEvent.LocalDeleted) ? !(event instanceof SyncEvent.CloudDeleted) ? (!(event instanceof SyncEvent.LocalModified) && !(event instanceof SyncEvent.CloudModified)) ? illegal.invoke(state.getPhase(), event) : SyncPhase.CONFLICT : SyncPhase.DIRTY_CLOUD : SyncPhase.DIRTY_LOCAL;
                } else {
                    SyncPostAction postAction = ((SyncEvent.AutoResolveSucceeded) event).getResolvedResult().getPostAction();
                    syncPhaseInvoke = !(postAction instanceof SyncPostAction.RetryPull) ? !(postAction instanceof SyncPostAction.PushFull) ? !(postAction instanceof SyncPostAction.PushDuplicateFull) ? SyncPhase.CLEAN : SyncPhase.CLEAN : SyncPhase.DIRTY_LOCAL : SyncPhase.DIRTY_CLOUD;
                }
                break;
            case 5:
                syncPhaseInvoke = !(event instanceof SyncEvent.PackageSucceeded) ? (!(event instanceof SyncEvent.PackageFailed) && !(event instanceof SyncEvent.LocalDeleted) && !(event instanceof SyncEvent.LocalModified)) ? (!(event instanceof SyncEvent.CloudDeleted) && !(event instanceof SyncEvent.CloudModified) && !(event instanceof SyncEvent.ContentConflict)) ? illegal.invoke(state.getPhase(), event) : SyncPhase.CONFLICT : SyncPhase.DIRTY_LOCAL : SyncPhase.UPLOADING;
                break;
            case 6:
                if (event instanceof SyncEvent.UploadSucceeded) {
                    syncPhaseInvoke = SyncPhase.CLEAN;
                } else if ((event instanceof SyncEvent.UploadFailed) || (event instanceof SyncEvent.LocalDeleted) || (event instanceof SyncEvent.LocalModified)) {
                    syncPhaseInvoke = SyncPhase.DIRTY_LOCAL;
                } else if ((event instanceof SyncEvent.CloudDeleted) || (event instanceof SyncEvent.CloudModified)) {
                    syncPhaseInvoke = SyncPhase.CONFLICT;
                } else if (event instanceof SyncEvent.RemoteNotFoundResolved) {
                    SyncPostAction postAction2 = ((SyncEvent.RemoteNotFoundResolved) event).getPostAction();
                    if (postAction2 instanceof SyncPostAction.PushFull) {
                        syncPhaseInvoke = SyncPhase.DIRTY_LOCAL;
                    } else if ((postAction2 instanceof SyncPostAction.PushDuplicateFull) || (postAction2 instanceof SyncPostAction.AcceptRemoteDelete)) {
                        syncPhaseInvoke = SyncPhase.CLEAN;
                    } else {
                        if (!(postAction2 instanceof SyncPostAction.RetryPull) && !(postAction2 instanceof SyncPostAction.None)) {
                            throw new C32442OooOO0o();
                        }
                        syncPhaseInvoke = SyncPhase.DIRTY_CLOUD;
                    }
                } else if (!(event instanceof SyncEvent.AutoResolveSucceeded)) {
                    syncPhaseInvoke = !(event instanceof SyncEvent.ContentConflict) ? illegal.invoke(state.getPhase(), event) : SyncPhase.CONFLICT;
                } else {
                    SyncPostAction postAction3 = ((SyncEvent.AutoResolveSucceeded) event).getResolvedResult().getPostAction();
                    syncPhaseInvoke = !(postAction3 instanceof SyncPostAction.RetryPull) ? ((postAction3 instanceof SyncPostAction.PushFull) || !(postAction3 instanceof SyncPostAction.PushDuplicateFull)) ? SyncPhase.DIRTY_LOCAL : SyncPhase.CLEAN : SyncPhase.DIRTY_CLOUD;
                }
                break;
            case 7:
                if (event instanceof SyncEvent.DownloadSucceeded) {
                    syncPhaseInvoke = SyncPhase.RESTORING;
                } else if (event instanceof SyncEvent.DownloadFailed) {
                    syncPhaseInvoke = SyncPhase.DIRTY_CLOUD;
                } else if ((event instanceof SyncEvent.LocalModified) || (event instanceof SyncEvent.LocalDeleted)) {
                    syncPhaseInvoke = SyncPhase.CONFLICT;
                } else if ((event instanceof SyncEvent.CloudModified) || (event instanceof SyncEvent.CloudDeleted)) {
                    syncPhaseInvoke = SyncPhase.DIRTY_CLOUD;
                } else if (event instanceof SyncEvent.RemoteNotFoundResolved) {
                    SyncPostAction postAction4 = ((SyncEvent.RemoteNotFoundResolved) event).getPostAction();
                    if (postAction4 instanceof SyncPostAction.PushFull) {
                        syncPhaseInvoke = SyncPhase.DIRTY_LOCAL;
                    } else if ((postAction4 instanceof SyncPostAction.PushDuplicateFull) || (postAction4 instanceof SyncPostAction.AcceptRemoteDelete)) {
                        syncPhaseInvoke = SyncPhase.CLEAN;
                    } else {
                        if (!(postAction4 instanceof SyncPostAction.RetryPull) && !(postAction4 instanceof SyncPostAction.None)) {
                            throw new C32442OooOO0o();
                        }
                        syncPhaseInvoke = SyncPhase.DIRTY_CLOUD;
                    }
                } else if (!(event instanceof SyncEvent.AutoResolveSucceeded)) {
                    syncPhaseInvoke = !(event instanceof SyncEvent.ContentConflict) ? illegal.invoke(state.getPhase(), event) : SyncPhase.CONFLICT;
                } else {
                    SyncPostAction postAction5 = ((SyncEvent.AutoResolveSucceeded) event).getResolvedResult().getPostAction();
                    syncPhaseInvoke = !(postAction5 instanceof SyncPostAction.RetryPull) ? !(postAction5 instanceof SyncPostAction.PushFull) ? !(postAction5 instanceof SyncPostAction.PushDuplicateFull) ? SyncPhase.DIRTY_CLOUD : SyncPhase.CLEAN : SyncPhase.DIRTY_LOCAL : SyncPhase.DIRTY_CLOUD;
                }
                break;
            case 8:
                syncPhaseInvoke = !(event instanceof SyncEvent.RestoreFailed) ? !(event instanceof SyncEvent.RestoreSucceeded) ? (!(event instanceof SyncEvent.LocalModified) && !(event instanceof SyncEvent.LocalDeleted)) ? (!(event instanceof SyncEvent.CloudModified) && !(event instanceof SyncEvent.CloudDeleted)) ? !(event instanceof SyncEvent.ContentConflict) ? illegal.invoke(state.getPhase(), event) : SyncPhase.CONFLICT : SyncPhase.DIRTY_CLOUD : SyncPhase.CONFLICT : SyncPhase.CLEAN : SyncPhase.DIRTY_CLOUD;
                break;
            case 9:
                if (event instanceof SyncEvent.ResolveSucceeded) {
                    SyncPostAction postAction6 = ((SyncEvent.ResolveSucceeded) event).getResolvedResult().getPostAction();
                    syncPhaseInvoke = !(postAction6 instanceof SyncPostAction.RetryPull) ? !(postAction6 instanceof SyncPostAction.PushFull) ? !(postAction6 instanceof SyncPostAction.PushDuplicateFull) ? SyncPhase.CLEAN : SyncPhase.CLEAN : SyncPhase.DIRTY_LOCAL : SyncPhase.DIRTY_CLOUD;
                } else if (event instanceof SyncEvent.ResolveFailed) {
                    syncPhaseInvoke = SyncPhase.CONFLICT;
                } else if (!(event instanceof SyncEvent.AutoResolveSucceeded)) {
                    syncPhaseInvoke = !(event instanceof SyncEvent.LocalDeleted) ? !(event instanceof SyncEvent.CloudDeleted) ? (!(event instanceof SyncEvent.LocalModified) && !(event instanceof SyncEvent.CloudModified)) ? illegal.invoke(state.getPhase(), event) : SyncPhase.CONFLICT : SyncPhase.DIRTY_CLOUD : SyncPhase.DIRTY_LOCAL;
                } else {
                    SyncPostAction postAction7 = ((SyncEvent.AutoResolveSucceeded) event).getResolvedResult().getPostAction();
                    syncPhaseInvoke = !(postAction7 instanceof SyncPostAction.RetryPull) ? !(postAction7 instanceof SyncPostAction.PushFull) ? !(postAction7 instanceof SyncPostAction.PushDuplicateFull) ? SyncPhase.CLEAN : SyncPhase.CLEAN : SyncPhase.DIRTY_LOCAL : SyncPhase.DIRTY_CLOUD;
                }
                break;
            default:
                throw new C32442OooOO0o();
        }
        return state.withPhase(syncPhaseInvoke);
    }

    public static /* synthetic */ SyncState reduce$default(SyncState syncState, SyncEvent syncEvent, InterfaceC32508OooOOOo interfaceC32508OooOOOo, int i, Object obj) {
        if ((i & 4) != 0) {
            interfaceC32508OooOOOo = new OooO0O0();
        }
        return reduce(syncState, syncEvent, interfaceC32508OooOOOo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SyncPhase reduce$lambda$0(SyncPhase s, SyncEvent e) {
        OooOOO0.OooO0oO(s, "s");
        OooOOO0.OooO0oO(e, "e");
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("SyncState-reduce");
        c20358OooO00o.OooO0OO("Illegal transition: " + s + "  ←(" + e + ")", new Object[0]);
        return s;
    }
}
