package OooOooO;

import Oooo0oO.o00oO0O;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: OooOooO.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.compose.foundation.interaction.PressInteractionKt$collectIsPressedAsState$1$1", m80623f = "PressInteraction.kt", m80624l = {88}, m80625m = "invokeSuspend")
public final class C20739OooOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC20736OooOOO0 f59581OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f59582OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ o00oO0O<Boolean> f59583OooOoO0;

    /* JADX INFO: renamed from: OooOooO.OooOOo$OooO00o */
    public static final class OooO00o implements InterfaceC33723OooO0oO<InterfaceC20734OooOO0o> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ o00oO0O<Boolean> f59584OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ ArrayList f59585OooOo0o;

        public OooO00o(ArrayList arrayList, o00oO0O o00oo0o) {
            this.f59585OooOo0o = arrayList;
            this.f59584OooOo = o00oo0o;
        }

        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        public final Object emit(InterfaceC20734OooOO0o interfaceC20734OooOO0o, Continuation continuation) {
            InterfaceC20734OooOO0o interfaceC20734OooOO0o2 = interfaceC20734OooOO0o;
            boolean z = interfaceC20734OooOO0o2 instanceof C20738OooOOOo;
            ArrayList arrayList = this.f59585OooOo0o;
            if (z) {
                arrayList.add(interfaceC20734OooOO0o2);
            } else if (interfaceC20734OooOO0o2 instanceof C20740OooOOo0) {
                arrayList.remove(((C20740OooOOo0) interfaceC20734OooOO0o2).f59586OooO00o);
            } else if (interfaceC20734OooOO0o2 instanceof C20737OooOOOO) {
                arrayList.remove(((C20737OooOOOO) interfaceC20734OooOO0o2).f59579OooO00o);
            }
            this.f59584OooOo.setValue(Boolean.valueOf(!arrayList.isEmpty()));
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20739OooOOo(InterfaceC20736OooOOO0 interfaceC20736OooOOO0, o00oO0O<Boolean> o00oo0o, Continuation<? super C20739OooOOo> continuation) {
        super(2, continuation);
        this.f59581OooOo = interfaceC20736OooOOO0;
        this.f59583OooOoO0 = o00oo0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C20739OooOOo(this.f59581OooOo, this.f59583OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C20739OooOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f59582OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        ArrayList arrayList = new ArrayList();
        C33772OooooOo c33772OooooOoOooO0O0 = this.f59581OooOo.OooO0O0();
        OooO00o oooO00o = new OooO00o(arrayList, this.f59583OooOoO0);
        this.f59582OooOo0o = 1;
        c33772OooooOoOooO0O0.collect(oooO00o, this);
        return enumC32485OooO00o;
    }
}
