package o0OOoO0O;

import com.orion.notein.domain.models.cloudsync.CloudMetaLocal;
import com.orion.notein.domain.models.cloudsync.SyncEvent;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOoO0O.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.processor.SideEffectRunner", m80623f = "SideEffectRunner.kt", m80624l = {150, 154}, m80625m = "onRequestPush")
public final class C27735OooOO0O extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public SyncEvent.RequestPush f97870OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27740OooOOOo f97871OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f97872OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public CloudMetaLocal f97873OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ Object f97874OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f97875OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C27740OooOOOo f97876OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27735OooOO0O(C27740OooOOOo c27740OooOOOo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f97876OooOoo0 = c27740OooOOOo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f97874OooOoOO = obj;
        this.f97875OooOoo |= Integer.MIN_VALUE;
        return this.f97876OooOoo0.OooOO0o(null, null, null, null, this);
    }
}
