package o0OOo0oo;

import com.orion.notein.domain.models.cloudsync.CloudBundle;
import com.orion.notein.domain.models.cloudsync.CloudContentTag;
import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.UploadBundleUseCase", m80623f = "UploadBundleUseCase.kt", m80624l = {56, 63, 64, 74, 88, 96, 103, 104}, m80625m = "pushBundle-BWLJW6A")
public final class o000Oo0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public CloudBundle f97589OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27696o000Ooo f97590OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Object f97591OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String f97592OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public CloudContentTag f97593OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public /* synthetic */ Object f97594OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f97595OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ C27696o000Ooo f97596OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f97597OooOooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000Oo0(C27696o000Ooo c27696o000Ooo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f97596OooOooO = c27696o000Ooo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f97594OooOoo = obj;
        this.f97597OooOooo |= Integer.MIN_VALUE;
        Object objOooO0O0 = this.f97596OooOooO.OooO0O0(null, null, false, this);
        return objOooO0O0 == EnumC32485OooO00o.f116726OooOo0o ? objOooO0O0 : new C32445OooOOOO(objOooO0O0);
    }
}
