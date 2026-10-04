package o0OO0o0;

import java.io.Serializable;
import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0OO0o0.Ooooo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.onedrive.OneDriveDriveSyncBackend", m80623f = "OneDriveDriveSyncBackend.kt", m80624l = {213, 217}, m80625m = "checkIfFileExists-gIAlu-s")
public final class C26852Ooooo00 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f92957OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public o00oO0O f92958OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ o00oO0O f92959OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f92960OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f92961OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26852Ooooo00(o00oO0O o00oo0o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f92959OooOoO = o00oo0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f92960OooOoO0 = obj;
        this.f92961OooOoOO |= Integer.MIN_VALUE;
        Serializable serializableOooO0o0 = this.f92959OooOoO.OooO0o0(null, this);
        return serializableOooO0o0 == EnumC32485OooO00o.f116726OooOo0o ? serializableOooO0o0 : new C32445OooOOOO(serializableOooO0o0);
    }
}
