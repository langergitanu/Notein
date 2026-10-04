package o0OO0Ooo;

import com.aspose.words.StyleIdentifier;
import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0OO0Ooo.Oooooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.google.GoogleDriveSyncBackend", m80623f = "GoogleDriveSyncBackend.kt", m80624l = {StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_5, StyleIdentifier.LIST_TABLE_3_ACCENT_1}, m80625m = "uploadMeta-0E7RQCE")
public final class C26798Oooooo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f92686OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f92687OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f92688OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C26791OoooOoO f92689OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C26791OoooOoO f92690OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f92691OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26798Oooooo(C26791OoooOoO c26791OoooOoO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f92690OooOoOO = c26791OoooOoO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f92688OooOoO = obj;
        this.f92691OooOoo0 |= Integer.MIN_VALUE;
        Object objOooO0oO = this.f92690OooOoOO.OooO0oO(null, null, this);
        return objOooO0oO == EnumC32485OooO00o.f116726OooOo0o ? objOooO0oO : new C32445OooOOOO(objOooO0oO);
    }
}
