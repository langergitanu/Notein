package o0o0o00O;

import com.orion.penkit.models.LassoParams;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o0o00O.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.recognize.TextRecognizeViewModel$recognizeDisplayItemsInLasso$1", m80623f = "TextRecognizeViewModel.kt", m80624l = {61}, m80625m = "invokeSuspend")
public final class C30769OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30761OooO f110033OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f110034OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ LassoParams f110035OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ ArrayList f110036OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30769OooO0oo(C30761OooO c30761OooO, ArrayList arrayList, LassoParams lassoParams, Continuation continuation) {
        super(2, continuation);
        this.f110033OooOo = c30761OooO;
        this.f110036OooOoO0 = arrayList;
        this.f110035OooOoO = lassoParams;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30769OooO0oo(this.f110033OooOo, this.f110036OooOoO0, this.f110035OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30769OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f110034OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f110034OooOo0o = 1;
            if (C30761OooO.OooO0o0(this.f110033OooOo, this.f110036OooOoO0, this.f110035OooOoO, this) == enumC32485OooO00o) {
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
