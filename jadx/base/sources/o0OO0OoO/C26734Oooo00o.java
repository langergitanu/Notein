package o0OO0OoO;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.cloudsync.CloudBundle;
import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0OO0OoO.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.CloudSyncRepoImpl", m80623f = "CloudSyncRepoImpl.kt", m80624l = {StyleIdentifier.LIST_TABLE_3_ACCENT_6, StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_6, StyleIdentifier.SMART_HYPERLINK}, m80625m = "requestPushContent-BWLJW6A")
public final class C26734Oooo00o extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f92463OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C26740Oooo0oo f92464OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f92465OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public CloudBundle f92466OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ Object f92467OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f92468OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C26740Oooo0oo f92469OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26734Oooo00o(C26740Oooo0oo c26740Oooo0oo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f92469OooOoo0 = c26740Oooo0oo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f92467OooOoOO = obj;
        this.f92468OooOoo |= Integer.MIN_VALUE;
        Object objOooOooO = this.f92469OooOoo0.OooOooO(null, null, false, this);
        return objOooOooO == EnumC32485OooO00o.f116726OooOo0o ? objOooOooO : new C32445OooOOOO(objOooOooO);
    }
}
