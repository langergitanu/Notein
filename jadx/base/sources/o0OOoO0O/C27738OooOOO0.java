package o0OOoO0O;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.cloudsync.CloudMetaLocal;
import com.orion.notein.domain.models.cloudsync.SyncEvent;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOoO0O.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.processor.SideEffectRunner", m80623f = "SideEffectRunner.kt", m80624l = {StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_5, 315, StyleIdentifier.GRID_TABLE_4_ACCENT_6, StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_6, StyleIdentifier.LIST_TABLE_2}, m80625m = "onSyncSucceeded")
public final class C27738OooOOO0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public SyncEvent.ResolveSucceeded f97887OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27740OooOOOo f97888OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f97889OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public CloudMetaLocal f97890OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C27740OooOOOo f97891OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f97892OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27738OooOOO0(C27740OooOOOo c27740OooOOOo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f97891OooOoOO = c27740OooOOOo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f97889OooOoO = obj;
        this.f97892OooOoo0 |= Integer.MIN_VALUE;
        return this.f97891OooOoOO.OooOOO(null, null, this);
    }
}
