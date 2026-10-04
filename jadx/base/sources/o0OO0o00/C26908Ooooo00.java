package o0OO0o00;

import com.aspose.words.StyleIdentifier;
import java.io.File;
import java.io.FileOutputStream;
import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0OO0o00.Ooooo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.huawei.HuaweiDriveSyncBackend", m80623f = "HuaweiDriveSyncBackend.kt", m80624l = {StyleIdentifier.LIST_TABLE_3_ACCENT_5}, m80625m = "downloadContentWithProgress-hUnOzRk")
public final class C26908Ooooo00 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public File f93347OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public File f93348OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f93349OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public FileOutputStream f93350OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C26913Oooooo f93351OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f93352OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26908Ooooo00(C26913Oooooo c26913Oooooo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f93351OooOoOO = c26913Oooooo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f93349OooOoO = obj;
        this.f93352OooOoo0 |= Integer.MIN_VALUE;
        Object objOooOOo = this.f93351OooOoOO.OooOOo(null, null, null, 0L, null, this);
        return objOooOOo == EnumC32485OooO00o.f116726OooOo0o ? objOooOOo : new C32445OooOOOO(objOooOOo);
    }
}
