package OooOoo0;

import OooOoo.InterfaceC20617Oooo;
import OooOooO.C20737OooOOOO;
import OooOooO.C20738OooOOOo;
import OooOooO.C20740OooOOo0;
import OooOooO.InterfaceC20734OooOO0o;
import OooOooO.InterfaceC20736OooOOO0;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33644OoooO0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.InterfaceC33672o00ooo;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2", m80623f = "Clickable.kt", m80624l = {445, 447, 454, 455, 464}, m80625m = "invokeSuspend")
public final class Oooo000 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f59347OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f59348OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ InterfaceC20617Oooo f59349OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f59350OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ long f59351OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ Oooo0oO.o00oO0O<C20738OooOOOo> f59352OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ InterfaceC20736OooOOO0 f59353OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ Oooo0oO.o00oO0O f59354OooOooO;

    @InterfaceC32482OooO0o0(m80622c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2$delayJob$1", m80623f = "Clickable.kt", m80624l = {439, 442}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f59355OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public C20738OooOOOo f59356OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ long f59357OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ Oooo0oO.o00oO0O f59358OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ InterfaceC20736OooOOO0 f59359OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final /* synthetic */ Oooo0oO.o00oO0O<C20738OooOOOo> f59360OooOoo0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Oooo0oO.o00oO0O o00oo0o, long j, InterfaceC20736OooOOO0 interfaceC20736OooOOO0, Oooo0oO.o00oO0O o00oo0o2, Continuation continuation) {
            super(2, continuation);
            this.f59358OooOoO0 = o00oo0o;
            this.f59357OooOoO = j;
            this.f59359OooOoOO = interfaceC20736OooOOO0;
            this.f59360OooOoo0 = o00oo0o2;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f59358OooOoO0, this.f59357OooOoO, this.f59359OooOoOO, this.f59360OooOoo0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            C20738OooOOOo c20738OooOOOo;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f59355OooOo;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                if (((Boolean) ((oO0O000o.OooO00o) this.f59358OooOoO0.getValue()).invoke()).booleanValue()) {
                    long j = C20677Oooo00o.f59362OooO00o;
                    this.f59355OooOo = 1;
                    if (C33644OoooO0.OooO00o(j, this) != enumC32485OooO00o) {
                    }
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c20738OooOOOo = this.f59356OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    this.f59360OooOoo0.setValue(c20738OooOOOo);
                    return C32460OooOooO.f116667OooO00o;
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            C20738OooOOOo c20738OooOOOo2 = new C20738OooOOOo(this.f59357OooOoO);
            this.f59356OooOo0o = c20738OooOOOo2;
            this.f59355OooOo = 2;
            if (this.f59359OooOoOO.OooO0OO(c20738OooOOOo2, this) != enumC32485OooO00o) {
                c20738OooOOOo = c20738OooOOOo2;
                this.f59360OooOoo0.setValue(c20738OooOOOo);
                return C32460OooOooO.f116667OooO00o;
            }
            return enumC32485OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(InterfaceC20617Oooo interfaceC20617Oooo, long j, InterfaceC20736OooOOO0 interfaceC20736OooOOO0, Oooo0oO.o00oO0O o00oo0o, Oooo0oO.o00oO0O o00oo0o2, Continuation continuation) {
        super(2, continuation);
        this.f59349OooOoO = interfaceC20617Oooo;
        this.f59351OooOoOO = j;
        this.f59353OooOoo0 = interfaceC20736OooOOO0;
        this.f59352OooOoo = o00oo0o;
        this.f59354OooOooO = o00oo0o2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        Oooo0oO.o00oO0O o00oo0o = this.f59354OooOooO;
        Oooo000 oooo000 = new Oooo000(this.f59349OooOoO, this.f59351OooOoOO, this.f59353OooOoo0, this.f59352OooOoo, o00oo0o, continuation);
        oooo000.f59350OooOoO0 = obj;
        return oooo000;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((Oooo000) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b1, code lost:
    
        if (r10.OooO0OO(r2, r18) != r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d2, code lost:
    
        if (r10.OooO0OO(r3, r18) == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC33672o00ooo interfaceC33672o00oooOooO0OO;
        Object objOooOooo;
        boolean z;
        C20740OooOOo0 c20740OooOOo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f59347OooOo;
        Oooo0oO.o00oO0O<C20738OooOOOo> o00oo0o = this.f59352OooOoo;
        InterfaceC20736OooOOO0 interfaceC20736OooOOO0 = this.f59353OooOoo0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33672o00oooOooO0OO = C33609OooO0oo.OooO0OO((InterfaceC33636Oooo00o) this.f59350OooOoO0, null, null, new OooO00o(this.f59354OooOooO, this.f59351OooOoOO, this.f59353OooOoo0, this.f59352OooOoo, null), 3);
            this.f59350OooOoO0 = interfaceC33672o00oooOooO0OO;
            this.f59347OooOo = 1;
            objOooOooo = this.f59349OooOoO.OooOooo(this);
            if (objOooOooo != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i == 1) {
            interfaceC33672o00oooOooO0OO = (InterfaceC33672o00ooo) this.f59350OooOoO0;
            C32446OooOOOo.OooO0O0(obj);
            objOooOooo = obj;
        } else {
            if (i == 2) {
                z = this.f59348OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                if (z) {
                    C20738OooOOOo c20738OooOOOo = new C20738OooOOOo(this.f59351OooOoOO);
                    C20740OooOOo0 c20740OooOOo02 = new C20740OooOOo0(c20738OooOOOo);
                    this.f59350OooOoO0 = c20740OooOOo02;
                    this.f59347OooOo = 3;
                    if (interfaceC20736OooOOO0.OooO0OO(c20738OooOOOo, this) != enumC32485OooO00o) {
                        c20740OooOOo0 = c20740OooOOo02;
                        this.f59350OooOoO0 = null;
                        this.f59347OooOo = 4;
                    }
                    return enumC32485OooO00o;
                }
                o00oo0o.setValue(null);
                return C32460OooOooO.f116667OooO00o;
            }
            if (i != 3) {
                if (i != 4 && i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                o00oo0o.setValue(null);
                return C32460OooOooO.f116667OooO00o;
            }
            c20740OooOOo0 = (C20740OooOOo0) this.f59350OooOoO0;
            C32446OooOOOo.OooO0O0(obj);
            this.f59350OooOoO0 = null;
            this.f59347OooOo = 4;
        }
        boolean zBooleanValue = ((Boolean) objOooOooo).booleanValue();
        if (!interfaceC33672o00oooOooO0OO.isActive()) {
            C20738OooOOOo value = o00oo0o.getValue();
            if (value != null) {
                InterfaceC20734OooOO0o c20740OooOOo03 = zBooleanValue ? new C20740OooOOo0(value) : new C20737OooOOOO(value);
                this.f59350OooOoO0 = null;
                this.f59347OooOo = 5;
            }
            o00oo0o.setValue(null);
            return C32460OooOooO.f116667OooO00o;
        }
        this.f59350OooOoO0 = null;
        this.f59348OooOo0o = zBooleanValue;
        this.f59347OooOo = 2;
        interfaceC33672o00oooOooO0OO.cancel((CancellationException) null);
        Object objJoin = interfaceC33672o00oooOooO0OO.join(this);
        if (objJoin != enumC32485OooO00o) {
            objJoin = C32460OooOooO.f116667OooO00o;
        }
        if (objJoin != enumC32485OooO00o) {
            z = zBooleanValue;
            if (z) {
            }
            o00oo0o.setValue(null);
            return C32460OooOooO.f116667OooO00o;
        }
        return enumC32485OooO00o;
    }
}
