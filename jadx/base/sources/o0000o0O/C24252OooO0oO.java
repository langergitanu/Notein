package o0000o0O;

import io.ktor.utils.p616io.C23968Oooo00o;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0000o0O.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", m80623f = "DataMigrationInitializer.kt", m80624l = {33}, m80625m = "invokeSuspend")
public final class C24252OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC24284OoooOO0<Object>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f81531OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f81532OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ List<OooO0o<Object>> f81533OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C24252OooO0oO(List<? extends OooO0o<Object>> list, Continuation<? super C24252OooO0oO> continuation) {
        super(2, continuation);
        this.f81533OooOoO0 = list;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C24252OooO0oO c24252OooO0oO = new C24252OooO0oO(this.f81533OooOoO0, continuation);
        c24252OooO0oO.f81531OooOo = obj;
        return c24252OooO0oO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC24284OoooOO0<Object> interfaceC24284OoooOO0, Continuation<? super C32460OooOooO> continuation) {
        return ((C24252OooO0oO) create(interfaceC24284OoooOO0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f81532OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC24284OoooOO0 interfaceC24284OoooOO0 = (InterfaceC24284OoooOO0) this.f81531OooOo;
            this.f81532OooOo0o = 1;
            if (C23968Oooo00o.OooO0OO(this.f81533OooOoO0, interfaceC24284OoooOO0, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
