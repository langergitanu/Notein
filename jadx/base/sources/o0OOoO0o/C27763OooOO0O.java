package o0OOoO0o;

import com.aspose.words.StyleIdentifier;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0OOoO0o.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.scheduler.SyncScheduler", m80623f = "SyncScheduler.kt", m80624l = {StyleIdentifier.PLAIN_TABLE_5, StyleIdentifier.GRID_TABLE_1_LIGHT, StyleIdentifier.GRID_TABLE_1_LIGHT_ACCENT_1, StyleIdentifier.GRID_TABLE_2_ACCENT_2, StyleIdentifier.GRID_TABLE_7_COLORFUL_ACCENT_1, StyleIdentifier.GRID_TABLE_2_ACCENT_2, StyleIdentifier.GRID_TABLE_2_ACCENT_2}, m80625m = "processingWorkerLoop")
public final class C27763OooOO0O extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f98057OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f98058OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f98059OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f98060OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C27755OooO0Oo f98061OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f98062OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27763OooOO0O(C27755OooO0Oo c27755OooO0Oo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f98061OooOoOO = c27755OooO0Oo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f98059OooOoO = obj;
        this.f98062OooOoo0 |= Integer.MIN_VALUE;
        C27755OooO0Oo.OooO00o(this.f98061OooOoOO, 0, this);
        return EnumC32485OooO00o.f116726OooOo0o;
    }
}
