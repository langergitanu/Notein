package o00Ooo;

import com.aspose.words.StyleIdentifier;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o00Ooo.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$4$2$1", m80623f = "SuspendingPointerInputFilter.kt", m80624l = {StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_2}, m80625m = "invokeSuspend")
public final class C25095Oooo00O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f85201OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f85202OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32508OooOOOo<InterfaceC25088OooOoO, Continuation<? super C32460OooOooO>, Object> f85203OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C25093OooOooO f85204OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C25095Oooo00O(C25093OooOooO c25093OooOooO, InterfaceC32508OooOOOo<? super InterfaceC25088OooOoO, ? super Continuation<? super C32460OooOooO>, ? extends Object> interfaceC32508OooOOOo, Continuation<? super C25095Oooo00O> continuation) {
        super(2, continuation);
        this.f85204OooOoO0 = c25093OooOooO;
        this.f85203OooOoO = interfaceC32508OooOOOo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C25095Oooo00O c25095Oooo00O = new C25095Oooo00O(this.f85204OooOoO0, this.f85203OooOoO, continuation);
        c25095Oooo00O.f85201OooOo = obj;
        return c25095Oooo00O;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C25095Oooo00O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f85202OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f85201OooOo;
            C25093OooOooO c25093OooOooO = this.f85204OooOoO0;
            c25093OooOooO.getClass();
            kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC33636Oooo00o, "<set-?>");
            c25093OooOooO.f85182OooOooo = interfaceC33636Oooo00o;
            this.f85202OooOo0o = 1;
            if (this.f85203OooOoO.invoke(c25093OooOooO, this) == enumC32485OooO00o) {
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
