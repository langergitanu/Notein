package o0OO0o00;

import com.aspose.words.StyleIdentifier;
import com.huawei.cloud.services.drive.Drive;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OO0o00.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.huawei.HuaweiCloudService$deleteFiles$2", m80623f = "HuaweiCloudService.kt", m80624l = {StyleIdentifier.LIST_TABLE_5_DARK}, m80625m = "invokeSuspend")
public final class C26873OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Set<String> f93186OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f93187OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ OooO00o f93188OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26873OooO0oo(Set<String> set, OooO00o oooO00o, Continuation<? super C26873OooO0oo> continuation) {
        super(2, continuation);
        this.f93186OooOo = set;
        this.f93188OooOoO0 = oooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C26873OooO0oo(this.f93186OooOo, this.f93188OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C26873OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f93187OooOo0o;
        Set<String> set = this.f93186OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (set.isEmpty()) {
                return C32460OooOooO.f116667OooO00o;
            }
            this.f93187OooOo0o = 1;
            obj = OooO00o.OooO00o(this.f93188OooOoO0, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        Drive drive = (Drive) obj;
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            drive.files().delete((String) it.next()).execute();
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
