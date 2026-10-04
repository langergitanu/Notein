package o0Oo0o00;

import kotlin.coroutines.Continuation;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0Oo0o00.ooOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.datasync.CloudSyncViewModel$isCloudStorageSpaceEnough$2", m80623f = "CloudSyncViewModel.kt", m80624l = {600}, m80625m = "invokeSuspend")
public final class C28220ooOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C28201OooooO0 f100046OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f100047OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28220ooOO(C28201OooooO0 c28201OooooO0, Continuation<? super C28220ooOO> continuation) {
        super(2, continuation);
        this.f100046OooOo = c28201OooooO0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28220ooOO(this.f100046OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C28220ooOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Object objOooO0O0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f100047OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C28201OooooO0 c28201OooooO0 = this.f100046OooOo;
            this.f100047OooOo0o = 1;
            objOooO0O0 = c28201OooooO0.f99939OooO0oO.OooO0O0(this);
            if (objOooO0O0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            objOooO0O0 = ((C32445OooOOOO) obj).f116639OooOo0o;
        }
        if (objOooO0O0 instanceof C32445OooOOOO.OooO00o) {
            objOooO0O0 = null;
        }
        return Boolean.valueOf(kotlin.jvm.internal.OooOOO0.OooO0O0(objOooO0O0, Boolean.TRUE));
    }
}
