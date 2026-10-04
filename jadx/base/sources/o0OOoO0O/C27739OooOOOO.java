package o0OOoO0O;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.cloudsync.CloudMetaLocal;
import com.orion.notein.domain.models.cloudsync.SyncEvent;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOoO0O.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.processor.SideEffectRunner", m80623f = "SideEffectRunner.kt", m80624l = {StyleIdentifier.GRID_TABLE_2_ACCENT_1, StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_2}, m80625m = "tryAutoResolveConflict")
public final class C27739OooOOOO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public SyncEvent f97893OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f97894OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f97895OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public CloudMetaLocal f97896OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C27740OooOOOo f97897OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f97898OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27739OooOOOO(C27740OooOOOo c27740OooOOOo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f97897OooOoOO = c27740OooOOOo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f97895OooOoO = obj;
        this.f97898OooOoo0 |= Integer.MIN_VALUE;
        return this.f97897OooOoOO.OooOOo0(null, null, null, null, this);
    }
}
