package o0OOoO0o;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.cloudsync.SyncEvent;
import java.util.concurrent.ConcurrentLinkedDeque;
import o0OOoO0o.C27755OooO0Oo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOoO0o.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.scheduler.SyncScheduler", m80623f = "SyncScheduler.kt", m80624l = {StyleIdentifier.length}, m80625m = "processStableMetaQueue")
public final class C27762OooOO0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f98047OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27755OooO0Oo f98048OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public ConcurrentLinkedDeque f98049OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C27755OooO0Oo.OooO0O0 f98050OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public SyncEvent f98051OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f98052OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f98053OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public /* synthetic */ Object f98054OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ C27755OooO0Oo f98055OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public int f98056Oooo000;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27762OooOO0(C27755OooO0Oo c27755OooO0Oo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f98055OooOooo = c27755OooO0Oo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f98054OooOooO = obj;
        this.f98056Oooo000 |= Integer.MIN_VALUE;
        return this.f98055OooOooo.OooOO0(0, null, this);
    }
}
