package o0OOoO0O;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.cloudsync.SyncEvent;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOoO0O.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.processor.SideEffectRunner", m80623f = "SideEffectRunner.kt", m80624l = {StyleIdentifier.SUBTLE_REFERENCE}, m80625m = "onRequestResolve")
public final class C27736OooOO0o extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public SyncEvent.RequestResolve f97877OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27740OooOOOo f97878OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C27740OooOOOo f97879OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f97880OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f97881OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27736OooOO0o(C27740OooOOOo c27740OooOOOo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f97879OooOoO = c27740OooOOOo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f97880OooOoO0 = obj;
        this.f97881OooOoOO |= Integer.MIN_VALUE;
        return this.f97879OooOoO.OooOOO0(null, null, this);
    }
}
