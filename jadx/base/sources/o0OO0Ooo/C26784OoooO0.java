package o0OO0Ooo;

import com.aspose.words.StyleIdentifier;
import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0OO0Ooo.OoooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.google.GoogleDriveSyncBackend", m80623f = "GoogleDriveSyncBackend.kt", m80624l = {StyleIdentifier.LIST_TABLE_4_ACCENT_5}, m80625m = "downloadContentWithProgress-hUnOzRk")
public final class C26784OoooO0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C26791OoooOoO f92621OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f92622OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f92623OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26784OoooO0(C26791OoooOoO c26791OoooOoO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f92621OooOo = c26791OoooOoO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f92622OooOo0o = obj;
        this.f92623OooOoO0 |= Integer.MIN_VALUE;
        Object objOooOOo = this.f92621OooOo.OooOOo(null, null, null, 0L, null, this);
        return objOooOOo == EnumC32485OooO00o.f116726OooOo0o ? objOooOOo : new C32445OooOOOO(objOooOOo);
    }
}
