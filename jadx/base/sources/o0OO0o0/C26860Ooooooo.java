package o0OO0o0;

import com.aspose.words.StyleIdentifier;
import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0OO0o0.Ooooooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.onedrive.OneDriveDriveSyncBackend", m80623f = "OneDriveDriveSyncBackend.kt", m80624l = {StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4}, m80625m = "downloadContent-BWLJW6A")
public final class C26860Ooooooo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ o00oO0O f92989OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f92990OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f92991OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26860Ooooooo(o00oO0O o00oo0o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f92989OooOo = o00oo0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f92990OooOo0o = obj;
        this.f92991OooOoO0 |= Integer.MIN_VALUE;
        Object objOooOOOO = this.f92989OooOo.OooOOOO(null, null, null, this);
        return objOooOOOO == EnumC32485OooO00o.f116726OooOo0o ? objOooOOOO : new C32445OooOOOO(objOooOOOO);
    }
}
