package OooOoo;

import com.aspose.words.StyleIdentifier;
import kotlin.coroutines.Continuation;
import o0000Ooo.C24243OooOOo0;
import o00Oo0.C25027OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: OooOoo.OooooOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$3$1", m80623f = "Scrollable.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C20639OooooOO extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33636Oooo00o, C24243OooOOo0, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Oooo0oO.o00oO0O<C25027OooO0O0> f59113OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ long f59114OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Oooo0oO.o00oO0O f59115OooOoO0;

    /* JADX INFO: renamed from: OooOoo.OooooOO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$3$1$1", m80623f = "Scrollable.kt", m80624l = {StyleIdentifier.GRID_TABLE_6_COLORFUL}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Oooo0oO.o00oO0O f59116OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f59117OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ long f59118OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Oooo0oO.o00oO0O o00oo0o, long j, Continuation continuation) {
            super(2, continuation);
            this.f59116OooOo = o00oo0o;
            this.f59118OooOoO0 = j;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f59116OooOo, this.f59118OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f59117OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                o0OoOo0 o0oooo02 = (o0OoOo0) this.f59116OooOo.getValue();
                this.f59117OooOo0o = 1;
                if (o0oooo02.OooO0OO(this.f59118OooOoO0, this) == enumC32485OooO00o) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20639OooooOO(Oooo0oO.o00oO0O o00oo0o, Oooo0oO.o00oO0O o00oo0o2, Continuation continuation) {
        super(3, continuation);
        this.f59113OooOo = o00oo0o;
        this.f59115OooOoO0 = o00oo0o2;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, C24243OooOOo0 c24243OooOOo0, Continuation<? super C32460OooOooO> continuation) {
        long j = c24243OooOOo0.f81503OooO00o;
        Oooo0oO.o00oO0O o00oo0o = this.f59115OooOoO0;
        C20639OooooOO c20639OooooOO = new C20639OooooOO(this.f59113OooOo, o00oo0o, continuation);
        c20639OooooOO.f59114OooOo0o = j;
        return c20639OooooOO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooO00o] */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        long j = this.f59114OooOo0o;
        InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f59113OooOo.getValue().f84972OooO00o.invoke();
        if (interfaceC33636Oooo00o == null) {
            throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(this.f59115OooOoO0, j, null), 3);
        return C32460OooOooO.f116667OooO00o;
    }
}
