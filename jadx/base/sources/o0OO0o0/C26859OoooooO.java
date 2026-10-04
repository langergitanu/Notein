package o0OO0o0;

import com.aspose.words.StyleIdentifier;
import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0OO0o0.OoooooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.onedrive.OneDriveDriveSyncBackend", m80623f = "OneDriveDriveSyncBackend.kt", m80624l = {StyleIdentifier.LIST_TABLE_3_ACCENT_3}, m80625m = "deleteFile-gIAlu-s")
public final class C26859OoooooO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f92985OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f92986OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f92987OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ o00oO0O f92988OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26859OoooooO(o00oO0O o00oo0o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f92988OooOoO0 = o00oo0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f92985OooOo = obj;
        this.f92987OooOoO |= Integer.MIN_VALUE;
        Object objOooOOOo = this.f92988OooOoO0.OooOOOo(null, this);
        return objOooOOOo == EnumC32485OooO00o.f116726OooOo0o ? objOooOOOo : new C32445OooOOOO(objOooOOOo);
    }
}
