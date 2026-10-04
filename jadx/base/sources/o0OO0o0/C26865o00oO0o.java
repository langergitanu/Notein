package o0OO0o0;

import kotlin.jvm.internal.C24034Oooo00O;
import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0OO0o0.o00oO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.onedrive.OneDriveDriveSyncBackend", m80623f = "OneDriveDriveSyncBackend.kt", m80624l = {111, 114, 118, 120, 127, 128, 150}, m80625m = "fetchFileSnapshots-IoAF18A")
public final class C26865o00oO0o extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f93085OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f93086OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public C24034Oooo00O f93087OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Object f93088OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public o00oO0O f93089OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public /* synthetic */ Object f93090OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public C24034Oooo00O f93091OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ o00oO0O f93092OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f93093OooOooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26865o00oO0o(o00oO0O o00oo0o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f93092OooOooO = o00oo0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f93090OooOoo = obj;
        this.f93093OooOooo |= Integer.MIN_VALUE;
        Object objOooO0oo = this.f93092OooOooO.OooO0oo(this);
        return objOooO0oo == EnumC32485OooO00o.f116726OooOo0o ? objOooO0oo : new C32445OooOOOO(objOooO0oo);
    }
}
