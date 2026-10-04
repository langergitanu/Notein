package o0OOooO0;

import Oooo0oO.C21111o0ooOoO;
import java.io.File;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOooO0.OoooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.drive.DriveCloudSyncDataSource$generateDataPath$2", m80623f = "DriveCloudSyncDataSource.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C27938OoooOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super String>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f98889OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ AbstractC27907OooOo0O f98890OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27938OoooOOO(AbstractC27907OooOo0O abstractC27907OooOo0O, String str, Continuation<? super C27938OoooOOO> continuation) {
        super(2, continuation);
        this.f98890OooOo0o = abstractC27907OooOo0O;
        this.f98889OooOo = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27938OoooOOO(this.f98890OooOo0o, this.f98889OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super String> continuation) {
        return ((C27938OoooOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        AbstractC27907OooOo0O abstractC27907OooOo0O = this.f98890OooOo0o;
        abstractC27907OooOo0O.getClass();
        File file = new File(abstractC27907OooOo0O.f98679OooO0O0.getDataDir(), abstractC27907OooOo0O.f98690OooOOO0);
        file.mkdirs();
        String str = this.f98889OooOo;
        File file2 = new File(file, str);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        return new File(file2, C21111o0ooOoO.OooO0Oo(str, "_content.in")).getAbsolutePath();
    }
}
