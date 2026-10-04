package o0000o0O;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OOo.C33695OooO0o0;

/* JADX INFO: renamed from: o0000o0O.o00o0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.datastore.core.SimpleActor$offer$2", m80623f = "SimpleActor.kt", m80624l = {121, 121}, m80625m = "invokeSuspend")
public final class C24299o00o0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f81780OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Oooo000 f81781OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C24301o00ooo<Object> f81782OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24299o00o0O(C24301o00ooo<Object> c24301o00ooo, Continuation<? super C24299o00o0O> continuation) {
        super(2, continuation);
        this.f81782OooOoO0 = c24301o00ooo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C24299o00o0O(this.f81782OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C24299o00o0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        if (r1.invoke(r7, r6) != r0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045 A[PHI: r1 r7
      0x0045: PHI (r1v1 o0000o0O.Oooo000) = (r1v2 o0000o0O.Oooo000), (r1v3 o0000o0O.Oooo000) binds: [B:13:0x0042, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]
      0x0045: PHI (r7v5 java.lang.Object) = (r7v10 java.lang.Object), (r7v0 java.lang.Object) binds: [B:13:0x0042, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004e -> B:18:0x0051). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Oooo000 oooo000;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f81780OooOo;
        C24301o00ooo<Object> c24301o00ooo = this.f81782OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (c24301o00ooo.f81794OooO0Oo.f81528OooO00o.get() <= 0) {
                throw new IllegalStateException("Check failed.");
            }
            oO00o00.OooO0OO.OooO0OO(c24301o00ooo.f81791OooO00o.OooOOO0());
            oooo000 = c24301o00ooo.f81792OooO0O0;
            C33695OooO0o0 c33695OooO0o0 = c24301o00ooo.f81793OooO0OO;
            this.f81781OooOo0o = oooo000;
            this.f81780OooOo = 1;
            obj = c33695OooO0o0.OooO0oO(this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            if (c24301o00ooo.f81794OooO0Oo.f81528OooO00o.decrementAndGet() == 0) {
                return C32460OooOooO.f116667OooO00o;
            }
            oO00o00.OooO0OO.OooO0OO(c24301o00ooo.f81791OooO00o.OooOOO0());
            oooo000 = c24301o00ooo.f81792OooO0O0;
            C33695OooO0o0 c33695OooO0o02 = c24301o00ooo.f81793OooO0OO;
            this.f81781OooOo0o = oooo000;
            this.f81780OooOo = 1;
            obj = c33695OooO0o02.OooO0oO(this);
            if (obj != enumC32485OooO00o) {
                this.f81781OooOo0o = null;
                this.f81780OooOo = 2;
            }
            return enumC32485OooO00o;
        }
        oooo000 = this.f81781OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        this.f81781OooOo0o = null;
        this.f81780OooOo = 2;
    }
}
