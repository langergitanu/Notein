package o0OOo0oo;

import com.orion.notein.domain.models.cloudsync.CloudMetaLocal;
import com.orion.notein.domain.models.cloudsync.CloudMetaRemote;
import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0OOo0oo.o00000oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.ResolveConflictUseCase", m80623f = "ResolveConflictUseCase.kt", m80624l = {36, 39, 46, 59, 74, 79, 85, 112, 118, 121}, m80625m = "invoke-0E7RQCE")
public final class C27676o00000oO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f97413OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27677o00000oo f97414OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public CloudMetaRemote f97415OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public CloudMetaLocal f97416OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f97417OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ C27677o00000oo f97418OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public /* synthetic */ Object f97419OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f97420OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27676o00000oO(C27677o00000oo c27677o00000oo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f97418OooOoo = c27677o00000oo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f97419OooOoo0 = obj;
        this.f97420OooOooO |= Integer.MIN_VALUE;
        Object objOooO0o0 = this.f97418OooOoo.OooO0o0(null, false, this);
        return objOooO0o0 == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o0 : new C32445OooOOOO(objOooO0o0);
    }
}
