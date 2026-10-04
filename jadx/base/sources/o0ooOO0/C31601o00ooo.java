package o0ooOO0;

import OooOo.C20486OooOoO0;
import OoooOOo.C21200OooOOO0;
import OoooOOo.InterfaceC21222Oooo0O0;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OOo.C33695OooO0o0;
import oO0o0OOo.InterfaceC33701OooOO0o;
import oO0o0OOo.InterfaceC33709OooOo;

/* JADX INFO: renamed from: o0ooOO0.o00ooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", m80623f = "GlobalSnapshotManager.android.kt", m80624l = {63}, m80625m = "invokeSuspend")
public final class C31601o00ooo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public InterfaceC33701OooOO0o f112906OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public InterfaceC33709OooOo f112907OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C33695OooO0o0 f112908OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f112909OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31601o00ooo(C33695OooO0o0 c33695OooO0o0, Continuation continuation) {
        super(2, continuation);
        this.f112908OooOoO = c33695OooO0o0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C31601o00ooo(this.f112908OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C31601o00ooo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b A[Catch: all -> 0x0011, TryCatch #0 {all -> 0x0011, blocks: (B:6:0x000d, B:17:0x0033, B:19:0x003b, B:20:0x0043, B:28:0x005b, B:14:0x0026, B:30:0x005e, B:31:0x0062, B:32:0x0063, B:13:0x0020, B:21:0x0044, B:23:0x0051), top: B:39:0x0005, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0030 -> B:17:0x0033). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C33695OooO0o0 c33695OooO0o0;
        InterfaceC33701OooOO0o oooO00o;
        boolean z;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f112909OooOoO0;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                c33695OooO0o0 = this.f112908OooOoO;
                oooO00o = new C33695OooO0o0.OooO00o();
                this.f112907OooOo0o = c33695OooO0o0;
                this.f112906OooOo = oooO00o;
                this.f112909OooOoO0 = 1;
                obj = oooO00o.OooO00o(this);
                c33695OooO0o0 = c33695OooO0o0;
                if (obj == enumC32485OooO00o) {
                }
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooO00o = this.f112906OooOo;
                InterfaceC33709OooOo interfaceC33709OooOo = this.f112907OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                c33695OooO0o0 = interfaceC33709OooOo;
                if (((Boolean) obj).booleanValue()) {
                    synchronized (C21200OooOOO0.f61496OooO0OO) {
                        C20486OooOoO0<InterfaceC21222Oooo0O0> c20486OooOoO0 = C21200OooOOO0.f61502OooOO0.get().f61461OooO0oo;
                        z = false;
                        if (c20486OooOoO0 != null && c20486OooOoO0.OooO0OO()) {
                            z = true;
                        }
                    }
                    if (z) {
                        C21200OooOOO0.OooO00o();
                    }
                    this.f112907OooOo0o = c33695OooO0o0;
                    this.f112906OooOo = oooO00o;
                    this.f112909OooOoO0 = 1;
                    obj = oooO00o.OooO00o(this);
                    c33695OooO0o0 = c33695OooO0o0;
                    if (obj == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        c33695OooO0o0.cancel(null);
                        return C32460OooOooO.f116667OooO00o;
                    }
                }
            }
        } finally {
        }
    }
}
