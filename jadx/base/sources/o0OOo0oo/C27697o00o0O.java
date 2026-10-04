package o0OOo0oo;

import com.orion.notein.domain.models.cloudsync.CloudBundle;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.io.File;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOo0oo.o00o0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.NoteBundleProcessor", m80623f = "CloudBundleProcessor.kt", m80624l = {197, 229}, m80625m = "restoreContentUnsafe")
public final class C27697o00o0O extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f97625OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27671Ooooooo f97626OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public CloudMetaExtra f97627OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public CloudBundle f97628OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public File f97629OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public /* synthetic */ Object f97630OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f97631OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ C27671Ooooooo f97632OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f97633OooOooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27697o00o0O(C27671Ooooooo c27671Ooooooo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f97632OooOooO = c27671Ooooooo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f97630OooOoo = obj;
        this.f97633OooOooo |= Integer.MIN_VALUE;
        return this.f97632OooOooO.OooO(null, null, false, this);
    }
}
