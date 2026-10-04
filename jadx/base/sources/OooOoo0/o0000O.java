package OooOoo0;

import OooOoOO.C20528OooOOO0;
import OooOoo.C20632OoooOOo;
import com.aspose.words.StyleIdentifier;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$1$1", m80623f = "Scroll.kt", m80624l = {StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_1, StyleIdentifier.GRID_TABLE_1_LIGHT_ACCENT_2}, m80625m = "invokeSuspend")
public final class o0000O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C20709o0000Oo f59457OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f59458OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ float f59459OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ float f59460OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O(C20709o0000Oo c20709o0000Oo, float f, float f2, Continuation continuation) {
        super(2, continuation);
        this.f59457OooOo = c20709o0000Oo;
        this.f59460OooOoO0 = f;
        this.f59459OooOoO = f2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o0000O(this.f59457OooOo, this.f59460OooOoO0, this.f59459OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((o0000O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f59458OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C20709o0000Oo c20709o0000Oo = this.f59457OooOo;
            this.f59458OooOo0o = 1;
            if (C20632OoooOOo.OooO00o(c20709o0000Oo, this.f59460OooOoO0, C20528OooOOO0.OooO00o(7, null), this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
