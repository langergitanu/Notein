package o0OO0o00;

import com.aspose.words.StyleIdentifier;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.jvm.internal.C24034Oooo00O;
import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0OO0o00.OoooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.huawei.HuaweiDriveSyncBackend", m80623f = "HuaweiDriveSyncBackend.kt", m80624l = {StyleIdentifier.LIST_TABLE_3_ACCENT_1}, m80625m = "downloadContent-BWLJW6A")
public final class C26907OoooOoo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C24034Oooo00O f93340OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public File f93341OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public FileOutputStream f93342OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public File f93343OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ Object f93344OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f93345OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C26913Oooooo f93346OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26907OoooOoo(C26913Oooooo c26913Oooooo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f93346OooOoo0 = c26913Oooooo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f93344OooOoOO = obj;
        this.f93345OooOoo |= Integer.MIN_VALUE;
        Object objOooOOOO = this.f93346OooOoo0.OooOOOO(null, null, null, this);
        return objOooOOOO == EnumC32485OooO00o.f116726OooOo0o ? objOooOOOO : new C32445OooOOOO(objOooOOOO);
    }
}
