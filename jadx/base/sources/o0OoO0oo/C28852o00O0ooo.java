package o0OoO0oo;

import com.orion.notein.domain.models.foundation.RatioPointF;
import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import kotlin.coroutines.Continuation;
import o0oOo0O0.C30956OooO0o;
import o0oOo0O0.InterfaceC30953OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33747Oooo;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoO0oo.o00O0ooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$hookZoomHandle$2", m80623f = "NoteEditorFragment.kt", m80624l = {6191}, m80625m = "invokeSuspend")
public final class C28852o00O0ooo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ NoteEditorFragment f102182OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f102183OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ InterfaceC30953OooO0O0 f102184OooOoO0;

    /* JADX INFO: renamed from: o0OoO0oo.o00O0ooo$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC30953OooO0O0 f102185OooOo0o;

        public OooO00o(InterfaceC30953OooO0O0 interfaceC30953OooO0O0) {
            this.f102185OooOo0o = interfaceC30953OooO0O0;
        }

        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        public final Object emit(Object obj, Continuation continuation) {
            RatioPointF ratioPointF = (RatioPointF) obj;
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NoteEditorFragment");
            c20358OooO00o.OooO00o("Collector <- " + ratioPointF, new Object[0]);
            ((C30956OooO0o) this.f102185OooOo0o).OooO00o(ratioPointF.getHorizontal(), ratioPointF.getVertical());
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28852o00O0ooo(NoteEditorFragment noteEditorFragment, InterfaceC30953OooO0O0 interfaceC30953OooO0O0, Continuation<? super C28852o00O0ooo> continuation) {
        super(2, continuation);
        this.f102182OooOo = noteEditorFragment;
        this.f102184OooOoO0 = interfaceC30953OooO0O0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28852o00O0ooo(this.f102182OooOo, this.f102184OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28852o00O0ooo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f102183OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C28968o00oo00O c28968o00oo00O = (C28968o00oo00O) this.f102182OooOo.f73035o000000.getValue();
            OooO00o oooO00o = new OooO00o(this.f102184OooOoO0);
            this.f102183OooOo0o = 1;
            Object objCollect = c28968o00oo00O.f102634OooO0o.f121747OooOo0o.collect(new C33747Oooo.OooO00o(oooO00o), this);
            if (objCollect != enumC32485OooO00o) {
                objCollect = C32460OooOooO.f116667OooO00o;
            }
            if (objCollect == enumC32485OooO00o) {
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
